
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Committee_Parent_Committee_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_Parent_Committee_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cmp__cmt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmp__cmt_asn_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cmp__cmt_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cmp__cmt_ctp_code" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="cmp__cmt_name" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="cmp__cmt_begin_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cmp__cmt_end_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cmp__cmt_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cmp__cmt_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cmp__cmt_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cmp__cmt_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cmp__cmt_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cmp__cmt_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmp__cmt_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmp__cmt_parent_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmp__cmt_description" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="cmp__cmt_html_description" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="cmp__cmt_region" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cmp__cmt_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Committee_Parent_Committee_DataObjectType", propOrder = {
    "cmpCmtKey",
    "cmpCmtAsnCode",
    "cmpCmtCode",
    "cmpCmtCtpCode",
    "cmpCmtName",
    "cmpCmtBeginDate",
    "cmpCmtEndDate",
    "cmpCmtAddDate",
    "cmpCmtAddUser",
    "cmpCmtChangeDate",
    "cmpCmtChangeUser",
    "cmpCmtDeleteFlag",
    "cmpCmtKeyExt",
    "cmpCmtEntityKey",
    "cmpCmtParentKey",
    "cmpCmtDescription",
    "cmpCmtHtmlDescription",
    "cmpCmtRegion",
    "cmpCmtCstKey"
})
public class CommitteeParentCommitteeDataObjectType {

    @XmlElementRef(name = "cmp__cmt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpCmtKey;
    @XmlElementRef(name = "cmp__cmt_asn_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpCmtAsnCode;
    @XmlElementRef(name = "cmp__cmt_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpCmtCode;
    @XmlElementRef(name = "cmp__cmt_ctp_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpCmtCtpCode;
    @XmlElementRef(name = "cmp__cmt_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpCmtName;
    @XmlElementRef(name = "cmp__cmt_begin_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpCmtBeginDate;
    @XmlElementRef(name = "cmp__cmt_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpCmtEndDate;
    @XmlElementRef(name = "cmp__cmt_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpCmtAddDate;
    @XmlElementRef(name = "cmp__cmt_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpCmtAddUser;
    @XmlElementRef(name = "cmp__cmt_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpCmtChangeDate;
    @XmlElementRef(name = "cmp__cmt_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpCmtChangeUser;
    @XmlElementRef(name = "cmp__cmt_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cmpCmtDeleteFlag;
    @XmlElementRef(name = "cmp__cmt_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpCmtKeyExt;
    @XmlElementRef(name = "cmp__cmt_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpCmtEntityKey;
    @XmlElementRef(name = "cmp__cmt_parent_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpCmtParentKey;
    @XmlElementRef(name = "cmp__cmt_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpCmtDescription;
    @XmlElementRef(name = "cmp__cmt_html_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpCmtHtmlDescription;
    @XmlElementRef(name = "cmp__cmt_region", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpCmtRegion;
    @XmlElementRef(name = "cmp__cmt_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpCmtCstKey;

    /**
     * Gets the value of the cmpCmtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpCmtKey() {
        return cmpCmtKey;
    }

    /**
     * Sets the value of the cmpCmtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpCmtKey(JAXBElement<String> value) {
        this.cmpCmtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpCmtAsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpCmtAsnCode() {
        return cmpCmtAsnCode;
    }

    /**
     * Sets the value of the cmpCmtAsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpCmtAsnCode(JAXBElement<String> value) {
        this.cmpCmtAsnCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpCmtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpCmtCode() {
        return cmpCmtCode;
    }

    /**
     * Sets the value of the cmpCmtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpCmtCode(JAXBElement<String> value) {
        this.cmpCmtCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpCmtCtpCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpCmtCtpCode() {
        return cmpCmtCtpCode;
    }

    /**
     * Sets the value of the cmpCmtCtpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpCmtCtpCode(JAXBElement<String> value) {
        this.cmpCmtCtpCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpCmtName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpCmtName() {
        return cmpCmtName;
    }

    /**
     * Sets the value of the cmpCmtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpCmtName(JAXBElement<String> value) {
        this.cmpCmtName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpCmtBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpCmtBeginDate() {
        return cmpCmtBeginDate;
    }

    /**
     * Sets the value of the cmpCmtBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpCmtBeginDate(JAXBElement<String> value) {
        this.cmpCmtBeginDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpCmtEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpCmtEndDate() {
        return cmpCmtEndDate;
    }

    /**
     * Sets the value of the cmpCmtEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpCmtEndDate(JAXBElement<String> value) {
        this.cmpCmtEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpCmtAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpCmtAddDate() {
        return cmpCmtAddDate;
    }

    /**
     * Sets the value of the cmpCmtAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpCmtAddDate(JAXBElement<String> value) {
        this.cmpCmtAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpCmtAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpCmtAddUser() {
        return cmpCmtAddUser;
    }

    /**
     * Sets the value of the cmpCmtAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpCmtAddUser(JAXBElement<String> value) {
        this.cmpCmtAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpCmtChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpCmtChangeDate() {
        return cmpCmtChangeDate;
    }

    /**
     * Sets the value of the cmpCmtChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpCmtChangeDate(JAXBElement<String> value) {
        this.cmpCmtChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpCmtChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpCmtChangeUser() {
        return cmpCmtChangeUser;
    }

    /**
     * Sets the value of the cmpCmtChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpCmtChangeUser(JAXBElement<String> value) {
        this.cmpCmtChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpCmtDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCmpCmtDeleteFlag() {
        return cmpCmtDeleteFlag;
    }

    /**
     * Sets the value of the cmpCmtDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCmpCmtDeleteFlag(JAXBElement<Short> value) {
        this.cmpCmtDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cmpCmtKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpCmtKeyExt() {
        return cmpCmtKeyExt;
    }

    /**
     * Sets the value of the cmpCmtKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpCmtKeyExt(JAXBElement<String> value) {
        this.cmpCmtKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpCmtEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpCmtEntityKey() {
        return cmpCmtEntityKey;
    }

    /**
     * Sets the value of the cmpCmtEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpCmtEntityKey(JAXBElement<String> value) {
        this.cmpCmtEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpCmtParentKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpCmtParentKey() {
        return cmpCmtParentKey;
    }

    /**
     * Sets the value of the cmpCmtParentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpCmtParentKey(JAXBElement<String> value) {
        this.cmpCmtParentKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpCmtDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpCmtDescription() {
        return cmpCmtDescription;
    }

    /**
     * Sets the value of the cmpCmtDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpCmtDescription(JAXBElement<String> value) {
        this.cmpCmtDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpCmtHtmlDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpCmtHtmlDescription() {
        return cmpCmtHtmlDescription;
    }

    /**
     * Sets the value of the cmpCmtHtmlDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpCmtHtmlDescription(JAXBElement<String> value) {
        this.cmpCmtHtmlDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpCmtRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpCmtRegion() {
        return cmpCmtRegion;
    }

    /**
     * Sets the value of the cmpCmtRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpCmtRegion(JAXBElement<String> value) {
        this.cmpCmtRegion = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpCmtCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpCmtCstKey() {
        return cmpCmtCstKey;
    }

    /**
     * Sets the value of the cmpCmtCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpCmtCstKey(JAXBElement<String> value) {
        this.cmpCmtCstKey = ((JAXBElement<String> ) value);
    }

}
