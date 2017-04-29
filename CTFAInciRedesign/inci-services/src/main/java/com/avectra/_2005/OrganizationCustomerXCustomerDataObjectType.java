
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organization_Customer_X_Customer_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Customer_X_Customer_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cxc_cst_key_1" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cxc_cst_key_2" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cxc_rlt_code" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="cxc_start_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cxc_end_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cxc_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cxc_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cxc_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cxc_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cxc_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cxc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cxc_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cxc_rlt_code2" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="cxc_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Customer_X_Customer_DataObjectType", propOrder = {
    "cxcCstKey1",
    "cxcCstKey2",
    "cxcRltCode",
    "cxcStartDate",
    "cxcEndDate",
    "cxcAddDate",
    "cxcAddUser",
    "cxcChangeDate",
    "cxcChangeUser",
    "cxcDeleteFlag",
    "cxcKey",
    "cxcKeyExt",
    "cxcRltCode2",
    "cxcEntityKey"
})
public class OrganizationCustomerXCustomerDataObjectType {

    @XmlElementRef(name = "cxc_cst_key_1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxcCstKey1;
    @XmlElementRef(name = "cxc_cst_key_2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxcCstKey2;
    @XmlElementRef(name = "cxc_rlt_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxcRltCode;
    @XmlElementRef(name = "cxc_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxcStartDate;
    @XmlElementRef(name = "cxc_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxcEndDate;
    @XmlElementRef(name = "cxc_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxcAddDate;
    @XmlElementRef(name = "cxc_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxcAddUser;
    @XmlElementRef(name = "cxc_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxcChangeDate;
    @XmlElementRef(name = "cxc_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxcChangeUser;
    @XmlElementRef(name = "cxc_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cxcDeleteFlag;
    @XmlElementRef(name = "cxc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxcKey;
    @XmlElementRef(name = "cxc_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxcKeyExt;
    @XmlElementRef(name = "cxc_rlt_code2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxcRltCode2;
    @XmlElementRef(name = "cxc_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cxcEntityKey;

    /**
     * Gets the value of the cxcCstKey1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxcCstKey1() {
        return cxcCstKey1;
    }

    /**
     * Sets the value of the cxcCstKey1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxcCstKey1(JAXBElement<String> value) {
        this.cxcCstKey1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxcCstKey2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxcCstKey2() {
        return cxcCstKey2;
    }

    /**
     * Sets the value of the cxcCstKey2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxcCstKey2(JAXBElement<String> value) {
        this.cxcCstKey2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxcRltCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxcRltCode() {
        return cxcRltCode;
    }

    /**
     * Sets the value of the cxcRltCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxcRltCode(JAXBElement<String> value) {
        this.cxcRltCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxcStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxcStartDate() {
        return cxcStartDate;
    }

    /**
     * Sets the value of the cxcStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxcStartDate(JAXBElement<String> value) {
        this.cxcStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxcEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxcEndDate() {
        return cxcEndDate;
    }

    /**
     * Sets the value of the cxcEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxcEndDate(JAXBElement<String> value) {
        this.cxcEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxcAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxcAddDate() {
        return cxcAddDate;
    }

    /**
     * Sets the value of the cxcAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxcAddDate(JAXBElement<String> value) {
        this.cxcAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxcAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxcAddUser() {
        return cxcAddUser;
    }

    /**
     * Sets the value of the cxcAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxcAddUser(JAXBElement<String> value) {
        this.cxcAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxcChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxcChangeDate() {
        return cxcChangeDate;
    }

    /**
     * Sets the value of the cxcChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxcChangeDate(JAXBElement<String> value) {
        this.cxcChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxcChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxcChangeUser() {
        return cxcChangeUser;
    }

    /**
     * Sets the value of the cxcChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxcChangeUser(JAXBElement<String> value) {
        this.cxcChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxcDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCxcDeleteFlag() {
        return cxcDeleteFlag;
    }

    /**
     * Sets the value of the cxcDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCxcDeleteFlag(JAXBElement<Short> value) {
        this.cxcDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cxcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxcKey() {
        return cxcKey;
    }

    /**
     * Sets the value of the cxcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxcKey(JAXBElement<String> value) {
        this.cxcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxcKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxcKeyExt() {
        return cxcKeyExt;
    }

    /**
     * Sets the value of the cxcKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxcKeyExt(JAXBElement<String> value) {
        this.cxcKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxcRltCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxcRltCode2() {
        return cxcRltCode2;
    }

    /**
     * Sets the value of the cxcRltCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxcRltCode2(JAXBElement<String> value) {
        this.cxcRltCode2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cxcEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCxcEntityKey() {
        return cxcEntityKey;
    }

    /**
     * Sets the value of the cxcEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCxcEntityKey(JAXBElement<String> value) {
        this.cxcEntityKey = ((JAXBElement<String> ) value);
    }

}
