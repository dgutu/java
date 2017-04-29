
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualAddress_StateTerritory_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualAddress_StateTerritory_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sta_code" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="sta_cty_code" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="sta_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="sta_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="sta_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="sta_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="sta_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="sta_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="sta_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="sta_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="sta_name" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="sta_type" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="sta_rgn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="sta_bpa_region" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="sta_iso_code" type="{http://www.avectra.com/2005/}stringLength6_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualAddress_StateTerritory_DataObjectType", propOrder = {
    "staCode",
    "staCtyCode",
    "staAddUser",
    "staAddDate",
    "staChangeDate",
    "staChangeUser",
    "staDeleteFlag",
    "staKey",
    "staKeyExt",
    "staEntityKey",
    "staName",
    "staType",
    "staRgnKey",
    "staBpaRegion",
    "staIsoCode"
})
public class IndividualAddressStateTerritoryDataObjectType {

    @XmlElementRef(name = "sta_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> staCode;
    @XmlElementRef(name = "sta_cty_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> staCtyCode;
    @XmlElementRef(name = "sta_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> staAddUser;
    @XmlElementRef(name = "sta_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> staAddDate;
    @XmlElementRef(name = "sta_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> staChangeDate;
    @XmlElementRef(name = "sta_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> staChangeUser;
    @XmlElementRef(name = "sta_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> staDeleteFlag;
    @XmlElementRef(name = "sta_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> staKey;
    @XmlElementRef(name = "sta_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> staKeyExt;
    @XmlElementRef(name = "sta_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> staEntityKey;
    @XmlElementRef(name = "sta_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> staName;
    @XmlElementRef(name = "sta_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> staType;
    @XmlElementRef(name = "sta_rgn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> staRgnKey;
    @XmlElementRef(name = "sta_bpa_region", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> staBpaRegion;
    @XmlElementRef(name = "sta_iso_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> staIsoCode;

    /**
     * Gets the value of the staCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStaCode() {
        return staCode;
    }

    /**
     * Sets the value of the staCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStaCode(JAXBElement<String> value) {
        this.staCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the staCtyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStaCtyCode() {
        return staCtyCode;
    }

    /**
     * Sets the value of the staCtyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStaCtyCode(JAXBElement<String> value) {
        this.staCtyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the staAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStaAddUser() {
        return staAddUser;
    }

    /**
     * Sets the value of the staAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStaAddUser(JAXBElement<String> value) {
        this.staAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the staAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStaAddDate() {
        return staAddDate;
    }

    /**
     * Sets the value of the staAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStaAddDate(JAXBElement<String> value) {
        this.staAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the staChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStaChangeDate() {
        return staChangeDate;
    }

    /**
     * Sets the value of the staChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStaChangeDate(JAXBElement<String> value) {
        this.staChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the staChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStaChangeUser() {
        return staChangeUser;
    }

    /**
     * Sets the value of the staChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStaChangeUser(JAXBElement<String> value) {
        this.staChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the staDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getStaDeleteFlag() {
        return staDeleteFlag;
    }

    /**
     * Sets the value of the staDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setStaDeleteFlag(JAXBElement<Short> value) {
        this.staDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the staKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStaKey() {
        return staKey;
    }

    /**
     * Sets the value of the staKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStaKey(JAXBElement<String> value) {
        this.staKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the staKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStaKeyExt() {
        return staKeyExt;
    }

    /**
     * Sets the value of the staKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStaKeyExt(JAXBElement<String> value) {
        this.staKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the staEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStaEntityKey() {
        return staEntityKey;
    }

    /**
     * Sets the value of the staEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStaEntityKey(JAXBElement<String> value) {
        this.staEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the staName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStaName() {
        return staName;
    }

    /**
     * Sets the value of the staName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStaName(JAXBElement<String> value) {
        this.staName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the staType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStaType() {
        return staType;
    }

    /**
     * Sets the value of the staType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStaType(JAXBElement<String> value) {
        this.staType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the staRgnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStaRgnKey() {
        return staRgnKey;
    }

    /**
     * Sets the value of the staRgnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStaRgnKey(JAXBElement<String> value) {
        this.staRgnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the staBpaRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStaBpaRegion() {
        return staBpaRegion;
    }

    /**
     * Sets the value of the staBpaRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStaBpaRegion(JAXBElement<String> value) {
        this.staBpaRegion = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the staIsoCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStaIsoCode() {
        return staIsoCode;
    }

    /**
     * Sets the value of the staIsoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStaIsoCode(JAXBElement<String> value) {
        this.staIsoCode = ((JAXBElement<String> ) value);
    }

}
