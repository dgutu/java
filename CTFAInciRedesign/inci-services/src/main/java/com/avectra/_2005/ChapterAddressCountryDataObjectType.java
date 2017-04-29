
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Chapter_Address_Country_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Chapter_Address_Country_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cty_code" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="cty_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cty_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cty_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cty_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cty_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cty_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cty_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cty_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cty_long_name" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cty_fips_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="cty_sovereignty" type="{http://www.avectra.com/2005/}stringLength120_Type" minOccurs="0"/>
 *         &lt;element name="cty_status" type="{http://www.avectra.com/2005/}stringLength120_Type" minOccurs="0"/>
 *         &lt;element name="cty_capital" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cty_idd_code" type="{http://www.avectra.com/2005/}stringLength7_Type" minOccurs="0"/>
 *         &lt;element name="cty_rgn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cty_srg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cty_postal_input_mask" type="{http://www.avectra.com/2005/}stringLength255_Type" minOccurs="0"/>
 *         &lt;element name="cty_phone_input_mask" type="{http://www.avectra.com/2005/}stringLength255_Type" minOccurs="0"/>
 *         &lt;element name="cty_currency_code" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="cty_currency_code_description" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cty_vat_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cty_iso_2" type="{http://www.avectra.com/2005/}stringLength2_Type" minOccurs="0"/>
 *         &lt;element name="cty_iso_3" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="cty_do_not_ship" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cty_iso_number" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="cty_bpa_region" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="cty_do_not_sell" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cty_dyn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cty_dyn_key_2" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cty_cgy_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Chapter_Address_Country_DataObjectType", propOrder = {
    "ctyCode",
    "ctyAddDate",
    "ctyAddUser",
    "ctyChangeDate",
    "ctyChangeUser",
    "ctyDeleteFlag",
    "ctyKey",
    "ctyKeyExt",
    "ctyEntityKey",
    "ctyLongName",
    "ctyFipsCode",
    "ctySovereignty",
    "ctyStatus",
    "ctyCapital",
    "ctyIddCode",
    "ctyRgnKey",
    "ctySrgKey",
    "ctyPostalInputMask",
    "ctyPhoneInputMask",
    "ctyCurrencyCode",
    "ctyCurrencyCodeDescription",
    "ctyVatFlag",
    "ctyIso2",
    "ctyIso3",
    "ctyDoNotShip",
    "ctyIsoNumber",
    "ctyBpaRegion",
    "ctyDoNotSell",
    "ctyDynKey",
    "ctyDynKey2",
    "ctyCgyKey"
})
public class ChapterAddressCountryDataObjectType {

    @XmlElementRef(name = "cty_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyCode;
    @XmlElementRef(name = "cty_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyAddDate;
    @XmlElementRef(name = "cty_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyAddUser;
    @XmlElementRef(name = "cty_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyChangeDate;
    @XmlElementRef(name = "cty_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyChangeUser;
    @XmlElementRef(name = "cty_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ctyDeleteFlag;
    @XmlElementRef(name = "cty_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyKey;
    @XmlElementRef(name = "cty_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyKeyExt;
    @XmlElementRef(name = "cty_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyEntityKey;
    @XmlElementRef(name = "cty_long_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyLongName;
    @XmlElementRef(name = "cty_fips_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyFipsCode;
    @XmlElementRef(name = "cty_sovereignty", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctySovereignty;
    @XmlElementRef(name = "cty_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyStatus;
    @XmlElementRef(name = "cty_capital", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyCapital;
    @XmlElementRef(name = "cty_idd_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyIddCode;
    @XmlElementRef(name = "cty_rgn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyRgnKey;
    @XmlElementRef(name = "cty_srg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctySrgKey;
    @XmlElementRef(name = "cty_postal_input_mask", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyPostalInputMask;
    @XmlElementRef(name = "cty_phone_input_mask", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyPhoneInputMask;
    @XmlElementRef(name = "cty_currency_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyCurrencyCode;
    @XmlElementRef(name = "cty_currency_code_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyCurrencyCodeDescription;
    @XmlElementRef(name = "cty_vat_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ctyVatFlag;
    @XmlElementRef(name = "cty_iso_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyIso2;
    @XmlElementRef(name = "cty_iso_3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyIso3;
    @XmlElementRef(name = "cty_do_not_ship", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ctyDoNotShip;
    @XmlElementRef(name = "cty_iso_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyIsoNumber;
    @XmlElementRef(name = "cty_bpa_region", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyBpaRegion;
    @XmlElementRef(name = "cty_do_not_sell", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ctyDoNotSell;
    @XmlElementRef(name = "cty_dyn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyDynKey;
    @XmlElementRef(name = "cty_dyn_key_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyDynKey2;
    @XmlElementRef(name = "cty_cgy_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ctyCgyKey;

    /**
     * Gets the value of the ctyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyCode() {
        return ctyCode;
    }

    /**
     * Sets the value of the ctyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyCode(JAXBElement<String> value) {
        this.ctyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctyAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyAddDate() {
        return ctyAddDate;
    }

    /**
     * Sets the value of the ctyAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyAddDate(JAXBElement<String> value) {
        this.ctyAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctyAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyAddUser() {
        return ctyAddUser;
    }

    /**
     * Sets the value of the ctyAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyAddUser(JAXBElement<String> value) {
        this.ctyAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctyChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyChangeDate() {
        return ctyChangeDate;
    }

    /**
     * Sets the value of the ctyChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyChangeDate(JAXBElement<String> value) {
        this.ctyChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctyChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyChangeUser() {
        return ctyChangeUser;
    }

    /**
     * Sets the value of the ctyChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyChangeUser(JAXBElement<String> value) {
        this.ctyChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctyDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCtyDeleteFlag() {
        return ctyDeleteFlag;
    }

    /**
     * Sets the value of the ctyDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCtyDeleteFlag(JAXBElement<Short> value) {
        this.ctyDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ctyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyKey() {
        return ctyKey;
    }

    /**
     * Sets the value of the ctyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyKey(JAXBElement<String> value) {
        this.ctyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctyKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyKeyExt() {
        return ctyKeyExt;
    }

    /**
     * Sets the value of the ctyKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyKeyExt(JAXBElement<String> value) {
        this.ctyKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctyEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyEntityKey() {
        return ctyEntityKey;
    }

    /**
     * Sets the value of the ctyEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyEntityKey(JAXBElement<String> value) {
        this.ctyEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctyLongName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyLongName() {
        return ctyLongName;
    }

    /**
     * Sets the value of the ctyLongName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyLongName(JAXBElement<String> value) {
        this.ctyLongName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctyFipsCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyFipsCode() {
        return ctyFipsCode;
    }

    /**
     * Sets the value of the ctyFipsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyFipsCode(JAXBElement<String> value) {
        this.ctyFipsCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctySovereignty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtySovereignty() {
        return ctySovereignty;
    }

    /**
     * Sets the value of the ctySovereignty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtySovereignty(JAXBElement<String> value) {
        this.ctySovereignty = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyStatus() {
        return ctyStatus;
    }

    /**
     * Sets the value of the ctyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyStatus(JAXBElement<String> value) {
        this.ctyStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctyCapital property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyCapital() {
        return ctyCapital;
    }

    /**
     * Sets the value of the ctyCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyCapital(JAXBElement<String> value) {
        this.ctyCapital = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctyIddCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyIddCode() {
        return ctyIddCode;
    }

    /**
     * Sets the value of the ctyIddCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyIddCode(JAXBElement<String> value) {
        this.ctyIddCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctyRgnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyRgnKey() {
        return ctyRgnKey;
    }

    /**
     * Sets the value of the ctyRgnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyRgnKey(JAXBElement<String> value) {
        this.ctyRgnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctySrgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtySrgKey() {
        return ctySrgKey;
    }

    /**
     * Sets the value of the ctySrgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtySrgKey(JAXBElement<String> value) {
        this.ctySrgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctyPostalInputMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyPostalInputMask() {
        return ctyPostalInputMask;
    }

    /**
     * Sets the value of the ctyPostalInputMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyPostalInputMask(JAXBElement<String> value) {
        this.ctyPostalInputMask = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctyPhoneInputMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyPhoneInputMask() {
        return ctyPhoneInputMask;
    }

    /**
     * Sets the value of the ctyPhoneInputMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyPhoneInputMask(JAXBElement<String> value) {
        this.ctyPhoneInputMask = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctyCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyCurrencyCode() {
        return ctyCurrencyCode;
    }

    /**
     * Sets the value of the ctyCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyCurrencyCode(JAXBElement<String> value) {
        this.ctyCurrencyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctyCurrencyCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyCurrencyCodeDescription() {
        return ctyCurrencyCodeDescription;
    }

    /**
     * Sets the value of the ctyCurrencyCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyCurrencyCodeDescription(JAXBElement<String> value) {
        this.ctyCurrencyCodeDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctyVatFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCtyVatFlag() {
        return ctyVatFlag;
    }

    /**
     * Sets the value of the ctyVatFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCtyVatFlag(JAXBElement<Short> value) {
        this.ctyVatFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ctyIso2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyIso2() {
        return ctyIso2;
    }

    /**
     * Sets the value of the ctyIso2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyIso2(JAXBElement<String> value) {
        this.ctyIso2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctyIso3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyIso3() {
        return ctyIso3;
    }

    /**
     * Sets the value of the ctyIso3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyIso3(JAXBElement<String> value) {
        this.ctyIso3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctyDoNotShip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCtyDoNotShip() {
        return ctyDoNotShip;
    }

    /**
     * Sets the value of the ctyDoNotShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCtyDoNotShip(JAXBElement<Short> value) {
        this.ctyDoNotShip = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ctyIsoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyIsoNumber() {
        return ctyIsoNumber;
    }

    /**
     * Sets the value of the ctyIsoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyIsoNumber(JAXBElement<String> value) {
        this.ctyIsoNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctyBpaRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyBpaRegion() {
        return ctyBpaRegion;
    }

    /**
     * Sets the value of the ctyBpaRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyBpaRegion(JAXBElement<String> value) {
        this.ctyBpaRegion = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctyDoNotSell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCtyDoNotSell() {
        return ctyDoNotSell;
    }

    /**
     * Sets the value of the ctyDoNotSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCtyDoNotSell(JAXBElement<Short> value) {
        this.ctyDoNotSell = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ctyDynKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyDynKey() {
        return ctyDynKey;
    }

    /**
     * Sets the value of the ctyDynKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyDynKey(JAXBElement<String> value) {
        this.ctyDynKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctyDynKey2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyDynKey2() {
        return ctyDynKey2;
    }

    /**
     * Sets the value of the ctyDynKey2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyDynKey2(JAXBElement<String> value) {
        this.ctyDynKey2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctyCgyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtyCgyKey() {
        return ctyCgyKey;
    }

    /**
     * Sets the value of the ctyCgyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtyCgyKey(JAXBElement<String> value) {
        this.ctyCgyKey = ((JAXBElement<String> ) value);
    }

}
