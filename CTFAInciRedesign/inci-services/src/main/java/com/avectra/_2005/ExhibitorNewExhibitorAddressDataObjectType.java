
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExhibitorNew_Exhibitor_Address_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExhibitorNew_Exhibitor_Address_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ead__cxa_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ead__cxa_adr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ead__cxa_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ead__cxa_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ead__cxa_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ead__cxa_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ead__cxa_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ead__cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ead__cxa_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ead__cxa_on_hold_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ead__cxa_adh_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ead__cxa_adt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ead__cxa_seasonal_from_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ead__cxa_mailing_label" type="{http://www.avectra.com/2005/}stringLength450_Type" minOccurs="0"/>
 *         &lt;element name="ead__cxa_seasonal_through_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ead__cxa_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ead__cxa_mail_stop" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ead__cxa_mailing_label_html" type="{http://www.avectra.com/2005/}stringLength450_Type" minOccurs="0"/>
 *         &lt;element name="ead__cxa_on_hold_from" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ead__cxa_on_hold_through" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExhibitorNew_Exhibitor_Address_DataObjectType", propOrder = {
    "eadCxaCstKey",
    "eadCxaAdrKey",
    "eadCxaAddDate",
    "eadCxaAddUser",
    "eadCxaChangeDate",
    "eadCxaChangeUser",
    "eadCxaDeleteFlag",
    "eadCxaKey",
    "eadCxaKeyExt",
    "eadCxaOnHoldFlag",
    "eadCxaAdhKey",
    "eadCxaAdtKey",
    "eadCxaSeasonalFromDate",
    "eadCxaMailingLabel",
    "eadCxaSeasonalThroughDate",
    "eadCxaEntityKey",
    "eadCxaMailStop",
    "eadCxaMailingLabelHtml",
    "eadCxaOnHoldFrom",
    "eadCxaOnHoldThrough"
})
public class ExhibitorNewExhibitorAddressDataObjectType {

    @XmlElementRef(name = "ead__cxa_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> eadCxaCstKey;
    @XmlElementRef(name = "ead__cxa_adr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> eadCxaAdrKey;
    @XmlElementRef(name = "ead__cxa_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> eadCxaAddDate;
    @XmlElementRef(name = "ead__cxa_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> eadCxaAddUser;
    @XmlElementRef(name = "ead__cxa_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> eadCxaChangeDate;
    @XmlElementRef(name = "ead__cxa_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> eadCxaChangeUser;
    @XmlElementRef(name = "ead__cxa_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> eadCxaDeleteFlag;
    @XmlElementRef(name = "ead__cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> eadCxaKey;
    @XmlElementRef(name = "ead__cxa_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> eadCxaKeyExt;
    @XmlElementRef(name = "ead__cxa_on_hold_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> eadCxaOnHoldFlag;
    @XmlElementRef(name = "ead__cxa_adh_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> eadCxaAdhKey;
    @XmlElementRef(name = "ead__cxa_adt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> eadCxaAdtKey;
    @XmlElementRef(name = "ead__cxa_seasonal_from_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> eadCxaSeasonalFromDate;
    @XmlElementRef(name = "ead__cxa_mailing_label", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> eadCxaMailingLabel;
    @XmlElementRef(name = "ead__cxa_seasonal_through_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> eadCxaSeasonalThroughDate;
    @XmlElementRef(name = "ead__cxa_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> eadCxaEntityKey;
    @XmlElementRef(name = "ead__cxa_mail_stop", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> eadCxaMailStop;
    @XmlElementRef(name = "ead__cxa_mailing_label_html", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> eadCxaMailingLabelHtml;
    @XmlElementRef(name = "ead__cxa_on_hold_from", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> eadCxaOnHoldFrom;
    @XmlElementRef(name = "ead__cxa_on_hold_through", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> eadCxaOnHoldThrough;

    /**
     * Gets the value of the eadCxaCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEadCxaCstKey() {
        return eadCxaCstKey;
    }

    /**
     * Sets the value of the eadCxaCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEadCxaCstKey(JAXBElement<String> value) {
        this.eadCxaCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the eadCxaAdrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEadCxaAdrKey() {
        return eadCxaAdrKey;
    }

    /**
     * Sets the value of the eadCxaAdrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEadCxaAdrKey(JAXBElement<String> value) {
        this.eadCxaAdrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the eadCxaAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEadCxaAddDate() {
        return eadCxaAddDate;
    }

    /**
     * Sets the value of the eadCxaAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEadCxaAddDate(JAXBElement<String> value) {
        this.eadCxaAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the eadCxaAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEadCxaAddUser() {
        return eadCxaAddUser;
    }

    /**
     * Sets the value of the eadCxaAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEadCxaAddUser(JAXBElement<String> value) {
        this.eadCxaAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the eadCxaChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEadCxaChangeDate() {
        return eadCxaChangeDate;
    }

    /**
     * Sets the value of the eadCxaChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEadCxaChangeDate(JAXBElement<String> value) {
        this.eadCxaChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the eadCxaChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEadCxaChangeUser() {
        return eadCxaChangeUser;
    }

    /**
     * Sets the value of the eadCxaChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEadCxaChangeUser(JAXBElement<String> value) {
        this.eadCxaChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the eadCxaDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEadCxaDeleteFlag() {
        return eadCxaDeleteFlag;
    }

    /**
     * Sets the value of the eadCxaDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEadCxaDeleteFlag(JAXBElement<Short> value) {
        this.eadCxaDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the eadCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEadCxaKey() {
        return eadCxaKey;
    }

    /**
     * Sets the value of the eadCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEadCxaKey(JAXBElement<String> value) {
        this.eadCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the eadCxaKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEadCxaKeyExt() {
        return eadCxaKeyExt;
    }

    /**
     * Sets the value of the eadCxaKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEadCxaKeyExt(JAXBElement<String> value) {
        this.eadCxaKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the eadCxaOnHoldFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEadCxaOnHoldFlag() {
        return eadCxaOnHoldFlag;
    }

    /**
     * Sets the value of the eadCxaOnHoldFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEadCxaOnHoldFlag(JAXBElement<Short> value) {
        this.eadCxaOnHoldFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the eadCxaAdhKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEadCxaAdhKey() {
        return eadCxaAdhKey;
    }

    /**
     * Sets the value of the eadCxaAdhKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEadCxaAdhKey(JAXBElement<String> value) {
        this.eadCxaAdhKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the eadCxaAdtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEadCxaAdtKey() {
        return eadCxaAdtKey;
    }

    /**
     * Sets the value of the eadCxaAdtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEadCxaAdtKey(JAXBElement<String> value) {
        this.eadCxaAdtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the eadCxaSeasonalFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEadCxaSeasonalFromDate() {
        return eadCxaSeasonalFromDate;
    }

    /**
     * Sets the value of the eadCxaSeasonalFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEadCxaSeasonalFromDate(JAXBElement<String> value) {
        this.eadCxaSeasonalFromDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the eadCxaMailingLabel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEadCxaMailingLabel() {
        return eadCxaMailingLabel;
    }

    /**
     * Sets the value of the eadCxaMailingLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEadCxaMailingLabel(JAXBElement<String> value) {
        this.eadCxaMailingLabel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the eadCxaSeasonalThroughDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEadCxaSeasonalThroughDate() {
        return eadCxaSeasonalThroughDate;
    }

    /**
     * Sets the value of the eadCxaSeasonalThroughDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEadCxaSeasonalThroughDate(JAXBElement<String> value) {
        this.eadCxaSeasonalThroughDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the eadCxaEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEadCxaEntityKey() {
        return eadCxaEntityKey;
    }

    /**
     * Sets the value of the eadCxaEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEadCxaEntityKey(JAXBElement<String> value) {
        this.eadCxaEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the eadCxaMailStop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEadCxaMailStop() {
        return eadCxaMailStop;
    }

    /**
     * Sets the value of the eadCxaMailStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEadCxaMailStop(JAXBElement<String> value) {
        this.eadCxaMailStop = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the eadCxaMailingLabelHtml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEadCxaMailingLabelHtml() {
        return eadCxaMailingLabelHtml;
    }

    /**
     * Sets the value of the eadCxaMailingLabelHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEadCxaMailingLabelHtml(JAXBElement<String> value) {
        this.eadCxaMailingLabelHtml = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the eadCxaOnHoldFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEadCxaOnHoldFrom() {
        return eadCxaOnHoldFrom;
    }

    /**
     * Sets the value of the eadCxaOnHoldFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEadCxaOnHoldFrom(JAXBElement<String> value) {
        this.eadCxaOnHoldFrom = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the eadCxaOnHoldThrough property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEadCxaOnHoldThrough() {
        return eadCxaOnHoldThrough;
    }

    /**
     * Sets the value of the eadCxaOnHoldThrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEadCxaOnHoldThrough(JAXBElement<String> value) {
        this.eadCxaOnHoldThrough = ((JAXBElement<String> ) value);
    }

}
