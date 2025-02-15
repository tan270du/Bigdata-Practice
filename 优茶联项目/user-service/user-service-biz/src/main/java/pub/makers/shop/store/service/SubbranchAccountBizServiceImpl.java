package pub.makers.shop.store.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.lantu.base.common.entity.BoolType;
import com.lantu.base.util.ListUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import pub.makers.base.exception.ValidateUtils;
import pub.makers.daotemplate.vo.Conds;
import pub.makers.daotemplate.vo.Update;
import pub.makers.shop.base.service.SmsService;
import pub.makers.shop.base.util.FreeMarkerHelper;
import pub.makers.shop.base.util.IdGenerator;
import pub.makers.shop.base.vo.ResultData;
import pub.makers.shop.store.entity.Subbranch;
import pub.makers.shop.store.entity.VtwoStoreRole;
import pub.makers.shop.store.vo.SubbranchVo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

@Service(version="1.0.0")
public class SubbranchAccountBizServiceImpl implements SubbranchAccountBizService{

	private final String listSubbranchAccountByParentId = "select * from store_subbranch ss where ss.is_sub_account = 'T' and ss.del_flag = 'F' and ss.user_name like ? and ss.parent_subranch_id = ? order by ss.create_time desc limit ?, ?;";
	private final String countSubbranchAccountByParentId = "select count(*) from store_subbranch ss where ss.is_sub_account = 'T' and ss.del_flag = 'F' and ss.user_name like ? and ss.parent_subranch_id = ?;";

	@Autowired
	private SubbranchService subbranchService;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired 
	private SmsService smsService;
	@Autowired
	private VtwoStoreRoleService storeRoleService;
	
	@Override
	public boolean isSubAccount(String subbranchId) {
		
		Subbranch s = subbranchService.getById(subbranchId);
		
		return StringUtils.isNotBlank(s.getParentSubranchId()) && BoolType.T.name().equals(s.getIsSubAccount());
	}

	@Override
	public Subbranch getMainSubbranch(String subbranchId) {
		
		Subbranch s = subbranchService.getById(subbranchId);
		if (s == null) {
			return null;
		}
		if (BoolType.T.name().equals(s.getIsSubAccount())){
			s = subbranchService.getById(s.getParentSubranchId());
		}
		
		return s;
	}

	@Override
	public Subbranch addSubAccount(String parentId, Subbranch subAccount) {
		
		// 手机号不能重复注册
		Subbranch subb = subbranchService.getByMobile(subAccount.getPhone());
		ValidateUtils.isTrue(subb == null, "手机号已被注册，请更换其他手机号！");
		
		String password = subAccount.getPassword();
		
		//MD5加密
		subAccount.setPassword(DigestUtils.md5Hex(subAccount.getPassword()));
		subAccount.setIsSubAccount(BoolType.T.name());
		subAccount.setParentSubranchId(parentId);
		subAccount.setId(IdGenerator.getDefault().nextId());
		subAccount.setCreateTime(new Date());
		subAccount.setMobile(subAccount.getPhone());
		subAccount.setState(0);
		subAccount.setDelFlag(BoolType.F.name());
		if (StringUtils.isBlank(subAccount.getIsValid())) {
			subAccount.setIsValid(BoolType.T.name());
		}
		
	    subAccount = subbranchService.insert(subAccount);//添加店员信息
	    
	    // 添加店铺权限
	    VtwoStoreRole sr = new VtwoStoreRole();
	    sr.setId(IdGenerator.getDefault().nextId());
	    sr.setStoreId(subAccount.getId());
	    sr.setStatus(2);
	    storeRoleService.insert(sr);
	    
	    Subbranch shop = subbranchService.getById(parentId);//根据店铺ID查店铺名称
	    
	    // 发送短信
        List<String> slist = Lists.newArrayList();
        slist.add(subAccount.getUserName());//店员名称
        slist.add(shop.getName());//店铺名称
        slist.add(subAccount.getMobile());//登陆账号
        slist.add(password);//登陆密码
		smsService.sendMsgByTpl(subAccount.getPhone(), "sms/smsname",slist);
		return subAccount;
	}

	@Override
	public Subbranch editSubAccount(Subbranch subAccount) {
		
		Subbranch dbAccount = subbranchService.getById(subAccount.getId());
		ValidateUtils.notNull(dbAccount, "子账号不存在");
		
		// 只能修改限定字段
//		dbAccount.setPhone(dbAccount.getPhone());
//		dbAccount.setMobile(dbAccount.getPhone());
		dbAccount.setProvince(subAccount.getProvince());//店员职位
		dbAccount.setUserName(subAccount.getUserName());//店员姓名
		dbAccount.setMemo(subAccount.getMemo());
		dbAccount.setIsValid(subAccount.getIsValid());
		
		return subbranchService.update(dbAccount);
	}

	@Override
	public Subbranch updateIsValid(String subAccountid, String isValid) {
		
		ValidateUtils.isTrue(BoolType.T.name().equals(isValid) || BoolType.F.name().equals(isValid), "isValid参数错误");
		
		subbranchService.update(Update.byId(subAccountid).set("is_valid", isValid));
		
		return null;
	}

	@Override
	public List<Subbranch> listSubAccountByParent(String parentId) {
		
		List<Subbranch> resultList = subbranchService.list(Conds.get().eq("parentSubranchId", parentId).eq("delFlag", BoolType.F.name()));
		for (Subbranch s : resultList){
			s.setPassword(null);
		}
		
		return resultList;
	}

	@Override
	public ResultData querySummary(String shopId) {
		
		ResultData result = ResultData.createSuccess();
		
		Set<Long> idSet = queryChildrens(shopId);
		String shipIds = Joiner.on(",").join(idSet);
		Map<String, Object> dataModel = Maps.newHashMap();
		dataModel.put("shipIds", shipIds);
		
		String historyStmt = FreeMarkerHelper.getValueFromTpl("sql/subbranch/getHistoryOrderTotalMsg.sql", dataModel);
		String lastStmt = FreeMarkerHelper.getValueFromTpl("sql/subbranch/getLastOrderTotalMsg.sql", dataModel);
		String todayStmt = FreeMarkerHelper.getValueFromTpl("sql/subbranch/getTodayOrderTotalMsg.sql", dataModel);
		
		Date now = new Date();
		Date yesterday = DateUtils.addDays(now, -1);
		Map<String, Object> historyMap = jdbcTemplate.queryForMap(historyStmt);
		BigDecimal last = jdbcTemplate.queryForObject(lastStmt, BigDecimal.class, yesterday);
		BigDecimal today = jdbcTemplate.queryForObject(todayStmt, BigDecimal.class, now);
		
		if (historyMap != null){
			result.put("historyNumTotal", historyMap.get("historyNumTotal"));
			result.put("hostoryAmtTotal", new BigDecimal(historyMap.get("hostoryAmtTotal").toString()).setScale(2, RoundingMode.UP).toString());
		}
		else {
			result.put("historyNumTotal", "0");
			result.put("hostoryAmtTotal", "0.00");
		}
		
		if (last == null){
			last = new BigDecimal("0.00");
		}
		if (today == null){
			today = new BigDecimal("0");
		}
		
		result.put("todayNumTotal", today);
		result.put("tomorowAmtTotal", last.setScale(2, RoundingMode.HALF_DOWN).toString());
		
		return result;
	}

	@Override
	public Set<Long> queryChildrens(String shopId) {
		
		List<Subbranch> shopList = subbranchService.list(Conds.get("id").eq("parentSubranchId", shopId));
		Set<Long> idSet = ListUtils.getIdSet(shopList, "id");
		idSet.add(Long.valueOf(shopId));
		
		return idSet;
	}
	
	@Override
	public Subbranch delete(String subAccountid) {
		
		subbranchService.update(Update.byId(subAccountid).set("del_flag", BoolType.T.name()).set("is_valid", BoolType.F.name()));
		
		return null;

	}

	@Override
	public List<SubbranchVo> findNearBy(Double lat, Double lng, Integer distance) {
		
		Map<String, Object> dataModel = Maps.newHashMap();
		dataModel.put("lat", lat);
		dataModel.put("lng", lng);
		dataModel.put("distance", distance);
		
		String shopInfo = FreeMarkerHelper.getValueFromTpl("sql/subbranch/queryOthersAroundShop.sql", dataModel);
		
		RowMapper<SubbranchVo> rowMapper = ParameterizedBeanPropertyRowMapper.newInstance(SubbranchVo.class);
		List<SubbranchVo> subbranchList = jdbcTemplate.query(shopInfo, rowMapper);
	
		return subbranchList;
	}

	public List<Subbranch> checkAccountMobile(String mobile, Long id) {

		List<Subbranch> subbranchList = new ArrayList<Subbranch>();
		if (id == null) {
			subbranchList = subbranchService.list(Conds.get().eq("mobile", mobile).eq("del_flag", BoolType.F.name()));
		} else {
			subbranchList = subbranchService.list(Conds.get().eq("mobile", mobile).eq("del_flag", BoolType.F.name()).ne("id", id));
		}
		return subbranchList;
	}
}
