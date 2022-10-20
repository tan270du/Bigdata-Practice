//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.07 at 05:05:05 PM CST 
//


package com.data.data.hmly.service.ctripflight.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ctrip_flt_airline_info")
public class AirlineInfo extends com.framework.hibernate.util.Entity{

	private static final long serialVersionUID = -2996522995238348090L;
	@Id
	@Column(name = "id", length = 11)
	private Integer id;
	
    @Column(name = "airLine")
    private String airLine;
    @Column(name = "airLineCode")
    private String airLineCode;
    @Column(name = "airLineName")
    private String airLineName;
    @Column(name = "shortName")
    private String shortName;
    @Column(name = "groupId")
    private Integer groupId;
    @Column(name = "strictType")
    private String strictType;
    @Column(name = "addonPriceprivate")
    private String addonPriceprivate;
    @Column(name = "isSupportAirPlus")
    private boolean isSupportAirPlus;
    @Column(name = "onlineCheckinUrl")
    private String onlineCheckinUrl;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAirLine() {
		return airLine;
	}
	public void setAirLine(String airLine) {
		this.airLine = airLine;
	}
	public String getAirLineCode() {
		return airLineCode;
	}
	public void setAirLineCode(String airLineCode) {
		this.airLineCode = airLineCode;
	}
	public String getAirLineName() {
		return airLineName;
	}
	public void setAirLineName(String airLineName) {
		this.airLineName = airLineName;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getStrictType() {
		return strictType;
	}
	public void setStrictType(String strictType) {
		this.strictType = strictType;
	}
	public String getAddonPriceprivate() {
		return addonPriceprivate;
	}
	public void setAddonPriceprivate(String addonPriceprivate) {
		this.addonPriceprivate = addonPriceprivate;
	}
	public String getOnlineCheckinUrl() {
		return onlineCheckinUrl;
	}
	public void setOnlineCheckinUrl(String onlineCheckinUrl) {
		this.onlineCheckinUrl = onlineCheckinUrl;
	}
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	public boolean isSupportAirPlus() {
		return isSupportAirPlus;
	}
	public void setSupportAirPlus(boolean isSupportAirPlus) {
		this.isSupportAirPlus = isSupportAirPlus;
	}

}