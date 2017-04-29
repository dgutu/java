
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceDetail_Currency_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceDetail_Currency_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cur_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cur_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cur_description" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cur_symbol_prefix" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cur_symbol_suffix" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cur_negative_display" type="{http://www.avectra.com/2005/}stringLength2_Type" minOccurs="0"/>
 *         &lt;element name="cur_separator" type="{http://www.avectra.com/2005/}stringLength1_Type" minOccurs="0"/>
 *         &lt;element name="cur_accuracy" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cur_calc_method" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cur_unit" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="cur_sub_unit" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="cur_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cur_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cur_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cur_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cur_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cur_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cur_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cur_fraction_separator" type="{http://www.avectra.com/2005/}stringLength1_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceDetail_Currency_DataObjectType", propOrder = {
    "curKey",
    "curCode",
    "curDescription",
    "curSymbolPrefix",
    "curSymbolSuffix",
    "curNegativeDisplay",
    "curSeparator",
    "curAccuracy",
    "curCalcMethod",
    "curUnit",
    "curSubUnit",
    "curAddUser",
    "curAddDate",
    "curChangeUser",
    "curChangeDate",
    "curDeleteFlag",
    "curEntityKey",
    "curKeyExt",
    "curFractionSeparator"
})
public class InvoiceDetailCurrencyDataObjectType {

    @XmlElementRef(name = "cur_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> curKey;
    @XmlElementRef(name = "cur_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> curCode;
    @XmlElementRef(name = "cur_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> curDescription;
    @XmlElementRef(name = "cur_symbol_prefix", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> curSymbolPrefix;
    @XmlElementRef(name = "cur_symbol_suffix", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> curSymbolSuffix;
    @XmlElementRef(name = "cur_negative_display", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> curNegativeDisplay;
    @XmlElementRef(name = "cur_separator", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> curSeparator;
    @XmlElementRef(name = "cur_accuracy", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> curAccuracy;
    @XmlElementRef(name = "cur_calc_method", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> curCalcMethod;
    @XmlElementRef(name = "cur_unit", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> curUnit;
    @XmlElementRef(name = "cur_sub_unit", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> curSubUnit;
    @XmlElementRef(name = "cur_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> curAddUser;
    @XmlElementRef(name = "cur_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> curAddDate;
    @XmlElementRef(name = "cur_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> curChangeUser;
    @XmlElementRef(name = "cur_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> curChangeDate;
    @XmlElementRef(name = "cur_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> curDeleteFlag;
    @XmlElementRef(name = "cur_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> curEntityKey;
    @XmlElementRef(name = "cur_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> curKeyExt;
    @XmlElementRef(name = "cur_fraction_separator", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> curFractionSeparator;

    /**
     * Gets the value of the curKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurKey() {
        return curKey;
    }

    /**
     * Sets the value of the curKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurKey(JAXBElement<String> value) {
        this.curKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the curCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurCode() {
        return curCode;
    }

    /**
     * Sets the value of the curCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurCode(JAXBElement<String> value) {
        this.curCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the curDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurDescription() {
        return curDescription;
    }

    /**
     * Sets the value of the curDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurDescription(JAXBElement<String> value) {
        this.curDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the curSymbolPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurSymbolPrefix() {
        return curSymbolPrefix;
    }

    /**
     * Sets the value of the curSymbolPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurSymbolPrefix(JAXBElement<String> value) {
        this.curSymbolPrefix = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the curSymbolSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurSymbolSuffix() {
        return curSymbolSuffix;
    }

    /**
     * Sets the value of the curSymbolSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurSymbolSuffix(JAXBElement<String> value) {
        this.curSymbolSuffix = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the curNegativeDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurNegativeDisplay() {
        return curNegativeDisplay;
    }

    /**
     * Sets the value of the curNegativeDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurNegativeDisplay(JAXBElement<String> value) {
        this.curNegativeDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the curSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurSeparator() {
        return curSeparator;
    }

    /**
     * Sets the value of the curSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurSeparator(JAXBElement<String> value) {
        this.curSeparator = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the curAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCurAccuracy() {
        return curAccuracy;
    }

    /**
     * Sets the value of the curAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCurAccuracy(JAXBElement<Integer> value) {
        this.curAccuracy = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the curCalcMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurCalcMethod() {
        return curCalcMethod;
    }

    /**
     * Sets the value of the curCalcMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurCalcMethod(JAXBElement<String> value) {
        this.curCalcMethod = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the curUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurUnit() {
        return curUnit;
    }

    /**
     * Sets the value of the curUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurUnit(JAXBElement<String> value) {
        this.curUnit = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the curSubUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurSubUnit() {
        return curSubUnit;
    }

    /**
     * Sets the value of the curSubUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurSubUnit(JAXBElement<String> value) {
        this.curSubUnit = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the curAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurAddUser() {
        return curAddUser;
    }

    /**
     * Sets the value of the curAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurAddUser(JAXBElement<String> value) {
        this.curAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the curAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurAddDate() {
        return curAddDate;
    }

    /**
     * Sets the value of the curAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurAddDate(JAXBElement<String> value) {
        this.curAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the curChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurChangeUser() {
        return curChangeUser;
    }

    /**
     * Sets the value of the curChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurChangeUser(JAXBElement<String> value) {
        this.curChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the curChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurChangeDate() {
        return curChangeDate;
    }

    /**
     * Sets the value of the curChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurChangeDate(JAXBElement<String> value) {
        this.curChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the curDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCurDeleteFlag() {
        return curDeleteFlag;
    }

    /**
     * Sets the value of the curDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCurDeleteFlag(JAXBElement<Short> value) {
        this.curDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the curEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurEntityKey() {
        return curEntityKey;
    }

    /**
     * Sets the value of the curEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurEntityKey(JAXBElement<String> value) {
        this.curEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the curKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurKeyExt() {
        return curKeyExt;
    }

    /**
     * Sets the value of the curKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurKeyExt(JAXBElement<String> value) {
        this.curKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the curFractionSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurFractionSeparator() {
        return curFractionSeparator;
    }

    /**
     * Sets the value of the curFractionSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurFractionSeparator(JAXBElement<String> value) {
        this.curFractionSeparator = ((JAXBElement<String> ) value);
    }

}
