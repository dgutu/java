
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Individual_Home_Fax_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Individual_Home_Fax_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fa2__fax_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="fa2__fax_cst_key_owner" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="fa2__fax_number" type="{http://www.avectra.com/2005/}av_fax_Type" minOccurs="0"/>
 *         &lt;element name="fa2__fax_number_display" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="fa2__fax_cty_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="fa2__fax_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="fa2__fax_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="fa2__fax_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="fa2__fax_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="fa2__fax_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="fa2__fax_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="fa2__fax_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Individual_Home_Fax_DataObjectType", propOrder = {
    "fa2FaxKey",
    "fa2FaxCstKeyOwner",
    "fa2FaxNumber",
    "fa2FaxNumberDisplay",
    "fa2FaxCtyKey",
    "fa2FaxAddUser",
    "fa2FaxAddDate",
    "fa2FaxChangeUser",
    "fa2FaxChangeDate",
    "fa2FaxDeleteFlag",
    "fa2FaxEntityKey",
    "fa2FaxKeyExt"
})
public class IndividualHomeFaxDataObjectType {

    @XmlElementRef(name = "fa2__fax_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fa2FaxKey;
    @XmlElementRef(name = "fa2__fax_cst_key_owner", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fa2FaxCstKeyOwner;
    @XmlElementRef(name = "fa2__fax_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fa2FaxNumber;
    @XmlElementRef(name = "fa2__fax_number_display", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fa2FaxNumberDisplay;
    @XmlElementRef(name = "fa2__fax_cty_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fa2FaxCtyKey;
    @XmlElementRef(name = "fa2__fax_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fa2FaxAddUser;
    @XmlElementRef(name = "fa2__fax_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fa2FaxAddDate;
    @XmlElementRef(name = "fa2__fax_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fa2FaxChangeUser;
    @XmlElementRef(name = "fa2__fax_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fa2FaxChangeDate;
    @XmlElementRef(name = "fa2__fax_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> fa2FaxDeleteFlag;
    @XmlElementRef(name = "fa2__fax_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fa2FaxEntityKey;
    @XmlElementRef(name = "fa2__fax_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fa2FaxKeyExt;

    /**
     * Gets the value of the fa2FaxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFa2FaxKey() {
        return fa2FaxKey;
    }

    /**
     * Sets the value of the fa2FaxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFa2FaxKey(JAXBElement<String> value) {
        this.fa2FaxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fa2FaxCstKeyOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFa2FaxCstKeyOwner() {
        return fa2FaxCstKeyOwner;
    }

    /**
     * Sets the value of the fa2FaxCstKeyOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFa2FaxCstKeyOwner(JAXBElement<String> value) {
        this.fa2FaxCstKeyOwner = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fa2FaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFa2FaxNumber() {
        return fa2FaxNumber;
    }

    /**
     * Sets the value of the fa2FaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFa2FaxNumber(JAXBElement<String> value) {
        this.fa2FaxNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fa2FaxNumberDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFa2FaxNumberDisplay() {
        return fa2FaxNumberDisplay;
    }

    /**
     * Sets the value of the fa2FaxNumberDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFa2FaxNumberDisplay(JAXBElement<String> value) {
        this.fa2FaxNumberDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fa2FaxCtyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFa2FaxCtyKey() {
        return fa2FaxCtyKey;
    }

    /**
     * Sets the value of the fa2FaxCtyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFa2FaxCtyKey(JAXBElement<String> value) {
        this.fa2FaxCtyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fa2FaxAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFa2FaxAddUser() {
        return fa2FaxAddUser;
    }

    /**
     * Sets the value of the fa2FaxAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFa2FaxAddUser(JAXBElement<String> value) {
        this.fa2FaxAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fa2FaxAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFa2FaxAddDate() {
        return fa2FaxAddDate;
    }

    /**
     * Sets the value of the fa2FaxAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFa2FaxAddDate(JAXBElement<String> value) {
        this.fa2FaxAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fa2FaxChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFa2FaxChangeUser() {
        return fa2FaxChangeUser;
    }

    /**
     * Sets the value of the fa2FaxChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFa2FaxChangeUser(JAXBElement<String> value) {
        this.fa2FaxChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fa2FaxChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFa2FaxChangeDate() {
        return fa2FaxChangeDate;
    }

    /**
     * Sets the value of the fa2FaxChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFa2FaxChangeDate(JAXBElement<String> value) {
        this.fa2FaxChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fa2FaxDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getFa2FaxDeleteFlag() {
        return fa2FaxDeleteFlag;
    }

    /**
     * Sets the value of the fa2FaxDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setFa2FaxDeleteFlag(JAXBElement<Short> value) {
        this.fa2FaxDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the fa2FaxEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFa2FaxEntityKey() {
        return fa2FaxEntityKey;
    }

    /**
     * Sets the value of the fa2FaxEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFa2FaxEntityKey(JAXBElement<String> value) {
        this.fa2FaxEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fa2FaxKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFa2FaxKeyExt() {
        return fa2FaxKeyExt;
    }

    /**
     * Sets the value of the fa2FaxKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFa2FaxKeyExt(JAXBElement<String> value) {
        this.fa2FaxKeyExt = ((JAXBElement<String> ) value);
    }

}
