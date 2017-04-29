
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChapterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChapterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentKey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="Chapter" type="{http://www.avectra.com/2005/}Chapter_Chapter_DataObjectType"/>
 *         &lt;element name="Customer" type="{http://www.avectra.com/2005/}Chapter_Customer_DataObjectType"/>
 *         &lt;element name="Association" type="{http://www.avectra.com/2005/}Chapter_Association_DataObjectType"/>
 *         &lt;element name="Email" type="{http://www.avectra.com/2005/}Chapter_Email_DataObjectType"/>
 *         &lt;element name="Website" type="{http://www.avectra.com/2005/}Chapter_Website_DataObjectType"/>
 *         &lt;element name="Messaging" type="{http://www.avectra.com/2005/}Chapter_Messaging_DataObjectType"/>
 *         &lt;element name="Phone" type="{http://www.avectra.com/2005/}Chapter_Phone_DataObjectType"/>
 *         &lt;element name="Phone_XRef" type="{http://www.avectra.com/2005/}Chapter_Phone_XRef_DataObjectType"/>
 *         &lt;element name="Fax" type="{http://www.avectra.com/2005/}Chapter_Fax_DataObjectType"/>
 *         &lt;element name="Fax_XRef" type="{http://www.avectra.com/2005/}Chapter_Fax_XRef_DataObjectType"/>
 *         &lt;element name="Address_1" type="{http://www.avectra.com/2005/}Chapter_Address_1_DataObjectType"/>
 *         &lt;element name="Address_XRef_1" type="{http://www.avectra.com/2005/}Chapter_Address_XRef_1_DataObjectType"/>
 *         &lt;element name="Address_Country" type="{http://www.avectra.com/2005/}Chapter_Address_Country_DataObjectType"/>
 *         &lt;element name="Billing_Address_1" type="{http://www.avectra.com/2005/}Chapter_Billing_Address_1_DataObjectType"/>
 *         &lt;element name="Billing_Address_XRef_1" type="{http://www.avectra.com/2005/}Chapter_Billing_Address_XRef_1_DataObjectType"/>
 *         &lt;element name="Primary_Contact" type="{http://www.avectra.com/2005/}Chapter_Primary_Contact_DataObjectType"/>
 *         &lt;element name="Primary_Contact_XRef" type="{http://www.avectra.com/2005/}Chapter_Primary_Contact_XRef_DataObjectType"/>
 *         &lt;element name="Prim._Contact_Adr_Xref" type="{http://www.avectra.com/2005/}Chapter_Prim._Contact_Adr_Xref_DataObjectType"/>
 *         &lt;element name="Prim._Contact_Address" type="{http://www.avectra.com/2005/}Chapter_Prim._Contact_Address_DataObjectType"/>
 *         &lt;element name="Address_Change_Log" type="{http://www.avectra.com/2005/}Chapter_Address_Change_Log_DataObjectType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChapterType", propOrder = {
    "currentKey",
    "chapter",
    "customer",
    "association",
    "email",
    "website",
    "messaging",
    "phone",
    "phoneXRef",
    "fax",
    "faxXRef",
    "address1",
    "addressXRef1",
    "addressCountry",
    "billingAddress1",
    "billingAddressXRef1",
    "primaryContact",
    "primaryContactXRef",
    "primContactAdrXref",
    "primContactAddress",
    "addressChangeLog"
})
public class ChapterType {

    @XmlElementRef(name = "CurrentKey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> currentKey;
    @XmlElement(name = "Chapter", required = true)
    protected ChapterChapterDataObjectType chapter;
    @XmlElement(name = "Customer", required = true)
    protected ChapterCustomerDataObjectType customer;
    @XmlElement(name = "Association", required = true)
    protected ChapterAssociationDataObjectType association;
    @XmlElement(name = "Email", required = true)
    protected ChapterEmailDataObjectType email;
    @XmlElement(name = "Website", required = true)
    protected ChapterWebsiteDataObjectType website;
    @XmlElement(name = "Messaging", required = true)
    protected ChapterMessagingDataObjectType messaging;
    @XmlElement(name = "Phone", required = true)
    protected ChapterPhoneDataObjectType phone;
    @XmlElement(name = "Phone_XRef", required = true)
    protected ChapterPhoneXRefDataObjectType phoneXRef;
    @XmlElement(name = "Fax", required = true)
    protected ChapterFaxDataObjectType fax;
    @XmlElement(name = "Fax_XRef", required = true)
    protected ChapterFaxXRefDataObjectType faxXRef;
    @XmlElement(name = "Address_1", required = true)
    protected ChapterAddress1DataObjectType address1;
    @XmlElement(name = "Address_XRef_1", required = true)
    protected ChapterAddressXRef1DataObjectType addressXRef1;
    @XmlElement(name = "Address_Country", required = true)
    protected ChapterAddressCountryDataObjectType addressCountry;
    @XmlElement(name = "Billing_Address_1", required = true)
    protected ChapterBillingAddress1DataObjectType billingAddress1;
    @XmlElement(name = "Billing_Address_XRef_1", required = true)
    protected ChapterBillingAddressXRef1DataObjectType billingAddressXRef1;
    @XmlElement(name = "Primary_Contact", required = true)
    protected ChapterPrimaryContactDataObjectType primaryContact;
    @XmlElement(name = "Primary_Contact_XRef", required = true)
    protected ChapterPrimaryContactXRefDataObjectType primaryContactXRef;
    @XmlElement(name = "Prim._Contact_Adr_Xref", required = true)
    protected ChapterPrimContactAdrXrefDataObjectType primContactAdrXref;
    @XmlElement(name = "Prim._Contact_Address", required = true)
    protected ChapterPrimContactAddressDataObjectType primContactAddress;
    @XmlElement(name = "Address_Change_Log", required = true)
    protected ChapterAddressChangeLogDataObjectType addressChangeLog;

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
     * Gets the value of the chapter property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterChapterDataObjectType }
     *     
     */
    public ChapterChapterDataObjectType getChapter() {
        return chapter;
    }

    /**
     * Sets the value of the chapter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterChapterDataObjectType }
     *     
     */
    public void setChapter(ChapterChapterDataObjectType value) {
        this.chapter = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterCustomerDataObjectType }
     *     
     */
    public ChapterCustomerDataObjectType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterCustomerDataObjectType }
     *     
     */
    public void setCustomer(ChapterCustomerDataObjectType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the association property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterAssociationDataObjectType }
     *     
     */
    public ChapterAssociationDataObjectType getAssociation() {
        return association;
    }

    /**
     * Sets the value of the association property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterAssociationDataObjectType }
     *     
     */
    public void setAssociation(ChapterAssociationDataObjectType value) {
        this.association = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterEmailDataObjectType }
     *     
     */
    public ChapterEmailDataObjectType getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterEmailDataObjectType }
     *     
     */
    public void setEmail(ChapterEmailDataObjectType value) {
        this.email = value;
    }

    /**
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterWebsiteDataObjectType }
     *     
     */
    public ChapterWebsiteDataObjectType getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterWebsiteDataObjectType }
     *     
     */
    public void setWebsite(ChapterWebsiteDataObjectType value) {
        this.website = value;
    }

    /**
     * Gets the value of the messaging property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterMessagingDataObjectType }
     *     
     */
    public ChapterMessagingDataObjectType getMessaging() {
        return messaging;
    }

    /**
     * Sets the value of the messaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterMessagingDataObjectType }
     *     
     */
    public void setMessaging(ChapterMessagingDataObjectType value) {
        this.messaging = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterPhoneDataObjectType }
     *     
     */
    public ChapterPhoneDataObjectType getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterPhoneDataObjectType }
     *     
     */
    public void setPhone(ChapterPhoneDataObjectType value) {
        this.phone = value;
    }

    /**
     * Gets the value of the phoneXRef property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterPhoneXRefDataObjectType }
     *     
     */
    public ChapterPhoneXRefDataObjectType getPhoneXRef() {
        return phoneXRef;
    }

    /**
     * Sets the value of the phoneXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterPhoneXRefDataObjectType }
     *     
     */
    public void setPhoneXRef(ChapterPhoneXRefDataObjectType value) {
        this.phoneXRef = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterFaxDataObjectType }
     *     
     */
    public ChapterFaxDataObjectType getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterFaxDataObjectType }
     *     
     */
    public void setFax(ChapterFaxDataObjectType value) {
        this.fax = value;
    }

    /**
     * Gets the value of the faxXRef property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterFaxXRefDataObjectType }
     *     
     */
    public ChapterFaxXRefDataObjectType getFaxXRef() {
        return faxXRef;
    }

    /**
     * Sets the value of the faxXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterFaxXRefDataObjectType }
     *     
     */
    public void setFaxXRef(ChapterFaxXRefDataObjectType value) {
        this.faxXRef = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterAddress1DataObjectType }
     *     
     */
    public ChapterAddress1DataObjectType getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterAddress1DataObjectType }
     *     
     */
    public void setAddress1(ChapterAddress1DataObjectType value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the addressXRef1 property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterAddressXRef1DataObjectType }
     *     
     */
    public ChapterAddressXRef1DataObjectType getAddressXRef1() {
        return addressXRef1;
    }

    /**
     * Sets the value of the addressXRef1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterAddressXRef1DataObjectType }
     *     
     */
    public void setAddressXRef1(ChapterAddressXRef1DataObjectType value) {
        this.addressXRef1 = value;
    }

    /**
     * Gets the value of the addressCountry property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterAddressCountryDataObjectType }
     *     
     */
    public ChapterAddressCountryDataObjectType getAddressCountry() {
        return addressCountry;
    }

    /**
     * Sets the value of the addressCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterAddressCountryDataObjectType }
     *     
     */
    public void setAddressCountry(ChapterAddressCountryDataObjectType value) {
        this.addressCountry = value;
    }

    /**
     * Gets the value of the billingAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterBillingAddress1DataObjectType }
     *     
     */
    public ChapterBillingAddress1DataObjectType getBillingAddress1() {
        return billingAddress1;
    }

    /**
     * Sets the value of the billingAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterBillingAddress1DataObjectType }
     *     
     */
    public void setBillingAddress1(ChapterBillingAddress1DataObjectType value) {
        this.billingAddress1 = value;
    }

    /**
     * Gets the value of the billingAddressXRef1 property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterBillingAddressXRef1DataObjectType }
     *     
     */
    public ChapterBillingAddressXRef1DataObjectType getBillingAddressXRef1() {
        return billingAddressXRef1;
    }

    /**
     * Sets the value of the billingAddressXRef1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterBillingAddressXRef1DataObjectType }
     *     
     */
    public void setBillingAddressXRef1(ChapterBillingAddressXRef1DataObjectType value) {
        this.billingAddressXRef1 = value;
    }

    /**
     * Gets the value of the primaryContact property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterPrimaryContactDataObjectType }
     *     
     */
    public ChapterPrimaryContactDataObjectType getPrimaryContact() {
        return primaryContact;
    }

    /**
     * Sets the value of the primaryContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterPrimaryContactDataObjectType }
     *     
     */
    public void setPrimaryContact(ChapterPrimaryContactDataObjectType value) {
        this.primaryContact = value;
    }

    /**
     * Gets the value of the primaryContactXRef property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterPrimaryContactXRefDataObjectType }
     *     
     */
    public ChapterPrimaryContactXRefDataObjectType getPrimaryContactXRef() {
        return primaryContactXRef;
    }

    /**
     * Sets the value of the primaryContactXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterPrimaryContactXRefDataObjectType }
     *     
     */
    public void setPrimaryContactXRef(ChapterPrimaryContactXRefDataObjectType value) {
        this.primaryContactXRef = value;
    }

    /**
     * Gets the value of the primContactAdrXref property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterPrimContactAdrXrefDataObjectType }
     *     
     */
    public ChapterPrimContactAdrXrefDataObjectType getPrimContactAdrXref() {
        return primContactAdrXref;
    }

    /**
     * Sets the value of the primContactAdrXref property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterPrimContactAdrXrefDataObjectType }
     *     
     */
    public void setPrimContactAdrXref(ChapterPrimContactAdrXrefDataObjectType value) {
        this.primContactAdrXref = value;
    }

    /**
     * Gets the value of the primContactAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterPrimContactAddressDataObjectType }
     *     
     */
    public ChapterPrimContactAddressDataObjectType getPrimContactAddress() {
        return primContactAddress;
    }

    /**
     * Sets the value of the primContactAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterPrimContactAddressDataObjectType }
     *     
     */
    public void setPrimContactAddress(ChapterPrimContactAddressDataObjectType value) {
        this.primContactAddress = value;
    }

    /**
     * Gets the value of the addressChangeLog property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterAddressChangeLogDataObjectType }
     *     
     */
    public ChapterAddressChangeLogDataObjectType getAddressChangeLog() {
        return addressChangeLog;
    }

    /**
     * Sets the value of the addressChangeLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterAddressChangeLogDataObjectType }
     *     
     */
    public void setAddressChangeLog(ChapterAddressChangeLogDataObjectType value) {
        this.addressChangeLog = value;
    }

}
