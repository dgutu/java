
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Individual_Home_Fax_XRef_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Individual_Home_Fax_XRef_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cf2__cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cf2__cfx_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cf2__cfx_fax_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cf2__cfx_fxt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cf2__cfx_cst_link_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cf2__cfx_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cf2__cfx_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cf2__cfx_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cf2__cfx_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cf2__cfx_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cf2__cfx_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cf2__cfx_unlisted_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cf2__cfx_fax_number_complete" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="cf2__cfx_extension" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cf2__cfx_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cf2__cfx_primary" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cf2__cfx_owner" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Individual_Home_Fax_XRef_DataObjectType", propOrder = {
    "cf2CfxKey",
    "cf2CfxCstKey",
    "cf2CfxFaxKey",
    "cf2CfxFxtKey",
    "cf2CfxCstLinkKey",
    "cf2CfxAddUser",
    "cf2CfxAddDate",
    "cf2CfxChangeUser",
    "cf2CfxChangeDate",
    "cf2CfxDeleteFlag",
    "cf2CfxKeyExt",
    "cf2CfxUnlistedFlag",
    "cf2CfxFaxNumberComplete",
    "cf2CfxExtension",
    "cf2CfxEntityKey",
    "cf2CfxPrimary",
    "cf2CfxOwner"
})
public class IndividualHomeFaxXRefDataObjectType {

    @XmlElementRef(name = "cf2__cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf2CfxKey;
    @XmlElementRef(name = "cf2__cfx_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf2CfxCstKey;
    @XmlElementRef(name = "cf2__cfx_fax_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf2CfxFaxKey;
    @XmlElementRef(name = "cf2__cfx_fxt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf2CfxFxtKey;
    @XmlElementRef(name = "cf2__cfx_cst_link_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf2CfxCstLinkKey;
    @XmlElementRef(name = "cf2__cfx_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf2CfxAddUser;
    @XmlElementRef(name = "cf2__cfx_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf2CfxAddDate;
    @XmlElementRef(name = "cf2__cfx_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf2CfxChangeUser;
    @XmlElementRef(name = "cf2__cfx_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf2CfxChangeDate;
    @XmlElementRef(name = "cf2__cfx_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cf2CfxDeleteFlag;
    @XmlElementRef(name = "cf2__cfx_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf2CfxKeyExt;
    @XmlElementRef(name = "cf2__cfx_unlisted_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cf2CfxUnlistedFlag;
    @XmlElementRef(name = "cf2__cfx_fax_number_complete", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf2CfxFaxNumberComplete;
    @XmlElementRef(name = "cf2__cfx_extension", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf2CfxExtension;
    @XmlElementRef(name = "cf2__cfx_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cf2CfxEntityKey;
    @XmlElementRef(name = "cf2__cfx_primary", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cf2CfxPrimary;
    @XmlElementRef(name = "cf2__cfx_owner", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cf2CfxOwner;

    /**
     * Gets the value of the cf2CfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf2CfxKey() {
        return cf2CfxKey;
    }

    /**
     * Sets the value of the cf2CfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf2CfxKey(JAXBElement<String> value) {
        this.cf2CfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf2CfxCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf2CfxCstKey() {
        return cf2CfxCstKey;
    }

    /**
     * Sets the value of the cf2CfxCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf2CfxCstKey(JAXBElement<String> value) {
        this.cf2CfxCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf2CfxFaxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf2CfxFaxKey() {
        return cf2CfxFaxKey;
    }

    /**
     * Sets the value of the cf2CfxFaxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf2CfxFaxKey(JAXBElement<String> value) {
        this.cf2CfxFaxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf2CfxFxtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf2CfxFxtKey() {
        return cf2CfxFxtKey;
    }

    /**
     * Sets the value of the cf2CfxFxtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf2CfxFxtKey(JAXBElement<String> value) {
        this.cf2CfxFxtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf2CfxCstLinkKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf2CfxCstLinkKey() {
        return cf2CfxCstLinkKey;
    }

    /**
     * Sets the value of the cf2CfxCstLinkKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf2CfxCstLinkKey(JAXBElement<String> value) {
        this.cf2CfxCstLinkKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf2CfxAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf2CfxAddUser() {
        return cf2CfxAddUser;
    }

    /**
     * Sets the value of the cf2CfxAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf2CfxAddUser(JAXBElement<String> value) {
        this.cf2CfxAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf2CfxAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf2CfxAddDate() {
        return cf2CfxAddDate;
    }

    /**
     * Sets the value of the cf2CfxAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf2CfxAddDate(JAXBElement<String> value) {
        this.cf2CfxAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf2CfxChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf2CfxChangeUser() {
        return cf2CfxChangeUser;
    }

    /**
     * Sets the value of the cf2CfxChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf2CfxChangeUser(JAXBElement<String> value) {
        this.cf2CfxChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf2CfxChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf2CfxChangeDate() {
        return cf2CfxChangeDate;
    }

    /**
     * Sets the value of the cf2CfxChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf2CfxChangeDate(JAXBElement<String> value) {
        this.cf2CfxChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf2CfxDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCf2CfxDeleteFlag() {
        return cf2CfxDeleteFlag;
    }

    /**
     * Sets the value of the cf2CfxDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCf2CfxDeleteFlag(JAXBElement<Short> value) {
        this.cf2CfxDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cf2CfxKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf2CfxKeyExt() {
        return cf2CfxKeyExt;
    }

    /**
     * Sets the value of the cf2CfxKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf2CfxKeyExt(JAXBElement<String> value) {
        this.cf2CfxKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf2CfxUnlistedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCf2CfxUnlistedFlag() {
        return cf2CfxUnlistedFlag;
    }

    /**
     * Sets the value of the cf2CfxUnlistedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCf2CfxUnlistedFlag(JAXBElement<Short> value) {
        this.cf2CfxUnlistedFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cf2CfxFaxNumberComplete property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf2CfxFaxNumberComplete() {
        return cf2CfxFaxNumberComplete;
    }

    /**
     * Sets the value of the cf2CfxFaxNumberComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf2CfxFaxNumberComplete(JAXBElement<String> value) {
        this.cf2CfxFaxNumberComplete = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf2CfxExtension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf2CfxExtension() {
        return cf2CfxExtension;
    }

    /**
     * Sets the value of the cf2CfxExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf2CfxExtension(JAXBElement<String> value) {
        this.cf2CfxExtension = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf2CfxEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCf2CfxEntityKey() {
        return cf2CfxEntityKey;
    }

    /**
     * Sets the value of the cf2CfxEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCf2CfxEntityKey(JAXBElement<String> value) {
        this.cf2CfxEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cf2CfxPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCf2CfxPrimary() {
        return cf2CfxPrimary;
    }

    /**
     * Sets the value of the cf2CfxPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCf2CfxPrimary(JAXBElement<Short> value) {
        this.cf2CfxPrimary = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cf2CfxOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCf2CfxOwner() {
        return cf2CfxOwner;
    }

    /**
     * Sets the value of the cf2CfxOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCf2CfxOwner(JAXBElement<Short> value) {
        this.cf2CfxOwner = ((JAXBElement<Short> ) value);
    }

}
