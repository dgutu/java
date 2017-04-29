
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
 *         &lt;element name="WEBFaxUpdateResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "webFaxUpdateResult"
})
@XmlRootElement(name = "WEBFaxUpdateResponse")
public class WEBFaxUpdateResponse {

    @XmlElement(name = "WEBFaxUpdateResult")
    protected boolean webFaxUpdateResult;

    /**
     * Gets the value of the webFaxUpdateResult property.
     * 
     */
    public boolean isWEBFaxUpdateResult() {
        return webFaxUpdateResult;
    }

    /**
     * Sets the value of the webFaxUpdateResult property.
     * 
     */
    public void setWEBFaxUpdateResult(boolean value) {
        this.webFaxUpdateResult = value;
    }

}
