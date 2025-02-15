package pub.makers.shop.purchaseOrder.vo;

import org.apache.commons.lang.StringUtils;
import pub.makers.shop.afterSale.vo.OrderItemAsFlowVo;
import pub.makers.shop.baseOrder.enums.OrderBizType;
import pub.makers.shop.baseOrder.enums.OrderClientType;
import pub.makers.shop.baseOrder.enums.OrderStatus;
import pub.makers.shop.baseOrder.pojo.BaseOrder;
import pub.makers.shop.baseOrder.pojo.BaseOrderItem;
import pub.makers.shop.baseOrder.pojo.TradeContext;
import pub.makers.shop.baseOrder.vo.OrderListPaymentVo;
import pub.makers.shop.baseOrder.vo.OrderPresellExtraVo;
import pub.makers.shop.invoice.vo.InvoiceVo;
import pub.makers.shop.promotion.vo.PromotionActivityVo;
import pub.makers.shop.purchaseOrder.entity.PurchaseOrder;
import pub.makers.shop.purchaseOrder.enums.IndentPayType;
import pub.makers.shop.tradeOrder.enums.IndentDealStatus;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by AlexanderLin on 2016/12/6.
 */

public class PurchaseOrderVo extends BaseOrder{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
    private String orderNo;     //进货订单编号
    private String proDealer;       //省级经销商
    private String cityDealer;      //市级经销商
    private String districtDealer;  //区级经销商
    private String name;            //订单名称
    private String storeName;       //店铺名称
    private String storeNum;
    private String storeDeptNum;
    private String storeUserName;
    private String buyerId;             //购买人id
    private String buyerName;           //购买人姓名
    private Map<String, Object> buyer;
    private String referrerId;
    private Map<String, Object> referrer;
    private String totalAmount;     //订单总款项
    private BigDecimal paymentAmount;   //支付款项
    private String finalAmount;     //商品总价
    private BigDecimal discountAmount;     //优惠金额
    private Date createTime;        //创建时间
    private Date payTime;           //支付时间
    private Date evaluateTime;     //评价时间
    private Integer number;         //数量
    private Integer type;           //订单类型(正常交易:1,兑换券:2)
    private String typeName;           //订单类型(正常交易:1,兑换券:2)
    private String province;        //省
    private String city;            //市
    private String district;            //区
    private String townCode;        //邮政编码
    private String address;         //地址
    private String receiverPhone;   //联系电话
    private String buyerRemark;     //买家备注
    private String expressNumber;   //快递单号
    private String expressId;       //快递id
    private String expressCompany;  //快递公司
    private String expressMethod;
    private String weight;           //重量
    private String carriage;        //商家运费
    private String buyerCarriage;   //卖家运费
    private String shipper;         //发货人
    private Date shipTime;          //发货时间
    private String receiver;        //收货人
    private Integer status;         //状态(待付款("pay",1),待发货("ship",2),退款申请("refund",3),待收货("receive",5),退货申请("return",6)退货中("returning",7),已退款("refunded",8),已退货("returned",9),已收货("received",10),已取消("cancel",11));
    private String statusName;         //
    private Integer payType;        //支付类型(1:微信支付,2:支付宝支付)
    private String payTypeName;        //支付类型(1:微信支付,2:支付宝支付)
    private String payAccount;      //支付账户
    private Boolean needInvoice = false;        //是否要发票
    private String needInvoiceText;        //是否要发票
    private String invoiceName;         //发票抬头
    private String invoiceContent;      //发票内容
    private String invoiceDutyParagraph; //发票税号
    private String remark;               //
    private Date finishTime;            //完成时间(针对已取消,已退款,已退货,已收货)
    private Boolean deleteFlag = false; //删除标示
    private Integer dealStatus;         //订单交易状态交易关闭("deal_close",0),交易失败("deal_fail",1),交易成功("deal_success",2)
    private String dealStatusName;
    private String refundId;            //退款原因关联id
    private String returnId;            //退货原因关联id
    private String refundName;          //退款人姓名
    private String returnName;          //退货人姓名
    private String refundRemark;        //退款原因
    private String returnRemark;        //退货原因
    private String rejectRefund;        //拒绝退款
    private String rejectReturn;        //拒绝退货
    private String ticketNum;
    private String buyType;
    private Integer shipNotice;         //发货提醒
    private String subbranchId;         //分店id
    private String tradeHeadStoreId;    //总店铺id
    private String concatName;
    private Date timeout;               //支付超时时间
    private String remarkLevel;
    private String clientType; // 客户端类型
    private  String orderType;
    private String cancelType;

    private Integer shipReturnTime; //发货前申请售后次数
    private Integer returnTime; //发货后申请售后次数

    private String groupId;
    /**
	 * 买家删除标识
	 */
	private String buyerDelFlag;

	/**
	 * 卖家删除标识
	 */
	private String sellerDelFlag;

    private List<OrderListPaymentVo> paymentList; //分期信息
    private OrderPresellExtraVo presellExtra; //预售订单信息
    private List<? extends BaseOrderItem> itemList;
    private List<PurchaseOrderListVo> orderListVos;     //商品列表

    private String weixinTraderId;
    private BigDecimal presellFirst;
    private BigDecimal presellEnd;
    private BigDecimal presellAmount;
    private String presllType;

    private Integer isSample;

    private String purGoodsId;

    private List<OrderItemAsFlowVo> flowList;

    private String stageOrder;

    private BigDecimal waitPaymentAmount;

    /**
     * 是否已退运费
     */
    private String isReturnCarriage;


    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }


    /**
     * 确认收货超时时间
     */
    private Date receiveTimeout;


    private List<PromotionActivityVo> activityList;

    public String getWeixinTraderId() {
        return weixinTraderId;
    }

    public void setWeixinTraderId(String weixinTraderId) {
        this.weixinTraderId = weixinTraderId;
    }

    public String getExpressMethod() {
        return expressMethod;
    }

    public void setExpressMethod(String expressMethod) {
        this.expressMethod = expressMethod;
    }

    public BigDecimal getWaitPaymentAmount() {
        if (StringUtils.isNotBlank(finalAmount) && paymentAmount != null) {
            return new BigDecimal(finalAmount).subtract(paymentAmount).setScale(2, BigDecimal.ROUND_HALF_UP);
        } else {
            return BigDecimal.ZERO.setScale(2, BigDecimal.ROUND_HALF_UP);
        }
    }

    public void setWaitPaymentAmount(BigDecimal waitPaymentAmount) {
        this.waitPaymentAmount = waitPaymentAmount;
    }

    public Date getEvaluateTime() {
        return evaluateTime;
    }

    public void setEvaluateTime(Date evaluateTime) {
        this.evaluateTime = evaluateTime;
    }

    private String orderClientType;

    private String orderClientTypeName;

    public String getOrderClientTypeName() {
        if (orderClientType != null) {
            return OrderClientType.valueOf(orderClientType).getDesc();
        }
        return orderClientTypeName;
    }

    public void setOrderClientTypeName(String orderClientTypeName) {
        this.orderClientTypeName = orderClientTypeName;
    }

    public String getStageOrder() {
        return stageOrder;
    }

    public void setStageOrder(String stageOrder) {
        this.stageOrder = stageOrder;
    }

    public String getPurGoodsId() {
        return purGoodsId;
    }

    public void setPurGoodsId(String purGoodsId) {
        this.purGoodsId = purGoodsId;
    }

    public Integer getIsSample() {
        return isSample;
    }

    public void setIsSample(Integer isSample) {
        this.isSample = isSample;
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

    public String getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(String finalAmount) {
        this.finalAmount = finalAmount;
    }

    public String getStatusName() {
        if (this.status != null) {
            return OrderStatus.getDbDataByName(this.status);
        }
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getStoreNum() {
        return storeNum;
    }

    public void setStoreNum(String storeNum) {
        this.storeNum = storeNum;
    }

    public String getStoreDeptNum() {
        return storeDeptNum;
    }

    public void setStoreDeptNum(String storeDeptNum) {
        this.storeDeptNum = storeDeptNum;
    }

    public String getStoreUserName() {
        return storeUserName;
    }

    public void setStoreUserName(String storeUserName) {
        this.storeUserName = storeUserName;
    }

    public String getRemarkLevel() {
        return remarkLevel;
    }

    public void setRemarkLevel(String remarkLevel) {
        this.remarkLevel = remarkLevel;
    }

    public String getConcatName() {
        return concatName;
    }

    public void setConcatName(String concatName) {
        this.concatName = concatName;
    }

    public String getExpressId() {
        return expressId;
    }

    public void setExpressId(String expressId) {
        this.expressId = expressId;
    }

    public String getId() {
        return id;
    }
    public String getNeedInvoiceText() {
        return this.needInvoice ? "是" : "否";
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getProDealer() {
        return proDealer;
    }

    public void setProDealer(String proDealer) {
        this.proDealer = proDealer;
    }

    public String getCityDealer() {
        return cityDealer;
    }

    public void setCityDealer(String cityDealer) {
        this.cityDealer = cityDealer;
    }

    public String getDistrictDealer() {
        return districtDealer;
    }

    public void setDistrictDealer(String districtDealer) {
        this.districtDealer = districtDealer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTradeHeadStoreId() {
        return tradeHeadStoreId;
    }

    public void setTradeHeadStoreId(String tradeHeadStoreId) {
        this.tradeHeadStoreId = tradeHeadStoreId;
    }

    public String getSubbranchId() {
        return subbranchId;
    }

    public void setSubbranchId(String subbranchId) {
        this.subbranchId = subbranchId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public Map<String, Object> getBuyer() {
        return buyer;
    }

    public void setBuyer(Map<String, Object> buyer) {
        this.buyer = buyer;
    }

    public String getReferrerId() {
        return referrerId;
    }

    public void setReferrerId(String referrerId) {
        this.referrerId = referrerId;
    }

    public Map<String, Object> getReferrer() {
        return referrer;
    }

    public void setReferrer(Map<String, Object> referrer) {
        this.referrer = referrer;
    }

    public String getTotalAmount() {
        if (StringUtils.isNotBlank(totalAmount)) {
            return new BigDecimal(totalAmount).setScale(2, BigDecimal.ROUND_HALF_UP).toString();
        }
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getPaymentAmount() {
        if (paymentAmount == null) {
            return BigDecimal.ZERO.setScale(2, BigDecimal.ROUND_HALF_UP);
        }
        return paymentAmount.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getTownCode() {
        return townCode;
    }

    public void setTownCode(String townCode) {
        this.townCode = townCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getBuyerRemark() {
        return buyerRemark;
    }

    public void setBuyerRemark(String buyerRemark) {
        this.buyerRemark = buyerRemark;
    }

    public String getExpressNumber() {
        return expressNumber;
    }

    public void setExpressNumber(String expressNumber) {
        this.expressNumber = expressNumber;
    }

    public String getExpressCompany() {
        return expressCompany;
    }

    public void setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCarriage() {
        return carriage;
    }

    public void setCarriage(String carriage) {
        this.carriage = carriage;
    }

    public String getBuyerCarriage() {
        return buyerCarriage;
    }

    public void setBuyerCarriage(String buyerCarriage) {
        this.buyerCarriage = buyerCarriage;
    }

    public String getShipper() {
        return shipper;
    }

    public void setShipper(String shipper) {
        this.shipper = shipper;
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
        this.receiver = receiver;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    public Boolean getNeedInvoice() {
        return needInvoice;
    }

    public void setNeedInvoice(Boolean needInvoice) {
        this.needInvoice = needInvoice;
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }

    public String getInvoiceContent() {
        return invoiceContent;
    }

    public void setInvoiceContent(String invoiceContent) {
        this.invoiceContent = invoiceContent;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(Integer dealStatus) {
        this.dealStatus = dealStatus;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public String getRefundName() {
        return refundName;
    }

    public void setRefundName(String refundName) {
        this.refundName = refundName;
    }

    public String getReturnName() {
        return returnName;
    }

    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    public String getRefundRemark() {
        return refundRemark;
    }

    public void setRefundRemark(String refundRemark) {
        this.refundRemark = refundRemark;
    }

    public String getReturnRemark() {
        return returnRemark;
    }

    public void setReturnRemark(String returnRemark) {
        this.returnRemark = returnRemark;
    }

    public String getRejectRefund() {
        return rejectRefund;
    }

    public void setRejectRefund(String rejectRefund) {
        this.rejectRefund = rejectRefund;
    }

    public String getRejectReturn() {
        return rejectReturn;
    }

    public void setRejectReturn(String rejectReturn) {
        this.rejectReturn = rejectReturn;
    }

    public String getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(String ticketNum) {
        this.ticketNum = ticketNum;
    }

    public String getBuyType() {
        return buyType;
    }

    public void setBuyType(String buyType) {
        this.buyType = buyType;
    }

    public Integer getShipNotice() {
        return shipNotice;
    }

    public void setShipNotice(Integer shipNotice) {
        this.shipNotice = shipNotice;
    }

    public List<PurchaseOrderListVo> getOrderListVos() {
        return orderListVos;
    }

    public void setOrderListVos(List<PurchaseOrderListVo> orderListVos) {
        this.orderListVos = orderListVos;
    }

    public String getBuyerName(){// 买家昵称
    return this.buyerName;
    }
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getPayTypeName() {
        return payTypeName;
    }

    public void setPayTypeName(String payTypeName) {
        this.payTypeName = payTypeName;
    }

    public void setNeedInvoiceText(String needInvoiceText) {
        this.needInvoiceText = needInvoiceText;
    }

    public Date getTimeout() {
        return timeout;
    }

    public void setTimeout(Date timeout) {
        this.timeout = timeout;
    }

	@Override
	public BigDecimal getTotalPrice() {
        return StringUtils.isNotBlank(totalAmount) ? new BigDecimal(totalAmount) : BigDecimal.ZERO;
	}

	@Override
	public void setTotalPrice(BigDecimal price) {
		
		this.totalAmount = price.toString();
	}

	@Override
	public BigDecimal getFreight() {
		return carriage == null ? BigDecimal.ZERO : new BigDecimal(carriage);
	}

	@Override
	public void setFreight(BigDecimal price) {
		
		this.carriage = price.toString();
		
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
		
		return finalAmount == null?BigDecimal.ZERO : new BigDecimal(finalAmount);
	}

	@Override
	public void setWaitpayAmount(BigDecimal waitpayAmount) {
		
		this.finalAmount = waitpayAmount.toString();
	}

	@Override
	public List<? extends BaseOrderItem> getItemList() {
		return orderListVos;
	}

	@Override
	public void setItemList(List<? extends BaseOrderItem> itemList) {
		this.orderListVos = (List<PurchaseOrderListVo>) itemList;
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

    public String getOrderCode() {
        return this.orderNo;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public OrderPresellExtraVo getPresellExtra() {
        return presellExtra;
    }

    public void setPresellExtra(OrderPresellExtraVo presellExtra) {
        this.presellExtra = presellExtra;
    }

    public static PurchaseOrderVo fromPurchaseOrder(PurchaseOrder order) {
        PurchaseOrderVo vo = new PurchaseOrderVo();
        vo.setId(order.getId());
        vo.setOrderNo(order.getOrderNo());
        vo.setProDealer(order.getProDealer());
        vo.setCityDealer(order.getCityDealer());
        vo.setDistrictDealer(order.getDistrictDealer());
        vo.setBuyerId(order.getBuyerId());
        vo.setTotalAmount(order.getTotalAmount() == null  ? "0" : order.getTotalAmount().toString());
        vo.setPaymentAmount(order.getPaymentAmount() == null ? BigDecimal.ZERO : order.getPaymentAmount());
        vo.setCreateTime(order.getCreateTime());
        vo.setFinalAmount(order.getFinalAmount() == null ? "0" : order.getFinalAmount().toString());
        vo.setDiscountAmount(order.getDiscountAmount());
        vo.setPayTime(order.getPayTime());
        vo.setNumber(order.getNumber());
        vo.setType(order.getType());
        vo.setAddress(order.getAddress());
        vo.setCity(order.getCity());
        vo.setDistrict(order.getDistrict());
        vo.setProvince(order.getProvince());
        vo.setReceiver(order.getReceiver());
        vo.setReceiverPhone(order.getReceiverPhone());
        vo.setBuyerRemark(order.getBuyerRemark());
        vo.setExpressId(order.getExpressId());
        vo.setExpressCompany(order.getExpressCompany());
        vo.setExpressNumber(order.getExpressNumber());
        vo.setWeight(order.getWeight());
        vo.setCarriage(order.getCarriage() == null ? "0" : order.getCarriage().toString());
        vo.setBuyerCarriage(order.getBuyerCarriage() == null ? "0" : order.getBuyerCarriage().toString());
        vo.setShipper(order.getShipper());
        vo.setShipNotice(order.getShipNotice() == null ? null : Integer.valueOf(order.getShipNotice()));
        vo.setShipTime(order.getShipTime());
        vo.setStatus(order.getStatus());
        vo.setPayType(StringUtils.isBlank(order.getPayType()) ? null : Integer.valueOf(order.getPayType()));
        vo.setPayTypeName(StringUtils.isBlank(order.getPayType()) ? null : IndentPayType.getStatusByDbData(vo.getPayType()).name());
        vo.setPayAccount(order.getPayAccount());
        vo.setNeedInvoice("1".equals(order.getNeedInvoice()));
        vo.setInvoiceName(order.getInvoiceName());
        vo.setInvoiceContent(order.getInvoiceContent());
        vo.setInvoiceDutyParagraph(order.getInvoiceDutyParagraph());
        vo.setRemark(order.getRemark());
        vo.setFinishTime(order.getFinishTime());
        vo.setDeleteFlag("1".equals(order.getDeleteFlag()));
        vo.setDealStatus(order.getDealStatus() == null ? null : Integer.valueOf(order.getDealStatus()));
        vo.setTimeout(order.getTimeout());
        vo.setOrderType(order.getOrderType());
        vo.setBuyerDelFlag(order.getBuyerDelFlag());
        vo.setSellerDelFlag(order.getDeleteFlag());
        vo.setCancelType(order.getCancelType());
        vo.setOrderClientType(order.getOrderClientType());
        vo.setReceiveTimeout(order.getReceiveTimeout());
        return vo;
    }

	@Override
	public String getOrderType() {
		// TODO Auto-generated method stub
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

    public List<OrderListPaymentVo> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<OrderListPaymentVo> paymentList) {
        this.paymentList = paymentList;
    }

	public String getCancelType() {
		return cancelType;
	}

	public void setCancelType(String cancelType) {
		this.cancelType = cancelType;
	}

    public List<OrderItemAsFlowVo> getFlowList() {
        return flowList;
    }

    public void setFlowList(List<OrderItemAsFlowVo> flowList) {
        this.flowList = flowList;
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

    public Integer getShipReturnTime() {
        return shipReturnTime;
    }

    public void setShipReturnTime(Integer shipReturnTime) {
        this.shipReturnTime = shipReturnTime;
    }

    public Integer getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Integer returnTime) {
        this.returnTime = returnTime;
    }

    public String getDealStatusName() {
        if (dealStatus != null) {
            return IndentDealStatus.getStatusByDbData(dealStatus).getName();
        }
        return dealStatusName;
    }

    public void setDealStatusName(String dealStatusName) {
        this.dealStatusName = dealStatusName;
    }

    @Override
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

    public List<PromotionActivityVo> getActivityList() {
        return activityList;
    }

    public void setActivityList(List<PromotionActivityVo> activityList) {
        this.activityList = activityList;
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
        invoiceVo.setOrderBizType(OrderBizType.purchase);
        return invoiceVo;
    }
}
