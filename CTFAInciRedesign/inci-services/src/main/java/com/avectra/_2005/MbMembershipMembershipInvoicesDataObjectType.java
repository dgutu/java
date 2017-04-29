
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mb_membership_Membership_Invoices_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mb_membership_Membership_Invoices_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mxi_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mxi_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="mxi_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="mxi_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="mxi_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="mxi_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="mxi_mbr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mxi_inv_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mxi_pak_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mxi_renew_year" type="{http://www.avectra.com/2005/}stringLength5_Type" minOccurs="0"/>
 *         &lt;element name="mxi_membership_updated" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="mxi_ivd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mxi_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mxi_ivd_key_previous" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mxi_rejoin_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="mxi_term_start_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="mxi_term_end_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="mxi_previous_term_start_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="mxi_previous_term_end_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="mxi_ord_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mxi_odd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mxi_bun_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mxi_prc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mxi_mxi_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mxi_current_price" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="mxi_current_product_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mb_membership_Membership_Invoices_DataObjectType", propOrder = {
    "mxiKey",
    "mxiAddUser",
    "mxiAddDate",
    "mxiChangeUser",
    "mxiChangeDate",
    "mxiDeleteFlag",
    "mxiMbrKey",
    "mxiInvKey",
    "mxiPakPrdKey",
    "mxiRenewYear",
    "mxiMembershipUpdated",
    "mxiIvdKey",
    "mxiEntityKey",
    "mxiIvdKeyPrevious",
    "mxiRejoinFlag",
    "mxiTermStartDate",
    "mxiTermEndDate",
    "mxiPreviousTermStartDate",
    "mxiPreviousTermEndDate",
    "mxiOrdKey",
    "mxiOddKey",
    "mxiBunPrdKey",
    "mxiPrcKey",
    "mxiMxiKey",
    "mxiCurrentPrice",
    "mxiCurrentProductKey"
})
public class MbMembershipMembershipInvoicesDataObjectType {

    @XmlElementRef(name = "mxi_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mxiKey;
    @XmlElementRef(name = "mxi_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mxiAddUser;
    @XmlElementRef(name = "mxi_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mxiAddDate;
    @XmlElementRef(name = "mxi_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mxiChangeUser;
    @XmlElementRef(name = "mxi_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mxiChangeDate;
    @XmlElementRef(name = "mxi_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mxiDeleteFlag;
    @XmlElementRef(name = "mxi_mbr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mxiMbrKey;
    @XmlElementRef(name = "mxi_inv_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mxiInvKey;
    @XmlElementRef(name = "mxi_pak_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mxiPakPrdKey;
    @XmlElementRef(name = "mxi_renew_year", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mxiRenewYear;
    @XmlElementRef(name = "mxi_membership_updated", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mxiMembershipUpdated;
    @XmlElementRef(name = "mxi_ivd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mxiIvdKey;
    @XmlElementRef(name = "mxi_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mxiEntityKey;
    @XmlElementRef(name = "mxi_ivd_key_previous", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mxiIvdKeyPrevious;
    @XmlElementRef(name = "mxi_rejoin_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mxiRejoinFlag;
    @XmlElementRef(name = "mxi_term_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mxiTermStartDate;
    @XmlElementRef(name = "mxi_term_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mxiTermEndDate;
    @XmlElementRef(name = "mxi_previous_term_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mxiPreviousTermStartDate;
    @XmlElementRef(name = "mxi_previous_term_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mxiPreviousTermEndDate;
    @XmlElementRef(name = "mxi_ord_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mxiOrdKey;
    @XmlElementRef(name = "mxi_odd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mxiOddKey;
    @XmlElementRef(name = "mxi_bun_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mxiBunPrdKey;
    @XmlElementRef(name = "mxi_prc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mxiPrcKey;
    @XmlElementRef(name = "mxi_mxi_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mxiMxiKey;
    @XmlElementRef(name = "mxi_current_price", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> mxiCurrentPrice;
    @XmlElementRef(name = "mxi_current_product_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mxiCurrentProductKey;

    /**
     * Gets the value of the mxiKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMxiKey() {
        return mxiKey;
    }

    /**
     * Sets the value of the mxiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMxiKey(JAXBElement<String> value) {
        this.mxiKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mxiAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMxiAddUser() {
        return mxiAddUser;
    }

    /**
     * Sets the value of the mxiAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMxiAddUser(JAXBElement<String> value) {
        this.mxiAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mxiAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMxiAddDate() {
        return mxiAddDate;
    }

    /**
     * Sets the value of the mxiAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMxiAddDate(JAXBElement<String> value) {
        this.mxiAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mxiChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMxiChangeUser() {
        return mxiChangeUser;
    }

    /**
     * Sets the value of the mxiChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMxiChangeUser(JAXBElement<String> value) {
        this.mxiChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mxiChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMxiChangeDate() {
        return mxiChangeDate;
    }

    /**
     * Sets the value of the mxiChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMxiChangeDate(JAXBElement<String> value) {
        this.mxiChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mxiDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMxiDeleteFlag() {
        return mxiDeleteFlag;
    }

    /**
     * Sets the value of the mxiDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMxiDeleteFlag(JAXBElement<Short> value) {
        this.mxiDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the mxiMbrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMxiMbrKey() {
        return mxiMbrKey;
    }

    /**
     * Sets the value of the mxiMbrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMxiMbrKey(JAXBElement<String> value) {
        this.mxiMbrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mxiInvKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMxiInvKey() {
        return mxiInvKey;
    }

    /**
     * Sets the value of the mxiInvKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMxiInvKey(JAXBElement<String> value) {
        this.mxiInvKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mxiPakPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMxiPakPrdKey() {
        return mxiPakPrdKey;
    }

    /**
     * Sets the value of the mxiPakPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMxiPakPrdKey(JAXBElement<String> value) {
        this.mxiPakPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mxiRenewYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMxiRenewYear() {
        return mxiRenewYear;
    }

    /**
     * Sets the value of the mxiRenewYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMxiRenewYear(JAXBElement<String> value) {
        this.mxiRenewYear = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mxiMembershipUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMxiMembershipUpdated() {
        return mxiMembershipUpdated;
    }

    /**
     * Sets the value of the mxiMembershipUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMxiMembershipUpdated(JAXBElement<Short> value) {
        this.mxiMembershipUpdated = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the mxiIvdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMxiIvdKey() {
        return mxiIvdKey;
    }

    /**
     * Sets the value of the mxiIvdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMxiIvdKey(JAXBElement<String> value) {
        this.mxiIvdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mxiEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMxiEntityKey() {
        return mxiEntityKey;
    }

    /**
     * Sets the value of the mxiEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMxiEntityKey(JAXBElement<String> value) {
        this.mxiEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mxiIvdKeyPrevious property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMxiIvdKeyPrevious() {
        return mxiIvdKeyPrevious;
    }

    /**
     * Sets the value of the mxiIvdKeyPrevious property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMxiIvdKeyPrevious(JAXBElement<String> value) {
        this.mxiIvdKeyPrevious = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mxiRejoinFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMxiRejoinFlag() {
        return mxiRejoinFlag;
    }

    /**
     * Sets the value of the mxiRejoinFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMxiRejoinFlag(JAXBElement<Short> value) {
        this.mxiRejoinFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the mxiTermStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMxiTermStartDate() {
        return mxiTermStartDate;
    }

    /**
     * Sets the value of the mxiTermStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMxiTermStartDate(JAXBElement<String> value) {
        this.mxiTermStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mxiTermEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMxiTermEndDate() {
        return mxiTermEndDate;
    }

    /**
     * Sets the value of the mxiTermEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMxiTermEndDate(JAXBElement<String> value) {
        this.mxiTermEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mxiPreviousTermStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMxiPreviousTermStartDate() {
        return mxiPreviousTermStartDate;
    }

    /**
     * Sets the value of the mxiPreviousTermStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMxiPreviousTermStartDate(JAXBElement<String> value) {
        this.mxiPreviousTermStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mxiPreviousTermEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMxiPreviousTermEndDate() {
        return mxiPreviousTermEndDate;
    }

    /**
     * Sets the value of the mxiPreviousTermEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMxiPreviousTermEndDate(JAXBElement<String> value) {
        this.mxiPreviousTermEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mxiOrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMxiOrdKey() {
        return mxiOrdKey;
    }

    /**
     * Sets the value of the mxiOrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMxiOrdKey(JAXBElement<String> value) {
        this.mxiOrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mxiOddKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMxiOddKey() {
        return mxiOddKey;
    }

    /**
     * Sets the value of the mxiOddKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMxiOddKey(JAXBElement<String> value) {
        this.mxiOddKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mxiBunPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMxiBunPrdKey() {
        return mxiBunPrdKey;
    }

    /**
     * Sets the value of the mxiBunPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMxiBunPrdKey(JAXBElement<String> value) {
        this.mxiBunPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mxiPrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMxiPrcKey() {
        return mxiPrcKey;
    }

    /**
     * Sets the value of the mxiPrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMxiPrcKey(JAXBElement<String> value) {
        this.mxiPrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mxiMxiKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMxiMxiKey() {
        return mxiMxiKey;
    }

    /**
     * Sets the value of the mxiMxiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMxiMxiKey(JAXBElement<String> value) {
        this.mxiMxiKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mxiCurrentPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMxiCurrentPrice() {
        return mxiCurrentPrice;
    }

    /**
     * Sets the value of the mxiCurrentPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMxiCurrentPrice(JAXBElement<BigDecimal> value) {
        this.mxiCurrentPrice = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the mxiCurrentProductKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMxiCurrentProductKey() {
        return mxiCurrentProductKey;
    }

    /**
     * Sets the value of the mxiCurrentProductKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMxiCurrentProductKey(JAXBElement<String> value) {
        this.mxiCurrentProductKey = ((JAXBElement<String> ) value);
    }

}
