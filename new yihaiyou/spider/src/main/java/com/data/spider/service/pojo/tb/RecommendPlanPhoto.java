package com.data.spider.service.pojo.tb;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by Sane on 16/1/16.
 */
@Entity
@Table(name = "recommend_plan_photo")
public class RecommendPlanPhoto extends com.framework.hibernate.util.Entity {
    public RecommendPlanPhoto() {
    }

    public RecommendPlanPhoto(Long recplanId, Long recdayId, Long rectripId, String photoLarge, int width, int height) {
        this.recplanId = recplanId;
        this.recdayId = recdayId;
        this.rectripId = rectripId;
        this.photoLarge = photoLarge;
        this.width = width;
        this.height = height;
    }

    public RecommendPlanPhoto(String photoLarge, Long rectripId, Long recplanId, Long recdayId, int width, int height) {
        this.photoLarge = photoLarge;
        this.rectripId = rectripId;
        this.recplanId = recplanId;
        this.recdayId = recdayId;
        this.width = width;
        this.height = height;
    }

    private long id;
    private Long recplanId;
    private Long recdayId;
    private Long rectripId;
    private String photoLarge;
    private String photoMedium;
    private String photoSmall;
    private String description;
    private String modifyTime;
    private Timestamp createTime;
    private int width;
    private int height;

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "recplan_id", nullable = true)
    public Long getRecplanId() {
        return recplanId;
    }

    public void setRecplanId(Long recplanId) {
        this.recplanId = recplanId;
    }

    @Basic
    @Column(name = "recday_id", nullable = true)
    public Long getRecdayId() {
        return recdayId;
    }

    public void setRecdayId(Long recdayId) {
        this.recdayId = recdayId;
    }

    @Basic
    @Column(name = "rectrip_id", nullable = true)
    public Long getRectripId() {
        return rectripId;
    }

    public void setRectripId(Long rectripId) {
        this.rectripId = rectripId;
    }

    @Basic
    @Column(name = "photo_large", nullable = true, length = 200)
    public String getPhotoLarge() {
        return photoLarge;
    }

    public void setPhotoLarge(String photoLarge) {
        this.photoLarge = photoLarge;
    }

    @Basic
    @Column(name = "photo_medium", nullable = true, length = 200)
    public String getPhotoMedium() {
        return photoMedium;
    }

    public void setPhotoMedium(String photoMedium) {
        this.photoMedium = photoMedium;
    }

    @Basic
    @Column(name = "photo_small", nullable = true, length = 200)
    public String getPhotoSmall() {
        return photoSmall;
    }

    public void setPhotoSmall(String photoSmall) {
        this.photoSmall = photoSmall;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 1024)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "modify_time", nullable = true)
    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "width", nullable = false)
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Basic
    @Column(name = "height", nullable = false)
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RecommendPlanPhoto that = (RecommendPlanPhoto) o;

        if (id != that.id) return false;
        if (width != that.width) return false;
        if (height != that.height) return false;
        if (recplanId != null ? !recplanId.equals(that.recplanId) : that.recplanId != null) return false;
        if (recdayId != null ? !recdayId.equals(that.recdayId) : that.recdayId != null) return false;
        if (rectripId != null ? !rectripId.equals(that.rectripId) : that.rectripId != null) return false;
        if (photoLarge != null ? !photoLarge.equals(that.photoLarge) : that.photoLarge != null) return false;
        if (photoMedium != null ? !photoMedium.equals(that.photoMedium) : that.photoMedium != null) return false;
        if (photoSmall != null ? !photoSmall.equals(that.photoSmall) : that.photoSmall != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (modifyTime != null ? !modifyTime.equals(that.modifyTime) : that.modifyTime != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (recplanId != null ? recplanId.hashCode() : 0);
        result = 31 * result + (recdayId != null ? recdayId.hashCode() : 0);
        result = 31 * result + (rectripId != null ? rectripId.hashCode() : 0);
        result = 31 * result + (photoLarge != null ? photoLarge.hashCode() : 0);
        result = 31 * result + (photoMedium != null ? photoMedium.hashCode() : 0);
        result = 31 * result + (photoSmall != null ? photoSmall.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (modifyTime != null ? modifyTime.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + width;
        result = 31 * result + height;
        return result;
    }
}
