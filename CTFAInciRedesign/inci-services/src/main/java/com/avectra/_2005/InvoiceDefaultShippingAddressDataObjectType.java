
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Invoice_Default_Shipping_Address_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Invoice_Default_Shipping_Address_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cxs__cxa_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cxs__cxa_adr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cxs__cxa_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cxs__cxa_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cxs__cxa_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cxs__cxa_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cxs__cxa_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cxs__cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cxs__cxa_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cxs__cxa_on_hold_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cxs__cxa_adh_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cxs__cxa_adt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cxs__cxa_seasonal_from_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cxs__cxa_mailing_label" type="{http://www.avectra.com/2005/}stringLength450_Type" minOccurs="0"/>
 *         &lt;element name="cxs__cxa_seasonal_through_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cxs__cxa_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cxs__cxa_mail_stop" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cxs__cxa_mailing_label_html" type="{http://www.avectra.com/2005/}stringLength450_Type" minOccurs="0"/>
 *         &lt;element name="cxs__cxa_on_hold_from" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cxs__cxa_on_hold_through" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Invoice_Default_Shipping_Address_DataObjectType", propOrder = {
    "cxsCxaCstKey",
    "cxsCxaAdrKey",
    "cxsCxaAddDate",
    "cxsCxaAddUser",
    "cxsCxaChangeDate",
    "cxsCxaChangeUser",
    "cxsCxaDeleteFlag",
    "cxsCxaKey",
    "cxsCxaKeyExt",
    "cxsCxaOnHoldFlag",
    "cxsCxaAdhKey",
    "cxsCxaAdtKey",
    "cxsCxaSeasonalFromDate",
    "cxsCxaMailingLabel",
    "cxsCxaSeasonalThroughDate",
    "cxsCxaEntityKey",
    "cxsCxaMailStop",
    "cxsCxaMailingLabelHtml",
    "cxsCxaOnHoldFrom",
    "cxsCxaOnHoldThrough"
})
public class InvoiceDefaultShippingAddressDataObjectType {

    @XmlElementRef(name = "cxs__cxa_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxsCxaCstKey;
    @XmlElementRef(name = "cxs__cxa_adr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxsCxaAdrKey;
    @XmlElementRef(name = "cxs__cxa_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxsCxaAddDate;
    @XmlElementRef(name = "cxs__cxa_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxsCxaAddUser;
    @XmlElementRef(name = "cxs__cxa_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxsCxaChangeDate;
    @XmlElementRef(name = "cxs__cxa_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxsCxaChangeUser;
    @XmlElementRef(name = "cxs__cxa_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cxsCxaDeleteFlag;
    @XmlElementRef(name = "cxs__cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxsCxaKey;
    @XmlElementRef(name = "cxs__cxa_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxsCxaKeyExt;
    @XmlElementRef(name = "cxs__cxa_on_hold_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cxsCxaOnHoldFlag;
    @XmlElementRef(name = "cxs__cxa_adh_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxsCxaAdhKey;
    @XmlElementRef(name = "cxs__cxa_adt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxsCxaAdtKey;
    @XmlElementRef(name = "cxs__cxa_seasonal_from_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxsCxaSeasonalFromDate;
    @XmlElementRef(name = "cxs__cxa_mailing_label", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxsCxaMailingLabel;
    @XmlElementRef(name = "cxs__cxa_seasonal_through_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxsCxaSeasonalThroughDate;
    @XmlElementRef(name = "cxs__cxa_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxsCxaEntityKey;
    @XmlElementRef(name = "cxs__cxa_mail_stop", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxsCxaMailStop;
    @XmlElementRef(name = "cxs__cxa_mailing_label_html", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxsCxaMailingLabelHtml;
    @XmlElementRef(name = "cxs__cxa_on_hold_from", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxsCxaOnHoldFrom;
    @XmlElementRef(name = "cxs__cxa_on_hold_through", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxsCxaOnHoldThrough;

    /**
     * Gets the value of the cxsCxaCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxsCxaCstKey() {
        return cxsCxaCstKey;
    }

    /**
     * Sets the value of the cxsCxaCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxsCxaCstKey(JAXBElement<String> value) {
        this.cxsCxaCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxsCxaAdrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxsCxaAdrKey() {
        return cxsCxaAdrKey;
    }

    /**
     * Sets the value of the cxsCxaAdrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxsCxaAdrKey(JAXBElement<String> value) {
        this.cxsCxaAdrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxsCxaAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxsCxaAddDate() {
        return cxsCxaAddDate;
    }

    /**
     * Sets the value of the cxsCxaAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxsCxaAddDate(JAXBElement<String> value) {
        this.cxsCxaAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxsCxaAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxsCxaAddUser() {
        return cxsCxaAddUser;
    }

    /**
     * Sets the value of the cxsCxaAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxsCxaAddUser(JAXBElement<String> value) {
        this.cxsCxaAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxsCxaChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxsCxaChangeDate() {
        return cxsCxaChangeDate;
    }

    /**
     * Sets the value of the cxsCxaChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxsCxaChangeDate(JAXBElement<String> value) {
        this.cxsCxaChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxsCxaChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxsCxaChangeUser() {
        return cxsCxaChangeUser;
    }

    /**
     * Sets the value of the cxsCxaChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxsCxaChangeUser(JAXBElement<String> value) {
        this.cxsCxaChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxsCxaDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCxsCxaDeleteFlag() {
        return cxsCxaDeleteFlag;
    }

    /**
     * Sets the value of the cxsCxaDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCxsCxaDeleteFlag(JAXBElement<Short> value) {
        this.cxsCxaDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cxsCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxsCxaKey() {
        return cxsCxaKey;
    }

    /**
     * Sets the value of the cxsCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxsCxaKey(JAXBElement<String> value) {
        this.cxsCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxsCxaKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxsCxaKeyExt() {
        return cxsCxaKeyExt;
    }

    /**
     * Sets the value of the cxsCxaKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxsCxaKeyExt(JAXBElement<String> value) {
        this.cxsCxaKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxsCxaOnHoldFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCxsCxaOnHoldFlag() {
        return cxsCxaOnHoldFlag;
    }

    /**
     * Sets the value of the cxsCxaOnHoldFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCxsCxaOnHoldFlag(JAXBElement<Short> value) {
        this.cxsCxaOnHoldFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cxsCxaAdhKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxsCxaAdhKey() {
        return cxsCxaAdhKey;
    }

    /**
     * Sets the value of the cxsCxaAdhKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxsCxaAdhKey(JAXBElement<String> value) {
        this.cxsCxaAdhKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxsCxaAdtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxsCxaAdtKey() {
        return cxsCxaAdtKey;
    }

    /**
     * Sets the value of the cxsCxaAdtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxsCxaAdtKey(JAXBElement<String> value) {
        this.cxsCxaAdtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxsCxaSeasonalFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxsCxaSeasonalFromDate() {
        return cxsCxaSeasonalFromDate;
    }

    /**
     * Sets the value of the cxsCxaSeasonalFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxsCxaSeasonalFromDate(JAXBElement<String> value) {
        this.cxsCxaSeasonalFromDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxsCxaMailingLabel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxsCxaMailingLabel() {
        return cxsCxaMailingLabel;
    }

    /**
     * Sets the value of the cxsCxaMailingLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxsCxaMailingLabel(JAXBElement<String> value) {
        this.cxsCxaMailingLabel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxsCxaSeasonalThroughDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxsCxaSeasonalThroughDate() {
        return cxsCxaSeasonalThroughDate;
    }

    /**
     * Sets the value of the cxsCxaSeasonalThroughDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxsCxaSeasonalThroughDate(JAXBElement<String> value) {
        this.cxsCxaSeasonalThroughDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxsCxaEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxsCxaEntityKey() {
        return cxsCxaEntityKey;
    }

    /**
     * Sets the value of the cxsCxaEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxsCxaEntityKey(JAXBElement<String> value) {
        this.cxsCxaEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxsCxaMailStop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxsCxaMailStop() {
        return cxsCxaMailStop;
    }

    /**
     * Sets the value of the cxsCxaMailStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxsCxaMailStop(JAXBElement<String> value) {
        this.cxsCxaMailStop = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxsCxaMailingLabelHtml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxsCxaMailingLabelHtml() {
        return cxsCxaMailingLabelHtml;
    }

    /**
     * Sets the value of the cxsCxaMailingLabelHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxsCxaMailingLabelHtml(JAXBElement<String> value) {
        this.cxsCxaMailingLabelHtml = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxsCxaOnHoldFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxsCxaOnHoldFrom() {
        return cxsCxaOnHoldFrom;
    }

    /**
     * Sets the value of the cxsCxaOnHoldFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxsCxaOnHoldFrom(JAXBElement<String> value) {
        this.cxsCxaOnHoldFrom = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxsCxaOnHoldThrough property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxsCxaOnHoldThrough() {
        return cxsCxaOnHoldThrough;
    }

    /**
     * Sets the value of the cxsCxaOnHoldThrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxsCxaOnHoldThrough(JAXBElement<String> value) {
        this.cxsCxaOnHoldThrough = ((JAXBElement<String> ) value);
    }

}
