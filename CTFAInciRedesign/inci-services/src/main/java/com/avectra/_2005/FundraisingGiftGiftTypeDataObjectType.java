
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Gift_Type_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Gift_Type_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gty_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gty_type" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="gty_description" type="{http://www.avectra.com/2005/}stringLength255_Type" minOccurs="0"/>
 *         &lt;element name="gty_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="gty_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="gty_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="gty_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="gty_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="gty_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="gty_display_order" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="gty_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Gift_Type_DataObjectType", propOrder = {
    "gtyKey",
    "gtyType",
    "gtyDescription",
    "gtyAddUser",
    "gtyAddDate",
    "gtyChangeUser",
    "gtyChangeDate",
    "gtyDeleteFlag",
    "gtyEntityKey",
    "gtyDisplayOrder",
    "gtyKeyExt"
})
public class FundraisingGiftGiftTypeDataObjectType {

    @XmlElementRef(name = "gty_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gtyKey;
    @XmlElementRef(name = "gty_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gtyType;
    @XmlElementRef(name = "gty_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gtyDescription;
    @XmlElementRef(name = "gty_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gtyAddUser;
    @XmlElementRef(name = "gty_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gtyAddDate;
    @XmlElementRef(name = "gty_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gtyChangeUser;
    @XmlElementRef(name = "gty_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gtyChangeDate;
    @XmlElementRef(name = "gty_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> gtyDeleteFlag;
    @XmlElementRef(name = "gty_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gtyEntityKey;
    @XmlElementRef(name = "gty_display_order", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> gtyDisplayOrder;
    @XmlElementRef(name = "gty_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> gtyKeyExt;

    /**
     * Gets the value of the gtyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGtyKey() {
        return gtyKey;
    }

    /**
     * Sets the value of the gtyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGtyKey(JAXBElement<String> value) {
        this.gtyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gtyType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGtyType() {
        return gtyType;
    }

    /**
     * Sets the value of the gtyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGtyType(JAXBElement<String> value) {
        this.gtyType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gtyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGtyDescription() {
        return gtyDescription;
    }

    /**
     * Sets the value of the gtyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGtyDescription(JAXBElement<String> value) {
        this.gtyDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gtyAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGtyAddUser() {
        return gtyAddUser;
    }

    /**
     * Sets the value of the gtyAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGtyAddUser(JAXBElement<String> value) {
        this.gtyAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gtyAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGtyAddDate() {
        return gtyAddDate;
    }

    /**
     * Sets the value of the gtyAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGtyAddDate(JAXBElement<String> value) {
        this.gtyAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gtyChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGtyChangeUser() {
        return gtyChangeUser;
    }

    /**
     * Sets the value of the gtyChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGtyChangeUser(JAXBElement<String> value) {
        this.gtyChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gtyChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGtyChangeDate() {
        return gtyChangeDate;
    }

    /**
     * Sets the value of the gtyChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGtyChangeDate(JAXBElement<String> value) {
        this.gtyChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gtyDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getGtyDeleteFlag() {
        return gtyDeleteFlag;
    }

    /**
     * Sets the value of the gtyDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setGtyDeleteFlag(JAXBElement<Short> value) {
        this.gtyDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the gtyEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGtyEntityKey() {
        return gtyEntityKey;
    }

    /**
     * Sets the value of the gtyEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGtyEntityKey(JAXBElement<String> value) {
        this.gtyEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gtyDisplayOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGtyDisplayOrder() {
        return gtyDisplayOrder;
    }

    /**
     * Sets the value of the gtyDisplayOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGtyDisplayOrder(JAXBElement<Integer> value) {
        this.gtyDisplayOrder = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the gtyKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGtyKeyExt() {
        return gtyKeyExt;
    }

    /**
     * Sets the value of the gtyKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGtyKeyExt(JAXBElement<String> value) {
        this.gtyKeyExt = ((JAXBElement<String> ) value);
    }

}
