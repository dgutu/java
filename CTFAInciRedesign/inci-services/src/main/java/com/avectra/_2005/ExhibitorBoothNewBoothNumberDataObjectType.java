
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExhibitorBoothNew_Booth_Number_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExhibitorBoothNew_Booth_Number_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ebn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ebn_exb_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ebn_booth_number" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ebn_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ebn_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ebn_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ebn_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ebn_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ebn_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ebn_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ebn_prefix" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="ebn_suffix" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="ebn_size" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ebn_display_booth_number" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExhibitorBoothNew_Booth_Number_DataObjectType", propOrder = {
    "ebnKey",
    "ebnExbKey",
    "ebnBoothNumber",
    "ebnAddUser",
    "ebnAddDate",
    "ebnChangeUser",
    "ebnChangeDate",
    "ebnDeleteFlag",
    "ebnKeyExt",
    "ebnEntityKey",
    "ebnPrefix",
    "ebnSuffix",
    "ebnSize",
    "ebnDisplayBoothNumber"
})
public class ExhibitorBoothNewBoothNumberDataObjectType {

    @XmlElementRef(name = "ebn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ebnKey;
    @XmlElementRef(name = "ebn_exb_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ebnExbKey;
    @XmlElementRef(name = "ebn_booth_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> ebnBoothNumber;
    @XmlElementRef(name = "ebn_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ebnAddUser;
    @XmlElementRef(name = "ebn_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ebnAddDate;
    @XmlElementRef(name = "ebn_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ebnChangeUser;
    @XmlElementRef(name = "ebn_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ebnChangeDate;
    @XmlElementRef(name = "ebn_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ebnDeleteFlag;
    @XmlElementRef(name = "ebn_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ebnKeyExt;
    @XmlElementRef(name = "ebn_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ebnEntityKey;
    @XmlElementRef(name = "ebn_prefix", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ebnPrefix;
    @XmlElementRef(name = "ebn_suffix", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ebnSuffix;
    @XmlElementRef(name = "ebn_size", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> ebnSize;
    @XmlElementRef(name = "ebn_display_booth_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ebnDisplayBoothNumber;

    /**
     * Gets the value of the ebnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEbnKey() {
        return ebnKey;
    }

    /**
     * Sets the value of the ebnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEbnKey(JAXBElement<String> value) {
        this.ebnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ebnExbKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEbnExbKey() {
        return ebnExbKey;
    }

    /**
     * Sets the value of the ebnExbKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEbnExbKey(JAXBElement<String> value) {
        this.ebnExbKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ebnBoothNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEbnBoothNumber() {
        return ebnBoothNumber;
    }

    /**
     * Sets the value of the ebnBoothNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEbnBoothNumber(JAXBElement<Integer> value) {
        this.ebnBoothNumber = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the ebnAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEbnAddUser() {
        return ebnAddUser;
    }

    /**
     * Sets the value of the ebnAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEbnAddUser(JAXBElement<String> value) {
        this.ebnAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ebnAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEbnAddDate() {
        return ebnAddDate;
    }

    /**
     * Sets the value of the ebnAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEbnAddDate(JAXBElement<String> value) {
        this.ebnAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ebnChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEbnChangeUser() {
        return ebnChangeUser;
    }

    /**
     * Sets the value of the ebnChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEbnChangeUser(JAXBElement<String> value) {
        this.ebnChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ebnChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEbnChangeDate() {
        return ebnChangeDate;
    }

    /**
     * Sets the value of the ebnChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEbnChangeDate(JAXBElement<String> value) {
        this.ebnChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ebnDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEbnDeleteFlag() {
        return ebnDeleteFlag;
    }

    /**
     * Sets the value of the ebnDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEbnDeleteFlag(JAXBElement<Short> value) {
        this.ebnDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ebnKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEbnKeyExt() {
        return ebnKeyExt;
    }

    /**
     * Sets the value of the ebnKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEbnKeyExt(JAXBElement<String> value) {
        this.ebnKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ebnEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEbnEntityKey() {
        return ebnEntityKey;
    }

    /**
     * Sets the value of the ebnEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEbnEntityKey(JAXBElement<String> value) {
        this.ebnEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ebnPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEbnPrefix() {
        return ebnPrefix;
    }

    /**
     * Sets the value of the ebnPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEbnPrefix(JAXBElement<String> value) {
        this.ebnPrefix = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ebnSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEbnSuffix() {
        return ebnSuffix;
    }

    /**
     * Sets the value of the ebnSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEbnSuffix(JAXBElement<String> value) {
        this.ebnSuffix = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ebnSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEbnSize() {
        return ebnSize;
    }

    /**
     * Sets the value of the ebnSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEbnSize(JAXBElement<Integer> value) {
        this.ebnSize = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the ebnDisplayBoothNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEbnDisplayBoothNumber() {
        return ebnDisplayBoothNumber;
    }

    /**
     * Sets the value of the ebnDisplayBoothNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEbnDisplayBoothNumber(JAXBElement<String> value) {
        this.ebnDisplayBoothNumber = ((JAXBElement<String> ) value);
    }

}
