
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceDetail_Shipping_Address_Type_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceDetail_Shipping_Address_Type_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adt_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="adt_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="adt_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="adt_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="adt_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="adt_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="adt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="adt_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="adt_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceDetail_Shipping_Address_Type_DataObjectType", propOrder = {
    "adtCode",
    "adtAddUser",
    "adtAddDate",
    "adtChangeDate",
    "adtChangeUser",
    "adtDeleteFlag",
    "adtKey",
    "adtKeyExt",
    "adtEntityKey"
})
public class InvoiceDetailShippingAddressTypeDataObjectType {

    @XmlElementRef(name = "adt_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adtCode;
    @XmlElementRef(name = "adt_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adtAddUser;
    @XmlElementRef(name = "adt_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adtAddDate;
    @XmlElementRef(name = "adt_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adtChangeDate;
    @XmlElementRef(name = "adt_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adtChangeUser;
    @XmlElementRef(name = "adt_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> adtDeleteFlag;
    @XmlElementRef(name = "adt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adtKey;
    @XmlElementRef(name = "adt_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adtKeyExt;
    @XmlElementRef(name = "adt_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adtEntityKey;

    /**
     * Gets the value of the adtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdtCode() {
        return adtCode;
    }

    /**
     * Sets the value of the adtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdtCode(JAXBElement<String> value) {
        this.adtCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adtAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdtAddUser() {
        return adtAddUser;
    }

    /**
     * Sets the value of the adtAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdtAddUser(JAXBElement<String> value) {
        this.adtAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adtAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdtAddDate() {
        return adtAddDate;
    }

    /**
     * Sets the value of the adtAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdtAddDate(JAXBElement<String> value) {
        this.adtAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adtChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdtChangeDate() {
        return adtChangeDate;
    }

    /**
     * Sets the value of the adtChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdtChangeDate(JAXBElement<String> value) {
        this.adtChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adtChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdtChangeUser() {
        return adtChangeUser;
    }

    /**
     * Sets the value of the adtChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdtChangeUser(JAXBElement<String> value) {
        this.adtChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adtDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getAdtDeleteFlag() {
        return adtDeleteFlag;
    }

    /**
     * Sets the value of the adtDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setAdtDeleteFlag(JAXBElement<Short> value) {
        this.adtDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the adtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdtKey() {
        return adtKey;
    }

    /**
     * Sets the value of the adtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdtKey(JAXBElement<String> value) {
        this.adtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adtKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdtKeyExt() {
        return adtKeyExt;
    }

    /**
     * Sets the value of the adtKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdtKeyExt(JAXBElement<String> value) {
        this.adtKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adtEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdtEntityKey() {
        return adtEntityKey;
    }

    /**
     * Sets the value of the adtEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdtEntityKey(JAXBElement<String> value) {
        this.adtEntityKey = ((JAXBElement<String> ) value);
    }

}
