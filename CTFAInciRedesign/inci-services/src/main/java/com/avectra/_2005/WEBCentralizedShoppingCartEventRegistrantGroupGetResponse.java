
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
 *         &lt;element name="WEBCentralizedShoppingCartEventRegistrantGroupGetResult" type="{http://www.avectra.com/2005/}EventsRegistrantGroupType" minOccurs="0"/>
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
    "webCentralizedShoppingCartEventRegistrantGroupGetResult"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartEventRegistrantGroupGetResponse")
public class WEBCentralizedShoppingCartEventRegistrantGroupGetResponse {

    @XmlElement(name = "WEBCentralizedShoppingCartEventRegistrantGroupGetResult")
    protected EventsRegistrantGroupType webCentralizedShoppingCartEventRegistrantGroupGetResult;

    /**
     * Gets the value of the webCentralizedShoppingCartEventRegistrantGroupGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupType }
     *     
     */
    public EventsRegistrantGroupType getWEBCentralizedShoppingCartEventRegistrantGroupGetResult() {
        return webCentralizedShoppingCartEventRegistrantGroupGetResult;
    }

    /**
     * Sets the value of the webCentralizedShoppingCartEventRegistrantGroupGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupType }
     *     
     */
    public void setWEBCentralizedShoppingCartEventRegistrantGroupGetResult(EventsRegistrantGroupType value) {
        this.webCentralizedShoppingCartEventRegistrantGroupGetResult = value;
    }

}
