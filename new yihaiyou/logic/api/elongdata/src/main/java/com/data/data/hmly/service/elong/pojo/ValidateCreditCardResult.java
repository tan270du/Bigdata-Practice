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
 * <p>Java class for ValidateCreditCardResult complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ValidateCreditCardResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsNeedVerifyCode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateCreditCardResult", propOrder = {
        "IsValid",
        "IsNeedVerifyCode"
})
public class ValidateCreditCardResult {

    @JSONField(name = "IsValid")
    protected boolean IsValid;
    @JSONField(name = "IsNeedVerifyCode")
    protected boolean IsNeedVerifyCode;

    /**
     * Gets the value of the IsValid property.
     */
    public boolean isIsValid() {
        return IsValid;
    }

    /**
     * Sets the value of the IsValid property.
     */
    public void setIsValid(boolean value) {
        this.IsValid = value;
    }

    /**
     * Gets the value of the IsNeedVerifyCode property.
     */
    public boolean isIsNeedVerifyCode() {
        return IsNeedVerifyCode;
    }

    /**
     * Sets the value of the IsNeedVerifyCode property.
     */
    public void setIsNeedVerifyCode(boolean value) {
        this.IsNeedVerifyCode = value;
    }

}