
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
 *         &lt;element name="GetAllCustomerCommunicationPreferencesResult" type="{http://www.avectra.com/2005/}ArrayOfMailingListSetting" minOccurs="0"/>
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
    "getAllCustomerCommunicationPreferencesResult"
})
@XmlRootElement(name = "GetAllCustomerCommunicationPreferencesResponse")
public class GetAllCustomerCommunicationPreferencesResponse {

    @XmlElement(name = "GetAllCustomerCommunicationPreferencesResult")
    protected ArrayOfMailingListSetting getAllCustomerCommunicationPreferencesResult;

    /**
     * Gets the value of the getAllCustomerCommunicationPreferencesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMailingListSetting }
     *     
     */
    public ArrayOfMailingListSetting getGetAllCustomerCommunicationPreferencesResult() {
        return getAllCustomerCommunicationPreferencesResult;
    }

    /**
     * Sets the value of the getAllCustomerCommunicationPreferencesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMailingListSetting }
     *     
     */
    public void setGetAllCustomerCommunicationPreferencesResult(ArrayOfMailingListSetting value) {
        this.getAllCustomerCommunicationPreferencesResult = value;
    }

}
