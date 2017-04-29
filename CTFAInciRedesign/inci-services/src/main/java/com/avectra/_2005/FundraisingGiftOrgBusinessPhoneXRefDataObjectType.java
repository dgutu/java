
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Org_Business_Phone_XRef_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Org_Business_Phone_XRef_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cp6__cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cp6__cph_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cp6__cph_phn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cp6__cph_pht_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cp6__cph_cst_link_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cp6__cph_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cp6__cph_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cp6__cph_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cp6__cph_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cp6__cph_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cp6__cph_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cp6__cph_unlisted_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cp6__cph_phn_number_complete" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="cp6__cph_extension" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cp6__cph_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cp6__cph_primary" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cp6__cph_owner" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Org_Business_Phone_XRef_DataObjectType", propOrder = {
    "cp6CphKey",
    "cp6CphCstKey",
    "cp6CphPhnKey",
    "cp6CphPhtKey",
    "cp6CphCstLinkKey",
    "cp6CphAddUser",
    "cp6CphAddDate",
    "cp6CphChangeUser",
    "cp6CphChangeDate",
    "cp6CphDeleteFlag",
    "cp6CphKeyExt",
    "cp6CphUnlistedFlag",
    "cp6CphPhnNumberComplete",
    "cp6CphExtension",
    "cp6CphEntityKey",
    "cp6CphPrimary",
    "cp6CphOwner"
})
public class FundraisingGiftOrgBusinessPhoneXRefDataObjectType {

    @XmlElementRef(name = "cp6__cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp6CphKey;
    @XmlElementRef(name = "cp6__cph_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp6CphCstKey;
    @XmlElementRef(name = "cp6__cph_phn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp6CphPhnKey;
    @XmlElementRef(name = "cp6__cph_pht_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp6CphPhtKey;
    @XmlElementRef(name = "cp6__cph_cst_link_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp6CphCstLinkKey;
    @XmlElementRef(name = "cp6__cph_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp6CphAddUser;
    @XmlElementRef(name = "cp6__cph_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp6CphAddDate;
    @XmlElementRef(name = "cp6__cph_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp6CphChangeUser;
    @XmlElementRef(name = "cp6__cph_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp6CphChangeDate;
    @XmlElementRef(name = "cp6__cph_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cp6CphDeleteFlag;
    @XmlElementRef(name = "cp6__cph_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp6CphKeyExt;
    @XmlElementRef(name = "cp6__cph_unlisted_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cp6CphUnlistedFlag;
    @XmlElementRef(name = "cp6__cph_phn_number_complete", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp6CphPhnNumberComplete;
    @XmlElementRef(name = "cp6__cph_extension", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp6CphExtension;
    @XmlElementRef(name = "cp6__cph_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp6CphEntityKey;
    @XmlElementRef(name = "cp6__cph_primary", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cp6CphPrimary;
    @XmlElementRef(name = "cp6__cph_owner", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cp6CphOwner;

    /**
     * Gets the value of the cp6CphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp6CphKey() {
        return cp6CphKey;
    }

    /**
     * Sets the value of the cp6CphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp6CphKey(JAXBElement<String> value) {
        this.cp6CphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp6CphCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp6CphCstKey() {
        return cp6CphCstKey;
    }

    /**
     * Sets the value of the cp6CphCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp6CphCstKey(JAXBElement<String> value) {
        this.cp6CphCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp6CphPhnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp6CphPhnKey() {
        return cp6CphPhnKey;
    }

    /**
     * Sets the value of the cp6CphPhnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp6CphPhnKey(JAXBElement<String> value) {
        this.cp6CphPhnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp6CphPhtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp6CphPhtKey() {
        return cp6CphPhtKey;
    }

    /**
     * Sets the value of the cp6CphPhtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp6CphPhtKey(JAXBElement<String> value) {
        this.cp6CphPhtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp6CphCstLinkKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp6CphCstLinkKey() {
        return cp6CphCstLinkKey;
    }

    /**
     * Sets the value of the cp6CphCstLinkKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp6CphCstLinkKey(JAXBElement<String> value) {
        this.cp6CphCstLinkKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp6CphAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp6CphAddUser() {
        return cp6CphAddUser;
    }

    /**
     * Sets the value of the cp6CphAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp6CphAddUser(JAXBElement<String> value) {
        this.cp6CphAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp6CphAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp6CphAddDate() {
        return cp6CphAddDate;
    }

    /**
     * Sets the value of the cp6CphAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp6CphAddDate(JAXBElement<String> value) {
        this.cp6CphAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp6CphChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp6CphChangeUser() {
        return cp6CphChangeUser;
    }

    /**
     * Sets the value of the cp6CphChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp6CphChangeUser(JAXBElement<String> value) {
        this.cp6CphChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp6CphChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp6CphChangeDate() {
        return cp6CphChangeDate;
    }

    /**
     * Sets the value of the cp6CphChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp6CphChangeDate(JAXBElement<String> value) {
        this.cp6CphChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp6CphDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCp6CphDeleteFlag() {
        return cp6CphDeleteFlag;
    }

    /**
     * Sets the value of the cp6CphDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCp6CphDeleteFlag(JAXBElement<Short> value) {
        this.cp6CphDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cp6CphKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp6CphKeyExt() {
        return cp6CphKeyExt;
    }

    /**
     * Sets the value of the cp6CphKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp6CphKeyExt(JAXBElement<String> value) {
        this.cp6CphKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp6CphUnlistedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCp6CphUnlistedFlag() {
        return cp6CphUnlistedFlag;
    }

    /**
     * Sets the value of the cp6CphUnlistedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCp6CphUnlistedFlag(JAXBElement<Short> value) {
        this.cp6CphUnlistedFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cp6CphPhnNumberComplete property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp6CphPhnNumberComplete() {
        return cp6CphPhnNumberComplete;
    }

    /**
     * Sets the value of the cp6CphPhnNumberComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp6CphPhnNumberComplete(JAXBElement<String> value) {
        this.cp6CphPhnNumberComplete = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp6CphExtension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp6CphExtension() {
        return cp6CphExtension;
    }

    /**
     * Sets the value of the cp6CphExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp6CphExtension(JAXBElement<String> value) {
        this.cp6CphExtension = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp6CphEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp6CphEntityKey() {
        return cp6CphEntityKey;
    }

    /**
     * Sets the value of the cp6CphEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp6CphEntityKey(JAXBElement<String> value) {
        this.cp6CphEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp6CphPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCp6CphPrimary() {
        return cp6CphPrimary;
    }

    /**
     * Sets the value of the cp6CphPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCp6CphPrimary(JAXBElement<Short> value) {
        this.cp6CphPrimary = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cp6CphOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCp6CphOwner() {
        return cp6CphOwner;
    }

    /**
     * Sets the value of the cp6CphOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCp6CphOwner(JAXBElement<Short> value) {
        this.cp6CphOwner = ((JAXBElement<Short> ) value);
    }

}
