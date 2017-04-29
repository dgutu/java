
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Registrant_Customer_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Registrant_Customer_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cs5__cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_type" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_name_cp" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_sort_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_ind_full_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_org_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_ixo_title_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_pref_comm_meth" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_bio" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_recno" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_id" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_email_text_only" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_credit_limit" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_src_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_tax_exempt_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_tax_id" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_no_email_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_cxa_billing_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_eml_address_dn" type="{http://www.avectra.com/2005/}av_email_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_no_phone_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_phn_number_complete_dn" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_no_fax_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_fax_number_complete_dn" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_ixo_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_no_web_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_oldid" type="{http://www.avectra.com/2005/}stringLength15_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_member_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_url_code_dn" type="{http://www.avectra.com/2005/}av_url_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_parent_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_url_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_no_msg_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_msg_handle_dn" type="{http://www.avectra.com/2005/}av_messaging_name_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_web_login" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_web_password" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_msg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_no_mail_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_web_start_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_web_end_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_web_force_password_change" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_web_login_disabled_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_comment" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_credit_hold_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_credit_hold_reason" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_web_forgot_password_status" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_old_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_last_email_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_no_publish_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_sin_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_ttl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_jfn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_cur_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_attribute_1" type="{http://www.avectra.com/2005/}stringLength510_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_attribute_2" type="{http://www.avectra.com/2005/}stringLength510_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_do_not_include_directory_ext_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_salutation_1" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_source_ext" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_salutation_2" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_grace_period_ext" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_merge_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_salutation_3" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_salutation_4" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_default_recognize_as" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_score" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_score_normalized" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_score_trend" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_vault_account" type="{http://www.avectra.com/2005/}stringLength25_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_exclude_from_social_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_social_score" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_ptin" type="{http://www.avectra.com/2005/}stringLength9_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_aicpa_member_id" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_vendor_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cs5__cst_sca_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Registrant_Customer_DataObjectType", propOrder = {
    "cs5CstKey",
    "cs5CstType",
    "cs5CstNameCp",
    "cs5CstSortNameDn",
    "cs5CstIndFullNameDn",
    "cs5CstOrgNameDn",
    "cs5CstIxoTitleDn",
    "cs5CstPrefCommMeth",
    "cs5CstBio",
    "cs5CstAddDate",
    "cs5CstAddUser",
    "cs5CstChangeDate",
    "cs5CstChangeUser",
    "cs5CstDeleteFlag",
    "cs5CstRecno",
    "cs5CstId",
    "cs5CstKeyExt",
    "cs5CstEmailTextOnly",
    "cs5CstCreditLimit",
    "cs5CstSrcKey",
    "cs5CstSrcCode",
    "cs5CstTaxExemptFlag",
    "cs5CstTaxId",
    "cs5CstCxaKey",
    "cs5CstNoEmailFlag",
    "cs5CstCxaBillingKey",
    "cs5CstEmlAddressDn",
    "cs5CstEmlKey",
    "cs5CstNoPhoneFlag",
    "cs5CstPhnNumberCompleteDn",
    "cs5CstCphKey",
    "cs5CstNoFaxFlag",
    "cs5CstFaxNumberCompleteDn",
    "cs5CstCfxKey",
    "cs5CstIxoKey",
    "cs5CstNoWebFlag",
    "cs5CstOldid",
    "cs5CstMemberFlag",
    "cs5CstUrlCodeDn",
    "cs5CstParentCstKey",
    "cs5CstUrlKey",
    "cs5CstNoMsgFlag",
    "cs5CstMsgHandleDn",
    "cs5CstWebLogin",
    "cs5CstWebPassword",
    "cs5CstEntityKey",
    "cs5CstMsgKey",
    "cs5CstNoMailFlag",
    "cs5CstWebStartDate",
    "cs5CstWebEndDate",
    "cs5CstWebForcePasswordChange",
    "cs5CstWebLoginDisabledFlag",
    "cs5CstComment",
    "cs5CstCreditHoldFlag",
    "cs5CstCreditHoldReason",
    "cs5CstWebForgotPasswordStatus",
    "cs5CstOldCxaKey",
    "cs5CstLastEmailDate",
    "cs5CstNoPublishFlag",
    "cs5CstSinKey",
    "cs5CstTtlKey",
    "cs5CstJfnKey",
    "cs5CstCurKey",
    "cs5CstAttribute1",
    "cs5CstAttribute2",
    "cs5CstDoNotIncludeDirectoryExtFlag",
    "cs5CstSalutation1",
    "cs5CstSourceExt",
    "cs5CstSalutation2",
    "cs5CstGracePeriodExt",
    "cs5CstMergeCstKey",
    "cs5CstSalutation3",
    "cs5CstSalutation4",
    "cs5CstDefaultRecognizeAs",
    "cs5CstScore",
    "cs5CstScoreNormalized",
    "cs5CstScoreTrend",
    "cs5CstVaultAccount",
    "cs5CstExcludeFromSocialFlag",
    "cs5CstSocialScore",
    "cs5CstPtin",
    "cs5CstAicpaMemberId",
    "cs5CstVendorCode",
    "cs5CstScaKey"
})
public class FundraisingGiftRegistrantCustomerDataObjectType {

    @XmlElementRef(name = "cs5__cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstKey;
    @XmlElementRef(name = "cs5__cst_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstType;
    @XmlElementRef(name = "cs5__cst_name_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstNameCp;
    @XmlElementRef(name = "cs5__cst_sort_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstSortNameDn;
    @XmlElementRef(name = "cs5__cst_ind_full_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstIndFullNameDn;
    @XmlElementRef(name = "cs5__cst_org_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstOrgNameDn;
    @XmlElementRef(name = "cs5__cst_ixo_title_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstIxoTitleDn;
    @XmlElementRef(name = "cs5__cst_pref_comm_meth", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstPrefCommMeth;
    @XmlElementRef(name = "cs5__cst_bio", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstBio;
    @XmlElementRef(name = "cs5__cst_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstAddDate;
    @XmlElementRef(name = "cs5__cst_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstAddUser;
    @XmlElementRef(name = "cs5__cst_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstChangeDate;
    @XmlElementRef(name = "cs5__cst_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstChangeUser;
    @XmlElementRef(name = "cs5__cst_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs5CstDeleteFlag;
    @XmlElementRef(name = "cs5__cst_recno", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> cs5CstRecno;
    @XmlElementRef(name = "cs5__cst_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstId;
    @XmlElementRef(name = "cs5__cst_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstKeyExt;
    @XmlElementRef(name = "cs5__cst_email_text_only", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs5CstEmailTextOnly;
    @XmlElementRef(name = "cs5__cst_credit_limit", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> cs5CstCreditLimit;
    @XmlElementRef(name = "cs5__cst_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstSrcKey;
    @XmlElementRef(name = "cs5__cst_src_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstSrcCode;
    @XmlElementRef(name = "cs5__cst_tax_exempt_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs5CstTaxExemptFlag;
    @XmlElementRef(name = "cs5__cst_tax_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstTaxId;
    @XmlElementRef(name = "cs5__cst_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstCxaKey;
    @XmlElementRef(name = "cs5__cst_no_email_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs5CstNoEmailFlag;
    @XmlElementRef(name = "cs5__cst_cxa_billing_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstCxaBillingKey;
    @XmlElementRef(name = "cs5__cst_eml_address_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstEmlAddressDn;
    @XmlElementRef(name = "cs5__cst_eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstEmlKey;
    @XmlElementRef(name = "cs5__cst_no_phone_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs5CstNoPhoneFlag;
    @XmlElementRef(name = "cs5__cst_phn_number_complete_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstPhnNumberCompleteDn;
    @XmlElementRef(name = "cs5__cst_cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstCphKey;
    @XmlElementRef(name = "cs5__cst_no_fax_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs5CstNoFaxFlag;
    @XmlElementRef(name = "cs5__cst_fax_number_complete_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstFaxNumberCompleteDn;
    @XmlElementRef(name = "cs5__cst_cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstCfxKey;
    @XmlElementRef(name = "cs5__cst_ixo_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstIxoKey;
    @XmlElementRef(name = "cs5__cst_no_web_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs5CstNoWebFlag;
    @XmlElementRef(name = "cs5__cst_oldid", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstOldid;
    @XmlElementRef(name = "cs5__cst_member_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs5CstMemberFlag;
    @XmlElementRef(name = "cs5__cst_url_code_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstUrlCodeDn;
    @XmlElementRef(name = "cs5__cst_parent_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstParentCstKey;
    @XmlElementRef(name = "cs5__cst_url_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstUrlKey;
    @XmlElementRef(name = "cs5__cst_no_msg_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs5CstNoMsgFlag;
    @XmlElementRef(name = "cs5__cst_msg_handle_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstMsgHandleDn;
    @XmlElementRef(name = "cs5__cst_web_login", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstWebLogin;
    @XmlElementRef(name = "cs5__cst_web_password", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstWebPassword;
    @XmlElementRef(name = "cs5__cst_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstEntityKey;
    @XmlElementRef(name = "cs5__cst_msg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstMsgKey;
    @XmlElementRef(name = "cs5__cst_no_mail_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs5CstNoMailFlag;
    @XmlElementRef(name = "cs5__cst_web_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstWebStartDate;
    @XmlElementRef(name = "cs5__cst_web_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstWebEndDate;
    @XmlElementRef(name = "cs5__cst_web_force_password_change", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs5CstWebForcePasswordChange;
    @XmlElementRef(name = "cs5__cst_web_login_disabled_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs5CstWebLoginDisabledFlag;
    @XmlElementRef(name = "cs5__cst_comment", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstComment;
    @XmlElementRef(name = "cs5__cst_credit_hold_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs5CstCreditHoldFlag;
    @XmlElementRef(name = "cs5__cst_credit_hold_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstCreditHoldReason;
    @XmlElementRef(name = "cs5__cst_web_forgot_password_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs5CstWebForgotPasswordStatus;
    @XmlElementRef(name = "cs5__cst_old_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstOldCxaKey;
    @XmlElementRef(name = "cs5__cst_last_email_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstLastEmailDate;
    @XmlElementRef(name = "cs5__cst_no_publish_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs5CstNoPublishFlag;
    @XmlElementRef(name = "cs5__cst_sin_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstSinKey;
    @XmlElementRef(name = "cs5__cst_ttl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstTtlKey;
    @XmlElementRef(name = "cs5__cst_jfn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstJfnKey;
    @XmlElementRef(name = "cs5__cst_cur_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstCurKey;
    @XmlElementRef(name = "cs5__cst_attribute_1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstAttribute1;
    @XmlElementRef(name = "cs5__cst_attribute_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstAttribute2;
    @XmlElementRef(name = "cs5__cst_do_not_include_directory_ext_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs5CstDoNotIncludeDirectoryExtFlag;
    @XmlElementRef(name = "cs5__cst_salutation_1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstSalutation1;
    @XmlElementRef(name = "cs5__cst_source_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstSourceExt;
    @XmlElementRef(name = "cs5__cst_salutation_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstSalutation2;
    @XmlElementRef(name = "cs5__cst_grace_period_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cs5CstGracePeriodExt;
    @XmlElementRef(name = "cs5__cst_merge_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstMergeCstKey;
    @XmlElementRef(name = "cs5__cst_salutation_3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstSalutation3;
    @XmlElementRef(name = "cs5__cst_salutation_4", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstSalutation4;
    @XmlElementRef(name = "cs5__cst_default_recognize_as", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstDefaultRecognizeAs;
    @XmlElementRef(name = "cs5__cst_score", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> cs5CstScore;
    @XmlElementRef(name = "cs5__cst_score_normalized", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cs5CstScoreNormalized;
    @XmlElementRef(name = "cs5__cst_score_trend", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cs5CstScoreTrend;
    @XmlElementRef(name = "cs5__cst_vault_account", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstVaultAccount;
    @XmlElementRef(name = "cs5__cst_exclude_from_social_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs5CstExcludeFromSocialFlag;
    @XmlElementRef(name = "cs5__cst_social_score", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cs5CstSocialScore;
    @XmlElementRef(name = "cs5__cst_ptin", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstPtin;
    @XmlElementRef(name = "cs5__cst_aicpa_member_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> cs5CstAicpaMemberId;
    @XmlElementRef(name = "cs5__cst_vendor_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstVendorCode;
    @XmlElementRef(name = "cs5__cst_sca_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs5CstScaKey;

    /**
     * Gets the value of the cs5CstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstKey() {
        return cs5CstKey;
    }

    /**
     * Sets the value of the cs5CstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstKey(JAXBElement<String> value) {
        this.cs5CstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstType() {
        return cs5CstType;
    }

    /**
     * Sets the value of the cs5CstType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstType(JAXBElement<String> value) {
        this.cs5CstType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstNameCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstNameCp() {
        return cs5CstNameCp;
    }

    /**
     * Sets the value of the cs5CstNameCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstNameCp(JAXBElement<String> value) {
        this.cs5CstNameCp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstSortNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstSortNameDn() {
        return cs5CstSortNameDn;
    }

    /**
     * Sets the value of the cs5CstSortNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstSortNameDn(JAXBElement<String> value) {
        this.cs5CstSortNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstIndFullNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstIndFullNameDn() {
        return cs5CstIndFullNameDn;
    }

    /**
     * Sets the value of the cs5CstIndFullNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstIndFullNameDn(JAXBElement<String> value) {
        this.cs5CstIndFullNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstOrgNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstOrgNameDn() {
        return cs5CstOrgNameDn;
    }

    /**
     * Sets the value of the cs5CstOrgNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstOrgNameDn(JAXBElement<String> value) {
        this.cs5CstOrgNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstIxoTitleDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstIxoTitleDn() {
        return cs5CstIxoTitleDn;
    }

    /**
     * Sets the value of the cs5CstIxoTitleDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstIxoTitleDn(JAXBElement<String> value) {
        this.cs5CstIxoTitleDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstPrefCommMeth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstPrefCommMeth() {
        return cs5CstPrefCommMeth;
    }

    /**
     * Sets the value of the cs5CstPrefCommMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstPrefCommMeth(JAXBElement<String> value) {
        this.cs5CstPrefCommMeth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstBio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstBio() {
        return cs5CstBio;
    }

    /**
     * Sets the value of the cs5CstBio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstBio(JAXBElement<String> value) {
        this.cs5CstBio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstAddDate() {
        return cs5CstAddDate;
    }

    /**
     * Sets the value of the cs5CstAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstAddDate(JAXBElement<String> value) {
        this.cs5CstAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstAddUser() {
        return cs5CstAddUser;
    }

    /**
     * Sets the value of the cs5CstAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstAddUser(JAXBElement<String> value) {
        this.cs5CstAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstChangeDate() {
        return cs5CstChangeDate;
    }

    /**
     * Sets the value of the cs5CstChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstChangeDate(JAXBElement<String> value) {
        this.cs5CstChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstChangeUser() {
        return cs5CstChangeUser;
    }

    /**
     * Sets the value of the cs5CstChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstChangeUser(JAXBElement<String> value) {
        this.cs5CstChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs5CstDeleteFlag() {
        return cs5CstDeleteFlag;
    }

    /**
     * Sets the value of the cs5CstDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs5CstDeleteFlag(JAXBElement<Short> value) {
        this.cs5CstDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs5CstRecno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCs5CstRecno() {
        return cs5CstRecno;
    }

    /**
     * Sets the value of the cs5CstRecno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCs5CstRecno(JAXBElement<Long> value) {
        this.cs5CstRecno = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the cs5CstId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstId() {
        return cs5CstId;
    }

    /**
     * Sets the value of the cs5CstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstId(JAXBElement<String> value) {
        this.cs5CstId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstKeyExt() {
        return cs5CstKeyExt;
    }

    /**
     * Sets the value of the cs5CstKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstKeyExt(JAXBElement<String> value) {
        this.cs5CstKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstEmailTextOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs5CstEmailTextOnly() {
        return cs5CstEmailTextOnly;
    }

    /**
     * Sets the value of the cs5CstEmailTextOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs5CstEmailTextOnly(JAXBElement<Short> value) {
        this.cs5CstEmailTextOnly = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs5CstCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCs5CstCreditLimit() {
        return cs5CstCreditLimit;
    }

    /**
     * Sets the value of the cs5CstCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCs5CstCreditLimit(JAXBElement<BigDecimal> value) {
        this.cs5CstCreditLimit = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the cs5CstSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstSrcKey() {
        return cs5CstSrcKey;
    }

    /**
     * Sets the value of the cs5CstSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstSrcKey(JAXBElement<String> value) {
        this.cs5CstSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstSrcCode() {
        return cs5CstSrcCode;
    }

    /**
     * Sets the value of the cs5CstSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstSrcCode(JAXBElement<String> value) {
        this.cs5CstSrcCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstTaxExemptFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs5CstTaxExemptFlag() {
        return cs5CstTaxExemptFlag;
    }

    /**
     * Sets the value of the cs5CstTaxExemptFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs5CstTaxExemptFlag(JAXBElement<Short> value) {
        this.cs5CstTaxExemptFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs5CstTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstTaxId() {
        return cs5CstTaxId;
    }

    /**
     * Sets the value of the cs5CstTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstTaxId(JAXBElement<String> value) {
        this.cs5CstTaxId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstCxaKey() {
        return cs5CstCxaKey;
    }

    /**
     * Sets the value of the cs5CstCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstCxaKey(JAXBElement<String> value) {
        this.cs5CstCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstNoEmailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs5CstNoEmailFlag() {
        return cs5CstNoEmailFlag;
    }

    /**
     * Sets the value of the cs5CstNoEmailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs5CstNoEmailFlag(JAXBElement<Short> value) {
        this.cs5CstNoEmailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs5CstCxaBillingKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstCxaBillingKey() {
        return cs5CstCxaBillingKey;
    }

    /**
     * Sets the value of the cs5CstCxaBillingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstCxaBillingKey(JAXBElement<String> value) {
        this.cs5CstCxaBillingKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstEmlAddressDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstEmlAddressDn() {
        return cs5CstEmlAddressDn;
    }

    /**
     * Sets the value of the cs5CstEmlAddressDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstEmlAddressDn(JAXBElement<String> value) {
        this.cs5CstEmlAddressDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstEmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstEmlKey() {
        return cs5CstEmlKey;
    }

    /**
     * Sets the value of the cs5CstEmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstEmlKey(JAXBElement<String> value) {
        this.cs5CstEmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstNoPhoneFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs5CstNoPhoneFlag() {
        return cs5CstNoPhoneFlag;
    }

    /**
     * Sets the value of the cs5CstNoPhoneFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs5CstNoPhoneFlag(JAXBElement<Short> value) {
        this.cs5CstNoPhoneFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs5CstPhnNumberCompleteDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstPhnNumberCompleteDn() {
        return cs5CstPhnNumberCompleteDn;
    }

    /**
     * Sets the value of the cs5CstPhnNumberCompleteDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstPhnNumberCompleteDn(JAXBElement<String> value) {
        this.cs5CstPhnNumberCompleteDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstCphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstCphKey() {
        return cs5CstCphKey;
    }

    /**
     * Sets the value of the cs5CstCphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstCphKey(JAXBElement<String> value) {
        this.cs5CstCphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstNoFaxFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs5CstNoFaxFlag() {
        return cs5CstNoFaxFlag;
    }

    /**
     * Sets the value of the cs5CstNoFaxFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs5CstNoFaxFlag(JAXBElement<Short> value) {
        this.cs5CstNoFaxFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs5CstFaxNumberCompleteDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstFaxNumberCompleteDn() {
        return cs5CstFaxNumberCompleteDn;
    }

    /**
     * Sets the value of the cs5CstFaxNumberCompleteDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstFaxNumberCompleteDn(JAXBElement<String> value) {
        this.cs5CstFaxNumberCompleteDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstCfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstCfxKey() {
        return cs5CstCfxKey;
    }

    /**
     * Sets the value of the cs5CstCfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstCfxKey(JAXBElement<String> value) {
        this.cs5CstCfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstIxoKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstIxoKey() {
        return cs5CstIxoKey;
    }

    /**
     * Sets the value of the cs5CstIxoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstIxoKey(JAXBElement<String> value) {
        this.cs5CstIxoKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstNoWebFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs5CstNoWebFlag() {
        return cs5CstNoWebFlag;
    }

    /**
     * Sets the value of the cs5CstNoWebFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs5CstNoWebFlag(JAXBElement<Short> value) {
        this.cs5CstNoWebFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs5CstOldid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstOldid() {
        return cs5CstOldid;
    }

    /**
     * Sets the value of the cs5CstOldid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstOldid(JAXBElement<String> value) {
        this.cs5CstOldid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstMemberFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs5CstMemberFlag() {
        return cs5CstMemberFlag;
    }

    /**
     * Sets the value of the cs5CstMemberFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs5CstMemberFlag(JAXBElement<Short> value) {
        this.cs5CstMemberFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs5CstUrlCodeDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstUrlCodeDn() {
        return cs5CstUrlCodeDn;
    }

    /**
     * Sets the value of the cs5CstUrlCodeDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstUrlCodeDn(JAXBElement<String> value) {
        this.cs5CstUrlCodeDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstParentCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstParentCstKey() {
        return cs5CstParentCstKey;
    }

    /**
     * Sets the value of the cs5CstParentCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstParentCstKey(JAXBElement<String> value) {
        this.cs5CstParentCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstUrlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstUrlKey() {
        return cs5CstUrlKey;
    }

    /**
     * Sets the value of the cs5CstUrlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstUrlKey(JAXBElement<String> value) {
        this.cs5CstUrlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstNoMsgFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs5CstNoMsgFlag() {
        return cs5CstNoMsgFlag;
    }

    /**
     * Sets the value of the cs5CstNoMsgFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs5CstNoMsgFlag(JAXBElement<Short> value) {
        this.cs5CstNoMsgFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs5CstMsgHandleDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstMsgHandleDn() {
        return cs5CstMsgHandleDn;
    }

    /**
     * Sets the value of the cs5CstMsgHandleDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstMsgHandleDn(JAXBElement<String> value) {
        this.cs5CstMsgHandleDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstWebLogin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstWebLogin() {
        return cs5CstWebLogin;
    }

    /**
     * Sets the value of the cs5CstWebLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstWebLogin(JAXBElement<String> value) {
        this.cs5CstWebLogin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstWebPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstWebPassword() {
        return cs5CstWebPassword;
    }

    /**
     * Sets the value of the cs5CstWebPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstWebPassword(JAXBElement<String> value) {
        this.cs5CstWebPassword = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstEntityKey() {
        return cs5CstEntityKey;
    }

    /**
     * Sets the value of the cs5CstEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstEntityKey(JAXBElement<String> value) {
        this.cs5CstEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstMsgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstMsgKey() {
        return cs5CstMsgKey;
    }

    /**
     * Sets the value of the cs5CstMsgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstMsgKey(JAXBElement<String> value) {
        this.cs5CstMsgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstNoMailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs5CstNoMailFlag() {
        return cs5CstNoMailFlag;
    }

    /**
     * Sets the value of the cs5CstNoMailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs5CstNoMailFlag(JAXBElement<Short> value) {
        this.cs5CstNoMailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs5CstWebStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstWebStartDate() {
        return cs5CstWebStartDate;
    }

    /**
     * Sets the value of the cs5CstWebStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstWebStartDate(JAXBElement<String> value) {
        this.cs5CstWebStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstWebEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstWebEndDate() {
        return cs5CstWebEndDate;
    }

    /**
     * Sets the value of the cs5CstWebEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstWebEndDate(JAXBElement<String> value) {
        this.cs5CstWebEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstWebForcePasswordChange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs5CstWebForcePasswordChange() {
        return cs5CstWebForcePasswordChange;
    }

    /**
     * Sets the value of the cs5CstWebForcePasswordChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs5CstWebForcePasswordChange(JAXBElement<Short> value) {
        this.cs5CstWebForcePasswordChange = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs5CstWebLoginDisabledFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs5CstWebLoginDisabledFlag() {
        return cs5CstWebLoginDisabledFlag;
    }

    /**
     * Sets the value of the cs5CstWebLoginDisabledFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs5CstWebLoginDisabledFlag(JAXBElement<Short> value) {
        this.cs5CstWebLoginDisabledFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs5CstComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstComment() {
        return cs5CstComment;
    }

    /**
     * Sets the value of the cs5CstComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstComment(JAXBElement<String> value) {
        this.cs5CstComment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstCreditHoldFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs5CstCreditHoldFlag() {
        return cs5CstCreditHoldFlag;
    }

    /**
     * Sets the value of the cs5CstCreditHoldFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs5CstCreditHoldFlag(JAXBElement<Short> value) {
        this.cs5CstCreditHoldFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs5CstCreditHoldReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstCreditHoldReason() {
        return cs5CstCreditHoldReason;
    }

    /**
     * Sets the value of the cs5CstCreditHoldReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstCreditHoldReason(JAXBElement<String> value) {
        this.cs5CstCreditHoldReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstWebForgotPasswordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs5CstWebForgotPasswordStatus() {
        return cs5CstWebForgotPasswordStatus;
    }

    /**
     * Sets the value of the cs5CstWebForgotPasswordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs5CstWebForgotPasswordStatus(JAXBElement<Short> value) {
        this.cs5CstWebForgotPasswordStatus = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs5CstOldCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstOldCxaKey() {
        return cs5CstOldCxaKey;
    }

    /**
     * Sets the value of the cs5CstOldCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstOldCxaKey(JAXBElement<String> value) {
        this.cs5CstOldCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstLastEmailDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstLastEmailDate() {
        return cs5CstLastEmailDate;
    }

    /**
     * Sets the value of the cs5CstLastEmailDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstLastEmailDate(JAXBElement<String> value) {
        this.cs5CstLastEmailDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstNoPublishFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs5CstNoPublishFlag() {
        return cs5CstNoPublishFlag;
    }

    /**
     * Sets the value of the cs5CstNoPublishFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs5CstNoPublishFlag(JAXBElement<Short> value) {
        this.cs5CstNoPublishFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs5CstSinKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstSinKey() {
        return cs5CstSinKey;
    }

    /**
     * Sets the value of the cs5CstSinKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstSinKey(JAXBElement<String> value) {
        this.cs5CstSinKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstTtlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstTtlKey() {
        return cs5CstTtlKey;
    }

    /**
     * Sets the value of the cs5CstTtlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstTtlKey(JAXBElement<String> value) {
        this.cs5CstTtlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstJfnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstJfnKey() {
        return cs5CstJfnKey;
    }

    /**
     * Sets the value of the cs5CstJfnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstJfnKey(JAXBElement<String> value) {
        this.cs5CstJfnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstCurKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstCurKey() {
        return cs5CstCurKey;
    }

    /**
     * Sets the value of the cs5CstCurKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstCurKey(JAXBElement<String> value) {
        this.cs5CstCurKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstAttribute1() {
        return cs5CstAttribute1;
    }

    /**
     * Sets the value of the cs5CstAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstAttribute1(JAXBElement<String> value) {
        this.cs5CstAttribute1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstAttribute2() {
        return cs5CstAttribute2;
    }

    /**
     * Sets the value of the cs5CstAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstAttribute2(JAXBElement<String> value) {
        this.cs5CstAttribute2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstDoNotIncludeDirectoryExtFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs5CstDoNotIncludeDirectoryExtFlag() {
        return cs5CstDoNotIncludeDirectoryExtFlag;
    }

    /**
     * Sets the value of the cs5CstDoNotIncludeDirectoryExtFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs5CstDoNotIncludeDirectoryExtFlag(JAXBElement<Short> value) {
        this.cs5CstDoNotIncludeDirectoryExtFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs5CstSalutation1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstSalutation1() {
        return cs5CstSalutation1;
    }

    /**
     * Sets the value of the cs5CstSalutation1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstSalutation1(JAXBElement<String> value) {
        this.cs5CstSalutation1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstSourceExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstSourceExt() {
        return cs5CstSourceExt;
    }

    /**
     * Sets the value of the cs5CstSourceExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstSourceExt(JAXBElement<String> value) {
        this.cs5CstSourceExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstSalutation2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstSalutation2() {
        return cs5CstSalutation2;
    }

    /**
     * Sets the value of the cs5CstSalutation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstSalutation2(JAXBElement<String> value) {
        this.cs5CstSalutation2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstGracePeriodExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCs5CstGracePeriodExt() {
        return cs5CstGracePeriodExt;
    }

    /**
     * Sets the value of the cs5CstGracePeriodExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCs5CstGracePeriodExt(JAXBElement<Integer> value) {
        this.cs5CstGracePeriodExt = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cs5CstMergeCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstMergeCstKey() {
        return cs5CstMergeCstKey;
    }

    /**
     * Sets the value of the cs5CstMergeCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstMergeCstKey(JAXBElement<String> value) {
        this.cs5CstMergeCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstSalutation3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstSalutation3() {
        return cs5CstSalutation3;
    }

    /**
     * Sets the value of the cs5CstSalutation3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstSalutation3(JAXBElement<String> value) {
        this.cs5CstSalutation3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstSalutation4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstSalutation4() {
        return cs5CstSalutation4;
    }

    /**
     * Sets the value of the cs5CstSalutation4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstSalutation4(JAXBElement<String> value) {
        this.cs5CstSalutation4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstDefaultRecognizeAs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstDefaultRecognizeAs() {
        return cs5CstDefaultRecognizeAs;
    }

    /**
     * Sets the value of the cs5CstDefaultRecognizeAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstDefaultRecognizeAs(JAXBElement<String> value) {
        this.cs5CstDefaultRecognizeAs = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCs5CstScore() {
        return cs5CstScore;
    }

    /**
     * Sets the value of the cs5CstScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCs5CstScore(JAXBElement<BigDecimal> value) {
        this.cs5CstScore = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the cs5CstScoreNormalized property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCs5CstScoreNormalized() {
        return cs5CstScoreNormalized;
    }

    /**
     * Sets the value of the cs5CstScoreNormalized property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCs5CstScoreNormalized(JAXBElement<Integer> value) {
        this.cs5CstScoreNormalized = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cs5CstScoreTrend property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCs5CstScoreTrend() {
        return cs5CstScoreTrend;
    }

    /**
     * Sets the value of the cs5CstScoreTrend property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCs5CstScoreTrend(JAXBElement<Integer> value) {
        this.cs5CstScoreTrend = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cs5CstVaultAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstVaultAccount() {
        return cs5CstVaultAccount;
    }

    /**
     * Sets the value of the cs5CstVaultAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstVaultAccount(JAXBElement<String> value) {
        this.cs5CstVaultAccount = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstExcludeFromSocialFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs5CstExcludeFromSocialFlag() {
        return cs5CstExcludeFromSocialFlag;
    }

    /**
     * Sets the value of the cs5CstExcludeFromSocialFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs5CstExcludeFromSocialFlag(JAXBElement<Short> value) {
        this.cs5CstExcludeFromSocialFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs5CstSocialScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCs5CstSocialScore() {
        return cs5CstSocialScore;
    }

    /**
     * Sets the value of the cs5CstSocialScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCs5CstSocialScore(JAXBElement<Integer> value) {
        this.cs5CstSocialScore = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cs5CstPtin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstPtin() {
        return cs5CstPtin;
    }

    /**
     * Sets the value of the cs5CstPtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstPtin(JAXBElement<String> value) {
        this.cs5CstPtin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstAicpaMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCs5CstAicpaMemberId() {
        return cs5CstAicpaMemberId;
    }

    /**
     * Sets the value of the cs5CstAicpaMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCs5CstAicpaMemberId(JAXBElement<Long> value) {
        this.cs5CstAicpaMemberId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the cs5CstVendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstVendorCode() {
        return cs5CstVendorCode;
    }

    /**
     * Sets the value of the cs5CstVendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstVendorCode(JAXBElement<String> value) {
        this.cs5CstVendorCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs5CstScaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs5CstScaKey() {
        return cs5CstScaKey;
    }

    /**
     * Sets the value of the cs5CstScaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs5CstScaKey(JAXBElement<String> value) {
        this.cs5CstScaKey = ((JAXBElement<String> ) value);
    }

}
