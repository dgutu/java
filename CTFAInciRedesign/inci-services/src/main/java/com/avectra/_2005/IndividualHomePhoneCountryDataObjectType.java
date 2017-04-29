
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Individual_Home_Phone_Country_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Individual_Home_Phone_Country_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ct4__cty_code" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_long_name" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_fips_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_sovereignty" type="{http://www.avectra.com/2005/}stringLength120_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_status" type="{http://www.avectra.com/2005/}stringLength120_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_capital" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_idd_code" type="{http://www.avectra.com/2005/}stringLength7_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_rgn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_srg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_postal_input_mask" type="{http://www.avectra.com/2005/}stringLength255_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_phone_input_mask" type="{http://www.avectra.com/2005/}stringLength255_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_currency_code" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_currency_code_description" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_vat_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_iso_2" type="{http://www.avectra.com/2005/}stringLength2_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_iso_3" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_do_not_ship" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_iso_number" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_bpa_region" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_do_not_sell" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_dyn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_dyn_key_2" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct4__cty_cgy_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Individual_Home_Phone_Country_DataObjectType", propOrder = {
    "ct4CtyCode",
    "ct4CtyAddDate",
    "ct4CtyAddUser",
    "ct4CtyChangeDate",
    "ct4CtyChangeUser",
    "ct4CtyDeleteFlag",
    "ct4CtyKey",
    "ct4CtyKeyExt",
    "ct4CtyEntityKey",
    "ct4CtyLongName",
    "ct4CtyFipsCode",
    "ct4CtySovereignty",
    "ct4CtyStatus",
    "ct4CtyCapital",
    "ct4CtyIddCode",
    "ct4CtyRgnKey",
    "ct4CtySrgKey",
    "ct4CtyPostalInputMask",
    "ct4CtyPhoneInputMask",
    "ct4CtyCurrencyCode",
    "ct4CtyCurrencyCodeDescription",
    "ct4CtyVatFlag",
    "ct4CtyIso2",
    "ct4CtyIso3",
    "ct4CtyDoNotShip",
    "ct4CtyIsoNumber",
    "ct4CtyBpaRegion",
    "ct4CtyDoNotSell",
    "ct4CtyDynKey",
    "ct4CtyDynKey2",
    "ct4CtyCgyKey"
})
public class IndividualHomePhoneCountryDataObjectType {

    @XmlElementRef(name = "ct4__cty_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyCode;
    @XmlElementRef(name = "ct4__cty_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyAddDate;
    @XmlElementRef(name = "ct4__cty_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyAddUser;
    @XmlElementRef(name = "ct4__cty_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyChangeDate;
    @XmlElementRef(name = "ct4__cty_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyChangeUser;
    @XmlElementRef(name = "ct4__cty_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct4CtyDeleteFlag;
    @XmlElementRef(name = "ct4__cty_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyKey;
    @XmlElementRef(name = "ct4__cty_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyKeyExt;
    @XmlElementRef(name = "ct4__cty_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyEntityKey;
    @XmlElementRef(name = "ct4__cty_long_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyLongName;
    @XmlElementRef(name = "ct4__cty_fips_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyFipsCode;
    @XmlElementRef(name = "ct4__cty_sovereignty", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtySovereignty;
    @XmlElementRef(name = "ct4__cty_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyStatus;
    @XmlElementRef(name = "ct4__cty_capital", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyCapital;
    @XmlElementRef(name = "ct4__cty_idd_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyIddCode;
    @XmlElementRef(name = "ct4__cty_rgn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyRgnKey;
    @XmlElementRef(name = "ct4__cty_srg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtySrgKey;
    @XmlElementRef(name = "ct4__cty_postal_input_mask", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyPostalInputMask;
    @XmlElementRef(name = "ct4__cty_phone_input_mask", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyPhoneInputMask;
    @XmlElementRef(name = "ct4__cty_currency_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyCurrencyCode;
    @XmlElementRef(name = "ct4__cty_currency_code_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyCurrencyCodeDescription;
    @XmlElementRef(name = "ct4__cty_vat_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct4CtyVatFlag;
    @XmlElementRef(name = "ct4__cty_iso_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyIso2;
    @XmlElementRef(name = "ct4__cty_iso_3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyIso3;
    @XmlElementRef(name = "ct4__cty_do_not_ship", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct4CtyDoNotShip;
    @XmlElementRef(name = "ct4__cty_iso_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyIsoNumber;
    @XmlElementRef(name = "ct4__cty_bpa_region", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyBpaRegion;
    @XmlElementRef(name = "ct4__cty_do_not_sell", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct4CtyDoNotSell;
    @XmlElementRef(name = "ct4__cty_dyn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyDynKey;
    @XmlElementRef(name = "ct4__cty_dyn_key_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyDynKey2;
    @XmlElementRef(name = "ct4__cty_cgy_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct4CtyCgyKey;

    /**
     * Gets the value of the ct4CtyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyCode() {
        return ct4CtyCode;
    }

    /**
     * Sets the value of the ct4CtyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyCode(JAXBElement<String> value) {
        this.ct4CtyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtyAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyAddDate() {
        return ct4CtyAddDate;
    }

    /**
     * Sets the value of the ct4CtyAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyAddDate(JAXBElement<String> value) {
        this.ct4CtyAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtyAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyAddUser() {
        return ct4CtyAddUser;
    }

    /**
     * Sets the value of the ct4CtyAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyAddUser(JAXBElement<String> value) {
        this.ct4CtyAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtyChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyChangeDate() {
        return ct4CtyChangeDate;
    }

    /**
     * Sets the value of the ct4CtyChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyChangeDate(JAXBElement<String> value) {
        this.ct4CtyChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtyChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyChangeUser() {
        return ct4CtyChangeUser;
    }

    /**
     * Sets the value of the ct4CtyChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyChangeUser(JAXBElement<String> value) {
        this.ct4CtyChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtyDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt4CtyDeleteFlag() {
        return ct4CtyDeleteFlag;
    }

    /**
     * Sets the value of the ct4CtyDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt4CtyDeleteFlag(JAXBElement<Short> value) {
        this.ct4CtyDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct4CtyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyKey() {
        return ct4CtyKey;
    }

    /**
     * Sets the value of the ct4CtyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyKey(JAXBElement<String> value) {
        this.ct4CtyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtyKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyKeyExt() {
        return ct4CtyKeyExt;
    }

    /**
     * Sets the value of the ct4CtyKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyKeyExt(JAXBElement<String> value) {
        this.ct4CtyKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtyEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyEntityKey() {
        return ct4CtyEntityKey;
    }

    /**
     * Sets the value of the ct4CtyEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyEntityKey(JAXBElement<String> value) {
        this.ct4CtyEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtyLongName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyLongName() {
        return ct4CtyLongName;
    }

    /**
     * Sets the value of the ct4CtyLongName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyLongName(JAXBElement<String> value) {
        this.ct4CtyLongName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtyFipsCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyFipsCode() {
        return ct4CtyFipsCode;
    }

    /**
     * Sets the value of the ct4CtyFipsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyFipsCode(JAXBElement<String> value) {
        this.ct4CtyFipsCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtySovereignty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtySovereignty() {
        return ct4CtySovereignty;
    }

    /**
     * Sets the value of the ct4CtySovereignty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtySovereignty(JAXBElement<String> value) {
        this.ct4CtySovereignty = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyStatus() {
        return ct4CtyStatus;
    }

    /**
     * Sets the value of the ct4CtyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyStatus(JAXBElement<String> value) {
        this.ct4CtyStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtyCapital property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyCapital() {
        return ct4CtyCapital;
    }

    /**
     * Sets the value of the ct4CtyCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyCapital(JAXBElement<String> value) {
        this.ct4CtyCapital = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtyIddCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyIddCode() {
        return ct4CtyIddCode;
    }

    /**
     * Sets the value of the ct4CtyIddCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyIddCode(JAXBElement<String> value) {
        this.ct4CtyIddCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtyRgnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyRgnKey() {
        return ct4CtyRgnKey;
    }

    /**
     * Sets the value of the ct4CtyRgnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyRgnKey(JAXBElement<String> value) {
        this.ct4CtyRgnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtySrgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtySrgKey() {
        return ct4CtySrgKey;
    }

    /**
     * Sets the value of the ct4CtySrgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtySrgKey(JAXBElement<String> value) {
        this.ct4CtySrgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtyPostalInputMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyPostalInputMask() {
        return ct4CtyPostalInputMask;
    }

    /**
     * Sets the value of the ct4CtyPostalInputMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyPostalInputMask(JAXBElement<String> value) {
        this.ct4CtyPostalInputMask = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtyPhoneInputMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyPhoneInputMask() {
        return ct4CtyPhoneInputMask;
    }

    /**
     * Sets the value of the ct4CtyPhoneInputMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyPhoneInputMask(JAXBElement<String> value) {
        this.ct4CtyPhoneInputMask = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtyCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyCurrencyCode() {
        return ct4CtyCurrencyCode;
    }

    /**
     * Sets the value of the ct4CtyCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyCurrencyCode(JAXBElement<String> value) {
        this.ct4CtyCurrencyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtyCurrencyCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyCurrencyCodeDescription() {
        return ct4CtyCurrencyCodeDescription;
    }

    /**
     * Sets the value of the ct4CtyCurrencyCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyCurrencyCodeDescription(JAXBElement<String> value) {
        this.ct4CtyCurrencyCodeDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtyVatFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt4CtyVatFlag() {
        return ct4CtyVatFlag;
    }

    /**
     * Sets the value of the ct4CtyVatFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt4CtyVatFlag(JAXBElement<Short> value) {
        this.ct4CtyVatFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct4CtyIso2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyIso2() {
        return ct4CtyIso2;
    }

    /**
     * Sets the value of the ct4CtyIso2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyIso2(JAXBElement<String> value) {
        this.ct4CtyIso2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtyIso3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyIso3() {
        return ct4CtyIso3;
    }

    /**
     * Sets the value of the ct4CtyIso3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyIso3(JAXBElement<String> value) {
        this.ct4CtyIso3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtyDoNotShip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt4CtyDoNotShip() {
        return ct4CtyDoNotShip;
    }

    /**
     * Sets the value of the ct4CtyDoNotShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt4CtyDoNotShip(JAXBElement<Short> value) {
        this.ct4CtyDoNotShip = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct4CtyIsoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyIsoNumber() {
        return ct4CtyIsoNumber;
    }

    /**
     * Sets the value of the ct4CtyIsoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyIsoNumber(JAXBElement<String> value) {
        this.ct4CtyIsoNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtyBpaRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyBpaRegion() {
        return ct4CtyBpaRegion;
    }

    /**
     * Sets the value of the ct4CtyBpaRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyBpaRegion(JAXBElement<String> value) {
        this.ct4CtyBpaRegion = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtyDoNotSell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt4CtyDoNotSell() {
        return ct4CtyDoNotSell;
    }

    /**
     * Sets the value of the ct4CtyDoNotSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt4CtyDoNotSell(JAXBElement<Short> value) {
        this.ct4CtyDoNotSell = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct4CtyDynKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyDynKey() {
        return ct4CtyDynKey;
    }

    /**
     * Sets the value of the ct4CtyDynKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyDynKey(JAXBElement<String> value) {
        this.ct4CtyDynKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtyDynKey2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyDynKey2() {
        return ct4CtyDynKey2;
    }

    /**
     * Sets the value of the ct4CtyDynKey2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyDynKey2(JAXBElement<String> value) {
        this.ct4CtyDynKey2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct4CtyCgyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt4CtyCgyKey() {
        return ct4CtyCgyKey;
    }

    /**
     * Sets the value of the ct4CtyCgyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt4CtyCgyKey(JAXBElement<String> value) {
        this.ct4CtyCgyKey = ((JAXBElement<String> ) value);
    }

}
