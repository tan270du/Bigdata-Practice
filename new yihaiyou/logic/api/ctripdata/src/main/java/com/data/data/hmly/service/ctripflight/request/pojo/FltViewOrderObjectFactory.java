//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.06 at 12:37:54 AM CST 
//


package com.data.data.hmly.service.ctripflight.request.pojo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class FltViewOrderObjectFactory {

    private final static QName _Request_QNAME = new QName("", "Request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public FltViewOrderObjectFactory() {
    }

    /**
     * Create an instance of {@link FltViewOrderRequest }
     * 
     */
    public FltViewOrderRequest createRequestType() {
        return new FltViewOrderRequest();
    }

    /**
     * Create an instance of {@link FltViewOrderRequestType }
     * 
     */
    public FltViewOrderRequestType createFltViewOrderRequestType() {
        return new FltViewOrderRequestType();
    }

    /**
     * Create an instance of {@link FltViewOrderOrderIDType }
     * 
     */
    public FltViewOrderOrderIDType createOrderIDType() {
        return new FltViewOrderOrderIDType();
    }

    /**
     * Create an instance of {@link FltViewOrderHeaderType }
     * 
     */
    public FltViewOrderHeaderType createHeaderType() {
        return new FltViewOrderHeaderType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FltViewOrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Request")
    public JAXBElement<FltViewOrderRequest> createRequest(FltViewOrderRequest value) {
        return new JAXBElement<FltViewOrderRequest>(_Request_QNAME, FltViewOrderRequest.class, null, value);
    }

}