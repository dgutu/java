
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Contributor_Gift_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Contributor_Gift_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gf2__gft_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_dnr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_apl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_fun_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_cmp_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_gty_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_deductable_amt" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_frt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_fpc_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_ivd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_stock_name" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_cct_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_notes" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_number_of_shares" type="{http://www.avectra.com/2005/}av_float_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_pck_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_gft_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_prm_prc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_share_price" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_anonymous_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_inv_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_recognition_customer_adr_line1" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_recognition_customer_adr_line2" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_soft_money" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_recognition_customer" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_recognition_customer_adr_line3" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_recognition_customer_adr_city" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_recognition_customer_adr_state" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_recognition_customer_adr_post_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_recognition_customer_adr_country" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_plg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_transfer_from_gft_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_sct_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_liquidation_amount" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_clg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_other_match_program" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_form_complete_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_date_sent" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_date_received" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_solicitor_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_ticker" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_acknowledgment_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_batch_code" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_mail_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_recognize_as" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_liquidation_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_reg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_tax_receipt_sent_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_tbt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gf2__gft_personal_message" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Contributor_Gift_DataObjectType", propOrder = {
    "gf2GftKey",
    "gf2GftDnrKey",
    "gf2GftAplKey",
    "gf2GftFunKey",
    "gf2GftCmpKey",
    "gf2GftGtyKey",
    "gf2GftDate",
    "gf2GftDeductableAmt",
    "gf2GftAddUser",
    "gf2GftAddDate",
    "gf2GftChangeUser",
    "gf2GftChangeDate",
    "gf2GftDeleteFlag",
    "gf2GftEntityKey",
    "gf2GftFrtKey",
    "gf2GftCstKey",
    "gf2GftKeyExt",
    "gf2GftFpcPrdKey",
    "gf2GftIvdKey",
    "gf2GftStockName",
    "gf2GftCctKey",
    "gf2GftNotes",
    "gf2GftNumberOfShares",
    "gf2GftPckKey",
    "gf2GftGftKey",
    "gf2GftPrmPrcKey",
    "gf2GftSharePrice",
    "gf2GftAnonymousFlag",
    "gf2GftInvCode",
    "gf2GftRecognitionCustomerAdrLine1",
    "gf2GftRecognitionCustomerAdrLine2",
    "gf2GftSoftMoney",
    "gf2GftRecognitionCustomer",
    "gf2GftRecognitionCustomerAdrLine3",
    "gf2GftRecognitionCustomerAdrCity",
    "gf2GftRecognitionCustomerAdrState",
    "gf2GftRecognitionCustomerAdrPostCode",
    "gf2GftRecognitionCustomerAdrCountry",
    "gf2GftPlgKey",
    "gf2GftTransferFromGftKey",
    "gf2GftSctKey",
    "gf2GftLiquidationAmount",
    "gf2GftClgKey",
    "gf2GftOtherMatchProgram",
    "gf2GftFormCompleteFlag",
    "gf2GftDateSent",
    "gf2GftDateReceived",
    "gf2GftSolicitorCstKey",
    "gf2GftTicker",
    "gf2GftAcknowledgmentDate",
    "gf2GftBatchCode",
    "gf2GftMailFlag",
    "gf2GftRecognizeAs",
    "gf2GftLiquidationDate",
    "gf2GftSrcKey",
    "gf2GftRegKey",
    "gf2GftTaxReceiptSentDate",
    "gf2GftTbtKey",
    "gf2GftPersonalMessage"
})
public class FundraisingGiftContributorGiftDataObjectType {

    @XmlElementRef(name = "gf2__gft_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftKey;
    @XmlElementRef(name = "gf2__gft_dnr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftDnrKey;
    @XmlElementRef(name = "gf2__gft_apl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftAplKey;
    @XmlElementRef(name = "gf2__gft_fun_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftFunKey;
    @XmlElementRef(name = "gf2__gft_cmp_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftCmpKey;
    @XmlElementRef(name = "gf2__gft_gty_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftGtyKey;
    @XmlElementRef(name = "gf2__gft_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftDate;
    @XmlElementRef(name = "gf2__gft_deductable_amt", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> gf2GftDeductableAmt;
    @XmlElementRef(name = "gf2__gft_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftAddUser;
    @XmlElementRef(name = "gf2__gft_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftAddDate;
    @XmlElementRef(name = "gf2__gft_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftChangeUser;
    @XmlElementRef(name = "gf2__gft_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftChangeDate;
    @XmlElementRef(name = "gf2__gft_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> gf2GftDeleteFlag;
    @XmlElementRef(name = "gf2__gft_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftEntityKey;
    @XmlElementRef(name = "gf2__gft_frt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftFrtKey;
    @XmlElementRef(name = "gf2__gft_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftCstKey;
    @XmlElementRef(name = "gf2__gft_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftKeyExt;
    @XmlElementRef(name = "gf2__gft_fpc_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftFpcPrdKey;
    @XmlElementRef(name = "gf2__gft_ivd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftIvdKey;
    @XmlElementRef(name = "gf2__gft_stock_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftStockName;
    @XmlElementRef(name = "gf2__gft_cct_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftCctKey;
    @XmlElementRef(name = "gf2__gft_notes", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftNotes;
    @XmlElementRef(name = "gf2__gft_number_of_shares", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Double> gf2GftNumberOfShares;
    @XmlElementRef(name = "gf2__gft_pck_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftPckKey;
    @XmlElementRef(name = "gf2__gft_gft_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftGftKey;
    @XmlElementRef(name = "gf2__gft_prm_prc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftPrmPrcKey;
    @XmlElementRef(name = "gf2__gft_share_price", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> gf2GftSharePrice;
    @XmlElementRef(name = "gf2__gft_anonymous_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> gf2GftAnonymousFlag;
    @XmlElementRef(name = "gf2__gft_inv_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftInvCode;
    @XmlElementRef(name = "gf2__gft_recognition_customer_adr_line1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftRecognitionCustomerAdrLine1;
    @XmlElementRef(name = "gf2__gft_recognition_customer_adr_line2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftRecognitionCustomerAdrLine2;
    @XmlElementRef(name = "gf2__gft_soft_money", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> gf2GftSoftMoney;
    @XmlElementRef(name = "gf2__gft_recognition_customer", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftRecognitionCustomer;
    @XmlElementRef(name = "gf2__gft_recognition_customer_adr_line3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftRecognitionCustomerAdrLine3;
    @XmlElementRef(name = "gf2__gft_recognition_customer_adr_city", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftRecognitionCustomerAdrCity;
    @XmlElementRef(name = "gf2__gft_recognition_customer_adr_state", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftRecognitionCustomerAdrState;
    @XmlElementRef(name = "gf2__gft_recognition_customer_adr_post_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftRecognitionCustomerAdrPostCode;
    @XmlElementRef(name = "gf2__gft_recognition_customer_adr_country", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftRecognitionCustomerAdrCountry;
    @XmlElementRef(name = "gf2__gft_plg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftPlgKey;
    @XmlElementRef(name = "gf2__gft_transfer_from_gft_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftTransferFromGftKey;
    @XmlElementRef(name = "gf2__gft_sct_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftSctKey;
    @XmlElementRef(name = "gf2__gft_liquidation_amount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> gf2GftLiquidationAmount;
    @XmlElementRef(name = "gf2__gft_clg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftClgKey;
    @XmlElementRef(name = "gf2__gft_other_match_program", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftOtherMatchProgram;
    @XmlElementRef(name = "gf2__gft_form_complete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> gf2GftFormCompleteFlag;
    @XmlElementRef(name = "gf2__gft_date_sent", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftDateSent;
    @XmlElementRef(name = "gf2__gft_date_received", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftDateReceived;
    @XmlElementRef(name = "gf2__gft_solicitor_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftSolicitorCstKey;
    @XmlElementRef(name = "gf2__gft_ticker", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftTicker;
    @XmlElementRef(name = "gf2__gft_acknowledgment_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftAcknowledgmentDate;
    @XmlElementRef(name = "gf2__gft_batch_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftBatchCode;
    @XmlElementRef(name = "gf2__gft_mail_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> gf2GftMailFlag;
    @XmlElementRef(name = "gf2__gft_recognize_as", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftRecognizeAs;
    @XmlElementRef(name = "gf2__gft_liquidation_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftLiquidationDate;
    @XmlElementRef(name = "gf2__gft_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftSrcKey;
    @XmlElementRef(name = "gf2__gft_reg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftRegKey;
    @XmlElementRef(name = "gf2__gft_tax_receipt_sent_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftTaxReceiptSentDate;
    @XmlElementRef(name = "gf2__gft_tbt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftTbtKey;
    @XmlElementRef(name = "gf2__gft_personal_message", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gf2GftPersonalMessage;

    /**
     * Gets the value of the gf2GftKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftKey() {
        return gf2GftKey;
    }

    /**
     * Sets the value of the gf2GftKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftKey(JAXBElement<String> value) {
        this.gf2GftKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftDnrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftDnrKey() {
        return gf2GftDnrKey;
    }

    /**
     * Sets the value of the gf2GftDnrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftDnrKey(JAXBElement<String> value) {
        this.gf2GftDnrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftAplKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftAplKey() {
        return gf2GftAplKey;
    }

    /**
     * Sets the value of the gf2GftAplKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftAplKey(JAXBElement<String> value) {
        this.gf2GftAplKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftFunKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftFunKey() {
        return gf2GftFunKey;
    }

    /**
     * Sets the value of the gf2GftFunKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftFunKey(JAXBElement<String> value) {
        this.gf2GftFunKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftCmpKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftCmpKey() {
        return gf2GftCmpKey;
    }

    /**
     * Sets the value of the gf2GftCmpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftCmpKey(JAXBElement<String> value) {
        this.gf2GftCmpKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftGtyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftGtyKey() {
        return gf2GftGtyKey;
    }

    /**
     * Sets the value of the gf2GftGtyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftGtyKey(JAXBElement<String> value) {
        this.gf2GftGtyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftDate() {
        return gf2GftDate;
    }

    /**
     * Sets the value of the gf2GftDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftDate(JAXBElement<String> value) {
        this.gf2GftDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftDeductableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGf2GftDeductableAmt() {
        return gf2GftDeductableAmt;
    }

    /**
     * Sets the value of the gf2GftDeductableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGf2GftDeductableAmt(JAXBElement<BigDecimal> value) {
        this.gf2GftDeductableAmt = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the gf2GftAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftAddUser() {
        return gf2GftAddUser;
    }

    /**
     * Sets the value of the gf2GftAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftAddUser(JAXBElement<String> value) {
        this.gf2GftAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftAddDate() {
        return gf2GftAddDate;
    }

    /**
     * Sets the value of the gf2GftAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftAddDate(JAXBElement<String> value) {
        this.gf2GftAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftChangeUser() {
        return gf2GftChangeUser;
    }

    /**
     * Sets the value of the gf2GftChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftChangeUser(JAXBElement<String> value) {
        this.gf2GftChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftChangeDate() {
        return gf2GftChangeDate;
    }

    /**
     * Sets the value of the gf2GftChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftChangeDate(JAXBElement<String> value) {
        this.gf2GftChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getGf2GftDeleteFlag() {
        return gf2GftDeleteFlag;
    }

    /**
     * Sets the value of the gf2GftDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setGf2GftDeleteFlag(JAXBElement<Short> value) {
        this.gf2GftDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the gf2GftEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftEntityKey() {
        return gf2GftEntityKey;
    }

    /**
     * Sets the value of the gf2GftEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftEntityKey(JAXBElement<String> value) {
        this.gf2GftEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftFrtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftFrtKey() {
        return gf2GftFrtKey;
    }

    /**
     * Sets the value of the gf2GftFrtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftFrtKey(JAXBElement<String> value) {
        this.gf2GftFrtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftCstKey() {
        return gf2GftCstKey;
    }

    /**
     * Sets the value of the gf2GftCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftCstKey(JAXBElement<String> value) {
        this.gf2GftCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftKeyExt() {
        return gf2GftKeyExt;
    }

    /**
     * Sets the value of the gf2GftKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftKeyExt(JAXBElement<String> value) {
        this.gf2GftKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftFpcPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftFpcPrdKey() {
        return gf2GftFpcPrdKey;
    }

    /**
     * Sets the value of the gf2GftFpcPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftFpcPrdKey(JAXBElement<String> value) {
        this.gf2GftFpcPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftIvdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftIvdKey() {
        return gf2GftIvdKey;
    }

    /**
     * Sets the value of the gf2GftIvdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftIvdKey(JAXBElement<String> value) {
        this.gf2GftIvdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftStockName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftStockName() {
        return gf2GftStockName;
    }

    /**
     * Sets the value of the gf2GftStockName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftStockName(JAXBElement<String> value) {
        this.gf2GftStockName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftCctKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftCctKey() {
        return gf2GftCctKey;
    }

    /**
     * Sets the value of the gf2GftCctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftCctKey(JAXBElement<String> value) {
        this.gf2GftCctKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftNotes() {
        return gf2GftNotes;
    }

    /**
     * Sets the value of the gf2GftNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftNotes(JAXBElement<String> value) {
        this.gf2GftNotes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftNumberOfShares property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getGf2GftNumberOfShares() {
        return gf2GftNumberOfShares;
    }

    /**
     * Sets the value of the gf2GftNumberOfShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setGf2GftNumberOfShares(JAXBElement<Double> value) {
        this.gf2GftNumberOfShares = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the gf2GftPckKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftPckKey() {
        return gf2GftPckKey;
    }

    /**
     * Sets the value of the gf2GftPckKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftPckKey(JAXBElement<String> value) {
        this.gf2GftPckKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftGftKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftGftKey() {
        return gf2GftGftKey;
    }

    /**
     * Sets the value of the gf2GftGftKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftGftKey(JAXBElement<String> value) {
        this.gf2GftGftKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftPrmPrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftPrmPrcKey() {
        return gf2GftPrmPrcKey;
    }

    /**
     * Sets the value of the gf2GftPrmPrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftPrmPrcKey(JAXBElement<String> value) {
        this.gf2GftPrmPrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftSharePrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGf2GftSharePrice() {
        return gf2GftSharePrice;
    }

    /**
     * Sets the value of the gf2GftSharePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGf2GftSharePrice(JAXBElement<BigDecimal> value) {
        this.gf2GftSharePrice = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the gf2GftAnonymousFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getGf2GftAnonymousFlag() {
        return gf2GftAnonymousFlag;
    }

    /**
     * Sets the value of the gf2GftAnonymousFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setGf2GftAnonymousFlag(JAXBElement<Short> value) {
        this.gf2GftAnonymousFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the gf2GftInvCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftInvCode() {
        return gf2GftInvCode;
    }

    /**
     * Sets the value of the gf2GftInvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftInvCode(JAXBElement<String> value) {
        this.gf2GftInvCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftRecognitionCustomerAdrLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftRecognitionCustomerAdrLine1() {
        return gf2GftRecognitionCustomerAdrLine1;
    }

    /**
     * Sets the value of the gf2GftRecognitionCustomerAdrLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftRecognitionCustomerAdrLine1(JAXBElement<String> value) {
        this.gf2GftRecognitionCustomerAdrLine1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftRecognitionCustomerAdrLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftRecognitionCustomerAdrLine2() {
        return gf2GftRecognitionCustomerAdrLine2;
    }

    /**
     * Sets the value of the gf2GftRecognitionCustomerAdrLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftRecognitionCustomerAdrLine2(JAXBElement<String> value) {
        this.gf2GftRecognitionCustomerAdrLine2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftSoftMoney property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGf2GftSoftMoney() {
        return gf2GftSoftMoney;
    }

    /**
     * Sets the value of the gf2GftSoftMoney property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGf2GftSoftMoney(JAXBElement<BigDecimal> value) {
        this.gf2GftSoftMoney = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the gf2GftRecognitionCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftRecognitionCustomer() {
        return gf2GftRecognitionCustomer;
    }

    /**
     * Sets the value of the gf2GftRecognitionCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftRecognitionCustomer(JAXBElement<String> value) {
        this.gf2GftRecognitionCustomer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftRecognitionCustomerAdrLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftRecognitionCustomerAdrLine3() {
        return gf2GftRecognitionCustomerAdrLine3;
    }

    /**
     * Sets the value of the gf2GftRecognitionCustomerAdrLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftRecognitionCustomerAdrLine3(JAXBElement<String> value) {
        this.gf2GftRecognitionCustomerAdrLine3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftRecognitionCustomerAdrCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftRecognitionCustomerAdrCity() {
        return gf2GftRecognitionCustomerAdrCity;
    }

    /**
     * Sets the value of the gf2GftRecognitionCustomerAdrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftRecognitionCustomerAdrCity(JAXBElement<String> value) {
        this.gf2GftRecognitionCustomerAdrCity = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftRecognitionCustomerAdrState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftRecognitionCustomerAdrState() {
        return gf2GftRecognitionCustomerAdrState;
    }

    /**
     * Sets the value of the gf2GftRecognitionCustomerAdrState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftRecognitionCustomerAdrState(JAXBElement<String> value) {
        this.gf2GftRecognitionCustomerAdrState = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftRecognitionCustomerAdrPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftRecognitionCustomerAdrPostCode() {
        return gf2GftRecognitionCustomerAdrPostCode;
    }

    /**
     * Sets the value of the gf2GftRecognitionCustomerAdrPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftRecognitionCustomerAdrPostCode(JAXBElement<String> value) {
        this.gf2GftRecognitionCustomerAdrPostCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftRecognitionCustomerAdrCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftRecognitionCustomerAdrCountry() {
        return gf2GftRecognitionCustomerAdrCountry;
    }

    /**
     * Sets the value of the gf2GftRecognitionCustomerAdrCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftRecognitionCustomerAdrCountry(JAXBElement<String> value) {
        this.gf2GftRecognitionCustomerAdrCountry = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftPlgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftPlgKey() {
        return gf2GftPlgKey;
    }

    /**
     * Sets the value of the gf2GftPlgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftPlgKey(JAXBElement<String> value) {
        this.gf2GftPlgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftTransferFromGftKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftTransferFromGftKey() {
        return gf2GftTransferFromGftKey;
    }

    /**
     * Sets the value of the gf2GftTransferFromGftKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftTransferFromGftKey(JAXBElement<String> value) {
        this.gf2GftTransferFromGftKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftSctKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftSctKey() {
        return gf2GftSctKey;
    }

    /**
     * Sets the value of the gf2GftSctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftSctKey(JAXBElement<String> value) {
        this.gf2GftSctKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftLiquidationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGf2GftLiquidationAmount() {
        return gf2GftLiquidationAmount;
    }

    /**
     * Sets the value of the gf2GftLiquidationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGf2GftLiquidationAmount(JAXBElement<BigDecimal> value) {
        this.gf2GftLiquidationAmount = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the gf2GftClgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftClgKey() {
        return gf2GftClgKey;
    }

    /**
     * Sets the value of the gf2GftClgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftClgKey(JAXBElement<String> value) {
        this.gf2GftClgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftOtherMatchProgram property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftOtherMatchProgram() {
        return gf2GftOtherMatchProgram;
    }

    /**
     * Sets the value of the gf2GftOtherMatchProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftOtherMatchProgram(JAXBElement<String> value) {
        this.gf2GftOtherMatchProgram = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftFormCompleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getGf2GftFormCompleteFlag() {
        return gf2GftFormCompleteFlag;
    }

    /**
     * Sets the value of the gf2GftFormCompleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setGf2GftFormCompleteFlag(JAXBElement<Short> value) {
        this.gf2GftFormCompleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the gf2GftDateSent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftDateSent() {
        return gf2GftDateSent;
    }

    /**
     * Sets the value of the gf2GftDateSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftDateSent(JAXBElement<String> value) {
        this.gf2GftDateSent = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftDateReceived property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftDateReceived() {
        return gf2GftDateReceived;
    }

    /**
     * Sets the value of the gf2GftDateReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftDateReceived(JAXBElement<String> value) {
        this.gf2GftDateReceived = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftSolicitorCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftSolicitorCstKey() {
        return gf2GftSolicitorCstKey;
    }

    /**
     * Sets the value of the gf2GftSolicitorCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftSolicitorCstKey(JAXBElement<String> value) {
        this.gf2GftSolicitorCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftTicker property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftTicker() {
        return gf2GftTicker;
    }

    /**
     * Sets the value of the gf2GftTicker property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftTicker(JAXBElement<String> value) {
        this.gf2GftTicker = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftAcknowledgmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftAcknowledgmentDate() {
        return gf2GftAcknowledgmentDate;
    }

    /**
     * Sets the value of the gf2GftAcknowledgmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftAcknowledgmentDate(JAXBElement<String> value) {
        this.gf2GftAcknowledgmentDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftBatchCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftBatchCode() {
        return gf2GftBatchCode;
    }

    /**
     * Sets the value of the gf2GftBatchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftBatchCode(JAXBElement<String> value) {
        this.gf2GftBatchCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftMailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getGf2GftMailFlag() {
        return gf2GftMailFlag;
    }

    /**
     * Sets the value of the gf2GftMailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setGf2GftMailFlag(JAXBElement<Short> value) {
        this.gf2GftMailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the gf2GftRecognizeAs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftRecognizeAs() {
        return gf2GftRecognizeAs;
    }

    /**
     * Sets the value of the gf2GftRecognizeAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftRecognizeAs(JAXBElement<String> value) {
        this.gf2GftRecognizeAs = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftLiquidationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftLiquidationDate() {
        return gf2GftLiquidationDate;
    }

    /**
     * Sets the value of the gf2GftLiquidationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftLiquidationDate(JAXBElement<String> value) {
        this.gf2GftLiquidationDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftSrcKey() {
        return gf2GftSrcKey;
    }

    /**
     * Sets the value of the gf2GftSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftSrcKey(JAXBElement<String> value) {
        this.gf2GftSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftRegKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftRegKey() {
        return gf2GftRegKey;
    }

    /**
     * Sets the value of the gf2GftRegKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftRegKey(JAXBElement<String> value) {
        this.gf2GftRegKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftTaxReceiptSentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftTaxReceiptSentDate() {
        return gf2GftTaxReceiptSentDate;
    }

    /**
     * Sets the value of the gf2GftTaxReceiptSentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftTaxReceiptSentDate(JAXBElement<String> value) {
        this.gf2GftTaxReceiptSentDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftTbtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftTbtKey() {
        return gf2GftTbtKey;
    }

    /**
     * Sets the value of the gf2GftTbtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftTbtKey(JAXBElement<String> value) {
        this.gf2GftTbtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gf2GftPersonalMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGf2GftPersonalMessage() {
        return gf2GftPersonalMessage;
    }

    /**
     * Sets the value of the gf2GftPersonalMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGf2GftPersonalMessage(JAXBElement<String> value) {
        this.gf2GftPersonalMessage = ((JAXBElement<String> ) value);
    }

}
