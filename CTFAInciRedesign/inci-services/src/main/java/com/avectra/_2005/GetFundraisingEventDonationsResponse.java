
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
 *         &lt;element name="GetFundraisingEventDonationsResult" type="{http://www.avectra.com/2005/}ArrayOfDonation" minOccurs="0"/>
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
    "getFundraisingEventDonationsResult"
})
@XmlRootElement(name = "GetFundraisingEventDonationsResponse")
public class GetFundraisingEventDonationsResponse {

    @XmlElement(name = "GetFundraisingEventDonationsResult")
    protected ArrayOfDonation getFundraisingEventDonationsResult;

    /**
     * Gets the value of the getFundraisingEventDonationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDonation }
     *     
     */
    public ArrayOfDonation getGetFundraisingEventDonationsResult() {
        return getFundraisingEventDonationsResult;
    }

    /**
     * Sets the value of the getFundraisingEventDonationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDonation }
     *     
     */
    public void setGetFundraisingEventDonationsResult(ArrayOfDonation value) {
        this.getFundraisingEventDonationsResult = value;
    }

}
