package pub.makers.shop.purchaseGoods.vo;

import pub.makers.shop.cargo.vo.CargoSkuSupplyPriceVo;
import pub.makers.shop.promotion.vo.GoodPromotionalInfoVo;
import pub.makers.shop.purchaseGoods.entity.PurchaseGoodsSku;
import pub.makers.shop.store.vo.ImageVo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by dy on 2017/5/27.
 */
public class PurchaseGoodsSkuVo implements Serializable {

    private String id;

    private String purGoodsId;

    private String materialSkuId;

    private String materialSkuName;

    private String marketPrice;

    private String marketUnit;

    private String packingSettingId;

    private Integer startNum;

    private String mulNumFlag;

    private Integer orderIndex;

    private Date createTime;

    private Integer nums;

    private Integer onSalesNo;

    private Integer onPayNo;

    private Integer onSendNo;

    private String cargoSkuId;

    private String cargoSkuName;

    private Integer cargoSkuStock;

    private Integer stock;

    private String tplId;

    private Integer saleNum;

    private String supplyPrice;

    private String retailPrice;

    private Integer limitNum;

    private String limitUnit;

    private String limitFlg;

    private GoodPromotionalInfoVo promotionalInfo;

    private String skuValue;

    private ImageVo coverImg;

    public String getLimitUnit() {
        return limitUnit;
    }

    public void setLimitUnit(String limitUnit) {
        this.limitUnit = limitUnit;
    }

    private List<CargoSkuSupplyPriceVo> supplyPriceList;

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

    public String getTplId() {
        return tplId;
    }

    public void setTplId(String tplId) {
        this.tplId = tplId;
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

    public String getCargoSkuId() {
        return cargoSkuId;
    }

    public void setCargoSkuId(String cargoSkuId) {
        this.cargoSkuId = cargoSkuId;
    }

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public String getSupplyPrice() {
        return supplyPrice;
    }

    public void setSupplyPrice(String supplyPrice) {
        this.supplyPrice = supplyPrice;
    }

    public GoodPromotionalInfoVo getPromotionalInfo() {
        return promotionalInfo;
    }

    public void setPromotionalInfo(GoodPromotionalInfoVo promotionalInfo) {
        this.promotionalInfo = promotionalInfo;
    }

    public String getSkuValue() {
        return skuValue;
    }

    public void setSkuValue(String skuValue) {
        this.skuValue = skuValue;
    }

    public String getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(String retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getMulNumFlag() {
        return mulNumFlag;
    }

    public void setMulNumFlag(String mulNumFlag) {
        this.mulNumFlag = mulNumFlag;
    }

    public List<CargoSkuSupplyPriceVo> getSupplyPriceList() {
        return supplyPriceList;
    }

    public void setSupplyPriceList(List<CargoSkuSupplyPriceVo> supplyPriceList) {
        this.supplyPriceList = supplyPriceList;
    }

    public Integer getCargoSkuStock() {
        return cargoSkuStock;
    }

    public void setCargoSkuStock(Integer cargoSkuStock) {
        this.cargoSkuStock = cargoSkuStock;
    }

    public ImageVo getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(ImageVo coverImg) {
        this.coverImg = coverImg;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public static PurchaseGoodsSkuVo fromPurchaseGoodsSku(PurchaseGoodsSku sku) {
        PurchaseGoodsSkuVo vo = new PurchaseGoodsSkuVo();
        vo.setId(sku.getId());
        vo.setPurGoodsId(sku.getPurGoodsId());
        vo.setMarketPrice(sku.getMarketPrice());
        vo.setMarketUnit(sku.getMarketUnit());
        vo.setPackingSettingId(sku.getPackingSettingId());
        vo.setStartNum(sku.getStartNum());
        vo.setOrderIndex(sku.getOrderIndex());
        vo.setCreateTime(sku.getCreateTime());
        vo.setNums(sku.getNums());
        vo.setOnSalesNo(sku.getOnSalesNo() == null ? 0 : sku.getOnSalesNo());
        vo.setOnPayNo(sku.getOnPayNo());
        vo.setOnSendNo(sku.getOnSendNo());
        vo.setCargoSkuId(sku.getCargoSkuId() == null ? "" : sku.getCargoSkuId().toString());
        vo.setCargoSkuName(sku.getCargoSkuName());
        vo.setSaleNum(sku.getSaleNum() == null ? 0 : sku.getSaleNum());
        return vo;
    }
}
