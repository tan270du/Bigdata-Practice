package com.data.data.hmly.service.ctripflight.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "ctrip_flt_order_flight")
public class FltOrderFlight extends com.framework.hibernate.util.Entity{
	@Id
	@Column(name = "id", length = 11)
	private Integer id;
	@Column(name = "orderid")
	private Integer orderId;
	@Column(name = "flightid")
	private Integer flightId;
	
	@Column(name = "createBy")
	private Long createBy;
	@Column(name = "createTime")
	private Date createTime;
	@Column(name = "updateTime")
	private Date updateTime;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getCreateBy() {
		return createBy;
	}
	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getFlightId() {
		return flightId;
	}
	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}

}