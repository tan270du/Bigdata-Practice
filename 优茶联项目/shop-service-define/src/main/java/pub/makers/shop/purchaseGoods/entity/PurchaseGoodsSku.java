package pub.makers.shop.purchaseGoods.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by kok on 2017/5/10.
 */
public class PurchaseGoodsSku implements Serializable {
    private String id;

    private String purGoodsId;

    private String materialSkuId;

    private String materialSkuName;

    private String marketPrice;

    private String marketUnit;

    private String packingSettingId;

    private Integer startNum;

    private Integer orderIndex;

    private Date createTime;

    private Integer nums;

    private Integer onSalesNo;

    private Integer onPayNo;

    private Integer onSendNo;

    private Long cargoSkuId;

    private String cargoSkuName;

    private String isValid;

    private Date timingTime;

    private Integer shelfQty;

    private String status;

    private Integer saleNum;

    private String delFlag;

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getCargoSkuName() {
        return cargoSkuName;
    }

    public void setCargoSkuName(String cargoSkuName) {
        this.cargoSkuName = cargoSkuName;
    }

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

    public String getMaterialSkuId() {
        return materialSkuId;
    }

    public void setMaterialSkuId(String materialSkuId) {
        this.materialSkuId = materialSkuId;
    }

    public String getMaterialSkuName() {
        return materialSkuName;
    }

    public void setMaterialSkuName(String materialSkuName) {
        this.materialSkuName = materialSkuName;
    }

    public String getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(String marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getMarketUnit() {
        return marketUnit;
    }

    public void setMarketUnit(String marketUnit) {
        this.marketUnit = marketUnit;
    }

    public String getPackingSettingId() {
        return packingSettingId;
    }

    public void setPackingSettingId(String packingSettingId) {
        this.packingSettingId = packingSettingId;
    }

    public Integer getStartNum() {
        return startNum;
    }

    public void setStartNum(Integer startNum) {
        this.startNum = startNum;
    }

    public Integer getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    public Integer getOnSalesNo() {
        return onSalesNo;
    }

    public void setOnSalesNo(Integer onSalesNo) {
        this.onSalesNo = onSalesNo;
    }

    public Integer getOnPayNo() {
        return onPayNo;
    }

    public void setOnPayNo(Integer onPayNo) {
        this.onPayNo = onPayNo;
    }

    public Integer getOnSendNo() {
        return onSendNo;
    }

    public void setOnSendNo(Integer onSendNo) {
        this.onSendNo = onSendNo;
    }

    public Long getCargoSkuId() {
        return cargoSkuId;
    }

    public void setCargoSkuId(Long cargoSkuId) {
        this.cargoSkuId = cargoSkuId;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public Date getTimingTime() {
        return timingTime;
    }

    public void setTimingTime(Date timingTime) {
        this.timingTime = timingTime;
    }

    public Integer getShelfQty() {
        return shelfQty;
    }

    public void setShelfQty(Integer shelfQty) {
        this.shelfQty = shelfQty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }
}
