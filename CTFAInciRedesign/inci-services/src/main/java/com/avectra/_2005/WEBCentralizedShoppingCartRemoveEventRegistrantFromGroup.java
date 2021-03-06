
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
 *         &lt;element name="oGroupRegistration" type="{http://www.avectra.com/2005/}EventsRegistrantGroupType" minOccurs="0"/>
 *         &lt;element name="RegistrationKey" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "oGroupRegistration",
    "registrationKey"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartRemoveEventRegistrantFromGroup")
public class WEBCentralizedShoppingCartRemoveEventRegistrantFromGroup {

    protected EventsRegistrantGroupType oGroupRegistration;
    @XmlElement(name = "RegistrationKey", required = true)
    protected String registrationKey;

    /**
     * Gets the value of the oGroupRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupType }
     *     
     */
    public EventsRegistrantGroupType getOGroupRegistration() {
        return oGroupRegistration;
    }

    /**
     * Sets the value of the oGroupRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupType }
     *     
     */
    public void setOGroupRegistration(EventsRegistrantGroupType value) {
        this.oGroupRegistration = value;
    }

    /**
     * Gets the value of the registrationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationKey() {
        return registrationKey;
    }

    /**
     * Sets the value of the registrationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationKey(String value) {
        this.registrationKey = value;
    }

}
