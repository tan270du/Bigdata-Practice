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
 * <p>Java class for Room complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Room">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Floor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Broadnet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BedType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RatePlans" type="{}ArrayOfListRatePlan" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Capcity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Room", propOrder = {
        "roomId",
        "name",
        "floor",
        "broadnet",
        "bedType",
        "description",
        "area",
        "imageUrl",
        "ratePlans",
        "comments",
        "capcity"
})
public class Room {

    @JSONField(name = "RoomId")
    protected String roomId;
    @JSONField(name = "Name")
    protected String name;
    @JSONField(name = "Floor")
    protected String floor;
    @JSONField(name = "Broadnet")
    protected String broadnet;
    @JSONField(name = "BedType")
    protected String bedType;
    @JSONField(name = "Description")
    protected String description;
    @JSONField(name = "Area")
    protected String area;
    @JSONField(name = "ImageUrl")
    protected String imageUrl;
    @JSONField(name = "RatePlans")
    protected List<ListRatePlan> ratePlans;
    @JSONField(name = "Comments")
    protected String comments;
    @JSONField(name = "Capcity")
    protected String capcity;

    /**
     * Gets the value of the roomId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRoomId() {
        return roomId;
    }

    /**
     * Sets the value of the roomId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRoomId(String value) {
        this.roomId = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the floor property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFloor() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFloor(String value) {
        this.floor = value;
    }

    /**
     * Gets the value of the broadnet property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBroadnet() {
        return broadnet;
    }

    /**
     * Sets the value of the broadnet property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBroadnet(String value) {
        this.broadnet = value;
    }

    /**
     * Gets the value of the bedType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBedType() {
        return bedType;
    }

    /**
     * Sets the value of the bedType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBedType(String value) {
        this.bedType = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the area property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Gets the value of the imageUrl property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the value of the imageUrl property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

    /**
     * Gets the value of the ratePlans property.
     *
     * @return possible object is
     * {@link List <ListRatePlan> }
     */
    public List<ListRatePlan> getRatePlans() {
        return ratePlans;
    }

    /**
     * Sets the value of the ratePlans property.
     *
     * @param value allowed object is
     *              {@link List <ListRatePlan> }
     */
    public void setRatePlans(List<ListRatePlan> value) {
        this.ratePlans = value;
    }

    /**
     * Gets the value of the comments property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the capcity property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCapcity() {
        return capcity;
    }

    /**
     * Sets the value of the capcity property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCapcity(String value) {
        this.capcity = value;
    }

}
