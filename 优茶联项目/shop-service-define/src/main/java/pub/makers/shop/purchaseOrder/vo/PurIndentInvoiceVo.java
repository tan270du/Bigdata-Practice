package pub.makers.shop.purchaseOrder.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by dy on 2017/5/20.
 */
public class PurIndentInvoiceVo implements Serializable {

    private String orderNo;

    private String receiver;

    private String receiverPhone;

    private Date createTime;

    private Integer number;

    private String invoiceName;

    private String invoiceContent;

    private Integer indentStatus;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }

    public String getInvoiceContent() {
        return invoiceContent;
    }

    public void setInvoiceContent(String invoiceContent) {
        this.invoiceContent = invoiceContent;
    }

    public Integer getIndentStatus() {
        return indentStatus;
    }

    public void setIndentStatus(Integer indentStatus) {
        this.indentStatus = indentStatus;
    }
}
