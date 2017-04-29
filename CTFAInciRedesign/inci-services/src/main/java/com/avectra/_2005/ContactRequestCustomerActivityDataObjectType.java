
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactRequest_Customer_Activity_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactRequest_Customer_Activity_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cca_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cca_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cca_type" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="cca_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cca_description" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="cca_type_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cca_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cca_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cca_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cca_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cca_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cca_comm_meth" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cca_acd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cca_comm_value" type="{http://www.avectra.com/2005/}stringLength450_Type" minOccurs="0"/>
 *         &lt;element name="cca_acd_obj_key_value" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cca_type_value" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cca_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cca_emr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cca_comm_desc" type="{http://www.avectra.com/2005/}stringLength300_Type" minOccurs="0"/>
 *         &lt;element name="cca_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cca_cct_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cca_msj_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cca_subject" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cca_open_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactRequest_Customer_Activity_DataObjectType", propOrder = {
    "ccaKey",
    "ccaCstKey",
    "ccaType",
    "ccaDate",
    "ccaDescription",
    "ccaTypeKey",
    "ccaAddUser",
    "ccaAddDate",
    "ccaChangeDate",
    "ccaChangeUser",
    "ccaDeleteFlag",
    "ccaCommMeth",
    "ccaAcdKey",
    "ccaCommValue",
    "ccaAcdObjKeyValue",
    "ccaTypeValue",
    "ccaEntityKey",
    "ccaEmrKey",
    "ccaCommDesc",
    "ccaKeyExt",
    "ccaCctKey",
    "ccaMsjKey",
    "ccaSubject",
    "ccaOpenFlag"
})
public class ContactRequestCustomerActivityDataObjectType {

    @XmlElementRef(name = "cca_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ccaKey;
    @XmlElementRef(name = "cca_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ccaCstKey;
    @XmlElementRef(name = "cca_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ccaType;
    @XmlElementRef(name = "cca_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ccaDate;
    @XmlElementRef(name = "cca_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ccaDescription;
    @XmlElementRef(name = "cca_type_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ccaTypeKey;
    @XmlElementRef(name = "cca_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ccaAddUser;
    @XmlElementRef(name = "cca_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ccaAddDate;
    @XmlElementRef(name = "cca_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ccaChangeDate;
    @XmlElementRef(name = "cca_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ccaChangeUser;
    @XmlElementRef(name = "cca_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ccaDeleteFlag;
    @XmlElementRef(name = "cca_comm_meth", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ccaCommMeth;
    @XmlElementRef(name = "cca_acd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ccaAcdKey;
    @XmlElementRef(name = "cca_comm_value", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ccaCommValue;
    @XmlElementRef(name = "cca_acd_obj_key_value", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ccaAcdObjKeyValue;
    @XmlElementRef(name = "cca_type_value", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ccaTypeValue;
    @XmlElementRef(name = "cca_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ccaEntityKey;
    @XmlElementRef(name = "cca_emr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ccaEmrKey;
    @XmlElementRef(name = "cca_comm_desc", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ccaCommDesc;
    @XmlElementRef(name = "cca_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ccaKeyExt;
    @XmlElementRef(name = "cca_cct_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ccaCctKey;
    @XmlElementRef(name = "cca_msj_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ccaMsjKey;
    @XmlElementRef(name = "cca_subject", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ccaSubject;
    @XmlElementRef(name = "cca_open_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ccaOpenFlag;

    /**
     * Gets the value of the ccaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcaKey() {
        return ccaKey;
    }

    /**
     * Sets the value of the ccaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcaKey(JAXBElement<String> value) {
        this.ccaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ccaCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcaCstKey() {
        return ccaCstKey;
    }

    /**
     * Sets the value of the ccaCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcaCstKey(JAXBElement<String> value) {
        this.ccaCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ccaType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcaType() {
        return ccaType;
    }

    /**
     * Sets the value of the ccaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcaType(JAXBElement<String> value) {
        this.ccaType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ccaDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcaDate() {
        return ccaDate;
    }

    /**
     * Sets the value of the ccaDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcaDate(JAXBElement<String> value) {
        this.ccaDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ccaDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcaDescription() {
        return ccaDescription;
    }

    /**
     * Sets the value of the ccaDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcaDescription(JAXBElement<String> value) {
        this.ccaDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ccaTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcaTypeKey() {
        return ccaTypeKey;
    }

    /**
     * Sets the value of the ccaTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcaTypeKey(JAXBElement<String> value) {
        this.ccaTypeKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ccaAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcaAddUser() {
        return ccaAddUser;
    }

    /**
     * Sets the value of the ccaAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcaAddUser(JAXBElement<String> value) {
        this.ccaAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ccaAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcaAddDate() {
        return ccaAddDate;
    }

    /**
     * Sets the value of the ccaAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcaAddDate(JAXBElement<String> value) {
        this.ccaAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ccaChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcaChangeDate() {
        return ccaChangeDate;
    }

    /**
     * Sets the value of the ccaChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcaChangeDate(JAXBElement<String> value) {
        this.ccaChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ccaChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcaChangeUser() {
        return ccaChangeUser;
    }

    /**
     * Sets the value of the ccaChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcaChangeUser(JAXBElement<String> value) {
        this.ccaChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ccaDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCcaDeleteFlag() {
        return ccaDeleteFlag;
    }

    /**
     * Sets the value of the ccaDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCcaDeleteFlag(JAXBElement<Short> value) {
        this.ccaDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ccaCommMeth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcaCommMeth() {
        return ccaCommMeth;
    }

    /**
     * Sets the value of the ccaCommMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcaCommMeth(JAXBElement<String> value) {
        this.ccaCommMeth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ccaAcdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcaAcdKey() {
        return ccaAcdKey;
    }

    /**
     * Sets the value of the ccaAcdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcaAcdKey(JAXBElement<String> value) {
        this.ccaAcdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ccaCommValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcaCommValue() {
        return ccaCommValue;
    }

    /**
     * Sets the value of the ccaCommValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcaCommValue(JAXBElement<String> value) {
        this.ccaCommValue = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ccaAcdObjKeyValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcaAcdObjKeyValue() {
        return ccaAcdObjKeyValue;
    }

    /**
     * Sets the value of the ccaAcdObjKeyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcaAcdObjKeyValue(JAXBElement<String> value) {
        this.ccaAcdObjKeyValue = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ccaTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcaTypeValue() {
        return ccaTypeValue;
    }

    /**
     * Sets the value of the ccaTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcaTypeValue(JAXBElement<String> value) {
        this.ccaTypeValue = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ccaEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcaEntityKey() {
        return ccaEntityKey;
    }

    /**
     * Sets the value of the ccaEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcaEntityKey(JAXBElement<String> value) {
        this.ccaEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ccaEmrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcaEmrKey() {
        return ccaEmrKey;
    }

    /**
     * Sets the value of the ccaEmrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcaEmrKey(JAXBElement<String> value) {
        this.ccaEmrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ccaCommDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcaCommDesc() {
        return ccaCommDesc;
    }

    /**
     * Sets the value of the ccaCommDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcaCommDesc(JAXBElement<String> value) {
        this.ccaCommDesc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ccaKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcaKeyExt() {
        return ccaKeyExt;
    }

    /**
     * Sets the value of the ccaKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcaKeyExt(JAXBElement<String> value) {
        this.ccaKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ccaCctKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcaCctKey() {
        return ccaCctKey;
    }

    /**
     * Sets the value of the ccaCctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcaCctKey(JAXBElement<String> value) {
        this.ccaCctKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ccaMsjKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcaMsjKey() {
        return ccaMsjKey;
    }

    /**
     * Sets the value of the ccaMsjKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcaMsjKey(JAXBElement<String> value) {
        this.ccaMsjKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ccaSubject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcaSubject() {
        return ccaSubject;
    }

    /**
     * Sets the value of the ccaSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcaSubject(JAXBElement<String> value) {
        this.ccaSubject = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ccaOpenFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCcaOpenFlag() {
        return ccaOpenFlag;
    }

    /**
     * Sets the value of the ccaOpenFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCcaOpenFlag(JAXBElement<Short> value) {
        this.ccaOpenFlag = ((JAXBElement<Short> ) value);
    }

}
