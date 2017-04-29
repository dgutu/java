
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceDetail_Bundle_Component_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceDetail_Bundle_Component_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bup_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bup_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="bup_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="bup_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="bup_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="bup_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="bup_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bup_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bup_bun_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bup_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bup_qty" type="{http://www.avectra.com/2005/}av_decimal2_Type" minOccurs="0"/>
 *         &lt;element name="bup_discount_amount" type="{http://www.avectra.com/2005/}av_decimal2_Type" minOccurs="0"/>
 *         &lt;element name="bup_discount_percent" type="{http://www.avectra.com/2005/}av_decimal2_Type" minOccurs="0"/>
 *         &lt;element name="bup_discount_percent_cp" type="{http://www.avectra.com/2005/}decimal_Type" minOccurs="0"/>
 *         &lt;element name="bup_flat_rate" type="{http://www.avectra.com/2005/}av_decimal2_Type" minOccurs="0"/>
 *         &lt;element name="bup_calculation" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="bup_start_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="bup_end_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="bup_discount_calculation_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bup_optional_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bup_renewable_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bup_bup_renewal_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceDetail_Bundle_Component_DataObjectType", propOrder = {
    "bupKey",
    "bupAddUser",
    "bupAddDate",
    "bupChangeUser",
    "bupChangeDate",
    "bupDeleteFlag",
    "bupEntityKey",
    "bupKeyExt",
    "bupBunPrdKey",
    "bupPrdKey",
    "bupQty",
    "bupDiscountAmount",
    "bupDiscountPercent",
    "bupDiscountPercentCp",
    "bupFlatRate",
    "bupCalculation",
    "bupStartDate",
    "bupEndDate",
    "bupDiscountCalculationFlag",
    "bupOptionalFlag",
    "bupRenewableFlag",
    "bupBupRenewalKey"
})
public class InvoiceDetailBundleComponentDataObjectType {

    @XmlElementRef(name = "bup_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bupKey;
    @XmlElementRef(name = "bup_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bupAddUser;
    @XmlElementRef(name = "bup_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bupAddDate;
    @XmlElementRef(name = "bup_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bupChangeUser;
    @XmlElementRef(name = "bup_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bupChangeDate;
    @XmlElementRef(name = "bup_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bupDeleteFlag;
    @XmlElementRef(name = "bup_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bupEntityKey;
    @XmlElementRef(name = "bup_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bupKeyExt;
    @XmlElementRef(name = "bup_bun_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bupBunPrdKey;
    @XmlElementRef(name = "bup_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bupPrdKey;
    @XmlElementRef(name = "bup_qty", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> bupQty;
    @XmlElementRef(name = "bup_discount_amount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> bupDiscountAmount;
    @XmlElementRef(name = "bup_discount_percent", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> bupDiscountPercent;
    @XmlElementRef(name = "bup_discount_percent_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> bupDiscountPercentCp;
    @XmlElementRef(name = "bup_flat_rate", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> bupFlatRate;
    @XmlElementRef(name = "bup_calculation", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bupCalculation;
    @XmlElementRef(name = "bup_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bupStartDate;
    @XmlElementRef(name = "bup_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bupEndDate;
    @XmlElementRef(name = "bup_discount_calculation_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bupDiscountCalculationFlag;
    @XmlElementRef(name = "bup_optional_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bupOptionalFlag;
    @XmlElementRef(name = "bup_renewable_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bupRenewableFlag;
    @XmlElementRef(name = "bup_bup_renewal_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bupBupRenewalKey;

    /**
     * Gets the value of the bupKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBupKey() {
        return bupKey;
    }

    /**
     * Sets the value of the bupKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBupKey(JAXBElement<String> value) {
        this.bupKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bupAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBupAddUser() {
        return bupAddUser;
    }

    /**
     * Sets the value of the bupAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBupAddUser(JAXBElement<String> value) {
        this.bupAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bupAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBupAddDate() {
        return bupAddDate;
    }

    /**
     * Sets the value of the bupAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBupAddDate(JAXBElement<String> value) {
        this.bupAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bupChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBupChangeUser() {
        return bupChangeUser;
    }

    /**
     * Sets the value of the bupChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBupChangeUser(JAXBElement<String> value) {
        this.bupChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bupChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBupChangeDate() {
        return bupChangeDate;
    }

    /**
     * Sets the value of the bupChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBupChangeDate(JAXBElement<String> value) {
        this.bupChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bupDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBupDeleteFlag() {
        return bupDeleteFlag;
    }

    /**
     * Sets the value of the bupDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBupDeleteFlag(JAXBElement<Short> value) {
        this.bupDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bupEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBupEntityKey() {
        return bupEntityKey;
    }

    /**
     * Sets the value of the bupEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBupEntityKey(JAXBElement<String> value) {
        this.bupEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bupKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBupKeyExt() {
        return bupKeyExt;
    }

    /**
     * Sets the value of the bupKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBupKeyExt(JAXBElement<String> value) {
        this.bupKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bupBunPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBupBunPrdKey() {
        return bupBunPrdKey;
    }

    /**
     * Sets the value of the bupBunPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBupBunPrdKey(JAXBElement<String> value) {
        this.bupBunPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bupPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBupPrdKey() {
        return bupPrdKey;
    }

    /**
     * Sets the value of the bupPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBupPrdKey(JAXBElement<String> value) {
        this.bupPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bupQty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBupQty() {
        return bupQty;
    }

    /**
     * Sets the value of the bupQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBupQty(JAXBElement<BigDecimal> value) {
        this.bupQty = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the bupDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBupDiscountAmount() {
        return bupDiscountAmount;
    }

    /**
     * Sets the value of the bupDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBupDiscountAmount(JAXBElement<BigDecimal> value) {
        this.bupDiscountAmount = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the bupDiscountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBupDiscountPercent() {
        return bupDiscountPercent;
    }

    /**
     * Sets the value of the bupDiscountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBupDiscountPercent(JAXBElement<BigDecimal> value) {
        this.bupDiscountPercent = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the bupDiscountPercentCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBupDiscountPercentCp() {
        return bupDiscountPercentCp;
    }

    /**
     * Sets the value of the bupDiscountPercentCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBupDiscountPercentCp(JAXBElement<BigDecimal> value) {
        this.bupDiscountPercentCp = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the bupFlatRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBupFlatRate() {
        return bupFlatRate;
    }

    /**
     * Sets the value of the bupFlatRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBupFlatRate(JAXBElement<BigDecimal> value) {
        this.bupFlatRate = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the bupCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBupCalculation() {
        return bupCalculation;
    }

    /**
     * Sets the value of the bupCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBupCalculation(JAXBElement<String> value) {
        this.bupCalculation = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bupStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBupStartDate() {
        return bupStartDate;
    }

    /**
     * Sets the value of the bupStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBupStartDate(JAXBElement<String> value) {
        this.bupStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bupEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBupEndDate() {
        return bupEndDate;
    }

    /**
     * Sets the value of the bupEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBupEndDate(JAXBElement<String> value) {
        this.bupEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bupDiscountCalculationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBupDiscountCalculationFlag() {
        return bupDiscountCalculationFlag;
    }

    /**
     * Sets the value of the bupDiscountCalculationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBupDiscountCalculationFlag(JAXBElement<Short> value) {
        this.bupDiscountCalculationFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bupOptionalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBupOptionalFlag() {
        return bupOptionalFlag;
    }

    /**
     * Sets the value of the bupOptionalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBupOptionalFlag(JAXBElement<Short> value) {
        this.bupOptionalFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bupRenewableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBupRenewableFlag() {
        return bupRenewableFlag;
    }

    /**
     * Sets the value of the bupRenewableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBupRenewableFlag(JAXBElement<Short> value) {
        this.bupRenewableFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bupBupRenewalKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBupBupRenewalKey() {
        return bupBupRenewalKey;
    }

    /**
     * Sets the value of the bupBupRenewalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBupBupRenewalKey(JAXBElement<String> value) {
        this.bupBupRenewalKey = ((JAXBElement<String> ) value);
    }

}
