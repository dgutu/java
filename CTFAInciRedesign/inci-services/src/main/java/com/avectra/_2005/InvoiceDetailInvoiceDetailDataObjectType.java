
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceDetail_Invoice_Detail_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceDetail_Invoice_Detail_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ivd_qty_previous" type="{http://www.avectra.com/2005/}decimal_Type" minOccurs="0"/>
 *         &lt;element name="ivd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_inv_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_price" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_qty" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="ivd_approve_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ivd_approve_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ivd_void_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ivd_void_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ivd_ajd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ivd_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ivd_backorder_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ivd_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ivd_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ivd_inventory_held_qty" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="ivd_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ivd_ship_qty" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="ivd_ship_flag_cp" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ivd_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_close_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ivd_approve_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ivd_void_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ivd_prc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_prc_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_amount_cp" type="{http://www.avectra.com/2005/}decimal_Type" minOccurs="0"/>
 *         &lt;element name="ivd_parity" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ivd_parity_amount_cp" type="{http://www.avectra.com/2005/}decimal_Type" minOccurs="0"/>
 *         &lt;element name="ivd_gla_dr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_gla_cr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_notes" type="{http://www.avectra.com/2005/}stringLength300_Type" minOccurs="0"/>
 *         &lt;element name="ivd_cst_ship_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_prc_prd_ptp_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_type" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="ivd_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_ivw_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_odd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_do_not_fulfill" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ivd_pak_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_ods_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_account_number" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="ivd_ovr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_price_override_reason" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="ivd_pjt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_backorder_email_sent_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ivd_process_qty" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="ivd_bun_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_download_count" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ivd_eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_package_grouping_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_download_limit_override" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ivd_discount_program_ivd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_download_days_override" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ivd_available_for_cancel" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="ivd_available_for_return" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="ivd_balance_quantity" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="ivd_amount_due" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_createorder_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ivd_deferral_total_returned" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_lineamount" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_lineamount_no_discount" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_originallineamount" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_restock_fee_calculated" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_createinvoice_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ivd_linebalance" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_net_amount_due" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_payamount" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_payamount_noreturn" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_cancel_quantity" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="ivd_cancelled_quantity" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="ivd_default_credit_dollar_amount" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_deferral_number_periods" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_deferral_number_periods_recognized" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_deferral_price" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_DeferralBalance" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_minimum_quantity" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="ivd_reduce_quantity" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="ivd_return_quantity" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="ivd_returned_quantity" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="ivd_total_recognized" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_writeoff_dollar_amount" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_allow_change_qty_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ivd_credit_dollar_amount" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_allow_change_price_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ivd_auto_refund" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ivd_NewBatch_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_refund_credit_account" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_writeoff_deferral" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ivd_claim_quantity" type="{http://www.avectra.com/2005/}decimal_Type" minOccurs="0"/>
 *         &lt;element name="ivd_disable_quantity" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ivd_claimed_quantity" type="{http://www.avectra.com/2005/}decimal_Type" minOccurs="0"/>
 *         &lt;element name="ivd_claim_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ivd_subtotal" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_discountamount" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_total" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_unit_price_with_discount" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_applied_payment" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_applied_credit" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_write_off" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_return_payment" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_total_payment" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_balance" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_tax" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_shipping" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_nettotal" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_netpayment" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_payment_to_apply" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_credit_to_apply" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_netcredit" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_netwriteoff" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_writeoff_to_apply" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_netreturn" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_return_to_apply" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_netapplied" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_total_to_apply" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_netbalance" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_netunpaidbalance" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_price_aggregated" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_discountamount_aggregated" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_tax_aggregated" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_shipping_aggregated" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_nettotal_aggregated" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_netunpaidbalance_aggregated" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_subtotal_aggregated" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ivd_shippable_flag_aggregated" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ivd_partof_groupreg_discount" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ivd_booth_number" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="ivd_MulticurrencyKey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_pricingcontrol_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ivd_pricingcontrol_rgt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_term_based" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ivd_term_calendar" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ivd_TransactionCurrencyKey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_HomeCurrencyCode" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="ivd_autoapply" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ivd_cancel_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ivd_ivd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_formdetailkey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_formkey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_parentdataobject" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="ivd_reg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ivd_addl_info" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="ivd_shippable_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ivd_inv_shippable_total" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceDetail_Invoice_Detail_DataObjectType", propOrder = {
    "ivdQtyPrevious",
    "ivdKey",
    "ivdInvKey",
    "ivdPrice",
    "ivdQty",
    "ivdApproveDate",
    "ivdApproveUser",
    "ivdVoidDate",
    "ivdVoidUser",
    "ivdAjdKey",
    "ivdAddUser",
    "ivdAddDate",
    "ivdBackorderFlag",
    "ivdChangeUser",
    "ivdChangeDate",
    "ivdInventoryHeldQty",
    "ivdDeleteFlag",
    "ivdShipQty",
    "ivdShipFlagCp",
    "ivdKeyExt",
    "ivdCloseFlag",
    "ivdApproveFlag",
    "ivdVoidFlag",
    "ivdPrcKey",
    "ivdPrcPrdKey",
    "ivdAmountCp",
    "ivdParity",
    "ivdParityAmountCp",
    "ivdGlaDrKey",
    "ivdGlaCrKey",
    "ivdNotes",
    "ivdCstShipKey",
    "ivdPrcPrdPtpKey",
    "ivdCxaKey",
    "ivdSrcKey",
    "ivdType",
    "ivdEntityKey",
    "ivdIvwKey",
    "ivdOddKey",
    "ivdDoNotFulfill",
    "ivdPakPrdKey",
    "ivdOdsKey",
    "ivdCstKey",
    "ivdAccountNumber",
    "ivdOvrKey",
    "ivdPriceOverrideReason",
    "ivdPjtKey",
    "ivdBackorderEmailSentFlag",
    "ivdProcessQty",
    "ivdBunPrdKey",
    "ivdDownloadCount",
    "ivdEmlKey",
    "ivdPackageGroupingKey",
    "ivdDownloadLimitOverride",
    "ivdDiscountProgramIvdKey",
    "ivdDownloadDaysOverride",
    "ivdAvailableForCancel",
    "ivdAvailableForReturn",
    "ivdBalanceQuantity",
    "ivdAmountDue",
    "ivdCreateorderFlag",
    "ivdDeferralTotalReturned",
    "ivdLineamount",
    "ivdLineamountNoDiscount",
    "ivdOriginallineamount",
    "ivdRestockFeeCalculated",
    "ivdCreateinvoiceFlag",
    "ivdLinebalance",
    "ivdNetAmountDue",
    "ivdPayamount",
    "ivdPayamountNoreturn",
    "ivdCancelQuantity",
    "ivdCancelledQuantity",
    "ivdDefaultCreditDollarAmount",
    "ivdDeferralNumberPeriods",
    "ivdDeferralNumberPeriodsRecognized",
    "ivdDeferralPrice",
    "ivdDeferralBalance",
    "ivdMinimumQuantity",
    "ivdReduceQuantity",
    "ivdReturnQuantity",
    "ivdReturnedQuantity",
    "ivdTotalRecognized",
    "ivdWriteoffDollarAmount",
    "ivdAllowChangeQtyFlag",
    "ivdCreditDollarAmount",
    "ivdAllowChangePriceFlag",
    "ivdAutoRefund",
    "ivdNewBatchKey",
    "ivdRefundCreditAccount",
    "ivdWriteoffDeferral",
    "ivdClaimQuantity",
    "ivdDisableQuantity",
    "ivdClaimedQuantity",
    "ivdClaimFlag",
    "ivdSubtotal",
    "ivdDiscountamount",
    "ivdTotal",
    "ivdUnitPriceWithDiscount",
    "ivdAppliedPayment",
    "ivdAppliedCredit",
    "ivdWriteOff",
    "ivdReturnPayment",
    "ivdTotalPayment",
    "ivdBalance",
    "ivdTax",
    "ivdShipping",
    "ivdNettotal",
    "ivdNetpayment",
    "ivdPaymentToApply",
    "ivdCreditToApply",
    "ivdNetcredit",
    "ivdNetwriteoff",
    "ivdWriteoffToApply",
    "ivdNetreturn",
    "ivdReturnToApply",
    "ivdNetapplied",
    "ivdTotalToApply",
    "ivdNetbalance",
    "ivdNetunpaidbalance",
    "ivdPriceAggregated",
    "ivdDiscountamountAggregated",
    "ivdTaxAggregated",
    "ivdShippingAggregated",
    "ivdNettotalAggregated",
    "ivdNetunpaidbalanceAggregated",
    "ivdSubtotalAggregated",
    "ivdShippableFlagAggregated",
    "ivdPartofGroupregDiscount",
    "ivdBoothNumber",
    "ivdMulticurrencyKey",
    "ivdPricingcontrolDate",
    "ivdPricingcontrolRgtKey",
    "ivdTermBased",
    "ivdTermCalendar",
    "ivdTransactionCurrencyKey",
    "ivdHomeCurrencyCode",
    "ivdAutoapply",
    "ivdCancelFlag",
    "ivdIvdKey",
    "ivdFormdetailkey",
    "ivdFormkey",
    "ivdParentdataobject",
    "ivdRegKey",
    "ivdAddlInfo",
    "ivdShippableFlag",
    "ivdInvShippableTotal"
})
public class InvoiceDetailInvoiceDetailDataObjectType {

    @XmlElementRef(name = "ivd_qty_previous", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdQtyPrevious;
    @XmlElementRef(name = "ivd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdKey;
    @XmlElementRef(name = "ivd_inv_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdInvKey;
    @XmlElementRef(name = "ivd_price", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdPrice;
    @XmlElementRef(name = "ivd_qty", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdQty;
    @XmlElementRef(name = "ivd_approve_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdApproveDate;
    @XmlElementRef(name = "ivd_approve_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdApproveUser;
    @XmlElementRef(name = "ivd_void_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdVoidDate;
    @XmlElementRef(name = "ivd_void_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdVoidUser;
    @XmlElementRef(name = "ivd_ajd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdAjdKey;
    @XmlElementRef(name = "ivd_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdAddUser;
    @XmlElementRef(name = "ivd_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdAddDate;
    @XmlElementRef(name = "ivd_backorder_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ivdBackorderFlag;
    @XmlElementRef(name = "ivd_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdChangeUser;
    @XmlElementRef(name = "ivd_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdChangeDate;
    @XmlElementRef(name = "ivd_inventory_held_qty", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdInventoryHeldQty;
    @XmlElementRef(name = "ivd_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ivdDeleteFlag;
    @XmlElementRef(name = "ivd_ship_qty", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdShipQty;
    @XmlElementRef(name = "ivd_ship_flag_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> ivdShipFlagCp;
    @XmlElementRef(name = "ivd_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdKeyExt;
    @XmlElementRef(name = "ivd_close_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ivdCloseFlag;
    @XmlElementRef(name = "ivd_approve_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ivdApproveFlag;
    @XmlElementRef(name = "ivd_void_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ivdVoidFlag;
    @XmlElementRef(name = "ivd_prc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdPrcKey;
    @XmlElementRef(name = "ivd_prc_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdPrcPrdKey;
    @XmlElementRef(name = "ivd_amount_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdAmountCp;
    @XmlElementRef(name = "ivd_parity", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> ivdParity;
    @XmlElementRef(name = "ivd_parity_amount_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdParityAmountCp;
    @XmlElementRef(name = "ivd_gla_dr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdGlaDrKey;
    @XmlElementRef(name = "ivd_gla_cr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdGlaCrKey;
    @XmlElementRef(name = "ivd_notes", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdNotes;
    @XmlElementRef(name = "ivd_cst_ship_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdCstShipKey;
    @XmlElementRef(name = "ivd_prc_prd_ptp_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdPrcPrdPtpKey;
    @XmlElementRef(name = "ivd_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdCxaKey;
    @XmlElementRef(name = "ivd_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdSrcKey;
    @XmlElementRef(name = "ivd_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdType;
    @XmlElementRef(name = "ivd_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdEntityKey;
    @XmlElementRef(name = "ivd_ivw_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdIvwKey;
    @XmlElementRef(name = "ivd_odd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdOddKey;
    @XmlElementRef(name = "ivd_do_not_fulfill", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ivdDoNotFulfill;
    @XmlElementRef(name = "ivd_pak_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdPakPrdKey;
    @XmlElementRef(name = "ivd_ods_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdOdsKey;
    @XmlElementRef(name = "ivd_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdCstKey;
    @XmlElementRef(name = "ivd_account_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdAccountNumber;
    @XmlElementRef(name = "ivd_ovr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdOvrKey;
    @XmlElementRef(name = "ivd_price_override_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdPriceOverrideReason;
    @XmlElementRef(name = "ivd_pjt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdPjtKey;
    @XmlElementRef(name = "ivd_backorder_email_sent_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ivdBackorderEmailSentFlag;
    @XmlElementRef(name = "ivd_process_qty", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdProcessQty;
    @XmlElementRef(name = "ivd_bun_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdBunPrdKey;
    @XmlElementRef(name = "ivd_download_count", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> ivdDownloadCount;
    @XmlElementRef(name = "ivd_eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdEmlKey;
    @XmlElementRef(name = "ivd_package_grouping_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdPackageGroupingKey;
    @XmlElementRef(name = "ivd_download_limit_override", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> ivdDownloadLimitOverride;
    @XmlElementRef(name = "ivd_discount_program_ivd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdDiscountProgramIvdKey;
    @XmlElementRef(name = "ivd_download_days_override", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> ivdDownloadDaysOverride;
    @XmlElementRef(name = "ivd_available_for_cancel", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdAvailableForCancel;
    @XmlElementRef(name = "ivd_available_for_return", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdAvailableForReturn;
    @XmlElementRef(name = "ivd_balance_quantity", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdBalanceQuantity;
    @XmlElementRef(name = "ivd_amount_due", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdAmountDue;
    @XmlElementRef(name = "ivd_createorder_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ivdCreateorderFlag;
    @XmlElementRef(name = "ivd_deferral_total_returned", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdDeferralTotalReturned;
    @XmlElementRef(name = "ivd_lineamount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdLineamount;
    @XmlElementRef(name = "ivd_lineamount_no_discount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdLineamountNoDiscount;
    @XmlElementRef(name = "ivd_originallineamount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdOriginallineamount;
    @XmlElementRef(name = "ivd_restock_fee_calculated", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdRestockFeeCalculated;
    @XmlElementRef(name = "ivd_createinvoice_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ivdCreateinvoiceFlag;
    @XmlElementRef(name = "ivd_linebalance", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdLinebalance;
    @XmlElementRef(name = "ivd_net_amount_due", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdNetAmountDue;
    @XmlElementRef(name = "ivd_payamount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdPayamount;
    @XmlElementRef(name = "ivd_payamount_noreturn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdPayamountNoreturn;
    @XmlElementRef(name = "ivd_cancel_quantity", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdCancelQuantity;
    @XmlElementRef(name = "ivd_cancelled_quantity", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdCancelledQuantity;
    @XmlElementRef(name = "ivd_default_credit_dollar_amount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdDefaultCreditDollarAmount;
    @XmlElementRef(name = "ivd_deferral_number_periods", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdDeferralNumberPeriods;
    @XmlElementRef(name = "ivd_deferral_number_periods_recognized", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdDeferralNumberPeriodsRecognized;
    @XmlElementRef(name = "ivd_deferral_price", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdDeferralPrice;
    @XmlElementRef(name = "ivd_DeferralBalance", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdDeferralBalance;
    @XmlElementRef(name = "ivd_minimum_quantity", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdMinimumQuantity;
    @XmlElementRef(name = "ivd_reduce_quantity", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdReduceQuantity;
    @XmlElementRef(name = "ivd_return_quantity", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdReturnQuantity;
    @XmlElementRef(name = "ivd_returned_quantity", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdReturnedQuantity;
    @XmlElementRef(name = "ivd_total_recognized", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdTotalRecognized;
    @XmlElementRef(name = "ivd_writeoff_dollar_amount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdWriteoffDollarAmount;
    @XmlElementRef(name = "ivd_allow_change_qty_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ivdAllowChangeQtyFlag;
    @XmlElementRef(name = "ivd_credit_dollar_amount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdCreditDollarAmount;
    @XmlElementRef(name = "ivd_allow_change_price_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ivdAllowChangePriceFlag;
    @XmlElementRef(name = "ivd_auto_refund", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ivdAutoRefund;
    @XmlElementRef(name = "ivd_NewBatch_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdNewBatchKey;
    @XmlElementRef(name = "ivd_refund_credit_account", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdRefundCreditAccount;
    @XmlElementRef(name = "ivd_writeoff_deferral", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ivdWriteoffDeferral;
    @XmlElementRef(name = "ivd_claim_quantity", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdClaimQuantity;
    @XmlElementRef(name = "ivd_disable_quantity", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ivdDisableQuantity;
    @XmlElementRef(name = "ivd_claimed_quantity", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdClaimedQuantity;
    @XmlElementRef(name = "ivd_claim_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ivdClaimFlag;
    @XmlElementRef(name = "ivd_subtotal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdSubtotal;
    @XmlElementRef(name = "ivd_discountamount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdDiscountamount;
    @XmlElementRef(name = "ivd_total", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdTotal;
    @XmlElementRef(name = "ivd_unit_price_with_discount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdUnitPriceWithDiscount;
    @XmlElementRef(name = "ivd_applied_payment", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdAppliedPayment;
    @XmlElementRef(name = "ivd_applied_credit", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdAppliedCredit;
    @XmlElementRef(name = "ivd_write_off", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdWriteOff;
    @XmlElementRef(name = "ivd_return_payment", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdReturnPayment;
    @XmlElementRef(name = "ivd_total_payment", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdTotalPayment;
    @XmlElementRef(name = "ivd_balance", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdBalance;
    @XmlElementRef(name = "ivd_tax", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdTax;
    @XmlElementRef(name = "ivd_shipping", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdShipping;
    @XmlElementRef(name = "ivd_nettotal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdNettotal;
    @XmlElementRef(name = "ivd_netpayment", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdNetpayment;
    @XmlElementRef(name = "ivd_payment_to_apply", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdPaymentToApply;
    @XmlElementRef(name = "ivd_credit_to_apply", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdCreditToApply;
    @XmlElementRef(name = "ivd_netcredit", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdNetcredit;
    @XmlElementRef(name = "ivd_netwriteoff", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdNetwriteoff;
    @XmlElementRef(name = "ivd_writeoff_to_apply", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdWriteoffToApply;
    @XmlElementRef(name = "ivd_netreturn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdNetreturn;
    @XmlElementRef(name = "ivd_return_to_apply", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdReturnToApply;
    @XmlElementRef(name = "ivd_netapplied", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdNetapplied;
    @XmlElementRef(name = "ivd_total_to_apply", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdTotalToApply;
    @XmlElementRef(name = "ivd_netbalance", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdNetbalance;
    @XmlElementRef(name = "ivd_netunpaidbalance", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdNetunpaidbalance;
    @XmlElementRef(name = "ivd_price_aggregated", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdPriceAggregated;
    @XmlElementRef(name = "ivd_discountamount_aggregated", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdDiscountamountAggregated;
    @XmlElementRef(name = "ivd_tax_aggregated", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdTaxAggregated;
    @XmlElementRef(name = "ivd_shipping_aggregated", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdShippingAggregated;
    @XmlElementRef(name = "ivd_nettotal_aggregated", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdNettotalAggregated;
    @XmlElementRef(name = "ivd_netunpaidbalance_aggregated", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdNetunpaidbalanceAggregated;
    @XmlElementRef(name = "ivd_subtotal_aggregated", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdSubtotalAggregated;
    @XmlElementRef(name = "ivd_shippable_flag_aggregated", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ivdShippableFlagAggregated;
    @XmlElementRef(name = "ivd_partof_groupreg_discount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ivdPartofGroupregDiscount;
    @XmlElementRef(name = "ivd_booth_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdBoothNumber;
    @XmlElementRef(name = "ivd_MulticurrencyKey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdMulticurrencyKey;
    @XmlElementRef(name = "ivd_pricingcontrol_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdPricingcontrolDate;
    @XmlElementRef(name = "ivd_pricingcontrol_rgt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdPricingcontrolRgtKey;
    @XmlElementRef(name = "ivd_term_based", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ivdTermBased;
    @XmlElementRef(name = "ivd_term_calendar", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ivdTermCalendar;
    @XmlElementRef(name = "ivd_TransactionCurrencyKey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdTransactionCurrencyKey;
    @XmlElementRef(name = "ivd_HomeCurrencyCode", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdHomeCurrencyCode;
    @XmlElementRef(name = "ivd_autoapply", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ivdAutoapply;
    @XmlElementRef(name = "ivd_cancel_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ivdCancelFlag;
    @XmlElementRef(name = "ivd_ivd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdIvdKey;
    @XmlElementRef(name = "ivd_formdetailkey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdFormdetailkey;
    @XmlElementRef(name = "ivd_formkey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdFormkey;
    @XmlElementRef(name = "ivd_parentdataobject", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdParentdataobject;
    @XmlElementRef(name = "ivd_reg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdRegKey;
    @XmlElementRef(name = "ivd_addl_info", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ivdAddlInfo;
    @XmlElementRef(name = "ivd_shippable_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ivdShippableFlag;
    @XmlElementRef(name = "ivd_inv_shippable_total", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ivdInvShippableTotal;

    /**
     * Gets the value of the ivdQtyPrevious property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdQtyPrevious() {
        return ivdQtyPrevious;
    }

    /**
     * Sets the value of the ivdQtyPrevious property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdQtyPrevious(JAXBElement<BigDecimal> value) {
        this.ivdQtyPrevious = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdKey() {
        return ivdKey;
    }

    /**
     * Sets the value of the ivdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdKey(JAXBElement<String> value) {
        this.ivdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdInvKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdInvKey() {
        return ivdInvKey;
    }

    /**
     * Sets the value of the ivdInvKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdInvKey(JAXBElement<String> value) {
        this.ivdInvKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdPrice() {
        return ivdPrice;
    }

    /**
     * Sets the value of the ivdPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdPrice(JAXBElement<BigDecimal> value) {
        this.ivdPrice = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdQty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdQty() {
        return ivdQty;
    }

    /**
     * Sets the value of the ivdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdQty(JAXBElement<BigDecimal> value) {
        this.ivdQty = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdApproveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdApproveDate() {
        return ivdApproveDate;
    }

    /**
     * Sets the value of the ivdApproveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdApproveDate(JAXBElement<String> value) {
        this.ivdApproveDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdApproveUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdApproveUser() {
        return ivdApproveUser;
    }

    /**
     * Sets the value of the ivdApproveUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdApproveUser(JAXBElement<String> value) {
        this.ivdApproveUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdVoidDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdVoidDate() {
        return ivdVoidDate;
    }

    /**
     * Sets the value of the ivdVoidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdVoidDate(JAXBElement<String> value) {
        this.ivdVoidDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdVoidUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdVoidUser() {
        return ivdVoidUser;
    }

    /**
     * Sets the value of the ivdVoidUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdVoidUser(JAXBElement<String> value) {
        this.ivdVoidUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdAjdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdAjdKey() {
        return ivdAjdKey;
    }

    /**
     * Sets the value of the ivdAjdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdAjdKey(JAXBElement<String> value) {
        this.ivdAjdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdAddUser() {
        return ivdAddUser;
    }

    /**
     * Sets the value of the ivdAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdAddUser(JAXBElement<String> value) {
        this.ivdAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdAddDate() {
        return ivdAddDate;
    }

    /**
     * Sets the value of the ivdAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdAddDate(JAXBElement<String> value) {
        this.ivdAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdBackorderFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIvdBackorderFlag() {
        return ivdBackorderFlag;
    }

    /**
     * Sets the value of the ivdBackorderFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIvdBackorderFlag(JAXBElement<Short> value) {
        this.ivdBackorderFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ivdChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdChangeUser() {
        return ivdChangeUser;
    }

    /**
     * Sets the value of the ivdChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdChangeUser(JAXBElement<String> value) {
        this.ivdChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdChangeDate() {
        return ivdChangeDate;
    }

    /**
     * Sets the value of the ivdChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdChangeDate(JAXBElement<String> value) {
        this.ivdChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdInventoryHeldQty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdInventoryHeldQty() {
        return ivdInventoryHeldQty;
    }

    /**
     * Sets the value of the ivdInventoryHeldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdInventoryHeldQty(JAXBElement<BigDecimal> value) {
        this.ivdInventoryHeldQty = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIvdDeleteFlag() {
        return ivdDeleteFlag;
    }

    /**
     * Sets the value of the ivdDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIvdDeleteFlag(JAXBElement<Short> value) {
        this.ivdDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ivdShipQty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdShipQty() {
        return ivdShipQty;
    }

    /**
     * Sets the value of the ivdShipQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdShipQty(JAXBElement<BigDecimal> value) {
        this.ivdShipQty = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdShipFlagCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIvdShipFlagCp() {
        return ivdShipFlagCp;
    }

    /**
     * Sets the value of the ivdShipFlagCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIvdShipFlagCp(JAXBElement<Integer> value) {
        this.ivdShipFlagCp = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the ivdKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdKeyExt() {
        return ivdKeyExt;
    }

    /**
     * Sets the value of the ivdKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdKeyExt(JAXBElement<String> value) {
        this.ivdKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdCloseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIvdCloseFlag() {
        return ivdCloseFlag;
    }

    /**
     * Sets the value of the ivdCloseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIvdCloseFlag(JAXBElement<Short> value) {
        this.ivdCloseFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ivdApproveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIvdApproveFlag() {
        return ivdApproveFlag;
    }

    /**
     * Sets the value of the ivdApproveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIvdApproveFlag(JAXBElement<Short> value) {
        this.ivdApproveFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ivdVoidFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIvdVoidFlag() {
        return ivdVoidFlag;
    }

    /**
     * Sets the value of the ivdVoidFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIvdVoidFlag(JAXBElement<Short> value) {
        this.ivdVoidFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ivdPrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdPrcKey() {
        return ivdPrcKey;
    }

    /**
     * Sets the value of the ivdPrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdPrcKey(JAXBElement<String> value) {
        this.ivdPrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdPrcPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdPrcPrdKey() {
        return ivdPrcPrdKey;
    }

    /**
     * Sets the value of the ivdPrcPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdPrcPrdKey(JAXBElement<String> value) {
        this.ivdPrcPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdAmountCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdAmountCp() {
        return ivdAmountCp;
    }

    /**
     * Sets the value of the ivdAmountCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdAmountCp(JAXBElement<BigDecimal> value) {
        this.ivdAmountCp = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdParity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIvdParity() {
        return ivdParity;
    }

    /**
     * Sets the value of the ivdParity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIvdParity(JAXBElement<Integer> value) {
        this.ivdParity = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the ivdParityAmountCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdParityAmountCp() {
        return ivdParityAmountCp;
    }

    /**
     * Sets the value of the ivdParityAmountCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdParityAmountCp(JAXBElement<BigDecimal> value) {
        this.ivdParityAmountCp = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdGlaDrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdGlaDrKey() {
        return ivdGlaDrKey;
    }

    /**
     * Sets the value of the ivdGlaDrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdGlaDrKey(JAXBElement<String> value) {
        this.ivdGlaDrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdGlaCrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdGlaCrKey() {
        return ivdGlaCrKey;
    }

    /**
     * Sets the value of the ivdGlaCrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdGlaCrKey(JAXBElement<String> value) {
        this.ivdGlaCrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdNotes() {
        return ivdNotes;
    }

    /**
     * Sets the value of the ivdNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdNotes(JAXBElement<String> value) {
        this.ivdNotes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdCstShipKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdCstShipKey() {
        return ivdCstShipKey;
    }

    /**
     * Sets the value of the ivdCstShipKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdCstShipKey(JAXBElement<String> value) {
        this.ivdCstShipKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdPrcPrdPtpKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdPrcPrdPtpKey() {
        return ivdPrcPrdPtpKey;
    }

    /**
     * Sets the value of the ivdPrcPrdPtpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdPrcPrdPtpKey(JAXBElement<String> value) {
        this.ivdPrcPrdPtpKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdCxaKey() {
        return ivdCxaKey;
    }

    /**
     * Sets the value of the ivdCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdCxaKey(JAXBElement<String> value) {
        this.ivdCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdSrcKey() {
        return ivdSrcKey;
    }

    /**
     * Sets the value of the ivdSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdSrcKey(JAXBElement<String> value) {
        this.ivdSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdType() {
        return ivdType;
    }

    /**
     * Sets the value of the ivdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdType(JAXBElement<String> value) {
        this.ivdType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdEntityKey() {
        return ivdEntityKey;
    }

    /**
     * Sets the value of the ivdEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdEntityKey(JAXBElement<String> value) {
        this.ivdEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdIvwKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdIvwKey() {
        return ivdIvwKey;
    }

    /**
     * Sets the value of the ivdIvwKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdIvwKey(JAXBElement<String> value) {
        this.ivdIvwKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdOddKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdOddKey() {
        return ivdOddKey;
    }

    /**
     * Sets the value of the ivdOddKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdOddKey(JAXBElement<String> value) {
        this.ivdOddKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdDoNotFulfill property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIvdDoNotFulfill() {
        return ivdDoNotFulfill;
    }

    /**
     * Sets the value of the ivdDoNotFulfill property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIvdDoNotFulfill(JAXBElement<Short> value) {
        this.ivdDoNotFulfill = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ivdPakPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdPakPrdKey() {
        return ivdPakPrdKey;
    }

    /**
     * Sets the value of the ivdPakPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdPakPrdKey(JAXBElement<String> value) {
        this.ivdPakPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdOdsKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdOdsKey() {
        return ivdOdsKey;
    }

    /**
     * Sets the value of the ivdOdsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdOdsKey(JAXBElement<String> value) {
        this.ivdOdsKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdCstKey() {
        return ivdCstKey;
    }

    /**
     * Sets the value of the ivdCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdCstKey(JAXBElement<String> value) {
        this.ivdCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdAccountNumber() {
        return ivdAccountNumber;
    }

    /**
     * Sets the value of the ivdAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdAccountNumber(JAXBElement<String> value) {
        this.ivdAccountNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdOvrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdOvrKey() {
        return ivdOvrKey;
    }

    /**
     * Sets the value of the ivdOvrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdOvrKey(JAXBElement<String> value) {
        this.ivdOvrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdPriceOverrideReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdPriceOverrideReason() {
        return ivdPriceOverrideReason;
    }

    /**
     * Sets the value of the ivdPriceOverrideReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdPriceOverrideReason(JAXBElement<String> value) {
        this.ivdPriceOverrideReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdPjtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdPjtKey() {
        return ivdPjtKey;
    }

    /**
     * Sets the value of the ivdPjtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdPjtKey(JAXBElement<String> value) {
        this.ivdPjtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdBackorderEmailSentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIvdBackorderEmailSentFlag() {
        return ivdBackorderEmailSentFlag;
    }

    /**
     * Sets the value of the ivdBackorderEmailSentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIvdBackorderEmailSentFlag(JAXBElement<Short> value) {
        this.ivdBackorderEmailSentFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ivdProcessQty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdProcessQty() {
        return ivdProcessQty;
    }

    /**
     * Sets the value of the ivdProcessQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdProcessQty(JAXBElement<BigDecimal> value) {
        this.ivdProcessQty = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdBunPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdBunPrdKey() {
        return ivdBunPrdKey;
    }

    /**
     * Sets the value of the ivdBunPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdBunPrdKey(JAXBElement<String> value) {
        this.ivdBunPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdDownloadCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIvdDownloadCount() {
        return ivdDownloadCount;
    }

    /**
     * Sets the value of the ivdDownloadCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIvdDownloadCount(JAXBElement<Integer> value) {
        this.ivdDownloadCount = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the ivdEmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdEmlKey() {
        return ivdEmlKey;
    }

    /**
     * Sets the value of the ivdEmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdEmlKey(JAXBElement<String> value) {
        this.ivdEmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdPackageGroupingKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdPackageGroupingKey() {
        return ivdPackageGroupingKey;
    }

    /**
     * Sets the value of the ivdPackageGroupingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdPackageGroupingKey(JAXBElement<String> value) {
        this.ivdPackageGroupingKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdDownloadLimitOverride property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIvdDownloadLimitOverride() {
        return ivdDownloadLimitOverride;
    }

    /**
     * Sets the value of the ivdDownloadLimitOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIvdDownloadLimitOverride(JAXBElement<Integer> value) {
        this.ivdDownloadLimitOverride = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the ivdDiscountProgramIvdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdDiscountProgramIvdKey() {
        return ivdDiscountProgramIvdKey;
    }

    /**
     * Sets the value of the ivdDiscountProgramIvdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdDiscountProgramIvdKey(JAXBElement<String> value) {
        this.ivdDiscountProgramIvdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdDownloadDaysOverride property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIvdDownloadDaysOverride() {
        return ivdDownloadDaysOverride;
    }

    /**
     * Sets the value of the ivdDownloadDaysOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIvdDownloadDaysOverride(JAXBElement<Integer> value) {
        this.ivdDownloadDaysOverride = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the ivdAvailableForCancel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdAvailableForCancel() {
        return ivdAvailableForCancel;
    }

    /**
     * Sets the value of the ivdAvailableForCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdAvailableForCancel(JAXBElement<BigDecimal> value) {
        this.ivdAvailableForCancel = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdAvailableForReturn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdAvailableForReturn() {
        return ivdAvailableForReturn;
    }

    /**
     * Sets the value of the ivdAvailableForReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdAvailableForReturn(JAXBElement<BigDecimal> value) {
        this.ivdAvailableForReturn = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdBalanceQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdBalanceQuantity() {
        return ivdBalanceQuantity;
    }

    /**
     * Sets the value of the ivdBalanceQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdBalanceQuantity(JAXBElement<BigDecimal> value) {
        this.ivdBalanceQuantity = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdAmountDue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdAmountDue() {
        return ivdAmountDue;
    }

    /**
     * Sets the value of the ivdAmountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdAmountDue(JAXBElement<BigDecimal> value) {
        this.ivdAmountDue = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdCreateorderFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIvdCreateorderFlag() {
        return ivdCreateorderFlag;
    }

    /**
     * Sets the value of the ivdCreateorderFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIvdCreateorderFlag(JAXBElement<Short> value) {
        this.ivdCreateorderFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ivdDeferralTotalReturned property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdDeferralTotalReturned() {
        return ivdDeferralTotalReturned;
    }

    /**
     * Sets the value of the ivdDeferralTotalReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdDeferralTotalReturned(JAXBElement<BigDecimal> value) {
        this.ivdDeferralTotalReturned = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdLineamount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdLineamount() {
        return ivdLineamount;
    }

    /**
     * Sets the value of the ivdLineamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdLineamount(JAXBElement<BigDecimal> value) {
        this.ivdLineamount = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdLineamountNoDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdLineamountNoDiscount() {
        return ivdLineamountNoDiscount;
    }

    /**
     * Sets the value of the ivdLineamountNoDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdLineamountNoDiscount(JAXBElement<BigDecimal> value) {
        this.ivdLineamountNoDiscount = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdOriginallineamount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdOriginallineamount() {
        return ivdOriginallineamount;
    }

    /**
     * Sets the value of the ivdOriginallineamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdOriginallineamount(JAXBElement<BigDecimal> value) {
        this.ivdOriginallineamount = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdRestockFeeCalculated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdRestockFeeCalculated() {
        return ivdRestockFeeCalculated;
    }

    /**
     * Sets the value of the ivdRestockFeeCalculated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdRestockFeeCalculated(JAXBElement<BigDecimal> value) {
        this.ivdRestockFeeCalculated = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdCreateinvoiceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIvdCreateinvoiceFlag() {
        return ivdCreateinvoiceFlag;
    }

    /**
     * Sets the value of the ivdCreateinvoiceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIvdCreateinvoiceFlag(JAXBElement<Short> value) {
        this.ivdCreateinvoiceFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ivdLinebalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdLinebalance() {
        return ivdLinebalance;
    }

    /**
     * Sets the value of the ivdLinebalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdLinebalance(JAXBElement<BigDecimal> value) {
        this.ivdLinebalance = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdNetAmountDue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdNetAmountDue() {
        return ivdNetAmountDue;
    }

    /**
     * Sets the value of the ivdNetAmountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdNetAmountDue(JAXBElement<BigDecimal> value) {
        this.ivdNetAmountDue = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdPayamount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdPayamount() {
        return ivdPayamount;
    }

    /**
     * Sets the value of the ivdPayamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdPayamount(JAXBElement<BigDecimal> value) {
        this.ivdPayamount = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdPayamountNoreturn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdPayamountNoreturn() {
        return ivdPayamountNoreturn;
    }

    /**
     * Sets the value of the ivdPayamountNoreturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdPayamountNoreturn(JAXBElement<BigDecimal> value) {
        this.ivdPayamountNoreturn = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdCancelQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdCancelQuantity() {
        return ivdCancelQuantity;
    }

    /**
     * Sets the value of the ivdCancelQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdCancelQuantity(JAXBElement<BigDecimal> value) {
        this.ivdCancelQuantity = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdCancelledQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdCancelledQuantity() {
        return ivdCancelledQuantity;
    }

    /**
     * Sets the value of the ivdCancelledQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdCancelledQuantity(JAXBElement<BigDecimal> value) {
        this.ivdCancelledQuantity = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdDefaultCreditDollarAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdDefaultCreditDollarAmount() {
        return ivdDefaultCreditDollarAmount;
    }

    /**
     * Sets the value of the ivdDefaultCreditDollarAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdDefaultCreditDollarAmount(JAXBElement<BigDecimal> value) {
        this.ivdDefaultCreditDollarAmount = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdDeferralNumberPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdDeferralNumberPeriods() {
        return ivdDeferralNumberPeriods;
    }

    /**
     * Sets the value of the ivdDeferralNumberPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdDeferralNumberPeriods(JAXBElement<BigDecimal> value) {
        this.ivdDeferralNumberPeriods = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdDeferralNumberPeriodsRecognized property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdDeferralNumberPeriodsRecognized() {
        return ivdDeferralNumberPeriodsRecognized;
    }

    /**
     * Sets the value of the ivdDeferralNumberPeriodsRecognized property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdDeferralNumberPeriodsRecognized(JAXBElement<BigDecimal> value) {
        this.ivdDeferralNumberPeriodsRecognized = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdDeferralPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdDeferralPrice() {
        return ivdDeferralPrice;
    }

    /**
     * Sets the value of the ivdDeferralPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdDeferralPrice(JAXBElement<BigDecimal> value) {
        this.ivdDeferralPrice = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdDeferralBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdDeferralBalance() {
        return ivdDeferralBalance;
    }

    /**
     * Sets the value of the ivdDeferralBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdDeferralBalance(JAXBElement<BigDecimal> value) {
        this.ivdDeferralBalance = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdMinimumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdMinimumQuantity() {
        return ivdMinimumQuantity;
    }

    /**
     * Sets the value of the ivdMinimumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdMinimumQuantity(JAXBElement<BigDecimal> value) {
        this.ivdMinimumQuantity = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdReduceQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdReduceQuantity() {
        return ivdReduceQuantity;
    }

    /**
     * Sets the value of the ivdReduceQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdReduceQuantity(JAXBElement<BigDecimal> value) {
        this.ivdReduceQuantity = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdReturnQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdReturnQuantity() {
        return ivdReturnQuantity;
    }

    /**
     * Sets the value of the ivdReturnQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdReturnQuantity(JAXBElement<BigDecimal> value) {
        this.ivdReturnQuantity = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdReturnedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdReturnedQuantity() {
        return ivdReturnedQuantity;
    }

    /**
     * Sets the value of the ivdReturnedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdReturnedQuantity(JAXBElement<BigDecimal> value) {
        this.ivdReturnedQuantity = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdTotalRecognized property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdTotalRecognized() {
        return ivdTotalRecognized;
    }

    /**
     * Sets the value of the ivdTotalRecognized property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdTotalRecognized(JAXBElement<BigDecimal> value) {
        this.ivdTotalRecognized = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdWriteoffDollarAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdWriteoffDollarAmount() {
        return ivdWriteoffDollarAmount;
    }

    /**
     * Sets the value of the ivdWriteoffDollarAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdWriteoffDollarAmount(JAXBElement<BigDecimal> value) {
        this.ivdWriteoffDollarAmount = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdAllowChangeQtyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIvdAllowChangeQtyFlag() {
        return ivdAllowChangeQtyFlag;
    }

    /**
     * Sets the value of the ivdAllowChangeQtyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIvdAllowChangeQtyFlag(JAXBElement<Short> value) {
        this.ivdAllowChangeQtyFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ivdCreditDollarAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdCreditDollarAmount() {
        return ivdCreditDollarAmount;
    }

    /**
     * Sets the value of the ivdCreditDollarAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdCreditDollarAmount(JAXBElement<BigDecimal> value) {
        this.ivdCreditDollarAmount = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdAllowChangePriceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIvdAllowChangePriceFlag() {
        return ivdAllowChangePriceFlag;
    }

    /**
     * Sets the value of the ivdAllowChangePriceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIvdAllowChangePriceFlag(JAXBElement<Short> value) {
        this.ivdAllowChangePriceFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ivdAutoRefund property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIvdAutoRefund() {
        return ivdAutoRefund;
    }

    /**
     * Sets the value of the ivdAutoRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIvdAutoRefund(JAXBElement<Short> value) {
        this.ivdAutoRefund = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ivdNewBatchKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdNewBatchKey() {
        return ivdNewBatchKey;
    }

    /**
     * Sets the value of the ivdNewBatchKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdNewBatchKey(JAXBElement<String> value) {
        this.ivdNewBatchKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdRefundCreditAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdRefundCreditAccount() {
        return ivdRefundCreditAccount;
    }

    /**
     * Sets the value of the ivdRefundCreditAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdRefundCreditAccount(JAXBElement<String> value) {
        this.ivdRefundCreditAccount = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdWriteoffDeferral property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIvdWriteoffDeferral() {
        return ivdWriteoffDeferral;
    }

    /**
     * Sets the value of the ivdWriteoffDeferral property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIvdWriteoffDeferral(JAXBElement<Short> value) {
        this.ivdWriteoffDeferral = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ivdClaimQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdClaimQuantity() {
        return ivdClaimQuantity;
    }

    /**
     * Sets the value of the ivdClaimQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdClaimQuantity(JAXBElement<BigDecimal> value) {
        this.ivdClaimQuantity = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdDisableQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIvdDisableQuantity() {
        return ivdDisableQuantity;
    }

    /**
     * Sets the value of the ivdDisableQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIvdDisableQuantity(JAXBElement<Short> value) {
        this.ivdDisableQuantity = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ivdClaimedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdClaimedQuantity() {
        return ivdClaimedQuantity;
    }

    /**
     * Sets the value of the ivdClaimedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdClaimedQuantity(JAXBElement<BigDecimal> value) {
        this.ivdClaimedQuantity = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdClaimFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIvdClaimFlag() {
        return ivdClaimFlag;
    }

    /**
     * Sets the value of the ivdClaimFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIvdClaimFlag(JAXBElement<Short> value) {
        this.ivdClaimFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ivdSubtotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdSubtotal() {
        return ivdSubtotal;
    }

    /**
     * Sets the value of the ivdSubtotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdSubtotal(JAXBElement<BigDecimal> value) {
        this.ivdSubtotal = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdDiscountamount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdDiscountamount() {
        return ivdDiscountamount;
    }

    /**
     * Sets the value of the ivdDiscountamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdDiscountamount(JAXBElement<BigDecimal> value) {
        this.ivdDiscountamount = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdTotal() {
        return ivdTotal;
    }

    /**
     * Sets the value of the ivdTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdTotal(JAXBElement<BigDecimal> value) {
        this.ivdTotal = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdUnitPriceWithDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdUnitPriceWithDiscount() {
        return ivdUnitPriceWithDiscount;
    }

    /**
     * Sets the value of the ivdUnitPriceWithDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdUnitPriceWithDiscount(JAXBElement<BigDecimal> value) {
        this.ivdUnitPriceWithDiscount = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdAppliedPayment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdAppliedPayment() {
        return ivdAppliedPayment;
    }

    /**
     * Sets the value of the ivdAppliedPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdAppliedPayment(JAXBElement<BigDecimal> value) {
        this.ivdAppliedPayment = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdAppliedCredit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdAppliedCredit() {
        return ivdAppliedCredit;
    }

    /**
     * Sets the value of the ivdAppliedCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdAppliedCredit(JAXBElement<BigDecimal> value) {
        this.ivdAppliedCredit = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdWriteOff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdWriteOff() {
        return ivdWriteOff;
    }

    /**
     * Sets the value of the ivdWriteOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdWriteOff(JAXBElement<BigDecimal> value) {
        this.ivdWriteOff = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdReturnPayment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdReturnPayment() {
        return ivdReturnPayment;
    }

    /**
     * Sets the value of the ivdReturnPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdReturnPayment(JAXBElement<BigDecimal> value) {
        this.ivdReturnPayment = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdTotalPayment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdTotalPayment() {
        return ivdTotalPayment;
    }

    /**
     * Sets the value of the ivdTotalPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdTotalPayment(JAXBElement<BigDecimal> value) {
        this.ivdTotalPayment = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdBalance() {
        return ivdBalance;
    }

    /**
     * Sets the value of the ivdBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdBalance(JAXBElement<BigDecimal> value) {
        this.ivdBalance = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdTax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdTax() {
        return ivdTax;
    }

    /**
     * Sets the value of the ivdTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdTax(JAXBElement<BigDecimal> value) {
        this.ivdTax = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdShipping property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdShipping() {
        return ivdShipping;
    }

    /**
     * Sets the value of the ivdShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdShipping(JAXBElement<BigDecimal> value) {
        this.ivdShipping = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdNettotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdNettotal() {
        return ivdNettotal;
    }

    /**
     * Sets the value of the ivdNettotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdNettotal(JAXBElement<BigDecimal> value) {
        this.ivdNettotal = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdNetpayment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdNetpayment() {
        return ivdNetpayment;
    }

    /**
     * Sets the value of the ivdNetpayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdNetpayment(JAXBElement<BigDecimal> value) {
        this.ivdNetpayment = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdPaymentToApply property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdPaymentToApply() {
        return ivdPaymentToApply;
    }

    /**
     * Sets the value of the ivdPaymentToApply property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdPaymentToApply(JAXBElement<BigDecimal> value) {
        this.ivdPaymentToApply = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdCreditToApply property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdCreditToApply() {
        return ivdCreditToApply;
    }

    /**
     * Sets the value of the ivdCreditToApply property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdCreditToApply(JAXBElement<BigDecimal> value) {
        this.ivdCreditToApply = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdNetcredit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdNetcredit() {
        return ivdNetcredit;
    }

    /**
     * Sets the value of the ivdNetcredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdNetcredit(JAXBElement<BigDecimal> value) {
        this.ivdNetcredit = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdNetwriteoff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdNetwriteoff() {
        return ivdNetwriteoff;
    }

    /**
     * Sets the value of the ivdNetwriteoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdNetwriteoff(JAXBElement<BigDecimal> value) {
        this.ivdNetwriteoff = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdWriteoffToApply property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdWriteoffToApply() {
        return ivdWriteoffToApply;
    }

    /**
     * Sets the value of the ivdWriteoffToApply property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdWriteoffToApply(JAXBElement<BigDecimal> value) {
        this.ivdWriteoffToApply = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdNetreturn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdNetreturn() {
        return ivdNetreturn;
    }

    /**
     * Sets the value of the ivdNetreturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdNetreturn(JAXBElement<BigDecimal> value) {
        this.ivdNetreturn = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdReturnToApply property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdReturnToApply() {
        return ivdReturnToApply;
    }

    /**
     * Sets the value of the ivdReturnToApply property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdReturnToApply(JAXBElement<BigDecimal> value) {
        this.ivdReturnToApply = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdNetapplied property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdNetapplied() {
        return ivdNetapplied;
    }

    /**
     * Sets the value of the ivdNetapplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdNetapplied(JAXBElement<BigDecimal> value) {
        this.ivdNetapplied = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdTotalToApply property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdTotalToApply() {
        return ivdTotalToApply;
    }

    /**
     * Sets the value of the ivdTotalToApply property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdTotalToApply(JAXBElement<BigDecimal> value) {
        this.ivdTotalToApply = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdNetbalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdNetbalance() {
        return ivdNetbalance;
    }

    /**
     * Sets the value of the ivdNetbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdNetbalance(JAXBElement<BigDecimal> value) {
        this.ivdNetbalance = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdNetunpaidbalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdNetunpaidbalance() {
        return ivdNetunpaidbalance;
    }

    /**
     * Sets the value of the ivdNetunpaidbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdNetunpaidbalance(JAXBElement<BigDecimal> value) {
        this.ivdNetunpaidbalance = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdPriceAggregated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdPriceAggregated() {
        return ivdPriceAggregated;
    }

    /**
     * Sets the value of the ivdPriceAggregated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdPriceAggregated(JAXBElement<BigDecimal> value) {
        this.ivdPriceAggregated = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdDiscountamountAggregated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdDiscountamountAggregated() {
        return ivdDiscountamountAggregated;
    }

    /**
     * Sets the value of the ivdDiscountamountAggregated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdDiscountamountAggregated(JAXBElement<BigDecimal> value) {
        this.ivdDiscountamountAggregated = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdTaxAggregated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdTaxAggregated() {
        return ivdTaxAggregated;
    }

    /**
     * Sets the value of the ivdTaxAggregated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdTaxAggregated(JAXBElement<BigDecimal> value) {
        this.ivdTaxAggregated = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdShippingAggregated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdShippingAggregated() {
        return ivdShippingAggregated;
    }

    /**
     * Sets the value of the ivdShippingAggregated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdShippingAggregated(JAXBElement<BigDecimal> value) {
        this.ivdShippingAggregated = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdNettotalAggregated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdNettotalAggregated() {
        return ivdNettotalAggregated;
    }

    /**
     * Sets the value of the ivdNettotalAggregated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdNettotalAggregated(JAXBElement<BigDecimal> value) {
        this.ivdNettotalAggregated = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdNetunpaidbalanceAggregated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdNetunpaidbalanceAggregated() {
        return ivdNetunpaidbalanceAggregated;
    }

    /**
     * Sets the value of the ivdNetunpaidbalanceAggregated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdNetunpaidbalanceAggregated(JAXBElement<BigDecimal> value) {
        this.ivdNetunpaidbalanceAggregated = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdSubtotalAggregated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdSubtotalAggregated() {
        return ivdSubtotalAggregated;
    }

    /**
     * Sets the value of the ivdSubtotalAggregated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdSubtotalAggregated(JAXBElement<BigDecimal> value) {
        this.ivdSubtotalAggregated = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ivdShippableFlagAggregated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIvdShippableFlagAggregated() {
        return ivdShippableFlagAggregated;
    }

    /**
     * Sets the value of the ivdShippableFlagAggregated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIvdShippableFlagAggregated(JAXBElement<Short> value) {
        this.ivdShippableFlagAggregated = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ivdPartofGroupregDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIvdPartofGroupregDiscount() {
        return ivdPartofGroupregDiscount;
    }

    /**
     * Sets the value of the ivdPartofGroupregDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIvdPartofGroupregDiscount(JAXBElement<Short> value) {
        this.ivdPartofGroupregDiscount = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ivdBoothNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdBoothNumber() {
        return ivdBoothNumber;
    }

    /**
     * Sets the value of the ivdBoothNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdBoothNumber(JAXBElement<String> value) {
        this.ivdBoothNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdMulticurrencyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdMulticurrencyKey() {
        return ivdMulticurrencyKey;
    }

    /**
     * Sets the value of the ivdMulticurrencyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdMulticurrencyKey(JAXBElement<String> value) {
        this.ivdMulticurrencyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdPricingcontrolDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdPricingcontrolDate() {
        return ivdPricingcontrolDate;
    }

    /**
     * Sets the value of the ivdPricingcontrolDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdPricingcontrolDate(JAXBElement<String> value) {
        this.ivdPricingcontrolDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdPricingcontrolRgtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdPricingcontrolRgtKey() {
        return ivdPricingcontrolRgtKey;
    }

    /**
     * Sets the value of the ivdPricingcontrolRgtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdPricingcontrolRgtKey(JAXBElement<String> value) {
        this.ivdPricingcontrolRgtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdTermBased property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIvdTermBased() {
        return ivdTermBased;
    }

    /**
     * Sets the value of the ivdTermBased property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIvdTermBased(JAXBElement<Short> value) {
        this.ivdTermBased = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ivdTermCalendar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIvdTermCalendar() {
        return ivdTermCalendar;
    }

    /**
     * Sets the value of the ivdTermCalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIvdTermCalendar(JAXBElement<Short> value) {
        this.ivdTermCalendar = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ivdTransactionCurrencyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdTransactionCurrencyKey() {
        return ivdTransactionCurrencyKey;
    }

    /**
     * Sets the value of the ivdTransactionCurrencyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdTransactionCurrencyKey(JAXBElement<String> value) {
        this.ivdTransactionCurrencyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdHomeCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdHomeCurrencyCode() {
        return ivdHomeCurrencyCode;
    }

    /**
     * Sets the value of the ivdHomeCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdHomeCurrencyCode(JAXBElement<String> value) {
        this.ivdHomeCurrencyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdAutoapply property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIvdAutoapply() {
        return ivdAutoapply;
    }

    /**
     * Sets the value of the ivdAutoapply property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIvdAutoapply(JAXBElement<Short> value) {
        this.ivdAutoapply = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ivdCancelFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIvdCancelFlag() {
        return ivdCancelFlag;
    }

    /**
     * Sets the value of the ivdCancelFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIvdCancelFlag(JAXBElement<Short> value) {
        this.ivdCancelFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ivdIvdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdIvdKey() {
        return ivdIvdKey;
    }

    /**
     * Sets the value of the ivdIvdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdIvdKey(JAXBElement<String> value) {
        this.ivdIvdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdFormdetailkey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdFormdetailkey() {
        return ivdFormdetailkey;
    }

    /**
     * Sets the value of the ivdFormdetailkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdFormdetailkey(JAXBElement<String> value) {
        this.ivdFormdetailkey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdFormkey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdFormkey() {
        return ivdFormkey;
    }

    /**
     * Sets the value of the ivdFormkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdFormkey(JAXBElement<String> value) {
        this.ivdFormkey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdParentdataobject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdParentdataobject() {
        return ivdParentdataobject;
    }

    /**
     * Sets the value of the ivdParentdataobject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdParentdataobject(JAXBElement<String> value) {
        this.ivdParentdataobject = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdRegKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdRegKey() {
        return ivdRegKey;
    }

    /**
     * Sets the value of the ivdRegKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdRegKey(JAXBElement<String> value) {
        this.ivdRegKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdAddlInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvdAddlInfo() {
        return ivdAddlInfo;
    }

    /**
     * Sets the value of the ivdAddlInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvdAddlInfo(JAXBElement<String> value) {
        this.ivdAddlInfo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ivdShippableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIvdShippableFlag() {
        return ivdShippableFlag;
    }

    /**
     * Sets the value of the ivdShippableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIvdShippableFlag(JAXBElement<Short> value) {
        this.ivdShippableFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ivdInvShippableTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIvdInvShippableTotal() {
        return ivdInvShippableTotal;
    }

    /**
     * Sets the value of the ivdInvShippableTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIvdInvShippableTotal(JAXBElement<BigDecimal> value) {
        this.ivdInvShippableTotal = ((JAXBElement<BigDecimal> ) value);
    }

}
