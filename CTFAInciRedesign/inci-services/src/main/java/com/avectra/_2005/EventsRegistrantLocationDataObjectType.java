
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrant_Location_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrant_Location_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="loc_org_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="loc_lct_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="loc_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="loc_cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="loc_name" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="loc_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="loc_description" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="loc_housing_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="loc_url_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="loc_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="loc_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="loc_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="loc_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="loc_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="loc_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="loc_cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="loc_eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="loc_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="loc_description_html" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrant_Location_DataObjectType", propOrder = {
    "locKey",
    "locOrgCstKey",
    "locLctKey",
    "locCxaKey",
    "locCphKey",
    "locName",
    "locCode",
    "locDescription",
    "locHousingFlag",
    "locUrlKey",
    "locAddUser",
    "locAddDate",
    "locChangeUser",
    "locChangeDate",
    "locDeleteFlag",
    "locKeyExt",
    "locCfxKey",
    "locEmlKey",
    "locEntityKey",
    "locDescriptionHtml"
})
public class EventsRegistrantLocationDataObjectType {

    @XmlElementRef(name = "loc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> locKey;
    @XmlElementRef(name = "loc_org_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> locOrgCstKey;
    @XmlElementRef(name = "loc_lct_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> locLctKey;
    @XmlElementRef(name = "loc_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> locCxaKey;
    @XmlElementRef(name = "loc_cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> locCphKey;
    @XmlElementRef(name = "loc_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> locName;
    @XmlElementRef(name = "loc_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> locCode;
    @XmlElementRef(name = "loc_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> locDescription;
    @XmlElementRef(name = "loc_housing_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> locHousingFlag;
    @XmlElementRef(name = "loc_url_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> locUrlKey;
    @XmlElementRef(name = "loc_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> locAddUser;
    @XmlElementRef(name = "loc_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> locAddDate;
    @XmlElementRef(name = "loc_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> locChangeUser;
    @XmlElementRef(name = "loc_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> locChangeDate;
    @XmlElementRef(name = "loc_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> locDeleteFlag;
    @XmlElementRef(name = "loc_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> locKeyExt;
    @XmlElementRef(name = "loc_cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> locCfxKey;
    @XmlElementRef(name = "loc_eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> locEmlKey;
    @XmlElementRef(name = "loc_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> locEntityKey;
    @XmlElementRef(name = "loc_description_html", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> locDescriptionHtml;

    /**
     * Gets the value of the locKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocKey() {
        return locKey;
    }

    /**
     * Sets the value of the locKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocKey(JAXBElement<String> value) {
        this.locKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locOrgCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocOrgCstKey() {
        return locOrgCstKey;
    }

    /**
     * Sets the value of the locOrgCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocOrgCstKey(JAXBElement<String> value) {
        this.locOrgCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locLctKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocLctKey() {
        return locLctKey;
    }

    /**
     * Sets the value of the locLctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocLctKey(JAXBElement<String> value) {
        this.locLctKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocCxaKey() {
        return locCxaKey;
    }

    /**
     * Sets the value of the locCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocCxaKey(JAXBElement<String> value) {
        this.locCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locCphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocCphKey() {
        return locCphKey;
    }

    /**
     * Sets the value of the locCphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocCphKey(JAXBElement<String> value) {
        this.locCphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocName() {
        return locName;
    }

    /**
     * Sets the value of the locName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocName(JAXBElement<String> value) {
        this.locName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocCode() {
        return locCode;
    }

    /**
     * Sets the value of the locCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocCode(JAXBElement<String> value) {
        this.locCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocDescription() {
        return locDescription;
    }

    /**
     * Sets the value of the locDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocDescription(JAXBElement<String> value) {
        this.locDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locHousingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getLocHousingFlag() {
        return locHousingFlag;
    }

    /**
     * Sets the value of the locHousingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setLocHousingFlag(JAXBElement<Short> value) {
        this.locHousingFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the locUrlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocUrlKey() {
        return locUrlKey;
    }

    /**
     * Sets the value of the locUrlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocUrlKey(JAXBElement<String> value) {
        this.locUrlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocAddUser() {
        return locAddUser;
    }

    /**
     * Sets the value of the locAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocAddUser(JAXBElement<String> value) {
        this.locAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocAddDate() {
        return locAddDate;
    }

    /**
     * Sets the value of the locAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocAddDate(JAXBElement<String> value) {
        this.locAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocChangeUser() {
        return locChangeUser;
    }

    /**
     * Sets the value of the locChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocChangeUser(JAXBElement<String> value) {
        this.locChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocChangeDate() {
        return locChangeDate;
    }

    /**
     * Sets the value of the locChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocChangeDate(JAXBElement<String> value) {
        this.locChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getLocDeleteFlag() {
        return locDeleteFlag;
    }

    /**
     * Sets the value of the locDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setLocDeleteFlag(JAXBElement<Short> value) {
        this.locDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the locKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocKeyExt() {
        return locKeyExt;
    }

    /**
     * Sets the value of the locKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocKeyExt(JAXBElement<String> value) {
        this.locKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locCfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocCfxKey() {
        return locCfxKey;
    }

    /**
     * Sets the value of the locCfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocCfxKey(JAXBElement<String> value) {
        this.locCfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locEmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocEmlKey() {
        return locEmlKey;
    }

    /**
     * Sets the value of the locEmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocEmlKey(JAXBElement<String> value) {
        this.locEmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocEntityKey() {
        return locEntityKey;
    }

    /**
     * Sets the value of the locEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocEntityKey(JAXBElement<String> value) {
        this.locEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locDescriptionHtml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocDescriptionHtml() {
        return locDescriptionHtml;
    }

    /**
     * Sets the value of the locDescriptionHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocDescriptionHtml(JAXBElement<String> value) {
        this.locDescriptionHtml = ((JAXBElement<String> ) value);
    }

}
