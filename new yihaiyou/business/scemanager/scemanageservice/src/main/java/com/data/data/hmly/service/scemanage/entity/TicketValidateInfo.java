package com.data.data.hmly.service.scemanage.entity;

// Generated 2015-10-22 10:47:22 by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.data.data.hmly.service.entity.SysUnit;
import com.data.data.hmly.service.entity.SysUser;

/**
 * Linedays generated by hbm2java
 */
@Entity
@Table(name = "tb_ticket_validate_info")
public class TicketValidateInfo extends com.framework.hibernate.util.Entity implements java.io.Serializable {
	private static final long serialVersionUID = -3872525549480231213L;
	
//	  `id` bigint(20) NOT NULL,
//	  `product_id` bigint(20) DEFAULT NULL COMMENT '门票编号',
//	  `product_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '门票名称',
//	  `customer_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '客户名称',
//	  `customer_phone` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '客户手机号',
//	  `amount` int(20) DEFAULT NULL COMMENT '数量',
//	  `origin` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '门票来源',
//	  `create_by` bigint(20) DEFAULT NULL COMMENT '操作人',
//	  `create_time` datetime DEFAULT NULL,
//	  `modify_time` datetime DEFAULT NULL,
	
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@Column(name = "product_id")
	private Long productId;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "customer_name")
	private String customerName;

	@Column(name = "customer_phone")
	private String customerPhone;

	@Column(name = "origin")
	private String origin;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "create_by")
    private SysUser user;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private SysUnit companyUnit;

	@Column(name = "create_time")
	private Date createTime;

	@Column(name = "modify_time")
	private Date modifyTime;
	
	@Column(name = "amount")
	private Integer amount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}


	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public SysUser getUser() {
		return user;
	}

	public void setUser(SysUser user) {
		this.user = user;
	}

	public SysUnit getCompanyUnit() {
		return companyUnit;
	}

	public void setCompanyUnit(SysUnit companyUnit) {
		this.companyUnit = companyUnit;
	}
	
	
	
	
	

}
