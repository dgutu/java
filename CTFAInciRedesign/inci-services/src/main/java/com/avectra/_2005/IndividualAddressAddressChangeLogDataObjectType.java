
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualAddress_Address_Change_Log_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualAddress_Address_Change_Log_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="acl_adr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="acl_adn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="acl_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="acl_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="acl_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="acl_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="acl_mailing_label" type="{http://www.avectra.com/2005/}stringLength300_Type" minOccurs="0"/>
 *         &lt;element name="acl_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="acl_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="acl_mailing_label_html" type="{http://www.avectra.com/2005/}stringLength300_Type" minOccurs="0"/>
 *         &lt;element name="acl_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="acl_new_mailing_label" type="{http://www.avectra.com/2005/}stringLength300_Type" minOccurs="0"/>
 *         &lt;element name="acl_new_mailing_label_html" type="{http://www.avectra.com/2005/}stringLength300_Type" minOccurs="0"/>
 *         &lt;element name="acl_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="acl_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualAddress_Address_Change_Log_DataObjectType", propOrder = {
    "aclKey",
    "aclAdrKey",
    "aclAdnKey",
    "aclSrcKey",
    "aclAddUser",
    "aclAddDate",
    "aclChangeUser",
    "aclMailingLabel",
    "aclKeyExt",
    "aclChangeDate",
    "aclMailingLabelHtml",
    "aclDeleteFlag",
    "aclNewMailingLabel",
    "aclNewMailingLabelHtml",
    "aclEntityKey",
    "aclCstKey"
})
public class IndividualAddressAddressChangeLogDataObjectType {

    @XmlElementRef(name = "acl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aclKey;
    @XmlElementRef(name = "acl_adr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aclAdrKey;
    @XmlElementRef(name = "acl_adn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aclAdnKey;
    @XmlElementRef(name = "acl_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aclSrcKey;
    @XmlElementRef(name = "acl_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aclAddUser;
    @XmlElementRef(name = "acl_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aclAddDate;
    @XmlElementRef(name = "acl_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aclChangeUser;
    @XmlElementRef(name = "acl_mailing_label", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aclMailingLabel;
    @XmlElementRef(name = "acl_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aclKeyExt;
    @XmlElementRef(name = "acl_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aclChangeDate;
    @XmlElementRef(name = "acl_mailing_label_html", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aclMailingLabelHtml;
    @XmlElementRef(name = "acl_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> aclDeleteFlag;
    @XmlElementRef(name = "acl_new_mailing_label", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aclNewMailingLabel;
    @XmlElementRef(name = "acl_new_mailing_label_html", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aclNewMailingLabelHtml;
    @XmlElementRef(name = "acl_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aclEntityKey;
    @XmlElementRef(name = "acl_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aclCstKey;

    /**
     * Gets the value of the aclKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAclKey() {
        return aclKey;
    }

    /**
     * Sets the value of the aclKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAclKey(JAXBElement<String> value) {
        this.aclKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aclAdrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAclAdrKey() {
        return aclAdrKey;
    }

    /**
     * Sets the value of the aclAdrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAclAdrKey(JAXBElement<String> value) {
        this.aclAdrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aclAdnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAclAdnKey() {
        return aclAdnKey;
    }

    /**
     * Sets the value of the aclAdnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAclAdnKey(JAXBElement<String> value) {
        this.aclAdnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aclSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAclSrcKey() {
        return aclSrcKey;
    }

    /**
     * Sets the value of the aclSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAclSrcKey(JAXBElement<String> value) {
        this.aclSrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aclAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAclAddUser() {
        return aclAddUser;
    }

    /**
     * Sets the value of the aclAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAclAddUser(JAXBElement<String> value) {
        this.aclAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aclAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAclAddDate() {
        return aclAddDate;
    }

    /**
     * Sets the value of the aclAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAclAddDate(JAXBElement<String> value) {
        this.aclAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aclChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAclChangeUser() {
        return aclChangeUser;
    }

    /**
     * Sets the value of the aclChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAclChangeUser(JAXBElement<String> value) {
        this.aclChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aclMailingLabel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAclMailingLabel() {
        return aclMailingLabel;
    }

    /**
     * Sets the value of the aclMailingLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAclMailingLabel(JAXBElement<String> value) {
        this.aclMailingLabel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aclKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAclKeyExt() {
        return aclKeyExt;
    }

    /**
     * Sets the value of the aclKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAclKeyExt(JAXBElement<String> value) {
        this.aclKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aclChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAclChangeDate() {
        return aclChangeDate;
    }

    /**
     * Sets the value of the aclChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAclChangeDate(JAXBElement<String> value) {
        this.aclChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aclMailingLabelHtml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAclMailingLabelHtml() {
        return aclMailingLabelHtml;
    }

    /**
     * Sets the value of the aclMailingLabelHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAclMailingLabelHtml(JAXBElement<String> value) {
        this.aclMailingLabelHtml = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aclDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getAclDeleteFlag() {
        return aclDeleteFlag;
    }

    /**
     * Sets the value of the aclDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setAclDeleteFlag(JAXBElement<Short> value) {
        this.aclDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the aclNewMailingLabel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAclNewMailingLabel() {
        return aclNewMailingLabel;
    }

    /**
     * Sets the value of the aclNewMailingLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAclNewMailingLabel(JAXBElement<String> value) {
        this.aclNewMailingLabel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aclNewMailingLabelHtml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAclNewMailingLabelHtml() {
        return aclNewMailingLabelHtml;
    }

    /**
     * Sets the value of the aclNewMailingLabelHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAclNewMailingLabelHtml(JAXBElement<String> value) {
        this.aclNewMailingLabelHtml = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aclEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAclEntityKey() {
        return aclEntityKey;
    }

    /**
     * Sets the value of the aclEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAclEntityKey(JAXBElement<String> value) {
        this.aclEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aclCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAclCstKey() {
        return aclCstKey;
    }

    /**
     * Sets the value of the aclCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAclCstKey(JAXBElement<String> value) {
        this.aclCstKey = ((JAXBElement<String> ) value);
    }

}
