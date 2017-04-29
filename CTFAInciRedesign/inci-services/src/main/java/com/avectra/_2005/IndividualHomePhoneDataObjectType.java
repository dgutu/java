
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Individual_Home_Phone_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Individual_Home_Phone_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ph2__phn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ph2__phn_cst_key_owner" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ph2__phn_number" type="{http://www.avectra.com/2005/}av_phone_Type" minOccurs="0"/>
 *         &lt;element name="ph2__phn_number_display" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="ph2__phn_cty_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ph2__phn_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ph2__phn_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ph2__phn_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ph2__phn_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ph2__phn_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ph2__phn_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ph2__phn_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Individual_Home_Phone_DataObjectType", propOrder = {
    "ph2PhnKey",
    "ph2PhnCstKeyOwner",
    "ph2PhnNumber",
    "ph2PhnNumberDisplay",
    "ph2PhnCtyKey",
    "ph2PhnAddUser",
    "ph2PhnAddDate",
    "ph2PhnChangeUser",
    "ph2PhnChangeDate",
    "ph2PhnDeleteFlag",
    "ph2PhnEntityKey",
    "ph2PhnKeyExt"
})
public class IndividualHomePhoneDataObjectType {

    @XmlElementRef(name = "ph2__phn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ph2PhnKey;
    @XmlElementRef(name = "ph2__phn_cst_key_owner", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ph2PhnCstKeyOwner;
    @XmlElementRef(name = "ph2__phn_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ph2PhnNumber;
    @XmlElementRef(name = "ph2__phn_number_display", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ph2PhnNumberDisplay;
    @XmlElementRef(name = "ph2__phn_cty_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ph2PhnCtyKey;
    @XmlElementRef(name = "ph2__phn_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ph2PhnAddUser;
    @XmlElementRef(name = "ph2__phn_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ph2PhnAddDate;
    @XmlElementRef(name = "ph2__phn_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ph2PhnChangeUser;
    @XmlElementRef(name = "ph2__phn_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ph2PhnChangeDate;
    @XmlElementRef(name = "ph2__phn_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ph2PhnDeleteFlag;
    @XmlElementRef(name = "ph2__phn_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ph2PhnEntityKey;
    @XmlElementRef(name = "ph2__phn_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ph2PhnKeyExt;

    /**
     * Gets the value of the ph2PhnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPh2PhnKey() {
        return ph2PhnKey;
    }

    /**
     * Sets the value of the ph2PhnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPh2PhnKey(JAXBElement<String> value) {
        this.ph2PhnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ph2PhnCstKeyOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPh2PhnCstKeyOwner() {
        return ph2PhnCstKeyOwner;
    }

    /**
     * Sets the value of the ph2PhnCstKeyOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPh2PhnCstKeyOwner(JAXBElement<String> value) {
        this.ph2PhnCstKeyOwner = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ph2PhnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPh2PhnNumber() {
        return ph2PhnNumber;
    }

    /**
     * Sets the value of the ph2PhnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPh2PhnNumber(JAXBElement<String> value) {
        this.ph2PhnNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ph2PhnNumberDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPh2PhnNumberDisplay() {
        return ph2PhnNumberDisplay;
    }

    /**
     * Sets the value of the ph2PhnNumberDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPh2PhnNumberDisplay(JAXBElement<String> value) {
        this.ph2PhnNumberDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ph2PhnCtyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPh2PhnCtyKey() {
        return ph2PhnCtyKey;
    }

    /**
     * Sets the value of the ph2PhnCtyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPh2PhnCtyKey(JAXBElement<String> value) {
        this.ph2PhnCtyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ph2PhnAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPh2PhnAddUser() {
        return ph2PhnAddUser;
    }

    /**
     * Sets the value of the ph2PhnAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPh2PhnAddUser(JAXBElement<String> value) {
        this.ph2PhnAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ph2PhnAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPh2PhnAddDate() {
        return ph2PhnAddDate;
    }

    /**
     * Sets the value of the ph2PhnAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPh2PhnAddDate(JAXBElement<String> value) {
        this.ph2PhnAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ph2PhnChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPh2PhnChangeUser() {
        return ph2PhnChangeUser;
    }

    /**
     * Sets the value of the ph2PhnChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPh2PhnChangeUser(JAXBElement<String> value) {
        this.ph2PhnChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ph2PhnChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPh2PhnChangeDate() {
        return ph2PhnChangeDate;
    }

    /**
     * Sets the value of the ph2PhnChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPh2PhnChangeDate(JAXBElement<String> value) {
        this.ph2PhnChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ph2PhnDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPh2PhnDeleteFlag() {
        return ph2PhnDeleteFlag;
    }

    /**
     * Sets the value of the ph2PhnDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPh2PhnDeleteFlag(JAXBElement<Short> value) {
        this.ph2PhnDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ph2PhnEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPh2PhnEntityKey() {
        return ph2PhnEntityKey;
    }

    /**
     * Sets the value of the ph2PhnEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPh2PhnEntityKey(JAXBElement<String> value) {
        this.ph2PhnEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ph2PhnKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPh2PhnKeyExt() {
        return ph2PhnKeyExt;
    }

    /**
     * Sets the value of the ph2PhnKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPh2PhnKeyExt(JAXBElement<String> value) {
        this.ph2PhnKeyExt = ((JAXBElement<String> ) value);
    }

}
