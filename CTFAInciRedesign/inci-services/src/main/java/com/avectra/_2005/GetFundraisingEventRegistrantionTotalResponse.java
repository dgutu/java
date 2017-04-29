
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
 *         &lt;element name="GetFundraisingEventRegistrantionTotalResult" type="{http://www.avectra.com/2005/}EventUserFundraisingDetail" minOccurs="0"/>
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
    "getFundraisingEventRegistrantionTotalResult"
})
@XmlRootElement(name = "GetFundraisingEventRegistrantionTotalResponse")
public class GetFundraisingEventRegistrantionTotalResponse {

    @XmlElement(name = "GetFundraisingEventRegistrantionTotalResult")
    protected EventUserFundraisingDetail getFundraisingEventRegistrantionTotalResult;

    /**
     * Gets the value of the getFundraisingEventRegistrantionTotalResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventUserFundraisingDetail }
     *     
     */
    public EventUserFundraisingDetail getGetFundraisingEventRegistrantionTotalResult() {
        return getFundraisingEventRegistrantionTotalResult;
    }

    /**
     * Sets the value of the getFundraisingEventRegistrantionTotalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventUserFundraisingDetail }
     *     
     */
    public void setGetFundraisingEventRegistrantionTotalResult(EventUserFundraisingDetail value) {
        this.getFundraisingEventRegistrantionTotalResult = value;
    }

}
