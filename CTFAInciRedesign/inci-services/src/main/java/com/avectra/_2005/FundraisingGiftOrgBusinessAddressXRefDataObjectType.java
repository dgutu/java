
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Org_Business_Address_XRef_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Org_Business_Address_XRef_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cx6__cxa_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cx6__cxa_adr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cx6__cxa_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cx6__cxa_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cx6__cxa_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cx6__cxa_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cx6__cxa_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cx6__cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cx6__cxa_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cx6__cxa_on_hold_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cx6__cxa_adh_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cx6__cxa_adt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cx6__cxa_seasonal_from_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cx6__cxa_mailing_label" type="{http://www.avectra.com/2005/}stringLength450_Type" minOccurs="0"/>
 *         &lt;element name="cx6__cxa_seasonal_through_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cx6__cxa_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cx6__cxa_mail_stop" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cx6__cxa_mailing_label_html" type="{http://www.avectra.com/2005/}stringLength450_Type" minOccurs="0"/>
 *         &lt;element name="cx6__cxa_on_hold_from" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cx6__cxa_on_hold_through" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cx6__cxa_primary" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cx6__cxa_owner" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cx6__cxa_billing" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cx6__cxa_create_change_log" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Org_Business_Address_XRef_DataObjectType", propOrder = {
    "cx6CxaCstKey",
    "cx6CxaAdrKey",
    "cx6CxaAddDate",
    "cx6CxaAddUser",
    "cx6CxaChangeDate",
    "cx6CxaChangeUser",
    "cx6CxaDeleteFlag",
    "cx6CxaKey",
    "cx6CxaKeyExt",
    "cx6CxaOnHoldFlag",
    "cx6CxaAdhKey",
    "cx6CxaAdtKey",
    "cx6CxaSeasonalFromDate",
    "cx6CxaMailingLabel",
    "cx6CxaSeasonalThroughDate",
    "cx6CxaEntityKey",
    "cx6CxaMailStop",
    "cx6CxaMailingLabelHtml",
    "cx6CxaOnHoldFrom",
    "cx6CxaOnHoldThrough",
    "cx6CxaPrimary",
    "cx6CxaOwner",
    "cx6CxaBilling",
    "cx6CxaCreateChangeLog"
})
public class FundraisingGiftOrgBusinessAddressXRefDataObjectType {

    @XmlElementRef(name = "cx6__cxa_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx6CxaCstKey;
    @XmlElementRef(name = "cx6__cxa_adr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx6CxaAdrKey;
    @XmlElementRef(name = "cx6__cxa_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx6CxaAddDate;
    @XmlElementRef(name = "cx6__cxa_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx6CxaAddUser;
    @XmlElementRef(name = "cx6__cxa_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx6CxaChangeDate;
    @XmlElementRef(name = "cx6__cxa_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx6CxaChangeUser;
    @XmlElementRef(name = "cx6__cxa_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cx6CxaDeleteFlag;
    @XmlElementRef(name = "cx6__cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx6CxaKey;
    @XmlElementRef(name = "cx6__cxa_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx6CxaKeyExt;
    @XmlElementRef(name = "cx6__cxa_on_hold_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cx6CxaOnHoldFlag;
    @XmlElementRef(name = "cx6__cxa_adh_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx6CxaAdhKey;
    @XmlElementRef(name = "cx6__cxa_adt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx6CxaAdtKey;
    @XmlElementRef(name = "cx6__cxa_seasonal_from_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx6CxaSeasonalFromDate;
    @XmlElementRef(name = "cx6__cxa_mailing_label", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx6CxaMailingLabel;
    @XmlElementRef(name = "cx6__cxa_seasonal_through_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx6CxaSeasonalThroughDate;
    @XmlElementRef(name = "cx6__cxa_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx6CxaEntityKey;
    @XmlElementRef(name = "cx6__cxa_mail_stop", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx6CxaMailStop;
    @XmlElementRef(name = "cx6__cxa_mailing_label_html", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx6CxaMailingLabelHtml;
    @XmlElementRef(name = "cx6__cxa_on_hold_from", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx6CxaOnHoldFrom;
    @XmlElementRef(name = "cx6__cxa_on_hold_through", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx6CxaOnHoldThrough;
    @XmlElementRef(name = "cx6__cxa_primary", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cx6CxaPrimary;
    @XmlElementRef(name = "cx6__cxa_owner", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cx6CxaOwner;
    @XmlElementRef(name = "cx6__cxa_billing", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cx6CxaBilling;
    @XmlElementRef(name = "cx6__cxa_create_change_log", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cx6CxaCreateChangeLog;

    /**
     * Gets the value of the cx6CxaCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx6CxaCstKey() {
        return cx6CxaCstKey;
    }

    /**
     * Sets the value of the cx6CxaCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx6CxaCstKey(JAXBElement<String> value) {
        this.cx6CxaCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx6CxaAdrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx6CxaAdrKey() {
        return cx6CxaAdrKey;
    }

    /**
     * Sets the value of the cx6CxaAdrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx6CxaAdrKey(JAXBElement<String> value) {
        this.cx6CxaAdrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx6CxaAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx6CxaAddDate() {
        return cx6CxaAddDate;
    }

    /**
     * Sets the value of the cx6CxaAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx6CxaAddDate(JAXBElement<String> value) {
        this.cx6CxaAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx6CxaAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx6CxaAddUser() {
        return cx6CxaAddUser;
    }

    /**
     * Sets the value of the cx6CxaAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx6CxaAddUser(JAXBElement<String> value) {
        this.cx6CxaAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx6CxaChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx6CxaChangeDate() {
        return cx6CxaChangeDate;
    }

    /**
     * Sets the value of the cx6CxaChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx6CxaChangeDate(JAXBElement<String> value) {
        this.cx6CxaChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx6CxaChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx6CxaChangeUser() {
        return cx6CxaChangeUser;
    }

    /**
     * Sets the value of the cx6CxaChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx6CxaChangeUser(JAXBElement<String> value) {
        this.cx6CxaChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx6CxaDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCx6CxaDeleteFlag() {
        return cx6CxaDeleteFlag;
    }

    /**
     * Sets the value of the cx6CxaDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCx6CxaDeleteFlag(JAXBElement<Short> value) {
        this.cx6CxaDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cx6CxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx6CxaKey() {
        return cx6CxaKey;
    }

    /**
     * Sets the value of the cx6CxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx6CxaKey(JAXBElement<String> value) {
        this.cx6CxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx6CxaKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx6CxaKeyExt() {
        return cx6CxaKeyExt;
    }

    /**
     * Sets the value of the cx6CxaKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx6CxaKeyExt(JAXBElement<String> value) {
        this.cx6CxaKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx6CxaOnHoldFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCx6CxaOnHoldFlag() {
        return cx6CxaOnHoldFlag;
    }

    /**
     * Sets the value of the cx6CxaOnHoldFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCx6CxaOnHoldFlag(JAXBElement<Short> value) {
        this.cx6CxaOnHoldFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cx6CxaAdhKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx6CxaAdhKey() {
        return cx6CxaAdhKey;
    }

    /**
     * Sets the value of the cx6CxaAdhKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx6CxaAdhKey(JAXBElement<String> value) {
        this.cx6CxaAdhKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx6CxaAdtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx6CxaAdtKey() {
        return cx6CxaAdtKey;
    }

    /**
     * Sets the value of the cx6CxaAdtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx6CxaAdtKey(JAXBElement<String> value) {
        this.cx6CxaAdtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx6CxaSeasonalFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx6CxaSeasonalFromDate() {
        return cx6CxaSeasonalFromDate;
    }

    /**
     * Sets the value of the cx6CxaSeasonalFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx6CxaSeasonalFromDate(JAXBElement<String> value) {
        this.cx6CxaSeasonalFromDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx6CxaMailingLabel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx6CxaMailingLabel() {
        return cx6CxaMailingLabel;
    }

    /**
     * Sets the value of the cx6CxaMailingLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx6CxaMailingLabel(JAXBElement<String> value) {
        this.cx6CxaMailingLabel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx6CxaSeasonalThroughDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx6CxaSeasonalThroughDate() {
        return cx6CxaSeasonalThroughDate;
    }

    /**
     * Sets the value of the cx6CxaSeasonalThroughDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx6CxaSeasonalThroughDate(JAXBElement<String> value) {
        this.cx6CxaSeasonalThroughDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx6CxaEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx6CxaEntityKey() {
        return cx6CxaEntityKey;
    }

    /**
     * Sets the value of the cx6CxaEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx6CxaEntityKey(JAXBElement<String> value) {
        this.cx6CxaEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx6CxaMailStop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx6CxaMailStop() {
        return cx6CxaMailStop;
    }

    /**
     * Sets the value of the cx6CxaMailStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx6CxaMailStop(JAXBElement<String> value) {
        this.cx6CxaMailStop = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx6CxaMailingLabelHtml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx6CxaMailingLabelHtml() {
        return cx6CxaMailingLabelHtml;
    }

    /**
     * Sets the value of the cx6CxaMailingLabelHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx6CxaMailingLabelHtml(JAXBElement<String> value) {
        this.cx6CxaMailingLabelHtml = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx6CxaOnHoldFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx6CxaOnHoldFrom() {
        return cx6CxaOnHoldFrom;
    }

    /**
     * Sets the value of the cx6CxaOnHoldFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx6CxaOnHoldFrom(JAXBElement<String> value) {
        this.cx6CxaOnHoldFrom = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx6CxaOnHoldThrough property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx6CxaOnHoldThrough() {
        return cx6CxaOnHoldThrough;
    }

    /**
     * Sets the value of the cx6CxaOnHoldThrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx6CxaOnHoldThrough(JAXBElement<String> value) {
        this.cx6CxaOnHoldThrough = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx6CxaPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCx6CxaPrimary() {
        return cx6CxaPrimary;
    }

    /**
     * Sets the value of the cx6CxaPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCx6CxaPrimary(JAXBElement<Short> value) {
        this.cx6CxaPrimary = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cx6CxaOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCx6CxaOwner() {
        return cx6CxaOwner;
    }

    /**
     * Sets the value of the cx6CxaOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCx6CxaOwner(JAXBElement<Short> value) {
        this.cx6CxaOwner = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cx6CxaBilling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCx6CxaBilling() {
        return cx6CxaBilling;
    }

    /**
     * Sets the value of the cx6CxaBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCx6CxaBilling(JAXBElement<Short> value) {
        this.cx6CxaBilling = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cx6CxaCreateChangeLog property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCx6CxaCreateChangeLog() {
        return cx6CxaCreateChangeLog;
    }

    /**
     * Sets the value of the cx6CxaCreateChangeLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCx6CxaCreateChangeLog(JAXBElement<Short> value) {
        this.cx6CxaCreateChangeLog = ((JAXBElement<Short> ) value);
    }

}
