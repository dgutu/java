
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
 *         &lt;element name="OrgCstKey" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="actionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "orgCstKey",
    "actionDate",
    "oipAddress"
})
@XmlRootElement(name = "ElectronicSubscriptionGetPurchasedSubscriptionsByCustomer")
public class ElectronicSubscriptionGetPurchasedSubscriptionsByCustomer {

    @XmlElement(name = "OrgCstKey", required = true)
    protected String orgCstKey;
    protected String actionDate;
    @XmlElement(name = "oIPAddress")
    protected String oipAddress;

    /**
     * Gets the value of the orgCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgCstKey() {
        return orgCstKey;
    }

    /**
     * Sets the value of the orgCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgCstKey(String value) {
        this.orgCstKey = value;
    }

    /**
     * Gets the value of the actionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionDate() {
        return actionDate;
    }

    /**
     * Sets the value of the actionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionDate(String value) {
        this.actionDate = value;
    }

    /**
     * Gets the value of the oipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOIPAddress() {
        return oipAddress;
    }

    /**
     * Sets the value of the oipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOIPAddress(String value) {
        this.oipAddress = value;
    }

}
