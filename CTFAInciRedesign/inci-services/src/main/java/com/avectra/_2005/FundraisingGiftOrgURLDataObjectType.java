
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Org_URL_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Org_URL_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ur6__url_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ur6__url_code" type="{http://www.avectra.com/2005/}av_url_long_Type" minOccurs="0"/>
 *         &lt;element name="ur6__url_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ur6__url_type" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="ur6__url_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ur6__url_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ur6__url_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ur6__url_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ur6__url_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ur6__url_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ur6__url_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ur6__url_primary" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Org_URL_DataObjectType", propOrder = {
    "ur6UrlKey",
    "ur6UrlCode",
    "ur6UrlCstKey",
    "ur6UrlType",
    "ur6UrlAddUser",
    "ur6UrlAddDate",
    "ur6UrlChangeUser",
    "ur6UrlChangeDate",
    "ur6UrlDeleteFlag",
    "ur6UrlKeyExt",
    "ur6UrlEntityKey",
    "ur6UrlPrimary"
})
public class FundraisingGiftOrgURLDataObjectType {

    @XmlElementRef(name = "ur6__url_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ur6UrlKey;
    @XmlElementRef(name = "ur6__url_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ur6UrlCode;
    @XmlElementRef(name = "ur6__url_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ur6UrlCstKey;
    @XmlElementRef(name = "ur6__url_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ur6UrlType;
    @XmlElementRef(name = "ur6__url_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ur6UrlAddUser;
    @XmlElementRef(name = "ur6__url_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ur6UrlAddDate;
    @XmlElementRef(name = "ur6__url_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ur6UrlChangeUser;
    @XmlElementRef(name = "ur6__url_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ur6UrlChangeDate;
    @XmlElementRef(name = "ur6__url_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ur6UrlDeleteFlag;
    @XmlElementRef(name = "ur6__url_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ur6UrlKeyExt;
    @XmlElementRef(name = "ur6__url_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ur6UrlEntityKey;
    @XmlElementRef(name = "ur6__url_primary", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ur6UrlPrimary;

    /**
     * Gets the value of the ur6UrlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUr6UrlKey() {
        return ur6UrlKey;
    }

    /**
     * Sets the value of the ur6UrlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUr6UrlKey(JAXBElement<String> value) {
        this.ur6UrlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ur6UrlCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUr6UrlCode() {
        return ur6UrlCode;
    }

    /**
     * Sets the value of the ur6UrlCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUr6UrlCode(JAXBElement<String> value) {
        this.ur6UrlCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ur6UrlCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUr6UrlCstKey() {
        return ur6UrlCstKey;
    }

    /**
     * Sets the value of the ur6UrlCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUr6UrlCstKey(JAXBElement<String> value) {
        this.ur6UrlCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ur6UrlType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUr6UrlType() {
        return ur6UrlType;
    }

    /**
     * Sets the value of the ur6UrlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUr6UrlType(JAXBElement<String> value) {
        this.ur6UrlType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ur6UrlAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUr6UrlAddUser() {
        return ur6UrlAddUser;
    }

    /**
     * Sets the value of the ur6UrlAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUr6UrlAddUser(JAXBElement<String> value) {
        this.ur6UrlAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ur6UrlAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUr6UrlAddDate() {
        return ur6UrlAddDate;
    }

    /**
     * Sets the value of the ur6UrlAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUr6UrlAddDate(JAXBElement<String> value) {
        this.ur6UrlAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ur6UrlChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUr6UrlChangeUser() {
        return ur6UrlChangeUser;
    }

    /**
     * Sets the value of the ur6UrlChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUr6UrlChangeUser(JAXBElement<String> value) {
        this.ur6UrlChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ur6UrlChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUr6UrlChangeDate() {
        return ur6UrlChangeDate;
    }

    /**
     * Sets the value of the ur6UrlChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUr6UrlChangeDate(JAXBElement<String> value) {
        this.ur6UrlChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ur6UrlDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getUr6UrlDeleteFlag() {
        return ur6UrlDeleteFlag;
    }

    /**
     * Sets the value of the ur6UrlDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setUr6UrlDeleteFlag(JAXBElement<Short> value) {
        this.ur6UrlDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ur6UrlKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUr6UrlKeyExt() {
        return ur6UrlKeyExt;
    }

    /**
     * Sets the value of the ur6UrlKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUr6UrlKeyExt(JAXBElement<String> value) {
        this.ur6UrlKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ur6UrlEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUr6UrlEntityKey() {
        return ur6UrlEntityKey;
    }

    /**
     * Sets the value of the ur6UrlEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUr6UrlEntityKey(JAXBElement<String> value) {
        this.ur6UrlEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ur6UrlPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getUr6UrlPrimary() {
        return ur6UrlPrimary;
    }

    /**
     * Sets the value of the ur6UrlPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setUr6UrlPrimary(JAXBElement<Short> value) {
        this.ur6UrlPrimary = ((JAXBElement<Short> ) value);
    }

}
