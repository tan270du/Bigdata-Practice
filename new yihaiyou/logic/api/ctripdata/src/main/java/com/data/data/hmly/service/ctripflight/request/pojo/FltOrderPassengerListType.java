//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.05 at 01:48:07 PM CST 
//


package com.data.data.hmly.service.ctripflight.request.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassengerListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerRequest" type="{}PassengerRequestType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerListType", propOrder = {
    "passengerRequest"
})
public class FltOrderPassengerListType {

    @XmlElement(name = "PassengerRequest", required = true)
    protected FltOrderPassengerRequestType passengerRequest;

    /**
     * Gets the value of the passengerRequest property.
     * 
     * @return
     *     possible object is
     *     {@link FltOrderPassengerRequestType }
     *     
     */
    public FltOrderPassengerRequestType getPassengerRequest() {
        return passengerRequest;
    }

    /**
     * Sets the value of the passengerRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltOrderPassengerRequestType }
     *     
     */
    public void setPassengerRequest(FltOrderPassengerRequestType value) {
        this.passengerRequest = value;
    }

}