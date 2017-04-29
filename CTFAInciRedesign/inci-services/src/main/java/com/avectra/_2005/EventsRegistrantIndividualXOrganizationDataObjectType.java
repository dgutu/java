
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrant_Individual_X_Organization_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrant_Individual_X_Organization_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ixo_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ixo_rlt_code" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="ixo_title" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="ixo_start_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ixo_end_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ixo_ind_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ixo_org_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ixo_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ixo_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ixo_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ixo_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ixo_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ixo_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ixo_cst_key_owner" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ixo_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ixo_display_order_ext" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ixo_primary" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ixo_owner" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrant_Individual_X_Organization_DataObjectType", propOrder = {
    "ixoKey",
    "ixoRltCode",
    "ixoTitle",
    "ixoStartDate",
    "ixoEndDate",
    "ixoIndCstKey",
    "ixoOrgCstKey",
    "ixoAddDate",
    "ixoAddUser",
    "ixoChangeDate",
    "ixoChangeUser",
    "ixoDeleteFlag",
    "ixoKeyExt",
    "ixoCstKeyOwner",
    "ixoEntityKey",
    "ixoDisplayOrderExt",
    "ixoPrimary",
    "ixoOwner"
})
public class EventsRegistrantIndividualXOrganizationDataObjectType {

    @XmlElementRef(name = "ixo_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ixoKey;
    @XmlElementRef(name = "ixo_rlt_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ixoRltCode;
    @XmlElementRef(name = "ixo_title", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ixoTitle;
    @XmlElementRef(name = "ixo_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ixoStartDate;
    @XmlElementRef(name = "ixo_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ixoEndDate;
    @XmlElementRef(name = "ixo_ind_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ixoIndCstKey;
    @XmlElementRef(name = "ixo_org_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ixoOrgCstKey;
    @XmlElementRef(name = "ixo_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ixoAddDate;
    @XmlElementRef(name = "ixo_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ixoAddUser;
    @XmlElementRef(name = "ixo_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ixoChangeDate;
    @XmlElementRef(name = "ixo_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ixoChangeUser;
    @XmlElementRef(name = "ixo_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ixoDeleteFlag;
    @XmlElementRef(name = "ixo_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ixoKeyExt;
    @XmlElementRef(name = "ixo_cst_key_owner", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ixoCstKeyOwner;
    @XmlElementRef(name = "ixo_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ixoEntityKey;
    @XmlElementRef(name = "ixo_display_order_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> ixoDisplayOrderExt;
    @XmlElementRef(name = "ixo_primary", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ixoPrimary;
    @XmlElementRef(name = "ixo_owner", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ixoOwner;

    /**
     * Gets the value of the ixoKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIxoKey() {
        return ixoKey;
    }

    /**
     * Sets the value of the ixoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIxoKey(JAXBElement<String> value) {
        this.ixoKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ixoRltCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIxoRltCode() {
        return ixoRltCode;
    }

    /**
     * Sets the value of the ixoRltCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIxoRltCode(JAXBElement<String> value) {
        this.ixoRltCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ixoTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIxoTitle() {
        return ixoTitle;
    }

    /**
     * Sets the value of the ixoTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIxoTitle(JAXBElement<String> value) {
        this.ixoTitle = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ixoStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIxoStartDate() {
        return ixoStartDate;
    }

    /**
     * Sets the value of the ixoStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIxoStartDate(JAXBElement<String> value) {
        this.ixoStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ixoEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIxoEndDate() {
        return ixoEndDate;
    }

    /**
     * Sets the value of the ixoEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIxoEndDate(JAXBElement<String> value) {
        this.ixoEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ixoIndCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIxoIndCstKey() {
        return ixoIndCstKey;
    }

    /**
     * Sets the value of the ixoIndCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIxoIndCstKey(JAXBElement<String> value) {
        this.ixoIndCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ixoOrgCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIxoOrgCstKey() {
        return ixoOrgCstKey;
    }

    /**
     * Sets the value of the ixoOrgCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIxoOrgCstKey(JAXBElement<String> value) {
        this.ixoOrgCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ixoAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIxoAddDate() {
        return ixoAddDate;
    }

    /**
     * Sets the value of the ixoAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIxoAddDate(JAXBElement<String> value) {
        this.ixoAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ixoAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIxoAddUser() {
        return ixoAddUser;
    }

    /**
     * Sets the value of the ixoAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIxoAddUser(JAXBElement<String> value) {
        this.ixoAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ixoChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIxoChangeDate() {
        return ixoChangeDate;
    }

    /**
     * Sets the value of the ixoChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIxoChangeDate(JAXBElement<String> value) {
        this.ixoChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ixoChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIxoChangeUser() {
        return ixoChangeUser;
    }

    /**
     * Sets the value of the ixoChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIxoChangeUser(JAXBElement<String> value) {
        this.ixoChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ixoDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIxoDeleteFlag() {
        return ixoDeleteFlag;
    }

    /**
     * Sets the value of the ixoDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIxoDeleteFlag(JAXBElement<Short> value) {
        this.ixoDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ixoKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIxoKeyExt() {
        return ixoKeyExt;
    }

    /**
     * Sets the value of the ixoKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIxoKeyExt(JAXBElement<String> value) {
        this.ixoKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ixoCstKeyOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIxoCstKeyOwner() {
        return ixoCstKeyOwner;
    }

    /**
     * Sets the value of the ixoCstKeyOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIxoCstKeyOwner(JAXBElement<String> value) {
        this.ixoCstKeyOwner = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ixoEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIxoEntityKey() {
        return ixoEntityKey;
    }

    /**
     * Sets the value of the ixoEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIxoEntityKey(JAXBElement<String> value) {
        this.ixoEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ixoDisplayOrderExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIxoDisplayOrderExt() {
        return ixoDisplayOrderExt;
    }

    /**
     * Sets the value of the ixoDisplayOrderExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIxoDisplayOrderExt(JAXBElement<Integer> value) {
        this.ixoDisplayOrderExt = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the ixoPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIxoPrimary() {
        return ixoPrimary;
    }

    /**
     * Sets the value of the ixoPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIxoPrimary(JAXBElement<Short> value) {
        this.ixoPrimary = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ixoOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIxoOwner() {
        return ixoOwner;
    }

    /**
     * Sets the value of the ixoOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIxoOwner(JAXBElement<Short> value) {
        this.ixoOwner = ((JAXBElement<Short> ) value);
    }

}
