
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Chapter_Prim._Contact_Adr_Xref_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Chapter_Prim._Contact_Adr_Xref_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pxa__cxa_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pxa__cxa_adr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pxa__cxa_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="pxa__cxa_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="pxa__cxa_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="pxa__cxa_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="pxa__cxa_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="pxa__cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pxa__cxa_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pxa__cxa_on_hold_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="pxa__cxa_adh_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pxa__cxa_adt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pxa__cxa_seasonal_from_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="pxa__cxa_mailing_label" type="{http://www.avectra.com/2005/}stringLength450_Type" minOccurs="0"/>
 *         &lt;element name="pxa__cxa_seasonal_through_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="pxa__cxa_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pxa__cxa_mail_stop" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="pxa__cxa_mailing_label_html" type="{http://www.avectra.com/2005/}stringLength450_Type" minOccurs="0"/>
 *         &lt;element name="pxa__cxa_on_hold_from" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="pxa__cxa_on_hold_through" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Chapter_Prim._Contact_Adr_Xref_DataObjectType", propOrder = {
    "pxaCxaCstKey",
    "pxaCxaAdrKey",
    "pxaCxaAddDate",
    "pxaCxaAddUser",
    "pxaCxaChangeDate",
    "pxaCxaChangeUser",
    "pxaCxaDeleteFlag",
    "pxaCxaKey",
    "pxaCxaKeyExt",
    "pxaCxaOnHoldFlag",
    "pxaCxaAdhKey",
    "pxaCxaAdtKey",
    "pxaCxaSeasonalFromDate",
    "pxaCxaMailingLabel",
    "pxaCxaSeasonalThroughDate",
    "pxaCxaEntityKey",
    "pxaCxaMailStop",
    "pxaCxaMailingLabelHtml",
    "pxaCxaOnHoldFrom",
    "pxaCxaOnHoldThrough"
})
public class ChapterPrimContactAdrXrefDataObjectType {

    @XmlElementRef(name = "pxa__cxa_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pxaCxaCstKey;
    @XmlElementRef(name = "pxa__cxa_adr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pxaCxaAdrKey;
    @XmlElementRef(name = "pxa__cxa_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pxaCxaAddDate;
    @XmlElementRef(name = "pxa__cxa_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pxaCxaAddUser;
    @XmlElementRef(name = "pxa__cxa_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pxaCxaChangeDate;
    @XmlElementRef(name = "pxa__cxa_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pxaCxaChangeUser;
    @XmlElementRef(name = "pxa__cxa_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> pxaCxaDeleteFlag;
    @XmlElementRef(name = "pxa__cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pxaCxaKey;
    @XmlElementRef(name = "pxa__cxa_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pxaCxaKeyExt;
    @XmlElementRef(name = "pxa__cxa_on_hold_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> pxaCxaOnHoldFlag;
    @XmlElementRef(name = "pxa__cxa_adh_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pxaCxaAdhKey;
    @XmlElementRef(name = "pxa__cxa_adt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pxaCxaAdtKey;
    @XmlElementRef(name = "pxa__cxa_seasonal_from_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pxaCxaSeasonalFromDate;
    @XmlElementRef(name = "pxa__cxa_mailing_label", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pxaCxaMailingLabel;
    @XmlElementRef(name = "pxa__cxa_seasonal_through_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pxaCxaSeasonalThroughDate;
    @XmlElementRef(name = "pxa__cxa_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pxaCxaEntityKey;
    @XmlElementRef(name = "pxa__cxa_mail_stop", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pxaCxaMailStop;
    @XmlElementRef(name = "pxa__cxa_mailing_label_html", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pxaCxaMailingLabelHtml;
    @XmlElementRef(name = "pxa__cxa_on_hold_from", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pxaCxaOnHoldFrom;
    @XmlElementRef(name = "pxa__cxa_on_hold_through", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pxaCxaOnHoldThrough;

    /**
     * Gets the value of the pxaCxaCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPxaCxaCstKey() {
        return pxaCxaCstKey;
    }

    /**
     * Sets the value of the pxaCxaCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPxaCxaCstKey(JAXBElement<String> value) {
        this.pxaCxaCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pxaCxaAdrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPxaCxaAdrKey() {
        return pxaCxaAdrKey;
    }

    /**
     * Sets the value of the pxaCxaAdrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPxaCxaAdrKey(JAXBElement<String> value) {
        this.pxaCxaAdrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pxaCxaAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPxaCxaAddDate() {
        return pxaCxaAddDate;
    }

    /**
     * Sets the value of the pxaCxaAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPxaCxaAddDate(JAXBElement<String> value) {
        this.pxaCxaAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pxaCxaAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPxaCxaAddUser() {
        return pxaCxaAddUser;
    }

    /**
     * Sets the value of the pxaCxaAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPxaCxaAddUser(JAXBElement<String> value) {
        this.pxaCxaAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pxaCxaChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPxaCxaChangeDate() {
        return pxaCxaChangeDate;
    }

    /**
     * Sets the value of the pxaCxaChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPxaCxaChangeDate(JAXBElement<String> value) {
        this.pxaCxaChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pxaCxaChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPxaCxaChangeUser() {
        return pxaCxaChangeUser;
    }

    /**
     * Sets the value of the pxaCxaChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPxaCxaChangeUser(JAXBElement<String> value) {
        this.pxaCxaChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pxaCxaDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPxaCxaDeleteFlag() {
        return pxaCxaDeleteFlag;
    }

    /**
     * Sets the value of the pxaCxaDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPxaCxaDeleteFlag(JAXBElement<Short> value) {
        this.pxaCxaDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the pxaCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPxaCxaKey() {
        return pxaCxaKey;
    }

    /**
     * Sets the value of the pxaCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPxaCxaKey(JAXBElement<String> value) {
        this.pxaCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pxaCxaKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPxaCxaKeyExt() {
        return pxaCxaKeyExt;
    }

    /**
     * Sets the value of the pxaCxaKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPxaCxaKeyExt(JAXBElement<String> value) {
        this.pxaCxaKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pxaCxaOnHoldFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPxaCxaOnHoldFlag() {
        return pxaCxaOnHoldFlag;
    }

    /**
     * Sets the value of the pxaCxaOnHoldFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPxaCxaOnHoldFlag(JAXBElement<Short> value) {
        this.pxaCxaOnHoldFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the pxaCxaAdhKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPxaCxaAdhKey() {
        return pxaCxaAdhKey;
    }

    /**
     * Sets the value of the pxaCxaAdhKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPxaCxaAdhKey(JAXBElement<String> value) {
        this.pxaCxaAdhKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pxaCxaAdtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPxaCxaAdtKey() {
        return pxaCxaAdtKey;
    }

    /**
     * Sets the value of the pxaCxaAdtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPxaCxaAdtKey(JAXBElement<String> value) {
        this.pxaCxaAdtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pxaCxaSeasonalFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPxaCxaSeasonalFromDate() {
        return pxaCxaSeasonalFromDate;
    }

    /**
     * Sets the value of the pxaCxaSeasonalFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPxaCxaSeasonalFromDate(JAXBElement<String> value) {
        this.pxaCxaSeasonalFromDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pxaCxaMailingLabel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPxaCxaMailingLabel() {
        return pxaCxaMailingLabel;
    }

    /**
     * Sets the value of the pxaCxaMailingLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPxaCxaMailingLabel(JAXBElement<String> value) {
        this.pxaCxaMailingLabel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pxaCxaSeasonalThroughDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPxaCxaSeasonalThroughDate() {
        return pxaCxaSeasonalThroughDate;
    }

    /**
     * Sets the value of the pxaCxaSeasonalThroughDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPxaCxaSeasonalThroughDate(JAXBElement<String> value) {
        this.pxaCxaSeasonalThroughDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pxaCxaEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPxaCxaEntityKey() {
        return pxaCxaEntityKey;
    }

    /**
     * Sets the value of the pxaCxaEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPxaCxaEntityKey(JAXBElement<String> value) {
        this.pxaCxaEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pxaCxaMailStop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPxaCxaMailStop() {
        return pxaCxaMailStop;
    }

    /**
     * Sets the value of the pxaCxaMailStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPxaCxaMailStop(JAXBElement<String> value) {
        this.pxaCxaMailStop = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pxaCxaMailingLabelHtml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPxaCxaMailingLabelHtml() {
        return pxaCxaMailingLabelHtml;
    }

    /**
     * Sets the value of the pxaCxaMailingLabelHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPxaCxaMailingLabelHtml(JAXBElement<String> value) {
        this.pxaCxaMailingLabelHtml = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pxaCxaOnHoldFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPxaCxaOnHoldFrom() {
        return pxaCxaOnHoldFrom;
    }

    /**
     * Sets the value of the pxaCxaOnHoldFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPxaCxaOnHoldFrom(JAXBElement<String> value) {
        this.pxaCxaOnHoldFrom = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pxaCxaOnHoldThrough property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPxaCxaOnHoldThrough() {
        return pxaCxaOnHoldThrough;
    }

    /**
     * Sets the value of the pxaCxaOnHoldThrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPxaCxaOnHoldThrough(JAXBElement<String> value) {
        this.pxaCxaOnHoldThrough = ((JAXBElement<String> ) value);
    }

}
