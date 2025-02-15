package pub.makers.shop.favorite.pojo;

import pub.makers.shop.base.enums.ClientType;
import pub.makers.shop.baseOrder.enums.OrderBizType;
import pub.makers.shop.favorite.entity.Favorite;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by dy on 2017/6/19.
 */
public class FavoriteQuery implements Serializable {

    private String id;
    /** 商品id */
        private String goodsId;

    /** 店铺id */
    private String shopId;

    /** 用户id */
    private String userId;

    /** 商品数量 */
    private Integer goodsCount;

    private OrderBizType orderBizType;

    /** 客户端类型 */
    private ClientType clientType;

    private String storeLevelId;

    private Integer pageNum = 1;

    private Integer pageSize = 8;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public OrderBizType getOrderBizType() {
        return orderBizType;
    }

    public void setOrderBizType(OrderBizType orderBizType) {
        this.orderBizType = orderBizType;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }

    public String getStoreLevelId() {
        return storeLevelId;
    }

    public void setStoreLevelId(String storeLevelId) {
        this.storeLevelId = storeLevelId;
    }

    public Favorite getFavorite() {
        Favorite favorite = new Favorite();
        favorite.setGoodsId(this.getGoodsId() == null ? null : Long.valueOf(this.getGoodsId()));
        favorite.setShopId(this.getShopId() == null ? null : Long.valueOf(this.getShopId()));
        favorite.setUserId(this.getUserId() == null ? null : Long.valueOf(this.getUserId()));
        favorite.setGoodsCount(this.getGoodsCount() == null ? null : this.getGoodsCount());
        return favorite;
    }
}
