
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Payment_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Payment_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pay_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pay_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="pay_trx_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="pay_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pay_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="pay_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="pay_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="pay_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="pay_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="pay_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pay_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pay_med_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pay_post_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="pay_bat_close_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="pay_bat_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pay_notes" type="{http://www.avectra.com/2005/}stringLength300_Type" minOccurs="0"/>
 *         &lt;element name="pay_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pay_cur_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pay_pin_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pay_send_email_confirmation" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Payment_DataObjectType", propOrder = {
    "payKey",
    "payCode",
    "payTrxDate",
    "payCstKey",
    "payAddUser",
    "payAddDate",
    "payChangeUser",
    "payChangeDate",
    "payDeleteFlag",
    "paySrcKey",
    "payKeyExt",
    "payMedKey",
    "payPostFlag",
    "payBatCloseFlag",
    "payBatKey",
    "payNotes",
    "payEntityKey",
    "payCurKey",
    "payPinKey",
    "paySendEmailConfirmation"
})
public class FundraisingGiftPaymentDataObjectType {

    @XmlElementRef(name = "pay_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> payKey;
    @XmlElementRef(name = "pay_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> payCode;
    @XmlElementRef(name = "pay_trx_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> payTrxDate;
    @XmlElementRef(name = "pay_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> payCstKey;
    @XmlElementRef(name = "pay_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> payAddUser;
    @XmlElementRef(name = "pay_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> payAddDate;
    @XmlElementRef(name = "pay_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> payChangeUser;
    @XmlElementRef(name = "pay_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> payChangeDate;
    @XmlElementRef(name = "pay_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> payDeleteFlag;
    @XmlElementRef(name = "pay_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> paySrcKey;
    @XmlElementRef(name = "pay_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> payKeyExt;
    @XmlElementRef(name = "pay_med_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> payMedKey;
    @XmlElementRef(name = "pay_post_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> payPostFlag;
    @XmlElementRef(name = "pay_bat_close_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> payBatCloseFlag;
    @XmlElementRef(name = "pay_bat_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> payBatKey;
    @XmlElementRef(name = "pay_notes", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> payNotes;
    @XmlElementRef(name = "pay_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> payEntityKey;
    @XmlElementRef(name = "pay_cur_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> payCurKey;
    @XmlElementRef(name = "pay_pin_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> payPinKey;
    @XmlElementRef(name = "pay_send_email_confirmation", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> paySendEmailConfirmation;

    /**
     * Gets the value of the payKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayKey() {
        return payKey;
    }

    /**
     * Sets the value of the payKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayKey(JAXBElement<String> value) {
        this.payKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the payCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayCode() {
        return payCode;
    }

    /**
     * Sets the value of the payCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayCode(JAXBElement<String> value) {
        this.payCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the payTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayTrxDate() {
        return payTrxDate;
    }

    /**
     * Sets the value of the payTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayTrxDate(JAXBElement<String> value) {
        this.payTrxDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the payCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayCstKey() {
        return payCstKey;
    }

    /**
     * Sets the value of the payCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayCstKey(JAXBElement<String> value) {
        this.payCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the payAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayAddUser() {
        return payAddUser;
    }

    /**
     * Sets the value of the payAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayAddUser(JAXBElement<String> value) {
        this.payAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the payAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayAddDate() {
        return payAddDate;
    }

    /**
     * Sets the value of the payAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayAddDate(JAXBElement<String> value) {
        this.payAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the payChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayChangeUser() {
        return payChangeUser;
    }

    /**
     * Sets the value of the payChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayChangeUser(JAXBElement<String> value) {
        this.payChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the payChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayChangeDate() {
        return payChangeDate;
    }

    /**
     * Sets the value of the payChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayChangeDate(JAXBElement<String> value) {
        this.payChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the payDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPayDeleteFlag() {
        return payDeleteFlag;
    }

    /**
     * Sets the value of the payDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPayDeleteFlag(JAXBElement<Short> value) {
        this.payDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the paySrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaySrcKey() {
        return paySrcKey;
    }

    /**
     * Sets the value of the paySrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaySrcKey(JAXBElement<String> value) {
        this.paySrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the payKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayKeyExt() {
        return payKeyExt;
    }

    /**
     * Sets the value of the payKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayKeyExt(JAXBElement<String> value) {
        this.payKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the payMedKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayMedKey() {
        return payMedKey;
    }

    /**
     * Sets the value of the payMedKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayMedKey(JAXBElement<String> value) {
        this.payMedKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the payPostFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPayPostFlag() {
        return payPostFlag;
    }

    /**
     * Sets the value of the payPostFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPayPostFlag(JAXBElement<Short> value) {
        this.payPostFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the payBatCloseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPayBatCloseFlag() {
        return payBatCloseFlag;
    }

    /**
     * Sets the value of the payBatCloseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPayBatCloseFlag(JAXBElement<Short> value) {
        this.payBatCloseFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the payBatKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayBatKey() {
        return payBatKey;
    }

    /**
     * Sets the value of the payBatKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayBatKey(JAXBElement<String> value) {
        this.payBatKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the payNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayNotes() {
        return payNotes;
    }

    /**
     * Sets the value of the payNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayNotes(JAXBElement<String> value) {
        this.payNotes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the payEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayEntityKey() {
        return payEntityKey;
    }

    /**
     * Sets the value of the payEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayEntityKey(JAXBElement<String> value) {
        this.payEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the payCurKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayCurKey() {
        return payCurKey;
    }

    /**
     * Sets the value of the payCurKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayCurKey(JAXBElement<String> value) {
        this.payCurKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the payPinKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayPinKey() {
        return payPinKey;
    }

    /**
     * Sets the value of the payPinKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayPinKey(JAXBElement<String> value) {
        this.payPinKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the paySendEmailConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPaySendEmailConfirmation() {
        return paySendEmailConfirmation;
    }

    /**
     * Sets the value of the paySendEmailConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPaySendEmailConfirmation(JAXBElement<Short> value) {
        this.paySendEmailConfirmation = ((JAXBElement<Short> ) value);
    }

}
