
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
 *         &lt;element name="WEBPhoneUpdateResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "webPhoneUpdateResult"
})
@XmlRootElement(name = "WEBPhoneUpdateResponse")
public class WEBPhoneUpdateResponse {

    @XmlElement(name = "WEBPhoneUpdateResult")
    protected boolean webPhoneUpdateResult;

    /**
     * Gets the value of the webPhoneUpdateResult property.
     * 
     */
    public boolean isWEBPhoneUpdateResult() {
        return webPhoneUpdateResult;
    }

    /**
     * Sets the value of the webPhoneUpdateResult property.
     * 
     */
    public void setWEBPhoneUpdateResult(boolean value) {
        this.webPhoneUpdateResult = value;
    }

}
