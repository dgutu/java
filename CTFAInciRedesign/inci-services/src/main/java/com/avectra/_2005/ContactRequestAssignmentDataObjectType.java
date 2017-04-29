
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactRequest_Assignment_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactRequest_Assignment_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="coa_cor_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="coa_usr_code" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="coa_rat_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="coa_car_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="coa_summary" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="coa_detail" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="coa_auto_notify_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="coa_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="coa_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="coa_synced_flag" type="{http://www.avectra.com/2005/}booleanLength1_Type" minOccurs="0"/>
 *         &lt;element name="coa_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="coa_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="coa_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="coa_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="coa_crs_code" type="{http://www.avectra.com/2005/}stringLength12_Type" minOccurs="0"/>
 *         &lt;element name="coa_crp_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="coa_due_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="coa_source_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="coa_remind_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="coa_cct_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="coa_send_notify_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="coa_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="coa_wfl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="coa_csu_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="coa_sfo_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="coa_osh_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="coa_wkt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactRequest_Assignment_DataObjectType", propOrder = {
    "coaKey",
    "coaCorKey",
    "coaUsrCode",
    "coaRatCode",
    "coaCarCode",
    "coaSummary",
    "coaDetail",
    "coaAutoNotifyFlag",
    "coaAddDate",
    "coaAddUser",
    "coaSyncedFlag",
    "coaChangeDate",
    "coaChangeUser",
    "coaDeleteFlag",
    "coaKeyExt",
    "coaCrsCode",
    "coaCrpCode",
    "coaDueDate",
    "coaSourceCode",
    "coaRemindDate",
    "coaCctKey",
    "coaSendNotifyDate",
    "coaEntityKey",
    "coaWflKey",
    "coaCsuCode",
    "coaSfoKey",
    "coaOshKey",
    "coaWktKey"
})
public class ContactRequestAssignmentDataObjectType {

    @XmlElementRef(name = "coa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaKey;
    @XmlElementRef(name = "coa_cor_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaCorKey;
    @XmlElementRef(name = "coa_usr_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaUsrCode;
    @XmlElementRef(name = "coa_rat_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaRatCode;
    @XmlElementRef(name = "coa_car_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaCarCode;
    @XmlElementRef(name = "coa_summary", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaSummary;
    @XmlElementRef(name = "coa_detail", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaDetail;
    @XmlElementRef(name = "coa_auto_notify_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> coaAutoNotifyFlag;
    @XmlElementRef(name = "coa_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaAddDate;
    @XmlElementRef(name = "coa_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaAddUser;
    @XmlElementRef(name = "coa_synced_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Boolean> coaSyncedFlag;
    @XmlElementRef(name = "coa_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaChangeDate;
    @XmlElementRef(name = "coa_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaChangeUser;
    @XmlElementRef(name = "coa_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> coaDeleteFlag;
    @XmlElementRef(name = "coa_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaKeyExt;
    @XmlElementRef(name = "coa_crs_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaCrsCode;
    @XmlElementRef(name = "coa_crp_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaCrpCode;
    @XmlElementRef(name = "coa_due_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaDueDate;
    @XmlElementRef(name = "coa_source_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaSourceCode;
    @XmlElementRef(name = "coa_remind_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaRemindDate;
    @XmlElementRef(name = "coa_cct_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaCctKey;
    @XmlElementRef(name = "coa_send_notify_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaSendNotifyDate;
    @XmlElementRef(name = "coa_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaEntityKey;
    @XmlElementRef(name = "coa_wfl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaWflKey;
    @XmlElementRef(name = "coa_csu_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaCsuCode;
    @XmlElementRef(name = "coa_sfo_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaSfoKey;
    @XmlElementRef(name = "coa_osh_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaOshKey;
    @XmlElementRef(name = "coa_wkt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> coaWktKey;

    /**
     * Gets the value of the coaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaKey() {
        return coaKey;
    }

    /**
     * Sets the value of the coaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaKey(JAXBElement<String> value) {
        this.coaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coaCorKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaCorKey() {
        return coaCorKey;
    }

    /**
     * Sets the value of the coaCorKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaCorKey(JAXBElement<String> value) {
        this.coaCorKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coaUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaUsrCode() {
        return coaUsrCode;
    }

    /**
     * Sets the value of the coaUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaUsrCode(JAXBElement<String> value) {
        this.coaUsrCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coaRatCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaRatCode() {
        return coaRatCode;
    }

    /**
     * Sets the value of the coaRatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaRatCode(JAXBElement<String> value) {
        this.coaRatCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coaCarCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaCarCode() {
        return coaCarCode;
    }

    /**
     * Sets the value of the coaCarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaCarCode(JAXBElement<String> value) {
        this.coaCarCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coaSummary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaSummary() {
        return coaSummary;
    }

    /**
     * Sets the value of the coaSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaSummary(JAXBElement<String> value) {
        this.coaSummary = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coaDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaDetail() {
        return coaDetail;
    }

    /**
     * Sets the value of the coaDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaDetail(JAXBElement<String> value) {
        this.coaDetail = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coaAutoNotifyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCoaAutoNotifyFlag() {
        return coaAutoNotifyFlag;
    }

    /**
     * Sets the value of the coaAutoNotifyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCoaAutoNotifyFlag(JAXBElement<Short> value) {
        this.coaAutoNotifyFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the coaAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaAddDate() {
        return coaAddDate;
    }

    /**
     * Sets the value of the coaAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaAddDate(JAXBElement<String> value) {
        this.coaAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coaAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaAddUser() {
        return coaAddUser;
    }

    /**
     * Sets the value of the coaAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaAddUser(JAXBElement<String> value) {
        this.coaAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coaSyncedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCoaSyncedFlag() {
        return coaSyncedFlag;
    }

    /**
     * Sets the value of the coaSyncedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCoaSyncedFlag(JAXBElement<Boolean> value) {
        this.coaSyncedFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the coaChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaChangeDate() {
        return coaChangeDate;
    }

    /**
     * Sets the value of the coaChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaChangeDate(JAXBElement<String> value) {
        this.coaChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coaChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaChangeUser() {
        return coaChangeUser;
    }

    /**
     * Sets the value of the coaChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaChangeUser(JAXBElement<String> value) {
        this.coaChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coaDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCoaDeleteFlag() {
        return coaDeleteFlag;
    }

    /**
     * Sets the value of the coaDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCoaDeleteFlag(JAXBElement<Short> value) {
        this.coaDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the coaKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaKeyExt() {
        return coaKeyExt;
    }

    /**
     * Sets the value of the coaKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaKeyExt(JAXBElement<String> value) {
        this.coaKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coaCrsCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaCrsCode() {
        return coaCrsCode;
    }

    /**
     * Sets the value of the coaCrsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaCrsCode(JAXBElement<String> value) {
        this.coaCrsCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coaCrpCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaCrpCode() {
        return coaCrpCode;
    }

    /**
     * Sets the value of the coaCrpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaCrpCode(JAXBElement<String> value) {
        this.coaCrpCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coaDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaDueDate() {
        return coaDueDate;
    }

    /**
     * Sets the value of the coaDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaDueDate(JAXBElement<String> value) {
        this.coaDueDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coaSourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaSourceCode() {
        return coaSourceCode;
    }

    /**
     * Sets the value of the coaSourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaSourceCode(JAXBElement<String> value) {
        this.coaSourceCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coaRemindDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaRemindDate() {
        return coaRemindDate;
    }

    /**
     * Sets the value of the coaRemindDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaRemindDate(JAXBElement<String> value) {
        this.coaRemindDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coaCctKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaCctKey() {
        return coaCctKey;
    }

    /**
     * Sets the value of the coaCctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaCctKey(JAXBElement<String> value) {
        this.coaCctKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coaSendNotifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaSendNotifyDate() {
        return coaSendNotifyDate;
    }

    /**
     * Sets the value of the coaSendNotifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaSendNotifyDate(JAXBElement<String> value) {
        this.coaSendNotifyDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coaEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaEntityKey() {
        return coaEntityKey;
    }

    /**
     * Sets the value of the coaEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaEntityKey(JAXBElement<String> value) {
        this.coaEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coaWflKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaWflKey() {
        return coaWflKey;
    }

    /**
     * Sets the value of the coaWflKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaWflKey(JAXBElement<String> value) {
        this.coaWflKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coaCsuCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaCsuCode() {
        return coaCsuCode;
    }

    /**
     * Sets the value of the coaCsuCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaCsuCode(JAXBElement<String> value) {
        this.coaCsuCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coaSfoKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaSfoKey() {
        return coaSfoKey;
    }

    /**
     * Sets the value of the coaSfoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaSfoKey(JAXBElement<String> value) {
        this.coaSfoKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coaOshKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaOshKey() {
        return coaOshKey;
    }

    /**
     * Sets the value of the coaOshKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaOshKey(JAXBElement<String> value) {
        this.coaOshKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coaWktKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoaWktKey() {
        return coaWktKey;
    }

    /**
     * Sets the value of the coaWktKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoaWktKey(JAXBElement<String> value) {
        this.coaWktKey = ((JAXBElement<String> ) value);
    }

}
