
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentKey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="Organization" type="{http://www.avectra.com/2005/}Organization_Organization_DataObjectType"/>
 *         &lt;element name="Customer" type="{http://www.avectra.com/2005/}Organization_Customer_DataObjectType"/>
 *         &lt;element name="Parent_Customer" type="{http://www.avectra.com/2005/}Organization_Parent_Customer_DataObjectType"/>
 *         &lt;element name="Email" type="{http://www.avectra.com/2005/}Organization_Email_DataObjectType"/>
 *         &lt;element name="Website" type="{http://www.avectra.com/2005/}Organization_Website_DataObjectType"/>
 *         &lt;element name="Messaging" type="{http://www.avectra.com/2005/}Organization_Messaging_DataObjectType"/>
 *         &lt;element name="Phone_XRef" type="{http://www.avectra.com/2005/}Organization_Phone_XRef_DataObjectType"/>
 *         &lt;element name="Phone" type="{http://www.avectra.com/2005/}Organization_Phone_DataObjectType"/>
 *         &lt;element name="Phone_Country" type="{http://www.avectra.com/2005/}Organization_Phone_Country_DataObjectType"/>
 *         &lt;element name="Fax_XRef" type="{http://www.avectra.com/2005/}Organization_Fax_XRef_DataObjectType"/>
 *         &lt;element name="Fax" type="{http://www.avectra.com/2005/}Organization_Fax_DataObjectType"/>
 *         &lt;element name="Fax_Country" type="{http://www.avectra.com/2005/}Organization_Fax_Country_DataObjectType"/>
 *         &lt;element name="Address_XRef_1" type="{http://www.avectra.com/2005/}Organization_Address_XRef_1_DataObjectType"/>
 *         &lt;element name="Address_1" type="{http://www.avectra.com/2005/}Organization_Address_1_DataObjectType"/>
 *         &lt;element name="Firm" type="{http://www.avectra.com/2005/}Organization_Firm_DataObjectType"/>
 *         &lt;element name="Business_Address_State" type="{http://www.avectra.com/2005/}Organization_Business_Address_State_DataObjectType"/>
 *         &lt;element name="Address_1_Country" type="{http://www.avectra.com/2005/}Organization_Address_1_Country_DataObjectType"/>
 *         &lt;element name="Billing_Address_1" type="{http://www.avectra.com/2005/}Organization_Billing_Address_1_DataObjectType"/>
 *         &lt;element name="Home_Address_State" type="{http://www.avectra.com/2005/}Organization_Home_Address_State_DataObjectType"/>
 *         &lt;element name="Billing_Address_1_Country" type="{http://www.avectra.com/2005/}Organization_Billing_Address_1_Country_DataObjectType"/>
 *         &lt;element name="Billing_Address_XRef_1" type="{http://www.avectra.com/2005/}Organization_Billing_Address_XRef_1_DataObjectType"/>
 *         &lt;element name="Customer_X_Customer" type="{http://www.avectra.com/2005/}Organization_Customer_X_Customer_DataObjectType"/>
 *         &lt;element name="Primary_Contact" type="{http://www.avectra.com/2005/}Organization_Primary_Contact_DataObjectType"/>
 *         &lt;element name="Address_Change_Log" type="{http://www.avectra.com/2005/}Organization_Address_Change_Log_DataObjectType"/>
 *         &lt;element name="Organization_Custom_Demographics" type="{http://www.avectra.com/2005/}Organization_Organization_Custom_Demographics_DataObjectType"/>
 *         &lt;element name="Social_Links" type="{http://www.avectra.com/2005/}Organization_Social_Links_DataObjectType"/>
 *         &lt;element name="source_code" type="{http://www.avectra.com/2005/}Organization_source_code_DataObjectType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationType", propOrder = {
    "currentKey",
    "organization",
    "customer",
    "parentCustomer",
    "email",
    "website",
    "messaging",
    "phoneXRef",
    "phone",
    "phoneCountry",
    "faxXRef",
    "fax",
    "faxCountry",
    "addressXRef1",
    "address1",
    "firm",
    "businessAddressState",
    "address1Country",
    "billingAddress1",
    "homeAddressState",
    "billingAddress1Country",
    "billingAddressXRef1",
    "customerXCustomer",
    "primaryContact",
    "addressChangeLog",
    "organizationCustomDemographics",
    "socialLinks",
    "sourceCode"
})
public class OrganizationType {

    @XmlElementRef(name = "CurrentKey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> currentKey;
    @XmlElement(name = "Organization", required = true)
    protected OrganizationOrganizationDataObjectType organization;
    @XmlElement(name = "Customer", required = true)
    protected OrganizationCustomerDataObjectType customer;
    @XmlElement(name = "Parent_Customer", required = true)
    protected OrganizationParentCustomerDataObjectType parentCustomer;
    @XmlElement(name = "Email", required = true)
    protected OrganizationEmailDataObjectType email;
    @XmlElement(name = "Website", required = true)
    protected OrganizationWebsiteDataObjectType website;
    @XmlElement(name = "Messaging", required = true)
    protected OrganizationMessagingDataObjectType messaging;
    @XmlElement(name = "Phone_XRef", required = true)
    protected OrganizationPhoneXRefDataObjectType phoneXRef;
    @XmlElement(name = "Phone", required = true)
    protected OrganizationPhoneDataObjectType phone;
    @XmlElement(name = "Phone_Country", required = true)
    protected OrganizationPhoneCountryDataObjectType phoneCountry;
    @XmlElement(name = "Fax_XRef", required = true)
    protected OrganizationFaxXRefDataObjectType faxXRef;
    @XmlElement(name = "Fax", required = true)
    protected OrganizationFaxDataObjectType fax;
    @XmlElement(name = "Fax_Country", required = true)
    protected OrganizationFaxCountryDataObjectType faxCountry;
    @XmlElement(name = "Address_XRef_1", required = true)
    protected OrganizationAddressXRef1DataObjectType addressXRef1;
    @XmlElement(name = "Address_1", required = true)
    protected OrganizationAddress1DataObjectType address1;
    @XmlElement(name = "Firm", required = true)
    protected OrganizationFirmDataObjectType firm;
    @XmlElement(name = "Business_Address_State", required = true)
    protected OrganizationBusinessAddressStateDataObjectType businessAddressState;
    @XmlElement(name = "Address_1_Country", required = true)
    protected OrganizationAddress1CountryDataObjectType address1Country;
    @XmlElement(name = "Billing_Address_1", required = true)
    protected OrganizationBillingAddress1DataObjectType billingAddress1;
    @XmlElement(name = "Home_Address_State", required = true)
    protected OrganizationHomeAddressStateDataObjectType homeAddressState;
    @XmlElement(name = "Billing_Address_1_Country", required = true)
    protected OrganizationBillingAddress1CountryDataObjectType billingAddress1Country;
    @XmlElement(name = "Billing_Address_XRef_1", required = true)
    protected OrganizationBillingAddressXRef1DataObjectType billingAddressXRef1;
    @XmlElement(name = "Customer_X_Customer", required = true)
    protected OrganizationCustomerXCustomerDataObjectType customerXCustomer;
    @XmlElement(name = "Primary_Contact", required = true)
    protected OrganizationPrimaryContactDataObjectType primaryContact;
    @XmlElement(name = "Address_Change_Log", required = true)
    protected OrganizationAddressChangeLogDataObjectType addressChangeLog;
    @XmlElement(name = "Organization_Custom_Demographics", required = true)
    protected OrganizationOrganizationCustomDemographicsDataObjectType organizationCustomDemographics;
    @XmlElement(name = "Social_Links", required = true)
    protected OrganizationSocialLinksDataObjectType socialLinks;
    @XmlElement(name = "source_code", required = true)
    protected OrganizationSourceCodeDataObjectType sourceCode;

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
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationOrganizationDataObjectType }
     *     
     */
    public OrganizationOrganizationDataObjectType getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationOrganizationDataObjectType }
     *     
     */
    public void setOrganization(OrganizationOrganizationDataObjectType value) {
        this.organization = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationCustomerDataObjectType }
     *     
     */
    public OrganizationCustomerDataObjectType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationCustomerDataObjectType }
     *     
     */
    public void setCustomer(OrganizationCustomerDataObjectType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the parentCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationParentCustomerDataObjectType }
     *     
     */
    public OrganizationParentCustomerDataObjectType getParentCustomer() {
        return parentCustomer;
    }

    /**
     * Sets the value of the parentCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationParentCustomerDataObjectType }
     *     
     */
    public void setParentCustomer(OrganizationParentCustomerDataObjectType value) {
        this.parentCustomer = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationEmailDataObjectType }
     *     
     */
    public OrganizationEmailDataObjectType getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationEmailDataObjectType }
     *     
     */
    public void setEmail(OrganizationEmailDataObjectType value) {
        this.email = value;
    }

    /**
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationWebsiteDataObjectType }
     *     
     */
    public OrganizationWebsiteDataObjectType getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationWebsiteDataObjectType }
     *     
     */
    public void setWebsite(OrganizationWebsiteDataObjectType value) {
        this.website = value;
    }

    /**
     * Gets the value of the messaging property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationMessagingDataObjectType }
     *     
     */
    public OrganizationMessagingDataObjectType getMessaging() {
        return messaging;
    }

    /**
     * Sets the value of the messaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationMessagingDataObjectType }
     *     
     */
    public void setMessaging(OrganizationMessagingDataObjectType value) {
        this.messaging = value;
    }

    /**
     * Gets the value of the phoneXRef property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationPhoneXRefDataObjectType }
     *     
     */
    public OrganizationPhoneXRefDataObjectType getPhoneXRef() {
        return phoneXRef;
    }

    /**
     * Sets the value of the phoneXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationPhoneXRefDataObjectType }
     *     
     */
    public void setPhoneXRef(OrganizationPhoneXRefDataObjectType value) {
        this.phoneXRef = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationPhoneDataObjectType }
     *     
     */
    public OrganizationPhoneDataObjectType getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationPhoneDataObjectType }
     *     
     */
    public void setPhone(OrganizationPhoneDataObjectType value) {
        this.phone = value;
    }

    /**
     * Gets the value of the phoneCountry property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationPhoneCountryDataObjectType }
     *     
     */
    public OrganizationPhoneCountryDataObjectType getPhoneCountry() {
        return phoneCountry;
    }

    /**
     * Sets the value of the phoneCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationPhoneCountryDataObjectType }
     *     
     */
    public void setPhoneCountry(OrganizationPhoneCountryDataObjectType value) {
        this.phoneCountry = value;
    }

    /**
     * Gets the value of the faxXRef property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationFaxXRefDataObjectType }
     *     
     */
    public OrganizationFaxXRefDataObjectType getFaxXRef() {
        return faxXRef;
    }

    /**
     * Sets the value of the faxXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationFaxXRefDataObjectType }
     *     
     */
    public void setFaxXRef(OrganizationFaxXRefDataObjectType value) {
        this.faxXRef = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationFaxDataObjectType }
     *     
     */
    public OrganizationFaxDataObjectType getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationFaxDataObjectType }
     *     
     */
    public void setFax(OrganizationFaxDataObjectType value) {
        this.fax = value;
    }

    /**
     * Gets the value of the faxCountry property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationFaxCountryDataObjectType }
     *     
     */
    public OrganizationFaxCountryDataObjectType getFaxCountry() {
        return faxCountry;
    }

    /**
     * Sets the value of the faxCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationFaxCountryDataObjectType }
     *     
     */
    public void setFaxCountry(OrganizationFaxCountryDataObjectType value) {
        this.faxCountry = value;
    }

    /**
     * Gets the value of the addressXRef1 property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationAddressXRef1DataObjectType }
     *     
     */
    public OrganizationAddressXRef1DataObjectType getAddressXRef1() {
        return addressXRef1;
    }

    /**
     * Sets the value of the addressXRef1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationAddressXRef1DataObjectType }
     *     
     */
    public void setAddressXRef1(OrganizationAddressXRef1DataObjectType value) {
        this.addressXRef1 = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationAddress1DataObjectType }
     *     
     */
    public OrganizationAddress1DataObjectType getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationAddress1DataObjectType }
     *     
     */
    public void setAddress1(OrganizationAddress1DataObjectType value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the firm property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationFirmDataObjectType }
     *     
     */
    public OrganizationFirmDataObjectType getFirm() {
        return firm;
    }

    /**
     * Sets the value of the firm property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationFirmDataObjectType }
     *     
     */
    public void setFirm(OrganizationFirmDataObjectType value) {
        this.firm = value;
    }

    /**
     * Gets the value of the businessAddressState property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationBusinessAddressStateDataObjectType }
     *     
     */
    public OrganizationBusinessAddressStateDataObjectType getBusinessAddressState() {
        return businessAddressState;
    }

    /**
     * Sets the value of the businessAddressState property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationBusinessAddressStateDataObjectType }
     *     
     */
    public void setBusinessAddressState(OrganizationBusinessAddressStateDataObjectType value) {
        this.businessAddressState = value;
    }

    /**
     * Gets the value of the address1Country property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationAddress1CountryDataObjectType }
     *     
     */
    public OrganizationAddress1CountryDataObjectType getAddress1Country() {
        return address1Country;
    }

    /**
     * Sets the value of the address1Country property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationAddress1CountryDataObjectType }
     *     
     */
    public void setAddress1Country(OrganizationAddress1CountryDataObjectType value) {
        this.address1Country = value;
    }

    /**
     * Gets the value of the billingAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationBillingAddress1DataObjectType }
     *     
     */
    public OrganizationBillingAddress1DataObjectType getBillingAddress1() {
        return billingAddress1;
    }

    /**
     * Sets the value of the billingAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationBillingAddress1DataObjectType }
     *     
     */
    public void setBillingAddress1(OrganizationBillingAddress1DataObjectType value) {
        this.billingAddress1 = value;
    }

    /**
     * Gets the value of the homeAddressState property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationHomeAddressStateDataObjectType }
     *     
     */
    public OrganizationHomeAddressStateDataObjectType getHomeAddressState() {
        return homeAddressState;
    }

    /**
     * Sets the value of the homeAddressState property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationHomeAddressStateDataObjectType }
     *     
     */
    public void setHomeAddressState(OrganizationHomeAddressStateDataObjectType value) {
        this.homeAddressState = value;
    }

    /**
     * Gets the value of the billingAddress1Country property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationBillingAddress1CountryDataObjectType }
     *     
     */
    public OrganizationBillingAddress1CountryDataObjectType getBillingAddress1Country() {
        return billingAddress1Country;
    }

    /**
     * Sets the value of the billingAddress1Country property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationBillingAddress1CountryDataObjectType }
     *     
     */
    public void setBillingAddress1Country(OrganizationBillingAddress1CountryDataObjectType value) {
        this.billingAddress1Country = value;
    }

    /**
     * Gets the value of the billingAddressXRef1 property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationBillingAddressXRef1DataObjectType }
     *     
     */
    public OrganizationBillingAddressXRef1DataObjectType getBillingAddressXRef1() {
        return billingAddressXRef1;
    }

    /**
     * Sets the value of the billingAddressXRef1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationBillingAddressXRef1DataObjectType }
     *     
     */
    public void setBillingAddressXRef1(OrganizationBillingAddressXRef1DataObjectType value) {
        this.billingAddressXRef1 = value;
    }

    /**
     * Gets the value of the customerXCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationCustomerXCustomerDataObjectType }
     *     
     */
    public OrganizationCustomerXCustomerDataObjectType getCustomerXCustomer() {
        return customerXCustomer;
    }

    /**
     * Sets the value of the customerXCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationCustomerXCustomerDataObjectType }
     *     
     */
    public void setCustomerXCustomer(OrganizationCustomerXCustomerDataObjectType value) {
        this.customerXCustomer = value;
    }

    /**
     * Gets the value of the primaryContact property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationPrimaryContactDataObjectType }
     *     
     */
    public OrganizationPrimaryContactDataObjectType getPrimaryContact() {
        return primaryContact;
    }

    /**
     * Sets the value of the primaryContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationPrimaryContactDataObjectType }
     *     
     */
    public void setPrimaryContact(OrganizationPrimaryContactDataObjectType value) {
        this.primaryContact = value;
    }

    /**
     * Gets the value of the addressChangeLog property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationAddressChangeLogDataObjectType }
     *     
     */
    public OrganizationAddressChangeLogDataObjectType getAddressChangeLog() {
        return addressChangeLog;
    }

    /**
     * Sets the value of the addressChangeLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationAddressChangeLogDataObjectType }
     *     
     */
    public void setAddressChangeLog(OrganizationAddressChangeLogDataObjectType value) {
        this.addressChangeLog = value;
    }

    /**
     * Gets the value of the organizationCustomDemographics property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationOrganizationCustomDemographicsDataObjectType }
     *     
     */
    public OrganizationOrganizationCustomDemographicsDataObjectType getOrganizationCustomDemographics() {
        return organizationCustomDemographics;
    }

    /**
     * Sets the value of the organizationCustomDemographics property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationOrganizationCustomDemographicsDataObjectType }
     *     
     */
    public void setOrganizationCustomDemographics(OrganizationOrganizationCustomDemographicsDataObjectType value) {
        this.organizationCustomDemographics = value;
    }

    /**
     * Gets the value of the socialLinks property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationSocialLinksDataObjectType }
     *     
     */
    public OrganizationSocialLinksDataObjectType getSocialLinks() {
        return socialLinks;
    }

    /**
     * Sets the value of the socialLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationSocialLinksDataObjectType }
     *     
     */
    public void setSocialLinks(OrganizationSocialLinksDataObjectType value) {
        this.socialLinks = value;
    }

    /**
     * Gets the value of the sourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationSourceCodeDataObjectType }
     *     
     */
    public OrganizationSourceCodeDataObjectType getSourceCode() {
        return sourceCode;
    }

    /**
     * Sets the value of the sourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationSourceCodeDataObjectType }
     *     
     */
    public void setSourceCode(OrganizationSourceCodeDataObjectType value) {
        this.sourceCode = value;
    }

}
