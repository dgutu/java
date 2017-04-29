
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
 *         &lt;element name="szOptionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="szOptionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "szOptionName",
    "szOptionValue"
})
@XmlRootElement(name = "WEBUpdateSystemOption")
public class WEBUpdateSystemOption {

    @XmlElement(required = true, nillable = true)
    protected String szOptionName;
    protected String szOptionValue;

    /**
     * Gets the value of the szOptionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSzOptionName() {
        return szOptionName;
    }

    /**
     * Sets the value of the szOptionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSzOptionName(String value) {
        this.szOptionName = value;
    }

    /**
     * Gets the value of the szOptionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSzOptionValue() {
        return szOptionValue;
    }

    /**
     * Sets the value of the szOptionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSzOptionValue(String value) {
        this.szOptionValue = value;
    }

}
