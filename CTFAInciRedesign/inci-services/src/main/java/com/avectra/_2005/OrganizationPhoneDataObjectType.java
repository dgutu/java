
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organization_Phone_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Phone_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="phn_cst_key_owner" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="phn_number" type="{http://www.avectra.com/2005/}av_phone_Type" minOccurs="0"/>
 *         &lt;element name="phn_number_display" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="phn_cty_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="phn_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="phn_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="phn_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="phn_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="phn_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="phn_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="phn_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Phone_DataObjectType", propOrder = {
    "phnKey",
    "phnCstKeyOwner",
    "phnNumber",
    "phnNumberDisplay",
    "phnCtyKey",
    "phnAddUser",
    "phnAddDate",
    "phnChangeUser",
    "phnChangeDate",
    "phnDeleteFlag",
    "phnEntityKey",
    "phnKeyExt"
})
public class OrganizationPhoneDataObjectType {

    @XmlElementRef(name = "phn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> phnKey;
    @XmlElementRef(name = "phn_cst_key_owner", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> phnCstKeyOwner;
    @XmlElementRef(name = "phn_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> phnNumber;
    @XmlElementRef(name = "phn_number_display", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> phnNumberDisplay;
    @XmlElementRef(name = "phn_cty_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> phnCtyKey;
    @XmlElementRef(name = "phn_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> phnAddUser;
    @XmlElementRef(name = "phn_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> phnAddDate;
    @XmlElementRef(name = "phn_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> phnChangeUser;
    @XmlElementRef(name = "phn_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> phnChangeDate;
    @XmlElementRef(name = "phn_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> phnDeleteFlag;
    @XmlElementRef(name = "phn_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> phnEntityKey;
    @XmlElementRef(name = "phn_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> phnKeyExt;

    /**
     * Gets the value of the phnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhnKey() {
        return phnKey;
    }

    /**
     * Sets the value of the phnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhnKey(JAXBElement<String> value) {
        this.phnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phnCstKeyOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhnCstKeyOwner() {
        return phnCstKeyOwner;
    }

    /**
     * Sets the value of the phnCstKeyOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhnCstKeyOwner(JAXBElement<String> value) {
        this.phnCstKeyOwner = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhnNumber() {
        return phnNumber;
    }

    /**
     * Sets the value of the phnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhnNumber(JAXBElement<String> value) {
        this.phnNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phnNumberDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhnNumberDisplay() {
        return phnNumberDisplay;
    }

    /**
     * Sets the value of the phnNumberDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhnNumberDisplay(JAXBElement<String> value) {
        this.phnNumberDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phnCtyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhnCtyKey() {
        return phnCtyKey;
    }

    /**
     * Sets the value of the phnCtyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhnCtyKey(JAXBElement<String> value) {
        this.phnCtyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phnAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhnAddUser() {
        return phnAddUser;
    }

    /**
     * Sets the value of the phnAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhnAddUser(JAXBElement<String> value) {
        this.phnAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phnAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhnAddDate() {
        return phnAddDate;
    }

    /**
     * Sets the value of the phnAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhnAddDate(JAXBElement<String> value) {
        this.phnAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phnChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhnChangeUser() {
        return phnChangeUser;
    }

    /**
     * Sets the value of the phnChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhnChangeUser(JAXBElement<String> value) {
        this.phnChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phnChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhnChangeDate() {
        return phnChangeDate;
    }

    /**
     * Sets the value of the phnChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhnChangeDate(JAXBElement<String> value) {
        this.phnChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phnDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPhnDeleteFlag() {
        return phnDeleteFlag;
    }

    /**
     * Sets the value of the phnDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPhnDeleteFlag(JAXBElement<Short> value) {
        this.phnDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the phnEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhnEntityKey() {
        return phnEntityKey;
    }

    /**
     * Sets the value of the phnEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhnEntityKey(JAXBElement<String> value) {
        this.phnEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phnKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhnKeyExt() {
        return phnKeyExt;
    }

    /**
     * Sets the value of the phnKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhnKeyExt(JAXBElement<String> value) {
        this.phnKeyExt = ((JAXBElement<String> ) value);
    }

}
