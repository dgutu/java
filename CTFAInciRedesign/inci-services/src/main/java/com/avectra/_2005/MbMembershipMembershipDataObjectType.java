
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mb_membership_Membership_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mb_membership_Membership_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mbr_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbr_src_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="mbr_asn_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="mbr_join_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="mbr_renew_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="mbr_expire_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="mbr_terminate_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="mbr_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="mbr_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="mbr_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="mbr_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="mbr_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="mbr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbr_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbr_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbr_opt_out" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="mbr_mbt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbr_mbs_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbr_pak_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbr_ind_cst_key_referral" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbr_pak_prd_renewal_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbr_do_not_renew_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="mbr_invoice_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="mbr_rejoin_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="mbr_popup" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="mbr_voting_rights" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="mbr_chp_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbr_converted_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="mbr_approval_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="mbr_installment_frequency" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="mbr_approval_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="mbr_ord_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbr_mtr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbr_terminate_reason" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="mbr_installment_frequency_for_renewal" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="mbr_num_of_installments_for_renewal" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="mbr_ord_ait_key_renewal" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbr_mbr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbr_proforma_renewal" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="mbr_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbr_ord_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="mbr_odd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbr_bun_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbr_bun_prd_renewal_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbr_prc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbr_bup_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbr_mbt_renewal_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbr_chp_cst_renewal_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbr_cpi_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbr_auto_pay" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="mbr_installment_payments_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="mbr_allowed_action" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="mbr_rejoin_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="mbr_renew_related" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="mbr_apply_credits_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="mbr_bup_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbr_addl_info" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="mbr_available_credit" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="mbr_total" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mb_membership_Membership_DataObjectType", propOrder = {
    "mbrSrcKey",
    "mbrSrcCode",
    "mbrAsnCode",
    "mbrJoinDate",
    "mbrRenewDate",
    "mbrExpireDate",
    "mbrTerminateDate",
    "mbrAddDate",
    "mbrAddUser",
    "mbrChangeUser",
    "mbrChangeDate",
    "mbrDeleteFlag",
    "mbrKey",
    "mbrKeyExt",
    "mbrCstKey",
    "mbrOptOut",
    "mbrMbtKey",
    "mbrMbsKey",
    "mbrPakPrdKey",
    "mbrIndCstKeyReferral",
    "mbrPakPrdRenewalKey",
    "mbrDoNotRenewFlag",
    "mbrInvoiceDate",
    "mbrRejoinDate",
    "mbrPopup",
    "mbrVotingRights",
    "mbrChpCstKey",
    "mbrConvertedFlag",
    "mbrApprovalFlag",
    "mbrInstallmentFrequency",
    "mbrApprovalDate",
    "mbrOrdKey",
    "mbrMtrKey",
    "mbrTerminateReason",
    "mbrInstallmentFrequencyForRenewal",
    "mbrNumOfInstallmentsForRenewal",
    "mbrOrdAitKeyRenewal",
    "mbrMbrKey",
    "mbrProformaRenewal",
    "mbrEntityKey",
    "mbrOrdCode",
    "mbrOddKey",
    "mbrBunPrdKey",
    "mbrBunPrdRenewalKey",
    "mbrPrcKey",
    "mbrBupKey",
    "mbrMbtRenewalKey",
    "mbrChpCstRenewalKey",
    "mbrCpiKey",
    "mbrAutoPay",
    "mbrInstallmentPaymentsFlag",
    "mbrAllowedAction",
    "mbrRejoinFlag",
    "mbrRenewRelated",
    "mbrApplyCreditsFlag",
    "mbrBupPrdKey",
    "mbrAddlInfo",
    "mbrAvailableCredit",
    "mbrTotal"
})
public class MbMembershipMembershipDataObjectType {

    @XmlElementRef(name = "mbr_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrSrcKey;
    @XmlElementRef(name = "mbr_src_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrSrcCode;
    @XmlElementRef(name = "mbr_asn_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrAsnCode;
    @XmlElementRef(name = "mbr_join_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrJoinDate;
    @XmlElementRef(name = "mbr_renew_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrRenewDate;
    @XmlElementRef(name = "mbr_expire_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrExpireDate;
    @XmlElementRef(name = "mbr_terminate_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrTerminateDate;
    @XmlElementRef(name = "mbr_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrAddDate;
    @XmlElementRef(name = "mbr_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrAddUser;
    @XmlElementRef(name = "mbr_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrChangeUser;
    @XmlElementRef(name = "mbr_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrChangeDate;
    @XmlElementRef(name = "mbr_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mbrDeleteFlag;
    @XmlElementRef(name = "mbr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrKey;
    @XmlElementRef(name = "mbr_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrKeyExt;
    @XmlElementRef(name = "mbr_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrCstKey;
    @XmlElementRef(name = "mbr_opt_out", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mbrOptOut;
    @XmlElementRef(name = "mbr_mbt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrMbtKey;
    @XmlElementRef(name = "mbr_mbs_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrMbsKey;
    @XmlElementRef(name = "mbr_pak_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrPakPrdKey;
    @XmlElementRef(name = "mbr_ind_cst_key_referral", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrIndCstKeyReferral;
    @XmlElementRef(name = "mbr_pak_prd_renewal_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrPakPrdRenewalKey;
    @XmlElementRef(name = "mbr_do_not_renew_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mbrDoNotRenewFlag;
    @XmlElementRef(name = "mbr_invoice_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrInvoiceDate;
    @XmlElementRef(name = "mbr_rejoin_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrRejoinDate;
    @XmlElementRef(name = "mbr_popup", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrPopup;
    @XmlElementRef(name = "mbr_voting_rights", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mbrVotingRights;
    @XmlElementRef(name = "mbr_chp_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrChpCstKey;
    @XmlElementRef(name = "mbr_converted_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mbrConvertedFlag;
    @XmlElementRef(name = "mbr_approval_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mbrApprovalFlag;
    @XmlElementRef(name = "mbr_installment_frequency", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> mbrInstallmentFrequency;
    @XmlElementRef(name = "mbr_approval_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrApprovalDate;
    @XmlElementRef(name = "mbr_ord_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrOrdKey;
    @XmlElementRef(name = "mbr_mtr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrMtrKey;
    @XmlElementRef(name = "mbr_terminate_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrTerminateReason;
    @XmlElementRef(name = "mbr_installment_frequency_for_renewal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> mbrInstallmentFrequencyForRenewal;
    @XmlElementRef(name = "mbr_num_of_installments_for_renewal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> mbrNumOfInstallmentsForRenewal;
    @XmlElementRef(name = "mbr_ord_ait_key_renewal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrOrdAitKeyRenewal;
    @XmlElementRef(name = "mbr_mbr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrMbrKey;
    @XmlElementRef(name = "mbr_proforma_renewal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mbrProformaRenewal;
    @XmlElementRef(name = "mbr_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrEntityKey;
    @XmlElementRef(name = "mbr_ord_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrOrdCode;
    @XmlElementRef(name = "mbr_odd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrOddKey;
    @XmlElementRef(name = "mbr_bun_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrBunPrdKey;
    @XmlElementRef(name = "mbr_bun_prd_renewal_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrBunPrdRenewalKey;
    @XmlElementRef(name = "mbr_prc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrPrcKey;
    @XmlElementRef(name = "mbr_bup_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrBupKey;
    @XmlElementRef(name = "mbr_mbt_renewal_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrMbtRenewalKey;
    @XmlElementRef(name = "mbr_chp_cst_renewal_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrChpCstRenewalKey;
    @XmlElementRef(name = "mbr_cpi_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrCpiKey;
    @XmlElementRef(name = "mbr_auto_pay", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mbrAutoPay;
    @XmlElementRef(name = "mbr_installment_payments_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mbrInstallmentPaymentsFlag;
    @XmlElementRef(name = "mbr_allowed_action", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrAllowedAction;
    @XmlElementRef(name = "mbr_rejoin_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mbrRejoinFlag;
    @XmlElementRef(name = "mbr_renew_related", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mbrRenewRelated;
    @XmlElementRef(name = "mbr_apply_credits_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mbrApplyCreditsFlag;
    @XmlElementRef(name = "mbr_bup_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrBupPrdKey;
    @XmlElementRef(name = "mbr_addl_info", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbrAddlInfo;
    @XmlElementRef(name = "mbr_available_credit", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> mbrAvailableCredit;
    @XmlElementRef(name = "mbr_total", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> mbrTotal;

    /**
     * Gets the value of the mbrSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrSrcKey() {
        return mbrSrcKey;
    }

    /**
     * Sets the value of the mbrSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrSrcKey(JAXBElement<String> value) {
        this.mbrSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrSrcCode() {
        return mbrSrcCode;
    }

    /**
     * Sets the value of the mbrSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrSrcCode(JAXBElement<String> value) {
        this.mbrSrcCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrAsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrAsnCode() {
        return mbrAsnCode;
    }

    /**
     * Sets the value of the mbrAsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrAsnCode(JAXBElement<String> value) {
        this.mbrAsnCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrJoinDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrJoinDate() {
        return mbrJoinDate;
    }

    /**
     * Sets the value of the mbrJoinDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrJoinDate(JAXBElement<String> value) {
        this.mbrJoinDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrRenewDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrRenewDate() {
        return mbrRenewDate;
    }

    /**
     * Sets the value of the mbrRenewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrRenewDate(JAXBElement<String> value) {
        this.mbrRenewDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrExpireDate() {
        return mbrExpireDate;
    }

    /**
     * Sets the value of the mbrExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrExpireDate(JAXBElement<String> value) {
        this.mbrExpireDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrTerminateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrTerminateDate() {
        return mbrTerminateDate;
    }

    /**
     * Sets the value of the mbrTerminateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrTerminateDate(JAXBElement<String> value) {
        this.mbrTerminateDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrAddDate() {
        return mbrAddDate;
    }

    /**
     * Sets the value of the mbrAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrAddDate(JAXBElement<String> value) {
        this.mbrAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrAddUser() {
        return mbrAddUser;
    }

    /**
     * Sets the value of the mbrAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrAddUser(JAXBElement<String> value) {
        this.mbrAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrChangeUser() {
        return mbrChangeUser;
    }

    /**
     * Sets the value of the mbrChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrChangeUser(JAXBElement<String> value) {
        this.mbrChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrChangeDate() {
        return mbrChangeDate;
    }

    /**
     * Sets the value of the mbrChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrChangeDate(JAXBElement<String> value) {
        this.mbrChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMbrDeleteFlag() {
        return mbrDeleteFlag;
    }

    /**
     * Sets the value of the mbrDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMbrDeleteFlag(JAXBElement<Short> value) {
        this.mbrDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the mbrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrKey() {
        return mbrKey;
    }

    /**
     * Sets the value of the mbrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrKey(JAXBElement<String> value) {
        this.mbrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrKeyExt() {
        return mbrKeyExt;
    }

    /**
     * Sets the value of the mbrKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrKeyExt(JAXBElement<String> value) {
        this.mbrKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrCstKey() {
        return mbrCstKey;
    }

    /**
     * Sets the value of the mbrCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrCstKey(JAXBElement<String> value) {
        this.mbrCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrOptOut property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMbrOptOut() {
        return mbrOptOut;
    }

    /**
     * Sets the value of the mbrOptOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMbrOptOut(JAXBElement<Short> value) {
        this.mbrOptOut = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the mbrMbtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrMbtKey() {
        return mbrMbtKey;
    }

    /**
     * Sets the value of the mbrMbtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrMbtKey(JAXBElement<String> value) {
        this.mbrMbtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrMbsKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrMbsKey() {
        return mbrMbsKey;
    }

    /**
     * Sets the value of the mbrMbsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrMbsKey(JAXBElement<String> value) {
        this.mbrMbsKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrPakPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrPakPrdKey() {
        return mbrPakPrdKey;
    }

    /**
     * Sets the value of the mbrPakPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrPakPrdKey(JAXBElement<String> value) {
        this.mbrPakPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrIndCstKeyReferral property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrIndCstKeyReferral() {
        return mbrIndCstKeyReferral;
    }

    /**
     * Sets the value of the mbrIndCstKeyReferral property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrIndCstKeyReferral(JAXBElement<String> value) {
        this.mbrIndCstKeyReferral = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrPakPrdRenewalKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrPakPrdRenewalKey() {
        return mbrPakPrdRenewalKey;
    }

    /**
     * Sets the value of the mbrPakPrdRenewalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrPakPrdRenewalKey(JAXBElement<String> value) {
        this.mbrPakPrdRenewalKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrDoNotRenewFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMbrDoNotRenewFlag() {
        return mbrDoNotRenewFlag;
    }

    /**
     * Sets the value of the mbrDoNotRenewFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMbrDoNotRenewFlag(JAXBElement<Short> value) {
        this.mbrDoNotRenewFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the mbrInvoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrInvoiceDate() {
        return mbrInvoiceDate;
    }

    /**
     * Sets the value of the mbrInvoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrInvoiceDate(JAXBElement<String> value) {
        this.mbrInvoiceDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrRejoinDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrRejoinDate() {
        return mbrRejoinDate;
    }

    /**
     * Sets the value of the mbrRejoinDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrRejoinDate(JAXBElement<String> value) {
        this.mbrRejoinDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrPopup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrPopup() {
        return mbrPopup;
    }

    /**
     * Sets the value of the mbrPopup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrPopup(JAXBElement<String> value) {
        this.mbrPopup = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrVotingRights property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMbrVotingRights() {
        return mbrVotingRights;
    }

    /**
     * Sets the value of the mbrVotingRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMbrVotingRights(JAXBElement<Short> value) {
        this.mbrVotingRights = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the mbrChpCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrChpCstKey() {
        return mbrChpCstKey;
    }

    /**
     * Sets the value of the mbrChpCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrChpCstKey(JAXBElement<String> value) {
        this.mbrChpCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrConvertedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMbrConvertedFlag() {
        return mbrConvertedFlag;
    }

    /**
     * Sets the value of the mbrConvertedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMbrConvertedFlag(JAXBElement<Short> value) {
        this.mbrConvertedFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the mbrApprovalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMbrApprovalFlag() {
        return mbrApprovalFlag;
    }

    /**
     * Sets the value of the mbrApprovalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMbrApprovalFlag(JAXBElement<Short> value) {
        this.mbrApprovalFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the mbrInstallmentFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMbrInstallmentFrequency() {
        return mbrInstallmentFrequency;
    }

    /**
     * Sets the value of the mbrInstallmentFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMbrInstallmentFrequency(JAXBElement<Integer> value) {
        this.mbrInstallmentFrequency = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the mbrApprovalDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrApprovalDate() {
        return mbrApprovalDate;
    }

    /**
     * Sets the value of the mbrApprovalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrApprovalDate(JAXBElement<String> value) {
        this.mbrApprovalDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrOrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrOrdKey() {
        return mbrOrdKey;
    }

    /**
     * Sets the value of the mbrOrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrOrdKey(JAXBElement<String> value) {
        this.mbrOrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrMtrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrMtrKey() {
        return mbrMtrKey;
    }

    /**
     * Sets the value of the mbrMtrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrMtrKey(JAXBElement<String> value) {
        this.mbrMtrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrTerminateReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrTerminateReason() {
        return mbrTerminateReason;
    }

    /**
     * Sets the value of the mbrTerminateReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrTerminateReason(JAXBElement<String> value) {
        this.mbrTerminateReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrInstallmentFrequencyForRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMbrInstallmentFrequencyForRenewal() {
        return mbrInstallmentFrequencyForRenewal;
    }

    /**
     * Sets the value of the mbrInstallmentFrequencyForRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMbrInstallmentFrequencyForRenewal(JAXBElement<Integer> value) {
        this.mbrInstallmentFrequencyForRenewal = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the mbrNumOfInstallmentsForRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMbrNumOfInstallmentsForRenewal() {
        return mbrNumOfInstallmentsForRenewal;
    }

    /**
     * Sets the value of the mbrNumOfInstallmentsForRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMbrNumOfInstallmentsForRenewal(JAXBElement<Integer> value) {
        this.mbrNumOfInstallmentsForRenewal = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the mbrOrdAitKeyRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrOrdAitKeyRenewal() {
        return mbrOrdAitKeyRenewal;
    }

    /**
     * Sets the value of the mbrOrdAitKeyRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrOrdAitKeyRenewal(JAXBElement<String> value) {
        this.mbrOrdAitKeyRenewal = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrMbrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrMbrKey() {
        return mbrMbrKey;
    }

    /**
     * Sets the value of the mbrMbrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrMbrKey(JAXBElement<String> value) {
        this.mbrMbrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrProformaRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMbrProformaRenewal() {
        return mbrProformaRenewal;
    }

    /**
     * Sets the value of the mbrProformaRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMbrProformaRenewal(JAXBElement<Short> value) {
        this.mbrProformaRenewal = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the mbrEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrEntityKey() {
        return mbrEntityKey;
    }

    /**
     * Sets the value of the mbrEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrEntityKey(JAXBElement<String> value) {
        this.mbrEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrOrdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrOrdCode() {
        return mbrOrdCode;
    }

    /**
     * Sets the value of the mbrOrdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrOrdCode(JAXBElement<String> value) {
        this.mbrOrdCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrOddKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrOddKey() {
        return mbrOddKey;
    }

    /**
     * Sets the value of the mbrOddKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrOddKey(JAXBElement<String> value) {
        this.mbrOddKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrBunPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrBunPrdKey() {
        return mbrBunPrdKey;
    }

    /**
     * Sets the value of the mbrBunPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrBunPrdKey(JAXBElement<String> value) {
        this.mbrBunPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrBunPrdRenewalKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrBunPrdRenewalKey() {
        return mbrBunPrdRenewalKey;
    }

    /**
     * Sets the value of the mbrBunPrdRenewalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrBunPrdRenewalKey(JAXBElement<String> value) {
        this.mbrBunPrdRenewalKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrPrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrPrcKey() {
        return mbrPrcKey;
    }

    /**
     * Sets the value of the mbrPrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrPrcKey(JAXBElement<String> value) {
        this.mbrPrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrBupKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrBupKey() {
        return mbrBupKey;
    }

    /**
     * Sets the value of the mbrBupKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrBupKey(JAXBElement<String> value) {
        this.mbrBupKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrMbtRenewalKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrMbtRenewalKey() {
        return mbrMbtRenewalKey;
    }

    /**
     * Sets the value of the mbrMbtRenewalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrMbtRenewalKey(JAXBElement<String> value) {
        this.mbrMbtRenewalKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrChpCstRenewalKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrChpCstRenewalKey() {
        return mbrChpCstRenewalKey;
    }

    /**
     * Sets the value of the mbrChpCstRenewalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrChpCstRenewalKey(JAXBElement<String> value) {
        this.mbrChpCstRenewalKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrCpiKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrCpiKey() {
        return mbrCpiKey;
    }

    /**
     * Sets the value of the mbrCpiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrCpiKey(JAXBElement<String> value) {
        this.mbrCpiKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrAutoPay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMbrAutoPay() {
        return mbrAutoPay;
    }

    /**
     * Sets the value of the mbrAutoPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMbrAutoPay(JAXBElement<Short> value) {
        this.mbrAutoPay = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the mbrInstallmentPaymentsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMbrInstallmentPaymentsFlag() {
        return mbrInstallmentPaymentsFlag;
    }

    /**
     * Sets the value of the mbrInstallmentPaymentsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMbrInstallmentPaymentsFlag(JAXBElement<Short> value) {
        this.mbrInstallmentPaymentsFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the mbrAllowedAction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrAllowedAction() {
        return mbrAllowedAction;
    }

    /**
     * Sets the value of the mbrAllowedAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrAllowedAction(JAXBElement<String> value) {
        this.mbrAllowedAction = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrRejoinFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMbrRejoinFlag() {
        return mbrRejoinFlag;
    }

    /**
     * Sets the value of the mbrRejoinFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMbrRejoinFlag(JAXBElement<Short> value) {
        this.mbrRejoinFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the mbrRenewRelated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMbrRenewRelated() {
        return mbrRenewRelated;
    }

    /**
     * Sets the value of the mbrRenewRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMbrRenewRelated(JAXBElement<Short> value) {
        this.mbrRenewRelated = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the mbrApplyCreditsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMbrApplyCreditsFlag() {
        return mbrApplyCreditsFlag;
    }

    /**
     * Sets the value of the mbrApplyCreditsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMbrApplyCreditsFlag(JAXBElement<Short> value) {
        this.mbrApplyCreditsFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the mbrBupPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrBupPrdKey() {
        return mbrBupPrdKey;
    }

    /**
     * Sets the value of the mbrBupPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrBupPrdKey(JAXBElement<String> value) {
        this.mbrBupPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrAddlInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbrAddlInfo() {
        return mbrAddlInfo;
    }

    /**
     * Sets the value of the mbrAddlInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbrAddlInfo(JAXBElement<String> value) {
        this.mbrAddlInfo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbrAvailableCredit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMbrAvailableCredit() {
        return mbrAvailableCredit;
    }

    /**
     * Sets the value of the mbrAvailableCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMbrAvailableCredit(JAXBElement<BigDecimal> value) {
        this.mbrAvailableCredit = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the mbrTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMbrTotal() {
        return mbrTotal;
    }

    /**
     * Sets the value of the mbrTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMbrTotal(JAXBElement<BigDecimal> value) {
        this.mbrTotal = ((JAXBElement<BigDecimal> ) value);
    }

}
