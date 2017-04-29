
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceDetail_Invoice_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceDetail_Invoice_DataObjectType">
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
 *         &lt;element name="inv_NewBatch_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="inv_pay_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceDetail_Invoice_DataObjectType", propOrder = {
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
    "invNewBatchKey",
    "invPayCstKey"
})
public class InvoiceDetailInvoiceDataObjectType {

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
    @XmlElementRef(name = "inv_NewBatch_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invNewBatchKey;
    @XmlElementRef(name = "inv_pay_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> invPayCstKey;

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
     * Gets the value of the invPayCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvPayCstKey() {
        return invPayCstKey;
    }

    /**
     * Sets the value of the invPayCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvPayCstKey(JAXBElement<String> value) {
        this.invPayCstKey = ((JAXBElement<String> ) value);
    }

}
