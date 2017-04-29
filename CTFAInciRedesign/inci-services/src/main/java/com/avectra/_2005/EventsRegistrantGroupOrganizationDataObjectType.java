
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrantGroup_Organization_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrantGroup_Organization_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="org_consortia_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="org_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="org_name" type="{http://www.avectra.com/2005/}stringLength150_Type" minOccurs="0"/>
 *         &lt;element name="org_ogt_code" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="org_cst_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="org_acronym" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="org_ind_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="org_num_employee" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="org_annual_sales" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="org_annual_revenue" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="org_dnb_number" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="org_date_founded" type="{http://www.avectra.com/2005/}av_date2_Type" minOccurs="0"/>
 *         &lt;element name="org_num_years_in_business_cp" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="org_state_incorporated" type="{http://www.avectra.com/2005/}stringLength2_Type" minOccurs="0"/>
 *         &lt;element name="org_num_location" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="org_annual_budget" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="org_ownership_type" type="{http://www.avectra.com/2005/}stringLength25_Type" minOccurs="0"/>
 *         &lt;element name="org_popup" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="org_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="org_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="org_nonprofit_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="org_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="org_org_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="org_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="org_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="org_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="org_cst_main_office_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="org_select_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrantGroup_Organization_DataObjectType", propOrder = {
    "orgConsortiaFlag",
    "orgCstKey",
    "orgName",
    "orgOgtCode",
    "orgCstKeyExt",
    "orgAcronym",
    "orgIndCstKey",
    "orgNumEmployee",
    "orgAnnualSales",
    "orgAnnualRevenue",
    "orgDnbNumber",
    "orgDateFounded",
    "orgNumYearsInBusinessCp",
    "orgStateIncorporated",
    "orgNumLocation",
    "orgAnnualBudget",
    "orgOwnershipType",
    "orgPopup",
    "orgAddDate",
    "orgEntityKey",
    "orgNonprofitFlag",
    "orgAddUser",
    "orgOrgCstKey",
    "orgChangeDate",
    "orgChangeUser",
    "orgDeleteFlag",
    "orgCstMainOfficeCstKey",
    "orgSelectFlag"
})
public class EventsRegistrantGroupOrganizationDataObjectType {

    @XmlElementRef(name = "org_consortia_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> orgConsortiaFlag;
    @XmlElementRef(name = "org_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orgCstKey;
    @XmlElementRef(name = "org_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orgName;
    @XmlElementRef(name = "org_ogt_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orgOgtCode;
    @XmlElementRef(name = "org_cst_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orgCstKeyExt;
    @XmlElementRef(name = "org_acronym", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orgAcronym;
    @XmlElementRef(name = "org_ind_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orgIndCstKey;
    @XmlElementRef(name = "org_num_employee", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> orgNumEmployee;
    @XmlElementRef(name = "org_annual_sales", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> orgAnnualSales;
    @XmlElementRef(name = "org_annual_revenue", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> orgAnnualRevenue;
    @XmlElementRef(name = "org_dnb_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orgDnbNumber;
    @XmlElementRef(name = "org_date_founded", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orgDateFounded;
    @XmlElementRef(name = "org_num_years_in_business_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> orgNumYearsInBusinessCp;
    @XmlElementRef(name = "org_state_incorporated", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orgStateIncorporated;
    @XmlElementRef(name = "org_num_location", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> orgNumLocation;
    @XmlElementRef(name = "org_annual_budget", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> orgAnnualBudget;
    @XmlElementRef(name = "org_ownership_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orgOwnershipType;
    @XmlElementRef(name = "org_popup", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orgPopup;
    @XmlElementRef(name = "org_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orgAddDate;
    @XmlElementRef(name = "org_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orgEntityKey;
    @XmlElementRef(name = "org_nonprofit_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> orgNonprofitFlag;
    @XmlElementRef(name = "org_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orgAddUser;
    @XmlElementRef(name = "org_org_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orgOrgCstKey;
    @XmlElementRef(name = "org_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orgChangeDate;
    @XmlElementRef(name = "org_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orgChangeUser;
    @XmlElementRef(name = "org_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> orgDeleteFlag;
    @XmlElementRef(name = "org_cst_main_office_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> orgCstMainOfficeCstKey;
    @XmlElementRef(name = "org_select_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> orgSelectFlag;

    /**
     * Gets the value of the orgConsortiaFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOrgConsortiaFlag() {
        return orgConsortiaFlag;
    }

    /**
     * Sets the value of the orgConsortiaFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOrgConsortiaFlag(JAXBElement<Short> value) {
        this.orgConsortiaFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the orgCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgCstKey() {
        return orgCstKey;
    }

    /**
     * Sets the value of the orgCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgCstKey(JAXBElement<String> value) {
        this.orgCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgName(JAXBElement<String> value) {
        this.orgName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgOgtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgOgtCode() {
        return orgOgtCode;
    }

    /**
     * Sets the value of the orgOgtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgOgtCode(JAXBElement<String> value) {
        this.orgOgtCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgCstKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgCstKeyExt() {
        return orgCstKeyExt;
    }

    /**
     * Sets the value of the orgCstKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgCstKeyExt(JAXBElement<String> value) {
        this.orgCstKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgAcronym property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgAcronym() {
        return orgAcronym;
    }

    /**
     * Sets the value of the orgAcronym property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgAcronym(JAXBElement<String> value) {
        this.orgAcronym = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgIndCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgIndCstKey() {
        return orgIndCstKey;
    }

    /**
     * Sets the value of the orgIndCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgIndCstKey(JAXBElement<String> value) {
        this.orgIndCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgNumEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrgNumEmployee() {
        return orgNumEmployee;
    }

    /**
     * Sets the value of the orgNumEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrgNumEmployee(JAXBElement<Integer> value) {
        this.orgNumEmployee = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the orgAnnualSales property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOrgAnnualSales() {
        return orgAnnualSales;
    }

    /**
     * Sets the value of the orgAnnualSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOrgAnnualSales(JAXBElement<BigDecimal> value) {
        this.orgAnnualSales = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the orgAnnualRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOrgAnnualRevenue() {
        return orgAnnualRevenue;
    }

    /**
     * Sets the value of the orgAnnualRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOrgAnnualRevenue(JAXBElement<BigDecimal> value) {
        this.orgAnnualRevenue = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the orgDnbNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgDnbNumber() {
        return orgDnbNumber;
    }

    /**
     * Sets the value of the orgDnbNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgDnbNumber(JAXBElement<String> value) {
        this.orgDnbNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgDateFounded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgDateFounded() {
        return orgDateFounded;
    }

    /**
     * Sets the value of the orgDateFounded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgDateFounded(JAXBElement<String> value) {
        this.orgDateFounded = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgNumYearsInBusinessCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrgNumYearsInBusinessCp() {
        return orgNumYearsInBusinessCp;
    }

    /**
     * Sets the value of the orgNumYearsInBusinessCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrgNumYearsInBusinessCp(JAXBElement<Integer> value) {
        this.orgNumYearsInBusinessCp = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the orgStateIncorporated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgStateIncorporated() {
        return orgStateIncorporated;
    }

    /**
     * Sets the value of the orgStateIncorporated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgStateIncorporated(JAXBElement<String> value) {
        this.orgStateIncorporated = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgNumLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrgNumLocation() {
        return orgNumLocation;
    }

    /**
     * Sets the value of the orgNumLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrgNumLocation(JAXBElement<Integer> value) {
        this.orgNumLocation = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the orgAnnualBudget property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOrgAnnualBudget() {
        return orgAnnualBudget;
    }

    /**
     * Sets the value of the orgAnnualBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOrgAnnualBudget(JAXBElement<BigDecimal> value) {
        this.orgAnnualBudget = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the orgOwnershipType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgOwnershipType() {
        return orgOwnershipType;
    }

    /**
     * Sets the value of the orgOwnershipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgOwnershipType(JAXBElement<String> value) {
        this.orgOwnershipType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgPopup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgPopup() {
        return orgPopup;
    }

    /**
     * Sets the value of the orgPopup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgPopup(JAXBElement<String> value) {
        this.orgPopup = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgAddDate() {
        return orgAddDate;
    }

    /**
     * Sets the value of the orgAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgAddDate(JAXBElement<String> value) {
        this.orgAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgEntityKey() {
        return orgEntityKey;
    }

    /**
     * Sets the value of the orgEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgEntityKey(JAXBElement<String> value) {
        this.orgEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgNonprofitFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOrgNonprofitFlag() {
        return orgNonprofitFlag;
    }

    /**
     * Sets the value of the orgNonprofitFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOrgNonprofitFlag(JAXBElement<Short> value) {
        this.orgNonprofitFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the orgAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgAddUser() {
        return orgAddUser;
    }

    /**
     * Sets the value of the orgAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgAddUser(JAXBElement<String> value) {
        this.orgAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgOrgCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgOrgCstKey() {
        return orgOrgCstKey;
    }

    /**
     * Sets the value of the orgOrgCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgOrgCstKey(JAXBElement<String> value) {
        this.orgOrgCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgChangeDate() {
        return orgChangeDate;
    }

    /**
     * Sets the value of the orgChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgChangeDate(JAXBElement<String> value) {
        this.orgChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgChangeUser() {
        return orgChangeUser;
    }

    /**
     * Sets the value of the orgChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgChangeUser(JAXBElement<String> value) {
        this.orgChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOrgDeleteFlag() {
        return orgDeleteFlag;
    }

    /**
     * Sets the value of the orgDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOrgDeleteFlag(JAXBElement<Short> value) {
        this.orgDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the orgCstMainOfficeCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgCstMainOfficeCstKey() {
        return orgCstMainOfficeCstKey;
    }

    /**
     * Sets the value of the orgCstMainOfficeCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgCstMainOfficeCstKey(JAXBElement<String> value) {
        this.orgCstMainOfficeCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgSelectFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOrgSelectFlag() {
        return orgSelectFlag;
    }

    /**
     * Sets the value of the orgSelectFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOrgSelectFlag(JAXBElement<Short> value) {
        this.orgSelectFlag = ((JAXBElement<Short> ) value);
    }

}
