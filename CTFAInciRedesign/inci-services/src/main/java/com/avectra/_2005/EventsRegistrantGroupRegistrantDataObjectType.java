
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrantGroup_Registrant_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrantGroup_Registrant_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="reg_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="reg_egp_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="reg_evt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="reg_badge_name" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="reg_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="reg_cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="reg_eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="reg_cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="reg_url_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="reg_pref_comm_meth" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="reg_rgt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="reg_on_wait_list_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="reg_confirm_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="reg_attendance_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="reg_ada_requirements" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="reg_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="reg_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="reg_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="reg_ivd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="reg_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="reg_inv_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="reg_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="reg_org_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="reg_adr_city" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="reg_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="reg_adr_state" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="reg_adr_country" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="reg_adr_intl_province" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="reg_ixo_title_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="reg_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="reg_ixo_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="reg_registration_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="reg_cancel_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="reg_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="reg_cancel_reason" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="reg_exam_result" type="{http://www.avectra.com/2005/}stringLength7_Type" minOccurs="0"/>
 *         &lt;element name="reg_examinee_no" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="reg_badge_print_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="reg_reg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="reg_id" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="reg_odd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="reg_ord_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="reg_complimentary_event_registered_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="reg_gft_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="reg_fundraising_goal" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="reg_guest_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="reg_passkey_bridgeID_ext" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="reg_passkey_link_ext" type="{http://www.avectra.com/2005/}stringLength400_Type" minOccurs="0"/>
 *         &lt;element name="reg_time_in" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="reg_time_out" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="reg_narrative" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="reg_leaderboard_suppress_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="reg_leaderboard_suppress_amount" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="reg_video_url" type="{http://www.avectra.com/2005/}av_url_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrantGroup_Registrant_DataObjectType", propOrder = {
    "regKey",
    "regCstKey",
    "regEgpKey",
    "regEvtKey",
    "regBadgeName",
    "regCxaKey",
    "regCphKey",
    "regEmlKey",
    "regCfxKey",
    "regUrlKey",
    "regPrefCommMeth",
    "regRgtKey",
    "regOnWaitListFlag",
    "regConfirmDate",
    "regAttendanceFlag",
    "regAdaRequirements",
    "regAddUser",
    "regAddDate",
    "regChangeUser",
    "regIvdKey",
    "regChangeDate",
    "regInvCode",
    "regDeleteFlag",
    "regOrgNameDn",
    "regAdrCity",
    "regKeyExt",
    "regAdrState",
    "regAdrCountry",
    "regAdrIntlProvince",
    "regIxoTitleDn",
    "regSrcKey",
    "regIxoKey",
    "regRegistrationDate",
    "regCancelDate",
    "regEntityKey",
    "regCancelReason",
    "regExamResult",
    "regExamineeNo",
    "regBadgePrintDate",
    "regRegKey",
    "regId",
    "regOddKey",
    "regOrdCode",
    "regComplimentaryEventRegisteredFlag",
    "regGftKey",
    "regFundraisingGoal",
    "regGuestFlag",
    "regPasskeyBridgeIDExt",
    "regPasskeyLinkExt",
    "regTimeIn",
    "regTimeOut",
    "regNarrative",
    "regLeaderboardSuppressFlag",
    "regLeaderboardSuppressAmount",
    "regVideoUrl"
})
public class EventsRegistrantGroupRegistrantDataObjectType {

    @XmlElementRef(name = "reg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regKey;
    @XmlElementRef(name = "reg_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regCstKey;
    @XmlElementRef(name = "reg_egp_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regEgpKey;
    @XmlElementRef(name = "reg_evt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regEvtKey;
    @XmlElementRef(name = "reg_badge_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regBadgeName;
    @XmlElementRef(name = "reg_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regCxaKey;
    @XmlElementRef(name = "reg_cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regCphKey;
    @XmlElementRef(name = "reg_eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regEmlKey;
    @XmlElementRef(name = "reg_cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regCfxKey;
    @XmlElementRef(name = "reg_url_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regUrlKey;
    @XmlElementRef(name = "reg_pref_comm_meth", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regPrefCommMeth;
    @XmlElementRef(name = "reg_rgt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regRgtKey;
    @XmlElementRef(name = "reg_on_wait_list_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> regOnWaitListFlag;
    @XmlElementRef(name = "reg_confirm_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regConfirmDate;
    @XmlElementRef(name = "reg_attendance_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> regAttendanceFlag;
    @XmlElementRef(name = "reg_ada_requirements", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regAdaRequirements;
    @XmlElementRef(name = "reg_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regAddUser;
    @XmlElementRef(name = "reg_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regAddDate;
    @XmlElementRef(name = "reg_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regChangeUser;
    @XmlElementRef(name = "reg_ivd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regIvdKey;
    @XmlElementRef(name = "reg_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regChangeDate;
    @XmlElementRef(name = "reg_inv_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regInvCode;
    @XmlElementRef(name = "reg_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> regDeleteFlag;
    @XmlElementRef(name = "reg_org_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regOrgNameDn;
    @XmlElementRef(name = "reg_adr_city", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regAdrCity;
    @XmlElementRef(name = "reg_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regKeyExt;
    @XmlElementRef(name = "reg_adr_state", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regAdrState;
    @XmlElementRef(name = "reg_adr_country", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regAdrCountry;
    @XmlElementRef(name = "reg_adr_intl_province", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regAdrIntlProvince;
    @XmlElementRef(name = "reg_ixo_title_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regIxoTitleDn;
    @XmlElementRef(name = "reg_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regSrcKey;
    @XmlElementRef(name = "reg_ixo_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regIxoKey;
    @XmlElementRef(name = "reg_registration_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regRegistrationDate;
    @XmlElementRef(name = "reg_cancel_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regCancelDate;
    @XmlElementRef(name = "reg_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regEntityKey;
    @XmlElementRef(name = "reg_cancel_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regCancelReason;
    @XmlElementRef(name = "reg_exam_result", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regExamResult;
    @XmlElementRef(name = "reg_examinee_no", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> regExamineeNo;
    @XmlElementRef(name = "reg_badge_print_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regBadgePrintDate;
    @XmlElementRef(name = "reg_reg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regRegKey;
    @XmlElementRef(name = "reg_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regId;
    @XmlElementRef(name = "reg_odd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regOddKey;
    @XmlElementRef(name = "reg_ord_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regOrdCode;
    @XmlElementRef(name = "reg_complimentary_event_registered_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> regComplimentaryEventRegisteredFlag;
    @XmlElementRef(name = "reg_gft_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regGftKey;
    @XmlElementRef(name = "reg_fundraising_goal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> regFundraisingGoal;
    @XmlElementRef(name = "reg_guest_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> regGuestFlag;
    @XmlElementRef(name = "reg_passkey_bridgeID_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regPasskeyBridgeIDExt;
    @XmlElementRef(name = "reg_passkey_link_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regPasskeyLinkExt;
    @XmlElementRef(name = "reg_time_in", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regTimeIn;
    @XmlElementRef(name = "reg_time_out", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regTimeOut;
    @XmlElementRef(name = "reg_narrative", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regNarrative;
    @XmlElementRef(name = "reg_leaderboard_suppress_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> regLeaderboardSuppressFlag;
    @XmlElementRef(name = "reg_leaderboard_suppress_amount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> regLeaderboardSuppressAmount;
    @XmlElementRef(name = "reg_video_url", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> regVideoUrl;

    /**
     * Gets the value of the regKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegKey() {
        return regKey;
    }

    /**
     * Sets the value of the regKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegKey(JAXBElement<String> value) {
        this.regKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegCstKey() {
        return regCstKey;
    }

    /**
     * Sets the value of the regCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegCstKey(JAXBElement<String> value) {
        this.regCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regEgpKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegEgpKey() {
        return regEgpKey;
    }

    /**
     * Sets the value of the regEgpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegEgpKey(JAXBElement<String> value) {
        this.regEgpKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regEvtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegEvtKey() {
        return regEvtKey;
    }

    /**
     * Sets the value of the regEvtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegEvtKey(JAXBElement<String> value) {
        this.regEvtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regBadgeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegBadgeName() {
        return regBadgeName;
    }

    /**
     * Sets the value of the regBadgeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegBadgeName(JAXBElement<String> value) {
        this.regBadgeName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegCxaKey() {
        return regCxaKey;
    }

    /**
     * Sets the value of the regCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegCxaKey(JAXBElement<String> value) {
        this.regCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regCphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegCphKey() {
        return regCphKey;
    }

    /**
     * Sets the value of the regCphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegCphKey(JAXBElement<String> value) {
        this.regCphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regEmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegEmlKey() {
        return regEmlKey;
    }

    /**
     * Sets the value of the regEmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegEmlKey(JAXBElement<String> value) {
        this.regEmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regCfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegCfxKey() {
        return regCfxKey;
    }

    /**
     * Sets the value of the regCfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegCfxKey(JAXBElement<String> value) {
        this.regCfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regUrlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegUrlKey() {
        return regUrlKey;
    }

    /**
     * Sets the value of the regUrlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegUrlKey(JAXBElement<String> value) {
        this.regUrlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regPrefCommMeth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegPrefCommMeth() {
        return regPrefCommMeth;
    }

    /**
     * Sets the value of the regPrefCommMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegPrefCommMeth(JAXBElement<String> value) {
        this.regPrefCommMeth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regRgtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegRgtKey() {
        return regRgtKey;
    }

    /**
     * Sets the value of the regRgtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegRgtKey(JAXBElement<String> value) {
        this.regRgtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regOnWaitListFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRegOnWaitListFlag() {
        return regOnWaitListFlag;
    }

    /**
     * Sets the value of the regOnWaitListFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRegOnWaitListFlag(JAXBElement<Short> value) {
        this.regOnWaitListFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the regConfirmDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegConfirmDate() {
        return regConfirmDate;
    }

    /**
     * Sets the value of the regConfirmDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegConfirmDate(JAXBElement<String> value) {
        this.regConfirmDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regAttendanceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRegAttendanceFlag() {
        return regAttendanceFlag;
    }

    /**
     * Sets the value of the regAttendanceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRegAttendanceFlag(JAXBElement<Short> value) {
        this.regAttendanceFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the regAdaRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegAdaRequirements() {
        return regAdaRequirements;
    }

    /**
     * Sets the value of the regAdaRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegAdaRequirements(JAXBElement<String> value) {
        this.regAdaRequirements = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegAddUser() {
        return regAddUser;
    }

    /**
     * Sets the value of the regAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegAddUser(JAXBElement<String> value) {
        this.regAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegAddDate() {
        return regAddDate;
    }

    /**
     * Sets the value of the regAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegAddDate(JAXBElement<String> value) {
        this.regAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegChangeUser() {
        return regChangeUser;
    }

    /**
     * Sets the value of the regChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegChangeUser(JAXBElement<String> value) {
        this.regChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regIvdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegIvdKey() {
        return regIvdKey;
    }

    /**
     * Sets the value of the regIvdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegIvdKey(JAXBElement<String> value) {
        this.regIvdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegChangeDate() {
        return regChangeDate;
    }

    /**
     * Sets the value of the regChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegChangeDate(JAXBElement<String> value) {
        this.regChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regInvCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegInvCode() {
        return regInvCode;
    }

    /**
     * Sets the value of the regInvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegInvCode(JAXBElement<String> value) {
        this.regInvCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRegDeleteFlag() {
        return regDeleteFlag;
    }

    /**
     * Sets the value of the regDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRegDeleteFlag(JAXBElement<Short> value) {
        this.regDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the regOrgNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegOrgNameDn() {
        return regOrgNameDn;
    }

    /**
     * Sets the value of the regOrgNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegOrgNameDn(JAXBElement<String> value) {
        this.regOrgNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regAdrCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegAdrCity() {
        return regAdrCity;
    }

    /**
     * Sets the value of the regAdrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegAdrCity(JAXBElement<String> value) {
        this.regAdrCity = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegKeyExt() {
        return regKeyExt;
    }

    /**
     * Sets the value of the regKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegKeyExt(JAXBElement<String> value) {
        this.regKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regAdrState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegAdrState() {
        return regAdrState;
    }

    /**
     * Sets the value of the regAdrState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegAdrState(JAXBElement<String> value) {
        this.regAdrState = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regAdrCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegAdrCountry() {
        return regAdrCountry;
    }

    /**
     * Sets the value of the regAdrCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegAdrCountry(JAXBElement<String> value) {
        this.regAdrCountry = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regAdrIntlProvince property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegAdrIntlProvince() {
        return regAdrIntlProvince;
    }

    /**
     * Sets the value of the regAdrIntlProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegAdrIntlProvince(JAXBElement<String> value) {
        this.regAdrIntlProvince = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regIxoTitleDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegIxoTitleDn() {
        return regIxoTitleDn;
    }

    /**
     * Sets the value of the regIxoTitleDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegIxoTitleDn(JAXBElement<String> value) {
        this.regIxoTitleDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegSrcKey() {
        return regSrcKey;
    }

    /**
     * Sets the value of the regSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegSrcKey(JAXBElement<String> value) {
        this.regSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regIxoKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegIxoKey() {
        return regIxoKey;
    }

    /**
     * Sets the value of the regIxoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegIxoKey(JAXBElement<String> value) {
        this.regIxoKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegRegistrationDate() {
        return regRegistrationDate;
    }

    /**
     * Sets the value of the regRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegRegistrationDate(JAXBElement<String> value) {
        this.regRegistrationDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regCancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegCancelDate() {
        return regCancelDate;
    }

    /**
     * Sets the value of the regCancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegCancelDate(JAXBElement<String> value) {
        this.regCancelDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegEntityKey() {
        return regEntityKey;
    }

    /**
     * Sets the value of the regEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegEntityKey(JAXBElement<String> value) {
        this.regEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regCancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegCancelReason() {
        return regCancelReason;
    }

    /**
     * Sets the value of the regCancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegCancelReason(JAXBElement<String> value) {
        this.regCancelReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regExamResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegExamResult() {
        return regExamResult;
    }

    /**
     * Sets the value of the regExamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegExamResult(JAXBElement<String> value) {
        this.regExamResult = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regExamineeNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRegExamineeNo() {
        return regExamineeNo;
    }

    /**
     * Sets the value of the regExamineeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRegExamineeNo(JAXBElement<Integer> value) {
        this.regExamineeNo = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the regBadgePrintDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegBadgePrintDate() {
        return regBadgePrintDate;
    }

    /**
     * Sets the value of the regBadgePrintDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegBadgePrintDate(JAXBElement<String> value) {
        this.regBadgePrintDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regRegKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegRegKey() {
        return regRegKey;
    }

    /**
     * Sets the value of the regRegKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegRegKey(JAXBElement<String> value) {
        this.regRegKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegId() {
        return regId;
    }

    /**
     * Sets the value of the regId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegId(JAXBElement<String> value) {
        this.regId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regOddKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegOddKey() {
        return regOddKey;
    }

    /**
     * Sets the value of the regOddKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegOddKey(JAXBElement<String> value) {
        this.regOddKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regOrdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegOrdCode() {
        return regOrdCode;
    }

    /**
     * Sets the value of the regOrdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegOrdCode(JAXBElement<String> value) {
        this.regOrdCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regComplimentaryEventRegisteredFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRegComplimentaryEventRegisteredFlag() {
        return regComplimentaryEventRegisteredFlag;
    }

    /**
     * Sets the value of the regComplimentaryEventRegisteredFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRegComplimentaryEventRegisteredFlag(JAXBElement<Short> value) {
        this.regComplimentaryEventRegisteredFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the regGftKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegGftKey() {
        return regGftKey;
    }

    /**
     * Sets the value of the regGftKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegGftKey(JAXBElement<String> value) {
        this.regGftKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regFundraisingGoal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRegFundraisingGoal() {
        return regFundraisingGoal;
    }

    /**
     * Sets the value of the regFundraisingGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRegFundraisingGoal(JAXBElement<BigDecimal> value) {
        this.regFundraisingGoal = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the regGuestFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRegGuestFlag() {
        return regGuestFlag;
    }

    /**
     * Sets the value of the regGuestFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRegGuestFlag(JAXBElement<Short> value) {
        this.regGuestFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the regPasskeyBridgeIDExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegPasskeyBridgeIDExt() {
        return regPasskeyBridgeIDExt;
    }

    /**
     * Sets the value of the regPasskeyBridgeIDExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegPasskeyBridgeIDExt(JAXBElement<String> value) {
        this.regPasskeyBridgeIDExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regPasskeyLinkExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegPasskeyLinkExt() {
        return regPasskeyLinkExt;
    }

    /**
     * Sets the value of the regPasskeyLinkExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegPasskeyLinkExt(JAXBElement<String> value) {
        this.regPasskeyLinkExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regTimeIn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegTimeIn() {
        return regTimeIn;
    }

    /**
     * Sets the value of the regTimeIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegTimeIn(JAXBElement<String> value) {
        this.regTimeIn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regTimeOut property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegTimeOut() {
        return regTimeOut;
    }

    /**
     * Sets the value of the regTimeOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegTimeOut(JAXBElement<String> value) {
        this.regTimeOut = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regNarrative property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegNarrative() {
        return regNarrative;
    }

    /**
     * Sets the value of the regNarrative property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegNarrative(JAXBElement<String> value) {
        this.regNarrative = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regLeaderboardSuppressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRegLeaderboardSuppressFlag() {
        return regLeaderboardSuppressFlag;
    }

    /**
     * Sets the value of the regLeaderboardSuppressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRegLeaderboardSuppressFlag(JAXBElement<Short> value) {
        this.regLeaderboardSuppressFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the regLeaderboardSuppressAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRegLeaderboardSuppressAmount() {
        return regLeaderboardSuppressAmount;
    }

    /**
     * Sets the value of the regLeaderboardSuppressAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRegLeaderboardSuppressAmount(JAXBElement<Short> value) {
        this.regLeaderboardSuppressAmount = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the regVideoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegVideoUrl() {
        return regVideoUrl;
    }

    /**
     * Sets the value of the regVideoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegVideoUrl(JAXBElement<String> value) {
        this.regVideoUrl = ((JAXBElement<String> ) value);
    }

}
