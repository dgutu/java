
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceDetail_Product_Type_Social_Messages_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceDetail_Product_Type_Social_Messages_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oel_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="oel_ptp_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="oel_twitter_msg" type="{http://www.avectra.com/2005/}stringLength500_Type" minOccurs="0"/>
 *         &lt;element name="oel_facebook_msg" type="{http://www.avectra.com/2005/}stringLength1000_Type" minOccurs="0"/>
 *         &lt;element name="oel_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="oel_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="oel_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="oel_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="oel_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="oel_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceDetail_Product_Type_Social_Messages_DataObjectType", propOrder = {
    "oelKey",
    "oelPtpKey",
    "oelTwitterMsg",
    "oelFacebookMsg",
    "oelAddUser",
    "oelAddDate",
    "oelChangeUser",
    "oelChangeDate",
    "oelDeleteFlag",
    "oelEntityKey"
})
public class InvoiceDetailProductTypeSocialMessagesDataObjectType {

    @XmlElementRef(name = "oel_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> oelKey;
    @XmlElementRef(name = "oel_ptp_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> oelPtpKey;
    @XmlElementRef(name = "oel_twitter_msg", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> oelTwitterMsg;
    @XmlElementRef(name = "oel_facebook_msg", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> oelFacebookMsg;
    @XmlElementRef(name = "oel_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> oelAddUser;
    @XmlElementRef(name = "oel_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> oelAddDate;
    @XmlElementRef(name = "oel_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> oelChangeUser;
    @XmlElementRef(name = "oel_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> oelChangeDate;
    @XmlElementRef(name = "oel_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> oelDeleteFlag;
    @XmlElementRef(name = "oel_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> oelEntityKey;

    /**
     * Gets the value of the oelKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOelKey() {
        return oelKey;
    }

    /**
     * Sets the value of the oelKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOelKey(JAXBElement<String> value) {
        this.oelKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the oelPtpKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOelPtpKey() {
        return oelPtpKey;
    }

    /**
     * Sets the value of the oelPtpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOelPtpKey(JAXBElement<String> value) {
        this.oelPtpKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the oelTwitterMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOelTwitterMsg() {
        return oelTwitterMsg;
    }

    /**
     * Sets the value of the oelTwitterMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOelTwitterMsg(JAXBElement<String> value) {
        this.oelTwitterMsg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the oelFacebookMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOelFacebookMsg() {
        return oelFacebookMsg;
    }

    /**
     * Sets the value of the oelFacebookMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOelFacebookMsg(JAXBElement<String> value) {
        this.oelFacebookMsg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the oelAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOelAddUser() {
        return oelAddUser;
    }

    /**
     * Sets the value of the oelAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOelAddUser(JAXBElement<String> value) {
        this.oelAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the oelAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOelAddDate() {
        return oelAddDate;
    }

    /**
     * Sets the value of the oelAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOelAddDate(JAXBElement<String> value) {
        this.oelAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the oelChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOelChangeUser() {
        return oelChangeUser;
    }

    /**
     * Sets the value of the oelChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOelChangeUser(JAXBElement<String> value) {
        this.oelChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the oelChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOelChangeDate() {
        return oelChangeDate;
    }

    /**
     * Sets the value of the oelChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOelChangeDate(JAXBElement<String> value) {
        this.oelChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the oelDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOelDeleteFlag() {
        return oelDeleteFlag;
    }

    /**
     * Sets the value of the oelDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOelDeleteFlag(JAXBElement<Short> value) {
        this.oelDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the oelEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOelEntityKey() {
        return oelEntityKey;
    }

    /**
     * Sets the value of the oelEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOelEntityKey(JAXBElement<String> value) {
        this.oelEntityKey = ((JAXBElement<String> ) value);
    }

}
