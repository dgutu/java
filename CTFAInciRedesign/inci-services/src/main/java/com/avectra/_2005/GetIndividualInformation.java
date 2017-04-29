
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
 *         &lt;element name="IndividualKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "individualKey"
})
@XmlRootElement(name = "GetIndividualInformation")
public class GetIndividualInformation {

    @XmlElement(name = "IndividualKey", required = true, nillable = true)
    protected String individualKey;

    /**
     * Gets the value of the individualKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualKey() {
        return individualKey;
    }

    /**
     * Sets the value of the individualKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividualKey(String value) {
        this.individualKey = value;
    }

}
