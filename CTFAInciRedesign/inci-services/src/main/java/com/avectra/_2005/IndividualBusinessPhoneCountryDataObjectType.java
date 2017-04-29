
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Individual_Business_Phone_Country_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Individual_Business_Phone_Country_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ct3__cty_code" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_long_name" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_fips_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_sovereignty" type="{http://www.avectra.com/2005/}stringLength120_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_status" type="{http://www.avectra.com/2005/}stringLength120_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_capital" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_idd_code" type="{http://www.avectra.com/2005/}stringLength7_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_rgn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_srg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_postal_input_mask" type="{http://www.avectra.com/2005/}stringLength255_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_phone_input_mask" type="{http://www.avectra.com/2005/}stringLength255_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_currency_code" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_currency_code_description" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_vat_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_iso_2" type="{http://www.avectra.com/2005/}stringLength2_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_iso_3" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_do_not_ship" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_iso_number" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_bpa_region" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_do_not_sell" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_dyn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_dyn_key_2" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct3__cty_cgy_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Individual_Business_Phone_Country_DataObjectType", propOrder = {
    "ct3CtyCode",
    "ct3CtyAddDate",
    "ct3CtyAddUser",
    "ct3CtyChangeDate",
    "ct3CtyChangeUser",
    "ct3CtyDeleteFlag",
    "ct3CtyKey",
    "ct3CtyKeyExt",
    "ct3CtyEntityKey",
    "ct3CtyLongName",
    "ct3CtyFipsCode",
    "ct3CtySovereignty",
    "ct3CtyStatus",
    "ct3CtyCapital",
    "ct3CtyIddCode",
    "ct3CtyRgnKey",
    "ct3CtySrgKey",
    "ct3CtyPostalInputMask",
    "ct3CtyPhoneInputMask",
    "ct3CtyCurrencyCode",
    "ct3CtyCurrencyCodeDescription",
    "ct3CtyVatFlag",
    "ct3CtyIso2",
    "ct3CtyIso3",
    "ct3CtyDoNotShip",
    "ct3CtyIsoNumber",
    "ct3CtyBpaRegion",
    "ct3CtyDoNotSell",
    "ct3CtyDynKey",
    "ct3CtyDynKey2",
    "ct3CtyCgyKey"
})
public class IndividualBusinessPhoneCountryDataObjectType {

    @XmlElementRef(name = "ct3__cty_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyCode;
    @XmlElementRef(name = "ct3__cty_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyAddDate;
    @XmlElementRef(name = "ct3__cty_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyAddUser;
    @XmlElementRef(name = "ct3__cty_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyChangeDate;
    @XmlElementRef(name = "ct3__cty_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyChangeUser;
    @XmlElementRef(name = "ct3__cty_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct3CtyDeleteFlag;
    @XmlElementRef(name = "ct3__cty_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyKey;
    @XmlElementRef(name = "ct3__cty_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyKeyExt;
    @XmlElementRef(name = "ct3__cty_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyEntityKey;
    @XmlElementRef(name = "ct3__cty_long_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyLongName;
    @XmlElementRef(name = "ct3__cty_fips_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyFipsCode;
    @XmlElementRef(name = "ct3__cty_sovereignty", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtySovereignty;
    @XmlElementRef(name = "ct3__cty_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyStatus;
    @XmlElementRef(name = "ct3__cty_capital", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyCapital;
    @XmlElementRef(name = "ct3__cty_idd_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyIddCode;
    @XmlElementRef(name = "ct3__cty_rgn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyRgnKey;
    @XmlElementRef(name = "ct3__cty_srg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtySrgKey;
    @XmlElementRef(name = "ct3__cty_postal_input_mask", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyPostalInputMask;
    @XmlElementRef(name = "ct3__cty_phone_input_mask", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyPhoneInputMask;
    @XmlElementRef(name = "ct3__cty_currency_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyCurrencyCode;
    @XmlElementRef(name = "ct3__cty_currency_code_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyCurrencyCodeDescription;
    @XmlElementRef(name = "ct3__cty_vat_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct3CtyVatFlag;
    @XmlElementRef(name = "ct3__cty_iso_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyIso2;
    @XmlElementRef(name = "ct3__cty_iso_3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyIso3;
    @XmlElementRef(name = "ct3__cty_do_not_ship", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct3CtyDoNotShip;
    @XmlElementRef(name = "ct3__cty_iso_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyIsoNumber;
    @XmlElementRef(name = "ct3__cty_bpa_region", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyBpaRegion;
    @XmlElementRef(name = "ct3__cty_do_not_sell", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct3CtyDoNotSell;
    @XmlElementRef(name = "ct3__cty_dyn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyDynKey;
    @XmlElementRef(name = "ct3__cty_dyn_key_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyDynKey2;
    @XmlElementRef(name = "ct3__cty_cgy_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct3CtyCgyKey;

    /**
     * Gets the value of the ct3CtyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyCode() {
        return ct3CtyCode;
    }

    /**
     * Sets the value of the ct3CtyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyCode(JAXBElement<String> value) {
        this.ct3CtyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtyAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyAddDate() {
        return ct3CtyAddDate;
    }

    /**
     * Sets the value of the ct3CtyAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyAddDate(JAXBElement<String> value) {
        this.ct3CtyAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtyAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyAddUser() {
        return ct3CtyAddUser;
    }

    /**
     * Sets the value of the ct3CtyAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyAddUser(JAXBElement<String> value) {
        this.ct3CtyAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtyChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyChangeDate() {
        return ct3CtyChangeDate;
    }

    /**
     * Sets the value of the ct3CtyChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyChangeDate(JAXBElement<String> value) {
        this.ct3CtyChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtyChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyChangeUser() {
        return ct3CtyChangeUser;
    }

    /**
     * Sets the value of the ct3CtyChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyChangeUser(JAXBElement<String> value) {
        this.ct3CtyChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtyDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt3CtyDeleteFlag() {
        return ct3CtyDeleteFlag;
    }

    /**
     * Sets the value of the ct3CtyDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt3CtyDeleteFlag(JAXBElement<Short> value) {
        this.ct3CtyDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct3CtyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyKey() {
        return ct3CtyKey;
    }

    /**
     * Sets the value of the ct3CtyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyKey(JAXBElement<String> value) {
        this.ct3CtyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtyKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyKeyExt() {
        return ct3CtyKeyExt;
    }

    /**
     * Sets the value of the ct3CtyKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyKeyExt(JAXBElement<String> value) {
        this.ct3CtyKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtyEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyEntityKey() {
        return ct3CtyEntityKey;
    }

    /**
     * Sets the value of the ct3CtyEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyEntityKey(JAXBElement<String> value) {
        this.ct3CtyEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtyLongName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyLongName() {
        return ct3CtyLongName;
    }

    /**
     * Sets the value of the ct3CtyLongName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyLongName(JAXBElement<String> value) {
        this.ct3CtyLongName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtyFipsCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyFipsCode() {
        return ct3CtyFipsCode;
    }

    /**
     * Sets the value of the ct3CtyFipsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyFipsCode(JAXBElement<String> value) {
        this.ct3CtyFipsCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtySovereignty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtySovereignty() {
        return ct3CtySovereignty;
    }

    /**
     * Sets the value of the ct3CtySovereignty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtySovereignty(JAXBElement<String> value) {
        this.ct3CtySovereignty = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyStatus() {
        return ct3CtyStatus;
    }

    /**
     * Sets the value of the ct3CtyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyStatus(JAXBElement<String> value) {
        this.ct3CtyStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtyCapital property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyCapital() {
        return ct3CtyCapital;
    }

    /**
     * Sets the value of the ct3CtyCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyCapital(JAXBElement<String> value) {
        this.ct3CtyCapital = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtyIddCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyIddCode() {
        return ct3CtyIddCode;
    }

    /**
     * Sets the value of the ct3CtyIddCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyIddCode(JAXBElement<String> value) {
        this.ct3CtyIddCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtyRgnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyRgnKey() {
        return ct3CtyRgnKey;
    }

    /**
     * Sets the value of the ct3CtyRgnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyRgnKey(JAXBElement<String> value) {
        this.ct3CtyRgnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtySrgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtySrgKey() {
        return ct3CtySrgKey;
    }

    /**
     * Sets the value of the ct3CtySrgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtySrgKey(JAXBElement<String> value) {
        this.ct3CtySrgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtyPostalInputMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyPostalInputMask() {
        return ct3CtyPostalInputMask;
    }

    /**
     * Sets the value of the ct3CtyPostalInputMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyPostalInputMask(JAXBElement<String> value) {
        this.ct3CtyPostalInputMask = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtyPhoneInputMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyPhoneInputMask() {
        return ct3CtyPhoneInputMask;
    }

    /**
     * Sets the value of the ct3CtyPhoneInputMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyPhoneInputMask(JAXBElement<String> value) {
        this.ct3CtyPhoneInputMask = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtyCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyCurrencyCode() {
        return ct3CtyCurrencyCode;
    }

    /**
     * Sets the value of the ct3CtyCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyCurrencyCode(JAXBElement<String> value) {
        this.ct3CtyCurrencyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtyCurrencyCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyCurrencyCodeDescription() {
        return ct3CtyCurrencyCodeDescription;
    }

    /**
     * Sets the value of the ct3CtyCurrencyCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyCurrencyCodeDescription(JAXBElement<String> value) {
        this.ct3CtyCurrencyCodeDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtyVatFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt3CtyVatFlag() {
        return ct3CtyVatFlag;
    }

    /**
     * Sets the value of the ct3CtyVatFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt3CtyVatFlag(JAXBElement<Short> value) {
        this.ct3CtyVatFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct3CtyIso2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyIso2() {
        return ct3CtyIso2;
    }

    /**
     * Sets the value of the ct3CtyIso2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyIso2(JAXBElement<String> value) {
        this.ct3CtyIso2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtyIso3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyIso3() {
        return ct3CtyIso3;
    }

    /**
     * Sets the value of the ct3CtyIso3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyIso3(JAXBElement<String> value) {
        this.ct3CtyIso3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtyDoNotShip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt3CtyDoNotShip() {
        return ct3CtyDoNotShip;
    }

    /**
     * Sets the value of the ct3CtyDoNotShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt3CtyDoNotShip(JAXBElement<Short> value) {
        this.ct3CtyDoNotShip = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct3CtyIsoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyIsoNumber() {
        return ct3CtyIsoNumber;
    }

    /**
     * Sets the value of the ct3CtyIsoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyIsoNumber(JAXBElement<String> value) {
        this.ct3CtyIsoNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtyBpaRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyBpaRegion() {
        return ct3CtyBpaRegion;
    }

    /**
     * Sets the value of the ct3CtyBpaRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyBpaRegion(JAXBElement<String> value) {
        this.ct3CtyBpaRegion = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtyDoNotSell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt3CtyDoNotSell() {
        return ct3CtyDoNotSell;
    }

    /**
     * Sets the value of the ct3CtyDoNotSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt3CtyDoNotSell(JAXBElement<Short> value) {
        this.ct3CtyDoNotSell = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct3CtyDynKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyDynKey() {
        return ct3CtyDynKey;
    }

    /**
     * Sets the value of the ct3CtyDynKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyDynKey(JAXBElement<String> value) {
        this.ct3CtyDynKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtyDynKey2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyDynKey2() {
        return ct3CtyDynKey2;
    }

    /**
     * Sets the value of the ct3CtyDynKey2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyDynKey2(JAXBElement<String> value) {
        this.ct3CtyDynKey2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct3CtyCgyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt3CtyCgyKey() {
        return ct3CtyCgyKey;
    }

    /**
     * Sets the value of the ct3CtyCgyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt3CtyCgyKey(JAXBElement<String> value) {
        this.ct3CtyCgyKey = ((JAXBElement<String> ) value);
    }

}
