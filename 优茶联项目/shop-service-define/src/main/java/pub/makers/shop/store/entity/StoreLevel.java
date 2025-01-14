package pub.makers.shop.store.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by dy on 2017/4/14.
 */
public class StoreLevel implements Serializable {

    private Long levelId;

    private Long traId;

    private String name;

    private Long statue;

    private Date createTime;

    private Long createBy;

    private Date updateTime;

    private Long updateBy;

    private String storePro;

    private Integer sort;

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Long getLevelId() {
        return levelId;
    }

    public void setLevelId(Long levelId) {
        this.levelId = levelId;
    }

    public Long getTraId() {
        return traId;
    }

    public void setTraId(Long traId) {
        this.traId = traId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getStatue() {
        return statue;
    }

    public void setStatue(Long statue) {
        this.statue = statue;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public String getStorePro() {
        return storePro;
    }

    public void setStorePro(String storePro) {
        this.storePro = storePro == null ? null : storePro.trim();
    }

}
