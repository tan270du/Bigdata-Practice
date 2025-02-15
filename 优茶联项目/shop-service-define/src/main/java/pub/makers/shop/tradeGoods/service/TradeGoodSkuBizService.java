package pub.makers.shop.tradeGoods.service;


import pub.makers.shop.base.enums.ClientType;
import pub.makers.shop.baseGood.service.BaseGoodBizService;
import pub.makers.shop.baseGood.vo.BaseGoodVo;
import pub.makers.shop.tradeGoods.vo.TradeGoodSkuVo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface TradeGoodSkuBizService extends BaseGoodBizService {

	/**
	 * 查询所有赠品SKU列表
	 * @return
	 */
	List<TradeGoodSkuVo> listGiftSkus();

	/**
	 * 商品上架
	 */
	void upGoodSku(Long skuId, Integer num, Long userId);

	/**
	 * 商品上架 定时上架用
	 */
	void upGoodSkuSchedule(Long skuId, Integer num, Long userId);

	/**
	 * 商品下架
	 */
	void downGoodSku(Long skuId, Long userId);

	/**
	 * 修改上架数量
	 */
	void updateUpSkuNum(Long skuId, Integer num, Long userId);

	/**
	 * 商品sku列表
	 */
	List<TradeGoodSkuVo> getGoodsSkuList(String goodId);

	/**
	 * 商品sku列表
	 */
	List<TradeGoodSkuVo> getGoodsSkuList(String goodId, String storeLevelId);

	/**
	 * 商品sku详情
	 */
	TradeGoodSkuVo getGoodSkuDetail(String skuId);

	/**
	 * 获取sku价格
	 */
	BigDecimal getSkuPrice(String skuId);

	/**
	 * 批量获取sku价格
	 */
	Map<String, BigDecimal> getSkuPrice(List<String> skuIdList);

	/**
	 * 批量获取sku供货价
	 */
	Map<String, BigDecimal> getSkuSupplyPrice(List<String> skuIdList, String storeLevelId);

	/**
	 * 查询商品信息
	 */
	List<BaseGoodVo> getGoodSkuListBySkuId(List<String> skuIdList, ClientType type);

	/**
	 * 查询商品信息
	 */
	List<BaseGoodVo> getGoodSkuListByGoodId(List<String> goodIdList, ClientType type);

	/**
	 * 查询商品信息(上架商品)
	 */
	List<BaseGoodVo> getGoodSkuListBySkuId(List<String> skuIdList, String storeLevelId, ClientType type);

	/**
	 * 查询商品信息
	 */
	List<BaseGoodVo> getAllGoodSkuListBySkuId(List<String> skuIdList, String storeLevelId, ClientType type);

	/**
	 * 查询商品信息(上架商品)
	 */
	List<BaseGoodVo> getGoodSkuListByGoodId(List<String> goodIdList, String storeLevelId, ClientType type);

	/**
	 * 查询商品信息
	 */
	List<BaseGoodVo> getAllGoodSkuListByGoodId(List<String> goodIdList, String storeLevelId, ClientType type);
}
