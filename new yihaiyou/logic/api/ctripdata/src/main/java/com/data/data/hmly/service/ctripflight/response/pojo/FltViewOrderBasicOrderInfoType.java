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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasicOrderInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicOrderInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrderDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Emoney" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ActualAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CCardPayFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServerFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProcessStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SendTicketFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FlightWay" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SendTicketCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GetTicketWay" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EAccountAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Persons" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InsuranceFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsEnglish" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FlightOrderClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicOrderInfoType", propOrder = {
    "orderDate",
    "orderID",
    "orderDesc",
    "orderStatus",
    "amount",
    "emoney",
    "actualAmount",
    "cCardPayFee",
    "serverFee",
    "processStatus",
    "sendTicketFee",
    "flightWay",
    "sendTicketCity",
    "getTicketWay",
    "eAccountAmount",
    "persons",
    "insuranceFee",
    "isEnglish",
    "flightOrderClass"
})
public class FltViewOrderBasicOrderInfoType {

    @XmlElement(name = "OrderDate", required = true)
    protected String orderDate;
    @XmlElement(name = "OrderID", required = true)
    protected String orderID;
    @XmlElement(name = "OrderDesc", required = true)
    protected String orderDesc;
    @XmlElement(name = "OrderStatus", required = true)
    protected String orderStatus;
    @XmlElement(name = "Amount", required = true)
    protected String amount;
    @XmlElement(name = "Emoney", required = true)
    protected String emoney;
    @XmlElement(name = "ActualAmount", required = true)
    protected String actualAmount;
    @XmlElement(name = "CCardPayFee", required = true)
    protected String cCardPayFee;
    @XmlElement(name = "ServerFee", required = true)
    protected String serverFee;
    @XmlElement(name = "ProcessStatus", required = true)
    protected String processStatus;
    @XmlElement(name = "SendTicketFee", required = true)
    protected String sendTicketFee;
    @XmlElement(name = "FlightWay", required = true)
    protected String flightWay;
    @XmlElement(name = "SendTicketCity", required = true)
    protected String sendTicketCity;
    @XmlElement(name = "GetTicketWay", required = true)
    protected String getTicketWay;
    @XmlElement(name = "EAccountAmount", required = true)
    protected String eAccountAmount;
    @XmlElement(name = "Persons", required = true)
    protected String persons;
    @XmlElement(name = "InsuranceFee", required = true)
    protected String insuranceFee;
    @XmlElement(name = "IsEnglish", required = true)
    protected String isEnglish;
    @XmlElement(name = "FlightOrderClass", required = true)
    protected String flightOrderClass;

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDate(String value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the orderDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDesc() {
        return orderDesc;
    }

    /**
     * Sets the value of the orderDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDesc(String value) {
        this.orderDesc = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the emoney property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmoney() {
        return emoney;
    }

    /**
     * Sets the value of the emoney property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmoney(String value) {
        this.emoney = value;
    }

    /**
     * Gets the value of the actualAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualAmount() {
        return actualAmount;
    }

    /**
     * Sets the value of the actualAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualAmount(String value) {
        this.actualAmount = value;
    }

    /**
     * Gets the value of the cCardPayFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCardPayFee() {
        return cCardPayFee;
    }

    /**
     * Sets the value of the cCardPayFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCardPayFee(String value) {
        this.cCardPayFee = value;
    }

    /**
     * Gets the value of the serverFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerFee() {
        return serverFee;
    }

    /**
     * Sets the value of the serverFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerFee(String value) {
        this.serverFee = value;
    }

    /**
     * Gets the value of the processStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessStatus() {
        return processStatus;
    }

    /**
     * Sets the value of the processStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessStatus(String value) {
        this.processStatus = value;
    }

    /**
     * Gets the value of the sendTicketFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendTicketFee() {
        return sendTicketFee;
    }

    /**
     * Sets the value of the sendTicketFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendTicketFee(String value) {
        this.sendTicketFee = value;
    }

    /**
     * Gets the value of the flightWay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightWay() {
        return flightWay;
    }

    /**
     * Sets the value of the flightWay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightWay(String value) {
        this.flightWay = value;
    }

    /**
     * Gets the value of the sendTicketCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendTicketCity() {
        return sendTicketCity;
    }

    /**
     * Sets the value of the sendTicketCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendTicketCity(String value) {
        this.sendTicketCity = value;
    }

    /**
     * Gets the value of the getTicketWay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetTicketWay() {
        return getTicketWay;
    }

    /**
     * Sets the value of the getTicketWay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetTicketWay(String value) {
        this.getTicketWay = value;
    }

    /**
     * Gets the value of the eAccountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAccountAmount() {
        return eAccountAmount;
    }

    /**
     * Sets the value of the eAccountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAccountAmount(String value) {
        this.eAccountAmount = value;
    }

    /**
     * Gets the value of the persons property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersons() {
        return persons;
    }

    /**
     * Sets the value of the persons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersons(String value) {
        this.persons = value;
    }

    /**
     * Gets the value of the insuranceFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceFee() {
        return insuranceFee;
    }

    /**
     * Sets the value of the insuranceFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceFee(String value) {
        this.insuranceFee = value;
    }

    /**
     * Gets the value of the isEnglish property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsEnglish() {
        return isEnglish;
    }

    /**
     * Sets the value of the isEnglish property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsEnglish(String value) {
        this.isEnglish = value;
    }

    /**
     * Gets the value of the flightOrderClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightOrderClass() {
        return flightOrderClass;
    }

    /**
     * Sets the value of the flightOrderClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightOrderClass(String value) {
        this.flightOrderClass = value;
    }

}