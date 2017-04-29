
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Recogntion_Type_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Recogntion_Type_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="frt_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="frt_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="frt_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="frt_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="frt_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="frt_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="frt_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="frt_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Recogntion_Type_DataObjectType", propOrder = {
    "frtKey",
    "frtAddUser",
    "frtAddDate",
    "frtChangeUser",
    "frtChangeDate",
    "frtDeleteFlag",
    "frtEntityKey",
    "frtCode",
    "frtKeyExt"
})
public class FundraisingGiftRecogntionTypeDataObjectType {

    @XmlElementRef(name = "frt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> frtKey;
    @XmlElementRef(name = "frt_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> frtAddUser;
    @XmlElementRef(name = "frt_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> frtAddDate;
    @XmlElementRef(name = "frt_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> frtChangeUser;
    @XmlElementRef(name = "frt_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> frtChangeDate;
    @XmlElementRef(name = "frt_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> frtDeleteFlag;
    @XmlElementRef(name = "frt_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> frtEntityKey;
    @XmlElementRef(name = "frt_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> frtCode;
    @XmlElementRef(name = "frt_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> frtKeyExt;

    /**
     * Gets the value of the frtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFrtKey() {
        return frtKey;
    }

    /**
     * Sets the value of the frtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFrtKey(JAXBElement<String> value) {
        this.frtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the frtAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFrtAddUser() {
        return frtAddUser;
    }

    /**
     * Sets the value of the frtAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFrtAddUser(JAXBElement<String> value) {
        this.frtAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the frtAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFrtAddDate() {
        return frtAddDate;
    }

    /**
     * Sets the value of the frtAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFrtAddDate(JAXBElement<String> value) {
        this.frtAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the frtChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFrtChangeUser() {
        return frtChangeUser;
    }

    /**
     * Sets the value of the frtChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFrtChangeUser(JAXBElement<String> value) {
        this.frtChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the frtChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFrtChangeDate() {
        return frtChangeDate;
    }

    /**
     * Sets the value of the frtChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFrtChangeDate(JAXBElement<String> value) {
        this.frtChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the frtDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getFrtDeleteFlag() {
        return frtDeleteFlag;
    }

    /**
     * Sets the value of the frtDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setFrtDeleteFlag(JAXBElement<Short> value) {
        this.frtDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the frtEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFrtEntityKey() {
        return frtEntityKey;
    }

    /**
     * Sets the value of the frtEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFrtEntityKey(JAXBElement<String> value) {
        this.frtEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the frtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFrtCode() {
        return frtCode;
    }

    /**
     * Sets the value of the frtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFrtCode(JAXBElement<String> value) {
        this.frtCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the frtKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFrtKeyExt() {
        return frtKeyExt;
    }

    /**
     * Sets the value of the frtKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFrtKeyExt(JAXBElement<String> value) {
        this.frtKeyExt = ((JAXBElement<String> ) value);
    }

}
