
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Tribute_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Tribute_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tbt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="tbt_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="tbt_description" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="tbt_frt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="tbt_fpc_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="tbt_tbc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="tbt_note" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="tbt_cct_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="tbt_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="tbt_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="tbt_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="tbt_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="tbt_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="tbt_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="tbt_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Tribute_DataObjectType", propOrder = {
    "tbtKey",
    "tbtCstKey",
    "tbtDescription",
    "tbtFrtKey",
    "tbtFpcPrdKey",
    "tbtTbcKey",
    "tbtNote",
    "tbtCctKey",
    "tbtAddUser",
    "tbtAddDate",
    "tbtChangeUser",
    "tbtChangeDate",
    "tbtDeleteFlag",
    "tbtEntityKey",
    "tbtKeyExt"
})
public class FundraisingGiftTributeDataObjectType {

    @XmlElementRef(name = "tbt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> tbtKey;
    @XmlElementRef(name = "tbt_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> tbtCstKey;
    @XmlElementRef(name = "tbt_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> tbtDescription;
    @XmlElementRef(name = "tbt_frt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> tbtFrtKey;
    @XmlElementRef(name = "tbt_fpc_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> tbtFpcPrdKey;
    @XmlElementRef(name = "tbt_tbc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> tbtTbcKey;
    @XmlElementRef(name = "tbt_note", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> tbtNote;
    @XmlElementRef(name = "tbt_cct_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> tbtCctKey;
    @XmlElementRef(name = "tbt_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> tbtAddUser;
    @XmlElementRef(name = "tbt_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> tbtAddDate;
    @XmlElementRef(name = "tbt_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> tbtChangeUser;
    @XmlElementRef(name = "tbt_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> tbtChangeDate;
    @XmlElementRef(name = "tbt_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> tbtDeleteFlag;
    @XmlElementRef(name = "tbt_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> tbtEntityKey;
    @XmlElementRef(name = "tbt_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> tbtKeyExt;

    /**
     * Gets the value of the tbtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTbtKey() {
        return tbtKey;
    }

    /**
     * Sets the value of the tbtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTbtKey(JAXBElement<String> value) {
        this.tbtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tbtCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTbtCstKey() {
        return tbtCstKey;
    }

    /**
     * Sets the value of the tbtCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTbtCstKey(JAXBElement<String> value) {
        this.tbtCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tbtDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTbtDescription() {
        return tbtDescription;
    }

    /**
     * Sets the value of the tbtDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTbtDescription(JAXBElement<String> value) {
        this.tbtDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tbtFrtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTbtFrtKey() {
        return tbtFrtKey;
    }

    /**
     * Sets the value of the tbtFrtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTbtFrtKey(JAXBElement<String> value) {
        this.tbtFrtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tbtFpcPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTbtFpcPrdKey() {
        return tbtFpcPrdKey;
    }

    /**
     * Sets the value of the tbtFpcPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTbtFpcPrdKey(JAXBElement<String> value) {
        this.tbtFpcPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tbtTbcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTbtTbcKey() {
        return tbtTbcKey;
    }

    /**
     * Sets the value of the tbtTbcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTbtTbcKey(JAXBElement<String> value) {
        this.tbtTbcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tbtNote property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTbtNote() {
        return tbtNote;
    }

    /**
     * Sets the value of the tbtNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTbtNote(JAXBElement<String> value) {
        this.tbtNote = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tbtCctKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTbtCctKey() {
        return tbtCctKey;
    }

    /**
     * Sets the value of the tbtCctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTbtCctKey(JAXBElement<String> value) {
        this.tbtCctKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tbtAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTbtAddUser() {
        return tbtAddUser;
    }

    /**
     * Sets the value of the tbtAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTbtAddUser(JAXBElement<String> value) {
        this.tbtAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tbtAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTbtAddDate() {
        return tbtAddDate;
    }

    /**
     * Sets the value of the tbtAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTbtAddDate(JAXBElement<String> value) {
        this.tbtAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tbtChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTbtChangeUser() {
        return tbtChangeUser;
    }

    /**
     * Sets the value of the tbtChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTbtChangeUser(JAXBElement<String> value) {
        this.tbtChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tbtChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTbtChangeDate() {
        return tbtChangeDate;
    }

    /**
     * Sets the value of the tbtChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTbtChangeDate(JAXBElement<String> value) {
        this.tbtChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tbtDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTbtDeleteFlag() {
        return tbtDeleteFlag;
    }

    /**
     * Sets the value of the tbtDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTbtDeleteFlag(JAXBElement<Short> value) {
        this.tbtDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the tbtEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTbtEntityKey() {
        return tbtEntityKey;
    }

    /**
     * Sets the value of the tbtEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTbtEntityKey(JAXBElement<String> value) {
        this.tbtEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tbtKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTbtKeyExt() {
        return tbtKeyExt;
    }

    /**
     * Sets the value of the tbtKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTbtKeyExt(JAXBElement<String> value) {
        this.tbtKeyExt = ((JAXBElement<String> ) value);
    }

}
