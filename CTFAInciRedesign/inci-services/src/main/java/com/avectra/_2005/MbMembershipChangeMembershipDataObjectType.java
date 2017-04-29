
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mb_membership_Change_Membership_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mb_membership_Change_Membership_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nmb__mbr_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_src_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_asn_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_join_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_renew_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_expire_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_terminate_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_opt_out" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_mbt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_mbs_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_pak_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_ind_cst_key_referral" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_pak_prd_renewal_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_do_not_renew_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_invoice_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_rejoin_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_popup" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_voting_rights" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_chp_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_converted_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_approval_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_installment_frequency" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_approval_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_ord_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_mtr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_terminate_reason" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_installment_frequency_for_renewal" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_num_of_installments_for_renewal" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_ord_ait_key_renewal" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_mbr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_proforma_renewal" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_ord_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_odd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_bun_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_bun_prd_renewal_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_prc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_bup_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_mbt_renewal_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_chp_cst_renewal_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_cpi_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_auto_pay" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="nmb__mbr_installment_payments_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mb_membership_Change_Membership_DataObjectType", propOrder = {
    "nmbMbrSrcKey",
    "nmbMbrSrcCode",
    "nmbMbrAsnCode",
    "nmbMbrJoinDate",
    "nmbMbrRenewDate",
    "nmbMbrExpireDate",
    "nmbMbrTerminateDate",
    "nmbMbrAddDate",
    "nmbMbrAddUser",
    "nmbMbrChangeUser",
    "nmbMbrChangeDate",
    "nmbMbrDeleteFlag",
    "nmbMbrKey",
    "nmbMbrKeyExt",
    "nmbMbrCstKey",
    "nmbMbrOptOut",
    "nmbMbrMbtKey",
    "nmbMbrMbsKey",
    "nmbMbrPakPrdKey",
    "nmbMbrIndCstKeyReferral",
    "nmbMbrPakPrdRenewalKey",
    "nmbMbrDoNotRenewFlag",
    "nmbMbrInvoiceDate",
    "nmbMbrRejoinDate",
    "nmbMbrPopup",
    "nmbMbrVotingRights",
    "nmbMbrChpCstKey",
    "nmbMbrConvertedFlag",
    "nmbMbrApprovalFlag",
    "nmbMbrInstallmentFrequency",
    "nmbMbrApprovalDate",
    "nmbMbrOrdKey",
    "nmbMbrMtrKey",
    "nmbMbrTerminateReason",
    "nmbMbrInstallmentFrequencyForRenewal",
    "nmbMbrNumOfInstallmentsForRenewal",
    "nmbMbrOrdAitKeyRenewal",
    "nmbMbrMbrKey",
    "nmbMbrProformaRenewal",
    "nmbMbrEntityKey",
    "nmbMbrOrdCode",
    "nmbMbrOddKey",
    "nmbMbrBunPrdKey",
    "nmbMbrBunPrdRenewalKey",
    "nmbMbrPrcKey",
    "nmbMbrBupKey",
    "nmbMbrMbtRenewalKey",
    "nmbMbrChpCstRenewalKey",
    "nmbMbrCpiKey",
    "nmbMbrAutoPay",
    "nmbMbrInstallmentPaymentsFlag"
})
public class MbMembershipChangeMembershipDataObjectType {

    @XmlElementRef(name = "nmb__mbr_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrSrcKey;
    @XmlElementRef(name = "nmb__mbr_src_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrSrcCode;
    @XmlElementRef(name = "nmb__mbr_asn_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrAsnCode;
    @XmlElementRef(name = "nmb__mbr_join_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrJoinDate;
    @XmlElementRef(name = "nmb__mbr_renew_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrRenewDate;
    @XmlElementRef(name = "nmb__mbr_expire_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrExpireDate;
    @XmlElementRef(name = "nmb__mbr_terminate_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrTerminateDate;
    @XmlElementRef(name = "nmb__mbr_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrAddDate;
    @XmlElementRef(name = "nmb__mbr_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrAddUser;
    @XmlElementRef(name = "nmb__mbr_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrChangeUser;
    @XmlElementRef(name = "nmb__mbr_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrChangeDate;
    @XmlElementRef(name = "nmb__mbr_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> nmbMbrDeleteFlag;
    @XmlElementRef(name = "nmb__mbr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrKey;
    @XmlElementRef(name = "nmb__mbr_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrKeyExt;
    @XmlElementRef(name = "nmb__mbr_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrCstKey;
    @XmlElementRef(name = "nmb__mbr_opt_out", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> nmbMbrOptOut;
    @XmlElementRef(name = "nmb__mbr_mbt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrMbtKey;
    @XmlElementRef(name = "nmb__mbr_mbs_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrMbsKey;
    @XmlElementRef(name = "nmb__mbr_pak_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrPakPrdKey;
    @XmlElementRef(name = "nmb__mbr_ind_cst_key_referral", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrIndCstKeyReferral;
    @XmlElementRef(name = "nmb__mbr_pak_prd_renewal_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrPakPrdRenewalKey;
    @XmlElementRef(name = "nmb__mbr_do_not_renew_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> nmbMbrDoNotRenewFlag;
    @XmlElementRef(name = "nmb__mbr_invoice_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrInvoiceDate;
    @XmlElementRef(name = "nmb__mbr_rejoin_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrRejoinDate;
    @XmlElementRef(name = "nmb__mbr_popup", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrPopup;
    @XmlElementRef(name = "nmb__mbr_voting_rights", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> nmbMbrVotingRights;
    @XmlElementRef(name = "nmb__mbr_chp_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrChpCstKey;
    @XmlElementRef(name = "nmb__mbr_converted_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> nmbMbrConvertedFlag;
    @XmlElementRef(name = "nmb__mbr_approval_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> nmbMbrApprovalFlag;
    @XmlElementRef(name = "nmb__mbr_installment_frequency", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> nmbMbrInstallmentFrequency;
    @XmlElementRef(name = "nmb__mbr_approval_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrApprovalDate;
    @XmlElementRef(name = "nmb__mbr_ord_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrOrdKey;
    @XmlElementRef(name = "nmb__mbr_mtr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrMtrKey;
    @XmlElementRef(name = "nmb__mbr_terminate_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrTerminateReason;
    @XmlElementRef(name = "nmb__mbr_installment_frequency_for_renewal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> nmbMbrInstallmentFrequencyForRenewal;
    @XmlElementRef(name = "nmb__mbr_num_of_installments_for_renewal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> nmbMbrNumOfInstallmentsForRenewal;
    @XmlElementRef(name = "nmb__mbr_ord_ait_key_renewal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrOrdAitKeyRenewal;
    @XmlElementRef(name = "nmb__mbr_mbr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrMbrKey;
    @XmlElementRef(name = "nmb__mbr_proforma_renewal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> nmbMbrProformaRenewal;
    @XmlElementRef(name = "nmb__mbr_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrEntityKey;
    @XmlElementRef(name = "nmb__mbr_ord_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrOrdCode;
    @XmlElementRef(name = "nmb__mbr_odd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrOddKey;
    @XmlElementRef(name = "nmb__mbr_bun_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrBunPrdKey;
    @XmlElementRef(name = "nmb__mbr_bun_prd_renewal_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrBunPrdRenewalKey;
    @XmlElementRef(name = "nmb__mbr_prc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrPrcKey;
    @XmlElementRef(name = "nmb__mbr_bup_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrBupKey;
    @XmlElementRef(name = "nmb__mbr_mbt_renewal_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrMbtRenewalKey;
    @XmlElementRef(name = "nmb__mbr_chp_cst_renewal_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrChpCstRenewalKey;
    @XmlElementRef(name = "nmb__mbr_cpi_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmbMbrCpiKey;
    @XmlElementRef(name = "nmb__mbr_auto_pay", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> nmbMbrAutoPay;
    @XmlElementRef(name = "nmb__mbr_installment_payments_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> nmbMbrInstallmentPaymentsFlag;

    /**
     * Gets the value of the nmbMbrSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrSrcKey() {
        return nmbMbrSrcKey;
    }

    /**
     * Sets the value of the nmbMbrSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrSrcKey(JAXBElement<String> value) {
        this.nmbMbrSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrSrcCode() {
        return nmbMbrSrcCode;
    }

    /**
     * Sets the value of the nmbMbrSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrSrcCode(JAXBElement<String> value) {
        this.nmbMbrSrcCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrAsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrAsnCode() {
        return nmbMbrAsnCode;
    }

    /**
     * Sets the value of the nmbMbrAsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrAsnCode(JAXBElement<String> value) {
        this.nmbMbrAsnCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrJoinDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrJoinDate() {
        return nmbMbrJoinDate;
    }

    /**
     * Sets the value of the nmbMbrJoinDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrJoinDate(JAXBElement<String> value) {
        this.nmbMbrJoinDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrRenewDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrRenewDate() {
        return nmbMbrRenewDate;
    }

    /**
     * Sets the value of the nmbMbrRenewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrRenewDate(JAXBElement<String> value) {
        this.nmbMbrRenewDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrExpireDate() {
        return nmbMbrExpireDate;
    }

    /**
     * Sets the value of the nmbMbrExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrExpireDate(JAXBElement<String> value) {
        this.nmbMbrExpireDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrTerminateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrTerminateDate() {
        return nmbMbrTerminateDate;
    }

    /**
     * Sets the value of the nmbMbrTerminateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrTerminateDate(JAXBElement<String> value) {
        this.nmbMbrTerminateDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrAddDate() {
        return nmbMbrAddDate;
    }

    /**
     * Sets the value of the nmbMbrAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrAddDate(JAXBElement<String> value) {
        this.nmbMbrAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrAddUser() {
        return nmbMbrAddUser;
    }

    /**
     * Sets the value of the nmbMbrAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrAddUser(JAXBElement<String> value) {
        this.nmbMbrAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrChangeUser() {
        return nmbMbrChangeUser;
    }

    /**
     * Sets the value of the nmbMbrChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrChangeUser(JAXBElement<String> value) {
        this.nmbMbrChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrChangeDate() {
        return nmbMbrChangeDate;
    }

    /**
     * Sets the value of the nmbMbrChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrChangeDate(JAXBElement<String> value) {
        this.nmbMbrChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNmbMbrDeleteFlag() {
        return nmbMbrDeleteFlag;
    }

    /**
     * Sets the value of the nmbMbrDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNmbMbrDeleteFlag(JAXBElement<Short> value) {
        this.nmbMbrDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the nmbMbrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrKey() {
        return nmbMbrKey;
    }

    /**
     * Sets the value of the nmbMbrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrKey(JAXBElement<String> value) {
        this.nmbMbrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrKeyExt() {
        return nmbMbrKeyExt;
    }

    /**
     * Sets the value of the nmbMbrKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrKeyExt(JAXBElement<String> value) {
        this.nmbMbrKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrCstKey() {
        return nmbMbrCstKey;
    }

    /**
     * Sets the value of the nmbMbrCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrCstKey(JAXBElement<String> value) {
        this.nmbMbrCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrOptOut property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNmbMbrOptOut() {
        return nmbMbrOptOut;
    }

    /**
     * Sets the value of the nmbMbrOptOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNmbMbrOptOut(JAXBElement<Short> value) {
        this.nmbMbrOptOut = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the nmbMbrMbtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrMbtKey() {
        return nmbMbrMbtKey;
    }

    /**
     * Sets the value of the nmbMbrMbtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrMbtKey(JAXBElement<String> value) {
        this.nmbMbrMbtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrMbsKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrMbsKey() {
        return nmbMbrMbsKey;
    }

    /**
     * Sets the value of the nmbMbrMbsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrMbsKey(JAXBElement<String> value) {
        this.nmbMbrMbsKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrPakPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrPakPrdKey() {
        return nmbMbrPakPrdKey;
    }

    /**
     * Sets the value of the nmbMbrPakPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrPakPrdKey(JAXBElement<String> value) {
        this.nmbMbrPakPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrIndCstKeyReferral property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrIndCstKeyReferral() {
        return nmbMbrIndCstKeyReferral;
    }

    /**
     * Sets the value of the nmbMbrIndCstKeyReferral property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrIndCstKeyReferral(JAXBElement<String> value) {
        this.nmbMbrIndCstKeyReferral = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrPakPrdRenewalKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrPakPrdRenewalKey() {
        return nmbMbrPakPrdRenewalKey;
    }

    /**
     * Sets the value of the nmbMbrPakPrdRenewalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrPakPrdRenewalKey(JAXBElement<String> value) {
        this.nmbMbrPakPrdRenewalKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrDoNotRenewFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNmbMbrDoNotRenewFlag() {
        return nmbMbrDoNotRenewFlag;
    }

    /**
     * Sets the value of the nmbMbrDoNotRenewFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNmbMbrDoNotRenewFlag(JAXBElement<Short> value) {
        this.nmbMbrDoNotRenewFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the nmbMbrInvoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrInvoiceDate() {
        return nmbMbrInvoiceDate;
    }

    /**
     * Sets the value of the nmbMbrInvoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrInvoiceDate(JAXBElement<String> value) {
        this.nmbMbrInvoiceDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrRejoinDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrRejoinDate() {
        return nmbMbrRejoinDate;
    }

    /**
     * Sets the value of the nmbMbrRejoinDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrRejoinDate(JAXBElement<String> value) {
        this.nmbMbrRejoinDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrPopup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrPopup() {
        return nmbMbrPopup;
    }

    /**
     * Sets the value of the nmbMbrPopup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrPopup(JAXBElement<String> value) {
        this.nmbMbrPopup = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrVotingRights property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNmbMbrVotingRights() {
        return nmbMbrVotingRights;
    }

    /**
     * Sets the value of the nmbMbrVotingRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNmbMbrVotingRights(JAXBElement<Short> value) {
        this.nmbMbrVotingRights = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the nmbMbrChpCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrChpCstKey() {
        return nmbMbrChpCstKey;
    }

    /**
     * Sets the value of the nmbMbrChpCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrChpCstKey(JAXBElement<String> value) {
        this.nmbMbrChpCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrConvertedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNmbMbrConvertedFlag() {
        return nmbMbrConvertedFlag;
    }

    /**
     * Sets the value of the nmbMbrConvertedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNmbMbrConvertedFlag(JAXBElement<Short> value) {
        this.nmbMbrConvertedFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the nmbMbrApprovalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNmbMbrApprovalFlag() {
        return nmbMbrApprovalFlag;
    }

    /**
     * Sets the value of the nmbMbrApprovalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNmbMbrApprovalFlag(JAXBElement<Short> value) {
        this.nmbMbrApprovalFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the nmbMbrInstallmentFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNmbMbrInstallmentFrequency() {
        return nmbMbrInstallmentFrequency;
    }

    /**
     * Sets the value of the nmbMbrInstallmentFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNmbMbrInstallmentFrequency(JAXBElement<Integer> value) {
        this.nmbMbrInstallmentFrequency = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nmbMbrApprovalDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrApprovalDate() {
        return nmbMbrApprovalDate;
    }

    /**
     * Sets the value of the nmbMbrApprovalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrApprovalDate(JAXBElement<String> value) {
        this.nmbMbrApprovalDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrOrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrOrdKey() {
        return nmbMbrOrdKey;
    }

    /**
     * Sets the value of the nmbMbrOrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrOrdKey(JAXBElement<String> value) {
        this.nmbMbrOrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrMtrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrMtrKey() {
        return nmbMbrMtrKey;
    }

    /**
     * Sets the value of the nmbMbrMtrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrMtrKey(JAXBElement<String> value) {
        this.nmbMbrMtrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrTerminateReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrTerminateReason() {
        return nmbMbrTerminateReason;
    }

    /**
     * Sets the value of the nmbMbrTerminateReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrTerminateReason(JAXBElement<String> value) {
        this.nmbMbrTerminateReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrInstallmentFrequencyForRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNmbMbrInstallmentFrequencyForRenewal() {
        return nmbMbrInstallmentFrequencyForRenewal;
    }

    /**
     * Sets the value of the nmbMbrInstallmentFrequencyForRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNmbMbrInstallmentFrequencyForRenewal(JAXBElement<Integer> value) {
        this.nmbMbrInstallmentFrequencyForRenewal = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nmbMbrNumOfInstallmentsForRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNmbMbrNumOfInstallmentsForRenewal() {
        return nmbMbrNumOfInstallmentsForRenewal;
    }

    /**
     * Sets the value of the nmbMbrNumOfInstallmentsForRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNmbMbrNumOfInstallmentsForRenewal(JAXBElement<Integer> value) {
        this.nmbMbrNumOfInstallmentsForRenewal = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nmbMbrOrdAitKeyRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrOrdAitKeyRenewal() {
        return nmbMbrOrdAitKeyRenewal;
    }

    /**
     * Sets the value of the nmbMbrOrdAitKeyRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrOrdAitKeyRenewal(JAXBElement<String> value) {
        this.nmbMbrOrdAitKeyRenewal = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrMbrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrMbrKey() {
        return nmbMbrMbrKey;
    }

    /**
     * Sets the value of the nmbMbrMbrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrMbrKey(JAXBElement<String> value) {
        this.nmbMbrMbrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrProformaRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNmbMbrProformaRenewal() {
        return nmbMbrProformaRenewal;
    }

    /**
     * Sets the value of the nmbMbrProformaRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNmbMbrProformaRenewal(JAXBElement<Short> value) {
        this.nmbMbrProformaRenewal = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the nmbMbrEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrEntityKey() {
        return nmbMbrEntityKey;
    }

    /**
     * Sets the value of the nmbMbrEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrEntityKey(JAXBElement<String> value) {
        this.nmbMbrEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrOrdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrOrdCode() {
        return nmbMbrOrdCode;
    }

    /**
     * Sets the value of the nmbMbrOrdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrOrdCode(JAXBElement<String> value) {
        this.nmbMbrOrdCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrOddKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrOddKey() {
        return nmbMbrOddKey;
    }

    /**
     * Sets the value of the nmbMbrOddKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrOddKey(JAXBElement<String> value) {
        this.nmbMbrOddKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrBunPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrBunPrdKey() {
        return nmbMbrBunPrdKey;
    }

    /**
     * Sets the value of the nmbMbrBunPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrBunPrdKey(JAXBElement<String> value) {
        this.nmbMbrBunPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrBunPrdRenewalKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrBunPrdRenewalKey() {
        return nmbMbrBunPrdRenewalKey;
    }

    /**
     * Sets the value of the nmbMbrBunPrdRenewalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrBunPrdRenewalKey(JAXBElement<String> value) {
        this.nmbMbrBunPrdRenewalKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrPrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrPrcKey() {
        return nmbMbrPrcKey;
    }

    /**
     * Sets the value of the nmbMbrPrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrPrcKey(JAXBElement<String> value) {
        this.nmbMbrPrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrBupKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrBupKey() {
        return nmbMbrBupKey;
    }

    /**
     * Sets the value of the nmbMbrBupKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrBupKey(JAXBElement<String> value) {
        this.nmbMbrBupKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrMbtRenewalKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrMbtRenewalKey() {
        return nmbMbrMbtRenewalKey;
    }

    /**
     * Sets the value of the nmbMbrMbtRenewalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrMbtRenewalKey(JAXBElement<String> value) {
        this.nmbMbrMbtRenewalKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrChpCstRenewalKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrChpCstRenewalKey() {
        return nmbMbrChpCstRenewalKey;
    }

    /**
     * Sets the value of the nmbMbrChpCstRenewalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrChpCstRenewalKey(JAXBElement<String> value) {
        this.nmbMbrChpCstRenewalKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrCpiKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmbMbrCpiKey() {
        return nmbMbrCpiKey;
    }

    /**
     * Sets the value of the nmbMbrCpiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmbMbrCpiKey(JAXBElement<String> value) {
        this.nmbMbrCpiKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmbMbrAutoPay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNmbMbrAutoPay() {
        return nmbMbrAutoPay;
    }

    /**
     * Sets the value of the nmbMbrAutoPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNmbMbrAutoPay(JAXBElement<Short> value) {
        this.nmbMbrAutoPay = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the nmbMbrInstallmentPaymentsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNmbMbrInstallmentPaymentsFlag() {
        return nmbMbrInstallmentPaymentsFlag;
    }

    /**
     * Sets the value of the nmbMbrInstallmentPaymentsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNmbMbrInstallmentPaymentsFlag(JAXBElement<Short> value) {
        this.nmbMbrInstallmentPaymentsFlag = ((JAXBElement<Short> ) value);
    }

}
