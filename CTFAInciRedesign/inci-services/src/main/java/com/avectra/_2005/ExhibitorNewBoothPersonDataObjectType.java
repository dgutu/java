
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExhibitorNew_Booth_Person_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExhibitorNew_Booth_Person_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bpr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bpr_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bpr_exh_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bpr_evt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bpr_reg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bpr_badge_name" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="bpr_org_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bpr_pref_comm_method" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="bpr_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bpr_cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bpr_cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bpr_url_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bpr_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="bpr_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="bpr_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="bpr_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="bpr_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="bpr_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bpr_eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bpr_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bpr_hxb_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bpr_type" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="bpr_inv_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="bpr_ivd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bpr_cancel_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="bpr_odd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExhibitorNew_Booth_Person_DataObjectType", propOrder = {
    "bprKey",
    "bprCstKey",
    "bprExhKey",
    "bprEvtKey",
    "bprRegKey",
    "bprBadgeName",
    "bprOrgCstKey",
    "bprPrefCommMethod",
    "bprCxaKey",
    "bprCphKey",
    "bprCfxKey",
    "bprUrlKey",
    "bprAddUser",
    "bprAddDate",
    "bprChangeUser",
    "bprChangeDate",
    "bprDeleteFlag",
    "bprKeyExt",
    "bprEmlKey",
    "bprEntityKey",
    "bprHxbKey",
    "bprType",
    "bprInvCode",
    "bprIvdKey",
    "bprCancelDate",
    "bprOddKey"
})
public class ExhibitorNewBoothPersonDataObjectType {

    @XmlElementRef(name = "bpr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprKey;
    @XmlElementRef(name = "bpr_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprCstKey;
    @XmlElementRef(name = "bpr_exh_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprExhKey;
    @XmlElementRef(name = "bpr_evt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprEvtKey;
    @XmlElementRef(name = "bpr_reg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprRegKey;
    @XmlElementRef(name = "bpr_badge_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprBadgeName;
    @XmlElementRef(name = "bpr_org_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprOrgCstKey;
    @XmlElementRef(name = "bpr_pref_comm_method", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprPrefCommMethod;
    @XmlElementRef(name = "bpr_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprCxaKey;
    @XmlElementRef(name = "bpr_cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprCphKey;
    @XmlElementRef(name = "bpr_cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprCfxKey;
    @XmlElementRef(name = "bpr_url_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprUrlKey;
    @XmlElementRef(name = "bpr_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprAddUser;
    @XmlElementRef(name = "bpr_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprAddDate;
    @XmlElementRef(name = "bpr_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprChangeUser;
    @XmlElementRef(name = "bpr_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprChangeDate;
    @XmlElementRef(name = "bpr_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bprDeleteFlag;
    @XmlElementRef(name = "bpr_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprKeyExt;
    @XmlElementRef(name = "bpr_eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprEmlKey;
    @XmlElementRef(name = "bpr_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprEntityKey;
    @XmlElementRef(name = "bpr_hxb_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprHxbKey;
    @XmlElementRef(name = "bpr_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprType;
    @XmlElementRef(name = "bpr_inv_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprInvCode;
    @XmlElementRef(name = "bpr_ivd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprIvdKey;
    @XmlElementRef(name = "bpr_cancel_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprCancelDate;
    @XmlElementRef(name = "bpr_odd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bprOddKey;

    /**
     * Gets the value of the bprKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprKey() {
        return bprKey;
    }

    /**
     * Sets the value of the bprKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprKey(JAXBElement<String> value) {
        this.bprKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bprCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprCstKey() {
        return bprCstKey;
    }

    /**
     * Sets the value of the bprCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprCstKey(JAXBElement<String> value) {
        this.bprCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bprExhKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprExhKey() {
        return bprExhKey;
    }

    /**
     * Sets the value of the bprExhKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprExhKey(JAXBElement<String> value) {
        this.bprExhKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bprEvtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprEvtKey() {
        return bprEvtKey;
    }

    /**
     * Sets the value of the bprEvtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprEvtKey(JAXBElement<String> value) {
        this.bprEvtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bprRegKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprRegKey() {
        return bprRegKey;
    }

    /**
     * Sets the value of the bprRegKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprRegKey(JAXBElement<String> value) {
        this.bprRegKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bprBadgeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprBadgeName() {
        return bprBadgeName;
    }

    /**
     * Sets the value of the bprBadgeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprBadgeName(JAXBElement<String> value) {
        this.bprBadgeName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bprOrgCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprOrgCstKey() {
        return bprOrgCstKey;
    }

    /**
     * Sets the value of the bprOrgCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprOrgCstKey(JAXBElement<String> value) {
        this.bprOrgCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bprPrefCommMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprPrefCommMethod() {
        return bprPrefCommMethod;
    }

    /**
     * Sets the value of the bprPrefCommMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprPrefCommMethod(JAXBElement<String> value) {
        this.bprPrefCommMethod = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bprCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprCxaKey() {
        return bprCxaKey;
    }

    /**
     * Sets the value of the bprCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprCxaKey(JAXBElement<String> value) {
        this.bprCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bprCphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprCphKey() {
        return bprCphKey;
    }

    /**
     * Sets the value of the bprCphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprCphKey(JAXBElement<String> value) {
        this.bprCphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bprCfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprCfxKey() {
        return bprCfxKey;
    }

    /**
     * Sets the value of the bprCfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprCfxKey(JAXBElement<String> value) {
        this.bprCfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bprUrlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprUrlKey() {
        return bprUrlKey;
    }

    /**
     * Sets the value of the bprUrlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprUrlKey(JAXBElement<String> value) {
        this.bprUrlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bprAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprAddUser() {
        return bprAddUser;
    }

    /**
     * Sets the value of the bprAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprAddUser(JAXBElement<String> value) {
        this.bprAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bprAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprAddDate() {
        return bprAddDate;
    }

    /**
     * Sets the value of the bprAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprAddDate(JAXBElement<String> value) {
        this.bprAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bprChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprChangeUser() {
        return bprChangeUser;
    }

    /**
     * Sets the value of the bprChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprChangeUser(JAXBElement<String> value) {
        this.bprChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bprChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprChangeDate() {
        return bprChangeDate;
    }

    /**
     * Sets the value of the bprChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprChangeDate(JAXBElement<String> value) {
        this.bprChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bprDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBprDeleteFlag() {
        return bprDeleteFlag;
    }

    /**
     * Sets the value of the bprDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBprDeleteFlag(JAXBElement<Short> value) {
        this.bprDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bprKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprKeyExt() {
        return bprKeyExt;
    }

    /**
     * Sets the value of the bprKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprKeyExt(JAXBElement<String> value) {
        this.bprKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bprEmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprEmlKey() {
        return bprEmlKey;
    }

    /**
     * Sets the value of the bprEmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprEmlKey(JAXBElement<String> value) {
        this.bprEmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bprEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprEntityKey() {
        return bprEntityKey;
    }

    /**
     * Sets the value of the bprEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprEntityKey(JAXBElement<String> value) {
        this.bprEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bprHxbKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprHxbKey() {
        return bprHxbKey;
    }

    /**
     * Sets the value of the bprHxbKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprHxbKey(JAXBElement<String> value) {
        this.bprHxbKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bprType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprType() {
        return bprType;
    }

    /**
     * Sets the value of the bprType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprType(JAXBElement<String> value) {
        this.bprType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bprInvCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprInvCode() {
        return bprInvCode;
    }

    /**
     * Sets the value of the bprInvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprInvCode(JAXBElement<String> value) {
        this.bprInvCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bprIvdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprIvdKey() {
        return bprIvdKey;
    }

    /**
     * Sets the value of the bprIvdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprIvdKey(JAXBElement<String> value) {
        this.bprIvdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bprCancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprCancelDate() {
        return bprCancelDate;
    }

    /**
     * Sets the value of the bprCancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprCancelDate(JAXBElement<String> value) {
        this.bprCancelDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bprOddKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBprOddKey() {
        return bprOddKey;
    }

    /**
     * Sets the value of the bprOddKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBprOddKey(JAXBElement<String> value) {
        this.bprOddKey = ((JAXBElement<String> ) value);
    }

}
