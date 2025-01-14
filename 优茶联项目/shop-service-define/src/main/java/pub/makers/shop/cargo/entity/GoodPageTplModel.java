package pub.makers.shop.cargo.entity;

import pub.makers.shop.cargo.vo.GoodPageTplModelSortVo;
import pub.makers.shop.tradeGoods.entity.Image;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by daiwenfa on 2017/6/7.
 */
public class GoodPageTplModel implements Serializable {
    private Long id;
    private Long tplId;
    private String tplClassCode;
    private String postCode;
    private String modelName;
    private String modelType;
    private String goodIds;
    private String adUrl;
    private String adImgId;
    private Long sort;
    private Long createBy;
    private String isValid;
    private String delFlag;
    private Date dateCreated;
    private Date lastUpdated;
    private String detail;
    private String postName;
    private String linkDescribe;

    private List<Image> Image;
    private List<GoodPageTplModelSort> goodPageTplModelSortList;
    private List<GoodPageTplModelSortVo> goodPageTplModelSortVoList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTplId() {
        return tplId;
    }

    public void setTplId(Long tplId) {
        this.tplId = tplId;
    }

    public String getTplClassCode() {
        return tplClassCode;
    }

    public void setTplClassCode(String tplClassCode) {
        this.tplClassCode = tplClassCode;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getGoodIds() {
        return goodIds;
    }

    public void setGoodIds(String goodIds) {
        this.goodIds = goodIds;
    }

    public String getAdUrl() {
        return adUrl;
    }

    public void setAdUrl(String adUrl) {
        this.adUrl = adUrl;
    }

    public String getAdImgId() {
        return adImgId;
    }

    public void setAdImgId(String adImgId) {
        this.adImgId = adImgId;
    }

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public List<Image> getImage() {
        return Image;
    }

    public void setImage(List<Image> image) {
        Image = image;
    }

    public String getLinkDescribe() {
        return linkDescribe;
    }

    public void setLinkDescribe(String linkDescribe) {
        this.linkDescribe = linkDescribe;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public List<GoodPageTplModelSort> getGoodPageTplModelSortList() {
        return goodPageTplModelSortList;
    }

    public void setGoodPageTplModelSortList(List<GoodPageTplModelSort> goodPageTplModelSortList) {
        this.goodPageTplModelSortList = goodPageTplModelSortList;
    }

    public List<GoodPageTplModelSortVo> getGoodPageTplModelSortVoList() {
        return goodPageTplModelSortVoList;
    }

    public void setGoodPageTplModelSortVoList(List<GoodPageTplModelSortVo> goodPageTplModelSortVoList) {
        this.goodPageTplModelSortVoList = goodPageTplModelSortVoList;
    }
}
