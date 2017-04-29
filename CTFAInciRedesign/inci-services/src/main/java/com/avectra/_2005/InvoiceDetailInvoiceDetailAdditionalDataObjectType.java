
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceDetail_Invoice_Detail_Additional_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceDetail_Invoice_Detail_Additional_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ida_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ida_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ida_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ida_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ida_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ida_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ida_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ida_type" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="ida_ivd_inv_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ida_ivd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ida_amount" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ida_prc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ida_prc_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ida_gla_key_cr" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ida_gla_key_dr" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ida_void_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ida_void_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ida_void_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ida_ivd_key_product" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ida_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ida_oda_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceDetail_Invoice_Detail_Additional_DataObjectType", propOrder = {
    "idaKey",
    "idaAddUser",
    "idaAddDate",
    "idaChangeUser",
    "idaChangeDate",
    "idaDeleteFlag",
    "idaKeyExt",
    "idaType",
    "idaIvdInvKey",
    "idaIvdKey",
    "idaAmount",
    "idaPrcKey",
    "idaPrcPrdKey",
    "idaGlaKeyCr",
    "idaGlaKeyDr",
    "idaVoidFlag",
    "idaVoidUser",
    "idaVoidDate",
    "idaIvdKeyProduct",
    "idaEntityKey",
    "idaOdaKey"
})
public class InvoiceDetailInvoiceDetailAdditionalDataObjectType {

    @XmlElementRef(name = "ida_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idaKey;
    @XmlElementRef(name = "ida_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idaAddUser;
    @XmlElementRef(name = "ida_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idaAddDate;
    @XmlElementRef(name = "ida_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idaChangeUser;
    @XmlElementRef(name = "ida_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idaChangeDate;
    @XmlElementRef(name = "ida_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> idaDeleteFlag;
    @XmlElementRef(name = "ida_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idaKeyExt;
    @XmlElementRef(name = "ida_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idaType;
    @XmlElementRef(name = "ida_ivd_inv_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idaIvdInvKey;
    @XmlElementRef(name = "ida_ivd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idaIvdKey;
    @XmlElementRef(name = "ida_amount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> idaAmount;
    @XmlElementRef(name = "ida_prc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idaPrcKey;
    @XmlElementRef(name = "ida_prc_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idaPrcPrdKey;
    @XmlElementRef(name = "ida_gla_key_cr", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idaGlaKeyCr;
    @XmlElementRef(name = "ida_gla_key_dr", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idaGlaKeyDr;
    @XmlElementRef(name = "ida_void_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> idaVoidFlag;
    @XmlElementRef(name = "ida_void_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idaVoidUser;
    @XmlElementRef(name = "ida_void_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idaVoidDate;
    @XmlElementRef(name = "ida_ivd_key_product", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idaIvdKeyProduct;
    @XmlElementRef(name = "ida_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idaEntityKey;
    @XmlElementRef(name = "ida_oda_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idaOdaKey;

    /**
     * Gets the value of the idaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdaKey() {
        return idaKey;
    }

    /**
     * Sets the value of the idaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdaKey(JAXBElement<String> value) {
        this.idaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idaAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdaAddUser() {
        return idaAddUser;
    }

    /**
     * Sets the value of the idaAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdaAddUser(JAXBElement<String> value) {
        this.idaAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idaAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdaAddDate() {
        return idaAddDate;
    }

    /**
     * Sets the value of the idaAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdaAddDate(JAXBElement<String> value) {
        this.idaAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idaChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdaChangeUser() {
        return idaChangeUser;
    }

    /**
     * Sets the value of the idaChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdaChangeUser(JAXBElement<String> value) {
        this.idaChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idaChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdaChangeDate() {
        return idaChangeDate;
    }

    /**
     * Sets the value of the idaChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdaChangeDate(JAXBElement<String> value) {
        this.idaChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idaDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIdaDeleteFlag() {
        return idaDeleteFlag;
    }

    /**
     * Sets the value of the idaDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIdaDeleteFlag(JAXBElement<Short> value) {
        this.idaDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the idaKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdaKeyExt() {
        return idaKeyExt;
    }

    /**
     * Sets the value of the idaKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdaKeyExt(JAXBElement<String> value) {
        this.idaKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idaType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdaType() {
        return idaType;
    }

    /**
     * Sets the value of the idaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdaType(JAXBElement<String> value) {
        this.idaType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idaIvdInvKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdaIvdInvKey() {
        return idaIvdInvKey;
    }

    /**
     * Sets the value of the idaIvdInvKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdaIvdInvKey(JAXBElement<String> value) {
        this.idaIvdInvKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idaIvdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdaIvdKey() {
        return idaIvdKey;
    }

    /**
     * Sets the value of the idaIvdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdaIvdKey(JAXBElement<String> value) {
        this.idaIvdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idaAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIdaAmount() {
        return idaAmount;
    }

    /**
     * Sets the value of the idaAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIdaAmount(JAXBElement<BigDecimal> value) {
        this.idaAmount = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the idaPrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdaPrcKey() {
        return idaPrcKey;
    }

    /**
     * Sets the value of the idaPrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdaPrcKey(JAXBElement<String> value) {
        this.idaPrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idaPrcPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdaPrcPrdKey() {
        return idaPrcPrdKey;
    }

    /**
     * Sets the value of the idaPrcPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdaPrcPrdKey(JAXBElement<String> value) {
        this.idaPrcPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idaGlaKeyCr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdaGlaKeyCr() {
        return idaGlaKeyCr;
    }

    /**
     * Sets the value of the idaGlaKeyCr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdaGlaKeyCr(JAXBElement<String> value) {
        this.idaGlaKeyCr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idaGlaKeyDr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdaGlaKeyDr() {
        return idaGlaKeyDr;
    }

    /**
     * Sets the value of the idaGlaKeyDr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdaGlaKeyDr(JAXBElement<String> value) {
        this.idaGlaKeyDr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idaVoidFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIdaVoidFlag() {
        return idaVoidFlag;
    }

    /**
     * Sets the value of the idaVoidFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIdaVoidFlag(JAXBElement<Short> value) {
        this.idaVoidFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the idaVoidUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdaVoidUser() {
        return idaVoidUser;
    }

    /**
     * Sets the value of the idaVoidUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdaVoidUser(JAXBElement<String> value) {
        this.idaVoidUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idaVoidDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdaVoidDate() {
        return idaVoidDate;
    }

    /**
     * Sets the value of the idaVoidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdaVoidDate(JAXBElement<String> value) {
        this.idaVoidDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idaIvdKeyProduct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdaIvdKeyProduct() {
        return idaIvdKeyProduct;
    }

    /**
     * Sets the value of the idaIvdKeyProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdaIvdKeyProduct(JAXBElement<String> value) {
        this.idaIvdKeyProduct = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idaEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdaEntityKey() {
        return idaEntityKey;
    }

    /**
     * Sets the value of the idaEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdaEntityKey(JAXBElement<String> value) {
        this.idaEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idaOdaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdaOdaKey() {
        return idaOdaKey;
    }

    /**
     * Sets the value of the idaOdaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdaOdaKey(JAXBElement<String> value) {
        this.idaOdaKey = ((JAXBElement<String> ) value);
    }

}
