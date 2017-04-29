
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
 *         &lt;element name="szObjectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "szObjectName"
})
@XmlRootElement(name = "GetFacadeXMLSchema")
public class GetFacadeXMLSchema {

    @XmlElement(required = true, nillable = true)
    protected String szObjectName;

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

}
