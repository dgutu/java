
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExhibitorBoothNew_ExhibitorCustomer_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExhibitorBoothNew_ExhibitorCustomer_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exh_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exh_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exh_inv_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="exh_exb_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exh_directory_name" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="exh_directory_desc_html" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="exh_ind_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exh_reg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exh_pref_comm_method" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="exh_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exh_cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exh_eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exh_cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exh_url_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exh_on_wait_list_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="exh_confirm_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="exh_attendance_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="exh_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="exh_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="exh_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="exh_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="exh_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="exh_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exh_avoid_competitors" type="{http://www.avectra.com/2005/}stringLength500_Type" minOccurs="0"/>
 *         &lt;element name="exh_priority_points_gained" type="{http://www.avectra.com/2005/}av_float_Type" minOccurs="0"/>
 *         &lt;element name="exh_comp_registrations_total" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="exh_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exh_contract_send_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="exh_contract_status" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="exh_contract_receive_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="exh_cancel_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="exh_cancel_reason" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="exh_ord_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="exh_comp_booth_personnel_total" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExhibitorBoothNew_ExhibitorCustomer_DataObjectType", propOrder = {
    "exhKey",
    "exhCstKey",
    "exhInvCode",
    "exhExbKey",
    "exhDirectoryName",
    "exhDirectoryDescHtml",
    "exhIndCstKey",
    "exhRegKey",
    "exhPrefCommMethod",
    "exhCxaKey",
    "exhCphKey",
    "exhEmlKey",
    "exhCfxKey",
    "exhUrlKey",
    "exhOnWaitListFlag",
    "exhConfirmDate",
    "exhAttendanceFlag",
    "exhAddUser",
    "exhAddDate",
    "exhChangeUser",
    "exhChangeDate",
    "exhDeleteFlag",
    "exhKeyExt",
    "exhAvoidCompetitors",
    "exhPriorityPointsGained",
    "exhCompRegistrationsTotal",
    "exhEntityKey",
    "exhContractSendDate",
    "exhContractStatus",
    "exhContractReceiveDate",
    "exhCancelDate",
    "exhCancelReason",
    "exhOrdCode",
    "exhCompBoothPersonnelTotal"
})
public class ExhibitorBoothNewExhibitorCustomerDataObjectType {

    @XmlElementRef(name = "exh_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhKey;
    @XmlElementRef(name = "exh_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhCstKey;
    @XmlElementRef(name = "exh_inv_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhInvCode;
    @XmlElementRef(name = "exh_exb_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhExbKey;
    @XmlElementRef(name = "exh_directory_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhDirectoryName;
    @XmlElementRef(name = "exh_directory_desc_html", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhDirectoryDescHtml;
    @XmlElementRef(name = "exh_ind_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhIndCstKey;
    @XmlElementRef(name = "exh_reg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhRegKey;
    @XmlElementRef(name = "exh_pref_comm_method", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhPrefCommMethod;
    @XmlElementRef(name = "exh_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhCxaKey;
    @XmlElementRef(name = "exh_cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhCphKey;
    @XmlElementRef(name = "exh_eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhEmlKey;
    @XmlElementRef(name = "exh_cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhCfxKey;
    @XmlElementRef(name = "exh_url_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhUrlKey;
    @XmlElementRef(name = "exh_on_wait_list_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> exhOnWaitListFlag;
    @XmlElementRef(name = "exh_confirm_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhConfirmDate;
    @XmlElementRef(name = "exh_attendance_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> exhAttendanceFlag;
    @XmlElementRef(name = "exh_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhAddUser;
    @XmlElementRef(name = "exh_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhAddDate;
    @XmlElementRef(name = "exh_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhChangeUser;
    @XmlElementRef(name = "exh_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhChangeDate;
    @XmlElementRef(name = "exh_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> exhDeleteFlag;
    @XmlElementRef(name = "exh_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhKeyExt;
    @XmlElementRef(name = "exh_avoid_competitors", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhAvoidCompetitors;
    @XmlElementRef(name = "exh_priority_points_gained", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Double> exhPriorityPointsGained;
    @XmlElementRef(name = "exh_comp_registrations_total", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> exhCompRegistrationsTotal;
    @XmlElementRef(name = "exh_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhEntityKey;
    @XmlElementRef(name = "exh_contract_send_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhContractSendDate;
    @XmlElementRef(name = "exh_contract_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhContractStatus;
    @XmlElementRef(name = "exh_contract_receive_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhContractReceiveDate;
    @XmlElementRef(name = "exh_cancel_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhCancelDate;
    @XmlElementRef(name = "exh_cancel_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhCancelReason;
    @XmlElementRef(name = "exh_ord_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> exhOrdCode;
    @XmlElementRef(name = "exh_comp_booth_personnel_total", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> exhCompBoothPersonnelTotal;

    /**
     * Gets the value of the exhKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhKey() {
        return exhKey;
    }

    /**
     * Sets the value of the exhKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhKey(JAXBElement<String> value) {
        this.exhKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhCstKey() {
        return exhCstKey;
    }

    /**
     * Sets the value of the exhCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhCstKey(JAXBElement<String> value) {
        this.exhCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhInvCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhInvCode() {
        return exhInvCode;
    }

    /**
     * Sets the value of the exhInvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhInvCode(JAXBElement<String> value) {
        this.exhInvCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhExbKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhExbKey() {
        return exhExbKey;
    }

    /**
     * Sets the value of the exhExbKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhExbKey(JAXBElement<String> value) {
        this.exhExbKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhDirectoryName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhDirectoryName() {
        return exhDirectoryName;
    }

    /**
     * Sets the value of the exhDirectoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhDirectoryName(JAXBElement<String> value) {
        this.exhDirectoryName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhDirectoryDescHtml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhDirectoryDescHtml() {
        return exhDirectoryDescHtml;
    }

    /**
     * Sets the value of the exhDirectoryDescHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhDirectoryDescHtml(JAXBElement<String> value) {
        this.exhDirectoryDescHtml = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhIndCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhIndCstKey() {
        return exhIndCstKey;
    }

    /**
     * Sets the value of the exhIndCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhIndCstKey(JAXBElement<String> value) {
        this.exhIndCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhRegKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhRegKey() {
        return exhRegKey;
    }

    /**
     * Sets the value of the exhRegKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhRegKey(JAXBElement<String> value) {
        this.exhRegKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhPrefCommMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhPrefCommMethod() {
        return exhPrefCommMethod;
    }

    /**
     * Sets the value of the exhPrefCommMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhPrefCommMethod(JAXBElement<String> value) {
        this.exhPrefCommMethod = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhCxaKey() {
        return exhCxaKey;
    }

    /**
     * Sets the value of the exhCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhCxaKey(JAXBElement<String> value) {
        this.exhCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhCphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhCphKey() {
        return exhCphKey;
    }

    /**
     * Sets the value of the exhCphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhCphKey(JAXBElement<String> value) {
        this.exhCphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhEmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhEmlKey() {
        return exhEmlKey;
    }

    /**
     * Sets the value of the exhEmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhEmlKey(JAXBElement<String> value) {
        this.exhEmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhCfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhCfxKey() {
        return exhCfxKey;
    }

    /**
     * Sets the value of the exhCfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhCfxKey(JAXBElement<String> value) {
        this.exhCfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhUrlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhUrlKey() {
        return exhUrlKey;
    }

    /**
     * Sets the value of the exhUrlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhUrlKey(JAXBElement<String> value) {
        this.exhUrlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhOnWaitListFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getExhOnWaitListFlag() {
        return exhOnWaitListFlag;
    }

    /**
     * Sets the value of the exhOnWaitListFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setExhOnWaitListFlag(JAXBElement<Short> value) {
        this.exhOnWaitListFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the exhConfirmDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhConfirmDate() {
        return exhConfirmDate;
    }

    /**
     * Sets the value of the exhConfirmDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhConfirmDate(JAXBElement<String> value) {
        this.exhConfirmDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhAttendanceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getExhAttendanceFlag() {
        return exhAttendanceFlag;
    }

    /**
     * Sets the value of the exhAttendanceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setExhAttendanceFlag(JAXBElement<Short> value) {
        this.exhAttendanceFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the exhAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhAddUser() {
        return exhAddUser;
    }

    /**
     * Sets the value of the exhAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhAddUser(JAXBElement<String> value) {
        this.exhAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhAddDate() {
        return exhAddDate;
    }

    /**
     * Sets the value of the exhAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhAddDate(JAXBElement<String> value) {
        this.exhAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhChangeUser() {
        return exhChangeUser;
    }

    /**
     * Sets the value of the exhChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhChangeUser(JAXBElement<String> value) {
        this.exhChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhChangeDate() {
        return exhChangeDate;
    }

    /**
     * Sets the value of the exhChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhChangeDate(JAXBElement<String> value) {
        this.exhChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getExhDeleteFlag() {
        return exhDeleteFlag;
    }

    /**
     * Sets the value of the exhDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setExhDeleteFlag(JAXBElement<Short> value) {
        this.exhDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the exhKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhKeyExt() {
        return exhKeyExt;
    }

    /**
     * Sets the value of the exhKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhKeyExt(JAXBElement<String> value) {
        this.exhKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhAvoidCompetitors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhAvoidCompetitors() {
        return exhAvoidCompetitors;
    }

    /**
     * Sets the value of the exhAvoidCompetitors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhAvoidCompetitors(JAXBElement<String> value) {
        this.exhAvoidCompetitors = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhPriorityPointsGained property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getExhPriorityPointsGained() {
        return exhPriorityPointsGained;
    }

    /**
     * Sets the value of the exhPriorityPointsGained property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setExhPriorityPointsGained(JAXBElement<Double> value) {
        this.exhPriorityPointsGained = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the exhCompRegistrationsTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExhCompRegistrationsTotal() {
        return exhCompRegistrationsTotal;
    }

    /**
     * Sets the value of the exhCompRegistrationsTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExhCompRegistrationsTotal(JAXBElement<Integer> value) {
        this.exhCompRegistrationsTotal = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the exhEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhEntityKey() {
        return exhEntityKey;
    }

    /**
     * Sets the value of the exhEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhEntityKey(JAXBElement<String> value) {
        this.exhEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhContractSendDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhContractSendDate() {
        return exhContractSendDate;
    }

    /**
     * Sets the value of the exhContractSendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhContractSendDate(JAXBElement<String> value) {
        this.exhContractSendDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhContractStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhContractStatus() {
        return exhContractStatus;
    }

    /**
     * Sets the value of the exhContractStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhContractStatus(JAXBElement<String> value) {
        this.exhContractStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhContractReceiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhContractReceiveDate() {
        return exhContractReceiveDate;
    }

    /**
     * Sets the value of the exhContractReceiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhContractReceiveDate(JAXBElement<String> value) {
        this.exhContractReceiveDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhCancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhCancelDate() {
        return exhCancelDate;
    }

    /**
     * Sets the value of the exhCancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhCancelDate(JAXBElement<String> value) {
        this.exhCancelDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhCancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhCancelReason() {
        return exhCancelReason;
    }

    /**
     * Sets the value of the exhCancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhCancelReason(JAXBElement<String> value) {
        this.exhCancelReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhOrdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExhOrdCode() {
        return exhOrdCode;
    }

    /**
     * Sets the value of the exhOrdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExhOrdCode(JAXBElement<String> value) {
        this.exhOrdCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exhCompBoothPersonnelTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExhCompBoothPersonnelTotal() {
        return exhCompBoothPersonnelTotal;
    }

    /**
     * Sets the value of the exhCompBoothPersonnelTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExhCompBoothPersonnelTotal(JAXBElement<Integer> value) {
        this.exhCompBoothPersonnelTotal = ((JAXBElement<Integer> ) value);
    }

}
