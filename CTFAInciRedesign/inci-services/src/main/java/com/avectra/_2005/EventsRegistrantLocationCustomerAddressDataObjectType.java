
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrant_Location_Customer_Address_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrant_Location_Customer_Address_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cx2__cxa_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cx2__cxa_adr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cx2__cxa_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cx2__cxa_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cx2__cxa_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cx2__cxa_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cx2__cxa_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cx2__cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cx2__cxa_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cx2__cxa_on_hold_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cx2__cxa_adh_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cx2__cxa_adt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cx2__cxa_seasonal_from_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cx2__cxa_mailing_label" type="{http://www.avectra.com/2005/}stringLength450_Type" minOccurs="0"/>
 *         &lt;element name="cx2__cxa_seasonal_through_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cx2__cxa_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cx2__cxa_mail_stop" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cx2__cxa_mailing_label_html" type="{http://www.avectra.com/2005/}stringLength450_Type" minOccurs="0"/>
 *         &lt;element name="cx2__cxa_on_hold_from" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cx2__cxa_on_hold_through" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrant_Location_Customer_Address_DataObjectType", propOrder = {
    "cx2CxaCstKey",
    "cx2CxaAdrKey",
    "cx2CxaAddDate",
    "cx2CxaAddUser",
    "cx2CxaChangeDate",
    "cx2CxaChangeUser",
    "cx2CxaDeleteFlag",
    "cx2CxaKey",
    "cx2CxaKeyExt",
    "cx2CxaOnHoldFlag",
    "cx2CxaAdhKey",
    "cx2CxaAdtKey",
    "cx2CxaSeasonalFromDate",
    "cx2CxaMailingLabel",
    "cx2CxaSeasonalThroughDate",
    "cx2CxaEntityKey",
    "cx2CxaMailStop",
    "cx2CxaMailingLabelHtml",
    "cx2CxaOnHoldFrom",
    "cx2CxaOnHoldThrough"
})
public class EventsRegistrantLocationCustomerAddressDataObjectType {

    @XmlElementRef(name = "cx2__cxa_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx2CxaCstKey;
    @XmlElementRef(name = "cx2__cxa_adr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx2CxaAdrKey;
    @XmlElementRef(name = "cx2__cxa_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx2CxaAddDate;
    @XmlElementRef(name = "cx2__cxa_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx2CxaAddUser;
    @XmlElementRef(name = "cx2__cxa_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx2CxaChangeDate;
    @XmlElementRef(name = "cx2__cxa_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx2CxaChangeUser;
    @XmlElementRef(name = "cx2__cxa_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cx2CxaDeleteFlag;
    @XmlElementRef(name = "cx2__cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx2CxaKey;
    @XmlElementRef(name = "cx2__cxa_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx2CxaKeyExt;
    @XmlElementRef(name = "cx2__cxa_on_hold_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cx2CxaOnHoldFlag;
    @XmlElementRef(name = "cx2__cxa_adh_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx2CxaAdhKey;
    @XmlElementRef(name = "cx2__cxa_adt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx2CxaAdtKey;
    @XmlElementRef(name = "cx2__cxa_seasonal_from_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx2CxaSeasonalFromDate;
    @XmlElementRef(name = "cx2__cxa_mailing_label", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx2CxaMailingLabel;
    @XmlElementRef(name = "cx2__cxa_seasonal_through_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx2CxaSeasonalThroughDate;
    @XmlElementRef(name = "cx2__cxa_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx2CxaEntityKey;
    @XmlElementRef(name = "cx2__cxa_mail_stop", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx2CxaMailStop;
    @XmlElementRef(name = "cx2__cxa_mailing_label_html", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx2CxaMailingLabelHtml;
    @XmlElementRef(name = "cx2__cxa_on_hold_from", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx2CxaOnHoldFrom;
    @XmlElementRef(name = "cx2__cxa_on_hold_through", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cx2CxaOnHoldThrough;

    /**
     * Gets the value of the cx2CxaCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx2CxaCstKey() {
        return cx2CxaCstKey;
    }

    /**
     * Sets the value of the cx2CxaCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx2CxaCstKey(JAXBElement<String> value) {
        this.cx2CxaCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx2CxaAdrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx2CxaAdrKey() {
        return cx2CxaAdrKey;
    }

    /**
     * Sets the value of the cx2CxaAdrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx2CxaAdrKey(JAXBElement<String> value) {
        this.cx2CxaAdrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx2CxaAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx2CxaAddDate() {
        return cx2CxaAddDate;
    }

    /**
     * Sets the value of the cx2CxaAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx2CxaAddDate(JAXBElement<String> value) {
        this.cx2CxaAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx2CxaAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx2CxaAddUser() {
        return cx2CxaAddUser;
    }

    /**
     * Sets the value of the cx2CxaAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx2CxaAddUser(JAXBElement<String> value) {
        this.cx2CxaAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx2CxaChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx2CxaChangeDate() {
        return cx2CxaChangeDate;
    }

    /**
     * Sets the value of the cx2CxaChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx2CxaChangeDate(JAXBElement<String> value) {
        this.cx2CxaChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx2CxaChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx2CxaChangeUser() {
        return cx2CxaChangeUser;
    }

    /**
     * Sets the value of the cx2CxaChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx2CxaChangeUser(JAXBElement<String> value) {
        this.cx2CxaChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx2CxaDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCx2CxaDeleteFlag() {
        return cx2CxaDeleteFlag;
    }

    /**
     * Sets the value of the cx2CxaDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCx2CxaDeleteFlag(JAXBElement<Short> value) {
        this.cx2CxaDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cx2CxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx2CxaKey() {
        return cx2CxaKey;
    }

    /**
     * Sets the value of the cx2CxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx2CxaKey(JAXBElement<String> value) {
        this.cx2CxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx2CxaKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx2CxaKeyExt() {
        return cx2CxaKeyExt;
    }

    /**
     * Sets the value of the cx2CxaKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx2CxaKeyExt(JAXBElement<String> value) {
        this.cx2CxaKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx2CxaOnHoldFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCx2CxaOnHoldFlag() {
        return cx2CxaOnHoldFlag;
    }

    /**
     * Sets the value of the cx2CxaOnHoldFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCx2CxaOnHoldFlag(JAXBElement<Short> value) {
        this.cx2CxaOnHoldFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cx2CxaAdhKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx2CxaAdhKey() {
        return cx2CxaAdhKey;
    }

    /**
     * Sets the value of the cx2CxaAdhKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx2CxaAdhKey(JAXBElement<String> value) {
        this.cx2CxaAdhKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx2CxaAdtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx2CxaAdtKey() {
        return cx2CxaAdtKey;
    }

    /**
     * Sets the value of the cx2CxaAdtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx2CxaAdtKey(JAXBElement<String> value) {
        this.cx2CxaAdtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx2CxaSeasonalFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx2CxaSeasonalFromDate() {
        return cx2CxaSeasonalFromDate;
    }

    /**
     * Sets the value of the cx2CxaSeasonalFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx2CxaSeasonalFromDate(JAXBElement<String> value) {
        this.cx2CxaSeasonalFromDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx2CxaMailingLabel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx2CxaMailingLabel() {
        return cx2CxaMailingLabel;
    }

    /**
     * Sets the value of the cx2CxaMailingLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx2CxaMailingLabel(JAXBElement<String> value) {
        this.cx2CxaMailingLabel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx2CxaSeasonalThroughDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx2CxaSeasonalThroughDate() {
        return cx2CxaSeasonalThroughDate;
    }

    /**
     * Sets the value of the cx2CxaSeasonalThroughDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx2CxaSeasonalThroughDate(JAXBElement<String> value) {
        this.cx2CxaSeasonalThroughDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx2CxaEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx2CxaEntityKey() {
        return cx2CxaEntityKey;
    }

    /**
     * Sets the value of the cx2CxaEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx2CxaEntityKey(JAXBElement<String> value) {
        this.cx2CxaEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx2CxaMailStop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx2CxaMailStop() {
        return cx2CxaMailStop;
    }

    /**
     * Sets the value of the cx2CxaMailStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx2CxaMailStop(JAXBElement<String> value) {
        this.cx2CxaMailStop = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx2CxaMailingLabelHtml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx2CxaMailingLabelHtml() {
        return cx2CxaMailingLabelHtml;
    }

    /**
     * Sets the value of the cx2CxaMailingLabelHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx2CxaMailingLabelHtml(JAXBElement<String> value) {
        this.cx2CxaMailingLabelHtml = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx2CxaOnHoldFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx2CxaOnHoldFrom() {
        return cx2CxaOnHoldFrom;
    }

    /**
     * Sets the value of the cx2CxaOnHoldFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx2CxaOnHoldFrom(JAXBElement<String> value) {
        this.cx2CxaOnHoldFrom = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cx2CxaOnHoldThrough property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCx2CxaOnHoldThrough() {
        return cx2CxaOnHoldThrough;
    }

    /**
     * Sets the value of the cx2CxaOnHoldThrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCx2CxaOnHoldThrough(JAXBElement<String> value) {
        this.cx2CxaOnHoldThrough = ((JAXBElement<String> ) value);
    }

}
