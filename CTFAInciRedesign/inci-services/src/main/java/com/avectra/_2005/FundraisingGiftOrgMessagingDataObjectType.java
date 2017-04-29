
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Org_Messaging_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Org_Messaging_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ms6__msg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ms6__msg_handle" type="{http://www.avectra.com/2005/}av_messaging_name_Type" minOccurs="0"/>
 *         &lt;element name="ms6__msg_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ms6__msg_type" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="ms6__msg_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ms6__msg_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ms6__msg_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ms6__msg_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ms6__msg_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ms6__msg_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ms6__msg_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ms6__msg_primary" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Org_Messaging_DataObjectType", propOrder = {
    "ms6MsgKey",
    "ms6MsgHandle",
    "ms6MsgCstKey",
    "ms6MsgType",
    "ms6MsgAddUser",
    "ms6MsgAddDate",
    "ms6MsgChangeUser",
    "ms6MsgChangeDate",
    "ms6MsgDeleteFlag",
    "ms6MsgKeyExt",
    "ms6MsgEntityKey",
    "ms6MsgPrimary"
})
public class FundraisingGiftOrgMessagingDataObjectType {

    @XmlElementRef(name = "ms6__msg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ms6MsgKey;
    @XmlElementRef(name = "ms6__msg_handle", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ms6MsgHandle;
    @XmlElementRef(name = "ms6__msg_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ms6MsgCstKey;
    @XmlElementRef(name = "ms6__msg_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ms6MsgType;
    @XmlElementRef(name = "ms6__msg_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ms6MsgAddUser;
    @XmlElementRef(name = "ms6__msg_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ms6MsgAddDate;
    @XmlElementRef(name = "ms6__msg_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ms6MsgChangeUser;
    @XmlElementRef(name = "ms6__msg_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ms6MsgChangeDate;
    @XmlElementRef(name = "ms6__msg_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ms6MsgDeleteFlag;
    @XmlElementRef(name = "ms6__msg_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ms6MsgKeyExt;
    @XmlElementRef(name = "ms6__msg_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ms6MsgEntityKey;
    @XmlElementRef(name = "ms6__msg_primary", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ms6MsgPrimary;

    /**
     * Gets the value of the ms6MsgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMs6MsgKey() {
        return ms6MsgKey;
    }

    /**
     * Sets the value of the ms6MsgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMs6MsgKey(JAXBElement<String> value) {
        this.ms6MsgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ms6MsgHandle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMs6MsgHandle() {
        return ms6MsgHandle;
    }

    /**
     * Sets the value of the ms6MsgHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMs6MsgHandle(JAXBElement<String> value) {
        this.ms6MsgHandle = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ms6MsgCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMs6MsgCstKey() {
        return ms6MsgCstKey;
    }

    /**
     * Sets the value of the ms6MsgCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMs6MsgCstKey(JAXBElement<String> value) {
        this.ms6MsgCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ms6MsgType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMs6MsgType() {
        return ms6MsgType;
    }

    /**
     * Sets the value of the ms6MsgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMs6MsgType(JAXBElement<String> value) {
        this.ms6MsgType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ms6MsgAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMs6MsgAddUser() {
        return ms6MsgAddUser;
    }

    /**
     * Sets the value of the ms6MsgAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMs6MsgAddUser(JAXBElement<String> value) {
        this.ms6MsgAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ms6MsgAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMs6MsgAddDate() {
        return ms6MsgAddDate;
    }

    /**
     * Sets the value of the ms6MsgAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMs6MsgAddDate(JAXBElement<String> value) {
        this.ms6MsgAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ms6MsgChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMs6MsgChangeUser() {
        return ms6MsgChangeUser;
    }

    /**
     * Sets the value of the ms6MsgChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMs6MsgChangeUser(JAXBElement<String> value) {
        this.ms6MsgChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ms6MsgChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMs6MsgChangeDate() {
        return ms6MsgChangeDate;
    }

    /**
     * Sets the value of the ms6MsgChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMs6MsgChangeDate(JAXBElement<String> value) {
        this.ms6MsgChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ms6MsgDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMs6MsgDeleteFlag() {
        return ms6MsgDeleteFlag;
    }

    /**
     * Sets the value of the ms6MsgDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMs6MsgDeleteFlag(JAXBElement<Short> value) {
        this.ms6MsgDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ms6MsgKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMs6MsgKeyExt() {
        return ms6MsgKeyExt;
    }

    /**
     * Sets the value of the ms6MsgKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMs6MsgKeyExt(JAXBElement<String> value) {
        this.ms6MsgKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ms6MsgEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMs6MsgEntityKey() {
        return ms6MsgEntityKey;
    }

    /**
     * Sets the value of the ms6MsgEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMs6MsgEntityKey(JAXBElement<String> value) {
        this.ms6MsgEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ms6MsgPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMs6MsgPrimary() {
        return ms6MsgPrimary;
    }

    /**
     * Sets the value of the ms6MsgPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMs6MsgPrimary(JAXBElement<Short> value) {
        this.ms6MsgPrimary = ((JAXBElement<Short> ) value);
    }

}
