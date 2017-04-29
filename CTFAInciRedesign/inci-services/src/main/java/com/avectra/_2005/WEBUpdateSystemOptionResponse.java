
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
 *         &lt;element name="WEBUpdateSystemOptionResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "webUpdateSystemOptionResult"
})
@XmlRootElement(name = "WEBUpdateSystemOptionResponse")
public class WEBUpdateSystemOptionResponse {

    @XmlElement(name = "WEBUpdateSystemOptionResult")
    protected boolean webUpdateSystemOptionResult;

    /**
     * Gets the value of the webUpdateSystemOptionResult property.
     * 
     */
    public boolean isWEBUpdateSystemOptionResult() {
        return webUpdateSystemOptionResult;
    }

    /**
     * Sets the value of the webUpdateSystemOptionResult property.
     * 
     */
    public void setWEBUpdateSystemOptionResult(boolean value) {
        this.webUpdateSystemOptionResult = value;
    }

}
