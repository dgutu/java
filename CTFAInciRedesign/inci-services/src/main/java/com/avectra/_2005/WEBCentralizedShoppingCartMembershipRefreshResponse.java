
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
 *         &lt;element name="WEBCentralizedShoppingCartMembershipRefreshResult" type="{http://www.avectra.com/2005/}mb_membershipType" minOccurs="0"/>
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
    "webCentralizedShoppingCartMembershipRefreshResult"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartMembershipRefreshResponse")
public class WEBCentralizedShoppingCartMembershipRefreshResponse {

    @XmlElement(name = "WEBCentralizedShoppingCartMembershipRefreshResult")
    protected MbMembershipType webCentralizedShoppingCartMembershipRefreshResult;

    /**
     * Gets the value of the webCentralizedShoppingCartMembershipRefreshResult property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipType }
     *     
     */
    public MbMembershipType getWEBCentralizedShoppingCartMembershipRefreshResult() {
        return webCentralizedShoppingCartMembershipRefreshResult;
    }

    /**
     * Sets the value of the webCentralizedShoppingCartMembershipRefreshResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipType }
     *     
     */
    public void setWEBCentralizedShoppingCartMembershipRefreshResult(MbMembershipType value) {
        this.webCentralizedShoppingCartMembershipRefreshResult = value;
    }

}
