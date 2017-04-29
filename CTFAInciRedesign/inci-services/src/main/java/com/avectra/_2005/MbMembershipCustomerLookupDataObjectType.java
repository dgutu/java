
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mb_membership_Customer_Lookup_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mb_membership_Customer_Lookup_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cs2__cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_type" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_name_cp" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_sort_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_ind_full_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_org_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_ixo_title_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_pref_comm_meth" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_bio" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_recno" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_id" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_email_text_only" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_credit_limit" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_src_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_tax_exempt_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_tax_id" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_no_email_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_cxa_billing_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_eml_address_dn" type="{http://www.avectra.com/2005/}av_email_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_no_phone_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_phn_number_complete_dn" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_no_fax_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_fax_number_complete_dn" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_ixo_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_no_web_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_oldid" type="{http://www.avectra.com/2005/}stringLength15_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_member_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_url_code_dn" type="{http://www.avectra.com/2005/}av_url_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_parent_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_url_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_no_msg_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_msg_handle_dn" type="{http://www.avectra.com/2005/}av_messaging_name_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_web_login" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_web_password" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_msg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_no_mail_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_web_start_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_web_end_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_web_force_password_change" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_web_login_disabled_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_comment" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_credit_hold_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_credit_hold_reason" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_web_forgot_password_status" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_old_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_last_email_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_no_publish_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_sin_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_ttl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_jfn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_cur_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_attribute_1" type="{http://www.avectra.com/2005/}stringLength510_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_attribute_2" type="{http://www.avectra.com/2005/}stringLength510_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_do_not_include_directory_ext_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_salutation_1" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_source_ext" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_salutation_2" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_grace_period_ext" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_merge_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_salutation_3" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_salutation_4" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_default_recognize_as" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_score" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_score_normalized" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_score_trend" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_vault_account" type="{http://www.avectra.com/2005/}stringLength25_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_exclude_from_social_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_social_score" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_ptin" type="{http://www.avectra.com/2005/}stringLength9_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_aicpa_member_id" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_vendor_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cs2__cst_sca_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mb_membership_Customer_Lookup_DataObjectType", propOrder = {
    "cs2CstKey",
    "cs2CstType",
    "cs2CstNameCp",
    "cs2CstSortNameDn",
    "cs2CstIndFullNameDn",
    "cs2CstOrgNameDn",
    "cs2CstIxoTitleDn",
    "cs2CstPrefCommMeth",
    "cs2CstBio",
    "cs2CstAddDate",
    "cs2CstAddUser",
    "cs2CstChangeDate",
    "cs2CstChangeUser",
    "cs2CstDeleteFlag",
    "cs2CstRecno",
    "cs2CstId",
    "cs2CstKeyExt",
    "cs2CstEmailTextOnly",
    "cs2CstCreditLimit",
    "cs2CstSrcKey",
    "cs2CstSrcCode",
    "cs2CstTaxExemptFlag",
    "cs2CstTaxId",
    "cs2CstCxaKey",
    "cs2CstNoEmailFlag",
    "cs2CstCxaBillingKey",
    "cs2CstEmlAddressDn",
    "cs2CstEmlKey",
    "cs2CstNoPhoneFlag",
    "cs2CstPhnNumberCompleteDn",
    "cs2CstCphKey",
    "cs2CstNoFaxFlag",
    "cs2CstFaxNumberCompleteDn",
    "cs2CstCfxKey",
    "cs2CstIxoKey",
    "cs2CstNoWebFlag",
    "cs2CstOldid",
    "cs2CstMemberFlag",
    "cs2CstUrlCodeDn",
    "cs2CstParentCstKey",
    "cs2CstUrlKey",
    "cs2CstNoMsgFlag",
    "cs2CstMsgHandleDn",
    "cs2CstWebLogin",
    "cs2CstWebPassword",
    "cs2CstEntityKey",
    "cs2CstMsgKey",
    "cs2CstNoMailFlag",
    "cs2CstWebStartDate",
    "cs2CstWebEndDate",
    "cs2CstWebForcePasswordChange",
    "cs2CstWebLoginDisabledFlag",
    "cs2CstComment",
    "cs2CstCreditHoldFlag",
    "cs2CstCreditHoldReason",
    "cs2CstWebForgotPasswordStatus",
    "cs2CstOldCxaKey",
    "cs2CstLastEmailDate",
    "cs2CstNoPublishFlag",
    "cs2CstSinKey",
    "cs2CstTtlKey",
    "cs2CstJfnKey",
    "cs2CstCurKey",
    "cs2CstAttribute1",
    "cs2CstAttribute2",
    "cs2CstDoNotIncludeDirectoryExtFlag",
    "cs2CstSalutation1",
    "cs2CstSourceExt",
    "cs2CstSalutation2",
    "cs2CstGracePeriodExt",
    "cs2CstMergeCstKey",
    "cs2CstSalutation3",
    "cs2CstSalutation4",
    "cs2CstDefaultRecognizeAs",
    "cs2CstScore",
    "cs2CstScoreNormalized",
    "cs2CstScoreTrend",
    "cs2CstVaultAccount",
    "cs2CstExcludeFromSocialFlag",
    "cs2CstSocialScore",
    "cs2CstPtin",
    "cs2CstAicpaMemberId",
    "cs2CstVendorCode",
    "cs2CstScaKey"
})
public class MbMembershipCustomerLookupDataObjectType {

    @XmlElementRef(name = "cs2__cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstKey;
    @XmlElementRef(name = "cs2__cst_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstType;
    @XmlElementRef(name = "cs2__cst_name_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstNameCp;
    @XmlElementRef(name = "cs2__cst_sort_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstSortNameDn;
    @XmlElementRef(name = "cs2__cst_ind_full_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstIndFullNameDn;
    @XmlElementRef(name = "cs2__cst_org_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstOrgNameDn;
    @XmlElementRef(name = "cs2__cst_ixo_title_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstIxoTitleDn;
    @XmlElementRef(name = "cs2__cst_pref_comm_meth", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstPrefCommMeth;
    @XmlElementRef(name = "cs2__cst_bio", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstBio;
    @XmlElementRef(name = "cs2__cst_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstAddDate;
    @XmlElementRef(name = "cs2__cst_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstAddUser;
    @XmlElementRef(name = "cs2__cst_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstChangeDate;
    @XmlElementRef(name = "cs2__cst_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstChangeUser;
    @XmlElementRef(name = "cs2__cst_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs2CstDeleteFlag;
    @XmlElementRef(name = "cs2__cst_recno", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> cs2CstRecno;
    @XmlElementRef(name = "cs2__cst_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstId;
    @XmlElementRef(name = "cs2__cst_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstKeyExt;
    @XmlElementRef(name = "cs2__cst_email_text_only", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs2CstEmailTextOnly;
    @XmlElementRef(name = "cs2__cst_credit_limit", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> cs2CstCreditLimit;
    @XmlElementRef(name = "cs2__cst_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstSrcKey;
    @XmlElementRef(name = "cs2__cst_src_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstSrcCode;
    @XmlElementRef(name = "cs2__cst_tax_exempt_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs2CstTaxExemptFlag;
    @XmlElementRef(name = "cs2__cst_tax_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstTaxId;
    @XmlElementRef(name = "cs2__cst_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstCxaKey;
    @XmlElementRef(name = "cs2__cst_no_email_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs2CstNoEmailFlag;
    @XmlElementRef(name = "cs2__cst_cxa_billing_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstCxaBillingKey;
    @XmlElementRef(name = "cs2__cst_eml_address_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstEmlAddressDn;
    @XmlElementRef(name = "cs2__cst_eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstEmlKey;
    @XmlElementRef(name = "cs2__cst_no_phone_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs2CstNoPhoneFlag;
    @XmlElementRef(name = "cs2__cst_phn_number_complete_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstPhnNumberCompleteDn;
    @XmlElementRef(name = "cs2__cst_cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstCphKey;
    @XmlElementRef(name = "cs2__cst_no_fax_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs2CstNoFaxFlag;
    @XmlElementRef(name = "cs2__cst_fax_number_complete_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstFaxNumberCompleteDn;
    @XmlElementRef(name = "cs2__cst_cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstCfxKey;
    @XmlElementRef(name = "cs2__cst_ixo_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstIxoKey;
    @XmlElementRef(name = "cs2__cst_no_web_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs2CstNoWebFlag;
    @XmlElementRef(name = "cs2__cst_oldid", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstOldid;
    @XmlElementRef(name = "cs2__cst_member_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs2CstMemberFlag;
    @XmlElementRef(name = "cs2__cst_url_code_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstUrlCodeDn;
    @XmlElementRef(name = "cs2__cst_parent_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstParentCstKey;
    @XmlElementRef(name = "cs2__cst_url_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstUrlKey;
    @XmlElementRef(name = "cs2__cst_no_msg_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs2CstNoMsgFlag;
    @XmlElementRef(name = "cs2__cst_msg_handle_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstMsgHandleDn;
    @XmlElementRef(name = "cs2__cst_web_login", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstWebLogin;
    @XmlElementRef(name = "cs2__cst_web_password", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstWebPassword;
    @XmlElementRef(name = "cs2__cst_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstEntityKey;
    @XmlElementRef(name = "cs2__cst_msg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstMsgKey;
    @XmlElementRef(name = "cs2__cst_no_mail_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs2CstNoMailFlag;
    @XmlElementRef(name = "cs2__cst_web_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstWebStartDate;
    @XmlElementRef(name = "cs2__cst_web_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstWebEndDate;
    @XmlElementRef(name = "cs2__cst_web_force_password_change", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs2CstWebForcePasswordChange;
    @XmlElementRef(name = "cs2__cst_web_login_disabled_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs2CstWebLoginDisabledFlag;
    @XmlElementRef(name = "cs2__cst_comment", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstComment;
    @XmlElementRef(name = "cs2__cst_credit_hold_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs2CstCreditHoldFlag;
    @XmlElementRef(name = "cs2__cst_credit_hold_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstCreditHoldReason;
    @XmlElementRef(name = "cs2__cst_web_forgot_password_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs2CstWebForgotPasswordStatus;
    @XmlElementRef(name = "cs2__cst_old_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstOldCxaKey;
    @XmlElementRef(name = "cs2__cst_last_email_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstLastEmailDate;
    @XmlElementRef(name = "cs2__cst_no_publish_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs2CstNoPublishFlag;
    @XmlElementRef(name = "cs2__cst_sin_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstSinKey;
    @XmlElementRef(name = "cs2__cst_ttl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstTtlKey;
    @XmlElementRef(name = "cs2__cst_jfn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstJfnKey;
    @XmlElementRef(name = "cs2__cst_cur_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstCurKey;
    @XmlElementRef(name = "cs2__cst_attribute_1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstAttribute1;
    @XmlElementRef(name = "cs2__cst_attribute_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstAttribute2;
    @XmlElementRef(name = "cs2__cst_do_not_include_directory_ext_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs2CstDoNotIncludeDirectoryExtFlag;
    @XmlElementRef(name = "cs2__cst_salutation_1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstSalutation1;
    @XmlElementRef(name = "cs2__cst_source_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstSourceExt;
    @XmlElementRef(name = "cs2__cst_salutation_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstSalutation2;
    @XmlElementRef(name = "cs2__cst_grace_period_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cs2CstGracePeriodExt;
    @XmlElementRef(name = "cs2__cst_merge_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstMergeCstKey;
    @XmlElementRef(name = "cs2__cst_salutation_3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstSalutation3;
    @XmlElementRef(name = "cs2__cst_salutation_4", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstSalutation4;
    @XmlElementRef(name = "cs2__cst_default_recognize_as", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstDefaultRecognizeAs;
    @XmlElementRef(name = "cs2__cst_score", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> cs2CstScore;
    @XmlElementRef(name = "cs2__cst_score_normalized", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cs2CstScoreNormalized;
    @XmlElementRef(name = "cs2__cst_score_trend", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cs2CstScoreTrend;
    @XmlElementRef(name = "cs2__cst_vault_account", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstVaultAccount;
    @XmlElementRef(name = "cs2__cst_exclude_from_social_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs2CstExcludeFromSocialFlag;
    @XmlElementRef(name = "cs2__cst_social_score", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cs2CstSocialScore;
    @XmlElementRef(name = "cs2__cst_ptin", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstPtin;
    @XmlElementRef(name = "cs2__cst_aicpa_member_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> cs2CstAicpaMemberId;
    @XmlElementRef(name = "cs2__cst_vendor_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstVendorCode;
    @XmlElementRef(name = "cs2__cst_sca_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs2CstScaKey;

    /**
     * Gets the value of the cs2CstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstKey() {
        return cs2CstKey;
    }

    /**
     * Sets the value of the cs2CstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstKey(JAXBElement<String> value) {
        this.cs2CstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstType() {
        return cs2CstType;
    }

    /**
     * Sets the value of the cs2CstType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstType(JAXBElement<String> value) {
        this.cs2CstType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstNameCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstNameCp() {
        return cs2CstNameCp;
    }

    /**
     * Sets the value of the cs2CstNameCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstNameCp(JAXBElement<String> value) {
        this.cs2CstNameCp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstSortNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstSortNameDn() {
        return cs2CstSortNameDn;
    }

    /**
     * Sets the value of the cs2CstSortNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstSortNameDn(JAXBElement<String> value) {
        this.cs2CstSortNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstIndFullNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstIndFullNameDn() {
        return cs2CstIndFullNameDn;
    }

    /**
     * Sets the value of the cs2CstIndFullNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstIndFullNameDn(JAXBElement<String> value) {
        this.cs2CstIndFullNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstOrgNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstOrgNameDn() {
        return cs2CstOrgNameDn;
    }

    /**
     * Sets the value of the cs2CstOrgNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstOrgNameDn(JAXBElement<String> value) {
        this.cs2CstOrgNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstIxoTitleDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstIxoTitleDn() {
        return cs2CstIxoTitleDn;
    }

    /**
     * Sets the value of the cs2CstIxoTitleDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstIxoTitleDn(JAXBElement<String> value) {
        this.cs2CstIxoTitleDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstPrefCommMeth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstPrefCommMeth() {
        return cs2CstPrefCommMeth;
    }

    /**
     * Sets the value of the cs2CstPrefCommMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstPrefCommMeth(JAXBElement<String> value) {
        this.cs2CstPrefCommMeth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstBio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstBio() {
        return cs2CstBio;
    }

    /**
     * Sets the value of the cs2CstBio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstBio(JAXBElement<String> value) {
        this.cs2CstBio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstAddDate() {
        return cs2CstAddDate;
    }

    /**
     * Sets the value of the cs2CstAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstAddDate(JAXBElement<String> value) {
        this.cs2CstAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstAddUser() {
        return cs2CstAddUser;
    }

    /**
     * Sets the value of the cs2CstAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstAddUser(JAXBElement<String> value) {
        this.cs2CstAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstChangeDate() {
        return cs2CstChangeDate;
    }

    /**
     * Sets the value of the cs2CstChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstChangeDate(JAXBElement<String> value) {
        this.cs2CstChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstChangeUser() {
        return cs2CstChangeUser;
    }

    /**
     * Sets the value of the cs2CstChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstChangeUser(JAXBElement<String> value) {
        this.cs2CstChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs2CstDeleteFlag() {
        return cs2CstDeleteFlag;
    }

    /**
     * Sets the value of the cs2CstDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs2CstDeleteFlag(JAXBElement<Short> value) {
        this.cs2CstDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs2CstRecno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCs2CstRecno() {
        return cs2CstRecno;
    }

    /**
     * Sets the value of the cs2CstRecno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCs2CstRecno(JAXBElement<Long> value) {
        this.cs2CstRecno = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the cs2CstId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstId() {
        return cs2CstId;
    }

    /**
     * Sets the value of the cs2CstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstId(JAXBElement<String> value) {
        this.cs2CstId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstKeyExt() {
        return cs2CstKeyExt;
    }

    /**
     * Sets the value of the cs2CstKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstKeyExt(JAXBElement<String> value) {
        this.cs2CstKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstEmailTextOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs2CstEmailTextOnly() {
        return cs2CstEmailTextOnly;
    }

    /**
     * Sets the value of the cs2CstEmailTextOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs2CstEmailTextOnly(JAXBElement<Short> value) {
        this.cs2CstEmailTextOnly = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs2CstCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCs2CstCreditLimit() {
        return cs2CstCreditLimit;
    }

    /**
     * Sets the value of the cs2CstCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCs2CstCreditLimit(JAXBElement<BigDecimal> value) {
        this.cs2CstCreditLimit = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the cs2CstSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstSrcKey() {
        return cs2CstSrcKey;
    }

    /**
     * Sets the value of the cs2CstSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstSrcKey(JAXBElement<String> value) {
        this.cs2CstSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstSrcCode() {
        return cs2CstSrcCode;
    }

    /**
     * Sets the value of the cs2CstSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstSrcCode(JAXBElement<String> value) {
        this.cs2CstSrcCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstTaxExemptFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs2CstTaxExemptFlag() {
        return cs2CstTaxExemptFlag;
    }

    /**
     * Sets the value of the cs2CstTaxExemptFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs2CstTaxExemptFlag(JAXBElement<Short> value) {
        this.cs2CstTaxExemptFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs2CstTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstTaxId() {
        return cs2CstTaxId;
    }

    /**
     * Sets the value of the cs2CstTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstTaxId(JAXBElement<String> value) {
        this.cs2CstTaxId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstCxaKey() {
        return cs2CstCxaKey;
    }

    /**
     * Sets the value of the cs2CstCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstCxaKey(JAXBElement<String> value) {
        this.cs2CstCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstNoEmailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs2CstNoEmailFlag() {
        return cs2CstNoEmailFlag;
    }

    /**
     * Sets the value of the cs2CstNoEmailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs2CstNoEmailFlag(JAXBElement<Short> value) {
        this.cs2CstNoEmailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs2CstCxaBillingKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstCxaBillingKey() {
        return cs2CstCxaBillingKey;
    }

    /**
     * Sets the value of the cs2CstCxaBillingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstCxaBillingKey(JAXBElement<String> value) {
        this.cs2CstCxaBillingKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstEmlAddressDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstEmlAddressDn() {
        return cs2CstEmlAddressDn;
    }

    /**
     * Sets the value of the cs2CstEmlAddressDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstEmlAddressDn(JAXBElement<String> value) {
        this.cs2CstEmlAddressDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstEmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstEmlKey() {
        return cs2CstEmlKey;
    }

    /**
     * Sets the value of the cs2CstEmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstEmlKey(JAXBElement<String> value) {
        this.cs2CstEmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstNoPhoneFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs2CstNoPhoneFlag() {
        return cs2CstNoPhoneFlag;
    }

    /**
     * Sets the value of the cs2CstNoPhoneFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs2CstNoPhoneFlag(JAXBElement<Short> value) {
        this.cs2CstNoPhoneFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs2CstPhnNumberCompleteDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstPhnNumberCompleteDn() {
        return cs2CstPhnNumberCompleteDn;
    }

    /**
     * Sets the value of the cs2CstPhnNumberCompleteDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstPhnNumberCompleteDn(JAXBElement<String> value) {
        this.cs2CstPhnNumberCompleteDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstCphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstCphKey() {
        return cs2CstCphKey;
    }

    /**
     * Sets the value of the cs2CstCphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstCphKey(JAXBElement<String> value) {
        this.cs2CstCphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstNoFaxFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs2CstNoFaxFlag() {
        return cs2CstNoFaxFlag;
    }

    /**
     * Sets the value of the cs2CstNoFaxFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs2CstNoFaxFlag(JAXBElement<Short> value) {
        this.cs2CstNoFaxFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs2CstFaxNumberCompleteDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstFaxNumberCompleteDn() {
        return cs2CstFaxNumberCompleteDn;
    }

    /**
     * Sets the value of the cs2CstFaxNumberCompleteDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstFaxNumberCompleteDn(JAXBElement<String> value) {
        this.cs2CstFaxNumberCompleteDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstCfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstCfxKey() {
        return cs2CstCfxKey;
    }

    /**
     * Sets the value of the cs2CstCfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstCfxKey(JAXBElement<String> value) {
        this.cs2CstCfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstIxoKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstIxoKey() {
        return cs2CstIxoKey;
    }

    /**
     * Sets the value of the cs2CstIxoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstIxoKey(JAXBElement<String> value) {
        this.cs2CstIxoKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstNoWebFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs2CstNoWebFlag() {
        return cs2CstNoWebFlag;
    }

    /**
     * Sets the value of the cs2CstNoWebFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs2CstNoWebFlag(JAXBElement<Short> value) {
        this.cs2CstNoWebFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs2CstOldid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstOldid() {
        return cs2CstOldid;
    }

    /**
     * Sets the value of the cs2CstOldid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstOldid(JAXBElement<String> value) {
        this.cs2CstOldid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstMemberFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs2CstMemberFlag() {
        return cs2CstMemberFlag;
    }

    /**
     * Sets the value of the cs2CstMemberFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs2CstMemberFlag(JAXBElement<Short> value) {
        this.cs2CstMemberFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs2CstUrlCodeDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstUrlCodeDn() {
        return cs2CstUrlCodeDn;
    }

    /**
     * Sets the value of the cs2CstUrlCodeDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstUrlCodeDn(JAXBElement<String> value) {
        this.cs2CstUrlCodeDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstParentCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstParentCstKey() {
        return cs2CstParentCstKey;
    }

    /**
     * Sets the value of the cs2CstParentCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstParentCstKey(JAXBElement<String> value) {
        this.cs2CstParentCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstUrlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstUrlKey() {
        return cs2CstUrlKey;
    }

    /**
     * Sets the value of the cs2CstUrlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstUrlKey(JAXBElement<String> value) {
        this.cs2CstUrlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstNoMsgFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs2CstNoMsgFlag() {
        return cs2CstNoMsgFlag;
    }

    /**
     * Sets the value of the cs2CstNoMsgFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs2CstNoMsgFlag(JAXBElement<Short> value) {
        this.cs2CstNoMsgFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs2CstMsgHandleDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstMsgHandleDn() {
        return cs2CstMsgHandleDn;
    }

    /**
     * Sets the value of the cs2CstMsgHandleDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstMsgHandleDn(JAXBElement<String> value) {
        this.cs2CstMsgHandleDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstWebLogin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstWebLogin() {
        return cs2CstWebLogin;
    }

    /**
     * Sets the value of the cs2CstWebLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstWebLogin(JAXBElement<String> value) {
        this.cs2CstWebLogin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstWebPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstWebPassword() {
        return cs2CstWebPassword;
    }

    /**
     * Sets the value of the cs2CstWebPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstWebPassword(JAXBElement<String> value) {
        this.cs2CstWebPassword = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstEntityKey() {
        return cs2CstEntityKey;
    }

    /**
     * Sets the value of the cs2CstEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstEntityKey(JAXBElement<String> value) {
        this.cs2CstEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstMsgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstMsgKey() {
        return cs2CstMsgKey;
    }

    /**
     * Sets the value of the cs2CstMsgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstMsgKey(JAXBElement<String> value) {
        this.cs2CstMsgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstNoMailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs2CstNoMailFlag() {
        return cs2CstNoMailFlag;
    }

    /**
     * Sets the value of the cs2CstNoMailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs2CstNoMailFlag(JAXBElement<Short> value) {
        this.cs2CstNoMailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs2CstWebStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstWebStartDate() {
        return cs2CstWebStartDate;
    }

    /**
     * Sets the value of the cs2CstWebStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstWebStartDate(JAXBElement<String> value) {
        this.cs2CstWebStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstWebEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstWebEndDate() {
        return cs2CstWebEndDate;
    }

    /**
     * Sets the value of the cs2CstWebEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstWebEndDate(JAXBElement<String> value) {
        this.cs2CstWebEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstWebForcePasswordChange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs2CstWebForcePasswordChange() {
        return cs2CstWebForcePasswordChange;
    }

    /**
     * Sets the value of the cs2CstWebForcePasswordChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs2CstWebForcePasswordChange(JAXBElement<Short> value) {
        this.cs2CstWebForcePasswordChange = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs2CstWebLoginDisabledFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs2CstWebLoginDisabledFlag() {
        return cs2CstWebLoginDisabledFlag;
    }

    /**
     * Sets the value of the cs2CstWebLoginDisabledFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs2CstWebLoginDisabledFlag(JAXBElement<Short> value) {
        this.cs2CstWebLoginDisabledFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs2CstComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstComment() {
        return cs2CstComment;
    }

    /**
     * Sets the value of the cs2CstComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstComment(JAXBElement<String> value) {
        this.cs2CstComment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstCreditHoldFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs2CstCreditHoldFlag() {
        return cs2CstCreditHoldFlag;
    }

    /**
     * Sets the value of the cs2CstCreditHoldFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs2CstCreditHoldFlag(JAXBElement<Short> value) {
        this.cs2CstCreditHoldFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs2CstCreditHoldReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstCreditHoldReason() {
        return cs2CstCreditHoldReason;
    }

    /**
     * Sets the value of the cs2CstCreditHoldReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstCreditHoldReason(JAXBElement<String> value) {
        this.cs2CstCreditHoldReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstWebForgotPasswordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs2CstWebForgotPasswordStatus() {
        return cs2CstWebForgotPasswordStatus;
    }

    /**
     * Sets the value of the cs2CstWebForgotPasswordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs2CstWebForgotPasswordStatus(JAXBElement<Short> value) {
        this.cs2CstWebForgotPasswordStatus = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs2CstOldCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstOldCxaKey() {
        return cs2CstOldCxaKey;
    }

    /**
     * Sets the value of the cs2CstOldCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstOldCxaKey(JAXBElement<String> value) {
        this.cs2CstOldCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstLastEmailDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstLastEmailDate() {
        return cs2CstLastEmailDate;
    }

    /**
     * Sets the value of the cs2CstLastEmailDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstLastEmailDate(JAXBElement<String> value) {
        this.cs2CstLastEmailDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstNoPublishFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs2CstNoPublishFlag() {
        return cs2CstNoPublishFlag;
    }

    /**
     * Sets the value of the cs2CstNoPublishFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs2CstNoPublishFlag(JAXBElement<Short> value) {
        this.cs2CstNoPublishFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs2CstSinKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstSinKey() {
        return cs2CstSinKey;
    }

    /**
     * Sets the value of the cs2CstSinKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstSinKey(JAXBElement<String> value) {
        this.cs2CstSinKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstTtlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstTtlKey() {
        return cs2CstTtlKey;
    }

    /**
     * Sets the value of the cs2CstTtlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstTtlKey(JAXBElement<String> value) {
        this.cs2CstTtlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstJfnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstJfnKey() {
        return cs2CstJfnKey;
    }

    /**
     * Sets the value of the cs2CstJfnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstJfnKey(JAXBElement<String> value) {
        this.cs2CstJfnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstCurKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstCurKey() {
        return cs2CstCurKey;
    }

    /**
     * Sets the value of the cs2CstCurKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstCurKey(JAXBElement<String> value) {
        this.cs2CstCurKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstAttribute1() {
        return cs2CstAttribute1;
    }

    /**
     * Sets the value of the cs2CstAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstAttribute1(JAXBElement<String> value) {
        this.cs2CstAttribute1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstAttribute2() {
        return cs2CstAttribute2;
    }

    /**
     * Sets the value of the cs2CstAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstAttribute2(JAXBElement<String> value) {
        this.cs2CstAttribute2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstDoNotIncludeDirectoryExtFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs2CstDoNotIncludeDirectoryExtFlag() {
        return cs2CstDoNotIncludeDirectoryExtFlag;
    }

    /**
     * Sets the value of the cs2CstDoNotIncludeDirectoryExtFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs2CstDoNotIncludeDirectoryExtFlag(JAXBElement<Short> value) {
        this.cs2CstDoNotIncludeDirectoryExtFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs2CstSalutation1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstSalutation1() {
        return cs2CstSalutation1;
    }

    /**
     * Sets the value of the cs2CstSalutation1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstSalutation1(JAXBElement<String> value) {
        this.cs2CstSalutation1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstSourceExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstSourceExt() {
        return cs2CstSourceExt;
    }

    /**
     * Sets the value of the cs2CstSourceExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstSourceExt(JAXBElement<String> value) {
        this.cs2CstSourceExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstSalutation2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstSalutation2() {
        return cs2CstSalutation2;
    }

    /**
     * Sets the value of the cs2CstSalutation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstSalutation2(JAXBElement<String> value) {
        this.cs2CstSalutation2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstGracePeriodExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCs2CstGracePeriodExt() {
        return cs2CstGracePeriodExt;
    }

    /**
     * Sets the value of the cs2CstGracePeriodExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCs2CstGracePeriodExt(JAXBElement<Integer> value) {
        this.cs2CstGracePeriodExt = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cs2CstMergeCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstMergeCstKey() {
        return cs2CstMergeCstKey;
    }

    /**
     * Sets the value of the cs2CstMergeCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstMergeCstKey(JAXBElement<String> value) {
        this.cs2CstMergeCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstSalutation3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstSalutation3() {
        return cs2CstSalutation3;
    }

    /**
     * Sets the value of the cs2CstSalutation3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstSalutation3(JAXBElement<String> value) {
        this.cs2CstSalutation3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstSalutation4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstSalutation4() {
        return cs2CstSalutation4;
    }

    /**
     * Sets the value of the cs2CstSalutation4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstSalutation4(JAXBElement<String> value) {
        this.cs2CstSalutation4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstDefaultRecognizeAs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstDefaultRecognizeAs() {
        return cs2CstDefaultRecognizeAs;
    }

    /**
     * Sets the value of the cs2CstDefaultRecognizeAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstDefaultRecognizeAs(JAXBElement<String> value) {
        this.cs2CstDefaultRecognizeAs = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCs2CstScore() {
        return cs2CstScore;
    }

    /**
     * Sets the value of the cs2CstScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCs2CstScore(JAXBElement<BigDecimal> value) {
        this.cs2CstScore = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the cs2CstScoreNormalized property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCs2CstScoreNormalized() {
        return cs2CstScoreNormalized;
    }

    /**
     * Sets the value of the cs2CstScoreNormalized property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCs2CstScoreNormalized(JAXBElement<Integer> value) {
        this.cs2CstScoreNormalized = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cs2CstScoreTrend property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCs2CstScoreTrend() {
        return cs2CstScoreTrend;
    }

    /**
     * Sets the value of the cs2CstScoreTrend property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCs2CstScoreTrend(JAXBElement<Integer> value) {
        this.cs2CstScoreTrend = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cs2CstVaultAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstVaultAccount() {
        return cs2CstVaultAccount;
    }

    /**
     * Sets the value of the cs2CstVaultAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstVaultAccount(JAXBElement<String> value) {
        this.cs2CstVaultAccount = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstExcludeFromSocialFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs2CstExcludeFromSocialFlag() {
        return cs2CstExcludeFromSocialFlag;
    }

    /**
     * Sets the value of the cs2CstExcludeFromSocialFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs2CstExcludeFromSocialFlag(JAXBElement<Short> value) {
        this.cs2CstExcludeFromSocialFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs2CstSocialScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCs2CstSocialScore() {
        return cs2CstSocialScore;
    }

    /**
     * Sets the value of the cs2CstSocialScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCs2CstSocialScore(JAXBElement<Integer> value) {
        this.cs2CstSocialScore = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cs2CstPtin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstPtin() {
        return cs2CstPtin;
    }

    /**
     * Sets the value of the cs2CstPtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstPtin(JAXBElement<String> value) {
        this.cs2CstPtin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstAicpaMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCs2CstAicpaMemberId() {
        return cs2CstAicpaMemberId;
    }

    /**
     * Sets the value of the cs2CstAicpaMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCs2CstAicpaMemberId(JAXBElement<Long> value) {
        this.cs2CstAicpaMemberId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the cs2CstVendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstVendorCode() {
        return cs2CstVendorCode;
    }

    /**
     * Sets the value of the cs2CstVendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstVendorCode(JAXBElement<String> value) {
        this.cs2CstVendorCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs2CstScaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs2CstScaKey() {
        return cs2CstScaKey;
    }

    /**
     * Sets the value of the cs2CstScaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs2CstScaKey(JAXBElement<String> value) {
        this.cs2CstScaKey = ((JAXBElement<String> ) value);
    }

}
