
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organization_Phone_XRef_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Phone_XRef_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cph_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cph_phn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cph_pht_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cph_cst_link_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cph_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cph_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cph_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cph_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cph_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cph_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cph_unlisted_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cph_phn_number_complete" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="cph_extension" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cph_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cph_primary" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cph_owner" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Phone_XRef_DataObjectType", propOrder = {
    "cphKey",
    "cphCstKey",
    "cphPhnKey",
    "cphPhtKey",
    "cphCstLinkKey",
    "cphAddUser",
    "cphAddDate",
    "cphChangeUser",
    "cphChangeDate",
    "cphDeleteFlag",
    "cphKeyExt",
    "cphUnlistedFlag",
    "cphPhnNumberComplete",
    "cphExtension",
    "cphEntityKey",
    "cphPrimary",
    "cphOwner"
})
public class OrganizationPhoneXRefDataObjectType {

    @XmlElementRef(name = "cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cphKey;
    @XmlElementRef(name = "cph_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cphCstKey;
    @XmlElementRef(name = "cph_phn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cphPhnKey;
    @XmlElementRef(name = "cph_pht_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cphPhtKey;
    @XmlElementRef(name = "cph_cst_link_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cphCstLinkKey;
    @XmlElementRef(name = "cph_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cphAddUser;
    @XmlElementRef(name = "cph_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cphAddDate;
    @XmlElementRef(name = "cph_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cphChangeUser;
    @XmlElementRef(name = "cph_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cphChangeDate;
    @XmlElementRef(name = "cph_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cphDeleteFlag;
    @XmlElementRef(name = "cph_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cphKeyExt;
    @XmlElementRef(name = "cph_unlisted_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cphUnlistedFlag;
    @XmlElementRef(name = "cph_phn_number_complete", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cphPhnNumberComplete;
    @XmlElementRef(name = "cph_extension", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cphExtension;
    @XmlElementRef(name = "cph_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cphEntityKey;
    @XmlElementRef(name = "cph_primary", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cphPrimary;
    @XmlElementRef(name = "cph_owner", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cphOwner;

    /**
     * Gets the value of the cphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCphKey() {
        return cphKey;
    }

    /**
     * Sets the value of the cphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCphKey(JAXBElement<String> value) {
        this.cphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cphCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCphCstKey() {
        return cphCstKey;
    }

    /**
     * Sets the value of the cphCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCphCstKey(JAXBElement<String> value) {
        this.cphCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cphPhnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCphPhnKey() {
        return cphPhnKey;
    }

    /**
     * Sets the value of the cphPhnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCphPhnKey(JAXBElement<String> value) {
        this.cphPhnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cphPhtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCphPhtKey() {
        return cphPhtKey;
    }

    /**
     * Sets the value of the cphPhtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCphPhtKey(JAXBElement<String> value) {
        this.cphPhtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cphCstLinkKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCphCstLinkKey() {
        return cphCstLinkKey;
    }

    /**
     * Sets the value of the cphCstLinkKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCphCstLinkKey(JAXBElement<String> value) {
        this.cphCstLinkKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cphAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCphAddUser() {
        return cphAddUser;
    }

    /**
     * Sets the value of the cphAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCphAddUser(JAXBElement<String> value) {
        this.cphAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cphAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCphAddDate() {
        return cphAddDate;
    }

    /**
     * Sets the value of the cphAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCphAddDate(JAXBElement<String> value) {
        this.cphAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cphChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCphChangeUser() {
        return cphChangeUser;
    }

    /**
     * Sets the value of the cphChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCphChangeUser(JAXBElement<String> value) {
        this.cphChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cphChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCphChangeDate() {
        return cphChangeDate;
    }

    /**
     * Sets the value of the cphChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCphChangeDate(JAXBElement<String> value) {
        this.cphChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cphDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCphDeleteFlag() {
        return cphDeleteFlag;
    }

    /**
     * Sets the value of the cphDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCphDeleteFlag(JAXBElement<Short> value) {
        this.cphDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cphKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCphKeyExt() {
        return cphKeyExt;
    }

    /**
     * Sets the value of the cphKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCphKeyExt(JAXBElement<String> value) {
        this.cphKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cphUnlistedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCphUnlistedFlag() {
        return cphUnlistedFlag;
    }

    /**
     * Sets the value of the cphUnlistedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCphUnlistedFlag(JAXBElement<Short> value) {
        this.cphUnlistedFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cphPhnNumberComplete property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCphPhnNumberComplete() {
        return cphPhnNumberComplete;
    }

    /**
     * Sets the value of the cphPhnNumberComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCphPhnNumberComplete(JAXBElement<String> value) {
        this.cphPhnNumberComplete = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cphExtension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCphExtension() {
        return cphExtension;
    }

    /**
     * Sets the value of the cphExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCphExtension(JAXBElement<String> value) {
        this.cphExtension = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cphEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCphEntityKey() {
        return cphEntityKey;
    }

    /**
     * Sets the value of the cphEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCphEntityKey(JAXBElement<String> value) {
        this.cphEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cphPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCphPrimary() {
        return cphPrimary;
    }

    /**
     * Sets the value of the cphPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCphPrimary(JAXBElement<Short> value) {
        this.cphPrimary = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cphOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCphOwner() {
        return cphOwner;
    }

    /**
     * Sets the value of the cphOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCphOwner(JAXBElement<Short> value) {
        this.cphOwner = ((JAXBElement<Short> ) value);
    }

}
