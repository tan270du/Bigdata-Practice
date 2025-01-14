package pub.makers.shop.index.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by daiwenfa on 2017/6/16.
 */
public class IndexFloorVo implements Serializable {
    private String id;
    private String moduleName;//楼层名称
    private String classifyName;//商品分类
    private String leftAd;//左侧广告图
    private String adKey;//广告词关键字
    private String rtKey;//右上角关键字
    private Date dateCreated;//创建时间
    private Date lastUpdated;//更新时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }

    public String getLeftAd() {
        return leftAd;
    }

    public void setLeftAd(String leftAd) {
        this.leftAd = leftAd;
    }

    public String getAdKey() {
        return adKey;
    }

    public void setAdKey(String adKey) {
        this.adKey = adKey;
    }

    public String getRtKey() {
        return rtKey;
    }

    public void setRtKey(String rtKey) {
        this.rtKey = rtKey;
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
