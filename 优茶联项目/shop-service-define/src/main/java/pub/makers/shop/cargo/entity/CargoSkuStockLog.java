package pub.makers.shop.cargo.entity;

import java.util.Date;

public class CargoSkuStockLog {
    private Long id;

    private Long cargoSkuId;

    private Integer outShelvesNo;

    private Integer onSalesNo;

    private Integer onPayNo;

    private Integer onSendNo;

    private Integer currStock;

    private Long inboundId;

    private Date createTime;

    private Long createBy;

    private Integer updateCount;

    private Integer updateStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCargoSkuId() {
        return cargoSkuId;
    }

    public void setCargoSkuId(Long cargoSkuId) {
        this.cargoSkuId = cargoSkuId;
    }

    public Integer getOutShelvesNo() {
        return outShelvesNo;
    }

    public void setOutShelvesNo(Integer outShelvesNo) {
        this.outShelvesNo = outShelvesNo;
    }

    public Integer getOnSalesNo() {
        return onSalesNo;
    }

    public void setOnSalesNo(Integer onSalesNo) {
        this.onSalesNo = onSalesNo;
    }

    public Integer getOnPayNo() {
        return onPayNo;
    }

    public void setOnPayNo(Integer onPayNo) {
        this.onPayNo = onPayNo;
    }

    public Integer getOnSendNo() {
        return onSendNo;
    }

    public void setOnSendNo(Integer onSendNo) {
        this.onSendNo = onSendNo;
    }

    public Long getInboundId() {
        return inboundId;
    }

    public void setInboundId(Long inboundId) {
        this.inboundId = inboundId;
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

    public Integer getUpdateCount() {
        return updateCount;
    }

    public void setUpdateCount(Integer updateCount) {
        this.updateCount = updateCount;
    }

    public Integer getUpdateStatus() {
        return updateStatus;
    }

    public void setUpdateStatus(Integer updateStatus) {
        this.updateStatus = updateStatus;
    }

    public Integer getCurrStock() {
        return currStock;
    }

    public void setCurrStock(Integer currStock) {
        this.currStock = currStock;
    }
}