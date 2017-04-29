
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CentralizedOrderEntry_Invoice_Detail_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CentralizedOrderEntry_Invoice_Detail_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CentralizedOrderEntry_Invoice_Detail_DataObjectType", propOrder = {
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
    "ivdDownloadDaysOverride"
})
public class CentralizedOrderEntryInvoiceDetailDataObjectType {

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

}
