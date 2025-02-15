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
import java.math.BigDecimal;


/**
 * <p>Java class for CommentSummary complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="CommentSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GoodRatio" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="GoodCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BadCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommentSummary", propOrder = {
        "hotelId",
        "total",
        "goodRatio",
        "goodCount",
        "badCount"
})
public class CommentSummary {

    @JSONField(name = "HotelId")
    protected String hotelId;
    @JSONField(name = "Total")
    protected int total;
    @JSONField(name = "GoodRatio")
    protected BigDecimal goodRatio;
    @JSONField(name = "GoodCount")
    protected int goodCount;
    @JSONField(name = "BadCount")
    protected int badCount;

    /**
     * Gets the value of the hotelId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHotelId() {
        return hotelId;
    }

    /**
     * Sets the value of the hotelId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHotelId(String value) {
        this.hotelId = value;
    }

    /**
     * Gets the value of the total property.
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     */
    public void setTotal(int value) {
        this.total = value;
    }

    /**
     * Gets the value of the goodRatio property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getGoodRatio() {
        return goodRatio;
    }

    /**
     * Sets the value of the goodRatio property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setGoodRatio(BigDecimal value) {
        this.goodRatio = value;
    }

    /**
     * Gets the value of the goodCount property.
     */
    public int getGoodCount() {
        return goodCount;
    }

    /**
     * Sets the value of the goodCount property.
     */
    public void setGoodCount(int value) {
        this.goodCount = value;
    }

    /**
     * Gets the value of the badCount property.
     */
    public int getBadCount() {
        return badCount;
    }

    /**
     * Sets the value of the badCount property.
     */
    public void setBadCount(int value) {
        this.badCount = value;
    }

}
