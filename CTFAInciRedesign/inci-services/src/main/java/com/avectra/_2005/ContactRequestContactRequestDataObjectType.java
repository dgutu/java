
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactRequest_Contact_Request_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactRequest_Contact_Request_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cor_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cor_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cor_cro_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="cor_rat_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cor_crr_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cor_crp_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cor_crs_code" type="{http://www.avectra.com/2005/}stringLength12_Type" minOccurs="0"/>
 *         &lt;element name="cor_summary" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cor_detail" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="cor_email_notif_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cor_fax_notif_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cor_date_completed" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cor_notif_sent_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cor_auto_assign_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cor_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cor_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cor_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cor_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cor_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cor_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cor_ixo_org_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cor_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cor_recno" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="cor_sfo_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cor_cct_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cor_number" type="{http://www.avectra.com/2005/}stringLength94_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactRequest_Contact_Request_DataObjectType", propOrder = {
    "corKey",
    "corCstKey",
    "corCroCode",
    "corRatCode",
    "corCrrCode",
    "corCrpCode",
    "corCrsCode",
    "corSummary",
    "corDetail",
    "corEmailNotifFlag",
    "corFaxNotifFlag",
    "corDateCompleted",
    "corNotifSentDate",
    "corAutoAssignFlag",
    "corAddDate",
    "corAddUser",
    "corChangeDate",
    "corChangeUser",
    "corDeleteFlag",
    "corEntityKey",
    "corIxoOrgCstKey",
    "corKeyExt",
    "corRecno",
    "corSfoKey",
    "corCctKey",
    "corNumber"
})
public class ContactRequestContactRequestDataObjectType {

    @XmlElementRef(name = "cor_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> corKey;
    @XmlElementRef(name = "cor_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> corCstKey;
    @XmlElementRef(name = "cor_cro_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> corCroCode;
    @XmlElementRef(name = "cor_rat_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> corRatCode;
    @XmlElementRef(name = "cor_crr_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> corCrrCode;
    @XmlElementRef(name = "cor_crp_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> corCrpCode;
    @XmlElementRef(name = "cor_crs_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> corCrsCode;
    @XmlElementRef(name = "cor_summary", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> corSummary;
    @XmlElementRef(name = "cor_detail", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> corDetail;
    @XmlElementRef(name = "cor_email_notif_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> corEmailNotifFlag;
    @XmlElementRef(name = "cor_fax_notif_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> corFaxNotifFlag;
    @XmlElementRef(name = "cor_date_completed", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> corDateCompleted;
    @XmlElementRef(name = "cor_notif_sent_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> corNotifSentDate;
    @XmlElementRef(name = "cor_auto_assign_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> corAutoAssignFlag;
    @XmlElementRef(name = "cor_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> corAddDate;
    @XmlElementRef(name = "cor_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> corAddUser;
    @XmlElementRef(name = "cor_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> corChangeDate;
    @XmlElementRef(name = "cor_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> corChangeUser;
    @XmlElementRef(name = "cor_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> corDeleteFlag;
    @XmlElementRef(name = "cor_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> corEntityKey;
    @XmlElementRef(name = "cor_ixo_org_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> corIxoOrgCstKey;
    @XmlElementRef(name = "cor_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> corKeyExt;
    @XmlElementRef(name = "cor_recno", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> corRecno;
    @XmlElementRef(name = "cor_sfo_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> corSfoKey;
    @XmlElementRef(name = "cor_cct_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> corCctKey;
    @XmlElementRef(name = "cor_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> corNumber;

    /**
     * Gets the value of the corKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorKey() {
        return corKey;
    }

    /**
     * Sets the value of the corKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorKey(JAXBElement<String> value) {
        this.corKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the corCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorCstKey() {
        return corCstKey;
    }

    /**
     * Sets the value of the corCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorCstKey(JAXBElement<String> value) {
        this.corCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the corCroCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorCroCode() {
        return corCroCode;
    }

    /**
     * Sets the value of the corCroCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorCroCode(JAXBElement<String> value) {
        this.corCroCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the corRatCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorRatCode() {
        return corRatCode;
    }

    /**
     * Sets the value of the corRatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorRatCode(JAXBElement<String> value) {
        this.corRatCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the corCrrCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorCrrCode() {
        return corCrrCode;
    }

    /**
     * Sets the value of the corCrrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorCrrCode(JAXBElement<String> value) {
        this.corCrrCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the corCrpCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorCrpCode() {
        return corCrpCode;
    }

    /**
     * Sets the value of the corCrpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorCrpCode(JAXBElement<String> value) {
        this.corCrpCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the corCrsCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorCrsCode() {
        return corCrsCode;
    }

    /**
     * Sets the value of the corCrsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorCrsCode(JAXBElement<String> value) {
        this.corCrsCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the corSummary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorSummary() {
        return corSummary;
    }

    /**
     * Sets the value of the corSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorSummary(JAXBElement<String> value) {
        this.corSummary = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the corDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorDetail() {
        return corDetail;
    }

    /**
     * Sets the value of the corDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorDetail(JAXBElement<String> value) {
        this.corDetail = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the corEmailNotifFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCorEmailNotifFlag() {
        return corEmailNotifFlag;
    }

    /**
     * Sets the value of the corEmailNotifFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCorEmailNotifFlag(JAXBElement<Short> value) {
        this.corEmailNotifFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the corFaxNotifFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCorFaxNotifFlag() {
        return corFaxNotifFlag;
    }

    /**
     * Sets the value of the corFaxNotifFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCorFaxNotifFlag(JAXBElement<Short> value) {
        this.corFaxNotifFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the corDateCompleted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorDateCompleted() {
        return corDateCompleted;
    }

    /**
     * Sets the value of the corDateCompleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorDateCompleted(JAXBElement<String> value) {
        this.corDateCompleted = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the corNotifSentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorNotifSentDate() {
        return corNotifSentDate;
    }

    /**
     * Sets the value of the corNotifSentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorNotifSentDate(JAXBElement<String> value) {
        this.corNotifSentDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the corAutoAssignFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCorAutoAssignFlag() {
        return corAutoAssignFlag;
    }

    /**
     * Sets the value of the corAutoAssignFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCorAutoAssignFlag(JAXBElement<Short> value) {
        this.corAutoAssignFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the corAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorAddDate() {
        return corAddDate;
    }

    /**
     * Sets the value of the corAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorAddDate(JAXBElement<String> value) {
        this.corAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the corAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorAddUser() {
        return corAddUser;
    }

    /**
     * Sets the value of the corAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorAddUser(JAXBElement<String> value) {
        this.corAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the corChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorChangeDate() {
        return corChangeDate;
    }

    /**
     * Sets the value of the corChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorChangeDate(JAXBElement<String> value) {
        this.corChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the corChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorChangeUser() {
        return corChangeUser;
    }

    /**
     * Sets the value of the corChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorChangeUser(JAXBElement<String> value) {
        this.corChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the corDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCorDeleteFlag() {
        return corDeleteFlag;
    }

    /**
     * Sets the value of the corDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCorDeleteFlag(JAXBElement<Short> value) {
        this.corDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the corEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorEntityKey() {
        return corEntityKey;
    }

    /**
     * Sets the value of the corEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorEntityKey(JAXBElement<String> value) {
        this.corEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the corIxoOrgCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorIxoOrgCstKey() {
        return corIxoOrgCstKey;
    }

    /**
     * Sets the value of the corIxoOrgCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorIxoOrgCstKey(JAXBElement<String> value) {
        this.corIxoOrgCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the corKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorKeyExt() {
        return corKeyExt;
    }

    /**
     * Sets the value of the corKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorKeyExt(JAXBElement<String> value) {
        this.corKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the corRecno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCorRecno() {
        return corRecno;
    }

    /**
     * Sets the value of the corRecno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCorRecno(JAXBElement<Long> value) {
        this.corRecno = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the corSfoKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorSfoKey() {
        return corSfoKey;
    }

    /**
     * Sets the value of the corSfoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorSfoKey(JAXBElement<String> value) {
        this.corSfoKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the corCctKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorCctKey() {
        return corCctKey;
    }

    /**
     * Sets the value of the corCctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorCctKey(JAXBElement<String> value) {
        this.corCctKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the corNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorNumber() {
        return corNumber;
    }

    /**
     * Sets the value of the corNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorNumber(JAXBElement<String> value) {
        this.corNumber = ((JAXBElement<String> ) value);
    }

}
