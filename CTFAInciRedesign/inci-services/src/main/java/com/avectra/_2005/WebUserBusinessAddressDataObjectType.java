
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebUser_Business_Address_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebUser_Business_Address_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adr_city" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="adr_state" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="adr_post_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="adr_country" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebUser_Business_Address_DataObjectType", propOrder = {
    "adrCity",
    "adrState",
    "adrPostCode",
    "adrCountry"
})
public class WebUserBusinessAddressDataObjectType {

    @XmlElementRef(name = "adr_city", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrCity;
    @XmlElementRef(name = "adr_state", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrState;
    @XmlElementRef(name = "adr_post_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrPostCode;
    @XmlElementRef(name = "adr_country", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrCountry;

    /**
     * Gets the value of the adrCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrCity() {
        return adrCity;
    }

    /**
     * Sets the value of the adrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrCity(JAXBElement<String> value) {
        this.adrCity = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrState() {
        return adrState;
    }

    /**
     * Sets the value of the adrState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrState(JAXBElement<String> value) {
        this.adrState = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrPostCode() {
        return adrPostCode;
    }

    /**
     * Sets the value of the adrPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrPostCode(JAXBElement<String> value) {
        this.adrPostCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrCountry() {
        return adrCountry;
    }

    /**
     * Sets the value of the adrCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrCountry(JAXBElement<String> value) {
        this.adrCountry = ((JAXBElement<String> ) value);
    }

}
