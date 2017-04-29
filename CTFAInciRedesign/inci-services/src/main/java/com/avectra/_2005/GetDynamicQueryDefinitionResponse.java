
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
 *         &lt;element name="GetDynamicQueryDefinitionResult" type="{http://www.avectra.com/2005/}QueryDefinition" minOccurs="0"/>
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
    "getDynamicQueryDefinitionResult"
})
@XmlRootElement(name = "GetDynamicQueryDefinitionResponse")
public class GetDynamicQueryDefinitionResponse {

    @XmlElement(name = "GetDynamicQueryDefinitionResult")
    protected QueryDefinition getDynamicQueryDefinitionResult;

    /**
     * Gets the value of the getDynamicQueryDefinitionResult property.
     * 
     * @return
     *     possible object is
     *     {@link QueryDefinition }
     *     
     */
    public QueryDefinition getGetDynamicQueryDefinitionResult() {
        return getDynamicQueryDefinitionResult;
    }

    /**
     * Sets the value of the getDynamicQueryDefinitionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryDefinition }
     *     
     */
    public void setGetDynamicQueryDefinitionResult(QueryDefinition value) {
        this.getDynamicQueryDefinitionResult = value;
    }

}
