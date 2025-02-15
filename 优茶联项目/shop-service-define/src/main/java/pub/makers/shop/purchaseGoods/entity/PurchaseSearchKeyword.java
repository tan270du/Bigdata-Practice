package pub.makers.shop.purchaseGoods.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by kok on 2017/6/23.
 */
public class PurchaseSearchKeyword implements Serializable {
    private String id;
    private String keyword; //关键词
    private String linkType; // 关联类型（good商品/classify分类）
    private String linkId; // 关联id
    private String linkSkuId; // 关联skuid
    private Integer sort; // 排序
    private Date dateCreated; // 创建时间
    private Date lastUpdated; // 更新时间
    private String isValid; // 是否有效
    private String delFlag; // 删除状态
    private String linkDescribe;//链接详情
    private String platform;//平台

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    public String getLinkSkuId() {
        return linkSkuId;
    }

    public void setLinkSkuId(String linkSkuId) {
        this.linkSkuId = linkSkuId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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

    public String getLinkDescribe() {
        return linkDescribe;
    }

    public void setLinkDescribe(String linkDescribe) {
        this.linkDescribe = linkDescribe;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
