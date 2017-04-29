
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CentralizedOrderEntry_BillToIndividual_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CentralizedOrderEntry_BillToIndividual_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bco__cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_type" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_name_cp" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_sort_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_ind_full_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_org_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_ixo_title_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_pref_comm_meth" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_bio" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_recno" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_id" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_email_text_only" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_credit_limit" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_src_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_tax_exempt_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_tax_id" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_no_email_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_cxa_billing_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_eml_address_dn" type="{http://www.avectra.com/2005/}av_email_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_no_phone_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_phn_number_complete_dn" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_no_fax_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_fax_number_complete_dn" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_ixo_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_no_web_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_oldid" type="{http://www.avectra.com/2005/}stringLength15_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_member_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_url_code_dn" type="{http://www.avectra.com/2005/}av_url_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_parent_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_url_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_no_msg_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_msg_handle_dn" type="{http://www.avectra.com/2005/}av_messaging_name_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_web_login" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_web_password" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_msg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_no_mail_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_web_start_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_web_end_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_web_force_password_change" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_web_login_disabled_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_comment" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_credit_hold_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_credit_hold_reason" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_web_forgot_password_status" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_old_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_last_email_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_no_publish_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_sin_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_ttl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_jfn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_cur_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_attribute_1" type="{http://www.avectra.com/2005/}stringLength510_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_attribute_2" type="{http://www.avectra.com/2005/}stringLength510_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_do_not_include_directory_ext_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_salutation_1" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_source_ext" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_salutation_2" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_grace_period_ext" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_merge_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_salutation_3" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_salutation_4" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_default_recognize_as" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_score" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_score_normalized" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_score_trend" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_vault_account" type="{http://www.avectra.com/2005/}stringLength25_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_exclude_from_social_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_social_score" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_ptin" type="{http://www.avectra.com/2005/}stringLength9_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_aicpa_member_id" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_vendor_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="bco__cst_sca_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CentralizedOrderEntry_BillToIndividual_DataObjectType", propOrder = {
    "bcoCstKey",
    "bcoCstType",
    "bcoCstNameCp",
    "bcoCstSortNameDn",
    "bcoCstIndFullNameDn",
    "bcoCstOrgNameDn",
    "bcoCstIxoTitleDn",
    "bcoCstPrefCommMeth",
    "bcoCstBio",
    "bcoCstAddDate",
    "bcoCstAddUser",
    "bcoCstChangeDate",
    "bcoCstChangeUser",
    "bcoCstDeleteFlag",
    "bcoCstRecno",
    "bcoCstId",
    "bcoCstKeyExt",
    "bcoCstEmailTextOnly",
    "bcoCstCreditLimit",
    "bcoCstSrcKey",
    "bcoCstSrcCode",
    "bcoCstTaxExemptFlag",
    "bcoCstTaxId",
    "bcoCstCxaKey",
    "bcoCstNoEmailFlag",
    "bcoCstCxaBillingKey",
    "bcoCstEmlAddressDn",
    "bcoCstEmlKey",
    "bcoCstNoPhoneFlag",
    "bcoCstPhnNumberCompleteDn",
    "bcoCstCphKey",
    "bcoCstNoFaxFlag",
    "bcoCstFaxNumberCompleteDn",
    "bcoCstCfxKey",
    "bcoCstIxoKey",
    "bcoCstNoWebFlag",
    "bcoCstOldid",
    "bcoCstMemberFlag",
    "bcoCstUrlCodeDn",
    "bcoCstParentCstKey",
    "bcoCstUrlKey",
    "bcoCstNoMsgFlag",
    "bcoCstMsgHandleDn",
    "bcoCstWebLogin",
    "bcoCstWebPassword",
    "bcoCstEntityKey",
    "bcoCstMsgKey",
    "bcoCstNoMailFlag",
    "bcoCstWebStartDate",
    "bcoCstWebEndDate",
    "bcoCstWebForcePasswordChange",
    "bcoCstWebLoginDisabledFlag",
    "bcoCstComment",
    "bcoCstCreditHoldFlag",
    "bcoCstCreditHoldReason",
    "bcoCstWebForgotPasswordStatus",
    "bcoCstOldCxaKey",
    "bcoCstLastEmailDate",
    "bcoCstNoPublishFlag",
    "bcoCstSinKey",
    "bcoCstTtlKey",
    "bcoCstJfnKey",
    "bcoCstCurKey",
    "bcoCstAttribute1",
    "bcoCstAttribute2",
    "bcoCstDoNotIncludeDirectoryExtFlag",
    "bcoCstSalutation1",
    "bcoCstSourceExt",
    "bcoCstSalutation2",
    "bcoCstGracePeriodExt",
    "bcoCstMergeCstKey",
    "bcoCstSalutation3",
    "bcoCstSalutation4",
    "bcoCstDefaultRecognizeAs",
    "bcoCstScore",
    "bcoCstScoreNormalized",
    "bcoCstScoreTrend",
    "bcoCstVaultAccount",
    "bcoCstExcludeFromSocialFlag",
    "bcoCstSocialScore",
    "bcoCstPtin",
    "bcoCstAicpaMemberId",
    "bcoCstVendorCode",
    "bcoCstScaKey"
})
public class CentralizedOrderEntryBillToIndividualDataObjectType {

    @XmlElementRef(name = "bco__cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstKey;
    @XmlElementRef(name = "bco__cst_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstType;
    @XmlElementRef(name = "bco__cst_name_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstNameCp;
    @XmlElementRef(name = "bco__cst_sort_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstSortNameDn;
    @XmlElementRef(name = "bco__cst_ind_full_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstIndFullNameDn;
    @XmlElementRef(name = "bco__cst_org_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstOrgNameDn;
    @XmlElementRef(name = "bco__cst_ixo_title_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstIxoTitleDn;
    @XmlElementRef(name = "bco__cst_pref_comm_meth", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstPrefCommMeth;
    @XmlElementRef(name = "bco__cst_bio", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstBio;
    @XmlElementRef(name = "bco__cst_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstAddDate;
    @XmlElementRef(name = "bco__cst_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstAddUser;
    @XmlElementRef(name = "bco__cst_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstChangeDate;
    @XmlElementRef(name = "bco__cst_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstChangeUser;
    @XmlElementRef(name = "bco__cst_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcoCstDeleteFlag;
    @XmlElementRef(name = "bco__cst_recno", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> bcoCstRecno;
    @XmlElementRef(name = "bco__cst_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstId;
    @XmlElementRef(name = "bco__cst_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstKeyExt;
    @XmlElementRef(name = "bco__cst_email_text_only", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcoCstEmailTextOnly;
    @XmlElementRef(name = "bco__cst_credit_limit", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> bcoCstCreditLimit;
    @XmlElementRef(name = "bco__cst_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstSrcKey;
    @XmlElementRef(name = "bco__cst_src_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstSrcCode;
    @XmlElementRef(name = "bco__cst_tax_exempt_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcoCstTaxExemptFlag;
    @XmlElementRef(name = "bco__cst_tax_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstTaxId;
    @XmlElementRef(name = "bco__cst_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstCxaKey;
    @XmlElementRef(name = "bco__cst_no_email_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcoCstNoEmailFlag;
    @XmlElementRef(name = "bco__cst_cxa_billing_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstCxaBillingKey;
    @XmlElementRef(name = "bco__cst_eml_address_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstEmlAddressDn;
    @XmlElementRef(name = "bco__cst_eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstEmlKey;
    @XmlElementRef(name = "bco__cst_no_phone_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcoCstNoPhoneFlag;
    @XmlElementRef(name = "bco__cst_phn_number_complete_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstPhnNumberCompleteDn;
    @XmlElementRef(name = "bco__cst_cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstCphKey;
    @XmlElementRef(name = "bco__cst_no_fax_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcoCstNoFaxFlag;
    @XmlElementRef(name = "bco__cst_fax_number_complete_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstFaxNumberCompleteDn;
    @XmlElementRef(name = "bco__cst_cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstCfxKey;
    @XmlElementRef(name = "bco__cst_ixo_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstIxoKey;
    @XmlElementRef(name = "bco__cst_no_web_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcoCstNoWebFlag;
    @XmlElementRef(name = "bco__cst_oldid", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstOldid;
    @XmlElementRef(name = "bco__cst_member_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcoCstMemberFlag;
    @XmlElementRef(name = "bco__cst_url_code_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstUrlCodeDn;
    @XmlElementRef(name = "bco__cst_parent_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstParentCstKey;
    @XmlElementRef(name = "bco__cst_url_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstUrlKey;
    @XmlElementRef(name = "bco__cst_no_msg_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcoCstNoMsgFlag;
    @XmlElementRef(name = "bco__cst_msg_handle_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstMsgHandleDn;
    @XmlElementRef(name = "bco__cst_web_login", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstWebLogin;
    @XmlElementRef(name = "bco__cst_web_password", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstWebPassword;
    @XmlElementRef(name = "bco__cst_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstEntityKey;
    @XmlElementRef(name = "bco__cst_msg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstMsgKey;
    @XmlElementRef(name = "bco__cst_no_mail_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcoCstNoMailFlag;
    @XmlElementRef(name = "bco__cst_web_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstWebStartDate;
    @XmlElementRef(name = "bco__cst_web_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstWebEndDate;
    @XmlElementRef(name = "bco__cst_web_force_password_change", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcoCstWebForcePasswordChange;
    @XmlElementRef(name = "bco__cst_web_login_disabled_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcoCstWebLoginDisabledFlag;
    @XmlElementRef(name = "bco__cst_comment", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstComment;
    @XmlElementRef(name = "bco__cst_credit_hold_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcoCstCreditHoldFlag;
    @XmlElementRef(name = "bco__cst_credit_hold_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstCreditHoldReason;
    @XmlElementRef(name = "bco__cst_web_forgot_password_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcoCstWebForgotPasswordStatus;
    @XmlElementRef(name = "bco__cst_old_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstOldCxaKey;
    @XmlElementRef(name = "bco__cst_last_email_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstLastEmailDate;
    @XmlElementRef(name = "bco__cst_no_publish_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcoCstNoPublishFlag;
    @XmlElementRef(name = "bco__cst_sin_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstSinKey;
    @XmlElementRef(name = "bco__cst_ttl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstTtlKey;
    @XmlElementRef(name = "bco__cst_jfn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstJfnKey;
    @XmlElementRef(name = "bco__cst_cur_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstCurKey;
    @XmlElementRef(name = "bco__cst_attribute_1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstAttribute1;
    @XmlElementRef(name = "bco__cst_attribute_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstAttribute2;
    @XmlElementRef(name = "bco__cst_do_not_include_directory_ext_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcoCstDoNotIncludeDirectoryExtFlag;
    @XmlElementRef(name = "bco__cst_salutation_1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstSalutation1;
    @XmlElementRef(name = "bco__cst_source_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstSourceExt;
    @XmlElementRef(name = "bco__cst_salutation_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstSalutation2;
    @XmlElementRef(name = "bco__cst_grace_period_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> bcoCstGracePeriodExt;
    @XmlElementRef(name = "bco__cst_merge_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstMergeCstKey;
    @XmlElementRef(name = "bco__cst_salutation_3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstSalutation3;
    @XmlElementRef(name = "bco__cst_salutation_4", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstSalutation4;
    @XmlElementRef(name = "bco__cst_default_recognize_as", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstDefaultRecognizeAs;
    @XmlElementRef(name = "bco__cst_score", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> bcoCstScore;
    @XmlElementRef(name = "bco__cst_score_normalized", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> bcoCstScoreNormalized;
    @XmlElementRef(name = "bco__cst_score_trend", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> bcoCstScoreTrend;
    @XmlElementRef(name = "bco__cst_vault_account", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstVaultAccount;
    @XmlElementRef(name = "bco__cst_exclude_from_social_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcoCstExcludeFromSocialFlag;
    @XmlElementRef(name = "bco__cst_social_score", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> bcoCstSocialScore;
    @XmlElementRef(name = "bco__cst_ptin", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstPtin;
    @XmlElementRef(name = "bco__cst_aicpa_member_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> bcoCstAicpaMemberId;
    @XmlElementRef(name = "bco__cst_vendor_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstVendorCode;
    @XmlElementRef(name = "bco__cst_sca_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcoCstScaKey;

    /**
     * Gets the value of the bcoCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstKey() {
        return bcoCstKey;
    }

    /**
     * Sets the value of the bcoCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstKey(JAXBElement<String> value) {
        this.bcoCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstType() {
        return bcoCstType;
    }

    /**
     * Sets the value of the bcoCstType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstType(JAXBElement<String> value) {
        this.bcoCstType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstNameCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstNameCp() {
        return bcoCstNameCp;
    }

    /**
     * Sets the value of the bcoCstNameCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstNameCp(JAXBElement<String> value) {
        this.bcoCstNameCp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstSortNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstSortNameDn() {
        return bcoCstSortNameDn;
    }

    /**
     * Sets the value of the bcoCstSortNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstSortNameDn(JAXBElement<String> value) {
        this.bcoCstSortNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstIndFullNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstIndFullNameDn() {
        return bcoCstIndFullNameDn;
    }

    /**
     * Sets the value of the bcoCstIndFullNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstIndFullNameDn(JAXBElement<String> value) {
        this.bcoCstIndFullNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstOrgNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstOrgNameDn() {
        return bcoCstOrgNameDn;
    }

    /**
     * Sets the value of the bcoCstOrgNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstOrgNameDn(JAXBElement<String> value) {
        this.bcoCstOrgNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstIxoTitleDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstIxoTitleDn() {
        return bcoCstIxoTitleDn;
    }

    /**
     * Sets the value of the bcoCstIxoTitleDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstIxoTitleDn(JAXBElement<String> value) {
        this.bcoCstIxoTitleDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstPrefCommMeth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstPrefCommMeth() {
        return bcoCstPrefCommMeth;
    }

    /**
     * Sets the value of the bcoCstPrefCommMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstPrefCommMeth(JAXBElement<String> value) {
        this.bcoCstPrefCommMeth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstBio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstBio() {
        return bcoCstBio;
    }

    /**
     * Sets the value of the bcoCstBio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstBio(JAXBElement<String> value) {
        this.bcoCstBio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstAddDate() {
        return bcoCstAddDate;
    }

    /**
     * Sets the value of the bcoCstAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstAddDate(JAXBElement<String> value) {
        this.bcoCstAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstAddUser() {
        return bcoCstAddUser;
    }

    /**
     * Sets the value of the bcoCstAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstAddUser(JAXBElement<String> value) {
        this.bcoCstAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstChangeDate() {
        return bcoCstChangeDate;
    }

    /**
     * Sets the value of the bcoCstChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstChangeDate(JAXBElement<String> value) {
        this.bcoCstChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstChangeUser() {
        return bcoCstChangeUser;
    }

    /**
     * Sets the value of the bcoCstChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstChangeUser(JAXBElement<String> value) {
        this.bcoCstChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcoCstDeleteFlag() {
        return bcoCstDeleteFlag;
    }

    /**
     * Sets the value of the bcoCstDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcoCstDeleteFlag(JAXBElement<Short> value) {
        this.bcoCstDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcoCstRecno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBcoCstRecno() {
        return bcoCstRecno;
    }

    /**
     * Sets the value of the bcoCstRecno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBcoCstRecno(JAXBElement<Long> value) {
        this.bcoCstRecno = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the bcoCstId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstId() {
        return bcoCstId;
    }

    /**
     * Sets the value of the bcoCstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstId(JAXBElement<String> value) {
        this.bcoCstId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstKeyExt() {
        return bcoCstKeyExt;
    }

    /**
     * Sets the value of the bcoCstKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstKeyExt(JAXBElement<String> value) {
        this.bcoCstKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstEmailTextOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcoCstEmailTextOnly() {
        return bcoCstEmailTextOnly;
    }

    /**
     * Sets the value of the bcoCstEmailTextOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcoCstEmailTextOnly(JAXBElement<Short> value) {
        this.bcoCstEmailTextOnly = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcoCstCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBcoCstCreditLimit() {
        return bcoCstCreditLimit;
    }

    /**
     * Sets the value of the bcoCstCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBcoCstCreditLimit(JAXBElement<BigDecimal> value) {
        this.bcoCstCreditLimit = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the bcoCstSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstSrcKey() {
        return bcoCstSrcKey;
    }

    /**
     * Sets the value of the bcoCstSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstSrcKey(JAXBElement<String> value) {
        this.bcoCstSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstSrcCode() {
        return bcoCstSrcCode;
    }

    /**
     * Sets the value of the bcoCstSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstSrcCode(JAXBElement<String> value) {
        this.bcoCstSrcCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstTaxExemptFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcoCstTaxExemptFlag() {
        return bcoCstTaxExemptFlag;
    }

    /**
     * Sets the value of the bcoCstTaxExemptFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcoCstTaxExemptFlag(JAXBElement<Short> value) {
        this.bcoCstTaxExemptFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcoCstTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstTaxId() {
        return bcoCstTaxId;
    }

    /**
     * Sets the value of the bcoCstTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstTaxId(JAXBElement<String> value) {
        this.bcoCstTaxId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstCxaKey() {
        return bcoCstCxaKey;
    }

    /**
     * Sets the value of the bcoCstCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstCxaKey(JAXBElement<String> value) {
        this.bcoCstCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstNoEmailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcoCstNoEmailFlag() {
        return bcoCstNoEmailFlag;
    }

    /**
     * Sets the value of the bcoCstNoEmailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcoCstNoEmailFlag(JAXBElement<Short> value) {
        this.bcoCstNoEmailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcoCstCxaBillingKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstCxaBillingKey() {
        return bcoCstCxaBillingKey;
    }

    /**
     * Sets the value of the bcoCstCxaBillingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstCxaBillingKey(JAXBElement<String> value) {
        this.bcoCstCxaBillingKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstEmlAddressDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstEmlAddressDn() {
        return bcoCstEmlAddressDn;
    }

    /**
     * Sets the value of the bcoCstEmlAddressDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstEmlAddressDn(JAXBElement<String> value) {
        this.bcoCstEmlAddressDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstEmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstEmlKey() {
        return bcoCstEmlKey;
    }

    /**
     * Sets the value of the bcoCstEmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstEmlKey(JAXBElement<String> value) {
        this.bcoCstEmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstNoPhoneFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcoCstNoPhoneFlag() {
        return bcoCstNoPhoneFlag;
    }

    /**
     * Sets the value of the bcoCstNoPhoneFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcoCstNoPhoneFlag(JAXBElement<Short> value) {
        this.bcoCstNoPhoneFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcoCstPhnNumberCompleteDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstPhnNumberCompleteDn() {
        return bcoCstPhnNumberCompleteDn;
    }

    /**
     * Sets the value of the bcoCstPhnNumberCompleteDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstPhnNumberCompleteDn(JAXBElement<String> value) {
        this.bcoCstPhnNumberCompleteDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstCphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstCphKey() {
        return bcoCstCphKey;
    }

    /**
     * Sets the value of the bcoCstCphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstCphKey(JAXBElement<String> value) {
        this.bcoCstCphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstNoFaxFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcoCstNoFaxFlag() {
        return bcoCstNoFaxFlag;
    }

    /**
     * Sets the value of the bcoCstNoFaxFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcoCstNoFaxFlag(JAXBElement<Short> value) {
        this.bcoCstNoFaxFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcoCstFaxNumberCompleteDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstFaxNumberCompleteDn() {
        return bcoCstFaxNumberCompleteDn;
    }

    /**
     * Sets the value of the bcoCstFaxNumberCompleteDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstFaxNumberCompleteDn(JAXBElement<String> value) {
        this.bcoCstFaxNumberCompleteDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstCfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstCfxKey() {
        return bcoCstCfxKey;
    }

    /**
     * Sets the value of the bcoCstCfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstCfxKey(JAXBElement<String> value) {
        this.bcoCstCfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstIxoKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstIxoKey() {
        return bcoCstIxoKey;
    }

    /**
     * Sets the value of the bcoCstIxoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstIxoKey(JAXBElement<String> value) {
        this.bcoCstIxoKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstNoWebFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcoCstNoWebFlag() {
        return bcoCstNoWebFlag;
    }

    /**
     * Sets the value of the bcoCstNoWebFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcoCstNoWebFlag(JAXBElement<Short> value) {
        this.bcoCstNoWebFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcoCstOldid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstOldid() {
        return bcoCstOldid;
    }

    /**
     * Sets the value of the bcoCstOldid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstOldid(JAXBElement<String> value) {
        this.bcoCstOldid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstMemberFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcoCstMemberFlag() {
        return bcoCstMemberFlag;
    }

    /**
     * Sets the value of the bcoCstMemberFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcoCstMemberFlag(JAXBElement<Short> value) {
        this.bcoCstMemberFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcoCstUrlCodeDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstUrlCodeDn() {
        return bcoCstUrlCodeDn;
    }

    /**
     * Sets the value of the bcoCstUrlCodeDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstUrlCodeDn(JAXBElement<String> value) {
        this.bcoCstUrlCodeDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstParentCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstParentCstKey() {
        return bcoCstParentCstKey;
    }

    /**
     * Sets the value of the bcoCstParentCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstParentCstKey(JAXBElement<String> value) {
        this.bcoCstParentCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstUrlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstUrlKey() {
        return bcoCstUrlKey;
    }

    /**
     * Sets the value of the bcoCstUrlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstUrlKey(JAXBElement<String> value) {
        this.bcoCstUrlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstNoMsgFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcoCstNoMsgFlag() {
        return bcoCstNoMsgFlag;
    }

    /**
     * Sets the value of the bcoCstNoMsgFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcoCstNoMsgFlag(JAXBElement<Short> value) {
        this.bcoCstNoMsgFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcoCstMsgHandleDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstMsgHandleDn() {
        return bcoCstMsgHandleDn;
    }

    /**
     * Sets the value of the bcoCstMsgHandleDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstMsgHandleDn(JAXBElement<String> value) {
        this.bcoCstMsgHandleDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstWebLogin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstWebLogin() {
        return bcoCstWebLogin;
    }

    /**
     * Sets the value of the bcoCstWebLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstWebLogin(JAXBElement<String> value) {
        this.bcoCstWebLogin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstWebPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstWebPassword() {
        return bcoCstWebPassword;
    }

    /**
     * Sets the value of the bcoCstWebPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstWebPassword(JAXBElement<String> value) {
        this.bcoCstWebPassword = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstEntityKey() {
        return bcoCstEntityKey;
    }

    /**
     * Sets the value of the bcoCstEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstEntityKey(JAXBElement<String> value) {
        this.bcoCstEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstMsgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstMsgKey() {
        return bcoCstMsgKey;
    }

    /**
     * Sets the value of the bcoCstMsgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstMsgKey(JAXBElement<String> value) {
        this.bcoCstMsgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstNoMailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcoCstNoMailFlag() {
        return bcoCstNoMailFlag;
    }

    /**
     * Sets the value of the bcoCstNoMailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcoCstNoMailFlag(JAXBElement<Short> value) {
        this.bcoCstNoMailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcoCstWebStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstWebStartDate() {
        return bcoCstWebStartDate;
    }

    /**
     * Sets the value of the bcoCstWebStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstWebStartDate(JAXBElement<String> value) {
        this.bcoCstWebStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstWebEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstWebEndDate() {
        return bcoCstWebEndDate;
    }

    /**
     * Sets the value of the bcoCstWebEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstWebEndDate(JAXBElement<String> value) {
        this.bcoCstWebEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstWebForcePasswordChange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcoCstWebForcePasswordChange() {
        return bcoCstWebForcePasswordChange;
    }

    /**
     * Sets the value of the bcoCstWebForcePasswordChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcoCstWebForcePasswordChange(JAXBElement<Short> value) {
        this.bcoCstWebForcePasswordChange = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcoCstWebLoginDisabledFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcoCstWebLoginDisabledFlag() {
        return bcoCstWebLoginDisabledFlag;
    }

    /**
     * Sets the value of the bcoCstWebLoginDisabledFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcoCstWebLoginDisabledFlag(JAXBElement<Short> value) {
        this.bcoCstWebLoginDisabledFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcoCstComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstComment() {
        return bcoCstComment;
    }

    /**
     * Sets the value of the bcoCstComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstComment(JAXBElement<String> value) {
        this.bcoCstComment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstCreditHoldFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcoCstCreditHoldFlag() {
        return bcoCstCreditHoldFlag;
    }

    /**
     * Sets the value of the bcoCstCreditHoldFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcoCstCreditHoldFlag(JAXBElement<Short> value) {
        this.bcoCstCreditHoldFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcoCstCreditHoldReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstCreditHoldReason() {
        return bcoCstCreditHoldReason;
    }

    /**
     * Sets the value of the bcoCstCreditHoldReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstCreditHoldReason(JAXBElement<String> value) {
        this.bcoCstCreditHoldReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstWebForgotPasswordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcoCstWebForgotPasswordStatus() {
        return bcoCstWebForgotPasswordStatus;
    }

    /**
     * Sets the value of the bcoCstWebForgotPasswordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcoCstWebForgotPasswordStatus(JAXBElement<Short> value) {
        this.bcoCstWebForgotPasswordStatus = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcoCstOldCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstOldCxaKey() {
        return bcoCstOldCxaKey;
    }

    /**
     * Sets the value of the bcoCstOldCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstOldCxaKey(JAXBElement<String> value) {
        this.bcoCstOldCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstLastEmailDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstLastEmailDate() {
        return bcoCstLastEmailDate;
    }

    /**
     * Sets the value of the bcoCstLastEmailDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstLastEmailDate(JAXBElement<String> value) {
        this.bcoCstLastEmailDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstNoPublishFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcoCstNoPublishFlag() {
        return bcoCstNoPublishFlag;
    }

    /**
     * Sets the value of the bcoCstNoPublishFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcoCstNoPublishFlag(JAXBElement<Short> value) {
        this.bcoCstNoPublishFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcoCstSinKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstSinKey() {
        return bcoCstSinKey;
    }

    /**
     * Sets the value of the bcoCstSinKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstSinKey(JAXBElement<String> value) {
        this.bcoCstSinKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstTtlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstTtlKey() {
        return bcoCstTtlKey;
    }

    /**
     * Sets the value of the bcoCstTtlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstTtlKey(JAXBElement<String> value) {
        this.bcoCstTtlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstJfnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstJfnKey() {
        return bcoCstJfnKey;
    }

    /**
     * Sets the value of the bcoCstJfnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstJfnKey(JAXBElement<String> value) {
        this.bcoCstJfnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstCurKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstCurKey() {
        return bcoCstCurKey;
    }

    /**
     * Sets the value of the bcoCstCurKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstCurKey(JAXBElement<String> value) {
        this.bcoCstCurKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstAttribute1() {
        return bcoCstAttribute1;
    }

    /**
     * Sets the value of the bcoCstAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstAttribute1(JAXBElement<String> value) {
        this.bcoCstAttribute1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstAttribute2() {
        return bcoCstAttribute2;
    }

    /**
     * Sets the value of the bcoCstAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstAttribute2(JAXBElement<String> value) {
        this.bcoCstAttribute2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstDoNotIncludeDirectoryExtFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcoCstDoNotIncludeDirectoryExtFlag() {
        return bcoCstDoNotIncludeDirectoryExtFlag;
    }

    /**
     * Sets the value of the bcoCstDoNotIncludeDirectoryExtFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcoCstDoNotIncludeDirectoryExtFlag(JAXBElement<Short> value) {
        this.bcoCstDoNotIncludeDirectoryExtFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcoCstSalutation1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstSalutation1() {
        return bcoCstSalutation1;
    }

    /**
     * Sets the value of the bcoCstSalutation1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstSalutation1(JAXBElement<String> value) {
        this.bcoCstSalutation1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstSourceExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstSourceExt() {
        return bcoCstSourceExt;
    }

    /**
     * Sets the value of the bcoCstSourceExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstSourceExt(JAXBElement<String> value) {
        this.bcoCstSourceExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstSalutation2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstSalutation2() {
        return bcoCstSalutation2;
    }

    /**
     * Sets the value of the bcoCstSalutation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstSalutation2(JAXBElement<String> value) {
        this.bcoCstSalutation2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstGracePeriodExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBcoCstGracePeriodExt() {
        return bcoCstGracePeriodExt;
    }

    /**
     * Sets the value of the bcoCstGracePeriodExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBcoCstGracePeriodExt(JAXBElement<Integer> value) {
        this.bcoCstGracePeriodExt = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bcoCstMergeCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstMergeCstKey() {
        return bcoCstMergeCstKey;
    }

    /**
     * Sets the value of the bcoCstMergeCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstMergeCstKey(JAXBElement<String> value) {
        this.bcoCstMergeCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstSalutation3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstSalutation3() {
        return bcoCstSalutation3;
    }

    /**
     * Sets the value of the bcoCstSalutation3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstSalutation3(JAXBElement<String> value) {
        this.bcoCstSalutation3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstSalutation4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstSalutation4() {
        return bcoCstSalutation4;
    }

    /**
     * Sets the value of the bcoCstSalutation4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstSalutation4(JAXBElement<String> value) {
        this.bcoCstSalutation4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstDefaultRecognizeAs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstDefaultRecognizeAs() {
        return bcoCstDefaultRecognizeAs;
    }

    /**
     * Sets the value of the bcoCstDefaultRecognizeAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstDefaultRecognizeAs(JAXBElement<String> value) {
        this.bcoCstDefaultRecognizeAs = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBcoCstScore() {
        return bcoCstScore;
    }

    /**
     * Sets the value of the bcoCstScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBcoCstScore(JAXBElement<BigDecimal> value) {
        this.bcoCstScore = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the bcoCstScoreNormalized property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBcoCstScoreNormalized() {
        return bcoCstScoreNormalized;
    }

    /**
     * Sets the value of the bcoCstScoreNormalized property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBcoCstScoreNormalized(JAXBElement<Integer> value) {
        this.bcoCstScoreNormalized = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bcoCstScoreTrend property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBcoCstScoreTrend() {
        return bcoCstScoreTrend;
    }

    /**
     * Sets the value of the bcoCstScoreTrend property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBcoCstScoreTrend(JAXBElement<Integer> value) {
        this.bcoCstScoreTrend = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bcoCstVaultAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstVaultAccount() {
        return bcoCstVaultAccount;
    }

    /**
     * Sets the value of the bcoCstVaultAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstVaultAccount(JAXBElement<String> value) {
        this.bcoCstVaultAccount = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstExcludeFromSocialFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcoCstExcludeFromSocialFlag() {
        return bcoCstExcludeFromSocialFlag;
    }

    /**
     * Sets the value of the bcoCstExcludeFromSocialFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcoCstExcludeFromSocialFlag(JAXBElement<Short> value) {
        this.bcoCstExcludeFromSocialFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcoCstSocialScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBcoCstSocialScore() {
        return bcoCstSocialScore;
    }

    /**
     * Sets the value of the bcoCstSocialScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBcoCstSocialScore(JAXBElement<Integer> value) {
        this.bcoCstSocialScore = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bcoCstPtin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstPtin() {
        return bcoCstPtin;
    }

    /**
     * Sets the value of the bcoCstPtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstPtin(JAXBElement<String> value) {
        this.bcoCstPtin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstAicpaMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBcoCstAicpaMemberId() {
        return bcoCstAicpaMemberId;
    }

    /**
     * Sets the value of the bcoCstAicpaMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBcoCstAicpaMemberId(JAXBElement<Long> value) {
        this.bcoCstAicpaMemberId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the bcoCstVendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstVendorCode() {
        return bcoCstVendorCode;
    }

    /**
     * Sets the value of the bcoCstVendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstVendorCode(JAXBElement<String> value) {
        this.bcoCstVendorCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcoCstScaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcoCstScaKey() {
        return bcoCstScaKey;
    }

    /**
     * Sets the value of the bcoCstScaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcoCstScaKey(JAXBElement<String> value) {
        this.bcoCstScaKey = ((JAXBElement<String> ) value);
    }

}
