package pub.makers.shop.purchaseGoods.vo;

import org.apache.commons.lang.StringUtils;
import pub.makers.shop.cargo.entity.CargoBasePropertys;
import pub.makers.shop.cargo.entity.vo.CargoSkuTypeVo;
import pub.makers.shop.cargo.entity.vo.ImageGroupVo;
import pub.makers.shop.cargo.vo.CargoBasePropertysVo;
import pub.makers.shop.purchaseGoods.entity.PurchaseGoods;
import pub.makers.shop.purchaseGoods.entity.PurchaseGoodsSample;
import pub.makers.shop.purchaseGoods.entity.PurchaseMaterialAttr;
import pub.makers.shop.tradeGoods.vo.GoodEvaluationVo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by dy on 2017/5/27.
 */
public class PurchaseGoodsVo implements Serializable {


    /**  */
    private String id;

    /** 原料id */
    private String purMaterialId;

    /** 进货分类id */
    private String purClassifyId;

    /**  */
    private String brandId;

    /**  */
    private String supplierId;

    /** 供货价格 */
    private String supplyPrice;

    private String minSupplyPrice;

    private String maxSupplyPrice;

    private String fixedPrice;

    /** 零售价 */
    private String retailPrice;

    /** 进货商品名称 */
    private String purGoodsName;

    private String purGoodsSkuName;
    /**
     * 副标题
     */
    private String purSubtitle;

    /**  */
    private String status;

    /**  */
    private Integer orderIndex;

    /** 创建时间 */
    private Date createTime;

    /** 基础销售 */
    private Integer baseSaleNum;

    /** 商品利润率 */
    private String goodsProfits;

    /** 主题馆 */
    private String theme;

    /**
     * 栏目
     */
    private String category;

    /** 运费规则 */
    private String postid;

    /** 是否有样品 */
    private String isSample;

    /** 进货商品编号 */
    private String purGoodsCode;

    /** 商品简介 */
    private String goodsIntroduction;

    /** 销量 */
    private Integer saleNum;

    /** 货品ID */
    private String cargoId;


    private String label;

    private String groupId;

    private String groupName;

    private String isStore;

    private List<PurchaseGoodsSkuVo> goodSkuVoList;

    private List<String> labelIds;

    private List<String> delTradeGoodsSkuIds;

    private List<PurchaseMaterialAttr> purchaseMaterialAttrList;

    private String freightTplId;

    private PurchaseGoodsSample purchaseGoodsSample;

    private String smallImage; //小图

    private ImageGroupVo showImages; // 展示图片组
    private ImageGroupVo detailImages; // 详情图片组
    private List<GoodEvaluationVo> goodEvaluationList; // 商品评价

    private String saleNumSort; //销量排序属性  0:降序 1:升序

    private String priceSort;   //价格排序字段  0:降序 1:升序

    private String []  purClassifyAttrList;  //属性查询参数

    private String unit;

    private String [] purClassifyIds;

    private int leftNums;

    private Map attrMap;

    private String materialSkuCode; //货品sku编码用于搜索

    private String storeLevelId;

    private String classifyName; //分类名称

    private String brandName; // 品牌名称

    private String flavor;  //香型

    private String flavorDes;

    private String taste;     //滋味

    private String tasteDes;

    private String marketPrice;  //建议市场价

    private String materialName; //原料名称

    private String materialCode; //原料编码

    private String pcDetailInfo; //PC端详情

    private String detailInfo; //详情

    private Integer totalSaleNum; // 总销量

    private String skuId;

    private List<CargoBasePropertys> cargoBasePropertysList;

    private List<CargoSkuTypeVo> skuTypeList; //规格

    private Integer startNum;

    private CargoSkuTypeVo cargoSkuType;

    private PurchaseGoodsSampleVo sample;

    private String isSancha;
    
    private List<String> detailInfoImages;

    private List<CargoBasePropertysVo> basePropertysList;

    private String afterSell;

    private Integer stock;

    public String getAfterSell() {
        return afterSell;
    }

    public void setAfterSell(String afterSell) {
        this.afterSell = afterSell;
    }

    public List<PurchaseMaterialAttr> getPurchaseMaterialAttrList() {
        return purchaseMaterialAttrList;
    }

    public void setPurchaseMaterialAttrList(List<PurchaseMaterialAttr> purchaseMaterialAttrList) {
        this.purchaseMaterialAttrList = purchaseMaterialAttrList;
    }
    public String getIsStore() {
        return isStore;
    }

    public void setIsStore(String isStore) {
        this.isStore = isStore;
    }

    public PurchaseGoodsSample getPurchaseGoodsSample() {
        return purchaseGoodsSample;
    }

    public void setPurchaseGoodsSample(PurchaseGoodsSample purchaseGoodsSample) {
        this.purchaseGoodsSample = purchaseGoodsSample;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPurSubtitle() {
        return purSubtitle;
    }

    public void setPurSubtitle(String purSubtitle) {
        this.purSubtitle = purSubtitle;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<PurchaseGoodsSkuVo> getGoodSkuVoList() {
        return goodSkuVoList;
    }

    public void setGoodSkuVoList(List<PurchaseGoodsSkuVo> goodSkuVoList) {
        this.goodSkuVoList = goodSkuVoList;
    }

    public List<String> getLabelIds() {
        return labelIds;
    }

    public void setLabelIds(List<String> labelIds) {
        this.labelIds = labelIds;
    }

    public List<String> getDelTradeGoodsSkuIds() {
        return delTradeGoodsSkuIds;
    }

    public void setDelTradeGoodsSkuIds(List<String> delTradeGoodsSkuIds) {
        this.delTradeGoodsSkuIds = delTradeGoodsSkuIds;
    }

    public String getFreightTplId() {
        return freightTplId;
    }

    public void setFreightTplId(String freightTplId) {
        this.freightTplId = freightTplId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPurMaterialId() {
        return purMaterialId;
    }

    public void setPurMaterialId(String purMaterialId) {
        this.purMaterialId = purMaterialId;
    }

    public String getPurClassifyId() {
        if (StringUtils.isBlank(this.purClassifyId)) {
            return null;
        }
        return purClassifyId;
    }

    public void setPurClassifyId(String purClassifyId) {
        this.purClassifyId = purClassifyId;
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

    public String getPurGoodsName() {
        return purGoodsName;
    }

    public void setPurGoodsName(String purGoodsName) {
        this.purGoodsName = purGoodsName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Integer getBaseSaleNum() {
        return baseSaleNum;
    }

    public void setBaseSaleNum(Integer baseSaleNum) {
        this.baseSaleNum = baseSaleNum;
    }

    public String getGoodsProfits() {
        return goodsProfits;
    }

    public void setGoodsProfits(String goodsProfits) {
        this.goodsProfits = goodsProfits;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid;
    }

    public String getIsSample() {
        return isSample;
    }

    public void setIsSample(String isSample) {
        this.isSample = isSample;
    }

    public String getPurGoodsCode() {
        return purGoodsCode;
    }

    public void setPurGoodsCode(String purGoodsCode) {
        this.purGoodsCode = purGoodsCode;
    }

    public String getGoodsIntroduction() {
        return goodsIntroduction;
    }

    public void setGoodsIntroduction(String goodsIntroduction) {
        this.goodsIntroduction = goodsIntroduction;
    }

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public String getCargoId() {
        return cargoId;
    }

    public void setCargoId(String cargoId) {
        this.cargoId = cargoId;
    }

    public ImageGroupVo getShowImages() {
        return showImages;
    }

    public void setShowImages(ImageGroupVo showImages) {
        this.showImages = showImages;
    }

    public ImageGroupVo getDetailImages() {
        return detailImages;
    }

    public void setDetailImages(ImageGroupVo detailImages) {
        this.detailImages = detailImages;
    }

    public List<GoodEvaluationVo> getGoodEvaluationList() {
        return goodEvaluationList;
    }

    public void setGoodEvaluationList(List<GoodEvaluationVo> goodEvaluationList) {
        this.goodEvaluationList = goodEvaluationList;
    }

    public String getSaleNumSort() {
        return saleNumSort;
    }

    public void setSaleNumSort(String saleNumSort) {
        this.saleNumSort = saleNumSort;
    }

    public String getPriceSort() {
        return priceSort;
    }

    public void setPriceSort(String priceSort) {
        this.priceSort = priceSort;
    }

    public String[] getPurClassifyAttrList() {
        return purClassifyAttrList;
    }

    public void setPurClassifyAttrList(String[] purClassifyAttrList) {
        this.purClassifyAttrList = purClassifyAttrList;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String[] getPurClassifyIds() {
        return purClassifyIds;
    }

    public void setPurClassifyIds(String[] purClassifyIds) {
        this.purClassifyIds = purClassifyIds;
    }

    public int getLeftNums() {
        return leftNums;
    }

    public void setLeftNums(int leftNums) {
        this.leftNums = leftNums;
    }

    public Map getAttrMap() {
        return attrMap;
    }

    public void setAttrMap(Map attrMap) {
        this.attrMap = attrMap;
    }

    public String getMaterialSkuCode() {
        return materialSkuCode;
    }

    public void setMaterialSkuCode(String materialSkuCode) {
        this.materialSkuCode = materialSkuCode;
    }

    public String getStoreLevelId() {
        return storeLevelId;
    }

    public void setStoreLevelId(String storeLevelId) {
        this.storeLevelId = storeLevelId;
    }

    public String getSmallImage() {
        return smallImage;
    }

    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }

    public String getSupplyPrice() {
        return supplyPrice;
    }

    public void setSupplyPrice(String supplyPrice) {
        this.supplyPrice = supplyPrice;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavorDes() {
        return flavorDes;
    }

    public void setFlavorDes(String flavorDes) {
        this.flavorDes = flavorDes;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getTasteDes() {
        return tasteDes;
    }

    public void setTasteDes(String tasteDes) {
        this.tasteDes = tasteDes;
    }

    public String getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(String marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public String getPcDetailInfo() {
        return pcDetailInfo;
    }

    public void setPcDetailInfo(String pcDetailInfo) {
        this.pcDetailInfo = pcDetailInfo;
    }

    public List<CargoBasePropertys> getCargoBasePropertysList() {
        return cargoBasePropertysList;
    }

    public void setCargoBasePropertysList(List<CargoBasePropertys> cargoBasePropertysList) {
        this.cargoBasePropertysList = cargoBasePropertysList;
    }

    public String getMinSupplyPrice() {
        return minSupplyPrice;
    }

    public void setMinSupplyPrice(String minSupplyPrice) {
        this.minSupplyPrice = minSupplyPrice;
    }

    public String getMaxSupplyPrice() {
        return maxSupplyPrice;
    }

    public void setMaxSupplyPrice(String maxSupplyPrice) {
        this.maxSupplyPrice = maxSupplyPrice;
    }

    public String getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(String retailPrice) {
        this.retailPrice = retailPrice;
    }

    public List<CargoSkuTypeVo> getSkuTypeList() {
        return skuTypeList;
    }

    public void setSkuTypeList(List<CargoSkuTypeVo> skuTypeList) {
        this.skuTypeList = skuTypeList;
    }

    public String getFixedPrice() {
        return fixedPrice;
    }

    public void setFixedPrice(String fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    public Integer getTotalSaleNum() {
        return totalSaleNum;
    }

    public void setTotalSaleNum(Integer totalSaleNum) {
        this.totalSaleNum = totalSaleNum;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public Integer getStartNum() {
        return startNum;
    }

    public void setStartNum(Integer startNum) {
        this.startNum = startNum;
    }

    public String getPurGoodsSkuName() {
        return purGoodsSkuName;
    }

    public void setPurGoodsSkuName(String purGoodsSkuName) {
        this.purGoodsSkuName = purGoodsSkuName;
    }

    public String getDetailInfo() {
        return detailInfo;
    }

    public void setDetailInfo(String detailInfo) {
        this.detailInfo = detailInfo;
    }

    public CargoSkuTypeVo getCargoSkuType() {
        return cargoSkuType;
    }

    public void setCargoSkuType(CargoSkuTypeVo cargoSkuType) {
        this.cargoSkuType = cargoSkuType;
    }

    public PurchaseGoodsSampleVo getSample() {
        return sample;
    }

    public void setSample(PurchaseGoodsSampleVo sample) {
        this.sample = sample;
    }

    public String getIsSancha() {
        return isSancha;
    }

    public void setIsSancha(String isSancha) {
        this.isSancha = isSancha;
    }
    
    

    public List<String> getDetailInfoImages() {
		return detailInfoImages;
	}

	public void setDetailInfoImages(List<String> detailInfoImages) {
		this.detailInfoImages = detailInfoImages;
	}

    public List<CargoBasePropertysVo> getBasePropertysList() {
        return basePropertysList;
    }

    public void setBasePropertysList(List<CargoBasePropertysVo> basePropertysList) {
        this.basePropertysList = basePropertysList;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public static PurchaseGoodsVo fromPurchaseGoods(PurchaseGoods goods) {
        PurchaseGoodsVo vo = new PurchaseGoodsVo();
        vo.setId(goods.getId());
        vo.setPurClassifyId(goods.getPurClassifyId());
        vo.setCargoId(goods.getCargoId() == null ? null : goods.getCargoId().toString());
        vo.setBrandId(goods.getBrandId());
        vo.setPurGoodsName(goods.getPurGoodsName());
        vo.setGoodsProfits(goods.getGoodsProfits());
        vo.setTheme(goods.getTheme());
        vo.setIsSample(goods.getIsSample());
        vo.setPostid(goods.getPostid());
        vo.setStatus(goods.getStatus());
        Integer baseSaleNum = goods.getBaseSaleNum() == null ? 0 : goods.getBaseSaleNum();
        Integer saleNum = goods.getSaleNum() == null ? 0 : goods.getSaleNum();
        vo.setSaleNum(saleNum);
        vo.setBaseSaleNum(baseSaleNum);
        vo.setTotalSaleNum(baseSaleNum + saleNum);
        vo.setOrderIndex(goods.getOrderIndex());
        vo.setGoodsIntroduction(goods.getGoodsIntroduction());
        vo.setGroupId(goods.getGroupId());
        vo.setPurSubtitle(goods.getPurSubtitle());
        return vo;
    }
}
