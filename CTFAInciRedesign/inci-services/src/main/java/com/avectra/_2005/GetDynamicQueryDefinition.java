
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
 *         &lt;element name="szObjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="szQueryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="que_key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "szObjectName",
    "szQueryName",
    "queKey"
})
@XmlRootElement(name = "GetDynamicQueryDefinition")
public class GetDynamicQueryDefinition {

    protected String szObjectName;
    protected String szQueryName;
    @XmlElement(name = "que_key")
    protected String queKey;

    /**
     * Gets the value of the szObjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSzObjectName() {
        return szObjectName;
    }

    /**
     * Sets the value of the szObjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSzObjectName(String value) {
        this.szObjectName = value;
    }

    /**
     * Gets the value of the szQueryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSzQueryName() {
        return szQueryName;
    }

    /**
     * Sets the value of the szQueryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSzQueryName(String value) {
        this.szQueryName = value;
    }

    /**
     * Gets the value of the queKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueKey() {
        return queKey;
    }

    /**
     * Sets the value of the queKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueKey(String value) {
        this.queKey = value;
    }

}
