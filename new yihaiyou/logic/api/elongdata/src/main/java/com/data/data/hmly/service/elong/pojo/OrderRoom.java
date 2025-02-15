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
import java.util.List;


/**
 * <p>Java class for OrderRoom complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="OrderRoom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Customers" type="{}ArrayOfCustomerForOrder" minOccurs="0"/>
 *         &lt;element name="RoomNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderRoom", propOrder = {
        "customers",
        "roomNo"
})
public class OrderRoom {

    @JSONField(name = "Customers")
    protected List<CustomerForOrder> customers;
    @JSONField(name = "RoomNo")
    protected String roomNo;

    /**
     * Gets the value of the customers property.
     *
     * @return possible object is
     * {@link List <CustomerForOrder> }
     */
    public List<CustomerForOrder> getCustomers() {
        return customers;
    }

    /**
     * Sets the value of the customers property.
     *
     * @param value allowed object is
     *              {@link List <CustomerForOrder> }
     */
    public void setCustomers(List<CustomerForOrder> value) {
        this.customers = value;
    }

    /**
     * Gets the value of the roomNo property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * Sets the value of the roomNo property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRoomNo(String value) {
        this.roomNo = value;
    }

}
