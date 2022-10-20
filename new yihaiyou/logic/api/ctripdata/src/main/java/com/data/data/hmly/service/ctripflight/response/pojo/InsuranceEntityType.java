//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.04 at 03:36:59 PM CST 
//


package com.data.data.hmly.service.ctripflight.response.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsuranceEntityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceEntityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InsuranceTypeIds" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MinInsuranceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SaleRemark" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceEntityType", propOrder = {
    "productCode",
    "insuranceTypeIds",
    "minInsuranceNumber",
    "saleRemark"
})
public class InsuranceEntityType {

    @XmlElement(name = "ProductCode", required = true)
    protected String productCode;
    @XmlElement(name = "InsuranceTypeIds", required = true)
    protected String insuranceTypeIds;
    @XmlElement(name = "MinInsuranceNumber", required = true)
    protected String minInsuranceNumber;
    @XmlElement(name = "SaleRemark", required = true)
    protected String saleRemark;

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the insuranceTypeIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceTypeIds() {
        return insuranceTypeIds;
    }

    /**
     * Sets the value of the insuranceTypeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceTypeIds(String value) {
        this.insuranceTypeIds = value;
    }

    /**
     * Gets the value of the minInsuranceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinInsuranceNumber() {
        return minInsuranceNumber;
    }

    /**
     * Sets the value of the minInsuranceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinInsuranceNumber(String value) {
        this.minInsuranceNumber = value;
    }

    /**
     * Gets the value of the saleRemark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRemark() {
        return saleRemark;
    }

    /**
     * Sets the value of the saleRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleRemark(String value) {
        this.saleRemark = value;
    }

}