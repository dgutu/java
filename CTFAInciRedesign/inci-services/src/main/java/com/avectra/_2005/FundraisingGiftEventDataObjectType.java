
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Event_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Event_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="evt_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="evt_etp_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="evt_title" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="evt_capacity" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="evt_registrant_goal" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="evt_revenue_goal" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="evt_display_order" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="evt_wait_list_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="evt_auto_register_wait_list" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="evt_check_wait_list_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="evt_registration_required" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="evt_group_reg_based_on_ind" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="evt_estimated_attendance" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="evt_guaranteed_attendance" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="evt_restricted" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="evt_short_description" type="{http://www.avectra.com/2005/}stringLength400_Type" minOccurs="0"/>
 *         &lt;element name="evt_description" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="evt_description_html" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="evt_start_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="evt_start_time" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="evt_end_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="evt_end_time" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="evt_early_registration_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="evt_late_registration_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="evt_time_format" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="evt_date_format" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="evt_cutoff_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="evt_post_to_web_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="evt_remove_from_web_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="evt_event_url" type="{http://www.avectra.com/2005/}av_url_Type" minOccurs="0"/>
 *         &lt;element name="evt_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="evt_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="evt_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="evt_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="evt_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="evt_asn_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="evt_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="evt_sponsor_limit" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="evt_pre_registration_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="evt_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="evt_cct_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="evt_evt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="evt_tzn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="evt_etc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="evt_abstract_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="evt_abstract_member_option" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="evt_abstract_deadline" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="evt_closed_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="evt_free_event_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="evt_regid_counter" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="evt_guest_limit" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="evt_free_guest_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="evt_fpc_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="evt_passkey_id_ext" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="evt_wait_list_limit" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="evt_passkey_code_ext" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="evt_charity_event_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="evt_expense_generated_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="evt_narrative_template" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="evt_video_url" type="{http://www.avectra.com/2005/}av_url_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Event_DataObjectType", propOrder = {
    "evtKey",
    "evtCode",
    "evtEtpKey",
    "evtTitle",
    "evtCapacity",
    "evtRegistrantGoal",
    "evtRevenueGoal",
    "evtDisplayOrder",
    "evtWaitListFlag",
    "evtAutoRegisterWaitList",
    "evtCheckWaitListFlag",
    "evtRegistrationRequired",
    "evtGroupRegBasedOnInd",
    "evtEstimatedAttendance",
    "evtGuaranteedAttendance",
    "evtRestricted",
    "evtShortDescription",
    "evtDescription",
    "evtDescriptionHtml",
    "evtStartDate",
    "evtStartTime",
    "evtEndDate",
    "evtEndTime",
    "evtEarlyRegistrationDate",
    "evtLateRegistrationDate",
    "evtTimeFormat",
    "evtDateFormat",
    "evtCutoffDate",
    "evtPostToWebDate",
    "evtRemoveFromWebDate",
    "evtEventUrl",
    "evtAddUser",
    "evtAddDate",
    "evtChangeUser",
    "evtChangeDate",
    "evtDeleteFlag",
    "evtAsnCode",
    "evtKeyExt",
    "evtSponsorLimit",
    "evtPreRegistrationDate",
    "evtEntityKey",
    "evtCctKey",
    "evtEvtKey",
    "evtTznKey",
    "evtEtcKey",
    "evtAbstractFlag",
    "evtAbstractMemberOption",
    "evtAbstractDeadline",
    "evtClosedFlag",
    "evtFreeEventFlag",
    "evtRegidCounter",
    "evtGuestLimit",
    "evtFreeGuestFlag",
    "evtFpcPrdKey",
    "evtPasskeyIdExt",
    "evtWaitListLimit",
    "evtPasskeyCodeExt",
    "evtCharityEventFlag",
    "evtExpenseGeneratedDate",
    "evtNarrativeTemplate",
    "evtVideoUrl"
})
public class FundraisingGiftEventDataObjectType {

    @XmlElementRef(name = "evt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtKey;
    @XmlElementRef(name = "evt_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtCode;
    @XmlElementRef(name = "evt_etp_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtEtpKey;
    @XmlElementRef(name = "evt_title", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtTitle;
    @XmlElementRef(name = "evt_capacity", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> evtCapacity;
    @XmlElementRef(name = "evt_registrant_goal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> evtRegistrantGoal;
    @XmlElementRef(name = "evt_revenue_goal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> evtRevenueGoal;
    @XmlElementRef(name = "evt_display_order", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> evtDisplayOrder;
    @XmlElementRef(name = "evt_wait_list_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> evtWaitListFlag;
    @XmlElementRef(name = "evt_auto_register_wait_list", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> evtAutoRegisterWaitList;
    @XmlElementRef(name = "evt_check_wait_list_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> evtCheckWaitListFlag;
    @XmlElementRef(name = "evt_registration_required", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> evtRegistrationRequired;
    @XmlElementRef(name = "evt_group_reg_based_on_ind", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> evtGroupRegBasedOnInd;
    @XmlElementRef(name = "evt_estimated_attendance", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> evtEstimatedAttendance;
    @XmlElementRef(name = "evt_guaranteed_attendance", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> evtGuaranteedAttendance;
    @XmlElementRef(name = "evt_restricted", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> evtRestricted;
    @XmlElementRef(name = "evt_short_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtShortDescription;
    @XmlElementRef(name = "evt_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtDescription;
    @XmlElementRef(name = "evt_description_html", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtDescriptionHtml;
    @XmlElementRef(name = "evt_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtStartDate;
    @XmlElementRef(name = "evt_start_time", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtStartTime;
    @XmlElementRef(name = "evt_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtEndDate;
    @XmlElementRef(name = "evt_end_time", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtEndTime;
    @XmlElementRef(name = "evt_early_registration_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtEarlyRegistrationDate;
    @XmlElementRef(name = "evt_late_registration_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtLateRegistrationDate;
    @XmlElementRef(name = "evt_time_format", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtTimeFormat;
    @XmlElementRef(name = "evt_date_format", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtDateFormat;
    @XmlElementRef(name = "evt_cutoff_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtCutoffDate;
    @XmlElementRef(name = "evt_post_to_web_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtPostToWebDate;
    @XmlElementRef(name = "evt_remove_from_web_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtRemoveFromWebDate;
    @XmlElementRef(name = "evt_event_url", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtEventUrl;
    @XmlElementRef(name = "evt_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtAddUser;
    @XmlElementRef(name = "evt_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtAddDate;
    @XmlElementRef(name = "evt_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtChangeUser;
    @XmlElementRef(name = "evt_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtChangeDate;
    @XmlElementRef(name = "evt_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> evtDeleteFlag;
    @XmlElementRef(name = "evt_asn_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtAsnCode;
    @XmlElementRef(name = "evt_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtKeyExt;
    @XmlElementRef(name = "evt_sponsor_limit", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> evtSponsorLimit;
    @XmlElementRef(name = "evt_pre_registration_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtPreRegistrationDate;
    @XmlElementRef(name = "evt_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtEntityKey;
    @XmlElementRef(name = "evt_cct_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtCctKey;
    @XmlElementRef(name = "evt_evt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtEvtKey;
    @XmlElementRef(name = "evt_tzn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtTznKey;
    @XmlElementRef(name = "evt_etc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtEtcKey;
    @XmlElementRef(name = "evt_abstract_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> evtAbstractFlag;
    @XmlElementRef(name = "evt_abstract_member_option", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtAbstractMemberOption;
    @XmlElementRef(name = "evt_abstract_deadline", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtAbstractDeadline;
    @XmlElementRef(name = "evt_closed_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> evtClosedFlag;
    @XmlElementRef(name = "evt_free_event_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> evtFreeEventFlag;
    @XmlElementRef(name = "evt_regid_counter", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> evtRegidCounter;
    @XmlElementRef(name = "evt_guest_limit", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> evtGuestLimit;
    @XmlElementRef(name = "evt_free_guest_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> evtFreeGuestFlag;
    @XmlElementRef(name = "evt_fpc_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtFpcPrdKey;
    @XmlElementRef(name = "evt_passkey_id_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtPasskeyIdExt;
    @XmlElementRef(name = "evt_wait_list_limit", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> evtWaitListLimit;
    @XmlElementRef(name = "evt_passkey_code_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtPasskeyCodeExt;
    @XmlElementRef(name = "evt_charity_event_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> evtCharityEventFlag;
    @XmlElementRef(name = "evt_expense_generated_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtExpenseGeneratedDate;
    @XmlElementRef(name = "evt_narrative_template", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtNarrativeTemplate;
    @XmlElementRef(name = "evt_video_url", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evtVideoUrl;

    /**
     * Gets the value of the evtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtKey() {
        return evtKey;
    }

    /**
     * Sets the value of the evtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtKey(JAXBElement<String> value) {
        this.evtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtCode() {
        return evtCode;
    }

    /**
     * Sets the value of the evtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtCode(JAXBElement<String> value) {
        this.evtCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtEtpKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtEtpKey() {
        return evtEtpKey;
    }

    /**
     * Sets the value of the evtEtpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtEtpKey(JAXBElement<String> value) {
        this.evtEtpKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtTitle() {
        return evtTitle;
    }

    /**
     * Sets the value of the evtTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtTitle(JAXBElement<String> value) {
        this.evtTitle = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEvtCapacity() {
        return evtCapacity;
    }

    /**
     * Sets the value of the evtCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEvtCapacity(JAXBElement<Integer> value) {
        this.evtCapacity = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the evtRegistrantGoal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEvtRegistrantGoal() {
        return evtRegistrantGoal;
    }

    /**
     * Sets the value of the evtRegistrantGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEvtRegistrantGoal(JAXBElement<Integer> value) {
        this.evtRegistrantGoal = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the evtRevenueGoal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEvtRevenueGoal() {
        return evtRevenueGoal;
    }

    /**
     * Sets the value of the evtRevenueGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEvtRevenueGoal(JAXBElement<BigDecimal> value) {
        this.evtRevenueGoal = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the evtDisplayOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEvtDisplayOrder() {
        return evtDisplayOrder;
    }

    /**
     * Sets the value of the evtDisplayOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEvtDisplayOrder(JAXBElement<Integer> value) {
        this.evtDisplayOrder = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the evtWaitListFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEvtWaitListFlag() {
        return evtWaitListFlag;
    }

    /**
     * Sets the value of the evtWaitListFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEvtWaitListFlag(JAXBElement<Short> value) {
        this.evtWaitListFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the evtAutoRegisterWaitList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEvtAutoRegisterWaitList() {
        return evtAutoRegisterWaitList;
    }

    /**
     * Sets the value of the evtAutoRegisterWaitList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEvtAutoRegisterWaitList(JAXBElement<Short> value) {
        this.evtAutoRegisterWaitList = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the evtCheckWaitListFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEvtCheckWaitListFlag() {
        return evtCheckWaitListFlag;
    }

    /**
     * Sets the value of the evtCheckWaitListFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEvtCheckWaitListFlag(JAXBElement<Short> value) {
        this.evtCheckWaitListFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the evtRegistrationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEvtRegistrationRequired() {
        return evtRegistrationRequired;
    }

    /**
     * Sets the value of the evtRegistrationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEvtRegistrationRequired(JAXBElement<Short> value) {
        this.evtRegistrationRequired = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the evtGroupRegBasedOnInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEvtGroupRegBasedOnInd() {
        return evtGroupRegBasedOnInd;
    }

    /**
     * Sets the value of the evtGroupRegBasedOnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEvtGroupRegBasedOnInd(JAXBElement<Short> value) {
        this.evtGroupRegBasedOnInd = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the evtEstimatedAttendance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEvtEstimatedAttendance() {
        return evtEstimatedAttendance;
    }

    /**
     * Sets the value of the evtEstimatedAttendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEvtEstimatedAttendance(JAXBElement<Integer> value) {
        this.evtEstimatedAttendance = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the evtGuaranteedAttendance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEvtGuaranteedAttendance() {
        return evtGuaranteedAttendance;
    }

    /**
     * Sets the value of the evtGuaranteedAttendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEvtGuaranteedAttendance(JAXBElement<Integer> value) {
        this.evtGuaranteedAttendance = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the evtRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEvtRestricted() {
        return evtRestricted;
    }

    /**
     * Sets the value of the evtRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEvtRestricted(JAXBElement<Short> value) {
        this.evtRestricted = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the evtShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtShortDescription() {
        return evtShortDescription;
    }

    /**
     * Sets the value of the evtShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtShortDescription(JAXBElement<String> value) {
        this.evtShortDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtDescription() {
        return evtDescription;
    }

    /**
     * Sets the value of the evtDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtDescription(JAXBElement<String> value) {
        this.evtDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtDescriptionHtml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtDescriptionHtml() {
        return evtDescriptionHtml;
    }

    /**
     * Sets the value of the evtDescriptionHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtDescriptionHtml(JAXBElement<String> value) {
        this.evtDescriptionHtml = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtStartDate() {
        return evtStartDate;
    }

    /**
     * Sets the value of the evtStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtStartDate(JAXBElement<String> value) {
        this.evtStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtStartTime() {
        return evtStartTime;
    }

    /**
     * Sets the value of the evtStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtStartTime(JAXBElement<String> value) {
        this.evtStartTime = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtEndDate() {
        return evtEndDate;
    }

    /**
     * Sets the value of the evtEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtEndDate(JAXBElement<String> value) {
        this.evtEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtEndTime() {
        return evtEndTime;
    }

    /**
     * Sets the value of the evtEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtEndTime(JAXBElement<String> value) {
        this.evtEndTime = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtEarlyRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtEarlyRegistrationDate() {
        return evtEarlyRegistrationDate;
    }

    /**
     * Sets the value of the evtEarlyRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtEarlyRegistrationDate(JAXBElement<String> value) {
        this.evtEarlyRegistrationDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtLateRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtLateRegistrationDate() {
        return evtLateRegistrationDate;
    }

    /**
     * Sets the value of the evtLateRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtLateRegistrationDate(JAXBElement<String> value) {
        this.evtLateRegistrationDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtTimeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtTimeFormat() {
        return evtTimeFormat;
    }

    /**
     * Sets the value of the evtTimeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtTimeFormat(JAXBElement<String> value) {
        this.evtTimeFormat = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtDateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtDateFormat() {
        return evtDateFormat;
    }

    /**
     * Sets the value of the evtDateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtDateFormat(JAXBElement<String> value) {
        this.evtDateFormat = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtCutoffDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtCutoffDate() {
        return evtCutoffDate;
    }

    /**
     * Sets the value of the evtCutoffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtCutoffDate(JAXBElement<String> value) {
        this.evtCutoffDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtPostToWebDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtPostToWebDate() {
        return evtPostToWebDate;
    }

    /**
     * Sets the value of the evtPostToWebDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtPostToWebDate(JAXBElement<String> value) {
        this.evtPostToWebDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtRemoveFromWebDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtRemoveFromWebDate() {
        return evtRemoveFromWebDate;
    }

    /**
     * Sets the value of the evtRemoveFromWebDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtRemoveFromWebDate(JAXBElement<String> value) {
        this.evtRemoveFromWebDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtEventUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtEventUrl() {
        return evtEventUrl;
    }

    /**
     * Sets the value of the evtEventUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtEventUrl(JAXBElement<String> value) {
        this.evtEventUrl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAddUser() {
        return evtAddUser;
    }

    /**
     * Sets the value of the evtAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAddUser(JAXBElement<String> value) {
        this.evtAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAddDate() {
        return evtAddDate;
    }

    /**
     * Sets the value of the evtAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAddDate(JAXBElement<String> value) {
        this.evtAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtChangeUser() {
        return evtChangeUser;
    }

    /**
     * Sets the value of the evtChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtChangeUser(JAXBElement<String> value) {
        this.evtChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtChangeDate() {
        return evtChangeDate;
    }

    /**
     * Sets the value of the evtChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtChangeDate(JAXBElement<String> value) {
        this.evtChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEvtDeleteFlag() {
        return evtDeleteFlag;
    }

    /**
     * Sets the value of the evtDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEvtDeleteFlag(JAXBElement<Short> value) {
        this.evtDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the evtAsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAsnCode() {
        return evtAsnCode;
    }

    /**
     * Sets the value of the evtAsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAsnCode(JAXBElement<String> value) {
        this.evtAsnCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtKeyExt() {
        return evtKeyExt;
    }

    /**
     * Sets the value of the evtKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtKeyExt(JAXBElement<String> value) {
        this.evtKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtSponsorLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEvtSponsorLimit() {
        return evtSponsorLimit;
    }

    /**
     * Sets the value of the evtSponsorLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEvtSponsorLimit(JAXBElement<Integer> value) {
        this.evtSponsorLimit = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the evtPreRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtPreRegistrationDate() {
        return evtPreRegistrationDate;
    }

    /**
     * Sets the value of the evtPreRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtPreRegistrationDate(JAXBElement<String> value) {
        this.evtPreRegistrationDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtEntityKey() {
        return evtEntityKey;
    }

    /**
     * Sets the value of the evtEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtEntityKey(JAXBElement<String> value) {
        this.evtEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtCctKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtCctKey() {
        return evtCctKey;
    }

    /**
     * Sets the value of the evtCctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtCctKey(JAXBElement<String> value) {
        this.evtCctKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtEvtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtEvtKey() {
        return evtEvtKey;
    }

    /**
     * Sets the value of the evtEvtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtEvtKey(JAXBElement<String> value) {
        this.evtEvtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtTznKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtTznKey() {
        return evtTznKey;
    }

    /**
     * Sets the value of the evtTznKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtTznKey(JAXBElement<String> value) {
        this.evtTznKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtEtcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtEtcKey() {
        return evtEtcKey;
    }

    /**
     * Sets the value of the evtEtcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtEtcKey(JAXBElement<String> value) {
        this.evtEtcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtAbstractFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEvtAbstractFlag() {
        return evtAbstractFlag;
    }

    /**
     * Sets the value of the evtAbstractFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEvtAbstractFlag(JAXBElement<Short> value) {
        this.evtAbstractFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the evtAbstractMemberOption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAbstractMemberOption() {
        return evtAbstractMemberOption;
    }

    /**
     * Sets the value of the evtAbstractMemberOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAbstractMemberOption(JAXBElement<String> value) {
        this.evtAbstractMemberOption = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtAbstractDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtAbstractDeadline() {
        return evtAbstractDeadline;
    }

    /**
     * Sets the value of the evtAbstractDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtAbstractDeadline(JAXBElement<String> value) {
        this.evtAbstractDeadline = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtClosedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEvtClosedFlag() {
        return evtClosedFlag;
    }

    /**
     * Sets the value of the evtClosedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEvtClosedFlag(JAXBElement<Short> value) {
        this.evtClosedFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the evtFreeEventFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEvtFreeEventFlag() {
        return evtFreeEventFlag;
    }

    /**
     * Sets the value of the evtFreeEventFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEvtFreeEventFlag(JAXBElement<Short> value) {
        this.evtFreeEventFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the evtRegidCounter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEvtRegidCounter() {
        return evtRegidCounter;
    }

    /**
     * Sets the value of the evtRegidCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEvtRegidCounter(JAXBElement<Long> value) {
        this.evtRegidCounter = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the evtGuestLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEvtGuestLimit() {
        return evtGuestLimit;
    }

    /**
     * Sets the value of the evtGuestLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEvtGuestLimit(JAXBElement<Integer> value) {
        this.evtGuestLimit = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the evtFreeGuestFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEvtFreeGuestFlag() {
        return evtFreeGuestFlag;
    }

    /**
     * Sets the value of the evtFreeGuestFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEvtFreeGuestFlag(JAXBElement<Short> value) {
        this.evtFreeGuestFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the evtFpcPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtFpcPrdKey() {
        return evtFpcPrdKey;
    }

    /**
     * Sets the value of the evtFpcPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtFpcPrdKey(JAXBElement<String> value) {
        this.evtFpcPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtPasskeyIdExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtPasskeyIdExt() {
        return evtPasskeyIdExt;
    }

    /**
     * Sets the value of the evtPasskeyIdExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtPasskeyIdExt(JAXBElement<String> value) {
        this.evtPasskeyIdExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtWaitListLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEvtWaitListLimit() {
        return evtWaitListLimit;
    }

    /**
     * Sets the value of the evtWaitListLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEvtWaitListLimit(JAXBElement<Integer> value) {
        this.evtWaitListLimit = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the evtPasskeyCodeExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtPasskeyCodeExt() {
        return evtPasskeyCodeExt;
    }

    /**
     * Sets the value of the evtPasskeyCodeExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtPasskeyCodeExt(JAXBElement<String> value) {
        this.evtPasskeyCodeExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtCharityEventFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEvtCharityEventFlag() {
        return evtCharityEventFlag;
    }

    /**
     * Sets the value of the evtCharityEventFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEvtCharityEventFlag(JAXBElement<Short> value) {
        this.evtCharityEventFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the evtExpenseGeneratedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtExpenseGeneratedDate() {
        return evtExpenseGeneratedDate;
    }

    /**
     * Sets the value of the evtExpenseGeneratedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtExpenseGeneratedDate(JAXBElement<String> value) {
        this.evtExpenseGeneratedDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtNarrativeTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtNarrativeTemplate() {
        return evtNarrativeTemplate;
    }

    /**
     * Sets the value of the evtNarrativeTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtNarrativeTemplate(JAXBElement<String> value) {
        this.evtNarrativeTemplate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evtVideoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvtVideoUrl() {
        return evtVideoUrl;
    }

    /**
     * Sets the value of the evtVideoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvtVideoUrl(JAXBElement<String> value) {
        this.evtVideoUrl = ((JAXBElement<String> ) value);
    }

}
