
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceDetail_Discount_Product_X_Product_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceDetail_Discount_Product_X_Product_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dxp_dsc_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="dxp_ptp_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="dxp_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="dxp_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="dxp_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="dxp_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="dxp_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="dxp_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="dxp_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="dxp_prc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="dxp_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="dxp_parent_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="dxp_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceDetail_Discount_Product_X_Product_DataObjectType", propOrder = {
    "dxpDscPrdKey",
    "dxpPtpKey",
    "dxpPrdKey",
    "dxpAddUser",
    "dxpAddDate",
    "dxpChangeUser",
    "dxpChangeDate",
    "dxpDeleteFlag",
    "dxpEntityKey",
    "dxpPrcKey",
    "dxpKey",
    "dxpParentKey",
    "dxpKeyExt"
})
public class InvoiceDetailDiscountProductXProductDataObjectType {

    @XmlElementRef(name = "dxp_dsc_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dxpDscPrdKey;
    @XmlElementRef(name = "dxp_ptp_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dxpPtpKey;
    @XmlElementRef(name = "dxp_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dxpPrdKey;
    @XmlElementRef(name = "dxp_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dxpAddUser;
    @XmlElementRef(name = "dxp_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dxpAddDate;
    @XmlElementRef(name = "dxp_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dxpChangeUser;
    @XmlElementRef(name = "dxp_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dxpChangeDate;
    @XmlElementRef(name = "dxp_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> dxpDeleteFlag;
    @XmlElementRef(name = "dxp_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dxpEntityKey;
    @XmlElementRef(name = "dxp_prc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dxpPrcKey;
    @XmlElementRef(name = "dxp_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dxpKey;
    @XmlElementRef(name = "dxp_parent_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dxpParentKey;
    @XmlElementRef(name = "dxp_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> dxpKeyExt;

    /**
     * Gets the value of the dxpDscPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDxpDscPrdKey() {
        return dxpDscPrdKey;
    }

    /**
     * Sets the value of the dxpDscPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDxpDscPrdKey(JAXBElement<String> value) {
        this.dxpDscPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dxpPtpKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDxpPtpKey() {
        return dxpPtpKey;
    }

    /**
     * Sets the value of the dxpPtpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDxpPtpKey(JAXBElement<String> value) {
        this.dxpPtpKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dxpPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDxpPrdKey() {
        return dxpPrdKey;
    }

    /**
     * Sets the value of the dxpPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDxpPrdKey(JAXBElement<String> value) {
        this.dxpPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dxpAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDxpAddUser() {
        return dxpAddUser;
    }

    /**
     * Sets the value of the dxpAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDxpAddUser(JAXBElement<String> value) {
        this.dxpAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dxpAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDxpAddDate() {
        return dxpAddDate;
    }

    /**
     * Sets the value of the dxpAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDxpAddDate(JAXBElement<String> value) {
        this.dxpAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dxpChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDxpChangeUser() {
        return dxpChangeUser;
    }

    /**
     * Sets the value of the dxpChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDxpChangeUser(JAXBElement<String> value) {
        this.dxpChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dxpChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDxpChangeDate() {
        return dxpChangeDate;
    }

    /**
     * Sets the value of the dxpChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDxpChangeDate(JAXBElement<String> value) {
        this.dxpChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dxpDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getDxpDeleteFlag() {
        return dxpDeleteFlag;
    }

    /**
     * Sets the value of the dxpDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setDxpDeleteFlag(JAXBElement<Short> value) {
        this.dxpDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the dxpEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDxpEntityKey() {
        return dxpEntityKey;
    }

    /**
     * Sets the value of the dxpEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDxpEntityKey(JAXBElement<String> value) {
        this.dxpEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dxpPrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDxpPrcKey() {
        return dxpPrcKey;
    }

    /**
     * Sets the value of the dxpPrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDxpPrcKey(JAXBElement<String> value) {
        this.dxpPrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dxpKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDxpKey() {
        return dxpKey;
    }

    /**
     * Sets the value of the dxpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDxpKey(JAXBElement<String> value) {
        this.dxpKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dxpParentKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDxpParentKey() {
        return dxpParentKey;
    }

    /**
     * Sets the value of the dxpParentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDxpParentKey(JAXBElement<String> value) {
        this.dxpParentKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dxpKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDxpKeyExt() {
        return dxpKeyExt;
    }

    /**
     * Sets the value of the dxpKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDxpKeyExt(JAXBElement<String> value) {
        this.dxpKeyExt = ((JAXBElement<String> ) value);
    }

}
