
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactRequest_Org_Request_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactRequest_Org_Request_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cs3__cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_type" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_name_cp" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_sort_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_ind_full_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_org_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_ixo_title_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_pref_comm_meth" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_bio" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_recno" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_id" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_email_text_only" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_credit_limit" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_src_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_tax_exempt_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_tax_id" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_no_email_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_cxa_billing_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_eml_address_dn" type="{http://www.avectra.com/2005/}av_email_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_no_phone_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_phn_number_complete_dn" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_no_fax_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_fax_number_complete_dn" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_ixo_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_no_web_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_oldid" type="{http://www.avectra.com/2005/}stringLength15_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_member_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_url_code_dn" type="{http://www.avectra.com/2005/}av_url_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_parent_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_url_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_no_msg_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_msg_handle_dn" type="{http://www.avectra.com/2005/}av_messaging_name_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_web_login" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_web_password" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_msg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_no_mail_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_web_start_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_web_end_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_web_force_password_change" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_web_login_disabled_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_comment" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_credit_hold_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_credit_hold_reason" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_web_forgot_password_status" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_old_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_last_email_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_no_publish_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_sin_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_ttl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_jfn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_cur_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_attribute_1" type="{http://www.avectra.com/2005/}stringLength510_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_attribute_2" type="{http://www.avectra.com/2005/}stringLength510_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_do_not_include_directory_ext_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_salutation_1" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_source_ext" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_salutation_2" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_grace_period_ext" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_merge_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_salutation_3" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_salutation_4" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_default_recognize_as" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_score" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_score_normalized" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_score_trend" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_vault_account" type="{http://www.avectra.com/2005/}stringLength25_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_exclude_from_social_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_social_score" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_ptin" type="{http://www.avectra.com/2005/}stringLength9_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_aicpa_member_id" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_vendor_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cs3__cst_sca_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactRequest_Org_Request_DataObjectType", propOrder = {
    "cs3CstKey",
    "cs3CstType",
    "cs3CstNameCp",
    "cs3CstSortNameDn",
    "cs3CstIndFullNameDn",
    "cs3CstOrgNameDn",
    "cs3CstIxoTitleDn",
    "cs3CstPrefCommMeth",
    "cs3CstBio",
    "cs3CstAddDate",
    "cs3CstAddUser",
    "cs3CstChangeDate",
    "cs3CstChangeUser",
    "cs3CstDeleteFlag",
    "cs3CstRecno",
    "cs3CstId",
    "cs3CstKeyExt",
    "cs3CstEmailTextOnly",
    "cs3CstCreditLimit",
    "cs3CstSrcKey",
    "cs3CstSrcCode",
    "cs3CstTaxExemptFlag",
    "cs3CstTaxId",
    "cs3CstCxaKey",
    "cs3CstNoEmailFlag",
    "cs3CstCxaBillingKey",
    "cs3CstEmlAddressDn",
    "cs3CstEmlKey",
    "cs3CstNoPhoneFlag",
    "cs3CstPhnNumberCompleteDn",
    "cs3CstCphKey",
    "cs3CstNoFaxFlag",
    "cs3CstFaxNumberCompleteDn",
    "cs3CstCfxKey",
    "cs3CstIxoKey",
    "cs3CstNoWebFlag",
    "cs3CstOldid",
    "cs3CstMemberFlag",
    "cs3CstUrlCodeDn",
    "cs3CstParentCstKey",
    "cs3CstUrlKey",
    "cs3CstNoMsgFlag",
    "cs3CstMsgHandleDn",
    "cs3CstWebLogin",
    "cs3CstWebPassword",
    "cs3CstEntityKey",
    "cs3CstMsgKey",
    "cs3CstNoMailFlag",
    "cs3CstWebStartDate",
    "cs3CstWebEndDate",
    "cs3CstWebForcePasswordChange",
    "cs3CstWebLoginDisabledFlag",
    "cs3CstComment",
    "cs3CstCreditHoldFlag",
    "cs3CstCreditHoldReason",
    "cs3CstWebForgotPasswordStatus",
    "cs3CstOldCxaKey",
    "cs3CstLastEmailDate",
    "cs3CstNoPublishFlag",
    "cs3CstSinKey",
    "cs3CstTtlKey",
    "cs3CstJfnKey",
    "cs3CstCurKey",
    "cs3CstAttribute1",
    "cs3CstAttribute2",
    "cs3CstDoNotIncludeDirectoryExtFlag",
    "cs3CstSalutation1",
    "cs3CstSourceExt",
    "cs3CstSalutation2",
    "cs3CstGracePeriodExt",
    "cs3CstMergeCstKey",
    "cs3CstSalutation3",
    "cs3CstSalutation4",
    "cs3CstDefaultRecognizeAs",
    "cs3CstScore",
    "cs3CstScoreNormalized",
    "cs3CstScoreTrend",
    "cs3CstVaultAccount",
    "cs3CstExcludeFromSocialFlag",
    "cs3CstSocialScore",
    "cs3CstPtin",
    "cs3CstAicpaMemberId",
    "cs3CstVendorCode",
    "cs3CstScaKey"
})
public class ContactRequestOrgRequestDataObjectType {

    @XmlElementRef(name = "cs3__cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstKey;
    @XmlElementRef(name = "cs3__cst_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstType;
    @XmlElementRef(name = "cs3__cst_name_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstNameCp;
    @XmlElementRef(name = "cs3__cst_sort_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstSortNameDn;
    @XmlElementRef(name = "cs3__cst_ind_full_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstIndFullNameDn;
    @XmlElementRef(name = "cs3__cst_org_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstOrgNameDn;
    @XmlElementRef(name = "cs3__cst_ixo_title_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstIxoTitleDn;
    @XmlElementRef(name = "cs3__cst_pref_comm_meth", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstPrefCommMeth;
    @XmlElementRef(name = "cs3__cst_bio", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstBio;
    @XmlElementRef(name = "cs3__cst_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstAddDate;
    @XmlElementRef(name = "cs3__cst_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstAddUser;
    @XmlElementRef(name = "cs3__cst_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstChangeDate;
    @XmlElementRef(name = "cs3__cst_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstChangeUser;
    @XmlElementRef(name = "cs3__cst_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs3CstDeleteFlag;
    @XmlElementRef(name = "cs3__cst_recno", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> cs3CstRecno;
    @XmlElementRef(name = "cs3__cst_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstId;
    @XmlElementRef(name = "cs3__cst_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstKeyExt;
    @XmlElementRef(name = "cs3__cst_email_text_only", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs3CstEmailTextOnly;
    @XmlElementRef(name = "cs3__cst_credit_limit", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> cs3CstCreditLimit;
    @XmlElementRef(name = "cs3__cst_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstSrcKey;
    @XmlElementRef(name = "cs3__cst_src_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstSrcCode;
    @XmlElementRef(name = "cs3__cst_tax_exempt_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs3CstTaxExemptFlag;
    @XmlElementRef(name = "cs3__cst_tax_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstTaxId;
    @XmlElementRef(name = "cs3__cst_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstCxaKey;
    @XmlElementRef(name = "cs3__cst_no_email_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs3CstNoEmailFlag;
    @XmlElementRef(name = "cs3__cst_cxa_billing_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstCxaBillingKey;
    @XmlElementRef(name = "cs3__cst_eml_address_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstEmlAddressDn;
    @XmlElementRef(name = "cs3__cst_eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstEmlKey;
    @XmlElementRef(name = "cs3__cst_no_phone_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs3CstNoPhoneFlag;
    @XmlElementRef(name = "cs3__cst_phn_number_complete_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstPhnNumberCompleteDn;
    @XmlElementRef(name = "cs3__cst_cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstCphKey;
    @XmlElementRef(name = "cs3__cst_no_fax_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs3CstNoFaxFlag;
    @XmlElementRef(name = "cs3__cst_fax_number_complete_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstFaxNumberCompleteDn;
    @XmlElementRef(name = "cs3__cst_cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstCfxKey;
    @XmlElementRef(name = "cs3__cst_ixo_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstIxoKey;
    @XmlElementRef(name = "cs3__cst_no_web_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs3CstNoWebFlag;
    @XmlElementRef(name = "cs3__cst_oldid", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstOldid;
    @XmlElementRef(name = "cs3__cst_member_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs3CstMemberFlag;
    @XmlElementRef(name = "cs3__cst_url_code_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstUrlCodeDn;
    @XmlElementRef(name = "cs3__cst_parent_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstParentCstKey;
    @XmlElementRef(name = "cs3__cst_url_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstUrlKey;
    @XmlElementRef(name = "cs3__cst_no_msg_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs3CstNoMsgFlag;
    @XmlElementRef(name = "cs3__cst_msg_handle_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstMsgHandleDn;
    @XmlElementRef(name = "cs3__cst_web_login", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstWebLogin;
    @XmlElementRef(name = "cs3__cst_web_password", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstWebPassword;
    @XmlElementRef(name = "cs3__cst_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstEntityKey;
    @XmlElementRef(name = "cs3__cst_msg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstMsgKey;
    @XmlElementRef(name = "cs3__cst_no_mail_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs3CstNoMailFlag;
    @XmlElementRef(name = "cs3__cst_web_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstWebStartDate;
    @XmlElementRef(name = "cs3__cst_web_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstWebEndDate;
    @XmlElementRef(name = "cs3__cst_web_force_password_change", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs3CstWebForcePasswordChange;
    @XmlElementRef(name = "cs3__cst_web_login_disabled_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs3CstWebLoginDisabledFlag;
    @XmlElementRef(name = "cs3__cst_comment", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstComment;
    @XmlElementRef(name = "cs3__cst_credit_hold_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs3CstCreditHoldFlag;
    @XmlElementRef(name = "cs3__cst_credit_hold_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstCreditHoldReason;
    @XmlElementRef(name = "cs3__cst_web_forgot_password_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs3CstWebForgotPasswordStatus;
    @XmlElementRef(name = "cs3__cst_old_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstOldCxaKey;
    @XmlElementRef(name = "cs3__cst_last_email_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstLastEmailDate;
    @XmlElementRef(name = "cs3__cst_no_publish_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs3CstNoPublishFlag;
    @XmlElementRef(name = "cs3__cst_sin_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstSinKey;
    @XmlElementRef(name = "cs3__cst_ttl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstTtlKey;
    @XmlElementRef(name = "cs3__cst_jfn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstJfnKey;
    @XmlElementRef(name = "cs3__cst_cur_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstCurKey;
    @XmlElementRef(name = "cs3__cst_attribute_1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstAttribute1;
    @XmlElementRef(name = "cs3__cst_attribute_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstAttribute2;
    @XmlElementRef(name = "cs3__cst_do_not_include_directory_ext_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs3CstDoNotIncludeDirectoryExtFlag;
    @XmlElementRef(name = "cs3__cst_salutation_1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstSalutation1;
    @XmlElementRef(name = "cs3__cst_source_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstSourceExt;
    @XmlElementRef(name = "cs3__cst_salutation_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstSalutation2;
    @XmlElementRef(name = "cs3__cst_grace_period_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cs3CstGracePeriodExt;
    @XmlElementRef(name = "cs3__cst_merge_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstMergeCstKey;
    @XmlElementRef(name = "cs3__cst_salutation_3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstSalutation3;
    @XmlElementRef(name = "cs3__cst_salutation_4", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstSalutation4;
    @XmlElementRef(name = "cs3__cst_default_recognize_as", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstDefaultRecognizeAs;
    @XmlElementRef(name = "cs3__cst_score", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> cs3CstScore;
    @XmlElementRef(name = "cs3__cst_score_normalized", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cs3CstScoreNormalized;
    @XmlElementRef(name = "cs3__cst_score_trend", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cs3CstScoreTrend;
    @XmlElementRef(name = "cs3__cst_vault_account", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstVaultAccount;
    @XmlElementRef(name = "cs3__cst_exclude_from_social_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs3CstExcludeFromSocialFlag;
    @XmlElementRef(name = "cs3__cst_social_score", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cs3CstSocialScore;
    @XmlElementRef(name = "cs3__cst_ptin", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstPtin;
    @XmlElementRef(name = "cs3__cst_aicpa_member_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> cs3CstAicpaMemberId;
    @XmlElementRef(name = "cs3__cst_vendor_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstVendorCode;
    @XmlElementRef(name = "cs3__cst_sca_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs3CstScaKey;

    /**
     * Gets the value of the cs3CstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstKey() {
        return cs3CstKey;
    }

    /**
     * Sets the value of the cs3CstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstKey(JAXBElement<String> value) {
        this.cs3CstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstType() {
        return cs3CstType;
    }

    /**
     * Sets the value of the cs3CstType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstType(JAXBElement<String> value) {
        this.cs3CstType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstNameCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstNameCp() {
        return cs3CstNameCp;
    }

    /**
     * Sets the value of the cs3CstNameCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstNameCp(JAXBElement<String> value) {
        this.cs3CstNameCp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstSortNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstSortNameDn() {
        return cs3CstSortNameDn;
    }

    /**
     * Sets the value of the cs3CstSortNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstSortNameDn(JAXBElement<String> value) {
        this.cs3CstSortNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstIndFullNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstIndFullNameDn() {
        return cs3CstIndFullNameDn;
    }

    /**
     * Sets the value of the cs3CstIndFullNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstIndFullNameDn(JAXBElement<String> value) {
        this.cs3CstIndFullNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstOrgNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstOrgNameDn() {
        return cs3CstOrgNameDn;
    }

    /**
     * Sets the value of the cs3CstOrgNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstOrgNameDn(JAXBElement<String> value) {
        this.cs3CstOrgNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstIxoTitleDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstIxoTitleDn() {
        return cs3CstIxoTitleDn;
    }

    /**
     * Sets the value of the cs3CstIxoTitleDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstIxoTitleDn(JAXBElement<String> value) {
        this.cs3CstIxoTitleDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstPrefCommMeth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstPrefCommMeth() {
        return cs3CstPrefCommMeth;
    }

    /**
     * Sets the value of the cs3CstPrefCommMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstPrefCommMeth(JAXBElement<String> value) {
        this.cs3CstPrefCommMeth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstBio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstBio() {
        return cs3CstBio;
    }

    /**
     * Sets the value of the cs3CstBio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstBio(JAXBElement<String> value) {
        this.cs3CstBio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstAddDate() {
        return cs3CstAddDate;
    }

    /**
     * Sets the value of the cs3CstAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstAddDate(JAXBElement<String> value) {
        this.cs3CstAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstAddUser() {
        return cs3CstAddUser;
    }

    /**
     * Sets the value of the cs3CstAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstAddUser(JAXBElement<String> value) {
        this.cs3CstAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstChangeDate() {
        return cs3CstChangeDate;
    }

    /**
     * Sets the value of the cs3CstChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstChangeDate(JAXBElement<String> value) {
        this.cs3CstChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstChangeUser() {
        return cs3CstChangeUser;
    }

    /**
     * Sets the value of the cs3CstChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstChangeUser(JAXBElement<String> value) {
        this.cs3CstChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs3CstDeleteFlag() {
        return cs3CstDeleteFlag;
    }

    /**
     * Sets the value of the cs3CstDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs3CstDeleteFlag(JAXBElement<Short> value) {
        this.cs3CstDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs3CstRecno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCs3CstRecno() {
        return cs3CstRecno;
    }

    /**
     * Sets the value of the cs3CstRecno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCs3CstRecno(JAXBElement<Long> value) {
        this.cs3CstRecno = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the cs3CstId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstId() {
        return cs3CstId;
    }

    /**
     * Sets the value of the cs3CstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstId(JAXBElement<String> value) {
        this.cs3CstId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstKeyExt() {
        return cs3CstKeyExt;
    }

    /**
     * Sets the value of the cs3CstKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstKeyExt(JAXBElement<String> value) {
        this.cs3CstKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstEmailTextOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs3CstEmailTextOnly() {
        return cs3CstEmailTextOnly;
    }

    /**
     * Sets the value of the cs3CstEmailTextOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs3CstEmailTextOnly(JAXBElement<Short> value) {
        this.cs3CstEmailTextOnly = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs3CstCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCs3CstCreditLimit() {
        return cs3CstCreditLimit;
    }

    /**
     * Sets the value of the cs3CstCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCs3CstCreditLimit(JAXBElement<BigDecimal> value) {
        this.cs3CstCreditLimit = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the cs3CstSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstSrcKey() {
        return cs3CstSrcKey;
    }

    /**
     * Sets the value of the cs3CstSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstSrcKey(JAXBElement<String> value) {
        this.cs3CstSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstSrcCode() {
        return cs3CstSrcCode;
    }

    /**
     * Sets the value of the cs3CstSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstSrcCode(JAXBElement<String> value) {
        this.cs3CstSrcCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstTaxExemptFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs3CstTaxExemptFlag() {
        return cs3CstTaxExemptFlag;
    }

    /**
     * Sets the value of the cs3CstTaxExemptFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs3CstTaxExemptFlag(JAXBElement<Short> value) {
        this.cs3CstTaxExemptFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs3CstTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstTaxId() {
        return cs3CstTaxId;
    }

    /**
     * Sets the value of the cs3CstTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstTaxId(JAXBElement<String> value) {
        this.cs3CstTaxId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstCxaKey() {
        return cs3CstCxaKey;
    }

    /**
     * Sets the value of the cs3CstCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstCxaKey(JAXBElement<String> value) {
        this.cs3CstCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstNoEmailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs3CstNoEmailFlag() {
        return cs3CstNoEmailFlag;
    }

    /**
     * Sets the value of the cs3CstNoEmailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs3CstNoEmailFlag(JAXBElement<Short> value) {
        this.cs3CstNoEmailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs3CstCxaBillingKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstCxaBillingKey() {
        return cs3CstCxaBillingKey;
    }

    /**
     * Sets the value of the cs3CstCxaBillingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstCxaBillingKey(JAXBElement<String> value) {
        this.cs3CstCxaBillingKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstEmlAddressDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstEmlAddressDn() {
        return cs3CstEmlAddressDn;
    }

    /**
     * Sets the value of the cs3CstEmlAddressDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstEmlAddressDn(JAXBElement<String> value) {
        this.cs3CstEmlAddressDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstEmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstEmlKey() {
        return cs3CstEmlKey;
    }

    /**
     * Sets the value of the cs3CstEmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstEmlKey(JAXBElement<String> value) {
        this.cs3CstEmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstNoPhoneFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs3CstNoPhoneFlag() {
        return cs3CstNoPhoneFlag;
    }

    /**
     * Sets the value of the cs3CstNoPhoneFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs3CstNoPhoneFlag(JAXBElement<Short> value) {
        this.cs3CstNoPhoneFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs3CstPhnNumberCompleteDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstPhnNumberCompleteDn() {
        return cs3CstPhnNumberCompleteDn;
    }

    /**
     * Sets the value of the cs3CstPhnNumberCompleteDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstPhnNumberCompleteDn(JAXBElement<String> value) {
        this.cs3CstPhnNumberCompleteDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstCphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstCphKey() {
        return cs3CstCphKey;
    }

    /**
     * Sets the value of the cs3CstCphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstCphKey(JAXBElement<String> value) {
        this.cs3CstCphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstNoFaxFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs3CstNoFaxFlag() {
        return cs3CstNoFaxFlag;
    }

    /**
     * Sets the value of the cs3CstNoFaxFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs3CstNoFaxFlag(JAXBElement<Short> value) {
        this.cs3CstNoFaxFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs3CstFaxNumberCompleteDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstFaxNumberCompleteDn() {
        return cs3CstFaxNumberCompleteDn;
    }

    /**
     * Sets the value of the cs3CstFaxNumberCompleteDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstFaxNumberCompleteDn(JAXBElement<String> value) {
        this.cs3CstFaxNumberCompleteDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstCfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstCfxKey() {
        return cs3CstCfxKey;
    }

    /**
     * Sets the value of the cs3CstCfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstCfxKey(JAXBElement<String> value) {
        this.cs3CstCfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstIxoKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstIxoKey() {
        return cs3CstIxoKey;
    }

    /**
     * Sets the value of the cs3CstIxoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstIxoKey(JAXBElement<String> value) {
        this.cs3CstIxoKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstNoWebFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs3CstNoWebFlag() {
        return cs3CstNoWebFlag;
    }

    /**
     * Sets the value of the cs3CstNoWebFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs3CstNoWebFlag(JAXBElement<Short> value) {
        this.cs3CstNoWebFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs3CstOldid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstOldid() {
        return cs3CstOldid;
    }

    /**
     * Sets the value of the cs3CstOldid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstOldid(JAXBElement<String> value) {
        this.cs3CstOldid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstMemberFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs3CstMemberFlag() {
        return cs3CstMemberFlag;
    }

    /**
     * Sets the value of the cs3CstMemberFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs3CstMemberFlag(JAXBElement<Short> value) {
        this.cs3CstMemberFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs3CstUrlCodeDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstUrlCodeDn() {
        return cs3CstUrlCodeDn;
    }

    /**
     * Sets the value of the cs3CstUrlCodeDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstUrlCodeDn(JAXBElement<String> value) {
        this.cs3CstUrlCodeDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstParentCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstParentCstKey() {
        return cs3CstParentCstKey;
    }

    /**
     * Sets the value of the cs3CstParentCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstParentCstKey(JAXBElement<String> value) {
        this.cs3CstParentCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstUrlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstUrlKey() {
        return cs3CstUrlKey;
    }

    /**
     * Sets the value of the cs3CstUrlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstUrlKey(JAXBElement<String> value) {
        this.cs3CstUrlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstNoMsgFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs3CstNoMsgFlag() {
        return cs3CstNoMsgFlag;
    }

    /**
     * Sets the value of the cs3CstNoMsgFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs3CstNoMsgFlag(JAXBElement<Short> value) {
        this.cs3CstNoMsgFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs3CstMsgHandleDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstMsgHandleDn() {
        return cs3CstMsgHandleDn;
    }

    /**
     * Sets the value of the cs3CstMsgHandleDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstMsgHandleDn(JAXBElement<String> value) {
        this.cs3CstMsgHandleDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstWebLogin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstWebLogin() {
        return cs3CstWebLogin;
    }

    /**
     * Sets the value of the cs3CstWebLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstWebLogin(JAXBElement<String> value) {
        this.cs3CstWebLogin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstWebPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstWebPassword() {
        return cs3CstWebPassword;
    }

    /**
     * Sets the value of the cs3CstWebPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstWebPassword(JAXBElement<String> value) {
        this.cs3CstWebPassword = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstEntityKey() {
        return cs3CstEntityKey;
    }

    /**
     * Sets the value of the cs3CstEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstEntityKey(JAXBElement<String> value) {
        this.cs3CstEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstMsgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstMsgKey() {
        return cs3CstMsgKey;
    }

    /**
     * Sets the value of the cs3CstMsgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstMsgKey(JAXBElement<String> value) {
        this.cs3CstMsgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstNoMailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs3CstNoMailFlag() {
        return cs3CstNoMailFlag;
    }

    /**
     * Sets the value of the cs3CstNoMailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs3CstNoMailFlag(JAXBElement<Short> value) {
        this.cs3CstNoMailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs3CstWebStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstWebStartDate() {
        return cs3CstWebStartDate;
    }

    /**
     * Sets the value of the cs3CstWebStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstWebStartDate(JAXBElement<String> value) {
        this.cs3CstWebStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstWebEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstWebEndDate() {
        return cs3CstWebEndDate;
    }

    /**
     * Sets the value of the cs3CstWebEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstWebEndDate(JAXBElement<String> value) {
        this.cs3CstWebEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstWebForcePasswordChange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs3CstWebForcePasswordChange() {
        return cs3CstWebForcePasswordChange;
    }

    /**
     * Sets the value of the cs3CstWebForcePasswordChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs3CstWebForcePasswordChange(JAXBElement<Short> value) {
        this.cs3CstWebForcePasswordChange = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs3CstWebLoginDisabledFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs3CstWebLoginDisabledFlag() {
        return cs3CstWebLoginDisabledFlag;
    }

    /**
     * Sets the value of the cs3CstWebLoginDisabledFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs3CstWebLoginDisabledFlag(JAXBElement<Short> value) {
        this.cs3CstWebLoginDisabledFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs3CstComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstComment() {
        return cs3CstComment;
    }

    /**
     * Sets the value of the cs3CstComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstComment(JAXBElement<String> value) {
        this.cs3CstComment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstCreditHoldFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs3CstCreditHoldFlag() {
        return cs3CstCreditHoldFlag;
    }

    /**
     * Sets the value of the cs3CstCreditHoldFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs3CstCreditHoldFlag(JAXBElement<Short> value) {
        this.cs3CstCreditHoldFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs3CstCreditHoldReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstCreditHoldReason() {
        return cs3CstCreditHoldReason;
    }

    /**
     * Sets the value of the cs3CstCreditHoldReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstCreditHoldReason(JAXBElement<String> value) {
        this.cs3CstCreditHoldReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstWebForgotPasswordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs3CstWebForgotPasswordStatus() {
        return cs3CstWebForgotPasswordStatus;
    }

    /**
     * Sets the value of the cs3CstWebForgotPasswordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs3CstWebForgotPasswordStatus(JAXBElement<Short> value) {
        this.cs3CstWebForgotPasswordStatus = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs3CstOldCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstOldCxaKey() {
        return cs3CstOldCxaKey;
    }

    /**
     * Sets the value of the cs3CstOldCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstOldCxaKey(JAXBElement<String> value) {
        this.cs3CstOldCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstLastEmailDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstLastEmailDate() {
        return cs3CstLastEmailDate;
    }

    /**
     * Sets the value of the cs3CstLastEmailDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstLastEmailDate(JAXBElement<String> value) {
        this.cs3CstLastEmailDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstNoPublishFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs3CstNoPublishFlag() {
        return cs3CstNoPublishFlag;
    }

    /**
     * Sets the value of the cs3CstNoPublishFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs3CstNoPublishFlag(JAXBElement<Short> value) {
        this.cs3CstNoPublishFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs3CstSinKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstSinKey() {
        return cs3CstSinKey;
    }

    /**
     * Sets the value of the cs3CstSinKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstSinKey(JAXBElement<String> value) {
        this.cs3CstSinKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstTtlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstTtlKey() {
        return cs3CstTtlKey;
    }

    /**
     * Sets the value of the cs3CstTtlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstTtlKey(JAXBElement<String> value) {
        this.cs3CstTtlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstJfnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstJfnKey() {
        return cs3CstJfnKey;
    }

    /**
     * Sets the value of the cs3CstJfnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstJfnKey(JAXBElement<String> value) {
        this.cs3CstJfnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstCurKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstCurKey() {
        return cs3CstCurKey;
    }

    /**
     * Sets the value of the cs3CstCurKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstCurKey(JAXBElement<String> value) {
        this.cs3CstCurKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstAttribute1() {
        return cs3CstAttribute1;
    }

    /**
     * Sets the value of the cs3CstAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstAttribute1(JAXBElement<String> value) {
        this.cs3CstAttribute1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstAttribute2() {
        return cs3CstAttribute2;
    }

    /**
     * Sets the value of the cs3CstAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstAttribute2(JAXBElement<String> value) {
        this.cs3CstAttribute2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstDoNotIncludeDirectoryExtFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs3CstDoNotIncludeDirectoryExtFlag() {
        return cs3CstDoNotIncludeDirectoryExtFlag;
    }

    /**
     * Sets the value of the cs3CstDoNotIncludeDirectoryExtFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs3CstDoNotIncludeDirectoryExtFlag(JAXBElement<Short> value) {
        this.cs3CstDoNotIncludeDirectoryExtFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs3CstSalutation1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstSalutation1() {
        return cs3CstSalutation1;
    }

    /**
     * Sets the value of the cs3CstSalutation1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstSalutation1(JAXBElement<String> value) {
        this.cs3CstSalutation1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstSourceExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstSourceExt() {
        return cs3CstSourceExt;
    }

    /**
     * Sets the value of the cs3CstSourceExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstSourceExt(JAXBElement<String> value) {
        this.cs3CstSourceExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstSalutation2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstSalutation2() {
        return cs3CstSalutation2;
    }

    /**
     * Sets the value of the cs3CstSalutation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstSalutation2(JAXBElement<String> value) {
        this.cs3CstSalutation2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstGracePeriodExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCs3CstGracePeriodExt() {
        return cs3CstGracePeriodExt;
    }

    /**
     * Sets the value of the cs3CstGracePeriodExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCs3CstGracePeriodExt(JAXBElement<Integer> value) {
        this.cs3CstGracePeriodExt = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cs3CstMergeCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstMergeCstKey() {
        return cs3CstMergeCstKey;
    }

    /**
     * Sets the value of the cs3CstMergeCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstMergeCstKey(JAXBElement<String> value) {
        this.cs3CstMergeCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstSalutation3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstSalutation3() {
        return cs3CstSalutation3;
    }

    /**
     * Sets the value of the cs3CstSalutation3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstSalutation3(JAXBElement<String> value) {
        this.cs3CstSalutation3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstSalutation4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstSalutation4() {
        return cs3CstSalutation4;
    }

    /**
     * Sets the value of the cs3CstSalutation4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstSalutation4(JAXBElement<String> value) {
        this.cs3CstSalutation4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstDefaultRecognizeAs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstDefaultRecognizeAs() {
        return cs3CstDefaultRecognizeAs;
    }

    /**
     * Sets the value of the cs3CstDefaultRecognizeAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstDefaultRecognizeAs(JAXBElement<String> value) {
        this.cs3CstDefaultRecognizeAs = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCs3CstScore() {
        return cs3CstScore;
    }

    /**
     * Sets the value of the cs3CstScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCs3CstScore(JAXBElement<BigDecimal> value) {
        this.cs3CstScore = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the cs3CstScoreNormalized property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCs3CstScoreNormalized() {
        return cs3CstScoreNormalized;
    }

    /**
     * Sets the value of the cs3CstScoreNormalized property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCs3CstScoreNormalized(JAXBElement<Integer> value) {
        this.cs3CstScoreNormalized = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cs3CstScoreTrend property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCs3CstScoreTrend() {
        return cs3CstScoreTrend;
    }

    /**
     * Sets the value of the cs3CstScoreTrend property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCs3CstScoreTrend(JAXBElement<Integer> value) {
        this.cs3CstScoreTrend = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cs3CstVaultAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstVaultAccount() {
        return cs3CstVaultAccount;
    }

    /**
     * Sets the value of the cs3CstVaultAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstVaultAccount(JAXBElement<String> value) {
        this.cs3CstVaultAccount = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstExcludeFromSocialFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs3CstExcludeFromSocialFlag() {
        return cs3CstExcludeFromSocialFlag;
    }

    /**
     * Sets the value of the cs3CstExcludeFromSocialFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs3CstExcludeFromSocialFlag(JAXBElement<Short> value) {
        this.cs3CstExcludeFromSocialFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs3CstSocialScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCs3CstSocialScore() {
        return cs3CstSocialScore;
    }

    /**
     * Sets the value of the cs3CstSocialScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCs3CstSocialScore(JAXBElement<Integer> value) {
        this.cs3CstSocialScore = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cs3CstPtin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstPtin() {
        return cs3CstPtin;
    }

    /**
     * Sets the value of the cs3CstPtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstPtin(JAXBElement<String> value) {
        this.cs3CstPtin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstAicpaMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCs3CstAicpaMemberId() {
        return cs3CstAicpaMemberId;
    }

    /**
     * Sets the value of the cs3CstAicpaMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCs3CstAicpaMemberId(JAXBElement<Long> value) {
        this.cs3CstAicpaMemberId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the cs3CstVendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstVendorCode() {
        return cs3CstVendorCode;
    }

    /**
     * Sets the value of the cs3CstVendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstVendorCode(JAXBElement<String> value) {
        this.cs3CstVendorCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs3CstScaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs3CstScaKey() {
        return cs3CstScaKey;
    }

    /**
     * Sets the value of the cs3CstScaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs3CstScaKey(JAXBElement<String> value) {
        this.cs3CstScaKey = ((JAXBElement<String> ) value);
    }

}
