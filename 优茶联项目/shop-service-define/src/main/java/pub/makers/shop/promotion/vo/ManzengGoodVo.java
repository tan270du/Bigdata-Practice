package pub.makers.shop.promotion.vo;

import pub.makers.shop.baseGood.vo.BaseGoodVo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ManzengGoodVo implements Serializable {

    private String id;

    private String activityId;

    private String ruleId;

    private String goodSkuId;

    private BigDecimal maxNum;

    private BigDecimal currNum;

    private BigDecimal zengNum;

    private Integer sort;

    private String isValid;

    private String delFlag;

    private Date dateCreated;

    private Date lastUpdated;

    private BaseGoodVo good;

    private String goodImgUrl;

    public String getGoodImgUrl() {
        return goodImgUrl;
    }

    public void setGoodImgUrl(String goodImgUrl) {
        this.goodImgUrl = goodImgUrl;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId == null ? null : ruleId.trim();
    }

    public String getGoodSkuId() {
        return goodSkuId;
    }

    public void setGoodSkuId(String goodSkuId) {
        this.goodSkuId = goodSkuId == null ? null : goodSkuId.trim();
    }

    public BigDecimal getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(BigDecimal maxNum) {
        this.maxNum = maxNum;
    }

    public BigDecimal getCurrNum() {
        return currNum;
    }

    public void setCurrNum(BigDecimal currNum) {
        this.currNum = currNum;
    }

    public BigDecimal getZengNum() {
        return zengNum;
    }

    public void setZengNum(BigDecimal zengNum) {
        this.zengNum = zengNum;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
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

    public BaseGoodVo getGood() {
        return good;
    }

    public void setGood(BaseGoodVo good) {
        this.good = good;
    }
}