
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_ComplementaryGifts_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_ComplementaryGifts_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gf3__gft_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_dnr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_apl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_fun_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_cmp_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_gty_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_deductable_amt" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_frt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_fpc_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_ivd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_stock_name" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_cct_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_notes" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_number_of_shares" type="{http://www.avectra.com/2005/}av_float_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_pck_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_gft_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_prm_prc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_share_price" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_anonymous_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_inv_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_recognition_customer_adr_line1" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_recognition_customer_adr_line2" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_soft_money" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_recognition_customer" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_recognition_customer_adr_line3" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_recognition_customer_adr_city" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_recognition_customer_adr_state" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_recognition_customer_adr_post_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_recognition_customer_adr_country" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_plg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_transfer_from_gft_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_sct_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_liquidation_amount" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_clg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_other_match_program" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_form_complete_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_date_sent" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_date_received" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_solicitor_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_ticker" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_acknowledgment_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_batch_code" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_mail_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_recognize_as" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_liquidation_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_reg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_tax_receipt_sent_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_tbt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf3__gft_personal_message" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_ComplementaryGifts_DataObjectType", propOrder = {
    "gf3GftKey",
    "gf3GftDnrKey",
    "gf3GftAplKey",
    "gf3GftFunKey",
    "gf3GftCmpKey",
    "gf3GftGtyKey",
    "gf3GftDate",
    "gf3GftDeductableAmt",
    "gf3GftAddUser",
    "gf3GftAddDate",
    "gf3GftChangeUser",
    "gf3GftChangeDate",
    "gf3GftDeleteFlag",
    "gf3GftEntityKey",
    "gf3GftFrtKey",
    "gf3GftCstKey",
    "gf3GftKeyExt",
    "gf3GftFpcPrdKey",
    "gf3GftIvdKey",
    "gf3GftStockName",
    "gf3GftCctKey",
    "gf3GftNotes",
    "gf3GftNumberOfShares",
    "gf3GftPckKey",
    "gf3GftGftKey",
    "gf3GftPrmPrcKey",
    "gf3GftSharePrice",
    "gf3GftAnonymousFlag",
    "gf3GftInvCode",
    "gf3GftRecognitionCustomerAdrLine1",
    "gf3GftRecognitionCustomerAdrLine2",
    "gf3GftSoftMoney",
    "gf3GftRecognitionCustomer",
    "gf3GftRecognitionCustomerAdrLine3",
    "gf3GftRecognitionCustomerAdrCity",
    "gf3GftRecognitionCustomerAdrState",
    "gf3GftRecognitionCustomerAdrPostCode",
    "gf3GftRecognitionCustomerAdrCountry",
    "gf3GftPlgKey",
    "gf3GftTransferFromGftKey",
    "gf3GftSctKey",
    "gf3GftLiquidationAmount",
    "gf3GftClgKey",
    "gf3GftOtherMatchProgram",
    "gf3GftFormCompleteFlag",
    "gf3GftDateSent",
    "gf3GftDateReceived",
    "gf3GftSolicitorCstKey",
    "gf3GftTicker",
    "gf3GftAcknowledgmentDate",
    "gf3GftBatchCode",
    "gf3GftMailFlag",
    "gf3GftRecognizeAs",
    "gf3GftLiquidationDate",
    "gf3GftSrcKey",
    "gf3GftRegKey",
    "gf3GftTaxReceiptSentDate",
    "gf3GftTbtKey",
    "gf3GftPersonalMessage"
})
public class FundraisingGiftComplementaryGiftsDataObjectType {

    @XmlElementRef(name = "gf3__gft_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftKey;
    @XmlElementRef(name = "gf3__gft_dnr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftDnrKey;
    @XmlElementRef(name = "gf3__gft_apl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftAplKey;
    @XmlElementRef(name = "gf3__gft_fun_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftFunKey;
    @XmlElementRef(name = "gf3__gft_cmp_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftCmpKey;
    @XmlElementRef(name = "gf3__gft_gty_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftGtyKey;
    @XmlElementRef(name = "gf3__gft_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftDate;
    @XmlElementRef(name = "gf3__gft_deductable_amt", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> gf3GftDeductableAmt;
    @XmlElementRef(name = "gf3__gft_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftAddUser;
    @XmlElementRef(name = "gf3__gft_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftAddDate;
    @XmlElementRef(name = "gf3__gft_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftChangeUser;
    @XmlElementRef(name = "gf3__gft_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftChangeDate;
    @XmlElementRef(name = "gf3__gft_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> gf3GftDeleteFlag;
    @XmlElementRef(name = "gf3__gft_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftEntityKey;
    @XmlElementRef(name = "gf3__gft_frt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftFrtKey;
    @XmlElementRef(name = "gf3__gft_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftCstKey;
    @XmlElementRef(name = "gf3__gft_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftKeyExt;
    @XmlElementRef(name = "gf3__gft_fpc_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftFpcPrdKey;
    @XmlElementRef(name = "gf3__gft_ivd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftIvdKey;
    @XmlElementRef(name = "gf3__gft_stock_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftStockName;
    @XmlElementRef(name = "gf3__gft_cct_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftCctKey;
    @XmlElementRef(name = "gf3__gft_notes", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftNotes;
    @XmlElementRef(name = "gf3__gft_number_of_shares", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Double> gf3GftNumberOfShares;
    @XmlElementRef(name = "gf3__gft_pck_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftPckKey;
    @XmlElementRef(name = "gf3__gft_gft_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftGftKey;
    @XmlElementRef(name = "gf3__gft_prm_prc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftPrmPrcKey;
    @XmlElementRef(name = "gf3__gft_share_price", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> gf3GftSharePrice;
    @XmlElementRef(name = "gf3__gft_anonymous_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> gf3GftAnonymousFlag;
    @XmlElementRef(name = "gf3__gft_inv_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftInvCode;
    @XmlElementRef(name = "gf3__gft_recognition_customer_adr_line1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftRecognitionCustomerAdrLine1;
    @XmlElementRef(name = "gf3__gft_recognition_customer_adr_line2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftRecognitionCustomerAdrLine2;
    @XmlElementRef(name = "gf3__gft_soft_money", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> gf3GftSoftMoney;
    @XmlElementRef(name = "gf3__gft_recognition_customer", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftRecognitionCustomer;
    @XmlElementRef(name = "gf3__gft_recognition_customer_adr_line3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftRecognitionCustomerAdrLine3;
    @XmlElementRef(name = "gf3__gft_recognition_customer_adr_city", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftRecognitionCustomerAdrCity;
    @XmlElementRef(name = "gf3__gft_recognition_customer_adr_state", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftRecognitionCustomerAdrState;
    @XmlElementRef(name = "gf3__gft_recognition_customer_adr_post_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftRecognitionCustomerAdrPostCode;
    @XmlElementRef(name = "gf3__gft_recognition_customer_adr_country", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftRecognitionCustomerAdrCountry;
    @XmlElementRef(name = "gf3__gft_plg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftPlgKey;
    @XmlElementRef(name = "gf3__gft_transfer_from_gft_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftTransferFromGftKey;
    @XmlElementRef(name = "gf3__gft_sct_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftSctKey;
    @XmlElementRef(name = "gf3__gft_liquidation_amount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> gf3GftLiquidationAmount;
    @XmlElementRef(name = "gf3__gft_clg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftClgKey;
    @XmlElementRef(name = "gf3__gft_other_match_program", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftOtherMatchProgram;
    @XmlElementRef(name = "gf3__gft_form_complete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> gf3GftFormCompleteFlag;
    @XmlElementRef(name = "gf3__gft_date_sent", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftDateSent;
    @XmlElementRef(name = "gf3__gft_date_received", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftDateReceived;
    @XmlElementRef(name = "gf3__gft_solicitor_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftSolicitorCstKey;
    @XmlElementRef(name = "gf3__gft_ticker", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftTicker;
    @XmlElementRef(name = "gf3__gft_acknowledgment_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftAcknowledgmentDate;
    @XmlElementRef(name = "gf3__gft_batch_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftBatchCode;
    @XmlElementRef(name = "gf3__gft_mail_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> gf3GftMailFlag;
    @XmlElementRef(name = "gf3__gft_recognize_as", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftRecognizeAs;
    @XmlElementRef(name = "gf3__gft_liquidation_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftLiquidationDate;
    @XmlElementRef(name = "gf3__gft_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftSrcKey;
    @XmlElementRef(name = "gf3__gft_reg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftRegKey;
    @XmlElementRef(name = "gf3__gft_tax_receipt_sent_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftTaxReceiptSentDate;
    @XmlElementRef(name = "gf3__gft_tbt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftTbtKey;
    @XmlElementRef(name = "gf3__gft_personal_message", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf3GftPersonalMessage;

    /**
     * Gets the value of the gf3GftKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftKey() {
        return gf3GftKey;
    }

    /**
     * Sets the value of the gf3GftKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftKey(JAXBElement<String> value) {
        this.gf3GftKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftDnrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftDnrKey() {
        return gf3GftDnrKey;
    }

    /**
     * Sets the value of the gf3GftDnrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftDnrKey(JAXBElement<String> value) {
        this.gf3GftDnrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftAplKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftAplKey() {
        return gf3GftAplKey;
    }

    /**
     * Sets the value of the gf3GftAplKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftAplKey(JAXBElement<String> value) {
        this.gf3GftAplKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftFunKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftFunKey() {
        return gf3GftFunKey;
    }

    /**
     * Sets the value of the gf3GftFunKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftFunKey(JAXBElement<String> value) {
        this.gf3GftFunKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftCmpKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftCmpKey() {
        return gf3GftCmpKey;
    }

    /**
     * Sets the value of the gf3GftCmpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftCmpKey(JAXBElement<String> value) {
        this.gf3GftCmpKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftGtyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftGtyKey() {
        return gf3GftGtyKey;
    }

    /**
     * Sets the value of the gf3GftGtyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftGtyKey(JAXBElement<String> value) {
        this.gf3GftGtyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftDate() {
        return gf3GftDate;
    }

    /**
     * Sets the value of the gf3GftDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftDate(JAXBElement<String> value) {
        this.gf3GftDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftDeductableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGf3GftDeductableAmt() {
        return gf3GftDeductableAmt;
    }

    /**
     * Sets the value of the gf3GftDeductableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGf3GftDeductableAmt(JAXBElement<BigDecimal> value) {
        this.gf3GftDeductableAmt = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the gf3GftAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftAddUser() {
        return gf3GftAddUser;
    }

    /**
     * Sets the value of the gf3GftAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftAddUser(JAXBElement<String> value) {
        this.gf3GftAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftAddDate() {
        return gf3GftAddDate;
    }

    /**
     * Sets the value of the gf3GftAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftAddDate(JAXBElement<String> value) {
        this.gf3GftAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftChangeUser() {
        return gf3GftChangeUser;
    }

    /**
     * Sets the value of the gf3GftChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftChangeUser(JAXBElement<String> value) {
        this.gf3GftChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftChangeDate() {
        return gf3GftChangeDate;
    }

    /**
     * Sets the value of the gf3GftChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftChangeDate(JAXBElement<String> value) {
        this.gf3GftChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getGf3GftDeleteFlag() {
        return gf3GftDeleteFlag;
    }

    /**
     * Sets the value of the gf3GftDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setGf3GftDeleteFlag(JAXBElement<Short> value) {
        this.gf3GftDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the gf3GftEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftEntityKey() {
        return gf3GftEntityKey;
    }

    /**
     * Sets the value of the gf3GftEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftEntityKey(JAXBElement<String> value) {
        this.gf3GftEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftFrtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftFrtKey() {
        return gf3GftFrtKey;
    }

    /**
     * Sets the value of the gf3GftFrtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftFrtKey(JAXBElement<String> value) {
        this.gf3GftFrtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftCstKey() {
        return gf3GftCstKey;
    }

    /**
     * Sets the value of the gf3GftCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftCstKey(JAXBElement<String> value) {
        this.gf3GftCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftKeyExt() {
        return gf3GftKeyExt;
    }

    /**
     * Sets the value of the gf3GftKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftKeyExt(JAXBElement<String> value) {
        this.gf3GftKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftFpcPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftFpcPrdKey() {
        return gf3GftFpcPrdKey;
    }

    /**
     * Sets the value of the gf3GftFpcPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftFpcPrdKey(JAXBElement<String> value) {
        this.gf3GftFpcPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftIvdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftIvdKey() {
        return gf3GftIvdKey;
    }

    /**
     * Sets the value of the gf3GftIvdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftIvdKey(JAXBElement<String> value) {
        this.gf3GftIvdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftStockName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftStockName() {
        return gf3GftStockName;
    }

    /**
     * Sets the value of the gf3GftStockName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftStockName(JAXBElement<String> value) {
        this.gf3GftStockName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftCctKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftCctKey() {
        return gf3GftCctKey;
    }

    /**
     * Sets the value of the gf3GftCctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftCctKey(JAXBElement<String> value) {
        this.gf3GftCctKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftNotes() {
        return gf3GftNotes;
    }

    /**
     * Sets the value of the gf3GftNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftNotes(JAXBElement<String> value) {
        this.gf3GftNotes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftNumberOfShares property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getGf3GftNumberOfShares() {
        return gf3GftNumberOfShares;
    }

    /**
     * Sets the value of the gf3GftNumberOfShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setGf3GftNumberOfShares(JAXBElement<Double> value) {
        this.gf3GftNumberOfShares = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the gf3GftPckKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftPckKey() {
        return gf3GftPckKey;
    }

    /**
     * Sets the value of the gf3GftPckKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftPckKey(JAXBElement<String> value) {
        this.gf3GftPckKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftGftKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftGftKey() {
        return gf3GftGftKey;
    }

    /**
     * Sets the value of the gf3GftGftKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftGftKey(JAXBElement<String> value) {
        this.gf3GftGftKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftPrmPrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftPrmPrcKey() {
        return gf3GftPrmPrcKey;
    }

    /**
     * Sets the value of the gf3GftPrmPrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftPrmPrcKey(JAXBElement<String> value) {
        this.gf3GftPrmPrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftSharePrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGf3GftSharePrice() {
        return gf3GftSharePrice;
    }

    /**
     * Sets the value of the gf3GftSharePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGf3GftSharePrice(JAXBElement<BigDecimal> value) {
        this.gf3GftSharePrice = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the gf3GftAnonymousFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getGf3GftAnonymousFlag() {
        return gf3GftAnonymousFlag;
    }

    /**
     * Sets the value of the gf3GftAnonymousFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setGf3GftAnonymousFlag(JAXBElement<Short> value) {
        this.gf3GftAnonymousFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the gf3GftInvCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftInvCode() {
        return gf3GftInvCode;
    }

    /**
     * Sets the value of the gf3GftInvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftInvCode(JAXBElement<String> value) {
        this.gf3GftInvCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftRecognitionCustomerAdrLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftRecognitionCustomerAdrLine1() {
        return gf3GftRecognitionCustomerAdrLine1;
    }

    /**
     * Sets the value of the gf3GftRecognitionCustomerAdrLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftRecognitionCustomerAdrLine1(JAXBElement<String> value) {
        this.gf3GftRecognitionCustomerAdrLine1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftRecognitionCustomerAdrLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftRecognitionCustomerAdrLine2() {
        return gf3GftRecognitionCustomerAdrLine2;
    }

    /**
     * Sets the value of the gf3GftRecognitionCustomerAdrLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftRecognitionCustomerAdrLine2(JAXBElement<String> value) {
        this.gf3GftRecognitionCustomerAdrLine2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftSoftMoney property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGf3GftSoftMoney() {
        return gf3GftSoftMoney;
    }

    /**
     * Sets the value of the gf3GftSoftMoney property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGf3GftSoftMoney(JAXBElement<BigDecimal> value) {
        this.gf3GftSoftMoney = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the gf3GftRecognitionCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftRecognitionCustomer() {
        return gf3GftRecognitionCustomer;
    }

    /**
     * Sets the value of the gf3GftRecognitionCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftRecognitionCustomer(JAXBElement<String> value) {
        this.gf3GftRecognitionCustomer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftRecognitionCustomerAdrLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftRecognitionCustomerAdrLine3() {
        return gf3GftRecognitionCustomerAdrLine3;
    }

    /**
     * Sets the value of the gf3GftRecognitionCustomerAdrLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftRecognitionCustomerAdrLine3(JAXBElement<String> value) {
        this.gf3GftRecognitionCustomerAdrLine3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftRecognitionCustomerAdrCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftRecognitionCustomerAdrCity() {
        return gf3GftRecognitionCustomerAdrCity;
    }

    /**
     * Sets the value of the gf3GftRecognitionCustomerAdrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftRecognitionCustomerAdrCity(JAXBElement<String> value) {
        this.gf3GftRecognitionCustomerAdrCity = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftRecognitionCustomerAdrState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftRecognitionCustomerAdrState() {
        return gf3GftRecognitionCustomerAdrState;
    }

    /**
     * Sets the value of the gf3GftRecognitionCustomerAdrState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftRecognitionCustomerAdrState(JAXBElement<String> value) {
        this.gf3GftRecognitionCustomerAdrState = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftRecognitionCustomerAdrPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftRecognitionCustomerAdrPostCode() {
        return gf3GftRecognitionCustomerAdrPostCode;
    }

    /**
     * Sets the value of the gf3GftRecognitionCustomerAdrPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftRecognitionCustomerAdrPostCode(JAXBElement<String> value) {
        this.gf3GftRecognitionCustomerAdrPostCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftRecognitionCustomerAdrCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftRecognitionCustomerAdrCountry() {
        return gf3GftRecognitionCustomerAdrCountry;
    }

    /**
     * Sets the value of the gf3GftRecognitionCustomerAdrCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftRecognitionCustomerAdrCountry(JAXBElement<String> value) {
        this.gf3GftRecognitionCustomerAdrCountry = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftPlgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftPlgKey() {
        return gf3GftPlgKey;
    }

    /**
     * Sets the value of the gf3GftPlgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftPlgKey(JAXBElement<String> value) {
        this.gf3GftPlgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftTransferFromGftKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftTransferFromGftKey() {
        return gf3GftTransferFromGftKey;
    }

    /**
     * Sets the value of the gf3GftTransferFromGftKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftTransferFromGftKey(JAXBElement<String> value) {
        this.gf3GftTransferFromGftKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftSctKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftSctKey() {
        return gf3GftSctKey;
    }

    /**
     * Sets the value of the gf3GftSctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftSctKey(JAXBElement<String> value) {
        this.gf3GftSctKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftLiquidationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGf3GftLiquidationAmount() {
        return gf3GftLiquidationAmount;
    }

    /**
     * Sets the value of the gf3GftLiquidationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGf3GftLiquidationAmount(JAXBElement<BigDecimal> value) {
        this.gf3GftLiquidationAmount = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the gf3GftClgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftClgKey() {
        return gf3GftClgKey;
    }

    /**
     * Sets the value of the gf3GftClgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftClgKey(JAXBElement<String> value) {
        this.gf3GftClgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftOtherMatchProgram property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftOtherMatchProgram() {
        return gf3GftOtherMatchProgram;
    }

    /**
     * Sets the value of the gf3GftOtherMatchProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftOtherMatchProgram(JAXBElement<String> value) {
        this.gf3GftOtherMatchProgram = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftFormCompleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getGf3GftFormCompleteFlag() {
        return gf3GftFormCompleteFlag;
    }

    /**
     * Sets the value of the gf3GftFormCompleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setGf3GftFormCompleteFlag(JAXBElement<Short> value) {
        this.gf3GftFormCompleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the gf3GftDateSent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftDateSent() {
        return gf3GftDateSent;
    }

    /**
     * Sets the value of the gf3GftDateSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftDateSent(JAXBElement<String> value) {
        this.gf3GftDateSent = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftDateReceived property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftDateReceived() {
        return gf3GftDateReceived;
    }

    /**
     * Sets the value of the gf3GftDateReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftDateReceived(JAXBElement<String> value) {
        this.gf3GftDateReceived = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftSolicitorCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftSolicitorCstKey() {
        return gf3GftSolicitorCstKey;
    }

    /**
     * Sets the value of the gf3GftSolicitorCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftSolicitorCstKey(JAXBElement<String> value) {
        this.gf3GftSolicitorCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftTicker property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftTicker() {
        return gf3GftTicker;
    }

    /**
     * Sets the value of the gf3GftTicker property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftTicker(JAXBElement<String> value) {
        this.gf3GftTicker = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftAcknowledgmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftAcknowledgmentDate() {
        return gf3GftAcknowledgmentDate;
    }

    /**
     * Sets the value of the gf3GftAcknowledgmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftAcknowledgmentDate(JAXBElement<String> value) {
        this.gf3GftAcknowledgmentDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftBatchCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftBatchCode() {
        return gf3GftBatchCode;
    }

    /**
     * Sets the value of the gf3GftBatchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftBatchCode(JAXBElement<String> value) {
        this.gf3GftBatchCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftMailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getGf3GftMailFlag() {
        return gf3GftMailFlag;
    }

    /**
     * Sets the value of the gf3GftMailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setGf3GftMailFlag(JAXBElement<Short> value) {
        this.gf3GftMailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the gf3GftRecognizeAs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftRecognizeAs() {
        return gf3GftRecognizeAs;
    }

    /**
     * Sets the value of the gf3GftRecognizeAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftRecognizeAs(JAXBElement<String> value) {
        this.gf3GftRecognizeAs = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftLiquidationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftLiquidationDate() {
        return gf3GftLiquidationDate;
    }

    /**
     * Sets the value of the gf3GftLiquidationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftLiquidationDate(JAXBElement<String> value) {
        this.gf3GftLiquidationDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftSrcKey() {
        return gf3GftSrcKey;
    }

    /**
     * Sets the value of the gf3GftSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftSrcKey(JAXBElement<String> value) {
        this.gf3GftSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftRegKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftRegKey() {
        return gf3GftRegKey;
    }

    /**
     * Sets the value of the gf3GftRegKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftRegKey(JAXBElement<String> value) {
        this.gf3GftRegKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftTaxReceiptSentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftTaxReceiptSentDate() {
        return gf3GftTaxReceiptSentDate;
    }

    /**
     * Sets the value of the gf3GftTaxReceiptSentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftTaxReceiptSentDate(JAXBElement<String> value) {
        this.gf3GftTaxReceiptSentDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftTbtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftTbtKey() {
        return gf3GftTbtKey;
    }

    /**
     * Sets the value of the gf3GftTbtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftTbtKey(JAXBElement<String> value) {
        this.gf3GftTbtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf3GftPersonalMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf3GftPersonalMessage() {
        return gf3GftPersonalMessage;
    }

    /**
     * Sets the value of the gf3GftPersonalMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf3GftPersonalMessage(JAXBElement<String> value) {
        this.gf3GftPersonalMessage = ((JAXBElement<String> ) value);
    }

}
