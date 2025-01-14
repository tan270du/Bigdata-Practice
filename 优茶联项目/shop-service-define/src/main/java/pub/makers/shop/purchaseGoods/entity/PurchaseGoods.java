package pub.makers.shop.purchaseGoods.entity;

import java.io.Serializable;
import java.util.Date;

public class PurchaseGoods implements Serializable{
	private static final long serialVersionUID = 1L;
	
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
	
	/** 进货商品名称 */
	private String purGoodsName;

	/**
	 * 副标题
	 */
	private String purSubtitle;

	/**
	 * 商品分类ID
	 */
	private String groupId;


	/**
	 * 商品分类名称
	 */
	private String groupName;


	/**  */
	private String status;		
	
	/**  */
	private Integer orderIndex;		
	
	/** 创建时间 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;
	
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

	/** 商品id */
	private Long cargoId;

	/**
	 * 商品标签
	 */
	private String label;

	private String isStore;     //是否加入仓库

	private String classifyValid;

	public String getIsStore() {
		return isStore;
	}

	public void setIsStore(String isStore) {
		this.isStore = isStore;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public String getPurSubtitle() {
		return purSubtitle;
	}

	public void setPurSubtitle(String purSubtitle) {
		this.purSubtitle = purSubtitle;
	}

	public void setId(String id){
		this.id = id;
	}
	
	public String getId(){
		return id;
	}
	
	public void setPurMaterialId(String purMaterialId){
		this.purMaterialId = purMaterialId;
	}
	
	public String getPurMaterialId(){
		return purMaterialId;
	}
	
	public void setPurClassifyId(String purClassifyId){
		this.purClassifyId = purClassifyId;
	}
	
	public String getPurClassifyId(){
		return purClassifyId;
	}
	
	public void setBrandId(String brandId){
		this.brandId = brandId;
	}
	
	public String getBrandId(){
		return brandId;
	}
	
	public void setSupplierId(String supplierId){
		this.supplierId = supplierId;
	}
	
	public String getSupplierId(){
		return supplierId;
	}
	
	public void setPurGoodsName(String purGoodsName){
		this.purGoodsName = purGoodsName;
	}
	
	public String getPurGoodsName(){
		return purGoodsName;
	}
	
	public void setStatus(String status){
		this.status = status;
	}
	
	public String getStatus(){
		return status;
	}
	
	public void setOrderIndex(Integer orderIndex){
		this.orderIndex = orderIndex;
	}
	
	public Integer getOrderIndex(){
		return orderIndex;
	}
	
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
	
	public Date getCreateTime(){
		return createTime;
	}
	
	public void setBaseSaleNum(Integer baseSaleNum){
		this.baseSaleNum = baseSaleNum;
	}
	
	public Integer getBaseSaleNum(){
		return baseSaleNum;
	}
	
	public void setGoodsProfits(String goodsProfits){
		this.goodsProfits = goodsProfits;
	}
	
	public String getGoodsProfits(){
		return goodsProfits;
	}
	
	public void setTheme(String theme){
		this.theme = theme;
	}
	
	public String getTheme(){
		return theme;
	}
	
	public void setPostid(String postid){
		this.postid = postid;
	}
	
	public String getPostid(){
		return postid;
	}
	
	public void setIsSample(String isSample){
		this.isSample = isSample;
	}
	
	public String getIsSample(){
		return isSample;
	}
	
	public void setPurGoodsCode(String purGoodsCode){
		this.purGoodsCode = purGoodsCode;
	}
	
	public String getPurGoodsCode(){
		return purGoodsCode;
	}
	
	public void setGoodsIntroduction(String goodsIntroduction){
		this.goodsIntroduction = goodsIntroduction;
	}
	
	public String getGoodsIntroduction(){
		return goodsIntroduction;
	}
	
	public void setSaleNum(Integer saleNum){
		this.saleNum = saleNum;
	}
	
	public Integer getSaleNum(){
		return saleNum;
	}

	public Long getCargoId() {
		return cargoId;
	}

	public void setCargoId(Long cargoId) {
		this.cargoId = cargoId;
	}

	public String getClassifyValid() {
		return classifyValid;
	}

	public void setClassifyValid(String classifyValid) {
		this.classifyValid = classifyValid;
	}
}
