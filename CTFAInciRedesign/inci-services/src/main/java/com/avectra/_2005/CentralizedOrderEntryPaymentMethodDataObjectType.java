
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CentralizedOrderEntry_Payment_Method_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CentralizedOrderEntry_Payment_Method_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apm_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="apm_atc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="apm_type" type="{http://www.avectra.com/2005/}stringLength15_Type" minOccurs="0"/>
 *         &lt;element name="apm_method" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="apm_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="apm_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="apm_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="apm_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="apm_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="apm_gla_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="apm_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="apm_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="apm_iweb_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="apm_eweb_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="apm_merchant_option" type="{http://www.avectra.com/2005/}stringLength25_Type" minOccurs="0"/>
 *         &lt;element name="apm_batch_suffix" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="apm_currency_code" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="apm_csc_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="apm_cc_format" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CentralizedOrderEntry_Payment_Method_DataObjectType", propOrder = {
    "apmKey",
    "apmAtcKey",
    "apmType",
    "apmMethod",
    "apmAddUser",
    "apmAddDate",
    "apmChangeDate",
    "apmChangeUser",
    "apmDeleteFlag",
    "apmGlaKey",
    "apmEntityKey",
    "apmKeyExt",
    "apmIwebFlag",
    "apmEwebFlag",
    "apmMerchantOption",
    "apmBatchSuffix",
    "apmCurrencyCode",
    "apmCscFlag",
    "apmCcFormat"
})
public class CentralizedOrderEntryPaymentMethodDataObjectType {

    @XmlElementRef(name = "apm_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> apmKey;
    @XmlElementRef(name = "apm_atc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> apmAtcKey;
    @XmlElementRef(name = "apm_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> apmType;
    @XmlElementRef(name = "apm_method", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> apmMethod;
    @XmlElementRef(name = "apm_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> apmAddUser;
    @XmlElementRef(name = "apm_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> apmAddDate;
    @XmlElementRef(name = "apm_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> apmChangeDate;
    @XmlElementRef(name = "apm_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> apmChangeUser;
    @XmlElementRef(name = "apm_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> apmDeleteFlag;
    @XmlElementRef(name = "apm_gla_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> apmGlaKey;
    @XmlElementRef(name = "apm_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> apmEntityKey;
    @XmlElementRef(name = "apm_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> apmKeyExt;
    @XmlElementRef(name = "apm_iweb_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> apmIwebFlag;
    @XmlElementRef(name = "apm_eweb_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> apmEwebFlag;
    @XmlElementRef(name = "apm_merchant_option", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> apmMerchantOption;
    @XmlElementRef(name = "apm_batch_suffix", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> apmBatchSuffix;
    @XmlElementRef(name = "apm_currency_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> apmCurrencyCode;
    @XmlElementRef(name = "apm_csc_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> apmCscFlag;
    @XmlElementRef(name = "apm_cc_format", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> apmCcFormat;

    /**
     * Gets the value of the apmKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApmKey() {
        return apmKey;
    }

    /**
     * Sets the value of the apmKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApmKey(JAXBElement<String> value) {
        this.apmKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the apmAtcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApmAtcKey() {
        return apmAtcKey;
    }

    /**
     * Sets the value of the apmAtcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApmAtcKey(JAXBElement<String> value) {
        this.apmAtcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the apmType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApmType() {
        return apmType;
    }

    /**
     * Sets the value of the apmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApmType(JAXBElement<String> value) {
        this.apmType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the apmMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApmMethod() {
        return apmMethod;
    }

    /**
     * Sets the value of the apmMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApmMethod(JAXBElement<String> value) {
        this.apmMethod = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the apmAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApmAddUser() {
        return apmAddUser;
    }

    /**
     * Sets the value of the apmAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApmAddUser(JAXBElement<String> value) {
        this.apmAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the apmAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApmAddDate() {
        return apmAddDate;
    }

    /**
     * Sets the value of the apmAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApmAddDate(JAXBElement<String> value) {
        this.apmAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the apmChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApmChangeDate() {
        return apmChangeDate;
    }

    /**
     * Sets the value of the apmChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApmChangeDate(JAXBElement<String> value) {
        this.apmChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the apmChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApmChangeUser() {
        return apmChangeUser;
    }

    /**
     * Sets the value of the apmChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApmChangeUser(JAXBElement<String> value) {
        this.apmChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the apmDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getApmDeleteFlag() {
        return apmDeleteFlag;
    }

    /**
     * Sets the value of the apmDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setApmDeleteFlag(JAXBElement<Short> value) {
        this.apmDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the apmGlaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApmGlaKey() {
        return apmGlaKey;
    }

    /**
     * Sets the value of the apmGlaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApmGlaKey(JAXBElement<String> value) {
        this.apmGlaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the apmEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApmEntityKey() {
        return apmEntityKey;
    }

    /**
     * Sets the value of the apmEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApmEntityKey(JAXBElement<String> value) {
        this.apmEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the apmKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApmKeyExt() {
        return apmKeyExt;
    }

    /**
     * Sets the value of the apmKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApmKeyExt(JAXBElement<String> value) {
        this.apmKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the apmIwebFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getApmIwebFlag() {
        return apmIwebFlag;
    }

    /**
     * Sets the value of the apmIwebFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setApmIwebFlag(JAXBElement<Short> value) {
        this.apmIwebFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the apmEwebFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getApmEwebFlag() {
        return apmEwebFlag;
    }

    /**
     * Sets the value of the apmEwebFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setApmEwebFlag(JAXBElement<Short> value) {
        this.apmEwebFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the apmMerchantOption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApmMerchantOption() {
        return apmMerchantOption;
    }

    /**
     * Sets the value of the apmMerchantOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApmMerchantOption(JAXBElement<String> value) {
        this.apmMerchantOption = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the apmBatchSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApmBatchSuffix() {
        return apmBatchSuffix;
    }

    /**
     * Sets the value of the apmBatchSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApmBatchSuffix(JAXBElement<String> value) {
        this.apmBatchSuffix = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the apmCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApmCurrencyCode() {
        return apmCurrencyCode;
    }

    /**
     * Sets the value of the apmCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApmCurrencyCode(JAXBElement<String> value) {
        this.apmCurrencyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the apmCscFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getApmCscFlag() {
        return apmCscFlag;
    }

    /**
     * Sets the value of the apmCscFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setApmCscFlag(JAXBElement<Short> value) {
        this.apmCscFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the apmCcFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApmCcFormat() {
        return apmCcFormat;
    }

    /**
     * Sets the value of the apmCcFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApmCcFormat(JAXBElement<String> value) {
        this.apmCcFormat = ((JAXBElement<String> ) value);
    }

}
