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
 * <p>Java class for ContactInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConfirmOption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MobilePhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactTel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ForeignMobile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MobileCountryFix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactEMail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactFax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfoType", propOrder = {
    "contactName",
    "confirmOption",
    "mobilePhone",
    "contactTel",
    "foreignMobile",
    "mobileCountryFix",
    "contactEMail",
    "contactFax"
})
public class FltOrderContactInfoType {

    @XmlElement(name = "ContactName", required = true)
    protected String contactName;
    @XmlElement(name = "ConfirmOption", required = true)
    protected String confirmOption;
    @XmlElement(name = "MobilePhone", required = true)
    protected String mobilePhone;
    @XmlElement(name = "ContactTel", required = true)
    protected String contactTel;
    @XmlElement(name = "ForeignMobile", required = true)
    protected String foreignMobile;
    @XmlElement(name = "MobileCountryFix", required = true)
    protected String mobileCountryFix;
    @XmlElement(name = "ContactEMail", required = true)
    protected String contactEMail;
    @XmlElement(name = "ContactFax", required = true)
    protected String contactFax;

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the confirmOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmOption() {
        return confirmOption;
    }

    /**
     * Sets the value of the confirmOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmOption(String value) {
        this.confirmOption = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the contactTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTel() {
        return contactTel;
    }

    /**
     * Sets the value of the contactTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTel(String value) {
        this.contactTel = value;
    }

    /**
     * Gets the value of the foreignMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignMobile() {
        return foreignMobile;
    }

    /**
     * Sets the value of the foreignMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignMobile(String value) {
        this.foreignMobile = value;
    }

    /**
     * Gets the value of the mobileCountryFix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileCountryFix() {
        return mobileCountryFix;
    }

    /**
     * Sets the value of the mobileCountryFix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileCountryFix(String value) {
        this.mobileCountryFix = value;
    }

    /**
     * Gets the value of the contactEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEMail() {
        return contactEMail;
    }

    /**
     * Sets the value of the contactEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEMail(String value) {
        this.contactEMail = value;
    }

    /**
     * Gets the value of the contactFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFax() {
        return contactFax;
    }

    /**
     * Sets the value of the contactFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFax(String value) {
        this.contactFax = value;
    }

}