
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualAddress_Chapter_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualAddress_Chapter_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chp_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="chp_name" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="chp_website" type="{http://www.avectra.com/2005/}av_url_Type" minOccurs="0"/>
 *         &lt;element name="chp_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="chp_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="chp_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="chp_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="chp_charter_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="chp_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="chp_cst_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="chp_description" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="chp_terminate_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="chp_ind_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="chp_asn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="chp_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="chp_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="chp_chapter_number" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="chp_html_description" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="chp_cht_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="chp_chs_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualAddress_Chapter_DataObjectType", propOrder = {
    "chpCstKey",
    "chpName",
    "chpWebsite",
    "chpAddUser",
    "chpAddDate",
    "chpChangeUser",
    "chpChangeDate",
    "chpCharterDate",
    "chpDeleteFlag",
    "chpCstKeyExt",
    "chpDescription",
    "chpTerminateDate",
    "chpIndCstKey",
    "chpAsnKey",
    "chpCode",
    "chpEntityKey",
    "chpChapterNumber",
    "chpHtmlDescription",
    "chpChtKey",
    "chpChsKey"
})
public class IndividualAddressChapterDataObjectType {

    @XmlElementRef(name = "chp_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> chpCstKey;
    @XmlElementRef(name = "chp_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> chpName;
    @XmlElementRef(name = "chp_website", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> chpWebsite;
    @XmlElementRef(name = "chp_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> chpAddUser;
    @XmlElementRef(name = "chp_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> chpAddDate;
    @XmlElementRef(name = "chp_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> chpChangeUser;
    @XmlElementRef(name = "chp_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> chpChangeDate;
    @XmlElementRef(name = "chp_charter_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> chpCharterDate;
    @XmlElementRef(name = "chp_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> chpDeleteFlag;
    @XmlElementRef(name = "chp_cst_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> chpCstKeyExt;
    @XmlElementRef(name = "chp_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> chpDescription;
    @XmlElementRef(name = "chp_terminate_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> chpTerminateDate;
    @XmlElementRef(name = "chp_ind_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> chpIndCstKey;
    @XmlElementRef(name = "chp_asn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> chpAsnKey;
    @XmlElementRef(name = "chp_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> chpCode;
    @XmlElementRef(name = "chp_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> chpEntityKey;
    @XmlElementRef(name = "chp_chapter_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> chpChapterNumber;
    @XmlElementRef(name = "chp_html_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> chpHtmlDescription;
    @XmlElementRef(name = "chp_cht_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> chpChtKey;
    @XmlElementRef(name = "chp_chs_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> chpChsKey;

    /**
     * Gets the value of the chpCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChpCstKey() {
        return chpCstKey;
    }

    /**
     * Sets the value of the chpCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChpCstKey(JAXBElement<String> value) {
        this.chpCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the chpName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChpName() {
        return chpName;
    }

    /**
     * Sets the value of the chpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChpName(JAXBElement<String> value) {
        this.chpName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the chpWebsite property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChpWebsite() {
        return chpWebsite;
    }

    /**
     * Sets the value of the chpWebsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChpWebsite(JAXBElement<String> value) {
        this.chpWebsite = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the chpAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChpAddUser() {
        return chpAddUser;
    }

    /**
     * Sets the value of the chpAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChpAddUser(JAXBElement<String> value) {
        this.chpAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the chpAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChpAddDate() {
        return chpAddDate;
    }

    /**
     * Sets the value of the chpAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChpAddDate(JAXBElement<String> value) {
        this.chpAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the chpChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChpChangeUser() {
        return chpChangeUser;
    }

    /**
     * Sets the value of the chpChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChpChangeUser(JAXBElement<String> value) {
        this.chpChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the chpChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChpChangeDate() {
        return chpChangeDate;
    }

    /**
     * Sets the value of the chpChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChpChangeDate(JAXBElement<String> value) {
        this.chpChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the chpCharterDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChpCharterDate() {
        return chpCharterDate;
    }

    /**
     * Sets the value of the chpCharterDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChpCharterDate(JAXBElement<String> value) {
        this.chpCharterDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the chpDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getChpDeleteFlag() {
        return chpDeleteFlag;
    }

    /**
     * Sets the value of the chpDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setChpDeleteFlag(JAXBElement<Short> value) {
        this.chpDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the chpCstKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChpCstKeyExt() {
        return chpCstKeyExt;
    }

    /**
     * Sets the value of the chpCstKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChpCstKeyExt(JAXBElement<String> value) {
        this.chpCstKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the chpDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChpDescription() {
        return chpDescription;
    }

    /**
     * Sets the value of the chpDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChpDescription(JAXBElement<String> value) {
        this.chpDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the chpTerminateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChpTerminateDate() {
        return chpTerminateDate;
    }

    /**
     * Sets the value of the chpTerminateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChpTerminateDate(JAXBElement<String> value) {
        this.chpTerminateDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the chpIndCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChpIndCstKey() {
        return chpIndCstKey;
    }

    /**
     * Sets the value of the chpIndCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChpIndCstKey(JAXBElement<String> value) {
        this.chpIndCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the chpAsnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChpAsnKey() {
        return chpAsnKey;
    }

    /**
     * Sets the value of the chpAsnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChpAsnKey(JAXBElement<String> value) {
        this.chpAsnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the chpCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChpCode() {
        return chpCode;
    }

    /**
     * Sets the value of the chpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChpCode(JAXBElement<String> value) {
        this.chpCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the chpEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChpEntityKey() {
        return chpEntityKey;
    }

    /**
     * Sets the value of the chpEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChpEntityKey(JAXBElement<String> value) {
        this.chpEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the chpChapterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getChpChapterNumber() {
        return chpChapterNumber;
    }

    /**
     * Sets the value of the chpChapterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setChpChapterNumber(JAXBElement<Integer> value) {
        this.chpChapterNumber = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the chpHtmlDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChpHtmlDescription() {
        return chpHtmlDescription;
    }

    /**
     * Sets the value of the chpHtmlDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChpHtmlDescription(JAXBElement<String> value) {
        this.chpHtmlDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the chpChtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChpChtKey() {
        return chpChtKey;
    }

    /**
     * Sets the value of the chpChtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChpChtKey(JAXBElement<String> value) {
        this.chpChtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the chpChsKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChpChsKey() {
        return chpChsKey;
    }

    /**
     * Sets the value of the chpChsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChpChsKey(JAXBElement<String> value) {
        this.chpChsKey = ((JAXBElement<String> ) value);
    }

}
