
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceDetail_Invoice_Detail_IP_Range_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceDetail_Invoice_Detail_IP_Range_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ixi_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ixi_ivd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ixi_ipr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ixi_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ixi_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ixi_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ixi_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ixi_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ixi_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ixi_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceDetail_Invoice_Detail_IP_Range_DataObjectType", propOrder = {
    "ixiKey",
    "ixiIvdKey",
    "ixiIprKey",
    "ixiAddUser",
    "ixiAddDate",
    "ixiChangeUser",
    "ixiChangeDate",
    "ixiDeleteFlag",
    "ixiEntityKey",
    "ixiKeyExt"
})
public class InvoiceDetailInvoiceDetailIPRangeDataObjectType {

    @XmlElementRef(name = "ixi_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ixiKey;
    @XmlElementRef(name = "ixi_ivd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ixiIvdKey;
    @XmlElementRef(name = "ixi_ipr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ixiIprKey;
    @XmlElementRef(name = "ixi_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ixiAddUser;
    @XmlElementRef(name = "ixi_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ixiAddDate;
    @XmlElementRef(name = "ixi_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ixiChangeUser;
    @XmlElementRef(name = "ixi_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ixiChangeDate;
    @XmlElementRef(name = "ixi_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ixiDeleteFlag;
    @XmlElementRef(name = "ixi_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ixiEntityKey;
    @XmlElementRef(name = "ixi_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ixiKeyExt;

    /**
     * Gets the value of the ixiKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIxiKey() {
        return ixiKey;
    }

    /**
     * Sets the value of the ixiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIxiKey(JAXBElement<String> value) {
        this.ixiKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ixiIvdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIxiIvdKey() {
        return ixiIvdKey;
    }

    /**
     * Sets the value of the ixiIvdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIxiIvdKey(JAXBElement<String> value) {
        this.ixiIvdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ixiIprKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIxiIprKey() {
        return ixiIprKey;
    }

    /**
     * Sets the value of the ixiIprKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIxiIprKey(JAXBElement<String> value) {
        this.ixiIprKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ixiAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIxiAddUser() {
        return ixiAddUser;
    }

    /**
     * Sets the value of the ixiAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIxiAddUser(JAXBElement<String> value) {
        this.ixiAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ixiAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIxiAddDate() {
        return ixiAddDate;
    }

    /**
     * Sets the value of the ixiAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIxiAddDate(JAXBElement<String> value) {
        this.ixiAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ixiChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIxiChangeUser() {
        return ixiChangeUser;
    }

    /**
     * Sets the value of the ixiChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIxiChangeUser(JAXBElement<String> value) {
        this.ixiChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ixiChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIxiChangeDate() {
        return ixiChangeDate;
    }

    /**
     * Sets the value of the ixiChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIxiChangeDate(JAXBElement<String> value) {
        this.ixiChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ixiDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIxiDeleteFlag() {
        return ixiDeleteFlag;
    }

    /**
     * Sets the value of the ixiDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIxiDeleteFlag(JAXBElement<Short> value) {
        this.ixiDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ixiEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIxiEntityKey() {
        return ixiEntityKey;
    }

    /**
     * Sets the value of the ixiEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIxiEntityKey(JAXBElement<String> value) {
        this.ixiEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ixiKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIxiKeyExt() {
        return ixiKeyExt;
    }

    /**
     * Sets the value of the ixiKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIxiKeyExt(JAXBElement<String> value) {
        this.ixiKeyExt = ((JAXBElement<String> ) value);
    }

}
