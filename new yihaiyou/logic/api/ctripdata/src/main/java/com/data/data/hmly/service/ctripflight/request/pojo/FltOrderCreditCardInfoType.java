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
 * <p>Java class for CreditCardInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardInfoID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CreditCardType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CreditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Validity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CardBin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CardHolder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdCardType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CVV2No" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AgreementCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Eid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsClient" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CCardPayFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CCardPayFeeRate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Exponent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardInfoType", propOrder = {
    "cardInfoID",
    "creditCardType",
    "creditCardNumber",
    "validity",
    "cardBin",
    "cardHolder",
    "idCardType",
    "idNumber",
    "cvv2No",
    "agreementCode",
    "eid",
    "remark",
    "isClient",
    "cCardPayFee",
    "cCardPayFeeRate",
    "exponent",
    "exchangeRate",
    "fAmount"
})
public class FltOrderCreditCardInfoType {

    @XmlElement(name = "CardInfoID", required = true)
    protected String cardInfoID;
    @XmlElement(name = "CreditCardType", required = true)
    protected String creditCardType;
    @XmlElement(name = "CreditCardNumber", required = true)
    protected String creditCardNumber;
    @XmlElement(name = "Validity", required = true)
    protected String validity;
    @XmlElement(name = "CardBin", required = true)
    protected String cardBin;
    @XmlElement(name = "CardHolder", required = true)
    protected String cardHolder;
    @XmlElement(name = "IdCardType", required = true)
    protected String idCardType;
    @XmlElement(name = "IdNumber", required = true)
    protected String idNumber;
    @XmlElement(name = "CVV2No", required = true)
    protected String cvv2No;
    @XmlElement(name = "AgreementCode", required = true)
    protected String agreementCode;
    @XmlElement(name = "Eid", required = true)
    protected String eid;
    @XmlElement(name = "Remark", required = true)
    protected String remark;
    @XmlElement(name = "IsClient", required = true)
    protected String isClient;
    @XmlElement(name = "CCardPayFee", required = true)
    protected String cCardPayFee;
    @XmlElement(name = "CCardPayFeeRate", required = true)
    protected String cCardPayFeeRate;
    @XmlElement(name = "Exponent", required = true)
    protected String exponent;
    @XmlElement(name = "ExchangeRate", required = true)
    protected String exchangeRate;
    @XmlElement(name = "FAmount", required = true)
    protected String fAmount;

    /**
     * Gets the value of the cardInfoID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardInfoID() {
        return cardInfoID;
    }

    /**
     * Sets the value of the cardInfoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardInfoID(String value) {
        this.cardInfoID = value;
    }

    /**
     * Gets the value of the creditCardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardType() {
        return creditCardType;
    }

    /**
     * Sets the value of the creditCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardType(String value) {
        this.creditCardType = value;
    }

    /**
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value) {
        this.creditCardNumber = value;
    }

    /**
     * Gets the value of the validity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidity() {
        return validity;
    }

    /**
     * Sets the value of the validity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidity(String value) {
        this.validity = value;
    }

    /**
     * Gets the value of the cardBin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBin() {
        return cardBin;
    }

    /**
     * Sets the value of the cardBin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBin(String value) {
        this.cardBin = value;
    }

    /**
     * Gets the value of the cardHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolder() {
        return cardHolder;
    }

    /**
     * Sets the value of the cardHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolder(String value) {
        this.cardHolder = value;
    }

    /**
     * Gets the value of the idCardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCardType() {
        return idCardType;
    }

    /**
     * Sets the value of the idCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCardType(String value) {
        this.idCardType = value;
    }

    /**
     * Gets the value of the idNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * Sets the value of the idNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNumber(String value) {
        this.idNumber = value;
    }

    /**
     * Gets the value of the cvv2No property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVV2No() {
        return cvv2No;
    }

    /**
     * Sets the value of the cvv2No property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVV2No(String value) {
        this.cvv2No = value;
    }

    /**
     * Gets the value of the agreementCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementCode() {
        return agreementCode;
    }

    /**
     * Sets the value of the agreementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementCode(String value) {
        this.agreementCode = value;
    }

    /**
     * Gets the value of the eid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEid() {
        return eid;
    }

    /**
     * Sets the value of the eid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEid(String value) {
        this.eid = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the isClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsClient() {
        return isClient;
    }

    /**
     * Sets the value of the isClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsClient(String value) {
        this.isClient = value;
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
     * Gets the value of the cCardPayFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCardPayFeeRate() {
        return cCardPayFeeRate;
    }

    /**
     * Sets the value of the cCardPayFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCardPayFeeRate(String value) {
        this.cCardPayFeeRate = value;
    }

    /**
     * Gets the value of the exponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExponent() {
        return exponent;
    }

    /**
     * Sets the value of the exponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExponent(String value) {
        this.exponent = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRate(String value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the fAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAmount() {
        return fAmount;
    }

    /**
     * Sets the value of the fAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAmount(String value) {
        this.fAmount = value;
    }

}
