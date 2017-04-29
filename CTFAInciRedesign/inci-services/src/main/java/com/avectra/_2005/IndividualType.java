
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentKey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="Individual" type="{http://www.avectra.com/2005/}Individual_Individual_DataObjectType"/>
 *         &lt;element name="Customer" type="{http://www.avectra.com/2005/}Individual_Customer_DataObjectType"/>
 *         &lt;element name="Organization_XRef" type="{http://www.avectra.com/2005/}Individual_Organization_XRef_DataObjectType"/>
 *         &lt;element name="Organization" type="{http://www.avectra.com/2005/}Individual_Organization_DataObjectType"/>
 *         &lt;element name="Email" type="{http://www.avectra.com/2005/}Individual_Email_DataObjectType"/>
 *         &lt;element name="Website" type="{http://www.avectra.com/2005/}Individual_Website_DataObjectType"/>
 *         &lt;element name="Messaging" type="{http://www.avectra.com/2005/}Individual_Messaging_DataObjectType"/>
 *         &lt;element name="Business_Address_XRef" type="{http://www.avectra.com/2005/}Individual_Business_Address_XRef_DataObjectType"/>
 *         &lt;element name="Business_Address" type="{http://www.avectra.com/2005/}Individual_Business_Address_DataObjectType"/>
 *         &lt;element name="Business_Address_State" type="{http://www.avectra.com/2005/}Individual_Business_Address_State_DataObjectType"/>
 *         &lt;element name="Business_Address_Country" type="{http://www.avectra.com/2005/}Individual_Business_Address_Country_DataObjectType"/>
 *         &lt;element name="Business_Phone_XRef" type="{http://www.avectra.com/2005/}Individual_Business_Phone_XRef_DataObjectType"/>
 *         &lt;element name="Business_Phone" type="{http://www.avectra.com/2005/}Individual_Business_Phone_DataObjectType"/>
 *         &lt;element name="Business_Phone_Country" type="{http://www.avectra.com/2005/}Individual_Business_Phone_Country_DataObjectType"/>
 *         &lt;element name="Business_Fax_XRef" type="{http://www.avectra.com/2005/}Individual_Business_Fax_XRef_DataObjectType"/>
 *         &lt;element name="Business_Fax" type="{http://www.avectra.com/2005/}Individual_Business_Fax_DataObjectType"/>
 *         &lt;element name="Business_Fax_Country" type="{http://www.avectra.com/2005/}Individual_Business_Fax_Country_DataObjectType"/>
 *         &lt;element name="Home_Address_XRef" type="{http://www.avectra.com/2005/}Individual_Home_Address_XRef_DataObjectType"/>
 *         &lt;element name="Home_Address" type="{http://www.avectra.com/2005/}Individual_Home_Address_DataObjectType"/>
 *         &lt;element name="Home_Address_State" type="{http://www.avectra.com/2005/}Individual_Home_Address_State_DataObjectType"/>
 *         &lt;element name="Home_Address_Country" type="{http://www.avectra.com/2005/}Individual_Home_Address_Country_DataObjectType"/>
 *         &lt;element name="Home_Phone" type="{http://www.avectra.com/2005/}Individual_Home_Phone_DataObjectType"/>
 *         &lt;element name="Home_Phone_Country" type="{http://www.avectra.com/2005/}Individual_Home_Phone_Country_DataObjectType"/>
 *         &lt;element name="Home_Phone_XRef" type="{http://www.avectra.com/2005/}Individual_Home_Phone_XRef_DataObjectType"/>
 *         &lt;element name="Home_Fax" type="{http://www.avectra.com/2005/}Individual_Home_Fax_DataObjectType"/>
 *         &lt;element name="Home_Fax_Country" type="{http://www.avectra.com/2005/}Individual_Home_Fax_Country_DataObjectType"/>
 *         &lt;element name="Home_Fax_XRef" type="{http://www.avectra.com/2005/}Individual_Home_Fax_XRef_DataObjectType"/>
 *         &lt;element name="Address_Change_Log" type="{http://www.avectra.com/2005/}Individual_Address_Change_Log_DataObjectType"/>
 *         &lt;element name="TransferToCustomer" type="{http://www.avectra.com/2005/}Individual_TransferToCustomer_DataObjectType"/>
 *         &lt;element name="Individual_Custom_Demographics" type="{http://www.avectra.com/2005/}Individual_Individual_Custom_Demographics_DataObjectType"/>
 *         &lt;element name="Social_Links" type="{http://www.avectra.com/2005/}Individual_Social_Links_DataObjectType"/>
 *         &lt;element name="source_code" type="{http://www.avectra.com/2005/}Individual_source_code_DataObjectType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualType", propOrder = {
    "currentKey",
    "individual",
    "customer",
    "organizationXRef",
    "organization",
    "email",
    "website",
    "messaging",
    "businessAddressXRef",
    "businessAddress",
    "businessAddressState",
    "businessAddressCountry",
    "businessPhoneXRef",
    "businessPhone",
    "businessPhoneCountry",
    "businessFaxXRef",
    "businessFax",
    "businessFaxCountry",
    "homeAddressXRef",
    "homeAddress",
    "homeAddressState",
    "homeAddressCountry",
    "homePhone",
    "homePhoneCountry",
    "homePhoneXRef",
    "homeFax",
    "homeFaxCountry",
    "homeFaxXRef",
    "addressChangeLog",
    "transferToCustomer",
    "individualCustomDemographics",
    "socialLinks",
    "sourceCode"
})
public class IndividualType {

    @XmlElementRef(name = "CurrentKey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> currentKey;
    @XmlElement(name = "Individual", required = true)
    protected IndividualIndividualDataObjectType individual;
    @XmlElement(name = "Customer", required = true)
    protected IndividualCustomerDataObjectType customer;
    @XmlElement(name = "Organization_XRef", required = true)
    protected IndividualOrganizationXRefDataObjectType organizationXRef;
    @XmlElement(name = "Organization", required = true)
    protected IndividualOrganizationDataObjectType organization;
    @XmlElement(name = "Email", required = true)
    protected IndividualEmailDataObjectType email;
    @XmlElement(name = "Website", required = true)
    protected IndividualWebsiteDataObjectType website;
    @XmlElement(name = "Messaging", required = true)
    protected IndividualMessagingDataObjectType messaging;
    @XmlElement(name = "Business_Address_XRef", required = true)
    protected IndividualBusinessAddressXRefDataObjectType businessAddressXRef;
    @XmlElement(name = "Business_Address", required = true)
    protected IndividualBusinessAddressDataObjectType businessAddress;
    @XmlElement(name = "Business_Address_State", required = true)
    protected IndividualBusinessAddressStateDataObjectType businessAddressState;
    @XmlElement(name = "Business_Address_Country", required = true)
    protected IndividualBusinessAddressCountryDataObjectType businessAddressCountry;
    @XmlElement(name = "Business_Phone_XRef", required = true)
    protected IndividualBusinessPhoneXRefDataObjectType businessPhoneXRef;
    @XmlElement(name = "Business_Phone", required = true)
    protected IndividualBusinessPhoneDataObjectType businessPhone;
    @XmlElement(name = "Business_Phone_Country", required = true)
    protected IndividualBusinessPhoneCountryDataObjectType businessPhoneCountry;
    @XmlElement(name = "Business_Fax_XRef", required = true)
    protected IndividualBusinessFaxXRefDataObjectType businessFaxXRef;
    @XmlElement(name = "Business_Fax", required = true)
    protected IndividualBusinessFaxDataObjectType businessFax;
    @XmlElement(name = "Business_Fax_Country", required = true)
    protected IndividualBusinessFaxCountryDataObjectType businessFaxCountry;
    @XmlElement(name = "Home_Address_XRef", required = true)
    protected IndividualHomeAddressXRefDataObjectType homeAddressXRef;
    @XmlElement(name = "Home_Address", required = true)
    protected IndividualHomeAddressDataObjectType homeAddress;
    @XmlElement(name = "Home_Address_State", required = true)
    protected IndividualHomeAddressStateDataObjectType homeAddressState;
    @XmlElement(name = "Home_Address_Country", required = true)
    protected IndividualHomeAddressCountryDataObjectType homeAddressCountry;
    @XmlElement(name = "Home_Phone", required = true)
    protected IndividualHomePhoneDataObjectType homePhone;
    @XmlElement(name = "Home_Phone_Country", required = true)
    protected IndividualHomePhoneCountryDataObjectType homePhoneCountry;
    @XmlElement(name = "Home_Phone_XRef", required = true)
    protected IndividualHomePhoneXRefDataObjectType homePhoneXRef;
    @XmlElement(name = "Home_Fax", required = true)
    protected IndividualHomeFaxDataObjectType homeFax;
    @XmlElement(name = "Home_Fax_Country", required = true)
    protected IndividualHomeFaxCountryDataObjectType homeFaxCountry;
    @XmlElement(name = "Home_Fax_XRef", required = true)
    protected IndividualHomeFaxXRefDataObjectType homeFaxXRef;
    @XmlElement(name = "Address_Change_Log", required = true)
    protected IndividualAddressChangeLogDataObjectType addressChangeLog;
    @XmlElement(name = "TransferToCustomer", required = true)
    protected IndividualTransferToCustomerDataObjectType transferToCustomer;
    @XmlElement(name = "Individual_Custom_Demographics", required = true)
    protected IndividualIndividualCustomDemographicsDataObjectType individualCustomDemographics;
    @XmlElement(name = "Social_Links", required = true)
    protected IndividualSocialLinksDataObjectType socialLinks;
    @XmlElement(name = "source_code", required = true)
    protected IndividualSourceCodeDataObjectType sourceCode;

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
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualIndividualDataObjectType }
     *     
     */
    public IndividualIndividualDataObjectType getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualIndividualDataObjectType }
     *     
     */
    public void setIndividual(IndividualIndividualDataObjectType value) {
        this.individual = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualCustomerDataObjectType }
     *     
     */
    public IndividualCustomerDataObjectType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualCustomerDataObjectType }
     *     
     */
    public void setCustomer(IndividualCustomerDataObjectType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the organizationXRef property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualOrganizationXRefDataObjectType }
     *     
     */
    public IndividualOrganizationXRefDataObjectType getOrganizationXRef() {
        return organizationXRef;
    }

    /**
     * Sets the value of the organizationXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualOrganizationXRefDataObjectType }
     *     
     */
    public void setOrganizationXRef(IndividualOrganizationXRefDataObjectType value) {
        this.organizationXRef = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualOrganizationDataObjectType }
     *     
     */
    public IndividualOrganizationDataObjectType getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualOrganizationDataObjectType }
     *     
     */
    public void setOrganization(IndividualOrganizationDataObjectType value) {
        this.organization = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualEmailDataObjectType }
     *     
     */
    public IndividualEmailDataObjectType getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualEmailDataObjectType }
     *     
     */
    public void setEmail(IndividualEmailDataObjectType value) {
        this.email = value;
    }

    /**
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualWebsiteDataObjectType }
     *     
     */
    public IndividualWebsiteDataObjectType getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualWebsiteDataObjectType }
     *     
     */
    public void setWebsite(IndividualWebsiteDataObjectType value) {
        this.website = value;
    }

    /**
     * Gets the value of the messaging property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualMessagingDataObjectType }
     *     
     */
    public IndividualMessagingDataObjectType getMessaging() {
        return messaging;
    }

    /**
     * Sets the value of the messaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualMessagingDataObjectType }
     *     
     */
    public void setMessaging(IndividualMessagingDataObjectType value) {
        this.messaging = value;
    }

    /**
     * Gets the value of the businessAddressXRef property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualBusinessAddressXRefDataObjectType }
     *     
     */
    public IndividualBusinessAddressXRefDataObjectType getBusinessAddressXRef() {
        return businessAddressXRef;
    }

    /**
     * Sets the value of the businessAddressXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualBusinessAddressXRefDataObjectType }
     *     
     */
    public void setBusinessAddressXRef(IndividualBusinessAddressXRefDataObjectType value) {
        this.businessAddressXRef = value;
    }

    /**
     * Gets the value of the businessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualBusinessAddressDataObjectType }
     *     
     */
    public IndividualBusinessAddressDataObjectType getBusinessAddress() {
        return businessAddress;
    }

    /**
     * Sets the value of the businessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualBusinessAddressDataObjectType }
     *     
     */
    public void setBusinessAddress(IndividualBusinessAddressDataObjectType value) {
        this.businessAddress = value;
    }

    /**
     * Gets the value of the businessAddressState property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualBusinessAddressStateDataObjectType }
     *     
     */
    public IndividualBusinessAddressStateDataObjectType getBusinessAddressState() {
        return businessAddressState;
    }

    /**
     * Sets the value of the businessAddressState property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualBusinessAddressStateDataObjectType }
     *     
     */
    public void setBusinessAddressState(IndividualBusinessAddressStateDataObjectType value) {
        this.businessAddressState = value;
    }

    /**
     * Gets the value of the businessAddressCountry property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualBusinessAddressCountryDataObjectType }
     *     
     */
    public IndividualBusinessAddressCountryDataObjectType getBusinessAddressCountry() {
        return businessAddressCountry;
    }

    /**
     * Sets the value of the businessAddressCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualBusinessAddressCountryDataObjectType }
     *     
     */
    public void setBusinessAddressCountry(IndividualBusinessAddressCountryDataObjectType value) {
        this.businessAddressCountry = value;
    }

    /**
     * Gets the value of the businessPhoneXRef property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualBusinessPhoneXRefDataObjectType }
     *     
     */
    public IndividualBusinessPhoneXRefDataObjectType getBusinessPhoneXRef() {
        return businessPhoneXRef;
    }

    /**
     * Sets the value of the businessPhoneXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualBusinessPhoneXRefDataObjectType }
     *     
     */
    public void setBusinessPhoneXRef(IndividualBusinessPhoneXRefDataObjectType value) {
        this.businessPhoneXRef = value;
    }

    /**
     * Gets the value of the businessPhone property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualBusinessPhoneDataObjectType }
     *     
     */
    public IndividualBusinessPhoneDataObjectType getBusinessPhone() {
        return businessPhone;
    }

    /**
     * Sets the value of the businessPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualBusinessPhoneDataObjectType }
     *     
     */
    public void setBusinessPhone(IndividualBusinessPhoneDataObjectType value) {
        this.businessPhone = value;
    }

    /**
     * Gets the value of the businessPhoneCountry property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualBusinessPhoneCountryDataObjectType }
     *     
     */
    public IndividualBusinessPhoneCountryDataObjectType getBusinessPhoneCountry() {
        return businessPhoneCountry;
    }

    /**
     * Sets the value of the businessPhoneCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualBusinessPhoneCountryDataObjectType }
     *     
     */
    public void setBusinessPhoneCountry(IndividualBusinessPhoneCountryDataObjectType value) {
        this.businessPhoneCountry = value;
    }

    /**
     * Gets the value of the businessFaxXRef property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualBusinessFaxXRefDataObjectType }
     *     
     */
    public IndividualBusinessFaxXRefDataObjectType getBusinessFaxXRef() {
        return businessFaxXRef;
    }

    /**
     * Sets the value of the businessFaxXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualBusinessFaxXRefDataObjectType }
     *     
     */
    public void setBusinessFaxXRef(IndividualBusinessFaxXRefDataObjectType value) {
        this.businessFaxXRef = value;
    }

    /**
     * Gets the value of the businessFax property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualBusinessFaxDataObjectType }
     *     
     */
    public IndividualBusinessFaxDataObjectType getBusinessFax() {
        return businessFax;
    }

    /**
     * Sets the value of the businessFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualBusinessFaxDataObjectType }
     *     
     */
    public void setBusinessFax(IndividualBusinessFaxDataObjectType value) {
        this.businessFax = value;
    }

    /**
     * Gets the value of the businessFaxCountry property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualBusinessFaxCountryDataObjectType }
     *     
     */
    public IndividualBusinessFaxCountryDataObjectType getBusinessFaxCountry() {
        return businessFaxCountry;
    }

    /**
     * Sets the value of the businessFaxCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualBusinessFaxCountryDataObjectType }
     *     
     */
    public void setBusinessFaxCountry(IndividualBusinessFaxCountryDataObjectType value) {
        this.businessFaxCountry = value;
    }

    /**
     * Gets the value of the homeAddressXRef property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualHomeAddressXRefDataObjectType }
     *     
     */
    public IndividualHomeAddressXRefDataObjectType getHomeAddressXRef() {
        return homeAddressXRef;
    }

    /**
     * Sets the value of the homeAddressXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualHomeAddressXRefDataObjectType }
     *     
     */
    public void setHomeAddressXRef(IndividualHomeAddressXRefDataObjectType value) {
        this.homeAddressXRef = value;
    }

    /**
     * Gets the value of the homeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualHomeAddressDataObjectType }
     *     
     */
    public IndividualHomeAddressDataObjectType getHomeAddress() {
        return homeAddress;
    }

    /**
     * Sets the value of the homeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualHomeAddressDataObjectType }
     *     
     */
    public void setHomeAddress(IndividualHomeAddressDataObjectType value) {
        this.homeAddress = value;
    }

    /**
     * Gets the value of the homeAddressState property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualHomeAddressStateDataObjectType }
     *     
     */
    public IndividualHomeAddressStateDataObjectType getHomeAddressState() {
        return homeAddressState;
    }

    /**
     * Sets the value of the homeAddressState property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualHomeAddressStateDataObjectType }
     *     
     */
    public void setHomeAddressState(IndividualHomeAddressStateDataObjectType value) {
        this.homeAddressState = value;
    }

    /**
     * Gets the value of the homeAddressCountry property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualHomeAddressCountryDataObjectType }
     *     
     */
    public IndividualHomeAddressCountryDataObjectType getHomeAddressCountry() {
        return homeAddressCountry;
    }

    /**
     * Sets the value of the homeAddressCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualHomeAddressCountryDataObjectType }
     *     
     */
    public void setHomeAddressCountry(IndividualHomeAddressCountryDataObjectType value) {
        this.homeAddressCountry = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualHomePhoneDataObjectType }
     *     
     */
    public IndividualHomePhoneDataObjectType getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualHomePhoneDataObjectType }
     *     
     */
    public void setHomePhone(IndividualHomePhoneDataObjectType value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the homePhoneCountry property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualHomePhoneCountryDataObjectType }
     *     
     */
    public IndividualHomePhoneCountryDataObjectType getHomePhoneCountry() {
        return homePhoneCountry;
    }

    /**
     * Sets the value of the homePhoneCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualHomePhoneCountryDataObjectType }
     *     
     */
    public void setHomePhoneCountry(IndividualHomePhoneCountryDataObjectType value) {
        this.homePhoneCountry = value;
    }

    /**
     * Gets the value of the homePhoneXRef property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualHomePhoneXRefDataObjectType }
     *     
     */
    public IndividualHomePhoneXRefDataObjectType getHomePhoneXRef() {
        return homePhoneXRef;
    }

    /**
     * Sets the value of the homePhoneXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualHomePhoneXRefDataObjectType }
     *     
     */
    public void setHomePhoneXRef(IndividualHomePhoneXRefDataObjectType value) {
        this.homePhoneXRef = value;
    }

    /**
     * Gets the value of the homeFax property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualHomeFaxDataObjectType }
     *     
     */
    public IndividualHomeFaxDataObjectType getHomeFax() {
        return homeFax;
    }

    /**
     * Sets the value of the homeFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualHomeFaxDataObjectType }
     *     
     */
    public void setHomeFax(IndividualHomeFaxDataObjectType value) {
        this.homeFax = value;
    }

    /**
     * Gets the value of the homeFaxCountry property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualHomeFaxCountryDataObjectType }
     *     
     */
    public IndividualHomeFaxCountryDataObjectType getHomeFaxCountry() {
        return homeFaxCountry;
    }

    /**
     * Sets the value of the homeFaxCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualHomeFaxCountryDataObjectType }
     *     
     */
    public void setHomeFaxCountry(IndividualHomeFaxCountryDataObjectType value) {
        this.homeFaxCountry = value;
    }

    /**
     * Gets the value of the homeFaxXRef property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualHomeFaxXRefDataObjectType }
     *     
     */
    public IndividualHomeFaxXRefDataObjectType getHomeFaxXRef() {
        return homeFaxXRef;
    }

    /**
     * Sets the value of the homeFaxXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualHomeFaxXRefDataObjectType }
     *     
     */
    public void setHomeFaxXRef(IndividualHomeFaxXRefDataObjectType value) {
        this.homeFaxXRef = value;
    }

    /**
     * Gets the value of the addressChangeLog property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualAddressChangeLogDataObjectType }
     *     
     */
    public IndividualAddressChangeLogDataObjectType getAddressChangeLog() {
        return addressChangeLog;
    }

    /**
     * Sets the value of the addressChangeLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualAddressChangeLogDataObjectType }
     *     
     */
    public void setAddressChangeLog(IndividualAddressChangeLogDataObjectType value) {
        this.addressChangeLog = value;
    }

    /**
     * Gets the value of the transferToCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualTransferToCustomerDataObjectType }
     *     
     */
    public IndividualTransferToCustomerDataObjectType getTransferToCustomer() {
        return transferToCustomer;
    }

    /**
     * Sets the value of the transferToCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualTransferToCustomerDataObjectType }
     *     
     */
    public void setTransferToCustomer(IndividualTransferToCustomerDataObjectType value) {
        this.transferToCustomer = value;
    }

    /**
     * Gets the value of the individualCustomDemographics property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualIndividualCustomDemographicsDataObjectType }
     *     
     */
    public IndividualIndividualCustomDemographicsDataObjectType getIndividualCustomDemographics() {
        return individualCustomDemographics;
    }

    /**
     * Sets the value of the individualCustomDemographics property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualIndividualCustomDemographicsDataObjectType }
     *     
     */
    public void setIndividualCustomDemographics(IndividualIndividualCustomDemographicsDataObjectType value) {
        this.individualCustomDemographics = value;
    }

    /**
     * Gets the value of the socialLinks property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualSocialLinksDataObjectType }
     *     
     */
    public IndividualSocialLinksDataObjectType getSocialLinks() {
        return socialLinks;
    }

    /**
     * Sets the value of the socialLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualSocialLinksDataObjectType }
     *     
     */
    public void setSocialLinks(IndividualSocialLinksDataObjectType value) {
        this.socialLinks = value;
    }

    /**
     * Gets the value of the sourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualSourceCodeDataObjectType }
     *     
     */
    public IndividualSourceCodeDataObjectType getSourceCode() {
        return sourceCode;
    }

    /**
     * Sets the value of the sourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualSourceCodeDataObjectType }
     *     
     */
    public void setSourceCode(IndividualSourceCodeDataObjectType value) {
        this.sourceCode = value;
    }

}
