
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CentralizedOrderEntry_Claim_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CentralizedOrderEntry_Claim_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cld_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cld_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cld_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cld_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cld_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cld_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cld_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cld_sfl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cld_ful_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cld_ivd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cld_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cld_inv_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cld_qty" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="cld_ship_qty" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="cld_ship_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cld_reshipped" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cld_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cld_claim_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cld_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cld_notes" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="cld_ivw_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cld_claim_reason" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cld_claim_status" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cld_email_sent" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cld_sui_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cld_number" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cld_process_qty" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="cld_process_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CentralizedOrderEntry_Claim_DataObjectType", propOrder = {
    "cldKey",
    "cldAddUser",
    "cldAddDate",
    "cldChangeUser",
    "cldChangeDate",
    "cldDeleteFlag",
    "cldKeyExt",
    "cldSflKey",
    "cldFulKey",
    "cldIvdKey",
    "cldCxaKey",
    "cldInvCode",
    "cldQty",
    "cldShipQty",
    "cldShipDate",
    "cldReshipped",
    "cldEntityKey",
    "cldClaimDate",
    "cldCstKey",
    "cldNotes",
    "cldIvwKey",
    "cldClaimReason",
    "cldClaimStatus",
    "cldEmailSent",
    "cldSuiPrdKey",
    "cldNumber",
    "cldProcessQty",
    "cldProcessDate"
})
public class CentralizedOrderEntryClaimDataObjectType {

    @XmlElementRef(name = "cld_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cldKey;
    @XmlElementRef(name = "cld_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cldAddUser;
    @XmlElementRef(name = "cld_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cldAddDate;
    @XmlElementRef(name = "cld_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cldChangeUser;
    @XmlElementRef(name = "cld_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cldChangeDate;
    @XmlElementRef(name = "cld_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cldDeleteFlag;
    @XmlElementRef(name = "cld_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cldKeyExt;
    @XmlElementRef(name = "cld_sfl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cldSflKey;
    @XmlElementRef(name = "cld_ful_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cldFulKey;
    @XmlElementRef(name = "cld_ivd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cldIvdKey;
    @XmlElementRef(name = "cld_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cldCxaKey;
    @XmlElementRef(name = "cld_inv_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cldInvCode;
    @XmlElementRef(name = "cld_qty", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> cldQty;
    @XmlElementRef(name = "cld_ship_qty", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> cldShipQty;
    @XmlElementRef(name = "cld_ship_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cldShipDate;
    @XmlElementRef(name = "cld_reshipped", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cldReshipped;
    @XmlElementRef(name = "cld_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cldEntityKey;
    @XmlElementRef(name = "cld_claim_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cldClaimDate;
    @XmlElementRef(name = "cld_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cldCstKey;
    @XmlElementRef(name = "cld_notes", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cldNotes;
    @XmlElementRef(name = "cld_ivw_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cldIvwKey;
    @XmlElementRef(name = "cld_claim_reason", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cldClaimReason;
    @XmlElementRef(name = "cld_claim_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cldClaimStatus;
    @XmlElementRef(name = "cld_email_sent", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cldEmailSent;
    @XmlElementRef(name = "cld_sui_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cldSuiPrdKey;
    @XmlElementRef(name = "cld_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cldNumber;
    @XmlElementRef(name = "cld_process_qty", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> cldProcessQty;
    @XmlElementRef(name = "cld_process_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cldProcessDate;

    /**
     * Gets the value of the cldKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCldKey() {
        return cldKey;
    }

    /**
     * Sets the value of the cldKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCldKey(JAXBElement<String> value) {
        this.cldKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cldAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCldAddUser() {
        return cldAddUser;
    }

    /**
     * Sets the value of the cldAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCldAddUser(JAXBElement<String> value) {
        this.cldAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cldAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCldAddDate() {
        return cldAddDate;
    }

    /**
     * Sets the value of the cldAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCldAddDate(JAXBElement<String> value) {
        this.cldAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cldChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCldChangeUser() {
        return cldChangeUser;
    }

    /**
     * Sets the value of the cldChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCldChangeUser(JAXBElement<String> value) {
        this.cldChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cldChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCldChangeDate() {
        return cldChangeDate;
    }

    /**
     * Sets the value of the cldChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCldChangeDate(JAXBElement<String> value) {
        this.cldChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cldDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCldDeleteFlag() {
        return cldDeleteFlag;
    }

    /**
     * Sets the value of the cldDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCldDeleteFlag(JAXBElement<Short> value) {
        this.cldDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cldKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCldKeyExt() {
        return cldKeyExt;
    }

    /**
     * Sets the value of the cldKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCldKeyExt(JAXBElement<String> value) {
        this.cldKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cldSflKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCldSflKey() {
        return cldSflKey;
    }

    /**
     * Sets the value of the cldSflKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCldSflKey(JAXBElement<String> value) {
        this.cldSflKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cldFulKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCldFulKey() {
        return cldFulKey;
    }

    /**
     * Sets the value of the cldFulKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCldFulKey(JAXBElement<String> value) {
        this.cldFulKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cldIvdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCldIvdKey() {
        return cldIvdKey;
    }

    /**
     * Sets the value of the cldIvdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCldIvdKey(JAXBElement<String> value) {
        this.cldIvdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cldCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCldCxaKey() {
        return cldCxaKey;
    }

    /**
     * Sets the value of the cldCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCldCxaKey(JAXBElement<String> value) {
        this.cldCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cldInvCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCldInvCode() {
        return cldInvCode;
    }

    /**
     * Sets the value of the cldInvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCldInvCode(JAXBElement<String> value) {
        this.cldInvCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cldQty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCldQty() {
        return cldQty;
    }

    /**
     * Sets the value of the cldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCldQty(JAXBElement<BigDecimal> value) {
        this.cldQty = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the cldShipQty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCldShipQty() {
        return cldShipQty;
    }

    /**
     * Sets the value of the cldShipQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCldShipQty(JAXBElement<BigDecimal> value) {
        this.cldShipQty = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the cldShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCldShipDate() {
        return cldShipDate;
    }

    /**
     * Sets the value of the cldShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCldShipDate(JAXBElement<String> value) {
        this.cldShipDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cldReshipped property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCldReshipped() {
        return cldReshipped;
    }

    /**
     * Sets the value of the cldReshipped property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCldReshipped(JAXBElement<Short> value) {
        this.cldReshipped = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cldEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCldEntityKey() {
        return cldEntityKey;
    }

    /**
     * Sets the value of the cldEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCldEntityKey(JAXBElement<String> value) {
        this.cldEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cldClaimDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCldClaimDate() {
        return cldClaimDate;
    }

    /**
     * Sets the value of the cldClaimDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCldClaimDate(JAXBElement<String> value) {
        this.cldClaimDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cldCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCldCstKey() {
        return cldCstKey;
    }

    /**
     * Sets the value of the cldCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCldCstKey(JAXBElement<String> value) {
        this.cldCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cldNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCldNotes() {
        return cldNotes;
    }

    /**
     * Sets the value of the cldNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCldNotes(JAXBElement<String> value) {
        this.cldNotes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cldIvwKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCldIvwKey() {
        return cldIvwKey;
    }

    /**
     * Sets the value of the cldIvwKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCldIvwKey(JAXBElement<String> value) {
        this.cldIvwKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cldClaimReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCldClaimReason() {
        return cldClaimReason;
    }

    /**
     * Sets the value of the cldClaimReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCldClaimReason(JAXBElement<String> value) {
        this.cldClaimReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cldClaimStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCldClaimStatus() {
        return cldClaimStatus;
    }

    /**
     * Sets the value of the cldClaimStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCldClaimStatus(JAXBElement<String> value) {
        this.cldClaimStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cldEmailSent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCldEmailSent() {
        return cldEmailSent;
    }

    /**
     * Sets the value of the cldEmailSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCldEmailSent(JAXBElement<Short> value) {
        this.cldEmailSent = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cldSuiPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCldSuiPrdKey() {
        return cldSuiPrdKey;
    }

    /**
     * Sets the value of the cldSuiPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCldSuiPrdKey(JAXBElement<String> value) {
        this.cldSuiPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cldNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCldNumber() {
        return cldNumber;
    }

    /**
     * Sets the value of the cldNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCldNumber(JAXBElement<Integer> value) {
        this.cldNumber = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cldProcessQty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCldProcessQty() {
        return cldProcessQty;
    }

    /**
     * Sets the value of the cldProcessQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCldProcessQty(JAXBElement<BigDecimal> value) {
        this.cldProcessQty = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the cldProcessDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCldProcessDate() {
        return cldProcessDate;
    }

    /**
     * Sets the value of the cldProcessDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCldProcessDate(JAXBElement<String> value) {
        this.cldProcessDate = ((JAXBElement<String> ) value);
    }

}
