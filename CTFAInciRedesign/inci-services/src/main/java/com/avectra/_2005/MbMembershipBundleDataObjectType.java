
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mb_membership_Bundle_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mb_membership_Bundle_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bun_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="bun_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="bun_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="bun_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="bun_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="bun_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bun_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bun_supress_products_on_invoice" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bun_hide_price_on_invoice" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bun_bun_key_renewal" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bun_prd_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mb_membership_Bundle_DataObjectType", propOrder = {
    "bunAddUser",
    "bunAddDate",
    "bunChangeUser",
    "bunChangeDate",
    "bunDeleteFlag",
    "bunEntityKey",
    "bunPrdKey",
    "bunSupressProductsOnInvoice",
    "bunHidePriceOnInvoice",
    "bunBunKeyRenewal",
    "bunPrdKeyExt"
})
public class MbMembershipBundleDataObjectType {

    @XmlElementRef(name = "bun_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bunAddUser;
    @XmlElementRef(name = "bun_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bunAddDate;
    @XmlElementRef(name = "bun_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bunChangeUser;
    @XmlElementRef(name = "bun_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bunChangeDate;
    @XmlElementRef(name = "bun_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bunDeleteFlag;
    @XmlElementRef(name = "bun_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bunEntityKey;
    @XmlElementRef(name = "bun_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bunPrdKey;
    @XmlElementRef(name = "bun_supress_products_on_invoice", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bunSupressProductsOnInvoice;
    @XmlElementRef(name = "bun_hide_price_on_invoice", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bunHidePriceOnInvoice;
    @XmlElementRef(name = "bun_bun_key_renewal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bunBunKeyRenewal;
    @XmlElementRef(name = "bun_prd_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bunPrdKeyExt;

    /**
     * Gets the value of the bunAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBunAddUser() {
        return bunAddUser;
    }

    /**
     * Sets the value of the bunAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBunAddUser(JAXBElement<String> value) {
        this.bunAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bunAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBunAddDate() {
        return bunAddDate;
    }

    /**
     * Sets the value of the bunAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBunAddDate(JAXBElement<String> value) {
        this.bunAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bunChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBunChangeUser() {
        return bunChangeUser;
    }

    /**
     * Sets the value of the bunChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBunChangeUser(JAXBElement<String> value) {
        this.bunChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bunChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBunChangeDate() {
        return bunChangeDate;
    }

    /**
     * Sets the value of the bunChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBunChangeDate(JAXBElement<String> value) {
        this.bunChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bunDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBunDeleteFlag() {
        return bunDeleteFlag;
    }

    /**
     * Sets the value of the bunDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBunDeleteFlag(JAXBElement<Short> value) {
        this.bunDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bunEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBunEntityKey() {
        return bunEntityKey;
    }

    /**
     * Sets the value of the bunEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBunEntityKey(JAXBElement<String> value) {
        this.bunEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bunPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBunPrdKey() {
        return bunPrdKey;
    }

    /**
     * Sets the value of the bunPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBunPrdKey(JAXBElement<String> value) {
        this.bunPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bunSupressProductsOnInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBunSupressProductsOnInvoice() {
        return bunSupressProductsOnInvoice;
    }

    /**
     * Sets the value of the bunSupressProductsOnInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBunSupressProductsOnInvoice(JAXBElement<Short> value) {
        this.bunSupressProductsOnInvoice = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bunHidePriceOnInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBunHidePriceOnInvoice() {
        return bunHidePriceOnInvoice;
    }

    /**
     * Sets the value of the bunHidePriceOnInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBunHidePriceOnInvoice(JAXBElement<Short> value) {
        this.bunHidePriceOnInvoice = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bunBunKeyRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBunBunKeyRenewal() {
        return bunBunKeyRenewal;
    }

    /**
     * Sets the value of the bunBunKeyRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBunBunKeyRenewal(JAXBElement<String> value) {
        this.bunBunKeyRenewal = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bunPrdKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBunPrdKeyExt() {
        return bunPrdKeyExt;
    }

    /**
     * Sets the value of the bunPrdKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBunPrdKeyExt(JAXBElement<String> value) {
        this.bunPrdKeyExt = ((JAXBElement<String> ) value);
    }

}
