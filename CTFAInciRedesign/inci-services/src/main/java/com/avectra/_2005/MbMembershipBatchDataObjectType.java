
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mb_membership_Batch_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mb_membership_Batch_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bat_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bat_code" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="bat_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="bat_control_total" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="bat_control_trx_count" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="bat_post_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="bat_post_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="bat_post_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bat_export_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="bat_export_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="bat_export_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bat_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="bat_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="bat_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="bat_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="bat_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="bat_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bat_apm_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bat_atc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bat_arp_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bat_close_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="bat_close_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="bat_close_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bat_notes" type="{http://www.avectra.com/2005/}stringLength400_Type" minOccurs="0"/>
 *         &lt;element name="bat_file" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="bat_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bat_intercompany_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bat_file2" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="bat_file3" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="bat_lock_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bat_lock_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mb_membership_Batch_DataObjectType", propOrder = {
    "batKey",
    "batCode",
    "batDate",
    "batControlTotal",
    "batControlTrxCount",
    "batPostDate",
    "batPostUser",
    "batPostFlag",
    "batExportDate",
    "batExportUser",
    "batExportFlag",
    "batAddUser",
    "batAddDate",
    "batChangeUser",
    "batChangeDate",
    "batDeleteFlag",
    "batKeyExt",
    "batApmKey",
    "batAtcKey",
    "batArpKey",
    "batCloseUser",
    "batCloseDate",
    "batCloseFlag",
    "batNotes",
    "batFile",
    "batEntityKey",
    "batIntercompanyFlag",
    "batFile2",
    "batFile3",
    "batLockFlag",
    "batLockDate"
})
public class MbMembershipBatchDataObjectType {

    @XmlElementRef(name = "bat_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> batKey;
    @XmlElementRef(name = "bat_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> batCode;
    @XmlElementRef(name = "bat_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> batDate;
    @XmlElementRef(name = "bat_control_total", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> batControlTotal;
    @XmlElementRef(name = "bat_control_trx_count", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> batControlTrxCount;
    @XmlElementRef(name = "bat_post_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> batPostDate;
    @XmlElementRef(name = "bat_post_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> batPostUser;
    @XmlElementRef(name = "bat_post_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> batPostFlag;
    @XmlElementRef(name = "bat_export_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> batExportDate;
    @XmlElementRef(name = "bat_export_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> batExportUser;
    @XmlElementRef(name = "bat_export_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> batExportFlag;
    @XmlElementRef(name = "bat_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> batAddUser;
    @XmlElementRef(name = "bat_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> batAddDate;
    @XmlElementRef(name = "bat_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> batChangeUser;
    @XmlElementRef(name = "bat_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> batChangeDate;
    @XmlElementRef(name = "bat_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> batDeleteFlag;
    @XmlElementRef(name = "bat_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> batKeyExt;
    @XmlElementRef(name = "bat_apm_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> batApmKey;
    @XmlElementRef(name = "bat_atc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> batAtcKey;
    @XmlElementRef(name = "bat_arp_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> batArpKey;
    @XmlElementRef(name = "bat_close_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> batCloseUser;
    @XmlElementRef(name = "bat_close_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> batCloseDate;
    @XmlElementRef(name = "bat_close_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> batCloseFlag;
    @XmlElementRef(name = "bat_notes", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> batNotes;
    @XmlElementRef(name = "bat_file", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> batFile;
    @XmlElementRef(name = "bat_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> batEntityKey;
    @XmlElementRef(name = "bat_intercompany_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> batIntercompanyFlag;
    @XmlElementRef(name = "bat_file2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> batFile2;
    @XmlElementRef(name = "bat_file3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> batFile3;
    @XmlElementRef(name = "bat_lock_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> batLockFlag;
    @XmlElementRef(name = "bat_lock_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> batLockDate;

    /**
     * Gets the value of the batKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatKey() {
        return batKey;
    }

    /**
     * Sets the value of the batKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatKey(JAXBElement<String> value) {
        this.batKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the batCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatCode() {
        return batCode;
    }

    /**
     * Sets the value of the batCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatCode(JAXBElement<String> value) {
        this.batCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the batDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatDate() {
        return batDate;
    }

    /**
     * Sets the value of the batDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatDate(JAXBElement<String> value) {
        this.batDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the batControlTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBatControlTotal() {
        return batControlTotal;
    }

    /**
     * Sets the value of the batControlTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBatControlTotal(JAXBElement<BigDecimal> value) {
        this.batControlTotal = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the batControlTrxCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBatControlTrxCount() {
        return batControlTrxCount;
    }

    /**
     * Sets the value of the batControlTrxCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBatControlTrxCount(JAXBElement<Integer> value) {
        this.batControlTrxCount = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the batPostDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatPostDate() {
        return batPostDate;
    }

    /**
     * Sets the value of the batPostDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatPostDate(JAXBElement<String> value) {
        this.batPostDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the batPostUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatPostUser() {
        return batPostUser;
    }

    /**
     * Sets the value of the batPostUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatPostUser(JAXBElement<String> value) {
        this.batPostUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the batPostFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBatPostFlag() {
        return batPostFlag;
    }

    /**
     * Sets the value of the batPostFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBatPostFlag(JAXBElement<Short> value) {
        this.batPostFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the batExportDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatExportDate() {
        return batExportDate;
    }

    /**
     * Sets the value of the batExportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatExportDate(JAXBElement<String> value) {
        this.batExportDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the batExportUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatExportUser() {
        return batExportUser;
    }

    /**
     * Sets the value of the batExportUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatExportUser(JAXBElement<String> value) {
        this.batExportUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the batExportFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBatExportFlag() {
        return batExportFlag;
    }

    /**
     * Sets the value of the batExportFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBatExportFlag(JAXBElement<Short> value) {
        this.batExportFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the batAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatAddUser() {
        return batAddUser;
    }

    /**
     * Sets the value of the batAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatAddUser(JAXBElement<String> value) {
        this.batAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the batAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatAddDate() {
        return batAddDate;
    }

    /**
     * Sets the value of the batAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatAddDate(JAXBElement<String> value) {
        this.batAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the batChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatChangeUser() {
        return batChangeUser;
    }

    /**
     * Sets the value of the batChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatChangeUser(JAXBElement<String> value) {
        this.batChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the batChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatChangeDate() {
        return batChangeDate;
    }

    /**
     * Sets the value of the batChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatChangeDate(JAXBElement<String> value) {
        this.batChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the batDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBatDeleteFlag() {
        return batDeleteFlag;
    }

    /**
     * Sets the value of the batDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBatDeleteFlag(JAXBElement<Short> value) {
        this.batDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the batKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatKeyExt() {
        return batKeyExt;
    }

    /**
     * Sets the value of the batKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatKeyExt(JAXBElement<String> value) {
        this.batKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the batApmKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatApmKey() {
        return batApmKey;
    }

    /**
     * Sets the value of the batApmKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatApmKey(JAXBElement<String> value) {
        this.batApmKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the batAtcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatAtcKey() {
        return batAtcKey;
    }

    /**
     * Sets the value of the batAtcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatAtcKey(JAXBElement<String> value) {
        this.batAtcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the batArpKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatArpKey() {
        return batArpKey;
    }

    /**
     * Sets the value of the batArpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatArpKey(JAXBElement<String> value) {
        this.batArpKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the batCloseUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatCloseUser() {
        return batCloseUser;
    }

    /**
     * Sets the value of the batCloseUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatCloseUser(JAXBElement<String> value) {
        this.batCloseUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the batCloseDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatCloseDate() {
        return batCloseDate;
    }

    /**
     * Sets the value of the batCloseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatCloseDate(JAXBElement<String> value) {
        this.batCloseDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the batCloseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBatCloseFlag() {
        return batCloseFlag;
    }

    /**
     * Sets the value of the batCloseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBatCloseFlag(JAXBElement<Short> value) {
        this.batCloseFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the batNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatNotes() {
        return batNotes;
    }

    /**
     * Sets the value of the batNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatNotes(JAXBElement<String> value) {
        this.batNotes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the batFile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatFile() {
        return batFile;
    }

    /**
     * Sets the value of the batFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatFile(JAXBElement<String> value) {
        this.batFile = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the batEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatEntityKey() {
        return batEntityKey;
    }

    /**
     * Sets the value of the batEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatEntityKey(JAXBElement<String> value) {
        this.batEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the batIntercompanyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBatIntercompanyFlag() {
        return batIntercompanyFlag;
    }

    /**
     * Sets the value of the batIntercompanyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBatIntercompanyFlag(JAXBElement<Short> value) {
        this.batIntercompanyFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the batFile2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatFile2() {
        return batFile2;
    }

    /**
     * Sets the value of the batFile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatFile2(JAXBElement<String> value) {
        this.batFile2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the batFile3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatFile3() {
        return batFile3;
    }

    /**
     * Sets the value of the batFile3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatFile3(JAXBElement<String> value) {
        this.batFile3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the batLockFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBatLockFlag() {
        return batLockFlag;
    }

    /**
     * Sets the value of the batLockFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBatLockFlag(JAXBElement<Short> value) {
        this.batLockFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the batLockDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatLockDate() {
        return batLockDate;
    }

    /**
     * Sets the value of the batLockDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatLockDate(JAXBElement<String> value) {
        this.batLockDate = ((JAXBElement<String> ) value);
    }

}
