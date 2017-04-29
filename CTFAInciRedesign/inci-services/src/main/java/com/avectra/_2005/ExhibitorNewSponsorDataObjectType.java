
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExhibitorNew_Sponsor_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExhibitorNew_Sponsor_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spo_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="spo_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="spo_snt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="spo_ind_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="spo_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="spo_cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="spo_cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="spo_eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="spo_url_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="spo_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="spo_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="spo_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="spo_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="spo_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="spo_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="spo_evt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="spo_ses_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="spo_trk_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="spo_fac_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="spo_notes" type="{http://www.avectra.com/2005/}stringLength300_Type" minOccurs="0"/>
 *         &lt;element name="spo_inv_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="spo_logo_doc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="spo_ivd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="spo_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="spo_exb_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="spo_cancel_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="spo_ord_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="spo_odd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExhibitorNew_Sponsor_DataObjectType", propOrder = {
    "spoKey",
    "spoCstKey",
    "spoSntKey",
    "spoIndCstKey",
    "spoCxaKey",
    "spoCphKey",
    "spoCfxKey",
    "spoEmlKey",
    "spoUrlKey",
    "spoAddUser",
    "spoAddDate",
    "spoChangeUser",
    "spoChangeDate",
    "spoDeleteFlag",
    "spoKeyExt",
    "spoEvtKey",
    "spoSesKey",
    "spoTrkKey",
    "spoFacKey",
    "spoNotes",
    "spoInvCode",
    "spoLogoDocKey",
    "spoIvdKey",
    "spoEntityKey",
    "spoExbKey",
    "spoCancelDate",
    "spoOrdCode",
    "spoOddKey"
})
public class ExhibitorNewSponsorDataObjectType {

    @XmlElementRef(name = "spo_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoKey;
    @XmlElementRef(name = "spo_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoCstKey;
    @XmlElementRef(name = "spo_snt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoSntKey;
    @XmlElementRef(name = "spo_ind_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoIndCstKey;
    @XmlElementRef(name = "spo_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoCxaKey;
    @XmlElementRef(name = "spo_cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoCphKey;
    @XmlElementRef(name = "spo_cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoCfxKey;
    @XmlElementRef(name = "spo_eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoEmlKey;
    @XmlElementRef(name = "spo_url_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoUrlKey;
    @XmlElementRef(name = "spo_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoAddUser;
    @XmlElementRef(name = "spo_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoAddDate;
    @XmlElementRef(name = "spo_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoChangeUser;
    @XmlElementRef(name = "spo_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoChangeDate;
    @XmlElementRef(name = "spo_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> spoDeleteFlag;
    @XmlElementRef(name = "spo_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoKeyExt;
    @XmlElementRef(name = "spo_evt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoEvtKey;
    @XmlElementRef(name = "spo_ses_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoSesKey;
    @XmlElementRef(name = "spo_trk_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoTrkKey;
    @XmlElementRef(name = "spo_fac_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoFacKey;
    @XmlElementRef(name = "spo_notes", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoNotes;
    @XmlElementRef(name = "spo_inv_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoInvCode;
    @XmlElementRef(name = "spo_logo_doc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoLogoDocKey;
    @XmlElementRef(name = "spo_ivd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoIvdKey;
    @XmlElementRef(name = "spo_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoEntityKey;
    @XmlElementRef(name = "spo_exb_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoExbKey;
    @XmlElementRef(name = "spo_cancel_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoCancelDate;
    @XmlElementRef(name = "spo_ord_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoOrdCode;
    @XmlElementRef(name = "spo_odd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> spoOddKey;

    /**
     * Gets the value of the spoKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoKey() {
        return spoKey;
    }

    /**
     * Sets the value of the spoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoKey(JAXBElement<String> value) {
        this.spoKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoCstKey() {
        return spoCstKey;
    }

    /**
     * Sets the value of the spoCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoCstKey(JAXBElement<String> value) {
        this.spoCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoSntKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoSntKey() {
        return spoSntKey;
    }

    /**
     * Sets the value of the spoSntKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoSntKey(JAXBElement<String> value) {
        this.spoSntKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoIndCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoIndCstKey() {
        return spoIndCstKey;
    }

    /**
     * Sets the value of the spoIndCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoIndCstKey(JAXBElement<String> value) {
        this.spoIndCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoCxaKey() {
        return spoCxaKey;
    }

    /**
     * Sets the value of the spoCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoCxaKey(JAXBElement<String> value) {
        this.spoCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoCphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoCphKey() {
        return spoCphKey;
    }

    /**
     * Sets the value of the spoCphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoCphKey(JAXBElement<String> value) {
        this.spoCphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoCfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoCfxKey() {
        return spoCfxKey;
    }

    /**
     * Sets the value of the spoCfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoCfxKey(JAXBElement<String> value) {
        this.spoCfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoEmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoEmlKey() {
        return spoEmlKey;
    }

    /**
     * Sets the value of the spoEmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoEmlKey(JAXBElement<String> value) {
        this.spoEmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoUrlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoUrlKey() {
        return spoUrlKey;
    }

    /**
     * Sets the value of the spoUrlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoUrlKey(JAXBElement<String> value) {
        this.spoUrlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoAddUser() {
        return spoAddUser;
    }

    /**
     * Sets the value of the spoAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoAddUser(JAXBElement<String> value) {
        this.spoAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoAddDate() {
        return spoAddDate;
    }

    /**
     * Sets the value of the spoAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoAddDate(JAXBElement<String> value) {
        this.spoAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoChangeUser() {
        return spoChangeUser;
    }

    /**
     * Sets the value of the spoChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoChangeUser(JAXBElement<String> value) {
        this.spoChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoChangeDate() {
        return spoChangeDate;
    }

    /**
     * Sets the value of the spoChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoChangeDate(JAXBElement<String> value) {
        this.spoChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getSpoDeleteFlag() {
        return spoDeleteFlag;
    }

    /**
     * Sets the value of the spoDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setSpoDeleteFlag(JAXBElement<Short> value) {
        this.spoDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the spoKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoKeyExt() {
        return spoKeyExt;
    }

    /**
     * Sets the value of the spoKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoKeyExt(JAXBElement<String> value) {
        this.spoKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoEvtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoEvtKey() {
        return spoEvtKey;
    }

    /**
     * Sets the value of the spoEvtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoEvtKey(JAXBElement<String> value) {
        this.spoEvtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoSesKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoSesKey() {
        return spoSesKey;
    }

    /**
     * Sets the value of the spoSesKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoSesKey(JAXBElement<String> value) {
        this.spoSesKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoTrkKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoTrkKey() {
        return spoTrkKey;
    }

    /**
     * Sets the value of the spoTrkKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoTrkKey(JAXBElement<String> value) {
        this.spoTrkKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoFacKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoFacKey() {
        return spoFacKey;
    }

    /**
     * Sets the value of the spoFacKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoFacKey(JAXBElement<String> value) {
        this.spoFacKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoNotes() {
        return spoNotes;
    }

    /**
     * Sets the value of the spoNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoNotes(JAXBElement<String> value) {
        this.spoNotes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoInvCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoInvCode() {
        return spoInvCode;
    }

    /**
     * Sets the value of the spoInvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoInvCode(JAXBElement<String> value) {
        this.spoInvCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoLogoDocKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoLogoDocKey() {
        return spoLogoDocKey;
    }

    /**
     * Sets the value of the spoLogoDocKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoLogoDocKey(JAXBElement<String> value) {
        this.spoLogoDocKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoIvdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoIvdKey() {
        return spoIvdKey;
    }

    /**
     * Sets the value of the spoIvdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoIvdKey(JAXBElement<String> value) {
        this.spoIvdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoEntityKey() {
        return spoEntityKey;
    }

    /**
     * Sets the value of the spoEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoEntityKey(JAXBElement<String> value) {
        this.spoEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoExbKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoExbKey() {
        return spoExbKey;
    }

    /**
     * Sets the value of the spoExbKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoExbKey(JAXBElement<String> value) {
        this.spoExbKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoCancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoCancelDate() {
        return spoCancelDate;
    }

    /**
     * Sets the value of the spoCancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoCancelDate(JAXBElement<String> value) {
        this.spoCancelDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoOrdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoOrdCode() {
        return spoOrdCode;
    }

    /**
     * Sets the value of the spoOrdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoOrdCode(JAXBElement<String> value) {
        this.spoOrdCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spoOddKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpoOddKey() {
        return spoOddKey;
    }

    /**
     * Sets the value of the spoOddKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpoOddKey(JAXBElement<String> value) {
        this.spoOddKey = ((JAXBElement<String> ) value);
    }

}
