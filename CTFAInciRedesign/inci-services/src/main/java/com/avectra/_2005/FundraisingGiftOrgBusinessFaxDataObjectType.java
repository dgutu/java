
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Org_Business_Fax_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Org_Business_Fax_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fa6__fax_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="fa6__fax_cst_key_owner" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="fa6__fax_number" type="{http://www.avectra.com/2005/}av_fax_Type" minOccurs="0"/>
 *         &lt;element name="fa6__fax_number_display" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="fa6__fax_cty_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="fa6__fax_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="fa6__fax_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="fa6__fax_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="fa6__fax_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="fa6__fax_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="fa6__fax_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="fa6__fax_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Org_Business_Fax_DataObjectType", propOrder = {
    "fa6FaxKey",
    "fa6FaxCstKeyOwner",
    "fa6FaxNumber",
    "fa6FaxNumberDisplay",
    "fa6FaxCtyKey",
    "fa6FaxAddUser",
    "fa6FaxAddDate",
    "fa6FaxChangeUser",
    "fa6FaxChangeDate",
    "fa6FaxDeleteFlag",
    "fa6FaxEntityKey",
    "fa6FaxKeyExt"
})
public class FundraisingGiftOrgBusinessFaxDataObjectType {

    @XmlElementRef(name = "fa6__fax_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fa6FaxKey;
    @XmlElementRef(name = "fa6__fax_cst_key_owner", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fa6FaxCstKeyOwner;
    @XmlElementRef(name = "fa6__fax_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fa6FaxNumber;
    @XmlElementRef(name = "fa6__fax_number_display", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fa6FaxNumberDisplay;
    @XmlElementRef(name = "fa6__fax_cty_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fa6FaxCtyKey;
    @XmlElementRef(name = "fa6__fax_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fa6FaxAddUser;
    @XmlElementRef(name = "fa6__fax_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fa6FaxAddDate;
    @XmlElementRef(name = "fa6__fax_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fa6FaxChangeUser;
    @XmlElementRef(name = "fa6__fax_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fa6FaxChangeDate;
    @XmlElementRef(name = "fa6__fax_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> fa6FaxDeleteFlag;
    @XmlElementRef(name = "fa6__fax_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fa6FaxEntityKey;
    @XmlElementRef(name = "fa6__fax_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fa6FaxKeyExt;

    /**
     * Gets the value of the fa6FaxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFa6FaxKey() {
        return fa6FaxKey;
    }

    /**
     * Sets the value of the fa6FaxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFa6FaxKey(JAXBElement<String> value) {
        this.fa6FaxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fa6FaxCstKeyOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFa6FaxCstKeyOwner() {
        return fa6FaxCstKeyOwner;
    }

    /**
     * Sets the value of the fa6FaxCstKeyOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFa6FaxCstKeyOwner(JAXBElement<String> value) {
        this.fa6FaxCstKeyOwner = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fa6FaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFa6FaxNumber() {
        return fa6FaxNumber;
    }

    /**
     * Sets the value of the fa6FaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFa6FaxNumber(JAXBElement<String> value) {
        this.fa6FaxNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fa6FaxNumberDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFa6FaxNumberDisplay() {
        return fa6FaxNumberDisplay;
    }

    /**
     * Sets the value of the fa6FaxNumberDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFa6FaxNumberDisplay(JAXBElement<String> value) {
        this.fa6FaxNumberDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fa6FaxCtyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFa6FaxCtyKey() {
        return fa6FaxCtyKey;
    }

    /**
     * Sets the value of the fa6FaxCtyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFa6FaxCtyKey(JAXBElement<String> value) {
        this.fa6FaxCtyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fa6FaxAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFa6FaxAddUser() {
        return fa6FaxAddUser;
    }

    /**
     * Sets the value of the fa6FaxAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFa6FaxAddUser(JAXBElement<String> value) {
        this.fa6FaxAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fa6FaxAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFa6FaxAddDate() {
        return fa6FaxAddDate;
    }

    /**
     * Sets the value of the fa6FaxAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFa6FaxAddDate(JAXBElement<String> value) {
        this.fa6FaxAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fa6FaxChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFa6FaxChangeUser() {
        return fa6FaxChangeUser;
    }

    /**
     * Sets the value of the fa6FaxChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFa6FaxChangeUser(JAXBElement<String> value) {
        this.fa6FaxChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fa6FaxChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFa6FaxChangeDate() {
        return fa6FaxChangeDate;
    }

    /**
     * Sets the value of the fa6FaxChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFa6FaxChangeDate(JAXBElement<String> value) {
        this.fa6FaxChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fa6FaxDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getFa6FaxDeleteFlag() {
        return fa6FaxDeleteFlag;
    }

    /**
     * Sets the value of the fa6FaxDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setFa6FaxDeleteFlag(JAXBElement<Short> value) {
        this.fa6FaxDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the fa6FaxEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFa6FaxEntityKey() {
        return fa6FaxEntityKey;
    }

    /**
     * Sets the value of the fa6FaxEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFa6FaxEntityKey(JAXBElement<String> value) {
        this.fa6FaxEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fa6FaxKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFa6FaxKeyExt() {
        return fa6FaxKeyExt;
    }

    /**
     * Sets the value of the fa6FaxKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFa6FaxKeyExt(JAXBElement<String> value) {
        this.fa6FaxKeyExt = ((JAXBElement<String> ) value);
    }

}
