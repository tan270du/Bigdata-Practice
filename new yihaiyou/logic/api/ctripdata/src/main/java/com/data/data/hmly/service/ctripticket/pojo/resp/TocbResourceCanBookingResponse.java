//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 08:22:49 PM CST 
//


package com.data.data.hmly.service.ctripticket.pojo.resp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ResourceCanBookingResponseItemList"/>
 *         &lt;element ref="{}Code"/>
 *         &lt;element ref="{}FailPocessPoint"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "resourceCanBookingResponseItemList",
    "code",
    "failPocessPoint"
})
@XmlRootElement(name = "ResourceCanBookingResponse")
public class TocbResourceCanBookingResponse {

    @XmlElement(name = "ResourceCanBookingResponseItemList", required = true)
    protected TocbResourceCanBookingResponseItemList resourceCanBookingResponseItemList;
    @XmlElement(name = "Code")
    protected boolean code;
    @XmlElement(name = "FailPocessPoint", required = true)
    protected TocbFailPocessPoint failPocessPoint;

    /**
     * Gets the value of the resourceCanBookingResponseItemList property.
     * 
     * @return
     *     possible object is
     *     {@link TocbResourceCanBookingResponseItemList }
     *     
     */
    public TocbResourceCanBookingResponseItemList getResourceCanBookingResponseItemList() {
        return resourceCanBookingResponseItemList;
    }

    /**
     * Sets the value of the resourceCanBookingResponseItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TocbResourceCanBookingResponseItemList }
     *     
     */
    public void setResourceCanBookingResponseItemList(TocbResourceCanBookingResponseItemList value) {
        this.resourceCanBookingResponseItemList = value;
    }

    /**
     * Gets the value of the code property.
     * 
     */
    public boolean isCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     */
    public void setCode(boolean value) {
        this.code = value;
    }

    /**
     * Gets the value of the failPocessPoint property.
     * 
     * @return
     *     possible object is
     *     {@link TocbFailPocessPoint }
     *     
     */
    public TocbFailPocessPoint getFailPocessPoint() {
        return failPocessPoint;
    }

    /**
     * Sets the value of the failPocessPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link TocbFailPocessPoint }
     *     
     */
    public void setFailPocessPoint(TocbFailPocessPoint value) {
        this.failPocessPoint = value;
    }

}
