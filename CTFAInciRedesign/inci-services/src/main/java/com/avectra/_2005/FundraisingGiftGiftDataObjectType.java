
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Gift_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Gift_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gft_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_dnr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_apl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_fun_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_cmp_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_gty_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="gft_deductable_amt" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="gft_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="gft_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="gft_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="gft_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="gft_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="gft_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_frt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_fpc_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_ivd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_stock_name" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="gft_cct_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_notes" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="gft_number_of_shares" type="{http://www.avectra.com/2005/}av_float_Type" minOccurs="0"/>
 *         &lt;element name="gft_pck_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_gft_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_prm_prc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_share_price" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="gft_anonymous_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="gft_inv_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="gft_recognition_customer_adr_line1" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="gft_recognition_customer_adr_line2" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="gft_soft_money" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="gft_recognition_customer" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="gft_recognition_customer_adr_line3" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="gft_recognition_customer_adr_city" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="gft_recognition_customer_adr_state" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="gft_recognition_customer_adr_post_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="gft_recognition_customer_adr_country" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="gft_plg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_transfer_from_gft_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_sct_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_liquidation_amount" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="gft_clg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_other_match_program" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="gft_form_complete_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="gft_date_sent" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="gft_date_received" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="gft_solicitor_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_ticker" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="gft_acknowledgment_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="gft_batch_code" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="gft_mail_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="gft_recognize_as" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="gft_liquidation_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="gft_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_reg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_tax_receipt_sent_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="gft_tbt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_personal_message" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="gft_amount" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="gft_inv_exists_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="gft_repeat_gift_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="gft_bup_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_prc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_corporate_match_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="gft_formkey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_parentdataobject" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="gft_previous_gift_recognize_as" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="gft_frequency" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="gft_recurring_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="gft_comp_gift_add_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="gft_ods_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_ord_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gft_FundEvent_reg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Gift_DataObjectType", propOrder = {
    "gftKey",
    "gftDnrKey",
    "gftAplKey",
    "gftFunKey",
    "gftCmpKey",
    "gftGtyKey",
    "gftDate",
    "gftDeductableAmt",
    "gftAddUser",
    "gftAddDate",
    "gftChangeUser",
    "gftChangeDate",
    "gftDeleteFlag",
    "gftEntityKey",
    "gftFrtKey",
    "gftCstKey",
    "gftKeyExt",
    "gftFpcPrdKey",
    "gftIvdKey",
    "gftStockName",
    "gftCctKey",
    "gftNotes",
    "gftNumberOfShares",
    "gftPckKey",
    "gftGftKey",
    "gftPrmPrcKey",
    "gftSharePrice",
    "gftAnonymousFlag",
    "gftInvCode",
    "gftRecognitionCustomerAdrLine1",
    "gftRecognitionCustomerAdrLine2",
    "gftSoftMoney",
    "gftRecognitionCustomer",
    "gftRecognitionCustomerAdrLine3",
    "gftRecognitionCustomerAdrCity",
    "gftRecognitionCustomerAdrState",
    "gftRecognitionCustomerAdrPostCode",
    "gftRecognitionCustomerAdrCountry",
    "gftPlgKey",
    "gftTransferFromGftKey",
    "gftSctKey",
    "gftLiquidationAmount",
    "gftClgKey",
    "gftOtherMatchProgram",
    "gftFormCompleteFlag",
    "gftDateSent",
    "gftDateReceived",
    "gftSolicitorCstKey",
    "gftTicker",
    "gftAcknowledgmentDate",
    "gftBatchCode",
    "gftMailFlag",
    "gftRecognizeAs",
    "gftLiquidationDate",
    "gftSrcKey",
    "gftRegKey",
    "gftTaxReceiptSentDate",
    "gftTbtKey",
    "gftPersonalMessage",
    "gftAmount",
    "gftInvExistsFlag",
    "gftRepeatGiftFlag",
    "gftBupPrdKey",
    "gftPrcKey",
    "gftCorporateMatchFlag",
    "gftFormkey",
    "gftParentdataobject",
    "gftPreviousGiftRecognizeAs",
    "gftFrequency",
    "gftRecurringFlag",
    "gftCompGiftAddFlag",
    "gftOdsKey",
    "gftOrdKey",
    "gftFundEventRegKey"
})
public class FundraisingGiftGiftDataObjectType {

    @XmlElementRef(name = "gft_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftKey;
    @XmlElementRef(name = "gft_dnr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftDnrKey;
    @XmlElementRef(name = "gft_apl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftAplKey;
    @XmlElementRef(name = "gft_fun_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftFunKey;
    @XmlElementRef(name = "gft_cmp_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftCmpKey;
    @XmlElementRef(name = "gft_gty_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftGtyKey;
    @XmlElementRef(name = "gft_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftDate;
    @XmlElementRef(name = "gft_deductable_amt", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> gftDeductableAmt;
    @XmlElementRef(name = "gft_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftAddUser;
    @XmlElementRef(name = "gft_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftAddDate;
    @XmlElementRef(name = "gft_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftChangeUser;
    @XmlElementRef(name = "gft_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftChangeDate;
    @XmlElementRef(name = "gft_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> gftDeleteFlag;
    @XmlElementRef(name = "gft_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftEntityKey;
    @XmlElementRef(name = "gft_frt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftFrtKey;
    @XmlElementRef(name = "gft_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftCstKey;
    @XmlElementRef(name = "gft_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftKeyExt;
    @XmlElementRef(name = "gft_fpc_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftFpcPrdKey;
    @XmlElementRef(name = "gft_ivd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftIvdKey;
    @XmlElementRef(name = "gft_stock_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftStockName;
    @XmlElementRef(name = "gft_cct_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftCctKey;
    @XmlElementRef(name = "gft_notes", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftNotes;
    @XmlElementRef(name = "gft_number_of_shares", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Double> gftNumberOfShares;
    @XmlElementRef(name = "gft_pck_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftPckKey;
    @XmlElementRef(name = "gft_gft_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftGftKey;
    @XmlElementRef(name = "gft_prm_prc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftPrmPrcKey;
    @XmlElementRef(name = "gft_share_price", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> gftSharePrice;
    @XmlElementRef(name = "gft_anonymous_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> gftAnonymousFlag;
    @XmlElementRef(name = "gft_inv_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftInvCode;
    @XmlElementRef(name = "gft_recognition_customer_adr_line1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftRecognitionCustomerAdrLine1;
    @XmlElementRef(name = "gft_recognition_customer_adr_line2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftRecognitionCustomerAdrLine2;
    @XmlElementRef(name = "gft_soft_money", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> gftSoftMoney;
    @XmlElementRef(name = "gft_recognition_customer", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftRecognitionCustomer;
    @XmlElementRef(name = "gft_recognition_customer_adr_line3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftRecognitionCustomerAdrLine3;
    @XmlElementRef(name = "gft_recognition_customer_adr_city", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftRecognitionCustomerAdrCity;
    @XmlElementRef(name = "gft_recognition_customer_adr_state", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftRecognitionCustomerAdrState;
    @XmlElementRef(name = "gft_recognition_customer_adr_post_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftRecognitionCustomerAdrPostCode;
    @XmlElementRef(name = "gft_recognition_customer_adr_country", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftRecognitionCustomerAdrCountry;
    @XmlElementRef(name = "gft_plg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftPlgKey;
    @XmlElementRef(name = "gft_transfer_from_gft_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftTransferFromGftKey;
    @XmlElementRef(name = "gft_sct_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftSctKey;
    @XmlElementRef(name = "gft_liquidation_amount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> gftLiquidationAmount;
    @XmlElementRef(name = "gft_clg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftClgKey;
    @XmlElementRef(name = "gft_other_match_program", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftOtherMatchProgram;
    @XmlElementRef(name = "gft_form_complete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> gftFormCompleteFlag;
    @XmlElementRef(name = "gft_date_sent", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftDateSent;
    @XmlElementRef(name = "gft_date_received", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftDateReceived;
    @XmlElementRef(name = "gft_solicitor_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftSolicitorCstKey;
    @XmlElementRef(name = "gft_ticker", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftTicker;
    @XmlElementRef(name = "gft_acknowledgment_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftAcknowledgmentDate;
    @XmlElementRef(name = "gft_batch_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftBatchCode;
    @XmlElementRef(name = "gft_mail_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> gftMailFlag;
    @XmlElementRef(name = "gft_recognize_as", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftRecognizeAs;
    @XmlElementRef(name = "gft_liquidation_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftLiquidationDate;
    @XmlElementRef(name = "gft_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftSrcKey;
    @XmlElementRef(name = "gft_reg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftRegKey;
    @XmlElementRef(name = "gft_tax_receipt_sent_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftTaxReceiptSentDate;
    @XmlElementRef(name = "gft_tbt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftTbtKey;
    @XmlElementRef(name = "gft_personal_message", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftPersonalMessage;
    @XmlElementRef(name = "gft_amount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> gftAmount;
    @XmlElementRef(name = "gft_inv_exists_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> gftInvExistsFlag;
    @XmlElementRef(name = "gft_repeat_gift_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> gftRepeatGiftFlag;
    @XmlElementRef(name = "gft_bup_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftBupPrdKey;
    @XmlElementRef(name = "gft_prc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftPrcKey;
    @XmlElementRef(name = "gft_corporate_match_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> gftCorporateMatchFlag;
    @XmlElementRef(name = "gft_formkey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftFormkey;
    @XmlElementRef(name = "gft_parentdataobject", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftParentdataobject;
    @XmlElementRef(name = "gft_previous_gift_recognize_as", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftPreviousGiftRecognizeAs;
    @XmlElementRef(name = "gft_frequency", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftFrequency;
    @XmlElementRef(name = "gft_recurring_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> gftRecurringFlag;
    @XmlElementRef(name = "gft_comp_gift_add_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> gftCompGiftAddFlag;
    @XmlElementRef(name = "gft_ods_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftOdsKey;
    @XmlElementRef(name = "gft_ord_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftOrdKey;
    @XmlElementRef(name = "gft_FundEvent_reg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gftFundEventRegKey;

    /**
     * Gets the value of the gftKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftKey() {
        return gftKey;
    }

    /**
     * Sets the value of the gftKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftKey(JAXBElement<String> value) {
        this.gftKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftDnrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftDnrKey() {
        return gftDnrKey;
    }

    /**
     * Sets the value of the gftDnrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftDnrKey(JAXBElement<String> value) {
        this.gftDnrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftAplKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftAplKey() {
        return gftAplKey;
    }

    /**
     * Sets the value of the gftAplKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftAplKey(JAXBElement<String> value) {
        this.gftAplKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftFunKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftFunKey() {
        return gftFunKey;
    }

    /**
     * Sets the value of the gftFunKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftFunKey(JAXBElement<String> value) {
        this.gftFunKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftCmpKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftCmpKey() {
        return gftCmpKey;
    }

    /**
     * Sets the value of the gftCmpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftCmpKey(JAXBElement<String> value) {
        this.gftCmpKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftGtyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftGtyKey() {
        return gftGtyKey;
    }

    /**
     * Sets the value of the gftGtyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftGtyKey(JAXBElement<String> value) {
        this.gftGtyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftDate() {
        return gftDate;
    }

    /**
     * Sets the value of the gftDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftDate(JAXBElement<String> value) {
        this.gftDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftDeductableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGftDeductableAmt() {
        return gftDeductableAmt;
    }

    /**
     * Sets the value of the gftDeductableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGftDeductableAmt(JAXBElement<BigDecimal> value) {
        this.gftDeductableAmt = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the gftAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftAddUser() {
        return gftAddUser;
    }

    /**
     * Sets the value of the gftAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftAddUser(JAXBElement<String> value) {
        this.gftAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftAddDate() {
        return gftAddDate;
    }

    /**
     * Sets the value of the gftAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftAddDate(JAXBElement<String> value) {
        this.gftAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftChangeUser() {
        return gftChangeUser;
    }

    /**
     * Sets the value of the gftChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftChangeUser(JAXBElement<String> value) {
        this.gftChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftChangeDate() {
        return gftChangeDate;
    }

    /**
     * Sets the value of the gftChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftChangeDate(JAXBElement<String> value) {
        this.gftChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getGftDeleteFlag() {
        return gftDeleteFlag;
    }

    /**
     * Sets the value of the gftDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setGftDeleteFlag(JAXBElement<Short> value) {
        this.gftDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the gftEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftEntityKey() {
        return gftEntityKey;
    }

    /**
     * Sets the value of the gftEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftEntityKey(JAXBElement<String> value) {
        this.gftEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftFrtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftFrtKey() {
        return gftFrtKey;
    }

    /**
     * Sets the value of the gftFrtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftFrtKey(JAXBElement<String> value) {
        this.gftFrtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftCstKey() {
        return gftCstKey;
    }

    /**
     * Sets the value of the gftCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftCstKey(JAXBElement<String> value) {
        this.gftCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftKeyExt() {
        return gftKeyExt;
    }

    /**
     * Sets the value of the gftKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftKeyExt(JAXBElement<String> value) {
        this.gftKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftFpcPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftFpcPrdKey() {
        return gftFpcPrdKey;
    }

    /**
     * Sets the value of the gftFpcPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftFpcPrdKey(JAXBElement<String> value) {
        this.gftFpcPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftIvdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftIvdKey() {
        return gftIvdKey;
    }

    /**
     * Sets the value of the gftIvdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftIvdKey(JAXBElement<String> value) {
        this.gftIvdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftStockName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftStockName() {
        return gftStockName;
    }

    /**
     * Sets the value of the gftStockName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftStockName(JAXBElement<String> value) {
        this.gftStockName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftCctKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftCctKey() {
        return gftCctKey;
    }

    /**
     * Sets the value of the gftCctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftCctKey(JAXBElement<String> value) {
        this.gftCctKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftNotes() {
        return gftNotes;
    }

    /**
     * Sets the value of the gftNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftNotes(JAXBElement<String> value) {
        this.gftNotes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftNumberOfShares property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getGftNumberOfShares() {
        return gftNumberOfShares;
    }

    /**
     * Sets the value of the gftNumberOfShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setGftNumberOfShares(JAXBElement<Double> value) {
        this.gftNumberOfShares = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the gftPckKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftPckKey() {
        return gftPckKey;
    }

    /**
     * Sets the value of the gftPckKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftPckKey(JAXBElement<String> value) {
        this.gftPckKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftGftKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftGftKey() {
        return gftGftKey;
    }

    /**
     * Sets the value of the gftGftKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftGftKey(JAXBElement<String> value) {
        this.gftGftKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftPrmPrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftPrmPrcKey() {
        return gftPrmPrcKey;
    }

    /**
     * Sets the value of the gftPrmPrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftPrmPrcKey(JAXBElement<String> value) {
        this.gftPrmPrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftSharePrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGftSharePrice() {
        return gftSharePrice;
    }

    /**
     * Sets the value of the gftSharePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGftSharePrice(JAXBElement<BigDecimal> value) {
        this.gftSharePrice = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the gftAnonymousFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getGftAnonymousFlag() {
        return gftAnonymousFlag;
    }

    /**
     * Sets the value of the gftAnonymousFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setGftAnonymousFlag(JAXBElement<Short> value) {
        this.gftAnonymousFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the gftInvCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftInvCode() {
        return gftInvCode;
    }

    /**
     * Sets the value of the gftInvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftInvCode(JAXBElement<String> value) {
        this.gftInvCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftRecognitionCustomerAdrLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftRecognitionCustomerAdrLine1() {
        return gftRecognitionCustomerAdrLine1;
    }

    /**
     * Sets the value of the gftRecognitionCustomerAdrLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftRecognitionCustomerAdrLine1(JAXBElement<String> value) {
        this.gftRecognitionCustomerAdrLine1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftRecognitionCustomerAdrLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftRecognitionCustomerAdrLine2() {
        return gftRecognitionCustomerAdrLine2;
    }

    /**
     * Sets the value of the gftRecognitionCustomerAdrLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftRecognitionCustomerAdrLine2(JAXBElement<String> value) {
        this.gftRecognitionCustomerAdrLine2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftSoftMoney property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGftSoftMoney() {
        return gftSoftMoney;
    }

    /**
     * Sets the value of the gftSoftMoney property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGftSoftMoney(JAXBElement<BigDecimal> value) {
        this.gftSoftMoney = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the gftRecognitionCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftRecognitionCustomer() {
        return gftRecognitionCustomer;
    }

    /**
     * Sets the value of the gftRecognitionCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftRecognitionCustomer(JAXBElement<String> value) {
        this.gftRecognitionCustomer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftRecognitionCustomerAdrLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftRecognitionCustomerAdrLine3() {
        return gftRecognitionCustomerAdrLine3;
    }

    /**
     * Sets the value of the gftRecognitionCustomerAdrLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftRecognitionCustomerAdrLine3(JAXBElement<String> value) {
        this.gftRecognitionCustomerAdrLine3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftRecognitionCustomerAdrCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftRecognitionCustomerAdrCity() {
        return gftRecognitionCustomerAdrCity;
    }

    /**
     * Sets the value of the gftRecognitionCustomerAdrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftRecognitionCustomerAdrCity(JAXBElement<String> value) {
        this.gftRecognitionCustomerAdrCity = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftRecognitionCustomerAdrState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftRecognitionCustomerAdrState() {
        return gftRecognitionCustomerAdrState;
    }

    /**
     * Sets the value of the gftRecognitionCustomerAdrState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftRecognitionCustomerAdrState(JAXBElement<String> value) {
        this.gftRecognitionCustomerAdrState = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftRecognitionCustomerAdrPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftRecognitionCustomerAdrPostCode() {
        return gftRecognitionCustomerAdrPostCode;
    }

    /**
     * Sets the value of the gftRecognitionCustomerAdrPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftRecognitionCustomerAdrPostCode(JAXBElement<String> value) {
        this.gftRecognitionCustomerAdrPostCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftRecognitionCustomerAdrCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftRecognitionCustomerAdrCountry() {
        return gftRecognitionCustomerAdrCountry;
    }

    /**
     * Sets the value of the gftRecognitionCustomerAdrCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftRecognitionCustomerAdrCountry(JAXBElement<String> value) {
        this.gftRecognitionCustomerAdrCountry = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftPlgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftPlgKey() {
        return gftPlgKey;
    }

    /**
     * Sets the value of the gftPlgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftPlgKey(JAXBElement<String> value) {
        this.gftPlgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftTransferFromGftKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftTransferFromGftKey() {
        return gftTransferFromGftKey;
    }

    /**
     * Sets the value of the gftTransferFromGftKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftTransferFromGftKey(JAXBElement<String> value) {
        this.gftTransferFromGftKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftSctKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftSctKey() {
        return gftSctKey;
    }

    /**
     * Sets the value of the gftSctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftSctKey(JAXBElement<String> value) {
        this.gftSctKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftLiquidationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGftLiquidationAmount() {
        return gftLiquidationAmount;
    }

    /**
     * Sets the value of the gftLiquidationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGftLiquidationAmount(JAXBElement<BigDecimal> value) {
        this.gftLiquidationAmount = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the gftClgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftClgKey() {
        return gftClgKey;
    }

    /**
     * Sets the value of the gftClgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftClgKey(JAXBElement<String> value) {
        this.gftClgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftOtherMatchProgram property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftOtherMatchProgram() {
        return gftOtherMatchProgram;
    }

    /**
     * Sets the value of the gftOtherMatchProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftOtherMatchProgram(JAXBElement<String> value) {
        this.gftOtherMatchProgram = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftFormCompleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getGftFormCompleteFlag() {
        return gftFormCompleteFlag;
    }

    /**
     * Sets the value of the gftFormCompleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setGftFormCompleteFlag(JAXBElement<Short> value) {
        this.gftFormCompleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the gftDateSent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftDateSent() {
        return gftDateSent;
    }

    /**
     * Sets the value of the gftDateSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftDateSent(JAXBElement<String> value) {
        this.gftDateSent = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftDateReceived property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftDateReceived() {
        return gftDateReceived;
    }

    /**
     * Sets the value of the gftDateReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftDateReceived(JAXBElement<String> value) {
        this.gftDateReceived = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftSolicitorCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftSolicitorCstKey() {
        return gftSolicitorCstKey;
    }

    /**
     * Sets the value of the gftSolicitorCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftSolicitorCstKey(JAXBElement<String> value) {
        this.gftSolicitorCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftTicker property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftTicker() {
        return gftTicker;
    }

    /**
     * Sets the value of the gftTicker property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftTicker(JAXBElement<String> value) {
        this.gftTicker = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftAcknowledgmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftAcknowledgmentDate() {
        return gftAcknowledgmentDate;
    }

    /**
     * Sets the value of the gftAcknowledgmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftAcknowledgmentDate(JAXBElement<String> value) {
        this.gftAcknowledgmentDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftBatchCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftBatchCode() {
        return gftBatchCode;
    }

    /**
     * Sets the value of the gftBatchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftBatchCode(JAXBElement<String> value) {
        this.gftBatchCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftMailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getGftMailFlag() {
        return gftMailFlag;
    }

    /**
     * Sets the value of the gftMailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setGftMailFlag(JAXBElement<Short> value) {
        this.gftMailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the gftRecognizeAs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftRecognizeAs() {
        return gftRecognizeAs;
    }

    /**
     * Sets the value of the gftRecognizeAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftRecognizeAs(JAXBElement<String> value) {
        this.gftRecognizeAs = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftLiquidationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftLiquidationDate() {
        return gftLiquidationDate;
    }

    /**
     * Sets the value of the gftLiquidationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftLiquidationDate(JAXBElement<String> value) {
        this.gftLiquidationDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftSrcKey() {
        return gftSrcKey;
    }

    /**
     * Sets the value of the gftSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftSrcKey(JAXBElement<String> value) {
        this.gftSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftRegKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftRegKey() {
        return gftRegKey;
    }

    /**
     * Sets the value of the gftRegKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftRegKey(JAXBElement<String> value) {
        this.gftRegKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftTaxReceiptSentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftTaxReceiptSentDate() {
        return gftTaxReceiptSentDate;
    }

    /**
     * Sets the value of the gftTaxReceiptSentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftTaxReceiptSentDate(JAXBElement<String> value) {
        this.gftTaxReceiptSentDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftTbtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftTbtKey() {
        return gftTbtKey;
    }

    /**
     * Sets the value of the gftTbtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftTbtKey(JAXBElement<String> value) {
        this.gftTbtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftPersonalMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftPersonalMessage() {
        return gftPersonalMessage;
    }

    /**
     * Sets the value of the gftPersonalMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftPersonalMessage(JAXBElement<String> value) {
        this.gftPersonalMessage = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGftAmount() {
        return gftAmount;
    }

    /**
     * Sets the value of the gftAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGftAmount(JAXBElement<BigDecimal> value) {
        this.gftAmount = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the gftInvExistsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getGftInvExistsFlag() {
        return gftInvExistsFlag;
    }

    /**
     * Sets the value of the gftInvExistsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setGftInvExistsFlag(JAXBElement<Short> value) {
        this.gftInvExistsFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the gftRepeatGiftFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getGftRepeatGiftFlag() {
        return gftRepeatGiftFlag;
    }

    /**
     * Sets the value of the gftRepeatGiftFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setGftRepeatGiftFlag(JAXBElement<Short> value) {
        this.gftRepeatGiftFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the gftBupPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftBupPrdKey() {
        return gftBupPrdKey;
    }

    /**
     * Sets the value of the gftBupPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftBupPrdKey(JAXBElement<String> value) {
        this.gftBupPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftPrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftPrcKey() {
        return gftPrcKey;
    }

    /**
     * Sets the value of the gftPrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftPrcKey(JAXBElement<String> value) {
        this.gftPrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftCorporateMatchFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getGftCorporateMatchFlag() {
        return gftCorporateMatchFlag;
    }

    /**
     * Sets the value of the gftCorporateMatchFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setGftCorporateMatchFlag(JAXBElement<Short> value) {
        this.gftCorporateMatchFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the gftFormkey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftFormkey() {
        return gftFormkey;
    }

    /**
     * Sets the value of the gftFormkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftFormkey(JAXBElement<String> value) {
        this.gftFormkey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftParentdataobject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftParentdataobject() {
        return gftParentdataobject;
    }

    /**
     * Sets the value of the gftParentdataobject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftParentdataobject(JAXBElement<String> value) {
        this.gftParentdataobject = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftPreviousGiftRecognizeAs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftPreviousGiftRecognizeAs() {
        return gftPreviousGiftRecognizeAs;
    }

    /**
     * Sets the value of the gftPreviousGiftRecognizeAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftPreviousGiftRecognizeAs(JAXBElement<String> value) {
        this.gftPreviousGiftRecognizeAs = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftFrequency() {
        return gftFrequency;
    }

    /**
     * Sets the value of the gftFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftFrequency(JAXBElement<String> value) {
        this.gftFrequency = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftRecurringFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getGftRecurringFlag() {
        return gftRecurringFlag;
    }

    /**
     * Sets the value of the gftRecurringFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setGftRecurringFlag(JAXBElement<Short> value) {
        this.gftRecurringFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the gftCompGiftAddFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getGftCompGiftAddFlag() {
        return gftCompGiftAddFlag;
    }

    /**
     * Sets the value of the gftCompGiftAddFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setGftCompGiftAddFlag(JAXBElement<Short> value) {
        this.gftCompGiftAddFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the gftOdsKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftOdsKey() {
        return gftOdsKey;
    }

    /**
     * Sets the value of the gftOdsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftOdsKey(JAXBElement<String> value) {
        this.gftOdsKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftOrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftOrdKey() {
        return gftOrdKey;
    }

    /**
     * Sets the value of the gftOrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftOrdKey(JAXBElement<String> value) {
        this.gftOrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gftFundEventRegKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGftFundEventRegKey() {
        return gftFundEventRegKey;
    }

    /**
     * Sets the value of the gftFundEventRegKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGftFundEventRegKey(JAXBElement<String> value) {
        this.gftFundEventRegKey = ((JAXBElement<String> ) value);
    }

}
