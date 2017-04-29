
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExhibitorNew_booth_complement_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExhibitorNew_booth_complement_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bxc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bxc_hxb_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bxc_ecf_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bxc_ivd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bxc_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="bxc_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="bxc_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="bxc_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="bxc_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="bxc_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bxc_inv_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="bxc_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bxc_cancel_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="bxc_exb_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bxc_odd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExhibitorNew_booth_complement_DataObjectType", propOrder = {
    "bxcKey",
    "bxcHxbKey",
    "bxcEcfPrdKey",
    "bxcIvdKey",
    "bxcAddUser",
    "bxcAddDate",
    "bxcChangeUser",
    "bxcChangeDate",
    "bxcDeleteFlag",
    "bxcEntityKey",
    "bxcInvCode",
    "bxcKeyExt",
    "bxcCancelDate",
    "bxcExbKey",
    "bxcOddKey"
})
public class ExhibitorNewBoothComplementDataObjectType {

    @XmlElementRef(name = "bxc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bxcKey;
    @XmlElementRef(name = "bxc_hxb_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bxcHxbKey;
    @XmlElementRef(name = "bxc_ecf_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bxcEcfPrdKey;
    @XmlElementRef(name = "bxc_ivd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bxcIvdKey;
    @XmlElementRef(name = "bxc_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bxcAddUser;
    @XmlElementRef(name = "bxc_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bxcAddDate;
    @XmlElementRef(name = "bxc_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bxcChangeUser;
    @XmlElementRef(name = "bxc_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bxcChangeDate;
    @XmlElementRef(name = "bxc_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bxcDeleteFlag;
    @XmlElementRef(name = "bxc_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bxcEntityKey;
    @XmlElementRef(name = "bxc_inv_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bxcInvCode;
    @XmlElementRef(name = "bxc_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bxcKeyExt;
    @XmlElementRef(name = "bxc_cancel_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bxcCancelDate;
    @XmlElementRef(name = "bxc_exb_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bxcExbKey;
    @XmlElementRef(name = "bxc_odd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bxcOddKey;

    /**
     * Gets the value of the bxcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBxcKey() {
        return bxcKey;
    }

    /**
     * Sets the value of the bxcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBxcKey(JAXBElement<String> value) {
        this.bxcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bxcHxbKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBxcHxbKey() {
        return bxcHxbKey;
    }

    /**
     * Sets the value of the bxcHxbKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBxcHxbKey(JAXBElement<String> value) {
        this.bxcHxbKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bxcEcfPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBxcEcfPrdKey() {
        return bxcEcfPrdKey;
    }

    /**
     * Sets the value of the bxcEcfPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBxcEcfPrdKey(JAXBElement<String> value) {
        this.bxcEcfPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bxcIvdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBxcIvdKey() {
        return bxcIvdKey;
    }

    /**
     * Sets the value of the bxcIvdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBxcIvdKey(JAXBElement<String> value) {
        this.bxcIvdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bxcAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBxcAddUser() {
        return bxcAddUser;
    }

    /**
     * Sets the value of the bxcAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBxcAddUser(JAXBElement<String> value) {
        this.bxcAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bxcAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBxcAddDate() {
        return bxcAddDate;
    }

    /**
     * Sets the value of the bxcAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBxcAddDate(JAXBElement<String> value) {
        this.bxcAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bxcChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBxcChangeUser() {
        return bxcChangeUser;
    }

    /**
     * Sets the value of the bxcChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBxcChangeUser(JAXBElement<String> value) {
        this.bxcChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bxcChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBxcChangeDate() {
        return bxcChangeDate;
    }

    /**
     * Sets the value of the bxcChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBxcChangeDate(JAXBElement<String> value) {
        this.bxcChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bxcDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBxcDeleteFlag() {
        return bxcDeleteFlag;
    }

    /**
     * Sets the value of the bxcDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBxcDeleteFlag(JAXBElement<Short> value) {
        this.bxcDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bxcEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBxcEntityKey() {
        return bxcEntityKey;
    }

    /**
     * Sets the value of the bxcEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBxcEntityKey(JAXBElement<String> value) {
        this.bxcEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bxcInvCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBxcInvCode() {
        return bxcInvCode;
    }

    /**
     * Sets the value of the bxcInvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBxcInvCode(JAXBElement<String> value) {
        this.bxcInvCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bxcKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBxcKeyExt() {
        return bxcKeyExt;
    }

    /**
     * Sets the value of the bxcKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBxcKeyExt(JAXBElement<String> value) {
        this.bxcKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bxcCancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBxcCancelDate() {
        return bxcCancelDate;
    }

    /**
     * Sets the value of the bxcCancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBxcCancelDate(JAXBElement<String> value) {
        this.bxcCancelDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bxcExbKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBxcExbKey() {
        return bxcExbKey;
    }

    /**
     * Sets the value of the bxcExbKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBxcExbKey(JAXBElement<String> value) {
        this.bxcExbKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bxcOddKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBxcOddKey() {
        return bxcOddKey;
    }

    /**
     * Sets the value of the bxcOddKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBxcOddKey(JAXBElement<String> value) {
        this.bxcOddKey = ((JAXBElement<String> ) value);
    }

}
