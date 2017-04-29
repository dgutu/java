
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
 *         &lt;element name="WEBCentralizedShoppingCartEventRegistrantGroupGetNewResult" type="{http://www.avectra.com/2005/}EventsRegistrantGroupType" minOccurs="0"/>
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
    "webCentralizedShoppingCartEventRegistrantGroupGetNewResult"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartEventRegistrantGroupGetNewResponse")
public class WEBCentralizedShoppingCartEventRegistrantGroupGetNewResponse {

    @XmlElement(name = "WEBCentralizedShoppingCartEventRegistrantGroupGetNewResult")
    protected EventsRegistrantGroupType webCentralizedShoppingCartEventRegistrantGroupGetNewResult;

    /**
     * Gets the value of the webCentralizedShoppingCartEventRegistrantGroupGetNewResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupType }
     *     
     */
    public EventsRegistrantGroupType getWEBCentralizedShoppingCartEventRegistrantGroupGetNewResult() {
        return webCentralizedShoppingCartEventRegistrantGroupGetNewResult;
    }

    /**
     * Sets the value of the webCentralizedShoppingCartEventRegistrantGroupGetNewResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupType }
     *     
     */
    public void setWEBCentralizedShoppingCartEventRegistrantGroupGetNewResult(EventsRegistrantGroupType value) {
        this.webCentralizedShoppingCartEventRegistrantGroupGetNewResult = value;
    }

}
