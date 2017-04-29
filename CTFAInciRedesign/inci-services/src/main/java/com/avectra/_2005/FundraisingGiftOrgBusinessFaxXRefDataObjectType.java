
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Org_Business_Fax_XRef_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Org_Business_Fax_XRef_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cf6__cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cf6__cfx_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cf6__cfx_fax_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cf6__cfx_fxt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cf6__cfx_cst_link_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cf6__cfx_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cf6__cfx_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cf6__cfx_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cf6__cfx_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cf6__cfx_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cf6__cfx_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cf6__cfx_unlisted_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cf6__cfx_fax_number_complete" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="cf6__cfx_extension" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cf6__cfx_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cf6__cfx_primary" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cf6__cfx_owner" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Org_Business_Fax_XRef_DataObjectType", propOrder = {
    "cf6CfxKey",
    "cf6CfxCstKey",
    "cf6CfxFaxKey",
    "cf6CfxFxtKey",
    "cf6CfxCstLinkKey",
    "cf6CfxAddUser",
    "cf6CfxAddDate",
    "cf6CfxChangeUser",
    "cf6CfxChangeDate",
    "cf6CfxDeleteFlag",
    "cf6CfxKeyExt",
    "cf6CfxUnlistedFlag",
    "cf6CfxFaxNumberComplete",
    "cf6CfxExtension",
    "cf6CfxEntityKey",
    "cf6CfxPrimary",
    "cf6CfxOwner"
})
public class FundraisingGiftOrgBusinessFaxXRefDataObjectType {

    @XmlElementRef(name = "cf6__cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf6CfxKey;
    @XmlElementRef(name = "cf6__cfx_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf6CfxCstKey;
    @XmlElementRef(name = "cf6__cfx_fax_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf6CfxFaxKey;
    @XmlElementRef(name = "cf6__cfx_fxt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf6CfxFxtKey;
    @XmlElementRef(name = "cf6__cfx_cst_link_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf6CfxCstLinkKey;
    @XmlElementRef(name = "cf6__cfx_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf6CfxAddUser;
    @XmlElementRef(name = "cf6__cfx_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf6CfxAddDate;
    @XmlElementRef(name = "cf6__cfx_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf6CfxChangeUser;
    @XmlElementRef(name = "cf6__cfx_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf6CfxChangeDate;
    @XmlElementRef(name = "cf6__cfx_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cf6CfxDeleteFlag;
    @XmlElementRef(name = "cf6__cfx_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf6CfxKeyExt;
    @XmlElementRef(name = "cf6__cfx_unlisted_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cf6CfxUnlistedFlag;
    @XmlElementRef(name = "cf6__cfx_fax_number_complete", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf6CfxFaxNumberComplete;
    @XmlElementRef(name = "cf6__cfx_extension", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf6CfxExtension;
    @XmlElementRef(name = "cf6__cfx_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf6CfxEntityKey;
    @XmlElementRef(name = "cf6__cfx_primary", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cf6CfxPrimary;
    @XmlElementRef(name = "cf6__cfx_owner", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cf6CfxOwner;

    /**
     * Gets the value of the cf6CfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf6CfxKey() {
        return cf6CfxKey;
    }

    /**
     * Sets the value of the cf6CfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf6CfxKey(JAXBElement<String> value) {
        this.cf6CfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf6CfxCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf6CfxCstKey() {
        return cf6CfxCstKey;
    }

    /**
     * Sets the value of the cf6CfxCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf6CfxCstKey(JAXBElement<String> value) {
        this.cf6CfxCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf6CfxFaxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf6CfxFaxKey() {
        return cf6CfxFaxKey;
    }

    /**
     * Sets the value of the cf6CfxFaxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf6CfxFaxKey(JAXBElement<String> value) {
        this.cf6CfxFaxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf6CfxFxtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf6CfxFxtKey() {
        return cf6CfxFxtKey;
    }

    /**
     * Sets the value of the cf6CfxFxtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf6CfxFxtKey(JAXBElement<String> value) {
        this.cf6CfxFxtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf6CfxCstLinkKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf6CfxCstLinkKey() {
        return cf6CfxCstLinkKey;
    }

    /**
     * Sets the value of the cf6CfxCstLinkKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf6CfxCstLinkKey(JAXBElement<String> value) {
        this.cf6CfxCstLinkKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf6CfxAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf6CfxAddUser() {
        return cf6CfxAddUser;
    }

    /**
     * Sets the value of the cf6CfxAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf6CfxAddUser(JAXBElement<String> value) {
        this.cf6CfxAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf6CfxAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf6CfxAddDate() {
        return cf6CfxAddDate;
    }

    /**
     * Sets the value of the cf6CfxAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf6CfxAddDate(JAXBElement<String> value) {
        this.cf6CfxAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf6CfxChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf6CfxChangeUser() {
        return cf6CfxChangeUser;
    }

    /**
     * Sets the value of the cf6CfxChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf6CfxChangeUser(JAXBElement<String> value) {
        this.cf6CfxChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf6CfxChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf6CfxChangeDate() {
        return cf6CfxChangeDate;
    }

    /**
     * Sets the value of the cf6CfxChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf6CfxChangeDate(JAXBElement<String> value) {
        this.cf6CfxChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf6CfxDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCf6CfxDeleteFlag() {
        return cf6CfxDeleteFlag;
    }

    /**
     * Sets the value of the cf6CfxDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCf6CfxDeleteFlag(JAXBElement<Short> value) {
        this.cf6CfxDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cf6CfxKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf6CfxKeyExt() {
        return cf6CfxKeyExt;
    }

    /**
     * Sets the value of the cf6CfxKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf6CfxKeyExt(JAXBElement<String> value) {
        this.cf6CfxKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf6CfxUnlistedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCf6CfxUnlistedFlag() {
        return cf6CfxUnlistedFlag;
    }

    /**
     * Sets the value of the cf6CfxUnlistedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCf6CfxUnlistedFlag(JAXBElement<Short> value) {
        this.cf6CfxUnlistedFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cf6CfxFaxNumberComplete property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf6CfxFaxNumberComplete() {
        return cf6CfxFaxNumberComplete;
    }

    /**
     * Sets the value of the cf6CfxFaxNumberComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf6CfxFaxNumberComplete(JAXBElement<String> value) {
        this.cf6CfxFaxNumberComplete = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf6CfxExtension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf6CfxExtension() {
        return cf6CfxExtension;
    }

    /**
     * Sets the value of the cf6CfxExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf6CfxExtension(JAXBElement<String> value) {
        this.cf6CfxExtension = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf6CfxEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf6CfxEntityKey() {
        return cf6CfxEntityKey;
    }

    /**
     * Sets the value of the cf6CfxEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf6CfxEntityKey(JAXBElement<String> value) {
        this.cf6CfxEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf6CfxPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCf6CfxPrimary() {
        return cf6CfxPrimary;
    }

    /**
     * Sets the value of the cf6CfxPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCf6CfxPrimary(JAXBElement<Short> value) {
        this.cf6CfxPrimary = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cf6CfxOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCf6CfxOwner() {
        return cf6CfxOwner;
    }

    /**
     * Sets the value of the cf6CfxOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCf6CfxOwner(JAXBElement<Short> value) {
        this.cf6CfxOwner = ((JAXBElement<Short> ) value);
    }

}
