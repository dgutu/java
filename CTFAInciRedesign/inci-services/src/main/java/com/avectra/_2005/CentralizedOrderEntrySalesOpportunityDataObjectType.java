
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CentralizedOrderEntry_Sales_Opportunity_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CentralizedOrderEntry_Sales_Opportunity_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sfo_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="sfo_type" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="sfo_usr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="sfo_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="sfo_opportunity_name" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="sfo_sot_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="sfo_sor_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="sfo_quantity" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="sfo_description" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="sfo_amount" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="sfo_close_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="sfo_sos_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="sfo_close_probability" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="sfo_expected_revenue" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="sfo_sos_code_next" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="sfo_ptp_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="sfo_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="sfo_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="sfo_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="sfo_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="sfo_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="sfo_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="sfo_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="sfo_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CentralizedOrderEntry_Sales_Opportunity_DataObjectType", propOrder = {
    "sfoKey",
    "sfoType",
    "sfoUsrKey",
    "sfoCstKey",
    "sfoOpportunityName",
    "sfoSotCode",
    "sfoSorCode",
    "sfoQuantity",
    "sfoDescription",
    "sfoAmount",
    "sfoCloseDate",
    "sfoSosCode",
    "sfoCloseProbability",
    "sfoExpectedRevenue",
    "sfoSosCodeNext",
    "sfoPtpKey",
    "sfoPrdKey",
    "sfoAddUser",
    "sfoAddDate",
    "sfoChangeUser",
    "sfoChangeDate",
    "sfoDeleteFlag",
    "sfoKeyExt",
    "sfoEntityKey"
})
public class CentralizedOrderEntrySalesOpportunityDataObjectType {

    @XmlElementRef(name = "sfo_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sfoKey;
    @XmlElementRef(name = "sfo_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sfoType;
    @XmlElementRef(name = "sfo_usr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sfoUsrKey;
    @XmlElementRef(name = "sfo_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sfoCstKey;
    @XmlElementRef(name = "sfo_opportunity_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sfoOpportunityName;
    @XmlElementRef(name = "sfo_sot_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sfoSotCode;
    @XmlElementRef(name = "sfo_sor_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sfoSorCode;
    @XmlElementRef(name = "sfo_quantity", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> sfoQuantity;
    @XmlElementRef(name = "sfo_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sfoDescription;
    @XmlElementRef(name = "sfo_amount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> sfoAmount;
    @XmlElementRef(name = "sfo_close_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sfoCloseDate;
    @XmlElementRef(name = "sfo_sos_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sfoSosCode;
    @XmlElementRef(name = "sfo_close_probability", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> sfoCloseProbability;
    @XmlElementRef(name = "sfo_expected_revenue", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> sfoExpectedRevenue;
    @XmlElementRef(name = "sfo_sos_code_next", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sfoSosCodeNext;
    @XmlElementRef(name = "sfo_ptp_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sfoPtpKey;
    @XmlElementRef(name = "sfo_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sfoPrdKey;
    @XmlElementRef(name = "sfo_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sfoAddUser;
    @XmlElementRef(name = "sfo_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sfoAddDate;
    @XmlElementRef(name = "sfo_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sfoChangeUser;
    @XmlElementRef(name = "sfo_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sfoChangeDate;
    @XmlElementRef(name = "sfo_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> sfoDeleteFlag;
    @XmlElementRef(name = "sfo_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sfoKeyExt;
    @XmlElementRef(name = "sfo_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> sfoEntityKey;

    /**
     * Gets the value of the sfoKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSfoKey() {
        return sfoKey;
    }

    /**
     * Sets the value of the sfoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSfoKey(JAXBElement<String> value) {
        this.sfoKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sfoType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSfoType() {
        return sfoType;
    }

    /**
     * Sets the value of the sfoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSfoType(JAXBElement<String> value) {
        this.sfoType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sfoUsrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSfoUsrKey() {
        return sfoUsrKey;
    }

    /**
     * Sets the value of the sfoUsrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSfoUsrKey(JAXBElement<String> value) {
        this.sfoUsrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sfoCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSfoCstKey() {
        return sfoCstKey;
    }

    /**
     * Sets the value of the sfoCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSfoCstKey(JAXBElement<String> value) {
        this.sfoCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sfoOpportunityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSfoOpportunityName() {
        return sfoOpportunityName;
    }

    /**
     * Sets the value of the sfoOpportunityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSfoOpportunityName(JAXBElement<String> value) {
        this.sfoOpportunityName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sfoSotCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSfoSotCode() {
        return sfoSotCode;
    }

    /**
     * Sets the value of the sfoSotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSfoSotCode(JAXBElement<String> value) {
        this.sfoSotCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sfoSorCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSfoSorCode() {
        return sfoSorCode;
    }

    /**
     * Sets the value of the sfoSorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSfoSorCode(JAXBElement<String> value) {
        this.sfoSorCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sfoQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSfoQuantity() {
        return sfoQuantity;
    }

    /**
     * Sets the value of the sfoQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSfoQuantity(JAXBElement<BigDecimal> value) {
        this.sfoQuantity = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the sfoDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSfoDescription() {
        return sfoDescription;
    }

    /**
     * Sets the value of the sfoDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSfoDescription(JAXBElement<String> value) {
        this.sfoDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sfoAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSfoAmount() {
        return sfoAmount;
    }

    /**
     * Sets the value of the sfoAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSfoAmount(JAXBElement<BigDecimal> value) {
        this.sfoAmount = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the sfoCloseDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSfoCloseDate() {
        return sfoCloseDate;
    }

    /**
     * Sets the value of the sfoCloseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSfoCloseDate(JAXBElement<String> value) {
        this.sfoCloseDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sfoSosCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSfoSosCode() {
        return sfoSosCode;
    }

    /**
     * Sets the value of the sfoSosCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSfoSosCode(JAXBElement<String> value) {
        this.sfoSosCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sfoCloseProbability property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSfoCloseProbability() {
        return sfoCloseProbability;
    }

    /**
     * Sets the value of the sfoCloseProbability property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSfoCloseProbability(JAXBElement<BigDecimal> value) {
        this.sfoCloseProbability = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the sfoExpectedRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSfoExpectedRevenue() {
        return sfoExpectedRevenue;
    }

    /**
     * Sets the value of the sfoExpectedRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSfoExpectedRevenue(JAXBElement<BigDecimal> value) {
        this.sfoExpectedRevenue = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the sfoSosCodeNext property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSfoSosCodeNext() {
        return sfoSosCodeNext;
    }

    /**
     * Sets the value of the sfoSosCodeNext property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSfoSosCodeNext(JAXBElement<String> value) {
        this.sfoSosCodeNext = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sfoPtpKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSfoPtpKey() {
        return sfoPtpKey;
    }

    /**
     * Sets the value of the sfoPtpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSfoPtpKey(JAXBElement<String> value) {
        this.sfoPtpKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sfoPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSfoPrdKey() {
        return sfoPrdKey;
    }

    /**
     * Sets the value of the sfoPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSfoPrdKey(JAXBElement<String> value) {
        this.sfoPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sfoAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSfoAddUser() {
        return sfoAddUser;
    }

    /**
     * Sets the value of the sfoAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSfoAddUser(JAXBElement<String> value) {
        this.sfoAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sfoAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSfoAddDate() {
        return sfoAddDate;
    }

    /**
     * Sets the value of the sfoAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSfoAddDate(JAXBElement<String> value) {
        this.sfoAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sfoChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSfoChangeUser() {
        return sfoChangeUser;
    }

    /**
     * Sets the value of the sfoChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSfoChangeUser(JAXBElement<String> value) {
        this.sfoChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sfoChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSfoChangeDate() {
        return sfoChangeDate;
    }

    /**
     * Sets the value of the sfoChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSfoChangeDate(JAXBElement<String> value) {
        this.sfoChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sfoDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getSfoDeleteFlag() {
        return sfoDeleteFlag;
    }

    /**
     * Sets the value of the sfoDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setSfoDeleteFlag(JAXBElement<Short> value) {
        this.sfoDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the sfoKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSfoKeyExt() {
        return sfoKeyExt;
    }

    /**
     * Sets the value of the sfoKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSfoKeyExt(JAXBElement<String> value) {
        this.sfoKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sfoEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSfoEntityKey() {
        return sfoEntityKey;
    }

    /**
     * Sets the value of the sfoEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSfoEntityKey(JAXBElement<String> value) {
        this.sfoEntityKey = ((JAXBElement<String> ) value);
    }

}
