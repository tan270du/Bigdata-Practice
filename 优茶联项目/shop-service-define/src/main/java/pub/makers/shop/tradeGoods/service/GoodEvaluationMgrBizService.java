package pub.makers.shop.tradeGoods.service;

import pub.makers.shop.base.vo.Paging;
import pub.makers.shop.base.vo.ResultList;
import pub.makers.shop.tradeGoods.vo.GoodEvaluationManageVo;
import pub.makers.shop.tradeGoods.vo.GoodEvaluationParams;

import java.util.Map;

public interface GoodEvaluationMgrBizService {

    /**
     * 根据参数查询相应的评价
     * @param param
     * @param pg
     * @return
     */
    ResultList<GoodEvaluationManageVo> listByCondition(GoodEvaluationParams param, Paging pg);

    /**
     * 根据参数更新数据库的is_hide字段
     * @param param
     * @param pg
     * @return
     */
    Map<String, Object> updateEvaluationIsHide(GoodEvaluationParams param, Paging pg);

    /**
     * 根据参数更新数据库的is_replied字段并增加（给用户评价的）回复评论
     * @param param
     * @param map
     * @return
     */
    Map<String, Object> updateEvaluationIsReplied(GoodEvaluationParams param, Map<String, Object> map);

    Map<String, Object> getImageById (String ids);
}
