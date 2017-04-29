
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExhibitorNew_Shared_Booth_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExhibitorNew_Shared_Booth_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ebs_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ebs_exb_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ebs_exh_key_parent" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ebs_hxb_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ebs_exh_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ebs_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ebs_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ebs_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ebs_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ebs_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ebs_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ebs_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ebs_cancel_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExhibitorNew_Shared_Booth_DataObjectType", propOrder = {
    "ebsKey",
    "ebsExbKey",
    "ebsExhKeyParent",
    "ebsHxbKey",
    "ebsExhKey",
    "ebsAddUser",
    "ebsAddDate",
    "ebsChangeUser",
    "ebsChangeDate",
    "ebsDeleteFlag",
    "ebsKeyExt",
    "ebsEntityKey",
    "ebsCancelDate"
})
public class ExhibitorNewSharedBoothDataObjectType {

    @XmlElementRef(name = "ebs_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ebsKey;
    @XmlElementRef(name = "ebs_exb_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ebsExbKey;
    @XmlElementRef(name = "ebs_exh_key_parent", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ebsExhKeyParent;
    @XmlElementRef(name = "ebs_hxb_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ebsHxbKey;
    @XmlElementRef(name = "ebs_exh_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ebsExhKey;
    @XmlElementRef(name = "ebs_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ebsAddUser;
    @XmlElementRef(name = "ebs_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ebsAddDate;
    @XmlElementRef(name = "ebs_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ebsChangeUser;
    @XmlElementRef(name = "ebs_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ebsChangeDate;
    @XmlElementRef(name = "ebs_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ebsDeleteFlag;
    @XmlElementRef(name = "ebs_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ebsKeyExt;
    @XmlElementRef(name = "ebs_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ebsEntityKey;
    @XmlElementRef(name = "ebs_cancel_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ebsCancelDate;

    /**
     * Gets the value of the ebsKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEbsKey() {
        return ebsKey;
    }

    /**
     * Sets the value of the ebsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEbsKey(JAXBElement<String> value) {
        this.ebsKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ebsExbKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEbsExbKey() {
        return ebsExbKey;
    }

    /**
     * Sets the value of the ebsExbKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEbsExbKey(JAXBElement<String> value) {
        this.ebsExbKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ebsExhKeyParent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEbsExhKeyParent() {
        return ebsExhKeyParent;
    }

    /**
     * Sets the value of the ebsExhKeyParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEbsExhKeyParent(JAXBElement<String> value) {
        this.ebsExhKeyParent = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ebsHxbKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEbsHxbKey() {
        return ebsHxbKey;
    }

    /**
     * Sets the value of the ebsHxbKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEbsHxbKey(JAXBElement<String> value) {
        this.ebsHxbKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ebsExhKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEbsExhKey() {
        return ebsExhKey;
    }

    /**
     * Sets the value of the ebsExhKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEbsExhKey(JAXBElement<String> value) {
        this.ebsExhKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ebsAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEbsAddUser() {
        return ebsAddUser;
    }

    /**
     * Sets the value of the ebsAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEbsAddUser(JAXBElement<String> value) {
        this.ebsAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ebsAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEbsAddDate() {
        return ebsAddDate;
    }

    /**
     * Sets the value of the ebsAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEbsAddDate(JAXBElement<String> value) {
        this.ebsAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ebsChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEbsChangeUser() {
        return ebsChangeUser;
    }

    /**
     * Sets the value of the ebsChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEbsChangeUser(JAXBElement<String> value) {
        this.ebsChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ebsChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEbsChangeDate() {
        return ebsChangeDate;
    }

    /**
     * Sets the value of the ebsChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEbsChangeDate(JAXBElement<String> value) {
        this.ebsChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ebsDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEbsDeleteFlag() {
        return ebsDeleteFlag;
    }

    /**
     * Sets the value of the ebsDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEbsDeleteFlag(JAXBElement<Short> value) {
        this.ebsDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ebsKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEbsKeyExt() {
        return ebsKeyExt;
    }

    /**
     * Sets the value of the ebsKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEbsKeyExt(JAXBElement<String> value) {
        this.ebsKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ebsEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEbsEntityKey() {
        return ebsEntityKey;
    }

    /**
     * Sets the value of the ebsEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEbsEntityKey(JAXBElement<String> value) {
        this.ebsEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ebsCancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEbsCancelDate() {
        return ebsCancelDate;
    }

    /**
     * Sets the value of the ebsCancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEbsCancelDate(JAXBElement<String> value) {
        this.ebsCancelDate = ((JAXBElement<String> ) value);
    }

}
