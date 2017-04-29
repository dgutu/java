
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceDetail_Product_Type_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceDetail_Product_Type_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ptp_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ptp_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ptp_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ptp_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ptp_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ptp_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ptp_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ptp_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ptp_sell_online" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ptp_online_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ptp_thumbnail" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ptp_discount_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ptp_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ptp_order" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ptp_exclude_from_bundle_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ptp_disallow_fractions" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceDetail_Product_Type_DataObjectType", propOrder = {
    "ptpKey",
    "ptpCode",
    "ptpAddUser",
    "ptpAddDate",
    "ptpChangeUser",
    "ptpChangeDate",
    "ptpDeleteFlag",
    "ptpKeyExt",
    "ptpSellOnline",
    "ptpOnlineCode",
    "ptpThumbnail",
    "ptpDiscountFlag",
    "ptpEntityKey",
    "ptpOrder",
    "ptpExcludeFromBundleFlag",
    "ptpDisallowFractions"
})
public class InvoiceDetailProductTypeDataObjectType {

    @XmlElementRef(name = "ptp_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ptpKey;
    @XmlElementRef(name = "ptp_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ptpCode;
    @XmlElementRef(name = "ptp_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ptpAddUser;
    @XmlElementRef(name = "ptp_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ptpAddDate;
    @XmlElementRef(name = "ptp_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ptpChangeUser;
    @XmlElementRef(name = "ptp_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ptpChangeDate;
    @XmlElementRef(name = "ptp_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ptpDeleteFlag;
    @XmlElementRef(name = "ptp_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ptpKeyExt;
    @XmlElementRef(name = "ptp_sell_online", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ptpSellOnline;
    @XmlElementRef(name = "ptp_online_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ptpOnlineCode;
    @XmlElementRef(name = "ptp_thumbnail", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ptpThumbnail;
    @XmlElementRef(name = "ptp_discount_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ptpDiscountFlag;
    @XmlElementRef(name = "ptp_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ptpEntityKey;
    @XmlElementRef(name = "ptp_order", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> ptpOrder;
    @XmlElementRef(name = "ptp_exclude_from_bundle_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ptpExcludeFromBundleFlag;
    @XmlElementRef(name = "ptp_disallow_fractions", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ptpDisallowFractions;

    /**
     * Gets the value of the ptpKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPtpKey() {
        return ptpKey;
    }

    /**
     * Sets the value of the ptpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPtpKey(JAXBElement<String> value) {
        this.ptpKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ptpCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPtpCode() {
        return ptpCode;
    }

    /**
     * Sets the value of the ptpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPtpCode(JAXBElement<String> value) {
        this.ptpCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ptpAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPtpAddUser() {
        return ptpAddUser;
    }

    /**
     * Sets the value of the ptpAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPtpAddUser(JAXBElement<String> value) {
        this.ptpAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ptpAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPtpAddDate() {
        return ptpAddDate;
    }

    /**
     * Sets the value of the ptpAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPtpAddDate(JAXBElement<String> value) {
        this.ptpAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ptpChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPtpChangeUser() {
        return ptpChangeUser;
    }

    /**
     * Sets the value of the ptpChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPtpChangeUser(JAXBElement<String> value) {
        this.ptpChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ptpChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPtpChangeDate() {
        return ptpChangeDate;
    }

    /**
     * Sets the value of the ptpChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPtpChangeDate(JAXBElement<String> value) {
        this.ptpChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ptpDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPtpDeleteFlag() {
        return ptpDeleteFlag;
    }

    /**
     * Sets the value of the ptpDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPtpDeleteFlag(JAXBElement<Short> value) {
        this.ptpDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ptpKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPtpKeyExt() {
        return ptpKeyExt;
    }

    /**
     * Sets the value of the ptpKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPtpKeyExt(JAXBElement<String> value) {
        this.ptpKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ptpSellOnline property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPtpSellOnline() {
        return ptpSellOnline;
    }

    /**
     * Sets the value of the ptpSellOnline property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPtpSellOnline(JAXBElement<Short> value) {
        this.ptpSellOnline = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ptpOnlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPtpOnlineCode() {
        return ptpOnlineCode;
    }

    /**
     * Sets the value of the ptpOnlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPtpOnlineCode(JAXBElement<String> value) {
        this.ptpOnlineCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ptpThumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPtpThumbnail() {
        return ptpThumbnail;
    }

    /**
     * Sets the value of the ptpThumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPtpThumbnail(JAXBElement<String> value) {
        this.ptpThumbnail = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ptpDiscountFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPtpDiscountFlag() {
        return ptpDiscountFlag;
    }

    /**
     * Sets the value of the ptpDiscountFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPtpDiscountFlag(JAXBElement<Short> value) {
        this.ptpDiscountFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ptpEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPtpEntityKey() {
        return ptpEntityKey;
    }

    /**
     * Sets the value of the ptpEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPtpEntityKey(JAXBElement<String> value) {
        this.ptpEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ptpOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPtpOrder() {
        return ptpOrder;
    }

    /**
     * Sets the value of the ptpOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPtpOrder(JAXBElement<Integer> value) {
        this.ptpOrder = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the ptpExcludeFromBundleFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPtpExcludeFromBundleFlag() {
        return ptpExcludeFromBundleFlag;
    }

    /**
     * Sets the value of the ptpExcludeFromBundleFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPtpExcludeFromBundleFlag(JAXBElement<Short> value) {
        this.ptpExcludeFromBundleFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ptpDisallowFractions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPtpDisallowFractions() {
        return ptpDisallowFractions;
    }

    /**
     * Sets the value of the ptpDisallowFractions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPtpDisallowFractions(JAXBElement<Short> value) {
        this.ptpDisallowFractions = ((JAXBElement<Short> ) value);
    }

}
