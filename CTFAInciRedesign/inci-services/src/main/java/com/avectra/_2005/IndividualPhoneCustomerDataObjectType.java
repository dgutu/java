
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualPhone_Customer_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualPhone_Customer_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cst_type" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="cst_name_cp" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cst_sort_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cst_ind_full_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cst_org_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cst_ixo_title_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cst_pref_comm_meth" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cst_bio" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="cst_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cst_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cst_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cst_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cst_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cst_recno" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="cst_id" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cst_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cst_email_text_only" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cst_credit_limit" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="cst_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cst_src_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cst_tax_exempt_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cst_tax_id" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="cst_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cst_no_email_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cst_cxa_billing_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cst_eml_address_dn" type="{http://www.avectra.com/2005/}av_email_Type" minOccurs="0"/>
 *         &lt;element name="cst_eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cst_no_phone_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cst_phn_number_complete_dn" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="cst_cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cst_no_fax_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cst_fax_number_complete_dn" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="cst_cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cst_ixo_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cst_no_web_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cst_oldid" type="{http://www.avectra.com/2005/}stringLength15_Type" minOccurs="0"/>
 *         &lt;element name="cst_member_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cst_url_code_dn" type="{http://www.avectra.com/2005/}av_url_Type" minOccurs="0"/>
 *         &lt;element name="cst_parent_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cst_url_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cst_no_msg_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cst_msg_handle_dn" type="{http://www.avectra.com/2005/}av_messaging_name_Type" minOccurs="0"/>
 *         &lt;element name="cst_web_login" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="cst_web_password" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cst_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cst_msg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cst_no_mail_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cst_web_start_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cst_web_end_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cst_web_force_password_change" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cst_web_login_disabled_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cst_comment" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="cst_credit_hold_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cst_credit_hold_reason" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cst_web_forgot_password_status" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cst_old_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cst_last_email_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cst_no_publish_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cst_sin_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cst_ttl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cst_jfn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cst_cur_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cst_attribute_1" type="{http://www.avectra.com/2005/}stringLength510_Type" minOccurs="0"/>
 *         &lt;element name="cst_attribute_2" type="{http://www.avectra.com/2005/}stringLength510_Type" minOccurs="0"/>
 *         &lt;element name="cst_do_not_include_directory_ext_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cst_salutation_1" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cst_source_ext" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cst_salutation_2" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cst_grace_period_ext" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cst_merge_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cst_salutation_3" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cst_salutation_4" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cst_default_recognize_as" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="cst_score" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="cst_score_normalized" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cst_score_trend" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cst_vault_account" type="{http://www.avectra.com/2005/}stringLength25_Type" minOccurs="0"/>
 *         &lt;element name="cst_exclude_from_social_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cst_social_score" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cst_ptin" type="{http://www.avectra.com/2005/}stringLength9_Type" minOccurs="0"/>
 *         &lt;element name="cst_aicpa_member_id" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="cst_vendor_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cst_sca_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPhone_Customer_DataObjectType", propOrder = {
    "cstKey",
    "cstType",
    "cstNameCp",
    "cstSortNameDn",
    "cstIndFullNameDn",
    "cstOrgNameDn",
    "cstIxoTitleDn",
    "cstPrefCommMeth",
    "cstBio",
    "cstAddDate",
    "cstAddUser",
    "cstChangeDate",
    "cstChangeUser",
    "cstDeleteFlag",
    "cstRecno",
    "cstId",
    "cstKeyExt",
    "cstEmailTextOnly",
    "cstCreditLimit",
    "cstSrcKey",
    "cstSrcCode",
    "cstTaxExemptFlag",
    "cstTaxId",
    "cstCxaKey",
    "cstNoEmailFlag",
    "cstCxaBillingKey",
    "cstEmlAddressDn",
    "cstEmlKey",
    "cstNoPhoneFlag",
    "cstPhnNumberCompleteDn",
    "cstCphKey",
    "cstNoFaxFlag",
    "cstFaxNumberCompleteDn",
    "cstCfxKey",
    "cstIxoKey",
    "cstNoWebFlag",
    "cstOldid",
    "cstMemberFlag",
    "cstUrlCodeDn",
    "cstParentCstKey",
    "cstUrlKey",
    "cstNoMsgFlag",
    "cstMsgHandleDn",
    "cstWebLogin",
    "cstWebPassword",
    "cstEntityKey",
    "cstMsgKey",
    "cstNoMailFlag",
    "cstWebStartDate",
    "cstWebEndDate",
    "cstWebForcePasswordChange",
    "cstWebLoginDisabledFlag",
    "cstComment",
    "cstCreditHoldFlag",
    "cstCreditHoldReason",
    "cstWebForgotPasswordStatus",
    "cstOldCxaKey",
    "cstLastEmailDate",
    "cstNoPublishFlag",
    "cstSinKey",
    "cstTtlKey",
    "cstJfnKey",
    "cstCurKey",
    "cstAttribute1",
    "cstAttribute2",
    "cstDoNotIncludeDirectoryExtFlag",
    "cstSalutation1",
    "cstSourceExt",
    "cstSalutation2",
    "cstGracePeriodExt",
    "cstMergeCstKey",
    "cstSalutation3",
    "cstSalutation4",
    "cstDefaultRecognizeAs",
    "cstScore",
    "cstScoreNormalized",
    "cstScoreTrend",
    "cstVaultAccount",
    "cstExcludeFromSocialFlag",
    "cstSocialScore",
    "cstPtin",
    "cstAicpaMemberId",
    "cstVendorCode",
    "cstScaKey"
})
public class IndividualPhoneCustomerDataObjectType {

    @XmlElementRef(name = "cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstKey;
    @XmlElementRef(name = "cst_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstType;
    @XmlElementRef(name = "cst_name_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstNameCp;
    @XmlElementRef(name = "cst_sort_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstSortNameDn;
    @XmlElementRef(name = "cst_ind_full_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstIndFullNameDn;
    @XmlElementRef(name = "cst_org_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstOrgNameDn;
    @XmlElementRef(name = "cst_ixo_title_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstIxoTitleDn;
    @XmlElementRef(name = "cst_pref_comm_meth", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstPrefCommMeth;
    @XmlElementRef(name = "cst_bio", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstBio;
    @XmlElementRef(name = "cst_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstAddDate;
    @XmlElementRef(name = "cst_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstAddUser;
    @XmlElementRef(name = "cst_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstChangeDate;
    @XmlElementRef(name = "cst_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstChangeUser;
    @XmlElementRef(name = "cst_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cstDeleteFlag;
    @XmlElementRef(name = "cst_recno", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> cstRecno;
    @XmlElementRef(name = "cst_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstId;
    @XmlElementRef(name = "cst_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstKeyExt;
    @XmlElementRef(name = "cst_email_text_only", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cstEmailTextOnly;
    @XmlElementRef(name = "cst_credit_limit", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> cstCreditLimit;
    @XmlElementRef(name = "cst_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstSrcKey;
    @XmlElementRef(name = "cst_src_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstSrcCode;
    @XmlElementRef(name = "cst_tax_exempt_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cstTaxExemptFlag;
    @XmlElementRef(name = "cst_tax_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstTaxId;
    @XmlElementRef(name = "cst_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstCxaKey;
    @XmlElementRef(name = "cst_no_email_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cstNoEmailFlag;
    @XmlElementRef(name = "cst_cxa_billing_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstCxaBillingKey;
    @XmlElementRef(name = "cst_eml_address_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstEmlAddressDn;
    @XmlElementRef(name = "cst_eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstEmlKey;
    @XmlElementRef(name = "cst_no_phone_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cstNoPhoneFlag;
    @XmlElementRef(name = "cst_phn_number_complete_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstPhnNumberCompleteDn;
    @XmlElementRef(name = "cst_cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstCphKey;
    @XmlElementRef(name = "cst_no_fax_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cstNoFaxFlag;
    @XmlElementRef(name = "cst_fax_number_complete_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstFaxNumberCompleteDn;
    @XmlElementRef(name = "cst_cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstCfxKey;
    @XmlElementRef(name = "cst_ixo_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstIxoKey;
    @XmlElementRef(name = "cst_no_web_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cstNoWebFlag;
    @XmlElementRef(name = "cst_oldid", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstOldid;
    @XmlElementRef(name = "cst_member_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cstMemberFlag;
    @XmlElementRef(name = "cst_url_code_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstUrlCodeDn;
    @XmlElementRef(name = "cst_parent_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstParentCstKey;
    @XmlElementRef(name = "cst_url_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstUrlKey;
    @XmlElementRef(name = "cst_no_msg_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cstNoMsgFlag;
    @XmlElementRef(name = "cst_msg_handle_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstMsgHandleDn;
    @XmlElementRef(name = "cst_web_login", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstWebLogin;
    @XmlElementRef(name = "cst_web_password", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstWebPassword;
    @XmlElementRef(name = "cst_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstEntityKey;
    @XmlElementRef(name = "cst_msg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstMsgKey;
    @XmlElementRef(name = "cst_no_mail_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cstNoMailFlag;
    @XmlElementRef(name = "cst_web_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstWebStartDate;
    @XmlElementRef(name = "cst_web_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstWebEndDate;
    @XmlElementRef(name = "cst_web_force_password_change", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cstWebForcePasswordChange;
    @XmlElementRef(name = "cst_web_login_disabled_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cstWebLoginDisabledFlag;
    @XmlElementRef(name = "cst_comment", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstComment;
    @XmlElementRef(name = "cst_credit_hold_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cstCreditHoldFlag;
    @XmlElementRef(name = "cst_credit_hold_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstCreditHoldReason;
    @XmlElementRef(name = "cst_web_forgot_password_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cstWebForgotPasswordStatus;
    @XmlElementRef(name = "cst_old_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstOldCxaKey;
    @XmlElementRef(name = "cst_last_email_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstLastEmailDate;
    @XmlElementRef(name = "cst_no_publish_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cstNoPublishFlag;
    @XmlElementRef(name = "cst_sin_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstSinKey;
    @XmlElementRef(name = "cst_ttl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstTtlKey;
    @XmlElementRef(name = "cst_jfn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstJfnKey;
    @XmlElementRef(name = "cst_cur_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstCurKey;
    @XmlElementRef(name = "cst_attribute_1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstAttribute1;
    @XmlElementRef(name = "cst_attribute_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstAttribute2;
    @XmlElementRef(name = "cst_do_not_include_directory_ext_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cstDoNotIncludeDirectoryExtFlag;
    @XmlElementRef(name = "cst_salutation_1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstSalutation1;
    @XmlElementRef(name = "cst_source_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstSourceExt;
    @XmlElementRef(name = "cst_salutation_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstSalutation2;
    @XmlElementRef(name = "cst_grace_period_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cstGracePeriodExt;
    @XmlElementRef(name = "cst_merge_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstMergeCstKey;
    @XmlElementRef(name = "cst_salutation_3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstSalutation3;
    @XmlElementRef(name = "cst_salutation_4", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstSalutation4;
    @XmlElementRef(name = "cst_default_recognize_as", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstDefaultRecognizeAs;
    @XmlElementRef(name = "cst_score", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> cstScore;
    @XmlElementRef(name = "cst_score_normalized", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cstScoreNormalized;
    @XmlElementRef(name = "cst_score_trend", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cstScoreTrend;
    @XmlElementRef(name = "cst_vault_account", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstVaultAccount;
    @XmlElementRef(name = "cst_exclude_from_social_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cstExcludeFromSocialFlag;
    @XmlElementRef(name = "cst_social_score", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cstSocialScore;
    @XmlElementRef(name = "cst_ptin", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstPtin;
    @XmlElementRef(name = "cst_aicpa_member_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> cstAicpaMemberId;
    @XmlElementRef(name = "cst_vendor_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstVendorCode;
    @XmlElementRef(name = "cst_sca_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstScaKey;

    /**
     * Gets the value of the cstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstKey() {
        return cstKey;
    }

    /**
     * Sets the value of the cstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstKey(JAXBElement<String> value) {
        this.cstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstType() {
        return cstType;
    }

    /**
     * Sets the value of the cstType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstType(JAXBElement<String> value) {
        this.cstType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstNameCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstNameCp() {
        return cstNameCp;
    }

    /**
     * Sets the value of the cstNameCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstNameCp(JAXBElement<String> value) {
        this.cstNameCp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstSortNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstSortNameDn() {
        return cstSortNameDn;
    }

    /**
     * Sets the value of the cstSortNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstSortNameDn(JAXBElement<String> value) {
        this.cstSortNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstIndFullNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstIndFullNameDn() {
        return cstIndFullNameDn;
    }

    /**
     * Sets the value of the cstIndFullNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstIndFullNameDn(JAXBElement<String> value) {
        this.cstIndFullNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstOrgNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstOrgNameDn() {
        return cstOrgNameDn;
    }

    /**
     * Sets the value of the cstOrgNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstOrgNameDn(JAXBElement<String> value) {
        this.cstOrgNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstIxoTitleDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstIxoTitleDn() {
        return cstIxoTitleDn;
    }

    /**
     * Sets the value of the cstIxoTitleDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstIxoTitleDn(JAXBElement<String> value) {
        this.cstIxoTitleDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstPrefCommMeth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstPrefCommMeth() {
        return cstPrefCommMeth;
    }

    /**
     * Sets the value of the cstPrefCommMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstPrefCommMeth(JAXBElement<String> value) {
        this.cstPrefCommMeth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstBio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstBio() {
        return cstBio;
    }

    /**
     * Sets the value of the cstBio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstBio(JAXBElement<String> value) {
        this.cstBio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstAddDate() {
        return cstAddDate;
    }

    /**
     * Sets the value of the cstAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstAddDate(JAXBElement<String> value) {
        this.cstAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstAddUser() {
        return cstAddUser;
    }

    /**
     * Sets the value of the cstAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstAddUser(JAXBElement<String> value) {
        this.cstAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstChangeDate() {
        return cstChangeDate;
    }

    /**
     * Sets the value of the cstChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstChangeDate(JAXBElement<String> value) {
        this.cstChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstChangeUser() {
        return cstChangeUser;
    }

    /**
     * Sets the value of the cstChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstChangeUser(JAXBElement<String> value) {
        this.cstChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCstDeleteFlag() {
        return cstDeleteFlag;
    }

    /**
     * Sets the value of the cstDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCstDeleteFlag(JAXBElement<Short> value) {
        this.cstDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cstRecno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCstRecno() {
        return cstRecno;
    }

    /**
     * Sets the value of the cstRecno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCstRecno(JAXBElement<Long> value) {
        this.cstRecno = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the cstId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstId() {
        return cstId;
    }

    /**
     * Sets the value of the cstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstId(JAXBElement<String> value) {
        this.cstId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstKeyExt() {
        return cstKeyExt;
    }

    /**
     * Sets the value of the cstKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstKeyExt(JAXBElement<String> value) {
        this.cstKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstEmailTextOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCstEmailTextOnly() {
        return cstEmailTextOnly;
    }

    /**
     * Sets the value of the cstEmailTextOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCstEmailTextOnly(JAXBElement<Short> value) {
        this.cstEmailTextOnly = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cstCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCstCreditLimit() {
        return cstCreditLimit;
    }

    /**
     * Sets the value of the cstCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCstCreditLimit(JAXBElement<BigDecimal> value) {
        this.cstCreditLimit = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the cstSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstSrcKey() {
        return cstSrcKey;
    }

    /**
     * Sets the value of the cstSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstSrcKey(JAXBElement<String> value) {
        this.cstSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstSrcCode() {
        return cstSrcCode;
    }

    /**
     * Sets the value of the cstSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstSrcCode(JAXBElement<String> value) {
        this.cstSrcCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstTaxExemptFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCstTaxExemptFlag() {
        return cstTaxExemptFlag;
    }

    /**
     * Sets the value of the cstTaxExemptFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCstTaxExemptFlag(JAXBElement<Short> value) {
        this.cstTaxExemptFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cstTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstTaxId() {
        return cstTaxId;
    }

    /**
     * Sets the value of the cstTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstTaxId(JAXBElement<String> value) {
        this.cstTaxId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstCxaKey() {
        return cstCxaKey;
    }

    /**
     * Sets the value of the cstCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstCxaKey(JAXBElement<String> value) {
        this.cstCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstNoEmailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCstNoEmailFlag() {
        return cstNoEmailFlag;
    }

    /**
     * Sets the value of the cstNoEmailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCstNoEmailFlag(JAXBElement<Short> value) {
        this.cstNoEmailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cstCxaBillingKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstCxaBillingKey() {
        return cstCxaBillingKey;
    }

    /**
     * Sets the value of the cstCxaBillingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstCxaBillingKey(JAXBElement<String> value) {
        this.cstCxaBillingKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstEmlAddressDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstEmlAddressDn() {
        return cstEmlAddressDn;
    }

    /**
     * Sets the value of the cstEmlAddressDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstEmlAddressDn(JAXBElement<String> value) {
        this.cstEmlAddressDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstEmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstEmlKey() {
        return cstEmlKey;
    }

    /**
     * Sets the value of the cstEmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstEmlKey(JAXBElement<String> value) {
        this.cstEmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstNoPhoneFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCstNoPhoneFlag() {
        return cstNoPhoneFlag;
    }

    /**
     * Sets the value of the cstNoPhoneFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCstNoPhoneFlag(JAXBElement<Short> value) {
        this.cstNoPhoneFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cstPhnNumberCompleteDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstPhnNumberCompleteDn() {
        return cstPhnNumberCompleteDn;
    }

    /**
     * Sets the value of the cstPhnNumberCompleteDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstPhnNumberCompleteDn(JAXBElement<String> value) {
        this.cstPhnNumberCompleteDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstCphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstCphKey() {
        return cstCphKey;
    }

    /**
     * Sets the value of the cstCphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstCphKey(JAXBElement<String> value) {
        this.cstCphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstNoFaxFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCstNoFaxFlag() {
        return cstNoFaxFlag;
    }

    /**
     * Sets the value of the cstNoFaxFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCstNoFaxFlag(JAXBElement<Short> value) {
        this.cstNoFaxFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cstFaxNumberCompleteDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstFaxNumberCompleteDn() {
        return cstFaxNumberCompleteDn;
    }

    /**
     * Sets the value of the cstFaxNumberCompleteDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstFaxNumberCompleteDn(JAXBElement<String> value) {
        this.cstFaxNumberCompleteDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstCfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstCfxKey() {
        return cstCfxKey;
    }

    /**
     * Sets the value of the cstCfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstCfxKey(JAXBElement<String> value) {
        this.cstCfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstIxoKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstIxoKey() {
        return cstIxoKey;
    }

    /**
     * Sets the value of the cstIxoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstIxoKey(JAXBElement<String> value) {
        this.cstIxoKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstNoWebFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCstNoWebFlag() {
        return cstNoWebFlag;
    }

    /**
     * Sets the value of the cstNoWebFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCstNoWebFlag(JAXBElement<Short> value) {
        this.cstNoWebFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cstOldid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstOldid() {
        return cstOldid;
    }

    /**
     * Sets the value of the cstOldid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstOldid(JAXBElement<String> value) {
        this.cstOldid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstMemberFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCstMemberFlag() {
        return cstMemberFlag;
    }

    /**
     * Sets the value of the cstMemberFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCstMemberFlag(JAXBElement<Short> value) {
        this.cstMemberFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cstUrlCodeDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstUrlCodeDn() {
        return cstUrlCodeDn;
    }

    /**
     * Sets the value of the cstUrlCodeDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstUrlCodeDn(JAXBElement<String> value) {
        this.cstUrlCodeDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstParentCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstParentCstKey() {
        return cstParentCstKey;
    }

    /**
     * Sets the value of the cstParentCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstParentCstKey(JAXBElement<String> value) {
        this.cstParentCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstUrlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstUrlKey() {
        return cstUrlKey;
    }

    /**
     * Sets the value of the cstUrlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstUrlKey(JAXBElement<String> value) {
        this.cstUrlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstNoMsgFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCstNoMsgFlag() {
        return cstNoMsgFlag;
    }

    /**
     * Sets the value of the cstNoMsgFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCstNoMsgFlag(JAXBElement<Short> value) {
        this.cstNoMsgFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cstMsgHandleDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstMsgHandleDn() {
        return cstMsgHandleDn;
    }

    /**
     * Sets the value of the cstMsgHandleDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstMsgHandleDn(JAXBElement<String> value) {
        this.cstMsgHandleDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstWebLogin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstWebLogin() {
        return cstWebLogin;
    }

    /**
     * Sets the value of the cstWebLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstWebLogin(JAXBElement<String> value) {
        this.cstWebLogin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstWebPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstWebPassword() {
        return cstWebPassword;
    }

    /**
     * Sets the value of the cstWebPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstWebPassword(JAXBElement<String> value) {
        this.cstWebPassword = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstEntityKey() {
        return cstEntityKey;
    }

    /**
     * Sets the value of the cstEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstEntityKey(JAXBElement<String> value) {
        this.cstEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstMsgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstMsgKey() {
        return cstMsgKey;
    }

    /**
     * Sets the value of the cstMsgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstMsgKey(JAXBElement<String> value) {
        this.cstMsgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstNoMailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCstNoMailFlag() {
        return cstNoMailFlag;
    }

    /**
     * Sets the value of the cstNoMailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCstNoMailFlag(JAXBElement<Short> value) {
        this.cstNoMailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cstWebStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstWebStartDate() {
        return cstWebStartDate;
    }

    /**
     * Sets the value of the cstWebStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstWebStartDate(JAXBElement<String> value) {
        this.cstWebStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstWebEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstWebEndDate() {
        return cstWebEndDate;
    }

    /**
     * Sets the value of the cstWebEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstWebEndDate(JAXBElement<String> value) {
        this.cstWebEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstWebForcePasswordChange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCstWebForcePasswordChange() {
        return cstWebForcePasswordChange;
    }

    /**
     * Sets the value of the cstWebForcePasswordChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCstWebForcePasswordChange(JAXBElement<Short> value) {
        this.cstWebForcePasswordChange = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cstWebLoginDisabledFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCstWebLoginDisabledFlag() {
        return cstWebLoginDisabledFlag;
    }

    /**
     * Sets the value of the cstWebLoginDisabledFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCstWebLoginDisabledFlag(JAXBElement<Short> value) {
        this.cstWebLoginDisabledFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cstComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstComment() {
        return cstComment;
    }

    /**
     * Sets the value of the cstComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstComment(JAXBElement<String> value) {
        this.cstComment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstCreditHoldFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCstCreditHoldFlag() {
        return cstCreditHoldFlag;
    }

    /**
     * Sets the value of the cstCreditHoldFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCstCreditHoldFlag(JAXBElement<Short> value) {
        this.cstCreditHoldFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cstCreditHoldReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstCreditHoldReason() {
        return cstCreditHoldReason;
    }

    /**
     * Sets the value of the cstCreditHoldReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstCreditHoldReason(JAXBElement<String> value) {
        this.cstCreditHoldReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstWebForgotPasswordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCstWebForgotPasswordStatus() {
        return cstWebForgotPasswordStatus;
    }

    /**
     * Sets the value of the cstWebForgotPasswordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCstWebForgotPasswordStatus(JAXBElement<Short> value) {
        this.cstWebForgotPasswordStatus = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cstOldCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstOldCxaKey() {
        return cstOldCxaKey;
    }

    /**
     * Sets the value of the cstOldCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstOldCxaKey(JAXBElement<String> value) {
        this.cstOldCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstLastEmailDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstLastEmailDate() {
        return cstLastEmailDate;
    }

    /**
     * Sets the value of the cstLastEmailDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstLastEmailDate(JAXBElement<String> value) {
        this.cstLastEmailDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstNoPublishFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCstNoPublishFlag() {
        return cstNoPublishFlag;
    }

    /**
     * Sets the value of the cstNoPublishFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCstNoPublishFlag(JAXBElement<Short> value) {
        this.cstNoPublishFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cstSinKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstSinKey() {
        return cstSinKey;
    }

    /**
     * Sets the value of the cstSinKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstSinKey(JAXBElement<String> value) {
        this.cstSinKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstTtlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstTtlKey() {
        return cstTtlKey;
    }

    /**
     * Sets the value of the cstTtlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstTtlKey(JAXBElement<String> value) {
        this.cstTtlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstJfnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstJfnKey() {
        return cstJfnKey;
    }

    /**
     * Sets the value of the cstJfnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstJfnKey(JAXBElement<String> value) {
        this.cstJfnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstCurKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstCurKey() {
        return cstCurKey;
    }

    /**
     * Sets the value of the cstCurKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstCurKey(JAXBElement<String> value) {
        this.cstCurKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstAttribute1() {
        return cstAttribute1;
    }

    /**
     * Sets the value of the cstAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstAttribute1(JAXBElement<String> value) {
        this.cstAttribute1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstAttribute2() {
        return cstAttribute2;
    }

    /**
     * Sets the value of the cstAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstAttribute2(JAXBElement<String> value) {
        this.cstAttribute2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstDoNotIncludeDirectoryExtFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCstDoNotIncludeDirectoryExtFlag() {
        return cstDoNotIncludeDirectoryExtFlag;
    }

    /**
     * Sets the value of the cstDoNotIncludeDirectoryExtFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCstDoNotIncludeDirectoryExtFlag(JAXBElement<Short> value) {
        this.cstDoNotIncludeDirectoryExtFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cstSalutation1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstSalutation1() {
        return cstSalutation1;
    }

    /**
     * Sets the value of the cstSalutation1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstSalutation1(JAXBElement<String> value) {
        this.cstSalutation1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstSourceExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstSourceExt() {
        return cstSourceExt;
    }

    /**
     * Sets the value of the cstSourceExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstSourceExt(JAXBElement<String> value) {
        this.cstSourceExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstSalutation2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstSalutation2() {
        return cstSalutation2;
    }

    /**
     * Sets the value of the cstSalutation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstSalutation2(JAXBElement<String> value) {
        this.cstSalutation2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstGracePeriodExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCstGracePeriodExt() {
        return cstGracePeriodExt;
    }

    /**
     * Sets the value of the cstGracePeriodExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCstGracePeriodExt(JAXBElement<Integer> value) {
        this.cstGracePeriodExt = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cstMergeCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstMergeCstKey() {
        return cstMergeCstKey;
    }

    /**
     * Sets the value of the cstMergeCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstMergeCstKey(JAXBElement<String> value) {
        this.cstMergeCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstSalutation3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstSalutation3() {
        return cstSalutation3;
    }

    /**
     * Sets the value of the cstSalutation3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstSalutation3(JAXBElement<String> value) {
        this.cstSalutation3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstSalutation4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstSalutation4() {
        return cstSalutation4;
    }

    /**
     * Sets the value of the cstSalutation4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstSalutation4(JAXBElement<String> value) {
        this.cstSalutation4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstDefaultRecognizeAs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstDefaultRecognizeAs() {
        return cstDefaultRecognizeAs;
    }

    /**
     * Sets the value of the cstDefaultRecognizeAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstDefaultRecognizeAs(JAXBElement<String> value) {
        this.cstDefaultRecognizeAs = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCstScore() {
        return cstScore;
    }

    /**
     * Sets the value of the cstScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCstScore(JAXBElement<BigDecimal> value) {
        this.cstScore = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the cstScoreNormalized property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCstScoreNormalized() {
        return cstScoreNormalized;
    }

    /**
     * Sets the value of the cstScoreNormalized property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCstScoreNormalized(JAXBElement<Integer> value) {
        this.cstScoreNormalized = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cstScoreTrend property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCstScoreTrend() {
        return cstScoreTrend;
    }

    /**
     * Sets the value of the cstScoreTrend property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCstScoreTrend(JAXBElement<Integer> value) {
        this.cstScoreTrend = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cstVaultAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstVaultAccount() {
        return cstVaultAccount;
    }

    /**
     * Sets the value of the cstVaultAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstVaultAccount(JAXBElement<String> value) {
        this.cstVaultAccount = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstExcludeFromSocialFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCstExcludeFromSocialFlag() {
        return cstExcludeFromSocialFlag;
    }

    /**
     * Sets the value of the cstExcludeFromSocialFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCstExcludeFromSocialFlag(JAXBElement<Short> value) {
        this.cstExcludeFromSocialFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cstSocialScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCstSocialScore() {
        return cstSocialScore;
    }

    /**
     * Sets the value of the cstSocialScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCstSocialScore(JAXBElement<Integer> value) {
        this.cstSocialScore = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cstPtin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstPtin() {
        return cstPtin;
    }

    /**
     * Sets the value of the cstPtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstPtin(JAXBElement<String> value) {
        this.cstPtin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstAicpaMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCstAicpaMemberId() {
        return cstAicpaMemberId;
    }

    /**
     * Sets the value of the cstAicpaMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCstAicpaMemberId(JAXBElement<Long> value) {
        this.cstAicpaMemberId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the cstVendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstVendorCode() {
        return cstVendorCode;
    }

    /**
     * Sets the value of the cstVendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstVendorCode(JAXBElement<String> value) {
        this.cstVendorCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstScaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstScaKey() {
        return cstScaKey;
    }

    /**
     * Sets the value of the cstScaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstScaKey(JAXBElement<String> value) {
        this.cstScaKey = ((JAXBElement<String> ) value);
    }

}
