package pub.makers.shop.tradeOrder.vo;

import org.apache.commons.lang.StringUtils;
import pub.makers.shop.afterSale.enums.OrderFlowStatus;
import pub.makers.shop.afterSale.vo.OrderItemAsFlowVo;
import pub.makers.shop.baseOrder.pojo.BaseOrderItem;
import pub.makers.shop.baseOrder.vo.OrderListPresellExtraVo;
import pub.makers.shop.tradeGoods.vo.TradeGoodSkuVo;
import pub.makers.shop.tradeOrder.enums.IndentListStatus;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 订单条目Vo
 * @author zhuzd
 *
 */
public class IndentListVo extends BaseOrderItem implements Cloneable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

    private String indentId;

    private String tradeGoodSkuId;

	private String tradeGoodId;

    private String cargoSkuId;

    private TradeGoodSkuVo tradeGoodSku;
    
    private Integer number;

	private Integer goodNum;

    private String finalAmount;

    private String tradeGoodName;

    private String tradeGoodImgUrl;

    private String tradeGoodAmount;
    
    private String supplyPrice;

    private String tradeGoodType;  //规格汇总
    
    private String cargoNo;
    
    private BigDecimal totalAmount;
    
    /** 赠品标识 */
	private String giftFlag;

	private String isPur;

	private String isSample;

	private String isLoose;

	private String remark;

	private Float sampleNum;

	/**
	 * 订单商品状态
	 */
	private String status;

	private String statusStr;

	/**
	 * 优惠金额
	 */
	private BigDecimal discountAmount;

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
	private String originalAmount;

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

	/**
	 * 售后状态
	 */
	private String flowStatus;

	private String flowStatusStr;

	private String flowType;

	private String skuName;
	private String cargoSkuName;

	private BigDecimal presellFirst;
	private BigDecimal presellEnd;
	private BigDecimal presellAmount;
	private String presllType;
	private OrderListPresellExtraVo presellExtra; //预售信息


	private List<OrderItemAsFlowVo> flowList; // 售后信息

	private String indentName;

	private String shipCancelAfter; //发货前撤销售后申请
	private String receiveCancelAfter; //发货后撤销售后申请

	private String retailPrice;

	private BigDecimal goodAmount;

	private BigDecimal totalFinalAmount;

	private Integer isEvalution;// 是否评论 0 否  1是
	private String goodType; //商品类型

	private List<String> messageList; //消息列表

	public BigDecimal getTotalFinalAmount() {
		return totalFinalAmount;
	}

	public void setTotalFinalAmount(BigDecimal totalFinalAmount) {
		this.totalFinalAmount = totalFinalAmount;
	}

	public BigDecimal getGoodAmount() {
		return goodAmount;
	}

	public void setGoodAmount(BigDecimal goodAmount) {
		this.goodAmount = goodAmount;
	}

	public String getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(String retailPrice) {
		this.retailPrice = retailPrice;
	}

	public String getCargoSkuName() {
		return cargoSkuName;
	}

	public void setCargoSkuName(String cargoSkuName) {
		this.cargoSkuName = cargoSkuName;
	}

	public String getIndentName() {
		return indentName;
	}

	public void setIndentName(String indentName) {
		this.indentName = indentName;
	}

	public BigDecimal getPresellFirst() {
		return presellFirst;
	}

	public void setPresellFirst(BigDecimal presellFirst) {
		this.presellFirst = presellFirst;
	}

	public BigDecimal getPresellEnd() {
		return presellEnd;
	}

	public void setPresellEnd(BigDecimal presellEnd) {
		this.presellEnd = presellEnd;
	}

	public BigDecimal getPresellAmount() {
		return presellAmount;
	}

	public void setPresellAmount(BigDecimal presellAmount) {
		this.presellAmount = presellAmount;
	}

	public String getPresllType() {
		return presllType;
	}

	public void setPresllType(String presllType) {
		this.presllType = presllType;
	}

	public String getSkuName() {
		return skuName;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public String getFlowType() {
		return flowType;
	}

	public void setFlowType(String flowType) {
		this.flowType = flowType;
	}

	public String getFlowStatusStr() {
		if (StringUtils.isEmpty(this.flowStatusStr) && StringUtils.isNotEmpty(this.flowStatus)) {
			return OrderFlowStatus.valueOf(this.flowStatus).getDisplayName();
		}
		return flowStatusStr;
	}

	public void setFlowStatusStr(String flowStatusStr) {
		this.flowStatusStr = flowStatusStr;
	}

	public String getFlowStatus() {
		return flowStatus;
	}

	public void setFlowStatus(String flowStatus) {
		this.flowStatus = flowStatus;
	}

	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusStr() {

		if (StringUtils.isNotBlank(this.status)) {
			return IndentListStatus.valueOf(this.status.trim()).getDisplayName();
		}
		
		return statusStr;
	}

	public void setStatusStr(String statusStr) {
		this.statusStr = statusStr;
	}

	public Integer getGoodNum() {
		return goodNum;
	}

	public void setGoodNum(Integer goodNum) {
		this.goodNum = goodNum;
	}

	public Float getSampleNum() {
		return sampleNum;
	}

	public void setSampleNum(Float sampleNum) {
		this.sampleNum = sampleNum;
	}

	public String getTradeGoodSkuId() {
		return tradeGoodSkuId;
	}

	public void setTradeGoodSkuId(String tradeGoodSkuId) {
		this.tradeGoodSkuId = tradeGoodSkuId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getItemId() {
		return id;
	}

	public String getIndentId() {
		return indentId;
	}

	public void setIndentId(String indentId) {
		this.indentId = indentId;
	}

	public TradeGoodSkuVo getTradeGoodSku() {
		return tradeGoodSku;
	}

	public void setTradeGoodSku(TradeGoodSkuVo tradeGoodSku) {
		this.tradeGoodSku = tradeGoodSku;
	}

	public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(String finalAmount) {
        this.finalAmount = finalAmount;
    }

    public String getTradeGoodName() {
        return tradeGoodName;
    }

    public void setTradeGoodName(String tradeGoodName) {
        this.tradeGoodName = tradeGoodName == null ? null : tradeGoodName.trim();
    }

    public String getTradeGoodImgUrl() {
        return tradeGoodImgUrl;
    }

    public void setTradeGoodImgUrl(String tradeGoodImgUrl) {
        this.tradeGoodImgUrl = tradeGoodImgUrl == null ? null : tradeGoodImgUrl.trim();
    }

    public String getTradeGoodAmount() {
        return tradeGoodAmount;
    }

    public void setTradeGoodAmount(String tradeGoodAmount) {
        this.tradeGoodAmount = tradeGoodAmount;
    }

    public String getTradeGoodType() {
        return tradeGoodType;
    }

    public void setTradeGoodType(String tradeGoodType) {
        this.tradeGoodType = tradeGoodType == null ? null : tradeGoodType.trim();
    }
	public String getCargoSkuId() {
		return cargoSkuId;
	}

	public void setCargoSkuId(String cargoSkuId) {
		this.cargoSkuId = cargoSkuId;
	}
	public String getSupplyPrice() {
		return supplyPrice;
	}

	public void setSupplyPrice(String supplyPrice) {
		this.supplyPrice = supplyPrice;
	}

	public String getCargoNo() {
		return cargoNo;
	}

	public void setCargoNo(String cargoNo) {
		this.cargoNo = cargoNo;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public boolean isPackage(){
		String tradeGoodSkuID = getTradeGoodSkuId();
		
		return StringUtils.isNotBlank(tradeGoodSkuID) && Long.valueOf(getTradeGoodSkuId()) < 100000000000L;
	}

	public String getGiftFlag() {
		return giftFlag;
	}

	public void setGiftFlag(String giftFlag) {
		this.giftFlag = giftFlag;
	}


	public String getIsPur() {
		return isPur;
	}

	public void setIsPur(String isPur) {
		this.isPur = isPur;
	}

	public String getIsSample() {
		return isSample;
	}

	public void setIsSample(String isSample) {
		this.isSample = isSample;
	}

	public String getIsLoose() {
		return isLoose;
	}

	public void setIsLoose(String isLoose) {
		this.isLoose = isLoose;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getOriginalAmount() {
		return originalAmount;
	}

	public void setOriginalAmount(String originalAmount) {
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

	public Integer getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(Integer returnTime) {
		this.returnTime = returnTime;
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

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof IndentListVo){
			return ((IndentListVo) obj).getTradeGoodSkuId().equals(tradeGoodSkuId);
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		
		return tradeGoodSkuId.hashCode();
	}

	@Override
	public IndentListVo clone() throws CloneNotSupportedException {
		return (IndentListVo) super.clone();
	}

	@Override
	public String getGoodSkuId() {
		return tradeGoodSkuId;
	}

	@Override
	public int getBuyNum() {
		return number;
	}

	@Override
	public BigDecimal getGoodPrice() {
		
		return new BigDecimal(StringUtils.isNotBlank(tradeGoodAmount) ? tradeGoodAmount : "0");
	}

	@Override
	public void setGoodPrice(BigDecimal goodPrice) {
		this.tradeGoodAmount = goodPrice == null ? "" : goodPrice.toString();
	}

	@Override
	public void setWaitPayAmont(BigDecimal amount) {
		
		this.finalAmount = amount.setScale(2, BigDecimal.ROUND_DOWN).toString();
	}

	@Override
	public void setDiscountAmount(BigDecimal amount) {
		
		this.discountAmount = amount;
	}

	@Override
	public void setBuyNum(int num) {
		this.number = num;
	}

	@Override
	public BigDecimal getWaitPayAmont() {
		
		return finalAmount == null ? BigDecimal.ZERO : new BigDecimal(finalAmount);
	}

	@Override
	public void setGoodSkuId(String skuId) {
		
		tradeGoodSkuId = skuId;
	}

	@Override
	public String getGoodName() {
		return this.tradeGoodName;
	}

	public String getTradeGoodId() {
		return tradeGoodId;
	}

	public void setTradeGoodId(String tradeGoodId) {
		this.tradeGoodId = tradeGoodId;
	}

	public List<OrderItemAsFlowVo> getFlowList() {
		return flowList;
	}

	public void setFlowList(List<OrderItemAsFlowVo> flowList) {
		this.flowList = flowList;
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

	public OrderListPresellExtraVo getPresellExtra() {
		return presellExtra;
	}

	public void setPresellExtra(OrderListPresellExtraVo presellExtra) {
		this.presellExtra = presellExtra;
	}

	public List<String> getMessageList() {
		return messageList;
	}

	@Override
	public void setMessageList(List<String> messageList) {
		this.messageList = messageList;
	}
}