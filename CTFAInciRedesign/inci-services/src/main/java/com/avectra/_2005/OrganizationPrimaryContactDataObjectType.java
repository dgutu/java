
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organization_Primary_Contact_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Primary_Contact_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="con__cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_type" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_name_cp" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_sort_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_ind_full_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_org_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_ixo_title_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_pref_comm_meth" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_bio" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_recno" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_id" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_email_text_only" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_credit_limit" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_src_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_tax_exempt_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_tax_id" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_no_email_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_cxa_billing_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_eml_address_dn" type="{http://www.avectra.com/2005/}av_email_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_no_phone_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_phn_number_complete_dn" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_no_fax_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_fax_number_complete_dn" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_ixo_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_no_web_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_oldid" type="{http://www.avectra.com/2005/}stringLength15_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_member_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_url_code_dn" type="{http://www.avectra.com/2005/}av_url_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_parent_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_url_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_no_msg_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_msg_handle_dn" type="{http://www.avectra.com/2005/}av_messaging_name_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_web_login" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_web_password" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_msg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_no_mail_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_web_start_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_web_end_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_web_force_password_change" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_web_login_disabled_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_comment" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_credit_hold_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_credit_hold_reason" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_web_forgot_password_status" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_old_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_last_email_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_no_publish_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_sin_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_ttl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_jfn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_cur_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_attribute_1" type="{http://www.avectra.com/2005/}stringLength510_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_attribute_2" type="{http://www.avectra.com/2005/}stringLength510_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_do_not_include_directory_ext_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_salutation_1" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_source_ext" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_salutation_2" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_grace_period_ext" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_merge_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_salutation_3" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_salutation_4" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_default_recognize_as" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_score" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_score_normalized" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_score_trend" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_vault_account" type="{http://www.avectra.com/2005/}stringLength25_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_exclude_from_social_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_social_score" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_ptin" type="{http://www.avectra.com/2005/}stringLength9_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_aicpa_member_id" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_vendor_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="con__cst_sca_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Primary_Contact_DataObjectType", propOrder = {
    "conCstKey",
    "conCstType",
    "conCstNameCp",
    "conCstSortNameDn",
    "conCstIndFullNameDn",
    "conCstOrgNameDn",
    "conCstIxoTitleDn",
    "conCstPrefCommMeth",
    "conCstBio",
    "conCstAddDate",
    "conCstAddUser",
    "conCstChangeDate",
    "conCstChangeUser",
    "conCstDeleteFlag",
    "conCstRecno",
    "conCstId",
    "conCstKeyExt",
    "conCstEmailTextOnly",
    "conCstCreditLimit",
    "conCstSrcKey",
    "conCstSrcCode",
    "conCstTaxExemptFlag",
    "conCstTaxId",
    "conCstCxaKey",
    "conCstNoEmailFlag",
    "conCstCxaBillingKey",
    "conCstEmlAddressDn",
    "conCstEmlKey",
    "conCstNoPhoneFlag",
    "conCstPhnNumberCompleteDn",
    "conCstCphKey",
    "conCstNoFaxFlag",
    "conCstFaxNumberCompleteDn",
    "conCstCfxKey",
    "conCstIxoKey",
    "conCstNoWebFlag",
    "conCstOldid",
    "conCstMemberFlag",
    "conCstUrlCodeDn",
    "conCstParentCstKey",
    "conCstUrlKey",
    "conCstNoMsgFlag",
    "conCstMsgHandleDn",
    "conCstWebLogin",
    "conCstWebPassword",
    "conCstEntityKey",
    "conCstMsgKey",
    "conCstNoMailFlag",
    "conCstWebStartDate",
    "conCstWebEndDate",
    "conCstWebForcePasswordChange",
    "conCstWebLoginDisabledFlag",
    "conCstComment",
    "conCstCreditHoldFlag",
    "conCstCreditHoldReason",
    "conCstWebForgotPasswordStatus",
    "conCstOldCxaKey",
    "conCstLastEmailDate",
    "conCstNoPublishFlag",
    "conCstSinKey",
    "conCstTtlKey",
    "conCstJfnKey",
    "conCstCurKey",
    "conCstAttribute1",
    "conCstAttribute2",
    "conCstDoNotIncludeDirectoryExtFlag",
    "conCstSalutation1",
    "conCstSourceExt",
    "conCstSalutation2",
    "conCstGracePeriodExt",
    "conCstMergeCstKey",
    "conCstSalutation3",
    "conCstSalutation4",
    "conCstDefaultRecognizeAs",
    "conCstScore",
    "conCstScoreNormalized",
    "conCstScoreTrend",
    "conCstVaultAccount",
    "conCstExcludeFromSocialFlag",
    "conCstSocialScore",
    "conCstPtin",
    "conCstAicpaMemberId",
    "conCstVendorCode",
    "conCstScaKey"
})
public class OrganizationPrimaryContactDataObjectType {

    @XmlElementRef(name = "con__cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstKey;
    @XmlElementRef(name = "con__cst_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstType;
    @XmlElementRef(name = "con__cst_name_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstNameCp;
    @XmlElementRef(name = "con__cst_sort_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstSortNameDn;
    @XmlElementRef(name = "con__cst_ind_full_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstIndFullNameDn;
    @XmlElementRef(name = "con__cst_org_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstOrgNameDn;
    @XmlElementRef(name = "con__cst_ixo_title_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstIxoTitleDn;
    @XmlElementRef(name = "con__cst_pref_comm_meth", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstPrefCommMeth;
    @XmlElementRef(name = "con__cst_bio", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstBio;
    @XmlElementRef(name = "con__cst_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstAddDate;
    @XmlElementRef(name = "con__cst_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstAddUser;
    @XmlElementRef(name = "con__cst_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstChangeDate;
    @XmlElementRef(name = "con__cst_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstChangeUser;
    @XmlElementRef(name = "con__cst_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> conCstDeleteFlag;
    @XmlElementRef(name = "con__cst_recno", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> conCstRecno;
    @XmlElementRef(name = "con__cst_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstId;
    @XmlElementRef(name = "con__cst_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstKeyExt;
    @XmlElementRef(name = "con__cst_email_text_only", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> conCstEmailTextOnly;
    @XmlElementRef(name = "con__cst_credit_limit", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> conCstCreditLimit;
    @XmlElementRef(name = "con__cst_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstSrcKey;
    @XmlElementRef(name = "con__cst_src_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstSrcCode;
    @XmlElementRef(name = "con__cst_tax_exempt_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> conCstTaxExemptFlag;
    @XmlElementRef(name = "con__cst_tax_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstTaxId;
    @XmlElementRef(name = "con__cst_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstCxaKey;
    @XmlElementRef(name = "con__cst_no_email_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> conCstNoEmailFlag;
    @XmlElementRef(name = "con__cst_cxa_billing_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstCxaBillingKey;
    @XmlElementRef(name = "con__cst_eml_address_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstEmlAddressDn;
    @XmlElementRef(name = "con__cst_eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstEmlKey;
    @XmlElementRef(name = "con__cst_no_phone_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> conCstNoPhoneFlag;
    @XmlElementRef(name = "con__cst_phn_number_complete_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstPhnNumberCompleteDn;
    @XmlElementRef(name = "con__cst_cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstCphKey;
    @XmlElementRef(name = "con__cst_no_fax_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> conCstNoFaxFlag;
    @XmlElementRef(name = "con__cst_fax_number_complete_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstFaxNumberCompleteDn;
    @XmlElementRef(name = "con__cst_cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstCfxKey;
    @XmlElementRef(name = "con__cst_ixo_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstIxoKey;
    @XmlElementRef(name = "con__cst_no_web_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> conCstNoWebFlag;
    @XmlElementRef(name = "con__cst_oldid", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstOldid;
    @XmlElementRef(name = "con__cst_member_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> conCstMemberFlag;
    @XmlElementRef(name = "con__cst_url_code_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstUrlCodeDn;
    @XmlElementRef(name = "con__cst_parent_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstParentCstKey;
    @XmlElementRef(name = "con__cst_url_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstUrlKey;
    @XmlElementRef(name = "con__cst_no_msg_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> conCstNoMsgFlag;
    @XmlElementRef(name = "con__cst_msg_handle_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstMsgHandleDn;
    @XmlElementRef(name = "con__cst_web_login", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstWebLogin;
    @XmlElementRef(name = "con__cst_web_password", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstWebPassword;
    @XmlElementRef(name = "con__cst_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstEntityKey;
    @XmlElementRef(name = "con__cst_msg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstMsgKey;
    @XmlElementRef(name = "con__cst_no_mail_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> conCstNoMailFlag;
    @XmlElementRef(name = "con__cst_web_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstWebStartDate;
    @XmlElementRef(name = "con__cst_web_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstWebEndDate;
    @XmlElementRef(name = "con__cst_web_force_password_change", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> conCstWebForcePasswordChange;
    @XmlElementRef(name = "con__cst_web_login_disabled_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> conCstWebLoginDisabledFlag;
    @XmlElementRef(name = "con__cst_comment", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstComment;
    @XmlElementRef(name = "con__cst_credit_hold_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> conCstCreditHoldFlag;
    @XmlElementRef(name = "con__cst_credit_hold_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstCreditHoldReason;
    @XmlElementRef(name = "con__cst_web_forgot_password_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> conCstWebForgotPasswordStatus;
    @XmlElementRef(name = "con__cst_old_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstOldCxaKey;
    @XmlElementRef(name = "con__cst_last_email_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstLastEmailDate;
    @XmlElementRef(name = "con__cst_no_publish_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> conCstNoPublishFlag;
    @XmlElementRef(name = "con__cst_sin_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstSinKey;
    @XmlElementRef(name = "con__cst_ttl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstTtlKey;
    @XmlElementRef(name = "con__cst_jfn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstJfnKey;
    @XmlElementRef(name = "con__cst_cur_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstCurKey;
    @XmlElementRef(name = "con__cst_attribute_1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstAttribute1;
    @XmlElementRef(name = "con__cst_attribute_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstAttribute2;
    @XmlElementRef(name = "con__cst_do_not_include_directory_ext_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> conCstDoNotIncludeDirectoryExtFlag;
    @XmlElementRef(name = "con__cst_salutation_1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstSalutation1;
    @XmlElementRef(name = "con__cst_source_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstSourceExt;
    @XmlElementRef(name = "con__cst_salutation_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstSalutation2;
    @XmlElementRef(name = "con__cst_grace_period_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> conCstGracePeriodExt;
    @XmlElementRef(name = "con__cst_merge_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstMergeCstKey;
    @XmlElementRef(name = "con__cst_salutation_3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstSalutation3;
    @XmlElementRef(name = "con__cst_salutation_4", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstSalutation4;
    @XmlElementRef(name = "con__cst_default_recognize_as", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstDefaultRecognizeAs;
    @XmlElementRef(name = "con__cst_score", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> conCstScore;
    @XmlElementRef(name = "con__cst_score_normalized", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> conCstScoreNormalized;
    @XmlElementRef(name = "con__cst_score_trend", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> conCstScoreTrend;
    @XmlElementRef(name = "con__cst_vault_account", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstVaultAccount;
    @XmlElementRef(name = "con__cst_exclude_from_social_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> conCstExcludeFromSocialFlag;
    @XmlElementRef(name = "con__cst_social_score", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> conCstSocialScore;
    @XmlElementRef(name = "con__cst_ptin", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstPtin;
    @XmlElementRef(name = "con__cst_aicpa_member_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> conCstAicpaMemberId;
    @XmlElementRef(name = "con__cst_vendor_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstVendorCode;
    @XmlElementRef(name = "con__cst_sca_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> conCstScaKey;

    /**
     * Gets the value of the conCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstKey() {
        return conCstKey;
    }

    /**
     * Sets the value of the conCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstKey(JAXBElement<String> value) {
        this.conCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstType() {
        return conCstType;
    }

    /**
     * Sets the value of the conCstType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstType(JAXBElement<String> value) {
        this.conCstType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstNameCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstNameCp() {
        return conCstNameCp;
    }

    /**
     * Sets the value of the conCstNameCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstNameCp(JAXBElement<String> value) {
        this.conCstNameCp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstSortNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstSortNameDn() {
        return conCstSortNameDn;
    }

    /**
     * Sets the value of the conCstSortNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstSortNameDn(JAXBElement<String> value) {
        this.conCstSortNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstIndFullNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstIndFullNameDn() {
        return conCstIndFullNameDn;
    }

    /**
     * Sets the value of the conCstIndFullNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstIndFullNameDn(JAXBElement<String> value) {
        this.conCstIndFullNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstOrgNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstOrgNameDn() {
        return conCstOrgNameDn;
    }

    /**
     * Sets the value of the conCstOrgNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstOrgNameDn(JAXBElement<String> value) {
        this.conCstOrgNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstIxoTitleDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstIxoTitleDn() {
        return conCstIxoTitleDn;
    }

    /**
     * Sets the value of the conCstIxoTitleDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstIxoTitleDn(JAXBElement<String> value) {
        this.conCstIxoTitleDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstPrefCommMeth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstPrefCommMeth() {
        return conCstPrefCommMeth;
    }

    /**
     * Sets the value of the conCstPrefCommMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstPrefCommMeth(JAXBElement<String> value) {
        this.conCstPrefCommMeth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstBio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstBio() {
        return conCstBio;
    }

    /**
     * Sets the value of the conCstBio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstBio(JAXBElement<String> value) {
        this.conCstBio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstAddDate() {
        return conCstAddDate;
    }

    /**
     * Sets the value of the conCstAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstAddDate(JAXBElement<String> value) {
        this.conCstAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstAddUser() {
        return conCstAddUser;
    }

    /**
     * Sets the value of the conCstAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstAddUser(JAXBElement<String> value) {
        this.conCstAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstChangeDate() {
        return conCstChangeDate;
    }

    /**
     * Sets the value of the conCstChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstChangeDate(JAXBElement<String> value) {
        this.conCstChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstChangeUser() {
        return conCstChangeUser;
    }

    /**
     * Sets the value of the conCstChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstChangeUser(JAXBElement<String> value) {
        this.conCstChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getConCstDeleteFlag() {
        return conCstDeleteFlag;
    }

    /**
     * Sets the value of the conCstDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setConCstDeleteFlag(JAXBElement<Short> value) {
        this.conCstDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the conCstRecno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getConCstRecno() {
        return conCstRecno;
    }

    /**
     * Sets the value of the conCstRecno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setConCstRecno(JAXBElement<Long> value) {
        this.conCstRecno = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the conCstId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstId() {
        return conCstId;
    }

    /**
     * Sets the value of the conCstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstId(JAXBElement<String> value) {
        this.conCstId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstKeyExt() {
        return conCstKeyExt;
    }

    /**
     * Sets the value of the conCstKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstKeyExt(JAXBElement<String> value) {
        this.conCstKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstEmailTextOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getConCstEmailTextOnly() {
        return conCstEmailTextOnly;
    }

    /**
     * Sets the value of the conCstEmailTextOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setConCstEmailTextOnly(JAXBElement<Short> value) {
        this.conCstEmailTextOnly = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the conCstCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getConCstCreditLimit() {
        return conCstCreditLimit;
    }

    /**
     * Sets the value of the conCstCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setConCstCreditLimit(JAXBElement<BigDecimal> value) {
        this.conCstCreditLimit = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the conCstSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstSrcKey() {
        return conCstSrcKey;
    }

    /**
     * Sets the value of the conCstSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstSrcKey(JAXBElement<String> value) {
        this.conCstSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstSrcCode() {
        return conCstSrcCode;
    }

    /**
     * Sets the value of the conCstSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstSrcCode(JAXBElement<String> value) {
        this.conCstSrcCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstTaxExemptFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getConCstTaxExemptFlag() {
        return conCstTaxExemptFlag;
    }

    /**
     * Sets the value of the conCstTaxExemptFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setConCstTaxExemptFlag(JAXBElement<Short> value) {
        this.conCstTaxExemptFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the conCstTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstTaxId() {
        return conCstTaxId;
    }

    /**
     * Sets the value of the conCstTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstTaxId(JAXBElement<String> value) {
        this.conCstTaxId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstCxaKey() {
        return conCstCxaKey;
    }

    /**
     * Sets the value of the conCstCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstCxaKey(JAXBElement<String> value) {
        this.conCstCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstNoEmailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getConCstNoEmailFlag() {
        return conCstNoEmailFlag;
    }

    /**
     * Sets the value of the conCstNoEmailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setConCstNoEmailFlag(JAXBElement<Short> value) {
        this.conCstNoEmailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the conCstCxaBillingKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstCxaBillingKey() {
        return conCstCxaBillingKey;
    }

    /**
     * Sets the value of the conCstCxaBillingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstCxaBillingKey(JAXBElement<String> value) {
        this.conCstCxaBillingKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstEmlAddressDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstEmlAddressDn() {
        return conCstEmlAddressDn;
    }

    /**
     * Sets the value of the conCstEmlAddressDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstEmlAddressDn(JAXBElement<String> value) {
        this.conCstEmlAddressDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstEmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstEmlKey() {
        return conCstEmlKey;
    }

    /**
     * Sets the value of the conCstEmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstEmlKey(JAXBElement<String> value) {
        this.conCstEmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstNoPhoneFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getConCstNoPhoneFlag() {
        return conCstNoPhoneFlag;
    }

    /**
     * Sets the value of the conCstNoPhoneFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setConCstNoPhoneFlag(JAXBElement<Short> value) {
        this.conCstNoPhoneFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the conCstPhnNumberCompleteDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstPhnNumberCompleteDn() {
        return conCstPhnNumberCompleteDn;
    }

    /**
     * Sets the value of the conCstPhnNumberCompleteDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstPhnNumberCompleteDn(JAXBElement<String> value) {
        this.conCstPhnNumberCompleteDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstCphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstCphKey() {
        return conCstCphKey;
    }

    /**
     * Sets the value of the conCstCphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstCphKey(JAXBElement<String> value) {
        this.conCstCphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstNoFaxFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getConCstNoFaxFlag() {
        return conCstNoFaxFlag;
    }

    /**
     * Sets the value of the conCstNoFaxFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setConCstNoFaxFlag(JAXBElement<Short> value) {
        this.conCstNoFaxFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the conCstFaxNumberCompleteDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstFaxNumberCompleteDn() {
        return conCstFaxNumberCompleteDn;
    }

    /**
     * Sets the value of the conCstFaxNumberCompleteDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstFaxNumberCompleteDn(JAXBElement<String> value) {
        this.conCstFaxNumberCompleteDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstCfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstCfxKey() {
        return conCstCfxKey;
    }

    /**
     * Sets the value of the conCstCfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstCfxKey(JAXBElement<String> value) {
        this.conCstCfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstIxoKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstIxoKey() {
        return conCstIxoKey;
    }

    /**
     * Sets the value of the conCstIxoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstIxoKey(JAXBElement<String> value) {
        this.conCstIxoKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstNoWebFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getConCstNoWebFlag() {
        return conCstNoWebFlag;
    }

    /**
     * Sets the value of the conCstNoWebFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setConCstNoWebFlag(JAXBElement<Short> value) {
        this.conCstNoWebFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the conCstOldid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstOldid() {
        return conCstOldid;
    }

    /**
     * Sets the value of the conCstOldid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstOldid(JAXBElement<String> value) {
        this.conCstOldid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstMemberFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getConCstMemberFlag() {
        return conCstMemberFlag;
    }

    /**
     * Sets the value of the conCstMemberFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setConCstMemberFlag(JAXBElement<Short> value) {
        this.conCstMemberFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the conCstUrlCodeDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstUrlCodeDn() {
        return conCstUrlCodeDn;
    }

    /**
     * Sets the value of the conCstUrlCodeDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstUrlCodeDn(JAXBElement<String> value) {
        this.conCstUrlCodeDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstParentCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstParentCstKey() {
        return conCstParentCstKey;
    }

    /**
     * Sets the value of the conCstParentCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstParentCstKey(JAXBElement<String> value) {
        this.conCstParentCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstUrlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstUrlKey() {
        return conCstUrlKey;
    }

    /**
     * Sets the value of the conCstUrlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstUrlKey(JAXBElement<String> value) {
        this.conCstUrlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstNoMsgFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getConCstNoMsgFlag() {
        return conCstNoMsgFlag;
    }

    /**
     * Sets the value of the conCstNoMsgFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setConCstNoMsgFlag(JAXBElement<Short> value) {
        this.conCstNoMsgFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the conCstMsgHandleDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstMsgHandleDn() {
        return conCstMsgHandleDn;
    }

    /**
     * Sets the value of the conCstMsgHandleDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstMsgHandleDn(JAXBElement<String> value) {
        this.conCstMsgHandleDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstWebLogin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstWebLogin() {
        return conCstWebLogin;
    }

    /**
     * Sets the value of the conCstWebLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstWebLogin(JAXBElement<String> value) {
        this.conCstWebLogin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstWebPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstWebPassword() {
        return conCstWebPassword;
    }

    /**
     * Sets the value of the conCstWebPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstWebPassword(JAXBElement<String> value) {
        this.conCstWebPassword = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstEntityKey() {
        return conCstEntityKey;
    }

    /**
     * Sets the value of the conCstEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstEntityKey(JAXBElement<String> value) {
        this.conCstEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstMsgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstMsgKey() {
        return conCstMsgKey;
    }

    /**
     * Sets the value of the conCstMsgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstMsgKey(JAXBElement<String> value) {
        this.conCstMsgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstNoMailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getConCstNoMailFlag() {
        return conCstNoMailFlag;
    }

    /**
     * Sets the value of the conCstNoMailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setConCstNoMailFlag(JAXBElement<Short> value) {
        this.conCstNoMailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the conCstWebStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstWebStartDate() {
        return conCstWebStartDate;
    }

    /**
     * Sets the value of the conCstWebStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstWebStartDate(JAXBElement<String> value) {
        this.conCstWebStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstWebEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstWebEndDate() {
        return conCstWebEndDate;
    }

    /**
     * Sets the value of the conCstWebEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstWebEndDate(JAXBElement<String> value) {
        this.conCstWebEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstWebForcePasswordChange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getConCstWebForcePasswordChange() {
        return conCstWebForcePasswordChange;
    }

    /**
     * Sets the value of the conCstWebForcePasswordChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setConCstWebForcePasswordChange(JAXBElement<Short> value) {
        this.conCstWebForcePasswordChange = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the conCstWebLoginDisabledFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getConCstWebLoginDisabledFlag() {
        return conCstWebLoginDisabledFlag;
    }

    /**
     * Sets the value of the conCstWebLoginDisabledFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setConCstWebLoginDisabledFlag(JAXBElement<Short> value) {
        this.conCstWebLoginDisabledFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the conCstComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstComment() {
        return conCstComment;
    }

    /**
     * Sets the value of the conCstComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstComment(JAXBElement<String> value) {
        this.conCstComment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstCreditHoldFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getConCstCreditHoldFlag() {
        return conCstCreditHoldFlag;
    }

    /**
     * Sets the value of the conCstCreditHoldFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setConCstCreditHoldFlag(JAXBElement<Short> value) {
        this.conCstCreditHoldFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the conCstCreditHoldReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstCreditHoldReason() {
        return conCstCreditHoldReason;
    }

    /**
     * Sets the value of the conCstCreditHoldReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstCreditHoldReason(JAXBElement<String> value) {
        this.conCstCreditHoldReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstWebForgotPasswordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getConCstWebForgotPasswordStatus() {
        return conCstWebForgotPasswordStatus;
    }

    /**
     * Sets the value of the conCstWebForgotPasswordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setConCstWebForgotPasswordStatus(JAXBElement<Short> value) {
        this.conCstWebForgotPasswordStatus = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the conCstOldCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstOldCxaKey() {
        return conCstOldCxaKey;
    }

    /**
     * Sets the value of the conCstOldCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstOldCxaKey(JAXBElement<String> value) {
        this.conCstOldCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstLastEmailDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstLastEmailDate() {
        return conCstLastEmailDate;
    }

    /**
     * Sets the value of the conCstLastEmailDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstLastEmailDate(JAXBElement<String> value) {
        this.conCstLastEmailDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstNoPublishFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getConCstNoPublishFlag() {
        return conCstNoPublishFlag;
    }

    /**
     * Sets the value of the conCstNoPublishFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setConCstNoPublishFlag(JAXBElement<Short> value) {
        this.conCstNoPublishFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the conCstSinKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstSinKey() {
        return conCstSinKey;
    }

    /**
     * Sets the value of the conCstSinKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstSinKey(JAXBElement<String> value) {
        this.conCstSinKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstTtlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstTtlKey() {
        return conCstTtlKey;
    }

    /**
     * Sets the value of the conCstTtlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstTtlKey(JAXBElement<String> value) {
        this.conCstTtlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstJfnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstJfnKey() {
        return conCstJfnKey;
    }

    /**
     * Sets the value of the conCstJfnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstJfnKey(JAXBElement<String> value) {
        this.conCstJfnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstCurKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstCurKey() {
        return conCstCurKey;
    }

    /**
     * Sets the value of the conCstCurKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstCurKey(JAXBElement<String> value) {
        this.conCstCurKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstAttribute1() {
        return conCstAttribute1;
    }

    /**
     * Sets the value of the conCstAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstAttribute1(JAXBElement<String> value) {
        this.conCstAttribute1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstAttribute2() {
        return conCstAttribute2;
    }

    /**
     * Sets the value of the conCstAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstAttribute2(JAXBElement<String> value) {
        this.conCstAttribute2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstDoNotIncludeDirectoryExtFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getConCstDoNotIncludeDirectoryExtFlag() {
        return conCstDoNotIncludeDirectoryExtFlag;
    }

    /**
     * Sets the value of the conCstDoNotIncludeDirectoryExtFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setConCstDoNotIncludeDirectoryExtFlag(JAXBElement<Short> value) {
        this.conCstDoNotIncludeDirectoryExtFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the conCstSalutation1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstSalutation1() {
        return conCstSalutation1;
    }

    /**
     * Sets the value of the conCstSalutation1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstSalutation1(JAXBElement<String> value) {
        this.conCstSalutation1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstSourceExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstSourceExt() {
        return conCstSourceExt;
    }

    /**
     * Sets the value of the conCstSourceExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstSourceExt(JAXBElement<String> value) {
        this.conCstSourceExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstSalutation2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstSalutation2() {
        return conCstSalutation2;
    }

    /**
     * Sets the value of the conCstSalutation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstSalutation2(JAXBElement<String> value) {
        this.conCstSalutation2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstGracePeriodExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConCstGracePeriodExt() {
        return conCstGracePeriodExt;
    }

    /**
     * Sets the value of the conCstGracePeriodExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConCstGracePeriodExt(JAXBElement<Integer> value) {
        this.conCstGracePeriodExt = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the conCstMergeCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstMergeCstKey() {
        return conCstMergeCstKey;
    }

    /**
     * Sets the value of the conCstMergeCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstMergeCstKey(JAXBElement<String> value) {
        this.conCstMergeCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstSalutation3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstSalutation3() {
        return conCstSalutation3;
    }

    /**
     * Sets the value of the conCstSalutation3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstSalutation3(JAXBElement<String> value) {
        this.conCstSalutation3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstSalutation4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstSalutation4() {
        return conCstSalutation4;
    }

    /**
     * Sets the value of the conCstSalutation4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstSalutation4(JAXBElement<String> value) {
        this.conCstSalutation4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstDefaultRecognizeAs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstDefaultRecognizeAs() {
        return conCstDefaultRecognizeAs;
    }

    /**
     * Sets the value of the conCstDefaultRecognizeAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstDefaultRecognizeAs(JAXBElement<String> value) {
        this.conCstDefaultRecognizeAs = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getConCstScore() {
        return conCstScore;
    }

    /**
     * Sets the value of the conCstScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setConCstScore(JAXBElement<BigDecimal> value) {
        this.conCstScore = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the conCstScoreNormalized property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConCstScoreNormalized() {
        return conCstScoreNormalized;
    }

    /**
     * Sets the value of the conCstScoreNormalized property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConCstScoreNormalized(JAXBElement<Integer> value) {
        this.conCstScoreNormalized = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the conCstScoreTrend property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConCstScoreTrend() {
        return conCstScoreTrend;
    }

    /**
     * Sets the value of the conCstScoreTrend property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConCstScoreTrend(JAXBElement<Integer> value) {
        this.conCstScoreTrend = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the conCstVaultAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstVaultAccount() {
        return conCstVaultAccount;
    }

    /**
     * Sets the value of the conCstVaultAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstVaultAccount(JAXBElement<String> value) {
        this.conCstVaultAccount = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstExcludeFromSocialFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getConCstExcludeFromSocialFlag() {
        return conCstExcludeFromSocialFlag;
    }

    /**
     * Sets the value of the conCstExcludeFromSocialFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setConCstExcludeFromSocialFlag(JAXBElement<Short> value) {
        this.conCstExcludeFromSocialFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the conCstSocialScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConCstSocialScore() {
        return conCstSocialScore;
    }

    /**
     * Sets the value of the conCstSocialScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConCstSocialScore(JAXBElement<Integer> value) {
        this.conCstSocialScore = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the conCstPtin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstPtin() {
        return conCstPtin;
    }

    /**
     * Sets the value of the conCstPtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstPtin(JAXBElement<String> value) {
        this.conCstPtin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstAicpaMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getConCstAicpaMemberId() {
        return conCstAicpaMemberId;
    }

    /**
     * Sets the value of the conCstAicpaMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setConCstAicpaMemberId(JAXBElement<Long> value) {
        this.conCstAicpaMemberId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the conCstVendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstVendorCode() {
        return conCstVendorCode;
    }

    /**
     * Sets the value of the conCstVendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstVendorCode(JAXBElement<String> value) {
        this.conCstVendorCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the conCstScaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCstScaKey() {
        return conCstScaKey;
    }

    /**
     * Sets the value of the conCstScaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCstScaKey(JAXBElement<String> value) {
        this.conCstScaKey = ((JAXBElement<String> ) value);
    }

}
