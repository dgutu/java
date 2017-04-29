
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Package_Code_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Package_Code_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pck_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pck_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="pck_description" type="{http://www.avectra.com/2005/}stringLength255_Type" minOccurs="0"/>
 *         &lt;element name="pck_start_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="pck_end_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="pck_goal" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="pck_notes" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="pck_active_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="pck_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="pck_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="pck_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="pck_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="pck_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="pck_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pck_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pck_oes_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Package_Code_DataObjectType", propOrder = {
    "pckKey",
    "pckCode",
    "pckDescription",
    "pckStartDate",
    "pckEndDate",
    "pckGoal",
    "pckNotes",
    "pckActiveFlag",
    "pckAddUser",
    "pckAddDate",
    "pckChangeUser",
    "pckChangeDate",
    "pckDeleteFlag",
    "pckEntityKey",
    "pckKeyExt",
    "pckOesKey"
})
public class FundraisingGiftPackageCodeDataObjectType {

    @XmlElementRef(name = "pck_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pckKey;
    @XmlElementRef(name = "pck_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pckCode;
    @XmlElementRef(name = "pck_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pckDescription;
    @XmlElementRef(name = "pck_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pckStartDate;
    @XmlElementRef(name = "pck_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pckEndDate;
    @XmlElementRef(name = "pck_goal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> pckGoal;
    @XmlElementRef(name = "pck_notes", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pckNotes;
    @XmlElementRef(name = "pck_active_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> pckActiveFlag;
    @XmlElementRef(name = "pck_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pckAddUser;
    @XmlElementRef(name = "pck_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pckAddDate;
    @XmlElementRef(name = "pck_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pckChangeUser;
    @XmlElementRef(name = "pck_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pckChangeDate;
    @XmlElementRef(name = "pck_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> pckDeleteFlag;
    @XmlElementRef(name = "pck_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pckEntityKey;
    @XmlElementRef(name = "pck_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pckKeyExt;
    @XmlElementRef(name = "pck_oes_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pckOesKey;

    /**
     * Gets the value of the pckKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPckKey() {
        return pckKey;
    }

    /**
     * Sets the value of the pckKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPckKey(JAXBElement<String> value) {
        this.pckKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pckCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPckCode() {
        return pckCode;
    }

    /**
     * Sets the value of the pckCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPckCode(JAXBElement<String> value) {
        this.pckCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pckDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPckDescription() {
        return pckDescription;
    }

    /**
     * Sets the value of the pckDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPckDescription(JAXBElement<String> value) {
        this.pckDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pckStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPckStartDate() {
        return pckStartDate;
    }

    /**
     * Sets the value of the pckStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPckStartDate(JAXBElement<String> value) {
        this.pckStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pckEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPckEndDate() {
        return pckEndDate;
    }

    /**
     * Sets the value of the pckEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPckEndDate(JAXBElement<String> value) {
        this.pckEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pckGoal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPckGoal() {
        return pckGoal;
    }

    /**
     * Sets the value of the pckGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPckGoal(JAXBElement<BigDecimal> value) {
        this.pckGoal = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the pckNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPckNotes() {
        return pckNotes;
    }

    /**
     * Sets the value of the pckNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPckNotes(JAXBElement<String> value) {
        this.pckNotes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pckActiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPckActiveFlag() {
        return pckActiveFlag;
    }

    /**
     * Sets the value of the pckActiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPckActiveFlag(JAXBElement<Short> value) {
        this.pckActiveFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the pckAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPckAddUser() {
        return pckAddUser;
    }

    /**
     * Sets the value of the pckAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPckAddUser(JAXBElement<String> value) {
        this.pckAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pckAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPckAddDate() {
        return pckAddDate;
    }

    /**
     * Sets the value of the pckAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPckAddDate(JAXBElement<String> value) {
        this.pckAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pckChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPckChangeUser() {
        return pckChangeUser;
    }

    /**
     * Sets the value of the pckChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPckChangeUser(JAXBElement<String> value) {
        this.pckChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pckChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPckChangeDate() {
        return pckChangeDate;
    }

    /**
     * Sets the value of the pckChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPckChangeDate(JAXBElement<String> value) {
        this.pckChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pckDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPckDeleteFlag() {
        return pckDeleteFlag;
    }

    /**
     * Sets the value of the pckDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPckDeleteFlag(JAXBElement<Short> value) {
        this.pckDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the pckEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPckEntityKey() {
        return pckEntityKey;
    }

    /**
     * Sets the value of the pckEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPckEntityKey(JAXBElement<String> value) {
        this.pckEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pckKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPckKeyExt() {
        return pckKeyExt;
    }

    /**
     * Sets the value of the pckKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPckKeyExt(JAXBElement<String> value) {
        this.pckKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pckOesKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPckOesKey() {
        return pckOesKey;
    }

    /**
     * Sets the value of the pckOesKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPckOesKey(JAXBElement<String> value) {
        this.pckOesKey = ((JAXBElement<String> ) value);
    }

}
