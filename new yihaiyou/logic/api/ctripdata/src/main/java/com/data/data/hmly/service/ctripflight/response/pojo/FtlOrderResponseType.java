//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.05 at 02:41:41 PM CST 
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
 *         &lt;element name="FltSaveOrderResponse" type="{}FltSaveOrderResponseType"/>
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
    "fltSaveOrderResponse"
})
@XmlRootElement(name="Response")
public class FtlOrderResponseType {

    @XmlElement(name = "Header", required = true)
    protected FtlOrderHeaderType header;
    @XmlElement(name = "FltSaveOrderResponse", required = true)
    protected FltSaveOrderResponseType fltSaveOrderResponse;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link FtlOrderHeaderType }
     *     
     */
    public FtlOrderHeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link FtlOrderHeaderType }
     *     
     */
    public void setHeader(FtlOrderHeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the fltSaveOrderResponse property.
     * 
     * @return
     *     possible object is
     *     {@link FltSaveOrderResponseType }
     *     
     */
    public FltSaveOrderResponseType getFltSaveOrderResponse() {
        return fltSaveOrderResponse;
    }

    /**
     * Sets the value of the fltSaveOrderResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltSaveOrderResponseType }
     *     
     */
    public void setFltSaveOrderResponse(FltSaveOrderResponseType value) {
        this.fltSaveOrderResponse = value;
    }

}
