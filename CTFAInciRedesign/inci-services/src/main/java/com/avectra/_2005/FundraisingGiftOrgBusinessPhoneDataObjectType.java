
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Org_Business_Phone_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Org_Business_Phone_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ph6__phn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ph6__phn_cst_key_owner" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ph6__phn_number" type="{http://www.avectra.com/2005/}av_phone_Type" minOccurs="0"/>
 *         &lt;element name="ph6__phn_number_display" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="ph6__phn_cty_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ph6__phn_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ph6__phn_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ph6__phn_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ph6__phn_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ph6__phn_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ph6__phn_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ph6__phn_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Org_Business_Phone_DataObjectType", propOrder = {
    "ph6PhnKey",
    "ph6PhnCstKeyOwner",
    "ph6PhnNumber",
    "ph6PhnNumberDisplay",
    "ph6PhnCtyKey",
    "ph6PhnAddUser",
    "ph6PhnAddDate",
    "ph6PhnChangeUser",
    "ph6PhnChangeDate",
    "ph6PhnDeleteFlag",
    "ph6PhnEntityKey",
    "ph6PhnKeyExt"
})
public class FundraisingGiftOrgBusinessPhoneDataObjectType {

    @XmlElementRef(name = "ph6__phn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ph6PhnKey;
    @XmlElementRef(name = "ph6__phn_cst_key_owner", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ph6PhnCstKeyOwner;
    @XmlElementRef(name = "ph6__phn_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ph6PhnNumber;
    @XmlElementRef(name = "ph6__phn_number_display", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ph6PhnNumberDisplay;
    @XmlElementRef(name = "ph6__phn_cty_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ph6PhnCtyKey;
    @XmlElementRef(name = "ph6__phn_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ph6PhnAddUser;
    @XmlElementRef(name = "ph6__phn_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ph6PhnAddDate;
    @XmlElementRef(name = "ph6__phn_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ph6PhnChangeUser;
    @XmlElementRef(name = "ph6__phn_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ph6PhnChangeDate;
    @XmlElementRef(name = "ph6__phn_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ph6PhnDeleteFlag;
    @XmlElementRef(name = "ph6__phn_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ph6PhnEntityKey;
    @XmlElementRef(name = "ph6__phn_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ph6PhnKeyExt;

    /**
     * Gets the value of the ph6PhnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPh6PhnKey() {
        return ph6PhnKey;
    }

    /**
     * Sets the value of the ph6PhnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPh6PhnKey(JAXBElement<String> value) {
        this.ph6PhnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ph6PhnCstKeyOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPh6PhnCstKeyOwner() {
        return ph6PhnCstKeyOwner;
    }

    /**
     * Sets the value of the ph6PhnCstKeyOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPh6PhnCstKeyOwner(JAXBElement<String> value) {
        this.ph6PhnCstKeyOwner = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ph6PhnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPh6PhnNumber() {
        return ph6PhnNumber;
    }

    /**
     * Sets the value of the ph6PhnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPh6PhnNumber(JAXBElement<String> value) {
        this.ph6PhnNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ph6PhnNumberDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPh6PhnNumberDisplay() {
        return ph6PhnNumberDisplay;
    }

    /**
     * Sets the value of the ph6PhnNumberDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPh6PhnNumberDisplay(JAXBElement<String> value) {
        this.ph6PhnNumberDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ph6PhnCtyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPh6PhnCtyKey() {
        return ph6PhnCtyKey;
    }

    /**
     * Sets the value of the ph6PhnCtyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPh6PhnCtyKey(JAXBElement<String> value) {
        this.ph6PhnCtyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ph6PhnAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPh6PhnAddUser() {
        return ph6PhnAddUser;
    }

    /**
     * Sets the value of the ph6PhnAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPh6PhnAddUser(JAXBElement<String> value) {
        this.ph6PhnAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ph6PhnAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPh6PhnAddDate() {
        return ph6PhnAddDate;
    }

    /**
     * Sets the value of the ph6PhnAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPh6PhnAddDate(JAXBElement<String> value) {
        this.ph6PhnAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ph6PhnChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPh6PhnChangeUser() {
        return ph6PhnChangeUser;
    }

    /**
     * Sets the value of the ph6PhnChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPh6PhnChangeUser(JAXBElement<String> value) {
        this.ph6PhnChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ph6PhnChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPh6PhnChangeDate() {
        return ph6PhnChangeDate;
    }

    /**
     * Sets the value of the ph6PhnChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPh6PhnChangeDate(JAXBElement<String> value) {
        this.ph6PhnChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ph6PhnDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPh6PhnDeleteFlag() {
        return ph6PhnDeleteFlag;
    }

    /**
     * Sets the value of the ph6PhnDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPh6PhnDeleteFlag(JAXBElement<Short> value) {
        this.ph6PhnDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ph6PhnEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPh6PhnEntityKey() {
        return ph6PhnEntityKey;
    }

    /**
     * Sets the value of the ph6PhnEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPh6PhnEntityKey(JAXBElement<String> value) {
        this.ph6PhnEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ph6PhnKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPh6PhnKeyExt() {
        return ph6PhnKeyExt;
    }

    /**
     * Sets the value of the ph6PhnKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPh6PhnKeyExt(JAXBElement<String> value) {
        this.ph6PhnKeyExt = ((JAXBElement<String> ) value);
    }

}
