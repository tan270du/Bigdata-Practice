package pub.makers.shop.purchaseGoods.service;


import pub.makers.shop.base.vo.ResultList;
import pub.makers.shop.purchaseGoods.vo.PurchaseClassifyVo;

import java.util.List;
import java.util.Map;

/**
 * Created by dy on 2017/5/26.
 */
public interface PurchaseTradeGoodClassifyMgrBizService {
    /**
     * 查询所有的商品管理列表
     * @param parentId
     * @param status
     * @return
     */
    ResultList<PurchaseClassifyVo> getPurchaseTradeGoddsClassfyTree(Long parentId, Integer status);

    /**
     * 根据参数更新数据库的status字段的值
     * @param ids
     * @return
     */
    Map<String, Object> updateStatus(String ids, String status);

    /**
     * 根据参数删除记录
     * @param ids
     * @return
     */
    Map<String, Object> deleteClassify(String ids);

    /**
     * 获取分类父级欣欣
     * @param childId
     * @return
     */
    List<PurchaseClassifyVo> getGoodsClassifyList(String childId);

    /**
     * 获取父级信息
     * @param parentId
     * @param status
     * @param storeLevel
     * @return
     */
    List<PurchaseClassifyVo> queryParents(Long parentId, Integer status, String storeLevel);

    /**
     * 获取表格列表数据
     * @param parentId
     * @param status
     * @return
     */
    ResultList<PurchaseClassifyVo> getPurchaseClassfyList(String parentId, Integer status);

    /**
     * 保存或新增分类
     * @param userId
     * @param purchaseClassifyVo
     * @return
     */
    PurchaseClassifyVo savePurchaseClassify(Long userId, PurchaseClassifyVo purchaseClassifyVo);
}
