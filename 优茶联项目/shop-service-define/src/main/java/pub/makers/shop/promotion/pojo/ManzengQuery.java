package pub.makers.shop.promotion.pojo;

import pub.makers.shop.base.enums.ClientType;

import java.io.Serializable;
import java.util.List;

/**
 * Created by kok on 2017/8/23.
 */
public class ManzengQuery implements Serializable {
    private List<String> goodSkuIdList;
    private List<String> classifyIdList;
    private String orderBizType;
    private String storeLevelId;
    private ClientType clientType;
    private String isSelectAll;

    public List<String> getGoodSkuIdList() {
        return goodSkuIdList;
    }

    public void setGoodSkuIdList(List<String> goodSkuIdList) {
        this.goodSkuIdList = goodSkuIdList;
    }

    public List<String> getClassifyIdList() {
        return classifyIdList;
    }

    public void setClassifyIdList(List<String> classifyIdList) {
        this.classifyIdList = classifyIdList;
    }

    public String getOrderBizType() {
        return orderBizType;
    }

    public void setOrderBizType(String orderBizType) {
        this.orderBizType = orderBizType;
    }

    public String getStoreLevelId() {
        return storeLevelId;
    }

    public void setStoreLevelId(String storeLevelId) {
        this.storeLevelId = storeLevelId;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }

    public String getIsSelectAll() {
        return isSelectAll;
    }

    public void setIsSelectAll(String isSelectAll) {
        this.isSelectAll = isSelectAll;
    }
}
