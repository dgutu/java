
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mb_membership_Inovice_Terms_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mb_membership_Inovice_Terms_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ait_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ait_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="ait_atc_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="ait_days" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ait_discount_days" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ait_discount_percent" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="ait_discount_percent_cp" type="{http://www.avectra.com/2005/}decimal_Type" minOccurs="0"/>
 *         &lt;element name="ait_finance_charge_days" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ait_finance_charge_percent" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="ait_finance_charge_percent_cp" type="{http://www.avectra.com/2005/}decimal_Type" minOccurs="0"/>
 *         &lt;element name="ait_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ait_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ait_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ait_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ait_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ait_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ait_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ait_prc_discount_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ait_prc_finance_charge_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mb_membership_Inovice_Terms_DataObjectType", propOrder = {
    "aitKey",
    "aitCode",
    "aitAtcCode",
    "aitDays",
    "aitDiscountDays",
    "aitDiscountPercent",
    "aitDiscountPercentCp",
    "aitFinanceChargeDays",
    "aitFinanceChargePercent",
    "aitFinanceChargePercentCp",
    "aitAddUser",
    "aitAddDate",
    "aitChangeDate",
    "aitChangeUser",
    "aitDeleteFlag",
    "aitEntityKey",
    "aitKeyExt",
    "aitPrcDiscountKey",
    "aitPrcFinanceChargeKey"
})
public class MbMembershipInoviceTermsDataObjectType {

    @XmlElementRef(name = "ait_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aitKey;
    @XmlElementRef(name = "ait_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aitCode;
    @XmlElementRef(name = "ait_atc_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aitAtcCode;
    @XmlElementRef(name = "ait_days", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> aitDays;
    @XmlElementRef(name = "ait_discount_days", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> aitDiscountDays;
    @XmlElementRef(name = "ait_discount_percent", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> aitDiscountPercent;
    @XmlElementRef(name = "ait_discount_percent_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> aitDiscountPercentCp;
    @XmlElementRef(name = "ait_finance_charge_days", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> aitFinanceChargeDays;
    @XmlElementRef(name = "ait_finance_charge_percent", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> aitFinanceChargePercent;
    @XmlElementRef(name = "ait_finance_charge_percent_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> aitFinanceChargePercentCp;
    @XmlElementRef(name = "ait_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aitAddUser;
    @XmlElementRef(name = "ait_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aitAddDate;
    @XmlElementRef(name = "ait_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aitChangeDate;
    @XmlElementRef(name = "ait_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aitChangeUser;
    @XmlElementRef(name = "ait_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> aitDeleteFlag;
    @XmlElementRef(name = "ait_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aitEntityKey;
    @XmlElementRef(name = "ait_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aitKeyExt;
    @XmlElementRef(name = "ait_prc_discount_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aitPrcDiscountKey;
    @XmlElementRef(name = "ait_prc_finance_charge_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aitPrcFinanceChargeKey;

    /**
     * Gets the value of the aitKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAitKey() {
        return aitKey;
    }

    /**
     * Sets the value of the aitKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAitKey(JAXBElement<String> value) {
        this.aitKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aitCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAitCode() {
        return aitCode;
    }

    /**
     * Sets the value of the aitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAitCode(JAXBElement<String> value) {
        this.aitCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aitAtcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAitAtcCode() {
        return aitAtcCode;
    }

    /**
     * Sets the value of the aitAtcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAitAtcCode(JAXBElement<String> value) {
        this.aitAtcCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aitDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAitDays() {
        return aitDays;
    }

    /**
     * Sets the value of the aitDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAitDays(JAXBElement<Integer> value) {
        this.aitDays = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the aitDiscountDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAitDiscountDays() {
        return aitDiscountDays;
    }

    /**
     * Sets the value of the aitDiscountDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAitDiscountDays(JAXBElement<Integer> value) {
        this.aitDiscountDays = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the aitDiscountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAitDiscountPercent() {
        return aitDiscountPercent;
    }

    /**
     * Sets the value of the aitDiscountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAitDiscountPercent(JAXBElement<BigDecimal> value) {
        this.aitDiscountPercent = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the aitDiscountPercentCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAitDiscountPercentCp() {
        return aitDiscountPercentCp;
    }

    /**
     * Sets the value of the aitDiscountPercentCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAitDiscountPercentCp(JAXBElement<BigDecimal> value) {
        this.aitDiscountPercentCp = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the aitFinanceChargeDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAitFinanceChargeDays() {
        return aitFinanceChargeDays;
    }

    /**
     * Sets the value of the aitFinanceChargeDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAitFinanceChargeDays(JAXBElement<Integer> value) {
        this.aitFinanceChargeDays = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the aitFinanceChargePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAitFinanceChargePercent() {
        return aitFinanceChargePercent;
    }

    /**
     * Sets the value of the aitFinanceChargePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAitFinanceChargePercent(JAXBElement<BigDecimal> value) {
        this.aitFinanceChargePercent = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the aitFinanceChargePercentCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAitFinanceChargePercentCp() {
        return aitFinanceChargePercentCp;
    }

    /**
     * Sets the value of the aitFinanceChargePercentCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAitFinanceChargePercentCp(JAXBElement<BigDecimal> value) {
        this.aitFinanceChargePercentCp = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the aitAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAitAddUser() {
        return aitAddUser;
    }

    /**
     * Sets the value of the aitAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAitAddUser(JAXBElement<String> value) {
        this.aitAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aitAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAitAddDate() {
        return aitAddDate;
    }

    /**
     * Sets the value of the aitAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAitAddDate(JAXBElement<String> value) {
        this.aitAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aitChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAitChangeDate() {
        return aitChangeDate;
    }

    /**
     * Sets the value of the aitChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAitChangeDate(JAXBElement<String> value) {
        this.aitChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aitChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAitChangeUser() {
        return aitChangeUser;
    }

    /**
     * Sets the value of the aitChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAitChangeUser(JAXBElement<String> value) {
        this.aitChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aitDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getAitDeleteFlag() {
        return aitDeleteFlag;
    }

    /**
     * Sets the value of the aitDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setAitDeleteFlag(JAXBElement<Short> value) {
        this.aitDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the aitEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAitEntityKey() {
        return aitEntityKey;
    }

    /**
     * Sets the value of the aitEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAitEntityKey(JAXBElement<String> value) {
        this.aitEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aitKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAitKeyExt() {
        return aitKeyExt;
    }

    /**
     * Sets the value of the aitKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAitKeyExt(JAXBElement<String> value) {
        this.aitKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aitPrcDiscountKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAitPrcDiscountKey() {
        return aitPrcDiscountKey;
    }

    /**
     * Sets the value of the aitPrcDiscountKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAitPrcDiscountKey(JAXBElement<String> value) {
        this.aitPrcDiscountKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aitPrcFinanceChargeKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAitPrcFinanceChargeKey() {
        return aitPrcFinanceChargeKey;
    }

    /**
     * Sets the value of the aitPrcFinanceChargeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAitPrcFinanceChargeKey(JAXBElement<String> value) {
        this.aitPrcFinanceChargeKey = ((JAXBElement<String> ) value);
    }

}
