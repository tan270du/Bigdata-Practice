//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2015.12.02 时间 07:09:07 PM CST 
//


package com.data.data.hmly.service.ctriphotel.priceinfo.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SellableProductsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SellableProductsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SellableProduct" type="{}SellableProductType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellableProductsType", propOrder = {
    "sellableProduct"
})
public class SellableProductsType {

    @XmlElement(name = "SellableProduct", required = true)
    protected SellableProductType sellableProduct;

    /**
     * 获取sellableProduct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SellableProductType }
     *     
     */
    public SellableProductType getSellableProduct() {
        return sellableProduct;
    }

    /**
     * 设置sellableProduct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SellableProductType }
     *     
     */
    public void setSellableProduct(SellableProductType value) {
        this.sellableProduct = value;
    }

}
