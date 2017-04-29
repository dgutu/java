
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Committee_Committee_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_Committee_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cmt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmt_asn_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cmt_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cmt_ctp_code" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="cmt_name" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="cmt_begin_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cmt_end_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cmt_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cmt_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cmt_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cmt_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cmt_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cmt_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmt_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmt_parent_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmt_description" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="cmt_html_description" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="cmt_region" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cmt_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Committee_Committee_DataObjectType", propOrder = {
    "cmtKey",
    "cmtAsnCode",
    "cmtCode",
    "cmtCtpCode",
    "cmtName",
    "cmtBeginDate",
    "cmtEndDate",
    "cmtAddDate",
    "cmtAddUser",
    "cmtChangeDate",
    "cmtChangeUser",
    "cmtDeleteFlag",
    "cmtKeyExt",
    "cmtEntityKey",
    "cmtParentKey",
    "cmtDescription",
    "cmtHtmlDescription",
    "cmtRegion",
    "cmtCstKey"
})
public class CommitteeCommitteeDataObjectType {

    @XmlElementRef(name = "cmt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmtKey;
    @XmlElementRef(name = "cmt_asn_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmtAsnCode;
    @XmlElementRef(name = "cmt_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmtCode;
    @XmlElementRef(name = "cmt_ctp_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmtCtpCode;
    @XmlElementRef(name = "cmt_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmtName;
    @XmlElementRef(name = "cmt_begin_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmtBeginDate;
    @XmlElementRef(name = "cmt_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmtEndDate;
    @XmlElementRef(name = "cmt_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmtAddDate;
    @XmlElementRef(name = "cmt_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmtAddUser;
    @XmlElementRef(name = "cmt_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmtChangeDate;
    @XmlElementRef(name = "cmt_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmtChangeUser;
    @XmlElementRef(name = "cmt_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cmtDeleteFlag;
    @XmlElementRef(name = "cmt_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmtKeyExt;
    @XmlElementRef(name = "cmt_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmtEntityKey;
    @XmlElementRef(name = "cmt_parent_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmtParentKey;
    @XmlElementRef(name = "cmt_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmtDescription;
    @XmlElementRef(name = "cmt_html_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmtHtmlDescription;
    @XmlElementRef(name = "cmt_region", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmtRegion;
    @XmlElementRef(name = "cmt_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmtCstKey;

    /**
     * Gets the value of the cmtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmtKey() {
        return cmtKey;
    }

    /**
     * Sets the value of the cmtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmtKey(JAXBElement<String> value) {
        this.cmtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmtAsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmtAsnCode() {
        return cmtAsnCode;
    }

    /**
     * Sets the value of the cmtAsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmtAsnCode(JAXBElement<String> value) {
        this.cmtAsnCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmtCode() {
        return cmtCode;
    }

    /**
     * Sets the value of the cmtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmtCode(JAXBElement<String> value) {
        this.cmtCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmtCtpCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmtCtpCode() {
        return cmtCtpCode;
    }

    /**
     * Sets the value of the cmtCtpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmtCtpCode(JAXBElement<String> value) {
        this.cmtCtpCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmtName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmtName() {
        return cmtName;
    }

    /**
     * Sets the value of the cmtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmtName(JAXBElement<String> value) {
        this.cmtName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmtBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmtBeginDate() {
        return cmtBeginDate;
    }

    /**
     * Sets the value of the cmtBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmtBeginDate(JAXBElement<String> value) {
        this.cmtBeginDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmtEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmtEndDate() {
        return cmtEndDate;
    }

    /**
     * Sets the value of the cmtEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmtEndDate(JAXBElement<String> value) {
        this.cmtEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmtAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmtAddDate() {
        return cmtAddDate;
    }

    /**
     * Sets the value of the cmtAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmtAddDate(JAXBElement<String> value) {
        this.cmtAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmtAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmtAddUser() {
        return cmtAddUser;
    }

    /**
     * Sets the value of the cmtAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmtAddUser(JAXBElement<String> value) {
        this.cmtAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmtChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmtChangeDate() {
        return cmtChangeDate;
    }

    /**
     * Sets the value of the cmtChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmtChangeDate(JAXBElement<String> value) {
        this.cmtChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmtChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmtChangeUser() {
        return cmtChangeUser;
    }

    /**
     * Sets the value of the cmtChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmtChangeUser(JAXBElement<String> value) {
        this.cmtChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmtDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCmtDeleteFlag() {
        return cmtDeleteFlag;
    }

    /**
     * Sets the value of the cmtDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCmtDeleteFlag(JAXBElement<Short> value) {
        this.cmtDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cmtKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmtKeyExt() {
        return cmtKeyExt;
    }

    /**
     * Sets the value of the cmtKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmtKeyExt(JAXBElement<String> value) {
        this.cmtKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmtEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmtEntityKey() {
        return cmtEntityKey;
    }

    /**
     * Sets the value of the cmtEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmtEntityKey(JAXBElement<String> value) {
        this.cmtEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmtParentKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmtParentKey() {
        return cmtParentKey;
    }

    /**
     * Sets the value of the cmtParentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmtParentKey(JAXBElement<String> value) {
        this.cmtParentKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmtDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmtDescription() {
        return cmtDescription;
    }

    /**
     * Sets the value of the cmtDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmtDescription(JAXBElement<String> value) {
        this.cmtDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmtHtmlDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmtHtmlDescription() {
        return cmtHtmlDescription;
    }

    /**
     * Sets the value of the cmtHtmlDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmtHtmlDescription(JAXBElement<String> value) {
        this.cmtHtmlDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmtRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmtRegion() {
        return cmtRegion;
    }

    /**
     * Sets the value of the cmtRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmtRegion(JAXBElement<String> value) {
        this.cmtRegion = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmtCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmtCstKey() {
        return cmtCstKey;
    }

    /**
     * Sets the value of the cmtCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmtCstKey(JAXBElement<String> value) {
        this.cmtCstKey = ((JAXBElement<String> ) value);
    }

}
