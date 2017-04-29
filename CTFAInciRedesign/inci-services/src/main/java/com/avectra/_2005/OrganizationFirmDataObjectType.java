
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organization_Firm_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Firm_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orf_org_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="orf_num_cpa_profs" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="orf_num_non_cpa" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="orf_num_partners" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="orf_num_professionals" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="orf_num_peer_review" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="orf_firm_paid_dues_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="orf_firm_chapter" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="orf_firm_chapter_override_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="orf_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="orf_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="orf_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="orf_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="orf_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="orf_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="orf_org_cst_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="orf_aicpa_firm_number" type="{http://www.avectra.com/2005/}stringLength15_Type" minOccurs="0"/>
 *         &lt;element name="orf_auditing" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="orf_aa_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="orf_firm_status" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="orf_review_number" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Firm_DataObjectType", propOrder = {
    "orfOrgCstKey",
    "orfNumCpaProfs",
    "orfNumNonCpa",
    "orfNumPartners",
    "orfNumProfessionals",
    "orfNumPeerReview",
    "orfFirmPaidDuesFlag",
    "orfFirmChapter",
    "orfFirmChapterOverrideFlag",
    "orfAddUser",
    "orfAddDate",
    "orfChangeUser",
    "orfChangeDate",
    "orfDeleteFlag",
    "orfEntityKey",
    "orfOrgCstKeyExt",
    "orfAicpaFirmNumber",
    "orfAuditing",
    "orfAaFlag",
    "orfFirmStatus",
    "orfReviewNumber"
})
public class OrganizationFirmDataObjectType {

    @XmlElementRef(name = "orf_org_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orfOrgCstKey;
    @XmlElementRef(name = "orf_num_cpa_profs", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> orfNumCpaProfs;
    @XmlElementRef(name = "orf_num_non_cpa", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> orfNumNonCpa;
    @XmlElementRef(name = "orf_num_partners", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> orfNumPartners;
    @XmlElementRef(name = "orf_num_professionals", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> orfNumProfessionals;
    @XmlElementRef(name = "orf_num_peer_review", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> orfNumPeerReview;
    @XmlElementRef(name = "orf_firm_paid_dues_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> orfFirmPaidDuesFlag;
    @XmlElementRef(name = "orf_firm_chapter", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orfFirmChapter;
    @XmlElementRef(name = "orf_firm_chapter_override_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> orfFirmChapterOverrideFlag;
    @XmlElementRef(name = "orf_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orfAddUser;
    @XmlElementRef(name = "orf_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orfAddDate;
    @XmlElementRef(name = "orf_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orfChangeUser;
    @XmlElementRef(name = "orf_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orfChangeDate;
    @XmlElementRef(name = "orf_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> orfDeleteFlag;
    @XmlElementRef(name = "orf_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orfEntityKey;
    @XmlElementRef(name = "orf_org_cst_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orfOrgCstKeyExt;
    @XmlElementRef(name = "orf_aicpa_firm_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orfAicpaFirmNumber;
    @XmlElementRef(name = "orf_auditing", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orfAuditing;
    @XmlElementRef(name = "orf_aa_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> orfAaFlag;
    @XmlElementRef(name = "orf_firm_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orfFirmStatus;
    @XmlElementRef(name = "orf_review_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> orfReviewNumber;

    /**
     * Gets the value of the orfOrgCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrfOrgCstKey() {
        return orfOrgCstKey;
    }

    /**
     * Sets the value of the orfOrgCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrfOrgCstKey(JAXBElement<String> value) {
        this.orfOrgCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orfNumCpaProfs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrfNumCpaProfs() {
        return orfNumCpaProfs;
    }

    /**
     * Sets the value of the orfNumCpaProfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrfNumCpaProfs(JAXBElement<Integer> value) {
        this.orfNumCpaProfs = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the orfNumNonCpa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrfNumNonCpa() {
        return orfNumNonCpa;
    }

    /**
     * Sets the value of the orfNumNonCpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrfNumNonCpa(JAXBElement<Integer> value) {
        this.orfNumNonCpa = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the orfNumPartners property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrfNumPartners() {
        return orfNumPartners;
    }

    /**
     * Sets the value of the orfNumPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrfNumPartners(JAXBElement<Integer> value) {
        this.orfNumPartners = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the orfNumProfessionals property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrfNumProfessionals() {
        return orfNumProfessionals;
    }

    /**
     * Sets the value of the orfNumProfessionals property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrfNumProfessionals(JAXBElement<Integer> value) {
        this.orfNumProfessionals = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the orfNumPeerReview property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrfNumPeerReview() {
        return orfNumPeerReview;
    }

    /**
     * Sets the value of the orfNumPeerReview property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrfNumPeerReview(JAXBElement<Integer> value) {
        this.orfNumPeerReview = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the orfFirmPaidDuesFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOrfFirmPaidDuesFlag() {
        return orfFirmPaidDuesFlag;
    }

    /**
     * Sets the value of the orfFirmPaidDuesFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOrfFirmPaidDuesFlag(JAXBElement<Short> value) {
        this.orfFirmPaidDuesFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the orfFirmChapter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrfFirmChapter() {
        return orfFirmChapter;
    }

    /**
     * Sets the value of the orfFirmChapter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrfFirmChapter(JAXBElement<String> value) {
        this.orfFirmChapter = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orfFirmChapterOverrideFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOrfFirmChapterOverrideFlag() {
        return orfFirmChapterOverrideFlag;
    }

    /**
     * Sets the value of the orfFirmChapterOverrideFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOrfFirmChapterOverrideFlag(JAXBElement<Short> value) {
        this.orfFirmChapterOverrideFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the orfAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrfAddUser() {
        return orfAddUser;
    }

    /**
     * Sets the value of the orfAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrfAddUser(JAXBElement<String> value) {
        this.orfAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orfAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrfAddDate() {
        return orfAddDate;
    }

    /**
     * Sets the value of the orfAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrfAddDate(JAXBElement<String> value) {
        this.orfAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orfChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrfChangeUser() {
        return orfChangeUser;
    }

    /**
     * Sets the value of the orfChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrfChangeUser(JAXBElement<String> value) {
        this.orfChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orfChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrfChangeDate() {
        return orfChangeDate;
    }

    /**
     * Sets the value of the orfChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrfChangeDate(JAXBElement<String> value) {
        this.orfChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orfDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOrfDeleteFlag() {
        return orfDeleteFlag;
    }

    /**
     * Sets the value of the orfDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOrfDeleteFlag(JAXBElement<Short> value) {
        this.orfDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the orfEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrfEntityKey() {
        return orfEntityKey;
    }

    /**
     * Sets the value of the orfEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrfEntityKey(JAXBElement<String> value) {
        this.orfEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orfOrgCstKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrfOrgCstKeyExt() {
        return orfOrgCstKeyExt;
    }

    /**
     * Sets the value of the orfOrgCstKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrfOrgCstKeyExt(JAXBElement<String> value) {
        this.orfOrgCstKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orfAicpaFirmNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrfAicpaFirmNumber() {
        return orfAicpaFirmNumber;
    }

    /**
     * Sets the value of the orfAicpaFirmNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrfAicpaFirmNumber(JAXBElement<String> value) {
        this.orfAicpaFirmNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orfAuditing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrfAuditing() {
        return orfAuditing;
    }

    /**
     * Sets the value of the orfAuditing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrfAuditing(JAXBElement<String> value) {
        this.orfAuditing = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orfAaFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOrfAaFlag() {
        return orfAaFlag;
    }

    /**
     * Sets the value of the orfAaFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOrfAaFlag(JAXBElement<Short> value) {
        this.orfAaFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the orfFirmStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrfFirmStatus() {
        return orfFirmStatus;
    }

    /**
     * Sets the value of the orfFirmStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrfFirmStatus(JAXBElement<String> value) {
        this.orfFirmStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orfReviewNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrfReviewNumber() {
        return orfReviewNumber;
    }

    /**
     * Sets the value of the orfReviewNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrfReviewNumber(JAXBElement<Integer> value) {
        this.orfReviewNumber = ((JAXBElement<Integer> ) value);
    }

}
