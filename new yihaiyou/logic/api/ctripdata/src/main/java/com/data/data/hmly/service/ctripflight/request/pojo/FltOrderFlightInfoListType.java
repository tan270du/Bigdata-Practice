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
 * <p>Java class for FlightInfoListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightInfoListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightInfoRequest" type="{}FlightInfoRequestType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightInfoListType", propOrder = {
    "flightInfoRequest"
})
public class FltOrderFlightInfoListType {

    @XmlElement(name = "FlightInfoRequest", required = true)
    protected FltOrderFlightInfoRequestType flightInfoRequest;

    /**
     * Gets the value of the flightInfoRequest property.
     * 
     * @return
     *     possible object is
     *     {@link FltOrderFlightInfoRequestType }
     *     
     */
    public FltOrderFlightInfoRequestType getFlightInfoRequest() {
        return flightInfoRequest;
    }

    /**
     * Sets the value of the flightInfoRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltOrderFlightInfoRequestType }
     *     
     */
    public void setFlightInfoRequest(FltOrderFlightInfoRequestType value) {
        this.flightInfoRequest = value;
    }

}
