
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
 *         &lt;element name="WEBCentralizedShoppingCartRemoveAllLineItemsResult" type="{http://www.avectra.com/2005/}CentralizedOrderEntryType" minOccurs="0"/>
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
    "webCentralizedShoppingCartRemoveAllLineItemsResult"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartRemoveAllLineItemsResponse")
public class WEBCentralizedShoppingCartRemoveAllLineItemsResponse {

    @XmlElement(name = "WEBCentralizedShoppingCartRemoveAllLineItemsResult")
    protected CentralizedOrderEntryType webCentralizedShoppingCartRemoveAllLineItemsResult;

    /**
     * Gets the value of the webCentralizedShoppingCartRemoveAllLineItemsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CentralizedOrderEntryType }
     *     
     */
    public CentralizedOrderEntryType getWEBCentralizedShoppingCartRemoveAllLineItemsResult() {
        return webCentralizedShoppingCartRemoveAllLineItemsResult;
    }

    /**
     * Sets the value of the webCentralizedShoppingCartRemoveAllLineItemsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralizedOrderEntryType }
     *     
     */
    public void setWEBCentralizedShoppingCartRemoveAllLineItemsResult(CentralizedOrderEntryType value) {
        this.webCentralizedShoppingCartRemoveAllLineItemsResult = value;
    }

}
