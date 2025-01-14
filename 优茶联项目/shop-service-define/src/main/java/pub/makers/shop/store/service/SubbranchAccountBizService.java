package pub.makers.shop.store.service;

import java.util.List;
import java.util.Set;

import pub.makers.shop.base.vo.ResultData;
import pub.makers.shop.store.entity.GeoShopInfo;
import pub.makers.shop.store.entity.Subbranch;
import pub.makers.shop.store.vo.SubbranchVo;

/**
 * 店铺账号管理服务
 * @author jlr_6
 *
 */
public interface SubbranchAccountBizService {

	
	/**
	 * 是否是子账号
	 * @param subbranchId
	 * @return
	 */
	boolean isSubAccount(String subbranchId);
	
	
	/**
	 * 根据店铺ID查询主店铺信息
	 * @param subbranchId
	 * @return
	 */
	Subbranch getMainSubbranch(String subbranchId);
	
	
	/**
	 * 添加子账号
	 * @param parentId
	 * @param subAccount
	 * @return
	 */
	Subbranch addSubAccount(String parentId, Subbranch subAccount);
	
	/**
	 * 编辑子账号信息
	 * @param subAccount
	 * @return
	 */
	Subbranch editSubAccount(Subbranch subAccount);
	
	
	/**
	 * 子账号启用/禁用
	 * @return
	 */
	Subbranch updateIsValid(String subAccountid, String isValid);
	
	
	/**
	 * 查询子账号信息
	 * @param parentId
	 * @return
	 */
	List<Subbranch> listSubAccountByParent(String parentId);
	
	
	/**
	 * 查询店铺销售详情
	 * @param shopId
	 * @return
	 */
	ResultData querySummary(String shopId);
	
	
	/**
	 * 查询当前店铺所有的子账号，包括当前店铺
	 * @param shopId
	 * @return
	 */
	Set<Long> queryChildrens(String shopId);
	

    /**
     * 
     * 删除子账号
     * @param subAccountid
     * @param delFlag
     * @return
     */
	Subbranch delete (String subAccountid);


	/**
	 * 查找附近的店铺
	 * @param lat
	 * @param lng
	 * @return
	 */
	List<SubbranchVo> findNearBy(Double lat, Double lng, Integer distance);

	/**
	 * 验证手机号码是否存在
	 * @param mobile
	 * @param id
	 * @return
	 */

	List<Subbranch> checkAccountMobile(String mobile, Long id);

}
