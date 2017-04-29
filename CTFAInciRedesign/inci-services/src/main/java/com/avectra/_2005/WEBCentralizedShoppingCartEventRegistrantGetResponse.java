
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
 *         &lt;element name="WEBCentralizedShoppingCartEventRegistrantGetResult" type="{http://www.avectra.com/2005/}EventsRegistrantType" minOccurs="0"/>
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
    "webCentralizedShoppingCartEventRegistrantGetResult"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartEventRegistrantGetResponse")
public class WEBCentralizedShoppingCartEventRegistrantGetResponse {

    @XmlElement(name = "WEBCentralizedShoppingCartEventRegistrantGetResult")
    protected EventsRegistrantType webCentralizedShoppingCartEventRegistrantGetResult;

    /**
     * Gets the value of the webCentralizedShoppingCartEventRegistrantGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantType }
     *     
     */
    public EventsRegistrantType getWEBCentralizedShoppingCartEventRegistrantGetResult() {
        return webCentralizedShoppingCartEventRegistrantGetResult;
    }

    /**
     * Sets the value of the webCentralizedShoppingCartEventRegistrantGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantType }
     *     
     */
    public void setWEBCentralizedShoppingCartEventRegistrantGetResult(EventsRegistrantType value) {
        this.webCentralizedShoppingCartEventRegistrantGetResult = value;
    }

}
