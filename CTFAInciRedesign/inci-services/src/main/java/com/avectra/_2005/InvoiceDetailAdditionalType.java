
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceDetailAdditionalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceDetailAdditionalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentKey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="Invoice_Detail_Additional" type="{http://www.avectra.com/2005/}InvoiceDetailAdditional_Invoice_Detail_Additional_DataObjectType"/>
 *         &lt;element name="Invoice_Detail" type="{http://www.avectra.com/2005/}InvoiceDetailAdditional_Invoice_Detail_DataObjectType"/>
 *         &lt;element name="Price" type="{http://www.avectra.com/2005/}InvoiceDetailAdditional_Price_DataObjectType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceDetailAdditionalType", propOrder = {
    "currentKey",
    "invoiceDetailAdditional",
    "invoiceDetail",
    "price"
})
public class InvoiceDetailAdditionalType {

    @XmlElementRef(name = "CurrentKey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> currentKey;
    @XmlElement(name = "Invoice_Detail_Additional", required = true)
    protected InvoiceDetailAdditionalInvoiceDetailAdditionalDataObjectType invoiceDetailAdditional;
    @XmlElement(name = "Invoice_Detail", required = true)
    protected InvoiceDetailAdditionalInvoiceDetailDataObjectType invoiceDetail;
    @XmlElement(name = "Price", required = true)
    protected InvoiceDetailAdditionalPriceDataObjectType price;

    /**
     * Gets the value of the currentKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentKey() {
        return currentKey;
    }

    /**
     * Sets the value of the currentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentKey(JAXBElement<String> value) {
        this.currentKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invoiceDetailAdditional property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailAdditionalInvoiceDetailAdditionalDataObjectType }
     *     
     */
    public InvoiceDetailAdditionalInvoiceDetailAdditionalDataObjectType getInvoiceDetailAdditional() {
        return invoiceDetailAdditional;
    }

    /**
     * Sets the value of the invoiceDetailAdditional property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailAdditionalInvoiceDetailAdditionalDataObjectType }
     *     
     */
    public void setInvoiceDetailAdditional(InvoiceDetailAdditionalInvoiceDetailAdditionalDataObjectType value) {
        this.invoiceDetailAdditional = value;
    }

    /**
     * Gets the value of the invoiceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailAdditionalInvoiceDetailDataObjectType }
     *     
     */
    public InvoiceDetailAdditionalInvoiceDetailDataObjectType getInvoiceDetail() {
        return invoiceDetail;
    }

    /**
     * Sets the value of the invoiceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailAdditionalInvoiceDetailDataObjectType }
     *     
     */
    public void setInvoiceDetail(InvoiceDetailAdditionalInvoiceDetailDataObjectType value) {
        this.invoiceDetail = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailAdditionalPriceDataObjectType }
     *     
     */
    public InvoiceDetailAdditionalPriceDataObjectType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailAdditionalPriceDataObjectType }
     *     
     */
    public void setPrice(InvoiceDetailAdditionalPriceDataObjectType value) {
        this.price = value;
    }

}
