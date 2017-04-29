
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
 *         &lt;element name="WEBEmailGetResult" type="{http://www.avectra.com/2005/}CustomerEmailType" minOccurs="0"/>
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
    "webEmailGetResult"
})
@XmlRootElement(name = "WEBEmailGetResponse")
public class WEBEmailGetResponse {

    @XmlElement(name = "WEBEmailGetResult")
    protected CustomerEmailType webEmailGetResult;

    /**
     * Gets the value of the webEmailGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerEmailType }
     *     
     */
    public CustomerEmailType getWEBEmailGetResult() {
        return webEmailGetResult;
    }

    /**
     * Sets the value of the webEmailGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerEmailType }
     *     
     */
    public void setWEBEmailGetResult(CustomerEmailType value) {
        this.webEmailGetResult = value;
    }

}
