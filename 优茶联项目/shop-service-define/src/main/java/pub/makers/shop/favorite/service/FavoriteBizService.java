package pub.makers.shop.favorite.service;

import pub.makers.shop.baseOrder.enums.OrderBizType;
import pub.makers.shop.favorite.pojo.FavoriteQuery;
import pub.makers.shop.favorite.vo.FavoriteVo;

import java.util.List;

/**
 * Created by dy on 2017/6/19.
 */
public interface FavoriteBizService {

    /**
     * 添加收藏
     * @param query
     */
    void addFavorite(FavoriteQuery query);

    /**
     * 批量取消收藏
     * @param idList
     * @param userId
     * @param orderBizType
     */
    void batchCancleFavorite(final List<String> idList, final String userId, OrderBizType orderBizType);

    /**
     * 获取列表数据
     * @param query
     * @return
     */
    List<FavoriteVo> getFavoriteList(FavoriteQuery query);


    /**
     * 根据商品查找已经收藏的记录
     * @param goodsSkuIdList
     * @param userId
     * @param orderBizType
     * @return
     */
    List<FavoriteVo> getFavoriteListByGoodsId(String goodsSkuIdList, String userId, String shopId, OrderBizType orderBizType);

    /**
     * 查询数量
     * @param favoriteQuery
     * @return
     */
    Long getFavoriteCount(FavoriteQuery favoriteQuery);

    /**
     * 单个取消收藏
     * @param favoriteQuery
     */
    void cancelFavorite(FavoriteQuery favoriteQuery);
}
