
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
 *         &lt;element name="WEBActivityAlreadyRegisteredForEventResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "webActivityAlreadyRegisteredForEventResult"
})
@XmlRootElement(name = "WEBActivityAlreadyRegisteredForEventResponse")
public class WEBActivityAlreadyRegisteredForEventResponse {

    @XmlElement(name = "WEBActivityAlreadyRegisteredForEventResult")
    protected boolean webActivityAlreadyRegisteredForEventResult;

    /**
     * Gets the value of the webActivityAlreadyRegisteredForEventResult property.
     * 
     */
    public boolean isWEBActivityAlreadyRegisteredForEventResult() {
        return webActivityAlreadyRegisteredForEventResult;
    }

    /**
     * Sets the value of the webActivityAlreadyRegisteredForEventResult property.
     * 
     */
    public void setWEBActivityAlreadyRegisteredForEventResult(boolean value) {
        this.webActivityAlreadyRegisteredForEventResult = value;
    }

}
