
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrantGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrantGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentKey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="Group_Registration" type="{http://www.avectra.com/2005/}EventsRegistrantGroup_Group_Registration_DataObjectType"/>
 *         &lt;element name="Organization" type="{http://www.avectra.com/2005/}EventsRegistrantGroup_Organization_DataObjectType"/>
 *         &lt;element name="Customer" type="{http://www.avectra.com/2005/}EventsRegistrantGroup_Customer_DataObjectType"/>
 *         &lt;element name="Individual_X_Organization" type="{http://www.avectra.com/2005/}EventsRegistrantGroup_Individual_X_Organization_DataObjectType"/>
 *         &lt;element name="Individual" type="{http://www.avectra.com/2005/}EventsRegistrantGroup_Individual_DataObjectType"/>
 *         &lt;element name="Address" type="{http://www.avectra.com/2005/}EventsRegistrantGroup_Address_DataObjectType"/>
 *         &lt;element name="Address_XRef" type="{http://www.avectra.com/2005/}EventsRegistrantGroup_Address_XRef_DataObjectType"/>
 *         &lt;element name="Email" type="{http://www.avectra.com/2005/}EventsRegistrantGroup_Email_DataObjectType"/>
 *         &lt;element name="Website" type="{http://www.avectra.com/2005/}EventsRegistrantGroup_Website_DataObjectType"/>
 *         &lt;element name="Messaging" type="{http://www.avectra.com/2005/}EventsRegistrantGroup_Messaging_DataObjectType"/>
 *         &lt;element name="Phone" type="{http://www.avectra.com/2005/}EventsRegistrantGroup_Phone_DataObjectType"/>
 *         &lt;element name="Phone_XRef" type="{http://www.avectra.com/2005/}EventsRegistrantGroup_Phone_XRef_DataObjectType"/>
 *         &lt;element name="Fax" type="{http://www.avectra.com/2005/}EventsRegistrantGroup_Fax_DataObjectType"/>
 *         &lt;element name="Fax_XRef" type="{http://www.avectra.com/2005/}EventsRegistrantGroup_Fax_XRef_DataObjectType"/>
 *         &lt;element name="Event" type="{http://www.avectra.com/2005/}EventsRegistrantGroup_Event_DataObjectType"/>
 *         &lt;element name="Event_Location_Room_Type" type="{http://www.avectra.com/2005/}EventsRegistrantGroup_Event_Location_Room_Type_DataObjectType"/>
 *         &lt;element name="Room_Request" type="{http://www.avectra.com/2005/}EventsRegistrantGroup_Room_Request_DataObjectType"/>
 *         &lt;element name="Invoice" type="{http://www.avectra.com/2005/}EventsRegistrantGroup_Invoice_DataObjectType"/>
 *         &lt;element name="Payment" type="{http://www.avectra.com/2005/}EventsRegistrantGroup_Payment_DataObjectType"/>
 *         &lt;element name="Payment_Info" type="{http://www.avectra.com/2005/}EventsRegistrantGroup_Payment_Info_DataObjectType"/>
 *         &lt;element name="Payment_Method" type="{http://www.avectra.com/2005/}EventsRegistrantGroup_Payment_Method_DataObjectType"/>
 *         &lt;element name="source_code" type="{http://www.avectra.com/2005/}EventsRegistrantGroup_source_code_DataObjectType"/>
 *         &lt;element name="Registrant" type="{http://www.avectra.com/2005/}EventsRegistrantGroup_Registrant_DataObjectType"/>
 *         &lt;element name="RegistrantCollection" type="{http://www.avectra.com/2005/}RegistrantCollectionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrantGroupType", propOrder = {
    "currentKey",
    "groupRegistration",
    "organization",
    "customer",
    "individualXOrganization",
    "individual",
    "address",
    "addressXRef",
    "email",
    "website",
    "messaging",
    "phone",
    "phoneXRef",
    "fax",
    "faxXRef",
    "event",
    "eventLocationRoomType",
    "roomRequest",
    "invoice",
    "payment",
    "paymentInfo",
    "paymentMethod",
    "sourceCode",
    "registrant",
    "registrantCollection"
})
public class EventsRegistrantGroupType {

    @XmlElementRef(name = "CurrentKey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> currentKey;
    @XmlElement(name = "Group_Registration", required = true)
    protected EventsRegistrantGroupGroupRegistrationDataObjectType groupRegistration;
    @XmlElement(name = "Organization", required = true)
    protected EventsRegistrantGroupOrganizationDataObjectType organization;
    @XmlElement(name = "Customer", required = true)
    protected EventsRegistrantGroupCustomerDataObjectType customer;
    @XmlElement(name = "Individual_X_Organization", required = true)
    protected EventsRegistrantGroupIndividualXOrganizationDataObjectType individualXOrganization;
    @XmlElement(name = "Individual", required = true)
    protected EventsRegistrantGroupIndividualDataObjectType individual;
    @XmlElement(name = "Address", required = true)
    protected EventsRegistrantGroupAddressDataObjectType address;
    @XmlElement(name = "Address_XRef", required = true)
    protected EventsRegistrantGroupAddressXRefDataObjectType addressXRef;
    @XmlElement(name = "Email", required = true)
    protected EventsRegistrantGroupEmailDataObjectType email;
    @XmlElement(name = "Website", required = true)
    protected EventsRegistrantGroupWebsiteDataObjectType website;
    @XmlElement(name = "Messaging", required = true)
    protected EventsRegistrantGroupMessagingDataObjectType messaging;
    @XmlElement(name = "Phone", required = true)
    protected EventsRegistrantGroupPhoneDataObjectType phone;
    @XmlElement(name = "Phone_XRef", required = true)
    protected EventsRegistrantGroupPhoneXRefDataObjectType phoneXRef;
    @XmlElement(name = "Fax", required = true)
    protected EventsRegistrantGroupFaxDataObjectType fax;
    @XmlElement(name = "Fax_XRef", required = true)
    protected EventsRegistrantGroupFaxXRefDataObjectType faxXRef;
    @XmlElement(name = "Event", required = true)
    protected EventsRegistrantGroupEventDataObjectType event;
    @XmlElement(name = "Event_Location_Room_Type", required = true)
    protected EventsRegistrantGroupEventLocationRoomTypeDataObjectType eventLocationRoomType;
    @XmlElement(name = "Room_Request", required = true)
    protected EventsRegistrantGroupRoomRequestDataObjectType roomRequest;
    @XmlElement(name = "Invoice", required = true)
    protected EventsRegistrantGroupInvoiceDataObjectType invoice;
    @XmlElement(name = "Payment", required = true)
    protected EventsRegistrantGroupPaymentDataObjectType payment;
    @XmlElement(name = "Payment_Info", required = true)
    protected EventsRegistrantGroupPaymentInfoDataObjectType paymentInfo;
    @XmlElement(name = "Payment_Method", required = true)
    protected EventsRegistrantGroupPaymentMethodDataObjectType paymentMethod;
    @XmlElement(name = "source_code", required = true)
    protected EventsRegistrantGroupSourceCodeDataObjectType sourceCode;
    @XmlElement(name = "Registrant", required = true)
    protected EventsRegistrantGroupRegistrantDataObjectType registrant;
    @XmlElement(name = "RegistrantCollection", required = true)
    protected RegistrantCollectionType registrantCollection;

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
     * Gets the value of the groupRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupGroupRegistrationDataObjectType }
     *     
     */
    public EventsRegistrantGroupGroupRegistrationDataObjectType getGroupRegistration() {
        return groupRegistration;
    }

    /**
     * Sets the value of the groupRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupGroupRegistrationDataObjectType }
     *     
     */
    public void setGroupRegistration(EventsRegistrantGroupGroupRegistrationDataObjectType value) {
        this.groupRegistration = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupOrganizationDataObjectType }
     *     
     */
    public EventsRegistrantGroupOrganizationDataObjectType getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupOrganizationDataObjectType }
     *     
     */
    public void setOrganization(EventsRegistrantGroupOrganizationDataObjectType value) {
        this.organization = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupCustomerDataObjectType }
     *     
     */
    public EventsRegistrantGroupCustomerDataObjectType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupCustomerDataObjectType }
     *     
     */
    public void setCustomer(EventsRegistrantGroupCustomerDataObjectType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the individualXOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupIndividualXOrganizationDataObjectType }
     *     
     */
    public EventsRegistrantGroupIndividualXOrganizationDataObjectType getIndividualXOrganization() {
        return individualXOrganization;
    }

    /**
     * Sets the value of the individualXOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupIndividualXOrganizationDataObjectType }
     *     
     */
    public void setIndividualXOrganization(EventsRegistrantGroupIndividualXOrganizationDataObjectType value) {
        this.individualXOrganization = value;
    }

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupIndividualDataObjectType }
     *     
     */
    public EventsRegistrantGroupIndividualDataObjectType getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupIndividualDataObjectType }
     *     
     */
    public void setIndividual(EventsRegistrantGroupIndividualDataObjectType value) {
        this.individual = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupAddressDataObjectType }
     *     
     */
    public EventsRegistrantGroupAddressDataObjectType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupAddressDataObjectType }
     *     
     */
    public void setAddress(EventsRegistrantGroupAddressDataObjectType value) {
        this.address = value;
    }

    /**
     * Gets the value of the addressXRef property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupAddressXRefDataObjectType }
     *     
     */
    public EventsRegistrantGroupAddressXRefDataObjectType getAddressXRef() {
        return addressXRef;
    }

    /**
     * Sets the value of the addressXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupAddressXRefDataObjectType }
     *     
     */
    public void setAddressXRef(EventsRegistrantGroupAddressXRefDataObjectType value) {
        this.addressXRef = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupEmailDataObjectType }
     *     
     */
    public EventsRegistrantGroupEmailDataObjectType getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupEmailDataObjectType }
     *     
     */
    public void setEmail(EventsRegistrantGroupEmailDataObjectType value) {
        this.email = value;
    }

    /**
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupWebsiteDataObjectType }
     *     
     */
    public EventsRegistrantGroupWebsiteDataObjectType getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupWebsiteDataObjectType }
     *     
     */
    public void setWebsite(EventsRegistrantGroupWebsiteDataObjectType value) {
        this.website = value;
    }

    /**
     * Gets the value of the messaging property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupMessagingDataObjectType }
     *     
     */
    public EventsRegistrantGroupMessagingDataObjectType getMessaging() {
        return messaging;
    }

    /**
     * Sets the value of the messaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupMessagingDataObjectType }
     *     
     */
    public void setMessaging(EventsRegistrantGroupMessagingDataObjectType value) {
        this.messaging = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupPhoneDataObjectType }
     *     
     */
    public EventsRegistrantGroupPhoneDataObjectType getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupPhoneDataObjectType }
     *     
     */
    public void setPhone(EventsRegistrantGroupPhoneDataObjectType value) {
        this.phone = value;
    }

    /**
     * Gets the value of the phoneXRef property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupPhoneXRefDataObjectType }
     *     
     */
    public EventsRegistrantGroupPhoneXRefDataObjectType getPhoneXRef() {
        return phoneXRef;
    }

    /**
     * Sets the value of the phoneXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupPhoneXRefDataObjectType }
     *     
     */
    public void setPhoneXRef(EventsRegistrantGroupPhoneXRefDataObjectType value) {
        this.phoneXRef = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupFaxDataObjectType }
     *     
     */
    public EventsRegistrantGroupFaxDataObjectType getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupFaxDataObjectType }
     *     
     */
    public void setFax(EventsRegistrantGroupFaxDataObjectType value) {
        this.fax = value;
    }

    /**
     * Gets the value of the faxXRef property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupFaxXRefDataObjectType }
     *     
     */
    public EventsRegistrantGroupFaxXRefDataObjectType getFaxXRef() {
        return faxXRef;
    }

    /**
     * Sets the value of the faxXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupFaxXRefDataObjectType }
     *     
     */
    public void setFaxXRef(EventsRegistrantGroupFaxXRefDataObjectType value) {
        this.faxXRef = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupEventDataObjectType }
     *     
     */
    public EventsRegistrantGroupEventDataObjectType getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupEventDataObjectType }
     *     
     */
    public void setEvent(EventsRegistrantGroupEventDataObjectType value) {
        this.event = value;
    }

    /**
     * Gets the value of the eventLocationRoomType property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupEventLocationRoomTypeDataObjectType }
     *     
     */
    public EventsRegistrantGroupEventLocationRoomTypeDataObjectType getEventLocationRoomType() {
        return eventLocationRoomType;
    }

    /**
     * Sets the value of the eventLocationRoomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupEventLocationRoomTypeDataObjectType }
     *     
     */
    public void setEventLocationRoomType(EventsRegistrantGroupEventLocationRoomTypeDataObjectType value) {
        this.eventLocationRoomType = value;
    }

    /**
     * Gets the value of the roomRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupRoomRequestDataObjectType }
     *     
     */
    public EventsRegistrantGroupRoomRequestDataObjectType getRoomRequest() {
        return roomRequest;
    }

    /**
     * Sets the value of the roomRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupRoomRequestDataObjectType }
     *     
     */
    public void setRoomRequest(EventsRegistrantGroupRoomRequestDataObjectType value) {
        this.roomRequest = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupInvoiceDataObjectType }
     *     
     */
    public EventsRegistrantGroupInvoiceDataObjectType getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupInvoiceDataObjectType }
     *     
     */
    public void setInvoice(EventsRegistrantGroupInvoiceDataObjectType value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupPaymentDataObjectType }
     *     
     */
    public EventsRegistrantGroupPaymentDataObjectType getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupPaymentDataObjectType }
     *     
     */
    public void setPayment(EventsRegistrantGroupPaymentDataObjectType value) {
        this.payment = value;
    }

    /**
     * Gets the value of the paymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupPaymentInfoDataObjectType }
     *     
     */
    public EventsRegistrantGroupPaymentInfoDataObjectType getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * Sets the value of the paymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupPaymentInfoDataObjectType }
     *     
     */
    public void setPaymentInfo(EventsRegistrantGroupPaymentInfoDataObjectType value) {
        this.paymentInfo = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupPaymentMethodDataObjectType }
     *     
     */
    public EventsRegistrantGroupPaymentMethodDataObjectType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupPaymentMethodDataObjectType }
     *     
     */
    public void setPaymentMethod(EventsRegistrantGroupPaymentMethodDataObjectType value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the sourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupSourceCodeDataObjectType }
     *     
     */
    public EventsRegistrantGroupSourceCodeDataObjectType getSourceCode() {
        return sourceCode;
    }

    /**
     * Sets the value of the sourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupSourceCodeDataObjectType }
     *     
     */
    public void setSourceCode(EventsRegistrantGroupSourceCodeDataObjectType value) {
        this.sourceCode = value;
    }

    /**
     * Gets the value of the registrant property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGroupRegistrantDataObjectType }
     *     
     */
    public EventsRegistrantGroupRegistrantDataObjectType getRegistrant() {
        return registrant;
    }

    /**
     * Sets the value of the registrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGroupRegistrantDataObjectType }
     *     
     */
    public void setRegistrant(EventsRegistrantGroupRegistrantDataObjectType value) {
        this.registrant = value;
    }

    /**
     * Gets the value of the registrantCollection property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrantCollectionType }
     *     
     */
    public RegistrantCollectionType getRegistrantCollection() {
        return registrantCollection;
    }

    /**
     * Sets the value of the registrantCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrantCollectionType }
     *     
     */
    public void setRegistrantCollection(RegistrantCollectionType value) {
        this.registrantCollection = value;
    }

}
