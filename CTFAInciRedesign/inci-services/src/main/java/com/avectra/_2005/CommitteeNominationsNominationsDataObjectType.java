
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommitteeNominations_Nominations_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitteeNominations_Nominations_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nom_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nom_cmt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nom_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nom_cst_key_by" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nom_nms_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nom_status_chg_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="nom_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="nom_notes" type="{http://www.avectra.com/2005/}stringLength300_Type" minOccurs="0"/>
 *         &lt;element name="nom_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="nom_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="nom_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="nom_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="nom_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="nom_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nom_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nom_start_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="nom_end_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="nom_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nom_cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nom_cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nom_url_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nom_pref_comm_meth" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="nom_cop_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nom_eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nom_accepted_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="nom_rejected_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitteeNominations_Nominations_DataObjectType", propOrder = {
    "nomKey",
    "nomCmtKey",
    "nomCstKey",
    "nomCstKeyBy",
    "nomNmsKey",
    "nomStatusChgDate",
    "nomDate",
    "nomNotes",
    "nomAddUser",
    "nomAddDate",
    "nomChangeUser",
    "nomChangeDate",
    "nomDeleteFlag",
    "nomKeyExt",
    "nomEntityKey",
    "nomStartDate",
    "nomEndDate",
    "nomCxaKey",
    "nomCphKey",
    "nomCfxKey",
    "nomUrlKey",
    "nomPrefCommMeth",
    "nomCopKey",
    "nomEmlKey",
    "nomAcceptedFlag",
    "nomRejectedFlag"
})
public class CommitteeNominationsNominationsDataObjectType {

    @XmlElementRef(name = "nom_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nomKey;
    @XmlElementRef(name = "nom_cmt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nomCmtKey;
    @XmlElementRef(name = "nom_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nomCstKey;
    @XmlElementRef(name = "nom_cst_key_by", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nomCstKeyBy;
    @XmlElementRef(name = "nom_nms_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nomNmsKey;
    @XmlElementRef(name = "nom_status_chg_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nomStatusChgDate;
    @XmlElementRef(name = "nom_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nomDate;
    @XmlElementRef(name = "nom_notes", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nomNotes;
    @XmlElementRef(name = "nom_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nomAddUser;
    @XmlElementRef(name = "nom_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nomAddDate;
    @XmlElementRef(name = "nom_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nomChangeUser;
    @XmlElementRef(name = "nom_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nomChangeDate;
    @XmlElementRef(name = "nom_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> nomDeleteFlag;
    @XmlElementRef(name = "nom_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nomKeyExt;
    @XmlElementRef(name = "nom_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nomEntityKey;
    @XmlElementRef(name = "nom_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nomStartDate;
    @XmlElementRef(name = "nom_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nomEndDate;
    @XmlElementRef(name = "nom_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nomCxaKey;
    @XmlElementRef(name = "nom_cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nomCphKey;
    @XmlElementRef(name = "nom_cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nomCfxKey;
    @XmlElementRef(name = "nom_url_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nomUrlKey;
    @XmlElementRef(name = "nom_pref_comm_meth", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nomPrefCommMeth;
    @XmlElementRef(name = "nom_cop_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nomCopKey;
    @XmlElementRef(name = "nom_eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nomEmlKey;
    @XmlElementRef(name = "nom_accepted_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> nomAcceptedFlag;
    @XmlElementRef(name = "nom_rejected_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> nomRejectedFlag;

    /**
     * Gets the value of the nomKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomKey() {
        return nomKey;
    }

    /**
     * Sets the value of the nomKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomKey(JAXBElement<String> value) {
        this.nomKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomCmtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomCmtKey() {
        return nomCmtKey;
    }

    /**
     * Sets the value of the nomCmtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomCmtKey(JAXBElement<String> value) {
        this.nomCmtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomCstKey() {
        return nomCstKey;
    }

    /**
     * Sets the value of the nomCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomCstKey(JAXBElement<String> value) {
        this.nomCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomCstKeyBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomCstKeyBy() {
        return nomCstKeyBy;
    }

    /**
     * Sets the value of the nomCstKeyBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomCstKeyBy(JAXBElement<String> value) {
        this.nomCstKeyBy = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomNmsKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomNmsKey() {
        return nomNmsKey;
    }

    /**
     * Sets the value of the nomNmsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomNmsKey(JAXBElement<String> value) {
        this.nomNmsKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomStatusChgDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomStatusChgDate() {
        return nomStatusChgDate;
    }

    /**
     * Sets the value of the nomStatusChgDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomStatusChgDate(JAXBElement<String> value) {
        this.nomStatusChgDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomDate() {
        return nomDate;
    }

    /**
     * Sets the value of the nomDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomDate(JAXBElement<String> value) {
        this.nomDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomNotes() {
        return nomNotes;
    }

    /**
     * Sets the value of the nomNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomNotes(JAXBElement<String> value) {
        this.nomNotes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomAddUser() {
        return nomAddUser;
    }

    /**
     * Sets the value of the nomAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomAddUser(JAXBElement<String> value) {
        this.nomAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomAddDate() {
        return nomAddDate;
    }

    /**
     * Sets the value of the nomAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomAddDate(JAXBElement<String> value) {
        this.nomAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomChangeUser() {
        return nomChangeUser;
    }

    /**
     * Sets the value of the nomChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomChangeUser(JAXBElement<String> value) {
        this.nomChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomChangeDate() {
        return nomChangeDate;
    }

    /**
     * Sets the value of the nomChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomChangeDate(JAXBElement<String> value) {
        this.nomChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNomDeleteFlag() {
        return nomDeleteFlag;
    }

    /**
     * Sets the value of the nomDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNomDeleteFlag(JAXBElement<Short> value) {
        this.nomDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the nomKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomKeyExt() {
        return nomKeyExt;
    }

    /**
     * Sets the value of the nomKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomKeyExt(JAXBElement<String> value) {
        this.nomKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomEntityKey() {
        return nomEntityKey;
    }

    /**
     * Sets the value of the nomEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomEntityKey(JAXBElement<String> value) {
        this.nomEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomStartDate() {
        return nomStartDate;
    }

    /**
     * Sets the value of the nomStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomStartDate(JAXBElement<String> value) {
        this.nomStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomEndDate() {
        return nomEndDate;
    }

    /**
     * Sets the value of the nomEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomEndDate(JAXBElement<String> value) {
        this.nomEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomCxaKey() {
        return nomCxaKey;
    }

    /**
     * Sets the value of the nomCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomCxaKey(JAXBElement<String> value) {
        this.nomCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomCphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomCphKey() {
        return nomCphKey;
    }

    /**
     * Sets the value of the nomCphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomCphKey(JAXBElement<String> value) {
        this.nomCphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomCfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomCfxKey() {
        return nomCfxKey;
    }

    /**
     * Sets the value of the nomCfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomCfxKey(JAXBElement<String> value) {
        this.nomCfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomUrlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomUrlKey() {
        return nomUrlKey;
    }

    /**
     * Sets the value of the nomUrlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomUrlKey(JAXBElement<String> value) {
        this.nomUrlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomPrefCommMeth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomPrefCommMeth() {
        return nomPrefCommMeth;
    }

    /**
     * Sets the value of the nomPrefCommMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomPrefCommMeth(JAXBElement<String> value) {
        this.nomPrefCommMeth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomCopKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomCopKey() {
        return nomCopKey;
    }

    /**
     * Sets the value of the nomCopKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomCopKey(JAXBElement<String> value) {
        this.nomCopKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomEmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomEmlKey() {
        return nomEmlKey;
    }

    /**
     * Sets the value of the nomEmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomEmlKey(JAXBElement<String> value) {
        this.nomEmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomAcceptedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNomAcceptedFlag() {
        return nomAcceptedFlag;
    }

    /**
     * Sets the value of the nomAcceptedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNomAcceptedFlag(JAXBElement<Short> value) {
        this.nomAcceptedFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the nomRejectedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNomRejectedFlag() {
        return nomRejectedFlag;
    }

    /**
     * Sets the value of the nomRejectedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNomRejectedFlag(JAXBElement<Short> value) {
        this.nomRejectedFlag = ((JAXBElement<Short> ) value);
    }

}
