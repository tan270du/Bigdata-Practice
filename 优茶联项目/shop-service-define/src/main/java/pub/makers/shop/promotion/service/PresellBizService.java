package pub.makers.shop.promotion.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import pub.makers.shop.baseOrder.entity.OrderPresellExtra;
import pub.makers.shop.baseOrder.enums.OrderBizType;
import pub.makers.shop.baseOrder.pojo.BaseOrder;
import pub.makers.shop.baseOrder.pojo.BaseOrderItem;
import pub.makers.shop.promotion.entity.PresellActivity;
import pub.makers.shop.promotion.entity.PresellGood;
import pub.makers.shop.promotion.vo.PresellCreateResult;
import pub.makers.shop.promotion.vo.PresellPromotionActivityVo;

/**
 * 预售业务服务
 * @author apple
 *
 */
public interface PresellBizService {

	PresellActivity getValidActivityBySkuid(String skuId);
	
	PresellGood getGoodIfExists(String skuId);
	
	List<PresellPromotionActivityVo> listForGoodsSku(Set<String> goodSkuIdSet);
	
	/**
	 * 创建商品的预售活动扩展信息
	 * @param orderBizType
	 * @param presellActivityId
	 * @return
	 */
	void addExtra(OrderBizType orderBizType, OrderPresellExtra extra);
	
	
	/**
	 * 根据订单ID查询扩展信息
	 * @param orderBizType
	 * @param orderId
	 * @return
	 */
	OrderPresellExtra getExtra(OrderBizType orderBizType, String orderId);
	
	/**
	 * 处理订单的价格信息并且计算预售付款信息
	 * @param bo
	 * @return
	 */
	PresellCreateResult processBaseorderAndCalcpayment(BaseOrder bo, OrderBizType orderBizType);
	
	/**
	 * 处理订单的价格信息并且计算预售付款信息
	 * @param bo
	 * @return
	 */
	PresellCreateResult processBaseorderAndCalcpayment(BaseOrder bo, OrderBizType orderBizType, boolean createData);

	/**
	 * 锁定库存
	 */
	void lockStocks(List<? extends BaseOrderItem> itemList, OrderBizType orderBizType);

	/**
	 * 释放库存
	 */
	void releaseLockStocks(List<? extends BaseOrderItem> itemList, OrderBizType orderBizType);
	
	
	/**
	 * 订单免运费
	 * @param orderId
	 * @param freight
	 */
	void freeShippint(OrderBizType orderBizType, String orderId, BigDecimal freight);
}
