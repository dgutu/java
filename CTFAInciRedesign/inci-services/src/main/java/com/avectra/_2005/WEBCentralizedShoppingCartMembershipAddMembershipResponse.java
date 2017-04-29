
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
 *         &lt;element name="WEBCentralizedShoppingCartMembershipAddMembershipResult" type="{http://www.avectra.com/2005/}CentralizedOrderEntryType" minOccurs="0"/>
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
    "webCentralizedShoppingCartMembershipAddMembershipResult"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartMembershipAddMembershipResponse")
public class WEBCentralizedShoppingCartMembershipAddMembershipResponse {

    @XmlElement(name = "WEBCentralizedShoppingCartMembershipAddMembershipResult")
    protected CentralizedOrderEntryType webCentralizedShoppingCartMembershipAddMembershipResult;

    /**
     * Gets the value of the webCentralizedShoppingCartMembershipAddMembershipResult property.
     * 
     * @return
     *     possible object is
     *     {@link CentralizedOrderEntryType }
     *     
     */
    public CentralizedOrderEntryType getWEBCentralizedShoppingCartMembershipAddMembershipResult() {
        return webCentralizedShoppingCartMembershipAddMembershipResult;
    }

    /**
     * Sets the value of the webCentralizedShoppingCartMembershipAddMembershipResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralizedOrderEntryType }
     *     
     */
    public void setWEBCentralizedShoppingCartMembershipAddMembershipResult(CentralizedOrderEntryType value) {
        this.webCentralizedShoppingCartMembershipAddMembershipResult = value;
    }

}
