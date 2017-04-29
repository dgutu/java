
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="oRegistration" type="{http://www.avectra.com/2005/}EventsRegistrantType" minOccurs="0"/>
 *         &lt;element name="oFeeCollection" type="{http://www.avectra.com/2005/}Fees" minOccurs="0"/>
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
    "oRegistration",
    "oFeeCollection"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartEventRegistrantSetLineItems")
public class WEBCentralizedShoppingCartEventRegistrantSetLineItems {

    protected EventsRegistrantType oRegistration;
    protected Fees oFeeCollection;

    /**
     * Gets the value of the oRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantType }
     *     
     */
    public EventsRegistrantType getORegistration() {
        return oRegistration;
    }

    /**
     * Sets the value of the oRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantType }
     *     
     */
    public void setORegistration(EventsRegistrantType value) {
        this.oRegistration = value;
    }

    /**
     * Gets the value of the oFeeCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Fees }
     *     
     */
    public Fees getOFeeCollection() {
        return oFeeCollection;
    }

    /**
     * Sets the value of the oFeeCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fees }
     *     
     */
    public void setOFeeCollection(Fees value) {
        this.oFeeCollection = value;
    }

}
