
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Org_Business_Phone_country_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Org_Business_Phone_country_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ct7__cty_code" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_long_name" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_fips_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_sovereignty" type="{http://www.avectra.com/2005/}stringLength120_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_status" type="{http://www.avectra.com/2005/}stringLength120_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_capital" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_idd_code" type="{http://www.avectra.com/2005/}stringLength7_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_rgn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_srg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_postal_input_mask" type="{http://www.avectra.com/2005/}stringLength255_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_phone_input_mask" type="{http://www.avectra.com/2005/}stringLength255_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_currency_code" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_currency_code_description" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_vat_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_iso_2" type="{http://www.avectra.com/2005/}stringLength2_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_iso_3" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_do_not_ship" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_iso_number" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_bpa_region" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_do_not_sell" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_dyn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_dyn_key_2" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct7__cty_cgy_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Org_Business_Phone_country_DataObjectType", propOrder = {
    "ct7CtyCode",
    "ct7CtyAddDate",
    "ct7CtyAddUser",
    "ct7CtyChangeDate",
    "ct7CtyChangeUser",
    "ct7CtyDeleteFlag",
    "ct7CtyKey",
    "ct7CtyKeyExt",
    "ct7CtyEntityKey",
    "ct7CtyLongName",
    "ct7CtyFipsCode",
    "ct7CtySovereignty",
    "ct7CtyStatus",
    "ct7CtyCapital",
    "ct7CtyIddCode",
    "ct7CtyRgnKey",
    "ct7CtySrgKey",
    "ct7CtyPostalInputMask",
    "ct7CtyPhoneInputMask",
    "ct7CtyCurrencyCode",
    "ct7CtyCurrencyCodeDescription",
    "ct7CtyVatFlag",
    "ct7CtyIso2",
    "ct7CtyIso3",
    "ct7CtyDoNotShip",
    "ct7CtyIsoNumber",
    "ct7CtyBpaRegion",
    "ct7CtyDoNotSell",
    "ct7CtyDynKey",
    "ct7CtyDynKey2",
    "ct7CtyCgyKey"
})
public class FundraisingGiftOrgBusinessPhoneCountryDataObjectType {

    @XmlElementRef(name = "ct7__cty_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyCode;
    @XmlElementRef(name = "ct7__cty_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyAddDate;
    @XmlElementRef(name = "ct7__cty_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyAddUser;
    @XmlElementRef(name = "ct7__cty_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyChangeDate;
    @XmlElementRef(name = "ct7__cty_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyChangeUser;
    @XmlElementRef(name = "ct7__cty_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct7CtyDeleteFlag;
    @XmlElementRef(name = "ct7__cty_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyKey;
    @XmlElementRef(name = "ct7__cty_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyKeyExt;
    @XmlElementRef(name = "ct7__cty_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyEntityKey;
    @XmlElementRef(name = "ct7__cty_long_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyLongName;
    @XmlElementRef(name = "ct7__cty_fips_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyFipsCode;
    @XmlElementRef(name = "ct7__cty_sovereignty", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtySovereignty;
    @XmlElementRef(name = "ct7__cty_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyStatus;
    @XmlElementRef(name = "ct7__cty_capital", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyCapital;
    @XmlElementRef(name = "ct7__cty_idd_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyIddCode;
    @XmlElementRef(name = "ct7__cty_rgn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyRgnKey;
    @XmlElementRef(name = "ct7__cty_srg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtySrgKey;
    @XmlElementRef(name = "ct7__cty_postal_input_mask", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyPostalInputMask;
    @XmlElementRef(name = "ct7__cty_phone_input_mask", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyPhoneInputMask;
    @XmlElementRef(name = "ct7__cty_currency_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyCurrencyCode;
    @XmlElementRef(name = "ct7__cty_currency_code_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyCurrencyCodeDescription;
    @XmlElementRef(name = "ct7__cty_vat_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct7CtyVatFlag;
    @XmlElementRef(name = "ct7__cty_iso_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyIso2;
    @XmlElementRef(name = "ct7__cty_iso_3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyIso3;
    @XmlElementRef(name = "ct7__cty_do_not_ship", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct7CtyDoNotShip;
    @XmlElementRef(name = "ct7__cty_iso_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyIsoNumber;
    @XmlElementRef(name = "ct7__cty_bpa_region", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyBpaRegion;
    @XmlElementRef(name = "ct7__cty_do_not_sell", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct7CtyDoNotSell;
    @XmlElementRef(name = "ct7__cty_dyn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyDynKey;
    @XmlElementRef(name = "ct7__cty_dyn_key_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyDynKey2;
    @XmlElementRef(name = "ct7__cty_cgy_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct7CtyCgyKey;

    /**
     * Gets the value of the ct7CtyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyCode() {
        return ct7CtyCode;
    }

    /**
     * Sets the value of the ct7CtyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyCode(JAXBElement<String> value) {
        this.ct7CtyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtyAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyAddDate() {
        return ct7CtyAddDate;
    }

    /**
     * Sets the value of the ct7CtyAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyAddDate(JAXBElement<String> value) {
        this.ct7CtyAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtyAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyAddUser() {
        return ct7CtyAddUser;
    }

    /**
     * Sets the value of the ct7CtyAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyAddUser(JAXBElement<String> value) {
        this.ct7CtyAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtyChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyChangeDate() {
        return ct7CtyChangeDate;
    }

    /**
     * Sets the value of the ct7CtyChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyChangeDate(JAXBElement<String> value) {
        this.ct7CtyChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtyChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyChangeUser() {
        return ct7CtyChangeUser;
    }

    /**
     * Sets the value of the ct7CtyChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyChangeUser(JAXBElement<String> value) {
        this.ct7CtyChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtyDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt7CtyDeleteFlag() {
        return ct7CtyDeleteFlag;
    }

    /**
     * Sets the value of the ct7CtyDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt7CtyDeleteFlag(JAXBElement<Short> value) {
        this.ct7CtyDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct7CtyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyKey() {
        return ct7CtyKey;
    }

    /**
     * Sets the value of the ct7CtyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyKey(JAXBElement<String> value) {
        this.ct7CtyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtyKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyKeyExt() {
        return ct7CtyKeyExt;
    }

    /**
     * Sets the value of the ct7CtyKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyKeyExt(JAXBElement<String> value) {
        this.ct7CtyKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtyEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyEntityKey() {
        return ct7CtyEntityKey;
    }

    /**
     * Sets the value of the ct7CtyEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyEntityKey(JAXBElement<String> value) {
        this.ct7CtyEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtyLongName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyLongName() {
        return ct7CtyLongName;
    }

    /**
     * Sets the value of the ct7CtyLongName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyLongName(JAXBElement<String> value) {
        this.ct7CtyLongName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtyFipsCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyFipsCode() {
        return ct7CtyFipsCode;
    }

    /**
     * Sets the value of the ct7CtyFipsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyFipsCode(JAXBElement<String> value) {
        this.ct7CtyFipsCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtySovereignty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtySovereignty() {
        return ct7CtySovereignty;
    }

    /**
     * Sets the value of the ct7CtySovereignty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtySovereignty(JAXBElement<String> value) {
        this.ct7CtySovereignty = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyStatus() {
        return ct7CtyStatus;
    }

    /**
     * Sets the value of the ct7CtyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyStatus(JAXBElement<String> value) {
        this.ct7CtyStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtyCapital property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyCapital() {
        return ct7CtyCapital;
    }

    /**
     * Sets the value of the ct7CtyCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyCapital(JAXBElement<String> value) {
        this.ct7CtyCapital = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtyIddCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyIddCode() {
        return ct7CtyIddCode;
    }

    /**
     * Sets the value of the ct7CtyIddCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyIddCode(JAXBElement<String> value) {
        this.ct7CtyIddCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtyRgnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyRgnKey() {
        return ct7CtyRgnKey;
    }

    /**
     * Sets the value of the ct7CtyRgnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyRgnKey(JAXBElement<String> value) {
        this.ct7CtyRgnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtySrgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtySrgKey() {
        return ct7CtySrgKey;
    }

    /**
     * Sets the value of the ct7CtySrgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtySrgKey(JAXBElement<String> value) {
        this.ct7CtySrgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtyPostalInputMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyPostalInputMask() {
        return ct7CtyPostalInputMask;
    }

    /**
     * Sets the value of the ct7CtyPostalInputMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyPostalInputMask(JAXBElement<String> value) {
        this.ct7CtyPostalInputMask = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtyPhoneInputMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyPhoneInputMask() {
        return ct7CtyPhoneInputMask;
    }

    /**
     * Sets the value of the ct7CtyPhoneInputMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyPhoneInputMask(JAXBElement<String> value) {
        this.ct7CtyPhoneInputMask = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtyCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyCurrencyCode() {
        return ct7CtyCurrencyCode;
    }

    /**
     * Sets the value of the ct7CtyCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyCurrencyCode(JAXBElement<String> value) {
        this.ct7CtyCurrencyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtyCurrencyCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyCurrencyCodeDescription() {
        return ct7CtyCurrencyCodeDescription;
    }

    /**
     * Sets the value of the ct7CtyCurrencyCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyCurrencyCodeDescription(JAXBElement<String> value) {
        this.ct7CtyCurrencyCodeDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtyVatFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt7CtyVatFlag() {
        return ct7CtyVatFlag;
    }

    /**
     * Sets the value of the ct7CtyVatFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt7CtyVatFlag(JAXBElement<Short> value) {
        this.ct7CtyVatFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct7CtyIso2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyIso2() {
        return ct7CtyIso2;
    }

    /**
     * Sets the value of the ct7CtyIso2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyIso2(JAXBElement<String> value) {
        this.ct7CtyIso2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtyIso3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyIso3() {
        return ct7CtyIso3;
    }

    /**
     * Sets the value of the ct7CtyIso3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyIso3(JAXBElement<String> value) {
        this.ct7CtyIso3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtyDoNotShip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt7CtyDoNotShip() {
        return ct7CtyDoNotShip;
    }

    /**
     * Sets the value of the ct7CtyDoNotShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt7CtyDoNotShip(JAXBElement<Short> value) {
        this.ct7CtyDoNotShip = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct7CtyIsoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyIsoNumber() {
        return ct7CtyIsoNumber;
    }

    /**
     * Sets the value of the ct7CtyIsoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyIsoNumber(JAXBElement<String> value) {
        this.ct7CtyIsoNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtyBpaRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyBpaRegion() {
        return ct7CtyBpaRegion;
    }

    /**
     * Sets the value of the ct7CtyBpaRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyBpaRegion(JAXBElement<String> value) {
        this.ct7CtyBpaRegion = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtyDoNotSell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt7CtyDoNotSell() {
        return ct7CtyDoNotSell;
    }

    /**
     * Sets the value of the ct7CtyDoNotSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt7CtyDoNotSell(JAXBElement<Short> value) {
        this.ct7CtyDoNotSell = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct7CtyDynKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyDynKey() {
        return ct7CtyDynKey;
    }

    /**
     * Sets the value of the ct7CtyDynKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyDynKey(JAXBElement<String> value) {
        this.ct7CtyDynKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtyDynKey2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyDynKey2() {
        return ct7CtyDynKey2;
    }

    /**
     * Sets the value of the ct7CtyDynKey2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyDynKey2(JAXBElement<String> value) {
        this.ct7CtyDynKey2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct7CtyCgyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt7CtyCgyKey() {
        return ct7CtyCgyKey;
    }

    /**
     * Sets the value of the ct7CtyCgyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt7CtyCgyKey(JAXBElement<String> value) {
        this.ct7CtyCgyKey = ((JAXBElement<String> ) value);
    }

}
