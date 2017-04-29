
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mb_membership_Association_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mb_membership_Association_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asn_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="asn_name" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="asn_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="asn_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="asn_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="asn_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="asn_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="asn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="asn_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="asn_calendar_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="asn_membership_start_month" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="asn_membership_start_day" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="asn_membership_sell_next_year_after_month" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="asn_membership_sell_next_year_after_day" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="asn_membership_grace_period" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="asn_membership_grace_length" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="asn_membership_next_month_after_day" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="asn_update_date_when" type="{http://www.avectra.com/2005/}stringLength25_Type" minOccurs="0"/>
 *         &lt;element name="asn_percent_paid" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="asn_invoice_type" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="asn_set_on_paid_date_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="asn_flip_customer_member_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="asn_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mb_membership_Association_DataObjectType", propOrder = {
    "asnCode",
    "asnName",
    "asnAddDate",
    "asnAddUser",
    "asnChangeDate",
    "asnChangeUser",
    "asnDeleteFlag",
    "asnKey",
    "asnKeyExt",
    "asnCalendarFlag",
    "asnMembershipStartMonth",
    "asnMembershipStartDay",
    "asnMembershipSellNextYearAfterMonth",
    "asnMembershipSellNextYearAfterDay",
    "asnMembershipGracePeriod",
    "asnMembershipGraceLength",
    "asnMembershipNextMonthAfterDay",
    "asnUpdateDateWhen",
    "asnPercentPaid",
    "asnInvoiceType",
    "asnSetOnPaidDateFlag",
    "asnFlipCustomerMemberFlag",
    "asnEntityKey"
})
public class MbMembershipAssociationDataObjectType {

    @XmlElementRef(name = "asn_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> asnCode;
    @XmlElementRef(name = "asn_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> asnName;
    @XmlElementRef(name = "asn_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> asnAddDate;
    @XmlElementRef(name = "asn_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> asnAddUser;
    @XmlElementRef(name = "asn_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> asnChangeDate;
    @XmlElementRef(name = "asn_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> asnChangeUser;
    @XmlElementRef(name = "asn_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> asnDeleteFlag;
    @XmlElementRef(name = "asn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> asnKey;
    @XmlElementRef(name = "asn_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> asnKeyExt;
    @XmlElementRef(name = "asn_calendar_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> asnCalendarFlag;
    @XmlElementRef(name = "asn_membership_start_month", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> asnMembershipStartMonth;
    @XmlElementRef(name = "asn_membership_start_day", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> asnMembershipStartDay;
    @XmlElementRef(name = "asn_membership_sell_next_year_after_month", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> asnMembershipSellNextYearAfterMonth;
    @XmlElementRef(name = "asn_membership_sell_next_year_after_day", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> asnMembershipSellNextYearAfterDay;
    @XmlElementRef(name = "asn_membership_grace_period", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> asnMembershipGracePeriod;
    @XmlElementRef(name = "asn_membership_grace_length", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> asnMembershipGraceLength;
    @XmlElementRef(name = "asn_membership_next_month_after_day", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> asnMembershipNextMonthAfterDay;
    @XmlElementRef(name = "asn_update_date_when", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> asnUpdateDateWhen;
    @XmlElementRef(name = "asn_percent_paid", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> asnPercentPaid;
    @XmlElementRef(name = "asn_invoice_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> asnInvoiceType;
    @XmlElementRef(name = "asn_set_on_paid_date_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> asnSetOnPaidDateFlag;
    @XmlElementRef(name = "asn_flip_customer_member_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> asnFlipCustomerMemberFlag;
    @XmlElementRef(name = "asn_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> asnEntityKey;

    /**
     * Gets the value of the asnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAsnCode() {
        return asnCode;
    }

    /**
     * Sets the value of the asnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAsnCode(JAXBElement<String> value) {
        this.asnCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the asnName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAsnName() {
        return asnName;
    }

    /**
     * Sets the value of the asnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAsnName(JAXBElement<String> value) {
        this.asnName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the asnAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAsnAddDate() {
        return asnAddDate;
    }

    /**
     * Sets the value of the asnAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAsnAddDate(JAXBElement<String> value) {
        this.asnAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the asnAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAsnAddUser() {
        return asnAddUser;
    }

    /**
     * Sets the value of the asnAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAsnAddUser(JAXBElement<String> value) {
        this.asnAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the asnChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAsnChangeDate() {
        return asnChangeDate;
    }

    /**
     * Sets the value of the asnChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAsnChangeDate(JAXBElement<String> value) {
        this.asnChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the asnChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAsnChangeUser() {
        return asnChangeUser;
    }

    /**
     * Sets the value of the asnChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAsnChangeUser(JAXBElement<String> value) {
        this.asnChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the asnDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getAsnDeleteFlag() {
        return asnDeleteFlag;
    }

    /**
     * Sets the value of the asnDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setAsnDeleteFlag(JAXBElement<Short> value) {
        this.asnDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the asnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAsnKey() {
        return asnKey;
    }

    /**
     * Sets the value of the asnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAsnKey(JAXBElement<String> value) {
        this.asnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the asnKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAsnKeyExt() {
        return asnKeyExt;
    }

    /**
     * Sets the value of the asnKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAsnKeyExt(JAXBElement<String> value) {
        this.asnKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the asnCalendarFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getAsnCalendarFlag() {
        return asnCalendarFlag;
    }

    /**
     * Sets the value of the asnCalendarFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setAsnCalendarFlag(JAXBElement<Short> value) {
        this.asnCalendarFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the asnMembershipStartMonth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAsnMembershipStartMonth() {
        return asnMembershipStartMonth;
    }

    /**
     * Sets the value of the asnMembershipStartMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAsnMembershipStartMonth(JAXBElement<Integer> value) {
        this.asnMembershipStartMonth = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the asnMembershipStartDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAsnMembershipStartDay() {
        return asnMembershipStartDay;
    }

    /**
     * Sets the value of the asnMembershipStartDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAsnMembershipStartDay(JAXBElement<Integer> value) {
        this.asnMembershipStartDay = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the asnMembershipSellNextYearAfterMonth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAsnMembershipSellNextYearAfterMonth() {
        return asnMembershipSellNextYearAfterMonth;
    }

    /**
     * Sets the value of the asnMembershipSellNextYearAfterMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAsnMembershipSellNextYearAfterMonth(JAXBElement<Integer> value) {
        this.asnMembershipSellNextYearAfterMonth = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the asnMembershipSellNextYearAfterDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAsnMembershipSellNextYearAfterDay() {
        return asnMembershipSellNextYearAfterDay;
    }

    /**
     * Sets the value of the asnMembershipSellNextYearAfterDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAsnMembershipSellNextYearAfterDay(JAXBElement<Integer> value) {
        this.asnMembershipSellNextYearAfterDay = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the asnMembershipGracePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAsnMembershipGracePeriod() {
        return asnMembershipGracePeriod;
    }

    /**
     * Sets the value of the asnMembershipGracePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAsnMembershipGracePeriod(JAXBElement<String> value) {
        this.asnMembershipGracePeriod = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the asnMembershipGraceLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAsnMembershipGraceLength() {
        return asnMembershipGraceLength;
    }

    /**
     * Sets the value of the asnMembershipGraceLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAsnMembershipGraceLength(JAXBElement<Integer> value) {
        this.asnMembershipGraceLength = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the asnMembershipNextMonthAfterDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAsnMembershipNextMonthAfterDay() {
        return asnMembershipNextMonthAfterDay;
    }

    /**
     * Sets the value of the asnMembershipNextMonthAfterDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAsnMembershipNextMonthAfterDay(JAXBElement<Integer> value) {
        this.asnMembershipNextMonthAfterDay = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the asnUpdateDateWhen property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAsnUpdateDateWhen() {
        return asnUpdateDateWhen;
    }

    /**
     * Sets the value of the asnUpdateDateWhen property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAsnUpdateDateWhen(JAXBElement<String> value) {
        this.asnUpdateDateWhen = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the asnPercentPaid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAsnPercentPaid() {
        return asnPercentPaid;
    }

    /**
     * Sets the value of the asnPercentPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAsnPercentPaid(JAXBElement<Integer> value) {
        this.asnPercentPaid = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the asnInvoiceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAsnInvoiceType() {
        return asnInvoiceType;
    }

    /**
     * Sets the value of the asnInvoiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAsnInvoiceType(JAXBElement<String> value) {
        this.asnInvoiceType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the asnSetOnPaidDateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getAsnSetOnPaidDateFlag() {
        return asnSetOnPaidDateFlag;
    }

    /**
     * Sets the value of the asnSetOnPaidDateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setAsnSetOnPaidDateFlag(JAXBElement<Short> value) {
        this.asnSetOnPaidDateFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the asnFlipCustomerMemberFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getAsnFlipCustomerMemberFlag() {
        return asnFlipCustomerMemberFlag;
    }

    /**
     * Sets the value of the asnFlipCustomerMemberFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setAsnFlipCustomerMemberFlag(JAXBElement<Short> value) {
        this.asnFlipCustomerMemberFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the asnEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAsnEntityKey() {
        return asnEntityKey;
    }

    /**
     * Sets the value of the asnEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAsnEntityKey(JAXBElement<String> value) {
        this.asnEntityKey = ((JAXBElement<String> ) value);
    }

}
