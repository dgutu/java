
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
 *         &lt;element name="GetQueryDefinitionResult" type="{http://www.avectra.com/2005/}Object" minOccurs="0"/>
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
    "getQueryDefinitionResult"
})
@XmlRootElement(name = "GetQueryDefinitionResponse")
public class GetQueryDefinitionResponse {

    @XmlElement(name = "GetQueryDefinitionResult")
    protected Object getQueryDefinitionResult;

    /**
     * Gets the value of the getQueryDefinitionResult property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGetQueryDefinitionResult() {
        return getQueryDefinitionResult;
    }

    /**
     * Sets the value of the getQueryDefinitionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setGetQueryDefinitionResult(Object value) {
        this.getQueryDefinitionResult = value;
    }

}
