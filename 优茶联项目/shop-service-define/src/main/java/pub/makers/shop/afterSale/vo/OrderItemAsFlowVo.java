package pub.makers.shop.afterSale.vo;

import pub.makers.shop.afterSale.enums.OrderAsType;
import pub.makers.shop.afterSale.enums.OrderFlowStatus;
import pub.makers.shop.baseOrder.enums.OrderBizType;
import pub.makers.shop.tradeOrder.enums.IndentListStatus;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by kok on 2017/6/17.
 */
public class OrderItemAsFlowVo implements Serializable {
    /**
     * 流程ID
     */
    private String id;
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 订单明细IDS
     */
    private String orderListIds;
    /**
     * 订单明细状态
     */
    private String orderListStatus;
    /**
     * 订单明细状态
     */
    private String orderListStatusStr;
    /**
     * 售后商品数量
     */
    private Integer goodNum;
    /**
     * 商品SKUID
     */
    private String goodSkuId;
    /**
     * 订单类型
     */
    private String orderType;
    /**
     * 订单类型
     */
    private String orderTypeStr;
    /**
     * 售后类型
     */
    private String asType;
    /**
     * 售后类型
     */
    private String asTypeStr;
    /**
     * 流程状态
     */
    private String flowStatus;
    /**
     * 流程状态
     */
    private String flowStatusStr;
    /**
     * 删除状态
     */
    private String delFlag;
    /**
     * 开始时间
     */
    private Date startTime;
    /**
     * 结束时间
     */
    private Date endTime;
    /**
     * 退款金额
     */
    private BigDecimal returnAmount;
    /**
     * 客服换货运单号
     */
    private String kefuFreightNo;

    /**
     * 客服物流公司
     */
    private String kefuFreightCompany;

    /**
     * 客户运单号
     */
    private String userFreightNo;


    private String userFreightCompany;

    /**
     * 售后理由
     */
    private String returnReason;
    /**
     * 附件
     */
    private String attachment;
    /**
     * 创建时间
     */
    private Date dateCreated;
    /**
     * 更新时间
     */
    private Date lastUpdated;

    private Date timeout;

    /**
     * 买家退货超时时间
     */
    private Date buyerTimeout;

    private List<OrderItemAsFlowDetailVo> detailList;

    private List<OrderItemReplyVo> orderItemReplyVos;

    public String getKefuFreightCompany() {
        return kefuFreightCompany;
    }

    public void setKefuFreightCompany(String kefuFreightCompany) {
        this.kefuFreightCompany = kefuFreightCompany;
    }

    public List<OrderItemReplyVo> getOrderItemReplyVos() {
        return orderItemReplyVos;
    }

    public void setOrderItemReplyVos(List<OrderItemReplyVo> orderItemReplyVos) {
        this.orderItemReplyVos = orderItemReplyVos;
    }

    public String getUserFreightCompany() {
        return userFreightCompany;
    }

    public void setUserFreightCompany(String userFreightCompany) {
        this.userFreightCompany = userFreightCompany;
    }

    public Date getTimeout() {
        return timeout;
    }

    public void setTimeout(Date timeout) {
        this.timeout = timeout;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderListIds() {
        return orderListIds;
    }

    public void setOrderListIds(String orderListIds) {
        this.orderListIds = orderListIds;
    }

    public String getOrderListStatus() {
        return orderListStatus;
    }

    public void setOrderListStatus(String orderListStatus) {
        this.orderListStatus = orderListStatus;
    }

    public Integer getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(Integer goodNum) {
        this.goodNum = goodNum;
    }

    public String getGoodSkuId() {
        return goodSkuId;
    }

    public void setGoodSkuId(String goodSkuId) {
        this.goodSkuId = goodSkuId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getAsType() {
        return asType;
    }

    public void setAsType(String asType) {
        this.asType = asType;
    }

    public String getFlowStatus() {
        return flowStatus;
    }

    public void setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(BigDecimal returnAmount) {
        this.returnAmount = returnAmount;
    }

    public String getKefuFreightNo() {
        return kefuFreightNo;
    }

    public void setKefuFreightNo(String kefuFreightNo) {
        this.kefuFreightNo = kefuFreightNo;
    }

    public String getUserFreightNo() {
        return userFreightNo;
    }

    public void setUserFreightNo(String userFreightNo) {
        this.userFreightNo = userFreightNo;
    }

    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
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

    public List<OrderItemAsFlowDetailVo> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<OrderItemAsFlowDetailVo> detailList) {
        this.detailList = detailList;
    }

    public void setOrderListStatusStr(String orderListStatusStr) {
        this.orderListStatusStr = orderListStatusStr;
    }

    public void setOrderTypeStr(String orderTypeStr) {
        this.orderTypeStr = orderTypeStr;
    }

    public void setAsTypeStr(String asTypeStr) {
        this.asTypeStr = asTypeStr;
    }

    public void setFlowStatusStr(String flowStatusStr) {
        this.flowStatusStr = flowStatusStr;
    }

    public String getOrderListStatusStr() {
        return IndentListStatus.valueOf(this.orderListStatus).getDisplayName();
    }

    public String getOrderTypeStr() {
        return OrderBizType.valueOf(this.orderType).getName();
    }

    public String getAsTypeStr() {
        return OrderAsType.valueOf(this.asType).getDisplayName();
    }

    public String getFlowStatusStr() {
        return OrderFlowStatus.valueOf(this.flowStatus).getDisplayName();
    }

    public Date getBuyerTimeout() {
        return buyerTimeout;
    }

    public void setBuyerTimeout(Date buyerTimeout) {
        this.buyerTimeout = buyerTimeout;
    }
}
