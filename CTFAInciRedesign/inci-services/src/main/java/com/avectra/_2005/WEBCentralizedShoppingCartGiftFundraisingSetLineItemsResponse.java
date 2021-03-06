
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
 *         &lt;element name="WEBCentralizedShoppingCartGiftFundraisingSetLineItemsResult" type="{http://www.avectra.com/2005/}FundraisingGiftType" minOccurs="0"/>
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
    "webCentralizedShoppingCartGiftFundraisingSetLineItemsResult"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartGiftFundraisingSetLineItemsResponse")
public class WEBCentralizedShoppingCartGiftFundraisingSetLineItemsResponse {

    @XmlElement(name = "WEBCentralizedShoppingCartGiftFundraisingSetLineItemsResult")
    protected FundraisingGiftType webCentralizedShoppingCartGiftFundraisingSetLineItemsResult;

    /**
     * Gets the value of the webCentralizedShoppingCartGiftFundraisingSetLineItemsResult property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftType }
     *     
     */
    public FundraisingGiftType getWEBCentralizedShoppingCartGiftFundraisingSetLineItemsResult() {
        return webCentralizedShoppingCartGiftFundraisingSetLineItemsResult;
    }

    /**
     * Sets the value of the webCentralizedShoppingCartGiftFundraisingSetLineItemsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftType }
     *     
     */
    public void setWEBCentralizedShoppingCartGiftFundraisingSetLineItemsResult(FundraisingGiftType value) {
        this.webCentralizedShoppingCartGiftFundraisingSetLineItemsResult = value;
    }

}
