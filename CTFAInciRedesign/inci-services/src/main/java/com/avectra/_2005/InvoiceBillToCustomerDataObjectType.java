
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Invoice_BillToCustomer_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Invoice_BillToCustomer_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bcs__cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_type" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_name_cp" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_sort_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_ind_full_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_org_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_ixo_title_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_pref_comm_meth" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_bio" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_recno" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_id" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_email_text_only" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_credit_limit" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_src_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_tax_exempt_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_tax_id" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_no_email_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_cxa_billing_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_eml_address_dn" type="{http://www.avectra.com/2005/}av_email_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_no_phone_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_phn_number_complete_dn" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_no_fax_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_fax_number_complete_dn" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_ixo_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_no_web_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_oldid" type="{http://www.avectra.com/2005/}stringLength15_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_member_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_url_code_dn" type="{http://www.avectra.com/2005/}av_url_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_parent_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_url_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_no_msg_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_msg_handle_dn" type="{http://www.avectra.com/2005/}av_messaging_name_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_web_login" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_web_password" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_msg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_no_mail_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_web_start_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_web_end_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_web_force_password_change" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_web_login_disabled_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_comment" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_credit_hold_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_credit_hold_reason" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_web_forgot_password_status" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_old_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_last_email_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_no_publish_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_sin_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_ttl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_jfn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_cur_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_attribute_1" type="{http://www.avectra.com/2005/}stringLength510_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_attribute_2" type="{http://www.avectra.com/2005/}stringLength510_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_do_not_include_directory_ext_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_salutation_1" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_source_ext" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_salutation_2" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_grace_period_ext" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_merge_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_salutation_3" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_salutation_4" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_default_recognize_as" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_score" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_score_normalized" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_score_trend" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_vault_account" type="{http://www.avectra.com/2005/}stringLength25_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_exclude_from_social_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_social_score" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_ptin" type="{http://www.avectra.com/2005/}stringLength9_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_aicpa_member_id" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_vendor_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="bcs__cst_sca_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Invoice_BillToCustomer_DataObjectType", propOrder = {
    "bcsCstKey",
    "bcsCstType",
    "bcsCstNameCp",
    "bcsCstSortNameDn",
    "bcsCstIndFullNameDn",
    "bcsCstOrgNameDn",
    "bcsCstIxoTitleDn",
    "bcsCstPrefCommMeth",
    "bcsCstBio",
    "bcsCstAddDate",
    "bcsCstAddUser",
    "bcsCstChangeDate",
    "bcsCstChangeUser",
    "bcsCstDeleteFlag",
    "bcsCstRecno",
    "bcsCstId",
    "bcsCstKeyExt",
    "bcsCstEmailTextOnly",
    "bcsCstCreditLimit",
    "bcsCstSrcKey",
    "bcsCstSrcCode",
    "bcsCstTaxExemptFlag",
    "bcsCstTaxId",
    "bcsCstCxaKey",
    "bcsCstNoEmailFlag",
    "bcsCstCxaBillingKey",
    "bcsCstEmlAddressDn",
    "bcsCstEmlKey",
    "bcsCstNoPhoneFlag",
    "bcsCstPhnNumberCompleteDn",
    "bcsCstCphKey",
    "bcsCstNoFaxFlag",
    "bcsCstFaxNumberCompleteDn",
    "bcsCstCfxKey",
    "bcsCstIxoKey",
    "bcsCstNoWebFlag",
    "bcsCstOldid",
    "bcsCstMemberFlag",
    "bcsCstUrlCodeDn",
    "bcsCstParentCstKey",
    "bcsCstUrlKey",
    "bcsCstNoMsgFlag",
    "bcsCstMsgHandleDn",
    "bcsCstWebLogin",
    "bcsCstWebPassword",
    "bcsCstEntityKey",
    "bcsCstMsgKey",
    "bcsCstNoMailFlag",
    "bcsCstWebStartDate",
    "bcsCstWebEndDate",
    "bcsCstWebForcePasswordChange",
    "bcsCstWebLoginDisabledFlag",
    "bcsCstComment",
    "bcsCstCreditHoldFlag",
    "bcsCstCreditHoldReason",
    "bcsCstWebForgotPasswordStatus",
    "bcsCstOldCxaKey",
    "bcsCstLastEmailDate",
    "bcsCstNoPublishFlag",
    "bcsCstSinKey",
    "bcsCstTtlKey",
    "bcsCstJfnKey",
    "bcsCstCurKey",
    "bcsCstAttribute1",
    "bcsCstAttribute2",
    "bcsCstDoNotIncludeDirectoryExtFlag",
    "bcsCstSalutation1",
    "bcsCstSourceExt",
    "bcsCstSalutation2",
    "bcsCstGracePeriodExt",
    "bcsCstMergeCstKey",
    "bcsCstSalutation3",
    "bcsCstSalutation4",
    "bcsCstDefaultRecognizeAs",
    "bcsCstScore",
    "bcsCstScoreNormalized",
    "bcsCstScoreTrend",
    "bcsCstVaultAccount",
    "bcsCstExcludeFromSocialFlag",
    "bcsCstSocialScore",
    "bcsCstPtin",
    "bcsCstAicpaMemberId",
    "bcsCstVendorCode",
    "bcsCstScaKey"
})
public class InvoiceBillToCustomerDataObjectType {

    @XmlElementRef(name = "bcs__cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstKey;
    @XmlElementRef(name = "bcs__cst_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstType;
    @XmlElementRef(name = "bcs__cst_name_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstNameCp;
    @XmlElementRef(name = "bcs__cst_sort_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstSortNameDn;
    @XmlElementRef(name = "bcs__cst_ind_full_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstIndFullNameDn;
    @XmlElementRef(name = "bcs__cst_org_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstOrgNameDn;
    @XmlElementRef(name = "bcs__cst_ixo_title_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstIxoTitleDn;
    @XmlElementRef(name = "bcs__cst_pref_comm_meth", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstPrefCommMeth;
    @XmlElementRef(name = "bcs__cst_bio", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstBio;
    @XmlElementRef(name = "bcs__cst_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstAddDate;
    @XmlElementRef(name = "bcs__cst_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstAddUser;
    @XmlElementRef(name = "bcs__cst_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstChangeDate;
    @XmlElementRef(name = "bcs__cst_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstChangeUser;
    @XmlElementRef(name = "bcs__cst_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcsCstDeleteFlag;
    @XmlElementRef(name = "bcs__cst_recno", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> bcsCstRecno;
    @XmlElementRef(name = "bcs__cst_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstId;
    @XmlElementRef(name = "bcs__cst_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstKeyExt;
    @XmlElementRef(name = "bcs__cst_email_text_only", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcsCstEmailTextOnly;
    @XmlElementRef(name = "bcs__cst_credit_limit", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> bcsCstCreditLimit;
    @XmlElementRef(name = "bcs__cst_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstSrcKey;
    @XmlElementRef(name = "bcs__cst_src_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstSrcCode;
    @XmlElementRef(name = "bcs__cst_tax_exempt_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcsCstTaxExemptFlag;
    @XmlElementRef(name = "bcs__cst_tax_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstTaxId;
    @XmlElementRef(name = "bcs__cst_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstCxaKey;
    @XmlElementRef(name = "bcs__cst_no_email_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcsCstNoEmailFlag;
    @XmlElementRef(name = "bcs__cst_cxa_billing_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstCxaBillingKey;
    @XmlElementRef(name = "bcs__cst_eml_address_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstEmlAddressDn;
    @XmlElementRef(name = "bcs__cst_eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstEmlKey;
    @XmlElementRef(name = "bcs__cst_no_phone_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcsCstNoPhoneFlag;
    @XmlElementRef(name = "bcs__cst_phn_number_complete_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstPhnNumberCompleteDn;
    @XmlElementRef(name = "bcs__cst_cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstCphKey;
    @XmlElementRef(name = "bcs__cst_no_fax_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcsCstNoFaxFlag;
    @XmlElementRef(name = "bcs__cst_fax_number_complete_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstFaxNumberCompleteDn;
    @XmlElementRef(name = "bcs__cst_cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstCfxKey;
    @XmlElementRef(name = "bcs__cst_ixo_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstIxoKey;
    @XmlElementRef(name = "bcs__cst_no_web_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcsCstNoWebFlag;
    @XmlElementRef(name = "bcs__cst_oldid", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstOldid;
    @XmlElementRef(name = "bcs__cst_member_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcsCstMemberFlag;
    @XmlElementRef(name = "bcs__cst_url_code_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstUrlCodeDn;
    @XmlElementRef(name = "bcs__cst_parent_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstParentCstKey;
    @XmlElementRef(name = "bcs__cst_url_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstUrlKey;
    @XmlElementRef(name = "bcs__cst_no_msg_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcsCstNoMsgFlag;
    @XmlElementRef(name = "bcs__cst_msg_handle_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstMsgHandleDn;
    @XmlElementRef(name = "bcs__cst_web_login", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstWebLogin;
    @XmlElementRef(name = "bcs__cst_web_password", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstWebPassword;
    @XmlElementRef(name = "bcs__cst_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstEntityKey;
    @XmlElementRef(name = "bcs__cst_msg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstMsgKey;
    @XmlElementRef(name = "bcs__cst_no_mail_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcsCstNoMailFlag;
    @XmlElementRef(name = "bcs__cst_web_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstWebStartDate;
    @XmlElementRef(name = "bcs__cst_web_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstWebEndDate;
    @XmlElementRef(name = "bcs__cst_web_force_password_change", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcsCstWebForcePasswordChange;
    @XmlElementRef(name = "bcs__cst_web_login_disabled_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcsCstWebLoginDisabledFlag;
    @XmlElementRef(name = "bcs__cst_comment", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstComment;
    @XmlElementRef(name = "bcs__cst_credit_hold_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcsCstCreditHoldFlag;
    @XmlElementRef(name = "bcs__cst_credit_hold_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstCreditHoldReason;
    @XmlElementRef(name = "bcs__cst_web_forgot_password_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcsCstWebForgotPasswordStatus;
    @XmlElementRef(name = "bcs__cst_old_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstOldCxaKey;
    @XmlElementRef(name = "bcs__cst_last_email_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstLastEmailDate;
    @XmlElementRef(name = "bcs__cst_no_publish_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcsCstNoPublishFlag;
    @XmlElementRef(name = "bcs__cst_sin_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstSinKey;
    @XmlElementRef(name = "bcs__cst_ttl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstTtlKey;
    @XmlElementRef(name = "bcs__cst_jfn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstJfnKey;
    @XmlElementRef(name = "bcs__cst_cur_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstCurKey;
    @XmlElementRef(name = "bcs__cst_attribute_1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstAttribute1;
    @XmlElementRef(name = "bcs__cst_attribute_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstAttribute2;
    @XmlElementRef(name = "bcs__cst_do_not_include_directory_ext_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcsCstDoNotIncludeDirectoryExtFlag;
    @XmlElementRef(name = "bcs__cst_salutation_1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstSalutation1;
    @XmlElementRef(name = "bcs__cst_source_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstSourceExt;
    @XmlElementRef(name = "bcs__cst_salutation_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstSalutation2;
    @XmlElementRef(name = "bcs__cst_grace_period_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> bcsCstGracePeriodExt;
    @XmlElementRef(name = "bcs__cst_merge_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstMergeCstKey;
    @XmlElementRef(name = "bcs__cst_salutation_3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstSalutation3;
    @XmlElementRef(name = "bcs__cst_salutation_4", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstSalutation4;
    @XmlElementRef(name = "bcs__cst_default_recognize_as", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstDefaultRecognizeAs;
    @XmlElementRef(name = "bcs__cst_score", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> bcsCstScore;
    @XmlElementRef(name = "bcs__cst_score_normalized", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> bcsCstScoreNormalized;
    @XmlElementRef(name = "bcs__cst_score_trend", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> bcsCstScoreTrend;
    @XmlElementRef(name = "bcs__cst_vault_account", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstVaultAccount;
    @XmlElementRef(name = "bcs__cst_exclude_from_social_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bcsCstExcludeFromSocialFlag;
    @XmlElementRef(name = "bcs__cst_social_score", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> bcsCstSocialScore;
    @XmlElementRef(name = "bcs__cst_ptin", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstPtin;
    @XmlElementRef(name = "bcs__cst_aicpa_member_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> bcsCstAicpaMemberId;
    @XmlElementRef(name = "bcs__cst_vendor_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstVendorCode;
    @XmlElementRef(name = "bcs__cst_sca_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bcsCstScaKey;

    /**
     * Gets the value of the bcsCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstKey() {
        return bcsCstKey;
    }

    /**
     * Sets the value of the bcsCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstKey(JAXBElement<String> value) {
        this.bcsCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstType() {
        return bcsCstType;
    }

    /**
     * Sets the value of the bcsCstType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstType(JAXBElement<String> value) {
        this.bcsCstType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstNameCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstNameCp() {
        return bcsCstNameCp;
    }

    /**
     * Sets the value of the bcsCstNameCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstNameCp(JAXBElement<String> value) {
        this.bcsCstNameCp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstSortNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstSortNameDn() {
        return bcsCstSortNameDn;
    }

    /**
     * Sets the value of the bcsCstSortNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstSortNameDn(JAXBElement<String> value) {
        this.bcsCstSortNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstIndFullNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstIndFullNameDn() {
        return bcsCstIndFullNameDn;
    }

    /**
     * Sets the value of the bcsCstIndFullNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstIndFullNameDn(JAXBElement<String> value) {
        this.bcsCstIndFullNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstOrgNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstOrgNameDn() {
        return bcsCstOrgNameDn;
    }

    /**
     * Sets the value of the bcsCstOrgNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstOrgNameDn(JAXBElement<String> value) {
        this.bcsCstOrgNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstIxoTitleDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstIxoTitleDn() {
        return bcsCstIxoTitleDn;
    }

    /**
     * Sets the value of the bcsCstIxoTitleDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstIxoTitleDn(JAXBElement<String> value) {
        this.bcsCstIxoTitleDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstPrefCommMeth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstPrefCommMeth() {
        return bcsCstPrefCommMeth;
    }

    /**
     * Sets the value of the bcsCstPrefCommMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstPrefCommMeth(JAXBElement<String> value) {
        this.bcsCstPrefCommMeth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstBio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstBio() {
        return bcsCstBio;
    }

    /**
     * Sets the value of the bcsCstBio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstBio(JAXBElement<String> value) {
        this.bcsCstBio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstAddDate() {
        return bcsCstAddDate;
    }

    /**
     * Sets the value of the bcsCstAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstAddDate(JAXBElement<String> value) {
        this.bcsCstAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstAddUser() {
        return bcsCstAddUser;
    }

    /**
     * Sets the value of the bcsCstAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstAddUser(JAXBElement<String> value) {
        this.bcsCstAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstChangeDate() {
        return bcsCstChangeDate;
    }

    /**
     * Sets the value of the bcsCstChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstChangeDate(JAXBElement<String> value) {
        this.bcsCstChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstChangeUser() {
        return bcsCstChangeUser;
    }

    /**
     * Sets the value of the bcsCstChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstChangeUser(JAXBElement<String> value) {
        this.bcsCstChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcsCstDeleteFlag() {
        return bcsCstDeleteFlag;
    }

    /**
     * Sets the value of the bcsCstDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcsCstDeleteFlag(JAXBElement<Short> value) {
        this.bcsCstDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcsCstRecno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBcsCstRecno() {
        return bcsCstRecno;
    }

    /**
     * Sets the value of the bcsCstRecno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBcsCstRecno(JAXBElement<Long> value) {
        this.bcsCstRecno = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the bcsCstId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstId() {
        return bcsCstId;
    }

    /**
     * Sets the value of the bcsCstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstId(JAXBElement<String> value) {
        this.bcsCstId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstKeyExt() {
        return bcsCstKeyExt;
    }

    /**
     * Sets the value of the bcsCstKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstKeyExt(JAXBElement<String> value) {
        this.bcsCstKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstEmailTextOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcsCstEmailTextOnly() {
        return bcsCstEmailTextOnly;
    }

    /**
     * Sets the value of the bcsCstEmailTextOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcsCstEmailTextOnly(JAXBElement<Short> value) {
        this.bcsCstEmailTextOnly = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcsCstCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBcsCstCreditLimit() {
        return bcsCstCreditLimit;
    }

    /**
     * Sets the value of the bcsCstCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBcsCstCreditLimit(JAXBElement<BigDecimal> value) {
        this.bcsCstCreditLimit = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the bcsCstSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstSrcKey() {
        return bcsCstSrcKey;
    }

    /**
     * Sets the value of the bcsCstSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstSrcKey(JAXBElement<String> value) {
        this.bcsCstSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstSrcCode() {
        return bcsCstSrcCode;
    }

    /**
     * Sets the value of the bcsCstSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstSrcCode(JAXBElement<String> value) {
        this.bcsCstSrcCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstTaxExemptFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcsCstTaxExemptFlag() {
        return bcsCstTaxExemptFlag;
    }

    /**
     * Sets the value of the bcsCstTaxExemptFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcsCstTaxExemptFlag(JAXBElement<Short> value) {
        this.bcsCstTaxExemptFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcsCstTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstTaxId() {
        return bcsCstTaxId;
    }

    /**
     * Sets the value of the bcsCstTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstTaxId(JAXBElement<String> value) {
        this.bcsCstTaxId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstCxaKey() {
        return bcsCstCxaKey;
    }

    /**
     * Sets the value of the bcsCstCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstCxaKey(JAXBElement<String> value) {
        this.bcsCstCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstNoEmailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcsCstNoEmailFlag() {
        return bcsCstNoEmailFlag;
    }

    /**
     * Sets the value of the bcsCstNoEmailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcsCstNoEmailFlag(JAXBElement<Short> value) {
        this.bcsCstNoEmailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcsCstCxaBillingKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstCxaBillingKey() {
        return bcsCstCxaBillingKey;
    }

    /**
     * Sets the value of the bcsCstCxaBillingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstCxaBillingKey(JAXBElement<String> value) {
        this.bcsCstCxaBillingKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstEmlAddressDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstEmlAddressDn() {
        return bcsCstEmlAddressDn;
    }

    /**
     * Sets the value of the bcsCstEmlAddressDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstEmlAddressDn(JAXBElement<String> value) {
        this.bcsCstEmlAddressDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstEmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstEmlKey() {
        return bcsCstEmlKey;
    }

    /**
     * Sets the value of the bcsCstEmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstEmlKey(JAXBElement<String> value) {
        this.bcsCstEmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstNoPhoneFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcsCstNoPhoneFlag() {
        return bcsCstNoPhoneFlag;
    }

    /**
     * Sets the value of the bcsCstNoPhoneFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcsCstNoPhoneFlag(JAXBElement<Short> value) {
        this.bcsCstNoPhoneFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcsCstPhnNumberCompleteDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstPhnNumberCompleteDn() {
        return bcsCstPhnNumberCompleteDn;
    }

    /**
     * Sets the value of the bcsCstPhnNumberCompleteDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstPhnNumberCompleteDn(JAXBElement<String> value) {
        this.bcsCstPhnNumberCompleteDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstCphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstCphKey() {
        return bcsCstCphKey;
    }

    /**
     * Sets the value of the bcsCstCphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstCphKey(JAXBElement<String> value) {
        this.bcsCstCphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstNoFaxFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcsCstNoFaxFlag() {
        return bcsCstNoFaxFlag;
    }

    /**
     * Sets the value of the bcsCstNoFaxFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcsCstNoFaxFlag(JAXBElement<Short> value) {
        this.bcsCstNoFaxFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcsCstFaxNumberCompleteDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstFaxNumberCompleteDn() {
        return bcsCstFaxNumberCompleteDn;
    }

    /**
     * Sets the value of the bcsCstFaxNumberCompleteDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstFaxNumberCompleteDn(JAXBElement<String> value) {
        this.bcsCstFaxNumberCompleteDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstCfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstCfxKey() {
        return bcsCstCfxKey;
    }

    /**
     * Sets the value of the bcsCstCfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstCfxKey(JAXBElement<String> value) {
        this.bcsCstCfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstIxoKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstIxoKey() {
        return bcsCstIxoKey;
    }

    /**
     * Sets the value of the bcsCstIxoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstIxoKey(JAXBElement<String> value) {
        this.bcsCstIxoKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstNoWebFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcsCstNoWebFlag() {
        return bcsCstNoWebFlag;
    }

    /**
     * Sets the value of the bcsCstNoWebFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcsCstNoWebFlag(JAXBElement<Short> value) {
        this.bcsCstNoWebFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcsCstOldid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstOldid() {
        return bcsCstOldid;
    }

    /**
     * Sets the value of the bcsCstOldid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstOldid(JAXBElement<String> value) {
        this.bcsCstOldid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstMemberFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcsCstMemberFlag() {
        return bcsCstMemberFlag;
    }

    /**
     * Sets the value of the bcsCstMemberFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcsCstMemberFlag(JAXBElement<Short> value) {
        this.bcsCstMemberFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcsCstUrlCodeDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstUrlCodeDn() {
        return bcsCstUrlCodeDn;
    }

    /**
     * Sets the value of the bcsCstUrlCodeDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstUrlCodeDn(JAXBElement<String> value) {
        this.bcsCstUrlCodeDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstParentCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstParentCstKey() {
        return bcsCstParentCstKey;
    }

    /**
     * Sets the value of the bcsCstParentCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstParentCstKey(JAXBElement<String> value) {
        this.bcsCstParentCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstUrlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstUrlKey() {
        return bcsCstUrlKey;
    }

    /**
     * Sets the value of the bcsCstUrlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstUrlKey(JAXBElement<String> value) {
        this.bcsCstUrlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstNoMsgFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcsCstNoMsgFlag() {
        return bcsCstNoMsgFlag;
    }

    /**
     * Sets the value of the bcsCstNoMsgFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcsCstNoMsgFlag(JAXBElement<Short> value) {
        this.bcsCstNoMsgFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcsCstMsgHandleDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstMsgHandleDn() {
        return bcsCstMsgHandleDn;
    }

    /**
     * Sets the value of the bcsCstMsgHandleDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstMsgHandleDn(JAXBElement<String> value) {
        this.bcsCstMsgHandleDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstWebLogin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstWebLogin() {
        return bcsCstWebLogin;
    }

    /**
     * Sets the value of the bcsCstWebLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstWebLogin(JAXBElement<String> value) {
        this.bcsCstWebLogin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstWebPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstWebPassword() {
        return bcsCstWebPassword;
    }

    /**
     * Sets the value of the bcsCstWebPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstWebPassword(JAXBElement<String> value) {
        this.bcsCstWebPassword = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstEntityKey() {
        return bcsCstEntityKey;
    }

    /**
     * Sets the value of the bcsCstEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstEntityKey(JAXBElement<String> value) {
        this.bcsCstEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstMsgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstMsgKey() {
        return bcsCstMsgKey;
    }

    /**
     * Sets the value of the bcsCstMsgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstMsgKey(JAXBElement<String> value) {
        this.bcsCstMsgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstNoMailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcsCstNoMailFlag() {
        return bcsCstNoMailFlag;
    }

    /**
     * Sets the value of the bcsCstNoMailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcsCstNoMailFlag(JAXBElement<Short> value) {
        this.bcsCstNoMailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcsCstWebStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstWebStartDate() {
        return bcsCstWebStartDate;
    }

    /**
     * Sets the value of the bcsCstWebStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstWebStartDate(JAXBElement<String> value) {
        this.bcsCstWebStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstWebEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstWebEndDate() {
        return bcsCstWebEndDate;
    }

    /**
     * Sets the value of the bcsCstWebEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstWebEndDate(JAXBElement<String> value) {
        this.bcsCstWebEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstWebForcePasswordChange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcsCstWebForcePasswordChange() {
        return bcsCstWebForcePasswordChange;
    }

    /**
     * Sets the value of the bcsCstWebForcePasswordChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcsCstWebForcePasswordChange(JAXBElement<Short> value) {
        this.bcsCstWebForcePasswordChange = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcsCstWebLoginDisabledFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcsCstWebLoginDisabledFlag() {
        return bcsCstWebLoginDisabledFlag;
    }

    /**
     * Sets the value of the bcsCstWebLoginDisabledFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcsCstWebLoginDisabledFlag(JAXBElement<Short> value) {
        this.bcsCstWebLoginDisabledFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcsCstComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstComment() {
        return bcsCstComment;
    }

    /**
     * Sets the value of the bcsCstComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstComment(JAXBElement<String> value) {
        this.bcsCstComment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstCreditHoldFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcsCstCreditHoldFlag() {
        return bcsCstCreditHoldFlag;
    }

    /**
     * Sets the value of the bcsCstCreditHoldFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcsCstCreditHoldFlag(JAXBElement<Short> value) {
        this.bcsCstCreditHoldFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcsCstCreditHoldReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstCreditHoldReason() {
        return bcsCstCreditHoldReason;
    }

    /**
     * Sets the value of the bcsCstCreditHoldReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstCreditHoldReason(JAXBElement<String> value) {
        this.bcsCstCreditHoldReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstWebForgotPasswordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcsCstWebForgotPasswordStatus() {
        return bcsCstWebForgotPasswordStatus;
    }

    /**
     * Sets the value of the bcsCstWebForgotPasswordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcsCstWebForgotPasswordStatus(JAXBElement<Short> value) {
        this.bcsCstWebForgotPasswordStatus = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcsCstOldCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstOldCxaKey() {
        return bcsCstOldCxaKey;
    }

    /**
     * Sets the value of the bcsCstOldCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstOldCxaKey(JAXBElement<String> value) {
        this.bcsCstOldCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstLastEmailDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstLastEmailDate() {
        return bcsCstLastEmailDate;
    }

    /**
     * Sets the value of the bcsCstLastEmailDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstLastEmailDate(JAXBElement<String> value) {
        this.bcsCstLastEmailDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstNoPublishFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcsCstNoPublishFlag() {
        return bcsCstNoPublishFlag;
    }

    /**
     * Sets the value of the bcsCstNoPublishFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcsCstNoPublishFlag(JAXBElement<Short> value) {
        this.bcsCstNoPublishFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcsCstSinKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstSinKey() {
        return bcsCstSinKey;
    }

    /**
     * Sets the value of the bcsCstSinKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstSinKey(JAXBElement<String> value) {
        this.bcsCstSinKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstTtlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstTtlKey() {
        return bcsCstTtlKey;
    }

    /**
     * Sets the value of the bcsCstTtlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstTtlKey(JAXBElement<String> value) {
        this.bcsCstTtlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstJfnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstJfnKey() {
        return bcsCstJfnKey;
    }

    /**
     * Sets the value of the bcsCstJfnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstJfnKey(JAXBElement<String> value) {
        this.bcsCstJfnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstCurKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstCurKey() {
        return bcsCstCurKey;
    }

    /**
     * Sets the value of the bcsCstCurKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstCurKey(JAXBElement<String> value) {
        this.bcsCstCurKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstAttribute1() {
        return bcsCstAttribute1;
    }

    /**
     * Sets the value of the bcsCstAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstAttribute1(JAXBElement<String> value) {
        this.bcsCstAttribute1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstAttribute2() {
        return bcsCstAttribute2;
    }

    /**
     * Sets the value of the bcsCstAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstAttribute2(JAXBElement<String> value) {
        this.bcsCstAttribute2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstDoNotIncludeDirectoryExtFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcsCstDoNotIncludeDirectoryExtFlag() {
        return bcsCstDoNotIncludeDirectoryExtFlag;
    }

    /**
     * Sets the value of the bcsCstDoNotIncludeDirectoryExtFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcsCstDoNotIncludeDirectoryExtFlag(JAXBElement<Short> value) {
        this.bcsCstDoNotIncludeDirectoryExtFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcsCstSalutation1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstSalutation1() {
        return bcsCstSalutation1;
    }

    /**
     * Sets the value of the bcsCstSalutation1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstSalutation1(JAXBElement<String> value) {
        this.bcsCstSalutation1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstSourceExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstSourceExt() {
        return bcsCstSourceExt;
    }

    /**
     * Sets the value of the bcsCstSourceExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstSourceExt(JAXBElement<String> value) {
        this.bcsCstSourceExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstSalutation2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstSalutation2() {
        return bcsCstSalutation2;
    }

    /**
     * Sets the value of the bcsCstSalutation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstSalutation2(JAXBElement<String> value) {
        this.bcsCstSalutation2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstGracePeriodExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBcsCstGracePeriodExt() {
        return bcsCstGracePeriodExt;
    }

    /**
     * Sets the value of the bcsCstGracePeriodExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBcsCstGracePeriodExt(JAXBElement<Integer> value) {
        this.bcsCstGracePeriodExt = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bcsCstMergeCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstMergeCstKey() {
        return bcsCstMergeCstKey;
    }

    /**
     * Sets the value of the bcsCstMergeCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstMergeCstKey(JAXBElement<String> value) {
        this.bcsCstMergeCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstSalutation3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstSalutation3() {
        return bcsCstSalutation3;
    }

    /**
     * Sets the value of the bcsCstSalutation3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstSalutation3(JAXBElement<String> value) {
        this.bcsCstSalutation3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstSalutation4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstSalutation4() {
        return bcsCstSalutation4;
    }

    /**
     * Sets the value of the bcsCstSalutation4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstSalutation4(JAXBElement<String> value) {
        this.bcsCstSalutation4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstDefaultRecognizeAs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstDefaultRecognizeAs() {
        return bcsCstDefaultRecognizeAs;
    }

    /**
     * Sets the value of the bcsCstDefaultRecognizeAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstDefaultRecognizeAs(JAXBElement<String> value) {
        this.bcsCstDefaultRecognizeAs = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBcsCstScore() {
        return bcsCstScore;
    }

    /**
     * Sets the value of the bcsCstScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBcsCstScore(JAXBElement<BigDecimal> value) {
        this.bcsCstScore = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the bcsCstScoreNormalized property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBcsCstScoreNormalized() {
        return bcsCstScoreNormalized;
    }

    /**
     * Sets the value of the bcsCstScoreNormalized property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBcsCstScoreNormalized(JAXBElement<Integer> value) {
        this.bcsCstScoreNormalized = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bcsCstScoreTrend property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBcsCstScoreTrend() {
        return bcsCstScoreTrend;
    }

    /**
     * Sets the value of the bcsCstScoreTrend property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBcsCstScoreTrend(JAXBElement<Integer> value) {
        this.bcsCstScoreTrend = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bcsCstVaultAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstVaultAccount() {
        return bcsCstVaultAccount;
    }

    /**
     * Sets the value of the bcsCstVaultAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstVaultAccount(JAXBElement<String> value) {
        this.bcsCstVaultAccount = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstExcludeFromSocialFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBcsCstExcludeFromSocialFlag() {
        return bcsCstExcludeFromSocialFlag;
    }

    /**
     * Sets the value of the bcsCstExcludeFromSocialFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBcsCstExcludeFromSocialFlag(JAXBElement<Short> value) {
        this.bcsCstExcludeFromSocialFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bcsCstSocialScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBcsCstSocialScore() {
        return bcsCstSocialScore;
    }

    /**
     * Sets the value of the bcsCstSocialScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBcsCstSocialScore(JAXBElement<Integer> value) {
        this.bcsCstSocialScore = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bcsCstPtin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstPtin() {
        return bcsCstPtin;
    }

    /**
     * Sets the value of the bcsCstPtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstPtin(JAXBElement<String> value) {
        this.bcsCstPtin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstAicpaMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBcsCstAicpaMemberId() {
        return bcsCstAicpaMemberId;
    }

    /**
     * Sets the value of the bcsCstAicpaMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBcsCstAicpaMemberId(JAXBElement<Long> value) {
        this.bcsCstAicpaMemberId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the bcsCstVendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstVendorCode() {
        return bcsCstVendorCode;
    }

    /**
     * Sets the value of the bcsCstVendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstVendorCode(JAXBElement<String> value) {
        this.bcsCstVendorCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bcsCstScaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBcsCstScaKey() {
        return bcsCstScaKey;
    }

    /**
     * Sets the value of the bcsCstScaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBcsCstScaKey(JAXBElement<String> value) {
        this.bcsCstScaKey = ((JAXBElement<String> ) value);
    }

}
