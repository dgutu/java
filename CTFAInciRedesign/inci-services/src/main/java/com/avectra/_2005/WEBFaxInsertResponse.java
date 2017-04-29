
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
 *         &lt;element name="WEBFaxInsertResult" type="{http://www.avectra.com/2005/}CustomerFaxType" minOccurs="0"/>
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
    "webFaxInsertResult"
})
@XmlRootElement(name = "WEBFaxInsertResponse")
public class WEBFaxInsertResponse {

    @XmlElement(name = "WEBFaxInsertResult")
    protected CustomerFaxType webFaxInsertResult;

    /**
     * Gets the value of the webFaxInsertResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerFaxType }
     *     
     */
    public CustomerFaxType getWEBFaxInsertResult() {
        return webFaxInsertResult;
    }

    /**
     * Sets the value of the webFaxInsertResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerFaxType }
     *     
     */
    public void setWEBFaxInsertResult(CustomerFaxType value) {
        this.webFaxInsertResult = value;
    }

}
