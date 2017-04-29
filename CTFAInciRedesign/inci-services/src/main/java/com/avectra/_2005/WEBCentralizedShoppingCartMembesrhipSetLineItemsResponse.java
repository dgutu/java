
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
 *         &lt;element name="WEBCentralizedShoppingCartMembesrhipSetLineItemsResult" type="{http://www.avectra.com/2005/}mb_membershipType" minOccurs="0"/>
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
    "webCentralizedShoppingCartMembesrhipSetLineItemsResult"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartMembesrhipSetLineItemsResponse")
public class WEBCentralizedShoppingCartMembesrhipSetLineItemsResponse {

    @XmlElement(name = "WEBCentralizedShoppingCartMembesrhipSetLineItemsResult")
    protected MbMembershipType webCentralizedShoppingCartMembesrhipSetLineItemsResult;

    /**
     * Gets the value of the webCentralizedShoppingCartMembesrhipSetLineItemsResult property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipType }
     *     
     */
    public MbMembershipType getWEBCentralizedShoppingCartMembesrhipSetLineItemsResult() {
        return webCentralizedShoppingCartMembesrhipSetLineItemsResult;
    }

    /**
     * Sets the value of the webCentralizedShoppingCartMembesrhipSetLineItemsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipType }
     *     
     */
    public void setWEBCentralizedShoppingCartMembesrhipSetLineItemsResult(MbMembershipType value) {
        this.webCentralizedShoppingCartMembesrhipSetLineItemsResult = value;
    }

}
