
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organization_Address_XRef_1_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Address_XRef_1_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cxa_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cxa_adr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cxa_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cxa_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cxa_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cxa_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cxa_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cxa_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cxa_on_hold_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cxa_adh_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cxa_adt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cxa_seasonal_from_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cxa_mailing_label" type="{http://www.avectra.com/2005/}stringLength450_Type" minOccurs="0"/>
 *         &lt;element name="cxa_seasonal_through_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cxa_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cxa_mail_stop" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cxa_mailing_label_html" type="{http://www.avectra.com/2005/}stringLength450_Type" minOccurs="0"/>
 *         &lt;element name="cxa_on_hold_from" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cxa_on_hold_through" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cxa_primary" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cxa_owner" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cxa_billing" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cxa_create_change_log" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Address_XRef_1_DataObjectType", propOrder = {
    "cxaCstKey",
    "cxaAdrKey",
    "cxaAddDate",
    "cxaAddUser",
    "cxaChangeDate",
    "cxaChangeUser",
    "cxaDeleteFlag",
    "cxaKey",
    "cxaKeyExt",
    "cxaOnHoldFlag",
    "cxaAdhKey",
    "cxaAdtKey",
    "cxaSeasonalFromDate",
    "cxaMailingLabel",
    "cxaSeasonalThroughDate",
    "cxaEntityKey",
    "cxaMailStop",
    "cxaMailingLabelHtml",
    "cxaOnHoldFrom",
    "cxaOnHoldThrough",
    "cxaPrimary",
    "cxaOwner",
    "cxaBilling",
    "cxaCreateChangeLog"
})
public class OrganizationAddressXRef1DataObjectType {

    @XmlElementRef(name = "cxa_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxaCstKey;
    @XmlElementRef(name = "cxa_adr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxaAdrKey;
    @XmlElementRef(name = "cxa_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxaAddDate;
    @XmlElementRef(name = "cxa_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxaAddUser;
    @XmlElementRef(name = "cxa_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxaChangeDate;
    @XmlElementRef(name = "cxa_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxaChangeUser;
    @XmlElementRef(name = "cxa_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cxaDeleteFlag;
    @XmlElementRef(name = "cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxaKey;
    @XmlElementRef(name = "cxa_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxaKeyExt;
    @XmlElementRef(name = "cxa_on_hold_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cxaOnHoldFlag;
    @XmlElementRef(name = "cxa_adh_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxaAdhKey;
    @XmlElementRef(name = "cxa_adt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxaAdtKey;
    @XmlElementRef(name = "cxa_seasonal_from_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxaSeasonalFromDate;
    @XmlElementRef(name = "cxa_mailing_label", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxaMailingLabel;
    @XmlElementRef(name = "cxa_seasonal_through_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxaSeasonalThroughDate;
    @XmlElementRef(name = "cxa_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxaEntityKey;
    @XmlElementRef(name = "cxa_mail_stop", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxaMailStop;
    @XmlElementRef(name = "cxa_mailing_label_html", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxaMailingLabelHtml;
    @XmlElementRef(name = "cxa_on_hold_from", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxaOnHoldFrom;
    @XmlElementRef(name = "cxa_on_hold_through", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxaOnHoldThrough;
    @XmlElementRef(name = "cxa_primary", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cxaPrimary;
    @XmlElementRef(name = "cxa_owner", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cxaOwner;
    @XmlElementRef(name = "cxa_billing", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cxaBilling;
    @XmlElementRef(name = "cxa_create_change_log", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cxaCreateChangeLog;

    /**
     * Gets the value of the cxaCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxaCstKey() {
        return cxaCstKey;
    }

    /**
     * Sets the value of the cxaCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxaCstKey(JAXBElement<String> value) {
        this.cxaCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxaAdrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxaAdrKey() {
        return cxaAdrKey;
    }

    /**
     * Sets the value of the cxaAdrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxaAdrKey(JAXBElement<String> value) {
        this.cxaAdrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxaAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxaAddDate() {
        return cxaAddDate;
    }

    /**
     * Sets the value of the cxaAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxaAddDate(JAXBElement<String> value) {
        this.cxaAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxaAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxaAddUser() {
        return cxaAddUser;
    }

    /**
     * Sets the value of the cxaAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxaAddUser(JAXBElement<String> value) {
        this.cxaAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxaChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxaChangeDate() {
        return cxaChangeDate;
    }

    /**
     * Sets the value of the cxaChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxaChangeDate(JAXBElement<String> value) {
        this.cxaChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxaChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxaChangeUser() {
        return cxaChangeUser;
    }

    /**
     * Sets the value of the cxaChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxaChangeUser(JAXBElement<String> value) {
        this.cxaChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxaDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCxaDeleteFlag() {
        return cxaDeleteFlag;
    }

    /**
     * Sets the value of the cxaDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCxaDeleteFlag(JAXBElement<Short> value) {
        this.cxaDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxaKey() {
        return cxaKey;
    }

    /**
     * Sets the value of the cxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxaKey(JAXBElement<String> value) {
        this.cxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxaKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxaKeyExt() {
        return cxaKeyExt;
    }

    /**
     * Sets the value of the cxaKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxaKeyExt(JAXBElement<String> value) {
        this.cxaKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxaOnHoldFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCxaOnHoldFlag() {
        return cxaOnHoldFlag;
    }

    /**
     * Sets the value of the cxaOnHoldFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCxaOnHoldFlag(JAXBElement<Short> value) {
        this.cxaOnHoldFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cxaAdhKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxaAdhKey() {
        return cxaAdhKey;
    }

    /**
     * Sets the value of the cxaAdhKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxaAdhKey(JAXBElement<String> value) {
        this.cxaAdhKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxaAdtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxaAdtKey() {
        return cxaAdtKey;
    }

    /**
     * Sets the value of the cxaAdtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxaAdtKey(JAXBElement<String> value) {
        this.cxaAdtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxaSeasonalFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxaSeasonalFromDate() {
        return cxaSeasonalFromDate;
    }

    /**
     * Sets the value of the cxaSeasonalFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxaSeasonalFromDate(JAXBElement<String> value) {
        this.cxaSeasonalFromDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxaMailingLabel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxaMailingLabel() {
        return cxaMailingLabel;
    }

    /**
     * Sets the value of the cxaMailingLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxaMailingLabel(JAXBElement<String> value) {
        this.cxaMailingLabel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxaSeasonalThroughDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxaSeasonalThroughDate() {
        return cxaSeasonalThroughDate;
    }

    /**
     * Sets the value of the cxaSeasonalThroughDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxaSeasonalThroughDate(JAXBElement<String> value) {
        this.cxaSeasonalThroughDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxaEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxaEntityKey() {
        return cxaEntityKey;
    }

    /**
     * Sets the value of the cxaEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxaEntityKey(JAXBElement<String> value) {
        this.cxaEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxaMailStop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxaMailStop() {
        return cxaMailStop;
    }

    /**
     * Sets the value of the cxaMailStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxaMailStop(JAXBElement<String> value) {
        this.cxaMailStop = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxaMailingLabelHtml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxaMailingLabelHtml() {
        return cxaMailingLabelHtml;
    }

    /**
     * Sets the value of the cxaMailingLabelHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxaMailingLabelHtml(JAXBElement<String> value) {
        this.cxaMailingLabelHtml = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxaOnHoldFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxaOnHoldFrom() {
        return cxaOnHoldFrom;
    }

    /**
     * Sets the value of the cxaOnHoldFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxaOnHoldFrom(JAXBElement<String> value) {
        this.cxaOnHoldFrom = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxaOnHoldThrough property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxaOnHoldThrough() {
        return cxaOnHoldThrough;
    }

    /**
     * Sets the value of the cxaOnHoldThrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxaOnHoldThrough(JAXBElement<String> value) {
        this.cxaOnHoldThrough = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxaPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCxaPrimary() {
        return cxaPrimary;
    }

    /**
     * Sets the value of the cxaPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCxaPrimary(JAXBElement<Short> value) {
        this.cxaPrimary = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cxaOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCxaOwner() {
        return cxaOwner;
    }

    /**
     * Sets the value of the cxaOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCxaOwner(JAXBElement<Short> value) {
        this.cxaOwner = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cxaBilling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCxaBilling() {
        return cxaBilling;
    }

    /**
     * Sets the value of the cxaBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCxaBilling(JAXBElement<Short> value) {
        this.cxaBilling = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cxaCreateChangeLog property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCxaCreateChangeLog() {
        return cxaCreateChangeLog;
    }

    /**
     * Sets the value of the cxaCreateChangeLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCxaCreateChangeLog(JAXBElement<Short> value) {
        this.cxaCreateChangeLog = ((JAXBElement<Short> ) value);
    }

}
