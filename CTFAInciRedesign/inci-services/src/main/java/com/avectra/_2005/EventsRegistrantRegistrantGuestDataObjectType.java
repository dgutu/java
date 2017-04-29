
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrant_RegistrantGuest_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrant_RegistrantGuest_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rg2__reg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_egp_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_evt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_badge_name" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_url_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_pref_comm_meth" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_rgt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_on_wait_list_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_confirm_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_attendance_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_ada_requirements" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_ivd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_inv_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_org_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_adr_city" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_adr_state" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_adr_country" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_adr_intl_province" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_ixo_title_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_ixo_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_registration_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_cancel_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_cancel_reason" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_exam_result" type="{http://www.avectra.com/2005/}stringLength7_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_examinee_no" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_badge_print_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_reg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_id" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_odd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_ord_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_complimentary_event_registered_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_gft_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_fundraising_goal" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_guest_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_passkey_bridgeID_ext" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_passkey_link_ext" type="{http://www.avectra.com/2005/}stringLength400_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_time_in" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_time_out" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_narrative" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_leaderboard_suppress_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_leaderboard_suppress_amount" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="rg2__reg_video_url" type="{http://www.avectra.com/2005/}av_url_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrant_RegistrantGuest_DataObjectType", propOrder = {
    "rg2RegKey",
    "rg2RegCstKey",
    "rg2RegEgpKey",
    "rg2RegEvtKey",
    "rg2RegBadgeName",
    "rg2RegCxaKey",
    "rg2RegCphKey",
    "rg2RegEmlKey",
    "rg2RegCfxKey",
    "rg2RegUrlKey",
    "rg2RegPrefCommMeth",
    "rg2RegRgtKey",
    "rg2RegOnWaitListFlag",
    "rg2RegConfirmDate",
    "rg2RegAttendanceFlag",
    "rg2RegAdaRequirements",
    "rg2RegAddUser",
    "rg2RegAddDate",
    "rg2RegChangeUser",
    "rg2RegIvdKey",
    "rg2RegChangeDate",
    "rg2RegInvCode",
    "rg2RegDeleteFlag",
    "rg2RegOrgNameDn",
    "rg2RegAdrCity",
    "rg2RegKeyExt",
    "rg2RegAdrState",
    "rg2RegAdrCountry",
    "rg2RegAdrIntlProvince",
    "rg2RegIxoTitleDn",
    "rg2RegSrcKey",
    "rg2RegIxoKey",
    "rg2RegRegistrationDate",
    "rg2RegCancelDate",
    "rg2RegEntityKey",
    "rg2RegCancelReason",
    "rg2RegExamResult",
    "rg2RegExamineeNo",
    "rg2RegBadgePrintDate",
    "rg2RegRegKey",
    "rg2RegId",
    "rg2RegOddKey",
    "rg2RegOrdCode",
    "rg2RegComplimentaryEventRegisteredFlag",
    "rg2RegGftKey",
    "rg2RegFundraisingGoal",
    "rg2RegGuestFlag",
    "rg2RegPasskeyBridgeIDExt",
    "rg2RegPasskeyLinkExt",
    "rg2RegTimeIn",
    "rg2RegTimeOut",
    "rg2RegNarrative",
    "rg2RegLeaderboardSuppressFlag",
    "rg2RegLeaderboardSuppressAmount",
    "rg2RegVideoUrl"
})
public class EventsRegistrantRegistrantGuestDataObjectType {

    @XmlElementRef(name = "rg2__reg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegKey;
    @XmlElementRef(name = "rg2__reg_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegCstKey;
    @XmlElementRef(name = "rg2__reg_egp_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegEgpKey;
    @XmlElementRef(name = "rg2__reg_evt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegEvtKey;
    @XmlElementRef(name = "rg2__reg_badge_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegBadgeName;
    @XmlElementRef(name = "rg2__reg_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegCxaKey;
    @XmlElementRef(name = "rg2__reg_cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegCphKey;
    @XmlElementRef(name = "rg2__reg_eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegEmlKey;
    @XmlElementRef(name = "rg2__reg_cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegCfxKey;
    @XmlElementRef(name = "rg2__reg_url_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegUrlKey;
    @XmlElementRef(name = "rg2__reg_pref_comm_meth", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegPrefCommMeth;
    @XmlElementRef(name = "rg2__reg_rgt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegRgtKey;
    @XmlElementRef(name = "rg2__reg_on_wait_list_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rg2RegOnWaitListFlag;
    @XmlElementRef(name = "rg2__reg_confirm_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegConfirmDate;
    @XmlElementRef(name = "rg2__reg_attendance_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rg2RegAttendanceFlag;
    @XmlElementRef(name = "rg2__reg_ada_requirements", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegAdaRequirements;
    @XmlElementRef(name = "rg2__reg_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegAddUser;
    @XmlElementRef(name = "rg2__reg_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegAddDate;
    @XmlElementRef(name = "rg2__reg_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegChangeUser;
    @XmlElementRef(name = "rg2__reg_ivd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegIvdKey;
    @XmlElementRef(name = "rg2__reg_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegChangeDate;
    @XmlElementRef(name = "rg2__reg_inv_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegInvCode;
    @XmlElementRef(name = "rg2__reg_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rg2RegDeleteFlag;
    @XmlElementRef(name = "rg2__reg_org_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegOrgNameDn;
    @XmlElementRef(name = "rg2__reg_adr_city", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegAdrCity;
    @XmlElementRef(name = "rg2__reg_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegKeyExt;
    @XmlElementRef(name = "rg2__reg_adr_state", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegAdrState;
    @XmlElementRef(name = "rg2__reg_adr_country", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegAdrCountry;
    @XmlElementRef(name = "rg2__reg_adr_intl_province", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegAdrIntlProvince;
    @XmlElementRef(name = "rg2__reg_ixo_title_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegIxoTitleDn;
    @XmlElementRef(name = "rg2__reg_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegSrcKey;
    @XmlElementRef(name = "rg2__reg_ixo_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegIxoKey;
    @XmlElementRef(name = "rg2__reg_registration_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegRegistrationDate;
    @XmlElementRef(name = "rg2__reg_cancel_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegCancelDate;
    @XmlElementRef(name = "rg2__reg_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegEntityKey;
    @XmlElementRef(name = "rg2__reg_cancel_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegCancelReason;
    @XmlElementRef(name = "rg2__reg_exam_result", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegExamResult;
    @XmlElementRef(name = "rg2__reg_examinee_no", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> rg2RegExamineeNo;
    @XmlElementRef(name = "rg2__reg_badge_print_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegBadgePrintDate;
    @XmlElementRef(name = "rg2__reg_reg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegRegKey;
    @XmlElementRef(name = "rg2__reg_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegId;
    @XmlElementRef(name = "rg2__reg_odd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegOddKey;
    @XmlElementRef(name = "rg2__reg_ord_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegOrdCode;
    @XmlElementRef(name = "rg2__reg_complimentary_event_registered_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rg2RegComplimentaryEventRegisteredFlag;
    @XmlElementRef(name = "rg2__reg_gft_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegGftKey;
    @XmlElementRef(name = "rg2__reg_fundraising_goal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> rg2RegFundraisingGoal;
    @XmlElementRef(name = "rg2__reg_guest_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rg2RegGuestFlag;
    @XmlElementRef(name = "rg2__reg_passkey_bridgeID_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegPasskeyBridgeIDExt;
    @XmlElementRef(name = "rg2__reg_passkey_link_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegPasskeyLinkExt;
    @XmlElementRef(name = "rg2__reg_time_in", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegTimeIn;
    @XmlElementRef(name = "rg2__reg_time_out", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegTimeOut;
    @XmlElementRef(name = "rg2__reg_narrative", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegNarrative;
    @XmlElementRef(name = "rg2__reg_leaderboard_suppress_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rg2RegLeaderboardSuppressFlag;
    @XmlElementRef(name = "rg2__reg_leaderboard_suppress_amount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rg2RegLeaderboardSuppressAmount;
    @XmlElementRef(name = "rg2__reg_video_url", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rg2RegVideoUrl;

    /**
     * Gets the value of the rg2RegKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegKey() {
        return rg2RegKey;
    }

    /**
     * Sets the value of the rg2RegKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegKey(JAXBElement<String> value) {
        this.rg2RegKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegCstKey() {
        return rg2RegCstKey;
    }

    /**
     * Sets the value of the rg2RegCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegCstKey(JAXBElement<String> value) {
        this.rg2RegCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegEgpKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegEgpKey() {
        return rg2RegEgpKey;
    }

    /**
     * Sets the value of the rg2RegEgpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegEgpKey(JAXBElement<String> value) {
        this.rg2RegEgpKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegEvtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegEvtKey() {
        return rg2RegEvtKey;
    }

    /**
     * Sets the value of the rg2RegEvtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegEvtKey(JAXBElement<String> value) {
        this.rg2RegEvtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegBadgeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegBadgeName() {
        return rg2RegBadgeName;
    }

    /**
     * Sets the value of the rg2RegBadgeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegBadgeName(JAXBElement<String> value) {
        this.rg2RegBadgeName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegCxaKey() {
        return rg2RegCxaKey;
    }

    /**
     * Sets the value of the rg2RegCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegCxaKey(JAXBElement<String> value) {
        this.rg2RegCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegCphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegCphKey() {
        return rg2RegCphKey;
    }

    /**
     * Sets the value of the rg2RegCphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegCphKey(JAXBElement<String> value) {
        this.rg2RegCphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegEmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegEmlKey() {
        return rg2RegEmlKey;
    }

    /**
     * Sets the value of the rg2RegEmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegEmlKey(JAXBElement<String> value) {
        this.rg2RegEmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegCfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegCfxKey() {
        return rg2RegCfxKey;
    }

    /**
     * Sets the value of the rg2RegCfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegCfxKey(JAXBElement<String> value) {
        this.rg2RegCfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegUrlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegUrlKey() {
        return rg2RegUrlKey;
    }

    /**
     * Sets the value of the rg2RegUrlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegUrlKey(JAXBElement<String> value) {
        this.rg2RegUrlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegPrefCommMeth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegPrefCommMeth() {
        return rg2RegPrefCommMeth;
    }

    /**
     * Sets the value of the rg2RegPrefCommMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegPrefCommMeth(JAXBElement<String> value) {
        this.rg2RegPrefCommMeth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegRgtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegRgtKey() {
        return rg2RegRgtKey;
    }

    /**
     * Sets the value of the rg2RegRgtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegRgtKey(JAXBElement<String> value) {
        this.rg2RegRgtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegOnWaitListFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRg2RegOnWaitListFlag() {
        return rg2RegOnWaitListFlag;
    }

    /**
     * Sets the value of the rg2RegOnWaitListFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRg2RegOnWaitListFlag(JAXBElement<Short> value) {
        this.rg2RegOnWaitListFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rg2RegConfirmDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegConfirmDate() {
        return rg2RegConfirmDate;
    }

    /**
     * Sets the value of the rg2RegConfirmDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegConfirmDate(JAXBElement<String> value) {
        this.rg2RegConfirmDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegAttendanceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRg2RegAttendanceFlag() {
        return rg2RegAttendanceFlag;
    }

    /**
     * Sets the value of the rg2RegAttendanceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRg2RegAttendanceFlag(JAXBElement<Short> value) {
        this.rg2RegAttendanceFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rg2RegAdaRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegAdaRequirements() {
        return rg2RegAdaRequirements;
    }

    /**
     * Sets the value of the rg2RegAdaRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegAdaRequirements(JAXBElement<String> value) {
        this.rg2RegAdaRequirements = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegAddUser() {
        return rg2RegAddUser;
    }

    /**
     * Sets the value of the rg2RegAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegAddUser(JAXBElement<String> value) {
        this.rg2RegAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegAddDate() {
        return rg2RegAddDate;
    }

    /**
     * Sets the value of the rg2RegAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegAddDate(JAXBElement<String> value) {
        this.rg2RegAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegChangeUser() {
        return rg2RegChangeUser;
    }

    /**
     * Sets the value of the rg2RegChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegChangeUser(JAXBElement<String> value) {
        this.rg2RegChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegIvdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegIvdKey() {
        return rg2RegIvdKey;
    }

    /**
     * Sets the value of the rg2RegIvdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegIvdKey(JAXBElement<String> value) {
        this.rg2RegIvdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegChangeDate() {
        return rg2RegChangeDate;
    }

    /**
     * Sets the value of the rg2RegChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegChangeDate(JAXBElement<String> value) {
        this.rg2RegChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegInvCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegInvCode() {
        return rg2RegInvCode;
    }

    /**
     * Sets the value of the rg2RegInvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegInvCode(JAXBElement<String> value) {
        this.rg2RegInvCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRg2RegDeleteFlag() {
        return rg2RegDeleteFlag;
    }

    /**
     * Sets the value of the rg2RegDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRg2RegDeleteFlag(JAXBElement<Short> value) {
        this.rg2RegDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rg2RegOrgNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegOrgNameDn() {
        return rg2RegOrgNameDn;
    }

    /**
     * Sets the value of the rg2RegOrgNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegOrgNameDn(JAXBElement<String> value) {
        this.rg2RegOrgNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegAdrCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegAdrCity() {
        return rg2RegAdrCity;
    }

    /**
     * Sets the value of the rg2RegAdrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegAdrCity(JAXBElement<String> value) {
        this.rg2RegAdrCity = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegKeyExt() {
        return rg2RegKeyExt;
    }

    /**
     * Sets the value of the rg2RegKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegKeyExt(JAXBElement<String> value) {
        this.rg2RegKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegAdrState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegAdrState() {
        return rg2RegAdrState;
    }

    /**
     * Sets the value of the rg2RegAdrState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegAdrState(JAXBElement<String> value) {
        this.rg2RegAdrState = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegAdrCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegAdrCountry() {
        return rg2RegAdrCountry;
    }

    /**
     * Sets the value of the rg2RegAdrCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegAdrCountry(JAXBElement<String> value) {
        this.rg2RegAdrCountry = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegAdrIntlProvince property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegAdrIntlProvince() {
        return rg2RegAdrIntlProvince;
    }

    /**
     * Sets the value of the rg2RegAdrIntlProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegAdrIntlProvince(JAXBElement<String> value) {
        this.rg2RegAdrIntlProvince = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegIxoTitleDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegIxoTitleDn() {
        return rg2RegIxoTitleDn;
    }

    /**
     * Sets the value of the rg2RegIxoTitleDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegIxoTitleDn(JAXBElement<String> value) {
        this.rg2RegIxoTitleDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegSrcKey() {
        return rg2RegSrcKey;
    }

    /**
     * Sets the value of the rg2RegSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegSrcKey(JAXBElement<String> value) {
        this.rg2RegSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegIxoKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegIxoKey() {
        return rg2RegIxoKey;
    }

    /**
     * Sets the value of the rg2RegIxoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegIxoKey(JAXBElement<String> value) {
        this.rg2RegIxoKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegRegistrationDate() {
        return rg2RegRegistrationDate;
    }

    /**
     * Sets the value of the rg2RegRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegRegistrationDate(JAXBElement<String> value) {
        this.rg2RegRegistrationDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegCancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegCancelDate() {
        return rg2RegCancelDate;
    }

    /**
     * Sets the value of the rg2RegCancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegCancelDate(JAXBElement<String> value) {
        this.rg2RegCancelDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegEntityKey() {
        return rg2RegEntityKey;
    }

    /**
     * Sets the value of the rg2RegEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegEntityKey(JAXBElement<String> value) {
        this.rg2RegEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegCancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegCancelReason() {
        return rg2RegCancelReason;
    }

    /**
     * Sets the value of the rg2RegCancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegCancelReason(JAXBElement<String> value) {
        this.rg2RegCancelReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegExamResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegExamResult() {
        return rg2RegExamResult;
    }

    /**
     * Sets the value of the rg2RegExamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegExamResult(JAXBElement<String> value) {
        this.rg2RegExamResult = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegExamineeNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRg2RegExamineeNo() {
        return rg2RegExamineeNo;
    }

    /**
     * Sets the value of the rg2RegExamineeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRg2RegExamineeNo(JAXBElement<Integer> value) {
        this.rg2RegExamineeNo = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rg2RegBadgePrintDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegBadgePrintDate() {
        return rg2RegBadgePrintDate;
    }

    /**
     * Sets the value of the rg2RegBadgePrintDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegBadgePrintDate(JAXBElement<String> value) {
        this.rg2RegBadgePrintDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegRegKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegRegKey() {
        return rg2RegRegKey;
    }

    /**
     * Sets the value of the rg2RegRegKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegRegKey(JAXBElement<String> value) {
        this.rg2RegRegKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegId() {
        return rg2RegId;
    }

    /**
     * Sets the value of the rg2RegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegId(JAXBElement<String> value) {
        this.rg2RegId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegOddKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegOddKey() {
        return rg2RegOddKey;
    }

    /**
     * Sets the value of the rg2RegOddKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegOddKey(JAXBElement<String> value) {
        this.rg2RegOddKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegOrdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegOrdCode() {
        return rg2RegOrdCode;
    }

    /**
     * Sets the value of the rg2RegOrdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegOrdCode(JAXBElement<String> value) {
        this.rg2RegOrdCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegComplimentaryEventRegisteredFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRg2RegComplimentaryEventRegisteredFlag() {
        return rg2RegComplimentaryEventRegisteredFlag;
    }

    /**
     * Sets the value of the rg2RegComplimentaryEventRegisteredFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRg2RegComplimentaryEventRegisteredFlag(JAXBElement<Short> value) {
        this.rg2RegComplimentaryEventRegisteredFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rg2RegGftKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegGftKey() {
        return rg2RegGftKey;
    }

    /**
     * Sets the value of the rg2RegGftKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegGftKey(JAXBElement<String> value) {
        this.rg2RegGftKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegFundraisingGoal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRg2RegFundraisingGoal() {
        return rg2RegFundraisingGoal;
    }

    /**
     * Sets the value of the rg2RegFundraisingGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRg2RegFundraisingGoal(JAXBElement<BigDecimal> value) {
        this.rg2RegFundraisingGoal = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the rg2RegGuestFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRg2RegGuestFlag() {
        return rg2RegGuestFlag;
    }

    /**
     * Sets the value of the rg2RegGuestFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRg2RegGuestFlag(JAXBElement<Short> value) {
        this.rg2RegGuestFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rg2RegPasskeyBridgeIDExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegPasskeyBridgeIDExt() {
        return rg2RegPasskeyBridgeIDExt;
    }

    /**
     * Sets the value of the rg2RegPasskeyBridgeIDExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegPasskeyBridgeIDExt(JAXBElement<String> value) {
        this.rg2RegPasskeyBridgeIDExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegPasskeyLinkExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegPasskeyLinkExt() {
        return rg2RegPasskeyLinkExt;
    }

    /**
     * Sets the value of the rg2RegPasskeyLinkExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegPasskeyLinkExt(JAXBElement<String> value) {
        this.rg2RegPasskeyLinkExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegTimeIn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegTimeIn() {
        return rg2RegTimeIn;
    }

    /**
     * Sets the value of the rg2RegTimeIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegTimeIn(JAXBElement<String> value) {
        this.rg2RegTimeIn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegTimeOut property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegTimeOut() {
        return rg2RegTimeOut;
    }

    /**
     * Sets the value of the rg2RegTimeOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegTimeOut(JAXBElement<String> value) {
        this.rg2RegTimeOut = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegNarrative property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegNarrative() {
        return rg2RegNarrative;
    }

    /**
     * Sets the value of the rg2RegNarrative property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegNarrative(JAXBElement<String> value) {
        this.rg2RegNarrative = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rg2RegLeaderboardSuppressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRg2RegLeaderboardSuppressFlag() {
        return rg2RegLeaderboardSuppressFlag;
    }

    /**
     * Sets the value of the rg2RegLeaderboardSuppressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRg2RegLeaderboardSuppressFlag(JAXBElement<Short> value) {
        this.rg2RegLeaderboardSuppressFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rg2RegLeaderboardSuppressAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRg2RegLeaderboardSuppressAmount() {
        return rg2RegLeaderboardSuppressAmount;
    }

    /**
     * Sets the value of the rg2RegLeaderboardSuppressAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRg2RegLeaderboardSuppressAmount(JAXBElement<Short> value) {
        this.rg2RegLeaderboardSuppressAmount = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rg2RegVideoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRg2RegVideoUrl() {
        return rg2RegVideoUrl;
    }

    /**
     * Sets the value of the rg2RegVideoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRg2RegVideoUrl(JAXBElement<String> value) {
        this.rg2RegVideoUrl = ((JAXBElement<String> ) value);
    }

}
