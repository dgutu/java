
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExhibitorNew_Exhibitor_Website_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExhibitorNew_Exhibitor_Website_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ur2__url_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ur2__url_code" type="{http://www.avectra.com/2005/}av_url_long_Type" minOccurs="0"/>
 *         &lt;element name="ur2__url_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ur2__url_type" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="ur2__url_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ur2__url_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ur2__url_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ur2__url_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ur2__url_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ur2__url_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ur2__url_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExhibitorNew_Exhibitor_Website_DataObjectType", propOrder = {
    "ur2UrlKey",
    "ur2UrlCode",
    "ur2UrlCstKey",
    "ur2UrlType",
    "ur2UrlAddUser",
    "ur2UrlAddDate",
    "ur2UrlChangeUser",
    "ur2UrlChangeDate",
    "ur2UrlDeleteFlag",
    "ur2UrlKeyExt",
    "ur2UrlEntityKey"
})
public class ExhibitorNewExhibitorWebsiteDataObjectType {

    @XmlElementRef(name = "ur2__url_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ur2UrlKey;
    @XmlElementRef(name = "ur2__url_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ur2UrlCode;
    @XmlElementRef(name = "ur2__url_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ur2UrlCstKey;
    @XmlElementRef(name = "ur2__url_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ur2UrlType;
    @XmlElementRef(name = "ur2__url_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ur2UrlAddUser;
    @XmlElementRef(name = "ur2__url_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ur2UrlAddDate;
    @XmlElementRef(name = "ur2__url_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ur2UrlChangeUser;
    @XmlElementRef(name = "ur2__url_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ur2UrlChangeDate;
    @XmlElementRef(name = "ur2__url_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ur2UrlDeleteFlag;
    @XmlElementRef(name = "ur2__url_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ur2UrlKeyExt;
    @XmlElementRef(name = "ur2__url_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ur2UrlEntityKey;

    /**
     * Gets the value of the ur2UrlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUr2UrlKey() {
        return ur2UrlKey;
    }

    /**
     * Sets the value of the ur2UrlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUr2UrlKey(JAXBElement<String> value) {
        this.ur2UrlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ur2UrlCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUr2UrlCode() {
        return ur2UrlCode;
    }

    /**
     * Sets the value of the ur2UrlCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUr2UrlCode(JAXBElement<String> value) {
        this.ur2UrlCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ur2UrlCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUr2UrlCstKey() {
        return ur2UrlCstKey;
    }

    /**
     * Sets the value of the ur2UrlCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUr2UrlCstKey(JAXBElement<String> value) {
        this.ur2UrlCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ur2UrlType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUr2UrlType() {
        return ur2UrlType;
    }

    /**
     * Sets the value of the ur2UrlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUr2UrlType(JAXBElement<String> value) {
        this.ur2UrlType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ur2UrlAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUr2UrlAddUser() {
        return ur2UrlAddUser;
    }

    /**
     * Sets the value of the ur2UrlAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUr2UrlAddUser(JAXBElement<String> value) {
        this.ur2UrlAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ur2UrlAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUr2UrlAddDate() {
        return ur2UrlAddDate;
    }

    /**
     * Sets the value of the ur2UrlAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUr2UrlAddDate(JAXBElement<String> value) {
        this.ur2UrlAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ur2UrlChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUr2UrlChangeUser() {
        return ur2UrlChangeUser;
    }

    /**
     * Sets the value of the ur2UrlChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUr2UrlChangeUser(JAXBElement<String> value) {
        this.ur2UrlChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ur2UrlChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUr2UrlChangeDate() {
        return ur2UrlChangeDate;
    }

    /**
     * Sets the value of the ur2UrlChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUr2UrlChangeDate(JAXBElement<String> value) {
        this.ur2UrlChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ur2UrlDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getUr2UrlDeleteFlag() {
        return ur2UrlDeleteFlag;
    }

    /**
     * Sets the value of the ur2UrlDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setUr2UrlDeleteFlag(JAXBElement<Short> value) {
        this.ur2UrlDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ur2UrlKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUr2UrlKeyExt() {
        return ur2UrlKeyExt;
    }

    /**
     * Sets the value of the ur2UrlKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUr2UrlKeyExt(JAXBElement<String> value) {
        this.ur2UrlKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ur2UrlEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUr2UrlEntityKey() {
        return ur2UrlEntityKey;
    }

    /**
     * Sets the value of the ur2UrlEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUr2UrlEntityKey(JAXBElement<String> value) {
        this.ur2UrlEntityKey = ((JAXBElement<String> ) value);
    }

}
