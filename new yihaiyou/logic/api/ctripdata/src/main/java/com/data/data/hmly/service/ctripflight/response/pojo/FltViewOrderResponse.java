//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.06 at 12:44:44 AM CST 
//


package com.data.data.hmly.service.ctripflight.response.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{}HeaderType"/>
 *         &lt;element name="FltViewOrderResponse" type="{}FltViewOrderResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", propOrder = {
    "header",
    "fltViewOrderResponse"
})
@XmlRootElement(name="Response")
public class FltViewOrderResponse {

    @XmlElement(name = "Header", required = true)
    protected FltViewOrderHeaderType header;
    @XmlElement(name = "FltViewOrderResponse", required = true)
    protected FltViewOrderResponseType fltViewOrderResponse;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link FltViewOrderHeaderType }
     *     
     */
    public FltViewOrderHeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltViewOrderHeaderType }
     *     
     */
    public void setHeader(FltViewOrderHeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the fltViewOrderResponse property.
     * 
     * @return
     *     possible object is
     *     {@link FltViewOrderResponseType }
     *     
     */
    public FltViewOrderResponseType getFltViewOrderResponse() {
        return fltViewOrderResponse;
    }

    /**
     * Sets the value of the fltViewOrderResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltViewOrderResponseType }
     *     
     */
    public void setFltViewOrderResponse(FltViewOrderResponseType value) {
        this.fltViewOrderResponse = value;
    }

}
