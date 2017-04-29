
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
 *         &lt;element name="WEBActivityNumberOfRegisteredGuestsResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "webActivityNumberOfRegisteredGuestsResult"
})
@XmlRootElement(name = "WEBActivityNumberOfRegisteredGuestsResponse")
public class WEBActivityNumberOfRegisteredGuestsResponse {

    @XmlElement(name = "WEBActivityNumberOfRegisteredGuestsResult")
    protected int webActivityNumberOfRegisteredGuestsResult;

    /**
     * Gets the value of the webActivityNumberOfRegisteredGuestsResult property.
     * 
     */
    public int getWEBActivityNumberOfRegisteredGuestsResult() {
        return webActivityNumberOfRegisteredGuestsResult;
    }

    /**
     * Sets the value of the webActivityNumberOfRegisteredGuestsResult property.
     * 
     */
    public void setWEBActivityNumberOfRegisteredGuestsResult(int value) {
        this.webActivityNumberOfRegisteredGuestsResult = value;
    }

}
