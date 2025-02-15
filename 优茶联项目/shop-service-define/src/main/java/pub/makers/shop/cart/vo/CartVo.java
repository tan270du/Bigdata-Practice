package pub.makers.shop.cart.vo;

import pub.makers.shop.baseGood.vo.BaseGoodVo;
import pub.makers.shop.cart.entity.Cart;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by kok on 2017/6/12.
 */
public class CartVo implements Serializable {
    /** 主键 */
    private String id;

    /** 商品id */
    private String goodsId;

    /** 店铺id */
    private String shopId;

    /** 用户id */
    private String userId;

    /** 商品数量 */
    private String goodsCount;

    /** 商品价格 */
    private String goodsPrize;

    /** 创建时间 */
    private Date createDate;

    /** 更新时间 */
    private Date updateDate;

    /** 可加 */
    private String canAdd;

    private String isStockEnough;

    /** 可减 */
    private String canSub;

    /** 是否可选 */
    private String isValid;

    /** 不可选原因 */
    private String message;

    private BaseGoodVo good;

    private String limitFlg;

    private Integer limitNum;

    public String getLimitFlg() {
        return limitFlg;
    }

    public void setLimitFlg(String limitFlg) {
        this.limitFlg = limitFlg;
    }

    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
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

    public String getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(String goodsCount) {
        this.goodsCount = goodsCount;
    }

    public String getGoodsPrize() {
        return goodsPrize;
    }

    public void setGoodsPrize(String goodsPrize) {
        this.goodsPrize = goodsPrize;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public BaseGoodVo getGood() {
        return good;
    }

    public void setGood(BaseGoodVo good) {
        this.good = good;
    }

    public String getCanAdd() {
        return canAdd;
    }

    public void setCanAdd(String canAdd) {
        this.canAdd = canAdd;
    }

    public String getCanSub() {
        return canSub;
    }

    public void setCanSub(String canSub) {
        this.canSub = canSub;
    }

    public String getIsStockEnough() {
        return isStockEnough;
    }

    public void setIsStockEnough(String isStockEnough) {
        this.isStockEnough = isStockEnough;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static CartVo fromCart(Cart cart) {
        CartVo vo = new CartVo();
        vo.setId(cart.getId() == null ? null : cart.getId().toString());
        vo.setGoodsId(cart.getGoodsId() == null ? null : cart.getGoodsId().toString());
        vo.setShopId(cart.getShopId() == null ? null : cart.getShopId().toString());
        vo.setUserId(cart.getUserId() == null ? null : cart.getUserId().toString());
        vo.setGoodsCount(cart.getGoodsCount() == null ? null : cart.getGoodsCount().toString());
        vo.setGoodsPrize(cart.getGoodsPrize() == null ? null : cart.getGoodsPrize().toString());
        vo.setCreateDate(cart.getCreateDate());
        vo.setUpdateDate(cart.getUpdateDate());
        return vo;
    }
}
