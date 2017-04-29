
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrant_Event_Location_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrant_Event_Location_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="evl_evt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="evl_ses_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="evl_loc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="evl_location_name" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="evl_contact_fax" type="{http://www.avectra.com/2005/}stringLength13_Type" minOccurs="0"/>
 *         &lt;element name="evl_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="evl_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="evl_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="evl_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="evl_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="evl_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="evl_primary" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="evl_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrant_Event_Location_DataObjectType", propOrder = {
    "evlKey",
    "evlEvtKey",
    "evlSesKey",
    "evlLocKey",
    "evlLocationName",
    "evlContactFax",
    "evlAddDate",
    "evlAddUser",
    "evlChangeDate",
    "evlChangeUser",
    "evlDeleteFlag",
    "evlKeyExt",
    "evlPrimary",
    "evlEntityKey"
})
public class EventsRegistrantEventLocationDataObjectType {

    @XmlElementRef(name = "evl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evlKey;
    @XmlElementRef(name = "evl_evt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evlEvtKey;
    @XmlElementRef(name = "evl_ses_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evlSesKey;
    @XmlElementRef(name = "evl_loc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evlLocKey;
    @XmlElementRef(name = "evl_location_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evlLocationName;
    @XmlElementRef(name = "evl_contact_fax", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evlContactFax;
    @XmlElementRef(name = "evl_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evlAddDate;
    @XmlElementRef(name = "evl_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evlAddUser;
    @XmlElementRef(name = "evl_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evlChangeDate;
    @XmlElementRef(name = "evl_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evlChangeUser;
    @XmlElementRef(name = "evl_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> evlDeleteFlag;
    @XmlElementRef(name = "evl_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evlKeyExt;
    @XmlElementRef(name = "evl_primary", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> evlPrimary;
    @XmlElementRef(name = "evl_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evlEntityKey;

    /**
     * Gets the value of the evlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvlKey() {
        return evlKey;
    }

    /**
     * Sets the value of the evlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvlKey(JAXBElement<String> value) {
        this.evlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evlEvtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvlEvtKey() {
        return evlEvtKey;
    }

    /**
     * Sets the value of the evlEvtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvlEvtKey(JAXBElement<String> value) {
        this.evlEvtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evlSesKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvlSesKey() {
        return evlSesKey;
    }

    /**
     * Sets the value of the evlSesKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvlSesKey(JAXBElement<String> value) {
        this.evlSesKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evlLocKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvlLocKey() {
        return evlLocKey;
    }

    /**
     * Sets the value of the evlLocKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvlLocKey(JAXBElement<String> value) {
        this.evlLocKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evlLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvlLocationName() {
        return evlLocationName;
    }

    /**
     * Sets the value of the evlLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvlLocationName(JAXBElement<String> value) {
        this.evlLocationName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evlContactFax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvlContactFax() {
        return evlContactFax;
    }

    /**
     * Sets the value of the evlContactFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvlContactFax(JAXBElement<String> value) {
        this.evlContactFax = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evlAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvlAddDate() {
        return evlAddDate;
    }

    /**
     * Sets the value of the evlAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvlAddDate(JAXBElement<String> value) {
        this.evlAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evlAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvlAddUser() {
        return evlAddUser;
    }

    /**
     * Sets the value of the evlAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvlAddUser(JAXBElement<String> value) {
        this.evlAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evlChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvlChangeDate() {
        return evlChangeDate;
    }

    /**
     * Sets the value of the evlChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvlChangeDate(JAXBElement<String> value) {
        this.evlChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evlChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvlChangeUser() {
        return evlChangeUser;
    }

    /**
     * Sets the value of the evlChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvlChangeUser(JAXBElement<String> value) {
        this.evlChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evlDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEvlDeleteFlag() {
        return evlDeleteFlag;
    }

    /**
     * Sets the value of the evlDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEvlDeleteFlag(JAXBElement<Short> value) {
        this.evlDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the evlKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvlKeyExt() {
        return evlKeyExt;
    }

    /**
     * Sets the value of the evlKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvlKeyExt(JAXBElement<String> value) {
        this.evlKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evlPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEvlPrimary() {
        return evlPrimary;
    }

    /**
     * Sets the value of the evlPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEvlPrimary(JAXBElement<Short> value) {
        this.evlPrimary = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the evlEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvlEntityKey() {
        return evlEntityKey;
    }

    /**
     * Sets the value of the evlEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvlEntityKey(JAXBElement<String> value) {
        this.evlEntityKey = ((JAXBElement<String> ) value);
    }

}
