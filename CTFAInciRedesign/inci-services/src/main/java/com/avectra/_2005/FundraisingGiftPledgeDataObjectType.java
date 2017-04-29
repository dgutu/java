
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Pledge_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Pledge_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="plg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="plg_dnr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="plg_fun_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="plg_cmp_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="plg_apl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="plg_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="plg_start_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="plg_end_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="plg_notes" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="plg_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="plg_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="plg_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="plg_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="plg_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="plg_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="plg_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="plg_cct_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="plg_fpc_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="plg_frt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="plg_odd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="plg_recognition_customer_adr_line1" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="plg_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="plg_ord_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="plg_recognition_customer_adr_line2" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="plg_anonymous_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="plg_ord_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="plg_recognition_customer_adr_line3" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="plg_pck_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="plg_recognition_customer" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="plg_recognition_customer_adr_city" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="plg_recognition_customer_adr_state" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="plg_recognition_customer_adr_post_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="plg_recognition_customer_adr_country" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="plg_stock_name" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="plg_number_of_shares" type="{http://www.avectra.com/2005/}av_float_Type" minOccurs="0"/>
 *         &lt;element name="plg_share_price" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="plg_auto_renew_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="plg_renewed_to_plg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="plg_solicitor_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="plg_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="plg_tbt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="plg_personal_message" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Pledge_DataObjectType", propOrder = {
    "plgKey",
    "plgDnrKey",
    "plgFunKey",
    "plgCmpKey",
    "plgAplKey",
    "plgDate",
    "plgStartDate",
    "plgEndDate",
    "plgNotes",
    "plgAddUser",
    "plgAddDate",
    "plgChangeUser",
    "plgChangeDate",
    "plgDeleteFlag",
    "plgEntityKey",
    "plgKeyExt",
    "plgCctKey",
    "plgFpcPrdKey",
    "plgFrtKey",
    "plgOddKey",
    "plgRecognitionCustomerAdrLine1",
    "plgCstKey",
    "plgOrdKey",
    "plgRecognitionCustomerAdrLine2",
    "plgAnonymousFlag",
    "plgOrdCode",
    "plgRecognitionCustomerAdrLine3",
    "plgPckKey",
    "plgRecognitionCustomer",
    "plgRecognitionCustomerAdrCity",
    "plgRecognitionCustomerAdrState",
    "plgRecognitionCustomerAdrPostCode",
    "plgRecognitionCustomerAdrCountry",
    "plgStockName",
    "plgNumberOfShares",
    "plgSharePrice",
    "plgAutoRenewFlag",
    "plgRenewedToPlgKey",
    "plgSolicitorCstKey",
    "plgSrcKey",
    "plgTbtKey",
    "plgPersonalMessage"
})
public class FundraisingGiftPledgeDataObjectType {

    @XmlElementRef(name = "plg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgKey;
    @XmlElementRef(name = "plg_dnr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgDnrKey;
    @XmlElementRef(name = "plg_fun_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgFunKey;
    @XmlElementRef(name = "plg_cmp_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgCmpKey;
    @XmlElementRef(name = "plg_apl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgAplKey;
    @XmlElementRef(name = "plg_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgDate;
    @XmlElementRef(name = "plg_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgStartDate;
    @XmlElementRef(name = "plg_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgEndDate;
    @XmlElementRef(name = "plg_notes", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgNotes;
    @XmlElementRef(name = "plg_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgAddUser;
    @XmlElementRef(name = "plg_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgAddDate;
    @XmlElementRef(name = "plg_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgChangeUser;
    @XmlElementRef(name = "plg_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgChangeDate;
    @XmlElementRef(name = "plg_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> plgDeleteFlag;
    @XmlElementRef(name = "plg_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgEntityKey;
    @XmlElementRef(name = "plg_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgKeyExt;
    @XmlElementRef(name = "plg_cct_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgCctKey;
    @XmlElementRef(name = "plg_fpc_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgFpcPrdKey;
    @XmlElementRef(name = "plg_frt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgFrtKey;
    @XmlElementRef(name = "plg_odd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgOddKey;
    @XmlElementRef(name = "plg_recognition_customer_adr_line1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgRecognitionCustomerAdrLine1;
    @XmlElementRef(name = "plg_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgCstKey;
    @XmlElementRef(name = "plg_ord_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgOrdKey;
    @XmlElementRef(name = "plg_recognition_customer_adr_line2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgRecognitionCustomerAdrLine2;
    @XmlElementRef(name = "plg_anonymous_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> plgAnonymousFlag;
    @XmlElementRef(name = "plg_ord_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgOrdCode;
    @XmlElementRef(name = "plg_recognition_customer_adr_line3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgRecognitionCustomerAdrLine3;
    @XmlElementRef(name = "plg_pck_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgPckKey;
    @XmlElementRef(name = "plg_recognition_customer", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgRecognitionCustomer;
    @XmlElementRef(name = "plg_recognition_customer_adr_city", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgRecognitionCustomerAdrCity;
    @XmlElementRef(name = "plg_recognition_customer_adr_state", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgRecognitionCustomerAdrState;
    @XmlElementRef(name = "plg_recognition_customer_adr_post_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgRecognitionCustomerAdrPostCode;
    @XmlElementRef(name = "plg_recognition_customer_adr_country", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgRecognitionCustomerAdrCountry;
    @XmlElementRef(name = "plg_stock_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgStockName;
    @XmlElementRef(name = "plg_number_of_shares", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Double> plgNumberOfShares;
    @XmlElementRef(name = "plg_share_price", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> plgSharePrice;
    @XmlElementRef(name = "plg_auto_renew_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> plgAutoRenewFlag;
    @XmlElementRef(name = "plg_renewed_to_plg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgRenewedToPlgKey;
    @XmlElementRef(name = "plg_solicitor_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgSolicitorCstKey;
    @XmlElementRef(name = "plg_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgSrcKey;
    @XmlElementRef(name = "plg_tbt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgTbtKey;
    @XmlElementRef(name = "plg_personal_message", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> plgPersonalMessage;

    /**
     * Gets the value of the plgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgKey() {
        return plgKey;
    }

    /**
     * Sets the value of the plgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgKey(JAXBElement<String> value) {
        this.plgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgDnrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgDnrKey() {
        return plgDnrKey;
    }

    /**
     * Sets the value of the plgDnrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgDnrKey(JAXBElement<String> value) {
        this.plgDnrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgFunKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgFunKey() {
        return plgFunKey;
    }

    /**
     * Sets the value of the plgFunKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgFunKey(JAXBElement<String> value) {
        this.plgFunKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgCmpKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgCmpKey() {
        return plgCmpKey;
    }

    /**
     * Sets the value of the plgCmpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgCmpKey(JAXBElement<String> value) {
        this.plgCmpKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgAplKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgAplKey() {
        return plgAplKey;
    }

    /**
     * Sets the value of the plgAplKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgAplKey(JAXBElement<String> value) {
        this.plgAplKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgDate() {
        return plgDate;
    }

    /**
     * Sets the value of the plgDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgDate(JAXBElement<String> value) {
        this.plgDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgStartDate() {
        return plgStartDate;
    }

    /**
     * Sets the value of the plgStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgStartDate(JAXBElement<String> value) {
        this.plgStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgEndDate() {
        return plgEndDate;
    }

    /**
     * Sets the value of the plgEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgEndDate(JAXBElement<String> value) {
        this.plgEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgNotes() {
        return plgNotes;
    }

    /**
     * Sets the value of the plgNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgNotes(JAXBElement<String> value) {
        this.plgNotes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgAddUser() {
        return plgAddUser;
    }

    /**
     * Sets the value of the plgAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgAddUser(JAXBElement<String> value) {
        this.plgAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgAddDate() {
        return plgAddDate;
    }

    /**
     * Sets the value of the plgAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgAddDate(JAXBElement<String> value) {
        this.plgAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgChangeUser() {
        return plgChangeUser;
    }

    /**
     * Sets the value of the plgChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgChangeUser(JAXBElement<String> value) {
        this.plgChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgChangeDate() {
        return plgChangeDate;
    }

    /**
     * Sets the value of the plgChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgChangeDate(JAXBElement<String> value) {
        this.plgChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPlgDeleteFlag() {
        return plgDeleteFlag;
    }

    /**
     * Sets the value of the plgDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPlgDeleteFlag(JAXBElement<Short> value) {
        this.plgDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the plgEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgEntityKey() {
        return plgEntityKey;
    }

    /**
     * Sets the value of the plgEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgEntityKey(JAXBElement<String> value) {
        this.plgEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgKeyExt() {
        return plgKeyExt;
    }

    /**
     * Sets the value of the plgKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgKeyExt(JAXBElement<String> value) {
        this.plgKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgCctKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgCctKey() {
        return plgCctKey;
    }

    /**
     * Sets the value of the plgCctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgCctKey(JAXBElement<String> value) {
        this.plgCctKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgFpcPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgFpcPrdKey() {
        return plgFpcPrdKey;
    }

    /**
     * Sets the value of the plgFpcPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgFpcPrdKey(JAXBElement<String> value) {
        this.plgFpcPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgFrtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgFrtKey() {
        return plgFrtKey;
    }

    /**
     * Sets the value of the plgFrtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgFrtKey(JAXBElement<String> value) {
        this.plgFrtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgOddKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgOddKey() {
        return plgOddKey;
    }

    /**
     * Sets the value of the plgOddKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgOddKey(JAXBElement<String> value) {
        this.plgOddKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgRecognitionCustomerAdrLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgRecognitionCustomerAdrLine1() {
        return plgRecognitionCustomerAdrLine1;
    }

    /**
     * Sets the value of the plgRecognitionCustomerAdrLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgRecognitionCustomerAdrLine1(JAXBElement<String> value) {
        this.plgRecognitionCustomerAdrLine1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgCstKey() {
        return plgCstKey;
    }

    /**
     * Sets the value of the plgCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgCstKey(JAXBElement<String> value) {
        this.plgCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgOrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgOrdKey() {
        return plgOrdKey;
    }

    /**
     * Sets the value of the plgOrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgOrdKey(JAXBElement<String> value) {
        this.plgOrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgRecognitionCustomerAdrLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgRecognitionCustomerAdrLine2() {
        return plgRecognitionCustomerAdrLine2;
    }

    /**
     * Sets the value of the plgRecognitionCustomerAdrLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgRecognitionCustomerAdrLine2(JAXBElement<String> value) {
        this.plgRecognitionCustomerAdrLine2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgAnonymousFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPlgAnonymousFlag() {
        return plgAnonymousFlag;
    }

    /**
     * Sets the value of the plgAnonymousFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPlgAnonymousFlag(JAXBElement<Short> value) {
        this.plgAnonymousFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the plgOrdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgOrdCode() {
        return plgOrdCode;
    }

    /**
     * Sets the value of the plgOrdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgOrdCode(JAXBElement<String> value) {
        this.plgOrdCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgRecognitionCustomerAdrLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgRecognitionCustomerAdrLine3() {
        return plgRecognitionCustomerAdrLine3;
    }

    /**
     * Sets the value of the plgRecognitionCustomerAdrLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgRecognitionCustomerAdrLine3(JAXBElement<String> value) {
        this.plgRecognitionCustomerAdrLine3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgPckKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgPckKey() {
        return plgPckKey;
    }

    /**
     * Sets the value of the plgPckKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgPckKey(JAXBElement<String> value) {
        this.plgPckKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgRecognitionCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgRecognitionCustomer() {
        return plgRecognitionCustomer;
    }

    /**
     * Sets the value of the plgRecognitionCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgRecognitionCustomer(JAXBElement<String> value) {
        this.plgRecognitionCustomer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgRecognitionCustomerAdrCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgRecognitionCustomerAdrCity() {
        return plgRecognitionCustomerAdrCity;
    }

    /**
     * Sets the value of the plgRecognitionCustomerAdrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgRecognitionCustomerAdrCity(JAXBElement<String> value) {
        this.plgRecognitionCustomerAdrCity = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgRecognitionCustomerAdrState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgRecognitionCustomerAdrState() {
        return plgRecognitionCustomerAdrState;
    }

    /**
     * Sets the value of the plgRecognitionCustomerAdrState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgRecognitionCustomerAdrState(JAXBElement<String> value) {
        this.plgRecognitionCustomerAdrState = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgRecognitionCustomerAdrPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgRecognitionCustomerAdrPostCode() {
        return plgRecognitionCustomerAdrPostCode;
    }

    /**
     * Sets the value of the plgRecognitionCustomerAdrPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgRecognitionCustomerAdrPostCode(JAXBElement<String> value) {
        this.plgRecognitionCustomerAdrPostCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgRecognitionCustomerAdrCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgRecognitionCustomerAdrCountry() {
        return plgRecognitionCustomerAdrCountry;
    }

    /**
     * Sets the value of the plgRecognitionCustomerAdrCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgRecognitionCustomerAdrCountry(JAXBElement<String> value) {
        this.plgRecognitionCustomerAdrCountry = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgStockName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgStockName() {
        return plgStockName;
    }

    /**
     * Sets the value of the plgStockName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgStockName(JAXBElement<String> value) {
        this.plgStockName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgNumberOfShares property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPlgNumberOfShares() {
        return plgNumberOfShares;
    }

    /**
     * Sets the value of the plgNumberOfShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPlgNumberOfShares(JAXBElement<Double> value) {
        this.plgNumberOfShares = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the plgSharePrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPlgSharePrice() {
        return plgSharePrice;
    }

    /**
     * Sets the value of the plgSharePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPlgSharePrice(JAXBElement<BigDecimal> value) {
        this.plgSharePrice = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the plgAutoRenewFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPlgAutoRenewFlag() {
        return plgAutoRenewFlag;
    }

    /**
     * Sets the value of the plgAutoRenewFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPlgAutoRenewFlag(JAXBElement<Short> value) {
        this.plgAutoRenewFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the plgRenewedToPlgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgRenewedToPlgKey() {
        return plgRenewedToPlgKey;
    }

    /**
     * Sets the value of the plgRenewedToPlgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgRenewedToPlgKey(JAXBElement<String> value) {
        this.plgRenewedToPlgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgSolicitorCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgSolicitorCstKey() {
        return plgSolicitorCstKey;
    }

    /**
     * Sets the value of the plgSolicitorCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgSolicitorCstKey(JAXBElement<String> value) {
        this.plgSolicitorCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgSrcKey() {
        return plgSrcKey;
    }

    /**
     * Sets the value of the plgSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgSrcKey(JAXBElement<String> value) {
        this.plgSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgTbtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgTbtKey() {
        return plgTbtKey;
    }

    /**
     * Sets the value of the plgTbtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgTbtKey(JAXBElement<String> value) {
        this.plgTbtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the plgPersonalMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlgPersonalMessage() {
        return plgPersonalMessage;
    }

    /**
     * Sets the value of the plgPersonalMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlgPersonalMessage(JAXBElement<String> value) {
        this.plgPersonalMessage = ((JAXBElement<String> ) value);
    }

}
