
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExhibitorBoothNew_Exhibit_Booth_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExhibitorBoothNew_Exhibit_Booth_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sbt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="sbt_exb_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="sbt_bty_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="sbt_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="sbt_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="sbt_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="sbt_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="sbt_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="sbt_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="sbt_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExhibitorBoothNew_Exhibit_Booth_DataObjectType", propOrder = {
    "sbtKey",
    "sbtExbKey",
    "sbtBtyKey",
    "sbtAddUser",
    "sbtAddDate",
    "sbtChangeUser",
    "sbtChangeDate",
    "sbtDeleteFlag",
    "sbtEntityKey",
    "sbtKeyExt"
})
public class ExhibitorBoothNewExhibitBoothDataObjectType {

    @XmlElementRef(name = "sbt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sbtKey;
    @XmlElementRef(name = "sbt_exb_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sbtExbKey;
    @XmlElementRef(name = "sbt_bty_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sbtBtyKey;
    @XmlElementRef(name = "sbt_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sbtAddUser;
    @XmlElementRef(name = "sbt_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sbtAddDate;
    @XmlElementRef(name = "sbt_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sbtChangeUser;
    @XmlElementRef(name = "sbt_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sbtChangeDate;
    @XmlElementRef(name = "sbt_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> sbtDeleteFlag;
    @XmlElementRef(name = "sbt_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sbtEntityKey;
    @XmlElementRef(name = "sbt_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sbtKeyExt;

    /**
     * Gets the value of the sbtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSbtKey() {
        return sbtKey;
    }

    /**
     * Sets the value of the sbtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSbtKey(JAXBElement<String> value) {
        this.sbtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sbtExbKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSbtExbKey() {
        return sbtExbKey;
    }

    /**
     * Sets the value of the sbtExbKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSbtExbKey(JAXBElement<String> value) {
        this.sbtExbKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sbtBtyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSbtBtyKey() {
        return sbtBtyKey;
    }

    /**
     * Sets the value of the sbtBtyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSbtBtyKey(JAXBElement<String> value) {
        this.sbtBtyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sbtAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSbtAddUser() {
        return sbtAddUser;
    }

    /**
     * Sets the value of the sbtAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSbtAddUser(JAXBElement<String> value) {
        this.sbtAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sbtAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSbtAddDate() {
        return sbtAddDate;
    }

    /**
     * Sets the value of the sbtAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSbtAddDate(JAXBElement<String> value) {
        this.sbtAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sbtChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSbtChangeUser() {
        return sbtChangeUser;
    }

    /**
     * Sets the value of the sbtChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSbtChangeUser(JAXBElement<String> value) {
        this.sbtChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sbtChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSbtChangeDate() {
        return sbtChangeDate;
    }

    /**
     * Sets the value of the sbtChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSbtChangeDate(JAXBElement<String> value) {
        this.sbtChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sbtDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getSbtDeleteFlag() {
        return sbtDeleteFlag;
    }

    /**
     * Sets the value of the sbtDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setSbtDeleteFlag(JAXBElement<Short> value) {
        this.sbtDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the sbtEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSbtEntityKey() {
        return sbtEntityKey;
    }

    /**
     * Sets the value of the sbtEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSbtEntityKey(JAXBElement<String> value) {
        this.sbtEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sbtKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSbtKeyExt() {
        return sbtKeyExt;
    }

    /**
     * Sets the value of the sbtKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSbtKeyExt(JAXBElement<String> value) {
        this.sbtKeyExt = ((JAXBElement<String> ) value);
    }

}
