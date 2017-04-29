
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mb_membership_Association_Package_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mb_membership_Association_Package_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asp_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="asp_asn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="asp_mbt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="asp_mbs_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="asp_pak_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="asp_pak_prd_renewal_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="asp_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="asp_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="asp_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="asp_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="asp_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="asp_chp_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="asp_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="asp_optional_item_count" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="asp_split_invoice" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mb_membership_Association_Package_DataObjectType", propOrder = {
    "aspKey",
    "aspAsnKey",
    "aspMbtKey",
    "aspMbsKey",
    "aspPakPrdKey",
    "aspPakPrdRenewalKey",
    "aspAddUser",
    "aspAddDate",
    "aspChangeUser",
    "aspChangeDate",
    "aspDeleteFlag",
    "aspChpCstKey",
    "aspEntityKey",
    "aspOptionalItemCount",
    "aspSplitInvoice"
})
public class MbMembershipAssociationPackageDataObjectType {

    @XmlElementRef(name = "asp_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aspKey;
    @XmlElementRef(name = "asp_asn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aspAsnKey;
    @XmlElementRef(name = "asp_mbt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aspMbtKey;
    @XmlElementRef(name = "asp_mbs_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aspMbsKey;
    @XmlElementRef(name = "asp_pak_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aspPakPrdKey;
    @XmlElementRef(name = "asp_pak_prd_renewal_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aspPakPrdRenewalKey;
    @XmlElementRef(name = "asp_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aspAddUser;
    @XmlElementRef(name = "asp_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aspAddDate;
    @XmlElementRef(name = "asp_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aspChangeUser;
    @XmlElementRef(name = "asp_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aspChangeDate;
    @XmlElementRef(name = "asp_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> aspDeleteFlag;
    @XmlElementRef(name = "asp_chp_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aspChpCstKey;
    @XmlElementRef(name = "asp_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aspEntityKey;
    @XmlElementRef(name = "asp_optional_item_count", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> aspOptionalItemCount;
    @XmlElementRef(name = "asp_split_invoice", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> aspSplitInvoice;

    /**
     * Gets the value of the aspKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAspKey() {
        return aspKey;
    }

    /**
     * Sets the value of the aspKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAspKey(JAXBElement<String> value) {
        this.aspKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aspAsnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAspAsnKey() {
        return aspAsnKey;
    }

    /**
     * Sets the value of the aspAsnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAspAsnKey(JAXBElement<String> value) {
        this.aspAsnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aspMbtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAspMbtKey() {
        return aspMbtKey;
    }

    /**
     * Sets the value of the aspMbtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAspMbtKey(JAXBElement<String> value) {
        this.aspMbtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aspMbsKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAspMbsKey() {
        return aspMbsKey;
    }

    /**
     * Sets the value of the aspMbsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAspMbsKey(JAXBElement<String> value) {
        this.aspMbsKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aspPakPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAspPakPrdKey() {
        return aspPakPrdKey;
    }

    /**
     * Sets the value of the aspPakPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAspPakPrdKey(JAXBElement<String> value) {
        this.aspPakPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aspPakPrdRenewalKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAspPakPrdRenewalKey() {
        return aspPakPrdRenewalKey;
    }

    /**
     * Sets the value of the aspPakPrdRenewalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAspPakPrdRenewalKey(JAXBElement<String> value) {
        this.aspPakPrdRenewalKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aspAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAspAddUser() {
        return aspAddUser;
    }

    /**
     * Sets the value of the aspAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAspAddUser(JAXBElement<String> value) {
        this.aspAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aspAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAspAddDate() {
        return aspAddDate;
    }

    /**
     * Sets the value of the aspAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAspAddDate(JAXBElement<String> value) {
        this.aspAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aspChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAspChangeUser() {
        return aspChangeUser;
    }

    /**
     * Sets the value of the aspChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAspChangeUser(JAXBElement<String> value) {
        this.aspChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aspChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAspChangeDate() {
        return aspChangeDate;
    }

    /**
     * Sets the value of the aspChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAspChangeDate(JAXBElement<String> value) {
        this.aspChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aspDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getAspDeleteFlag() {
        return aspDeleteFlag;
    }

    /**
     * Sets the value of the aspDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setAspDeleteFlag(JAXBElement<Short> value) {
        this.aspDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the aspChpCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAspChpCstKey() {
        return aspChpCstKey;
    }

    /**
     * Sets the value of the aspChpCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAspChpCstKey(JAXBElement<String> value) {
        this.aspChpCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aspEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAspEntityKey() {
        return aspEntityKey;
    }

    /**
     * Sets the value of the aspEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAspEntityKey(JAXBElement<String> value) {
        this.aspEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aspOptionalItemCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAspOptionalItemCount() {
        return aspOptionalItemCount;
    }

    /**
     * Sets the value of the aspOptionalItemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAspOptionalItemCount(JAXBElement<Integer> value) {
        this.aspOptionalItemCount = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the aspSplitInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getAspSplitInvoice() {
        return aspSplitInvoice;
    }

    /**
     * Sets the value of the aspSplitInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setAspSplitInvoice(JAXBElement<Short> value) {
        this.aspSplitInvoice = ((JAXBElement<Short> ) value);
    }

}
