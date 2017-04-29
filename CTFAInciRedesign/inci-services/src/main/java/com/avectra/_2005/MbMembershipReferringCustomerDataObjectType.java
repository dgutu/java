
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mb_membership_Referring_Customer_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mb_membership_Referring_Customer_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="csr__cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_type" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_name_cp" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_sort_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_ind_full_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_org_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_ixo_title_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_pref_comm_meth" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_bio" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_recno" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_id" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_email_text_only" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_credit_limit" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_src_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_tax_exempt_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_tax_id" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_no_email_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_cxa_billing_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_eml_address_dn" type="{http://www.avectra.com/2005/}av_email_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_no_phone_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_phn_number_complete_dn" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_no_fax_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_fax_number_complete_dn" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_ixo_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_no_web_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_oldid" type="{http://www.avectra.com/2005/}stringLength15_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_member_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_url_code_dn" type="{http://www.avectra.com/2005/}av_url_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_parent_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_url_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_no_msg_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_msg_handle_dn" type="{http://www.avectra.com/2005/}av_messaging_name_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_web_login" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_web_password" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_msg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_no_mail_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_web_start_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_web_end_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_web_force_password_change" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_web_login_disabled_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_comment" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_credit_hold_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_credit_hold_reason" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_web_forgot_password_status" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_old_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_last_email_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_no_publish_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_sin_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_ttl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_jfn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_cur_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_attribute_1" type="{http://www.avectra.com/2005/}stringLength510_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_attribute_2" type="{http://www.avectra.com/2005/}stringLength510_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_do_not_include_directory_ext_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_salutation_1" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_source_ext" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_salutation_2" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_grace_period_ext" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_merge_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_salutation_3" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_salutation_4" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_default_recognize_as" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_score" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_score_normalized" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_score_trend" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_vault_account" type="{http://www.avectra.com/2005/}stringLength25_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_exclude_from_social_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_social_score" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_ptin" type="{http://www.avectra.com/2005/}stringLength9_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_aicpa_member_id" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_vendor_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="csr__cst_sca_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mb_membership_Referring_Customer_DataObjectType", propOrder = {
    "csrCstKey",
    "csrCstType",
    "csrCstNameCp",
    "csrCstSortNameDn",
    "csrCstIndFullNameDn",
    "csrCstOrgNameDn",
    "csrCstIxoTitleDn",
    "csrCstPrefCommMeth",
    "csrCstBio",
    "csrCstAddDate",
    "csrCstAddUser",
    "csrCstChangeDate",
    "csrCstChangeUser",
    "csrCstDeleteFlag",
    "csrCstRecno",
    "csrCstId",
    "csrCstKeyExt",
    "csrCstEmailTextOnly",
    "csrCstCreditLimit",
    "csrCstSrcKey",
    "csrCstSrcCode",
    "csrCstTaxExemptFlag",
    "csrCstTaxId",
    "csrCstCxaKey",
    "csrCstNoEmailFlag",
    "csrCstCxaBillingKey",
    "csrCstEmlAddressDn",
    "csrCstEmlKey",
    "csrCstNoPhoneFlag",
    "csrCstPhnNumberCompleteDn",
    "csrCstCphKey",
    "csrCstNoFaxFlag",
    "csrCstFaxNumberCompleteDn",
    "csrCstCfxKey",
    "csrCstIxoKey",
    "csrCstNoWebFlag",
    "csrCstOldid",
    "csrCstMemberFlag",
    "csrCstUrlCodeDn",
    "csrCstParentCstKey",
    "csrCstUrlKey",
    "csrCstNoMsgFlag",
    "csrCstMsgHandleDn",
    "csrCstWebLogin",
    "csrCstWebPassword",
    "csrCstEntityKey",
    "csrCstMsgKey",
    "csrCstNoMailFlag",
    "csrCstWebStartDate",
    "csrCstWebEndDate",
    "csrCstWebForcePasswordChange",
    "csrCstWebLoginDisabledFlag",
    "csrCstComment",
    "csrCstCreditHoldFlag",
    "csrCstCreditHoldReason",
    "csrCstWebForgotPasswordStatus",
    "csrCstOldCxaKey",
    "csrCstLastEmailDate",
    "csrCstNoPublishFlag",
    "csrCstSinKey",
    "csrCstTtlKey",
    "csrCstJfnKey",
    "csrCstCurKey",
    "csrCstAttribute1",
    "csrCstAttribute2",
    "csrCstDoNotIncludeDirectoryExtFlag",
    "csrCstSalutation1",
    "csrCstSourceExt",
    "csrCstSalutation2",
    "csrCstGracePeriodExt",
    "csrCstMergeCstKey",
    "csrCstSalutation3",
    "csrCstSalutation4",
    "csrCstDefaultRecognizeAs",
    "csrCstScore",
    "csrCstScoreNormalized",
    "csrCstScoreTrend",
    "csrCstVaultAccount",
    "csrCstExcludeFromSocialFlag",
    "csrCstSocialScore",
    "csrCstPtin",
    "csrCstAicpaMemberId",
    "csrCstVendorCode",
    "csrCstScaKey"
})
public class MbMembershipReferringCustomerDataObjectType {

    @XmlElementRef(name = "csr__cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstKey;
    @XmlElementRef(name = "csr__cst_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstType;
    @XmlElementRef(name = "csr__cst_name_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstNameCp;
    @XmlElementRef(name = "csr__cst_sort_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstSortNameDn;
    @XmlElementRef(name = "csr__cst_ind_full_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstIndFullNameDn;
    @XmlElementRef(name = "csr__cst_org_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstOrgNameDn;
    @XmlElementRef(name = "csr__cst_ixo_title_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstIxoTitleDn;
    @XmlElementRef(name = "csr__cst_pref_comm_meth", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstPrefCommMeth;
    @XmlElementRef(name = "csr__cst_bio", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstBio;
    @XmlElementRef(name = "csr__cst_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstAddDate;
    @XmlElementRef(name = "csr__cst_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstAddUser;
    @XmlElementRef(name = "csr__cst_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstChangeDate;
    @XmlElementRef(name = "csr__cst_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstChangeUser;
    @XmlElementRef(name = "csr__cst_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> csrCstDeleteFlag;
    @XmlElementRef(name = "csr__cst_recno", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> csrCstRecno;
    @XmlElementRef(name = "csr__cst_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstId;
    @XmlElementRef(name = "csr__cst_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstKeyExt;
    @XmlElementRef(name = "csr__cst_email_text_only", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> csrCstEmailTextOnly;
    @XmlElementRef(name = "csr__cst_credit_limit", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> csrCstCreditLimit;
    @XmlElementRef(name = "csr__cst_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstSrcKey;
    @XmlElementRef(name = "csr__cst_src_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstSrcCode;
    @XmlElementRef(name = "csr__cst_tax_exempt_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> csrCstTaxExemptFlag;
    @XmlElementRef(name = "csr__cst_tax_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstTaxId;
    @XmlElementRef(name = "csr__cst_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstCxaKey;
    @XmlElementRef(name = "csr__cst_no_email_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> csrCstNoEmailFlag;
    @XmlElementRef(name = "csr__cst_cxa_billing_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstCxaBillingKey;
    @XmlElementRef(name = "csr__cst_eml_address_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstEmlAddressDn;
    @XmlElementRef(name = "csr__cst_eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstEmlKey;
    @XmlElementRef(name = "csr__cst_no_phone_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> csrCstNoPhoneFlag;
    @XmlElementRef(name = "csr__cst_phn_number_complete_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstPhnNumberCompleteDn;
    @XmlElementRef(name = "csr__cst_cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstCphKey;
    @XmlElementRef(name = "csr__cst_no_fax_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> csrCstNoFaxFlag;
    @XmlElementRef(name = "csr__cst_fax_number_complete_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstFaxNumberCompleteDn;
    @XmlElementRef(name = "csr__cst_cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstCfxKey;
    @XmlElementRef(name = "csr__cst_ixo_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstIxoKey;
    @XmlElementRef(name = "csr__cst_no_web_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> csrCstNoWebFlag;
    @XmlElementRef(name = "csr__cst_oldid", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstOldid;
    @XmlElementRef(name = "csr__cst_member_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> csrCstMemberFlag;
    @XmlElementRef(name = "csr__cst_url_code_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstUrlCodeDn;
    @XmlElementRef(name = "csr__cst_parent_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstParentCstKey;
    @XmlElementRef(name = "csr__cst_url_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstUrlKey;
    @XmlElementRef(name = "csr__cst_no_msg_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> csrCstNoMsgFlag;
    @XmlElementRef(name = "csr__cst_msg_handle_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstMsgHandleDn;
    @XmlElementRef(name = "csr__cst_web_login", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstWebLogin;
    @XmlElementRef(name = "csr__cst_web_password", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstWebPassword;
    @XmlElementRef(name = "csr__cst_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstEntityKey;
    @XmlElementRef(name = "csr__cst_msg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstMsgKey;
    @XmlElementRef(name = "csr__cst_no_mail_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> csrCstNoMailFlag;
    @XmlElementRef(name = "csr__cst_web_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstWebStartDate;
    @XmlElementRef(name = "csr__cst_web_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstWebEndDate;
    @XmlElementRef(name = "csr__cst_web_force_password_change", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> csrCstWebForcePasswordChange;
    @XmlElementRef(name = "csr__cst_web_login_disabled_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> csrCstWebLoginDisabledFlag;
    @XmlElementRef(name = "csr__cst_comment", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstComment;
    @XmlElementRef(name = "csr__cst_credit_hold_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> csrCstCreditHoldFlag;
    @XmlElementRef(name = "csr__cst_credit_hold_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstCreditHoldReason;
    @XmlElementRef(name = "csr__cst_web_forgot_password_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> csrCstWebForgotPasswordStatus;
    @XmlElementRef(name = "csr__cst_old_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstOldCxaKey;
    @XmlElementRef(name = "csr__cst_last_email_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstLastEmailDate;
    @XmlElementRef(name = "csr__cst_no_publish_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> csrCstNoPublishFlag;
    @XmlElementRef(name = "csr__cst_sin_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstSinKey;
    @XmlElementRef(name = "csr__cst_ttl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstTtlKey;
    @XmlElementRef(name = "csr__cst_jfn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstJfnKey;
    @XmlElementRef(name = "csr__cst_cur_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstCurKey;
    @XmlElementRef(name = "csr__cst_attribute_1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstAttribute1;
    @XmlElementRef(name = "csr__cst_attribute_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstAttribute2;
    @XmlElementRef(name = "csr__cst_do_not_include_directory_ext_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> csrCstDoNotIncludeDirectoryExtFlag;
    @XmlElementRef(name = "csr__cst_salutation_1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstSalutation1;
    @XmlElementRef(name = "csr__cst_source_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstSourceExt;
    @XmlElementRef(name = "csr__cst_salutation_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstSalutation2;
    @XmlElementRef(name = "csr__cst_grace_period_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> csrCstGracePeriodExt;
    @XmlElementRef(name = "csr__cst_merge_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstMergeCstKey;
    @XmlElementRef(name = "csr__cst_salutation_3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstSalutation3;
    @XmlElementRef(name = "csr__cst_salutation_4", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstSalutation4;
    @XmlElementRef(name = "csr__cst_default_recognize_as", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstDefaultRecognizeAs;
    @XmlElementRef(name = "csr__cst_score", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> csrCstScore;
    @XmlElementRef(name = "csr__cst_score_normalized", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> csrCstScoreNormalized;
    @XmlElementRef(name = "csr__cst_score_trend", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> csrCstScoreTrend;
    @XmlElementRef(name = "csr__cst_vault_account", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstVaultAccount;
    @XmlElementRef(name = "csr__cst_exclude_from_social_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> csrCstExcludeFromSocialFlag;
    @XmlElementRef(name = "csr__cst_social_score", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> csrCstSocialScore;
    @XmlElementRef(name = "csr__cst_ptin", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstPtin;
    @XmlElementRef(name = "csr__cst_aicpa_member_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> csrCstAicpaMemberId;
    @XmlElementRef(name = "csr__cst_vendor_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstVendorCode;
    @XmlElementRef(name = "csr__cst_sca_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> csrCstScaKey;

    /**
     * Gets the value of the csrCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstKey() {
        return csrCstKey;
    }

    /**
     * Sets the value of the csrCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstKey(JAXBElement<String> value) {
        this.csrCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstType() {
        return csrCstType;
    }

    /**
     * Sets the value of the csrCstType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstType(JAXBElement<String> value) {
        this.csrCstType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstNameCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstNameCp() {
        return csrCstNameCp;
    }

    /**
     * Sets the value of the csrCstNameCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstNameCp(JAXBElement<String> value) {
        this.csrCstNameCp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstSortNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstSortNameDn() {
        return csrCstSortNameDn;
    }

    /**
     * Sets the value of the csrCstSortNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstSortNameDn(JAXBElement<String> value) {
        this.csrCstSortNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstIndFullNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstIndFullNameDn() {
        return csrCstIndFullNameDn;
    }

    /**
     * Sets the value of the csrCstIndFullNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstIndFullNameDn(JAXBElement<String> value) {
        this.csrCstIndFullNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstOrgNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstOrgNameDn() {
        return csrCstOrgNameDn;
    }

    /**
     * Sets the value of the csrCstOrgNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstOrgNameDn(JAXBElement<String> value) {
        this.csrCstOrgNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstIxoTitleDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstIxoTitleDn() {
        return csrCstIxoTitleDn;
    }

    /**
     * Sets the value of the csrCstIxoTitleDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstIxoTitleDn(JAXBElement<String> value) {
        this.csrCstIxoTitleDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstPrefCommMeth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstPrefCommMeth() {
        return csrCstPrefCommMeth;
    }

    /**
     * Sets the value of the csrCstPrefCommMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstPrefCommMeth(JAXBElement<String> value) {
        this.csrCstPrefCommMeth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstBio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstBio() {
        return csrCstBio;
    }

    /**
     * Sets the value of the csrCstBio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstBio(JAXBElement<String> value) {
        this.csrCstBio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstAddDate() {
        return csrCstAddDate;
    }

    /**
     * Sets the value of the csrCstAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstAddDate(JAXBElement<String> value) {
        this.csrCstAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstAddUser() {
        return csrCstAddUser;
    }

    /**
     * Sets the value of the csrCstAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstAddUser(JAXBElement<String> value) {
        this.csrCstAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstChangeDate() {
        return csrCstChangeDate;
    }

    /**
     * Sets the value of the csrCstChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstChangeDate(JAXBElement<String> value) {
        this.csrCstChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstChangeUser() {
        return csrCstChangeUser;
    }

    /**
     * Sets the value of the csrCstChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstChangeUser(JAXBElement<String> value) {
        this.csrCstChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCsrCstDeleteFlag() {
        return csrCstDeleteFlag;
    }

    /**
     * Sets the value of the csrCstDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCsrCstDeleteFlag(JAXBElement<Short> value) {
        this.csrCstDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the csrCstRecno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCsrCstRecno() {
        return csrCstRecno;
    }

    /**
     * Sets the value of the csrCstRecno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCsrCstRecno(JAXBElement<Long> value) {
        this.csrCstRecno = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the csrCstId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstId() {
        return csrCstId;
    }

    /**
     * Sets the value of the csrCstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstId(JAXBElement<String> value) {
        this.csrCstId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstKeyExt() {
        return csrCstKeyExt;
    }

    /**
     * Sets the value of the csrCstKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstKeyExt(JAXBElement<String> value) {
        this.csrCstKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstEmailTextOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCsrCstEmailTextOnly() {
        return csrCstEmailTextOnly;
    }

    /**
     * Sets the value of the csrCstEmailTextOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCsrCstEmailTextOnly(JAXBElement<Short> value) {
        this.csrCstEmailTextOnly = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the csrCstCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCsrCstCreditLimit() {
        return csrCstCreditLimit;
    }

    /**
     * Sets the value of the csrCstCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCsrCstCreditLimit(JAXBElement<BigDecimal> value) {
        this.csrCstCreditLimit = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the csrCstSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstSrcKey() {
        return csrCstSrcKey;
    }

    /**
     * Sets the value of the csrCstSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstSrcKey(JAXBElement<String> value) {
        this.csrCstSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstSrcCode() {
        return csrCstSrcCode;
    }

    /**
     * Sets the value of the csrCstSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstSrcCode(JAXBElement<String> value) {
        this.csrCstSrcCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstTaxExemptFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCsrCstTaxExemptFlag() {
        return csrCstTaxExemptFlag;
    }

    /**
     * Sets the value of the csrCstTaxExemptFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCsrCstTaxExemptFlag(JAXBElement<Short> value) {
        this.csrCstTaxExemptFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the csrCstTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstTaxId() {
        return csrCstTaxId;
    }

    /**
     * Sets the value of the csrCstTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstTaxId(JAXBElement<String> value) {
        this.csrCstTaxId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstCxaKey() {
        return csrCstCxaKey;
    }

    /**
     * Sets the value of the csrCstCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstCxaKey(JAXBElement<String> value) {
        this.csrCstCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstNoEmailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCsrCstNoEmailFlag() {
        return csrCstNoEmailFlag;
    }

    /**
     * Sets the value of the csrCstNoEmailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCsrCstNoEmailFlag(JAXBElement<Short> value) {
        this.csrCstNoEmailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the csrCstCxaBillingKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstCxaBillingKey() {
        return csrCstCxaBillingKey;
    }

    /**
     * Sets the value of the csrCstCxaBillingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstCxaBillingKey(JAXBElement<String> value) {
        this.csrCstCxaBillingKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstEmlAddressDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstEmlAddressDn() {
        return csrCstEmlAddressDn;
    }

    /**
     * Sets the value of the csrCstEmlAddressDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstEmlAddressDn(JAXBElement<String> value) {
        this.csrCstEmlAddressDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstEmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstEmlKey() {
        return csrCstEmlKey;
    }

    /**
     * Sets the value of the csrCstEmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstEmlKey(JAXBElement<String> value) {
        this.csrCstEmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstNoPhoneFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCsrCstNoPhoneFlag() {
        return csrCstNoPhoneFlag;
    }

    /**
     * Sets the value of the csrCstNoPhoneFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCsrCstNoPhoneFlag(JAXBElement<Short> value) {
        this.csrCstNoPhoneFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the csrCstPhnNumberCompleteDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstPhnNumberCompleteDn() {
        return csrCstPhnNumberCompleteDn;
    }

    /**
     * Sets the value of the csrCstPhnNumberCompleteDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstPhnNumberCompleteDn(JAXBElement<String> value) {
        this.csrCstPhnNumberCompleteDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstCphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstCphKey() {
        return csrCstCphKey;
    }

    /**
     * Sets the value of the csrCstCphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstCphKey(JAXBElement<String> value) {
        this.csrCstCphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstNoFaxFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCsrCstNoFaxFlag() {
        return csrCstNoFaxFlag;
    }

    /**
     * Sets the value of the csrCstNoFaxFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCsrCstNoFaxFlag(JAXBElement<Short> value) {
        this.csrCstNoFaxFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the csrCstFaxNumberCompleteDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstFaxNumberCompleteDn() {
        return csrCstFaxNumberCompleteDn;
    }

    /**
     * Sets the value of the csrCstFaxNumberCompleteDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstFaxNumberCompleteDn(JAXBElement<String> value) {
        this.csrCstFaxNumberCompleteDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstCfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstCfxKey() {
        return csrCstCfxKey;
    }

    /**
     * Sets the value of the csrCstCfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstCfxKey(JAXBElement<String> value) {
        this.csrCstCfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstIxoKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstIxoKey() {
        return csrCstIxoKey;
    }

    /**
     * Sets the value of the csrCstIxoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstIxoKey(JAXBElement<String> value) {
        this.csrCstIxoKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstNoWebFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCsrCstNoWebFlag() {
        return csrCstNoWebFlag;
    }

    /**
     * Sets the value of the csrCstNoWebFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCsrCstNoWebFlag(JAXBElement<Short> value) {
        this.csrCstNoWebFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the csrCstOldid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstOldid() {
        return csrCstOldid;
    }

    /**
     * Sets the value of the csrCstOldid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstOldid(JAXBElement<String> value) {
        this.csrCstOldid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstMemberFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCsrCstMemberFlag() {
        return csrCstMemberFlag;
    }

    /**
     * Sets the value of the csrCstMemberFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCsrCstMemberFlag(JAXBElement<Short> value) {
        this.csrCstMemberFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the csrCstUrlCodeDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstUrlCodeDn() {
        return csrCstUrlCodeDn;
    }

    /**
     * Sets the value of the csrCstUrlCodeDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstUrlCodeDn(JAXBElement<String> value) {
        this.csrCstUrlCodeDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstParentCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstParentCstKey() {
        return csrCstParentCstKey;
    }

    /**
     * Sets the value of the csrCstParentCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstParentCstKey(JAXBElement<String> value) {
        this.csrCstParentCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstUrlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstUrlKey() {
        return csrCstUrlKey;
    }

    /**
     * Sets the value of the csrCstUrlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstUrlKey(JAXBElement<String> value) {
        this.csrCstUrlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstNoMsgFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCsrCstNoMsgFlag() {
        return csrCstNoMsgFlag;
    }

    /**
     * Sets the value of the csrCstNoMsgFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCsrCstNoMsgFlag(JAXBElement<Short> value) {
        this.csrCstNoMsgFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the csrCstMsgHandleDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstMsgHandleDn() {
        return csrCstMsgHandleDn;
    }

    /**
     * Sets the value of the csrCstMsgHandleDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstMsgHandleDn(JAXBElement<String> value) {
        this.csrCstMsgHandleDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstWebLogin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstWebLogin() {
        return csrCstWebLogin;
    }

    /**
     * Sets the value of the csrCstWebLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstWebLogin(JAXBElement<String> value) {
        this.csrCstWebLogin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstWebPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstWebPassword() {
        return csrCstWebPassword;
    }

    /**
     * Sets the value of the csrCstWebPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstWebPassword(JAXBElement<String> value) {
        this.csrCstWebPassword = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstEntityKey() {
        return csrCstEntityKey;
    }

    /**
     * Sets the value of the csrCstEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstEntityKey(JAXBElement<String> value) {
        this.csrCstEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstMsgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstMsgKey() {
        return csrCstMsgKey;
    }

    /**
     * Sets the value of the csrCstMsgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstMsgKey(JAXBElement<String> value) {
        this.csrCstMsgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstNoMailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCsrCstNoMailFlag() {
        return csrCstNoMailFlag;
    }

    /**
     * Sets the value of the csrCstNoMailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCsrCstNoMailFlag(JAXBElement<Short> value) {
        this.csrCstNoMailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the csrCstWebStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstWebStartDate() {
        return csrCstWebStartDate;
    }

    /**
     * Sets the value of the csrCstWebStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstWebStartDate(JAXBElement<String> value) {
        this.csrCstWebStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstWebEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstWebEndDate() {
        return csrCstWebEndDate;
    }

    /**
     * Sets the value of the csrCstWebEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstWebEndDate(JAXBElement<String> value) {
        this.csrCstWebEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstWebForcePasswordChange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCsrCstWebForcePasswordChange() {
        return csrCstWebForcePasswordChange;
    }

    /**
     * Sets the value of the csrCstWebForcePasswordChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCsrCstWebForcePasswordChange(JAXBElement<Short> value) {
        this.csrCstWebForcePasswordChange = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the csrCstWebLoginDisabledFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCsrCstWebLoginDisabledFlag() {
        return csrCstWebLoginDisabledFlag;
    }

    /**
     * Sets the value of the csrCstWebLoginDisabledFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCsrCstWebLoginDisabledFlag(JAXBElement<Short> value) {
        this.csrCstWebLoginDisabledFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the csrCstComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstComment() {
        return csrCstComment;
    }

    /**
     * Sets the value of the csrCstComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstComment(JAXBElement<String> value) {
        this.csrCstComment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstCreditHoldFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCsrCstCreditHoldFlag() {
        return csrCstCreditHoldFlag;
    }

    /**
     * Sets the value of the csrCstCreditHoldFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCsrCstCreditHoldFlag(JAXBElement<Short> value) {
        this.csrCstCreditHoldFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the csrCstCreditHoldReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstCreditHoldReason() {
        return csrCstCreditHoldReason;
    }

    /**
     * Sets the value of the csrCstCreditHoldReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstCreditHoldReason(JAXBElement<String> value) {
        this.csrCstCreditHoldReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstWebForgotPasswordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCsrCstWebForgotPasswordStatus() {
        return csrCstWebForgotPasswordStatus;
    }

    /**
     * Sets the value of the csrCstWebForgotPasswordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCsrCstWebForgotPasswordStatus(JAXBElement<Short> value) {
        this.csrCstWebForgotPasswordStatus = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the csrCstOldCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstOldCxaKey() {
        return csrCstOldCxaKey;
    }

    /**
     * Sets the value of the csrCstOldCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstOldCxaKey(JAXBElement<String> value) {
        this.csrCstOldCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstLastEmailDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstLastEmailDate() {
        return csrCstLastEmailDate;
    }

    /**
     * Sets the value of the csrCstLastEmailDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstLastEmailDate(JAXBElement<String> value) {
        this.csrCstLastEmailDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstNoPublishFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCsrCstNoPublishFlag() {
        return csrCstNoPublishFlag;
    }

    /**
     * Sets the value of the csrCstNoPublishFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCsrCstNoPublishFlag(JAXBElement<Short> value) {
        this.csrCstNoPublishFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the csrCstSinKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstSinKey() {
        return csrCstSinKey;
    }

    /**
     * Sets the value of the csrCstSinKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstSinKey(JAXBElement<String> value) {
        this.csrCstSinKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstTtlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstTtlKey() {
        return csrCstTtlKey;
    }

    /**
     * Sets the value of the csrCstTtlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstTtlKey(JAXBElement<String> value) {
        this.csrCstTtlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstJfnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstJfnKey() {
        return csrCstJfnKey;
    }

    /**
     * Sets the value of the csrCstJfnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstJfnKey(JAXBElement<String> value) {
        this.csrCstJfnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstCurKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstCurKey() {
        return csrCstCurKey;
    }

    /**
     * Sets the value of the csrCstCurKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstCurKey(JAXBElement<String> value) {
        this.csrCstCurKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstAttribute1() {
        return csrCstAttribute1;
    }

    /**
     * Sets the value of the csrCstAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstAttribute1(JAXBElement<String> value) {
        this.csrCstAttribute1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstAttribute2() {
        return csrCstAttribute2;
    }

    /**
     * Sets the value of the csrCstAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstAttribute2(JAXBElement<String> value) {
        this.csrCstAttribute2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstDoNotIncludeDirectoryExtFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCsrCstDoNotIncludeDirectoryExtFlag() {
        return csrCstDoNotIncludeDirectoryExtFlag;
    }

    /**
     * Sets the value of the csrCstDoNotIncludeDirectoryExtFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCsrCstDoNotIncludeDirectoryExtFlag(JAXBElement<Short> value) {
        this.csrCstDoNotIncludeDirectoryExtFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the csrCstSalutation1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstSalutation1() {
        return csrCstSalutation1;
    }

    /**
     * Sets the value of the csrCstSalutation1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstSalutation1(JAXBElement<String> value) {
        this.csrCstSalutation1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstSourceExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstSourceExt() {
        return csrCstSourceExt;
    }

    /**
     * Sets the value of the csrCstSourceExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstSourceExt(JAXBElement<String> value) {
        this.csrCstSourceExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstSalutation2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstSalutation2() {
        return csrCstSalutation2;
    }

    /**
     * Sets the value of the csrCstSalutation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstSalutation2(JAXBElement<String> value) {
        this.csrCstSalutation2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstGracePeriodExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCsrCstGracePeriodExt() {
        return csrCstGracePeriodExt;
    }

    /**
     * Sets the value of the csrCstGracePeriodExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCsrCstGracePeriodExt(JAXBElement<Integer> value) {
        this.csrCstGracePeriodExt = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the csrCstMergeCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstMergeCstKey() {
        return csrCstMergeCstKey;
    }

    /**
     * Sets the value of the csrCstMergeCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstMergeCstKey(JAXBElement<String> value) {
        this.csrCstMergeCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstSalutation3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstSalutation3() {
        return csrCstSalutation3;
    }

    /**
     * Sets the value of the csrCstSalutation3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstSalutation3(JAXBElement<String> value) {
        this.csrCstSalutation3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstSalutation4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstSalutation4() {
        return csrCstSalutation4;
    }

    /**
     * Sets the value of the csrCstSalutation4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstSalutation4(JAXBElement<String> value) {
        this.csrCstSalutation4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstDefaultRecognizeAs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstDefaultRecognizeAs() {
        return csrCstDefaultRecognizeAs;
    }

    /**
     * Sets the value of the csrCstDefaultRecognizeAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstDefaultRecognizeAs(JAXBElement<String> value) {
        this.csrCstDefaultRecognizeAs = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCsrCstScore() {
        return csrCstScore;
    }

    /**
     * Sets the value of the csrCstScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCsrCstScore(JAXBElement<BigDecimal> value) {
        this.csrCstScore = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the csrCstScoreNormalized property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCsrCstScoreNormalized() {
        return csrCstScoreNormalized;
    }

    /**
     * Sets the value of the csrCstScoreNormalized property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCsrCstScoreNormalized(JAXBElement<Integer> value) {
        this.csrCstScoreNormalized = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the csrCstScoreTrend property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCsrCstScoreTrend() {
        return csrCstScoreTrend;
    }

    /**
     * Sets the value of the csrCstScoreTrend property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCsrCstScoreTrend(JAXBElement<Integer> value) {
        this.csrCstScoreTrend = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the csrCstVaultAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstVaultAccount() {
        return csrCstVaultAccount;
    }

    /**
     * Sets the value of the csrCstVaultAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstVaultAccount(JAXBElement<String> value) {
        this.csrCstVaultAccount = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstExcludeFromSocialFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCsrCstExcludeFromSocialFlag() {
        return csrCstExcludeFromSocialFlag;
    }

    /**
     * Sets the value of the csrCstExcludeFromSocialFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCsrCstExcludeFromSocialFlag(JAXBElement<Short> value) {
        this.csrCstExcludeFromSocialFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the csrCstSocialScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCsrCstSocialScore() {
        return csrCstSocialScore;
    }

    /**
     * Sets the value of the csrCstSocialScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCsrCstSocialScore(JAXBElement<Integer> value) {
        this.csrCstSocialScore = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the csrCstPtin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstPtin() {
        return csrCstPtin;
    }

    /**
     * Sets the value of the csrCstPtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstPtin(JAXBElement<String> value) {
        this.csrCstPtin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstAicpaMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCsrCstAicpaMemberId() {
        return csrCstAicpaMemberId;
    }

    /**
     * Sets the value of the csrCstAicpaMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCsrCstAicpaMemberId(JAXBElement<Long> value) {
        this.csrCstAicpaMemberId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the csrCstVendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstVendorCode() {
        return csrCstVendorCode;
    }

    /**
     * Sets the value of the csrCstVendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstVendorCode(JAXBElement<String> value) {
        this.csrCstVendorCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the csrCstScaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsrCstScaKey() {
        return csrCstScaKey;
    }

    /**
     * Sets the value of the csrCstScaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsrCstScaKey(JAXBElement<String> value) {
        this.csrCstScaKey = ((JAXBElement<String> ) value);
    }

}
