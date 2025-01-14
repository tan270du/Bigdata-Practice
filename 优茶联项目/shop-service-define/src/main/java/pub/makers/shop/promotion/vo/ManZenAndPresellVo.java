package pub.makers.shop.promotion.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by devpc on 2017/8/25.
 */
public class ManZenAndPresellVo implements Serializable{

    private String skuId;//sku的id

    private String name;  //名字

    private BigDecimal discount;  // 打折数

    private BigDecimal activityPrice;  //活动价格

    private BigDecimal man;  //满多少钱

    private BigDecimal jianNum; //减多少前

    private Integer zengNum; //赠送数量

    private Integer maxNum;//最大赠送数量

    private BigDecimal presellAmount;//预售价

    private String orderBizType; //商城还是采购

    private String type;//活动类型

    private String goodSkuIds; //skuId串

    private String otherActivityIds; //其他活动

    private String discountType;

    private List<String> goodSkuIdList;

    public List<String> getGoodSkuIdList() {
        return goodSkuIdList;
    }

    public void setGoodSkuIdList(List<String> goodSkuIdList) {
        this.goodSkuIdList = goodSkuIdList;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public String getOtherActivityIds() {
        return otherActivityIds;
    }

    public void setOtherActivityIds(String otherActivityIds) {
        this.otherActivityIds = otherActivityIds;
    }

    public String getGoodSkuIds() {
        return goodSkuIds;
    }

    public void setGoodSkuIds(String goodSkuIds) {
        this.goodSkuIds = goodSkuIds;
    }

    private String jianFlag;//是否满减

    private String zengFlag;//是否满赠

    public String getJianFlag() {
        return jianFlag;
    }

    public void setJianFlag(String jianFlag) {
        this.jianFlag = jianFlag;
    }

    public String getZengFlag() {
        return zengFlag;
    }

    public void setZengFlag(String zengFlag) {
        this.zengFlag = zengFlag;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getOrderBizType() {
        return orderBizType;
    }

    public void setOrderBizType(String orderBizType) {
        this.orderBizType = orderBizType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(BigDecimal activityPrice) {
        this.activityPrice = activityPrice;
    }

    public BigDecimal getMan() {
        return man;
    }

    public void setMan(BigDecimal man) {
        this.man = man;
    }

    public BigDecimal getJianNum() {
        return jianNum;
    }

    public void setJianNum(BigDecimal jianNum) {
        this.jianNum = jianNum;
    }

    public Integer getZengNum() {
        return zengNum;
    }

    public void setZengNum(Integer zengNum) {
        this.zengNum = zengNum;
    }

    public BigDecimal getPresellAmount() {
        return presellAmount;
    }

    public void setPresellAmount(BigDecimal presellAmount) {
        this.presellAmount = presellAmount;
    }
}
