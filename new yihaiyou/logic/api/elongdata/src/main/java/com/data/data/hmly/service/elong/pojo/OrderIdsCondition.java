//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 10:34:35 AM CST 
//


package com.data.data.hmly.service.elong.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderIdsCondition complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="OrderIdsCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AffiliateConfirmationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderIdsCondition", propOrder = {
        "orderId",
        "affiliateConfirmationId"
})
public class OrderIdsCondition {

    @JSONField(name = "OrderId")
    protected long orderId;
    @JSONField(name = "AffiliateConfirmationId")
    protected String affiliateConfirmationId;

    /**
     * Gets the value of the orderId property.
     */
    public long getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     */
    public void setOrderId(long value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the affiliateConfirmationId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAffiliateConfirmationId() {
        return affiliateConfirmationId;
    }

    /**
     * Sets the value of the affiliateConfirmationId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAffiliateConfirmationId(String value) {
        this.affiliateConfirmationId = value;
    }

}
