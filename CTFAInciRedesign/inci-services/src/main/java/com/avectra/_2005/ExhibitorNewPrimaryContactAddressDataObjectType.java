
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExhibitorNew_Primary_Contact_Address_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExhibitorNew_Primary_Contact_Address_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cad__cxa_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cad__cxa_adr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cad__cxa_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cad__cxa_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cad__cxa_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cad__cxa_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cad__cxa_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cad__cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cad__cxa_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cad__cxa_on_hold_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cad__cxa_adh_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cad__cxa_adt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cad__cxa_seasonal_from_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cad__cxa_mailing_label" type="{http://www.avectra.com/2005/}stringLength450_Type" minOccurs="0"/>
 *         &lt;element name="cad__cxa_seasonal_through_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cad__cxa_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cad__cxa_mail_stop" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cad__cxa_mailing_label_html" type="{http://www.avectra.com/2005/}stringLength450_Type" minOccurs="0"/>
 *         &lt;element name="cad__cxa_on_hold_from" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cad__cxa_on_hold_through" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExhibitorNew_Primary_Contact_Address_DataObjectType", propOrder = {
    "cadCxaCstKey",
    "cadCxaAdrKey",
    "cadCxaAddDate",
    "cadCxaAddUser",
    "cadCxaChangeDate",
    "cadCxaChangeUser",
    "cadCxaDeleteFlag",
    "cadCxaKey",
    "cadCxaKeyExt",
    "cadCxaOnHoldFlag",
    "cadCxaAdhKey",
    "cadCxaAdtKey",
    "cadCxaSeasonalFromDate",
    "cadCxaMailingLabel",
    "cadCxaSeasonalThroughDate",
    "cadCxaEntityKey",
    "cadCxaMailStop",
    "cadCxaMailingLabelHtml",
    "cadCxaOnHoldFrom",
    "cadCxaOnHoldThrough"
})
public class ExhibitorNewPrimaryContactAddressDataObjectType {

    @XmlElementRef(name = "cad__cxa_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cadCxaCstKey;
    @XmlElementRef(name = "cad__cxa_adr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cadCxaAdrKey;
    @XmlElementRef(name = "cad__cxa_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cadCxaAddDate;
    @XmlElementRef(name = "cad__cxa_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cadCxaAddUser;
    @XmlElementRef(name = "cad__cxa_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cadCxaChangeDate;
    @XmlElementRef(name = "cad__cxa_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cadCxaChangeUser;
    @XmlElementRef(name = "cad__cxa_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cadCxaDeleteFlag;
    @XmlElementRef(name = "cad__cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cadCxaKey;
    @XmlElementRef(name = "cad__cxa_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cadCxaKeyExt;
    @XmlElementRef(name = "cad__cxa_on_hold_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cadCxaOnHoldFlag;
    @XmlElementRef(name = "cad__cxa_adh_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cadCxaAdhKey;
    @XmlElementRef(name = "cad__cxa_adt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cadCxaAdtKey;
    @XmlElementRef(name = "cad__cxa_seasonal_from_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cadCxaSeasonalFromDate;
    @XmlElementRef(name = "cad__cxa_mailing_label", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cadCxaMailingLabel;
    @XmlElementRef(name = "cad__cxa_seasonal_through_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cadCxaSeasonalThroughDate;
    @XmlElementRef(name = "cad__cxa_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cadCxaEntityKey;
    @XmlElementRef(name = "cad__cxa_mail_stop", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cadCxaMailStop;
    @XmlElementRef(name = "cad__cxa_mailing_label_html", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cadCxaMailingLabelHtml;
    @XmlElementRef(name = "cad__cxa_on_hold_from", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cadCxaOnHoldFrom;
    @XmlElementRef(name = "cad__cxa_on_hold_through", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cadCxaOnHoldThrough;

    /**
     * Gets the value of the cadCxaCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCadCxaCstKey() {
        return cadCxaCstKey;
    }

    /**
     * Sets the value of the cadCxaCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCadCxaCstKey(JAXBElement<String> value) {
        this.cadCxaCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cadCxaAdrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCadCxaAdrKey() {
        return cadCxaAdrKey;
    }

    /**
     * Sets the value of the cadCxaAdrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCadCxaAdrKey(JAXBElement<String> value) {
        this.cadCxaAdrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cadCxaAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCadCxaAddDate() {
        return cadCxaAddDate;
    }

    /**
     * Sets the value of the cadCxaAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCadCxaAddDate(JAXBElement<String> value) {
        this.cadCxaAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cadCxaAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCadCxaAddUser() {
        return cadCxaAddUser;
    }

    /**
     * Sets the value of the cadCxaAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCadCxaAddUser(JAXBElement<String> value) {
        this.cadCxaAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cadCxaChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCadCxaChangeDate() {
        return cadCxaChangeDate;
    }

    /**
     * Sets the value of the cadCxaChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCadCxaChangeDate(JAXBElement<String> value) {
        this.cadCxaChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cadCxaChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCadCxaChangeUser() {
        return cadCxaChangeUser;
    }

    /**
     * Sets the value of the cadCxaChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCadCxaChangeUser(JAXBElement<String> value) {
        this.cadCxaChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cadCxaDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCadCxaDeleteFlag() {
        return cadCxaDeleteFlag;
    }

    /**
     * Sets the value of the cadCxaDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCadCxaDeleteFlag(JAXBElement<Short> value) {
        this.cadCxaDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cadCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCadCxaKey() {
        return cadCxaKey;
    }

    /**
     * Sets the value of the cadCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCadCxaKey(JAXBElement<String> value) {
        this.cadCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cadCxaKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCadCxaKeyExt() {
        return cadCxaKeyExt;
    }

    /**
     * Sets the value of the cadCxaKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCadCxaKeyExt(JAXBElement<String> value) {
        this.cadCxaKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cadCxaOnHoldFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCadCxaOnHoldFlag() {
        return cadCxaOnHoldFlag;
    }

    /**
     * Sets the value of the cadCxaOnHoldFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCadCxaOnHoldFlag(JAXBElement<Short> value) {
        this.cadCxaOnHoldFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cadCxaAdhKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCadCxaAdhKey() {
        return cadCxaAdhKey;
    }

    /**
     * Sets the value of the cadCxaAdhKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCadCxaAdhKey(JAXBElement<String> value) {
        this.cadCxaAdhKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cadCxaAdtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCadCxaAdtKey() {
        return cadCxaAdtKey;
    }

    /**
     * Sets the value of the cadCxaAdtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCadCxaAdtKey(JAXBElement<String> value) {
        this.cadCxaAdtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cadCxaSeasonalFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCadCxaSeasonalFromDate() {
        return cadCxaSeasonalFromDate;
    }

    /**
     * Sets the value of the cadCxaSeasonalFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCadCxaSeasonalFromDate(JAXBElement<String> value) {
        this.cadCxaSeasonalFromDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cadCxaMailingLabel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCadCxaMailingLabel() {
        return cadCxaMailingLabel;
    }

    /**
     * Sets the value of the cadCxaMailingLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCadCxaMailingLabel(JAXBElement<String> value) {
        this.cadCxaMailingLabel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cadCxaSeasonalThroughDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCadCxaSeasonalThroughDate() {
        return cadCxaSeasonalThroughDate;
    }

    /**
     * Sets the value of the cadCxaSeasonalThroughDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCadCxaSeasonalThroughDate(JAXBElement<String> value) {
        this.cadCxaSeasonalThroughDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cadCxaEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCadCxaEntityKey() {
        return cadCxaEntityKey;
    }

    /**
     * Sets the value of the cadCxaEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCadCxaEntityKey(JAXBElement<String> value) {
        this.cadCxaEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cadCxaMailStop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCadCxaMailStop() {
        return cadCxaMailStop;
    }

    /**
     * Sets the value of the cadCxaMailStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCadCxaMailStop(JAXBElement<String> value) {
        this.cadCxaMailStop = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cadCxaMailingLabelHtml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCadCxaMailingLabelHtml() {
        return cadCxaMailingLabelHtml;
    }

    /**
     * Sets the value of the cadCxaMailingLabelHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCadCxaMailingLabelHtml(JAXBElement<String> value) {
        this.cadCxaMailingLabelHtml = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cadCxaOnHoldFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCadCxaOnHoldFrom() {
        return cadCxaOnHoldFrom;
    }

    /**
     * Sets the value of the cadCxaOnHoldFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCadCxaOnHoldFrom(JAXBElement<String> value) {
        this.cadCxaOnHoldFrom = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cadCxaOnHoldThrough property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCadCxaOnHoldThrough() {
        return cadCxaOnHoldThrough;
    }

    /**
     * Sets the value of the cadCxaOnHoldThrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCadCxaOnHoldThrough(JAXBElement<String> value) {
        this.cadCxaOnHoldThrough = ((JAXBElement<String> ) value);
    }

}
