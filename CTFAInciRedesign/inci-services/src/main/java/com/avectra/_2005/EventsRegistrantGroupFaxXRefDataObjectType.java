
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrantGroup_Fax_XRef_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrantGroup_Fax_XRef_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cfx_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cfx_fax_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cfx_fxt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cfx_cst_link_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cfx_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cfx_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cfx_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cfx_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cfx_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cfx_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cfx_unlisted_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cfx_fax_number_complete" type="{http://www.avectra.com/2005/}stringLength55_Type" minOccurs="0"/>
 *         &lt;element name="cfx_extension" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cfx_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cfx_primary" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cfx_owner" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrantGroup_Fax_XRef_DataObjectType", propOrder = {
    "cfxKey",
    "cfxCstKey",
    "cfxFaxKey",
    "cfxFxtKey",
    "cfxCstLinkKey",
    "cfxAddUser",
    "cfxAddDate",
    "cfxChangeUser",
    "cfxChangeDate",
    "cfxDeleteFlag",
    "cfxKeyExt",
    "cfxUnlistedFlag",
    "cfxFaxNumberComplete",
    "cfxExtension",
    "cfxEntityKey",
    "cfxPrimary",
    "cfxOwner"
})
public class EventsRegistrantGroupFaxXRefDataObjectType {

    @XmlElementRef(name = "cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cfxKey;
    @XmlElementRef(name = "cfx_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cfxCstKey;
    @XmlElementRef(name = "cfx_fax_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cfxFaxKey;
    @XmlElementRef(name = "cfx_fxt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cfxFxtKey;
    @XmlElementRef(name = "cfx_cst_link_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cfxCstLinkKey;
    @XmlElementRef(name = "cfx_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cfxAddUser;
    @XmlElementRef(name = "cfx_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cfxAddDate;
    @XmlElementRef(name = "cfx_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cfxChangeUser;
    @XmlElementRef(name = "cfx_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cfxChangeDate;
    @XmlElementRef(name = "cfx_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cfxDeleteFlag;
    @XmlElementRef(name = "cfx_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cfxKeyExt;
    @XmlElementRef(name = "cfx_unlisted_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cfxUnlistedFlag;
    @XmlElementRef(name = "cfx_fax_number_complete", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cfxFaxNumberComplete;
    @XmlElementRef(name = "cfx_extension", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cfxExtension;
    @XmlElementRef(name = "cfx_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cfxEntityKey;
    @XmlElementRef(name = "cfx_primary", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cfxPrimary;
    @XmlElementRef(name = "cfx_owner", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cfxOwner;

    /**
     * Gets the value of the cfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCfxKey() {
        return cfxKey;
    }

    /**
     * Sets the value of the cfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCfxKey(JAXBElement<String> value) {
        this.cfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cfxCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCfxCstKey() {
        return cfxCstKey;
    }

    /**
     * Sets the value of the cfxCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCfxCstKey(JAXBElement<String> value) {
        this.cfxCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cfxFaxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCfxFaxKey() {
        return cfxFaxKey;
    }

    /**
     * Sets the value of the cfxFaxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCfxFaxKey(JAXBElement<String> value) {
        this.cfxFaxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cfxFxtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCfxFxtKey() {
        return cfxFxtKey;
    }

    /**
     * Sets the value of the cfxFxtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCfxFxtKey(JAXBElement<String> value) {
        this.cfxFxtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cfxCstLinkKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCfxCstLinkKey() {
        return cfxCstLinkKey;
    }

    /**
     * Sets the value of the cfxCstLinkKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCfxCstLinkKey(JAXBElement<String> value) {
        this.cfxCstLinkKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cfxAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCfxAddUser() {
        return cfxAddUser;
    }

    /**
     * Sets the value of the cfxAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCfxAddUser(JAXBElement<String> value) {
        this.cfxAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cfxAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCfxAddDate() {
        return cfxAddDate;
    }

    /**
     * Sets the value of the cfxAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCfxAddDate(JAXBElement<String> value) {
        this.cfxAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cfxChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCfxChangeUser() {
        return cfxChangeUser;
    }

    /**
     * Sets the value of the cfxChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCfxChangeUser(JAXBElement<String> value) {
        this.cfxChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cfxChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCfxChangeDate() {
        return cfxChangeDate;
    }

    /**
     * Sets the value of the cfxChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCfxChangeDate(JAXBElement<String> value) {
        this.cfxChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cfxDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCfxDeleteFlag() {
        return cfxDeleteFlag;
    }

    /**
     * Sets the value of the cfxDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCfxDeleteFlag(JAXBElement<Short> value) {
        this.cfxDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cfxKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCfxKeyExt() {
        return cfxKeyExt;
    }

    /**
     * Sets the value of the cfxKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCfxKeyExt(JAXBElement<String> value) {
        this.cfxKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cfxUnlistedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCfxUnlistedFlag() {
        return cfxUnlistedFlag;
    }

    /**
     * Sets the value of the cfxUnlistedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCfxUnlistedFlag(JAXBElement<Short> value) {
        this.cfxUnlistedFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cfxFaxNumberComplete property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCfxFaxNumberComplete() {
        return cfxFaxNumberComplete;
    }

    /**
     * Sets the value of the cfxFaxNumberComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCfxFaxNumberComplete(JAXBElement<String> value) {
        this.cfxFaxNumberComplete = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cfxExtension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCfxExtension() {
        return cfxExtension;
    }

    /**
     * Sets the value of the cfxExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCfxExtension(JAXBElement<String> value) {
        this.cfxExtension = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cfxEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCfxEntityKey() {
        return cfxEntityKey;
    }

    /**
     * Sets the value of the cfxEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCfxEntityKey(JAXBElement<String> value) {
        this.cfxEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cfxPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCfxPrimary() {
        return cfxPrimary;
    }

    /**
     * Sets the value of the cfxPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCfxPrimary(JAXBElement<Short> value) {
        this.cfxPrimary = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cfxOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCfxOwner() {
        return cfxOwner;
    }

    /**
     * Sets the value of the cfxOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCfxOwner(JAXBElement<Short> value) {
        this.cfxOwner = ((JAXBElement<Short> ) value);
    }

}
