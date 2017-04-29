
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
 *         &lt;element name="WEBWebUserLockResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "webWebUserLockResult"
})
@XmlRootElement(name = "WEBWebUserLockResponse")
public class WEBWebUserLockResponse {

    @XmlElement(name = "WEBWebUserLockResult")
    protected boolean webWebUserLockResult;

    /**
     * Gets the value of the webWebUserLockResult property.
     * 
     */
    public boolean isWEBWebUserLockResult() {
        return webWebUserLockResult;
    }

    /**
     * Sets the value of the webWebUserLockResult property.
     * 
     */
    public void setWEBWebUserLockResult(boolean value) {
        this.webWebUserLockResult = value;
    }

}
