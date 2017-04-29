
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Org_eMail_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Org_eMail_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="em6__eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="em6__eml_address" type="{http://www.avectra.com/2005/}av_email_Type" minOccurs="0"/>
 *         &lt;element name="em6__eml_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="em6__eml_type" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="em6__eml_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="em6__eml_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="em6__eml_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="em6__eml_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="em6__eml_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="em6__eml_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="em6__eml_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="em6__eml_invalid_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="em6__eml_invalid_reason" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="em6__eml_unlisted_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="em6__eml_primary" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Org_eMail_DataObjectType", propOrder = {
    "em6EmlKey",
    "em6EmlAddress",
    "em6EmlCstKey",
    "em6EmlType",
    "em6EmlAddUser",
    "em6EmlAddDate",
    "em6EmlChangeUser",
    "em6EmlChangeDate",
    "em6EmlDeleteFlag",
    "em6EmlKeyExt",
    "em6EmlEntityKey",
    "em6EmlInvalidFlag",
    "em6EmlInvalidReason",
    "em6EmlUnlistedFlag",
    "em6EmlPrimary"
})
public class FundraisingGiftOrgEMailDataObjectType {

    @XmlElementRef(name = "em6__eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> em6EmlKey;
    @XmlElementRef(name = "em6__eml_address", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> em6EmlAddress;
    @XmlElementRef(name = "em6__eml_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> em6EmlCstKey;
    @XmlElementRef(name = "em6__eml_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> em6EmlType;
    @XmlElementRef(name = "em6__eml_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> em6EmlAddUser;
    @XmlElementRef(name = "em6__eml_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> em6EmlAddDate;
    @XmlElementRef(name = "em6__eml_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> em6EmlChangeUser;
    @XmlElementRef(name = "em6__eml_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> em6EmlChangeDate;
    @XmlElementRef(name = "em6__eml_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> em6EmlDeleteFlag;
    @XmlElementRef(name = "em6__eml_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> em6EmlKeyExt;
    @XmlElementRef(name = "em6__eml_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> em6EmlEntityKey;
    @XmlElementRef(name = "em6__eml_invalid_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> em6EmlInvalidFlag;
    @XmlElementRef(name = "em6__eml_invalid_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> em6EmlInvalidReason;
    @XmlElementRef(name = "em6__eml_unlisted_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> em6EmlUnlistedFlag;
    @XmlElementRef(name = "em6__eml_primary", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> em6EmlPrimary;

    /**
     * Gets the value of the em6EmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEm6EmlKey() {
        return em6EmlKey;
    }

    /**
     * Sets the value of the em6EmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEm6EmlKey(JAXBElement<String> value) {
        this.em6EmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the em6EmlAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEm6EmlAddress() {
        return em6EmlAddress;
    }

    /**
     * Sets the value of the em6EmlAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEm6EmlAddress(JAXBElement<String> value) {
        this.em6EmlAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the em6EmlCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEm6EmlCstKey() {
        return em6EmlCstKey;
    }

    /**
     * Sets the value of the em6EmlCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEm6EmlCstKey(JAXBElement<String> value) {
        this.em6EmlCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the em6EmlType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEm6EmlType() {
        return em6EmlType;
    }

    /**
     * Sets the value of the em6EmlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEm6EmlType(JAXBElement<String> value) {
        this.em6EmlType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the em6EmlAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEm6EmlAddUser() {
        return em6EmlAddUser;
    }

    /**
     * Sets the value of the em6EmlAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEm6EmlAddUser(JAXBElement<String> value) {
        this.em6EmlAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the em6EmlAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEm6EmlAddDate() {
        return em6EmlAddDate;
    }

    /**
     * Sets the value of the em6EmlAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEm6EmlAddDate(JAXBElement<String> value) {
        this.em6EmlAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the em6EmlChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEm6EmlChangeUser() {
        return em6EmlChangeUser;
    }

    /**
     * Sets the value of the em6EmlChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEm6EmlChangeUser(JAXBElement<String> value) {
        this.em6EmlChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the em6EmlChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEm6EmlChangeDate() {
        return em6EmlChangeDate;
    }

    /**
     * Sets the value of the em6EmlChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEm6EmlChangeDate(JAXBElement<String> value) {
        this.em6EmlChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the em6EmlDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEm6EmlDeleteFlag() {
        return em6EmlDeleteFlag;
    }

    /**
     * Sets the value of the em6EmlDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEm6EmlDeleteFlag(JAXBElement<Short> value) {
        this.em6EmlDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the em6EmlKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEm6EmlKeyExt() {
        return em6EmlKeyExt;
    }

    /**
     * Sets the value of the em6EmlKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEm6EmlKeyExt(JAXBElement<String> value) {
        this.em6EmlKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the em6EmlEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEm6EmlEntityKey() {
        return em6EmlEntityKey;
    }

    /**
     * Sets the value of the em6EmlEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEm6EmlEntityKey(JAXBElement<String> value) {
        this.em6EmlEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the em6EmlInvalidFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEm6EmlInvalidFlag() {
        return em6EmlInvalidFlag;
    }

    /**
     * Sets the value of the em6EmlInvalidFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEm6EmlInvalidFlag(JAXBElement<Short> value) {
        this.em6EmlInvalidFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the em6EmlInvalidReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEm6EmlInvalidReason() {
        return em6EmlInvalidReason;
    }

    /**
     * Sets the value of the em6EmlInvalidReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEm6EmlInvalidReason(JAXBElement<String> value) {
        this.em6EmlInvalidReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the em6EmlUnlistedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEm6EmlUnlistedFlag() {
        return em6EmlUnlistedFlag;
    }

    /**
     * Sets the value of the em6EmlUnlistedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEm6EmlUnlistedFlag(JAXBElement<Short> value) {
        this.em6EmlUnlistedFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the em6EmlPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEm6EmlPrimary() {
        return em6EmlPrimary;
    }

    /**
     * Sets the value of the em6EmlPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEm6EmlPrimary(JAXBElement<Short> value) {
        this.em6EmlPrimary = ((JAXBElement<Short> ) value);
    }

}
