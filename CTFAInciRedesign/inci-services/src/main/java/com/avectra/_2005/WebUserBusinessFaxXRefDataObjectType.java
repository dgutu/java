
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebUser_Business_Fax_XRef_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebUser_Business_Fax_XRef_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cfx_extension" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebUser_Business_Fax_XRef_DataObjectType", propOrder = {
    "cfxExtension"
})
public class WebUserBusinessFaxXRefDataObjectType {

    @XmlElementRef(name = "cfx_extension", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cfxExtension;

    /**
     * Gets the value of the cfxExtension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCfxExtension() {
        return cfxExtension;
    }

    /**
     * Sets the value of the cfxExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCfxExtension(JAXBElement<String> value) {
        this.cfxExtension = ((JAXBElement<String> ) value);
    }

}
