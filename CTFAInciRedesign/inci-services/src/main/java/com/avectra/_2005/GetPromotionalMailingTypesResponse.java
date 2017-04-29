
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
 *         &lt;element name="GetPromotionalMailingTypesResult" type="{http://www.avectra.com/2005/}ArrayOfMailingList" minOccurs="0"/>
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
    "getPromotionalMailingTypesResult"
})
@XmlRootElement(name = "GetPromotionalMailingTypesResponse")
public class GetPromotionalMailingTypesResponse {

    @XmlElement(name = "GetPromotionalMailingTypesResult")
    protected ArrayOfMailingList getPromotionalMailingTypesResult;

    /**
     * Gets the value of the getPromotionalMailingTypesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMailingList }
     *     
     */
    public ArrayOfMailingList getGetPromotionalMailingTypesResult() {
        return getPromotionalMailingTypesResult;
    }

    /**
     * Sets the value of the getPromotionalMailingTypesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMailingList }
     *     
     */
    public void setGetPromotionalMailingTypesResult(ArrayOfMailingList value) {
        this.getPromotionalMailingTypesResult = value;
    }

}
