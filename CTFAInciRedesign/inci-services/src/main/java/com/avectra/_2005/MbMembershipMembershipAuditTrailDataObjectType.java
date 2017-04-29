
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mb_membership_Membership_Audit_Trail_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mb_membership_Membership_Audit_Trail_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mat_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mat_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mat_asn_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="mat_mbt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mat_mbs_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mat_join_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="mat_renew_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="mat_expire_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="mat_terminate_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="mat_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mat_src_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="mat_opt_out" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="mat_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="mat_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="mat_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="mat_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="mat_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="mat_mbr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mat_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mat_mbr_chp_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mat_rejoin_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="mat_invoice_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="mat_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mat_terminate_reason" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="mat_mtr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mb_membership_Membership_Audit_Trail_DataObjectType", propOrder = {
    "matKey",
    "matCstKey",
    "matAsnCode",
    "matMbtKey",
    "matMbsKey",
    "matJoinDate",
    "matRenewDate",
    "matExpireDate",
    "matTerminateDate",
    "matSrcKey",
    "matSrcCode",
    "matOptOut",
    "matAddUser",
    "matAddDate",
    "matChangeUser",
    "matChangeDate",
    "matDeleteFlag",
    "matMbrKey",
    "matKeyExt",
    "matMbrChpCstKey",
    "matRejoinDate",
    "matInvoiceDate",
    "matEntityKey",
    "matTerminateReason",
    "matMtrKey"
})
public class MbMembershipMembershipAuditTrailDataObjectType {

    @XmlElementRef(name = "mat_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> matKey;
    @XmlElementRef(name = "mat_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> matCstKey;
    @XmlElementRef(name = "mat_asn_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> matAsnCode;
    @XmlElementRef(name = "mat_mbt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> matMbtKey;
    @XmlElementRef(name = "mat_mbs_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> matMbsKey;
    @XmlElementRef(name = "mat_join_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> matJoinDate;
    @XmlElementRef(name = "mat_renew_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> matRenewDate;
    @XmlElementRef(name = "mat_expire_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> matExpireDate;
    @XmlElementRef(name = "mat_terminate_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> matTerminateDate;
    @XmlElementRef(name = "mat_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> matSrcKey;
    @XmlElementRef(name = "mat_src_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> matSrcCode;
    @XmlElementRef(name = "mat_opt_out", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> matOptOut;
    @XmlElementRef(name = "mat_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> matAddUser;
    @XmlElementRef(name = "mat_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> matAddDate;
    @XmlElementRef(name = "mat_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> matChangeUser;
    @XmlElementRef(name = "mat_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> matChangeDate;
    @XmlElementRef(name = "mat_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> matDeleteFlag;
    @XmlElementRef(name = "mat_mbr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> matMbrKey;
    @XmlElementRef(name = "mat_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> matKeyExt;
    @XmlElementRef(name = "mat_mbr_chp_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> matMbrChpCstKey;
    @XmlElementRef(name = "mat_rejoin_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> matRejoinDate;
    @XmlElementRef(name = "mat_invoice_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> matInvoiceDate;
    @XmlElementRef(name = "mat_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> matEntityKey;
    @XmlElementRef(name = "mat_terminate_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> matTerminateReason;
    @XmlElementRef(name = "mat_mtr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> matMtrKey;

    /**
     * Gets the value of the matKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatKey() {
        return matKey;
    }

    /**
     * Sets the value of the matKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatKey(JAXBElement<String> value) {
        this.matKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatCstKey() {
        return matCstKey;
    }

    /**
     * Sets the value of the matCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatCstKey(JAXBElement<String> value) {
        this.matCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matAsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatAsnCode() {
        return matAsnCode;
    }

    /**
     * Sets the value of the matAsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatAsnCode(JAXBElement<String> value) {
        this.matAsnCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matMbtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatMbtKey() {
        return matMbtKey;
    }

    /**
     * Sets the value of the matMbtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatMbtKey(JAXBElement<String> value) {
        this.matMbtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matMbsKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatMbsKey() {
        return matMbsKey;
    }

    /**
     * Sets the value of the matMbsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatMbsKey(JAXBElement<String> value) {
        this.matMbsKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matJoinDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatJoinDate() {
        return matJoinDate;
    }

    /**
     * Sets the value of the matJoinDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatJoinDate(JAXBElement<String> value) {
        this.matJoinDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matRenewDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatRenewDate() {
        return matRenewDate;
    }

    /**
     * Sets the value of the matRenewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatRenewDate(JAXBElement<String> value) {
        this.matRenewDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatExpireDate() {
        return matExpireDate;
    }

    /**
     * Sets the value of the matExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatExpireDate(JAXBElement<String> value) {
        this.matExpireDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matTerminateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatTerminateDate() {
        return matTerminateDate;
    }

    /**
     * Sets the value of the matTerminateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatTerminateDate(JAXBElement<String> value) {
        this.matTerminateDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatSrcKey() {
        return matSrcKey;
    }

    /**
     * Sets the value of the matSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatSrcKey(JAXBElement<String> value) {
        this.matSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatSrcCode() {
        return matSrcCode;
    }

    /**
     * Sets the value of the matSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatSrcCode(JAXBElement<String> value) {
        this.matSrcCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matOptOut property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMatOptOut() {
        return matOptOut;
    }

    /**
     * Sets the value of the matOptOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMatOptOut(JAXBElement<Short> value) {
        this.matOptOut = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the matAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatAddUser() {
        return matAddUser;
    }

    /**
     * Sets the value of the matAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatAddUser(JAXBElement<String> value) {
        this.matAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatAddDate() {
        return matAddDate;
    }

    /**
     * Sets the value of the matAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatAddDate(JAXBElement<String> value) {
        this.matAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatChangeUser() {
        return matChangeUser;
    }

    /**
     * Sets the value of the matChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatChangeUser(JAXBElement<String> value) {
        this.matChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatChangeDate() {
        return matChangeDate;
    }

    /**
     * Sets the value of the matChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatChangeDate(JAXBElement<String> value) {
        this.matChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMatDeleteFlag() {
        return matDeleteFlag;
    }

    /**
     * Sets the value of the matDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMatDeleteFlag(JAXBElement<Short> value) {
        this.matDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the matMbrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatMbrKey() {
        return matMbrKey;
    }

    /**
     * Sets the value of the matMbrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatMbrKey(JAXBElement<String> value) {
        this.matMbrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatKeyExt() {
        return matKeyExt;
    }

    /**
     * Sets the value of the matKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatKeyExt(JAXBElement<String> value) {
        this.matKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matMbrChpCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatMbrChpCstKey() {
        return matMbrChpCstKey;
    }

    /**
     * Sets the value of the matMbrChpCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatMbrChpCstKey(JAXBElement<String> value) {
        this.matMbrChpCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matRejoinDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatRejoinDate() {
        return matRejoinDate;
    }

    /**
     * Sets the value of the matRejoinDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatRejoinDate(JAXBElement<String> value) {
        this.matRejoinDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matInvoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatInvoiceDate() {
        return matInvoiceDate;
    }

    /**
     * Sets the value of the matInvoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatInvoiceDate(JAXBElement<String> value) {
        this.matInvoiceDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatEntityKey() {
        return matEntityKey;
    }

    /**
     * Sets the value of the matEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatEntityKey(JAXBElement<String> value) {
        this.matEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matTerminateReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatTerminateReason() {
        return matTerminateReason;
    }

    /**
     * Sets the value of the matTerminateReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatTerminateReason(JAXBElement<String> value) {
        this.matTerminateReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the matMtrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatMtrKey() {
        return matMtrKey;
    }

    /**
     * Sets the value of the matMtrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatMtrKey(JAXBElement<String> value) {
        this.matMtrKey = ((JAXBElement<String> ) value);
    }

}
