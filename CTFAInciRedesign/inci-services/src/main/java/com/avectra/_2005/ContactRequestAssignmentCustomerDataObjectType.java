
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactRequest_Assignment_Customer_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactRequest_Assignment_Customer_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="asc_coa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="asc_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="asc_crs_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="asc_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="asc_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="asc_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="asc_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="asc_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="asc_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="asc_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactRequest_Assignment_Customer_DataObjectType", propOrder = {
    "ascKey",
    "ascCoaKey",
    "ascCstKey",
    "ascCrsCode",
    "ascAddUser",
    "ascAddDate",
    "ascChangeUser",
    "ascChangeDate",
    "ascDeleteFlag",
    "ascKeyExt",
    "ascEntityKey"
})
public class ContactRequestAssignmentCustomerDataObjectType {

    @XmlElementRef(name = "asc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ascKey;
    @XmlElementRef(name = "asc_coa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ascCoaKey;
    @XmlElementRef(name = "asc_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ascCstKey;
    @XmlElementRef(name = "asc_crs_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ascCrsCode;
    @XmlElementRef(name = "asc_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ascAddUser;
    @XmlElementRef(name = "asc_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ascAddDate;
    @XmlElementRef(name = "asc_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ascChangeUser;
    @XmlElementRef(name = "asc_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ascChangeDate;
    @XmlElementRef(name = "asc_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ascDeleteFlag;
    @XmlElementRef(name = "asc_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ascKeyExt;
    @XmlElementRef(name = "asc_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ascEntityKey;

    /**
     * Gets the value of the ascKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAscKey() {
        return ascKey;
    }

    /**
     * Sets the value of the ascKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAscKey(JAXBElement<String> value) {
        this.ascKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ascCoaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAscCoaKey() {
        return ascCoaKey;
    }

    /**
     * Sets the value of the ascCoaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAscCoaKey(JAXBElement<String> value) {
        this.ascCoaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ascCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAscCstKey() {
        return ascCstKey;
    }

    /**
     * Sets the value of the ascCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAscCstKey(JAXBElement<String> value) {
        this.ascCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ascCrsCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAscCrsCode() {
        return ascCrsCode;
    }

    /**
     * Sets the value of the ascCrsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAscCrsCode(JAXBElement<String> value) {
        this.ascCrsCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ascAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAscAddUser() {
        return ascAddUser;
    }

    /**
     * Sets the value of the ascAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAscAddUser(JAXBElement<String> value) {
        this.ascAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ascAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAscAddDate() {
        return ascAddDate;
    }

    /**
     * Sets the value of the ascAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAscAddDate(JAXBElement<String> value) {
        this.ascAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ascChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAscChangeUser() {
        return ascChangeUser;
    }

    /**
     * Sets the value of the ascChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAscChangeUser(JAXBElement<String> value) {
        this.ascChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ascChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAscChangeDate() {
        return ascChangeDate;
    }

    /**
     * Sets the value of the ascChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAscChangeDate(JAXBElement<String> value) {
        this.ascChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ascDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getAscDeleteFlag() {
        return ascDeleteFlag;
    }

    /**
     * Sets the value of the ascDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setAscDeleteFlag(JAXBElement<Short> value) {
        this.ascDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ascKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAscKeyExt() {
        return ascKeyExt;
    }

    /**
     * Sets the value of the ascKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAscKeyExt(JAXBElement<String> value) {
        this.ascKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ascEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAscEntityKey() {
        return ascEntityKey;
    }

    /**
     * Sets the value of the ascEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAscEntityKey(JAXBElement<String> value) {
        this.ascEntityKey = ((JAXBElement<String> ) value);
    }

}
