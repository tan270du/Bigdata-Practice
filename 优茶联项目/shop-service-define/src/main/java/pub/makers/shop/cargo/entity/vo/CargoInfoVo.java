package pub.makers.shop.cargo.entity.vo;

import pub.makers.shop.cargo.entity.*;
import pub.makers.shop.tradeGoods.vo.TradeGiftRuleVo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dy on 2017/5/24.
 */
public class CargoInfoVo implements Serializable {

    private String id;
    private String brandId;
    private String supplierId;
    private String name;
    private String cargoNo;
    private String freightTplId;
    private ImageGroupVo mobileSwiperImgs;
    private ImageGroupVo pcSwiperImgs;
    private String mobileDetailInfo;
    private String pcDetailInfo;
    private String afterSell;
    private String volume;
    private String weight;
    private String isSancha;
    private String cargoType;
    private String volumeUnit;
    private String weightUnit;

    private List<CargoClassifySampleVo> classifyList;
    private List<CargoBasePropertys> cargoBasePropertyses;
    private List<CargoSkuTypeVo> cargoSkuTypes;
    private List<CargoSkuVo> cargoSkus;
    private List<TradeGiftRuleVo> giftGoods;

    public String getVolumeUnit() {
        return volumeUnit;
    }

    public void setVolumeUnit(String volumeUnit) {
        this.volumeUnit = volumeUnit;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }
    public String getIsSancha() {
        return isSancha;
    }

    public void setIsSancha(String isSancha) {
        this.isSancha = isSancha;
    }

    public String getAfterSell() {
        return afterSell;
    }

    public void setAfterSell(String afterSell) {
        this.afterSell = afterSell;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCargoNo() {
        return cargoNo;
    }

    public void setCargoNo(String cargoNo) {
        this.cargoNo = cargoNo;
    }

    public String getFreightTplId() {
        return freightTplId;
    }

    public void setFreightTplId(String freightTplId) {
        this.freightTplId = freightTplId;
    }

    public ImageGroupVo getMobileSwiperImgs() {
        return mobileSwiperImgs;
    }

    public void setMobileSwiperImgs(ImageGroupVo mobileSwiperImgs) {
        this.mobileSwiperImgs = mobileSwiperImgs;
    }

    public ImageGroupVo getPcSwiperImgs() {
        return pcSwiperImgs;
    }

    public void setPcSwiperImgs(ImageGroupVo pcSwiperImgs) {
        this.pcSwiperImgs = pcSwiperImgs;
    }

    public List<TradeGiftRuleVo> getGiftGoods() {
        return giftGoods;
    }

    public void setGiftGoods(List<TradeGiftRuleVo> giftGoods) {
        this.giftGoods = giftGoods;
    }

    public String getMobileDetailInfo() {
        return mobileDetailInfo;
    }

    public void setMobileDetailInfo(String mobileDetailInfo) {
        this.mobileDetailInfo = mobileDetailInfo;
    }

    public String getPcDetailInfo() {
        return pcDetailInfo;
    }

    public void setPcDetailInfo(String pcDetailInfo) {
        this.pcDetailInfo = pcDetailInfo;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public List<CargoClassifySampleVo> getClassifyList() {
        return classifyList;
    }

    public void setClassifyList(List<CargoClassifySampleVo> classifyList) {
        this.classifyList = classifyList;
    }

    public List<CargoBasePropertys> getCargoBasePropertyses() {
        return cargoBasePropertyses;
    }

    public void setCargoBasePropertyses(List<CargoBasePropertys> cargoBasePropertyses) {
        this.cargoBasePropertyses = cargoBasePropertyses;
    }

    public List<CargoSkuTypeVo> getCargoSkuTypes() {
        return cargoSkuTypes;
    }

    public void setCargoSkuTypes(List<CargoSkuTypeVo> cargoSkuTypes) {
        this.cargoSkuTypes = cargoSkuTypes;
    }

    public List<CargoSkuVo> getCargoSkus() {
        return cargoSkus;
    }

    public void setCargoSkus(List<CargoSkuVo> cargoSkus) {
        this.cargoSkus = cargoSkus;
    }
}
