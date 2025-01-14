package pub.makers.shop.baseGood.vo;

import pub.makers.shop.cargo.vo.CargoSkuSupplyPriceVo;
import pub.makers.shop.promotion.vo.GoodPromotionalInfoVo;
import pub.makers.shop.purchaseGoods.entity.PurchaseGoods;
import pub.makers.shop.purchaseGoods.entity.PurchaseGoodsSku;
import pub.makers.shop.store.vo.ImageVo;
import pub.makers.shop.tradeGoods.entity.TradeGiftRule;
import pub.makers.shop.tradeGoods.entity.TradeGood;
import pub.makers.shop.tradeGoods.entity.TradeGoodSku;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

/**
 * Created by kok on 2017/6/14.
 */
public class BaseGoodVo implements Serializable {
    private String id;
    private String name;
    private String skuId;
    private String skuName;
    private String cargoSkuId;
    private String cargoSkuName;
    private BigDecimal supplyPrice;
    private BigDecimal originalPrice;
    private BigDecimal price;
    private Integer saleNum;
    private ImageVo image;
    private Integer onSalesNo;
    private Integer cargoSkuStock;
    private Integer stock;
    private String label;
    private Integer startNum;
    private String mulNumFlag;
    private String isSancha;
    private String isSample;
    private String status;
    private String classifyIds;
    private GoodPromotionalInfoVo promotionalInfo;
    private List<CargoSkuSupplyPriceVo> supplyPriceList;

    private List<TradeGiftRule> giftRuleList;

    private Integer number;

    private List<String> tag2Set; //促销标签

    public List<String> getTag2Set() {
        return tag2Set;
    }

    public void setTag2Set(List<String> tag2Set) {
        this.tag2Set = tag2Set;
    }

    public String getIsSample() {
        return isSample;
    }

    public void setIsSample(String isSample) {
        this.isSample = isSample;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public ImageVo getImage() {
        return image;
    }

    public void setImage(ImageVo image) {
        this.image = image;
    }

    public Integer getOnSalesNo() {
        return onSalesNo;
    }

    public void setOnSalesNo(Integer onSalesNo) {
        this.onSalesNo = onSalesNo;
    }

    public GoodPromotionalInfoVo getPromotionalInfo() {
        return promotionalInfo;
    }

    public void setPromotionalInfo(GoodPromotionalInfoVo promotionalInfo) {
        this.promotionalInfo = promotionalInfo;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public List<TradeGiftRule> getGiftRuleList() {
        return giftRuleList;
    }

    public void setGiftRuleList(List<TradeGiftRule> giftRuleList) {
        this.giftRuleList = giftRuleList;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getStartNum() {
        return startNum;
    }

    public void setStartNum(Integer startNum) {
        this.startNum = startNum;
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

    public String getIsSancha() {
        return isSancha;
    }

    public void setIsSancha(String isSancha) {
        this.isSancha = isSancha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getCargoSkuId() {
        return cargoSkuId;
    }

    public void setCargoSkuId(String cargoSkuId) {
        this.cargoSkuId = cargoSkuId;
    }

    public String getCargoSkuName() {
        return cargoSkuName;
    }

    public void setCargoSkuName(String cargoSkuName) {
        this.cargoSkuName = cargoSkuName;
    }

    public String getClassifyIds() {
        return classifyIds;
    }

    public void setClassifyIds(String classifyIds) {
        this.classifyIds = classifyIds;
    }

    public BigDecimal getSupplyPrice() {
        return supplyPrice;
    }

    public void setSupplyPrice(BigDecimal supplyPrice) {
        this.supplyPrice = supplyPrice;
    }

    public BaseGoodVo complete(PurchaseGoods goods) {
        this.setId(goods.getId());
        this.setName(goods.getPurGoodsName());
        Integer baseSale = goods.getBaseSaleNum() == null ? 0 : goods.getBaseSaleNum();
        Integer saleNum = goods.getSaleNum() == null ? 0 : goods.getSaleNum();
        this.setSaleNum(baseSale + saleNum);
        return this;
    }

    public BaseGoodVo complete(PurchaseGoodsSku sku) {
        this.setSkuId(sku.getId());
        this.setSkuName(sku.getCargoSkuName());
        this.setOnSalesNo(sku.getOnSalesNo() == null ? 0 : sku.getOnSalesNo());
        this.setCargoSkuId(sku.getCargoSkuId().toString());
        this.setCargoSkuName(sku.getCargoSkuName());
        return this;
    }

    public BaseGoodVo complete(TradeGood good) {
        this.setId(good.getId().toString());
        this.setName(good.getName());
        Integer baseSale = good.getBaseSale() == null ? 0 : good.getBaseSale();
        Integer saleNum = good.getSaleNum() == null ? 0 : good.getSaleNum();
        this.setSaleNum(baseSale + saleNum);
        return this;
    }

    public BaseGoodVo complete(TradeGoodSku sku) {
        this.setSkuId(sku.getId().toString());
        this.setSkuName(sku.getCargoSkuName());
        this.setOnSalesNo(sku.getOnSalesNo() == null ? 0 : sku.getOnSalesNo());
        this.setCargoSkuId(sku.getCargoSkuId().toString());
        this.setCargoSkuName(sku.getCargoSkuName());
        return this;
    }
}
