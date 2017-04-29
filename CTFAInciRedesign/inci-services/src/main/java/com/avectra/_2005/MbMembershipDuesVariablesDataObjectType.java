
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mb_membership_Dues_Variables_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mb_membership_Dues_Variables_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dcv_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="dcv_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="dcv_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="dcv_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="dcv_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="dcv_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="dcv_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="dcv_dues_year" type="{http://www.avectra.com/2005/}stringLength4_Type" minOccurs="0"/>
 *         &lt;element name="dcv_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mb_membership_Dues_Variables_DataObjectType", propOrder = {
    "dcvKey",
    "dcvAddUser",
    "dcvAddDate",
    "dcvChangeUser",
    "dcvChangeDate",
    "dcvDeleteFlag",
    "dcvKeyExt",
    "dcvDuesYear",
    "dcvEntityKey"
})
public class MbMembershipDuesVariablesDataObjectType {

    @XmlElementRef(name = "dcv_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dcvKey;
    @XmlElementRef(name = "dcv_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dcvAddUser;
    @XmlElementRef(name = "dcv_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dcvAddDate;
    @XmlElementRef(name = "dcv_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dcvChangeUser;
    @XmlElementRef(name = "dcv_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dcvChangeDate;
    @XmlElementRef(name = "dcv_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> dcvDeleteFlag;
    @XmlElementRef(name = "dcv_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dcvKeyExt;
    @XmlElementRef(name = "dcv_dues_year", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dcvDuesYear;
    @XmlElementRef(name = "dcv_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dcvEntityKey;

    /**
     * Gets the value of the dcvKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDcvKey() {
        return dcvKey;
    }

    /**
     * Sets the value of the dcvKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDcvKey(JAXBElement<String> value) {
        this.dcvKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dcvAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDcvAddUser() {
        return dcvAddUser;
    }

    /**
     * Sets the value of the dcvAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDcvAddUser(JAXBElement<String> value) {
        this.dcvAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dcvAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDcvAddDate() {
        return dcvAddDate;
    }

    /**
     * Sets the value of the dcvAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDcvAddDate(JAXBElement<String> value) {
        this.dcvAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dcvChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDcvChangeUser() {
        return dcvChangeUser;
    }

    /**
     * Sets the value of the dcvChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDcvChangeUser(JAXBElement<String> value) {
        this.dcvChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dcvChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDcvChangeDate() {
        return dcvChangeDate;
    }

    /**
     * Sets the value of the dcvChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDcvChangeDate(JAXBElement<String> value) {
        this.dcvChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dcvDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getDcvDeleteFlag() {
        return dcvDeleteFlag;
    }

    /**
     * Sets the value of the dcvDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setDcvDeleteFlag(JAXBElement<Short> value) {
        this.dcvDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the dcvKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDcvKeyExt() {
        return dcvKeyExt;
    }

    /**
     * Sets the value of the dcvKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDcvKeyExt(JAXBElement<String> value) {
        this.dcvKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dcvDuesYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDcvDuesYear() {
        return dcvDuesYear;
    }

    /**
     * Sets the value of the dcvDuesYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDcvDuesYear(JAXBElement<String> value) {
        this.dcvDuesYear = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dcvEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDcvEntityKey() {
        return dcvEntityKey;
    }

    /**
     * Sets the value of the dcvEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDcvEntityKey(JAXBElement<String> value) {
        this.dcvEntityKey = ((JAXBElement<String> ) value);
    }

}
