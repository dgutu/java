
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrantGroup_Group_Registration_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrantGroup_Group_Registration_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="egp_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="egp_ind_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="egp_org_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="egp_cmt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="egp_evt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="egp_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="egp_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="egp_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="egp_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="egp_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="egp_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="egp_inv_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="egp_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="egp_registration_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="egp_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="egp_cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="egp_eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="egp_cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="egp_url_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="egp_rgt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="egp_pref_comm_meth" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="egp_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="egp_cancel_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="egp_cancel_reason" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="egp_number_of_registrants" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="egp_bup_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrantGroup_Group_Registration_DataObjectType", propOrder = {
    "egpKey",
    "egpIndCstKey",
    "egpOrgCstKey",
    "egpCmtKey",
    "egpEvtKey",
    "egpAddUser",
    "egpAddDate",
    "egpChangeUser",
    "egpChangeDate",
    "egpDeleteFlag",
    "egpKeyExt",
    "egpInvCode",
    "egpSrcKey",
    "egpRegistrationDate",
    "egpCxaKey",
    "egpCphKey",
    "egpEmlKey",
    "egpCfxKey",
    "egpUrlKey",
    "egpRgtKey",
    "egpPrefCommMeth",
    "egpEntityKey",
    "egpCancelDate",
    "egpCancelReason",
    "egpNumberOfRegistrants",
    "egpBupPrdKey"
})
public class EventsRegistrantGroupGroupRegistrationDataObjectType {

    @XmlElementRef(name = "egp_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> egpKey;
    @XmlElementRef(name = "egp_ind_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> egpIndCstKey;
    @XmlElementRef(name = "egp_org_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> egpOrgCstKey;
    @XmlElementRef(name = "egp_cmt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> egpCmtKey;
    @XmlElementRef(name = "egp_evt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> egpEvtKey;
    @XmlElementRef(name = "egp_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> egpAddUser;
    @XmlElementRef(name = "egp_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> egpAddDate;
    @XmlElementRef(name = "egp_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> egpChangeUser;
    @XmlElementRef(name = "egp_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> egpChangeDate;
    @XmlElementRef(name = "egp_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> egpDeleteFlag;
    @XmlElementRef(name = "egp_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> egpKeyExt;
    @XmlElementRef(name = "egp_inv_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> egpInvCode;
    @XmlElementRef(name = "egp_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> egpSrcKey;
    @XmlElementRef(name = "egp_registration_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> egpRegistrationDate;
    @XmlElementRef(name = "egp_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> egpCxaKey;
    @XmlElementRef(name = "egp_cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> egpCphKey;
    @XmlElementRef(name = "egp_eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> egpEmlKey;
    @XmlElementRef(name = "egp_cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> egpCfxKey;
    @XmlElementRef(name = "egp_url_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> egpUrlKey;
    @XmlElementRef(name = "egp_rgt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> egpRgtKey;
    @XmlElementRef(name = "egp_pref_comm_meth", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> egpPrefCommMeth;
    @XmlElementRef(name = "egp_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> egpEntityKey;
    @XmlElementRef(name = "egp_cancel_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> egpCancelDate;
    @XmlElementRef(name = "egp_cancel_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> egpCancelReason;
    @XmlElementRef(name = "egp_number_of_registrants", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> egpNumberOfRegistrants;
    @XmlElementRef(name = "egp_bup_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> egpBupPrdKey;

    /**
     * Gets the value of the egpKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgpKey() {
        return egpKey;
    }

    /**
     * Sets the value of the egpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgpKey(JAXBElement<String> value) {
        this.egpKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the egpIndCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgpIndCstKey() {
        return egpIndCstKey;
    }

    /**
     * Sets the value of the egpIndCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgpIndCstKey(JAXBElement<String> value) {
        this.egpIndCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the egpOrgCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgpOrgCstKey() {
        return egpOrgCstKey;
    }

    /**
     * Sets the value of the egpOrgCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgpOrgCstKey(JAXBElement<String> value) {
        this.egpOrgCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the egpCmtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgpCmtKey() {
        return egpCmtKey;
    }

    /**
     * Sets the value of the egpCmtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgpCmtKey(JAXBElement<String> value) {
        this.egpCmtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the egpEvtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgpEvtKey() {
        return egpEvtKey;
    }

    /**
     * Sets the value of the egpEvtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgpEvtKey(JAXBElement<String> value) {
        this.egpEvtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the egpAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgpAddUser() {
        return egpAddUser;
    }

    /**
     * Sets the value of the egpAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgpAddUser(JAXBElement<String> value) {
        this.egpAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the egpAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgpAddDate() {
        return egpAddDate;
    }

    /**
     * Sets the value of the egpAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgpAddDate(JAXBElement<String> value) {
        this.egpAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the egpChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgpChangeUser() {
        return egpChangeUser;
    }

    /**
     * Sets the value of the egpChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgpChangeUser(JAXBElement<String> value) {
        this.egpChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the egpChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgpChangeDate() {
        return egpChangeDate;
    }

    /**
     * Sets the value of the egpChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgpChangeDate(JAXBElement<String> value) {
        this.egpChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the egpDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEgpDeleteFlag() {
        return egpDeleteFlag;
    }

    /**
     * Sets the value of the egpDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEgpDeleteFlag(JAXBElement<Short> value) {
        this.egpDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the egpKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgpKeyExt() {
        return egpKeyExt;
    }

    /**
     * Sets the value of the egpKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgpKeyExt(JAXBElement<String> value) {
        this.egpKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the egpInvCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgpInvCode() {
        return egpInvCode;
    }

    /**
     * Sets the value of the egpInvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgpInvCode(JAXBElement<String> value) {
        this.egpInvCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the egpSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgpSrcKey() {
        return egpSrcKey;
    }

    /**
     * Sets the value of the egpSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgpSrcKey(JAXBElement<String> value) {
        this.egpSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the egpRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgpRegistrationDate() {
        return egpRegistrationDate;
    }

    /**
     * Sets the value of the egpRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgpRegistrationDate(JAXBElement<String> value) {
        this.egpRegistrationDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the egpCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgpCxaKey() {
        return egpCxaKey;
    }

    /**
     * Sets the value of the egpCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgpCxaKey(JAXBElement<String> value) {
        this.egpCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the egpCphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgpCphKey() {
        return egpCphKey;
    }

    /**
     * Sets the value of the egpCphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgpCphKey(JAXBElement<String> value) {
        this.egpCphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the egpEmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgpEmlKey() {
        return egpEmlKey;
    }

    /**
     * Sets the value of the egpEmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgpEmlKey(JAXBElement<String> value) {
        this.egpEmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the egpCfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgpCfxKey() {
        return egpCfxKey;
    }

    /**
     * Sets the value of the egpCfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgpCfxKey(JAXBElement<String> value) {
        this.egpCfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the egpUrlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgpUrlKey() {
        return egpUrlKey;
    }

    /**
     * Sets the value of the egpUrlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgpUrlKey(JAXBElement<String> value) {
        this.egpUrlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the egpRgtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgpRgtKey() {
        return egpRgtKey;
    }

    /**
     * Sets the value of the egpRgtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgpRgtKey(JAXBElement<String> value) {
        this.egpRgtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the egpPrefCommMeth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgpPrefCommMeth() {
        return egpPrefCommMeth;
    }

    /**
     * Sets the value of the egpPrefCommMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgpPrefCommMeth(JAXBElement<String> value) {
        this.egpPrefCommMeth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the egpEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgpEntityKey() {
        return egpEntityKey;
    }

    /**
     * Sets the value of the egpEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgpEntityKey(JAXBElement<String> value) {
        this.egpEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the egpCancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgpCancelDate() {
        return egpCancelDate;
    }

    /**
     * Sets the value of the egpCancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgpCancelDate(JAXBElement<String> value) {
        this.egpCancelDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the egpCancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgpCancelReason() {
        return egpCancelReason;
    }

    /**
     * Sets the value of the egpCancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgpCancelReason(JAXBElement<String> value) {
        this.egpCancelReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the egpNumberOfRegistrants property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEgpNumberOfRegistrants() {
        return egpNumberOfRegistrants;
    }

    /**
     * Sets the value of the egpNumberOfRegistrants property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEgpNumberOfRegistrants(JAXBElement<Integer> value) {
        this.egpNumberOfRegistrants = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the egpBupPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEgpBupPrdKey() {
        return egpBupPrdKey;
    }

    /**
     * Sets the value of the egpBupPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEgpBupPrdKey(JAXBElement<String> value) {
        this.egpBupPrdKey = ((JAXBElement<String> ) value);
    }

}
