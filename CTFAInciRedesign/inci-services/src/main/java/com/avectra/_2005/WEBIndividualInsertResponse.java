
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
 *         &lt;element name="WEBIndividualInsertResult" type="{http://www.avectra.com/2005/}IndividualType" minOccurs="0"/>
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
    "webIndividualInsertResult"
})
@XmlRootElement(name = "WEBIndividualInsertResponse")
public class WEBIndividualInsertResponse {

    @XmlElement(name = "WEBIndividualInsertResult")
    protected IndividualType webIndividualInsertResult;

    /**
     * Gets the value of the webIndividualInsertResult property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualType }
     *     
     */
    public IndividualType getWEBIndividualInsertResult() {
        return webIndividualInsertResult;
    }

    /**
     * Sets the value of the webIndividualInsertResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualType }
     *     
     */
    public void setWEBIndividualInsertResult(IndividualType value) {
        this.webIndividualInsertResult = value;
    }

}
