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
 * <p>Java class for ScenicSpotListItemDTOType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScenicSpotListItemDTOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Activity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Address">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="����ʡ�����к�������\ufffd\ufffd\ufffd·1888�š�"/>
 *               &lt;enumeration value="������˼�������Ȉ�·2�š�"/>
 *               &lt;enumeration value="����ʡ������˼�����������������ͷ����Сľ�ݡ�"/>
 *               &lt;enumeration value="����ʡ������˼��������졣"/>
 *               &lt;enumeration value="����ʡ������˼�����ؽ���2�ŵ�һ�㳡�����ƽ��ͷ���棬���ֶ���ͷ����ɽ·��ҵ���н֣���"/>
 *               &lt;enumeration value="����ʡ������˼�����ؽ���15���ֶ���ͷ��"/>
 *               &lt;enumeration value="����ʡ�����м���ѧ�塣"/>
 *               &lt;enumeration value="�����й��������·5�ţ������ڣ���"/>
 *               &lt;enumeration value="����˼�����ֶ���ͷ��"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CommentGrade">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="4.8"/>
 *               &lt;enumeration value="4.6"/>
 *               &lt;enumeration value="4.5"/>
 *               &lt;enumeration value="4.4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CommentUserCount">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1867"/>
 *               &lt;enumeration value="633"/>
 *               &lt;enumeration value="22"/>
 *               &lt;enumeration value="4919"/>
 *               &lt;enumeration value="910"/>
 *               &lt;enumeration value="7"/>
 *               &lt;enumeration value="504"/>
 *               &lt;enumeration value="333"/>
 *               &lt;enumeration value="331"/>
 *               &lt;enumeration value="771"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountryID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CoverImageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DistrictID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="21"/>
 *               &lt;enumeration value="9458"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DistrictName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="����"/>
 *               &lt;enumeration value="������"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="48767"/>
 *               &lt;enumeration value="2342"/>
 *               &lt;enumeration value="1674992"/>
 *               &lt;enumeration value="57405"/>
 *               &lt;enumeration value="2345"/>
 *               &lt;enumeration value="137032"/>
 *               &lt;enumeration value="118936"/>
 *               &lt;enumeration value="48748"/>
 *               &lt;enumeration value="1416078"/>
 *               &lt;enumeration value="139403"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Image">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="http://dimg02.c-ctrip.com/images/tg/346/761/663/aab9ad0d097c4a33971d7ccc18d5ce44_C_186_105.jpg"/>
 *               &lt;enumeration value="http://dimg02.c-ctrip.com/images/fd/tg/g4/M0B/23/3F/CggYHlXBrIuAZVQVAAuktX3p6xU355_C_186_105.jpg"/>
 *               &lt;enumeration value="http://dimg02.c-ctrip.com/images/tg/599/124/924/a9bfb84b254c4db49953ffedae6c25b2_C_186_105.jpg"/>
 *               &lt;enumeration value="http://dimg02.c-ctrip.com/images/tg/376/531/913/cf36bf1c12774a9e89aa62678ea77fd9_C_186_105.jpg"/>
 *               &lt;enumeration value="http://dimg02.c-ctrip.com/images/tg/885/390/398/0ef0b0bd0a3e43ce8bfdee6e13ea5647_C_186_105.jpg"/>
 *               &lt;enumeration value="http://dimg02.c-ctrip.com/images/tg/727/883/876/4bb3fbf57325419b939f6427c2dbf199_C_186_105.jpg"/>
 *               &lt;enumeration value="http://dimg02.c-ctrip.com/images/tg/010/908/191/28a5f1c4c1bf458990745a2142d8d049_C_186_105.jpg"/>
 *               &lt;enumeration value="http://dimg02.c-ctrip.com/images/tg/349/724/056/9ae545b1062c4a3c86655ceca19639e2_C_186_105.jpg"/>
 *               &lt;enumeration value="http://dimg02.c-ctrip.com/images/tg/481/097/040/64001fdc90634c11afdc051f46c1e8f2_C_186_105.jpg"/>
 *               &lt;enumeration value="http://dimg02.c-ctrip.com/images/tg/461/534/209/efd034fff39b4bca827f1ec538d6b521_C_186_105.jpg"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="���¹���Ȫ"/>
 *               &lt;enumeration value="����ɽ��̨"/>
 *               &lt;enumeration value="������ܰ����վ"/>
 *               &lt;enumeration value="������"/>
 *               &lt;enumeration value="�չ���"/>
 *               &lt;enumeration value="��ɽ·���н�"/>
 *               &lt;enumeration value="���Ͽ�����"/>
 *               &lt;enumeration value="�θ�԰"/>
 *               &lt;enumeration value="�����λ�����"/>
 *               &lt;enumeration value="�ؽ�ҹ��"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IsReturnCash" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MarketPrice">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="468"/>
 *               &lt;enumeration value="25"/>
 *               &lt;enumeration value="50"/>
 *               &lt;enumeration value="60"/>
 *               &lt;enumeration value="100"/>
 *               &lt;enumeration value="20"/>
 *               &lt;enumeration value="138"/>
 *               &lt;enumeration value="30"/>
 *               &lt;enumeration value="43"/>
 *               &lt;enumeration value="136"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OrderCount">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="731"/>
 *               &lt;enumeration value="1482"/>
 *               &lt;enumeration value="6"/>
 *               &lt;enumeration value="3707"/>
 *               &lt;enumeration value="1388"/>
 *               &lt;enumeration value="288"/>
 *               &lt;enumeration value="237"/>
 *               &lt;enumeration value="230"/>
 *               &lt;enumeration value="207"/>
 *               &lt;enumeration value="185"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Price">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="99"/>
 *               &lt;enumeration value="23"/>
 *               &lt;enumeration value="18"/>
 *               &lt;enumeration value="42"/>
 *               &lt;enumeration value="90"/>
 *               &lt;enumeration value="15"/>
 *               &lt;enumeration value="80"/>
 *               &lt;enumeration value="24"/>
 *               &lt;enumeration value="39"/>
 *               &lt;enumeration value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProductListItemList" type="{}ProductListItemListType"/>
 *         &lt;element name="ProductManagerRecommand">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="��˫12���ο񻶣����¹ȵ���������12Ԫ��"/>
 *               &lt;enumeration value="��������ͺ����ڡ���²�����ڣ�"/>
 *               &lt;enumeration value="���ṩ������ܰ����վ����"/>
 *               &lt;enumeration value="�ﲻ�ι����죬���������У�"/>
 *               &lt;enumeration value="�����Ÿ�����ɽ·��"/>
 *               &lt;enumeration value="���������Դ󺣷�⣡"/>
 *               &lt;enumeration value="��һƱͨ����԰���ʾӡ��θ�԰��"/>
 *               &lt;enumeration value="�ﺣ�ױ�����Ͳ�ʹ����ţ�"/>
 *               &lt;enumeration value="��۾�Ʒ���͸裬������У�"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProvinceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProvinceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReturnCashAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Star">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TicketGroupAttributes" type="{}TicketGroupAttributesType"/>
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SaleTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScenicSpotListItemDTOType", propOrder = {
    "activity",
    "address",
    "commentGrade",
    "commentUserCount",
    "countryID",
    "countryName",
    "coverImageId",
    "districtID",
    "districtName",
    "id",
    "image",
    "name",
    "isReturnCash",
    "marketPrice",
    "orderCount",
    "price",
    "productListItemList",
    "productManagerRecommand",
    "provinceID",
    "provinceName",
    "returnCashAmount",
    "star",
    "ticketGroupAttributes",
    "distance",
    "saleTag"
})
public class ScenicSpotListItemDTOType {

    @XmlElement(name = "Activity", required = true)
    protected String activity;
    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "CommentGrade", required = true)
    protected String commentGrade;
    @XmlElement(name = "CommentUserCount", required = true)
    protected String commentUserCount;
    @XmlElement(name = "CountryID", required = true)
    protected String countryID;
    @XmlElement(name = "CountryName", required = true)
    protected String countryName;
    @XmlElement(name = "CoverImageId", required = true)
    protected String coverImageId;
    @XmlElement(name = "DistrictID", required = true)
    protected String districtID;
    @XmlElement(name = "DistrictName", required = true)
    protected String districtName;
    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "Image", required = true)
    protected String image;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "IsReturnCash", required = true)
    protected String isReturnCash;
    @XmlElement(name = "MarketPrice", required = true)
    protected String marketPrice;
    @XmlElement(name = "OrderCount", required = true)
    protected String orderCount;
    @XmlElement(name = "Price", required = true)
    protected String price;
    @XmlElement(name = "ProductListItemList", required = true)
    protected ProductListItemListType productListItemList;
    @XmlElement(name = "ProductManagerRecommand", required = true)
    protected String productManagerRecommand;
    @XmlElement(name = "ProvinceID", required = true)
    protected String provinceID;
    @XmlElement(name = "ProvinceName", required = true)
    protected String provinceName;
    @XmlElement(name = "ReturnCashAmount", required = true)
    protected String returnCashAmount;
    @XmlElement(name = "Star", required = true)
    protected String star;
    @XmlElement(name = "TicketGroupAttributes", required = true)
    protected TicketGroupAttributesType ticketGroupAttributes;
    @XmlElement(name = "Distance", required = true)
    protected String distance;
    @XmlElement(name = "SaleTag")
    protected String saleTag;

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivity(String value) {
        this.activity = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the commentGrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentGrade() {
        return commentGrade;
    }

    /**
     * Sets the value of the commentGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentGrade(String value) {
        this.commentGrade = value;
    }

    /**
     * Gets the value of the commentUserCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentUserCount() {
        return commentUserCount;
    }

    /**
     * Sets the value of the commentUserCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentUserCount(String value) {
        this.commentUserCount = value;
    }

    /**
     * Gets the value of the countryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryID() {
        return countryID;
    }

    /**
     * Sets the value of the countryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryID(String value) {
        this.countryID = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the coverImageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverImageId() {
        return coverImageId;
    }

    /**
     * Sets the value of the coverImageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverImageId(String value) {
        this.coverImageId = value;
    }

    /**
     * Gets the value of the districtID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictID() {
        return districtID;
    }

    /**
     * Sets the value of the districtID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictID(String value) {
        this.districtID = value;
    }

    /**
     * Gets the value of the districtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * Sets the value of the districtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictName(String value) {
        this.districtName = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the isReturnCash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsReturnCash() {
        return isReturnCash;
    }

    /**
     * Sets the value of the isReturnCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsReturnCash(String value) {
        this.isReturnCash = value;
    }

    /**
     * Gets the value of the marketPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketPrice() {
        return marketPrice;
    }

    /**
     * Sets the value of the marketPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketPrice(String value) {
        this.marketPrice = value;
    }

    /**
     * Gets the value of the orderCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderCount() {
        return orderCount;
    }

    /**
     * Sets the value of the orderCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderCount(String value) {
        this.orderCount = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(String value) {
        this.price = value;
    }

    /**
     * Gets the value of the productListItemList property.
     * 
     * @return
     *     possible object is
     *     {@link ProductListItemListType }
     *     
     */
    public ProductListItemListType getProductListItemList() {
        return productListItemList;
    }

    /**
     * Sets the value of the productListItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductListItemListType }
     *     
     */
    public void setProductListItemList(ProductListItemListType value) {
        this.productListItemList = value;
    }

    /**
     * Gets the value of the productManagerRecommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductManagerRecommand() {
        return productManagerRecommand;
    }

    /**
     * Sets the value of the productManagerRecommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductManagerRecommand(String value) {
        this.productManagerRecommand = value;
    }

    /**
     * Gets the value of the provinceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceID() {
        return provinceID;
    }

    /**
     * Sets the value of the provinceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceID(String value) {
        this.provinceID = value;
    }

    /**
     * Gets the value of the provinceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * Sets the value of the provinceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceName(String value) {
        this.provinceName = value;
    }

    /**
     * Gets the value of the returnCashAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCashAmount() {
        return returnCashAmount;
    }

    /**
     * Sets the value of the returnCashAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCashAmount(String value) {
        this.returnCashAmount = value;
    }

    /**
     * Gets the value of the star property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStar() {
        return star;
    }

    /**
     * Sets the value of the star property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStar(String value) {
        this.star = value;
    }

    /**
     * Gets the value of the ticketGroupAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link TicketGroupAttributesType }
     *     
     */
    public TicketGroupAttributesType getTicketGroupAttributes() {
        return ticketGroupAttributes;
    }

    /**
     * Sets the value of the ticketGroupAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketGroupAttributesType }
     *     
     */
    public void setTicketGroupAttributes(TicketGroupAttributesType value) {
        this.ticketGroupAttributes = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistance(String value) {
        this.distance = value;
    }

    /**
     * Gets the value of the saleTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleTag() {
        return saleTag;
    }

    /**
     * Sets the value of the saleTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleTag(String value) {
        this.saleTag = value;
    }

}