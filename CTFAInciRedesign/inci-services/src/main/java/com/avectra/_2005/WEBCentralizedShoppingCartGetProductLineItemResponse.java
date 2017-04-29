
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
 *         &lt;element name="WEBCentralizedShoppingCartGetProductLineItemResult" type="{http://www.avectra.com/2005/}InvoiceDetailType" minOccurs="0"/>
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
    "webCentralizedShoppingCartGetProductLineItemResult"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartGetProductLineItemResponse")
public class WEBCentralizedShoppingCartGetProductLineItemResponse {

    @XmlElement(name = "WEBCentralizedShoppingCartGetProductLineItemResult")
    protected InvoiceDetailType webCentralizedShoppingCartGetProductLineItemResult;

    /**
     * Gets the value of the webCentralizedShoppingCartGetProductLineItemResult property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailType }
     *     
     */
    public InvoiceDetailType getWEBCentralizedShoppingCartGetProductLineItemResult() {
        return webCentralizedShoppingCartGetProductLineItemResult;
    }

    /**
     * Sets the value of the webCentralizedShoppingCartGetProductLineItemResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailType }
     *     
     */
    public void setWEBCentralizedShoppingCartGetProductLineItemResult(InvoiceDetailType value) {
        this.webCentralizedShoppingCartGetProductLineItemResult = value;
    }

}
