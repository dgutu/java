
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrant_Email_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrant_Email_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="eml_address" type="{http://www.avectra.com/2005/}av_email_Type" minOccurs="0"/>
 *         &lt;element name="eml_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="eml_type" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="eml_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="eml_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="eml_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="eml_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="eml_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="eml_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="eml_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="eml_invalid_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="eml_invalid_reason" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="eml_unlisted_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="eml_primary" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrant_Email_DataObjectType", propOrder = {
    "emlKey",
    "emlAddress",
    "emlCstKey",
    "emlType",
    "emlAddUser",
    "emlAddDate",
    "emlChangeUser",
    "emlChangeDate",
    "emlDeleteFlag",
    "emlKeyExt",
    "emlEntityKey",
    "emlInvalidFlag",
    "emlInvalidReason",
    "emlUnlistedFlag",
    "emlPrimary"
})
public class EventsRegistrantEmailDataObjectType {

    @XmlElementRef(name = "eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> emlKey;
    @XmlElementRef(name = "eml_address", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> emlAddress;
    @XmlElementRef(name = "eml_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> emlCstKey;
    @XmlElementRef(name = "eml_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> emlType;
    @XmlElementRef(name = "eml_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> emlAddUser;
    @XmlElementRef(name = "eml_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> emlAddDate;
    @XmlElementRef(name = "eml_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> emlChangeUser;
    @XmlElementRef(name = "eml_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> emlChangeDate;
    @XmlElementRef(name = "eml_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> emlDeleteFlag;
    @XmlElementRef(name = "eml_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> emlKeyExt;
    @XmlElementRef(name = "eml_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> emlEntityKey;
    @XmlElementRef(name = "eml_invalid_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> emlInvalidFlag;
    @XmlElementRef(name = "eml_invalid_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> emlInvalidReason;
    @XmlElementRef(name = "eml_unlisted_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> emlUnlistedFlag;
    @XmlElementRef(name = "eml_primary", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> emlPrimary;

    /**
     * Gets the value of the emlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmlKey() {
        return emlKey;
    }

    /**
     * Sets the value of the emlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmlKey(JAXBElement<String> value) {
        this.emlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the emlAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmlAddress() {
        return emlAddress;
    }

    /**
     * Sets the value of the emlAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmlAddress(JAXBElement<String> value) {
        this.emlAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the emlCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmlCstKey() {
        return emlCstKey;
    }

    /**
     * Sets the value of the emlCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmlCstKey(JAXBElement<String> value) {
        this.emlCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the emlType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmlType() {
        return emlType;
    }

    /**
     * Sets the value of the emlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmlType(JAXBElement<String> value) {
        this.emlType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the emlAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmlAddUser() {
        return emlAddUser;
    }

    /**
     * Sets the value of the emlAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmlAddUser(JAXBElement<String> value) {
        this.emlAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the emlAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmlAddDate() {
        return emlAddDate;
    }

    /**
     * Sets the value of the emlAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmlAddDate(JAXBElement<String> value) {
        this.emlAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the emlChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmlChangeUser() {
        return emlChangeUser;
    }

    /**
     * Sets the value of the emlChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmlChangeUser(JAXBElement<String> value) {
        this.emlChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the emlChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmlChangeDate() {
        return emlChangeDate;
    }

    /**
     * Sets the value of the emlChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmlChangeDate(JAXBElement<String> value) {
        this.emlChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the emlDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEmlDeleteFlag() {
        return emlDeleteFlag;
    }

    /**
     * Sets the value of the emlDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEmlDeleteFlag(JAXBElement<Short> value) {
        this.emlDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the emlKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmlKeyExt() {
        return emlKeyExt;
    }

    /**
     * Sets the value of the emlKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmlKeyExt(JAXBElement<String> value) {
        this.emlKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the emlEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmlEntityKey() {
        return emlEntityKey;
    }

    /**
     * Sets the value of the emlEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmlEntityKey(JAXBElement<String> value) {
        this.emlEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the emlInvalidFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEmlInvalidFlag() {
        return emlInvalidFlag;
    }

    /**
     * Sets the value of the emlInvalidFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEmlInvalidFlag(JAXBElement<Short> value) {
        this.emlInvalidFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the emlInvalidReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmlInvalidReason() {
        return emlInvalidReason;
    }

    /**
     * Sets the value of the emlInvalidReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmlInvalidReason(JAXBElement<String> value) {
        this.emlInvalidReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the emlUnlistedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEmlUnlistedFlag() {
        return emlUnlistedFlag;
    }

    /**
     * Sets the value of the emlUnlistedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEmlUnlistedFlag(JAXBElement<Short> value) {
        this.emlUnlistedFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the emlPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEmlPrimary() {
        return emlPrimary;
    }

    /**
     * Sets the value of the emlPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEmlPrimary(JAXBElement<Short> value) {
        this.emlPrimary = ((JAXBElement<Short> ) value);
    }

}
