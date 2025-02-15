package pub.makers.shop.baseGood.service;

import pub.makers.shop.base.enums.ClientType;
import pub.makers.shop.baseGood.vo.BaseGoodVo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by kok on 2017/6/15.
 */
public interface BaseGoodBizService {
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

    /**
     * 获取sku价格
     */
    BigDecimal getSkuPrice(String skuId, String storeLevelId);

    /**
     * 批量获取sku价格
     */
    Map<String, BigDecimal> getSkuPrice(List<String> skuIdList, String storeLevelId);

    /**
     * 批量获取sku价格
     */
    Map<String, BigDecimal> getSkuPriceByGood(List<String> goodIdList, String storeLevelId);
}
