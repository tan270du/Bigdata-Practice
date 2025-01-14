package pub.makers.shop.promotion.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by devpc on 2017/8/19.
 */
public class SaleActivityGoodPram implements Serializable {
    //传入ID
    private String ids;

    /** 活动名称 */
    private String activityName;

    /**  */
    private String goodId;

    /** sku编码 */
    private String goodSkuId;

    private String goodTitle;

    /** 是否有效 禁用或启用 */
    private String isValid;

    /**判断是商城还是采购*/
    private String orderBizType;
   /** 进行中的活动 now /未开始的活动 wait /已结束的活动 over */
    private String activityHaveStart;
    /**现在时间**/
    private String nowDate;

    public String getNowDate() {
        if (nowDate == null)
            nowDate = new Date().toString();
        return nowDate;
    }

    public void setNowDate(String nowDate) {
        if (nowDate == null)
            nowDate = new Date().toString();
        this.nowDate = nowDate;
    }

    public String getActivityHaveStart() {
        return activityHaveStart;
    }

    public void setActivityHaveStart(String activityHaveStart) {
        this.activityHaveStart = activityHaveStart;
    }

    public String getGoodTitle() {
        return goodTitle;
    }

    public void setGoodTitle(String goodTitle) {
        this.goodTitle = goodTitle;
    }

    public String getOrderBizType() {
        return orderBizType;
    }

    public void setOrderBizType(String orderBizType) {
        this.orderBizType = orderBizType;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public String getGoodSkuId() {
        return goodSkuId;
    }

    public void setGoodSkuId(String goodSkuId) {
        this.goodSkuId = goodSkuId;
    }
}
