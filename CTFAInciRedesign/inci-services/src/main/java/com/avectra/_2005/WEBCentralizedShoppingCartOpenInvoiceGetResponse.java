
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WEBCentralizedShoppingCartOpenInvoiceGetResult" type="{http://www.avectra.com/2005/}InvoiceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "webCentralizedShoppingCartOpenInvoiceGetResult"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartOpenInvoiceGetResponse")
public class WEBCentralizedShoppingCartOpenInvoiceGetResponse {

    @XmlElement(name = "WEBCentralizedShoppingCartOpenInvoiceGetResult")
    protected InvoiceType webCentralizedShoppingCartOpenInvoiceGetResult;

    /**
     * Gets the value of the webCentralizedShoppingCartOpenInvoiceGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceType }
     *     
     */
    public InvoiceType getWEBCentralizedShoppingCartOpenInvoiceGetResult() {
        return webCentralizedShoppingCartOpenInvoiceGetResult;
    }

    /**
     * Sets the value of the webCentralizedShoppingCartOpenInvoiceGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceType }
     *     
     */
    public void setWEBCentralizedShoppingCartOpenInvoiceGetResult(InvoiceType value) {
        this.webCentralizedShoppingCartOpenInvoiceGetResult = value;
    }

}
