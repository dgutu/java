
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organization_Fax_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Fax_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fax_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="fax_cst_key_owner" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="fax_number" type="{http://www.avectra.com/2005/}av_fax_Type" minOccurs="0"/>
 *         &lt;element name="fax_number_display" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="fax_cty_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="fax_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="fax_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="fax_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="fax_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="fax_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="fax_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="fax_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Fax_DataObjectType", propOrder = {
    "faxKey",
    "faxCstKeyOwner",
    "faxNumber",
    "faxNumberDisplay",
    "faxCtyKey",
    "faxAddUser",
    "faxAddDate",
    "faxChangeUser",
    "faxChangeDate",
    "faxDeleteFlag",
    "faxEntityKey",
    "faxKeyExt"
})
public class OrganizationFaxDataObjectType {

    @XmlElementRef(name = "fax_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> faxKey;
    @XmlElementRef(name = "fax_cst_key_owner", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> faxCstKeyOwner;
    @XmlElementRef(name = "fax_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> faxNumber;
    @XmlElementRef(name = "fax_number_display", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> faxNumberDisplay;
    @XmlElementRef(name = "fax_cty_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> faxCtyKey;
    @XmlElementRef(name = "fax_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> faxAddUser;
    @XmlElementRef(name = "fax_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> faxAddDate;
    @XmlElementRef(name = "fax_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> faxChangeUser;
    @XmlElementRef(name = "fax_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> faxChangeDate;
    @XmlElementRef(name = "fax_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> faxDeleteFlag;
    @XmlElementRef(name = "fax_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> faxEntityKey;
    @XmlElementRef(name = "fax_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> faxKeyExt;

    /**
     * Gets the value of the faxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxKey() {
        return faxKey;
    }

    /**
     * Sets the value of the faxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxKey(JAXBElement<String> value) {
        this.faxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the faxCstKeyOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxCstKeyOwner() {
        return faxCstKeyOwner;
    }

    /**
     * Sets the value of the faxCstKeyOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxCstKeyOwner(JAXBElement<String> value) {
        this.faxCstKeyOwner = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxNumber(JAXBElement<String> value) {
        this.faxNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the faxNumberDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxNumberDisplay() {
        return faxNumberDisplay;
    }

    /**
     * Sets the value of the faxNumberDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxNumberDisplay(JAXBElement<String> value) {
        this.faxNumberDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the faxCtyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxCtyKey() {
        return faxCtyKey;
    }

    /**
     * Sets the value of the faxCtyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxCtyKey(JAXBElement<String> value) {
        this.faxCtyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the faxAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxAddUser() {
        return faxAddUser;
    }

    /**
     * Sets the value of the faxAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxAddUser(JAXBElement<String> value) {
        this.faxAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the faxAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxAddDate() {
        return faxAddDate;
    }

    /**
     * Sets the value of the faxAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxAddDate(JAXBElement<String> value) {
        this.faxAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the faxChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxChangeUser() {
        return faxChangeUser;
    }

    /**
     * Sets the value of the faxChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxChangeUser(JAXBElement<String> value) {
        this.faxChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the faxChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxChangeDate() {
        return faxChangeDate;
    }

    /**
     * Sets the value of the faxChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxChangeDate(JAXBElement<String> value) {
        this.faxChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the faxDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getFaxDeleteFlag() {
        return faxDeleteFlag;
    }

    /**
     * Sets the value of the faxDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setFaxDeleteFlag(JAXBElement<Short> value) {
        this.faxDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the faxEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxEntityKey() {
        return faxEntityKey;
    }

    /**
     * Sets the value of the faxEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxEntityKey(JAXBElement<String> value) {
        this.faxEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the faxKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxKeyExt() {
        return faxKeyExt;
    }

    /**
     * Sets the value of the faxKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxKeyExt(JAXBElement<String> value) {
        this.faxKeyExt = ((JAXBElement<String> ) value);
    }

}
