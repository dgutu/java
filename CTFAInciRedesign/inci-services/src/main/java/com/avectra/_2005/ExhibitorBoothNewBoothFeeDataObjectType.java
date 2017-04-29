
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExhibitorBoothNew_Booth_Fee_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExhibitorBoothNew_Booth_Fee_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bfe_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bfe_square_footage_min" type="{http://www.avectra.com/2005/}av_decimal2_Type" minOccurs="0"/>
 *         &lt;element name="bfe_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="bfe_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="bfe_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="bfe_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="bfe_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="bfe_prd_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bfe_bty_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bfe_square_footage_max" type="{http://www.avectra.com/2005/}av_decimal2_Type" minOccurs="0"/>
 *         &lt;element name="bfe_bct_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bfe_exb_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bfe_fee_class" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="bfe_square_footage_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="bfe_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bfe_booth_personnel_qty" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="bfe_quantity" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="bfe_comp_registrations" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="bfe_priority_points" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="bfe_ebn_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExhibitorBoothNew_Booth_Fee_DataObjectType", propOrder = {
    "bfePrdKey",
    "bfeSquareFootageMin",
    "bfeAddUser",
    "bfeAddDate",
    "bfeChangeUser",
    "bfeChangeDate",
    "bfeDeleteFlag",
    "bfePrdKeyExt",
    "bfeBtyKey",
    "bfeSquareFootageMax",
    "bfeBctKey",
    "bfeExbKey",
    "bfeFeeClass",
    "bfeSquareFootageFlag",
    "bfeEntityKey",
    "bfeBoothPersonnelQty",
    "bfeQuantity",
    "bfeCompRegistrations",
    "bfePriorityPoints",
    "bfeEbnKey"
})
public class ExhibitorBoothNewBoothFeeDataObjectType {

    @XmlElementRef(name = "bfe_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bfePrdKey;
    @XmlElementRef(name = "bfe_square_footage_min", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> bfeSquareFootageMin;
    @XmlElementRef(name = "bfe_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bfeAddUser;
    @XmlElementRef(name = "bfe_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bfeAddDate;
    @XmlElementRef(name = "bfe_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bfeChangeUser;
    @XmlElementRef(name = "bfe_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bfeChangeDate;
    @XmlElementRef(name = "bfe_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bfeDeleteFlag;
    @XmlElementRef(name = "bfe_prd_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bfePrdKeyExt;
    @XmlElementRef(name = "bfe_bty_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bfeBtyKey;
    @XmlElementRef(name = "bfe_square_footage_max", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> bfeSquareFootageMax;
    @XmlElementRef(name = "bfe_bct_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bfeBctKey;
    @XmlElementRef(name = "bfe_exb_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bfeExbKey;
    @XmlElementRef(name = "bfe_fee_class", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bfeFeeClass;
    @XmlElementRef(name = "bfe_square_footage_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bfeSquareFootageFlag;
    @XmlElementRef(name = "bfe_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bfeEntityKey;
    @XmlElementRef(name = "bfe_booth_personnel_qty", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> bfeBoothPersonnelQty;
    @XmlElementRef(name = "bfe_quantity", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> bfeQuantity;
    @XmlElementRef(name = "bfe_comp_registrations", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> bfeCompRegistrations;
    @XmlElementRef(name = "bfe_priority_points", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> bfePriorityPoints;
    @XmlElementRef(name = "bfe_ebn_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bfeEbnKey;

    /**
     * Gets the value of the bfePrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBfePrdKey() {
        return bfePrdKey;
    }

    /**
     * Sets the value of the bfePrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBfePrdKey(JAXBElement<String> value) {
        this.bfePrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bfeSquareFootageMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBfeSquareFootageMin() {
        return bfeSquareFootageMin;
    }

    /**
     * Sets the value of the bfeSquareFootageMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBfeSquareFootageMin(JAXBElement<BigDecimal> value) {
        this.bfeSquareFootageMin = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the bfeAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBfeAddUser() {
        return bfeAddUser;
    }

    /**
     * Sets the value of the bfeAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBfeAddUser(JAXBElement<String> value) {
        this.bfeAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bfeAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBfeAddDate() {
        return bfeAddDate;
    }

    /**
     * Sets the value of the bfeAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBfeAddDate(JAXBElement<String> value) {
        this.bfeAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bfeChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBfeChangeUser() {
        return bfeChangeUser;
    }

    /**
     * Sets the value of the bfeChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBfeChangeUser(JAXBElement<String> value) {
        this.bfeChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bfeChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBfeChangeDate() {
        return bfeChangeDate;
    }

    /**
     * Sets the value of the bfeChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBfeChangeDate(JAXBElement<String> value) {
        this.bfeChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bfeDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBfeDeleteFlag() {
        return bfeDeleteFlag;
    }

    /**
     * Sets the value of the bfeDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBfeDeleteFlag(JAXBElement<Short> value) {
        this.bfeDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bfePrdKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBfePrdKeyExt() {
        return bfePrdKeyExt;
    }

    /**
     * Sets the value of the bfePrdKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBfePrdKeyExt(JAXBElement<String> value) {
        this.bfePrdKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bfeBtyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBfeBtyKey() {
        return bfeBtyKey;
    }

    /**
     * Sets the value of the bfeBtyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBfeBtyKey(JAXBElement<String> value) {
        this.bfeBtyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bfeSquareFootageMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBfeSquareFootageMax() {
        return bfeSquareFootageMax;
    }

    /**
     * Sets the value of the bfeSquareFootageMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBfeSquareFootageMax(JAXBElement<BigDecimal> value) {
        this.bfeSquareFootageMax = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the bfeBctKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBfeBctKey() {
        return bfeBctKey;
    }

    /**
     * Sets the value of the bfeBctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBfeBctKey(JAXBElement<String> value) {
        this.bfeBctKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bfeExbKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBfeExbKey() {
        return bfeExbKey;
    }

    /**
     * Sets the value of the bfeExbKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBfeExbKey(JAXBElement<String> value) {
        this.bfeExbKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bfeFeeClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBfeFeeClass() {
        return bfeFeeClass;
    }

    /**
     * Sets the value of the bfeFeeClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBfeFeeClass(JAXBElement<String> value) {
        this.bfeFeeClass = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bfeSquareFootageFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBfeSquareFootageFlag() {
        return bfeSquareFootageFlag;
    }

    /**
     * Sets the value of the bfeSquareFootageFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBfeSquareFootageFlag(JAXBElement<Short> value) {
        this.bfeSquareFootageFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bfeEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBfeEntityKey() {
        return bfeEntityKey;
    }

    /**
     * Sets the value of the bfeEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBfeEntityKey(JAXBElement<String> value) {
        this.bfeEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bfeBoothPersonnelQty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBfeBoothPersonnelQty() {
        return bfeBoothPersonnelQty;
    }

    /**
     * Sets the value of the bfeBoothPersonnelQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBfeBoothPersonnelQty(JAXBElement<Integer> value) {
        this.bfeBoothPersonnelQty = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bfeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBfeQuantity() {
        return bfeQuantity;
    }

    /**
     * Sets the value of the bfeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBfeQuantity(JAXBElement<Integer> value) {
        this.bfeQuantity = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bfeCompRegistrations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBfeCompRegistrations() {
        return bfeCompRegistrations;
    }

    /**
     * Sets the value of the bfeCompRegistrations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBfeCompRegistrations(JAXBElement<Integer> value) {
        this.bfeCompRegistrations = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bfePriorityPoints property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBfePriorityPoints() {
        return bfePriorityPoints;
    }

    /**
     * Sets the value of the bfePriorityPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBfePriorityPoints(JAXBElement<Integer> value) {
        this.bfePriorityPoints = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bfeEbnKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBfeEbnKey() {
        return bfeEbnKey;
    }

    /**
     * Sets the value of the bfeEbnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBfeEbnKey(JAXBElement<String> value) {
        this.bfeEbnKey = ((JAXBElement<String> ) value);
    }

}
