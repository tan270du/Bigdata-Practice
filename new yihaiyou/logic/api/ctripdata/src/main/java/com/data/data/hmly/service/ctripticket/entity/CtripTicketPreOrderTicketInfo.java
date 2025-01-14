//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.04 at 11:28:15 AM CST 
//


package com.data.data.hmly.service.ctripticket.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

//@Entity
//@Table(name = "ctrip_ticket_preorder_ticketinfo")
public class CtripTicketPreOrderTicketInfo extends com.framework.hibernate.util.Entity {
	private static final long serialVersionUID = -4721924498569505170L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", length = 20)
	private Long	id;
	@Column(name = "price", length = 20, precision=2)
    private Integer price;
	@Column(name = "ticketResourceId", length = 11)
    private Integer ticketResourceId;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "useDate", length = 19)
	private Date useDate;
	@Column(name = "quantity", length = 11)
    private Integer quantity;
	@Column(name = "ticketType", length = 256)
    private String ticketType;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createTime", length = 19)
	private Date createTime;
	@Column(name = "ticketPreOrderId", length = 20)
    private Long ticketPreOrderId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getTicketResourceId() {
		return ticketResourceId;
	}
	public void setTicketResourceId(Integer ticketResourceId) {
		this.ticketResourceId = ticketResourceId;
	}
	public Date getUseDate() {
		return useDate;
	}
	public void setUseDate(Date useDate) {
		this.useDate = useDate;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getTicketType() {
		return ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Long getTicketPreOrderId() {
		return ticketPreOrderId;
	}
	public void setTicketPreOrderId(Long ticketPreOrderId) {
		this.ticketPreOrderId = ticketPreOrderId;
	}
	
}
