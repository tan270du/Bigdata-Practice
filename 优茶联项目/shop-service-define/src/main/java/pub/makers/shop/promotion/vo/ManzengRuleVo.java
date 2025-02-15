package pub.makers.shop.promotion.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by dy on 2017/8/22.
 */
public class ManzengRuleVo implements Serializable, Cloneable {

    private String id;

    private String activityId;

    private BigDecimal man;

    private BigDecimal jianNum;

    private String jianFlag;

    private Integer zengNum;

    private String zengFlag;

    private String intro;

    private Integer sort;

    private String isValid;

    private String delFlag;

    private Date dateCreated;

    private Date lastUpdated;

    private List<ManzengGoodVo> goodList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public BigDecimal getMan() {
        return man;
    }

    public void setMan(BigDecimal man) {
        this.man = man;
    }

    public BigDecimal getJianNum() {
        return jianNum;
    }

    public void setJianNum(BigDecimal jianNum) {
        this.jianNum = jianNum;
    }

    public String getJianFlag() {
        return jianFlag;
    }

    public void setJianFlag(String jianFlag) {
        this.jianFlag = jianFlag;
    }

    public Integer getZengNum() {
        return zengNum;
    }

    public void setZengNum(Integer zengNum) {
        this.zengNum = zengNum;
    }

    public String getZengFlag() {
        return zengFlag;
    }

    public void setZengFlag(String zengFlag) {
        this.zengFlag = zengFlag;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
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
        this.isValid = isValid;
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

    public List<ManzengGoodVo> getGoodList() {
        return goodList;
    }

    public void setGoodList(List<ManzengGoodVo> goodList) {
        this.goodList = goodList;
    }

    @Override
    public ManzengRuleVo clone() throws CloneNotSupportedException {
        return (ManzengRuleVo) super.clone();
    }
}
