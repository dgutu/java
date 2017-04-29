
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactRequest_Comments_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactRequest_Comments_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="crc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="crc_cor_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="crc_comment" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="crc_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="crc_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="crc_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="crc_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="crc_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="crc_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="crc_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactRequest_Comments_DataObjectType", propOrder = {
    "crcKey",
    "crcCorKey",
    "crcComment",
    "crcAddDate",
    "crcAddUser",
    "crcChangeDate",
    "crcChangeUser",
    "crcDeleteFlag",
    "crcKeyExt",
    "crcEntityKey"
})
public class ContactRequestCommentsDataObjectType {

    @XmlElementRef(name = "crc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> crcKey;
    @XmlElementRef(name = "crc_cor_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> crcCorKey;
    @XmlElementRef(name = "crc_comment", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> crcComment;
    @XmlElementRef(name = "crc_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> crcAddDate;
    @XmlElementRef(name = "crc_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> crcAddUser;
    @XmlElementRef(name = "crc_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> crcChangeDate;
    @XmlElementRef(name = "crc_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> crcChangeUser;
    @XmlElementRef(name = "crc_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> crcDeleteFlag;
    @XmlElementRef(name = "crc_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> crcKeyExt;
    @XmlElementRef(name = "crc_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> crcEntityKey;

    /**
     * Gets the value of the crcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCrcKey() {
        return crcKey;
    }

    /**
     * Sets the value of the crcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCrcKey(JAXBElement<String> value) {
        this.crcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the crcCorKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCrcCorKey() {
        return crcCorKey;
    }

    /**
     * Sets the value of the crcCorKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCrcCorKey(JAXBElement<String> value) {
        this.crcCorKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the crcComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCrcComment() {
        return crcComment;
    }

    /**
     * Sets the value of the crcComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCrcComment(JAXBElement<String> value) {
        this.crcComment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the crcAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCrcAddDate() {
        return crcAddDate;
    }

    /**
     * Sets the value of the crcAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCrcAddDate(JAXBElement<String> value) {
        this.crcAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the crcAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCrcAddUser() {
        return crcAddUser;
    }

    /**
     * Sets the value of the crcAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCrcAddUser(JAXBElement<String> value) {
        this.crcAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the crcChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCrcChangeDate() {
        return crcChangeDate;
    }

    /**
     * Sets the value of the crcChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCrcChangeDate(JAXBElement<String> value) {
        this.crcChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the crcChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCrcChangeUser() {
        return crcChangeUser;
    }

    /**
     * Sets the value of the crcChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCrcChangeUser(JAXBElement<String> value) {
        this.crcChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the crcDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCrcDeleteFlag() {
        return crcDeleteFlag;
    }

    /**
     * Sets the value of the crcDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCrcDeleteFlag(JAXBElement<Short> value) {
        this.crcDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the crcKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCrcKeyExt() {
        return crcKeyExt;
    }

    /**
     * Sets the value of the crcKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCrcKeyExt(JAXBElement<String> value) {
        this.crcKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the crcEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCrcEntityKey() {
        return crcEntityKey;
    }

    /**
     * Sets the value of the crcEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCrcEntityKey(JAXBElement<String> value) {
        this.crcEntityKey = ((JAXBElement<String> ) value);
    }

}
