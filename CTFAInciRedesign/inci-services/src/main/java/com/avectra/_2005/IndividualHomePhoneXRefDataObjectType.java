
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Individual_Home_Phone_XRef_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Individual_Home_Phone_XRef_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cp2__cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cp2__cph_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cp2__cph_phn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cp2__cph_pht_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cp2__cph_cst_link_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cp2__cph_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cp2__cph_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cp2__cph_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cp2__cph_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cp2__cph_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cp2__cph_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cp2__cph_unlisted_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cp2__cph_phn_number_complete" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="cp2__cph_extension" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cp2__cph_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cp2__cph_primary" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cp2__cph_owner" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Individual_Home_Phone_XRef_DataObjectType", propOrder = {
    "cp2CphKey",
    "cp2CphCstKey",
    "cp2CphPhnKey",
    "cp2CphPhtKey",
    "cp2CphCstLinkKey",
    "cp2CphAddUser",
    "cp2CphAddDate",
    "cp2CphChangeUser",
    "cp2CphChangeDate",
    "cp2CphDeleteFlag",
    "cp2CphKeyExt",
    "cp2CphUnlistedFlag",
    "cp2CphPhnNumberComplete",
    "cp2CphExtension",
    "cp2CphEntityKey",
    "cp2CphPrimary",
    "cp2CphOwner"
})
public class IndividualHomePhoneXRefDataObjectType {

    @XmlElementRef(name = "cp2__cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp2CphKey;
    @XmlElementRef(name = "cp2__cph_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp2CphCstKey;
    @XmlElementRef(name = "cp2__cph_phn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp2CphPhnKey;
    @XmlElementRef(name = "cp2__cph_pht_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp2CphPhtKey;
    @XmlElementRef(name = "cp2__cph_cst_link_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp2CphCstLinkKey;
    @XmlElementRef(name = "cp2__cph_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp2CphAddUser;
    @XmlElementRef(name = "cp2__cph_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp2CphAddDate;
    @XmlElementRef(name = "cp2__cph_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp2CphChangeUser;
    @XmlElementRef(name = "cp2__cph_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp2CphChangeDate;
    @XmlElementRef(name = "cp2__cph_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cp2CphDeleteFlag;
    @XmlElementRef(name = "cp2__cph_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp2CphKeyExt;
    @XmlElementRef(name = "cp2__cph_unlisted_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cp2CphUnlistedFlag;
    @XmlElementRef(name = "cp2__cph_phn_number_complete", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp2CphPhnNumberComplete;
    @XmlElementRef(name = "cp2__cph_extension", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp2CphExtension;
    @XmlElementRef(name = "cp2__cph_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cp2CphEntityKey;
    @XmlElementRef(name = "cp2__cph_primary", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cp2CphPrimary;
    @XmlElementRef(name = "cp2__cph_owner", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cp2CphOwner;

    /**
     * Gets the value of the cp2CphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp2CphKey() {
        return cp2CphKey;
    }

    /**
     * Sets the value of the cp2CphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp2CphKey(JAXBElement<String> value) {
        this.cp2CphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp2CphCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp2CphCstKey() {
        return cp2CphCstKey;
    }

    /**
     * Sets the value of the cp2CphCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp2CphCstKey(JAXBElement<String> value) {
        this.cp2CphCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp2CphPhnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp2CphPhnKey() {
        return cp2CphPhnKey;
    }

    /**
     * Sets the value of the cp2CphPhnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp2CphPhnKey(JAXBElement<String> value) {
        this.cp2CphPhnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp2CphPhtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp2CphPhtKey() {
        return cp2CphPhtKey;
    }

    /**
     * Sets the value of the cp2CphPhtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp2CphPhtKey(JAXBElement<String> value) {
        this.cp2CphPhtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp2CphCstLinkKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp2CphCstLinkKey() {
        return cp2CphCstLinkKey;
    }

    /**
     * Sets the value of the cp2CphCstLinkKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp2CphCstLinkKey(JAXBElement<String> value) {
        this.cp2CphCstLinkKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp2CphAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp2CphAddUser() {
        return cp2CphAddUser;
    }

    /**
     * Sets the value of the cp2CphAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp2CphAddUser(JAXBElement<String> value) {
        this.cp2CphAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp2CphAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp2CphAddDate() {
        return cp2CphAddDate;
    }

    /**
     * Sets the value of the cp2CphAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp2CphAddDate(JAXBElement<String> value) {
        this.cp2CphAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp2CphChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp2CphChangeUser() {
        return cp2CphChangeUser;
    }

    /**
     * Sets the value of the cp2CphChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp2CphChangeUser(JAXBElement<String> value) {
        this.cp2CphChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp2CphChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp2CphChangeDate() {
        return cp2CphChangeDate;
    }

    /**
     * Sets the value of the cp2CphChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp2CphChangeDate(JAXBElement<String> value) {
        this.cp2CphChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp2CphDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCp2CphDeleteFlag() {
        return cp2CphDeleteFlag;
    }

    /**
     * Sets the value of the cp2CphDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCp2CphDeleteFlag(JAXBElement<Short> value) {
        this.cp2CphDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cp2CphKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp2CphKeyExt() {
        return cp2CphKeyExt;
    }

    /**
     * Sets the value of the cp2CphKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp2CphKeyExt(JAXBElement<String> value) {
        this.cp2CphKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp2CphUnlistedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCp2CphUnlistedFlag() {
        return cp2CphUnlistedFlag;
    }

    /**
     * Sets the value of the cp2CphUnlistedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCp2CphUnlistedFlag(JAXBElement<Short> value) {
        this.cp2CphUnlistedFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cp2CphPhnNumberComplete property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp2CphPhnNumberComplete() {
        return cp2CphPhnNumberComplete;
    }

    /**
     * Sets the value of the cp2CphPhnNumberComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp2CphPhnNumberComplete(JAXBElement<String> value) {
        this.cp2CphPhnNumberComplete = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp2CphExtension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp2CphExtension() {
        return cp2CphExtension;
    }

    /**
     * Sets the value of the cp2CphExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp2CphExtension(JAXBElement<String> value) {
        this.cp2CphExtension = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp2CphEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCp2CphEntityKey() {
        return cp2CphEntityKey;
    }

    /**
     * Sets the value of the cp2CphEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCp2CphEntityKey(JAXBElement<String> value) {
        this.cp2CphEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cp2CphPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCp2CphPrimary() {
        return cp2CphPrimary;
    }

    /**
     * Sets the value of the cp2CphPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCp2CphPrimary(JAXBElement<Short> value) {
        this.cp2CphPrimary = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cp2CphOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCp2CphOwner() {
        return cp2CphOwner;
    }

    /**
     * Sets the value of the cp2CphOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCp2CphOwner(JAXBElement<Short> value) {
        this.cp2CphOwner = ((JAXBElement<Short> ) value);
    }

}
