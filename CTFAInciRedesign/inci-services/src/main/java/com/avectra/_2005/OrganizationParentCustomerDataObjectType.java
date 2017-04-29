
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organization_Parent_Customer_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Parent_Customer_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="par__cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_type" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_name_cp" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_sort_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_ind_full_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_org_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_ixo_title_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_pref_comm_meth" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_bio" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_recno" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_id" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_email_text_only" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_credit_limit" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_src_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_tax_exempt_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_tax_id" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_no_email_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_cxa_billing_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_eml_address_dn" type="{http://www.avectra.com/2005/}av_email_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_no_phone_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_phn_number_complete_dn" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_no_fax_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_fax_number_complete_dn" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_ixo_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_no_web_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_oldid" type="{http://www.avectra.com/2005/}stringLength15_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_member_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_url_code_dn" type="{http://www.avectra.com/2005/}av_url_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_parent_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_url_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_no_msg_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_msg_handle_dn" type="{http://www.avectra.com/2005/}av_messaging_name_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_web_login" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_web_password" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_msg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_no_mail_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_web_start_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_web_end_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_web_force_password_change" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_web_login_disabled_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_comment" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_credit_hold_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_credit_hold_reason" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_web_forgot_password_status" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_old_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_last_email_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_no_publish_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_sin_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_ttl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_jfn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_cur_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_attribute_1" type="{http://www.avectra.com/2005/}stringLength510_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_attribute_2" type="{http://www.avectra.com/2005/}stringLength510_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_do_not_include_directory_ext_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_salutation_1" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_source_ext" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_salutation_2" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_grace_period_ext" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_merge_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_salutation_3" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_salutation_4" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_default_recognize_as" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_score" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_score_normalized" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_score_trend" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_vault_account" type="{http://www.avectra.com/2005/}stringLength25_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_exclude_from_social_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_social_score" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_ptin" type="{http://www.avectra.com/2005/}stringLength9_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_aicpa_member_id" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_vendor_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="par__cst_sca_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Parent_Customer_DataObjectType", propOrder = {
    "parCstKey",
    "parCstType",
    "parCstNameCp",
    "parCstSortNameDn",
    "parCstIndFullNameDn",
    "parCstOrgNameDn",
    "parCstIxoTitleDn",
    "parCstPrefCommMeth",
    "parCstBio",
    "parCstAddDate",
    "parCstAddUser",
    "parCstChangeDate",
    "parCstChangeUser",
    "parCstDeleteFlag",
    "parCstRecno",
    "parCstId",
    "parCstKeyExt",
    "parCstEmailTextOnly",
    "parCstCreditLimit",
    "parCstSrcKey",
    "parCstSrcCode",
    "parCstTaxExemptFlag",
    "parCstTaxId",
    "parCstCxaKey",
    "parCstNoEmailFlag",
    "parCstCxaBillingKey",
    "parCstEmlAddressDn",
    "parCstEmlKey",
    "parCstNoPhoneFlag",
    "parCstPhnNumberCompleteDn",
    "parCstCphKey",
    "parCstNoFaxFlag",
    "parCstFaxNumberCompleteDn",
    "parCstCfxKey",
    "parCstIxoKey",
    "parCstNoWebFlag",
    "parCstOldid",
    "parCstMemberFlag",
    "parCstUrlCodeDn",
    "parCstParentCstKey",
    "parCstUrlKey",
    "parCstNoMsgFlag",
    "parCstMsgHandleDn",
    "parCstWebLogin",
    "parCstWebPassword",
    "parCstEntityKey",
    "parCstMsgKey",
    "parCstNoMailFlag",
    "parCstWebStartDate",
    "parCstWebEndDate",
    "parCstWebForcePasswordChange",
    "parCstWebLoginDisabledFlag",
    "parCstComment",
    "parCstCreditHoldFlag",
    "parCstCreditHoldReason",
    "parCstWebForgotPasswordStatus",
    "parCstOldCxaKey",
    "parCstLastEmailDate",
    "parCstNoPublishFlag",
    "parCstSinKey",
    "parCstTtlKey",
    "parCstJfnKey",
    "parCstCurKey",
    "parCstAttribute1",
    "parCstAttribute2",
    "parCstDoNotIncludeDirectoryExtFlag",
    "parCstSalutation1",
    "parCstSourceExt",
    "parCstSalutation2",
    "parCstGracePeriodExt",
    "parCstMergeCstKey",
    "parCstSalutation3",
    "parCstSalutation4",
    "parCstDefaultRecognizeAs",
    "parCstScore",
    "parCstScoreNormalized",
    "parCstScoreTrend",
    "parCstVaultAccount",
    "parCstExcludeFromSocialFlag",
    "parCstSocialScore",
    "parCstPtin",
    "parCstAicpaMemberId",
    "parCstVendorCode",
    "parCstScaKey"
})
public class OrganizationParentCustomerDataObjectType {

    @XmlElementRef(name = "par__cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstKey;
    @XmlElementRef(name = "par__cst_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstType;
    @XmlElementRef(name = "par__cst_name_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstNameCp;
    @XmlElementRef(name = "par__cst_sort_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstSortNameDn;
    @XmlElementRef(name = "par__cst_ind_full_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstIndFullNameDn;
    @XmlElementRef(name = "par__cst_org_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstOrgNameDn;
    @XmlElementRef(name = "par__cst_ixo_title_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstIxoTitleDn;
    @XmlElementRef(name = "par__cst_pref_comm_meth", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstPrefCommMeth;
    @XmlElementRef(name = "par__cst_bio", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstBio;
    @XmlElementRef(name = "par__cst_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstAddDate;
    @XmlElementRef(name = "par__cst_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstAddUser;
    @XmlElementRef(name = "par__cst_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstChangeDate;
    @XmlElementRef(name = "par__cst_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstChangeUser;
    @XmlElementRef(name = "par__cst_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> parCstDeleteFlag;
    @XmlElementRef(name = "par__cst_recno", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> parCstRecno;
    @XmlElementRef(name = "par__cst_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstId;
    @XmlElementRef(name = "par__cst_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstKeyExt;
    @XmlElementRef(name = "par__cst_email_text_only", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> parCstEmailTextOnly;
    @XmlElementRef(name = "par__cst_credit_limit", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> parCstCreditLimit;
    @XmlElementRef(name = "par__cst_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstSrcKey;
    @XmlElementRef(name = "par__cst_src_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstSrcCode;
    @XmlElementRef(name = "par__cst_tax_exempt_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> parCstTaxExemptFlag;
    @XmlElementRef(name = "par__cst_tax_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstTaxId;
    @XmlElementRef(name = "par__cst_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstCxaKey;
    @XmlElementRef(name = "par__cst_no_email_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> parCstNoEmailFlag;
    @XmlElementRef(name = "par__cst_cxa_billing_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstCxaBillingKey;
    @XmlElementRef(name = "par__cst_eml_address_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstEmlAddressDn;
    @XmlElementRef(name = "par__cst_eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstEmlKey;
    @XmlElementRef(name = "par__cst_no_phone_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> parCstNoPhoneFlag;
    @XmlElementRef(name = "par__cst_phn_number_complete_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstPhnNumberCompleteDn;
    @XmlElementRef(name = "par__cst_cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstCphKey;
    @XmlElementRef(name = "par__cst_no_fax_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> parCstNoFaxFlag;
    @XmlElementRef(name = "par__cst_fax_number_complete_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstFaxNumberCompleteDn;
    @XmlElementRef(name = "par__cst_cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstCfxKey;
    @XmlElementRef(name = "par__cst_ixo_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstIxoKey;
    @XmlElementRef(name = "par__cst_no_web_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> parCstNoWebFlag;
    @XmlElementRef(name = "par__cst_oldid", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstOldid;
    @XmlElementRef(name = "par__cst_member_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> parCstMemberFlag;
    @XmlElementRef(name = "par__cst_url_code_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstUrlCodeDn;
    @XmlElementRef(name = "par__cst_parent_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstParentCstKey;
    @XmlElementRef(name = "par__cst_url_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstUrlKey;
    @XmlElementRef(name = "par__cst_no_msg_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> parCstNoMsgFlag;
    @XmlElementRef(name = "par__cst_msg_handle_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstMsgHandleDn;
    @XmlElementRef(name = "par__cst_web_login", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstWebLogin;
    @XmlElementRef(name = "par__cst_web_password", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstWebPassword;
    @XmlElementRef(name = "par__cst_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstEntityKey;
    @XmlElementRef(name = "par__cst_msg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstMsgKey;
    @XmlElementRef(name = "par__cst_no_mail_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> parCstNoMailFlag;
    @XmlElementRef(name = "par__cst_web_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstWebStartDate;
    @XmlElementRef(name = "par__cst_web_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstWebEndDate;
    @XmlElementRef(name = "par__cst_web_force_password_change", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> parCstWebForcePasswordChange;
    @XmlElementRef(name = "par__cst_web_login_disabled_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> parCstWebLoginDisabledFlag;
    @XmlElementRef(name = "par__cst_comment", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstComment;
    @XmlElementRef(name = "par__cst_credit_hold_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> parCstCreditHoldFlag;
    @XmlElementRef(name = "par__cst_credit_hold_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstCreditHoldReason;
    @XmlElementRef(name = "par__cst_web_forgot_password_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> parCstWebForgotPasswordStatus;
    @XmlElementRef(name = "par__cst_old_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstOldCxaKey;
    @XmlElementRef(name = "par__cst_last_email_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstLastEmailDate;
    @XmlElementRef(name = "par__cst_no_publish_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> parCstNoPublishFlag;
    @XmlElementRef(name = "par__cst_sin_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstSinKey;
    @XmlElementRef(name = "par__cst_ttl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstTtlKey;
    @XmlElementRef(name = "par__cst_jfn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstJfnKey;
    @XmlElementRef(name = "par__cst_cur_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstCurKey;
    @XmlElementRef(name = "par__cst_attribute_1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstAttribute1;
    @XmlElementRef(name = "par__cst_attribute_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstAttribute2;
    @XmlElementRef(name = "par__cst_do_not_include_directory_ext_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> parCstDoNotIncludeDirectoryExtFlag;
    @XmlElementRef(name = "par__cst_salutation_1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstSalutation1;
    @XmlElementRef(name = "par__cst_source_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstSourceExt;
    @XmlElementRef(name = "par__cst_salutation_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstSalutation2;
    @XmlElementRef(name = "par__cst_grace_period_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> parCstGracePeriodExt;
    @XmlElementRef(name = "par__cst_merge_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstMergeCstKey;
    @XmlElementRef(name = "par__cst_salutation_3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstSalutation3;
    @XmlElementRef(name = "par__cst_salutation_4", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstSalutation4;
    @XmlElementRef(name = "par__cst_default_recognize_as", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstDefaultRecognizeAs;
    @XmlElementRef(name = "par__cst_score", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> parCstScore;
    @XmlElementRef(name = "par__cst_score_normalized", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> parCstScoreNormalized;
    @XmlElementRef(name = "par__cst_score_trend", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> parCstScoreTrend;
    @XmlElementRef(name = "par__cst_vault_account", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstVaultAccount;
    @XmlElementRef(name = "par__cst_exclude_from_social_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> parCstExcludeFromSocialFlag;
    @XmlElementRef(name = "par__cst_social_score", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> parCstSocialScore;
    @XmlElementRef(name = "par__cst_ptin", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstPtin;
    @XmlElementRef(name = "par__cst_aicpa_member_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> parCstAicpaMemberId;
    @XmlElementRef(name = "par__cst_vendor_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstVendorCode;
    @XmlElementRef(name = "par__cst_sca_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> parCstScaKey;

    /**
     * Gets the value of the parCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstKey() {
        return parCstKey;
    }

    /**
     * Sets the value of the parCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstKey(JAXBElement<String> value) {
        this.parCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstType() {
        return parCstType;
    }

    /**
     * Sets the value of the parCstType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstType(JAXBElement<String> value) {
        this.parCstType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstNameCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstNameCp() {
        return parCstNameCp;
    }

    /**
     * Sets the value of the parCstNameCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstNameCp(JAXBElement<String> value) {
        this.parCstNameCp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstSortNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstSortNameDn() {
        return parCstSortNameDn;
    }

    /**
     * Sets the value of the parCstSortNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstSortNameDn(JAXBElement<String> value) {
        this.parCstSortNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstIndFullNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstIndFullNameDn() {
        return parCstIndFullNameDn;
    }

    /**
     * Sets the value of the parCstIndFullNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstIndFullNameDn(JAXBElement<String> value) {
        this.parCstIndFullNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstOrgNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstOrgNameDn() {
        return parCstOrgNameDn;
    }

    /**
     * Sets the value of the parCstOrgNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstOrgNameDn(JAXBElement<String> value) {
        this.parCstOrgNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstIxoTitleDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstIxoTitleDn() {
        return parCstIxoTitleDn;
    }

    /**
     * Sets the value of the parCstIxoTitleDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstIxoTitleDn(JAXBElement<String> value) {
        this.parCstIxoTitleDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstPrefCommMeth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstPrefCommMeth() {
        return parCstPrefCommMeth;
    }

    /**
     * Sets the value of the parCstPrefCommMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstPrefCommMeth(JAXBElement<String> value) {
        this.parCstPrefCommMeth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstBio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstBio() {
        return parCstBio;
    }

    /**
     * Sets the value of the parCstBio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstBio(JAXBElement<String> value) {
        this.parCstBio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstAddDate() {
        return parCstAddDate;
    }

    /**
     * Sets the value of the parCstAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstAddDate(JAXBElement<String> value) {
        this.parCstAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstAddUser() {
        return parCstAddUser;
    }

    /**
     * Sets the value of the parCstAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstAddUser(JAXBElement<String> value) {
        this.parCstAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstChangeDate() {
        return parCstChangeDate;
    }

    /**
     * Sets the value of the parCstChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstChangeDate(JAXBElement<String> value) {
        this.parCstChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstChangeUser() {
        return parCstChangeUser;
    }

    /**
     * Sets the value of the parCstChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstChangeUser(JAXBElement<String> value) {
        this.parCstChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getParCstDeleteFlag() {
        return parCstDeleteFlag;
    }

    /**
     * Sets the value of the parCstDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setParCstDeleteFlag(JAXBElement<Short> value) {
        this.parCstDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the parCstRecno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getParCstRecno() {
        return parCstRecno;
    }

    /**
     * Sets the value of the parCstRecno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setParCstRecno(JAXBElement<Long> value) {
        this.parCstRecno = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the parCstId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstId() {
        return parCstId;
    }

    /**
     * Sets the value of the parCstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstId(JAXBElement<String> value) {
        this.parCstId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstKeyExt() {
        return parCstKeyExt;
    }

    /**
     * Sets the value of the parCstKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstKeyExt(JAXBElement<String> value) {
        this.parCstKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstEmailTextOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getParCstEmailTextOnly() {
        return parCstEmailTextOnly;
    }

    /**
     * Sets the value of the parCstEmailTextOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setParCstEmailTextOnly(JAXBElement<Short> value) {
        this.parCstEmailTextOnly = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the parCstCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getParCstCreditLimit() {
        return parCstCreditLimit;
    }

    /**
     * Sets the value of the parCstCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setParCstCreditLimit(JAXBElement<BigDecimal> value) {
        this.parCstCreditLimit = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the parCstSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstSrcKey() {
        return parCstSrcKey;
    }

    /**
     * Sets the value of the parCstSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstSrcKey(JAXBElement<String> value) {
        this.parCstSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstSrcCode() {
        return parCstSrcCode;
    }

    /**
     * Sets the value of the parCstSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstSrcCode(JAXBElement<String> value) {
        this.parCstSrcCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstTaxExemptFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getParCstTaxExemptFlag() {
        return parCstTaxExemptFlag;
    }

    /**
     * Sets the value of the parCstTaxExemptFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setParCstTaxExemptFlag(JAXBElement<Short> value) {
        this.parCstTaxExemptFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the parCstTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstTaxId() {
        return parCstTaxId;
    }

    /**
     * Sets the value of the parCstTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstTaxId(JAXBElement<String> value) {
        this.parCstTaxId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstCxaKey() {
        return parCstCxaKey;
    }

    /**
     * Sets the value of the parCstCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstCxaKey(JAXBElement<String> value) {
        this.parCstCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstNoEmailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getParCstNoEmailFlag() {
        return parCstNoEmailFlag;
    }

    /**
     * Sets the value of the parCstNoEmailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setParCstNoEmailFlag(JAXBElement<Short> value) {
        this.parCstNoEmailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the parCstCxaBillingKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstCxaBillingKey() {
        return parCstCxaBillingKey;
    }

    /**
     * Sets the value of the parCstCxaBillingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstCxaBillingKey(JAXBElement<String> value) {
        this.parCstCxaBillingKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstEmlAddressDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstEmlAddressDn() {
        return parCstEmlAddressDn;
    }

    /**
     * Sets the value of the parCstEmlAddressDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstEmlAddressDn(JAXBElement<String> value) {
        this.parCstEmlAddressDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstEmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstEmlKey() {
        return parCstEmlKey;
    }

    /**
     * Sets the value of the parCstEmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstEmlKey(JAXBElement<String> value) {
        this.parCstEmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstNoPhoneFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getParCstNoPhoneFlag() {
        return parCstNoPhoneFlag;
    }

    /**
     * Sets the value of the parCstNoPhoneFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setParCstNoPhoneFlag(JAXBElement<Short> value) {
        this.parCstNoPhoneFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the parCstPhnNumberCompleteDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstPhnNumberCompleteDn() {
        return parCstPhnNumberCompleteDn;
    }

    /**
     * Sets the value of the parCstPhnNumberCompleteDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstPhnNumberCompleteDn(JAXBElement<String> value) {
        this.parCstPhnNumberCompleteDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstCphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstCphKey() {
        return parCstCphKey;
    }

    /**
     * Sets the value of the parCstCphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstCphKey(JAXBElement<String> value) {
        this.parCstCphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstNoFaxFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getParCstNoFaxFlag() {
        return parCstNoFaxFlag;
    }

    /**
     * Sets the value of the parCstNoFaxFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setParCstNoFaxFlag(JAXBElement<Short> value) {
        this.parCstNoFaxFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the parCstFaxNumberCompleteDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstFaxNumberCompleteDn() {
        return parCstFaxNumberCompleteDn;
    }

    /**
     * Sets the value of the parCstFaxNumberCompleteDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstFaxNumberCompleteDn(JAXBElement<String> value) {
        this.parCstFaxNumberCompleteDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstCfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstCfxKey() {
        return parCstCfxKey;
    }

    /**
     * Sets the value of the parCstCfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstCfxKey(JAXBElement<String> value) {
        this.parCstCfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstIxoKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstIxoKey() {
        return parCstIxoKey;
    }

    /**
     * Sets the value of the parCstIxoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstIxoKey(JAXBElement<String> value) {
        this.parCstIxoKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstNoWebFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getParCstNoWebFlag() {
        return parCstNoWebFlag;
    }

    /**
     * Sets the value of the parCstNoWebFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setParCstNoWebFlag(JAXBElement<Short> value) {
        this.parCstNoWebFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the parCstOldid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstOldid() {
        return parCstOldid;
    }

    /**
     * Sets the value of the parCstOldid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstOldid(JAXBElement<String> value) {
        this.parCstOldid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstMemberFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getParCstMemberFlag() {
        return parCstMemberFlag;
    }

    /**
     * Sets the value of the parCstMemberFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setParCstMemberFlag(JAXBElement<Short> value) {
        this.parCstMemberFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the parCstUrlCodeDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstUrlCodeDn() {
        return parCstUrlCodeDn;
    }

    /**
     * Sets the value of the parCstUrlCodeDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstUrlCodeDn(JAXBElement<String> value) {
        this.parCstUrlCodeDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstParentCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstParentCstKey() {
        return parCstParentCstKey;
    }

    /**
     * Sets the value of the parCstParentCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstParentCstKey(JAXBElement<String> value) {
        this.parCstParentCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstUrlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstUrlKey() {
        return parCstUrlKey;
    }

    /**
     * Sets the value of the parCstUrlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstUrlKey(JAXBElement<String> value) {
        this.parCstUrlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstNoMsgFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getParCstNoMsgFlag() {
        return parCstNoMsgFlag;
    }

    /**
     * Sets the value of the parCstNoMsgFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setParCstNoMsgFlag(JAXBElement<Short> value) {
        this.parCstNoMsgFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the parCstMsgHandleDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstMsgHandleDn() {
        return parCstMsgHandleDn;
    }

    /**
     * Sets the value of the parCstMsgHandleDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstMsgHandleDn(JAXBElement<String> value) {
        this.parCstMsgHandleDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstWebLogin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstWebLogin() {
        return parCstWebLogin;
    }

    /**
     * Sets the value of the parCstWebLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstWebLogin(JAXBElement<String> value) {
        this.parCstWebLogin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstWebPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstWebPassword() {
        return parCstWebPassword;
    }

    /**
     * Sets the value of the parCstWebPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstWebPassword(JAXBElement<String> value) {
        this.parCstWebPassword = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstEntityKey() {
        return parCstEntityKey;
    }

    /**
     * Sets the value of the parCstEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstEntityKey(JAXBElement<String> value) {
        this.parCstEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstMsgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstMsgKey() {
        return parCstMsgKey;
    }

    /**
     * Sets the value of the parCstMsgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstMsgKey(JAXBElement<String> value) {
        this.parCstMsgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstNoMailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getParCstNoMailFlag() {
        return parCstNoMailFlag;
    }

    /**
     * Sets the value of the parCstNoMailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setParCstNoMailFlag(JAXBElement<Short> value) {
        this.parCstNoMailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the parCstWebStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstWebStartDate() {
        return parCstWebStartDate;
    }

    /**
     * Sets the value of the parCstWebStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstWebStartDate(JAXBElement<String> value) {
        this.parCstWebStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstWebEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstWebEndDate() {
        return parCstWebEndDate;
    }

    /**
     * Sets the value of the parCstWebEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstWebEndDate(JAXBElement<String> value) {
        this.parCstWebEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstWebForcePasswordChange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getParCstWebForcePasswordChange() {
        return parCstWebForcePasswordChange;
    }

    /**
     * Sets the value of the parCstWebForcePasswordChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setParCstWebForcePasswordChange(JAXBElement<Short> value) {
        this.parCstWebForcePasswordChange = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the parCstWebLoginDisabledFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getParCstWebLoginDisabledFlag() {
        return parCstWebLoginDisabledFlag;
    }

    /**
     * Sets the value of the parCstWebLoginDisabledFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setParCstWebLoginDisabledFlag(JAXBElement<Short> value) {
        this.parCstWebLoginDisabledFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the parCstComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstComment() {
        return parCstComment;
    }

    /**
     * Sets the value of the parCstComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstComment(JAXBElement<String> value) {
        this.parCstComment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstCreditHoldFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getParCstCreditHoldFlag() {
        return parCstCreditHoldFlag;
    }

    /**
     * Sets the value of the parCstCreditHoldFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setParCstCreditHoldFlag(JAXBElement<Short> value) {
        this.parCstCreditHoldFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the parCstCreditHoldReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstCreditHoldReason() {
        return parCstCreditHoldReason;
    }

    /**
     * Sets the value of the parCstCreditHoldReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstCreditHoldReason(JAXBElement<String> value) {
        this.parCstCreditHoldReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstWebForgotPasswordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getParCstWebForgotPasswordStatus() {
        return parCstWebForgotPasswordStatus;
    }

    /**
     * Sets the value of the parCstWebForgotPasswordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setParCstWebForgotPasswordStatus(JAXBElement<Short> value) {
        this.parCstWebForgotPasswordStatus = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the parCstOldCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstOldCxaKey() {
        return parCstOldCxaKey;
    }

    /**
     * Sets the value of the parCstOldCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstOldCxaKey(JAXBElement<String> value) {
        this.parCstOldCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstLastEmailDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstLastEmailDate() {
        return parCstLastEmailDate;
    }

    /**
     * Sets the value of the parCstLastEmailDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstLastEmailDate(JAXBElement<String> value) {
        this.parCstLastEmailDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstNoPublishFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getParCstNoPublishFlag() {
        return parCstNoPublishFlag;
    }

    /**
     * Sets the value of the parCstNoPublishFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setParCstNoPublishFlag(JAXBElement<Short> value) {
        this.parCstNoPublishFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the parCstSinKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstSinKey() {
        return parCstSinKey;
    }

    /**
     * Sets the value of the parCstSinKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstSinKey(JAXBElement<String> value) {
        this.parCstSinKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstTtlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstTtlKey() {
        return parCstTtlKey;
    }

    /**
     * Sets the value of the parCstTtlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstTtlKey(JAXBElement<String> value) {
        this.parCstTtlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstJfnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstJfnKey() {
        return parCstJfnKey;
    }

    /**
     * Sets the value of the parCstJfnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstJfnKey(JAXBElement<String> value) {
        this.parCstJfnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstCurKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstCurKey() {
        return parCstCurKey;
    }

    /**
     * Sets the value of the parCstCurKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstCurKey(JAXBElement<String> value) {
        this.parCstCurKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstAttribute1() {
        return parCstAttribute1;
    }

    /**
     * Sets the value of the parCstAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstAttribute1(JAXBElement<String> value) {
        this.parCstAttribute1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstAttribute2() {
        return parCstAttribute2;
    }

    /**
     * Sets the value of the parCstAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstAttribute2(JAXBElement<String> value) {
        this.parCstAttribute2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstDoNotIncludeDirectoryExtFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getParCstDoNotIncludeDirectoryExtFlag() {
        return parCstDoNotIncludeDirectoryExtFlag;
    }

    /**
     * Sets the value of the parCstDoNotIncludeDirectoryExtFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setParCstDoNotIncludeDirectoryExtFlag(JAXBElement<Short> value) {
        this.parCstDoNotIncludeDirectoryExtFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the parCstSalutation1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstSalutation1() {
        return parCstSalutation1;
    }

    /**
     * Sets the value of the parCstSalutation1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstSalutation1(JAXBElement<String> value) {
        this.parCstSalutation1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstSourceExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstSourceExt() {
        return parCstSourceExt;
    }

    /**
     * Sets the value of the parCstSourceExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstSourceExt(JAXBElement<String> value) {
        this.parCstSourceExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstSalutation2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstSalutation2() {
        return parCstSalutation2;
    }

    /**
     * Sets the value of the parCstSalutation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstSalutation2(JAXBElement<String> value) {
        this.parCstSalutation2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstGracePeriodExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getParCstGracePeriodExt() {
        return parCstGracePeriodExt;
    }

    /**
     * Sets the value of the parCstGracePeriodExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setParCstGracePeriodExt(JAXBElement<Integer> value) {
        this.parCstGracePeriodExt = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the parCstMergeCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstMergeCstKey() {
        return parCstMergeCstKey;
    }

    /**
     * Sets the value of the parCstMergeCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstMergeCstKey(JAXBElement<String> value) {
        this.parCstMergeCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstSalutation3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstSalutation3() {
        return parCstSalutation3;
    }

    /**
     * Sets the value of the parCstSalutation3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstSalutation3(JAXBElement<String> value) {
        this.parCstSalutation3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstSalutation4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstSalutation4() {
        return parCstSalutation4;
    }

    /**
     * Sets the value of the parCstSalutation4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstSalutation4(JAXBElement<String> value) {
        this.parCstSalutation4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstDefaultRecognizeAs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstDefaultRecognizeAs() {
        return parCstDefaultRecognizeAs;
    }

    /**
     * Sets the value of the parCstDefaultRecognizeAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstDefaultRecognizeAs(JAXBElement<String> value) {
        this.parCstDefaultRecognizeAs = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getParCstScore() {
        return parCstScore;
    }

    /**
     * Sets the value of the parCstScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setParCstScore(JAXBElement<BigDecimal> value) {
        this.parCstScore = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the parCstScoreNormalized property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getParCstScoreNormalized() {
        return parCstScoreNormalized;
    }

    /**
     * Sets the value of the parCstScoreNormalized property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setParCstScoreNormalized(JAXBElement<Integer> value) {
        this.parCstScoreNormalized = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the parCstScoreTrend property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getParCstScoreTrend() {
        return parCstScoreTrend;
    }

    /**
     * Sets the value of the parCstScoreTrend property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setParCstScoreTrend(JAXBElement<Integer> value) {
        this.parCstScoreTrend = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the parCstVaultAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstVaultAccount() {
        return parCstVaultAccount;
    }

    /**
     * Sets the value of the parCstVaultAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstVaultAccount(JAXBElement<String> value) {
        this.parCstVaultAccount = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstExcludeFromSocialFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getParCstExcludeFromSocialFlag() {
        return parCstExcludeFromSocialFlag;
    }

    /**
     * Sets the value of the parCstExcludeFromSocialFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setParCstExcludeFromSocialFlag(JAXBElement<Short> value) {
        this.parCstExcludeFromSocialFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the parCstSocialScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getParCstSocialScore() {
        return parCstSocialScore;
    }

    /**
     * Sets the value of the parCstSocialScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setParCstSocialScore(JAXBElement<Integer> value) {
        this.parCstSocialScore = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the parCstPtin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstPtin() {
        return parCstPtin;
    }

    /**
     * Sets the value of the parCstPtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstPtin(JAXBElement<String> value) {
        this.parCstPtin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstAicpaMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getParCstAicpaMemberId() {
        return parCstAicpaMemberId;
    }

    /**
     * Sets the value of the parCstAicpaMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setParCstAicpaMemberId(JAXBElement<Long> value) {
        this.parCstAicpaMemberId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the parCstVendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstVendorCode() {
        return parCstVendorCode;
    }

    /**
     * Sets the value of the parCstVendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstVendorCode(JAXBElement<String> value) {
        this.parCstVendorCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parCstScaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParCstScaKey() {
        return parCstScaKey;
    }

    /**
     * Sets the value of the parCstScaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParCstScaKey(JAXBElement<String> value) {
        this.parCstScaKey = ((JAXBElement<String> ) value);
    }

}
