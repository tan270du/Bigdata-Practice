package pub.makers.shop.store.service;

import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.dev.base.utils.UUIDUtils;
import com.lantu.base.common.entity.BoolType;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import pub.makers.base.exception.ValidateUtils;
import pub.makers.daotemplate.vo.Conds;
import pub.makers.daotemplate.vo.Update;
import pub.makers.jedis.JedisCallback;
import pub.makers.jedis.JedisTemplate;
import pub.makers.shop.base.util.IdGenerator;
import pub.makers.shop.message.service.MessageBizService;
import pub.makers.shop.store.entity.*;
import pub.makers.shop.store.pojo.SubbranchInfo;
import pub.makers.shop.store.vo.SubbranchVo;
import redis.clients.jedis.Jedis;

@Service(version="1.0.0")
public class SubbranchLoginBizServiceImpl implements SubbranchLoginBizService{

	@Autowired
	private JedisTemplate jedisTemplate;
	@Autowired
	private SubbranchService subbranchService;
	@Autowired
	private VtwoStoreRoleService vtwoStoreRoleService;
	@Autowired
	private StoreLevelService storeLevelService;
	@Autowired
	private BankCardService bankCardService;
	@Autowired
	private MessageBizService messageBizService;
	@Autowired
	private VtwoStorePhotoService vtwoStorePhotoService;
	@Autowired
	private TransactionTemplate transactionTemplate;

	public String getLoginToken(final String subbranchId) {

		return jedisTemplate.execute(new JedisCallback<String>() {

			public String doInJedis(Jedis jedis) {

				// 目前允许一个账号在多处登陆
//				cleanLoginToken(subbranchId);

				String token = UUIDUtils.uuid3();
				String userKey = "subbranch_" + subbranchId;
				jedis.set(token, subbranchId);
				jedis.set(userKey, token);

				return token;
			}

		});
	}

	public void cleanLoginToken(final String subbranchId) {

		jedisTemplate.execute(new JedisCallback<Object>() {

			public Object doInJedis(Jedis jedis) {

				String userKey = "subbranch_" + subbranchId;
				String token = jedis.get(userKey);

				if (StringUtils.isNotBlank(token)){
					jedis.del(userKey, token);
				}

				return null;
			}

		});
	}

	public boolean isTokenValid(final String token) {

		return jedisTemplate.execute(new JedisCallback<Boolean>() {

			public Boolean doInJedis(Jedis jedis) {

				return jedis.exists(token);
			}
		});

	}

	@Override
	public String getShopIdByToken(final String token) {

		return jedisTemplate.execute(new JedisCallback<String>() {

			public String doInJedis(Jedis jedis) {

				return jedis.get(token);
			}
		});
	}

	@Override
	public SubbranchVo login(String username, String password) {
		ValidateUtils.notNull(username, "用户名不能为空");
		ValidateUtils.notNull(password, "密码不能为空");

		Long userCounts = subbranchService.count(Conds.get().eq("mobile", username).eq("del_flag", BoolType.F.name()));
		ValidateUtils.isTrue(userCounts == 1, "1" ,"该账号不存在！");

		Subbranch s = subbranchService.get(Conds.get().eq("mobile", username).eq("password", password).eq("del_flag", BoolType.F.name()));
		ValidateUtils.notNull(s, "4", "账号或密码错误！");

		ValidateUtils.isTrue(BoolType.F.name().equals(s.getDelFlag()) && BoolType.T.name().equals(s.getIsValid()), "3", "账号已禁用");

		VtwoStoreRole vtwoStoreRole = vtwoStoreRoleService.get(Conds.get().eq("store_id", s.getId()));

		ValidateUtils.isTrue(vtwoStoreRole.getStatus() == 2, "500013", "当前帐号处于待审核中，请联系客户");

		SubbranchVo svo = SubbranchVo.fromSubbranch(s);

//		,r.status AS verify,b.bank_card_id,b.bank_name,b.bank_card
//		from store_subbranch s
//		left join store_level sl on sl.level_Id = s.level_id LEFT JOIN vtwo_store_role r on s.id=r.store_id
//        LEFT JOIN store_bank_card b ON b.connect_Id = s.id
//		where s.mobile = #{loginName} and s.password = #{password} and s.state=0 and (s.del_flag &lt;&gt; 'T' or s.del_flag is null)

		// 设置运营商等级
		StoreLevel level = storeLevelService.getById(s.getLevelId());
		// 查询运营商银行卡信息
		BankCard bankCard = bankCardService.getByStoreId(s.getId() + "");

		svo.setBankCardInfo(bankCard);
		svo.setStoreLevel(level);

		String token = getLoginToken(s.getId()+ "");
		svo.setLoginToken(token);

		return svo;
	}

	@Override
	public SubbranchVo register(SubbranchVo svo) {

		ValidateUtils.notNull(svo.getMobile(), "用户名不能为空");
		ValidateUtils.notNull(svo.getPassword(), "密码不能为空");

		Long userCounts = subbranchService.count(Conds.get().eq("mobile", svo.getMobile()).eq("del_flag", BoolType.F.name()));
		ValidateUtils.isTrue(userCounts == 0, "用户已注册");

//		userCounts = subbranchService.count(Conds.get().eq("name", svo.getName()).eq("del_flag", BoolType.F.name()));
//		ValidateUtils.isTrue(userCounts == 0, "店铺名称已存在");

		Date now = new Date();
		Subbranch subbranch = new Subbranch();

		subbranch.setPassword(svo.getPassword());
		subbranch.setMobile(svo.getMobile());
		subbranch.setDelFlag(BoolType.F.toString());
		subbranch.setIsValid(BoolType.T.toString());
		subbranch.setId(IdGenerator.getDefault().nextId());
		subbranch.setCreateTime(now);
		subbranch.setState(0);

		subbranchService.insert(subbranch);


		VtwoStoreRole storeRole = new VtwoStoreRole();
		storeRole.setId(IdGenerator.getDefault().nextId());
		storeRole.setStoreId(subbranch.getId());
		storeRole.setCreateTime(now);
		storeRole.setRecommendUser(svo.getRecommendUser());

		// TODO 城市合伙人逻辑
		storeRole.setStatus(1);
		vtwoStoreRoleService.insert(storeRole);

		svo.setId(subbranch.getId().toString());
//        messageBizService.addNoticeMessage(subbranch.getId() + "", subbranch.getId() + "", 0, String.format("[审核通知]‘%s’已提交审核材料，请及时处理！", subbranch.getName()));
		return svo;
	}


	@Override
	public SubbranchInfo doRegister(final SubbranchInfo subbranchInfo) {

		ValidateUtils.notNull(subbranchInfo.getMobile(), "用户名不能为空");
		ValidateUtils.notNull(subbranchInfo.getPassword(), "密码不能为空");

		Long userCounts = subbranchService.count(Conds.get().eq("mobile", subbranchInfo.getMobile()).eq("del_flag", BoolType.F.name()));
		ValidateUtils.isTrue(userCounts == 0, "用户已注册");

		userCounts = subbranchService.count(Conds.get().eq("name", subbranchInfo.getName()).eq("del_flag", BoolType.F.name()));
		ValidateUtils.isTrue(userCounts == 0, "店铺名称已存在");

		final Subbranch subbranch = new Subbranch();
		org.springframework.beans.BeanUtils.copyProperties(subbranchInfo, subbranch);
		subbranch.setDelFlag(BoolType.F.toString());
		subbranch.setIsValid(BoolType.T.toString());
		subbranch.setId(IdGenerator.getDefault().nextId());
		subbranch.setCreateTime(new Date());
		subbranch.setState(0);

		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
//				// 更新店铺信息
//				subbranchService.update(Update.byId(info.getId()).set("name", info.getName()).set("user_name", info.getUserName()).set("address", info.getAddress())
//						.set("description", info.getDescription()).set("head_img_url", info.getHeadImgUrl()).set("province_name", info.getProvinceName())
//						.set("city_name", info.getCityName()).set("country_name", info.getCountryName()).set("weixin", info.getWeixin())
//						.set("province", info.getProvince()).set("city", info.getCity()).set("country", info.getCountry()).set("phone", info.getPhone()));

				subbranchService.insert(subbranch);

				VtwoStoreRole storeRole = new VtwoStoreRole();
				storeRole.setRecommendUser(subbranchInfo.getRecommendUser());
				storeRole.setIdCardIndex(subbranchInfo.getIdCardIndex());
				storeRole.setIdCardBack(subbranchInfo.getIdCardBack());
				storeRole.setBusinessLicence(subbranchInfo.getBusinessLicence());
				storeRole.setTaxPhoto(subbranchInfo.getTaxPhoto());
				storeRole.setId(IdGenerator.getDefault().nextId());
				storeRole.setStoreId(subbranch.getId());
				storeRole.setCreateTime(new Date());
				storeRole.setRecommendUser(subbranchInfo.getRecommendUser());

				// TODO 城市合伙人逻辑
				storeRole.setStatus(1);
				vtwoStoreRoleService.insert(storeRole);

//				// 更新代理商信息
//				vtwoStoreRoleService.update(Update.byId(storeRole.getId()).set("id_card_index", info.getIdCardIndex()).set("id_card_back", info.getIdCardBack())
//						.set("business_licence", info.getBusinessLicence()).set("tax_photo", info.getTaxPhoto()));

				// 更新图片
//				vtwoStorePhotoService.delete(Conds.get().eq("store_id", info.getId()));
				for (String url : subbranchInfo.getAddPicList()) {
					VtwoStorePhoto photo = new VtwoStorePhoto();
					photo.setId(IdGenerator.getDefault().nextId());
					photo.setStoreId(Long.valueOf(subbranch.getId()));
					photo.setPhotoUrl(url);
					photo.setCreateTime(new Date());
					photo.setIsAble("0");
					vtwoStorePhotoService.insert(photo);
				}
			}
		});

		subbranchInfo.setId(subbranch.getId().toString());
//        messageBizService.addNoticeMessage(subbranch.getId() + "", subbranch.getId() + "", 0, String.format("[审核通知]‘%s’已提交审核材料，请及时处理！", subbranch.getName()));
		return subbranchInfo;
	}

	@Override
	public SubbranchVo getShopInfo(String shopId) {
		Subbranch subbranch = subbranchService.getById(shopId);
		if (subbranch == null) {
			return null;
		}
		SubbranchVo subbranchVo = SubbranchVo.fromSubbranch(subbranch);
		return subbranchVo;
	}

	@Override
	public Subbranch ShopInfoByMobile(String phone) {
		Subbranch subbranch = subbranchService.getByMobile(phone);
		return subbranch;
	}
}
