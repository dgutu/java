
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrantGroup_Payment_Info_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrantGroup_Payment_Info_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pin_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pin_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pin_apm_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pin_cc_number" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="pin_cc_number_display" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="pin_cc_expire" type="{http://www.avectra.com/2005/}stringLength7_Type" minOccurs="0"/>
 *         &lt;element name="pin_cc_cardholder_name" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="pin_cc_auth" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="pin_cc_security_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="pin_check_number" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="pin_eft_routing_number" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="pin_eft_account_number" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="pin_other_ref_number" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="pin_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="pin_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="pin_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="pin_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="pin_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="pin_check_amount" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="pin_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pin_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pin_merchant_option" type="{http://www.avectra.com/2005/}stringLength25_Type" minOccurs="0"/>
 *         &lt;element name="pin_enc_version" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="pin_cc_preauth_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="pin_preauth_pin_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pin_street" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="pin_city" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="pin_state" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="pin_zip" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="pin_email" type="{http://www.avectra.com/2005/}av_email_Type" minOccurs="0"/>
 *         &lt;element name="pin_DL" type="{http://www.avectra.com/2005/}stringLength33_Type" minOccurs="0"/>
 *         &lt;element name="pin_name_on_check" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="pin_eft_account_type" type="{http://www.avectra.com/2005/}stringLength1_Type" minOccurs="0"/>
 *         &lt;element name="pin_eft_account_number_display" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="pin_other_preauth_ref_number" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="pin_cty_iso_number" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="pin_SS" type="{http://www.avectra.com/2005/}stringLength35_Type" minOccurs="0"/>
 *         &lt;element name="pin_vault_acount" type="{http://www.avectra.com/2005/}stringLength25_Type" minOccurs="0"/>
 *         &lt;element name="pin_cpi_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pin_description" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="pin_cc_error" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="pin_isvault" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="pin_tax_amt" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrantGroup_Payment_Info_DataObjectType", propOrder = {
    "pinKey",
    "pinCstKey",
    "pinApmKey",
    "pinCcNumber",
    "pinCcNumberDisplay",
    "pinCcExpire",
    "pinCcCardholderName",
    "pinCcAuth",
    "pinCcSecurityCode",
    "pinCheckNumber",
    "pinEftRoutingNumber",
    "pinEftAccountNumber",
    "pinOtherRefNumber",
    "pinAddUser",
    "pinAddDate",
    "pinChangeUser",
    "pinChangeDate",
    "pinDeleteFlag",
    "pinCheckAmount",
    "pinKeyExt",
    "pinEntityKey",
    "pinMerchantOption",
    "pinEncVersion",
    "pinCcPreauthFlag",
    "pinPreauthPinKey",
    "pinStreet",
    "pinCity",
    "pinState",
    "pinZip",
    "pinEmail",
    "pinDL",
    "pinNameOnCheck",
    "pinEftAccountType",
    "pinEftAccountNumberDisplay",
    "pinOtherPreauthRefNumber",
    "pinCtyIsoNumber",
    "pinSS",
    "pinVaultAcount",
    "pinCpiKey",
    "pinDescription",
    "pinCcError",
    "pinIsvault",
    "pinTaxAmt"
})
public class EventsRegistrantGroupPaymentInfoDataObjectType {

    @XmlElementRef(name = "pin_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinKey;
    @XmlElementRef(name = "pin_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinCstKey;
    @XmlElementRef(name = "pin_apm_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinApmKey;
    @XmlElementRef(name = "pin_cc_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinCcNumber;
    @XmlElementRef(name = "pin_cc_number_display", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinCcNumberDisplay;
    @XmlElementRef(name = "pin_cc_expire", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinCcExpire;
    @XmlElementRef(name = "pin_cc_cardholder_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinCcCardholderName;
    @XmlElementRef(name = "pin_cc_auth", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinCcAuth;
    @XmlElementRef(name = "pin_cc_security_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinCcSecurityCode;
    @XmlElementRef(name = "pin_check_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinCheckNumber;
    @XmlElementRef(name = "pin_eft_routing_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinEftRoutingNumber;
    @XmlElementRef(name = "pin_eft_account_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinEftAccountNumber;
    @XmlElementRef(name = "pin_other_ref_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinOtherRefNumber;
    @XmlElementRef(name = "pin_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinAddUser;
    @XmlElementRef(name = "pin_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinAddDate;
    @XmlElementRef(name = "pin_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinChangeUser;
    @XmlElementRef(name = "pin_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinChangeDate;
    @XmlElementRef(name = "pin_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> pinDeleteFlag;
    @XmlElementRef(name = "pin_check_amount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> pinCheckAmount;
    @XmlElementRef(name = "pin_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinKeyExt;
    @XmlElementRef(name = "pin_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinEntityKey;
    @XmlElementRef(name = "pin_merchant_option", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinMerchantOption;
    @XmlElementRef(name = "pin_enc_version", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> pinEncVersion;
    @XmlElementRef(name = "pin_cc_preauth_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> pinCcPreauthFlag;
    @XmlElementRef(name = "pin_preauth_pin_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinPreauthPinKey;
    @XmlElementRef(name = "pin_street", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinStreet;
    @XmlElementRef(name = "pin_city", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinCity;
    @XmlElementRef(name = "pin_state", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinState;
    @XmlElementRef(name = "pin_zip", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinZip;
    @XmlElementRef(name = "pin_email", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinEmail;
    @XmlElementRef(name = "pin_DL", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinDL;
    @XmlElementRef(name = "pin_name_on_check", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinNameOnCheck;
    @XmlElementRef(name = "pin_eft_account_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinEftAccountType;
    @XmlElementRef(name = "pin_eft_account_number_display", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinEftAccountNumberDisplay;
    @XmlElementRef(name = "pin_other_preauth_ref_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinOtherPreauthRefNumber;
    @XmlElementRef(name = "pin_cty_iso_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinCtyIsoNumber;
    @XmlElementRef(name = "pin_SS", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinSS;
    @XmlElementRef(name = "pin_vault_acount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinVaultAcount;
    @XmlElementRef(name = "pin_cpi_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinCpiKey;
    @XmlElementRef(name = "pin_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinDescription;
    @XmlElementRef(name = "pin_cc_error", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pinCcError;
    @XmlElementRef(name = "pin_isvault", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> pinIsvault;
    @XmlElementRef(name = "pin_tax_amt", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> pinTaxAmt;

    /**
     * Gets the value of the pinKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinKey() {
        return pinKey;
    }

    /**
     * Sets the value of the pinKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinKey(JAXBElement<String> value) {
        this.pinKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinCstKey() {
        return pinCstKey;
    }

    /**
     * Sets the value of the pinCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinCstKey(JAXBElement<String> value) {
        this.pinCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinApmKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinApmKey() {
        return pinApmKey;
    }

    /**
     * Sets the value of the pinApmKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinApmKey(JAXBElement<String> value) {
        this.pinApmKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinCcNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinCcNumber() {
        return pinCcNumber;
    }

    /**
     * Sets the value of the pinCcNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinCcNumber(JAXBElement<String> value) {
        this.pinCcNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinCcNumberDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinCcNumberDisplay() {
        return pinCcNumberDisplay;
    }

    /**
     * Sets the value of the pinCcNumberDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinCcNumberDisplay(JAXBElement<String> value) {
        this.pinCcNumberDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinCcExpire property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinCcExpire() {
        return pinCcExpire;
    }

    /**
     * Sets the value of the pinCcExpire property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinCcExpire(JAXBElement<String> value) {
        this.pinCcExpire = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinCcCardholderName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinCcCardholderName() {
        return pinCcCardholderName;
    }

    /**
     * Sets the value of the pinCcCardholderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinCcCardholderName(JAXBElement<String> value) {
        this.pinCcCardholderName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinCcAuth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinCcAuth() {
        return pinCcAuth;
    }

    /**
     * Sets the value of the pinCcAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinCcAuth(JAXBElement<String> value) {
        this.pinCcAuth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinCcSecurityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinCcSecurityCode() {
        return pinCcSecurityCode;
    }

    /**
     * Sets the value of the pinCcSecurityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinCcSecurityCode(JAXBElement<String> value) {
        this.pinCcSecurityCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinCheckNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinCheckNumber() {
        return pinCheckNumber;
    }

    /**
     * Sets the value of the pinCheckNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinCheckNumber(JAXBElement<String> value) {
        this.pinCheckNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinEftRoutingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinEftRoutingNumber() {
        return pinEftRoutingNumber;
    }

    /**
     * Sets the value of the pinEftRoutingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinEftRoutingNumber(JAXBElement<String> value) {
        this.pinEftRoutingNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinEftAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinEftAccountNumber() {
        return pinEftAccountNumber;
    }

    /**
     * Sets the value of the pinEftAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinEftAccountNumber(JAXBElement<String> value) {
        this.pinEftAccountNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinOtherRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinOtherRefNumber() {
        return pinOtherRefNumber;
    }

    /**
     * Sets the value of the pinOtherRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinOtherRefNumber(JAXBElement<String> value) {
        this.pinOtherRefNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinAddUser() {
        return pinAddUser;
    }

    /**
     * Sets the value of the pinAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinAddUser(JAXBElement<String> value) {
        this.pinAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinAddDate() {
        return pinAddDate;
    }

    /**
     * Sets the value of the pinAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinAddDate(JAXBElement<String> value) {
        this.pinAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinChangeUser() {
        return pinChangeUser;
    }

    /**
     * Sets the value of the pinChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinChangeUser(JAXBElement<String> value) {
        this.pinChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinChangeDate() {
        return pinChangeDate;
    }

    /**
     * Sets the value of the pinChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinChangeDate(JAXBElement<String> value) {
        this.pinChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPinDeleteFlag() {
        return pinDeleteFlag;
    }

    /**
     * Sets the value of the pinDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPinDeleteFlag(JAXBElement<Short> value) {
        this.pinDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the pinCheckAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPinCheckAmount() {
        return pinCheckAmount;
    }

    /**
     * Sets the value of the pinCheckAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPinCheckAmount(JAXBElement<BigDecimal> value) {
        this.pinCheckAmount = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the pinKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinKeyExt() {
        return pinKeyExt;
    }

    /**
     * Sets the value of the pinKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinKeyExt(JAXBElement<String> value) {
        this.pinKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinEntityKey() {
        return pinEntityKey;
    }

    /**
     * Sets the value of the pinEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinEntityKey(JAXBElement<String> value) {
        this.pinEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinMerchantOption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinMerchantOption() {
        return pinMerchantOption;
    }

    /**
     * Sets the value of the pinMerchantOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinMerchantOption(JAXBElement<String> value) {
        this.pinMerchantOption = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinEncVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPinEncVersion() {
        return pinEncVersion;
    }

    /**
     * Sets the value of the pinEncVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPinEncVersion(JAXBElement<Integer> value) {
        this.pinEncVersion = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the pinCcPreauthFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPinCcPreauthFlag() {
        return pinCcPreauthFlag;
    }

    /**
     * Sets the value of the pinCcPreauthFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPinCcPreauthFlag(JAXBElement<Short> value) {
        this.pinCcPreauthFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the pinPreauthPinKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinPreauthPinKey() {
        return pinPreauthPinKey;
    }

    /**
     * Sets the value of the pinPreauthPinKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinPreauthPinKey(JAXBElement<String> value) {
        this.pinPreauthPinKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinStreet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinStreet() {
        return pinStreet;
    }

    /**
     * Sets the value of the pinStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinStreet(JAXBElement<String> value) {
        this.pinStreet = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinCity() {
        return pinCity;
    }

    /**
     * Sets the value of the pinCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinCity(JAXBElement<String> value) {
        this.pinCity = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinState() {
        return pinState;
    }

    /**
     * Sets the value of the pinState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinState(JAXBElement<String> value) {
        this.pinState = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinZip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinZip() {
        return pinZip;
    }

    /**
     * Sets the value of the pinZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinZip(JAXBElement<String> value) {
        this.pinZip = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinEmail() {
        return pinEmail;
    }

    /**
     * Sets the value of the pinEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinEmail(JAXBElement<String> value) {
        this.pinEmail = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinDL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinDL() {
        return pinDL;
    }

    /**
     * Sets the value of the pinDL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinDL(JAXBElement<String> value) {
        this.pinDL = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinNameOnCheck property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinNameOnCheck() {
        return pinNameOnCheck;
    }

    /**
     * Sets the value of the pinNameOnCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinNameOnCheck(JAXBElement<String> value) {
        this.pinNameOnCheck = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinEftAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinEftAccountType() {
        return pinEftAccountType;
    }

    /**
     * Sets the value of the pinEftAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinEftAccountType(JAXBElement<String> value) {
        this.pinEftAccountType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinEftAccountNumberDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinEftAccountNumberDisplay() {
        return pinEftAccountNumberDisplay;
    }

    /**
     * Sets the value of the pinEftAccountNumberDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinEftAccountNumberDisplay(JAXBElement<String> value) {
        this.pinEftAccountNumberDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinOtherPreauthRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinOtherPreauthRefNumber() {
        return pinOtherPreauthRefNumber;
    }

    /**
     * Sets the value of the pinOtherPreauthRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinOtherPreauthRefNumber(JAXBElement<String> value) {
        this.pinOtherPreauthRefNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinCtyIsoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinCtyIsoNumber() {
        return pinCtyIsoNumber;
    }

    /**
     * Sets the value of the pinCtyIsoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinCtyIsoNumber(JAXBElement<String> value) {
        this.pinCtyIsoNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinSS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinSS() {
        return pinSS;
    }

    /**
     * Sets the value of the pinSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinSS(JAXBElement<String> value) {
        this.pinSS = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinVaultAcount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinVaultAcount() {
        return pinVaultAcount;
    }

    /**
     * Sets the value of the pinVaultAcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinVaultAcount(JAXBElement<String> value) {
        this.pinVaultAcount = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinCpiKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinCpiKey() {
        return pinCpiKey;
    }

    /**
     * Sets the value of the pinCpiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinCpiKey(JAXBElement<String> value) {
        this.pinCpiKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinDescription() {
        return pinDescription;
    }

    /**
     * Sets the value of the pinDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinDescription(JAXBElement<String> value) {
        this.pinDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinCcError property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinCcError() {
        return pinCcError;
    }

    /**
     * Sets the value of the pinCcError property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinCcError(JAXBElement<String> value) {
        this.pinCcError = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pinIsvault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPinIsvault() {
        return pinIsvault;
    }

    /**
     * Sets the value of the pinIsvault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPinIsvault(JAXBElement<Short> value) {
        this.pinIsvault = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the pinTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPinTaxAmt() {
        return pinTaxAmt;
    }

    /**
     * Sets the value of the pinTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPinTaxAmt(JAXBElement<BigDecimal> value) {
        this.pinTaxAmt = ((JAXBElement<BigDecimal> ) value);
    }

}
