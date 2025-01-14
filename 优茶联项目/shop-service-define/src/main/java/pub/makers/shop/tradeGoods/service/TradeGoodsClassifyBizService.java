package pub.makers.shop.tradeGoods.service;

import pub.makers.shop.tradeGoods.entity.TradeGoodsClassify;
import pub.makers.shop.tradeGoods.vo.TradeGoodsClassifyVo;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by kok on 2017/6/27.
 */
public interface TradeGoodsClassifyBizService {
    /**
     * 根据父id查找分类
     */
    Map<String, List<TradeGoodsClassifyVo>> getClassifyListByParentId(List<String> parentIdList);

    /**
     * 根据父id查找分类
     */
    List<TradeGoodsClassifyVo> getClassifyListAll();

    /**
     * 查询所有子分类id
     */
    Set<String> findAllIdByParentId(Set<String> parentIdList);

    /**
     * 查找所有父分类
     */
    List<TradeGoodsClassifyVo> findAllAndParent(List<String> classifyIdList);

    /**
     * 查找所有父分类
     */
    List<TradeGoodsClassifyVo> findAllByParentId(List<String> classifyIdList);

    /**
     * 禁用分类列表
     */
    List<TradeGoodsClassify> getDisableClassifyList();
}
