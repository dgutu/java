
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
 *         &lt;element name="CustomerKey" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="EventKey" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "customerKey",
    "eventKey"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartEventRegistrantGetNew")
public class WEBCentralizedShoppingCartEventRegistrantGetNew {

    @XmlElement(name = "CustomerKey", required = true)
    protected String customerKey;
    @XmlElement(name = "EventKey", required = true)
    protected String eventKey;

    /**
     * Gets the value of the customerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerKey() {
        return customerKey;
    }

    /**
     * Sets the value of the customerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerKey(String value) {
        this.customerKey = value;
    }

    /**
     * Gets the value of the eventKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventKey() {
        return eventKey;
    }

    /**
     * Sets the value of the eventKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventKey(String value) {
        this.eventKey = value;
    }

}
