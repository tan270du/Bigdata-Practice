package pub.makers.shop.browseLog.pojo;

import pub.makers.shop.baseOrder.enums.OrderBizType;
import pub.makers.shop.baseOrder.enums.OrderClientType;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by kok on 2017/6/24.
 */
public class GoodsBrowseLogQuery implements Serializable {
    private List<String> logIdList;
    private String userId;
    private List<String> classifyIdList;
    private Date startDate;
    private Date endDate;
    private OrderBizType orderBizType;
    private OrderClientType orderClientType;

    public List<String> getLogIdList() {
        return logIdList;
    }

    public void setLogIdList(List<String> logIdList) {
        this.logIdList = logIdList;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getClassifyIdList() {
        return classifyIdList;
    }

    public void setClassifyIdList(List<String> classifyIdList) {
        this.classifyIdList = classifyIdList;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public OrderBizType getOrderBizType() {
        return orderBizType;
    }

    public void setOrderBizType(OrderBizType orderBizType) {
        this.orderBizType = orderBizType;
    }

    public OrderClientType getOrderClientType() {
        return orderClientType;
    }

    public void setOrderClientType(OrderClientType orderClientType) {
        this.orderClientType = orderClientType;
    }
}
