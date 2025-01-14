package pub.makers.shop.cargo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by dy on 2017/4/15.
 */
public class CargoSku implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4916625280981745105L;

	private Long id;

    private Long cargoId;

    private String name;

    private String skuName;

    private String skuValue;

    private String coverImg;

    private String memo;

    private String barCode;

    private String code;

    private BigDecimal fixedPrice;

    private BigDecimal jmsDeliveryPrice;

    private BigDecimal lmsDeliveryPrice;

    private BigDecimal retailPrice;

    private BigDecimal ygDeliveryPrice;

    private BigDecimal zyDeliveryPrice;

    private BigDecimal price;

    private Date createTime;

    private Long createBy;

    private Date updateTime;

    private Long updateBy;

    private String skuItemName;

    private String skuItemValue;

    List<CargoSkuSupplyPrice> skuSupplyPrices;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkuValue() {
        return skuValue;
    }

    public void setSkuValue(String skuValue) {
        this.skuValue = skuValue;
    }

    public List<CargoSkuSupplyPrice> getSkuSupplyPrices() {
        return skuSupplyPrices;
    }

    public void setSkuSupplyPrices(List<CargoSkuSupplyPrice> skuSupplyPrices) {
        this.skuSupplyPrices = skuSupplyPrices;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public BigDecimal getFixedPrice() {
        return fixedPrice;
    }

    public void setFixedPrice(BigDecimal fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    public BigDecimal getJmsDeliveryPrice() {
        return jmsDeliveryPrice;
    }

    public void setJmsDeliveryPrice(BigDecimal jmsDeliveryPrice) {
        this.jmsDeliveryPrice = jmsDeliveryPrice;
    }

    public BigDecimal getLmsDeliveryPrice() {
        return lmsDeliveryPrice;
    }

    public void setLmsDeliveryPrice(BigDecimal lmsDeliveryPrice) {
        this.lmsDeliveryPrice = lmsDeliveryPrice;
    }

    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    public BigDecimal getYgDeliveryPrice() {
        return ygDeliveryPrice;
    }

    public void setYgDeliveryPrice(BigDecimal ygDeliveryPrice) {
        this.ygDeliveryPrice = ygDeliveryPrice;
    }

    public BigDecimal getZyDeliveryPrice() {
        return zyDeliveryPrice;
    }

    public void setZyDeliveryPrice(BigDecimal zyDeliveryPrice) {
        this.zyDeliveryPrice = zyDeliveryPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCargoId() {
        return cargoId;
    }

    public void setCargoId(Long cargoId) {
        this.cargoId = cargoId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public String getSkuItemName() {
        return skuItemName;
    }

    public void setSkuItemName(String skuItemName) {
        this.skuItemName = skuItemName;
    }

    public String getSkuItemValue() {
        return skuItemValue;
    }

    public void setSkuItemValue(String skuItemValue) {
        this.skuItemValue = skuItemValue;
    }
}
