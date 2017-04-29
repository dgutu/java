
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrantType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentKey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="Registrant" type="{http://www.avectra.com/2005/}EventsRegistrant_Registrant_DataObjectType"/>
 *         &lt;element name="Individual" type="{http://www.avectra.com/2005/}EventsRegistrant_Individual_DataObjectType"/>
 *         &lt;element name="Customer" type="{http://www.avectra.com/2005/}EventsRegistrant_Customer_DataObjectType"/>
 *         &lt;element name="Individual_X_Organization" type="{http://www.avectra.com/2005/}EventsRegistrant_Individual_X_Organization_DataObjectType"/>
 *         &lt;element name="Organization" type="{http://www.avectra.com/2005/}EventsRegistrant_Organization_DataObjectType"/>
 *         &lt;element name="Address_XRef" type="{http://www.avectra.com/2005/}EventsRegistrant_Address_XRef_DataObjectType"/>
 *         &lt;element name="Address" type="{http://www.avectra.com/2005/}EventsRegistrant_Address_DataObjectType"/>
 *         &lt;element name="Email" type="{http://www.avectra.com/2005/}EventsRegistrant_Email_DataObjectType"/>
 *         &lt;element name="Website" type="{http://www.avectra.com/2005/}EventsRegistrant_Website_DataObjectType"/>
 *         &lt;element name="Messaging" type="{http://www.avectra.com/2005/}EventsRegistrant_Messaging_DataObjectType"/>
 *         &lt;element name="Phone_XRef" type="{http://www.avectra.com/2005/}EventsRegistrant_Phone_XRef_DataObjectType"/>
 *         &lt;element name="Phone" type="{http://www.avectra.com/2005/}EventsRegistrant_Phone_DataObjectType"/>
 *         &lt;element name="Fax_XRef" type="{http://www.avectra.com/2005/}EventsRegistrant_Fax_XRef_DataObjectType"/>
 *         &lt;element name="Fax" type="{http://www.avectra.com/2005/}EventsRegistrant_Fax_DataObjectType"/>
 *         &lt;element name="Event" type="{http://www.avectra.com/2005/}EventsRegistrant_Event_DataObjectType"/>
 *         &lt;element name="Event_Location" type="{http://www.avectra.com/2005/}EventsRegistrant_Event_Location_DataObjectType"/>
 *         &lt;element name="Location" type="{http://www.avectra.com/2005/}EventsRegistrant_Location_DataObjectType"/>
 *         &lt;element name="Location_Customer_Address" type="{http://www.avectra.com/2005/}EventsRegistrant_Location_Customer_Address_DataObjectType"/>
 *         &lt;element name="Location_Address" type="{http://www.avectra.com/2005/}EventsRegistrant_Location_Address_DataObjectType"/>
 *         &lt;element name="Event_Location_Room_Type" type="{http://www.avectra.com/2005/}EventsRegistrant_Event_Location_Room_Type_DataObjectType"/>
 *         &lt;element name="Room_Request" type="{http://www.avectra.com/2005/}EventsRegistrant_Room_Request_DataObjectType"/>
 *         &lt;element name="Registrant_Housing" type="{http://www.avectra.com/2005/}EventsRegistrant_Registrant_Housing_DataObjectType"/>
 *         &lt;element name="RegistrantGuest" type="{http://www.avectra.com/2005/}EventsRegistrant_RegistrantGuest_DataObjectType"/>
 *         &lt;element name="Invoice" type="{http://www.avectra.com/2005/}EventsRegistrant_Invoice_DataObjectType"/>
 *         &lt;element name="Payment" type="{http://www.avectra.com/2005/}EventsRegistrant_Payment_DataObjectType"/>
 *         &lt;element name="Payment_Info" type="{http://www.avectra.com/2005/}EventsRegistrant_Payment_Info_DataObjectType"/>
 *         &lt;element name="Payment_Method" type="{http://www.avectra.com/2005/}EventsRegistrant_Payment_Method_DataObjectType"/>
 *         &lt;element name="Product" type="{http://www.avectra.com/2005/}EventsRegistrant_Product_DataObjectType"/>
 *         &lt;element name="Price" type="{http://www.avectra.com/2005/}EventsRegistrant_Price_DataObjectType"/>
 *         &lt;element name="Registrant_Type" type="{http://www.avectra.com/2005/}EventsRegistrant_Registrant_Type_DataObjectType"/>
 *         &lt;element name="Registrant_Custom_Demographics" type="{http://www.avectra.com/2005/}EventsRegistrant_Registrant_Custom_Demographics_DataObjectType"/>
 *         &lt;element name="Gift" type="{http://www.avectra.com/2005/}EventsRegistrant_Gift_DataObjectType"/>
 *         &lt;element name="source_code" type="{http://www.avectra.com/2005/}EventsRegistrant_source_code_DataObjectType"/>
 *         &lt;element name="Registrant_Session" type="{http://www.avectra.com/2005/}EventsRegistrant_Registrant_Session_DataObjectType"/>
 *         &lt;element name="Registrant_SessionCollection" type="{http://www.avectra.com/2005/}Registrant_SessionCollectionType"/>
 *         &lt;element name="Invoice_DetailCollection" type="{http://www.avectra.com/2005/}Invoice_DetailCollectionType"/>
 *         &lt;element name="Additional_Invoice_DetailCollection" type="{http://www.avectra.com/2005/}Additional_Invoice_DetailCollectionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrantType", propOrder = {
    "currentKey",
    "registrant",
    "individual",
    "customer",
    "individualXOrganization",
    "organization",
    "addressXRef",
    "address",
    "email",
    "website",
    "messaging",
    "phoneXRef",
    "phone",
    "faxXRef",
    "fax",
    "event",
    "eventLocation",
    "location",
    "locationCustomerAddress",
    "locationAddress",
    "eventLocationRoomType",
    "roomRequest",
    "registrantHousing",
    "registrantGuest",
    "invoice",
    "payment",
    "paymentInfo",
    "paymentMethod",
    "product",
    "price",
    "registrantType",
    "registrantCustomDemographics",
    "gift",
    "sourceCode",
    "registrantSession",
    "registrantSessionCollection",
    "invoiceDetailCollection",
    "additionalInvoiceDetailCollection"
})
public class EventsRegistrantType {

    @XmlElementRef(name = "CurrentKey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> currentKey;
    @XmlElement(name = "Registrant", required = true)
    protected EventsRegistrantRegistrantDataObjectType registrant;
    @XmlElement(name = "Individual", required = true)
    protected EventsRegistrantIndividualDataObjectType individual;
    @XmlElement(name = "Customer", required = true)
    protected EventsRegistrantCustomerDataObjectType customer;
    @XmlElement(name = "Individual_X_Organization", required = true)
    protected EventsRegistrantIndividualXOrganizationDataObjectType individualXOrganization;
    @XmlElement(name = "Organization", required = true)
    protected EventsRegistrantOrganizationDataObjectType organization;
    @XmlElement(name = "Address_XRef", required = true)
    protected EventsRegistrantAddressXRefDataObjectType addressXRef;
    @XmlElement(name = "Address", required = true)
    protected EventsRegistrantAddressDataObjectType address;
    @XmlElement(name = "Email", required = true)
    protected EventsRegistrantEmailDataObjectType email;
    @XmlElement(name = "Website", required = true)
    protected EventsRegistrantWebsiteDataObjectType website;
    @XmlElement(name = "Messaging", required = true)
    protected EventsRegistrantMessagingDataObjectType messaging;
    @XmlElement(name = "Phone_XRef", required = true)
    protected EventsRegistrantPhoneXRefDataObjectType phoneXRef;
    @XmlElement(name = "Phone", required = true)
    protected EventsRegistrantPhoneDataObjectType phone;
    @XmlElement(name = "Fax_XRef", required = true)
    protected EventsRegistrantFaxXRefDataObjectType faxXRef;
    @XmlElement(name = "Fax", required = true)
    protected EventsRegistrantFaxDataObjectType fax;
    @XmlElement(name = "Event", required = true)
    protected EventsRegistrantEventDataObjectType event;
    @XmlElement(name = "Event_Location", required = true)
    protected EventsRegistrantEventLocationDataObjectType eventLocation;
    @XmlElement(name = "Location", required = true)
    protected EventsRegistrantLocationDataObjectType location;
    @XmlElement(name = "Location_Customer_Address", required = true)
    protected EventsRegistrantLocationCustomerAddressDataObjectType locationCustomerAddress;
    @XmlElement(name = "Location_Address", required = true)
    protected EventsRegistrantLocationAddressDataObjectType locationAddress;
    @XmlElement(name = "Event_Location_Room_Type", required = true)
    protected EventsRegistrantEventLocationRoomTypeDataObjectType eventLocationRoomType;
    @XmlElement(name = "Room_Request", required = true)
    protected EventsRegistrantRoomRequestDataObjectType roomRequest;
    @XmlElement(name = "Registrant_Housing", required = true)
    protected EventsRegistrantRegistrantHousingDataObjectType registrantHousing;
    @XmlElement(name = "RegistrantGuest", required = true)
    protected EventsRegistrantRegistrantGuestDataObjectType registrantGuest;
    @XmlElement(name = "Invoice", required = true)
    protected EventsRegistrantInvoiceDataObjectType invoice;
    @XmlElement(name = "Payment", required = true)
    protected EventsRegistrantPaymentDataObjectType payment;
    @XmlElement(name = "Payment_Info", required = true)
    protected EventsRegistrantPaymentInfoDataObjectType paymentInfo;
    @XmlElement(name = "Payment_Method", required = true)
    protected EventsRegistrantPaymentMethodDataObjectType paymentMethod;
    @XmlElement(name = "Product", required = true)
    protected EventsRegistrantProductDataObjectType product;
    @XmlElement(name = "Price", required = true)
    protected EventsRegistrantPriceDataObjectType price;
    @XmlElement(name = "Registrant_Type", required = true)
    protected EventsRegistrantRegistrantTypeDataObjectType registrantType;
    @XmlElement(name = "Registrant_Custom_Demographics", required = true)
    protected EventsRegistrantRegistrantCustomDemographicsDataObjectType registrantCustomDemographics;
    @XmlElement(name = "Gift", required = true)
    protected EventsRegistrantGiftDataObjectType gift;
    @XmlElement(name = "source_code", required = true)
    protected EventsRegistrantSourceCodeDataObjectType sourceCode;
    @XmlElement(name = "Registrant_Session", required = true)
    protected EventsRegistrantRegistrantSessionDataObjectType registrantSession;
    @XmlElement(name = "Registrant_SessionCollection", required = true)
    protected RegistrantSessionCollectionType registrantSessionCollection;
    @XmlElement(name = "Invoice_DetailCollection", required = true)
    protected InvoiceDetailCollectionType invoiceDetailCollection;
    @XmlElement(name = "Additional_Invoice_DetailCollection", required = true)
    protected AdditionalInvoiceDetailCollectionType additionalInvoiceDetailCollection;

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
     * Gets the value of the registrant property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantRegistrantDataObjectType }
     *     
     */
    public EventsRegistrantRegistrantDataObjectType getRegistrant() {
        return registrant;
    }

    /**
     * Sets the value of the registrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantRegistrantDataObjectType }
     *     
     */
    public void setRegistrant(EventsRegistrantRegistrantDataObjectType value) {
        this.registrant = value;
    }

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantIndividualDataObjectType }
     *     
     */
    public EventsRegistrantIndividualDataObjectType getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantIndividualDataObjectType }
     *     
     */
    public void setIndividual(EventsRegistrantIndividualDataObjectType value) {
        this.individual = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantCustomerDataObjectType }
     *     
     */
    public EventsRegistrantCustomerDataObjectType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantCustomerDataObjectType }
     *     
     */
    public void setCustomer(EventsRegistrantCustomerDataObjectType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the individualXOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantIndividualXOrganizationDataObjectType }
     *     
     */
    public EventsRegistrantIndividualXOrganizationDataObjectType getIndividualXOrganization() {
        return individualXOrganization;
    }

    /**
     * Sets the value of the individualXOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantIndividualXOrganizationDataObjectType }
     *     
     */
    public void setIndividualXOrganization(EventsRegistrantIndividualXOrganizationDataObjectType value) {
        this.individualXOrganization = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantOrganizationDataObjectType }
     *     
     */
    public EventsRegistrantOrganizationDataObjectType getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantOrganizationDataObjectType }
     *     
     */
    public void setOrganization(EventsRegistrantOrganizationDataObjectType value) {
        this.organization = value;
    }

    /**
     * Gets the value of the addressXRef property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantAddressXRefDataObjectType }
     *     
     */
    public EventsRegistrantAddressXRefDataObjectType getAddressXRef() {
        return addressXRef;
    }

    /**
     * Sets the value of the addressXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantAddressXRefDataObjectType }
     *     
     */
    public void setAddressXRef(EventsRegistrantAddressXRefDataObjectType value) {
        this.addressXRef = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantAddressDataObjectType }
     *     
     */
    public EventsRegistrantAddressDataObjectType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantAddressDataObjectType }
     *     
     */
    public void setAddress(EventsRegistrantAddressDataObjectType value) {
        this.address = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantEmailDataObjectType }
     *     
     */
    public EventsRegistrantEmailDataObjectType getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantEmailDataObjectType }
     *     
     */
    public void setEmail(EventsRegistrantEmailDataObjectType value) {
        this.email = value;
    }

    /**
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantWebsiteDataObjectType }
     *     
     */
    public EventsRegistrantWebsiteDataObjectType getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantWebsiteDataObjectType }
     *     
     */
    public void setWebsite(EventsRegistrantWebsiteDataObjectType value) {
        this.website = value;
    }

    /**
     * Gets the value of the messaging property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantMessagingDataObjectType }
     *     
     */
    public EventsRegistrantMessagingDataObjectType getMessaging() {
        return messaging;
    }

    /**
     * Sets the value of the messaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantMessagingDataObjectType }
     *     
     */
    public void setMessaging(EventsRegistrantMessagingDataObjectType value) {
        this.messaging = value;
    }

    /**
     * Gets the value of the phoneXRef property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantPhoneXRefDataObjectType }
     *     
     */
    public EventsRegistrantPhoneXRefDataObjectType getPhoneXRef() {
        return phoneXRef;
    }

    /**
     * Sets the value of the phoneXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantPhoneXRefDataObjectType }
     *     
     */
    public void setPhoneXRef(EventsRegistrantPhoneXRefDataObjectType value) {
        this.phoneXRef = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantPhoneDataObjectType }
     *     
     */
    public EventsRegistrantPhoneDataObjectType getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantPhoneDataObjectType }
     *     
     */
    public void setPhone(EventsRegistrantPhoneDataObjectType value) {
        this.phone = value;
    }

    /**
     * Gets the value of the faxXRef property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantFaxXRefDataObjectType }
     *     
     */
    public EventsRegistrantFaxXRefDataObjectType getFaxXRef() {
        return faxXRef;
    }

    /**
     * Sets the value of the faxXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantFaxXRefDataObjectType }
     *     
     */
    public void setFaxXRef(EventsRegistrantFaxXRefDataObjectType value) {
        this.faxXRef = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantFaxDataObjectType }
     *     
     */
    public EventsRegistrantFaxDataObjectType getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantFaxDataObjectType }
     *     
     */
    public void setFax(EventsRegistrantFaxDataObjectType value) {
        this.fax = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantEventDataObjectType }
     *     
     */
    public EventsRegistrantEventDataObjectType getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantEventDataObjectType }
     *     
     */
    public void setEvent(EventsRegistrantEventDataObjectType value) {
        this.event = value;
    }

    /**
     * Gets the value of the eventLocation property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantEventLocationDataObjectType }
     *     
     */
    public EventsRegistrantEventLocationDataObjectType getEventLocation() {
        return eventLocation;
    }

    /**
     * Sets the value of the eventLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantEventLocationDataObjectType }
     *     
     */
    public void setEventLocation(EventsRegistrantEventLocationDataObjectType value) {
        this.eventLocation = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantLocationDataObjectType }
     *     
     */
    public EventsRegistrantLocationDataObjectType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantLocationDataObjectType }
     *     
     */
    public void setLocation(EventsRegistrantLocationDataObjectType value) {
        this.location = value;
    }

    /**
     * Gets the value of the locationCustomerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantLocationCustomerAddressDataObjectType }
     *     
     */
    public EventsRegistrantLocationCustomerAddressDataObjectType getLocationCustomerAddress() {
        return locationCustomerAddress;
    }

    /**
     * Sets the value of the locationCustomerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantLocationCustomerAddressDataObjectType }
     *     
     */
    public void setLocationCustomerAddress(EventsRegistrantLocationCustomerAddressDataObjectType value) {
        this.locationCustomerAddress = value;
    }

    /**
     * Gets the value of the locationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantLocationAddressDataObjectType }
     *     
     */
    public EventsRegistrantLocationAddressDataObjectType getLocationAddress() {
        return locationAddress;
    }

    /**
     * Sets the value of the locationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantLocationAddressDataObjectType }
     *     
     */
    public void setLocationAddress(EventsRegistrantLocationAddressDataObjectType value) {
        this.locationAddress = value;
    }

    /**
     * Gets the value of the eventLocationRoomType property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantEventLocationRoomTypeDataObjectType }
     *     
     */
    public EventsRegistrantEventLocationRoomTypeDataObjectType getEventLocationRoomType() {
        return eventLocationRoomType;
    }

    /**
     * Sets the value of the eventLocationRoomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantEventLocationRoomTypeDataObjectType }
     *     
     */
    public void setEventLocationRoomType(EventsRegistrantEventLocationRoomTypeDataObjectType value) {
        this.eventLocationRoomType = value;
    }

    /**
     * Gets the value of the roomRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantRoomRequestDataObjectType }
     *     
     */
    public EventsRegistrantRoomRequestDataObjectType getRoomRequest() {
        return roomRequest;
    }

    /**
     * Sets the value of the roomRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantRoomRequestDataObjectType }
     *     
     */
    public void setRoomRequest(EventsRegistrantRoomRequestDataObjectType value) {
        this.roomRequest = value;
    }

    /**
     * Gets the value of the registrantHousing property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantRegistrantHousingDataObjectType }
     *     
     */
    public EventsRegistrantRegistrantHousingDataObjectType getRegistrantHousing() {
        return registrantHousing;
    }

    /**
     * Sets the value of the registrantHousing property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantRegistrantHousingDataObjectType }
     *     
     */
    public void setRegistrantHousing(EventsRegistrantRegistrantHousingDataObjectType value) {
        this.registrantHousing = value;
    }

    /**
     * Gets the value of the registrantGuest property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantRegistrantGuestDataObjectType }
     *     
     */
    public EventsRegistrantRegistrantGuestDataObjectType getRegistrantGuest() {
        return registrantGuest;
    }

    /**
     * Sets the value of the registrantGuest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantRegistrantGuestDataObjectType }
     *     
     */
    public void setRegistrantGuest(EventsRegistrantRegistrantGuestDataObjectType value) {
        this.registrantGuest = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantInvoiceDataObjectType }
     *     
     */
    public EventsRegistrantInvoiceDataObjectType getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantInvoiceDataObjectType }
     *     
     */
    public void setInvoice(EventsRegistrantInvoiceDataObjectType value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantPaymentDataObjectType }
     *     
     */
    public EventsRegistrantPaymentDataObjectType getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantPaymentDataObjectType }
     *     
     */
    public void setPayment(EventsRegistrantPaymentDataObjectType value) {
        this.payment = value;
    }

    /**
     * Gets the value of the paymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantPaymentInfoDataObjectType }
     *     
     */
    public EventsRegistrantPaymentInfoDataObjectType getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * Sets the value of the paymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantPaymentInfoDataObjectType }
     *     
     */
    public void setPaymentInfo(EventsRegistrantPaymentInfoDataObjectType value) {
        this.paymentInfo = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantPaymentMethodDataObjectType }
     *     
     */
    public EventsRegistrantPaymentMethodDataObjectType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantPaymentMethodDataObjectType }
     *     
     */
    public void setPaymentMethod(EventsRegistrantPaymentMethodDataObjectType value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantProductDataObjectType }
     *     
     */
    public EventsRegistrantProductDataObjectType getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantProductDataObjectType }
     *     
     */
    public void setProduct(EventsRegistrantProductDataObjectType value) {
        this.product = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantPriceDataObjectType }
     *     
     */
    public EventsRegistrantPriceDataObjectType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantPriceDataObjectType }
     *     
     */
    public void setPrice(EventsRegistrantPriceDataObjectType value) {
        this.price = value;
    }

    /**
     * Gets the value of the registrantType property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantRegistrantTypeDataObjectType }
     *     
     */
    public EventsRegistrantRegistrantTypeDataObjectType getRegistrantType() {
        return registrantType;
    }

    /**
     * Sets the value of the registrantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantRegistrantTypeDataObjectType }
     *     
     */
    public void setRegistrantType(EventsRegistrantRegistrantTypeDataObjectType value) {
        this.registrantType = value;
    }

    /**
     * Gets the value of the registrantCustomDemographics property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantRegistrantCustomDemographicsDataObjectType }
     *     
     */
    public EventsRegistrantRegistrantCustomDemographicsDataObjectType getRegistrantCustomDemographics() {
        return registrantCustomDemographics;
    }

    /**
     * Sets the value of the registrantCustomDemographics property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantRegistrantCustomDemographicsDataObjectType }
     *     
     */
    public void setRegistrantCustomDemographics(EventsRegistrantRegistrantCustomDemographicsDataObjectType value) {
        this.registrantCustomDemographics = value;
    }

    /**
     * Gets the value of the gift property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantGiftDataObjectType }
     *     
     */
    public EventsRegistrantGiftDataObjectType getGift() {
        return gift;
    }

    /**
     * Sets the value of the gift property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantGiftDataObjectType }
     *     
     */
    public void setGift(EventsRegistrantGiftDataObjectType value) {
        this.gift = value;
    }

    /**
     * Gets the value of the sourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantSourceCodeDataObjectType }
     *     
     */
    public EventsRegistrantSourceCodeDataObjectType getSourceCode() {
        return sourceCode;
    }

    /**
     * Sets the value of the sourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantSourceCodeDataObjectType }
     *     
     */
    public void setSourceCode(EventsRegistrantSourceCodeDataObjectType value) {
        this.sourceCode = value;
    }

    /**
     * Gets the value of the registrantSession property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantRegistrantSessionDataObjectType }
     *     
     */
    public EventsRegistrantRegistrantSessionDataObjectType getRegistrantSession() {
        return registrantSession;
    }

    /**
     * Sets the value of the registrantSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantRegistrantSessionDataObjectType }
     *     
     */
    public void setRegistrantSession(EventsRegistrantRegistrantSessionDataObjectType value) {
        this.registrantSession = value;
    }

    /**
     * Gets the value of the registrantSessionCollection property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrantSessionCollectionType }
     *     
     */
    public RegistrantSessionCollectionType getRegistrantSessionCollection() {
        return registrantSessionCollection;
    }

    /**
     * Sets the value of the registrantSessionCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrantSessionCollectionType }
     *     
     */
    public void setRegistrantSessionCollection(RegistrantSessionCollectionType value) {
        this.registrantSessionCollection = value;
    }

    /**
     * Gets the value of the invoiceDetailCollection property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailCollectionType }
     *     
     */
    public InvoiceDetailCollectionType getInvoiceDetailCollection() {
        return invoiceDetailCollection;
    }

    /**
     * Sets the value of the invoiceDetailCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailCollectionType }
     *     
     */
    public void setInvoiceDetailCollection(InvoiceDetailCollectionType value) {
        this.invoiceDetailCollection = value;
    }

    /**
     * Gets the value of the additionalInvoiceDetailCollection property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInvoiceDetailCollectionType }
     *     
     */
    public AdditionalInvoiceDetailCollectionType getAdditionalInvoiceDetailCollection() {
        return additionalInvoiceDetailCollection;
    }

    /**
     * Sets the value of the additionalInvoiceDetailCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInvoiceDetailCollectionType }
     *     
     */
    public void setAdditionalInvoiceDetailCollection(AdditionalInvoiceDetailCollectionType value) {
        this.additionalInvoiceDetailCollection = value;
    }

}
