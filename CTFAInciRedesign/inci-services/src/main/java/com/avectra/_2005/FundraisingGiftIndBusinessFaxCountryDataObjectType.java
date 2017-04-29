
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Ind_Business_Fax_Country_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Ind_Business_Fax_Country_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ct5__cty_code" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_long_name" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_fips_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_sovereignty" type="{http://www.avectra.com/2005/}stringLength120_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_status" type="{http://www.avectra.com/2005/}stringLength120_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_capital" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_idd_code" type="{http://www.avectra.com/2005/}stringLength7_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_rgn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_srg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_postal_input_mask" type="{http://www.avectra.com/2005/}stringLength255_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_phone_input_mask" type="{http://www.avectra.com/2005/}stringLength255_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_currency_code" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_currency_code_description" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_vat_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_iso_2" type="{http://www.avectra.com/2005/}stringLength2_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_iso_3" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_do_not_ship" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_iso_number" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_bpa_region" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_do_not_sell" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_dyn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_dyn_key_2" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct5__cty_cgy_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Ind_Business_Fax_Country_DataObjectType", propOrder = {
    "ct5CtyCode",
    "ct5CtyAddDate",
    "ct5CtyAddUser",
    "ct5CtyChangeDate",
    "ct5CtyChangeUser",
    "ct5CtyDeleteFlag",
    "ct5CtyKey",
    "ct5CtyKeyExt",
    "ct5CtyEntityKey",
    "ct5CtyLongName",
    "ct5CtyFipsCode",
    "ct5CtySovereignty",
    "ct5CtyStatus",
    "ct5CtyCapital",
    "ct5CtyIddCode",
    "ct5CtyRgnKey",
    "ct5CtySrgKey",
    "ct5CtyPostalInputMask",
    "ct5CtyPhoneInputMask",
    "ct5CtyCurrencyCode",
    "ct5CtyCurrencyCodeDescription",
    "ct5CtyVatFlag",
    "ct5CtyIso2",
    "ct5CtyIso3",
    "ct5CtyDoNotShip",
    "ct5CtyIsoNumber",
    "ct5CtyBpaRegion",
    "ct5CtyDoNotSell",
    "ct5CtyDynKey",
    "ct5CtyDynKey2",
    "ct5CtyCgyKey"
})
public class FundraisingGiftIndBusinessFaxCountryDataObjectType {

    @XmlElementRef(name = "ct5__cty_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyCode;
    @XmlElementRef(name = "ct5__cty_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyAddDate;
    @XmlElementRef(name = "ct5__cty_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyAddUser;
    @XmlElementRef(name = "ct5__cty_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyChangeDate;
    @XmlElementRef(name = "ct5__cty_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyChangeUser;
    @XmlElementRef(name = "ct5__cty_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct5CtyDeleteFlag;
    @XmlElementRef(name = "ct5__cty_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyKey;
    @XmlElementRef(name = "ct5__cty_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyKeyExt;
    @XmlElementRef(name = "ct5__cty_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyEntityKey;
    @XmlElementRef(name = "ct5__cty_long_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyLongName;
    @XmlElementRef(name = "ct5__cty_fips_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyFipsCode;
    @XmlElementRef(name = "ct5__cty_sovereignty", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtySovereignty;
    @XmlElementRef(name = "ct5__cty_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyStatus;
    @XmlElementRef(name = "ct5__cty_capital", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyCapital;
    @XmlElementRef(name = "ct5__cty_idd_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyIddCode;
    @XmlElementRef(name = "ct5__cty_rgn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyRgnKey;
    @XmlElementRef(name = "ct5__cty_srg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtySrgKey;
    @XmlElementRef(name = "ct5__cty_postal_input_mask", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyPostalInputMask;
    @XmlElementRef(name = "ct5__cty_phone_input_mask", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyPhoneInputMask;
    @XmlElementRef(name = "ct5__cty_currency_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyCurrencyCode;
    @XmlElementRef(name = "ct5__cty_currency_code_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyCurrencyCodeDescription;
    @XmlElementRef(name = "ct5__cty_vat_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct5CtyVatFlag;
    @XmlElementRef(name = "ct5__cty_iso_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyIso2;
    @XmlElementRef(name = "ct5__cty_iso_3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyIso3;
    @XmlElementRef(name = "ct5__cty_do_not_ship", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct5CtyDoNotShip;
    @XmlElementRef(name = "ct5__cty_iso_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyIsoNumber;
    @XmlElementRef(name = "ct5__cty_bpa_region", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyBpaRegion;
    @XmlElementRef(name = "ct5__cty_do_not_sell", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct5CtyDoNotSell;
    @XmlElementRef(name = "ct5__cty_dyn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyDynKey;
    @XmlElementRef(name = "ct5__cty_dyn_key_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyDynKey2;
    @XmlElementRef(name = "ct5__cty_cgy_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct5CtyCgyKey;

    /**
     * Gets the value of the ct5CtyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyCode() {
        return ct5CtyCode;
    }

    /**
     * Sets the value of the ct5CtyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyCode(JAXBElement<String> value) {
        this.ct5CtyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtyAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyAddDate() {
        return ct5CtyAddDate;
    }

    /**
     * Sets the value of the ct5CtyAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyAddDate(JAXBElement<String> value) {
        this.ct5CtyAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtyAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyAddUser() {
        return ct5CtyAddUser;
    }

    /**
     * Sets the value of the ct5CtyAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyAddUser(JAXBElement<String> value) {
        this.ct5CtyAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtyChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyChangeDate() {
        return ct5CtyChangeDate;
    }

    /**
     * Sets the value of the ct5CtyChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyChangeDate(JAXBElement<String> value) {
        this.ct5CtyChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtyChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyChangeUser() {
        return ct5CtyChangeUser;
    }

    /**
     * Sets the value of the ct5CtyChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyChangeUser(JAXBElement<String> value) {
        this.ct5CtyChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtyDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt5CtyDeleteFlag() {
        return ct5CtyDeleteFlag;
    }

    /**
     * Sets the value of the ct5CtyDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt5CtyDeleteFlag(JAXBElement<Short> value) {
        this.ct5CtyDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct5CtyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyKey() {
        return ct5CtyKey;
    }

    /**
     * Sets the value of the ct5CtyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyKey(JAXBElement<String> value) {
        this.ct5CtyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtyKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyKeyExt() {
        return ct5CtyKeyExt;
    }

    /**
     * Sets the value of the ct5CtyKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyKeyExt(JAXBElement<String> value) {
        this.ct5CtyKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtyEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyEntityKey() {
        return ct5CtyEntityKey;
    }

    /**
     * Sets the value of the ct5CtyEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyEntityKey(JAXBElement<String> value) {
        this.ct5CtyEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtyLongName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyLongName() {
        return ct5CtyLongName;
    }

    /**
     * Sets the value of the ct5CtyLongName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyLongName(JAXBElement<String> value) {
        this.ct5CtyLongName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtyFipsCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyFipsCode() {
        return ct5CtyFipsCode;
    }

    /**
     * Sets the value of the ct5CtyFipsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyFipsCode(JAXBElement<String> value) {
        this.ct5CtyFipsCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtySovereignty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtySovereignty() {
        return ct5CtySovereignty;
    }

    /**
     * Sets the value of the ct5CtySovereignty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtySovereignty(JAXBElement<String> value) {
        this.ct5CtySovereignty = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyStatus() {
        return ct5CtyStatus;
    }

    /**
     * Sets the value of the ct5CtyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyStatus(JAXBElement<String> value) {
        this.ct5CtyStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtyCapital property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyCapital() {
        return ct5CtyCapital;
    }

    /**
     * Sets the value of the ct5CtyCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyCapital(JAXBElement<String> value) {
        this.ct5CtyCapital = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtyIddCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyIddCode() {
        return ct5CtyIddCode;
    }

    /**
     * Sets the value of the ct5CtyIddCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyIddCode(JAXBElement<String> value) {
        this.ct5CtyIddCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtyRgnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyRgnKey() {
        return ct5CtyRgnKey;
    }

    /**
     * Sets the value of the ct5CtyRgnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyRgnKey(JAXBElement<String> value) {
        this.ct5CtyRgnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtySrgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtySrgKey() {
        return ct5CtySrgKey;
    }

    /**
     * Sets the value of the ct5CtySrgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtySrgKey(JAXBElement<String> value) {
        this.ct5CtySrgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtyPostalInputMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyPostalInputMask() {
        return ct5CtyPostalInputMask;
    }

    /**
     * Sets the value of the ct5CtyPostalInputMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyPostalInputMask(JAXBElement<String> value) {
        this.ct5CtyPostalInputMask = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtyPhoneInputMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyPhoneInputMask() {
        return ct5CtyPhoneInputMask;
    }

    /**
     * Sets the value of the ct5CtyPhoneInputMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyPhoneInputMask(JAXBElement<String> value) {
        this.ct5CtyPhoneInputMask = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtyCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyCurrencyCode() {
        return ct5CtyCurrencyCode;
    }

    /**
     * Sets the value of the ct5CtyCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyCurrencyCode(JAXBElement<String> value) {
        this.ct5CtyCurrencyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtyCurrencyCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyCurrencyCodeDescription() {
        return ct5CtyCurrencyCodeDescription;
    }

    /**
     * Sets the value of the ct5CtyCurrencyCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyCurrencyCodeDescription(JAXBElement<String> value) {
        this.ct5CtyCurrencyCodeDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtyVatFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt5CtyVatFlag() {
        return ct5CtyVatFlag;
    }

    /**
     * Sets the value of the ct5CtyVatFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt5CtyVatFlag(JAXBElement<Short> value) {
        this.ct5CtyVatFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct5CtyIso2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyIso2() {
        return ct5CtyIso2;
    }

    /**
     * Sets the value of the ct5CtyIso2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyIso2(JAXBElement<String> value) {
        this.ct5CtyIso2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtyIso3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyIso3() {
        return ct5CtyIso3;
    }

    /**
     * Sets the value of the ct5CtyIso3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyIso3(JAXBElement<String> value) {
        this.ct5CtyIso3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtyDoNotShip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt5CtyDoNotShip() {
        return ct5CtyDoNotShip;
    }

    /**
     * Sets the value of the ct5CtyDoNotShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt5CtyDoNotShip(JAXBElement<Short> value) {
        this.ct5CtyDoNotShip = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct5CtyIsoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyIsoNumber() {
        return ct5CtyIsoNumber;
    }

    /**
     * Sets the value of the ct5CtyIsoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyIsoNumber(JAXBElement<String> value) {
        this.ct5CtyIsoNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtyBpaRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyBpaRegion() {
        return ct5CtyBpaRegion;
    }

    /**
     * Sets the value of the ct5CtyBpaRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyBpaRegion(JAXBElement<String> value) {
        this.ct5CtyBpaRegion = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtyDoNotSell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt5CtyDoNotSell() {
        return ct5CtyDoNotSell;
    }

    /**
     * Sets the value of the ct5CtyDoNotSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt5CtyDoNotSell(JAXBElement<Short> value) {
        this.ct5CtyDoNotSell = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct5CtyDynKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyDynKey() {
        return ct5CtyDynKey;
    }

    /**
     * Sets the value of the ct5CtyDynKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyDynKey(JAXBElement<String> value) {
        this.ct5CtyDynKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtyDynKey2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyDynKey2() {
        return ct5CtyDynKey2;
    }

    /**
     * Sets the value of the ct5CtyDynKey2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyDynKey2(JAXBElement<String> value) {
        this.ct5CtyDynKey2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct5CtyCgyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt5CtyCgyKey() {
        return ct5CtyCgyKey;
    }

    /**
     * Sets the value of the ct5CtyCgyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt5CtyCgyKey(JAXBElement<String> value) {
        this.ct5CtyCgyKey = ((JAXBElement<String> ) value);
    }

}
