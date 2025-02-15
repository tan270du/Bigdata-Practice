package pub.makers.shop.promotion.service;

import pub.makers.shop.base.vo.Paging;
import pub.makers.shop.base.vo.ResultData;
import pub.makers.shop.base.vo.ResultList;
import pub.makers.shop.promotion.vo.*;

import java.util.List;

/**
 * Created by dy on 2017/8/17.
 */
public interface ManzengAdminService {
    ResultList<ManzengActivityVo> manzengActivityList(ManzengParam manzengParam, Paging pg);

    /**
     *
     * 新增或修改满减满赠活动
     * @return
     */
    void saveOrUpdate(ManzengActivityVo manzengActivityVo, long userId);

    /**
     * 活动明细
     * @param id
     * @return
     */
    ManzengActivityVo getManzengActivityInfo(String id);

    /**
     * 删除满赠活动优惠内容
     * @param manzengParam
     */
    ResultData delManzengRule(ManzengParam manzengParam);

    /**
     * 删除满赠活动
     * @param manzengParam
     * @return
     */
    ResultData delManzengActivity(ManzengParam manzengParam);

    /**
     * 暂停启用满减活动
     * @param manzengParam
     * @return
     */
    ResultData updateValidManzengActivity(ManzengParam manzengParam);

    /**
     * 获取满减满赠活动应用范围
     * @param manzengParam
     * @return
     */
    ManzengActivityApplyVo manzengApplyInfo(ManzengParam manzengParam);

    /**
     * 设置满减活动应用范围
     * @param manzengActivityApplyVo
     */
    void applyManzengRange(ManzengActivityApplyVo manzengActivityApplyVo);

    /**
     * 获取满赠规则
     * @param manzengParam
     * @return
     */
    List<ManzengRuleVo> getManzengRuleList(ManzengParam manzengParam);

    /**
     * 赠品列表
     * @param manzengParam
     * @param pg
     * @return
     */
    ResultList<ActivityGoodVo> manzengGoodsList(ManzengParam manzengParam, Paging pg);

    /**
     * 添加赠品
     * @param manzengParam
     */
    void addManzengGiftGood(ManzengParam manzengParam);

    /**
     * 删除赠品
     * @param manzengParam
     */
    void delManzengGood(ManzengParam manzengParam);

    /**
     * 获取商品的SKUid
     * @param goodId
     * @return
     */
    List<String> getGoodSkuIdByGoodId(String goodId, String orderBizType);
}
