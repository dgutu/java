
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
 *         &lt;element name="WEBWebUserUpdateResult" type="{http://www.avectra.com/2005/}WebUserType" minOccurs="0"/>
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
    "webWebUserUpdateResult"
})
@XmlRootElement(name = "WEBWebUserUpdateResponse")
public class WEBWebUserUpdateResponse {

    @XmlElement(name = "WEBWebUserUpdateResult")
    protected WebUserType webWebUserUpdateResult;

    /**
     * Gets the value of the webWebUserUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link WebUserType }
     *     
     */
    public WebUserType getWEBWebUserUpdateResult() {
        return webWebUserUpdateResult;
    }

    /**
     * Sets the value of the webWebUserUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebUserType }
     *     
     */
    public void setWEBWebUserUpdateResult(WebUserType value) {
        this.webWebUserUpdateResult = value;
    }

}
