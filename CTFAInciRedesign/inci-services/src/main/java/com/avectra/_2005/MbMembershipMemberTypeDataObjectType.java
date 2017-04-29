
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mb_membership_Member_Type_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mb_membership_Member_Type_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mbt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbt_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="mbt_asn_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="mbt_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="mbt_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="mbt_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="mbt_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="mbt_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="mbt_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbt_chapter_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="mbt_calendar_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="mbt_membership_start_month" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="mbt_membership_start_day" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="mbt_membership_next_month_after_day" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="mbt_membership_sell_next_year_after_month" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="mbt_membership_sell_next_year_after_day" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="mbt_membership_grace_period" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="mbt_membership_grace_length" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="mbt_update_date_when" type="{http://www.avectra.com/2005/}stringLength25_Type" minOccurs="0"/>
 *         &lt;element name="mbt_percent_paid" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="mbt_flow_down" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="mbt_voting_rights" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="mbt_invoice_type" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="mbt_flip_customer_member_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="mbt_set_on_paid_date_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="mbt_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbt_mbs_drop_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbt_mbs_approval_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbt_mbt_dependency_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbt_chp_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbt_description" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="mbt_dyn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbt_wiz_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mbt_cst_type" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="mbt_mbt_renewal_key" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="mbt_first_installment_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mb_membership_Member_Type_DataObjectType", propOrder = {
    "mbtKey",
    "mbtCode",
    "mbtAsnCode",
    "mbtAddUser",
    "mbtAddDate",
    "mbtChangeUser",
    "mbtChangeDate",
    "mbtDeleteFlag",
    "mbtKeyExt",
    "mbtChapterFlag",
    "mbtCalendarFlag",
    "mbtMembershipStartMonth",
    "mbtMembershipStartDay",
    "mbtMembershipNextMonthAfterDay",
    "mbtMembershipSellNextYearAfterMonth",
    "mbtMembershipSellNextYearAfterDay",
    "mbtMembershipGracePeriod",
    "mbtMembershipGraceLength",
    "mbtUpdateDateWhen",
    "mbtPercentPaid",
    "mbtFlowDown",
    "mbtVotingRights",
    "mbtInvoiceType",
    "mbtFlipCustomerMemberFlag",
    "mbtSetOnPaidDateFlag",
    "mbtEntityKey",
    "mbtMbsDropKey",
    "mbtMbsApprovalKey",
    "mbtMbtDependencyKey",
    "mbtChpCstKey",
    "mbtDescription",
    "mbtDynKey",
    "mbtWizKey",
    "mbtCstType",
    "mbtMbtRenewalKey",
    "mbtFirstInstallmentFlag"
})
public class MbMembershipMemberTypeDataObjectType {

    @XmlElementRef(name = "mbt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbtKey;
    @XmlElementRef(name = "mbt_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbtCode;
    @XmlElementRef(name = "mbt_asn_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbtAsnCode;
    @XmlElementRef(name = "mbt_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbtAddUser;
    @XmlElementRef(name = "mbt_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbtAddDate;
    @XmlElementRef(name = "mbt_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbtChangeUser;
    @XmlElementRef(name = "mbt_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbtChangeDate;
    @XmlElementRef(name = "mbt_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mbtDeleteFlag;
    @XmlElementRef(name = "mbt_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbtKeyExt;
    @XmlElementRef(name = "mbt_chapter_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mbtChapterFlag;
    @XmlElementRef(name = "mbt_calendar_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mbtCalendarFlag;
    @XmlElementRef(name = "mbt_membership_start_month", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> mbtMembershipStartMonth;
    @XmlElementRef(name = "mbt_membership_start_day", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> mbtMembershipStartDay;
    @XmlElementRef(name = "mbt_membership_next_month_after_day", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> mbtMembershipNextMonthAfterDay;
    @XmlElementRef(name = "mbt_membership_sell_next_year_after_month", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> mbtMembershipSellNextYearAfterMonth;
    @XmlElementRef(name = "mbt_membership_sell_next_year_after_day", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> mbtMembershipSellNextYearAfterDay;
    @XmlElementRef(name = "mbt_membership_grace_period", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbtMembershipGracePeriod;
    @XmlElementRef(name = "mbt_membership_grace_length", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> mbtMembershipGraceLength;
    @XmlElementRef(name = "mbt_update_date_when", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbtUpdateDateWhen;
    @XmlElementRef(name = "mbt_percent_paid", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> mbtPercentPaid;
    @XmlElementRef(name = "mbt_flow_down", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mbtFlowDown;
    @XmlElementRef(name = "mbt_voting_rights", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mbtVotingRights;
    @XmlElementRef(name = "mbt_invoice_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbtInvoiceType;
    @XmlElementRef(name = "mbt_flip_customer_member_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mbtFlipCustomerMemberFlag;
    @XmlElementRef(name = "mbt_set_on_paid_date_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mbtSetOnPaidDateFlag;
    @XmlElementRef(name = "mbt_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbtEntityKey;
    @XmlElementRef(name = "mbt_mbs_drop_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbtMbsDropKey;
    @XmlElementRef(name = "mbt_mbs_approval_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbtMbsApprovalKey;
    @XmlElementRef(name = "mbt_mbt_dependency_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbtMbtDependencyKey;
    @XmlElementRef(name = "mbt_chp_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbtChpCstKey;
    @XmlElementRef(name = "mbt_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbtDescription;
    @XmlElementRef(name = "mbt_dyn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbtDynKey;
    @XmlElementRef(name = "mbt_wiz_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbtWizKey;
    @XmlElementRef(name = "mbt_cst_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mbtCstType;
    @XmlElementRef(name = "mbt_mbt_renewal_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mbtMbtRenewalKey;
    @XmlElementRef(name = "mbt_first_installment_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mbtFirstInstallmentFlag;

    /**
     * Gets the value of the mbtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbtKey() {
        return mbtKey;
    }

    /**
     * Sets the value of the mbtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbtKey(JAXBElement<String> value) {
        this.mbtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbtCode() {
        return mbtCode;
    }

    /**
     * Sets the value of the mbtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbtCode(JAXBElement<String> value) {
        this.mbtCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbtAsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbtAsnCode() {
        return mbtAsnCode;
    }

    /**
     * Sets the value of the mbtAsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbtAsnCode(JAXBElement<String> value) {
        this.mbtAsnCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbtAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbtAddUser() {
        return mbtAddUser;
    }

    /**
     * Sets the value of the mbtAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbtAddUser(JAXBElement<String> value) {
        this.mbtAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbtAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbtAddDate() {
        return mbtAddDate;
    }

    /**
     * Sets the value of the mbtAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbtAddDate(JAXBElement<String> value) {
        this.mbtAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbtChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbtChangeUser() {
        return mbtChangeUser;
    }

    /**
     * Sets the value of the mbtChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbtChangeUser(JAXBElement<String> value) {
        this.mbtChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbtChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbtChangeDate() {
        return mbtChangeDate;
    }

    /**
     * Sets the value of the mbtChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbtChangeDate(JAXBElement<String> value) {
        this.mbtChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbtDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMbtDeleteFlag() {
        return mbtDeleteFlag;
    }

    /**
     * Sets the value of the mbtDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMbtDeleteFlag(JAXBElement<Short> value) {
        this.mbtDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the mbtKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbtKeyExt() {
        return mbtKeyExt;
    }

    /**
     * Sets the value of the mbtKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbtKeyExt(JAXBElement<String> value) {
        this.mbtKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbtChapterFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMbtChapterFlag() {
        return mbtChapterFlag;
    }

    /**
     * Sets the value of the mbtChapterFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMbtChapterFlag(JAXBElement<Short> value) {
        this.mbtChapterFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the mbtCalendarFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMbtCalendarFlag() {
        return mbtCalendarFlag;
    }

    /**
     * Sets the value of the mbtCalendarFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMbtCalendarFlag(JAXBElement<Short> value) {
        this.mbtCalendarFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the mbtMembershipStartMonth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMbtMembershipStartMonth() {
        return mbtMembershipStartMonth;
    }

    /**
     * Sets the value of the mbtMembershipStartMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMbtMembershipStartMonth(JAXBElement<Integer> value) {
        this.mbtMembershipStartMonth = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the mbtMembershipStartDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMbtMembershipStartDay() {
        return mbtMembershipStartDay;
    }

    /**
     * Sets the value of the mbtMembershipStartDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMbtMembershipStartDay(JAXBElement<Integer> value) {
        this.mbtMembershipStartDay = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the mbtMembershipNextMonthAfterDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMbtMembershipNextMonthAfterDay() {
        return mbtMembershipNextMonthAfterDay;
    }

    /**
     * Sets the value of the mbtMembershipNextMonthAfterDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMbtMembershipNextMonthAfterDay(JAXBElement<Integer> value) {
        this.mbtMembershipNextMonthAfterDay = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the mbtMembershipSellNextYearAfterMonth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMbtMembershipSellNextYearAfterMonth() {
        return mbtMembershipSellNextYearAfterMonth;
    }

    /**
     * Sets the value of the mbtMembershipSellNextYearAfterMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMbtMembershipSellNextYearAfterMonth(JAXBElement<Integer> value) {
        this.mbtMembershipSellNextYearAfterMonth = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the mbtMembershipSellNextYearAfterDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMbtMembershipSellNextYearAfterDay() {
        return mbtMembershipSellNextYearAfterDay;
    }

    /**
     * Sets the value of the mbtMembershipSellNextYearAfterDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMbtMembershipSellNextYearAfterDay(JAXBElement<Integer> value) {
        this.mbtMembershipSellNextYearAfterDay = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the mbtMembershipGracePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbtMembershipGracePeriod() {
        return mbtMembershipGracePeriod;
    }

    /**
     * Sets the value of the mbtMembershipGracePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbtMembershipGracePeriod(JAXBElement<String> value) {
        this.mbtMembershipGracePeriod = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbtMembershipGraceLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMbtMembershipGraceLength() {
        return mbtMembershipGraceLength;
    }

    /**
     * Sets the value of the mbtMembershipGraceLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMbtMembershipGraceLength(JAXBElement<Integer> value) {
        this.mbtMembershipGraceLength = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the mbtUpdateDateWhen property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbtUpdateDateWhen() {
        return mbtUpdateDateWhen;
    }

    /**
     * Sets the value of the mbtUpdateDateWhen property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbtUpdateDateWhen(JAXBElement<String> value) {
        this.mbtUpdateDateWhen = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbtPercentPaid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMbtPercentPaid() {
        return mbtPercentPaid;
    }

    /**
     * Sets the value of the mbtPercentPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMbtPercentPaid(JAXBElement<Integer> value) {
        this.mbtPercentPaid = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the mbtFlowDown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMbtFlowDown() {
        return mbtFlowDown;
    }

    /**
     * Sets the value of the mbtFlowDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMbtFlowDown(JAXBElement<Short> value) {
        this.mbtFlowDown = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the mbtVotingRights property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMbtVotingRights() {
        return mbtVotingRights;
    }

    /**
     * Sets the value of the mbtVotingRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMbtVotingRights(JAXBElement<Short> value) {
        this.mbtVotingRights = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the mbtInvoiceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbtInvoiceType() {
        return mbtInvoiceType;
    }

    /**
     * Sets the value of the mbtInvoiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbtInvoiceType(JAXBElement<String> value) {
        this.mbtInvoiceType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbtFlipCustomerMemberFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMbtFlipCustomerMemberFlag() {
        return mbtFlipCustomerMemberFlag;
    }

    /**
     * Sets the value of the mbtFlipCustomerMemberFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMbtFlipCustomerMemberFlag(JAXBElement<Short> value) {
        this.mbtFlipCustomerMemberFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the mbtSetOnPaidDateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMbtSetOnPaidDateFlag() {
        return mbtSetOnPaidDateFlag;
    }

    /**
     * Sets the value of the mbtSetOnPaidDateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMbtSetOnPaidDateFlag(JAXBElement<Short> value) {
        this.mbtSetOnPaidDateFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the mbtEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbtEntityKey() {
        return mbtEntityKey;
    }

    /**
     * Sets the value of the mbtEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbtEntityKey(JAXBElement<String> value) {
        this.mbtEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbtMbsDropKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbtMbsDropKey() {
        return mbtMbsDropKey;
    }

    /**
     * Sets the value of the mbtMbsDropKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbtMbsDropKey(JAXBElement<String> value) {
        this.mbtMbsDropKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbtMbsApprovalKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbtMbsApprovalKey() {
        return mbtMbsApprovalKey;
    }

    /**
     * Sets the value of the mbtMbsApprovalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbtMbsApprovalKey(JAXBElement<String> value) {
        this.mbtMbsApprovalKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbtMbtDependencyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbtMbtDependencyKey() {
        return mbtMbtDependencyKey;
    }

    /**
     * Sets the value of the mbtMbtDependencyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbtMbtDependencyKey(JAXBElement<String> value) {
        this.mbtMbtDependencyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbtChpCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbtChpCstKey() {
        return mbtChpCstKey;
    }

    /**
     * Sets the value of the mbtChpCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbtChpCstKey(JAXBElement<String> value) {
        this.mbtChpCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbtDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbtDescription() {
        return mbtDescription;
    }

    /**
     * Sets the value of the mbtDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbtDescription(JAXBElement<String> value) {
        this.mbtDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbtDynKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbtDynKey() {
        return mbtDynKey;
    }

    /**
     * Sets the value of the mbtDynKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbtDynKey(JAXBElement<String> value) {
        this.mbtDynKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbtWizKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbtWizKey() {
        return mbtWizKey;
    }

    /**
     * Sets the value of the mbtWizKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbtWizKey(JAXBElement<String> value) {
        this.mbtWizKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbtCstType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbtCstType() {
        return mbtCstType;
    }

    /**
     * Sets the value of the mbtCstType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbtCstType(JAXBElement<String> value) {
        this.mbtCstType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mbtMbtRenewalKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMbtMbtRenewalKey() {
        return mbtMbtRenewalKey;
    }

    /**
     * Sets the value of the mbtMbtRenewalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMbtMbtRenewalKey(JAXBElement<Short> value) {
        this.mbtMbtRenewalKey = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the mbtFirstInstallmentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMbtFirstInstallmentFlag() {
        return mbtFirstInstallmentFlag;
    }

    /**
     * Sets the value of the mbtFirstInstallmentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMbtFirstInstallmentFlag(JAXBElement<Short> value) {
        this.mbtFirstInstallmentFlag = ((JAXBElement<Short> ) value);
    }

}
