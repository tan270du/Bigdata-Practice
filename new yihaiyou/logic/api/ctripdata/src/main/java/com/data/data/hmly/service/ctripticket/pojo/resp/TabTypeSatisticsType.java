//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.02 at 07:34:20 PM CST 
//


package com.data.data.hmly.service.ctripticket.pojo.resp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TabTypeSatisticsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TabTypeSatisticsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TabTypeSatisticsDTO" type="{}TabTypeSatisticsDTOType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TabTypeSatisticsType", propOrder = {
    "tabTypeSatisticsDTO"
})
public class TabTypeSatisticsType {

    @XmlElement(name = "TabTypeSatisticsDTO", required = true)
    protected TabTypeSatisticsDTOType tabTypeSatisticsDTO;

    /**
     * Gets the value of the tabTypeSatisticsDTO property.
     * 
     * @return
     *     possible object is
     *     {@link TabTypeSatisticsDTOType }
     *     
     */
    public TabTypeSatisticsDTOType getTabTypeSatisticsDTO() {
        return tabTypeSatisticsDTO;
    }

    /**
     * Sets the value of the tabTypeSatisticsDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link TabTypeSatisticsDTOType }
     *     
     */
    public void setTabTypeSatisticsDTO(TabTypeSatisticsDTOType value) {
        this.tabTypeSatisticsDTO = value;
    }

}