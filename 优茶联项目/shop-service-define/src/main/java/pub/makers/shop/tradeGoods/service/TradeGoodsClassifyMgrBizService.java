package pub.makers.shop.tradeGoods.service;

import pub.makers.shop.base.vo.ResultList;
import pub.makers.shop.tradeGoods.entity.TradeGoodsClassify;
import pub.makers.shop.tradeGoods.vo.TradeGoodsClassifyVo;

import java.util.List;
import java.util.Map;

/**
 * Created by dy on 2017/5/25.
 */
public interface TradeGoodsClassifyMgrBizService {
    /**
     * 获取子级分类
     * @param parentId
     * @param status
     * @return
     */
    List<TradeGoodsClassifyVo> getTradeGoodsClassifyVoListByParentId(long parentId, Integer status);

    /**
     * 获取分类Tree
     * @param parentId
     * @param status
     * @return
     */
    ResultList<TradeGoodsClassifyVo> getTradeGoddsClassfyTree(Long parentId, Integer status);

    /**
     * 获取商城分类数据
     * @param parentId
     * @param status
     * @return
     */
    ResultList<TradeGoodsClassifyVo> getTradeGoodsClassfyList(String parentId, Integer status);

    /**
     * 批量更新状态
     * @param ids
     * @param status
     */
    Map<String, Object> updateStatus(String ids, String status);

    /**
     * 删除分类
     * @param ids
     * @return
     */
    Map<String,Object> deleteClassify(String ids);

    /**
     * 保存或新增
     * @param userId
     * @param tradeGoodsClassifyVo
     * @return
     */
    TradeGoodsClassify saveTradeClassify(Long userId, TradeGoodsClassifyVo tradeGoodsClassifyVo);

}
