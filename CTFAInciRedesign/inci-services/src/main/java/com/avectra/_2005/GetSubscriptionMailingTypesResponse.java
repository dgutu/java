
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
 *         &lt;element name="GetSubscriptionMailingTypesResult" type="{http://www.avectra.com/2005/}ArrayOfMailingList" minOccurs="0"/>
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
    "getSubscriptionMailingTypesResult"
})
@XmlRootElement(name = "GetSubscriptionMailingTypesResponse")
public class GetSubscriptionMailingTypesResponse {

    @XmlElement(name = "GetSubscriptionMailingTypesResult")
    protected ArrayOfMailingList getSubscriptionMailingTypesResult;

    /**
     * Gets the value of the getSubscriptionMailingTypesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMailingList }
     *     
     */
    public ArrayOfMailingList getGetSubscriptionMailingTypesResult() {
        return getSubscriptionMailingTypesResult;
    }

    /**
     * Sets the value of the getSubscriptionMailingTypesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMailingList }
     *     
     */
    public void setGetSubscriptionMailingTypesResult(ArrayOfMailingList value) {
        this.getSubscriptionMailingTypesResult = value;
    }

}
