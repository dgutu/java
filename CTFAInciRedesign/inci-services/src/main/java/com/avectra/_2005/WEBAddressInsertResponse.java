
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
 *         &lt;element name="WEBAddressInsertResult" type="{http://www.avectra.com/2005/}CustomerAddressType" minOccurs="0"/>
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
    "webAddressInsertResult"
})
@XmlRootElement(name = "WEBAddressInsertResponse")
public class WEBAddressInsertResponse {

    @XmlElement(name = "WEBAddressInsertResult")
    protected CustomerAddressType webAddressInsertResult;

    /**
     * Gets the value of the webAddressInsertResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAddressType }
     *     
     */
    public CustomerAddressType getWEBAddressInsertResult() {
        return webAddressInsertResult;
    }

    /**
     * Sets the value of the webAddressInsertResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAddressType }
     *     
     */
    public void setWEBAddressInsertResult(CustomerAddressType value) {
        this.webAddressInsertResult = value;
    }

}
