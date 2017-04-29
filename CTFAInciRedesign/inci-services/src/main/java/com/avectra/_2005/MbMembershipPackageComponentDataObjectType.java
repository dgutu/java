
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mb_membership_Package_Component_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mb_membership_Package_Component_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pkg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pkg_prc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pkg_qty" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="pkg_price" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="pkg_show_on_invoice" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="pkg_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="pkg_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="pkg_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="pkg_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="pkg_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="pkg_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pkg_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pkg_pak_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pkg_start_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="pkg_end_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="pkg_custom_calculation_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="pkg_optional" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mb_membership_Package_Component_DataObjectType", propOrder = {
    "pkgKey",
    "pkgPrcKey",
    "pkgQty",
    "pkgPrice",
    "pkgShowOnInvoice",
    "pkgAddUser",
    "pkgAddDate",
    "pkgChangeUser",
    "pkgChangeDate",
    "pkgDeleteFlag",
    "pkgKeyExt",
    "pkgEntityKey",
    "pkgPakPrdKey",
    "pkgStartDate",
    "pkgEndDate",
    "pkgCustomCalculationFlag",
    "pkgOptional"
})
public class MbMembershipPackageComponentDataObjectType {

    @XmlElementRef(name = "pkg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pkgKey;
    @XmlElementRef(name = "pkg_prc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pkgPrcKey;
    @XmlElementRef(name = "pkg_qty", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> pkgQty;
    @XmlElementRef(name = "pkg_price", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> pkgPrice;
    @XmlElementRef(name = "pkg_show_on_invoice", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> pkgShowOnInvoice;
    @XmlElementRef(name = "pkg_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pkgAddUser;
    @XmlElementRef(name = "pkg_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pkgAddDate;
    @XmlElementRef(name = "pkg_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pkgChangeUser;
    @XmlElementRef(name = "pkg_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pkgChangeDate;
    @XmlElementRef(name = "pkg_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> pkgDeleteFlag;
    @XmlElementRef(name = "pkg_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pkgKeyExt;
    @XmlElementRef(name = "pkg_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pkgEntityKey;
    @XmlElementRef(name = "pkg_pak_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pkgPakPrdKey;
    @XmlElementRef(name = "pkg_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pkgStartDate;
    @XmlElementRef(name = "pkg_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pkgEndDate;
    @XmlElementRef(name = "pkg_custom_calculation_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> pkgCustomCalculationFlag;
    @XmlElementRef(name = "pkg_optional", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> pkgOptional;

    /**
     * Gets the value of the pkgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPkgKey() {
        return pkgKey;
    }

    /**
     * Sets the value of the pkgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPkgKey(JAXBElement<String> value) {
        this.pkgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pkgPrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPkgPrcKey() {
        return pkgPrcKey;
    }

    /**
     * Sets the value of the pkgPrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPkgPrcKey(JAXBElement<String> value) {
        this.pkgPrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pkgQty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPkgQty() {
        return pkgQty;
    }

    /**
     * Sets the value of the pkgQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPkgQty(JAXBElement<BigDecimal> value) {
        this.pkgQty = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the pkgPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPkgPrice() {
        return pkgPrice;
    }

    /**
     * Sets the value of the pkgPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPkgPrice(JAXBElement<BigDecimal> value) {
        this.pkgPrice = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the pkgShowOnInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPkgShowOnInvoice() {
        return pkgShowOnInvoice;
    }

    /**
     * Sets the value of the pkgShowOnInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPkgShowOnInvoice(JAXBElement<Short> value) {
        this.pkgShowOnInvoice = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the pkgAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPkgAddUser() {
        return pkgAddUser;
    }

    /**
     * Sets the value of the pkgAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPkgAddUser(JAXBElement<String> value) {
        this.pkgAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pkgAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPkgAddDate() {
        return pkgAddDate;
    }

    /**
     * Sets the value of the pkgAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPkgAddDate(JAXBElement<String> value) {
        this.pkgAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pkgChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPkgChangeUser() {
        return pkgChangeUser;
    }

    /**
     * Sets the value of the pkgChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPkgChangeUser(JAXBElement<String> value) {
        this.pkgChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pkgChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPkgChangeDate() {
        return pkgChangeDate;
    }

    /**
     * Sets the value of the pkgChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPkgChangeDate(JAXBElement<String> value) {
        this.pkgChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pkgDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPkgDeleteFlag() {
        return pkgDeleteFlag;
    }

    /**
     * Sets the value of the pkgDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPkgDeleteFlag(JAXBElement<Short> value) {
        this.pkgDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the pkgKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPkgKeyExt() {
        return pkgKeyExt;
    }

    /**
     * Sets the value of the pkgKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPkgKeyExt(JAXBElement<String> value) {
        this.pkgKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pkgEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPkgEntityKey() {
        return pkgEntityKey;
    }

    /**
     * Sets the value of the pkgEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPkgEntityKey(JAXBElement<String> value) {
        this.pkgEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pkgPakPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPkgPakPrdKey() {
        return pkgPakPrdKey;
    }

    /**
     * Sets the value of the pkgPakPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPkgPakPrdKey(JAXBElement<String> value) {
        this.pkgPakPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pkgStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPkgStartDate() {
        return pkgStartDate;
    }

    /**
     * Sets the value of the pkgStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPkgStartDate(JAXBElement<String> value) {
        this.pkgStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pkgEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPkgEndDate() {
        return pkgEndDate;
    }

    /**
     * Sets the value of the pkgEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPkgEndDate(JAXBElement<String> value) {
        this.pkgEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pkgCustomCalculationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPkgCustomCalculationFlag() {
        return pkgCustomCalculationFlag;
    }

    /**
     * Sets the value of the pkgCustomCalculationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPkgCustomCalculationFlag(JAXBElement<Short> value) {
        this.pkgCustomCalculationFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the pkgOptional property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPkgOptional() {
        return pkgOptional;
    }

    /**
     * Sets the value of the pkgOptional property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPkgOptional(JAXBElement<Short> value) {
        this.pkgOptional = ((JAXBElement<Short> ) value);
    }

}
