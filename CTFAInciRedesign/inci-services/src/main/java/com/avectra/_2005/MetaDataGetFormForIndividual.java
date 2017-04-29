
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
 *         &lt;element name="FormKey" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="oFacadeObject" type="{http://www.avectra.com/2005/}IndividualType" minOccurs="0"/>
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
    "formKey",
    "oFacadeObject"
})
@XmlRootElement(name = "MetaDataGetFormForIndividual")
public class MetaDataGetFormForIndividual {

    @XmlElement(name = "FormKey", required = true)
    protected String formKey;
    protected IndividualType oFacadeObject;

    /**
     * Gets the value of the formKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormKey() {
        return formKey;
    }

    /**
     * Sets the value of the formKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormKey(String value) {
        this.formKey = value;
    }

    /**
     * Gets the value of the oFacadeObject property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualType }
     *     
     */
    public IndividualType getOFacadeObject() {
        return oFacadeObject;
    }

    /**
     * Sets the value of the oFacadeObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualType }
     *     
     */
    public void setOFacadeObject(IndividualType value) {
        this.oFacadeObject = value;
    }

}
