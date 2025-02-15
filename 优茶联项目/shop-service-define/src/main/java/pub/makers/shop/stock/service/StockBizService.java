package pub.makers.shop.stock.service;

import pub.makers.shop.baseOrder.enums.OrderBizType;
import pub.makers.shop.baseOrder.pojo.BaseOrderItem;
import pub.makers.shop.stock.pojo.StockQuery;

import java.util.List;
import java.util.Map;

/**
 * 库存管理
 * @author apple
 *
 */
public interface StockBizService {

	/**
	 * 是否有足够的库存
	 * @param stockQuery
	 * @return
	 */
	boolean hasEnoughStock(StockQuery stockQuery);

	/**
	 * 查询当前可用库存
	 * @param goodSkuId
	 * @param orderBizType
	 * @return
	 */
	int queryCurrStork(String goodSkuId, String orderBizType);

	/**
	 * 批量查询当前可用库存
	 */
	Map<String, Integer> queryCurrStork(List<String> goodSkuIdList, String orderBizType);
	
	/**
	 * 商品上架库存修改
	 * 未上架-已上架未售+
	 */
	void upGoodStock(StockQuery stockQuery);

	/**
	 * 商品下架库存修改
	 * 已上架未售-未上架+
	 */
	void downGoodStock(StockQuery stockQuery);
	
	/**
	 * 锁定库存
	 * 订单下单的时候
	 * 已上架未售-已售未付款+
	 */
	void lockStock(StockQuery stockQuery);
	
	/**
	 * 批量锁定库存
	 * @param baseOrderItem
	 */
	void lockStocks(List<? extends BaseOrderItem> itemList, OrderBizType orderBizType);
	
	/**
	 * 使用库存
	 * 订单支付的时候
	 * 已售未付款-已售未发货+
	 */
	void useLockStock(StockQuery stockQuery);
	
	
	/**
	 * 批量使用库存
	 * @param itemList
	 * @param orderBizType
	 */
	void useLockStocks(List<? extends BaseOrderItem> itemList, OrderBizType orderBizType);
	
	
	/**
	 * 释放库存
	 * 订单取消 
	 * 已售未付款-已上架未售+
	 */
	void releaseLockStock(StockQuery stockQuery);
	
	/**
	 * 批量释放库存
	 * @param itemList
	 * @param orderBizType
	 */
	void releaseLockStocks(List<? extends BaseOrderItem> itemList, OrderBizType orderBizType);

	/**
	 * 归还库存
	 * 订单未发货退款
	 * 已售未发货-已上架未售+
	 */
	void rfStock(StockQuery stockQuery);

	/**
	 * 归还库存
	 * 商品退货
	 * 已上架未售+
	 */
	void rtStock(StockQuery stockQuery);
	
	
	/**
	 * 使用库存
	 * 商品直接发货或者其他场景
	 * 已售未发货-
	 */
	void useStock(StockQuery stockQuery);
	
	/**
	 * 批量使用库存
	 * 商品直接发货或者其他场景
	 * 已售未发货-
	 */
	void useStocks(List<? extends BaseOrderItem> itemList, OrderBizType orderBizType);
}
