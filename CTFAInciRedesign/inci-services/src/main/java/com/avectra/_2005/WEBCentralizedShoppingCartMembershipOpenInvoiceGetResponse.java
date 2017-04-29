
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
 *         &lt;element name="WEBCentralizedShoppingCartMembershipOpenInvoiceGetResult" type="{http://www.avectra.com/2005/}InvoiceType" minOccurs="0"/>
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
    "webCentralizedShoppingCartMembershipOpenInvoiceGetResult"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartMembershipOpenInvoiceGetResponse")
public class WEBCentralizedShoppingCartMembershipOpenInvoiceGetResponse {

    @XmlElement(name = "WEBCentralizedShoppingCartMembershipOpenInvoiceGetResult")
    protected InvoiceType webCentralizedShoppingCartMembershipOpenInvoiceGetResult;

    /**
     * Gets the value of the webCentralizedShoppingCartMembershipOpenInvoiceGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceType }
     *     
     */
    public InvoiceType getWEBCentralizedShoppingCartMembershipOpenInvoiceGetResult() {
        return webCentralizedShoppingCartMembershipOpenInvoiceGetResult;
    }

    /**
     * Sets the value of the webCentralizedShoppingCartMembershipOpenInvoiceGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceType }
     *     
     */
    public void setWEBCentralizedShoppingCartMembershipOpenInvoiceGetResult(InvoiceType value) {
        this.webCentralizedShoppingCartMembershipOpenInvoiceGetResult = value;
    }

}
