
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommitteeNominations_Committee_Nomination_Status_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitteeNominations_Committee_Nomination_Status_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nms_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nms_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="nms_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="nms_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="nms_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="nms_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="nms_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="nms_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="nms_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitteeNominations_Committee_Nomination_Status_DataObjectType", propOrder = {
    "nmsKey",
    "nmsCode",
    "nmsAddUser",
    "nmsAddDate",
    "nmsChangeUser",
    "nmsChangeDate",
    "nmsDeleteFlag",
    "nmsKeyExt",
    "nmsEntityKey"
})
public class CommitteeNominationsCommitteeNominationStatusDataObjectType {

    @XmlElementRef(name = "nms_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmsKey;
    @XmlElementRef(name = "nms_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmsCode;
    @XmlElementRef(name = "nms_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmsAddUser;
    @XmlElementRef(name = "nms_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmsAddDate;
    @XmlElementRef(name = "nms_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmsChangeUser;
    @XmlElementRef(name = "nms_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmsChangeDate;
    @XmlElementRef(name = "nms_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> nmsDeleteFlag;
    @XmlElementRef(name = "nms_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmsKeyExt;
    @XmlElementRef(name = "nms_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> nmsEntityKey;

    /**
     * Gets the value of the nmsKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmsKey() {
        return nmsKey;
    }

    /**
     * Sets the value of the nmsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmsKey(JAXBElement<String> value) {
        this.nmsKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmsCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmsCode() {
        return nmsCode;
    }

    /**
     * Sets the value of the nmsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmsCode(JAXBElement<String> value) {
        this.nmsCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmsAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmsAddUser() {
        return nmsAddUser;
    }

    /**
     * Sets the value of the nmsAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmsAddUser(JAXBElement<String> value) {
        this.nmsAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmsAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmsAddDate() {
        return nmsAddDate;
    }

    /**
     * Sets the value of the nmsAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmsAddDate(JAXBElement<String> value) {
        this.nmsAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmsChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmsChangeUser() {
        return nmsChangeUser;
    }

    /**
     * Sets the value of the nmsChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmsChangeUser(JAXBElement<String> value) {
        this.nmsChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmsChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmsChangeDate() {
        return nmsChangeDate;
    }

    /**
     * Sets the value of the nmsChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmsChangeDate(JAXBElement<String> value) {
        this.nmsChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmsDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNmsDeleteFlag() {
        return nmsDeleteFlag;
    }

    /**
     * Sets the value of the nmsDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNmsDeleteFlag(JAXBElement<Short> value) {
        this.nmsDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the nmsKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmsKeyExt() {
        return nmsKeyExt;
    }

    /**
     * Sets the value of the nmsKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmsKeyExt(JAXBElement<String> value) {
        this.nmsKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nmsEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNmsEntityKey() {
        return nmsEntityKey;
    }

    /**
     * Sets the value of the nmsEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNmsEntityKey(JAXBElement<String> value) {
        this.nmsEntityKey = ((JAXBElement<String> ) value);
    }

}
