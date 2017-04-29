
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Org_Business_Fax_Country_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Org_Business_Fax_Country_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ct8__cty_code" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_long_name" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_fips_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_sovereignty" type="{http://www.avectra.com/2005/}stringLength120_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_status" type="{http://www.avectra.com/2005/}stringLength120_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_capital" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_idd_code" type="{http://www.avectra.com/2005/}stringLength7_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_rgn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_srg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_postal_input_mask" type="{http://www.avectra.com/2005/}stringLength255_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_phone_input_mask" type="{http://www.avectra.com/2005/}stringLength255_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_currency_code" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_currency_code_description" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_vat_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_iso_2" type="{http://www.avectra.com/2005/}stringLength2_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_iso_3" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_do_not_ship" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_iso_number" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_bpa_region" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_do_not_sell" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_dyn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_dyn_key_2" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct8__cty_cgy_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Org_Business_Fax_Country_DataObjectType", propOrder = {
    "ct8CtyCode",
    "ct8CtyAddDate",
    "ct8CtyAddUser",
    "ct8CtyChangeDate",
    "ct8CtyChangeUser",
    "ct8CtyDeleteFlag",
    "ct8CtyKey",
    "ct8CtyKeyExt",
    "ct8CtyEntityKey",
    "ct8CtyLongName",
    "ct8CtyFipsCode",
    "ct8CtySovereignty",
    "ct8CtyStatus",
    "ct8CtyCapital",
    "ct8CtyIddCode",
    "ct8CtyRgnKey",
    "ct8CtySrgKey",
    "ct8CtyPostalInputMask",
    "ct8CtyPhoneInputMask",
    "ct8CtyCurrencyCode",
    "ct8CtyCurrencyCodeDescription",
    "ct8CtyVatFlag",
    "ct8CtyIso2",
    "ct8CtyIso3",
    "ct8CtyDoNotShip",
    "ct8CtyIsoNumber",
    "ct8CtyBpaRegion",
    "ct8CtyDoNotSell",
    "ct8CtyDynKey",
    "ct8CtyDynKey2",
    "ct8CtyCgyKey"
})
public class FundraisingGiftOrgBusinessFaxCountryDataObjectType {

    @XmlElementRef(name = "ct8__cty_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyCode;
    @XmlElementRef(name = "ct8__cty_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyAddDate;
    @XmlElementRef(name = "ct8__cty_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyAddUser;
    @XmlElementRef(name = "ct8__cty_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyChangeDate;
    @XmlElementRef(name = "ct8__cty_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyChangeUser;
    @XmlElementRef(name = "ct8__cty_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct8CtyDeleteFlag;
    @XmlElementRef(name = "ct8__cty_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyKey;
    @XmlElementRef(name = "ct8__cty_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyKeyExt;
    @XmlElementRef(name = "ct8__cty_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyEntityKey;
    @XmlElementRef(name = "ct8__cty_long_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyLongName;
    @XmlElementRef(name = "ct8__cty_fips_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyFipsCode;
    @XmlElementRef(name = "ct8__cty_sovereignty", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtySovereignty;
    @XmlElementRef(name = "ct8__cty_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyStatus;
    @XmlElementRef(name = "ct8__cty_capital", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyCapital;
    @XmlElementRef(name = "ct8__cty_idd_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyIddCode;
    @XmlElementRef(name = "ct8__cty_rgn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyRgnKey;
    @XmlElementRef(name = "ct8__cty_srg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtySrgKey;
    @XmlElementRef(name = "ct8__cty_postal_input_mask", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyPostalInputMask;
    @XmlElementRef(name = "ct8__cty_phone_input_mask", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyPhoneInputMask;
    @XmlElementRef(name = "ct8__cty_currency_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyCurrencyCode;
    @XmlElementRef(name = "ct8__cty_currency_code_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyCurrencyCodeDescription;
    @XmlElementRef(name = "ct8__cty_vat_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct8CtyVatFlag;
    @XmlElementRef(name = "ct8__cty_iso_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyIso2;
    @XmlElementRef(name = "ct8__cty_iso_3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyIso3;
    @XmlElementRef(name = "ct8__cty_do_not_ship", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct8CtyDoNotShip;
    @XmlElementRef(name = "ct8__cty_iso_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyIsoNumber;
    @XmlElementRef(name = "ct8__cty_bpa_region", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyBpaRegion;
    @XmlElementRef(name = "ct8__cty_do_not_sell", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct8CtyDoNotSell;
    @XmlElementRef(name = "ct8__cty_dyn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyDynKey;
    @XmlElementRef(name = "ct8__cty_dyn_key_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyDynKey2;
    @XmlElementRef(name = "ct8__cty_cgy_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct8CtyCgyKey;

    /**
     * Gets the value of the ct8CtyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyCode() {
        return ct8CtyCode;
    }

    /**
     * Sets the value of the ct8CtyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyCode(JAXBElement<String> value) {
        this.ct8CtyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtyAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyAddDate() {
        return ct8CtyAddDate;
    }

    /**
     * Sets the value of the ct8CtyAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyAddDate(JAXBElement<String> value) {
        this.ct8CtyAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtyAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyAddUser() {
        return ct8CtyAddUser;
    }

    /**
     * Sets the value of the ct8CtyAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyAddUser(JAXBElement<String> value) {
        this.ct8CtyAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtyChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyChangeDate() {
        return ct8CtyChangeDate;
    }

    /**
     * Sets the value of the ct8CtyChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyChangeDate(JAXBElement<String> value) {
        this.ct8CtyChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtyChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyChangeUser() {
        return ct8CtyChangeUser;
    }

    /**
     * Sets the value of the ct8CtyChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyChangeUser(JAXBElement<String> value) {
        this.ct8CtyChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtyDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt8CtyDeleteFlag() {
        return ct8CtyDeleteFlag;
    }

    /**
     * Sets the value of the ct8CtyDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt8CtyDeleteFlag(JAXBElement<Short> value) {
        this.ct8CtyDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct8CtyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyKey() {
        return ct8CtyKey;
    }

    /**
     * Sets the value of the ct8CtyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyKey(JAXBElement<String> value) {
        this.ct8CtyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtyKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyKeyExt() {
        return ct8CtyKeyExt;
    }

    /**
     * Sets the value of the ct8CtyKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyKeyExt(JAXBElement<String> value) {
        this.ct8CtyKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtyEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyEntityKey() {
        return ct8CtyEntityKey;
    }

    /**
     * Sets the value of the ct8CtyEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyEntityKey(JAXBElement<String> value) {
        this.ct8CtyEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtyLongName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyLongName() {
        return ct8CtyLongName;
    }

    /**
     * Sets the value of the ct8CtyLongName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyLongName(JAXBElement<String> value) {
        this.ct8CtyLongName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtyFipsCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyFipsCode() {
        return ct8CtyFipsCode;
    }

    /**
     * Sets the value of the ct8CtyFipsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyFipsCode(JAXBElement<String> value) {
        this.ct8CtyFipsCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtySovereignty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtySovereignty() {
        return ct8CtySovereignty;
    }

    /**
     * Sets the value of the ct8CtySovereignty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtySovereignty(JAXBElement<String> value) {
        this.ct8CtySovereignty = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyStatus() {
        return ct8CtyStatus;
    }

    /**
     * Sets the value of the ct8CtyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyStatus(JAXBElement<String> value) {
        this.ct8CtyStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtyCapital property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyCapital() {
        return ct8CtyCapital;
    }

    /**
     * Sets the value of the ct8CtyCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyCapital(JAXBElement<String> value) {
        this.ct8CtyCapital = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtyIddCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyIddCode() {
        return ct8CtyIddCode;
    }

    /**
     * Sets the value of the ct8CtyIddCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyIddCode(JAXBElement<String> value) {
        this.ct8CtyIddCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtyRgnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyRgnKey() {
        return ct8CtyRgnKey;
    }

    /**
     * Sets the value of the ct8CtyRgnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyRgnKey(JAXBElement<String> value) {
        this.ct8CtyRgnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtySrgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtySrgKey() {
        return ct8CtySrgKey;
    }

    /**
     * Sets the value of the ct8CtySrgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtySrgKey(JAXBElement<String> value) {
        this.ct8CtySrgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtyPostalInputMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyPostalInputMask() {
        return ct8CtyPostalInputMask;
    }

    /**
     * Sets the value of the ct8CtyPostalInputMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyPostalInputMask(JAXBElement<String> value) {
        this.ct8CtyPostalInputMask = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtyPhoneInputMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyPhoneInputMask() {
        return ct8CtyPhoneInputMask;
    }

    /**
     * Sets the value of the ct8CtyPhoneInputMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyPhoneInputMask(JAXBElement<String> value) {
        this.ct8CtyPhoneInputMask = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtyCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyCurrencyCode() {
        return ct8CtyCurrencyCode;
    }

    /**
     * Sets the value of the ct8CtyCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyCurrencyCode(JAXBElement<String> value) {
        this.ct8CtyCurrencyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtyCurrencyCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyCurrencyCodeDescription() {
        return ct8CtyCurrencyCodeDescription;
    }

    /**
     * Sets the value of the ct8CtyCurrencyCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyCurrencyCodeDescription(JAXBElement<String> value) {
        this.ct8CtyCurrencyCodeDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtyVatFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt8CtyVatFlag() {
        return ct8CtyVatFlag;
    }

    /**
     * Sets the value of the ct8CtyVatFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt8CtyVatFlag(JAXBElement<Short> value) {
        this.ct8CtyVatFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct8CtyIso2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyIso2() {
        return ct8CtyIso2;
    }

    /**
     * Sets the value of the ct8CtyIso2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyIso2(JAXBElement<String> value) {
        this.ct8CtyIso2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtyIso3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyIso3() {
        return ct8CtyIso3;
    }

    /**
     * Sets the value of the ct8CtyIso3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyIso3(JAXBElement<String> value) {
        this.ct8CtyIso3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtyDoNotShip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt8CtyDoNotShip() {
        return ct8CtyDoNotShip;
    }

    /**
     * Sets the value of the ct8CtyDoNotShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt8CtyDoNotShip(JAXBElement<Short> value) {
        this.ct8CtyDoNotShip = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct8CtyIsoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyIsoNumber() {
        return ct8CtyIsoNumber;
    }

    /**
     * Sets the value of the ct8CtyIsoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyIsoNumber(JAXBElement<String> value) {
        this.ct8CtyIsoNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtyBpaRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyBpaRegion() {
        return ct8CtyBpaRegion;
    }

    /**
     * Sets the value of the ct8CtyBpaRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyBpaRegion(JAXBElement<String> value) {
        this.ct8CtyBpaRegion = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtyDoNotSell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt8CtyDoNotSell() {
        return ct8CtyDoNotSell;
    }

    /**
     * Sets the value of the ct8CtyDoNotSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt8CtyDoNotSell(JAXBElement<Short> value) {
        this.ct8CtyDoNotSell = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct8CtyDynKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyDynKey() {
        return ct8CtyDynKey;
    }

    /**
     * Sets the value of the ct8CtyDynKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyDynKey(JAXBElement<String> value) {
        this.ct8CtyDynKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtyDynKey2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyDynKey2() {
        return ct8CtyDynKey2;
    }

    /**
     * Sets the value of the ct8CtyDynKey2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyDynKey2(JAXBElement<String> value) {
        this.ct8CtyDynKey2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct8CtyCgyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt8CtyCgyKey() {
        return ct8CtyCgyKey;
    }

    /**
     * Sets the value of the ct8CtyCgyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt8CtyCgyKey(JAXBElement<String> value) {
        this.ct8CtyCgyKey = ((JAXBElement<String> ) value);
    }

}
