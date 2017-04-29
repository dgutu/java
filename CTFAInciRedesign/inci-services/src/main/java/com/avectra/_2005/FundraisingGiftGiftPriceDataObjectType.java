
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Gift_Price_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Gift_Price_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prc_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prc_price" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="prc_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="prc_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="prc_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="prc_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="prc_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="prc_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prc_gla_ar_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prc_gla_revenue_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prc_gla_liability_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prc_gla_return_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prc_gla_writeoff_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prc_start_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="prc_end_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="prc_ptr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prc_num_issues" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="prc_prd_ptp_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prc_percent" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="prc_percent_cp" type="{http://www.avectra.com/2005/}decimal_Type" minOccurs="0"/>
 *         &lt;element name="prc_prd_atc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prc_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="prc_display_name" type="{http://www.avectra.com/2005/}stringLength250_Type" minOccurs="0"/>
 *         &lt;element name="prc_sell_online" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prc_gla_deferred_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prc_deferred_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prc_mail" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prc_email" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prc_fax" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prc_thumbnail" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="prc_online_abstract" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="prc_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prc_qty_min" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="prc_qty_max" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="prc_recognize_after_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="prc_account_split_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prc_prorate_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prc_prorate_first_year_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prc_web" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prc_microfiche" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prc_revenue_recog_frequency" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="prc_allow_installment" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prc_pjt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prc_shippable_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prc_eweb_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="prc_weight_min" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="prc_weight_max" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="prc_recognize_by_issue_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prc_num_grace_issues" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="prc_back_issue_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prc_renew_unpaid_orders_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prc_allow_unpaid_orders_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prc_deferral_num_years" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="prc_cur_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prc_award_credit_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prc_deferral_num_issues" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="prc_allow_sync_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prc_cct_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prc_no_discount_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prc_pcl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prc_pde_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prc_plo_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Gift_Price_DataObjectType", propOrder = {
    "prcKey",
    "prcPrdKey",
    "prcPrice",
    "prcAddUser",
    "prcAddDate",
    "prcChangeUser",
    "prcChangeDate",
    "prcDeleteFlag",
    "prcKeyExt",
    "prcGlaArKey",
    "prcGlaRevenueKey",
    "prcGlaLiabilityKey",
    "prcGlaReturnKey",
    "prcGlaWriteoffKey",
    "prcStartDate",
    "prcEndDate",
    "prcPtrKey",
    "prcNumIssues",
    "prcPrdPtpKey",
    "prcPercent",
    "prcPercentCp",
    "prcPrdAtcKey",
    "prcCode",
    "prcDisplayName",
    "prcSellOnline",
    "prcGlaDeferredKey",
    "prcDeferredFlag",
    "prcMail",
    "prcEmail",
    "prcFax",
    "prcThumbnail",
    "prcOnlineAbstract",
    "prcEntityKey",
    "prcQtyMin",
    "prcQtyMax",
    "prcRecognizeAfterDate",
    "prcAccountSplitFlag",
    "prcProrateFlag",
    "prcProrateFirstYearFlag",
    "prcWeb",
    "prcMicrofiche",
    "prcRevenueRecogFrequency",
    "prcAllowInstallment",
    "prcPjtKey",
    "prcShippableFlag",
    "prcEwebCode",
    "prcWeightMin",
    "prcWeightMax",
    "prcRecognizeByIssueFlag",
    "prcNumGraceIssues",
    "prcBackIssueFlag",
    "prcRenewUnpaidOrdersFlag",
    "prcAllowUnpaidOrdersFlag",
    "prcDeferralNumYears",
    "prcCurKey",
    "prcAwardCreditFlag",
    "prcDeferralNumIssues",
    "prcAllowSyncFlag",
    "prcCctKey",
    "prcNoDiscountFlag",
    "prcPclKey",
    "prcPdeKey",
    "prcPloKey"
})
public class FundraisingGiftGiftPriceDataObjectType {

    @XmlElementRef(name = "prc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcKey;
    @XmlElementRef(name = "prc_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcPrdKey;
    @XmlElementRef(name = "prc_price", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> prcPrice;
    @XmlElementRef(name = "prc_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcAddUser;
    @XmlElementRef(name = "prc_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcAddDate;
    @XmlElementRef(name = "prc_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcChangeUser;
    @XmlElementRef(name = "prc_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcChangeDate;
    @XmlElementRef(name = "prc_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prcDeleteFlag;
    @XmlElementRef(name = "prc_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcKeyExt;
    @XmlElementRef(name = "prc_gla_ar_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcGlaArKey;
    @XmlElementRef(name = "prc_gla_revenue_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcGlaRevenueKey;
    @XmlElementRef(name = "prc_gla_liability_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcGlaLiabilityKey;
    @XmlElementRef(name = "prc_gla_return_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcGlaReturnKey;
    @XmlElementRef(name = "prc_gla_writeoff_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcGlaWriteoffKey;
    @XmlElementRef(name = "prc_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcStartDate;
    @XmlElementRef(name = "prc_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcEndDate;
    @XmlElementRef(name = "prc_ptr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcPtrKey;
    @XmlElementRef(name = "prc_num_issues", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> prcNumIssues;
    @XmlElementRef(name = "prc_prd_ptp_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcPrdPtpKey;
    @XmlElementRef(name = "prc_percent", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> prcPercent;
    @XmlElementRef(name = "prc_percent_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> prcPercentCp;
    @XmlElementRef(name = "prc_prd_atc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcPrdAtcKey;
    @XmlElementRef(name = "prc_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcCode;
    @XmlElementRef(name = "prc_display_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcDisplayName;
    @XmlElementRef(name = "prc_sell_online", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prcSellOnline;
    @XmlElementRef(name = "prc_gla_deferred_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcGlaDeferredKey;
    @XmlElementRef(name = "prc_deferred_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prcDeferredFlag;
    @XmlElementRef(name = "prc_mail", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prcMail;
    @XmlElementRef(name = "prc_email", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prcEmail;
    @XmlElementRef(name = "prc_fax", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prcFax;
    @XmlElementRef(name = "prc_thumbnail", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcThumbnail;
    @XmlElementRef(name = "prc_online_abstract", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcOnlineAbstract;
    @XmlElementRef(name = "prc_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcEntityKey;
    @XmlElementRef(name = "prc_qty_min", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> prcQtyMin;
    @XmlElementRef(name = "prc_qty_max", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> prcQtyMax;
    @XmlElementRef(name = "prc_recognize_after_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcRecognizeAfterDate;
    @XmlElementRef(name = "prc_account_split_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prcAccountSplitFlag;
    @XmlElementRef(name = "prc_prorate_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prcProrateFlag;
    @XmlElementRef(name = "prc_prorate_first_year_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prcProrateFirstYearFlag;
    @XmlElementRef(name = "prc_web", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prcWeb;
    @XmlElementRef(name = "prc_microfiche", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prcMicrofiche;
    @XmlElementRef(name = "prc_revenue_recog_frequency", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> prcRevenueRecogFrequency;
    @XmlElementRef(name = "prc_allow_installment", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prcAllowInstallment;
    @XmlElementRef(name = "prc_pjt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcPjtKey;
    @XmlElementRef(name = "prc_shippable_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prcShippableFlag;
    @XmlElementRef(name = "prc_eweb_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcEwebCode;
    @XmlElementRef(name = "prc_weight_min", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> prcWeightMin;
    @XmlElementRef(name = "prc_weight_max", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> prcWeightMax;
    @XmlElementRef(name = "prc_recognize_by_issue_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prcRecognizeByIssueFlag;
    @XmlElementRef(name = "prc_num_grace_issues", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> prcNumGraceIssues;
    @XmlElementRef(name = "prc_back_issue_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prcBackIssueFlag;
    @XmlElementRef(name = "prc_renew_unpaid_orders_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prcRenewUnpaidOrdersFlag;
    @XmlElementRef(name = "prc_allow_unpaid_orders_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prcAllowUnpaidOrdersFlag;
    @XmlElementRef(name = "prc_deferral_num_years", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> prcDeferralNumYears;
    @XmlElementRef(name = "prc_cur_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcCurKey;
    @XmlElementRef(name = "prc_award_credit_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prcAwardCreditFlag;
    @XmlElementRef(name = "prc_deferral_num_issues", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> prcDeferralNumIssues;
    @XmlElementRef(name = "prc_allow_sync_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prcAllowSyncFlag;
    @XmlElementRef(name = "prc_cct_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcCctKey;
    @XmlElementRef(name = "prc_no_discount_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prcNoDiscountFlag;
    @XmlElementRef(name = "prc_pcl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcPclKey;
    @XmlElementRef(name = "prc_pde_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcPdeKey;
    @XmlElementRef(name = "prc_plo_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prcPloKey;

    /**
     * Gets the value of the prcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcKey() {
        return prcKey;
    }

    /**
     * Sets the value of the prcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcKey(JAXBElement<String> value) {
        this.prcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcPrdKey() {
        return prcPrdKey;
    }

    /**
     * Sets the value of the prcPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcPrdKey(JAXBElement<String> value) {
        this.prcPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrcPrice() {
        return prcPrice;
    }

    /**
     * Sets the value of the prcPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrcPrice(JAXBElement<BigDecimal> value) {
        this.prcPrice = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the prcAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcAddUser() {
        return prcAddUser;
    }

    /**
     * Sets the value of the prcAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcAddUser(JAXBElement<String> value) {
        this.prcAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcAddDate() {
        return prcAddDate;
    }

    /**
     * Sets the value of the prcAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcAddDate(JAXBElement<String> value) {
        this.prcAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcChangeUser() {
        return prcChangeUser;
    }

    /**
     * Sets the value of the prcChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcChangeUser(JAXBElement<String> value) {
        this.prcChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcChangeDate() {
        return prcChangeDate;
    }

    /**
     * Sets the value of the prcChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcChangeDate(JAXBElement<String> value) {
        this.prcChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrcDeleteFlag() {
        return prcDeleteFlag;
    }

    /**
     * Sets the value of the prcDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrcDeleteFlag(JAXBElement<Short> value) {
        this.prcDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prcKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcKeyExt() {
        return prcKeyExt;
    }

    /**
     * Sets the value of the prcKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcKeyExt(JAXBElement<String> value) {
        this.prcKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcGlaArKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcGlaArKey() {
        return prcGlaArKey;
    }

    /**
     * Sets the value of the prcGlaArKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcGlaArKey(JAXBElement<String> value) {
        this.prcGlaArKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcGlaRevenueKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcGlaRevenueKey() {
        return prcGlaRevenueKey;
    }

    /**
     * Sets the value of the prcGlaRevenueKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcGlaRevenueKey(JAXBElement<String> value) {
        this.prcGlaRevenueKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcGlaLiabilityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcGlaLiabilityKey() {
        return prcGlaLiabilityKey;
    }

    /**
     * Sets the value of the prcGlaLiabilityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcGlaLiabilityKey(JAXBElement<String> value) {
        this.prcGlaLiabilityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcGlaReturnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcGlaReturnKey() {
        return prcGlaReturnKey;
    }

    /**
     * Sets the value of the prcGlaReturnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcGlaReturnKey(JAXBElement<String> value) {
        this.prcGlaReturnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcGlaWriteoffKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcGlaWriteoffKey() {
        return prcGlaWriteoffKey;
    }

    /**
     * Sets the value of the prcGlaWriteoffKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcGlaWriteoffKey(JAXBElement<String> value) {
        this.prcGlaWriteoffKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcStartDate() {
        return prcStartDate;
    }

    /**
     * Sets the value of the prcStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcStartDate(JAXBElement<String> value) {
        this.prcStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcEndDate() {
        return prcEndDate;
    }

    /**
     * Sets the value of the prcEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcEndDate(JAXBElement<String> value) {
        this.prcEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcPtrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcPtrKey() {
        return prcPtrKey;
    }

    /**
     * Sets the value of the prcPtrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcPtrKey(JAXBElement<String> value) {
        this.prcPtrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcNumIssues property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrcNumIssues() {
        return prcNumIssues;
    }

    /**
     * Sets the value of the prcNumIssues property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrcNumIssues(JAXBElement<Integer> value) {
        this.prcNumIssues = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the prcPrdPtpKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcPrdPtpKey() {
        return prcPrdPtpKey;
    }

    /**
     * Sets the value of the prcPrdPtpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcPrdPtpKey(JAXBElement<String> value) {
        this.prcPrdPtpKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrcPercent() {
        return prcPercent;
    }

    /**
     * Sets the value of the prcPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrcPercent(JAXBElement<BigDecimal> value) {
        this.prcPercent = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the prcPercentCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrcPercentCp() {
        return prcPercentCp;
    }

    /**
     * Sets the value of the prcPercentCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrcPercentCp(JAXBElement<BigDecimal> value) {
        this.prcPercentCp = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the prcPrdAtcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcPrdAtcKey() {
        return prcPrdAtcKey;
    }

    /**
     * Sets the value of the prcPrdAtcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcPrdAtcKey(JAXBElement<String> value) {
        this.prcPrdAtcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcCode() {
        return prcCode;
    }

    /**
     * Sets the value of the prcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcCode(JAXBElement<String> value) {
        this.prcCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcDisplayName() {
        return prcDisplayName;
    }

    /**
     * Sets the value of the prcDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcDisplayName(JAXBElement<String> value) {
        this.prcDisplayName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcSellOnline property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrcSellOnline() {
        return prcSellOnline;
    }

    /**
     * Sets the value of the prcSellOnline property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrcSellOnline(JAXBElement<Short> value) {
        this.prcSellOnline = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prcGlaDeferredKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcGlaDeferredKey() {
        return prcGlaDeferredKey;
    }

    /**
     * Sets the value of the prcGlaDeferredKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcGlaDeferredKey(JAXBElement<String> value) {
        this.prcGlaDeferredKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcDeferredFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrcDeferredFlag() {
        return prcDeferredFlag;
    }

    /**
     * Sets the value of the prcDeferredFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrcDeferredFlag(JAXBElement<Short> value) {
        this.prcDeferredFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prcMail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrcMail() {
        return prcMail;
    }

    /**
     * Sets the value of the prcMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrcMail(JAXBElement<Short> value) {
        this.prcMail = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prcEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrcEmail() {
        return prcEmail;
    }

    /**
     * Sets the value of the prcEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrcEmail(JAXBElement<Short> value) {
        this.prcEmail = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prcFax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrcFax() {
        return prcFax;
    }

    /**
     * Sets the value of the prcFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrcFax(JAXBElement<Short> value) {
        this.prcFax = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prcThumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcThumbnail() {
        return prcThumbnail;
    }

    /**
     * Sets the value of the prcThumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcThumbnail(JAXBElement<String> value) {
        this.prcThumbnail = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcOnlineAbstract property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcOnlineAbstract() {
        return prcOnlineAbstract;
    }

    /**
     * Sets the value of the prcOnlineAbstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcOnlineAbstract(JAXBElement<String> value) {
        this.prcOnlineAbstract = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcEntityKey() {
        return prcEntityKey;
    }

    /**
     * Sets the value of the prcEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcEntityKey(JAXBElement<String> value) {
        this.prcEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcQtyMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrcQtyMin() {
        return prcQtyMin;
    }

    /**
     * Sets the value of the prcQtyMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrcQtyMin(JAXBElement<BigDecimal> value) {
        this.prcQtyMin = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the prcQtyMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrcQtyMax() {
        return prcQtyMax;
    }

    /**
     * Sets the value of the prcQtyMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrcQtyMax(JAXBElement<BigDecimal> value) {
        this.prcQtyMax = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the prcRecognizeAfterDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcRecognizeAfterDate() {
        return prcRecognizeAfterDate;
    }

    /**
     * Sets the value of the prcRecognizeAfterDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcRecognizeAfterDate(JAXBElement<String> value) {
        this.prcRecognizeAfterDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcAccountSplitFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrcAccountSplitFlag() {
        return prcAccountSplitFlag;
    }

    /**
     * Sets the value of the prcAccountSplitFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrcAccountSplitFlag(JAXBElement<Short> value) {
        this.prcAccountSplitFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prcProrateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrcProrateFlag() {
        return prcProrateFlag;
    }

    /**
     * Sets the value of the prcProrateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrcProrateFlag(JAXBElement<Short> value) {
        this.prcProrateFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prcProrateFirstYearFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrcProrateFirstYearFlag() {
        return prcProrateFirstYearFlag;
    }

    /**
     * Sets the value of the prcProrateFirstYearFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrcProrateFirstYearFlag(JAXBElement<Short> value) {
        this.prcProrateFirstYearFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prcWeb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrcWeb() {
        return prcWeb;
    }

    /**
     * Sets the value of the prcWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrcWeb(JAXBElement<Short> value) {
        this.prcWeb = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prcMicrofiche property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrcMicrofiche() {
        return prcMicrofiche;
    }

    /**
     * Sets the value of the prcMicrofiche property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrcMicrofiche(JAXBElement<Short> value) {
        this.prcMicrofiche = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prcRevenueRecogFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrcRevenueRecogFrequency() {
        return prcRevenueRecogFrequency;
    }

    /**
     * Sets the value of the prcRevenueRecogFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrcRevenueRecogFrequency(JAXBElement<Integer> value) {
        this.prcRevenueRecogFrequency = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the prcAllowInstallment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrcAllowInstallment() {
        return prcAllowInstallment;
    }

    /**
     * Sets the value of the prcAllowInstallment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrcAllowInstallment(JAXBElement<Short> value) {
        this.prcAllowInstallment = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prcPjtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcPjtKey() {
        return prcPjtKey;
    }

    /**
     * Sets the value of the prcPjtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcPjtKey(JAXBElement<String> value) {
        this.prcPjtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcShippableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrcShippableFlag() {
        return prcShippableFlag;
    }

    /**
     * Sets the value of the prcShippableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrcShippableFlag(JAXBElement<Short> value) {
        this.prcShippableFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prcEwebCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcEwebCode() {
        return prcEwebCode;
    }

    /**
     * Sets the value of the prcEwebCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcEwebCode(JAXBElement<String> value) {
        this.prcEwebCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcWeightMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrcWeightMin() {
        return prcWeightMin;
    }

    /**
     * Sets the value of the prcWeightMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrcWeightMin(JAXBElement<BigDecimal> value) {
        this.prcWeightMin = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the prcWeightMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrcWeightMax() {
        return prcWeightMax;
    }

    /**
     * Sets the value of the prcWeightMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrcWeightMax(JAXBElement<BigDecimal> value) {
        this.prcWeightMax = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the prcRecognizeByIssueFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrcRecognizeByIssueFlag() {
        return prcRecognizeByIssueFlag;
    }

    /**
     * Sets the value of the prcRecognizeByIssueFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrcRecognizeByIssueFlag(JAXBElement<Short> value) {
        this.prcRecognizeByIssueFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prcNumGraceIssues property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrcNumGraceIssues() {
        return prcNumGraceIssues;
    }

    /**
     * Sets the value of the prcNumGraceIssues property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrcNumGraceIssues(JAXBElement<Integer> value) {
        this.prcNumGraceIssues = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the prcBackIssueFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrcBackIssueFlag() {
        return prcBackIssueFlag;
    }

    /**
     * Sets the value of the prcBackIssueFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrcBackIssueFlag(JAXBElement<Short> value) {
        this.prcBackIssueFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prcRenewUnpaidOrdersFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrcRenewUnpaidOrdersFlag() {
        return prcRenewUnpaidOrdersFlag;
    }

    /**
     * Sets the value of the prcRenewUnpaidOrdersFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrcRenewUnpaidOrdersFlag(JAXBElement<Short> value) {
        this.prcRenewUnpaidOrdersFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prcAllowUnpaidOrdersFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrcAllowUnpaidOrdersFlag() {
        return prcAllowUnpaidOrdersFlag;
    }

    /**
     * Sets the value of the prcAllowUnpaidOrdersFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrcAllowUnpaidOrdersFlag(JAXBElement<Short> value) {
        this.prcAllowUnpaidOrdersFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prcDeferralNumYears property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrcDeferralNumYears() {
        return prcDeferralNumYears;
    }

    /**
     * Sets the value of the prcDeferralNumYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrcDeferralNumYears(JAXBElement<Integer> value) {
        this.prcDeferralNumYears = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the prcCurKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcCurKey() {
        return prcCurKey;
    }

    /**
     * Sets the value of the prcCurKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcCurKey(JAXBElement<String> value) {
        this.prcCurKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcAwardCreditFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrcAwardCreditFlag() {
        return prcAwardCreditFlag;
    }

    /**
     * Sets the value of the prcAwardCreditFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrcAwardCreditFlag(JAXBElement<Short> value) {
        this.prcAwardCreditFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prcDeferralNumIssues property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrcDeferralNumIssues() {
        return prcDeferralNumIssues;
    }

    /**
     * Sets the value of the prcDeferralNumIssues property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrcDeferralNumIssues(JAXBElement<Integer> value) {
        this.prcDeferralNumIssues = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the prcAllowSyncFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrcAllowSyncFlag() {
        return prcAllowSyncFlag;
    }

    /**
     * Sets the value of the prcAllowSyncFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrcAllowSyncFlag(JAXBElement<Short> value) {
        this.prcAllowSyncFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prcCctKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcCctKey() {
        return prcCctKey;
    }

    /**
     * Sets the value of the prcCctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcCctKey(JAXBElement<String> value) {
        this.prcCctKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcNoDiscountFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrcNoDiscountFlag() {
        return prcNoDiscountFlag;
    }

    /**
     * Sets the value of the prcNoDiscountFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrcNoDiscountFlag(JAXBElement<Short> value) {
        this.prcNoDiscountFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prcPclKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcPclKey() {
        return prcPclKey;
    }

    /**
     * Sets the value of the prcPclKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcPclKey(JAXBElement<String> value) {
        this.prcPclKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcPdeKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcPdeKey() {
        return prcPdeKey;
    }

    /**
     * Sets the value of the prcPdeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcPdeKey(JAXBElement<String> value) {
        this.prcPdeKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prcPloKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrcPloKey() {
        return prcPloKey;
    }

    /**
     * Sets the value of the prcPloKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrcPloKey(JAXBElement<String> value) {
        this.prcPloKey = ((JAXBElement<String> ) value);
    }

}
