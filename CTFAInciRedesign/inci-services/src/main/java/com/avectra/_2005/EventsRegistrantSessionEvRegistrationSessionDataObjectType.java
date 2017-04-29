
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrantSession_ev_registration_session_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrantSession_ev_registration_session_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rgs_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rgs_reg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rgs_ses_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rgs_trk_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rgs_on_wait_list_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="rgs_confirm_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rgs_attendance_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="rgs_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="rgs_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="rgs_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="rgs_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="rgs_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="rgs_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rgs_ivd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rgs_cancel_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="rgs_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rgs_cancel_reason" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="rgs_score" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="rgs_grade" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="rgs_rgs_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rgs_odd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rgs_qty" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="rgs_cancel_qty" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="rgs_balance_qty_cp" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="rgs_gft_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rgs_time_in" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="rgs_time_out" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="rgs_prc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rgs_tickets" type="{http://www.avectra.com/2005/}av_int_Type" minOccurs="0"/>
 *         &lt;element name="rgs_reduce_qty" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="rgs_NewBatch_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrantSession_ev_registration_session_DataObjectType", propOrder = {
    "rgsKey",
    "rgsRegKey",
    "rgsSesKey",
    "rgsTrkKey",
    "rgsOnWaitListFlag",
    "rgsConfirmDate",
    "rgsAttendanceFlag",
    "rgsAddUser",
    "rgsAddDate",
    "rgsChangeUser",
    "rgsChangeDate",
    "rgsDeleteFlag",
    "rgsKeyExt",
    "rgsIvdKey",
    "rgsCancelDate",
    "rgsEntityKey",
    "rgsCancelReason",
    "rgsScore",
    "rgsGrade",
    "rgsRgsKey",
    "rgsOddKey",
    "rgsQty",
    "rgsCancelQty",
    "rgsBalanceQtyCp",
    "rgsGftKey",
    "rgsTimeIn",
    "rgsTimeOut",
    "rgsPrcKey",
    "rgsTickets",
    "rgsReduceQty",
    "rgsNewBatchKey"
})
public class EventsRegistrantSessionEvRegistrationSessionDataObjectType {

    @XmlElementRef(name = "rgs_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgsKey;
    @XmlElementRef(name = "rgs_reg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgsRegKey;
    @XmlElementRef(name = "rgs_ses_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgsSesKey;
    @XmlElementRef(name = "rgs_trk_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgsTrkKey;
    @XmlElementRef(name = "rgs_on_wait_list_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rgsOnWaitListFlag;
    @XmlElementRef(name = "rgs_confirm_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgsConfirmDate;
    @XmlElementRef(name = "rgs_attendance_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rgsAttendanceFlag;
    @XmlElementRef(name = "rgs_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgsAddUser;
    @XmlElementRef(name = "rgs_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgsAddDate;
    @XmlElementRef(name = "rgs_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgsChangeUser;
    @XmlElementRef(name = "rgs_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgsChangeDate;
    @XmlElementRef(name = "rgs_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rgsDeleteFlag;
    @XmlElementRef(name = "rgs_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgsKeyExt;
    @XmlElementRef(name = "rgs_ivd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgsIvdKey;
    @XmlElementRef(name = "rgs_cancel_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgsCancelDate;
    @XmlElementRef(name = "rgs_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgsEntityKey;
    @XmlElementRef(name = "rgs_cancel_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgsCancelReason;
    @XmlElementRef(name = "rgs_score", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgsScore;
    @XmlElementRef(name = "rgs_grade", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgsGrade;
    @XmlElementRef(name = "rgs_rgs_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgsRgsKey;
    @XmlElementRef(name = "rgs_odd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgsOddKey;
    @XmlElementRef(name = "rgs_qty", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> rgsQty;
    @XmlElementRef(name = "rgs_cancel_qty", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> rgsCancelQty;
    @XmlElementRef(name = "rgs_balance_qty_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> rgsBalanceQtyCp;
    @XmlElementRef(name = "rgs_gft_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgsGftKey;
    @XmlElementRef(name = "rgs_time_in", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgsTimeIn;
    @XmlElementRef(name = "rgs_time_out", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgsTimeOut;
    @XmlElementRef(name = "rgs_prc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgsPrcKey;
    @XmlElementRef(name = "rgs_tickets", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgsTickets;
    @XmlElementRef(name = "rgs_reduce_qty", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> rgsReduceQty;
    @XmlElementRef(name = "rgs_NewBatch_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgsNewBatchKey;

    /**
     * Gets the value of the rgsKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgsKey() {
        return rgsKey;
    }

    /**
     * Sets the value of the rgsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgsKey(JAXBElement<String> value) {
        this.rgsKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgsRegKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgsRegKey() {
        return rgsRegKey;
    }

    /**
     * Sets the value of the rgsRegKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgsRegKey(JAXBElement<String> value) {
        this.rgsRegKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgsSesKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgsSesKey() {
        return rgsSesKey;
    }

    /**
     * Sets the value of the rgsSesKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgsSesKey(JAXBElement<String> value) {
        this.rgsSesKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgsTrkKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgsTrkKey() {
        return rgsTrkKey;
    }

    /**
     * Sets the value of the rgsTrkKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgsTrkKey(JAXBElement<String> value) {
        this.rgsTrkKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgsOnWaitListFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRgsOnWaitListFlag() {
        return rgsOnWaitListFlag;
    }

    /**
     * Sets the value of the rgsOnWaitListFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRgsOnWaitListFlag(JAXBElement<Short> value) {
        this.rgsOnWaitListFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rgsConfirmDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgsConfirmDate() {
        return rgsConfirmDate;
    }

    /**
     * Sets the value of the rgsConfirmDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgsConfirmDate(JAXBElement<String> value) {
        this.rgsConfirmDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgsAttendanceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRgsAttendanceFlag() {
        return rgsAttendanceFlag;
    }

    /**
     * Sets the value of the rgsAttendanceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRgsAttendanceFlag(JAXBElement<Short> value) {
        this.rgsAttendanceFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rgsAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgsAddUser() {
        return rgsAddUser;
    }

    /**
     * Sets the value of the rgsAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgsAddUser(JAXBElement<String> value) {
        this.rgsAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgsAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgsAddDate() {
        return rgsAddDate;
    }

    /**
     * Sets the value of the rgsAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgsAddDate(JAXBElement<String> value) {
        this.rgsAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgsChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgsChangeUser() {
        return rgsChangeUser;
    }

    /**
     * Sets the value of the rgsChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgsChangeUser(JAXBElement<String> value) {
        this.rgsChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgsChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgsChangeDate() {
        return rgsChangeDate;
    }

    /**
     * Sets the value of the rgsChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgsChangeDate(JAXBElement<String> value) {
        this.rgsChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgsDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRgsDeleteFlag() {
        return rgsDeleteFlag;
    }

    /**
     * Sets the value of the rgsDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRgsDeleteFlag(JAXBElement<Short> value) {
        this.rgsDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rgsKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgsKeyExt() {
        return rgsKeyExt;
    }

    /**
     * Sets the value of the rgsKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgsKeyExt(JAXBElement<String> value) {
        this.rgsKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgsIvdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgsIvdKey() {
        return rgsIvdKey;
    }

    /**
     * Sets the value of the rgsIvdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgsIvdKey(JAXBElement<String> value) {
        this.rgsIvdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgsCancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgsCancelDate() {
        return rgsCancelDate;
    }

    /**
     * Sets the value of the rgsCancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgsCancelDate(JAXBElement<String> value) {
        this.rgsCancelDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgsEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgsEntityKey() {
        return rgsEntityKey;
    }

    /**
     * Sets the value of the rgsEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgsEntityKey(JAXBElement<String> value) {
        this.rgsEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgsCancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgsCancelReason() {
        return rgsCancelReason;
    }

    /**
     * Sets the value of the rgsCancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgsCancelReason(JAXBElement<String> value) {
        this.rgsCancelReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgsScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgsScore() {
        return rgsScore;
    }

    /**
     * Sets the value of the rgsScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgsScore(JAXBElement<String> value) {
        this.rgsScore = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgsGrade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgsGrade() {
        return rgsGrade;
    }

    /**
     * Sets the value of the rgsGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgsGrade(JAXBElement<String> value) {
        this.rgsGrade = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgsRgsKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgsRgsKey() {
        return rgsRgsKey;
    }

    /**
     * Sets the value of the rgsRgsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgsRgsKey(JAXBElement<String> value) {
        this.rgsRgsKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgsOddKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgsOddKey() {
        return rgsOddKey;
    }

    /**
     * Sets the value of the rgsOddKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgsOddKey(JAXBElement<String> value) {
        this.rgsOddKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgsQty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRgsQty() {
        return rgsQty;
    }

    /**
     * Sets the value of the rgsQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRgsQty(JAXBElement<Integer> value) {
        this.rgsQty = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rgsCancelQty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRgsCancelQty() {
        return rgsCancelQty;
    }

    /**
     * Sets the value of the rgsCancelQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRgsCancelQty(JAXBElement<Integer> value) {
        this.rgsCancelQty = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rgsBalanceQtyCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRgsBalanceQtyCp() {
        return rgsBalanceQtyCp;
    }

    /**
     * Sets the value of the rgsBalanceQtyCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRgsBalanceQtyCp(JAXBElement<Integer> value) {
        this.rgsBalanceQtyCp = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rgsGftKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgsGftKey() {
        return rgsGftKey;
    }

    /**
     * Sets the value of the rgsGftKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgsGftKey(JAXBElement<String> value) {
        this.rgsGftKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgsTimeIn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgsTimeIn() {
        return rgsTimeIn;
    }

    /**
     * Sets the value of the rgsTimeIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgsTimeIn(JAXBElement<String> value) {
        this.rgsTimeIn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgsTimeOut property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgsTimeOut() {
        return rgsTimeOut;
    }

    /**
     * Sets the value of the rgsTimeOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgsTimeOut(JAXBElement<String> value) {
        this.rgsTimeOut = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgsPrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgsPrcKey() {
        return rgsPrcKey;
    }

    /**
     * Sets the value of the rgsPrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgsPrcKey(JAXBElement<String> value) {
        this.rgsPrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgsTickets property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgsTickets() {
        return rgsTickets;
    }

    /**
     * Sets the value of the rgsTickets property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgsTickets(JAXBElement<String> value) {
        this.rgsTickets = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgsReduceQty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRgsReduceQty() {
        return rgsReduceQty;
    }

    /**
     * Sets the value of the rgsReduceQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRgsReduceQty(JAXBElement<Integer> value) {
        this.rgsReduceQty = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rgsNewBatchKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgsNewBatchKey() {
        return rgsNewBatchKey;
    }

    /**
     * Sets the value of the rgsNewBatchKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgsNewBatchKey(JAXBElement<String> value) {
        this.rgsNewBatchKey = ((JAXBElement<String> ) value);
    }

}
