package pub.makers.shop.tradeOrder.vo;

import pub.makers.shop.invoice.vo.InvoiceVo;
import pub.makers.shop.promotion.vo.PromotionActivityVo;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by dy on 2017/4/14.
 */
public class IndentU8Vo extends IndentVo {

    String shopCode;

    String shopName;

    String departmentCode;

    BigDecimal amount;

    private String orderType;

    private String goodSkuCode;

    public String getGoodSkuCode() {
        return goodSkuCode;
    }

    public void setGoodSkuCode(String goodSkuCode) {
        this.goodSkuCode = goodSkuCode;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    @Override
    public void setActivityList(List<PromotionActivityVo> activityList) {

    }

    @Override
    public InvoiceVo getInvoiceVo() {
        return null;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

}
