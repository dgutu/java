
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Ind_URL_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Ind_URL_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="url_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="url_code" type="{http://www.avectra.com/2005/}av_url_long_Type" minOccurs="0"/>
 *         &lt;element name="url_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="url_type" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="url_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="url_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="url_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="url_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="url_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="url_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="url_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="url_primary" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Ind_URL_DataObjectType", propOrder = {
    "urlKey",
    "urlCode",
    "urlCstKey",
    "urlType",
    "urlAddUser",
    "urlAddDate",
    "urlChangeUser",
    "urlChangeDate",
    "urlDeleteFlag",
    "urlKeyExt",
    "urlEntityKey",
    "urlPrimary"
})
public class FundraisingGiftIndURLDataObjectType {

    @XmlElementRef(name = "url_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> urlKey;
    @XmlElementRef(name = "url_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> urlCode;
    @XmlElementRef(name = "url_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> urlCstKey;
    @XmlElementRef(name = "url_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> urlType;
    @XmlElementRef(name = "url_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> urlAddUser;
    @XmlElementRef(name = "url_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> urlAddDate;
    @XmlElementRef(name = "url_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> urlChangeUser;
    @XmlElementRef(name = "url_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> urlChangeDate;
    @XmlElementRef(name = "url_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> urlDeleteFlag;
    @XmlElementRef(name = "url_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> urlKeyExt;
    @XmlElementRef(name = "url_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> urlEntityKey;
    @XmlElementRef(name = "url_primary", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> urlPrimary;

    /**
     * Gets the value of the urlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrlKey() {
        return urlKey;
    }

    /**
     * Sets the value of the urlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrlKey(JAXBElement<String> value) {
        this.urlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the urlCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrlCode() {
        return urlCode;
    }

    /**
     * Sets the value of the urlCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrlCode(JAXBElement<String> value) {
        this.urlCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the urlCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrlCstKey() {
        return urlCstKey;
    }

    /**
     * Sets the value of the urlCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrlCstKey(JAXBElement<String> value) {
        this.urlCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the urlType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrlType() {
        return urlType;
    }

    /**
     * Sets the value of the urlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrlType(JAXBElement<String> value) {
        this.urlType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the urlAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrlAddUser() {
        return urlAddUser;
    }

    /**
     * Sets the value of the urlAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrlAddUser(JAXBElement<String> value) {
        this.urlAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the urlAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrlAddDate() {
        return urlAddDate;
    }

    /**
     * Sets the value of the urlAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrlAddDate(JAXBElement<String> value) {
        this.urlAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the urlChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrlChangeUser() {
        return urlChangeUser;
    }

    /**
     * Sets the value of the urlChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrlChangeUser(JAXBElement<String> value) {
        this.urlChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the urlChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrlChangeDate() {
        return urlChangeDate;
    }

    /**
     * Sets the value of the urlChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrlChangeDate(JAXBElement<String> value) {
        this.urlChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the urlDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getUrlDeleteFlag() {
        return urlDeleteFlag;
    }

    /**
     * Sets the value of the urlDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setUrlDeleteFlag(JAXBElement<Short> value) {
        this.urlDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the urlKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrlKeyExt() {
        return urlKeyExt;
    }

    /**
     * Sets the value of the urlKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrlKeyExt(JAXBElement<String> value) {
        this.urlKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the urlEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrlEntityKey() {
        return urlEntityKey;
    }

    /**
     * Sets the value of the urlEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrlEntityKey(JAXBElement<String> value) {
        this.urlEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the urlPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getUrlPrimary() {
        return urlPrimary;
    }

    /**
     * Sets the value of the urlPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setUrlPrimary(JAXBElement<Short> value) {
        this.urlPrimary = ((JAXBElement<Short> ) value);
    }

}
