
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExhibitorNew_Exhibitor_Booth_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExhibitorNew_Exhibitor_Booth_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hxb_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="hxb_exh_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="hxb_inv_code_cp" type="{http://www.avectra.com/2005/}stringLength53_Type" minOccurs="0"/>
 *         &lt;element name="hxb_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="hxb_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="hxb_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="hxb_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="hxb_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="hxb_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="hxb_received_comp" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="hxb_bct_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="hxb_bty_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="hxb_booth_number" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="hxb_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="hxb_priority_points_override" type="{http://www.avectra.com/2005/}av_decimal2_Type" minOccurs="0"/>
 *         &lt;element name="hxb_notes" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="hxb_shared_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="hxb_cancel_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="hxb_wait_list_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="hxb_booth_status" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="hxb_ebn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="hxb_bfe_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="hxb_sbt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="hxb_comp_booth_personnel_override" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="hxb_inv_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="hxb_ivd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="hxb_width" type="{http://www.avectra.com/2005/}av_decimal2_Type" minOccurs="0"/>
 *         &lt;element name="hxb_depth" type="{http://www.avectra.com/2005/}av_decimal2_Type" minOccurs="0"/>
 *         &lt;element name="hxb_square_footage" type="{http://www.avectra.com/2005/}av_decimal2_Type" minOccurs="0"/>
 *         &lt;element name="hxb_square_footage_cp" type="{http://www.avectra.com/2005/}decimal_Type" minOccurs="0"/>
 *         &lt;element name="hxb_odd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExhibitorNew_Exhibitor_Booth_DataObjectType", propOrder = {
    "hxbKey",
    "hxbExhKey",
    "hxbInvCodeCp",
    "hxbAddUser",
    "hxbAddDate",
    "hxbChangeUser",
    "hxbChangeDate",
    "hxbDeleteFlag",
    "hxbKeyExt",
    "hxbReceivedComp",
    "hxbBctKey",
    "hxbBtyKey",
    "hxbBoothNumber",
    "hxbEntityKey",
    "hxbPriorityPointsOverride",
    "hxbNotes",
    "hxbSharedFlag",
    "hxbCancelDate",
    "hxbWaitListFlag",
    "hxbBoothStatus",
    "hxbEbnKey",
    "hxbBfePrdKey",
    "hxbSbtKey",
    "hxbCompBoothPersonnelOverride",
    "hxbInvCode",
    "hxbIvdKey",
    "hxbWidth",
    "hxbDepth",
    "hxbSquareFootage",
    "hxbSquareFootageCp",
    "hxbOddKey"
})
public class ExhibitorNewExhibitorBoothDataObjectType {

    @XmlElementRef(name = "hxb_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> hxbKey;
    @XmlElementRef(name = "hxb_exh_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> hxbExhKey;
    @XmlElementRef(name = "hxb_inv_code_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> hxbInvCodeCp;
    @XmlElementRef(name = "hxb_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> hxbAddUser;
    @XmlElementRef(name = "hxb_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> hxbAddDate;
    @XmlElementRef(name = "hxb_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> hxbChangeUser;
    @XmlElementRef(name = "hxb_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> hxbChangeDate;
    @XmlElementRef(name = "hxb_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> hxbDeleteFlag;
    @XmlElementRef(name = "hxb_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> hxbKeyExt;
    @XmlElementRef(name = "hxb_received_comp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> hxbReceivedComp;
    @XmlElementRef(name = "hxb_bct_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> hxbBctKey;
    @XmlElementRef(name = "hxb_bty_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> hxbBtyKey;
    @XmlElementRef(name = "hxb_booth_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> hxbBoothNumber;
    @XmlElementRef(name = "hxb_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> hxbEntityKey;
    @XmlElementRef(name = "hxb_priority_points_override", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> hxbPriorityPointsOverride;
    @XmlElementRef(name = "hxb_notes", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> hxbNotes;
    @XmlElementRef(name = "hxb_shared_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> hxbSharedFlag;
    @XmlElementRef(name = "hxb_cancel_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> hxbCancelDate;
    @XmlElementRef(name = "hxb_wait_list_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> hxbWaitListFlag;
    @XmlElementRef(name = "hxb_booth_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> hxbBoothStatus;
    @XmlElementRef(name = "hxb_ebn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> hxbEbnKey;
    @XmlElementRef(name = "hxb_bfe_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> hxbBfePrdKey;
    @XmlElementRef(name = "hxb_sbt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> hxbSbtKey;
    @XmlElementRef(name = "hxb_comp_booth_personnel_override", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> hxbCompBoothPersonnelOverride;
    @XmlElementRef(name = "hxb_inv_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> hxbInvCode;
    @XmlElementRef(name = "hxb_ivd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> hxbIvdKey;
    @XmlElementRef(name = "hxb_width", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> hxbWidth;
    @XmlElementRef(name = "hxb_depth", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> hxbDepth;
    @XmlElementRef(name = "hxb_square_footage", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> hxbSquareFootage;
    @XmlElementRef(name = "hxb_square_footage_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> hxbSquareFootageCp;
    @XmlElementRef(name = "hxb_odd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> hxbOddKey;

    /**
     * Gets the value of the hxbKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHxbKey() {
        return hxbKey;
    }

    /**
     * Sets the value of the hxbKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHxbKey(JAXBElement<String> value) {
        this.hxbKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hxbExhKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHxbExhKey() {
        return hxbExhKey;
    }

    /**
     * Sets the value of the hxbExhKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHxbExhKey(JAXBElement<String> value) {
        this.hxbExhKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hxbInvCodeCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHxbInvCodeCp() {
        return hxbInvCodeCp;
    }

    /**
     * Sets the value of the hxbInvCodeCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHxbInvCodeCp(JAXBElement<String> value) {
        this.hxbInvCodeCp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hxbAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHxbAddUser() {
        return hxbAddUser;
    }

    /**
     * Sets the value of the hxbAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHxbAddUser(JAXBElement<String> value) {
        this.hxbAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hxbAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHxbAddDate() {
        return hxbAddDate;
    }

    /**
     * Sets the value of the hxbAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHxbAddDate(JAXBElement<String> value) {
        this.hxbAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hxbChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHxbChangeUser() {
        return hxbChangeUser;
    }

    /**
     * Sets the value of the hxbChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHxbChangeUser(JAXBElement<String> value) {
        this.hxbChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hxbChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHxbChangeDate() {
        return hxbChangeDate;
    }

    /**
     * Sets the value of the hxbChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHxbChangeDate(JAXBElement<String> value) {
        this.hxbChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hxbDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getHxbDeleteFlag() {
        return hxbDeleteFlag;
    }

    /**
     * Sets the value of the hxbDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setHxbDeleteFlag(JAXBElement<Short> value) {
        this.hxbDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the hxbKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHxbKeyExt() {
        return hxbKeyExt;
    }

    /**
     * Sets the value of the hxbKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHxbKeyExt(JAXBElement<String> value) {
        this.hxbKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hxbReceivedComp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getHxbReceivedComp() {
        return hxbReceivedComp;
    }

    /**
     * Sets the value of the hxbReceivedComp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setHxbReceivedComp(JAXBElement<Short> value) {
        this.hxbReceivedComp = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the hxbBctKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHxbBctKey() {
        return hxbBctKey;
    }

    /**
     * Sets the value of the hxbBctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHxbBctKey(JAXBElement<String> value) {
        this.hxbBctKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hxbBtyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHxbBtyKey() {
        return hxbBtyKey;
    }

    /**
     * Sets the value of the hxbBtyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHxbBtyKey(JAXBElement<String> value) {
        this.hxbBtyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hxbBoothNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHxbBoothNumber() {
        return hxbBoothNumber;
    }

    /**
     * Sets the value of the hxbBoothNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHxbBoothNumber(JAXBElement<Integer> value) {
        this.hxbBoothNumber = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the hxbEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHxbEntityKey() {
        return hxbEntityKey;
    }

    /**
     * Sets the value of the hxbEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHxbEntityKey(JAXBElement<String> value) {
        this.hxbEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hxbPriorityPointsOverride property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getHxbPriorityPointsOverride() {
        return hxbPriorityPointsOverride;
    }

    /**
     * Sets the value of the hxbPriorityPointsOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setHxbPriorityPointsOverride(JAXBElement<BigDecimal> value) {
        this.hxbPriorityPointsOverride = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the hxbNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHxbNotes() {
        return hxbNotes;
    }

    /**
     * Sets the value of the hxbNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHxbNotes(JAXBElement<String> value) {
        this.hxbNotes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hxbSharedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getHxbSharedFlag() {
        return hxbSharedFlag;
    }

    /**
     * Sets the value of the hxbSharedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setHxbSharedFlag(JAXBElement<Short> value) {
        this.hxbSharedFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the hxbCancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHxbCancelDate() {
        return hxbCancelDate;
    }

    /**
     * Sets the value of the hxbCancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHxbCancelDate(JAXBElement<String> value) {
        this.hxbCancelDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hxbWaitListFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getHxbWaitListFlag() {
        return hxbWaitListFlag;
    }

    /**
     * Sets the value of the hxbWaitListFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setHxbWaitListFlag(JAXBElement<Short> value) {
        this.hxbWaitListFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the hxbBoothStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHxbBoothStatus() {
        return hxbBoothStatus;
    }

    /**
     * Sets the value of the hxbBoothStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHxbBoothStatus(JAXBElement<String> value) {
        this.hxbBoothStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hxbEbnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHxbEbnKey() {
        return hxbEbnKey;
    }

    /**
     * Sets the value of the hxbEbnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHxbEbnKey(JAXBElement<String> value) {
        this.hxbEbnKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hxbBfePrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHxbBfePrdKey() {
        return hxbBfePrdKey;
    }

    /**
     * Sets the value of the hxbBfePrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHxbBfePrdKey(JAXBElement<String> value) {
        this.hxbBfePrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hxbSbtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHxbSbtKey() {
        return hxbSbtKey;
    }

    /**
     * Sets the value of the hxbSbtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHxbSbtKey(JAXBElement<String> value) {
        this.hxbSbtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hxbCompBoothPersonnelOverride property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHxbCompBoothPersonnelOverride() {
        return hxbCompBoothPersonnelOverride;
    }

    /**
     * Sets the value of the hxbCompBoothPersonnelOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHxbCompBoothPersonnelOverride(JAXBElement<Integer> value) {
        this.hxbCompBoothPersonnelOverride = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the hxbInvCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHxbInvCode() {
        return hxbInvCode;
    }

    /**
     * Sets the value of the hxbInvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHxbInvCode(JAXBElement<String> value) {
        this.hxbInvCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hxbIvdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHxbIvdKey() {
        return hxbIvdKey;
    }

    /**
     * Sets the value of the hxbIvdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHxbIvdKey(JAXBElement<String> value) {
        this.hxbIvdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hxbWidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getHxbWidth() {
        return hxbWidth;
    }

    /**
     * Sets the value of the hxbWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setHxbWidth(JAXBElement<BigDecimal> value) {
        this.hxbWidth = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the hxbDepth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getHxbDepth() {
        return hxbDepth;
    }

    /**
     * Sets the value of the hxbDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setHxbDepth(JAXBElement<BigDecimal> value) {
        this.hxbDepth = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the hxbSquareFootage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getHxbSquareFootage() {
        return hxbSquareFootage;
    }

    /**
     * Sets the value of the hxbSquareFootage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setHxbSquareFootage(JAXBElement<BigDecimal> value) {
        this.hxbSquareFootage = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the hxbSquareFootageCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getHxbSquareFootageCp() {
        return hxbSquareFootageCp;
    }

    /**
     * Sets the value of the hxbSquareFootageCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setHxbSquareFootageCp(JAXBElement<BigDecimal> value) {
        this.hxbSquareFootageCp = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the hxbOddKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHxbOddKey() {
        return hxbOddKey;
    }

    /**
     * Sets the value of the hxbOddKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHxbOddKey(JAXBElement<String> value) {
        this.hxbOddKey = ((JAXBElement<String> ) value);
    }

}
