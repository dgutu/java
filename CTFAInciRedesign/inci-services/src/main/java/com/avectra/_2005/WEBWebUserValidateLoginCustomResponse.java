
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
 *         &lt;element name="WEBWebUserValidateLogin_CustomResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "webWebUserValidateLoginCustomResult"
})
@XmlRootElement(name = "WEBWebUserValidateLogin_CustomResponse")
public class WEBWebUserValidateLoginCustomResponse {

    @XmlElement(name = "WEBWebUserValidateLogin_CustomResult")
    protected String webWebUserValidateLoginCustomResult;

    /**
     * Gets the value of the webWebUserValidateLoginCustomResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBWebUserValidateLoginCustomResult() {
        return webWebUserValidateLoginCustomResult;
    }

    /**
     * Sets the value of the webWebUserValidateLoginCustomResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBWebUserValidateLoginCustomResult(String value) {
        this.webWebUserValidateLoginCustomResult = value;
    }

}
