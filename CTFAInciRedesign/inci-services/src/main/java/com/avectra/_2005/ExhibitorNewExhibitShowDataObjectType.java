
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExhibitorNew_Exhibit_Show_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExhibitorNew_Exhibit_Show_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exb_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exb_evt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exb_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="exb_name" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="exb_start_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="exb_start_time" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="exb_end_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="exb_end_time" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="exb_short_description" type="{http://www.avectra.com/2005/}stringLength400_Type" minOccurs="0"/>
 *         &lt;element name="exb_description_html" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="exb_cutoff_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="exb_post_to_web_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="exb_remove_from_web_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="exb_exhibit_url" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="exb_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="exb_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="exb_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="exb_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="exb_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="exb_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exb_ppg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exb_years_priority_point" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="exb_comp_registrations" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="exb_total_square_footage" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="exb_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exb_date_format" type="{http://www.avectra.com/2005/}stringLength1_Type" minOccurs="0"/>
 *         &lt;element name="exb_pre_registration_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="exb_early_registration_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="exb_late_registration_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="exb_tzn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exb_wait_list_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="exb_allow_installment" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="exb_booth_fee_type" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="exb_company_file" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="exb_booth_file" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExhibitorNew_Exhibit_Show_DataObjectType", propOrder = {
    "exbKey",
    "exbEvtKey",
    "exbCode",
    "exbName",
    "exbStartDate",
    "exbStartTime",
    "exbEndDate",
    "exbEndTime",
    "exbShortDescription",
    "exbDescriptionHtml",
    "exbCutoffDate",
    "exbPostToWebDate",
    "exbRemoveFromWebDate",
    "exbExhibitUrl",
    "exbAddUser",
    "exbAddDate",
    "exbChangeUser",
    "exbChangeDate",
    "exbDeleteFlag",
    "exbKeyExt",
    "exbPpgKey",
    "exbYearsPriorityPoint",
    "exbCompRegistrations",
    "exbTotalSquareFootage",
    "exbEntityKey",
    "exbDateFormat",
    "exbPreRegistrationDate",
    "exbEarlyRegistrationDate",
    "exbLateRegistrationDate",
    "exbTznKey",
    "exbWaitListFlag",
    "exbAllowInstallment",
    "exbBoothFeeType",
    "exbCompanyFile",
    "exbBoothFile"
})
public class ExhibitorNewExhibitShowDataObjectType {

    @XmlElementRef(name = "exb_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbKey;
    @XmlElementRef(name = "exb_evt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbEvtKey;
    @XmlElementRef(name = "exb_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbCode;
    @XmlElementRef(name = "exb_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbName;
    @XmlElementRef(name = "exb_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbStartDate;
    @XmlElementRef(name = "exb_start_time", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbStartTime;
    @XmlElementRef(name = "exb_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbEndDate;
    @XmlElementRef(name = "exb_end_time", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbEndTime;
    @XmlElementRef(name = "exb_short_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbShortDescription;
    @XmlElementRef(name = "exb_description_html", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbDescriptionHtml;
    @XmlElementRef(name = "exb_cutoff_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbCutoffDate;
    @XmlElementRef(name = "exb_post_to_web_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbPostToWebDate;
    @XmlElementRef(name = "exb_remove_from_web_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbRemoveFromWebDate;
    @XmlElementRef(name = "exb_exhibit_url", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbExhibitUrl;
    @XmlElementRef(name = "exb_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbAddUser;
    @XmlElementRef(name = "exb_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbAddDate;
    @XmlElementRef(name = "exb_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbChangeUser;
    @XmlElementRef(name = "exb_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbChangeDate;
    @XmlElementRef(name = "exb_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> exbDeleteFlag;
    @XmlElementRef(name = "exb_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbKeyExt;
    @XmlElementRef(name = "exb_ppg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbPpgKey;
    @XmlElementRef(name = "exb_years_priority_point", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> exbYearsPriorityPoint;
    @XmlElementRef(name = "exb_comp_registrations", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> exbCompRegistrations;
    @XmlElementRef(name = "exb_total_square_footage", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> exbTotalSquareFootage;
    @XmlElementRef(name = "exb_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbEntityKey;
    @XmlElementRef(name = "exb_date_format", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbDateFormat;
    @XmlElementRef(name = "exb_pre_registration_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbPreRegistrationDate;
    @XmlElementRef(name = "exb_early_registration_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbEarlyRegistrationDate;
    @XmlElementRef(name = "exb_late_registration_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbLateRegistrationDate;
    @XmlElementRef(name = "exb_tzn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbTznKey;
    @XmlElementRef(name = "exb_wait_list_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> exbWaitListFlag;
    @XmlElementRef(name = "exb_allow_installment", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> exbAllowInstallment;
    @XmlElementRef(name = "exb_booth_fee_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbBoothFeeType;
    @XmlElementRef(name = "exb_company_file", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbCompanyFile;
    @XmlElementRef(name = "exb_booth_file", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exbBoothFile;

    /**
     * Gets the value of the exbKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbKey() {
        return exbKey;
    }

    /**
     * Sets the value of the exbKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbKey(JAXBElement<String> value) {
        this.exbKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbEvtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbEvtKey() {
        return exbEvtKey;
    }

    /**
     * Sets the value of the exbEvtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbEvtKey(JAXBElement<String> value) {
        this.exbEvtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbCode() {
        return exbCode;
    }

    /**
     * Sets the value of the exbCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbCode(JAXBElement<String> value) {
        this.exbCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbName() {
        return exbName;
    }

    /**
     * Sets the value of the exbName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbName(JAXBElement<String> value) {
        this.exbName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbStartDate() {
        return exbStartDate;
    }

    /**
     * Sets the value of the exbStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbStartDate(JAXBElement<String> value) {
        this.exbStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbStartTime() {
        return exbStartTime;
    }

    /**
     * Sets the value of the exbStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbStartTime(JAXBElement<String> value) {
        this.exbStartTime = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbEndDate() {
        return exbEndDate;
    }

    /**
     * Sets the value of the exbEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbEndDate(JAXBElement<String> value) {
        this.exbEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbEndTime() {
        return exbEndTime;
    }

    /**
     * Sets the value of the exbEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbEndTime(JAXBElement<String> value) {
        this.exbEndTime = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbShortDescription() {
        return exbShortDescription;
    }

    /**
     * Sets the value of the exbShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbShortDescription(JAXBElement<String> value) {
        this.exbShortDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbDescriptionHtml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbDescriptionHtml() {
        return exbDescriptionHtml;
    }

    /**
     * Sets the value of the exbDescriptionHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbDescriptionHtml(JAXBElement<String> value) {
        this.exbDescriptionHtml = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbCutoffDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbCutoffDate() {
        return exbCutoffDate;
    }

    /**
     * Sets the value of the exbCutoffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbCutoffDate(JAXBElement<String> value) {
        this.exbCutoffDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbPostToWebDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbPostToWebDate() {
        return exbPostToWebDate;
    }

    /**
     * Sets the value of the exbPostToWebDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbPostToWebDate(JAXBElement<String> value) {
        this.exbPostToWebDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbRemoveFromWebDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbRemoveFromWebDate() {
        return exbRemoveFromWebDate;
    }

    /**
     * Sets the value of the exbRemoveFromWebDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbRemoveFromWebDate(JAXBElement<String> value) {
        this.exbRemoveFromWebDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbExhibitUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbExhibitUrl() {
        return exbExhibitUrl;
    }

    /**
     * Sets the value of the exbExhibitUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbExhibitUrl(JAXBElement<String> value) {
        this.exbExhibitUrl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbAddUser() {
        return exbAddUser;
    }

    /**
     * Sets the value of the exbAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbAddUser(JAXBElement<String> value) {
        this.exbAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbAddDate() {
        return exbAddDate;
    }

    /**
     * Sets the value of the exbAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbAddDate(JAXBElement<String> value) {
        this.exbAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbChangeUser() {
        return exbChangeUser;
    }

    /**
     * Sets the value of the exbChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbChangeUser(JAXBElement<String> value) {
        this.exbChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbChangeDate() {
        return exbChangeDate;
    }

    /**
     * Sets the value of the exbChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbChangeDate(JAXBElement<String> value) {
        this.exbChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getExbDeleteFlag() {
        return exbDeleteFlag;
    }

    /**
     * Sets the value of the exbDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setExbDeleteFlag(JAXBElement<Short> value) {
        this.exbDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the exbKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbKeyExt() {
        return exbKeyExt;
    }

    /**
     * Sets the value of the exbKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbKeyExt(JAXBElement<String> value) {
        this.exbKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbPpgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbPpgKey() {
        return exbPpgKey;
    }

    /**
     * Sets the value of the exbPpgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbPpgKey(JAXBElement<String> value) {
        this.exbPpgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbYearsPriorityPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExbYearsPriorityPoint() {
        return exbYearsPriorityPoint;
    }

    /**
     * Sets the value of the exbYearsPriorityPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExbYearsPriorityPoint(JAXBElement<Integer> value) {
        this.exbYearsPriorityPoint = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the exbCompRegistrations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExbCompRegistrations() {
        return exbCompRegistrations;
    }

    /**
     * Sets the value of the exbCompRegistrations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExbCompRegistrations(JAXBElement<Integer> value) {
        this.exbCompRegistrations = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the exbTotalSquareFootage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExbTotalSquareFootage() {
        return exbTotalSquareFootage;
    }

    /**
     * Sets the value of the exbTotalSquareFootage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExbTotalSquareFootage(JAXBElement<Integer> value) {
        this.exbTotalSquareFootage = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the exbEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbEntityKey() {
        return exbEntityKey;
    }

    /**
     * Sets the value of the exbEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbEntityKey(JAXBElement<String> value) {
        this.exbEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbDateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbDateFormat() {
        return exbDateFormat;
    }

    /**
     * Sets the value of the exbDateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbDateFormat(JAXBElement<String> value) {
        this.exbDateFormat = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbPreRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbPreRegistrationDate() {
        return exbPreRegistrationDate;
    }

    /**
     * Sets the value of the exbPreRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbPreRegistrationDate(JAXBElement<String> value) {
        this.exbPreRegistrationDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbEarlyRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbEarlyRegistrationDate() {
        return exbEarlyRegistrationDate;
    }

    /**
     * Sets the value of the exbEarlyRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbEarlyRegistrationDate(JAXBElement<String> value) {
        this.exbEarlyRegistrationDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbLateRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbLateRegistrationDate() {
        return exbLateRegistrationDate;
    }

    /**
     * Sets the value of the exbLateRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbLateRegistrationDate(JAXBElement<String> value) {
        this.exbLateRegistrationDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbTznKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbTznKey() {
        return exbTznKey;
    }

    /**
     * Sets the value of the exbTznKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbTznKey(JAXBElement<String> value) {
        this.exbTznKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbWaitListFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getExbWaitListFlag() {
        return exbWaitListFlag;
    }

    /**
     * Sets the value of the exbWaitListFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setExbWaitListFlag(JAXBElement<Short> value) {
        this.exbWaitListFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the exbAllowInstallment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getExbAllowInstallment() {
        return exbAllowInstallment;
    }

    /**
     * Sets the value of the exbAllowInstallment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setExbAllowInstallment(JAXBElement<Short> value) {
        this.exbAllowInstallment = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the exbBoothFeeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbBoothFeeType() {
        return exbBoothFeeType;
    }

    /**
     * Sets the value of the exbBoothFeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbBoothFeeType(JAXBElement<String> value) {
        this.exbBoothFeeType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbCompanyFile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbCompanyFile() {
        return exbCompanyFile;
    }

    /**
     * Sets the value of the exbCompanyFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbCompanyFile(JAXBElement<String> value) {
        this.exbCompanyFile = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exbBoothFile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExbBoothFile() {
        return exbBoothFile;
    }

    /**
     * Sets the value of the exbBoothFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExbBoothFile(JAXBElement<String> value) {
        this.exbBoothFile = ((JAXBElement<String> ) value);
    }

}
