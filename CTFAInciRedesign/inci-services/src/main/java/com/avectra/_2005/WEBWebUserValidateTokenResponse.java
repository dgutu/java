
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
 *         &lt;element name="WEBWebUserValidateTokenResult" type="{http://www.avectra.com/2005/}WebUserType" minOccurs="0"/>
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
    "webWebUserValidateTokenResult"
})
@XmlRootElement(name = "WEBWebUserValidateTokenResponse")
public class WEBWebUserValidateTokenResponse {

    @XmlElement(name = "WEBWebUserValidateTokenResult")
    protected WebUserType webWebUserValidateTokenResult;

    /**
     * Gets the value of the webWebUserValidateTokenResult property.
     * 
     * @return
     *     possible object is
     *     {@link WebUserType }
     *     
     */
    public WebUserType getWEBWebUserValidateTokenResult() {
        return webWebUserValidateTokenResult;
    }

    /**
     * Sets the value of the webWebUserValidateTokenResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebUserType }
     *     
     */
    public void setWEBWebUserValidateTokenResult(WebUserType value) {
        this.webWebUserValidateTokenResult = value;
    }

}