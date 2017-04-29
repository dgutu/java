
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrantGroup_source_code_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrantGroup_source_code_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="src_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="src_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="src_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="src_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="src_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="src_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="src_type" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="src_start_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="src_end_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="src_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="src_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="src_eweb_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="src_act_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="src_asg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="src_obj_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="src_placeholder_value" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="src_src_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrantGroup_source_code_DataObjectType", propOrder = {
    "srcCode",
    "srcAddDate",
    "srcAddUser",
    "srcChangeDate",
    "srcChangeUser",
    "srcDeleteFlag",
    "srcKey",
    "srcType",
    "srcStartDate",
    "srcEndDate",
    "srcEntityKey",
    "srcKeyExt",
    "srcEwebCode",
    "srcActKey",
    "srcAsgKey",
    "srcObjKey",
    "srcPlaceholderValue",
    "srcSrcKey"
})
public class EventsRegistrantGroupSourceCodeDataObjectType {

    @XmlElementRef(name = "src_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> srcCode;
    @XmlElementRef(name = "src_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> srcAddDate;
    @XmlElementRef(name = "src_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> srcAddUser;
    @XmlElementRef(name = "src_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> srcChangeDate;
    @XmlElementRef(name = "src_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> srcChangeUser;
    @XmlElementRef(name = "src_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> srcDeleteFlag;
    @XmlElementRef(name = "src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> srcKey;
    @XmlElementRef(name = "src_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> srcType;
    @XmlElementRef(name = "src_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> srcStartDate;
    @XmlElementRef(name = "src_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> srcEndDate;
    @XmlElementRef(name = "src_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> srcEntityKey;
    @XmlElementRef(name = "src_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> srcKeyExt;
    @XmlElementRef(name = "src_eweb_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> srcEwebCode;
    @XmlElementRef(name = "src_act_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> srcActKey;
    @XmlElementRef(name = "src_asg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> srcAsgKey;
    @XmlElementRef(name = "src_obj_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> srcObjKey;
    @XmlElementRef(name = "src_placeholder_value", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> srcPlaceholderValue;
    @XmlElementRef(name = "src_src_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> srcSrcKey;

    /**
     * Gets the value of the srcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSrcCode() {
        return srcCode;
    }

    /**
     * Sets the value of the srcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSrcCode(JAXBElement<String> value) {
        this.srcCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the srcAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSrcAddDate() {
        return srcAddDate;
    }

    /**
     * Sets the value of the srcAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSrcAddDate(JAXBElement<String> value) {
        this.srcAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the srcAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSrcAddUser() {
        return srcAddUser;
    }

    /**
     * Sets the value of the srcAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSrcAddUser(JAXBElement<String> value) {
        this.srcAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the srcChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSrcChangeDate() {
        return srcChangeDate;
    }

    /**
     * Sets the value of the srcChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSrcChangeDate(JAXBElement<String> value) {
        this.srcChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the srcChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSrcChangeUser() {
        return srcChangeUser;
    }

    /**
     * Sets the value of the srcChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSrcChangeUser(JAXBElement<String> value) {
        this.srcChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the srcDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getSrcDeleteFlag() {
        return srcDeleteFlag;
    }

    /**
     * Sets the value of the srcDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setSrcDeleteFlag(JAXBElement<Short> value) {
        this.srcDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the srcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSrcKey() {
        return srcKey;
    }

    /**
     * Sets the value of the srcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSrcKey(JAXBElement<String> value) {
        this.srcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the srcType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSrcType() {
        return srcType;
    }

    /**
     * Sets the value of the srcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSrcType(JAXBElement<String> value) {
        this.srcType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the srcStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSrcStartDate() {
        return srcStartDate;
    }

    /**
     * Sets the value of the srcStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSrcStartDate(JAXBElement<String> value) {
        this.srcStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the srcEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSrcEndDate() {
        return srcEndDate;
    }

    /**
     * Sets the value of the srcEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSrcEndDate(JAXBElement<String> value) {
        this.srcEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the srcEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSrcEntityKey() {
        return srcEntityKey;
    }

    /**
     * Sets the value of the srcEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSrcEntityKey(JAXBElement<String> value) {
        this.srcEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the srcKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSrcKeyExt() {
        return srcKeyExt;
    }

    /**
     * Sets the value of the srcKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSrcKeyExt(JAXBElement<String> value) {
        this.srcKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the srcEwebCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSrcEwebCode() {
        return srcEwebCode;
    }

    /**
     * Sets the value of the srcEwebCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSrcEwebCode(JAXBElement<String> value) {
        this.srcEwebCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the srcActKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSrcActKey() {
        return srcActKey;
    }

    /**
     * Sets the value of the srcActKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSrcActKey(JAXBElement<String> value) {
        this.srcActKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the srcAsgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSrcAsgKey() {
        return srcAsgKey;
    }

    /**
     * Sets the value of the srcAsgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSrcAsgKey(JAXBElement<String> value) {
        this.srcAsgKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the srcObjKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSrcObjKey() {
        return srcObjKey;
    }

    /**
     * Sets the value of the srcObjKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSrcObjKey(JAXBElement<String> value) {
        this.srcObjKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the srcPlaceholderValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSrcPlaceholderValue() {
        return srcPlaceholderValue;
    }

    /**
     * Sets the value of the srcPlaceholderValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSrcPlaceholderValue(JAXBElement<String> value) {
        this.srcPlaceholderValue = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the srcSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSrcSrcKey() {
        return srcSrcKey;
    }

    /**
     * Sets the value of the srcSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSrcSrcKey(JAXBElement<String> value) {
        this.srcSrcKey = ((JAXBElement<String> ) value);
    }

}
