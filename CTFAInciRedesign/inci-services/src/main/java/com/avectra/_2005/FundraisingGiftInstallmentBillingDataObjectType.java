
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Installment_Billing_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Installment_Billing_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ord_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ord_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ord_frequency" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ord_ptr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ord_last_bill_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ord_proforma" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ord_type" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ord_pin_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ord_num_of_installments" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ord_num_invoices_to_date" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ord_cst_billing_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ord_ind_cst_billing_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ord_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ord_cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ord_cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ord_eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ord_pref_comm_method" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="ord_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ord_med_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ord_notes_internal" type="{http://www.avectra.com/2005/}stringLength300_Type" minOccurs="0"/>
 *         &lt;element name="ord_notes_external" type="{http://www.avectra.com/2005/}stringLength300_Type" minOccurs="0"/>
 *         &lt;element name="ord_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ord_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ord_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ord_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ord_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ord_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ord_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ord_ait_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ord_first_process_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ord_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ord_close_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ord_milestone_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ord_cpi_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ord_auto_pay" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ord_orig_trans_type" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="ord_po_number" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ord_cur_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ord_trx_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ord_sfo_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ord_group_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ord_group_description" type="{http://www.avectra.com/2005/}stringLength300_Type" minOccurs="0"/>
 *         &lt;element name="ord_generate_from_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ord_generate_to_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ord_inst_gen_auto_pay_option" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="ord_bat_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ord_bat_trx_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ord_current_schedule_processed" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ord_balance" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="ord_process" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="ord_schedule_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ord_task_start_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ord_task_start_time" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="ord_eml_address" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="ord_cct_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Installment_Billing_DataObjectType", propOrder = {
    "ordKey",
    "ordCstKey",
    "ordFrequency",
    "ordPtrKey",
    "ordLastBillDate",
    "ordProforma",
    "ordType",
    "ordPinKey",
    "ordNumOfInstallments",
    "ordNumInvoicesToDate",
    "ordCstBillingKey",
    "ordIndCstBillingKey",
    "ordCxaKey",
    "ordCphKey",
    "ordCfxKey",
    "ordEmlKey",
    "ordPrefCommMethod",
    "ordSrcKey",
    "ordMedKey",
    "ordNotesInternal",
    "ordNotesExternal",
    "ordAddUser",
    "ordAddDate",
    "ordChangeUser",
    "ordChangeDate",
    "ordDeleteFlag",
    "ordEntityKey",
    "ordKeyExt",
    "ordAitKey",
    "ordFirstProcessDate",
    "ordCode",
    "ordCloseFlag",
    "ordMilestoneFlag",
    "ordCpiKey",
    "ordAutoPay",
    "ordOrigTransType",
    "ordPoNumber",
    "ordCurKey",
    "ordTrxDate",
    "ordSfoKey",
    "ordGroupFlag",
    "ordGroupDescription",
    "ordGenerateFromDate",
    "ordGenerateToDate",
    "ordInstGenAutoPayOption",
    "ordBatKey",
    "ordBatTrxDate",
    "ordCurrentScheduleProcessed",
    "ordBalance",
    "ordProcess",
    "ordScheduleFlag",
    "ordTaskStartDate",
    "ordTaskStartTime",
    "ordEmlAddress",
    "ordCctKey"
})
public class FundraisingGiftInstallmentBillingDataObjectType {

    @XmlElementRef(name = "ord_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordKey;
    @XmlElementRef(name = "ord_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordCstKey;
    @XmlElementRef(name = "ord_frequency", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> ordFrequency;
    @XmlElementRef(name = "ord_ptr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordPtrKey;
    @XmlElementRef(name = "ord_last_bill_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordLastBillDate;
    @XmlElementRef(name = "ord_proforma", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ordProforma;
    @XmlElementRef(name = "ord_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordType;
    @XmlElementRef(name = "ord_pin_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordPinKey;
    @XmlElementRef(name = "ord_num_of_installments", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> ordNumOfInstallments;
    @XmlElementRef(name = "ord_num_invoices_to_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> ordNumInvoicesToDate;
    @XmlElementRef(name = "ord_cst_billing_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordCstBillingKey;
    @XmlElementRef(name = "ord_ind_cst_billing_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordIndCstBillingKey;
    @XmlElementRef(name = "ord_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordCxaKey;
    @XmlElementRef(name = "ord_cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordCphKey;
    @XmlElementRef(name = "ord_cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordCfxKey;
    @XmlElementRef(name = "ord_eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordEmlKey;
    @XmlElementRef(name = "ord_pref_comm_method", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordPrefCommMethod;
    @XmlElementRef(name = "ord_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordSrcKey;
    @XmlElementRef(name = "ord_med_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordMedKey;
    @XmlElementRef(name = "ord_notes_internal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordNotesInternal;
    @XmlElementRef(name = "ord_notes_external", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordNotesExternal;
    @XmlElementRef(name = "ord_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordAddUser;
    @XmlElementRef(name = "ord_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordAddDate;
    @XmlElementRef(name = "ord_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordChangeUser;
    @XmlElementRef(name = "ord_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordChangeDate;
    @XmlElementRef(name = "ord_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ordDeleteFlag;
    @XmlElementRef(name = "ord_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordEntityKey;
    @XmlElementRef(name = "ord_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordKeyExt;
    @XmlElementRef(name = "ord_ait_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordAitKey;
    @XmlElementRef(name = "ord_first_process_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordFirstProcessDate;
    @XmlElementRef(name = "ord_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordCode;
    @XmlElementRef(name = "ord_close_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ordCloseFlag;
    @XmlElementRef(name = "ord_milestone_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ordMilestoneFlag;
    @XmlElementRef(name = "ord_cpi_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordCpiKey;
    @XmlElementRef(name = "ord_auto_pay", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ordAutoPay;
    @XmlElementRef(name = "ord_orig_trans_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordOrigTransType;
    @XmlElementRef(name = "ord_po_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordPoNumber;
    @XmlElementRef(name = "ord_cur_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordCurKey;
    @XmlElementRef(name = "ord_trx_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordTrxDate;
    @XmlElementRef(name = "ord_sfo_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordSfoKey;
    @XmlElementRef(name = "ord_group_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ordGroupFlag;
    @XmlElementRef(name = "ord_group_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordGroupDescription;
    @XmlElementRef(name = "ord_generate_from_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordGenerateFromDate;
    @XmlElementRef(name = "ord_generate_to_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordGenerateToDate;
    @XmlElementRef(name = "ord_inst_gen_auto_pay_option", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordInstGenAutoPayOption;
    @XmlElementRef(name = "ord_bat_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordBatKey;
    @XmlElementRef(name = "ord_bat_trx_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordBatTrxDate;
    @XmlElementRef(name = "ord_current_schedule_processed", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordCurrentScheduleProcessed;
    @XmlElementRef(name = "ord_balance", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordBalance;
    @XmlElementRef(name = "ord_process", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordProcess;
    @XmlElementRef(name = "ord_schedule_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ordScheduleFlag;
    @XmlElementRef(name = "ord_task_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordTaskStartDate;
    @XmlElementRef(name = "ord_task_start_time", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordTaskStartTime;
    @XmlElementRef(name = "ord_eml_address", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordEmlAddress;
    @XmlElementRef(name = "ord_cct_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ordCctKey;

    /**
     * Gets the value of the ordKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdKey() {
        return ordKey;
    }

    /**
     * Sets the value of the ordKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdKey(JAXBElement<String> value) {
        this.ordKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdCstKey() {
        return ordCstKey;
    }

    /**
     * Sets the value of the ordCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdCstKey(JAXBElement<String> value) {
        this.ordCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrdFrequency() {
        return ordFrequency;
    }

    /**
     * Sets the value of the ordFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrdFrequency(JAXBElement<Integer> value) {
        this.ordFrequency = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the ordPtrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdPtrKey() {
        return ordPtrKey;
    }

    /**
     * Sets the value of the ordPtrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdPtrKey(JAXBElement<String> value) {
        this.ordPtrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordLastBillDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdLastBillDate() {
        return ordLastBillDate;
    }

    /**
     * Sets the value of the ordLastBillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdLastBillDate(JAXBElement<String> value) {
        this.ordLastBillDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordProforma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOrdProforma() {
        return ordProforma;
    }

    /**
     * Sets the value of the ordProforma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOrdProforma(JAXBElement<Short> value) {
        this.ordProforma = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ordType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdType() {
        return ordType;
    }

    /**
     * Sets the value of the ordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdType(JAXBElement<String> value) {
        this.ordType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordPinKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdPinKey() {
        return ordPinKey;
    }

    /**
     * Sets the value of the ordPinKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdPinKey(JAXBElement<String> value) {
        this.ordPinKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordNumOfInstallments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrdNumOfInstallments() {
        return ordNumOfInstallments;
    }

    /**
     * Sets the value of the ordNumOfInstallments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrdNumOfInstallments(JAXBElement<Integer> value) {
        this.ordNumOfInstallments = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the ordNumInvoicesToDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrdNumInvoicesToDate() {
        return ordNumInvoicesToDate;
    }

    /**
     * Sets the value of the ordNumInvoicesToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrdNumInvoicesToDate(JAXBElement<Integer> value) {
        this.ordNumInvoicesToDate = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the ordCstBillingKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdCstBillingKey() {
        return ordCstBillingKey;
    }

    /**
     * Sets the value of the ordCstBillingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdCstBillingKey(JAXBElement<String> value) {
        this.ordCstBillingKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordIndCstBillingKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdIndCstBillingKey() {
        return ordIndCstBillingKey;
    }

    /**
     * Sets the value of the ordIndCstBillingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdIndCstBillingKey(JAXBElement<String> value) {
        this.ordIndCstBillingKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdCxaKey() {
        return ordCxaKey;
    }

    /**
     * Sets the value of the ordCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdCxaKey(JAXBElement<String> value) {
        this.ordCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordCphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdCphKey() {
        return ordCphKey;
    }

    /**
     * Sets the value of the ordCphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdCphKey(JAXBElement<String> value) {
        this.ordCphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordCfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdCfxKey() {
        return ordCfxKey;
    }

    /**
     * Sets the value of the ordCfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdCfxKey(JAXBElement<String> value) {
        this.ordCfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordEmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdEmlKey() {
        return ordEmlKey;
    }

    /**
     * Sets the value of the ordEmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdEmlKey(JAXBElement<String> value) {
        this.ordEmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordPrefCommMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdPrefCommMethod() {
        return ordPrefCommMethod;
    }

    /**
     * Sets the value of the ordPrefCommMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdPrefCommMethod(JAXBElement<String> value) {
        this.ordPrefCommMethod = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdSrcKey() {
        return ordSrcKey;
    }

    /**
     * Sets the value of the ordSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdSrcKey(JAXBElement<String> value) {
        this.ordSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordMedKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdMedKey() {
        return ordMedKey;
    }

    /**
     * Sets the value of the ordMedKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdMedKey(JAXBElement<String> value) {
        this.ordMedKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordNotesInternal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdNotesInternal() {
        return ordNotesInternal;
    }

    /**
     * Sets the value of the ordNotesInternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdNotesInternal(JAXBElement<String> value) {
        this.ordNotesInternal = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordNotesExternal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdNotesExternal() {
        return ordNotesExternal;
    }

    /**
     * Sets the value of the ordNotesExternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdNotesExternal(JAXBElement<String> value) {
        this.ordNotesExternal = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdAddUser() {
        return ordAddUser;
    }

    /**
     * Sets the value of the ordAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdAddUser(JAXBElement<String> value) {
        this.ordAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdAddDate() {
        return ordAddDate;
    }

    /**
     * Sets the value of the ordAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdAddDate(JAXBElement<String> value) {
        this.ordAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdChangeUser() {
        return ordChangeUser;
    }

    /**
     * Sets the value of the ordChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdChangeUser(JAXBElement<String> value) {
        this.ordChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdChangeDate() {
        return ordChangeDate;
    }

    /**
     * Sets the value of the ordChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdChangeDate(JAXBElement<String> value) {
        this.ordChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOrdDeleteFlag() {
        return ordDeleteFlag;
    }

    /**
     * Sets the value of the ordDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOrdDeleteFlag(JAXBElement<Short> value) {
        this.ordDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ordEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdEntityKey() {
        return ordEntityKey;
    }

    /**
     * Sets the value of the ordEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdEntityKey(JAXBElement<String> value) {
        this.ordEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdKeyExt() {
        return ordKeyExt;
    }

    /**
     * Sets the value of the ordKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdKeyExt(JAXBElement<String> value) {
        this.ordKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordAitKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdAitKey() {
        return ordAitKey;
    }

    /**
     * Sets the value of the ordAitKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdAitKey(JAXBElement<String> value) {
        this.ordAitKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordFirstProcessDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdFirstProcessDate() {
        return ordFirstProcessDate;
    }

    /**
     * Sets the value of the ordFirstProcessDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdFirstProcessDate(JAXBElement<String> value) {
        this.ordFirstProcessDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdCode() {
        return ordCode;
    }

    /**
     * Sets the value of the ordCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdCode(JAXBElement<String> value) {
        this.ordCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordCloseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOrdCloseFlag() {
        return ordCloseFlag;
    }

    /**
     * Sets the value of the ordCloseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOrdCloseFlag(JAXBElement<Short> value) {
        this.ordCloseFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ordMilestoneFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOrdMilestoneFlag() {
        return ordMilestoneFlag;
    }

    /**
     * Sets the value of the ordMilestoneFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOrdMilestoneFlag(JAXBElement<Short> value) {
        this.ordMilestoneFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ordCpiKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdCpiKey() {
        return ordCpiKey;
    }

    /**
     * Sets the value of the ordCpiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdCpiKey(JAXBElement<String> value) {
        this.ordCpiKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordAutoPay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOrdAutoPay() {
        return ordAutoPay;
    }

    /**
     * Sets the value of the ordAutoPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOrdAutoPay(JAXBElement<Short> value) {
        this.ordAutoPay = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ordOrigTransType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdOrigTransType() {
        return ordOrigTransType;
    }

    /**
     * Sets the value of the ordOrigTransType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdOrigTransType(JAXBElement<String> value) {
        this.ordOrigTransType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordPoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdPoNumber() {
        return ordPoNumber;
    }

    /**
     * Sets the value of the ordPoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdPoNumber(JAXBElement<String> value) {
        this.ordPoNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordCurKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdCurKey() {
        return ordCurKey;
    }

    /**
     * Sets the value of the ordCurKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdCurKey(JAXBElement<String> value) {
        this.ordCurKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdTrxDate() {
        return ordTrxDate;
    }

    /**
     * Sets the value of the ordTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdTrxDate(JAXBElement<String> value) {
        this.ordTrxDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordSfoKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdSfoKey() {
        return ordSfoKey;
    }

    /**
     * Sets the value of the ordSfoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdSfoKey(JAXBElement<String> value) {
        this.ordSfoKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordGroupFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOrdGroupFlag() {
        return ordGroupFlag;
    }

    /**
     * Sets the value of the ordGroupFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOrdGroupFlag(JAXBElement<Short> value) {
        this.ordGroupFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ordGroupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdGroupDescription() {
        return ordGroupDescription;
    }

    /**
     * Sets the value of the ordGroupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdGroupDescription(JAXBElement<String> value) {
        this.ordGroupDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordGenerateFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdGenerateFromDate() {
        return ordGenerateFromDate;
    }

    /**
     * Sets the value of the ordGenerateFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdGenerateFromDate(JAXBElement<String> value) {
        this.ordGenerateFromDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordGenerateToDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdGenerateToDate() {
        return ordGenerateToDate;
    }

    /**
     * Sets the value of the ordGenerateToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdGenerateToDate(JAXBElement<String> value) {
        this.ordGenerateToDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordInstGenAutoPayOption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdInstGenAutoPayOption() {
        return ordInstGenAutoPayOption;
    }

    /**
     * Sets the value of the ordInstGenAutoPayOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdInstGenAutoPayOption(JAXBElement<String> value) {
        this.ordInstGenAutoPayOption = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordBatKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdBatKey() {
        return ordBatKey;
    }

    /**
     * Sets the value of the ordBatKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdBatKey(JAXBElement<String> value) {
        this.ordBatKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordBatTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdBatTrxDate() {
        return ordBatTrxDate;
    }

    /**
     * Sets the value of the ordBatTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdBatTrxDate(JAXBElement<String> value) {
        this.ordBatTrxDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordCurrentScheduleProcessed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdCurrentScheduleProcessed() {
        return ordCurrentScheduleProcessed;
    }

    /**
     * Sets the value of the ordCurrentScheduleProcessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdCurrentScheduleProcessed(JAXBElement<String> value) {
        this.ordCurrentScheduleProcessed = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdBalance() {
        return ordBalance;
    }

    /**
     * Sets the value of the ordBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdBalance(JAXBElement<String> value) {
        this.ordBalance = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordProcess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdProcess() {
        return ordProcess;
    }

    /**
     * Sets the value of the ordProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdProcess(JAXBElement<String> value) {
        this.ordProcess = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordScheduleFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOrdScheduleFlag() {
        return ordScheduleFlag;
    }

    /**
     * Sets the value of the ordScheduleFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOrdScheduleFlag(JAXBElement<Short> value) {
        this.ordScheduleFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ordTaskStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdTaskStartDate() {
        return ordTaskStartDate;
    }

    /**
     * Sets the value of the ordTaskStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdTaskStartDate(JAXBElement<String> value) {
        this.ordTaskStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordTaskStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdTaskStartTime() {
        return ordTaskStartTime;
    }

    /**
     * Sets the value of the ordTaskStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdTaskStartTime(JAXBElement<String> value) {
        this.ordTaskStartTime = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordEmlAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdEmlAddress() {
        return ordEmlAddress;
    }

    /**
     * Sets the value of the ordEmlAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdEmlAddress(JAXBElement<String> value) {
        this.ordEmlAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ordCctKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrdCctKey() {
        return ordCctKey;
    }

    /**
     * Sets the value of the ordCctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrdCctKey(JAXBElement<String> value) {
        this.ordCctKey = ((JAXBElement<String> ) value);
    }

}
