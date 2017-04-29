
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
 *         &lt;element name="WEBCentralizedShoppingCartEventRegistrantRefreshResult" type="{http://www.avectra.com/2005/}EventsRegistrantType" minOccurs="0"/>
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
    "webCentralizedShoppingCartEventRegistrantRefreshResult"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartEventRegistrantRefreshResponse")
public class WEBCentralizedShoppingCartEventRegistrantRefreshResponse {

    @XmlElement(name = "WEBCentralizedShoppingCartEventRegistrantRefreshResult")
    protected EventsRegistrantType webCentralizedShoppingCartEventRegistrantRefreshResult;

    /**
     * Gets the value of the webCentralizedShoppingCartEventRegistrantRefreshResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantType }
     *     
     */
    public EventsRegistrantType getWEBCentralizedShoppingCartEventRegistrantRefreshResult() {
        return webCentralizedShoppingCartEventRegistrantRefreshResult;
    }

    /**
     * Sets the value of the webCentralizedShoppingCartEventRegistrantRefreshResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantType }
     *     
     */
    public void setWEBCentralizedShoppingCartEventRegistrantRefreshResult(EventsRegistrantType value) {
        this.webCentralizedShoppingCartEventRegistrantRefreshResult = value;
    }

}
