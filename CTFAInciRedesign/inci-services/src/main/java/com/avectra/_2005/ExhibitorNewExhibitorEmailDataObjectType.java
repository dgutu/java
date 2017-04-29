
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExhibitorNew_Exhibitor_Email_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExhibitorNew_Exhibitor_Email_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="em2__eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="em2__eml_address" type="{http://www.avectra.com/2005/}av_email_Type" minOccurs="0"/>
 *         &lt;element name="em2__eml_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="em2__eml_type" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="em2__eml_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="em2__eml_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="em2__eml_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="em2__eml_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="em2__eml_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="em2__eml_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="em2__eml_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="em2__eml_invalid_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="em2__eml_invalid_reason" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="em2__eml_unlisted_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExhibitorNew_Exhibitor_Email_DataObjectType", propOrder = {
    "em2EmlKey",
    "em2EmlAddress",
    "em2EmlCstKey",
    "em2EmlType",
    "em2EmlAddUser",
    "em2EmlAddDate",
    "em2EmlChangeUser",
    "em2EmlChangeDate",
    "em2EmlDeleteFlag",
    "em2EmlKeyExt",
    "em2EmlEntityKey",
    "em2EmlInvalidFlag",
    "em2EmlInvalidReason",
    "em2EmlUnlistedFlag"
})
public class ExhibitorNewExhibitorEmailDataObjectType {

    @XmlElementRef(name = "em2__eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> em2EmlKey;
    @XmlElementRef(name = "em2__eml_address", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> em2EmlAddress;
    @XmlElementRef(name = "em2__eml_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> em2EmlCstKey;
    @XmlElementRef(name = "em2__eml_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> em2EmlType;
    @XmlElementRef(name = "em2__eml_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> em2EmlAddUser;
    @XmlElementRef(name = "em2__eml_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> em2EmlAddDate;
    @XmlElementRef(name = "em2__eml_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> em2EmlChangeUser;
    @XmlElementRef(name = "em2__eml_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> em2EmlChangeDate;
    @XmlElementRef(name = "em2__eml_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> em2EmlDeleteFlag;
    @XmlElementRef(name = "em2__eml_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> em2EmlKeyExt;
    @XmlElementRef(name = "em2__eml_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> em2EmlEntityKey;
    @XmlElementRef(name = "em2__eml_invalid_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> em2EmlInvalidFlag;
    @XmlElementRef(name = "em2__eml_invalid_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> em2EmlInvalidReason;
    @XmlElementRef(name = "em2__eml_unlisted_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> em2EmlUnlistedFlag;

    /**
     * Gets the value of the em2EmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEm2EmlKey() {
        return em2EmlKey;
    }

    /**
     * Sets the value of the em2EmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEm2EmlKey(JAXBElement<String> value) {
        this.em2EmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the em2EmlAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEm2EmlAddress() {
        return em2EmlAddress;
    }

    /**
     * Sets the value of the em2EmlAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEm2EmlAddress(JAXBElement<String> value) {
        this.em2EmlAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the em2EmlCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEm2EmlCstKey() {
        return em2EmlCstKey;
    }

    /**
     * Sets the value of the em2EmlCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEm2EmlCstKey(JAXBElement<String> value) {
        this.em2EmlCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the em2EmlType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEm2EmlType() {
        return em2EmlType;
    }

    /**
     * Sets the value of the em2EmlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEm2EmlType(JAXBElement<String> value) {
        this.em2EmlType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the em2EmlAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEm2EmlAddUser() {
        return em2EmlAddUser;
    }

    /**
     * Sets the value of the em2EmlAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEm2EmlAddUser(JAXBElement<String> value) {
        this.em2EmlAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the em2EmlAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEm2EmlAddDate() {
        return em2EmlAddDate;
    }

    /**
     * Sets the value of the em2EmlAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEm2EmlAddDate(JAXBElement<String> value) {
        this.em2EmlAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the em2EmlChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEm2EmlChangeUser() {
        return em2EmlChangeUser;
    }

    /**
     * Sets the value of the em2EmlChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEm2EmlChangeUser(JAXBElement<String> value) {
        this.em2EmlChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the em2EmlChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEm2EmlChangeDate() {
        return em2EmlChangeDate;
    }

    /**
     * Sets the value of the em2EmlChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEm2EmlChangeDate(JAXBElement<String> value) {
        this.em2EmlChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the em2EmlDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEm2EmlDeleteFlag() {
        return em2EmlDeleteFlag;
    }

    /**
     * Sets the value of the em2EmlDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEm2EmlDeleteFlag(JAXBElement<Short> value) {
        this.em2EmlDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the em2EmlKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEm2EmlKeyExt() {
        return em2EmlKeyExt;
    }

    /**
     * Sets the value of the em2EmlKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEm2EmlKeyExt(JAXBElement<String> value) {
        this.em2EmlKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the em2EmlEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEm2EmlEntityKey() {
        return em2EmlEntityKey;
    }

    /**
     * Sets the value of the em2EmlEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEm2EmlEntityKey(JAXBElement<String> value) {
        this.em2EmlEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the em2EmlInvalidFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEm2EmlInvalidFlag() {
        return em2EmlInvalidFlag;
    }

    /**
     * Sets the value of the em2EmlInvalidFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEm2EmlInvalidFlag(JAXBElement<Short> value) {
        this.em2EmlInvalidFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the em2EmlInvalidReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEm2EmlInvalidReason() {
        return em2EmlInvalidReason;
    }

    /**
     * Sets the value of the em2EmlInvalidReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEm2EmlInvalidReason(JAXBElement<String> value) {
        this.em2EmlInvalidReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the em2EmlUnlistedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEm2EmlUnlistedFlag() {
        return em2EmlUnlistedFlag;
    }

    /**
     * Sets the value of the em2EmlUnlistedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEm2EmlUnlistedFlag(JAXBElement<Short> value) {
        this.em2EmlUnlistedFlag = ((JAXBElement<Short> ) value);
    }

}
