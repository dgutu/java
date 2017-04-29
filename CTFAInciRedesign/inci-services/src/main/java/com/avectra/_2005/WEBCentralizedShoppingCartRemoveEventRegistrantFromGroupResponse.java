
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
 *         &lt;element name="WEBCentralizedShoppingCartRemoveEventRegistrantFromGroupResult" type="{http://www.avectra.com/2005/}EventsRegistrantGroupType" minOccurs="0"/>
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
    "webCentralizedShoppingCartRemoveEventRegistrantFromGroupResult"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartRemoveEventRegistrantFromGroupResponse")
public class WEBCentralizedShoppingCartRemoveEventRegistrantFromGroupResponse {

    @XmlElement(name = "WEBCentralizedShoppingCartRemoveEventRegistrantFromGroupResult")
    protected EventsRegistrantGroupType webCentralizedShoppingCartRemoveEventRegistrantFromGroupResult;

    /**
     * Gets the value of the webCentralizedShoppingCartRemoveEventRegistrantFromGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupType }
     *     
     */
    public EventsRegistrantGroupType getWEBCentralizedShoppingCartRemoveEventRegistrantFromGroupResult() {
        return webCentralizedShoppingCartRemoveEventRegistrantFromGroupResult;
    }

    /**
     * Sets the value of the webCentralizedShoppingCartRemoveEventRegistrantFromGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupType }
     *     
     */
    public void setWEBCentralizedShoppingCartRemoveEventRegistrantFromGroupResult(EventsRegistrantGroupType value) {
        this.webCentralizedShoppingCartRemoveEventRegistrantFromGroupResult = value;
    }

}
