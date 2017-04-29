
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebUser_Business_Phone_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebUser_Business_Phone_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phn_number" type="{http://www.avectra.com/2005/}av_phone_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebUser_Business_Phone_DataObjectType", propOrder = {
    "phnNumber"
})
public class WebUserBusinessPhoneDataObjectType {

    @XmlElementRef(name = "phn_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> phnNumber;

    /**
     * Gets the value of the phnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhnNumber() {
        return phnNumber;
    }

    /**
     * Sets the value of the phnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhnNumber(JAXBElement<String> value) {
        this.phnNumber = ((JAXBElement<String> ) value);
    }

}
