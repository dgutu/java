
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
 *         &lt;element name="WEBPhoneGetResult" type="{http://www.avectra.com/2005/}CustomerPhoneType" minOccurs="0"/>
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
    "webPhoneGetResult"
})
@XmlRootElement(name = "WEBPhoneGetResponse")
public class WEBPhoneGetResponse {

    @XmlElement(name = "WEBPhoneGetResult")
    protected CustomerPhoneType webPhoneGetResult;

    /**
     * Gets the value of the webPhoneGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPhoneType }
     *     
     */
    public CustomerPhoneType getWEBPhoneGetResult() {
        return webPhoneGetResult;
    }

    /**
     * Sets the value of the webPhoneGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPhoneType }
     *     
     */
    public void setWEBPhoneGetResult(CustomerPhoneType value) {
        this.webPhoneGetResult = value;
    }

}
