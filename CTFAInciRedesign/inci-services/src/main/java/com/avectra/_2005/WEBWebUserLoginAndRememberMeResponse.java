
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
 *         &lt;element name="WEBWebUserLoginAndRememberMeResult" type="{http://www.avectra.com/2005/}WebUserType" minOccurs="0"/>
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
    "webWebUserLoginAndRememberMeResult"
})
@XmlRootElement(name = "WEBWebUserLoginAndRememberMeResponse")
public class WEBWebUserLoginAndRememberMeResponse {

    @XmlElement(name = "WEBWebUserLoginAndRememberMeResult")
    protected WebUserType webWebUserLoginAndRememberMeResult;

    /**
     * Gets the value of the webWebUserLoginAndRememberMeResult property.
     * 
     * @return
     *     possible object is
     *     {@link WebUserType }
     *     
     */
    public WebUserType getWEBWebUserLoginAndRememberMeResult() {
        return webWebUserLoginAndRememberMeResult;
    }

    /**
     * Sets the value of the webWebUserLoginAndRememberMeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebUserType }
     *     
     */
    public void setWEBWebUserLoginAndRememberMeResult(WebUserType value) {
        this.webWebUserLoginAndRememberMeResult = value;
    }

}
