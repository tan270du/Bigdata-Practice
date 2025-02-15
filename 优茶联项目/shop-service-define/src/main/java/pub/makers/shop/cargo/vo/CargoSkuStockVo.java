package pub.makers.shop.cargo.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by dy on 2017/5/23.
 */
public class CargoSkuStockVo implements Serializable{

    private String id;

    private String cargoSkuId;

    private String goodsName;

    private Integer outShelvesNo;

    private Integer onSalesNo;

    private Integer onPayNo;

    private Integer onSendNo;

    private Integer remainCount;

    private String warningValue;

    private String isValid;

    private Integer onShelvesNo;

    private Integer allSellNo;

    private String warningState;

    private String type;

    private String brand;

    private String skuCode;

    private String goodsCode;

    private String classify;

    private Date createTime;

    private Date updateTime;

    private Integer total;

    private Integer isSync;

    private String cargoSkuName;

    private String cargoSKuValue;

    private String currStock;

    private Integer saleNum;

    private Integer tradeSaleNo;

    private Integer purchaseSaleNo;

    private String purchaseStatus;

    private String tradeStatus;

    public String getPurchaseStatus() {
        return purchaseStatus;
    }

    public void setPurchaseStatus(String purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public Integer getTradeSaleNo() {
        return tradeSaleNo;
    }

    public void setTradeSaleNo(Integer tradeSaleNo) {
        this.tradeSaleNo = tradeSaleNo;
    }

    public Integer getPurchaseSaleNo() {
        return purchaseSaleNo;
    }

    public void setPurchaseSaleNo(Integer purchaseSaleNo) {
        this.purchaseSaleNo = purchaseSaleNo;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCargoSKuValue() {
        return cargoSKuValue;
    }

    public void setCargoSKuValue(String cargoSKuValue) {
        this.cargoSKuValue = cargoSKuValue;
    }

    public String getCargoSkuName() {
        return cargoSkuName;
    }

    public void setCargoSkuName(String cargoSkuName) {
        this.cargoSkuName = cargoSkuName;
    }

    public String getCurrStock() {
        return currStock;
    }

    public void setCurrStock(String currStock) {
        this.currStock = currStock;
    }

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public Integer getIsSync() {
        return isSync;
    }

    public void setIsSync(Integer isSync) {
        this.isSync = isSync;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCargoSkuId() {
        return cargoSkuId;
    }

    public void setCargoSkuId(String cargoSkuId) {
        this.cargoSkuId = cargoSkuId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getOutShelvesNo() {
        return outShelvesNo;
    }

    public void setOutShelvesNo(Integer outShelvesNo) {
        this.outShelvesNo = outShelvesNo;
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

    public Integer getRemainCount() {
        return remainCount;
    }

    public void setRemainCount(Integer remainCount) {
        this.remainCount = remainCount;
    }

    public String getWarningValue() {
        return warningValue;
    }

    public void setWarningValue(String warningValue) {
        this.warningValue = warningValue;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public Integer getOnShelvesNo() {
        return onShelvesNo;
    }

    public void setOnShelvesNo(Integer onShelvesNo) {
        this.onShelvesNo = onShelvesNo;
    }

    public Integer getAllSellNo() {
        return allSellNo;
    }

    public void setAllSellNo(Integer allSellNo) {
        this.allSellNo = allSellNo;
    }

    public String getWarningState() {
        return warningState;
    }

    public void setWarningState(String warningState) {
        this.warningState = warningState;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
