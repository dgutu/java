
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
 *         &lt;element name="WEBWebUserUnlockResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "webWebUserUnlockResult"
})
@XmlRootElement(name = "WEBWebUserUnlockResponse")
public class WEBWebUserUnlockResponse {

    @XmlElement(name = "WEBWebUserUnlockResult")
    protected boolean webWebUserUnlockResult;

    /**
     * Gets the value of the webWebUserUnlockResult property.
     * 
     */
    public boolean isWEBWebUserUnlockResult() {
        return webWebUserUnlockResult;
    }

    /**
     * Sets the value of the webWebUserUnlockResult property.
     * 
     */
    public void setWEBWebUserUnlockResult(boolean value) {
        this.webWebUserUnlockResult = value;
    }

}
