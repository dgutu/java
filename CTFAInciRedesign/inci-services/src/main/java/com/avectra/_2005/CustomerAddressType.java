
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentKey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="Address_XRef" type="{http://www.avectra.com/2005/}IndividualAddress_Address_XRef_DataObjectType"/>
 *         &lt;element name="Customer" type="{http://www.avectra.com/2005/}IndividualAddress_Customer_DataObjectType"/>
 *         &lt;element name="Individual" type="{http://www.avectra.com/2005/}IndividualAddress_Individual_DataObjectType"/>
 *         &lt;element name="Organization" type="{http://www.avectra.com/2005/}IndividualAddress_Organization_DataObjectType"/>
 *         &lt;element name="Chapter" type="{http://www.avectra.com/2005/}IndividualAddress_Chapter_DataObjectType"/>
 *         &lt;element name="Address" type="{http://www.avectra.com/2005/}IndividualAddress_Address_DataObjectType"/>
 *         &lt;element name="Address_Change_Log" type="{http://www.avectra.com/2005/}IndividualAddress_Address_Change_Log_DataObjectType"/>
 *         &lt;element name="Country" type="{http://www.avectra.com/2005/}IndividualAddress_Country_DataObjectType"/>
 *         &lt;element name="Primary_Affiliation" type="{http://www.avectra.com/2005/}IndividualAddress_Primary_Affiliation_DataObjectType"/>
 *         &lt;element name="StateTerritory" type="{http://www.avectra.com/2005/}IndividualAddress_StateTerritory_DataObjectType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAddressType", propOrder = {
    "currentKey",
    "addressXRef",
    "customer",
    "individual",
    "organization",
    "chapter",
    "address",
    "addressChangeLog",
    "country",
    "primaryAffiliation",
    "stateTerritory"
})
public class CustomerAddressType {

    @XmlElementRef(name = "CurrentKey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> currentKey;
    @XmlElement(name = "Address_XRef", required = true)
    protected IndividualAddressAddressXRefDataObjectType addressXRef;
    @XmlElement(name = "Customer", required = true)
    protected IndividualAddressCustomerDataObjectType customer;
    @XmlElement(name = "Individual", required = true)
    protected IndividualAddressIndividualDataObjectType individual;
    @XmlElement(name = "Organization", required = true)
    protected IndividualAddressOrganizationDataObjectType organization;
    @XmlElement(name = "Chapter", required = true)
    protected IndividualAddressChapterDataObjectType chapter;
    @XmlElement(name = "Address", required = true)
    protected IndividualAddressAddressDataObjectType address;
    @XmlElement(name = "Address_Change_Log", required = true)
    protected IndividualAddressAddressChangeLogDataObjectType addressChangeLog;
    @XmlElement(name = "Country", required = true)
    protected IndividualAddressCountryDataObjectType country;
    @XmlElement(name = "Primary_Affiliation", required = true)
    protected IndividualAddressPrimaryAffiliationDataObjectType primaryAffiliation;
    @XmlElement(name = "StateTerritory", required = true)
    protected IndividualAddressStateTerritoryDataObjectType stateTerritory;

    /**
     * Gets the value of the currentKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentKey() {
        return currentKey;
    }

    /**
     * Sets the value of the currentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentKey(JAXBElement<String> value) {
        this.currentKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the addressXRef property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualAddressAddressXRefDataObjectType }
     *     
     */
    public IndividualAddressAddressXRefDataObjectType getAddressXRef() {
        return addressXRef;
    }

    /**
     * Sets the value of the addressXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualAddressAddressXRefDataObjectType }
     *     
     */
    public void setAddressXRef(IndividualAddressAddressXRefDataObjectType value) {
        this.addressXRef = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualAddressCustomerDataObjectType }
     *     
     */
    public IndividualAddressCustomerDataObjectType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualAddressCustomerDataObjectType }
     *     
     */
    public void setCustomer(IndividualAddressCustomerDataObjectType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualAddressIndividualDataObjectType }
     *     
     */
    public IndividualAddressIndividualDataObjectType getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualAddressIndividualDataObjectType }
     *     
     */
    public void setIndividual(IndividualAddressIndividualDataObjectType value) {
        this.individual = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualAddressOrganizationDataObjectType }
     *     
     */
    public IndividualAddressOrganizationDataObjectType getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualAddressOrganizationDataObjectType }
     *     
     */
    public void setOrganization(IndividualAddressOrganizationDataObjectType value) {
        this.organization = value;
    }

    /**
     * Gets the value of the chapter property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualAddressChapterDataObjectType }
     *     
     */
    public IndividualAddressChapterDataObjectType getChapter() {
        return chapter;
    }

    /**
     * Sets the value of the chapter property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualAddressChapterDataObjectType }
     *     
     */
    public void setChapter(IndividualAddressChapterDataObjectType value) {
        this.chapter = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualAddressAddressDataObjectType }
     *     
     */
    public IndividualAddressAddressDataObjectType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualAddressAddressDataObjectType }
     *     
     */
    public void setAddress(IndividualAddressAddressDataObjectType value) {
        this.address = value;
    }

    /**
     * Gets the value of the addressChangeLog property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualAddressAddressChangeLogDataObjectType }
     *     
     */
    public IndividualAddressAddressChangeLogDataObjectType getAddressChangeLog() {
        return addressChangeLog;
    }

    /**
     * Sets the value of the addressChangeLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualAddressAddressChangeLogDataObjectType }
     *     
     */
    public void setAddressChangeLog(IndividualAddressAddressChangeLogDataObjectType value) {
        this.addressChangeLog = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualAddressCountryDataObjectType }
     *     
     */
    public IndividualAddressCountryDataObjectType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualAddressCountryDataObjectType }
     *     
     */
    public void setCountry(IndividualAddressCountryDataObjectType value) {
        this.country = value;
    }

    /**
     * Gets the value of the primaryAffiliation property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualAddressPrimaryAffiliationDataObjectType }
     *     
     */
    public IndividualAddressPrimaryAffiliationDataObjectType getPrimaryAffiliation() {
        return primaryAffiliation;
    }

    /**
     * Sets the value of the primaryAffiliation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualAddressPrimaryAffiliationDataObjectType }
     *     
     */
    public void setPrimaryAffiliation(IndividualAddressPrimaryAffiliationDataObjectType value) {
        this.primaryAffiliation = value;
    }

    /**
     * Gets the value of the stateTerritory property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualAddressStateTerritoryDataObjectType }
     *     
     */
    public IndividualAddressStateTerritoryDataObjectType getStateTerritory() {
        return stateTerritory;
    }

    /**
     * Sets the value of the stateTerritory property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualAddressStateTerritoryDataObjectType }
     *     
     */
    public void setStateTerritory(IndividualAddressStateTerritoryDataObjectType value) {
        this.stateTerritory = value;
    }

}
