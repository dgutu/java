
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
 *         &lt;element name="WEBIndividualGetResult" type="{http://www.avectra.com/2005/}IndividualType" minOccurs="0"/>
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
    "webIndividualGetResult"
})
@XmlRootElement(name = "WEBIndividualGetResponse")
public class WEBIndividualGetResponse {

    @XmlElement(name = "WEBIndividualGetResult")
    protected IndividualType webIndividualGetResult;

    /**
     * Gets the value of the webIndividualGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualType }
     *     
     */
    public IndividualType getWEBIndividualGetResult() {
        return webIndividualGetResult;
    }

    /**
     * Sets the value of the webIndividualGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualType }
     *     
     */
    public void setWEBIndividualGetResult(IndividualType value) {
        this.webIndividualGetResult = value;
    }

}
