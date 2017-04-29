
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
 *         &lt;element name="WEBCentralizedShoppingCartGetWithLineItemResult" type="{http://www.avectra.com/2005/}CentralizedOrderEntryType" minOccurs="0"/>
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
    "webCentralizedShoppingCartGetWithLineItemResult"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartGetWithLineItemResponse")
public class WEBCentralizedShoppingCartGetWithLineItemResponse {

    @XmlElement(name = "WEBCentralizedShoppingCartGetWithLineItemResult")
    protected CentralizedOrderEntryType webCentralizedShoppingCartGetWithLineItemResult;

    /**
     * Gets the value of the webCentralizedShoppingCartGetWithLineItemResult property.
     * 
     * @return
     *     possible object is
     *     {@link CentralizedOrderEntryType }
     *     
     */
    public CentralizedOrderEntryType getWEBCentralizedShoppingCartGetWithLineItemResult() {
        return webCentralizedShoppingCartGetWithLineItemResult;
    }

    /**
     * Sets the value of the webCentralizedShoppingCartGetWithLineItemResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralizedOrderEntryType }
     *     
     */
    public void setWEBCentralizedShoppingCartGetWithLineItemResult(CentralizedOrderEntryType value) {
        this.webCentralizedShoppingCartGetWithLineItemResult = value;
    }

}
