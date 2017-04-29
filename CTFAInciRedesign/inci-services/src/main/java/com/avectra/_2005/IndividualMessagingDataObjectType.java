
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Individual_Messaging_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Individual_Messaging_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="msg_handle" type="{http://www.avectra.com/2005/}av_messaging_name_Type" minOccurs="0"/>
 *         &lt;element name="msg_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="msg_type" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="msg_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="msg_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="msg_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="msg_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="msg_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="msg_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="msg_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="msg_primary" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Individual_Messaging_DataObjectType", propOrder = {
    "msgKey",
    "msgHandle",
    "msgCstKey",
    "msgType",
    "msgAddUser",
    "msgAddDate",
    "msgChangeUser",
    "msgChangeDate",
    "msgDeleteFlag",
    "msgKeyExt",
    "msgEntityKey",
    "msgPrimary"
})
public class IndividualMessagingDataObjectType {

    @XmlElementRef(name = "msg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> msgKey;
    @XmlElementRef(name = "msg_handle", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> msgHandle;
    @XmlElementRef(name = "msg_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> msgCstKey;
    @XmlElementRef(name = "msg_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> msgType;
    @XmlElementRef(name = "msg_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> msgAddUser;
    @XmlElementRef(name = "msg_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> msgAddDate;
    @XmlElementRef(name = "msg_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> msgChangeUser;
    @XmlElementRef(name = "msg_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> msgChangeDate;
    @XmlElementRef(name = "msg_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> msgDeleteFlag;
    @XmlElementRef(name = "msg_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> msgKeyExt;
    @XmlElementRef(name = "msg_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> msgEntityKey;
    @XmlElementRef(name = "msg_primary", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> msgPrimary;

    /**
     * Gets the value of the msgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMsgKey() {
        return msgKey;
    }

    /**
     * Sets the value of the msgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMsgKey(JAXBElement<String> value) {
        this.msgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the msgHandle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMsgHandle() {
        return msgHandle;
    }

    /**
     * Sets the value of the msgHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMsgHandle(JAXBElement<String> value) {
        this.msgHandle = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the msgCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMsgCstKey() {
        return msgCstKey;
    }

    /**
     * Sets the value of the msgCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMsgCstKey(JAXBElement<String> value) {
        this.msgCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the msgType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMsgType() {
        return msgType;
    }

    /**
     * Sets the value of the msgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMsgType(JAXBElement<String> value) {
        this.msgType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the msgAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMsgAddUser() {
        return msgAddUser;
    }

    /**
     * Sets the value of the msgAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMsgAddUser(JAXBElement<String> value) {
        this.msgAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the msgAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMsgAddDate() {
        return msgAddDate;
    }

    /**
     * Sets the value of the msgAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMsgAddDate(JAXBElement<String> value) {
        this.msgAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the msgChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMsgChangeUser() {
        return msgChangeUser;
    }

    /**
     * Sets the value of the msgChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMsgChangeUser(JAXBElement<String> value) {
        this.msgChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the msgChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMsgChangeDate() {
        return msgChangeDate;
    }

    /**
     * Sets the value of the msgChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMsgChangeDate(JAXBElement<String> value) {
        this.msgChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the msgDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMsgDeleteFlag() {
        return msgDeleteFlag;
    }

    /**
     * Sets the value of the msgDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMsgDeleteFlag(JAXBElement<Short> value) {
        this.msgDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the msgKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMsgKeyExt() {
        return msgKeyExt;
    }

    /**
     * Sets the value of the msgKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMsgKeyExt(JAXBElement<String> value) {
        this.msgKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the msgEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMsgEntityKey() {
        return msgEntityKey;
    }

    /**
     * Sets the value of the msgEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMsgEntityKey(JAXBElement<String> value) {
        this.msgEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the msgPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMsgPrimary() {
        return msgPrimary;
    }

    /**
     * Sets the value of the msgPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMsgPrimary(JAXBElement<Short> value) {
        this.msgPrimary = ((JAXBElement<Short> ) value);
    }

}
