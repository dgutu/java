
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CentralizedOrderEntry_Company-Business_Unit_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CentralizedOrderEntry_Company-Business_Unit_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atc_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="atc_name" type="{http://www.avectra.com/2005/}stringLength90_Type" minOccurs="0"/>
 *         &lt;element name="atc_asn_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="atc_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="atc_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="atc_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="atc_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="atc_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="atc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="atc_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="atc_gla_revenue_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="atc_gla_liability_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="atc_gla_return_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="atc_gla_deferred_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="atc_gla_writeoff_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="atc_gla_inventory_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="atc_gla_cogs_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="atc_gla_ar_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="atc_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="atc_gla_overpayment_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="atc_ait_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="atc_currency_code" type="{http://www.avectra.com/2005/}stringLength3_Type" minOccurs="0"/>
 *         &lt;element name="atc_gla_realized_gain_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="atc_gla_realized_loss_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="atc_gla_rounding_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CentralizedOrderEntry_Company-Business_Unit_DataObjectType", propOrder = {
    "atcCode",
    "atcName",
    "atcAsnCode",
    "atcAddUser",
    "atcAddDate",
    "atcChangeUser",
    "atcChangeDate",
    "atcDeleteFlag",
    "atcKey",
    "atcKeyExt",
    "atcGlaRevenueKey",
    "atcGlaLiabilityKey",
    "atcGlaReturnKey",
    "atcGlaDeferredKey",
    "atcGlaWriteoffKey",
    "atcGlaInventoryKey",
    "atcGlaCogsKey",
    "atcGlaArKey",
    "atcEntityKey",
    "atcGlaOverpaymentKey",
    "atcAitKey",
    "atcCurrencyCode",
    "atcGlaRealizedGainKey",
    "atcGlaRealizedLossKey",
    "atcGlaRoundingKey"
})
public class CentralizedOrderEntryCompanyBusinessUnitDataObjectType {

    @XmlElementRef(name = "atc_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> atcCode;
    @XmlElementRef(name = "atc_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> atcName;
    @XmlElementRef(name = "atc_asn_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> atcAsnCode;
    @XmlElementRef(name = "atc_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> atcAddUser;
    @XmlElementRef(name = "atc_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> atcAddDate;
    @XmlElementRef(name = "atc_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> atcChangeUser;
    @XmlElementRef(name = "atc_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> atcChangeDate;
    @XmlElementRef(name = "atc_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> atcDeleteFlag;
    @XmlElementRef(name = "atc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> atcKey;
    @XmlElementRef(name = "atc_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> atcKeyExt;
    @XmlElementRef(name = "atc_gla_revenue_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> atcGlaRevenueKey;
    @XmlElementRef(name = "atc_gla_liability_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> atcGlaLiabilityKey;
    @XmlElementRef(name = "atc_gla_return_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> atcGlaReturnKey;
    @XmlElementRef(name = "atc_gla_deferred_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> atcGlaDeferredKey;
    @XmlElementRef(name = "atc_gla_writeoff_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> atcGlaWriteoffKey;
    @XmlElementRef(name = "atc_gla_inventory_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> atcGlaInventoryKey;
    @XmlElementRef(name = "atc_gla_cogs_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> atcGlaCogsKey;
    @XmlElementRef(name = "atc_gla_ar_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> atcGlaArKey;
    @XmlElementRef(name = "atc_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> atcEntityKey;
    @XmlElementRef(name = "atc_gla_overpayment_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> atcGlaOverpaymentKey;
    @XmlElementRef(name = "atc_ait_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> atcAitKey;
    @XmlElementRef(name = "atc_currency_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> atcCurrencyCode;
    @XmlElementRef(name = "atc_gla_realized_gain_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> atcGlaRealizedGainKey;
    @XmlElementRef(name = "atc_gla_realized_loss_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> atcGlaRealizedLossKey;
    @XmlElementRef(name = "atc_gla_rounding_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> atcGlaRoundingKey;

    /**
     * Gets the value of the atcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtcCode() {
        return atcCode;
    }

    /**
     * Sets the value of the atcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtcCode(JAXBElement<String> value) {
        this.atcCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the atcName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtcName() {
        return atcName;
    }

    /**
     * Sets the value of the atcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtcName(JAXBElement<String> value) {
        this.atcName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the atcAsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtcAsnCode() {
        return atcAsnCode;
    }

    /**
     * Sets the value of the atcAsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtcAsnCode(JAXBElement<String> value) {
        this.atcAsnCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the atcAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtcAddUser() {
        return atcAddUser;
    }

    /**
     * Sets the value of the atcAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtcAddUser(JAXBElement<String> value) {
        this.atcAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the atcAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtcAddDate() {
        return atcAddDate;
    }

    /**
     * Sets the value of the atcAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtcAddDate(JAXBElement<String> value) {
        this.atcAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the atcChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtcChangeUser() {
        return atcChangeUser;
    }

    /**
     * Sets the value of the atcChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtcChangeUser(JAXBElement<String> value) {
        this.atcChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the atcChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtcChangeDate() {
        return atcChangeDate;
    }

    /**
     * Sets the value of the atcChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtcChangeDate(JAXBElement<String> value) {
        this.atcChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the atcDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getAtcDeleteFlag() {
        return atcDeleteFlag;
    }

    /**
     * Sets the value of the atcDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setAtcDeleteFlag(JAXBElement<Short> value) {
        this.atcDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the atcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtcKey() {
        return atcKey;
    }

    /**
     * Sets the value of the atcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtcKey(JAXBElement<String> value) {
        this.atcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the atcKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtcKeyExt() {
        return atcKeyExt;
    }

    /**
     * Sets the value of the atcKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtcKeyExt(JAXBElement<String> value) {
        this.atcKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the atcGlaRevenueKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtcGlaRevenueKey() {
        return atcGlaRevenueKey;
    }

    /**
     * Sets the value of the atcGlaRevenueKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtcGlaRevenueKey(JAXBElement<String> value) {
        this.atcGlaRevenueKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the atcGlaLiabilityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtcGlaLiabilityKey() {
        return atcGlaLiabilityKey;
    }

    /**
     * Sets the value of the atcGlaLiabilityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtcGlaLiabilityKey(JAXBElement<String> value) {
        this.atcGlaLiabilityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the atcGlaReturnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtcGlaReturnKey() {
        return atcGlaReturnKey;
    }

    /**
     * Sets the value of the atcGlaReturnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtcGlaReturnKey(JAXBElement<String> value) {
        this.atcGlaReturnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the atcGlaDeferredKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtcGlaDeferredKey() {
        return atcGlaDeferredKey;
    }

    /**
     * Sets the value of the atcGlaDeferredKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtcGlaDeferredKey(JAXBElement<String> value) {
        this.atcGlaDeferredKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the atcGlaWriteoffKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtcGlaWriteoffKey() {
        return atcGlaWriteoffKey;
    }

    /**
     * Sets the value of the atcGlaWriteoffKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtcGlaWriteoffKey(JAXBElement<String> value) {
        this.atcGlaWriteoffKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the atcGlaInventoryKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtcGlaInventoryKey() {
        return atcGlaInventoryKey;
    }

    /**
     * Sets the value of the atcGlaInventoryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtcGlaInventoryKey(JAXBElement<String> value) {
        this.atcGlaInventoryKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the atcGlaCogsKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtcGlaCogsKey() {
        return atcGlaCogsKey;
    }

    /**
     * Sets the value of the atcGlaCogsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtcGlaCogsKey(JAXBElement<String> value) {
        this.atcGlaCogsKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the atcGlaArKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtcGlaArKey() {
        return atcGlaArKey;
    }

    /**
     * Sets the value of the atcGlaArKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtcGlaArKey(JAXBElement<String> value) {
        this.atcGlaArKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the atcEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtcEntityKey() {
        return atcEntityKey;
    }

    /**
     * Sets the value of the atcEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtcEntityKey(JAXBElement<String> value) {
        this.atcEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the atcGlaOverpaymentKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtcGlaOverpaymentKey() {
        return atcGlaOverpaymentKey;
    }

    /**
     * Sets the value of the atcGlaOverpaymentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtcGlaOverpaymentKey(JAXBElement<String> value) {
        this.atcGlaOverpaymentKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the atcAitKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtcAitKey() {
        return atcAitKey;
    }

    /**
     * Sets the value of the atcAitKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtcAitKey(JAXBElement<String> value) {
        this.atcAitKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the atcCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtcCurrencyCode() {
        return atcCurrencyCode;
    }

    /**
     * Sets the value of the atcCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtcCurrencyCode(JAXBElement<String> value) {
        this.atcCurrencyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the atcGlaRealizedGainKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtcGlaRealizedGainKey() {
        return atcGlaRealizedGainKey;
    }

    /**
     * Sets the value of the atcGlaRealizedGainKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtcGlaRealizedGainKey(JAXBElement<String> value) {
        this.atcGlaRealizedGainKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the atcGlaRealizedLossKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtcGlaRealizedLossKey() {
        return atcGlaRealizedLossKey;
    }

    /**
     * Sets the value of the atcGlaRealizedLossKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtcGlaRealizedLossKey(JAXBElement<String> value) {
        this.atcGlaRealizedLossKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the atcGlaRoundingKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtcGlaRoundingKey() {
        return atcGlaRoundingKey;
    }

    /**
     * Sets the value of the atcGlaRoundingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtcGlaRoundingKey(JAXBElement<String> value) {
        this.atcGlaRoundingKey = ((JAXBElement<String> ) value);
    }

}
