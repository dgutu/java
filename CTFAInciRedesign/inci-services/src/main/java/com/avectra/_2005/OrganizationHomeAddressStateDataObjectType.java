
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organization_Home_Address_State_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Home_Address_State_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="st2__sta_code" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="st2__sta_cty_code" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="st2__sta_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="st2__sta_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="st2__sta_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="st2__sta_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="st2__sta_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="st2__sta_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="st2__sta_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="st2__sta_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="st2__sta_name" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="st2__sta_type" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="st2__sta_rgn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="st2__sta_bpa_region" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="st2__sta_iso_code" type="{http://www.avectra.com/2005/}stringLength6_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Home_Address_State_DataObjectType", propOrder = {
    "st2StaCode",
    "st2StaCtyCode",
    "st2StaAddUser",
    "st2StaAddDate",
    "st2StaChangeDate",
    "st2StaChangeUser",
    "st2StaDeleteFlag",
    "st2StaKey",
    "st2StaKeyExt",
    "st2StaEntityKey",
    "st2StaName",
    "st2StaType",
    "st2StaRgnKey",
    "st2StaBpaRegion",
    "st2StaIsoCode"
})
public class OrganizationHomeAddressStateDataObjectType {

    @XmlElementRef(name = "st2__sta_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> st2StaCode;
    @XmlElementRef(name = "st2__sta_cty_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> st2StaCtyCode;
    @XmlElementRef(name = "st2__sta_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> st2StaAddUser;
    @XmlElementRef(name = "st2__sta_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> st2StaAddDate;
    @XmlElementRef(name = "st2__sta_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> st2StaChangeDate;
    @XmlElementRef(name = "st2__sta_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> st2StaChangeUser;
    @XmlElementRef(name = "st2__sta_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> st2StaDeleteFlag;
    @XmlElementRef(name = "st2__sta_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> st2StaKey;
    @XmlElementRef(name = "st2__sta_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> st2StaKeyExt;
    @XmlElementRef(name = "st2__sta_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> st2StaEntityKey;
    @XmlElementRef(name = "st2__sta_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> st2StaName;
    @XmlElementRef(name = "st2__sta_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> st2StaType;
    @XmlElementRef(name = "st2__sta_rgn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> st2StaRgnKey;
    @XmlElementRef(name = "st2__sta_bpa_region", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> st2StaBpaRegion;
    @XmlElementRef(name = "st2__sta_iso_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> st2StaIsoCode;

    /**
     * Gets the value of the st2StaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSt2StaCode() {
        return st2StaCode;
    }

    /**
     * Sets the value of the st2StaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSt2StaCode(JAXBElement<String> value) {
        this.st2StaCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the st2StaCtyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSt2StaCtyCode() {
        return st2StaCtyCode;
    }

    /**
     * Sets the value of the st2StaCtyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSt2StaCtyCode(JAXBElement<String> value) {
        this.st2StaCtyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the st2StaAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSt2StaAddUser() {
        return st2StaAddUser;
    }

    /**
     * Sets the value of the st2StaAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSt2StaAddUser(JAXBElement<String> value) {
        this.st2StaAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the st2StaAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSt2StaAddDate() {
        return st2StaAddDate;
    }

    /**
     * Sets the value of the st2StaAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSt2StaAddDate(JAXBElement<String> value) {
        this.st2StaAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the st2StaChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSt2StaChangeDate() {
        return st2StaChangeDate;
    }

    /**
     * Sets the value of the st2StaChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSt2StaChangeDate(JAXBElement<String> value) {
        this.st2StaChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the st2StaChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSt2StaChangeUser() {
        return st2StaChangeUser;
    }

    /**
     * Sets the value of the st2StaChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSt2StaChangeUser(JAXBElement<String> value) {
        this.st2StaChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the st2StaDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getSt2StaDeleteFlag() {
        return st2StaDeleteFlag;
    }

    /**
     * Sets the value of the st2StaDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setSt2StaDeleteFlag(JAXBElement<Short> value) {
        this.st2StaDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the st2StaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSt2StaKey() {
        return st2StaKey;
    }

    /**
     * Sets the value of the st2StaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSt2StaKey(JAXBElement<String> value) {
        this.st2StaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the st2StaKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSt2StaKeyExt() {
        return st2StaKeyExt;
    }

    /**
     * Sets the value of the st2StaKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSt2StaKeyExt(JAXBElement<String> value) {
        this.st2StaKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the st2StaEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSt2StaEntityKey() {
        return st2StaEntityKey;
    }

    /**
     * Sets the value of the st2StaEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSt2StaEntityKey(JAXBElement<String> value) {
        this.st2StaEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the st2StaName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSt2StaName() {
        return st2StaName;
    }

    /**
     * Sets the value of the st2StaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSt2StaName(JAXBElement<String> value) {
        this.st2StaName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the st2StaType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSt2StaType() {
        return st2StaType;
    }

    /**
     * Sets the value of the st2StaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSt2StaType(JAXBElement<String> value) {
        this.st2StaType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the st2StaRgnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSt2StaRgnKey() {
        return st2StaRgnKey;
    }

    /**
     * Sets the value of the st2StaRgnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSt2StaRgnKey(JAXBElement<String> value) {
        this.st2StaRgnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the st2StaBpaRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSt2StaBpaRegion() {
        return st2StaBpaRegion;
    }

    /**
     * Sets the value of the st2StaBpaRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSt2StaBpaRegion(JAXBElement<String> value) {
        this.st2StaBpaRegion = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the st2StaIsoCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSt2StaIsoCode() {
        return st2StaIsoCode;
    }

    /**
     * Sets the value of the st2StaIsoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSt2StaIsoCode(JAXBElement<String> value) {
        this.st2StaIsoCode = ((JAXBElement<String> ) value);
    }

}
