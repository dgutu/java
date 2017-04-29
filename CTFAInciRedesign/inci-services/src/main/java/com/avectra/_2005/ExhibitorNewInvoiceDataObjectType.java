
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExhibitorNew_Invoice_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExhibitorNew_Invoice_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inv_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="inv_proforma" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="inv_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="inv_trx_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="inv_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="inv_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="inv_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="inv_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="inv_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="inv_code_count" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="inv_code_cp" type="{http://www.avectra.com/2005/}stringLength54_Type" minOccurs="0"/>
 *         &lt;element name="inv_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="inv_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="inv_ait_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="inv_print_count" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="inv_print_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="inv_print_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="inv_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="inv_med_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="inv_post_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="inv_notes_internal" type="{http://www.avectra.com/2005/}stringLength300_Type" minOccurs="0"/>
 *         &lt;element name="inv_bat_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="inv_notes_external" type="{http://www.avectra.com/2005/}stringLength300_Type" minOccurs="0"/>
 *         &lt;element name="inv_ship_on_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="inv_ship_priority" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="inv_po_number" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="inv_orig_trans_type" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="inv_fax_confirm_sent_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="inv_email_confirm_sent_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="inv_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="inv_cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="inv_cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="inv_eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="inv_pref_comm_meth" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="inv_billing_pref_comm_meth" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="inv_close_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="inv_bat_close_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="inv_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="inv_col_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="inv_cst_billing_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="inv_ind_cst_billing_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="inv_ord_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="inv_tracking_number" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="inv_group_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="inv_group_description" type="{http://www.avectra.com/2005/}stringLength300_Type" minOccurs="0"/>
 *         &lt;element name="inv_cur_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="inv_cust_doc_received_date_ext" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="inv_allow_installments" type="{http://www.avectra.com/2005/}booleanLength1_Type" minOccurs="0"/>
 *         &lt;element name="inv_sfo_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="inv_cert_send_to_embassy_date_ext" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="inv_cert_send_to_cust_date_ext" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="inv_AutoRefund" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="inv_eweb_credit_available" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="inv_send_email_confirmation" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="inv_eweb_apply_credit_amount" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="inv_send_fax_confirmation" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="inv_adjustment_reason" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="inv_collection_status" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="inv_cty_code" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="inv_NewBatch_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="inv_email_bcc" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="inv_total" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="inv_amount" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="inv_balance" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="inv_close_opportunity" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="inv_payment_to_apply" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="inv_convertedamount" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="inv_nettotal" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="inv_netpayment" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="inv_credit_to_apply" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="inv_netbalance" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="inv_netcredit" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="inv_net_amount_due" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="inv_netunpaidbalance" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="inv_netwriteoff" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="inv_writeoff_to_apply" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="inv_netreturn" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="inv_return_to_apply" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="inv_netapplied" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="inv_total_to_apply" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="inv_next_invoice_date" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="inv_select_all" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="inv_details_html" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="inv_details_text" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="inv_details_with_customer_html" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="inv_autoapply" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="inv_autoapplypayment" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="inv_installment_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="inv_coe_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="inv_shippable_total" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="inv_unapplied_shipping_total" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="inv_shippable_items_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="inv_create_mail_record" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="inv_invoice_detail_count" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="inv_bill_me" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="inv_HasNewLineItems" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="inv_HasOldLineItems" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="inv_total_weight" type="{http://www.avectra.com/2005/}decimal_Type" minOccurs="0"/>
 *         &lt;element name="inv_discount" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="inv_shipping" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="inv_tax" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="inv_prd_keys" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="inv_currency_readonly" type="{http://www.avectra.com/2005/}stringLength1_Type" minOccurs="0"/>
 *         &lt;element name="inv_cur_exchange_rate" type="{http://www.avectra.com/2005/}av_decimal_Type" minOccurs="0"/>
 *         &lt;element name="inv_use_payment_to_apply_field" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExhibitorNew_Invoice_DataObjectType", propOrder = {
    "invKey",
    "invProforma",
    "invCode",
    "invTrxDate",
    "invCstKey",
    "invAddUser",
    "invAddDate",
    "invChangeUser",
    "invChangeDate",
    "invCodeCount",
    "invCodeCp",
    "invDeleteFlag",
    "invKeyExt",
    "invAitKey",
    "invPrintCount",
    "invPrintDate",
    "invPrintUser",
    "invSrcKey",
    "invMedKey",
    "invPostFlag",
    "invNotesInternal",
    "invBatKey",
    "invNotesExternal",
    "invShipOnDate",
    "invShipPriority",
    "invPoNumber",
    "invOrigTransType",
    "invFaxConfirmSentFlag",
    "invEmailConfirmSentFlag",
    "invCxaKey",
    "invCphKey",
    "invCfxKey",
    "invEmlKey",
    "invPrefCommMeth",
    "invBillingPrefCommMeth",
    "invCloseFlag",
    "invBatCloseFlag",
    "invEntityKey",
    "invColKey",
    "invCstBillingKey",
    "invIndCstBillingKey",
    "invOrdKey",
    "invTrackingNumber",
    "invGroupFlag",
    "invGroupDescription",
    "invCurKey",
    "invCustDocReceivedDateExt",
    "invAllowInstallments",
    "invSfoKey",
    "invCertSendToEmbassyDateExt",
    "invCertSendToCustDateExt",
    "invAutoRefund",
    "invEwebCreditAvailable",
    "invSendEmailConfirmation",
    "invEwebApplyCreditAmount",
    "invSendFaxConfirmation",
    "invAdjustmentReason",
    "invCollectionStatus",
    "invCtyCode",
    "invNewBatchKey",
    "invEmailBcc",
    "invTotal",
    "invAmount",
    "invBalance",
    "invCloseOpportunity",
    "invPaymentToApply",
    "invConvertedamount",
    "invNettotal",
    "invNetpayment",
    "invCreditToApply",
    "invNetbalance",
    "invNetcredit",
    "invNetAmountDue",
    "invNetunpaidbalance",
    "invNetwriteoff",
    "invWriteoffToApply",
    "invNetreturn",
    "invReturnToApply",
    "invNetapplied",
    "invTotalToApply",
    "invNextInvoiceDate",
    "invSelectAll",
    "invDetailsHtml",
    "invDetailsText",
    "invDetailsWithCustomerHtml",
    "invAutoapply",
    "invAutoapplypayment",
    "invInstallmentFlag",
    "invCoeFlag",
    "invShippableTotal",
    "invUnappliedShippingTotal",
    "invShippableItemsFlag",
    "invCreateMailRecord",
    "invInvoiceDetailCount",
    "invBillMe",
    "invHasNewLineItems",
    "invHasOldLineItems",
    "invTotalWeight",
    "invDiscount",
    "invShipping",
    "invTax",
    "invPrdKeys",
    "invCurrencyReadonly",
    "invCurExchangeRate",
    "invUsePaymentToApplyField"
})
public class ExhibitorNewInvoiceDataObjectType {

    @XmlElementRef(name = "inv_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invKey;
    @XmlElementRef(name = "inv_proforma", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> invProforma;
    @XmlElementRef(name = "inv_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invCode;
    @XmlElementRef(name = "inv_trx_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invTrxDate;
    @XmlElementRef(name = "inv_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invCstKey;
    @XmlElementRef(name = "inv_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invAddUser;
    @XmlElementRef(name = "inv_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invAddDate;
    @XmlElementRef(name = "inv_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invChangeUser;
    @XmlElementRef(name = "inv_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invChangeDate;
    @XmlElementRef(name = "inv_code_count", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> invCodeCount;
    @XmlElementRef(name = "inv_code_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invCodeCp;
    @XmlElementRef(name = "inv_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> invDeleteFlag;
    @XmlElementRef(name = "inv_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invKeyExt;
    @XmlElementRef(name = "inv_ait_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invAitKey;
    @XmlElementRef(name = "inv_print_count", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> invPrintCount;
    @XmlElementRef(name = "inv_print_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invPrintDate;
    @XmlElementRef(name = "inv_print_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invPrintUser;
    @XmlElementRef(name = "inv_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invSrcKey;
    @XmlElementRef(name = "inv_med_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invMedKey;
    @XmlElementRef(name = "inv_post_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> invPostFlag;
    @XmlElementRef(name = "inv_notes_internal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invNotesInternal;
    @XmlElementRef(name = "inv_bat_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invBatKey;
    @XmlElementRef(name = "inv_notes_external", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invNotesExternal;
    @XmlElementRef(name = "inv_ship_on_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invShipOnDate;
    @XmlElementRef(name = "inv_ship_priority", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> invShipPriority;
    @XmlElementRef(name = "inv_po_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invPoNumber;
    @XmlElementRef(name = "inv_orig_trans_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invOrigTransType;
    @XmlElementRef(name = "inv_fax_confirm_sent_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> invFaxConfirmSentFlag;
    @XmlElementRef(name = "inv_email_confirm_sent_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> invEmailConfirmSentFlag;
    @XmlElementRef(name = "inv_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invCxaKey;
    @XmlElementRef(name = "inv_cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invCphKey;
    @XmlElementRef(name = "inv_cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invCfxKey;
    @XmlElementRef(name = "inv_eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invEmlKey;
    @XmlElementRef(name = "inv_pref_comm_meth", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invPrefCommMeth;
    @XmlElementRef(name = "inv_billing_pref_comm_meth", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invBillingPrefCommMeth;
    @XmlElementRef(name = "inv_close_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> invCloseFlag;
    @XmlElementRef(name = "inv_bat_close_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> invBatCloseFlag;
    @XmlElementRef(name = "inv_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invEntityKey;
    @XmlElementRef(name = "inv_col_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invColKey;
    @XmlElementRef(name = "inv_cst_billing_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invCstBillingKey;
    @XmlElementRef(name = "inv_ind_cst_billing_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invIndCstBillingKey;
    @XmlElementRef(name = "inv_ord_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invOrdKey;
    @XmlElementRef(name = "inv_tracking_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invTrackingNumber;
    @XmlElementRef(name = "inv_group_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> invGroupFlag;
    @XmlElementRef(name = "inv_group_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invGroupDescription;
    @XmlElementRef(name = "inv_cur_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invCurKey;
    @XmlElementRef(name = "inv_cust_doc_received_date_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invCustDocReceivedDateExt;
    @XmlElementRef(name = "inv_allow_installments", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Boolean> invAllowInstallments;
    @XmlElementRef(name = "inv_sfo_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invSfoKey;
    @XmlElementRef(name = "inv_cert_send_to_embassy_date_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invCertSendToEmbassyDateExt;
    @XmlElementRef(name = "inv_cert_send_to_cust_date_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invCertSendToCustDateExt;
    @XmlElementRef(name = "inv_AutoRefund", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> invAutoRefund;
    @XmlElementRef(name = "inv_eweb_credit_available", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invEwebCreditAvailable;
    @XmlElementRef(name = "inv_send_email_confirmation", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> invSendEmailConfirmation;
    @XmlElementRef(name = "inv_eweb_apply_credit_amount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invEwebApplyCreditAmount;
    @XmlElementRef(name = "inv_send_fax_confirmation", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> invSendFaxConfirmation;
    @XmlElementRef(name = "inv_adjustment_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invAdjustmentReason;
    @XmlElementRef(name = "inv_collection_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invCollectionStatus;
    @XmlElementRef(name = "inv_cty_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invCtyCode;
    @XmlElementRef(name = "inv_NewBatch_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invNewBatchKey;
    @XmlElementRef(name = "inv_email_bcc", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invEmailBcc;
    @XmlElementRef(name = "inv_total", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invTotal;
    @XmlElementRef(name = "inv_amount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invAmount;
    @XmlElementRef(name = "inv_balance", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invBalance;
    @XmlElementRef(name = "inv_close_opportunity", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> invCloseOpportunity;
    @XmlElementRef(name = "inv_payment_to_apply", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invPaymentToApply;
    @XmlElementRef(name = "inv_convertedamount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invConvertedamount;
    @XmlElementRef(name = "inv_nettotal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invNettotal;
    @XmlElementRef(name = "inv_netpayment", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invNetpayment;
    @XmlElementRef(name = "inv_credit_to_apply", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invCreditToApply;
    @XmlElementRef(name = "inv_netbalance", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invNetbalance;
    @XmlElementRef(name = "inv_netcredit", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invNetcredit;
    @XmlElementRef(name = "inv_net_amount_due", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invNetAmountDue;
    @XmlElementRef(name = "inv_netunpaidbalance", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invNetunpaidbalance;
    @XmlElementRef(name = "inv_netwriteoff", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invNetwriteoff;
    @XmlElementRef(name = "inv_writeoff_to_apply", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invWriteoffToApply;
    @XmlElementRef(name = "inv_netreturn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invNetreturn;
    @XmlElementRef(name = "inv_return_to_apply", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invReturnToApply;
    @XmlElementRef(name = "inv_netapplied", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invNetapplied;
    @XmlElementRef(name = "inv_total_to_apply", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invTotalToApply;
    @XmlElementRef(name = "inv_next_invoice_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invNextInvoiceDate;
    @XmlElementRef(name = "inv_select_all", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> invSelectAll;
    @XmlElementRef(name = "inv_details_html", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invDetailsHtml;
    @XmlElementRef(name = "inv_details_text", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invDetailsText;
    @XmlElementRef(name = "inv_details_with_customer_html", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invDetailsWithCustomerHtml;
    @XmlElementRef(name = "inv_autoapply", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> invAutoapply;
    @XmlElementRef(name = "inv_autoapplypayment", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> invAutoapplypayment;
    @XmlElementRef(name = "inv_installment_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> invInstallmentFlag;
    @XmlElementRef(name = "inv_coe_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> invCoeFlag;
    @XmlElementRef(name = "inv_shippable_total", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invShippableTotal;
    @XmlElementRef(name = "inv_unapplied_shipping_total", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invUnappliedShippingTotal;
    @XmlElementRef(name = "inv_shippable_items_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> invShippableItemsFlag;
    @XmlElementRef(name = "inv_create_mail_record", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> invCreateMailRecord;
    @XmlElementRef(name = "inv_invoice_detail_count", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> invInvoiceDetailCount;
    @XmlElementRef(name = "inv_bill_me", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> invBillMe;
    @XmlElementRef(name = "inv_HasNewLineItems", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> invHasNewLineItems;
    @XmlElementRef(name = "inv_HasOldLineItems", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> invHasOldLineItems;
    @XmlElementRef(name = "inv_total_weight", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invTotalWeight;
    @XmlElementRef(name = "inv_discount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invDiscount;
    @XmlElementRef(name = "inv_shipping", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invShipping;
    @XmlElementRef(name = "inv_tax", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> invTax;
    @XmlElementRef(name = "inv_prd_keys", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invPrdKeys;
    @XmlElementRef(name = "inv_currency_readonly", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invCurrencyReadonly;
    @XmlElementRef(name = "inv_cur_exchange_rate", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invCurExchangeRate;
    @XmlElementRef(name = "inv_use_payment_to_apply_field", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> invUsePaymentToApplyField;

    /**
     * Gets the value of the invKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvKey() {
        return invKey;
    }

    /**
     * Sets the value of the invKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvKey(JAXBElement<String> value) {
        this.invKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invProforma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getInvProforma() {
        return invProforma;
    }

    /**
     * Sets the value of the invProforma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setInvProforma(JAXBElement<Short> value) {
        this.invProforma = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the invCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvCode() {
        return invCode;
    }

    /**
     * Sets the value of the invCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvCode(JAXBElement<String> value) {
        this.invCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvTrxDate() {
        return invTrxDate;
    }

    /**
     * Sets the value of the invTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvTrxDate(JAXBElement<String> value) {
        this.invTrxDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvCstKey() {
        return invCstKey;
    }

    /**
     * Sets the value of the invCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvCstKey(JAXBElement<String> value) {
        this.invCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvAddUser() {
        return invAddUser;
    }

    /**
     * Sets the value of the invAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvAddUser(JAXBElement<String> value) {
        this.invAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvAddDate() {
        return invAddDate;
    }

    /**
     * Sets the value of the invAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvAddDate(JAXBElement<String> value) {
        this.invAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvChangeUser() {
        return invChangeUser;
    }

    /**
     * Sets the value of the invChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvChangeUser(JAXBElement<String> value) {
        this.invChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvChangeDate() {
        return invChangeDate;
    }

    /**
     * Sets the value of the invChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvChangeDate(JAXBElement<String> value) {
        this.invChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invCodeCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInvCodeCount() {
        return invCodeCount;
    }

    /**
     * Sets the value of the invCodeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInvCodeCount(JAXBElement<Integer> value) {
        this.invCodeCount = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the invCodeCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvCodeCp() {
        return invCodeCp;
    }

    /**
     * Sets the value of the invCodeCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvCodeCp(JAXBElement<String> value) {
        this.invCodeCp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getInvDeleteFlag() {
        return invDeleteFlag;
    }

    /**
     * Sets the value of the invDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setInvDeleteFlag(JAXBElement<Short> value) {
        this.invDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the invKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvKeyExt() {
        return invKeyExt;
    }

    /**
     * Sets the value of the invKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvKeyExt(JAXBElement<String> value) {
        this.invKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invAitKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvAitKey() {
        return invAitKey;
    }

    /**
     * Sets the value of the invAitKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvAitKey(JAXBElement<String> value) {
        this.invAitKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invPrintCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInvPrintCount() {
        return invPrintCount;
    }

    /**
     * Sets the value of the invPrintCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInvPrintCount(JAXBElement<Integer> value) {
        this.invPrintCount = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the invPrintDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvPrintDate() {
        return invPrintDate;
    }

    /**
     * Sets the value of the invPrintDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvPrintDate(JAXBElement<String> value) {
        this.invPrintDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invPrintUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvPrintUser() {
        return invPrintUser;
    }

    /**
     * Sets the value of the invPrintUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvPrintUser(JAXBElement<String> value) {
        this.invPrintUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvSrcKey() {
        return invSrcKey;
    }

    /**
     * Sets the value of the invSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvSrcKey(JAXBElement<String> value) {
        this.invSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invMedKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvMedKey() {
        return invMedKey;
    }

    /**
     * Sets the value of the invMedKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvMedKey(JAXBElement<String> value) {
        this.invMedKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invPostFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getInvPostFlag() {
        return invPostFlag;
    }

    /**
     * Sets the value of the invPostFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setInvPostFlag(JAXBElement<Short> value) {
        this.invPostFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the invNotesInternal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvNotesInternal() {
        return invNotesInternal;
    }

    /**
     * Sets the value of the invNotesInternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvNotesInternal(JAXBElement<String> value) {
        this.invNotesInternal = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invBatKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvBatKey() {
        return invBatKey;
    }

    /**
     * Sets the value of the invBatKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvBatKey(JAXBElement<String> value) {
        this.invBatKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invNotesExternal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvNotesExternal() {
        return invNotesExternal;
    }

    /**
     * Sets the value of the invNotesExternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvNotesExternal(JAXBElement<String> value) {
        this.invNotesExternal = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invShipOnDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvShipOnDate() {
        return invShipOnDate;
    }

    /**
     * Sets the value of the invShipOnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvShipOnDate(JAXBElement<String> value) {
        this.invShipOnDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invShipPriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInvShipPriority() {
        return invShipPriority;
    }

    /**
     * Sets the value of the invShipPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInvShipPriority(JAXBElement<Integer> value) {
        this.invShipPriority = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the invPoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvPoNumber() {
        return invPoNumber;
    }

    /**
     * Sets the value of the invPoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvPoNumber(JAXBElement<String> value) {
        this.invPoNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invOrigTransType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvOrigTransType() {
        return invOrigTransType;
    }

    /**
     * Sets the value of the invOrigTransType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvOrigTransType(JAXBElement<String> value) {
        this.invOrigTransType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invFaxConfirmSentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getInvFaxConfirmSentFlag() {
        return invFaxConfirmSentFlag;
    }

    /**
     * Sets the value of the invFaxConfirmSentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setInvFaxConfirmSentFlag(JAXBElement<Short> value) {
        this.invFaxConfirmSentFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the invEmailConfirmSentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getInvEmailConfirmSentFlag() {
        return invEmailConfirmSentFlag;
    }

    /**
     * Sets the value of the invEmailConfirmSentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setInvEmailConfirmSentFlag(JAXBElement<Short> value) {
        this.invEmailConfirmSentFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the invCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvCxaKey() {
        return invCxaKey;
    }

    /**
     * Sets the value of the invCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvCxaKey(JAXBElement<String> value) {
        this.invCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invCphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvCphKey() {
        return invCphKey;
    }

    /**
     * Sets the value of the invCphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvCphKey(JAXBElement<String> value) {
        this.invCphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invCfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvCfxKey() {
        return invCfxKey;
    }

    /**
     * Sets the value of the invCfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvCfxKey(JAXBElement<String> value) {
        this.invCfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invEmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvEmlKey() {
        return invEmlKey;
    }

    /**
     * Sets the value of the invEmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvEmlKey(JAXBElement<String> value) {
        this.invEmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invPrefCommMeth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvPrefCommMeth() {
        return invPrefCommMeth;
    }

    /**
     * Sets the value of the invPrefCommMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvPrefCommMeth(JAXBElement<String> value) {
        this.invPrefCommMeth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invBillingPrefCommMeth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvBillingPrefCommMeth() {
        return invBillingPrefCommMeth;
    }

    /**
     * Sets the value of the invBillingPrefCommMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvBillingPrefCommMeth(JAXBElement<String> value) {
        this.invBillingPrefCommMeth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invCloseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getInvCloseFlag() {
        return invCloseFlag;
    }

    /**
     * Sets the value of the invCloseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setInvCloseFlag(JAXBElement<Short> value) {
        this.invCloseFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the invBatCloseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getInvBatCloseFlag() {
        return invBatCloseFlag;
    }

    /**
     * Sets the value of the invBatCloseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setInvBatCloseFlag(JAXBElement<Short> value) {
        this.invBatCloseFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the invEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvEntityKey() {
        return invEntityKey;
    }

    /**
     * Sets the value of the invEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvEntityKey(JAXBElement<String> value) {
        this.invEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invColKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvColKey() {
        return invColKey;
    }

    /**
     * Sets the value of the invColKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvColKey(JAXBElement<String> value) {
        this.invColKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invCstBillingKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvCstBillingKey() {
        return invCstBillingKey;
    }

    /**
     * Sets the value of the invCstBillingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvCstBillingKey(JAXBElement<String> value) {
        this.invCstBillingKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invIndCstBillingKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvIndCstBillingKey() {
        return invIndCstBillingKey;
    }

    /**
     * Sets the value of the invIndCstBillingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvIndCstBillingKey(JAXBElement<String> value) {
        this.invIndCstBillingKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invOrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvOrdKey() {
        return invOrdKey;
    }

    /**
     * Sets the value of the invOrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvOrdKey(JAXBElement<String> value) {
        this.invOrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvTrackingNumber() {
        return invTrackingNumber;
    }

    /**
     * Sets the value of the invTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvTrackingNumber(JAXBElement<String> value) {
        this.invTrackingNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invGroupFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getInvGroupFlag() {
        return invGroupFlag;
    }

    /**
     * Sets the value of the invGroupFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setInvGroupFlag(JAXBElement<Short> value) {
        this.invGroupFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the invGroupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvGroupDescription() {
        return invGroupDescription;
    }

    /**
     * Sets the value of the invGroupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvGroupDescription(JAXBElement<String> value) {
        this.invGroupDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invCurKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvCurKey() {
        return invCurKey;
    }

    /**
     * Sets the value of the invCurKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvCurKey(JAXBElement<String> value) {
        this.invCurKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invCustDocReceivedDateExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvCustDocReceivedDateExt() {
        return invCustDocReceivedDateExt;
    }

    /**
     * Sets the value of the invCustDocReceivedDateExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvCustDocReceivedDateExt(JAXBElement<String> value) {
        this.invCustDocReceivedDateExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invAllowInstallments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInvAllowInstallments() {
        return invAllowInstallments;
    }

    /**
     * Sets the value of the invAllowInstallments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInvAllowInstallments(JAXBElement<Boolean> value) {
        this.invAllowInstallments = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the invSfoKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvSfoKey() {
        return invSfoKey;
    }

    /**
     * Sets the value of the invSfoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvSfoKey(JAXBElement<String> value) {
        this.invSfoKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invCertSendToEmbassyDateExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvCertSendToEmbassyDateExt() {
        return invCertSendToEmbassyDateExt;
    }

    /**
     * Sets the value of the invCertSendToEmbassyDateExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvCertSendToEmbassyDateExt(JAXBElement<String> value) {
        this.invCertSendToEmbassyDateExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invCertSendToCustDateExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvCertSendToCustDateExt() {
        return invCertSendToCustDateExt;
    }

    /**
     * Sets the value of the invCertSendToCustDateExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvCertSendToCustDateExt(JAXBElement<String> value) {
        this.invCertSendToCustDateExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invAutoRefund property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getInvAutoRefund() {
        return invAutoRefund;
    }

    /**
     * Sets the value of the invAutoRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setInvAutoRefund(JAXBElement<Short> value) {
        this.invAutoRefund = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the invEwebCreditAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvEwebCreditAvailable() {
        return invEwebCreditAvailable;
    }

    /**
     * Sets the value of the invEwebCreditAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvEwebCreditAvailable(JAXBElement<BigDecimal> value) {
        this.invEwebCreditAvailable = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invSendEmailConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getInvSendEmailConfirmation() {
        return invSendEmailConfirmation;
    }

    /**
     * Sets the value of the invSendEmailConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setInvSendEmailConfirmation(JAXBElement<Short> value) {
        this.invSendEmailConfirmation = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the invEwebApplyCreditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvEwebApplyCreditAmount() {
        return invEwebApplyCreditAmount;
    }

    /**
     * Sets the value of the invEwebApplyCreditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvEwebApplyCreditAmount(JAXBElement<BigDecimal> value) {
        this.invEwebApplyCreditAmount = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invSendFaxConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getInvSendFaxConfirmation() {
        return invSendFaxConfirmation;
    }

    /**
     * Sets the value of the invSendFaxConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setInvSendFaxConfirmation(JAXBElement<Short> value) {
        this.invSendFaxConfirmation = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the invAdjustmentReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvAdjustmentReason() {
        return invAdjustmentReason;
    }

    /**
     * Sets the value of the invAdjustmentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvAdjustmentReason(JAXBElement<String> value) {
        this.invAdjustmentReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invCollectionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvCollectionStatus() {
        return invCollectionStatus;
    }

    /**
     * Sets the value of the invCollectionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvCollectionStatus(JAXBElement<String> value) {
        this.invCollectionStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invCtyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvCtyCode() {
        return invCtyCode;
    }

    /**
     * Sets the value of the invCtyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvCtyCode(JAXBElement<String> value) {
        this.invCtyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invNewBatchKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvNewBatchKey() {
        return invNewBatchKey;
    }

    /**
     * Sets the value of the invNewBatchKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvNewBatchKey(JAXBElement<String> value) {
        this.invNewBatchKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invEmailBcc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvEmailBcc() {
        return invEmailBcc;
    }

    /**
     * Sets the value of the invEmailBcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvEmailBcc(JAXBElement<String> value) {
        this.invEmailBcc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvTotal() {
        return invTotal;
    }

    /**
     * Sets the value of the invTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvTotal(JAXBElement<BigDecimal> value) {
        this.invTotal = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvAmount() {
        return invAmount;
    }

    /**
     * Sets the value of the invAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvAmount(JAXBElement<BigDecimal> value) {
        this.invAmount = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvBalance() {
        return invBalance;
    }

    /**
     * Sets the value of the invBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvBalance(JAXBElement<BigDecimal> value) {
        this.invBalance = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invCloseOpportunity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getInvCloseOpportunity() {
        return invCloseOpportunity;
    }

    /**
     * Sets the value of the invCloseOpportunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setInvCloseOpportunity(JAXBElement<Short> value) {
        this.invCloseOpportunity = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the invPaymentToApply property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvPaymentToApply() {
        return invPaymentToApply;
    }

    /**
     * Sets the value of the invPaymentToApply property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvPaymentToApply(JAXBElement<BigDecimal> value) {
        this.invPaymentToApply = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invConvertedamount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvConvertedamount() {
        return invConvertedamount;
    }

    /**
     * Sets the value of the invConvertedamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvConvertedamount(JAXBElement<String> value) {
        this.invConvertedamount = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invNettotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvNettotal() {
        return invNettotal;
    }

    /**
     * Sets the value of the invNettotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvNettotal(JAXBElement<BigDecimal> value) {
        this.invNettotal = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invNetpayment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvNetpayment() {
        return invNetpayment;
    }

    /**
     * Sets the value of the invNetpayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvNetpayment(JAXBElement<BigDecimal> value) {
        this.invNetpayment = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invCreditToApply property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvCreditToApply() {
        return invCreditToApply;
    }

    /**
     * Sets the value of the invCreditToApply property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvCreditToApply(JAXBElement<BigDecimal> value) {
        this.invCreditToApply = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invNetbalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvNetbalance() {
        return invNetbalance;
    }

    /**
     * Sets the value of the invNetbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvNetbalance(JAXBElement<BigDecimal> value) {
        this.invNetbalance = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invNetcredit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvNetcredit() {
        return invNetcredit;
    }

    /**
     * Sets the value of the invNetcredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvNetcredit(JAXBElement<BigDecimal> value) {
        this.invNetcredit = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invNetAmountDue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvNetAmountDue() {
        return invNetAmountDue;
    }

    /**
     * Sets the value of the invNetAmountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvNetAmountDue(JAXBElement<BigDecimal> value) {
        this.invNetAmountDue = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invNetunpaidbalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvNetunpaidbalance() {
        return invNetunpaidbalance;
    }

    /**
     * Sets the value of the invNetunpaidbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvNetunpaidbalance(JAXBElement<BigDecimal> value) {
        this.invNetunpaidbalance = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invNetwriteoff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvNetwriteoff() {
        return invNetwriteoff;
    }

    /**
     * Sets the value of the invNetwriteoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvNetwriteoff(JAXBElement<BigDecimal> value) {
        this.invNetwriteoff = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invWriteoffToApply property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvWriteoffToApply() {
        return invWriteoffToApply;
    }

    /**
     * Sets the value of the invWriteoffToApply property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvWriteoffToApply(JAXBElement<BigDecimal> value) {
        this.invWriteoffToApply = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invNetreturn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvNetreturn() {
        return invNetreturn;
    }

    /**
     * Sets the value of the invNetreturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvNetreturn(JAXBElement<BigDecimal> value) {
        this.invNetreturn = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invReturnToApply property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvReturnToApply() {
        return invReturnToApply;
    }

    /**
     * Sets the value of the invReturnToApply property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvReturnToApply(JAXBElement<BigDecimal> value) {
        this.invReturnToApply = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invNetapplied property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvNetapplied() {
        return invNetapplied;
    }

    /**
     * Sets the value of the invNetapplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvNetapplied(JAXBElement<BigDecimal> value) {
        this.invNetapplied = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invTotalToApply property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvTotalToApply() {
        return invTotalToApply;
    }

    /**
     * Sets the value of the invTotalToApply property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvTotalToApply(JAXBElement<BigDecimal> value) {
        this.invTotalToApply = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invNextInvoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvNextInvoiceDate() {
        return invNextInvoiceDate;
    }

    /**
     * Sets the value of the invNextInvoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvNextInvoiceDate(JAXBElement<String> value) {
        this.invNextInvoiceDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invSelectAll property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getInvSelectAll() {
        return invSelectAll;
    }

    /**
     * Sets the value of the invSelectAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setInvSelectAll(JAXBElement<Short> value) {
        this.invSelectAll = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the invDetailsHtml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvDetailsHtml() {
        return invDetailsHtml;
    }

    /**
     * Sets the value of the invDetailsHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvDetailsHtml(JAXBElement<String> value) {
        this.invDetailsHtml = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invDetailsText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvDetailsText() {
        return invDetailsText;
    }

    /**
     * Sets the value of the invDetailsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvDetailsText(JAXBElement<String> value) {
        this.invDetailsText = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invDetailsWithCustomerHtml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvDetailsWithCustomerHtml() {
        return invDetailsWithCustomerHtml;
    }

    /**
     * Sets the value of the invDetailsWithCustomerHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvDetailsWithCustomerHtml(JAXBElement<String> value) {
        this.invDetailsWithCustomerHtml = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invAutoapply property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getInvAutoapply() {
        return invAutoapply;
    }

    /**
     * Sets the value of the invAutoapply property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setInvAutoapply(JAXBElement<Short> value) {
        this.invAutoapply = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the invAutoapplypayment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getInvAutoapplypayment() {
        return invAutoapplypayment;
    }

    /**
     * Sets the value of the invAutoapplypayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setInvAutoapplypayment(JAXBElement<Short> value) {
        this.invAutoapplypayment = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the invInstallmentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getInvInstallmentFlag() {
        return invInstallmentFlag;
    }

    /**
     * Sets the value of the invInstallmentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setInvInstallmentFlag(JAXBElement<Short> value) {
        this.invInstallmentFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the invCoeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getInvCoeFlag() {
        return invCoeFlag;
    }

    /**
     * Sets the value of the invCoeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setInvCoeFlag(JAXBElement<Short> value) {
        this.invCoeFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the invShippableTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvShippableTotal() {
        return invShippableTotal;
    }

    /**
     * Sets the value of the invShippableTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvShippableTotal(JAXBElement<BigDecimal> value) {
        this.invShippableTotal = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invUnappliedShippingTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvUnappliedShippingTotal() {
        return invUnappliedShippingTotal;
    }

    /**
     * Sets the value of the invUnappliedShippingTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvUnappliedShippingTotal(JAXBElement<BigDecimal> value) {
        this.invUnappliedShippingTotal = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invShippableItemsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getInvShippableItemsFlag() {
        return invShippableItemsFlag;
    }

    /**
     * Sets the value of the invShippableItemsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setInvShippableItemsFlag(JAXBElement<Short> value) {
        this.invShippableItemsFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the invCreateMailRecord property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getInvCreateMailRecord() {
        return invCreateMailRecord;
    }

    /**
     * Sets the value of the invCreateMailRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setInvCreateMailRecord(JAXBElement<Short> value) {
        this.invCreateMailRecord = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the invInvoiceDetailCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInvInvoiceDetailCount() {
        return invInvoiceDetailCount;
    }

    /**
     * Sets the value of the invInvoiceDetailCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInvInvoiceDetailCount(JAXBElement<Integer> value) {
        this.invInvoiceDetailCount = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the invBillMe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getInvBillMe() {
        return invBillMe;
    }

    /**
     * Sets the value of the invBillMe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setInvBillMe(JAXBElement<Short> value) {
        this.invBillMe = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the invHasNewLineItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getInvHasNewLineItems() {
        return invHasNewLineItems;
    }

    /**
     * Sets the value of the invHasNewLineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setInvHasNewLineItems(JAXBElement<Short> value) {
        this.invHasNewLineItems = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the invHasOldLineItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getInvHasOldLineItems() {
        return invHasOldLineItems;
    }

    /**
     * Sets the value of the invHasOldLineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setInvHasOldLineItems(JAXBElement<Short> value) {
        this.invHasOldLineItems = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the invTotalWeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvTotalWeight() {
        return invTotalWeight;
    }

    /**
     * Sets the value of the invTotalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvTotalWeight(JAXBElement<BigDecimal> value) {
        this.invTotalWeight = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvDiscount() {
        return invDiscount;
    }

    /**
     * Sets the value of the invDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvDiscount(JAXBElement<BigDecimal> value) {
        this.invDiscount = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invShipping property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvShipping() {
        return invShipping;
    }

    /**
     * Sets the value of the invShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvShipping(JAXBElement<BigDecimal> value) {
        this.invShipping = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invTax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvTax() {
        return invTax;
    }

    /**
     * Sets the value of the invTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvTax(JAXBElement<BigDecimal> value) {
        this.invTax = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the invPrdKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvPrdKeys() {
        return invPrdKeys;
    }

    /**
     * Sets the value of the invPrdKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvPrdKeys(JAXBElement<String> value) {
        this.invPrdKeys = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invCurrencyReadonly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvCurrencyReadonly() {
        return invCurrencyReadonly;
    }

    /**
     * Sets the value of the invCurrencyReadonly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvCurrencyReadonly(JAXBElement<String> value) {
        this.invCurrencyReadonly = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invCurExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvCurExchangeRate() {
        return invCurExchangeRate;
    }

    /**
     * Sets the value of the invCurExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvCurExchangeRate(JAXBElement<String> value) {
        this.invCurExchangeRate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the invUsePaymentToApplyField property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getInvUsePaymentToApplyField() {
        return invUsePaymentToApplyField;
    }

    /**
     * Sets the value of the invUsePaymentToApplyField property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setInvUsePaymentToApplyField(JAXBElement<Short> value) {
        this.invUsePaymentToApplyField = ((JAXBElement<Short> ) value);
    }

}
