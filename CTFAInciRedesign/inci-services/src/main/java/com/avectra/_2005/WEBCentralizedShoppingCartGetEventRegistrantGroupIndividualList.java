
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
 *         &lt;element name="EventKey" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="IndividualCustomerKey" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="OrganizationCustomerKey" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "eventKey",
    "individualCustomerKey",
    "organizationCustomerKey"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartGetEventRegistrantGroupIndividualList")
public class WEBCentralizedShoppingCartGetEventRegistrantGroupIndividualList {

    @XmlElement(name = "EventKey", required = true)
    protected String eventKey;
    @XmlElement(name = "IndividualCustomerKey", required = true)
    protected String individualCustomerKey;
    @XmlElement(name = "OrganizationCustomerKey", required = true)
    protected String organizationCustomerKey;

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

    /**
     * Gets the value of the individualCustomerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualCustomerKey() {
        return individualCustomerKey;
    }

    /**
     * Sets the value of the individualCustomerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividualCustomerKey(String value) {
        this.individualCustomerKey = value;
    }

    /**
     * Gets the value of the organizationCustomerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationCustomerKey() {
        return organizationCustomerKey;
    }

    /**
     * Sets the value of the organizationCustomerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationCustomerKey(String value) {
        this.organizationCustomerKey = value;
    }

}
