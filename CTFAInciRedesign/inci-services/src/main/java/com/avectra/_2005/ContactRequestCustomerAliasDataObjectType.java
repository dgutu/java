
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactRequest_Customer_Alias_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactRequest_Customer_Alias_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cal_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cal_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cal_alias" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="cal_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cal_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cal_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cal_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cal_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cal_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cal_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactRequest_Customer_Alias_DataObjectType", propOrder = {
    "calKey",
    "calCstKey",
    "calAlias",
    "calAddUser",
    "calAddDate",
    "calChangeUser",
    "calChangeDate",
    "calDeleteFlag",
    "calEntityKey",
    "calKeyExt"
})
public class ContactRequestCustomerAliasDataObjectType {

    @XmlElementRef(name = "cal_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> calKey;
    @XmlElementRef(name = "cal_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> calCstKey;
    @XmlElementRef(name = "cal_alias", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> calAlias;
    @XmlElementRef(name = "cal_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> calAddUser;
    @XmlElementRef(name = "cal_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> calAddDate;
    @XmlElementRef(name = "cal_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> calChangeUser;
    @XmlElementRef(name = "cal_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> calChangeDate;
    @XmlElementRef(name = "cal_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> calDeleteFlag;
    @XmlElementRef(name = "cal_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> calEntityKey;
    @XmlElementRef(name = "cal_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> calKeyExt;

    /**
     * Gets the value of the calKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalKey() {
        return calKey;
    }

    /**
     * Sets the value of the calKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalKey(JAXBElement<String> value) {
        this.calKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the calCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalCstKey() {
        return calCstKey;
    }

    /**
     * Sets the value of the calCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalCstKey(JAXBElement<String> value) {
        this.calCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the calAlias property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalAlias() {
        return calAlias;
    }

    /**
     * Sets the value of the calAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalAlias(JAXBElement<String> value) {
        this.calAlias = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the calAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalAddUser() {
        return calAddUser;
    }

    /**
     * Sets the value of the calAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalAddUser(JAXBElement<String> value) {
        this.calAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the calAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalAddDate() {
        return calAddDate;
    }

    /**
     * Sets the value of the calAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalAddDate(JAXBElement<String> value) {
        this.calAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the calChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalChangeUser() {
        return calChangeUser;
    }

    /**
     * Sets the value of the calChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalChangeUser(JAXBElement<String> value) {
        this.calChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the calChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalChangeDate() {
        return calChangeDate;
    }

    /**
     * Sets the value of the calChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalChangeDate(JAXBElement<String> value) {
        this.calChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the calDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCalDeleteFlag() {
        return calDeleteFlag;
    }

    /**
     * Sets the value of the calDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCalDeleteFlag(JAXBElement<Short> value) {
        this.calDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the calEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalEntityKey() {
        return calEntityKey;
    }

    /**
     * Sets the value of the calEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalEntityKey(JAXBElement<String> value) {
        this.calEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the calKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalKeyExt() {
        return calKeyExt;
    }

    /**
     * Sets the value of the calKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalKeyExt(JAXBElement<String> value) {
        this.calKeyExt = ((JAXBElement<String> ) value);
    }

}
