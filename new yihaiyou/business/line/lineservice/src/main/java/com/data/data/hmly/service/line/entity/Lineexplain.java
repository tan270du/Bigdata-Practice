package com.data.data.hmly.service.line.entity;

// Generated 2015-10-15 11:48:07 by Hibernate Tools 4.0.0

import com.data.data.hmly.service.line.entity.enums.ChildStandardType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Lineexplain generated by hbm2java
 */
@Entity
@Table(name = "lineexplain")
public class Lineexplain extends com.framework.hibernate.util.Entity implements java.io.Serializable, Cloneable {
	private static final long serialVersionUID = -7504751354075423487L;
	private Long	id;
	private Long 	lineId;
	private String	defineTag;
	private String	lineLightPoint;
	private String	orderKnow;
	private String	orderContext;
	private String	tip;
	private String	tipContext;
	private String	remark;
	private String	safeDesc;
	private String	lineTeshe;
	private Long userId;
	private Date createTime;
	private Set<Linedays> linedays;

	private String receiveStandard; 	// 接待标准
	private String accrossScenic;	// 沿途景点
	private String tripNotice;	// 出行须知
	private String specialLimit;	// 特殊限制
	private String signWay;	// 签约方式
	private String payWay;		// 付款方式
	private String breachTip;	// 违约责任提示
	private Integer tripAgeMin;	// 出游人特殊年龄范围始
	private Integer tripAgeMax;	// 出游人特殊年龄范围止

    private ChildStandardType childStandardType; // 儿童价标准类型,
    private String childStartNum; // 儿童（年龄、身高）数值始,
    private String childEndNum; // 儿童（年龄、身高）数值止,
    private String childBed; // 儿童占床情况：不占床、-----,
    private String childOtherRemark; // 儿童交通、用餐等说明,
    private String childLongRemark; // 儿童长文本说明，当childStandardType为desc时使用,
	private String shoppingDesc;		// 购物项目

	public Lineexplain() {
	}

	public Lineexplain(String defineTag, String lineLightPoint, String orderKnow, String orderContext, String tip, String tipContext,
			String remark, String safeDesc, String lineTeshe) {
		this.defineTag = defineTag;
		this.lineLightPoint = lineLightPoint;
		this.orderKnow = orderKnow;
		this.orderContext = orderContext;
		this.tip = tip;
		this.tipContext = tipContext;
		this.remark = remark;
		this.safeDesc = safeDesc;
		this.lineTeshe = lineTeshe;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "lineId")
	public Long getLineId() {
		return this.lineId;
	}

	public void setLineId(Long lineId) {
		this.lineId = lineId;
	}

	@Column(name = "defineTag", length = 50)
	public String getDefineTag() {
		return defineTag;
	}

	public void setDefineTag(String defineTag) {
		this.defineTag = defineTag;
	}

	@Column(name = "lineLightPoint")
	public String getLineLightPoint() {
		return lineLightPoint;
	}

	public void setLineLightPoint(String lineLightPoint) {
		this.lineLightPoint = lineLightPoint;
	}

	@Column(name = "orderKnow", length = 50)
	public String getOrderKnow() {
		return orderKnow;
	}

	public void setOrderKnow(String orderKnow) {
		this.orderKnow = orderKnow;
	}

	@Column(name = "orderContext")
	public String getOrderContext() {
		return orderContext;
	}

	public void setOrderContext(String orderContext) {
		this.orderContext = orderContext;
	}

	@Column(name = "tip", length = 50)
	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	@Column(name = "tipContext")
	public String getTipContext() {
		return tipContext;
	}

	public void setTipContext(String tipContext) {
		this.tipContext = tipContext;
	}

	@Column(name = "remark", length = 1000)
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "safeDesc", length = 1000)
	public String getSafeDesc() {
		return safeDesc;
	}

	public void setSafeDesc(String safeDesc) {
		this.safeDesc = safeDesc;
	}

	@Column(name = "lineTeshe", length = 1000)
	public String getLineTeshe() {
		return lineTeshe;
	}

	public void setLineTeshe(String lineTeshe) {
		this.lineTeshe = lineTeshe;
	}

	@Column(name = "userId")
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createTime", length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@OneToMany(mappedBy = "lineexplain")
	@OrderBy("lineDay asc")
	public Set<Linedays> getLinedays() {
		return linedays;
	}

	public void setLinedays(Set<Linedays> linedays) {
		this.linedays = linedays;
	}

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getReceiveStandard() {
        return receiveStandard;
    }

    public void setReceiveStandard(String receiveStandard) {
        this.receiveStandard = receiveStandard;
    }

    public String getAccrossScenic() {
        return accrossScenic;
    }

    public void setAccrossScenic(String accrossScenic) {
        this.accrossScenic = accrossScenic;
    }

    public String getTripNotice() {
        return tripNotice;
    }

    public void setTripNotice(String tripNotice) {
        this.tripNotice = tripNotice;
    }

    public String getSpecialLimit() {
        return specialLimit;
    }

    public void setSpecialLimit(String specialLimit) {
        this.specialLimit = specialLimit;
    }

    public String getSignWay() {
        return signWay;
    }

    public void setSignWay(String signWay) {
        this.signWay = signWay;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getBreachTip() {
        return breachTip;
    }

    public void setBreachTip(String breachTip) {
        this.breachTip = breachTip;
    }

    public Integer getTripAgeMin() {
        return tripAgeMin;
    }

    public void setTripAgeMin(Integer tripAgeMin) {
        this.tripAgeMin = tripAgeMin;
    }

    public Integer getTripAgeMax() {
        return tripAgeMax;
    }

    public void setTripAgeMax(Integer tripAgeMax) {
        this.tripAgeMax = tripAgeMax;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "childStandardType")
    public ChildStandardType getChildStandardType() {
        return childStandardType;
    }

    public void setChildStandardType(ChildStandardType childStandardType) {
        this.childStandardType = childStandardType;
    }

    public String getChildStartNum() {
        return childStartNum;
    }

    public void setChildStartNum(String childStartNum) {
        this.childStartNum = childStartNum;
    }

    public String getChildEndNum() {
        return childEndNum;
    }

    public void setChildEndNum(String childEndNum) {
        this.childEndNum = childEndNum;
    }

    public String getChildBed() {
        return childBed;
    }

    public void setChildBed(String childBed) {
        this.childBed = childBed;
    }

    public String getChildOtherRemark() {
        return childOtherRemark;
    }

    public void setChildOtherRemark(String childOtherRemark) {
        this.childOtherRemark = childOtherRemark;
    }

    public String getChildLongRemark() {
        return childLongRemark;
    }

    public void setChildLongRemark(String childLongRemark) {
        this.childLongRemark = childLongRemark;
    }

	@Override
	public Lineexplain clone() throws CloneNotSupportedException {
		return (Lineexplain) super.clone();
	}

	public String getShoppingDesc() {
		return shoppingDesc;
	}

	public void setShoppingDesc(String shoppingDesc) {
		this.shoppingDesc = shoppingDesc;
	}
}
