
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="oFacadeObject" type="{http://www.avectra.com/2005/}CustomerFaxType" minOccurs="0"/>
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
    "oFacadeObject"
})
@XmlRootElement(name = "WEBFaxInsert")
public class WEBFaxInsert {

    protected CustomerFaxType oFacadeObject;

    /**
     * Gets the value of the oFacadeObject property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerFaxType }
     *     
     */
    public CustomerFaxType getOFacadeObject() {
        return oFacadeObject;
    }

    /**
     * Sets the value of the oFacadeObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerFaxType }
     *     
     */
    public void setOFacadeObject(CustomerFaxType value) {
        this.oFacadeObject = value;
    }

}
