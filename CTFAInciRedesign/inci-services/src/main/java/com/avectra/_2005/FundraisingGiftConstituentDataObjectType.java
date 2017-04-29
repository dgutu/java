
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Constituent_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Constituent_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dnr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="dnr_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="dnr_alt_id" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="dnr_matchcode" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="dnr_salutation1" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="dnr_salutation2" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="dnr_salutation3" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="dnr_dcg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="dnr_rfm_join_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="dnr_rfm_join_source" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="dnr_rfm_ytd_amt" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="dnr_rfm_ytd_count" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="dnr_rfm_ly_amt" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="dnr_rfm_ly_count" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="dnr_rfm_ttd_amt" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="dnr_rfm_ttd_count" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="dnr_rfm_highest_amt" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="dnr_rfm_highest_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="dnr_rfm_highest_source" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="dnr_rfm_latest_amt" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="dnr_rfm_latest_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="dnr_rfm_latest_source" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="dnr_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="dnr_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="dnr_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="dnr_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="dnr_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="dnr_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="dnr_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="dnr_ind_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="dnr_rfm_first_gift_amt" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="dnr_vip_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="dnr_notes" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="dnr_rcl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="dnr_recognition_level_override_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="dnr_salutation4" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="dnr_usr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="dnr_solicitor_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="dnr_vpt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="dnr_gives_anonymous" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="dnr_cst_sort_name_dn" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Constituent_DataObjectType", propOrder = {
    "dnrKey",
    "dnrCstKey",
    "dnrAltId",
    "dnrMatchcode",
    "dnrSalutation1",
    "dnrSalutation2",
    "dnrSalutation3",
    "dnrDcgKey",
    "dnrRfmJoinDate",
    "dnrRfmJoinSource",
    "dnrRfmYtdAmt",
    "dnrRfmYtdCount",
    "dnrRfmLyAmt",
    "dnrRfmLyCount",
    "dnrRfmTtdAmt",
    "dnrRfmTtdCount",
    "dnrRfmHighestAmt",
    "dnrRfmHighestDate",
    "dnrRfmHighestSource",
    "dnrRfmLatestAmt",
    "dnrRfmLatestDate",
    "dnrRfmLatestSource",
    "dnrAddUser",
    "dnrAddDate",
    "dnrChangeUser",
    "dnrChangeDate",
    "dnrDeleteFlag",
    "dnrEntityKey",
    "dnrKeyExt",
    "dnrIndCstKey",
    "dnrRfmFirstGiftAmt",
    "dnrVipFlag",
    "dnrNotes",
    "dnrRclKey",
    "dnrRecognitionLevelOverrideFlag",
    "dnrSalutation4",
    "dnrUsrKey",
    "dnrSolicitorCstKey",
    "dnrVptKey",
    "dnrGivesAnonymous",
    "dnrCstSortNameDn"
})
public class FundraisingGiftConstituentDataObjectType {

    @XmlElementRef(name = "dnr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrKey;
    @XmlElementRef(name = "dnr_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrCstKey;
    @XmlElementRef(name = "dnr_alt_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrAltId;
    @XmlElementRef(name = "dnr_matchcode", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrMatchcode;
    @XmlElementRef(name = "dnr_salutation1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrSalutation1;
    @XmlElementRef(name = "dnr_salutation2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrSalutation2;
    @XmlElementRef(name = "dnr_salutation3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrSalutation3;
    @XmlElementRef(name = "dnr_dcg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrDcgKey;
    @XmlElementRef(name = "dnr_rfm_join_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrRfmJoinDate;
    @XmlElementRef(name = "dnr_rfm_join_source", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrRfmJoinSource;
    @XmlElementRef(name = "dnr_rfm_ytd_amt", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> dnrRfmYtdAmt;
    @XmlElementRef(name = "dnr_rfm_ytd_count", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> dnrRfmYtdCount;
    @XmlElementRef(name = "dnr_rfm_ly_amt", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> dnrRfmLyAmt;
    @XmlElementRef(name = "dnr_rfm_ly_count", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> dnrRfmLyCount;
    @XmlElementRef(name = "dnr_rfm_ttd_amt", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> dnrRfmTtdAmt;
    @XmlElementRef(name = "dnr_rfm_ttd_count", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> dnrRfmTtdCount;
    @XmlElementRef(name = "dnr_rfm_highest_amt", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> dnrRfmHighestAmt;
    @XmlElementRef(name = "dnr_rfm_highest_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrRfmHighestDate;
    @XmlElementRef(name = "dnr_rfm_highest_source", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrRfmHighestSource;
    @XmlElementRef(name = "dnr_rfm_latest_amt", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> dnrRfmLatestAmt;
    @XmlElementRef(name = "dnr_rfm_latest_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrRfmLatestDate;
    @XmlElementRef(name = "dnr_rfm_latest_source", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrRfmLatestSource;
    @XmlElementRef(name = "dnr_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrAddUser;
    @XmlElementRef(name = "dnr_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrAddDate;
    @XmlElementRef(name = "dnr_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrChangeUser;
    @XmlElementRef(name = "dnr_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrChangeDate;
    @XmlElementRef(name = "dnr_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> dnrDeleteFlag;
    @XmlElementRef(name = "dnr_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrEntityKey;
    @XmlElementRef(name = "dnr_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrKeyExt;
    @XmlElementRef(name = "dnr_ind_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrIndCstKey;
    @XmlElementRef(name = "dnr_rfm_first_gift_amt", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> dnrRfmFirstGiftAmt;
    @XmlElementRef(name = "dnr_vip_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> dnrVipFlag;
    @XmlElementRef(name = "dnr_notes", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrNotes;
    @XmlElementRef(name = "dnr_rcl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrRclKey;
    @XmlElementRef(name = "dnr_recognition_level_override_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> dnrRecognitionLevelOverrideFlag;
    @XmlElementRef(name = "dnr_salutation4", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrSalutation4;
    @XmlElementRef(name = "dnr_usr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrUsrKey;
    @XmlElementRef(name = "dnr_solicitor_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrSolicitorCstKey;
    @XmlElementRef(name = "dnr_vpt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrVptKey;
    @XmlElementRef(name = "dnr_gives_anonymous", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> dnrGivesAnonymous;
    @XmlElementRef(name = "dnr_cst_sort_name_dn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dnrCstSortNameDn;

    /**
     * Gets the value of the dnrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrKey() {
        return dnrKey;
    }

    /**
     * Sets the value of the dnrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrKey(JAXBElement<String> value) {
        this.dnrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrCstKey() {
        return dnrCstKey;
    }

    /**
     * Sets the value of the dnrCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrCstKey(JAXBElement<String> value) {
        this.dnrCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrAltId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrAltId() {
        return dnrAltId;
    }

    /**
     * Sets the value of the dnrAltId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrAltId(JAXBElement<String> value) {
        this.dnrAltId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrMatchcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrMatchcode() {
        return dnrMatchcode;
    }

    /**
     * Sets the value of the dnrMatchcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrMatchcode(JAXBElement<String> value) {
        this.dnrMatchcode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrSalutation1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrSalutation1() {
        return dnrSalutation1;
    }

    /**
     * Sets the value of the dnrSalutation1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrSalutation1(JAXBElement<String> value) {
        this.dnrSalutation1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrSalutation2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrSalutation2() {
        return dnrSalutation2;
    }

    /**
     * Sets the value of the dnrSalutation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrSalutation2(JAXBElement<String> value) {
        this.dnrSalutation2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrSalutation3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrSalutation3() {
        return dnrSalutation3;
    }

    /**
     * Sets the value of the dnrSalutation3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrSalutation3(JAXBElement<String> value) {
        this.dnrSalutation3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrDcgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrDcgKey() {
        return dnrDcgKey;
    }

    /**
     * Sets the value of the dnrDcgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrDcgKey(JAXBElement<String> value) {
        this.dnrDcgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrRfmJoinDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrRfmJoinDate() {
        return dnrRfmJoinDate;
    }

    /**
     * Sets the value of the dnrRfmJoinDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrRfmJoinDate(JAXBElement<String> value) {
        this.dnrRfmJoinDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrRfmJoinSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrRfmJoinSource() {
        return dnrRfmJoinSource;
    }

    /**
     * Sets the value of the dnrRfmJoinSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrRfmJoinSource(JAXBElement<String> value) {
        this.dnrRfmJoinSource = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrRfmYtdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDnrRfmYtdAmt() {
        return dnrRfmYtdAmt;
    }

    /**
     * Sets the value of the dnrRfmYtdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDnrRfmYtdAmt(JAXBElement<BigDecimal> value) {
        this.dnrRfmYtdAmt = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the dnrRfmYtdCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDnrRfmYtdCount() {
        return dnrRfmYtdCount;
    }

    /**
     * Sets the value of the dnrRfmYtdCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDnrRfmYtdCount(JAXBElement<Integer> value) {
        this.dnrRfmYtdCount = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the dnrRfmLyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDnrRfmLyAmt() {
        return dnrRfmLyAmt;
    }

    /**
     * Sets the value of the dnrRfmLyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDnrRfmLyAmt(JAXBElement<BigDecimal> value) {
        this.dnrRfmLyAmt = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the dnrRfmLyCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDnrRfmLyCount() {
        return dnrRfmLyCount;
    }

    /**
     * Sets the value of the dnrRfmLyCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDnrRfmLyCount(JAXBElement<Integer> value) {
        this.dnrRfmLyCount = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the dnrRfmTtdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDnrRfmTtdAmt() {
        return dnrRfmTtdAmt;
    }

    /**
     * Sets the value of the dnrRfmTtdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDnrRfmTtdAmt(JAXBElement<BigDecimal> value) {
        this.dnrRfmTtdAmt = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the dnrRfmTtdCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDnrRfmTtdCount() {
        return dnrRfmTtdCount;
    }

    /**
     * Sets the value of the dnrRfmTtdCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDnrRfmTtdCount(JAXBElement<Integer> value) {
        this.dnrRfmTtdCount = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the dnrRfmHighestAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDnrRfmHighestAmt() {
        return dnrRfmHighestAmt;
    }

    /**
     * Sets the value of the dnrRfmHighestAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDnrRfmHighestAmt(JAXBElement<BigDecimal> value) {
        this.dnrRfmHighestAmt = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the dnrRfmHighestDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrRfmHighestDate() {
        return dnrRfmHighestDate;
    }

    /**
     * Sets the value of the dnrRfmHighestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrRfmHighestDate(JAXBElement<String> value) {
        this.dnrRfmHighestDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrRfmHighestSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrRfmHighestSource() {
        return dnrRfmHighestSource;
    }

    /**
     * Sets the value of the dnrRfmHighestSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrRfmHighestSource(JAXBElement<String> value) {
        this.dnrRfmHighestSource = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrRfmLatestAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDnrRfmLatestAmt() {
        return dnrRfmLatestAmt;
    }

    /**
     * Sets the value of the dnrRfmLatestAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDnrRfmLatestAmt(JAXBElement<BigDecimal> value) {
        this.dnrRfmLatestAmt = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the dnrRfmLatestDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrRfmLatestDate() {
        return dnrRfmLatestDate;
    }

    /**
     * Sets the value of the dnrRfmLatestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrRfmLatestDate(JAXBElement<String> value) {
        this.dnrRfmLatestDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrRfmLatestSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrRfmLatestSource() {
        return dnrRfmLatestSource;
    }

    /**
     * Sets the value of the dnrRfmLatestSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrRfmLatestSource(JAXBElement<String> value) {
        this.dnrRfmLatestSource = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrAddUser() {
        return dnrAddUser;
    }

    /**
     * Sets the value of the dnrAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrAddUser(JAXBElement<String> value) {
        this.dnrAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrAddDate() {
        return dnrAddDate;
    }

    /**
     * Sets the value of the dnrAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrAddDate(JAXBElement<String> value) {
        this.dnrAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrChangeUser() {
        return dnrChangeUser;
    }

    /**
     * Sets the value of the dnrChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrChangeUser(JAXBElement<String> value) {
        this.dnrChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrChangeDate() {
        return dnrChangeDate;
    }

    /**
     * Sets the value of the dnrChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrChangeDate(JAXBElement<String> value) {
        this.dnrChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getDnrDeleteFlag() {
        return dnrDeleteFlag;
    }

    /**
     * Sets the value of the dnrDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setDnrDeleteFlag(JAXBElement<Short> value) {
        this.dnrDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the dnrEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrEntityKey() {
        return dnrEntityKey;
    }

    /**
     * Sets the value of the dnrEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrEntityKey(JAXBElement<String> value) {
        this.dnrEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrKeyExt() {
        return dnrKeyExt;
    }

    /**
     * Sets the value of the dnrKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrKeyExt(JAXBElement<String> value) {
        this.dnrKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrIndCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrIndCstKey() {
        return dnrIndCstKey;
    }

    /**
     * Sets the value of the dnrIndCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrIndCstKey(JAXBElement<String> value) {
        this.dnrIndCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrRfmFirstGiftAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDnrRfmFirstGiftAmt() {
        return dnrRfmFirstGiftAmt;
    }

    /**
     * Sets the value of the dnrRfmFirstGiftAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDnrRfmFirstGiftAmt(JAXBElement<BigDecimal> value) {
        this.dnrRfmFirstGiftAmt = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the dnrVipFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getDnrVipFlag() {
        return dnrVipFlag;
    }

    /**
     * Sets the value of the dnrVipFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setDnrVipFlag(JAXBElement<Short> value) {
        this.dnrVipFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the dnrNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrNotes() {
        return dnrNotes;
    }

    /**
     * Sets the value of the dnrNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrNotes(JAXBElement<String> value) {
        this.dnrNotes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrRclKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrRclKey() {
        return dnrRclKey;
    }

    /**
     * Sets the value of the dnrRclKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrRclKey(JAXBElement<String> value) {
        this.dnrRclKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrRecognitionLevelOverrideFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getDnrRecognitionLevelOverrideFlag() {
        return dnrRecognitionLevelOverrideFlag;
    }

    /**
     * Sets the value of the dnrRecognitionLevelOverrideFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setDnrRecognitionLevelOverrideFlag(JAXBElement<Short> value) {
        this.dnrRecognitionLevelOverrideFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the dnrSalutation4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrSalutation4() {
        return dnrSalutation4;
    }

    /**
     * Sets the value of the dnrSalutation4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrSalutation4(JAXBElement<String> value) {
        this.dnrSalutation4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrUsrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrUsrKey() {
        return dnrUsrKey;
    }

    /**
     * Sets the value of the dnrUsrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrUsrKey(JAXBElement<String> value) {
        this.dnrUsrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrSolicitorCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrSolicitorCstKey() {
        return dnrSolicitorCstKey;
    }

    /**
     * Sets the value of the dnrSolicitorCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrSolicitorCstKey(JAXBElement<String> value) {
        this.dnrSolicitorCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrVptKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrVptKey() {
        return dnrVptKey;
    }

    /**
     * Sets the value of the dnrVptKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrVptKey(JAXBElement<String> value) {
        this.dnrVptKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnrGivesAnonymous property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getDnrGivesAnonymous() {
        return dnrGivesAnonymous;
    }

    /**
     * Sets the value of the dnrGivesAnonymous property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setDnrGivesAnonymous(JAXBElement<Short> value) {
        this.dnrGivesAnonymous = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the dnrCstSortNameDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnrCstSortNameDn() {
        return dnrCstSortNameDn;
    }

    /**
     * Sets the value of the dnrCstSortNameDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnrCstSortNameDn(JAXBElement<String> value) {
        this.dnrCstSortNameDn = ((JAXBElement<String> ) value);
    }

}
