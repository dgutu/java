
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExhibitorNew_Contact_Person_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExhibitorNew_Contact_Person_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="per__cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_type" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_name_cp" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_sort_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_ind_full_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_org_name_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_ixo_title_dn" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_pref_comm_meth" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_bio" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_recno" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_id" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_email_text_only" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_credit_limit" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_src_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_tax_exempt_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_tax_id" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_no_email_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_cxa_billing_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_eml_address_dn" type="{http://www.avectra.com/2005/}av_email_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_no_phone_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_phn_number_complete_dn" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_no_fax_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_fax_number_complete_dn" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_ixo_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_no_web_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_oldid" type="{http://www.avectra.com/2005/}stringLength15_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_member_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_url_code_dn" type="{http://www.avectra.com/2005/}av_url_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_parent_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_url_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_no_msg_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_msg_handle_dn" type="{http://www.avectra.com/2005/}av_messaging_name_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_web_login" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_web_password" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_msg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_no_mail_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_web_start_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_web_end_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_web_force_password_change" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_web_login_disabled_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_comment" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_credit_hold_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_credit_hold_reason" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_web_forgot_password_status" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_old_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_last_email_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_no_publish_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_sin_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_ttl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_jfn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_cur_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_attribute_1" type="{http://www.avectra.com/2005/}stringLength510_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_attribute_2" type="{http://www.avectra.com/2005/}stringLength510_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_do_not_include_directory_ext_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_salutation_1" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_source_ext" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_salutation_2" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_grace_period_ext" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_merge_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_salutation_3" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_salutation_4" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_default_recognize_as" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_score" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_score_normalized" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_score_trend" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_vault_account" type="{http://www.avectra.com/2005/}stringLength25_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_exclude_from_social_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_social_score" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_ptin" type="{http://www.avectra.com/2005/}stringLength9_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_aicpa_member_id" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_vendor_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="per__cst_sca_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExhibitorNew_Contact_Person_DataObjectType", propOrder = {
    "perCstKey",
    "perCstType",
    "perCstNameCp",
    "perCstSortNameDn",
    "perCstIndFullNameDn",
    "perCstOrgNameDn",
    "perCstIxoTitleDn",
    "perCstPrefCommMeth",
    "perCstBio",
    "perCstAddDate",
    "perCstAddUser",
    "perCstChangeDate",
    "perCstChangeUser",
    "perCstDeleteFlag",
    "perCstRecno",
    "perCstId",
    "perCstKeyExt",
    "perCstEmailTextOnly",
    "perCstCreditLimit",
    "perCstSrcKey",
    "perCstSrcCode",
    "perCstTaxExemptFlag",
    "perCstTaxId",
    "perCstCxaKey",
    "perCstNoEmailFlag",
    "perCstCxaBillingKey",
    "perCstEmlAddressDn",
    "perCstEmlKey",
    "perCstNoPhoneFlag",
    "perCstPhnNumberCompleteDn",
    "perCstCphKey",
    "perCstNoFaxFlag",
    "perCstFaxNumberCompleteDn",
    "perCstCfxKey",
    "perCstIxoKey",
    "perCstNoWebFlag",
    "perCstOldid",
    "perCstMemberFlag",
    "perCstUrlCodeDn",
    "perCstParentCstKey",
    "perCstUrlKey",
    "perCstNoMsgFlag",
    "perCstMsgHandleDn",
    "perCstWebLogin",
    "perCstWebPassword",
    "perCstEntityKey",
    "perCstMsgKey",
    "perCstNoMailFlag",
    "perCstWebStartDate",
    "perCstWebEndDate",
    "perCstWebForcePasswordChange",
    "perCstWebLoginDisabledFlag",
    "perCstComment",
    "perCstCreditHoldFlag",
    "perCstCreditHoldReason",
    "perCstWebForgotPasswordStatus",
    "perCstOldCxaKey",
    "perCstLastEmailDate",
    "perCstNoPublishFlag",
    "perCstSinKey",
    "perCstTtlKey",
    "perCstJfnKey",
    "perCstCurKey",
    "perCstAttribute1",
    "perCstAttribute2",
    "perCstDoNotIncludeDirectoryExtFlag",
    "perCstSalutation1",
    "perCstSourceExt",
    "perCstSalutation2",
    "perCstGracePeriodExt",
    "perCstMergeCstKey",
    "perCstSalutation3",
    "perCstSalutation4",
    "perCstDefaultRecognizeAs",
    "perCstScore",
    "perCstScoreNormalized",
    "perCstScoreTrend",
    "perCstVaultAccount",
    "perCstExcludeFromSocialFlag",
    "perCstSocialScore",
    "perCstPtin",
    "perCstAicpaMemberId",
    "perCstVendorCode",
    "perCstScaKey"
})
public class ExhibitorNewContactPersonDataObjectType {

    @XmlElementRef(name = "per__cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstKey;
    @XmlElementRef(name = "per__cst_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstType;
    @XmlElementRef(name = "per__cst_name_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstNameCp;
    @XmlElementRef(name = "per__cst_sort_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstSortNameDn;
    @XmlElementRef(name = "per__cst_ind_full_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstIndFullNameDn;
    @XmlElementRef(name = "per__cst_org_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstOrgNameDn;
    @XmlElementRef(name = "per__cst_ixo_title_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstIxoTitleDn;
    @XmlElementRef(name = "per__cst_pref_comm_meth", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstPrefCommMeth;
    @XmlElementRef(name = "per__cst_bio", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstBio;
    @XmlElementRef(name = "per__cst_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstAddDate;
    @XmlElementRef(name = "per__cst_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstAddUser;
    @XmlElementRef(name = "per__cst_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstChangeDate;
    @XmlElementRef(name = "per__cst_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstChangeUser;
    @XmlElementRef(name = "per__cst_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> perCstDeleteFlag;
    @XmlElementRef(name = "per__cst_recno", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> perCstRecno;
    @XmlElementRef(name = "per__cst_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstId;
    @XmlElementRef(name = "per__cst_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstKeyExt;
    @XmlElementRef(name = "per__cst_email_text_only", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> perCstEmailTextOnly;
    @XmlElementRef(name = "per__cst_credit_limit", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> perCstCreditLimit;
    @XmlElementRef(name = "per__cst_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstSrcKey;
    @XmlElementRef(name = "per__cst_src_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstSrcCode;
    @XmlElementRef(name = "per__cst_tax_exempt_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> perCstTaxExemptFlag;
    @XmlElementRef(name = "per__cst_tax_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstTaxId;
    @XmlElementRef(name = "per__cst_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstCxaKey;
    @XmlElementRef(name = "per__cst_no_email_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> perCstNoEmailFlag;
    @XmlElementRef(name = "per__cst_cxa_billing_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstCxaBillingKey;
    @XmlElementRef(name = "per__cst_eml_address_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstEmlAddressDn;
    @XmlElementRef(name = "per__cst_eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstEmlKey;
    @XmlElementRef(name = "per__cst_no_phone_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> perCstNoPhoneFlag;
    @XmlElementRef(name = "per__cst_phn_number_complete_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstPhnNumberCompleteDn;
    @XmlElementRef(name = "per__cst_cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstCphKey;
    @XmlElementRef(name = "per__cst_no_fax_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> perCstNoFaxFlag;
    @XmlElementRef(name = "per__cst_fax_number_complete_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstFaxNumberCompleteDn;
    @XmlElementRef(name = "per__cst_cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstCfxKey;
    @XmlElementRef(name = "per__cst_ixo_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstIxoKey;
    @XmlElementRef(name = "per__cst_no_web_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> perCstNoWebFlag;
    @XmlElementRef(name = "per__cst_oldid", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstOldid;
    @XmlElementRef(name = "per__cst_member_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> perCstMemberFlag;
    @XmlElementRef(name = "per__cst_url_code_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstUrlCodeDn;
    @XmlElementRef(name = "per__cst_parent_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstParentCstKey;
    @XmlElementRef(name = "per__cst_url_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstUrlKey;
    @XmlElementRef(name = "per__cst_no_msg_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> perCstNoMsgFlag;
    @XmlElementRef(name = "per__cst_msg_handle_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstMsgHandleDn;
    @XmlElementRef(name = "per__cst_web_login", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstWebLogin;
    @XmlElementRef(name = "per__cst_web_password", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstWebPassword;
    @XmlElementRef(name = "per__cst_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstEntityKey;
    @XmlElementRef(name = "per__cst_msg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstMsgKey;
    @XmlElementRef(name = "per__cst_no_mail_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> perCstNoMailFlag;
    @XmlElementRef(name = "per__cst_web_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstWebStartDate;
    @XmlElementRef(name = "per__cst_web_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstWebEndDate;
    @XmlElementRef(name = "per__cst_web_force_password_change", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> perCstWebForcePasswordChange;
    @XmlElementRef(name = "per__cst_web_login_disabled_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> perCstWebLoginDisabledFlag;
    @XmlElementRef(name = "per__cst_comment", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstComment;
    @XmlElementRef(name = "per__cst_credit_hold_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> perCstCreditHoldFlag;
    @XmlElementRef(name = "per__cst_credit_hold_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstCreditHoldReason;
    @XmlElementRef(name = "per__cst_web_forgot_password_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> perCstWebForgotPasswordStatus;
    @XmlElementRef(name = "per__cst_old_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstOldCxaKey;
    @XmlElementRef(name = "per__cst_last_email_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstLastEmailDate;
    @XmlElementRef(name = "per__cst_no_publish_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> perCstNoPublishFlag;
    @XmlElementRef(name = "per__cst_sin_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstSinKey;
    @XmlElementRef(name = "per__cst_ttl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstTtlKey;
    @XmlElementRef(name = "per__cst_jfn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstJfnKey;
    @XmlElementRef(name = "per__cst_cur_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstCurKey;
    @XmlElementRef(name = "per__cst_attribute_1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstAttribute1;
    @XmlElementRef(name = "per__cst_attribute_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstAttribute2;
    @XmlElementRef(name = "per__cst_do_not_include_directory_ext_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> perCstDoNotIncludeDirectoryExtFlag;
    @XmlElementRef(name = "per__cst_salutation_1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstSalutation1;
    @XmlElementRef(name = "per__cst_source_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstSourceExt;
    @XmlElementRef(name = "per__cst_salutation_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstSalutation2;
    @XmlElementRef(name = "per__cst_grace_period_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> perCstGracePeriodExt;
    @XmlElementRef(name = "per__cst_merge_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstMergeCstKey;
    @XmlElementRef(name = "per__cst_salutation_3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstSalutation3;
    @XmlElementRef(name = "per__cst_salutation_4", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstSalutation4;
    @XmlElementRef(name = "per__cst_default_recognize_as", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstDefaultRecognizeAs;
    @XmlElementRef(name = "per__cst_score", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> perCstScore;
    @XmlElementRef(name = "per__cst_score_normalized", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> perCstScoreNormalized;
    @XmlElementRef(name = "per__cst_score_trend", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> perCstScoreTrend;
    @XmlElementRef(name = "per__cst_vault_account", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstVaultAccount;
    @XmlElementRef(name = "per__cst_exclude_from_social_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> perCstExcludeFromSocialFlag;
    @XmlElementRef(name = "per__cst_social_score", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> perCstSocialScore;
    @XmlElementRef(name = "per__cst_ptin", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstPtin;
    @XmlElementRef(name = "per__cst_aicpa_member_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> perCstAicpaMemberId;
    @XmlElementRef(name = "per__cst_vendor_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstVendorCode;
    @XmlElementRef(name = "per__cst_sca_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> perCstScaKey;

    /**
     * Gets the value of the perCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstKey() {
        return perCstKey;
    }

    /**
     * Sets the value of the perCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstKey(JAXBElement<String> value) {
        this.perCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstType() {
        return perCstType;
    }

    /**
     * Sets the value of the perCstType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstType(JAXBElement<String> value) {
        this.perCstType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstNameCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstNameCp() {
        return perCstNameCp;
    }

    /**
     * Sets the value of the perCstNameCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstNameCp(JAXBElement<String> value) {
        this.perCstNameCp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstSortNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstSortNameDn() {
        return perCstSortNameDn;
    }

    /**
     * Sets the value of the perCstSortNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstSortNameDn(JAXBElement<String> value) {
        this.perCstSortNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstIndFullNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstIndFullNameDn() {
        return perCstIndFullNameDn;
    }

    /**
     * Sets the value of the perCstIndFullNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstIndFullNameDn(JAXBElement<String> value) {
        this.perCstIndFullNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstOrgNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstOrgNameDn() {
        return perCstOrgNameDn;
    }

    /**
     * Sets the value of the perCstOrgNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstOrgNameDn(JAXBElement<String> value) {
        this.perCstOrgNameDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstIxoTitleDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstIxoTitleDn() {
        return perCstIxoTitleDn;
    }

    /**
     * Sets the value of the perCstIxoTitleDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstIxoTitleDn(JAXBElement<String> value) {
        this.perCstIxoTitleDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstPrefCommMeth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstPrefCommMeth() {
        return perCstPrefCommMeth;
    }

    /**
     * Sets the value of the perCstPrefCommMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstPrefCommMeth(JAXBElement<String> value) {
        this.perCstPrefCommMeth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstBio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstBio() {
        return perCstBio;
    }

    /**
     * Sets the value of the perCstBio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstBio(JAXBElement<String> value) {
        this.perCstBio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstAddDate() {
        return perCstAddDate;
    }

    /**
     * Sets the value of the perCstAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstAddDate(JAXBElement<String> value) {
        this.perCstAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstAddUser() {
        return perCstAddUser;
    }

    /**
     * Sets the value of the perCstAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstAddUser(JAXBElement<String> value) {
        this.perCstAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstChangeDate() {
        return perCstChangeDate;
    }

    /**
     * Sets the value of the perCstChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstChangeDate(JAXBElement<String> value) {
        this.perCstChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstChangeUser() {
        return perCstChangeUser;
    }

    /**
     * Sets the value of the perCstChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstChangeUser(JAXBElement<String> value) {
        this.perCstChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPerCstDeleteFlag() {
        return perCstDeleteFlag;
    }

    /**
     * Sets the value of the perCstDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPerCstDeleteFlag(JAXBElement<Short> value) {
        this.perCstDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the perCstRecno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPerCstRecno() {
        return perCstRecno;
    }

    /**
     * Sets the value of the perCstRecno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPerCstRecno(JAXBElement<Long> value) {
        this.perCstRecno = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the perCstId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstId() {
        return perCstId;
    }

    /**
     * Sets the value of the perCstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstId(JAXBElement<String> value) {
        this.perCstId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstKeyExt() {
        return perCstKeyExt;
    }

    /**
     * Sets the value of the perCstKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstKeyExt(JAXBElement<String> value) {
        this.perCstKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstEmailTextOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPerCstEmailTextOnly() {
        return perCstEmailTextOnly;
    }

    /**
     * Sets the value of the perCstEmailTextOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPerCstEmailTextOnly(JAXBElement<Short> value) {
        this.perCstEmailTextOnly = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the perCstCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPerCstCreditLimit() {
        return perCstCreditLimit;
    }

    /**
     * Sets the value of the perCstCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPerCstCreditLimit(JAXBElement<BigDecimal> value) {
        this.perCstCreditLimit = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the perCstSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstSrcKey() {
        return perCstSrcKey;
    }

    /**
     * Sets the value of the perCstSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstSrcKey(JAXBElement<String> value) {
        this.perCstSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstSrcCode() {
        return perCstSrcCode;
    }

    /**
     * Sets the value of the perCstSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstSrcCode(JAXBElement<String> value) {
        this.perCstSrcCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstTaxExemptFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPerCstTaxExemptFlag() {
        return perCstTaxExemptFlag;
    }

    /**
     * Sets the value of the perCstTaxExemptFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPerCstTaxExemptFlag(JAXBElement<Short> value) {
        this.perCstTaxExemptFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the perCstTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstTaxId() {
        return perCstTaxId;
    }

    /**
     * Sets the value of the perCstTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstTaxId(JAXBElement<String> value) {
        this.perCstTaxId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstCxaKey() {
        return perCstCxaKey;
    }

    /**
     * Sets the value of the perCstCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstCxaKey(JAXBElement<String> value) {
        this.perCstCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstNoEmailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPerCstNoEmailFlag() {
        return perCstNoEmailFlag;
    }

    /**
     * Sets the value of the perCstNoEmailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPerCstNoEmailFlag(JAXBElement<Short> value) {
        this.perCstNoEmailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the perCstCxaBillingKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstCxaBillingKey() {
        return perCstCxaBillingKey;
    }

    /**
     * Sets the value of the perCstCxaBillingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstCxaBillingKey(JAXBElement<String> value) {
        this.perCstCxaBillingKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstEmlAddressDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstEmlAddressDn() {
        return perCstEmlAddressDn;
    }

    /**
     * Sets the value of the perCstEmlAddressDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstEmlAddressDn(JAXBElement<String> value) {
        this.perCstEmlAddressDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstEmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstEmlKey() {
        return perCstEmlKey;
    }

    /**
     * Sets the value of the perCstEmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstEmlKey(JAXBElement<String> value) {
        this.perCstEmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstNoPhoneFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPerCstNoPhoneFlag() {
        return perCstNoPhoneFlag;
    }

    /**
     * Sets the value of the perCstNoPhoneFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPerCstNoPhoneFlag(JAXBElement<Short> value) {
        this.perCstNoPhoneFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the perCstPhnNumberCompleteDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstPhnNumberCompleteDn() {
        return perCstPhnNumberCompleteDn;
    }

    /**
     * Sets the value of the perCstPhnNumberCompleteDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstPhnNumberCompleteDn(JAXBElement<String> value) {
        this.perCstPhnNumberCompleteDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstCphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstCphKey() {
        return perCstCphKey;
    }

    /**
     * Sets the value of the perCstCphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstCphKey(JAXBElement<String> value) {
        this.perCstCphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstNoFaxFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPerCstNoFaxFlag() {
        return perCstNoFaxFlag;
    }

    /**
     * Sets the value of the perCstNoFaxFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPerCstNoFaxFlag(JAXBElement<Short> value) {
        this.perCstNoFaxFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the perCstFaxNumberCompleteDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstFaxNumberCompleteDn() {
        return perCstFaxNumberCompleteDn;
    }

    /**
     * Sets the value of the perCstFaxNumberCompleteDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstFaxNumberCompleteDn(JAXBElement<String> value) {
        this.perCstFaxNumberCompleteDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstCfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstCfxKey() {
        return perCstCfxKey;
    }

    /**
     * Sets the value of the perCstCfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstCfxKey(JAXBElement<String> value) {
        this.perCstCfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstIxoKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstIxoKey() {
        return perCstIxoKey;
    }

    /**
     * Sets the value of the perCstIxoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstIxoKey(JAXBElement<String> value) {
        this.perCstIxoKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstNoWebFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPerCstNoWebFlag() {
        return perCstNoWebFlag;
    }

    /**
     * Sets the value of the perCstNoWebFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPerCstNoWebFlag(JAXBElement<Short> value) {
        this.perCstNoWebFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the perCstOldid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstOldid() {
        return perCstOldid;
    }

    /**
     * Sets the value of the perCstOldid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstOldid(JAXBElement<String> value) {
        this.perCstOldid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstMemberFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPerCstMemberFlag() {
        return perCstMemberFlag;
    }

    /**
     * Sets the value of the perCstMemberFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPerCstMemberFlag(JAXBElement<Short> value) {
        this.perCstMemberFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the perCstUrlCodeDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstUrlCodeDn() {
        return perCstUrlCodeDn;
    }

    /**
     * Sets the value of the perCstUrlCodeDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstUrlCodeDn(JAXBElement<String> value) {
        this.perCstUrlCodeDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstParentCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstParentCstKey() {
        return perCstParentCstKey;
    }

    /**
     * Sets the value of the perCstParentCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstParentCstKey(JAXBElement<String> value) {
        this.perCstParentCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstUrlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstUrlKey() {
        return perCstUrlKey;
    }

    /**
     * Sets the value of the perCstUrlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstUrlKey(JAXBElement<String> value) {
        this.perCstUrlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstNoMsgFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPerCstNoMsgFlag() {
        return perCstNoMsgFlag;
    }

    /**
     * Sets the value of the perCstNoMsgFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPerCstNoMsgFlag(JAXBElement<Short> value) {
        this.perCstNoMsgFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the perCstMsgHandleDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstMsgHandleDn() {
        return perCstMsgHandleDn;
    }

    /**
     * Sets the value of the perCstMsgHandleDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstMsgHandleDn(JAXBElement<String> value) {
        this.perCstMsgHandleDn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstWebLogin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstWebLogin() {
        return perCstWebLogin;
    }

    /**
     * Sets the value of the perCstWebLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstWebLogin(JAXBElement<String> value) {
        this.perCstWebLogin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstWebPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstWebPassword() {
        return perCstWebPassword;
    }

    /**
     * Sets the value of the perCstWebPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstWebPassword(JAXBElement<String> value) {
        this.perCstWebPassword = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstEntityKey() {
        return perCstEntityKey;
    }

    /**
     * Sets the value of the perCstEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstEntityKey(JAXBElement<String> value) {
        this.perCstEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstMsgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstMsgKey() {
        return perCstMsgKey;
    }

    /**
     * Sets the value of the perCstMsgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstMsgKey(JAXBElement<String> value) {
        this.perCstMsgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstNoMailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPerCstNoMailFlag() {
        return perCstNoMailFlag;
    }

    /**
     * Sets the value of the perCstNoMailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPerCstNoMailFlag(JAXBElement<Short> value) {
        this.perCstNoMailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the perCstWebStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstWebStartDate() {
        return perCstWebStartDate;
    }

    /**
     * Sets the value of the perCstWebStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstWebStartDate(JAXBElement<String> value) {
        this.perCstWebStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstWebEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstWebEndDate() {
        return perCstWebEndDate;
    }

    /**
     * Sets the value of the perCstWebEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstWebEndDate(JAXBElement<String> value) {
        this.perCstWebEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstWebForcePasswordChange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPerCstWebForcePasswordChange() {
        return perCstWebForcePasswordChange;
    }

    /**
     * Sets the value of the perCstWebForcePasswordChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPerCstWebForcePasswordChange(JAXBElement<Short> value) {
        this.perCstWebForcePasswordChange = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the perCstWebLoginDisabledFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPerCstWebLoginDisabledFlag() {
        return perCstWebLoginDisabledFlag;
    }

    /**
     * Sets the value of the perCstWebLoginDisabledFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPerCstWebLoginDisabledFlag(JAXBElement<Short> value) {
        this.perCstWebLoginDisabledFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the perCstComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstComment() {
        return perCstComment;
    }

    /**
     * Sets the value of the perCstComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstComment(JAXBElement<String> value) {
        this.perCstComment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstCreditHoldFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPerCstCreditHoldFlag() {
        return perCstCreditHoldFlag;
    }

    /**
     * Sets the value of the perCstCreditHoldFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPerCstCreditHoldFlag(JAXBElement<Short> value) {
        this.perCstCreditHoldFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the perCstCreditHoldReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstCreditHoldReason() {
        return perCstCreditHoldReason;
    }

    /**
     * Sets the value of the perCstCreditHoldReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstCreditHoldReason(JAXBElement<String> value) {
        this.perCstCreditHoldReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstWebForgotPasswordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPerCstWebForgotPasswordStatus() {
        return perCstWebForgotPasswordStatus;
    }

    /**
     * Sets the value of the perCstWebForgotPasswordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPerCstWebForgotPasswordStatus(JAXBElement<Short> value) {
        this.perCstWebForgotPasswordStatus = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the perCstOldCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstOldCxaKey() {
        return perCstOldCxaKey;
    }

    /**
     * Sets the value of the perCstOldCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstOldCxaKey(JAXBElement<String> value) {
        this.perCstOldCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstLastEmailDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstLastEmailDate() {
        return perCstLastEmailDate;
    }

    /**
     * Sets the value of the perCstLastEmailDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstLastEmailDate(JAXBElement<String> value) {
        this.perCstLastEmailDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstNoPublishFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPerCstNoPublishFlag() {
        return perCstNoPublishFlag;
    }

    /**
     * Sets the value of the perCstNoPublishFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPerCstNoPublishFlag(JAXBElement<Short> value) {
        this.perCstNoPublishFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the perCstSinKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstSinKey() {
        return perCstSinKey;
    }

    /**
     * Sets the value of the perCstSinKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstSinKey(JAXBElement<String> value) {
        this.perCstSinKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstTtlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstTtlKey() {
        return perCstTtlKey;
    }

    /**
     * Sets the value of the perCstTtlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstTtlKey(JAXBElement<String> value) {
        this.perCstTtlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstJfnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstJfnKey() {
        return perCstJfnKey;
    }

    /**
     * Sets the value of the perCstJfnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstJfnKey(JAXBElement<String> value) {
        this.perCstJfnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstCurKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstCurKey() {
        return perCstCurKey;
    }

    /**
     * Sets the value of the perCstCurKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstCurKey(JAXBElement<String> value) {
        this.perCstCurKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstAttribute1() {
        return perCstAttribute1;
    }

    /**
     * Sets the value of the perCstAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstAttribute1(JAXBElement<String> value) {
        this.perCstAttribute1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstAttribute2() {
        return perCstAttribute2;
    }

    /**
     * Sets the value of the perCstAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstAttribute2(JAXBElement<String> value) {
        this.perCstAttribute2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstDoNotIncludeDirectoryExtFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPerCstDoNotIncludeDirectoryExtFlag() {
        return perCstDoNotIncludeDirectoryExtFlag;
    }

    /**
     * Sets the value of the perCstDoNotIncludeDirectoryExtFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPerCstDoNotIncludeDirectoryExtFlag(JAXBElement<Short> value) {
        this.perCstDoNotIncludeDirectoryExtFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the perCstSalutation1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstSalutation1() {
        return perCstSalutation1;
    }

    /**
     * Sets the value of the perCstSalutation1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstSalutation1(JAXBElement<String> value) {
        this.perCstSalutation1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstSourceExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstSourceExt() {
        return perCstSourceExt;
    }

    /**
     * Sets the value of the perCstSourceExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstSourceExt(JAXBElement<String> value) {
        this.perCstSourceExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstSalutation2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstSalutation2() {
        return perCstSalutation2;
    }

    /**
     * Sets the value of the perCstSalutation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstSalutation2(JAXBElement<String> value) {
        this.perCstSalutation2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstGracePeriodExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPerCstGracePeriodExt() {
        return perCstGracePeriodExt;
    }

    /**
     * Sets the value of the perCstGracePeriodExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPerCstGracePeriodExt(JAXBElement<Integer> value) {
        this.perCstGracePeriodExt = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the perCstMergeCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstMergeCstKey() {
        return perCstMergeCstKey;
    }

    /**
     * Sets the value of the perCstMergeCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstMergeCstKey(JAXBElement<String> value) {
        this.perCstMergeCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstSalutation3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstSalutation3() {
        return perCstSalutation3;
    }

    /**
     * Sets the value of the perCstSalutation3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstSalutation3(JAXBElement<String> value) {
        this.perCstSalutation3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstSalutation4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstSalutation4() {
        return perCstSalutation4;
    }

    /**
     * Sets the value of the perCstSalutation4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstSalutation4(JAXBElement<String> value) {
        this.perCstSalutation4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstDefaultRecognizeAs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstDefaultRecognizeAs() {
        return perCstDefaultRecognizeAs;
    }

    /**
     * Sets the value of the perCstDefaultRecognizeAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstDefaultRecognizeAs(JAXBElement<String> value) {
        this.perCstDefaultRecognizeAs = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPerCstScore() {
        return perCstScore;
    }

    /**
     * Sets the value of the perCstScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPerCstScore(JAXBElement<BigDecimal> value) {
        this.perCstScore = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the perCstScoreNormalized property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPerCstScoreNormalized() {
        return perCstScoreNormalized;
    }

    /**
     * Sets the value of the perCstScoreNormalized property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPerCstScoreNormalized(JAXBElement<Integer> value) {
        this.perCstScoreNormalized = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the perCstScoreTrend property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPerCstScoreTrend() {
        return perCstScoreTrend;
    }

    /**
     * Sets the value of the perCstScoreTrend property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPerCstScoreTrend(JAXBElement<Integer> value) {
        this.perCstScoreTrend = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the perCstVaultAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstVaultAccount() {
        return perCstVaultAccount;
    }

    /**
     * Sets the value of the perCstVaultAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstVaultAccount(JAXBElement<String> value) {
        this.perCstVaultAccount = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstExcludeFromSocialFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPerCstExcludeFromSocialFlag() {
        return perCstExcludeFromSocialFlag;
    }

    /**
     * Sets the value of the perCstExcludeFromSocialFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPerCstExcludeFromSocialFlag(JAXBElement<Short> value) {
        this.perCstExcludeFromSocialFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the perCstSocialScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPerCstSocialScore() {
        return perCstSocialScore;
    }

    /**
     * Sets the value of the perCstSocialScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPerCstSocialScore(JAXBElement<Integer> value) {
        this.perCstSocialScore = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the perCstPtin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstPtin() {
        return perCstPtin;
    }

    /**
     * Sets the value of the perCstPtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstPtin(JAXBElement<String> value) {
        this.perCstPtin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstAicpaMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPerCstAicpaMemberId() {
        return perCstAicpaMemberId;
    }

    /**
     * Sets the value of the perCstAicpaMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPerCstAicpaMemberId(JAXBElement<Long> value) {
        this.perCstAicpaMemberId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the perCstVendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstVendorCode() {
        return perCstVendorCode;
    }

    /**
     * Sets the value of the perCstVendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstVendorCode(JAXBElement<String> value) {
        this.perCstVendorCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the perCstScaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerCstScaKey() {
        return perCstScaKey;
    }

    /**
     * Sets the value of the perCstScaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerCstScaKey(JAXBElement<String> value) {
        this.perCstScaKey = ((JAXBElement<String> ) value);
    }

}
