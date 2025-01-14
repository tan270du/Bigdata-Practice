package pub.makers.shop.promotion.service;

import pub.makers.shop.baseOrder.pojo.PromotionGoodQuery;
import pub.makers.shop.promotion.vo.GoodPromotionalInfoVo;

import java.util.Map;

/**
 * 促销服务
 * @author apple
 *
 */
public interface PromotionBizService {

	
	/**
	 * 查询商品的促销信息
	 * @param query
	 * @return
	 */
	Map<String, GoodPromotionalInfoVo> applyPromotionRule(PromotionGoodQuery query);
	
	
	/**
	 * 更新缓存商品的营销信息
	 * 这个接口不在使用
	 * @param query
	 */
	void updatePromotionRule(PromotionGoodQuery query);
	
	
	/**
	 * 生成&更新查询指定的缓存信息
	 * @param query
	 * @return
	 */
	Map<String, GoodPromotionalInfoVo> buildCache(PromotionGoodQuery query);
}
