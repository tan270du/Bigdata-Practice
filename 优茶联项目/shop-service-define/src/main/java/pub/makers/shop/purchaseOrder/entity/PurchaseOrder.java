package pub.makers.shop.purchaseOrder.entity;

import org.apache.commons.lang.StringUtils;
import pub.makers.shop.baseOrder.enums.OrderBizType;
import pub.makers.shop.baseOrder.pojo.BaseOrder;
import pub.makers.shop.baseOrder.pojo.BaseOrderItem;
import pub.makers.shop.baseOrder.pojo.TradeContext;
import pub.makers.shop.baseOrder.vo.OrderPresellExtraVo;
import pub.makers.shop.invoice.vo.InvoiceVo;
import pub.makers.shop.promotion.vo.PromotionActivityVo;
import pub.makers.shop.purchaseOrder.vo.PurchaseOrderVo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseOrder extends BaseOrder{

    public static final long serialVersionUID = 1L;

    private String id;

    private String orderNo;

    private String buyerId;

    private String proDealer;

    private String cityDealer;

    private String districtDealer;

    private Date payTime;

    private Integer number;

    private Integer type;

    private String province;

    private String city;

    private String district;

    private String address;

    private String receiverPhone;

    private String buyerRemark;

    private String expressId;

    private String expressNumber;

    private String expressCompany;

    private String weight;

    private BigDecimal carriage;

    private String shipper;

    private Date shipTime;

    private String receiver;

    private Integer status;

    private String payType;

    private String payAccount;

    private String needInvoice;

    private String invoiceName;

    private String invoiceContent;

    private String invoiceDutyParagraph;

    private Date finishTime;

    private String deleteFlag;

    private String dealStatus;

    private String refundId;

    private String refundRemark;

    private String returnId;

    private String returnRemark;

    private String rejectRefund;

    private String rejectReturn;

    private BigDecimal buyerCarriage;

    private String shipNotice;

    private String subbranchId;

    private String tradeHeadStoreId;

    private String remark;

    /**
     *	订单取消方式
     */
    private String cancelType;

    /**
     * 订单确认方式
     */
    private String confirmType;

    /**
     * 创建时间
     */
    private Date createTime;
    
    /**
     * 商品总额
     */
    private BigDecimal totalAmount;

    /**
     * 实际支付金额
     */
    private BigDecimal paymentAmount;

    /**
     * 待支付金额
     */
    private BigDecimal finalAmount;

    /**
     * 优惠金额
     */
    private BigDecimal discountAmount;

    /**
     * 支付超时时间
     */
    private Date timeout;

    /**
     * 订单类型
     */
    private String orderType;

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

    private String orderClientType;

    /**
     * 是否已退运费
     */
    private String isReturnCarriage;

    /**
     * 确认收货超时时间
     */
    private Date receiveTimeout;

    public String getExpressId() {
        return expressId;
    }

    public void setExpressId(String expressId) {
        this.expressId = expressId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId == null ? null : buyerId.trim();
    }

    public String getProDealer() {
        return proDealer;
    }

    public void setProDealer(String proDealer) {
        this.proDealer = proDealer == null ? null : proDealer.trim();
    }

    public String getCityDealer() {
        return cityDealer;
    }

    public void setCityDealer(String cityDealer) {
        this.cityDealer = cityDealer == null ? null : cityDealer.trim();
    }

    public String getDistrictDealer() {
        return districtDealer;
    }

    public void setDistrictDealer(String districtDealer) {
        this.districtDealer = districtDealer == null ? null : districtDealer.trim();
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone == null ? null : receiverPhone.trim();
    }

    public String getBuyerRemark() {
        return buyerRemark;
    }

    public void setBuyerRemark(String buyerRemark) {
        this.buyerRemark = buyerRemark == null ? null : buyerRemark.trim();
    }

    public String getExpressNumber() {
        return expressNumber;
    }

    public void setExpressNumber(String expressNumber) {
        this.expressNumber = expressNumber == null ? null : expressNumber.trim();
    }

    public String getExpressCompany() {
        return expressCompany;
    }

    public void setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany == null ? null : expressCompany.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public BigDecimal getCarriage() {
        return carriage;
    }

    public void setCarriage(BigDecimal carriage) {
        this.carriage = carriage;
    }

    public String getShipper() {
        return shipper;
    }

    public void setShipper(String shipper) {
        this.shipper = shipper == null ? null : shipper.trim();
    }

    public Date getShipTime() {
        return shipTime;
    }

    public void setShipTime(Date shipTime) {
        this.shipTime = shipTime;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }


    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount == null ? null : payAccount.trim();
    }

    public String getNeedInvoice() {
        return needInvoice;
    }

    public void setNeedInvoice(String needInvoice) {
        this.needInvoice = needInvoice == null ? null : needInvoice.trim();
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName == null ? null : invoiceName.trim();
    }

    public String getInvoiceContent() {
        return invoiceContent;
    }

    public void setInvoiceContent(String invoiceContent) {
        this.invoiceContent = invoiceContent == null ? null : invoiceContent.trim();
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    public String getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus == null ? null : dealStatus.trim();
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId == null ? null : refundId.trim();
    }

    public String getRefundRemark() {
        return refundRemark;
    }

    public void setRefundRemark(String refundRemark) {
        this.refundRemark = refundRemark == null ? null : refundRemark.trim();
    }

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId == null ? null : returnId.trim();
    }

    public String getReturnRemark() {
        return returnRemark;
    }

    public void setReturnRemark(String returnRemark) {
        this.returnRemark = returnRemark == null ? null : returnRemark.trim();
    }

    public String getRejectRefund() {
        return rejectRefund;
    }

    public void setRejectRefund(String rejectRefund) {
        this.rejectRefund = rejectRefund == null ? null : rejectRefund.trim();
    }

    public String getRejectReturn() {
        return rejectReturn;
    }

    public void setRejectReturn(String rejectReturn) {
        this.rejectReturn = rejectReturn == null ? null : rejectReturn.trim();
    }

    public BigDecimal getBuyerCarriage() {
        return buyerCarriage;
    }

    public void setBuyerCarriage(BigDecimal buyerCarriage) {
        this.buyerCarriage = buyerCarriage;
    }

    public String getShipNotice() {
        return shipNotice;
    }

    public void setShipNotice(String shipNotice) {
        this.shipNotice = shipNotice == null ? null : shipNotice.trim();
    }

    public String getSubbranchId() {
        return subbranchId;
    }

    public void setSubbranchId(String subbranchId) {
        this.subbranchId = subbranchId == null ? null : subbranchId.trim();
    }

    public String getTradeHeadStoreId() {
        return tradeHeadStoreId;
    }

    public void setTradeHeadStoreId(String tradeHeadStoreId) {
        this.tradeHeadStoreId = tradeHeadStoreId == null ? null : tradeHeadStoreId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Date getTimeout() {
        return timeout;
    }

    public void setTimeout(Date timeout) {
        this.timeout = timeout;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public static PurchaseOrder fromPurchaseOrderVo(PurchaseOrderVo vo) {
        PurchaseOrder order = new PurchaseOrder();
        order.setId(vo.getId());
        order.setOrderNo(vo.getOrderNo());
        order.setProDealer(vo.getProDealer());
        order.setCityDealer(vo.getCityDealer());
        order.setDistrictDealer(vo.getDistrictDealer());
        order.setBuyerId(vo.getBuyerId());
        order.setTotalAmount(StringUtils.isEmpty(vo.getTotalAmount()) ? null : new BigDecimal(vo.getTotalAmount()));
        order.setPaymentAmount(vo.getPaymentAmount());
        order.setCreateTime(vo.getCreateTime());
        order.setFinalAmount(new BigDecimal(vo.getFinalAmount()));
        order.setDiscountAmount(vo.getDiscountAmount());
        order.setPayTime(vo.getPayTime());
        order.setNumber(vo.getNumber());
        order.setType(vo.getType());
        order.setCity(vo.getCity());
        order.setProvince(vo.getProvince());
        order.setDistrict(vo.getDistrict());
        order.setAddress(vo.getAddress());
        order.setReceiver(vo.getReceiver());
        order.setReceiverPhone(vo.getReceiverPhone());
        order.setBuyerRemark(vo.getBuyerRemark());
        order.setExpressId(vo.getExpressId());
        order.setExpressCompany(vo.getExpressCompany());
        order.setExpressNumber(vo.getExpressNumber());
        order.setWeight(vo.getWeight());
        order.setCarriage(StringUtils.isEmpty(vo.getCarriage()) ? null : new BigDecimal(vo.getCarriage()));
        order.setBuyerCarriage(StringUtils.isEmpty(vo.getBuyerCarriage()) ? null : new BigDecimal(vo.getBuyerCarriage()));
        order.setShipper(vo.getShipper());
        order.setShipNotice(vo.getShipNotice() == null ? null : vo.getShipNotice().toString());
        order.setShipTime(vo.getShipTime());
        order.setStatus(vo.getStatus());
        order.setPayType(vo.getPayType() == null ? null : vo.getPayType().toString());
        order.setPayAccount(vo.getPayAccount());
        order.setNeedInvoice(vo.getNeedInvoice() ? "1" : "0");
        order.setInvoiceName(vo.getInvoiceName());
        order.setInvoiceContent(vo.getInvoiceContent());
        order.setInvoiceDutyParagraph(vo.getInvoiceDutyParagraph());
        order.setRemark(vo.getRemark());
        order.setFinishTime(vo.getFinishTime());
        order.setDeleteFlag(vo.getDeleteFlag() ? "1" : "0");
        order.setDealStatus(vo.getDealStatus() == null ? null : vo.getDealStatus().toString());
        order.setTimeout(vo.getTimeout());
        order.setOrderType(vo.getOrderType());
        order.setBuyerDelFlag(vo.getBuyerDelFlag());
        order.setSellerDelFlag(vo.getSellerDelFlag());
        order.setOrderClientType(vo.getOrderClientType());
        return order;
    }

	@Override
	public List<? extends BaseOrderItem> getItemList() {
		
		return new ArrayList<BaseOrderItem>();
	}

	@Override
	public void setItemList(List<? extends BaseOrderItem> itemList) {
		// TODO Auto-generated method stub
		
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
		context.setArea(district);
		context.setCity(city);
        context.setBuyerId(buyerId);
		
		return context;
	}

	@Override
	public void setOrderId(String orderId) {
		
		this.id = orderId;
	}

    @Override
    public String getOrderId() {
        return this.id;
    }

    @Override
	public void setOrderCode(String orderCode) {
		
		this.orderNo = orderCode;
	}

	@Override
	public void setStatus(Integer status) {
		
		this.status = status;
	}

	@Override
	public Integer getStatus() {
		
		return status;
	}

	public BigDecimal getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(BigDecimal finalAmount) {
		this.finalAmount = finalAmount;
	}

    @Override
    public String getOrderType() {
        return orderType;
    }

    @Override
    public void setOrderType(String orderType) {
        this.orderType = orderType;
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
        if ("1".equals(this.needInvoice)) {
            return null;
        }
        InvoiceVo invoiceVo = new InvoiceVo();
        invoiceVo.setUserId(this.buyerId);
        invoiceVo.setName(this.invoiceName);
        invoiceVo.setContent(this.invoiceContent);
        invoiceVo.setDutyParagraph(this.invoiceDutyParagraph);
        invoiceVo.setOrderBizType(OrderBizType.purchase);
        return invoiceVo;
    }

    public String getOrderClientType() {
        return orderClientType;
    }

    public void setOrderClientType(String orderClientType) {
        this.orderClientType = orderClientType;
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

    public Date getReceiveTimeout() {
        return receiveTimeout;
    }

    public void setReceiveTimeout(Date receiveTimeout) {
        this.receiveTimeout = receiveTimeout;
    }
}