package pub.makers.shop.tradeOrder.entity;

import org.apache.commons.lang.StringUtils;
import pub.makers.shop.baseOrder.pojo.BaseOrderItem;
import pub.makers.shop.tradeOrder.vo.IndentListVo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class IndentList extends BaseOrderItem{
	private static final long serialVersionUID = 1L;
	
	/** ID */
	private Long id;		
	
	/** 订单ID */
	private Long indentId;		
	
	/** 商品SkuID */
	private Long tradeGoodSkuId;

	/** 商品ID */
	private Long tradeGoodId;
	
	/** 数量 */
	private Integer number;		
	
	/** 成交价 */
	private BigDecimal finalAmount;

	/**
	 * 优惠金额
	 */
	private BigDecimal discountAmount;
	
	/** 商品名称 */
	private String tradeGoodName;		
	
	/** 商品缩略图URL */
	private String tradeGoodImgUrl;		
	
	/** 商品原价 */
	private BigDecimal tradeGoodAmount;		
	
	/** 商品规格 */
	private String tradeGoodType;		
	
	/** 供货价 */
	private BigDecimal supplyPrice;		
	
	/** 货品skuId */
	private String cargoSkuId;	
	
	/** 赠品标识 */
	private String giftFlag;

	private String cargoNo;

	private String isPur;

	private String isSample;

	/**
	 * 订单商品状态
	 */
	private String status;

	/**
	 * 发货前申请售后次数
	 */
	private Integer shipReturnTime;

	/**
	 * 发货后申请售后次数
	 */
	private Integer returnTime;

	/**
	 * 原价
	 */
	private BigDecimal originalAmount;

	/**
	 * 创建时间
	 */
	private Date dateCreated;

	/**
	 * 更新时间
	 */
	private Date lastUpdated;

	/**
	 * 是否有效
	 */
	private String isValid;

	/**
	 * 删除状态
	 */
	private String delFlag;

	private BigDecimal returnAmount;

	private Integer isEvalution;// 是否评论 0 否  1是

	private String shipCancelAfter; //发货前撤销售后申请
	private String receiveCancelAfter; //发货后撤销售后申请
	private String goodType; //商品类型

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(Integer returnTime) {
		this.returnTime = returnTime;
	}

	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getIsSample() {
		return isSample;
	}

	@Override
	public void setMessageList(List<String> messageList) {

	}

	public void setIsSample(String isSample) {
		this.isSample = isSample;
	}

	public String getCargoNo() {
		return cargoNo;
	}

	public void setCargoNo(String cargoNo) {
		this.cargoNo = cargoNo;
	}

	public String getIsPur() {
		return isPur;
	}

	public void setIsPur(String isPur) {
		this.isPur = isPur;
	}

	public void setId(Long id){
		this.id = id;
	}
	
	public Long getId(){
		return id;
	}
	
	public void setIndentId(Long indentId){
		this.indentId = indentId;
	}
	
	public Long getIndentId(){
		return indentId;
	}
	
	public void setTradeGoodSkuId(Long tradeGoodSkuId){
		this.tradeGoodSkuId = tradeGoodSkuId;
	}
	
	public Long getTradeGoodSkuId(){
		return tradeGoodSkuId;
	}
	
	public void setNumber(Integer number){
		this.number = number;
	}
	
	public Integer getNumber(){
		return number;
	}
	
	public void setFinalAmount(BigDecimal finalAmount){
		this.finalAmount = finalAmount;
	}
	
	public BigDecimal getFinalAmount(){
		return finalAmount;
	}
	
	public void setTradeGoodName(String tradeGoodName){
		this.tradeGoodName = tradeGoodName;
	}
	
	public String getTradeGoodName(){
		return tradeGoodName;
	}
	
	public void setTradeGoodImgUrl(String tradeGoodImgUrl){
		this.tradeGoodImgUrl = tradeGoodImgUrl;
	}
	
	public String getTradeGoodImgUrl(){
		return tradeGoodImgUrl;
	}
	
	public void setTradeGoodAmount(BigDecimal tradeGoodAmount){
		this.tradeGoodAmount = tradeGoodAmount;
	}
	
	public BigDecimal getTradeGoodAmount(){
		return tradeGoodAmount;
	}
	
	public void setTradeGoodType(String tradeGoodType){
		this.tradeGoodType = tradeGoodType;
	}
	
	public String getTradeGoodType(){
		return tradeGoodType;
	}
	
	public void setSupplyPrice(BigDecimal supplyPrice){
		this.supplyPrice = supplyPrice;
	}
	
	public BigDecimal getSupplyPrice(){
		return supplyPrice;
	}
	
	public void setCargoSkuId(String cargoSkuId){
		this.cargoSkuId = cargoSkuId;
	}
	
	public String getCargoSkuId(){
		return cargoSkuId;
	}
	
	public String getGiftFlag() {
		return giftFlag;
	}

	public void setGiftFlag(String giftFlag) {
		this.giftFlag = giftFlag;
	}

	public BigDecimal getOriginalAmount() {
		return originalAmount;
	}

	public void setOriginalAmount(BigDecimal originalAmount) {
		this.originalAmount = originalAmount;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getIsValid() {
		return isValid;
	}

	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	public BigDecimal getReturnAmount() {
		return returnAmount;
	}

	public void setReturnAmount(BigDecimal returnAmount) {
		this.returnAmount = returnAmount;
	}

	public Long getTradeGoodId() {
		return tradeGoodId;
	}

	public void setTradeGoodId(Long tradeGoodId) {
		this.tradeGoodId = tradeGoodId;
	}

	public Integer getIsEvalution() {
		return isEvalution;
	}

	public void setIsEvalution(Integer isEvalution) {
		this.isEvalution = isEvalution;
	}

	public Integer getShipReturnTime() {
		return shipReturnTime;
	}

	public void setShipReturnTime(Integer shipReturnTime) {
		this.shipReturnTime = shipReturnTime;
	}

	public String getGoodType() {
		return goodType;
	}

	@Override
	public void setSumAmount(BigDecimal sumAmount) {

	}

	@Override
	public BigDecimal getSumAmount() {
		return null;
	}

	public void setGoodType(String goodType) {
		this.goodType = goodType;
	}

	public static IndentList fromIndentListVo(IndentListVo vo){
		
		IndentList target = new IndentList();
		target.setId(getLong(vo.getId()));
		target.setIndentId(getLong(vo.getIndentId()));
		target.setTradeGoodSkuId(getLong(vo.getTradeGoodSkuId()));
		target.setTradeGoodId(getLong(vo.getTradeGoodId()));
		target.setCargoSkuId(vo.getCargoSkuId());
		target.setNumber(vo.getNumber());
		target.setFinalAmount(getBD(vo.getFinalAmount()));
		target.setTradeGoodName(vo.getTradeGoodName());
		target.setTradeGoodAmount(getBD(vo.getTradeGoodAmount()));
		target.setSupplyPrice(getBD(vo.getSupplyPrice()));
		target.setTradeGoodType(vo.getTradeGoodType());
		target.setGiftFlag(vo.getGiftFlag());
		target.setTradeGoodImgUrl(vo.getTradeGoodImgUrl());
		target.setStatus(vo.getStatus());
		target.setOriginalAmount(getBD(vo.getOriginalAmount()));
		target.setDateCreated(vo.getDateCreated());
		target.setLastUpdated(vo.getLastUpdated());
		target.setIsValid(vo.getIsValid());
		target.setDelFlag(vo.getDelFlag());
		target.setShipReturnTime(vo.getShipReturnTime());
		target.setReturnTime(vo.getReturnTime());
		target.setShipCancelAfter(vo.getShipCancelAfter());
		target.setReceiveCancelAfter(vo.getReceiveCancelAfter());
		target.setIsEvalution(vo.getIsEvalution());
		target.setGoodType(vo.getGoodType());
		target.setDiscountAmount(vo.getDiscountAmount());
		return target;
	}
	
	private static Long getLong(String s){
		
		Long result = 0L;
		if (StringUtils.isNotBlank(s)){
			result = Long.valueOf(s);
		}
		
		return result;
	}
	
	private static BigDecimal getBD(String s){
		BigDecimal result = null;
		if (StringUtils.isNotBlank(s)){
			result = new BigDecimal(s);
		}
		
		return result;
	}

	public String getShipCancelAfter() {
		return shipCancelAfter;
	}

	public void setShipCancelAfter(String shipCancelAfter) {
		this.shipCancelAfter = shipCancelAfter;
	}

	public String getReceiveCancelAfter() {
		return receiveCancelAfter;
	}

	public void setReceiveCancelAfter(String receiveCancelAfter) {
		this.receiveCancelAfter = receiveCancelAfter;
	}

	@Override
	public void setId(String id) {
		String[] ids = id.split(",");
		if (ids.length > 0) {
			this.id = Long.valueOf(ids[0]);
		}
	}

	@Override
	public String getItemId() {
		return id == null ? null : id.toString();
	}

	@Override
	public String getGoodSkuId() {
		return tradeGoodSkuId + "";
	}

	@Override
	public int getBuyNum() {
		return number;
	}

	@Override
	public void setBuyNum(int num) {
		
		this.number = num;
	}

	@Override
	public void setGoodSkuId(String skuId) {
		tradeGoodSkuId = Long.valueOf(skuId);
	}

	@Override
	public String getGoodName() {
		return this.tradeGoodName;
	}

	@Override
	public BigDecimal getGoodPrice() {
		
		return tradeGoodAmount;
	}

	@Override
	public void setGoodPrice(BigDecimal goodPrice) {
		this.tradeGoodAmount = goodPrice;
	}

	@Override
	public void setWaitPayAmont(BigDecimal amount) {
		finalAmount = amount;
	}

	@Override
	public BigDecimal getWaitPayAmont() {
		
		return finalAmount;
	}

}
