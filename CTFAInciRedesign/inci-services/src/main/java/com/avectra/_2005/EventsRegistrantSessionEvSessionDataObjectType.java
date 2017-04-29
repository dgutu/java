
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrantSession_ev_session_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrantSession_ev_session_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ses_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ses_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="ses_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ses_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ses_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ses_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ses_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ses_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ses_evt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ses_title" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="ses_set_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ses_capacity" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ses_registrant_goal" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ses_revenue_goal" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ses_display_order" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ses_wait_list_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ses_auto_register_wait_list" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ses_check_wait_list_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ses_registration_required" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ses_estimated_attendance" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ses_guaranteed_attendance" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ses_restricted" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ses_short_description" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="ses_description" type="{http://www.avectra.com/2005/}stringLength1600_Type" minOccurs="0"/>
 *         &lt;element name="ses_description_html" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="ses_start_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ses_start_time" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="ses_end_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ses_end_time" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="ses_early_registration_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ses_late_registration" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ses_cutoff_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ses_post_to_web_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ses_sponsor_limit" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ses_pre_registration_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ses_remove_from_web_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ses_ceu_type" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="ses_session_url" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="ses_ceu" type="{http://www.avectra.com/2005/}av_decimal2_Type" minOccurs="0"/>
 *         &lt;element name="ses_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ses_ticketed" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ses_cec_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ses_abstract_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ses_abstract_member_option" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ses_abstract_deadline" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ses_free_session_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ses_free_guest_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ses_wait_list_limit" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ses_fpc_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrantSession_ev_session_DataObjectType", propOrder = {
    "sesKey",
    "sesCode",
    "sesAddUser",
    "sesAddDate",
    "sesChangeUser",
    "sesChangeDate",
    "sesDeleteFlag",
    "sesKeyExt",
    "sesEvtKey",
    "sesTitle",
    "sesSetKey",
    "sesCapacity",
    "sesRegistrantGoal",
    "sesRevenueGoal",
    "sesDisplayOrder",
    "sesWaitListFlag",
    "sesAutoRegisterWaitList",
    "sesCheckWaitListFlag",
    "sesRegistrationRequired",
    "sesEstimatedAttendance",
    "sesGuaranteedAttendance",
    "sesRestricted",
    "sesShortDescription",
    "sesDescription",
    "sesDescriptionHtml",
    "sesStartDate",
    "sesStartTime",
    "sesEndDate",
    "sesEndTime",
    "sesEarlyRegistrationDate",
    "sesLateRegistration",
    "sesCutoffDate",
    "sesPostToWebDate",
    "sesSponsorLimit",
    "sesPreRegistrationDate",
    "sesRemoveFromWebDate",
    "sesCeuType",
    "sesSessionUrl",
    "sesCeu",
    "sesEntityKey",
    "sesTicketed",
    "sesCecKey",
    "sesAbstractFlag",
    "sesAbstractMemberOption",
    "sesAbstractDeadline",
    "sesFreeSessionFlag",
    "sesFreeGuestFlag",
    "sesWaitListLimit",
    "sesFpcPrdKey"
})
public class EventsRegistrantSessionEvSessionDataObjectType {

    @XmlElementRef(name = "ses_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesKey;
    @XmlElementRef(name = "ses_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesCode;
    @XmlElementRef(name = "ses_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesAddUser;
    @XmlElementRef(name = "ses_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesAddDate;
    @XmlElementRef(name = "ses_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesChangeUser;
    @XmlElementRef(name = "ses_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesChangeDate;
    @XmlElementRef(name = "ses_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> sesDeleteFlag;
    @XmlElementRef(name = "ses_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesKeyExt;
    @XmlElementRef(name = "ses_evt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesEvtKey;
    @XmlElementRef(name = "ses_title", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesTitle;
    @XmlElementRef(name = "ses_set_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesSetKey;
    @XmlElementRef(name = "ses_capacity", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> sesCapacity;
    @XmlElementRef(name = "ses_registrant_goal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> sesRegistrantGoal;
    @XmlElementRef(name = "ses_revenue_goal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> sesRevenueGoal;
    @XmlElementRef(name = "ses_display_order", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> sesDisplayOrder;
    @XmlElementRef(name = "ses_wait_list_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> sesWaitListFlag;
    @XmlElementRef(name = "ses_auto_register_wait_list", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> sesAutoRegisterWaitList;
    @XmlElementRef(name = "ses_check_wait_list_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> sesCheckWaitListFlag;
    @XmlElementRef(name = "ses_registration_required", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> sesRegistrationRequired;
    @XmlElementRef(name = "ses_estimated_attendance", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> sesEstimatedAttendance;
    @XmlElementRef(name = "ses_guaranteed_attendance", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> sesGuaranteedAttendance;
    @XmlElementRef(name = "ses_restricted", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> sesRestricted;
    @XmlElementRef(name = "ses_short_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesShortDescription;
    @XmlElementRef(name = "ses_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesDescription;
    @XmlElementRef(name = "ses_description_html", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesDescriptionHtml;
    @XmlElementRef(name = "ses_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesStartDate;
    @XmlElementRef(name = "ses_start_time", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesStartTime;
    @XmlElementRef(name = "ses_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesEndDate;
    @XmlElementRef(name = "ses_end_time", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesEndTime;
    @XmlElementRef(name = "ses_early_registration_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesEarlyRegistrationDate;
    @XmlElementRef(name = "ses_late_registration", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesLateRegistration;
    @XmlElementRef(name = "ses_cutoff_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesCutoffDate;
    @XmlElementRef(name = "ses_post_to_web_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesPostToWebDate;
    @XmlElementRef(name = "ses_sponsor_limit", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> sesSponsorLimit;
    @XmlElementRef(name = "ses_pre_registration_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesPreRegistrationDate;
    @XmlElementRef(name = "ses_remove_from_web_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesRemoveFromWebDate;
    @XmlElementRef(name = "ses_ceu_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesCeuType;
    @XmlElementRef(name = "ses_session_url", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesSessionUrl;
    @XmlElementRef(name = "ses_ceu", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> sesCeu;
    @XmlElementRef(name = "ses_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesEntityKey;
    @XmlElementRef(name = "ses_ticketed", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> sesTicketed;
    @XmlElementRef(name = "ses_cec_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesCecKey;
    @XmlElementRef(name = "ses_abstract_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> sesAbstractFlag;
    @XmlElementRef(name = "ses_abstract_member_option", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesAbstractMemberOption;
    @XmlElementRef(name = "ses_abstract_deadline", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesAbstractDeadline;
    @XmlElementRef(name = "ses_free_session_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> sesFreeSessionFlag;
    @XmlElementRef(name = "ses_free_guest_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> sesFreeGuestFlag;
    @XmlElementRef(name = "ses_wait_list_limit", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> sesWaitListLimit;
    @XmlElementRef(name = "ses_fpc_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sesFpcPrdKey;

    /**
     * Gets the value of the sesKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesKey() {
        return sesKey;
    }

    /**
     * Sets the value of the sesKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesKey(JAXBElement<String> value) {
        this.sesKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesCode() {
        return sesCode;
    }

    /**
     * Sets the value of the sesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesCode(JAXBElement<String> value) {
        this.sesCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesAddUser() {
        return sesAddUser;
    }

    /**
     * Sets the value of the sesAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesAddUser(JAXBElement<String> value) {
        this.sesAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesAddDate() {
        return sesAddDate;
    }

    /**
     * Sets the value of the sesAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesAddDate(JAXBElement<String> value) {
        this.sesAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesChangeUser() {
        return sesChangeUser;
    }

    /**
     * Sets the value of the sesChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesChangeUser(JAXBElement<String> value) {
        this.sesChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesChangeDate() {
        return sesChangeDate;
    }

    /**
     * Sets the value of the sesChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesChangeDate(JAXBElement<String> value) {
        this.sesChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getSesDeleteFlag() {
        return sesDeleteFlag;
    }

    /**
     * Sets the value of the sesDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setSesDeleteFlag(JAXBElement<Short> value) {
        this.sesDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the sesKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesKeyExt() {
        return sesKeyExt;
    }

    /**
     * Sets the value of the sesKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesKeyExt(JAXBElement<String> value) {
        this.sesKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesEvtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesEvtKey() {
        return sesEvtKey;
    }

    /**
     * Sets the value of the sesEvtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesEvtKey(JAXBElement<String> value) {
        this.sesEvtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesTitle() {
        return sesTitle;
    }

    /**
     * Sets the value of the sesTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesTitle(JAXBElement<String> value) {
        this.sesTitle = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesSetKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesSetKey() {
        return sesSetKey;
    }

    /**
     * Sets the value of the sesSetKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesSetKey(JAXBElement<String> value) {
        this.sesSetKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSesCapacity() {
        return sesCapacity;
    }

    /**
     * Sets the value of the sesCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSesCapacity(JAXBElement<Integer> value) {
        this.sesCapacity = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the sesRegistrantGoal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSesRegistrantGoal() {
        return sesRegistrantGoal;
    }

    /**
     * Sets the value of the sesRegistrantGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSesRegistrantGoal(JAXBElement<Integer> value) {
        this.sesRegistrantGoal = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the sesRevenueGoal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSesRevenueGoal() {
        return sesRevenueGoal;
    }

    /**
     * Sets the value of the sesRevenueGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSesRevenueGoal(JAXBElement<Integer> value) {
        this.sesRevenueGoal = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the sesDisplayOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSesDisplayOrder() {
        return sesDisplayOrder;
    }

    /**
     * Sets the value of the sesDisplayOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSesDisplayOrder(JAXBElement<Integer> value) {
        this.sesDisplayOrder = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the sesWaitListFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getSesWaitListFlag() {
        return sesWaitListFlag;
    }

    /**
     * Sets the value of the sesWaitListFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setSesWaitListFlag(JAXBElement<Short> value) {
        this.sesWaitListFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the sesAutoRegisterWaitList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getSesAutoRegisterWaitList() {
        return sesAutoRegisterWaitList;
    }

    /**
     * Sets the value of the sesAutoRegisterWaitList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setSesAutoRegisterWaitList(JAXBElement<Short> value) {
        this.sesAutoRegisterWaitList = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the sesCheckWaitListFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getSesCheckWaitListFlag() {
        return sesCheckWaitListFlag;
    }

    /**
     * Sets the value of the sesCheckWaitListFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setSesCheckWaitListFlag(JAXBElement<Short> value) {
        this.sesCheckWaitListFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the sesRegistrationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getSesRegistrationRequired() {
        return sesRegistrationRequired;
    }

    /**
     * Sets the value of the sesRegistrationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setSesRegistrationRequired(JAXBElement<Short> value) {
        this.sesRegistrationRequired = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the sesEstimatedAttendance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSesEstimatedAttendance() {
        return sesEstimatedAttendance;
    }

    /**
     * Sets the value of the sesEstimatedAttendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSesEstimatedAttendance(JAXBElement<Integer> value) {
        this.sesEstimatedAttendance = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the sesGuaranteedAttendance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSesGuaranteedAttendance() {
        return sesGuaranteedAttendance;
    }

    /**
     * Sets the value of the sesGuaranteedAttendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSesGuaranteedAttendance(JAXBElement<Integer> value) {
        this.sesGuaranteedAttendance = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the sesRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getSesRestricted() {
        return sesRestricted;
    }

    /**
     * Sets the value of the sesRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setSesRestricted(JAXBElement<Short> value) {
        this.sesRestricted = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the sesShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesShortDescription() {
        return sesShortDescription;
    }

    /**
     * Sets the value of the sesShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesShortDescription(JAXBElement<String> value) {
        this.sesShortDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesDescription() {
        return sesDescription;
    }

    /**
     * Sets the value of the sesDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesDescription(JAXBElement<String> value) {
        this.sesDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesDescriptionHtml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesDescriptionHtml() {
        return sesDescriptionHtml;
    }

    /**
     * Sets the value of the sesDescriptionHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesDescriptionHtml(JAXBElement<String> value) {
        this.sesDescriptionHtml = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesStartDate() {
        return sesStartDate;
    }

    /**
     * Sets the value of the sesStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesStartDate(JAXBElement<String> value) {
        this.sesStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesStartTime() {
        return sesStartTime;
    }

    /**
     * Sets the value of the sesStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesStartTime(JAXBElement<String> value) {
        this.sesStartTime = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesEndDate() {
        return sesEndDate;
    }

    /**
     * Sets the value of the sesEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesEndDate(JAXBElement<String> value) {
        this.sesEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesEndTime() {
        return sesEndTime;
    }

    /**
     * Sets the value of the sesEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesEndTime(JAXBElement<String> value) {
        this.sesEndTime = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesEarlyRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesEarlyRegistrationDate() {
        return sesEarlyRegistrationDate;
    }

    /**
     * Sets the value of the sesEarlyRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesEarlyRegistrationDate(JAXBElement<String> value) {
        this.sesEarlyRegistrationDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesLateRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesLateRegistration() {
        return sesLateRegistration;
    }

    /**
     * Sets the value of the sesLateRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesLateRegistration(JAXBElement<String> value) {
        this.sesLateRegistration = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesCutoffDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesCutoffDate() {
        return sesCutoffDate;
    }

    /**
     * Sets the value of the sesCutoffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesCutoffDate(JAXBElement<String> value) {
        this.sesCutoffDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesPostToWebDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesPostToWebDate() {
        return sesPostToWebDate;
    }

    /**
     * Sets the value of the sesPostToWebDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesPostToWebDate(JAXBElement<String> value) {
        this.sesPostToWebDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesSponsorLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSesSponsorLimit() {
        return sesSponsorLimit;
    }

    /**
     * Sets the value of the sesSponsorLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSesSponsorLimit(JAXBElement<Integer> value) {
        this.sesSponsorLimit = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the sesPreRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesPreRegistrationDate() {
        return sesPreRegistrationDate;
    }

    /**
     * Sets the value of the sesPreRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesPreRegistrationDate(JAXBElement<String> value) {
        this.sesPreRegistrationDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesRemoveFromWebDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesRemoveFromWebDate() {
        return sesRemoveFromWebDate;
    }

    /**
     * Sets the value of the sesRemoveFromWebDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesRemoveFromWebDate(JAXBElement<String> value) {
        this.sesRemoveFromWebDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesCeuType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesCeuType() {
        return sesCeuType;
    }

    /**
     * Sets the value of the sesCeuType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesCeuType(JAXBElement<String> value) {
        this.sesCeuType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesSessionUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesSessionUrl() {
        return sesSessionUrl;
    }

    /**
     * Sets the value of the sesSessionUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesSessionUrl(JAXBElement<String> value) {
        this.sesSessionUrl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesCeu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSesCeu() {
        return sesCeu;
    }

    /**
     * Sets the value of the sesCeu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSesCeu(JAXBElement<BigDecimal> value) {
        this.sesCeu = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the sesEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesEntityKey() {
        return sesEntityKey;
    }

    /**
     * Sets the value of the sesEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesEntityKey(JAXBElement<String> value) {
        this.sesEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesTicketed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getSesTicketed() {
        return sesTicketed;
    }

    /**
     * Sets the value of the sesTicketed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setSesTicketed(JAXBElement<Short> value) {
        this.sesTicketed = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the sesCecKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesCecKey() {
        return sesCecKey;
    }

    /**
     * Sets the value of the sesCecKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesCecKey(JAXBElement<String> value) {
        this.sesCecKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesAbstractFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getSesAbstractFlag() {
        return sesAbstractFlag;
    }

    /**
     * Sets the value of the sesAbstractFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setSesAbstractFlag(JAXBElement<Short> value) {
        this.sesAbstractFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the sesAbstractMemberOption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesAbstractMemberOption() {
        return sesAbstractMemberOption;
    }

    /**
     * Sets the value of the sesAbstractMemberOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesAbstractMemberOption(JAXBElement<String> value) {
        this.sesAbstractMemberOption = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesAbstractDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesAbstractDeadline() {
        return sesAbstractDeadline;
    }

    /**
     * Sets the value of the sesAbstractDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesAbstractDeadline(JAXBElement<String> value) {
        this.sesAbstractDeadline = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sesFreeSessionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getSesFreeSessionFlag() {
        return sesFreeSessionFlag;
    }

    /**
     * Sets the value of the sesFreeSessionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setSesFreeSessionFlag(JAXBElement<Short> value) {
        this.sesFreeSessionFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the sesFreeGuestFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getSesFreeGuestFlag() {
        return sesFreeGuestFlag;
    }

    /**
     * Sets the value of the sesFreeGuestFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setSesFreeGuestFlag(JAXBElement<Short> value) {
        this.sesFreeGuestFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the sesWaitListLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSesWaitListLimit() {
        return sesWaitListLimit;
    }

    /**
     * Sets the value of the sesWaitListLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSesWaitListLimit(JAXBElement<Integer> value) {
        this.sesWaitListLimit = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the sesFpcPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesFpcPrdKey() {
        return sesFpcPrdKey;
    }

    /**
     * Sets the value of the sesFpcPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesFpcPrdKey(JAXBElement<String> value) {
        this.sesFpcPrdKey = ((JAXBElement<String> ) value);
    }

}
