
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceDetail_Invoice_Detail_Term_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceDetail_Invoice_Detail_Term_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trm_ivd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="trm_start_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="trm_end_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="trm_original_end_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="trm_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="trm_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="trm_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="trm_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="trm_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="trm_ivd_key_previous" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="trm_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="trm_do_not_renew_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="trm_ivd_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="trm_sui_prd_key_start" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="trm_sui_prd_key_hold_start" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="trm_number_fulfilled" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="trm_sui_prd_key_hold_end" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="trm_num_issues" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="trm_num_issues_remain_cp" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="trm_cla_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="trm_qualified_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="trm_qualified_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="trm_rqt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="trm_controlled_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="trm_requested_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="trm_sin_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="trm_ttl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="trm_jfn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="trm_demog1" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="trm_demog2" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="trm_demog3" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="trm_demog4" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="trm_demog5" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="trm_cancel_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="trm_ivd_prc_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="trm_lifetime_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="trm_grace_issues_cp" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="trm_sui_prd_key_drop" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="trm_add_drop_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="trm_mbr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="trm_mxi_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceDetail_Invoice_Detail_Term_DataObjectType", propOrder = {
    "trmIvdKey",
    "trmStartDate",
    "trmEndDate",
    "trmOriginalEndDate",
    "trmAddUser",
    "trmAddDate",
    "trmChangeUser",
    "trmEntityKey",
    "trmChangeDate",
    "trmIvdKeyPrevious",
    "trmDeleteFlag",
    "trmDoNotRenewFlag",
    "trmIvdKeyExt",
    "trmSuiPrdKeyStart",
    "trmSuiPrdKeyHoldStart",
    "trmNumberFulfilled",
    "trmSuiPrdKeyHoldEnd",
    "trmNumIssues",
    "trmNumIssuesRemainCp",
    "trmClaKey",
    "trmQualifiedFlag",
    "trmQualifiedDate",
    "trmRqtKey",
    "trmControlledFlag",
    "trmRequestedFlag",
    "trmSinKey",
    "trmTtlKey",
    "trmJfnKey",
    "trmDemog1",
    "trmDemog2",
    "trmDemog3",
    "trmDemog4",
    "trmDemog5",
    "trmCancelFlag",
    "trmIvdPrcPrdKey",
    "trmLifetimeFlag",
    "trmGraceIssuesCp",
    "trmSuiPrdKeyDrop",
    "trmAddDropFlag",
    "trmMbrKey",
    "trmMxiKey"
})
public class InvoiceDetailInvoiceDetailTermDataObjectType {

    @XmlElementRef(name = "trm_ivd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmIvdKey;
    @XmlElementRef(name = "trm_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmStartDate;
    @XmlElementRef(name = "trm_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmEndDate;
    @XmlElementRef(name = "trm_original_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmOriginalEndDate;
    @XmlElementRef(name = "trm_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmAddUser;
    @XmlElementRef(name = "trm_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmAddDate;
    @XmlElementRef(name = "trm_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmChangeUser;
    @XmlElementRef(name = "trm_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmEntityKey;
    @XmlElementRef(name = "trm_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmChangeDate;
    @XmlElementRef(name = "trm_ivd_key_previous", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmIvdKeyPrevious;
    @XmlElementRef(name = "trm_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> trmDeleteFlag;
    @XmlElementRef(name = "trm_do_not_renew_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> trmDoNotRenewFlag;
    @XmlElementRef(name = "trm_ivd_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmIvdKeyExt;
    @XmlElementRef(name = "trm_sui_prd_key_start", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmSuiPrdKeyStart;
    @XmlElementRef(name = "trm_sui_prd_key_hold_start", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmSuiPrdKeyHoldStart;
    @XmlElementRef(name = "trm_number_fulfilled", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> trmNumberFulfilled;
    @XmlElementRef(name = "trm_sui_prd_key_hold_end", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmSuiPrdKeyHoldEnd;
    @XmlElementRef(name = "trm_num_issues", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> trmNumIssues;
    @XmlElementRef(name = "trm_num_issues_remain_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> trmNumIssuesRemainCp;
    @XmlElementRef(name = "trm_cla_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmClaKey;
    @XmlElementRef(name = "trm_qualified_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> trmQualifiedFlag;
    @XmlElementRef(name = "trm_qualified_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmQualifiedDate;
    @XmlElementRef(name = "trm_rqt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmRqtKey;
    @XmlElementRef(name = "trm_controlled_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> trmControlledFlag;
    @XmlElementRef(name = "trm_requested_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> trmRequestedFlag;
    @XmlElementRef(name = "trm_sin_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmSinKey;
    @XmlElementRef(name = "trm_ttl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmTtlKey;
    @XmlElementRef(name = "trm_jfn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmJfnKey;
    @XmlElementRef(name = "trm_demog1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmDemog1;
    @XmlElementRef(name = "trm_demog2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmDemog2;
    @XmlElementRef(name = "trm_demog3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmDemog3;
    @XmlElementRef(name = "trm_demog4", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmDemog4;
    @XmlElementRef(name = "trm_demog5", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmDemog5;
    @XmlElementRef(name = "trm_cancel_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> trmCancelFlag;
    @XmlElementRef(name = "trm_ivd_prc_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmIvdPrcPrdKey;
    @XmlElementRef(name = "trm_lifetime_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> trmLifetimeFlag;
    @XmlElementRef(name = "trm_grace_issues_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> trmGraceIssuesCp;
    @XmlElementRef(name = "trm_sui_prd_key_drop", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmSuiPrdKeyDrop;
    @XmlElementRef(name = "trm_add_drop_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> trmAddDropFlag;
    @XmlElementRef(name = "trm_mbr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmMbrKey;
    @XmlElementRef(name = "trm_mxi_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trmMxiKey;

    /**
     * Gets the value of the trmIvdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmIvdKey() {
        return trmIvdKey;
    }

    /**
     * Sets the value of the trmIvdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmIvdKey(JAXBElement<String> value) {
        this.trmIvdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmStartDate() {
        return trmStartDate;
    }

    /**
     * Sets the value of the trmStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmStartDate(JAXBElement<String> value) {
        this.trmStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmEndDate() {
        return trmEndDate;
    }

    /**
     * Sets the value of the trmEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmEndDate(JAXBElement<String> value) {
        this.trmEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmOriginalEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmOriginalEndDate() {
        return trmOriginalEndDate;
    }

    /**
     * Sets the value of the trmOriginalEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmOriginalEndDate(JAXBElement<String> value) {
        this.trmOriginalEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmAddUser() {
        return trmAddUser;
    }

    /**
     * Sets the value of the trmAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmAddUser(JAXBElement<String> value) {
        this.trmAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmAddDate() {
        return trmAddDate;
    }

    /**
     * Sets the value of the trmAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmAddDate(JAXBElement<String> value) {
        this.trmAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmChangeUser() {
        return trmChangeUser;
    }

    /**
     * Sets the value of the trmChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmChangeUser(JAXBElement<String> value) {
        this.trmChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmEntityKey() {
        return trmEntityKey;
    }

    /**
     * Sets the value of the trmEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmEntityKey(JAXBElement<String> value) {
        this.trmEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmChangeDate() {
        return trmChangeDate;
    }

    /**
     * Sets the value of the trmChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmChangeDate(JAXBElement<String> value) {
        this.trmChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmIvdKeyPrevious property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmIvdKeyPrevious() {
        return trmIvdKeyPrevious;
    }

    /**
     * Sets the value of the trmIvdKeyPrevious property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmIvdKeyPrevious(JAXBElement<String> value) {
        this.trmIvdKeyPrevious = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTrmDeleteFlag() {
        return trmDeleteFlag;
    }

    /**
     * Sets the value of the trmDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTrmDeleteFlag(JAXBElement<Short> value) {
        this.trmDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the trmDoNotRenewFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTrmDoNotRenewFlag() {
        return trmDoNotRenewFlag;
    }

    /**
     * Sets the value of the trmDoNotRenewFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTrmDoNotRenewFlag(JAXBElement<Short> value) {
        this.trmDoNotRenewFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the trmIvdKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmIvdKeyExt() {
        return trmIvdKeyExt;
    }

    /**
     * Sets the value of the trmIvdKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmIvdKeyExt(JAXBElement<String> value) {
        this.trmIvdKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmSuiPrdKeyStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmSuiPrdKeyStart() {
        return trmSuiPrdKeyStart;
    }

    /**
     * Sets the value of the trmSuiPrdKeyStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmSuiPrdKeyStart(JAXBElement<String> value) {
        this.trmSuiPrdKeyStart = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmSuiPrdKeyHoldStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmSuiPrdKeyHoldStart() {
        return trmSuiPrdKeyHoldStart;
    }

    /**
     * Sets the value of the trmSuiPrdKeyHoldStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmSuiPrdKeyHoldStart(JAXBElement<String> value) {
        this.trmSuiPrdKeyHoldStart = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmNumberFulfilled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTrmNumberFulfilled() {
        return trmNumberFulfilled;
    }

    /**
     * Sets the value of the trmNumberFulfilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTrmNumberFulfilled(JAXBElement<Integer> value) {
        this.trmNumberFulfilled = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the trmSuiPrdKeyHoldEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmSuiPrdKeyHoldEnd() {
        return trmSuiPrdKeyHoldEnd;
    }

    /**
     * Sets the value of the trmSuiPrdKeyHoldEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmSuiPrdKeyHoldEnd(JAXBElement<String> value) {
        this.trmSuiPrdKeyHoldEnd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmNumIssues property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTrmNumIssues() {
        return trmNumIssues;
    }

    /**
     * Sets the value of the trmNumIssues property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTrmNumIssues(JAXBElement<Integer> value) {
        this.trmNumIssues = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the trmNumIssuesRemainCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTrmNumIssuesRemainCp() {
        return trmNumIssuesRemainCp;
    }

    /**
     * Sets the value of the trmNumIssuesRemainCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTrmNumIssuesRemainCp(JAXBElement<Integer> value) {
        this.trmNumIssuesRemainCp = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the trmClaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmClaKey() {
        return trmClaKey;
    }

    /**
     * Sets the value of the trmClaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmClaKey(JAXBElement<String> value) {
        this.trmClaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmQualifiedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTrmQualifiedFlag() {
        return trmQualifiedFlag;
    }

    /**
     * Sets the value of the trmQualifiedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTrmQualifiedFlag(JAXBElement<Short> value) {
        this.trmQualifiedFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the trmQualifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmQualifiedDate() {
        return trmQualifiedDate;
    }

    /**
     * Sets the value of the trmQualifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmQualifiedDate(JAXBElement<String> value) {
        this.trmQualifiedDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmRqtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmRqtKey() {
        return trmRqtKey;
    }

    /**
     * Sets the value of the trmRqtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmRqtKey(JAXBElement<String> value) {
        this.trmRqtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmControlledFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTrmControlledFlag() {
        return trmControlledFlag;
    }

    /**
     * Sets the value of the trmControlledFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTrmControlledFlag(JAXBElement<Short> value) {
        this.trmControlledFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the trmRequestedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTrmRequestedFlag() {
        return trmRequestedFlag;
    }

    /**
     * Sets the value of the trmRequestedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTrmRequestedFlag(JAXBElement<Short> value) {
        this.trmRequestedFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the trmSinKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmSinKey() {
        return trmSinKey;
    }

    /**
     * Sets the value of the trmSinKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmSinKey(JAXBElement<String> value) {
        this.trmSinKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmTtlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmTtlKey() {
        return trmTtlKey;
    }

    /**
     * Sets the value of the trmTtlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmTtlKey(JAXBElement<String> value) {
        this.trmTtlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmJfnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmJfnKey() {
        return trmJfnKey;
    }

    /**
     * Sets the value of the trmJfnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmJfnKey(JAXBElement<String> value) {
        this.trmJfnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmDemog1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmDemog1() {
        return trmDemog1;
    }

    /**
     * Sets the value of the trmDemog1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmDemog1(JAXBElement<String> value) {
        this.trmDemog1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmDemog2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmDemog2() {
        return trmDemog2;
    }

    /**
     * Sets the value of the trmDemog2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmDemog2(JAXBElement<String> value) {
        this.trmDemog2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmDemog3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmDemog3() {
        return trmDemog3;
    }

    /**
     * Sets the value of the trmDemog3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmDemog3(JAXBElement<String> value) {
        this.trmDemog3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmDemog4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmDemog4() {
        return trmDemog4;
    }

    /**
     * Sets the value of the trmDemog4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmDemog4(JAXBElement<String> value) {
        this.trmDemog4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmDemog5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmDemog5() {
        return trmDemog5;
    }

    /**
     * Sets the value of the trmDemog5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmDemog5(JAXBElement<String> value) {
        this.trmDemog5 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmCancelFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTrmCancelFlag() {
        return trmCancelFlag;
    }

    /**
     * Sets the value of the trmCancelFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTrmCancelFlag(JAXBElement<Short> value) {
        this.trmCancelFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the trmIvdPrcPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmIvdPrcPrdKey() {
        return trmIvdPrcPrdKey;
    }

    /**
     * Sets the value of the trmIvdPrcPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmIvdPrcPrdKey(JAXBElement<String> value) {
        this.trmIvdPrcPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmLifetimeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTrmLifetimeFlag() {
        return trmLifetimeFlag;
    }

    /**
     * Sets the value of the trmLifetimeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTrmLifetimeFlag(JAXBElement<Short> value) {
        this.trmLifetimeFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the trmGraceIssuesCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTrmGraceIssuesCp() {
        return trmGraceIssuesCp;
    }

    /**
     * Sets the value of the trmGraceIssuesCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTrmGraceIssuesCp(JAXBElement<Integer> value) {
        this.trmGraceIssuesCp = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the trmSuiPrdKeyDrop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmSuiPrdKeyDrop() {
        return trmSuiPrdKeyDrop;
    }

    /**
     * Sets the value of the trmSuiPrdKeyDrop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmSuiPrdKeyDrop(JAXBElement<String> value) {
        this.trmSuiPrdKeyDrop = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmAddDropFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTrmAddDropFlag() {
        return trmAddDropFlag;
    }

    /**
     * Sets the value of the trmAddDropFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTrmAddDropFlag(JAXBElement<Short> value) {
        this.trmAddDropFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the trmMbrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmMbrKey() {
        return trmMbrKey;
    }

    /**
     * Sets the value of the trmMbrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmMbrKey(JAXBElement<String> value) {
        this.trmMbrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trmMxiKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrmMxiKey() {
        return trmMxiKey;
    }

    /**
     * Sets the value of the trmMxiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrmMxiKey(JAXBElement<String> value) {
        this.trmMxiKey = ((JAXBElement<String> ) value);
    }

}
