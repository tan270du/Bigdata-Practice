package pub.makers.shop.purchaseGoods.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by kok on 2017/6/22.
 */
public class PurchaseGoodsSearch implements Serializable {
    private String id;
    private String purGoodsId; // 进货商品id
    private String purGoodsName; // 进货商品名称
    private String purGoodsSkuId; // 进货商品skuid
    private String purGoodsSkuName; // 进货商品sku名称
    private String brandId; // 品牌id
    private String brandName; // 品牌名称
    private String classifyIds; // 分类id
    private String classifyAttrIds; // 分类属性id
    private Integer saleNum; // 销量
    private Integer orderIndex; // 排序
    private Date goodCreateTime; // 商品添加时间
    private String labelId; // 标签id
    private String labelName; // 标签名称
    private String purSubtitle; // 进货商品副标题
    private BigDecimal zyDeliveryPrice; // 直营店供货价
    private BigDecimal jmsDeliveryPrice; // 加盟商供货价
    private BigDecimal ygDeliveryPrice; // 员工供货价
    private BigDecimal lmsDeliveryPrice; // 联盟商供货价
    private BigDecimal tsDeliveryPrice; // 特殊加盟供货价
    private String storeLevel; //店铺等级
    private String status;
    private String classifyValid; //分类有效

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPurGoodsId() {
        return purGoodsId;
    }

    public void setPurGoodsId(String purGoodsId) {
        this.purGoodsId = purGoodsId;
    }

    public String getPurGoodsName() {
        return purGoodsName;
    }

    public void setPurGoodsName(String purGoodsName) {
        this.purGoodsName = purGoodsName;
    }

    public String getPurGoodsSkuId() {
        return purGoodsSkuId;
    }

    public void setPurGoodsSkuId(String purGoodsSkuId) {
        this.purGoodsSkuId = purGoodsSkuId;
    }

    public String getPurGoodsSkuName() {
        return purGoodsSkuName;
    }

    public void setPurGoodsSkuName(String purGoodsSkuName) {
        this.purGoodsSkuName = purGoodsSkuName;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getClassifyIds() {
        return classifyIds;
    }

    public void setClassifyIds(String classifyIds) {
        this.classifyIds = classifyIds;
    }

    public String getClassifyAttrIds() {
        return classifyAttrIds;
    }

    public void setClassifyAttrIds(String classifyAttrIds) {
        this.classifyAttrIds = classifyAttrIds;
    }

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public Integer getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }

    public Date getGoodCreateTime() {
        return goodCreateTime;
    }

    public void setGoodCreateTime(Date goodCreateTime) {
        this.goodCreateTime = goodCreateTime;
    }

    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getPurSubtitle() {
        return purSubtitle;
    }

    public void setPurSubtitle(String purSubtitle) {
        this.purSubtitle = purSubtitle;
    }

    public BigDecimal getZyDeliveryPrice() {
        return zyDeliveryPrice;
    }

    public void setZyDeliveryPrice(BigDecimal zyDeliveryPrice) {
        this.zyDeliveryPrice = zyDeliveryPrice;
    }

    public BigDecimal getJmsDeliveryPrice() {
        return jmsDeliveryPrice;
    }

    public void setJmsDeliveryPrice(BigDecimal jmsDeliveryPrice) {
        this.jmsDeliveryPrice = jmsDeliveryPrice;
    }

    public BigDecimal getYgDeliveryPrice() {
        return ygDeliveryPrice;
    }

    public void setYgDeliveryPrice(BigDecimal ygDeliveryPrice) {
        this.ygDeliveryPrice = ygDeliveryPrice;
    }

    public BigDecimal getLmsDeliveryPrice() {
        return lmsDeliveryPrice;
    }

    public void setLmsDeliveryPrice(BigDecimal lmsDeliveryPrice) {
        this.lmsDeliveryPrice = lmsDeliveryPrice;
    }

    public BigDecimal getTsDeliveryPrice() {
        return tsDeliveryPrice;
    }

    public void setTsDeliveryPrice(BigDecimal tsDeliveryPrice) {
        this.tsDeliveryPrice = tsDeliveryPrice;
    }

    public String getStoreLevel() {
        return storeLevel;
    }

    public void setStoreLevel(String storeLevel) {
        this.storeLevel = storeLevel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getClassifyValid() {
        return classifyValid;
    }

    public void setClassifyValid(String classifyValid) {
        this.classifyValid = classifyValid;
    }
}
