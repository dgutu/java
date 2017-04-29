
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrant_Registrant_Type_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrant_Registrant_Type_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rgt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rgt_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="rgt_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="rgt_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rgt_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="rgt_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rgt_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="rgt_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rgt_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rgt_guest_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrant_Registrant_Type_DataObjectType", propOrder = {
    "rgtKey",
    "rgtCode",
    "rgtAddUser",
    "rgtAddDate",
    "rgtChangeUser",
    "rgtChangeDate",
    "rgtDeleteFlag",
    "rgtKeyExt",
    "rgtEntityKey",
    "rgtGuestFlag"
})
public class EventsRegistrantRegistrantTypeDataObjectType {

    @XmlElementRef(name = "rgt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgtKey;
    @XmlElementRef(name = "rgt_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgtCode;
    @XmlElementRef(name = "rgt_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgtAddUser;
    @XmlElementRef(name = "rgt_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgtAddDate;
    @XmlElementRef(name = "rgt_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgtChangeUser;
    @XmlElementRef(name = "rgt_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgtChangeDate;
    @XmlElementRef(name = "rgt_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rgtDeleteFlag;
    @XmlElementRef(name = "rgt_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgtKeyExt;
    @XmlElementRef(name = "rgt_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rgtEntityKey;
    @XmlElementRef(name = "rgt_guest_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rgtGuestFlag;

    /**
     * Gets the value of the rgtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgtKey() {
        return rgtKey;
    }

    /**
     * Sets the value of the rgtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgtKey(JAXBElement<String> value) {
        this.rgtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgtCode() {
        return rgtCode;
    }

    /**
     * Sets the value of the rgtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgtCode(JAXBElement<String> value) {
        this.rgtCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgtAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgtAddUser() {
        return rgtAddUser;
    }

    /**
     * Sets the value of the rgtAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgtAddUser(JAXBElement<String> value) {
        this.rgtAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgtAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgtAddDate() {
        return rgtAddDate;
    }

    /**
     * Sets the value of the rgtAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgtAddDate(JAXBElement<String> value) {
        this.rgtAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgtChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgtChangeUser() {
        return rgtChangeUser;
    }

    /**
     * Sets the value of the rgtChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgtChangeUser(JAXBElement<String> value) {
        this.rgtChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgtChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgtChangeDate() {
        return rgtChangeDate;
    }

    /**
     * Sets the value of the rgtChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgtChangeDate(JAXBElement<String> value) {
        this.rgtChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgtDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRgtDeleteFlag() {
        return rgtDeleteFlag;
    }

    /**
     * Sets the value of the rgtDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRgtDeleteFlag(JAXBElement<Short> value) {
        this.rgtDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rgtKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgtKeyExt() {
        return rgtKeyExt;
    }

    /**
     * Sets the value of the rgtKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgtKeyExt(JAXBElement<String> value) {
        this.rgtKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgtEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRgtEntityKey() {
        return rgtEntityKey;
    }

    /**
     * Sets the value of the rgtEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRgtEntityKey(JAXBElement<String> value) {
        this.rgtEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rgtGuestFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRgtGuestFlag() {
        return rgtGuestFlag;
    }

    /**
     * Sets the value of the rgtGuestFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRgtGuestFlag(JAXBElement<Short> value) {
        this.rgtGuestFlag = ((JAXBElement<Short> ) value);
    }

}
