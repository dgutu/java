
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
 *         &lt;element name="MetaDataGetFormControlForFacadeObjectResult" type="{http://www.avectra.com/2005/}ArrayOfAVFormControl" minOccurs="0"/>
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
    "metaDataGetFormControlForFacadeObjectResult"
})
@XmlRootElement(name = "MetaDataGetFormControlForFacadeObjectResponse")
public class MetaDataGetFormControlForFacadeObjectResponse {

    @XmlElement(name = "MetaDataGetFormControlForFacadeObjectResult")
    protected ArrayOfAVFormControl metaDataGetFormControlForFacadeObjectResult;

    /**
     * Gets the value of the metaDataGetFormControlForFacadeObjectResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAVFormControl }
     *     
     */
    public ArrayOfAVFormControl getMetaDataGetFormControlForFacadeObjectResult() {
        return metaDataGetFormControlForFacadeObjectResult;
    }

    /**
     * Sets the value of the metaDataGetFormControlForFacadeObjectResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAVFormControl }
     *     
     */
    public void setMetaDataGetFormControlForFacadeObjectResult(ArrayOfAVFormControl value) {
        this.metaDataGetFormControlForFacadeObjectResult = value;
    }

}
