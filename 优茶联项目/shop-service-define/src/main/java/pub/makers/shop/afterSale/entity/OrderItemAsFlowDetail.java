package pub.makers.shop.afterSale.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by kok on 2017/5/13.
 */
public class OrderItemAsFlowDetail implements Serializable {
    /**
     * ID
     */
    private String id;
    /**
     * 流程ID
     */
    private String ruleId;
    /**
     * 流程状态
     */
    private String flowStatus;
    /**
     * 变更说明
     */
    private String operDesc;
    /**
     * 操作人
     */
    private String operMan;
    /**
     * 操作人类型
     */
    private String operManType;
    /**
     * 删除状态
     */
    private String delFlag;
    /**
     * 创建时间
     */
    private Date dateCreated;
    /**
     * 更新时间
     */
    private Date lastUpdated;

    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getFlowStatus() {
        return flowStatus;
    }

    public void setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
    }

    public String getOperDesc() {
        return operDesc;
    }

    public void setOperDesc(String operDesc) {
        this.operDesc = operDesc;
    }

    public String getOperMan() {
        return operMan;
    }

    public void setOperMan(String operMan) {
        this.operMan = operMan;
    }

    public String getOperManType() {
        return operManType;
    }

    public void setOperManType(String operManType) {
        this.operManType = operManType;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
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
}
