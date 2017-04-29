
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Tribute_Customer_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Tribute_Customer_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cs4__cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_type" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_name_cp" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_sort_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_ind_full_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_org_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_ixo_title_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_pref_comm_meth" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_bio" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_recno" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_id" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_email_text_only" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_credit_limit" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_src_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_tax_exempt_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_tax_id" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_no_email_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_cxa_billing_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_eml_address_dn" type="{http://www.avectra.com/2005/}av_email_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_no_phone_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_phn_number_complete_dn" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_no_fax_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_fax_number_complete_dn" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_ixo_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_no_web_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_oldid" type="{http://www.avectra.com/2005/}stringLength15_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_member_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_url_code_dn" type="{http://www.avectra.com/2005/}av_url_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_parent_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_url_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_no_msg_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_msg_handle_dn" type="{http://www.avectra.com/2005/}av_messaging_name_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_web_login" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_web_password" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_msg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_no_mail_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_web_start_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_web_end_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_web_force_password_change" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_web_login_disabled_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_comment" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_credit_hold_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_credit_hold_reason" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_web_forgot_password_status" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_old_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_last_email_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_no_publish_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_sin_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_ttl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_jfn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_cur_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_attribute_1" type="{http://www.avectra.com/2005/}stringLength510_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_attribute_2" type="{http://www.avectra.com/2005/}stringLength510_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_do_not_include_directory_ext_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_salutation_1" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_source_ext" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_salutation_2" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_grace_period_ext" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_merge_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_salutation_3" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_salutation_4" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_default_recognize_as" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_score" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_score_normalized" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_score_trend" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_vault_account" type="{http://www.avectra.com/2005/}stringLength25_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_exclude_from_social_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_social_score" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_ptin" type="{http://www.avectra.com/2005/}stringLength9_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_aicpa_member_id" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_vendor_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cs4__cst_sca_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Tribute_Customer_DataObjectType", propOrder = {
    "cs4CstKey",
    "cs4CstType",
    "cs4CstNameCp",
    "cs4CstSortNameDn",
    "cs4CstIndFullNameDn",
    "cs4CstOrgNameDn",
    "cs4CstIxoTitleDn",
    "cs4CstPrefCommMeth",
    "cs4CstBio",
    "cs4CstAddDate",
    "cs4CstAddUser",
    "cs4CstChangeDate",
    "cs4CstChangeUser",
    "cs4CstDeleteFlag",
    "cs4CstRecno",
    "cs4CstId",
    "cs4CstKeyExt",
    "cs4CstEmailTextOnly",
    "cs4CstCreditLimit",
    "cs4CstSrcKey",
    "cs4CstSrcCode",
    "cs4CstTaxExemptFlag",
    "cs4CstTaxId",
    "cs4CstCxaKey",
    "cs4CstNoEmailFlag",
    "cs4CstCxaBillingKey",
    "cs4CstEmlAddressDn",
    "cs4CstEmlKey",
    "cs4CstNoPhoneFlag",
    "cs4CstPhnNumberCompleteDn",
    "cs4CstCphKey",
    "cs4CstNoFaxFlag",
    "cs4CstFaxNumberCompleteDn",
    "cs4CstCfxKey",
    "cs4CstIxoKey",
    "cs4CstNoWebFlag",
    "cs4CstOldid",
    "cs4CstMemberFlag",
    "cs4CstUrlCodeDn",
    "cs4CstParentCstKey",
    "cs4CstUrlKey",
    "cs4CstNoMsgFlag",
    "cs4CstMsgHandleDn",
    "cs4CstWebLogin",
    "cs4CstWebPassword",
    "cs4CstEntityKey",
    "cs4CstMsgKey",
    "cs4CstNoMailFlag",
    "cs4CstWebStartDate",
    "cs4CstWebEndDate",
    "cs4CstWebForcePasswordChange",
    "cs4CstWebLoginDisabledFlag",
    "cs4CstComment",
    "cs4CstCreditHoldFlag",
    "cs4CstCreditHoldReason",
    "cs4CstWebForgotPasswordStatus",
    "cs4CstOldCxaKey",
    "cs4CstLastEmailDate",
    "cs4CstNoPublishFlag",
    "cs4CstSinKey",
    "cs4CstTtlKey",
    "cs4CstJfnKey",
    "cs4CstCurKey",
    "cs4CstAttribute1",
    "cs4CstAttribute2",
    "cs4CstDoNotIncludeDirectoryExtFlag",
    "cs4CstSalutation1",
    "cs4CstSourceExt",
    "cs4CstSalutation2",
    "cs4CstGracePeriodExt",
    "cs4CstMergeCstKey",
    "cs4CstSalutation3",
    "cs4CstSalutation4",
    "cs4CstDefaultRecognizeAs",
    "cs4CstScore",
    "cs4CstScoreNormalized",
    "cs4CstScoreTrend",
    "cs4CstVaultAccount",
    "cs4CstExcludeFromSocialFlag",
    "cs4CstSocialScore",
    "cs4CstPtin",
    "cs4CstAicpaMemberId",
    "cs4CstVendorCode",
    "cs4CstScaKey"
})
public class FundraisingGiftTributeCustomerDataObjectType {

    @XmlElementRef(name = "cs4__cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstKey;
    @XmlElementRef(name = "cs4__cst_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstType;
    @XmlElementRef(name = "cs4__cst_name_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstNameCp;
    @XmlElementRef(name = "cs4__cst_sort_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstSortNameDn;
    @XmlElementRef(name = "cs4__cst_ind_full_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstIndFullNameDn;
    @XmlElementRef(name = "cs4__cst_org_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstOrgNameDn;
    @XmlElementRef(name = "cs4__cst_ixo_title_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstIxoTitleDn;
    @XmlElementRef(name = "cs4__cst_pref_comm_meth", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstPrefCommMeth;
    @XmlElementRef(name = "cs4__cst_bio", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstBio;
    @XmlElementRef(name = "cs4__cst_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstAddDate;
    @XmlElementRef(name = "cs4__cst_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstAddUser;
    @XmlElementRef(name = "cs4__cst_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstChangeDate;
    @XmlElementRef(name = "cs4__cst_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstChangeUser;
    @XmlElementRef(name = "cs4__cst_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs4CstDeleteFlag;
    @XmlElementRef(name = "cs4__cst_recno", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> cs4CstRecno;
    @XmlElementRef(name = "cs4__cst_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstId;
    @XmlElementRef(name = "cs4__cst_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstKeyExt;
    @XmlElementRef(name = "cs4__cst_email_text_only", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs4CstEmailTextOnly;
    @XmlElementRef(name = "cs4__cst_credit_limit", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> cs4CstCreditLimit;
    @XmlElementRef(name = "cs4__cst_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstSrcKey;
    @XmlElementRef(name = "cs4__cst_src_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstSrcCode;
    @XmlElementRef(name = "cs4__cst_tax_exempt_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs4CstTaxExemptFlag;
    @XmlElementRef(name = "cs4__cst_tax_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstTaxId;
    @XmlElementRef(name = "cs4__cst_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstCxaKey;
    @XmlElementRef(name = "cs4__cst_no_email_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs4CstNoEmailFlag;
    @XmlElementRef(name = "cs4__cst_cxa_billing_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstCxaBillingKey;
    @XmlElementRef(name = "cs4__cst_eml_address_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstEmlAddressDn;
    @XmlElementRef(name = "cs4__cst_eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstEmlKey;
    @XmlElementRef(name = "cs4__cst_no_phone_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs4CstNoPhoneFlag;
    @XmlElementRef(name = "cs4__cst_phn_number_complete_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstPhnNumberCompleteDn;
    @XmlElementRef(name = "cs4__cst_cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstCphKey;
    @XmlElementRef(name = "cs4__cst_no_fax_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs4CstNoFaxFlag;
    @XmlElementRef(name = "cs4__cst_fax_number_complete_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstFaxNumberCompleteDn;
    @XmlElementRef(name = "cs4__cst_cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstCfxKey;
    @XmlElementRef(name = "cs4__cst_ixo_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstIxoKey;
    @XmlElementRef(name = "cs4__cst_no_web_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs4CstNoWebFlag;
    @XmlElementRef(name = "cs4__cst_oldid", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstOldid;
    @XmlElementRef(name = "cs4__cst_member_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs4CstMemberFlag;
    @XmlElementRef(name = "cs4__cst_url_code_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstUrlCodeDn;
    @XmlElementRef(name = "cs4__cst_parent_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstParentCstKey;
    @XmlElementRef(name = "cs4__cst_url_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstUrlKey;
    @XmlElementRef(name = "cs4__cst_no_msg_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs4CstNoMsgFlag;
    @XmlElementRef(name = "cs4__cst_msg_handle_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstMsgHandleDn;
    @XmlElementRef(name = "cs4__cst_web_login", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstWebLogin;
    @XmlElementRef(name = "cs4__cst_web_password", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstWebPassword;
    @XmlElementRef(name = "cs4__cst_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstEntityKey;
    @XmlElementRef(name = "cs4__cst_msg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstMsgKey;
    @XmlElementRef(name = "cs4__cst_no_mail_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs4CstNoMailFlag;
    @XmlElementRef(name = "cs4__cst_web_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstWebStartDate;
    @XmlElementRef(name = "cs4__cst_web_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstWebEndDate;
    @XmlElementRef(name = "cs4__cst_web_force_password_change", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs4CstWebForcePasswordChange;
    @XmlElementRef(name = "cs4__cst_web_login_disabled_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs4CstWebLoginDisabledFlag;
    @XmlElementRef(name = "cs4__cst_comment", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstComment;
    @XmlElementRef(name = "cs4__cst_credit_hold_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs4CstCreditHoldFlag;
    @XmlElementRef(name = "cs4__cst_credit_hold_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstCreditHoldReason;
    @XmlElementRef(name = "cs4__cst_web_forgot_password_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs4CstWebForgotPasswordStatus;
    @XmlElementRef(name = "cs4__cst_old_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstOldCxaKey;
    @XmlElementRef(name = "cs4__cst_last_email_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstLastEmailDate;
    @XmlElementRef(name = "cs4__cst_no_publish_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs4CstNoPublishFlag;
    @XmlElementRef(name = "cs4__cst_sin_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstSinKey;
    @XmlElementRef(name = "cs4__cst_ttl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstTtlKey;
    @XmlElementRef(name = "cs4__cst_jfn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstJfnKey;
    @XmlElementRef(name = "cs4__cst_cur_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstCurKey;
    @XmlElementRef(name = "cs4__cst_attribute_1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstAttribute1;
    @XmlElementRef(name = "cs4__cst_attribute_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstAttribute2;
    @XmlElementRef(name = "cs4__cst_do_not_include_directory_ext_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs4CstDoNotIncludeDirectoryExtFlag;
    @XmlElementRef(name = "cs4__cst_salutation_1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstSalutation1;
    @XmlElementRef(name = "cs4__cst_source_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstSourceExt;
    @XmlElementRef(name = "cs4__cst_salutation_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstSalutation2;
    @XmlElementRef(name = "cs4__cst_grace_period_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cs4CstGracePeriodExt;
    @XmlElementRef(name = "cs4__cst_merge_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstMergeCstKey;
    @XmlElementRef(name = "cs4__cst_salutation_3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstSalutation3;
    @XmlElementRef(name = "cs4__cst_salutation_4", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstSalutation4;
    @XmlElementRef(name = "cs4__cst_default_recognize_as", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstDefaultRecognizeAs;
    @XmlElementRef(name = "cs4__cst_score", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> cs4CstScore;
    @XmlElementRef(name = "cs4__cst_score_normalized", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cs4CstScoreNormalized;
    @XmlElementRef(name = "cs4__cst_score_trend", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cs4CstScoreTrend;
    @XmlElementRef(name = "cs4__cst_vault_account", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstVaultAccount;
    @XmlElementRef(name = "cs4__cst_exclude_from_social_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cs4CstExcludeFromSocialFlag;
    @XmlElementRef(name = "cs4__cst_social_score", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cs4CstSocialScore;
    @XmlElementRef(name = "cs4__cst_ptin", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstPtin;
    @XmlElementRef(name = "cs4__cst_aicpa_member_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> cs4CstAicpaMemberId;
    @XmlElementRef(name = "cs4__cst_vendor_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstVendorCode;
    @XmlElementRef(name = "cs4__cst_sca_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cs4CstScaKey;

    /**
     * Gets the value of the cs4CstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstKey() {
        return cs4CstKey;
    }

    /**
     * Sets the value of the cs4CstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstKey(JAXBElement<String> value) {
        this.cs4CstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstType() {
        return cs4CstType;
    }

    /**
     * Sets the value of the cs4CstType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstType(JAXBElement<String> value) {
        this.cs4CstType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstNameCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstNameCp() {
        return cs4CstNameCp;
    }

    /**
     * Sets the value of the cs4CstNameCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstNameCp(JAXBElement<String> value) {
        this.cs4CstNameCp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstSortNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstSortNameDn() {
        return cs4CstSortNameDn;
    }

    /**
     * Sets the value of the cs4CstSortNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstSortNameDn(JAXBElement<String> value) {
        this.cs4CstSortNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstIndFullNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstIndFullNameDn() {
        return cs4CstIndFullNameDn;
    }

    /**
     * Sets the value of the cs4CstIndFullNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstIndFullNameDn(JAXBElement<String> value) {
        this.cs4CstIndFullNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstOrgNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstOrgNameDn() {
        return cs4CstOrgNameDn;
    }

    /**
     * Sets the value of the cs4CstOrgNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstOrgNameDn(JAXBElement<String> value) {
        this.cs4CstOrgNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstIxoTitleDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstIxoTitleDn() {
        return cs4CstIxoTitleDn;
    }

    /**
     * Sets the value of the cs4CstIxoTitleDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstIxoTitleDn(JAXBElement<String> value) {
        this.cs4CstIxoTitleDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstPrefCommMeth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstPrefCommMeth() {
        return cs4CstPrefCommMeth;
    }

    /**
     * Sets the value of the cs4CstPrefCommMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstPrefCommMeth(JAXBElement<String> value) {
        this.cs4CstPrefCommMeth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstBio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstBio() {
        return cs4CstBio;
    }

    /**
     * Sets the value of the cs4CstBio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstBio(JAXBElement<String> value) {
        this.cs4CstBio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstAddDate() {
        return cs4CstAddDate;
    }

    /**
     * Sets the value of the cs4CstAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstAddDate(JAXBElement<String> value) {
        this.cs4CstAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstAddUser() {
        return cs4CstAddUser;
    }

    /**
     * Sets the value of the cs4CstAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstAddUser(JAXBElement<String> value) {
        this.cs4CstAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstChangeDate() {
        return cs4CstChangeDate;
    }

    /**
     * Sets the value of the cs4CstChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstChangeDate(JAXBElement<String> value) {
        this.cs4CstChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstChangeUser() {
        return cs4CstChangeUser;
    }

    /**
     * Sets the value of the cs4CstChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstChangeUser(JAXBElement<String> value) {
        this.cs4CstChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs4CstDeleteFlag() {
        return cs4CstDeleteFlag;
    }

    /**
     * Sets the value of the cs4CstDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs4CstDeleteFlag(JAXBElement<Short> value) {
        this.cs4CstDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs4CstRecno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCs4CstRecno() {
        return cs4CstRecno;
    }

    /**
     * Sets the value of the cs4CstRecno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCs4CstRecno(JAXBElement<Long> value) {
        this.cs4CstRecno = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the cs4CstId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstId() {
        return cs4CstId;
    }

    /**
     * Sets the value of the cs4CstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstId(JAXBElement<String> value) {
        this.cs4CstId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstKeyExt() {
        return cs4CstKeyExt;
    }

    /**
     * Sets the value of the cs4CstKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstKeyExt(JAXBElement<String> value) {
        this.cs4CstKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstEmailTextOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs4CstEmailTextOnly() {
        return cs4CstEmailTextOnly;
    }

    /**
     * Sets the value of the cs4CstEmailTextOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs4CstEmailTextOnly(JAXBElement<Short> value) {
        this.cs4CstEmailTextOnly = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs4CstCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCs4CstCreditLimit() {
        return cs4CstCreditLimit;
    }

    /**
     * Sets the value of the cs4CstCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCs4CstCreditLimit(JAXBElement<BigDecimal> value) {
        this.cs4CstCreditLimit = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the cs4CstSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstSrcKey() {
        return cs4CstSrcKey;
    }

    /**
     * Sets the value of the cs4CstSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstSrcKey(JAXBElement<String> value) {
        this.cs4CstSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstSrcCode() {
        return cs4CstSrcCode;
    }

    /**
     * Sets the value of the cs4CstSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstSrcCode(JAXBElement<String> value) {
        this.cs4CstSrcCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstTaxExemptFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs4CstTaxExemptFlag() {
        return cs4CstTaxExemptFlag;
    }

    /**
     * Sets the value of the cs4CstTaxExemptFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs4CstTaxExemptFlag(JAXBElement<Short> value) {
        this.cs4CstTaxExemptFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs4CstTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstTaxId() {
        return cs4CstTaxId;
    }

    /**
     * Sets the value of the cs4CstTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstTaxId(JAXBElement<String> value) {
        this.cs4CstTaxId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstCxaKey() {
        return cs4CstCxaKey;
    }

    /**
     * Sets the value of the cs4CstCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstCxaKey(JAXBElement<String> value) {
        this.cs4CstCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstNoEmailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs4CstNoEmailFlag() {
        return cs4CstNoEmailFlag;
    }

    /**
     * Sets the value of the cs4CstNoEmailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs4CstNoEmailFlag(JAXBElement<Short> value) {
        this.cs4CstNoEmailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs4CstCxaBillingKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstCxaBillingKey() {
        return cs4CstCxaBillingKey;
    }

    /**
     * Sets the value of the cs4CstCxaBillingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstCxaBillingKey(JAXBElement<String> value) {
        this.cs4CstCxaBillingKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstEmlAddressDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstEmlAddressDn() {
        return cs4CstEmlAddressDn;
    }

    /**
     * Sets the value of the cs4CstEmlAddressDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstEmlAddressDn(JAXBElement<String> value) {
        this.cs4CstEmlAddressDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstEmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstEmlKey() {
        return cs4CstEmlKey;
    }

    /**
     * Sets the value of the cs4CstEmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstEmlKey(JAXBElement<String> value) {
        this.cs4CstEmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstNoPhoneFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs4CstNoPhoneFlag() {
        return cs4CstNoPhoneFlag;
    }

    /**
     * Sets the value of the cs4CstNoPhoneFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs4CstNoPhoneFlag(JAXBElement<Short> value) {
        this.cs4CstNoPhoneFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs4CstPhnNumberCompleteDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstPhnNumberCompleteDn() {
        return cs4CstPhnNumberCompleteDn;
    }

    /**
     * Sets the value of the cs4CstPhnNumberCompleteDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstPhnNumberCompleteDn(JAXBElement<String> value) {
        this.cs4CstPhnNumberCompleteDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstCphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstCphKey() {
        return cs4CstCphKey;
    }

    /**
     * Sets the value of the cs4CstCphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstCphKey(JAXBElement<String> value) {
        this.cs4CstCphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstNoFaxFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs4CstNoFaxFlag() {
        return cs4CstNoFaxFlag;
    }

    /**
     * Sets the value of the cs4CstNoFaxFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs4CstNoFaxFlag(JAXBElement<Short> value) {
        this.cs4CstNoFaxFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs4CstFaxNumberCompleteDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstFaxNumberCompleteDn() {
        return cs4CstFaxNumberCompleteDn;
    }

    /**
     * Sets the value of the cs4CstFaxNumberCompleteDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstFaxNumberCompleteDn(JAXBElement<String> value) {
        this.cs4CstFaxNumberCompleteDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstCfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstCfxKey() {
        return cs4CstCfxKey;
    }

    /**
     * Sets the value of the cs4CstCfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstCfxKey(JAXBElement<String> value) {
        this.cs4CstCfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstIxoKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstIxoKey() {
        return cs4CstIxoKey;
    }

    /**
     * Sets the value of the cs4CstIxoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstIxoKey(JAXBElement<String> value) {
        this.cs4CstIxoKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstNoWebFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs4CstNoWebFlag() {
        return cs4CstNoWebFlag;
    }

    /**
     * Sets the value of the cs4CstNoWebFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs4CstNoWebFlag(JAXBElement<Short> value) {
        this.cs4CstNoWebFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs4CstOldid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstOldid() {
        return cs4CstOldid;
    }

    /**
     * Sets the value of the cs4CstOldid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstOldid(JAXBElement<String> value) {
        this.cs4CstOldid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstMemberFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs4CstMemberFlag() {
        return cs4CstMemberFlag;
    }

    /**
     * Sets the value of the cs4CstMemberFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs4CstMemberFlag(JAXBElement<Short> value) {
        this.cs4CstMemberFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs4CstUrlCodeDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstUrlCodeDn() {
        return cs4CstUrlCodeDn;
    }

    /**
     * Sets the value of the cs4CstUrlCodeDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstUrlCodeDn(JAXBElement<String> value) {
        this.cs4CstUrlCodeDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstParentCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstParentCstKey() {
        return cs4CstParentCstKey;
    }

    /**
     * Sets the value of the cs4CstParentCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstParentCstKey(JAXBElement<String> value) {
        this.cs4CstParentCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstUrlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstUrlKey() {
        return cs4CstUrlKey;
    }

    /**
     * Sets the value of the cs4CstUrlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstUrlKey(JAXBElement<String> value) {
        this.cs4CstUrlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstNoMsgFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs4CstNoMsgFlag() {
        return cs4CstNoMsgFlag;
    }

    /**
     * Sets the value of the cs4CstNoMsgFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs4CstNoMsgFlag(JAXBElement<Short> value) {
        this.cs4CstNoMsgFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs4CstMsgHandleDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstMsgHandleDn() {
        return cs4CstMsgHandleDn;
    }

    /**
     * Sets the value of the cs4CstMsgHandleDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstMsgHandleDn(JAXBElement<String> value) {
        this.cs4CstMsgHandleDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstWebLogin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstWebLogin() {
        return cs4CstWebLogin;
    }

    /**
     * Sets the value of the cs4CstWebLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstWebLogin(JAXBElement<String> value) {
        this.cs4CstWebLogin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstWebPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstWebPassword() {
        return cs4CstWebPassword;
    }

    /**
     * Sets the value of the cs4CstWebPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstWebPassword(JAXBElement<String> value) {
        this.cs4CstWebPassword = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstEntityKey() {
        return cs4CstEntityKey;
    }

    /**
     * Sets the value of the cs4CstEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstEntityKey(JAXBElement<String> value) {
        this.cs4CstEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstMsgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstMsgKey() {
        return cs4CstMsgKey;
    }

    /**
     * Sets the value of the cs4CstMsgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstMsgKey(JAXBElement<String> value) {
        this.cs4CstMsgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstNoMailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs4CstNoMailFlag() {
        return cs4CstNoMailFlag;
    }

    /**
     * Sets the value of the cs4CstNoMailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs4CstNoMailFlag(JAXBElement<Short> value) {
        this.cs4CstNoMailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs4CstWebStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstWebStartDate() {
        return cs4CstWebStartDate;
    }

    /**
     * Sets the value of the cs4CstWebStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstWebStartDate(JAXBElement<String> value) {
        this.cs4CstWebStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstWebEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstWebEndDate() {
        return cs4CstWebEndDate;
    }

    /**
     * Sets the value of the cs4CstWebEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstWebEndDate(JAXBElement<String> value) {
        this.cs4CstWebEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstWebForcePasswordChange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs4CstWebForcePasswordChange() {
        return cs4CstWebForcePasswordChange;
    }

    /**
     * Sets the value of the cs4CstWebForcePasswordChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs4CstWebForcePasswordChange(JAXBElement<Short> value) {
        this.cs4CstWebForcePasswordChange = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs4CstWebLoginDisabledFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs4CstWebLoginDisabledFlag() {
        return cs4CstWebLoginDisabledFlag;
    }

    /**
     * Sets the value of the cs4CstWebLoginDisabledFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs4CstWebLoginDisabledFlag(JAXBElement<Short> value) {
        this.cs4CstWebLoginDisabledFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs4CstComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstComment() {
        return cs4CstComment;
    }

    /**
     * Sets the value of the cs4CstComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstComment(JAXBElement<String> value) {
        this.cs4CstComment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstCreditHoldFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs4CstCreditHoldFlag() {
        return cs4CstCreditHoldFlag;
    }

    /**
     * Sets the value of the cs4CstCreditHoldFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs4CstCreditHoldFlag(JAXBElement<Short> value) {
        this.cs4CstCreditHoldFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs4CstCreditHoldReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstCreditHoldReason() {
        return cs4CstCreditHoldReason;
    }

    /**
     * Sets the value of the cs4CstCreditHoldReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstCreditHoldReason(JAXBElement<String> value) {
        this.cs4CstCreditHoldReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstWebForgotPasswordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs4CstWebForgotPasswordStatus() {
        return cs4CstWebForgotPasswordStatus;
    }

    /**
     * Sets the value of the cs4CstWebForgotPasswordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs4CstWebForgotPasswordStatus(JAXBElement<Short> value) {
        this.cs4CstWebForgotPasswordStatus = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs4CstOldCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstOldCxaKey() {
        return cs4CstOldCxaKey;
    }

    /**
     * Sets the value of the cs4CstOldCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstOldCxaKey(JAXBElement<String> value) {
        this.cs4CstOldCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstLastEmailDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstLastEmailDate() {
        return cs4CstLastEmailDate;
    }

    /**
     * Sets the value of the cs4CstLastEmailDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstLastEmailDate(JAXBElement<String> value) {
        this.cs4CstLastEmailDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstNoPublishFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs4CstNoPublishFlag() {
        return cs4CstNoPublishFlag;
    }

    /**
     * Sets the value of the cs4CstNoPublishFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs4CstNoPublishFlag(JAXBElement<Short> value) {
        this.cs4CstNoPublishFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs4CstSinKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstSinKey() {
        return cs4CstSinKey;
    }

    /**
     * Sets the value of the cs4CstSinKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstSinKey(JAXBElement<String> value) {
        this.cs4CstSinKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstTtlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstTtlKey() {
        return cs4CstTtlKey;
    }

    /**
     * Sets the value of the cs4CstTtlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstTtlKey(JAXBElement<String> value) {
        this.cs4CstTtlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstJfnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstJfnKey() {
        return cs4CstJfnKey;
    }

    /**
     * Sets the value of the cs4CstJfnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstJfnKey(JAXBElement<String> value) {
        this.cs4CstJfnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstCurKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstCurKey() {
        return cs4CstCurKey;
    }

    /**
     * Sets the value of the cs4CstCurKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstCurKey(JAXBElement<String> value) {
        this.cs4CstCurKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstAttribute1() {
        return cs4CstAttribute1;
    }

    /**
     * Sets the value of the cs4CstAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstAttribute1(JAXBElement<String> value) {
        this.cs4CstAttribute1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstAttribute2() {
        return cs4CstAttribute2;
    }

    /**
     * Sets the value of the cs4CstAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstAttribute2(JAXBElement<String> value) {
        this.cs4CstAttribute2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstDoNotIncludeDirectoryExtFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs4CstDoNotIncludeDirectoryExtFlag() {
        return cs4CstDoNotIncludeDirectoryExtFlag;
    }

    /**
     * Sets the value of the cs4CstDoNotIncludeDirectoryExtFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs4CstDoNotIncludeDirectoryExtFlag(JAXBElement<Short> value) {
        this.cs4CstDoNotIncludeDirectoryExtFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs4CstSalutation1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstSalutation1() {
        return cs4CstSalutation1;
    }

    /**
     * Sets the value of the cs4CstSalutation1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstSalutation1(JAXBElement<String> value) {
        this.cs4CstSalutation1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstSourceExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstSourceExt() {
        return cs4CstSourceExt;
    }

    /**
     * Sets the value of the cs4CstSourceExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstSourceExt(JAXBElement<String> value) {
        this.cs4CstSourceExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstSalutation2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstSalutation2() {
        return cs4CstSalutation2;
    }

    /**
     * Sets the value of the cs4CstSalutation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstSalutation2(JAXBElement<String> value) {
        this.cs4CstSalutation2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstGracePeriodExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCs4CstGracePeriodExt() {
        return cs4CstGracePeriodExt;
    }

    /**
     * Sets the value of the cs4CstGracePeriodExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCs4CstGracePeriodExt(JAXBElement<Integer> value) {
        this.cs4CstGracePeriodExt = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cs4CstMergeCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstMergeCstKey() {
        return cs4CstMergeCstKey;
    }

    /**
     * Sets the value of the cs4CstMergeCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstMergeCstKey(JAXBElement<String> value) {
        this.cs4CstMergeCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstSalutation3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstSalutation3() {
        return cs4CstSalutation3;
    }

    /**
     * Sets the value of the cs4CstSalutation3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstSalutation3(JAXBElement<String> value) {
        this.cs4CstSalutation3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstSalutation4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstSalutation4() {
        return cs4CstSalutation4;
    }

    /**
     * Sets the value of the cs4CstSalutation4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstSalutation4(JAXBElement<String> value) {
        this.cs4CstSalutation4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstDefaultRecognizeAs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstDefaultRecognizeAs() {
        return cs4CstDefaultRecognizeAs;
    }

    /**
     * Sets the value of the cs4CstDefaultRecognizeAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstDefaultRecognizeAs(JAXBElement<String> value) {
        this.cs4CstDefaultRecognizeAs = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCs4CstScore() {
        return cs4CstScore;
    }

    /**
     * Sets the value of the cs4CstScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCs4CstScore(JAXBElement<BigDecimal> value) {
        this.cs4CstScore = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the cs4CstScoreNormalized property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCs4CstScoreNormalized() {
        return cs4CstScoreNormalized;
    }

    /**
     * Sets the value of the cs4CstScoreNormalized property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCs4CstScoreNormalized(JAXBElement<Integer> value) {
        this.cs4CstScoreNormalized = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cs4CstScoreTrend property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCs4CstScoreTrend() {
        return cs4CstScoreTrend;
    }

    /**
     * Sets the value of the cs4CstScoreTrend property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCs4CstScoreTrend(JAXBElement<Integer> value) {
        this.cs4CstScoreTrend = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cs4CstVaultAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstVaultAccount() {
        return cs4CstVaultAccount;
    }

    /**
     * Sets the value of the cs4CstVaultAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstVaultAccount(JAXBElement<String> value) {
        this.cs4CstVaultAccount = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstExcludeFromSocialFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCs4CstExcludeFromSocialFlag() {
        return cs4CstExcludeFromSocialFlag;
    }

    /**
     * Sets the value of the cs4CstExcludeFromSocialFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCs4CstExcludeFromSocialFlag(JAXBElement<Short> value) {
        this.cs4CstExcludeFromSocialFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cs4CstSocialScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCs4CstSocialScore() {
        return cs4CstSocialScore;
    }

    /**
     * Sets the value of the cs4CstSocialScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCs4CstSocialScore(JAXBElement<Integer> value) {
        this.cs4CstSocialScore = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cs4CstPtin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstPtin() {
        return cs4CstPtin;
    }

    /**
     * Sets the value of the cs4CstPtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstPtin(JAXBElement<String> value) {
        this.cs4CstPtin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstAicpaMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCs4CstAicpaMemberId() {
        return cs4CstAicpaMemberId;
    }

    /**
     * Sets the value of the cs4CstAicpaMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCs4CstAicpaMemberId(JAXBElement<Long> value) {
        this.cs4CstAicpaMemberId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the cs4CstVendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstVendorCode() {
        return cs4CstVendorCode;
    }

    /**
     * Sets the value of the cs4CstVendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstVendorCode(JAXBElement<String> value) {
        this.cs4CstVendorCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cs4CstScaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCs4CstScaKey() {
        return cs4CstScaKey;
    }

    /**
     * Sets the value of the cs4CstScaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCs4CstScaKey(JAXBElement<String> value) {
        this.cs4CstScaKey = ((JAXBElement<String> ) value);
    }

}
