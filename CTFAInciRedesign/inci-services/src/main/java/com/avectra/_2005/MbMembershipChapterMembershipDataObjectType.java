
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mb_membership_Chapter_Membership_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mb_membership_Chapter_Membership_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cmb__mbr_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_src_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_asn_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_join_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_renew_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_expire_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_terminate_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_opt_out" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_mbt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_mbs_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_pak_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_ind_cst_key_referral" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_pak_prd_renewal_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_do_not_renew_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_invoice_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_rejoin_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_popup" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_voting_rights" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_chp_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_converted_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_approval_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_installment_frequency" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_approval_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_ord_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_mtr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_terminate_reason" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_installment_frequency_for_renewal" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_num_of_installments_for_renewal" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_ord_ait_key_renewal" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_mbr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_proforma_renewal" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_ord_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_odd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_bun_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_bun_prd_renewal_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_prc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_bup_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_mbt_renewal_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_chp_cst_renewal_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_cpi_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_auto_pay" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cmb__mbr_installment_payments_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mb_membership_Chapter_Membership_DataObjectType", propOrder = {
    "cmbMbrSrcKey",
    "cmbMbrSrcCode",
    "cmbMbrAsnCode",
    "cmbMbrJoinDate",
    "cmbMbrRenewDate",
    "cmbMbrExpireDate",
    "cmbMbrTerminateDate",
    "cmbMbrAddDate",
    "cmbMbrAddUser",
    "cmbMbrChangeUser",
    "cmbMbrChangeDate",
    "cmbMbrDeleteFlag",
    "cmbMbrKey",
    "cmbMbrKeyExt",
    "cmbMbrCstKey",
    "cmbMbrOptOut",
    "cmbMbrMbtKey",
    "cmbMbrMbsKey",
    "cmbMbrPakPrdKey",
    "cmbMbrIndCstKeyReferral",
    "cmbMbrPakPrdRenewalKey",
    "cmbMbrDoNotRenewFlag",
    "cmbMbrInvoiceDate",
    "cmbMbrRejoinDate",
    "cmbMbrPopup",
    "cmbMbrVotingRights",
    "cmbMbrChpCstKey",
    "cmbMbrConvertedFlag",
    "cmbMbrApprovalFlag",
    "cmbMbrInstallmentFrequency",
    "cmbMbrApprovalDate",
    "cmbMbrOrdKey",
    "cmbMbrMtrKey",
    "cmbMbrTerminateReason",
    "cmbMbrInstallmentFrequencyForRenewal",
    "cmbMbrNumOfInstallmentsForRenewal",
    "cmbMbrOrdAitKeyRenewal",
    "cmbMbrMbrKey",
    "cmbMbrProformaRenewal",
    "cmbMbrEntityKey",
    "cmbMbrOrdCode",
    "cmbMbrOddKey",
    "cmbMbrBunPrdKey",
    "cmbMbrBunPrdRenewalKey",
    "cmbMbrPrcKey",
    "cmbMbrBupKey",
    "cmbMbrMbtRenewalKey",
    "cmbMbrChpCstRenewalKey",
    "cmbMbrCpiKey",
    "cmbMbrAutoPay",
    "cmbMbrInstallmentPaymentsFlag"
})
public class MbMembershipChapterMembershipDataObjectType {

    @XmlElementRef(name = "cmb__mbr_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrSrcKey;
    @XmlElementRef(name = "cmb__mbr_src_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrSrcCode;
    @XmlElementRef(name = "cmb__mbr_asn_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrAsnCode;
    @XmlElementRef(name = "cmb__mbr_join_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrJoinDate;
    @XmlElementRef(name = "cmb__mbr_renew_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrRenewDate;
    @XmlElementRef(name = "cmb__mbr_expire_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrExpireDate;
    @XmlElementRef(name = "cmb__mbr_terminate_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrTerminateDate;
    @XmlElementRef(name = "cmb__mbr_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrAddDate;
    @XmlElementRef(name = "cmb__mbr_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrAddUser;
    @XmlElementRef(name = "cmb__mbr_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrChangeUser;
    @XmlElementRef(name = "cmb__mbr_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrChangeDate;
    @XmlElementRef(name = "cmb__mbr_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cmbMbrDeleteFlag;
    @XmlElementRef(name = "cmb__mbr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrKey;
    @XmlElementRef(name = "cmb__mbr_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrKeyExt;
    @XmlElementRef(name = "cmb__mbr_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrCstKey;
    @XmlElementRef(name = "cmb__mbr_opt_out", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cmbMbrOptOut;
    @XmlElementRef(name = "cmb__mbr_mbt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrMbtKey;
    @XmlElementRef(name = "cmb__mbr_mbs_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrMbsKey;
    @XmlElementRef(name = "cmb__mbr_pak_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrPakPrdKey;
    @XmlElementRef(name = "cmb__mbr_ind_cst_key_referral", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrIndCstKeyReferral;
    @XmlElementRef(name = "cmb__mbr_pak_prd_renewal_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrPakPrdRenewalKey;
    @XmlElementRef(name = "cmb__mbr_do_not_renew_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cmbMbrDoNotRenewFlag;
    @XmlElementRef(name = "cmb__mbr_invoice_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrInvoiceDate;
    @XmlElementRef(name = "cmb__mbr_rejoin_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrRejoinDate;
    @XmlElementRef(name = "cmb__mbr_popup", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrPopup;
    @XmlElementRef(name = "cmb__mbr_voting_rights", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cmbMbrVotingRights;
    @XmlElementRef(name = "cmb__mbr_chp_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrChpCstKey;
    @XmlElementRef(name = "cmb__mbr_converted_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cmbMbrConvertedFlag;
    @XmlElementRef(name = "cmb__mbr_approval_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cmbMbrApprovalFlag;
    @XmlElementRef(name = "cmb__mbr_installment_frequency", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cmbMbrInstallmentFrequency;
    @XmlElementRef(name = "cmb__mbr_approval_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrApprovalDate;
    @XmlElementRef(name = "cmb__mbr_ord_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrOrdKey;
    @XmlElementRef(name = "cmb__mbr_mtr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrMtrKey;
    @XmlElementRef(name = "cmb__mbr_terminate_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrTerminateReason;
    @XmlElementRef(name = "cmb__mbr_installment_frequency_for_renewal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cmbMbrInstallmentFrequencyForRenewal;
    @XmlElementRef(name = "cmb__mbr_num_of_installments_for_renewal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cmbMbrNumOfInstallmentsForRenewal;
    @XmlElementRef(name = "cmb__mbr_ord_ait_key_renewal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrOrdAitKeyRenewal;
    @XmlElementRef(name = "cmb__mbr_mbr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrMbrKey;
    @XmlElementRef(name = "cmb__mbr_proforma_renewal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cmbMbrProformaRenewal;
    @XmlElementRef(name = "cmb__mbr_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrEntityKey;
    @XmlElementRef(name = "cmb__mbr_ord_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrOrdCode;
    @XmlElementRef(name = "cmb__mbr_odd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrOddKey;
    @XmlElementRef(name = "cmb__mbr_bun_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrBunPrdKey;
    @XmlElementRef(name = "cmb__mbr_bun_prd_renewal_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrBunPrdRenewalKey;
    @XmlElementRef(name = "cmb__mbr_prc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrPrcKey;
    @XmlElementRef(name = "cmb__mbr_bup_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrBupKey;
    @XmlElementRef(name = "cmb__mbr_mbt_renewal_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrMbtRenewalKey;
    @XmlElementRef(name = "cmb__mbr_chp_cst_renewal_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrChpCstRenewalKey;
    @XmlElementRef(name = "cmb__mbr_cpi_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmbMbrCpiKey;
    @XmlElementRef(name = "cmb__mbr_auto_pay", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cmbMbrAutoPay;
    @XmlElementRef(name = "cmb__mbr_installment_payments_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cmbMbrInstallmentPaymentsFlag;

    /**
     * Gets the value of the cmbMbrSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrSrcKey() {
        return cmbMbrSrcKey;
    }

    /**
     * Sets the value of the cmbMbrSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrSrcKey(JAXBElement<String> value) {
        this.cmbMbrSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrSrcCode() {
        return cmbMbrSrcCode;
    }

    /**
     * Sets the value of the cmbMbrSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrSrcCode(JAXBElement<String> value) {
        this.cmbMbrSrcCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrAsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrAsnCode() {
        return cmbMbrAsnCode;
    }

    /**
     * Sets the value of the cmbMbrAsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrAsnCode(JAXBElement<String> value) {
        this.cmbMbrAsnCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrJoinDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrJoinDate() {
        return cmbMbrJoinDate;
    }

    /**
     * Sets the value of the cmbMbrJoinDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrJoinDate(JAXBElement<String> value) {
        this.cmbMbrJoinDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrRenewDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrRenewDate() {
        return cmbMbrRenewDate;
    }

    /**
     * Sets the value of the cmbMbrRenewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrRenewDate(JAXBElement<String> value) {
        this.cmbMbrRenewDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrExpireDate() {
        return cmbMbrExpireDate;
    }

    /**
     * Sets the value of the cmbMbrExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrExpireDate(JAXBElement<String> value) {
        this.cmbMbrExpireDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrTerminateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrTerminateDate() {
        return cmbMbrTerminateDate;
    }

    /**
     * Sets the value of the cmbMbrTerminateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrTerminateDate(JAXBElement<String> value) {
        this.cmbMbrTerminateDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrAddDate() {
        return cmbMbrAddDate;
    }

    /**
     * Sets the value of the cmbMbrAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrAddDate(JAXBElement<String> value) {
        this.cmbMbrAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrAddUser() {
        return cmbMbrAddUser;
    }

    /**
     * Sets the value of the cmbMbrAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrAddUser(JAXBElement<String> value) {
        this.cmbMbrAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrChangeUser() {
        return cmbMbrChangeUser;
    }

    /**
     * Sets the value of the cmbMbrChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrChangeUser(JAXBElement<String> value) {
        this.cmbMbrChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrChangeDate() {
        return cmbMbrChangeDate;
    }

    /**
     * Sets the value of the cmbMbrChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrChangeDate(JAXBElement<String> value) {
        this.cmbMbrChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCmbMbrDeleteFlag() {
        return cmbMbrDeleteFlag;
    }

    /**
     * Sets the value of the cmbMbrDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCmbMbrDeleteFlag(JAXBElement<Short> value) {
        this.cmbMbrDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cmbMbrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrKey() {
        return cmbMbrKey;
    }

    /**
     * Sets the value of the cmbMbrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrKey(JAXBElement<String> value) {
        this.cmbMbrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrKeyExt() {
        return cmbMbrKeyExt;
    }

    /**
     * Sets the value of the cmbMbrKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrKeyExt(JAXBElement<String> value) {
        this.cmbMbrKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrCstKey() {
        return cmbMbrCstKey;
    }

    /**
     * Sets the value of the cmbMbrCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrCstKey(JAXBElement<String> value) {
        this.cmbMbrCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrOptOut property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCmbMbrOptOut() {
        return cmbMbrOptOut;
    }

    /**
     * Sets the value of the cmbMbrOptOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCmbMbrOptOut(JAXBElement<Short> value) {
        this.cmbMbrOptOut = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cmbMbrMbtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrMbtKey() {
        return cmbMbrMbtKey;
    }

    /**
     * Sets the value of the cmbMbrMbtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrMbtKey(JAXBElement<String> value) {
        this.cmbMbrMbtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrMbsKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrMbsKey() {
        return cmbMbrMbsKey;
    }

    /**
     * Sets the value of the cmbMbrMbsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrMbsKey(JAXBElement<String> value) {
        this.cmbMbrMbsKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrPakPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrPakPrdKey() {
        return cmbMbrPakPrdKey;
    }

    /**
     * Sets the value of the cmbMbrPakPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrPakPrdKey(JAXBElement<String> value) {
        this.cmbMbrPakPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrIndCstKeyReferral property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrIndCstKeyReferral() {
        return cmbMbrIndCstKeyReferral;
    }

    /**
     * Sets the value of the cmbMbrIndCstKeyReferral property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrIndCstKeyReferral(JAXBElement<String> value) {
        this.cmbMbrIndCstKeyReferral = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrPakPrdRenewalKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrPakPrdRenewalKey() {
        return cmbMbrPakPrdRenewalKey;
    }

    /**
     * Sets the value of the cmbMbrPakPrdRenewalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrPakPrdRenewalKey(JAXBElement<String> value) {
        this.cmbMbrPakPrdRenewalKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrDoNotRenewFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCmbMbrDoNotRenewFlag() {
        return cmbMbrDoNotRenewFlag;
    }

    /**
     * Sets the value of the cmbMbrDoNotRenewFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCmbMbrDoNotRenewFlag(JAXBElement<Short> value) {
        this.cmbMbrDoNotRenewFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cmbMbrInvoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrInvoiceDate() {
        return cmbMbrInvoiceDate;
    }

    /**
     * Sets the value of the cmbMbrInvoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrInvoiceDate(JAXBElement<String> value) {
        this.cmbMbrInvoiceDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrRejoinDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrRejoinDate() {
        return cmbMbrRejoinDate;
    }

    /**
     * Sets the value of the cmbMbrRejoinDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrRejoinDate(JAXBElement<String> value) {
        this.cmbMbrRejoinDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrPopup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrPopup() {
        return cmbMbrPopup;
    }

    /**
     * Sets the value of the cmbMbrPopup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrPopup(JAXBElement<String> value) {
        this.cmbMbrPopup = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrVotingRights property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCmbMbrVotingRights() {
        return cmbMbrVotingRights;
    }

    /**
     * Sets the value of the cmbMbrVotingRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCmbMbrVotingRights(JAXBElement<Short> value) {
        this.cmbMbrVotingRights = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cmbMbrChpCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrChpCstKey() {
        return cmbMbrChpCstKey;
    }

    /**
     * Sets the value of the cmbMbrChpCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrChpCstKey(JAXBElement<String> value) {
        this.cmbMbrChpCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrConvertedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCmbMbrConvertedFlag() {
        return cmbMbrConvertedFlag;
    }

    /**
     * Sets the value of the cmbMbrConvertedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCmbMbrConvertedFlag(JAXBElement<Short> value) {
        this.cmbMbrConvertedFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cmbMbrApprovalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCmbMbrApprovalFlag() {
        return cmbMbrApprovalFlag;
    }

    /**
     * Sets the value of the cmbMbrApprovalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCmbMbrApprovalFlag(JAXBElement<Short> value) {
        this.cmbMbrApprovalFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cmbMbrInstallmentFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCmbMbrInstallmentFrequency() {
        return cmbMbrInstallmentFrequency;
    }

    /**
     * Sets the value of the cmbMbrInstallmentFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCmbMbrInstallmentFrequency(JAXBElement<Integer> value) {
        this.cmbMbrInstallmentFrequency = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cmbMbrApprovalDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrApprovalDate() {
        return cmbMbrApprovalDate;
    }

    /**
     * Sets the value of the cmbMbrApprovalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrApprovalDate(JAXBElement<String> value) {
        this.cmbMbrApprovalDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrOrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrOrdKey() {
        return cmbMbrOrdKey;
    }

    /**
     * Sets the value of the cmbMbrOrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrOrdKey(JAXBElement<String> value) {
        this.cmbMbrOrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrMtrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrMtrKey() {
        return cmbMbrMtrKey;
    }

    /**
     * Sets the value of the cmbMbrMtrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrMtrKey(JAXBElement<String> value) {
        this.cmbMbrMtrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrTerminateReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrTerminateReason() {
        return cmbMbrTerminateReason;
    }

    /**
     * Sets the value of the cmbMbrTerminateReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrTerminateReason(JAXBElement<String> value) {
        this.cmbMbrTerminateReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrInstallmentFrequencyForRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCmbMbrInstallmentFrequencyForRenewal() {
        return cmbMbrInstallmentFrequencyForRenewal;
    }

    /**
     * Sets the value of the cmbMbrInstallmentFrequencyForRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCmbMbrInstallmentFrequencyForRenewal(JAXBElement<Integer> value) {
        this.cmbMbrInstallmentFrequencyForRenewal = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cmbMbrNumOfInstallmentsForRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCmbMbrNumOfInstallmentsForRenewal() {
        return cmbMbrNumOfInstallmentsForRenewal;
    }

    /**
     * Sets the value of the cmbMbrNumOfInstallmentsForRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCmbMbrNumOfInstallmentsForRenewal(JAXBElement<Integer> value) {
        this.cmbMbrNumOfInstallmentsForRenewal = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cmbMbrOrdAitKeyRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrOrdAitKeyRenewal() {
        return cmbMbrOrdAitKeyRenewal;
    }

    /**
     * Sets the value of the cmbMbrOrdAitKeyRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrOrdAitKeyRenewal(JAXBElement<String> value) {
        this.cmbMbrOrdAitKeyRenewal = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrMbrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrMbrKey() {
        return cmbMbrMbrKey;
    }

    /**
     * Sets the value of the cmbMbrMbrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrMbrKey(JAXBElement<String> value) {
        this.cmbMbrMbrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrProformaRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCmbMbrProformaRenewal() {
        return cmbMbrProformaRenewal;
    }

    /**
     * Sets the value of the cmbMbrProformaRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCmbMbrProformaRenewal(JAXBElement<Short> value) {
        this.cmbMbrProformaRenewal = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cmbMbrEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrEntityKey() {
        return cmbMbrEntityKey;
    }

    /**
     * Sets the value of the cmbMbrEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrEntityKey(JAXBElement<String> value) {
        this.cmbMbrEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrOrdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrOrdCode() {
        return cmbMbrOrdCode;
    }

    /**
     * Sets the value of the cmbMbrOrdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrOrdCode(JAXBElement<String> value) {
        this.cmbMbrOrdCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrOddKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrOddKey() {
        return cmbMbrOddKey;
    }

    /**
     * Sets the value of the cmbMbrOddKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrOddKey(JAXBElement<String> value) {
        this.cmbMbrOddKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrBunPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrBunPrdKey() {
        return cmbMbrBunPrdKey;
    }

    /**
     * Sets the value of the cmbMbrBunPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrBunPrdKey(JAXBElement<String> value) {
        this.cmbMbrBunPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrBunPrdRenewalKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrBunPrdRenewalKey() {
        return cmbMbrBunPrdRenewalKey;
    }

    /**
     * Sets the value of the cmbMbrBunPrdRenewalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrBunPrdRenewalKey(JAXBElement<String> value) {
        this.cmbMbrBunPrdRenewalKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrPrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrPrcKey() {
        return cmbMbrPrcKey;
    }

    /**
     * Sets the value of the cmbMbrPrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrPrcKey(JAXBElement<String> value) {
        this.cmbMbrPrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrBupKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrBupKey() {
        return cmbMbrBupKey;
    }

    /**
     * Sets the value of the cmbMbrBupKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrBupKey(JAXBElement<String> value) {
        this.cmbMbrBupKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrMbtRenewalKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrMbtRenewalKey() {
        return cmbMbrMbtRenewalKey;
    }

    /**
     * Sets the value of the cmbMbrMbtRenewalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrMbtRenewalKey(JAXBElement<String> value) {
        this.cmbMbrMbtRenewalKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrChpCstRenewalKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrChpCstRenewalKey() {
        return cmbMbrChpCstRenewalKey;
    }

    /**
     * Sets the value of the cmbMbrChpCstRenewalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrChpCstRenewalKey(JAXBElement<String> value) {
        this.cmbMbrChpCstRenewalKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrCpiKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmbMbrCpiKey() {
        return cmbMbrCpiKey;
    }

    /**
     * Sets the value of the cmbMbrCpiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmbMbrCpiKey(JAXBElement<String> value) {
        this.cmbMbrCpiKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmbMbrAutoPay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCmbMbrAutoPay() {
        return cmbMbrAutoPay;
    }

    /**
     * Sets the value of the cmbMbrAutoPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCmbMbrAutoPay(JAXBElement<Short> value) {
        this.cmbMbrAutoPay = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cmbMbrInstallmentPaymentsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCmbMbrInstallmentPaymentsFlag() {
        return cmbMbrInstallmentPaymentsFlag;
    }

    /**
     * Sets the value of the cmbMbrInstallmentPaymentsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCmbMbrInstallmentPaymentsFlag(JAXBElement<Short> value) {
        this.cmbMbrInstallmentPaymentsFlag = ((JAXBElement<Short> ) value);
    }

}
