
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
 *         &lt;element name="WEBAddressUpdateResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "webAddressUpdateResult"
})
@XmlRootElement(name = "WEBAddressUpdateResponse")
public class WEBAddressUpdateResponse {

    @XmlElement(name = "WEBAddressUpdateResult")
    protected boolean webAddressUpdateResult;

    /**
     * Gets the value of the webAddressUpdateResult property.
     * 
     */
    public boolean isWEBAddressUpdateResult() {
        return webAddressUpdateResult;
    }

    /**
     * Sets the value of the webAddressUpdateResult property.
     * 
     */
    public void setWEBAddressUpdateResult(boolean value) {
        this.webAddressUpdateResult = value;
    }

}
