package pub.makers.shop.tradeOrder.entity;

import org.apache.commons.lang.StringUtils;
import pub.makers.shop.baseOrder.enums.OrderBizType;
import pub.makers.shop.baseOrder.pojo.BaseOrder;
import pub.makers.shop.baseOrder.pojo.BaseOrderItem;
import pub.makers.shop.baseOrder.pojo.TradeContext;
import pub.makers.shop.baseOrder.vo.OrderPresellExtraVo;
import pub.makers.shop.invoice.vo.InvoiceVo;
import pub.makers.shop.promotion.vo.PromotionActivityVo;
import pub.makers.shop.tradeOrder.vo.IndentVo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Indent extends BaseOrder{
	private static final long serialVersionUID = 1L;
	
	/** ID */
	private Long id;		
	
	/** 订单号 */
	private String name;		
	
	/** 总店铺ID */
	private Long tradeHeadStoreId;		
	
	/** 分店ID */
	private Long subbranchId;		
	
	/** 购买用户ID */
	private String buyerId;		
	
	/** 推荐用户ID */
	private Long referrerId;		
	
	/** 创建时间 */
	private Date createTime;		
	
	/** 订单总金额 */
	private BigDecimal totalAmount;		
	
	/** 实际支付金额 */
	private BigDecimal paymentAmount;

	/**
	 * 商品总价
	 */
	private BigDecimal finalAmount;

	/**
	 * 优惠金额
	 */
	private BigDecimal discountAmount;
	
	/** 付款时间 */
	private Date payTime;

	/**
	 * 评论时间
	 */
	private Date evaluateTime;
	
	/** 数量 */
	private Integer number;		
	
	/** 订单类型(正常交易:1,兑换券:2) */
	private Integer type;		
	
	/** 省 */
	private String province;		
	
	/** 市 */
	private String city;		
	
	/** 区 */
	private String town;		
	
	/** 地址 */
	private String address;		
	
	/** 联系电话 */
	private String receiverPhone;		
	
	/** 备注 */
	private String remark;
	
	/** 备注等级 */
	private String remarkLevel;
	
	/** 买家备注 */
	private String buyerRemark;		
	
	/** 快递单号 */
	private String expressNumber;		
	
	/** 快递公司 */
	private String expressCompany;

	/** 快递公司编号 */
	private String expressId;
	
	/** 重量 */
	private String weight;		
	
	/** 商家运费 */
	private BigDecimal carriage;		
	
	/** 发货人 */
	private String shipper;		
	
	/** 发货时间 */
	private Date shipTime;		
	
	/** 收货人 */
	private String receiver;		
	
	/** 状态(待付款("pay",1),待发货("ship",2),退款申请("refund",3),待收货("receive",5),退货申请("return",6)退货中("returning",7),已退款("refunded",8),已退货("returned",9),已收货("received",10),已取消("cancel",11)); */
	private Integer status;		
	
	/** 支付类型(1:微信支付,2:支付宝支付) */
	private Integer payType;		
	
	/** 支付账户 */
	private String payAccount;		
	
	/** 是否要发票 */
	private Boolean needInvoice;		
	
	/** 发票抬头 */
	private String invoiceName;		
	
	/** 发票内容 */
	private String invoiceContent;

	/** 发票税号 */
	private String invoiceDutyParagraph;
	
	/** 完成时间(针对已取消,已退款,已退货,已收货) */
	private Date finishTime;		
	
	/** 删除标示 */
	private Boolean deleteFlag;		
	
	/** 订单交易状态交易关闭("deal_close",0),交易失败("deal_fail",1),交易成功("deal_success",2) */
	private Integer dealStatus;		
	
	/** 退款原因关联id */
	private Long refundId;		
	
	/** 退款原因备注 */
	private String refundRemark;		
	
	/** 退货原因关联id */
	private Long returnId;		
	
	/** 退货原因备注 */
	private String returnRemark;		
	
	/** 拒绝退款原因 */
	private String rejectRefund;		
	
	/** 拒绝退货原因 */
	private String rejectReturn;		
	
	/** 拒绝退货原因 */
	private String ticketNum;		
	
	/** 买家运费 */
	private BigDecimal buyerCarriage;		
	
	/** 标记下单为自用或送人，Z自用，S送人 */
	private String buyType;		
	
	/** 发货提醒 */
	private Integer shipNotice;

	private String orderType;

	/** 支付超时时间 */
	private Date timeout;

	/** 原价 */
	private BigDecimal originalAmount;

	/**
	 *	订单取消方式
	 */
	private String cancelType;

	/**
	 * 订单确认方式
	 */
	private String confirmType;

	/**
	 * 买家删除标识
	 */
	private String buyerDelFlag;

	/**
	 * 卖家删除标识
	 */
	private String sellerDelFlag;

	/**
	 * 退款金额
	 */
	private BigDecimal refundAmount;

	/**
	 * 订单来源
	 */
	private String indentShopType;

	/**
	 * 是否已退运费
	 */
	private String isReturnCarriage;

	/**
	 * 确认收货超时时间
	 */
	private Date receiveTimeout;


	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}

	public BigDecimal getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(BigDecimal finalAmount) {
		this.finalAmount = finalAmount;
	}

	public Date getEvaluateTime() {
		return evaluateTime;
	}

	public void setEvaluateTime(Date evaluateTime) {
		this.evaluateTime = evaluateTime;
	}

	public void setId(Long id){
		this.id = id;
	}
	
	public Long getId(){
		return id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setTradeHeadStoreId(Long tradeHeadStoreId){
		this.tradeHeadStoreId = tradeHeadStoreId;
	}
	
	public Long getTradeHeadStoreId(){
		return tradeHeadStoreId;
	}
	
	public void setSubbranchId(Long subbranchId){
		this.subbranchId = subbranchId;
	}
	
	public Long getSubbranchId(){
		return subbranchId;
	}
	
	public void setBuyerId(String buyerId){
		this.buyerId = buyerId;
	}
	
	public String getBuyerId(){
		return buyerId;
	}
	
	public void setReferrerId(Long referrerId){
		this.referrerId = referrerId;
	}
	
	public Long getReferrerId(){
		return referrerId;
	}
	
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
	
	public Date getCreateTime(){
		return createTime;
	}
	
	public void setTotalAmount(BigDecimal totalAmount){
		this.totalAmount = totalAmount;
	}
	
	public BigDecimal getTotalAmount(){
		return totalAmount;
	}
	
	public void setPaymentAmount(BigDecimal paymentAmount){
		this.paymentAmount = paymentAmount;
	}
	
	public BigDecimal getPaymentAmount(){
		return paymentAmount;
	}
	
	public void setPayTime(Date payTime){
		this.payTime = payTime;
	}
	
	public Date getPayTime(){
		return payTime;
	}
	
	public void setNumber(Integer number){
		this.number = number;
	}
	
	public Integer getNumber(){
		return number;
	}
	
	public void setType(Integer type){
		this.type = type;
	}
	
	public Integer getType(){
		return type;
	}
	
	public void setProvince(String province){
		this.province = province;
	}
	
	public String getProvince(){
		return province;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	
	public String getCity(){
		return city;
	}
	
	public void setTown(String town){
		this.town = town;
	}
	
	public String getTown(){
		return town;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setReceiverPhone(String receiverPhone){
		this.receiverPhone = receiverPhone;
	}
	
	public String getReceiverPhone(){
		return receiverPhone;
	}
	
	public void setRemark(String remark){
		this.remark = remark;
	}
	
	public String getRemark(){
		return remark;
	}
	
	public String getRemarkLevel() {
		return remarkLevel;
	}

	public void setRemarkLevel(String remarkLevel) {
		this.remarkLevel = remarkLevel;
	}

	public void setBuyerRemark(String buyerRemark){
		this.buyerRemark = buyerRemark;
	}
	
	public String getBuyerRemark(){
		return buyerRemark;
	}

	public String getExpressId() {
		return expressId;
	}

	public void setExpressId(String expressId) {
		this.expressId = expressId;
	}

	public void setExpressNumber(String expressNumber){
		this.expressNumber = expressNumber;
	}
	
	public String getExpressNumber(){
		return expressNumber;
	}
	
	public void setExpressCompany(String expressCompany){
		this.expressCompany = expressCompany;
	}
	
	public String getExpressCompany(){
		return expressCompany;
	}
	
	public void setWeight(String weight){
		this.weight = weight;
	}
	
	public String getWeight(){
		return weight;
	}
	
	public void setCarriage(BigDecimal carriage){
		this.carriage = carriage;
	}
	
	public BigDecimal getCarriage(){
		return carriage;
	}
	
	public void setShipper(String shipper){
		this.shipper = shipper;
	}
	
	public String getShipper(){
		return shipper;
	}
	
	public void setShipTime(Date shipTime){
		this.shipTime = shipTime;
	}
	
	public Date getShipTime(){
		return shipTime;
	}
	
	public void setReceiver(String receiver){
		this.receiver = receiver;
	}
	
	public String getReceiver(){
		return receiver;
	}
	
	public void setStatus(Integer status){
		this.status = status;
	}
	
	public Integer getStatus(){
		return status;
	}
	
	public void setPayType(Integer payType){
		this.payType = payType;
	}
	
	public Integer getPayType(){
		return payType;
	}
	
	public void setPayAccount(String payAccount){
		this.payAccount = payAccount;
	}
	
	public String getPayAccount(){
		return payAccount;
	}
	
	public void setNeedInvoice(Boolean needInvoice){
		this.needInvoice = needInvoice;
	}
	
	public Boolean getNeedInvoice(){
		return needInvoice;
	}
	
	public void setInvoiceName(String invoiceName){
		this.invoiceName = invoiceName;
	}
	
	public String getInvoiceName(){
		return invoiceName;
	}
	
	public void setInvoiceContent(String invoiceContent){
		this.invoiceContent = invoiceContent;
	}
	
	public String getInvoiceContent(){
		return invoiceContent;
	}
	
	public void setFinishTime(Date finishTime){
		this.finishTime = finishTime;
	}
	
	public Date getFinishTime(){
		return finishTime;
	}
	
	public void setDeleteFlag(Boolean deleteFlag){
		this.deleteFlag = deleteFlag;
	}
	
	public Boolean getDeleteFlag(){
		return deleteFlag;
	}
	
	public void setDealStatus(Integer dealStatus){
		this.dealStatus = dealStatus;
	}
	
	public Integer getDealStatus(){
		return dealStatus;
	}
	
	public void setRefundId(Long refundId){
		this.refundId = refundId;
	}
	
	public Long getRefundId(){
		return refundId;
	}
	
	public void setRefundRemark(String refundRemark){
		this.refundRemark = refundRemark;
	}
	
	public String getRefundRemark(){
		return refundRemark;
	}
	
	public void setReturnId(Long returnId){
		this.returnId = returnId;
	}
	
	public Long getReturnId(){
		return returnId;
	}
	
	public void setReturnRemark(String returnRemark){
		this.returnRemark = returnRemark;
	}
	
	public String getReturnRemark(){
		return returnRemark;
	}
	
	public void setRejectRefund(String rejectRefund){
		this.rejectRefund = rejectRefund;
	}
	
	public String getRejectRefund(){
		return rejectRefund;
	}
	
	public void setRejectReturn(String rejectReturn){
		this.rejectReturn = rejectReturn;
	}
	
	public String getRejectReturn(){
		return rejectReturn;
	}
	
	public void setTicketNum(String ticketNum){
		this.ticketNum = ticketNum;
	}
	
	public String getTicketNum(){
		return ticketNum;
	}
	
	public void setBuyerCarriage(BigDecimal buyerCarriage){
		this.buyerCarriage = buyerCarriage;
	}
	
	public BigDecimal getBuyerCarriage(){
		return buyerCarriage;
	}
	
	public void setBuyType(String buyType){
		this.buyType = buyType;
	}
	
	public String getBuyType(){
		return buyType;
	}
	
	public void setShipNotice(Integer shipNotice){
		this.shipNotice = shipNotice;
	}
	
	public Integer getShipNotice(){
		return shipNotice;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Date getTimeout() {
		return timeout;
	}

	public void setTimeout(Date timeout) {
		this.timeout = timeout;
	}

	public BigDecimal getOriginalAmount() {
		return originalAmount;
	}

	public void setOriginalAmount(BigDecimal originalAmount) {
		this.originalAmount = originalAmount;
	}

	public String getCancelType() {
		return cancelType;
	}

	public void setCancelType(String cancelType) {
		this.cancelType = cancelType;
	}

	public String getConfirmType() {
		return confirmType;
	}

	public void setConfirmType(String confirmType) {
		this.confirmType = confirmType;
	}

	public BigDecimal getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(BigDecimal refundAmount) {
		this.refundAmount = refundAmount;
	}

	public Date getReceiveTimeout() {
		return receiveTimeout;
	}

	public void setReceiveTimeout(Date receiveTimeout) {
		this.receiveTimeout = receiveTimeout;
	}

	public static Indent fromIndentVo(IndentVo src){
		
		Indent target = new Indent();
		
		target.setId(src.getId() == null ? null : Long.valueOf(src.getId()));
		target.setTradeHeadStoreId(src.getTradeHeadStoreId() == null ? null : Long.valueOf(src
				.getTradeHeadStoreId()));
		target.setSubbranchId(StringUtils.isEmpty(src.getSubbranchId()) ? null : Long.valueOf(src.getSubbranchId()));
		target.setBuyerId(src.getBuyerId());
		target.setReferrerId(StringUtils.isEmpty(src.getReferrerId()) ? null : Long.valueOf(src.getReferrerId()));
		target.setName(src.getName());
		target.setTotalAmount(BigDecimal.valueOf(Double.valueOf(src.getTotalAmount())));
		target.setPaymentAmount(src.getPaymentAmount());
		target.setCreateTime(src.getCreateTime());
		target.setPayTime(src.getPayTime());
		target.setNumber(src.getNumber());
		target.setType(src.getType());
		target.setProvince(src.getProvince());
		target.setCity(src.getCity());
		target.setTown(src.getTown());
		target.setAddress(src.getAddress());
		target.setReceiverPhone(src.getReceiverPhone());
		target.setBuyerRemark(src.getBuyerRemark());
		target.setExpressId(src.getExpressId());
		target.setExpressNumber(src.getExpressNumber());
		target.setExpressCompany(src.getExpressCompany());
		target.setWeight(src.getWeight());
		target.setCarriage(StringUtils.isEmpty(src.getCarriage())?null:new BigDecimal(src.getCarriage()));
		target.setBuyerCarriage(StringUtils.isEmpty(src.getBuyerCarriage())?null:new BigDecimal(src.getBuyerCarriage()));
		target.setShipper(src.getShipper());
		target.setShipTime(src.getShipTime());
		target.setReceiver(src.getReceiver());
		target.setStatus(src.getStatus());
		target.setShipNotice(src.getShipNotice());
		target.setPayType(src.getPayType());
		target.setPayAccount(src.getPayAccount());
		target.setNeedInvoice(src.getNeedInvoice());
		target.setInvoiceName(src.getInvoiceName());
		target.setInvoiceContent(src.getInvoiceContent());
		target.setInvoiceDutyParagraph(src.getInvoiceDutyParagraph());
		target.setRemark(src.getRemark());
		target.setFinishTime(src.getFinishTime());
		target.setDeleteFlag(src.getDeleteFlag());
		target.setDealStatus(src.getDealStatus());
		target.setRefundId(src.getRefundId() == null ? null : Long.valueOf(src.getRefundId()));
		target.setReturnId(src.getReturnId() == null ? null : Long.valueOf(src.getReturnId()));
		target.setRefundRemark(src.getRefundRemark());
		target.setRejectRefund(src.getRejectRefund());
		target.setReturnRemark(src.getReturnRemark());
		target.setRejectReturn(src.getRejectReturn());
		target.setRemark(src.getRemark());
		target.setTicketNum(src.getTicketNum());
		target.setBuyType(src.getBuyType());
		target.setTimeout(src.getTimeout());
		target.setDiscountAmount(src.getDiscountAmount());
		target.setFinalAmount(new BigDecimal(src.getFinalAmount()));
		target.setOrderType(src.getOrderType());
		target.setBuyerDelFlag(src.getBuyerDelFlag());
		target.setSellerDelFlag(src.getSellerDelFlag());
		target.setIndentShopType(src.getIndentShopType());
		return target;
	}

	@Override
	public List<? extends BaseOrderItem> getItemList() {
		
		return new ArrayList();
	}

	@Override
	public void setItemList(List<? extends BaseOrderItem> itemList) {
		
	}

	@Override
	public BigDecimal getTotalPrice() {
		return totalAmount;
	}

	@Override
	public void setTotalPrice(BigDecimal price) {
		
		this.totalAmount = price;
	}

	@Override
	public BigDecimal getFreight() {
		
		return carriage;
	}

	@Override
	public void setFreight(BigDecimal price) {
		
		this.carriage = price;
	}

	@Override
	public String getPayway() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPayway(String payway) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Date getPaytime() {
		return payTime;
	}

	@Override
	public void setPaytime(Date paytime) {
		this.payTime = paytime;
	}

	@Override
	public BigDecimal getWaitpayAmount() {
		
		return finalAmount;
	}

	@Override
	public void setWaitpayAmount(BigDecimal waitpayAmount) {
		
		this.finalAmount = waitpayAmount;
	}

	@Override
	public TradeContext getTradeContext() {

		TradeContext context = new TradeContext();
		context.setArea(town);
		context.setCity(city);
		context.setBuyerId(buyerId);
		
		return context;
	}

	@Override
	public void setOrderId(String orderId) {
		
		this.id = Long.valueOf(orderId);
	}

	@Override
	public String getOrderId() {
		return this.id.toString();
	}

	@Override
	public void setOrderCode(String orderCode) {
		
		this.name = orderCode;
	}

	public String getBuyerDelFlag() {
		return buyerDelFlag;
	}

	public void setBuyerDelFlag(String buyerDelFlag) {
		this.buyerDelFlag = buyerDelFlag;
	}

	public String getSellerDelFlag() {
		return sellerDelFlag;
	}

	public void setSellerDelFlag(String sellerDelFlag) {
		this.sellerDelFlag = sellerDelFlag;
	}

	@Override
	public void setPresellExtra(OrderPresellExtraVo presellExtra) {

	}

	@Override
	public void setActivityList(List<PromotionActivityVo> activityList) {

	}

	@Override
	public InvoiceVo getInvoiceVo() {
		if (!this.needInvoice) {
			return null;
		}
		InvoiceVo invoiceVo = new InvoiceVo();
		invoiceVo.setUserId(this.buyerId);
		invoiceVo.setName(this.invoiceName);
		invoiceVo.setContent(this.invoiceContent);
		invoiceVo.setDutyParagraph(this.invoiceDutyParagraph);
		invoiceVo.setOrderBizType(OrderBizType.trade);
		return invoiceVo;
	}

	public String getIndentShopType() {
		return indentShopType;
	}

	public void setIndentShopType(String indentShopType) {
		this.indentShopType = indentShopType;
	}

	public String getInvoiceDutyParagraph() {
		return invoiceDutyParagraph;
	}

	public void setInvoiceDutyParagraph(String invoiceDutyParagraph) {
		this.invoiceDutyParagraph = invoiceDutyParagraph;
	}

	public String getIsReturnCarriage() {
		return isReturnCarriage;
	}

	public void setIsReturnCarriage(String isReturnCarriage) {
		this.isReturnCarriage = isReturnCarriage;
	}
}
