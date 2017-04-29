
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Individual_Home_Fax_Country_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Individual_Home_Fax_Country_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ct6__cty_code" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_long_name" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_fips_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_sovereignty" type="{http://www.avectra.com/2005/}stringLength120_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_status" type="{http://www.avectra.com/2005/}stringLength120_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_capital" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_idd_code" type="{http://www.avectra.com/2005/}stringLength7_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_rgn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_srg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_postal_input_mask" type="{http://www.avectra.com/2005/}stringLength255_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_phone_input_mask" type="{http://www.avectra.com/2005/}stringLength255_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_currency_code" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_currency_code_description" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_vat_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_iso_2" type="{http://www.avectra.com/2005/}stringLength2_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_iso_3" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_do_not_ship" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_iso_number" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_bpa_region" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_do_not_sell" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_dyn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_dyn_key_2" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ct6__cty_cgy_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Individual_Home_Fax_Country_DataObjectType", propOrder = {
    "ct6CtyCode",
    "ct6CtyAddDate",
    "ct6CtyAddUser",
    "ct6CtyChangeDate",
    "ct6CtyChangeUser",
    "ct6CtyDeleteFlag",
    "ct6CtyKey",
    "ct6CtyKeyExt",
    "ct6CtyEntityKey",
    "ct6CtyLongName",
    "ct6CtyFipsCode",
    "ct6CtySovereignty",
    "ct6CtyStatus",
    "ct6CtyCapital",
    "ct6CtyIddCode",
    "ct6CtyRgnKey",
    "ct6CtySrgKey",
    "ct6CtyPostalInputMask",
    "ct6CtyPhoneInputMask",
    "ct6CtyCurrencyCode",
    "ct6CtyCurrencyCodeDescription",
    "ct6CtyVatFlag",
    "ct6CtyIso2",
    "ct6CtyIso3",
    "ct6CtyDoNotShip",
    "ct6CtyIsoNumber",
    "ct6CtyBpaRegion",
    "ct6CtyDoNotSell",
    "ct6CtyDynKey",
    "ct6CtyDynKey2",
    "ct6CtyCgyKey"
})
public class IndividualHomeFaxCountryDataObjectType {

    @XmlElementRef(name = "ct6__cty_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyCode;
    @XmlElementRef(name = "ct6__cty_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyAddDate;
    @XmlElementRef(name = "ct6__cty_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyAddUser;
    @XmlElementRef(name = "ct6__cty_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyChangeDate;
    @XmlElementRef(name = "ct6__cty_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyChangeUser;
    @XmlElementRef(name = "ct6__cty_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct6CtyDeleteFlag;
    @XmlElementRef(name = "ct6__cty_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyKey;
    @XmlElementRef(name = "ct6__cty_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyKeyExt;
    @XmlElementRef(name = "ct6__cty_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyEntityKey;
    @XmlElementRef(name = "ct6__cty_long_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyLongName;
    @XmlElementRef(name = "ct6__cty_fips_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyFipsCode;
    @XmlElementRef(name = "ct6__cty_sovereignty", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtySovereignty;
    @XmlElementRef(name = "ct6__cty_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyStatus;
    @XmlElementRef(name = "ct6__cty_capital", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyCapital;
    @XmlElementRef(name = "ct6__cty_idd_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyIddCode;
    @XmlElementRef(name = "ct6__cty_rgn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyRgnKey;
    @XmlElementRef(name = "ct6__cty_srg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtySrgKey;
    @XmlElementRef(name = "ct6__cty_postal_input_mask", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyPostalInputMask;
    @XmlElementRef(name = "ct6__cty_phone_input_mask", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyPhoneInputMask;
    @XmlElementRef(name = "ct6__cty_currency_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyCurrencyCode;
    @XmlElementRef(name = "ct6__cty_currency_code_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyCurrencyCodeDescription;
    @XmlElementRef(name = "ct6__cty_vat_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct6CtyVatFlag;
    @XmlElementRef(name = "ct6__cty_iso_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyIso2;
    @XmlElementRef(name = "ct6__cty_iso_3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyIso3;
    @XmlElementRef(name = "ct6__cty_do_not_ship", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct6CtyDoNotShip;
    @XmlElementRef(name = "ct6__cty_iso_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyIsoNumber;
    @XmlElementRef(name = "ct6__cty_bpa_region", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyBpaRegion;
    @XmlElementRef(name = "ct6__cty_do_not_sell", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ct6CtyDoNotSell;
    @XmlElementRef(name = "ct6__cty_dyn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyDynKey;
    @XmlElementRef(name = "ct6__cty_dyn_key_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyDynKey2;
    @XmlElementRef(name = "ct6__cty_cgy_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ct6CtyCgyKey;

    /**
     * Gets the value of the ct6CtyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyCode() {
        return ct6CtyCode;
    }

    /**
     * Sets the value of the ct6CtyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyCode(JAXBElement<String> value) {
        this.ct6CtyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtyAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyAddDate() {
        return ct6CtyAddDate;
    }

    /**
     * Sets the value of the ct6CtyAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyAddDate(JAXBElement<String> value) {
        this.ct6CtyAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtyAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyAddUser() {
        return ct6CtyAddUser;
    }

    /**
     * Sets the value of the ct6CtyAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyAddUser(JAXBElement<String> value) {
        this.ct6CtyAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtyChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyChangeDate() {
        return ct6CtyChangeDate;
    }

    /**
     * Sets the value of the ct6CtyChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyChangeDate(JAXBElement<String> value) {
        this.ct6CtyChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtyChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyChangeUser() {
        return ct6CtyChangeUser;
    }

    /**
     * Sets the value of the ct6CtyChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyChangeUser(JAXBElement<String> value) {
        this.ct6CtyChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtyDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt6CtyDeleteFlag() {
        return ct6CtyDeleteFlag;
    }

    /**
     * Sets the value of the ct6CtyDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt6CtyDeleteFlag(JAXBElement<Short> value) {
        this.ct6CtyDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct6CtyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyKey() {
        return ct6CtyKey;
    }

    /**
     * Sets the value of the ct6CtyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyKey(JAXBElement<String> value) {
        this.ct6CtyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtyKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyKeyExt() {
        return ct6CtyKeyExt;
    }

    /**
     * Sets the value of the ct6CtyKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyKeyExt(JAXBElement<String> value) {
        this.ct6CtyKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtyEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyEntityKey() {
        return ct6CtyEntityKey;
    }

    /**
     * Sets the value of the ct6CtyEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyEntityKey(JAXBElement<String> value) {
        this.ct6CtyEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtyLongName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyLongName() {
        return ct6CtyLongName;
    }

    /**
     * Sets the value of the ct6CtyLongName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyLongName(JAXBElement<String> value) {
        this.ct6CtyLongName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtyFipsCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyFipsCode() {
        return ct6CtyFipsCode;
    }

    /**
     * Sets the value of the ct6CtyFipsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyFipsCode(JAXBElement<String> value) {
        this.ct6CtyFipsCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtySovereignty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtySovereignty() {
        return ct6CtySovereignty;
    }

    /**
     * Sets the value of the ct6CtySovereignty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtySovereignty(JAXBElement<String> value) {
        this.ct6CtySovereignty = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyStatus() {
        return ct6CtyStatus;
    }

    /**
     * Sets the value of the ct6CtyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyStatus(JAXBElement<String> value) {
        this.ct6CtyStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtyCapital property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyCapital() {
        return ct6CtyCapital;
    }

    /**
     * Sets the value of the ct6CtyCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyCapital(JAXBElement<String> value) {
        this.ct6CtyCapital = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtyIddCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyIddCode() {
        return ct6CtyIddCode;
    }

    /**
     * Sets the value of the ct6CtyIddCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyIddCode(JAXBElement<String> value) {
        this.ct6CtyIddCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtyRgnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyRgnKey() {
        return ct6CtyRgnKey;
    }

    /**
     * Sets the value of the ct6CtyRgnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyRgnKey(JAXBElement<String> value) {
        this.ct6CtyRgnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtySrgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtySrgKey() {
        return ct6CtySrgKey;
    }

    /**
     * Sets the value of the ct6CtySrgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtySrgKey(JAXBElement<String> value) {
        this.ct6CtySrgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtyPostalInputMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyPostalInputMask() {
        return ct6CtyPostalInputMask;
    }

    /**
     * Sets the value of the ct6CtyPostalInputMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyPostalInputMask(JAXBElement<String> value) {
        this.ct6CtyPostalInputMask = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtyPhoneInputMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyPhoneInputMask() {
        return ct6CtyPhoneInputMask;
    }

    /**
     * Sets the value of the ct6CtyPhoneInputMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyPhoneInputMask(JAXBElement<String> value) {
        this.ct6CtyPhoneInputMask = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtyCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyCurrencyCode() {
        return ct6CtyCurrencyCode;
    }

    /**
     * Sets the value of the ct6CtyCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyCurrencyCode(JAXBElement<String> value) {
        this.ct6CtyCurrencyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtyCurrencyCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyCurrencyCodeDescription() {
        return ct6CtyCurrencyCodeDescription;
    }

    /**
     * Sets the value of the ct6CtyCurrencyCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyCurrencyCodeDescription(JAXBElement<String> value) {
        this.ct6CtyCurrencyCodeDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtyVatFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt6CtyVatFlag() {
        return ct6CtyVatFlag;
    }

    /**
     * Sets the value of the ct6CtyVatFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt6CtyVatFlag(JAXBElement<Short> value) {
        this.ct6CtyVatFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct6CtyIso2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyIso2() {
        return ct6CtyIso2;
    }

    /**
     * Sets the value of the ct6CtyIso2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyIso2(JAXBElement<String> value) {
        this.ct6CtyIso2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtyIso3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyIso3() {
        return ct6CtyIso3;
    }

    /**
     * Sets the value of the ct6CtyIso3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyIso3(JAXBElement<String> value) {
        this.ct6CtyIso3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtyDoNotShip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt6CtyDoNotShip() {
        return ct6CtyDoNotShip;
    }

    /**
     * Sets the value of the ct6CtyDoNotShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt6CtyDoNotShip(JAXBElement<Short> value) {
        this.ct6CtyDoNotShip = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct6CtyIsoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyIsoNumber() {
        return ct6CtyIsoNumber;
    }

    /**
     * Sets the value of the ct6CtyIsoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyIsoNumber(JAXBElement<String> value) {
        this.ct6CtyIsoNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtyBpaRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyBpaRegion() {
        return ct6CtyBpaRegion;
    }

    /**
     * Sets the value of the ct6CtyBpaRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyBpaRegion(JAXBElement<String> value) {
        this.ct6CtyBpaRegion = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtyDoNotSell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCt6CtyDoNotSell() {
        return ct6CtyDoNotSell;
    }

    /**
     * Sets the value of the ct6CtyDoNotSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCt6CtyDoNotSell(JAXBElement<Short> value) {
        this.ct6CtyDoNotSell = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ct6CtyDynKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyDynKey() {
        return ct6CtyDynKey;
    }

    /**
     * Sets the value of the ct6CtyDynKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyDynKey(JAXBElement<String> value) {
        this.ct6CtyDynKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtyDynKey2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyDynKey2() {
        return ct6CtyDynKey2;
    }

    /**
     * Sets the value of the ct6CtyDynKey2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyDynKey2(JAXBElement<String> value) {
        this.ct6CtyDynKey2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ct6CtyCgyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCt6CtyCgyKey() {
        return ct6CtyCgyKey;
    }

    /**
     * Sets the value of the ct6CtyCgyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCt6CtyCgyKey(JAXBElement<String> value) {
        this.ct6CtyCgyKey = ((JAXBElement<String> ) value);
    }

}
