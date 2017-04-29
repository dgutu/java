
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Individual_Home_Address_Country_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Individual_Home_Address_Country_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ct2__cty_code" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_long_name" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_fips_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_sovereignty" type="{http://www.avectra.com/2005/}stringLength120_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_status" type="{http://www.avectra.com/2005/}stringLength120_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_capital" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_idd_code" type="{http://www.avectra.com/2005/}stringLength7_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_rgn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_srg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_postal_input_mask" type="{http://www.avectra.com/2005/}stringLength255_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_phone_input_mask" type="{http://www.avectra.com/2005/}stringLength255_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_currency_code" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_currency_code_description" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_vat_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_iso_2" type="{http://www.avectra.com/2005/}stringLength2_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_iso_3" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_do_not_ship" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_iso_number" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_bpa_region" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_do_not_sell" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_dyn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_dyn_key_2" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct2__cty_cgy_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Individual_Home_Address_Country_DataObjectType", propOrder = {
    "ct2CtyCode",
    "ct2CtyAddDate",
    "ct2CtyAddUser",
    "ct2CtyChangeDate",
    "ct2CtyChangeUser",
    "ct2CtyDeleteFlag",
    "ct2CtyKey",
    "ct2CtyKeyExt",
    "ct2CtyEntityKey",
    "ct2CtyLongName",
    "ct2CtyFipsCode",
    "ct2CtySovereignty",
    "ct2CtyStatus",
    "ct2CtyCapital",
    "ct2CtyIddCode",
    "ct2CtyRgnKey",
    "ct2CtySrgKey",
    "ct2CtyPostalInputMask",
    "ct2CtyPhoneInputMask",
    "ct2CtyCurrencyCode",
    "ct2CtyCurrencyCodeDescription",
    "ct2CtyVatFlag",
    "ct2CtyIso2",
    "ct2CtyIso3",
    "ct2CtyDoNotShip",
    "ct2CtyIsoNumber",
    "ct2CtyBpaRegion",
    "ct2CtyDoNotSell",
    "ct2CtyDynKey",
    "ct2CtyDynKey2",
    "ct2CtyCgyKey"
})
public class IndividualHomeAddressCountryDataObjectType {

    @XmlElementRef(name = "ct2__cty_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyCode;
    @XmlElementRef(name = "ct2__cty_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyAddDate;
    @XmlElementRef(name = "ct2__cty_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyAddUser;
    @XmlElementRef(name = "ct2__cty_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyChangeDate;
    @XmlElementRef(name = "ct2__cty_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyChangeUser;
    @XmlElementRef(name = "ct2__cty_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct2CtyDeleteFlag;
    @XmlElementRef(name = "ct2__cty_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyKey;
    @XmlElementRef(name = "ct2__cty_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyKeyExt;
    @XmlElementRef(name = "ct2__cty_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyEntityKey;
    @XmlElementRef(name = "ct2__cty_long_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyLongName;
    @XmlElementRef(name = "ct2__cty_fips_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyFipsCode;
    @XmlElementRef(name = "ct2__cty_sovereignty", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtySovereignty;
    @XmlElementRef(name = "ct2__cty_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyStatus;
    @XmlElementRef(name = "ct2__cty_capital", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyCapital;
    @XmlElementRef(name = "ct2__cty_idd_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyIddCode;
    @XmlElementRef(name = "ct2__cty_rgn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyRgnKey;
    @XmlElementRef(name = "ct2__cty_srg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtySrgKey;
    @XmlElementRef(name = "ct2__cty_postal_input_mask", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyPostalInputMask;
    @XmlElementRef(name = "ct2__cty_phone_input_mask", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyPhoneInputMask;
    @XmlElementRef(name = "ct2__cty_currency_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyCurrencyCode;
    @XmlElementRef(name = "ct2__cty_currency_code_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyCurrencyCodeDescription;
    @XmlElementRef(name = "ct2__cty_vat_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct2CtyVatFlag;
    @XmlElementRef(name = "ct2__cty_iso_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyIso2;
    @XmlElementRef(name = "ct2__cty_iso_3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyIso3;
    @XmlElementRef(name = "ct2__cty_do_not_ship", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct2CtyDoNotShip;
    @XmlElementRef(name = "ct2__cty_iso_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyIsoNumber;
    @XmlElementRef(name = "ct2__cty_bpa_region", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyBpaRegion;
    @XmlElementRef(name = "ct2__cty_do_not_sell", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct2CtyDoNotSell;
    @XmlElementRef(name = "ct2__cty_dyn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyDynKey;
    @XmlElementRef(name = "ct2__cty_dyn_key_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyDynKey2;
    @XmlElementRef(name = "ct2__cty_cgy_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct2CtyCgyKey;

    /**
     * Gets the value of the ct2CtyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyCode() {
        return ct2CtyCode;
    }

    /**
     * Sets the value of the ct2CtyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyCode(JAXBElement<String> value) {
        this.ct2CtyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtyAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyAddDate() {
        return ct2CtyAddDate;
    }

    /**
     * Sets the value of the ct2CtyAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyAddDate(JAXBElement<String> value) {
        this.ct2CtyAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtyAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyAddUser() {
        return ct2CtyAddUser;
    }

    /**
     * Sets the value of the ct2CtyAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyAddUser(JAXBElement<String> value) {
        this.ct2CtyAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtyChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyChangeDate() {
        return ct2CtyChangeDate;
    }

    /**
     * Sets the value of the ct2CtyChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyChangeDate(JAXBElement<String> value) {
        this.ct2CtyChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtyChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyChangeUser() {
        return ct2CtyChangeUser;
    }

    /**
     * Sets the value of the ct2CtyChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyChangeUser(JAXBElement<String> value) {
        this.ct2CtyChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtyDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt2CtyDeleteFlag() {
        return ct2CtyDeleteFlag;
    }

    /**
     * Sets the value of the ct2CtyDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt2CtyDeleteFlag(JAXBElement<Short> value) {
        this.ct2CtyDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct2CtyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyKey() {
        return ct2CtyKey;
    }

    /**
     * Sets the value of the ct2CtyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyKey(JAXBElement<String> value) {
        this.ct2CtyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtyKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyKeyExt() {
        return ct2CtyKeyExt;
    }

    /**
     * Sets the value of the ct2CtyKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyKeyExt(JAXBElement<String> value) {
        this.ct2CtyKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtyEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyEntityKey() {
        return ct2CtyEntityKey;
    }

    /**
     * Sets the value of the ct2CtyEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyEntityKey(JAXBElement<String> value) {
        this.ct2CtyEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtyLongName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyLongName() {
        return ct2CtyLongName;
    }

    /**
     * Sets the value of the ct2CtyLongName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyLongName(JAXBElement<String> value) {
        this.ct2CtyLongName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtyFipsCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyFipsCode() {
        return ct2CtyFipsCode;
    }

    /**
     * Sets the value of the ct2CtyFipsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyFipsCode(JAXBElement<String> value) {
        this.ct2CtyFipsCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtySovereignty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtySovereignty() {
        return ct2CtySovereignty;
    }

    /**
     * Sets the value of the ct2CtySovereignty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtySovereignty(JAXBElement<String> value) {
        this.ct2CtySovereignty = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyStatus() {
        return ct2CtyStatus;
    }

    /**
     * Sets the value of the ct2CtyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyStatus(JAXBElement<String> value) {
        this.ct2CtyStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtyCapital property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyCapital() {
        return ct2CtyCapital;
    }

    /**
     * Sets the value of the ct2CtyCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyCapital(JAXBElement<String> value) {
        this.ct2CtyCapital = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtyIddCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyIddCode() {
        return ct2CtyIddCode;
    }

    /**
     * Sets the value of the ct2CtyIddCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyIddCode(JAXBElement<String> value) {
        this.ct2CtyIddCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtyRgnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyRgnKey() {
        return ct2CtyRgnKey;
    }

    /**
     * Sets the value of the ct2CtyRgnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyRgnKey(JAXBElement<String> value) {
        this.ct2CtyRgnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtySrgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtySrgKey() {
        return ct2CtySrgKey;
    }

    /**
     * Sets the value of the ct2CtySrgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtySrgKey(JAXBElement<String> value) {
        this.ct2CtySrgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtyPostalInputMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyPostalInputMask() {
        return ct2CtyPostalInputMask;
    }

    /**
     * Sets the value of the ct2CtyPostalInputMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyPostalInputMask(JAXBElement<String> value) {
        this.ct2CtyPostalInputMask = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtyPhoneInputMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyPhoneInputMask() {
        return ct2CtyPhoneInputMask;
    }

    /**
     * Sets the value of the ct2CtyPhoneInputMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyPhoneInputMask(JAXBElement<String> value) {
        this.ct2CtyPhoneInputMask = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtyCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyCurrencyCode() {
        return ct2CtyCurrencyCode;
    }

    /**
     * Sets the value of the ct2CtyCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyCurrencyCode(JAXBElement<String> value) {
        this.ct2CtyCurrencyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtyCurrencyCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyCurrencyCodeDescription() {
        return ct2CtyCurrencyCodeDescription;
    }

    /**
     * Sets the value of the ct2CtyCurrencyCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyCurrencyCodeDescription(JAXBElement<String> value) {
        this.ct2CtyCurrencyCodeDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtyVatFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt2CtyVatFlag() {
        return ct2CtyVatFlag;
    }

    /**
     * Sets the value of the ct2CtyVatFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt2CtyVatFlag(JAXBElement<Short> value) {
        this.ct2CtyVatFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct2CtyIso2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyIso2() {
        return ct2CtyIso2;
    }

    /**
     * Sets the value of the ct2CtyIso2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyIso2(JAXBElement<String> value) {
        this.ct2CtyIso2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtyIso3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyIso3() {
        return ct2CtyIso3;
    }

    /**
     * Sets the value of the ct2CtyIso3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyIso3(JAXBElement<String> value) {
        this.ct2CtyIso3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtyDoNotShip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt2CtyDoNotShip() {
        return ct2CtyDoNotShip;
    }

    /**
     * Sets the value of the ct2CtyDoNotShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt2CtyDoNotShip(JAXBElement<Short> value) {
        this.ct2CtyDoNotShip = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct2CtyIsoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyIsoNumber() {
        return ct2CtyIsoNumber;
    }

    /**
     * Sets the value of the ct2CtyIsoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyIsoNumber(JAXBElement<String> value) {
        this.ct2CtyIsoNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtyBpaRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyBpaRegion() {
        return ct2CtyBpaRegion;
    }

    /**
     * Sets the value of the ct2CtyBpaRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyBpaRegion(JAXBElement<String> value) {
        this.ct2CtyBpaRegion = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtyDoNotSell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt2CtyDoNotSell() {
        return ct2CtyDoNotSell;
    }

    /**
     * Sets the value of the ct2CtyDoNotSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt2CtyDoNotSell(JAXBElement<Short> value) {
        this.ct2CtyDoNotSell = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct2CtyDynKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyDynKey() {
        return ct2CtyDynKey;
    }

    /**
     * Sets the value of the ct2CtyDynKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyDynKey(JAXBElement<String> value) {
        this.ct2CtyDynKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtyDynKey2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyDynKey2() {
        return ct2CtyDynKey2;
    }

    /**
     * Sets the value of the ct2CtyDynKey2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyDynKey2(JAXBElement<String> value) {
        this.ct2CtyDynKey2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct2CtyCgyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt2CtyCgyKey() {
        return ct2CtyCgyKey;
    }

    /**
     * Sets the value of the ct2CtyCgyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt2CtyCgyKey(JAXBElement<String> value) {
        this.ct2CtyCgyKey = ((JAXBElement<String> ) value);
    }

}
