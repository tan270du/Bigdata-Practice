//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 05:35:30 PM CST 
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
 *         &lt;element ref="{}TicketPriceSearchResponseDetail"/>
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
    "ticketPriceSearchResponseDetail"
})
@XmlRootElement(name = "ResourcePriceAndInventoryList")
public class TrpaiResourcePriceAndInventoryList {

    @XmlElement(name = "TicketPriceSearchResponseDetail", required = true)
    protected TrpaiTicketPriceSearchResponseDetail ticketPriceSearchResponseDetail;

    /**
     * Gets the value of the ticketPriceSearchResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TrpaiTicketPriceSearchResponseDetail }
     *     
     */
    public TrpaiTicketPriceSearchResponseDetail getTicketPriceSearchResponseDetail() {
        return ticketPriceSearchResponseDetail;
    }

    /**
     * Sets the value of the ticketPriceSearchResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrpaiTicketPriceSearchResponseDetail }
     *     
     */
    public void setTicketPriceSearchResponseDetail(TrpaiTicketPriceSearchResponseDetail value) {
        this.ticketPriceSearchResponseDetail = value;
    }

}