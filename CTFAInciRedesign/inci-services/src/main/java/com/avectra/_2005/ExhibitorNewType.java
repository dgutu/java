
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExhibitorNewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExhibitorNewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentKey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="Exhibitor" type="{http://www.avectra.com/2005/}ExhibitorNew_Exhibitor_DataObjectType"/>
 *         &lt;element name="Exhibit_Show" type="{http://www.avectra.com/2005/}ExhibitorNew_Exhibit_Show_DataObjectType"/>
 *         &lt;element name="Booth_Person" type="{http://www.avectra.com/2005/}ExhibitorNew_Booth_Person_DataObjectType"/>
 *         &lt;element name="Exhibitor_Booth" type="{http://www.avectra.com/2005/}ExhibitorNew_Exhibitor_Booth_DataObjectType"/>
 *         &lt;element name="booth_complement" type="{http://www.avectra.com/2005/}ExhibitorNew_booth_complement_DataObjectType"/>
 *         &lt;element name="Customer" type="{http://www.avectra.com/2005/}ExhibitorNew_Customer_DataObjectType"/>
 *         &lt;element name="Contact_Person" type="{http://www.avectra.com/2005/}ExhibitorNew_Contact_Person_DataObjectType"/>
 *         &lt;element name="priority_points" type="{http://www.avectra.com/2005/}ExhibitorNew_priority_points_DataObjectType"/>
 *         &lt;element name="Invoice" type="{http://www.avectra.com/2005/}ExhibitorNew_Invoice_DataObjectType"/>
 *         &lt;element name="Payment" type="{http://www.avectra.com/2005/}ExhibitorNew_Payment_DataObjectType"/>
 *         &lt;element name="Payment_Info" type="{http://www.avectra.com/2005/}ExhibitorNew_Payment_Info_DataObjectType"/>
 *         &lt;element name="Payment_Method" type="{http://www.avectra.com/2005/}ExhibitorNew_Payment_Method_DataObjectType"/>
 *         &lt;element name="Billing_Address" type="{http://www.avectra.com/2005/}ExhibitorNew_Billing_Address_DataObjectType"/>
 *         &lt;element name="BillToCustomer" type="{http://www.avectra.com/2005/}ExhibitorNew_BillToCustomer_DataObjectType"/>
 *         &lt;element name="Installment_Billing" type="{http://www.avectra.com/2005/}ExhibitorNew_Installment_Billing_DataObjectType"/>
 *         &lt;element name="Exhibitor_Address" type="{http://www.avectra.com/2005/}ExhibitorNew_Exhibitor_Address_DataObjectType"/>
 *         &lt;element name="Primary_Contact_Address" type="{http://www.avectra.com/2005/}ExhibitorNew_Primary_Contact_Address_DataObjectType"/>
 *         &lt;element name="Exhibitor_X_Contact" type="{http://www.avectra.com/2005/}ExhibitorNew_Exhibitor_X_Contact_DataObjectType"/>
 *         &lt;element name="Shared_Booth" type="{http://www.avectra.com/2005/}ExhibitorNew_Shared_Booth_DataObjectType"/>
 *         &lt;element name="Sponsor" type="{http://www.avectra.com/2005/}ExhibitorNew_Sponsor_DataObjectType"/>
 *         &lt;element name="Primary_Contact_Email" type="{http://www.avectra.com/2005/}ExhibitorNew_Primary_Contact_Email_DataObjectType"/>
 *         &lt;element name="Primary_Contact_Website" type="{http://www.avectra.com/2005/}ExhibitorNew_Primary_Contact_Website_DataObjectType"/>
 *         &lt;element name="Exhibitor_Email" type="{http://www.avectra.com/2005/}ExhibitorNew_Exhibitor_Email_DataObjectType"/>
 *         &lt;element name="Exhibitor_Website" type="{http://www.avectra.com/2005/}ExhibitorNew_Exhibitor_Website_DataObjectType"/>
 *         &lt;element name="Exhibitor_BoothCollection" type="{http://www.avectra.com/2005/}Exhibitor_BoothCollectionType"/>
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
@XmlType(name = "ExhibitorNewType", propOrder = {
    "currentKey",
    "exhibitor",
    "exhibitShow",
    "boothPerson",
    "exhibitorBooth",
    "boothComplement",
    "customer",
    "contactPerson",
    "priorityPoints",
    "invoice",
    "payment",
    "paymentInfo",
    "paymentMethod",
    "billingAddress",
    "billToCustomer",
    "installmentBilling",
    "exhibitorAddress",
    "primaryContactAddress",
    "exhibitorXContact",
    "sharedBooth",
    "sponsor",
    "primaryContactEmail",
    "primaryContactWebsite",
    "exhibitorEmail",
    "exhibitorWebsite",
    "exhibitorBoothCollection",
    "invoiceDetailCollection",
    "additionalInvoiceDetailCollection"
})
public class ExhibitorNewType {

    @XmlElementRef(name = "CurrentKey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> currentKey;
    @XmlElement(name = "Exhibitor", required = true)
    protected ExhibitorNewExhibitorDataObjectType exhibitor;
    @XmlElement(name = "Exhibit_Show", required = true)
    protected ExhibitorNewExhibitShowDataObjectType exhibitShow;
    @XmlElement(name = "Booth_Person", required = true)
    protected ExhibitorNewBoothPersonDataObjectType boothPerson;
    @XmlElement(name = "Exhibitor_Booth", required = true)
    protected ExhibitorNewExhibitorBoothDataObjectType exhibitorBooth;
    @XmlElement(name = "booth_complement", required = true)
    protected ExhibitorNewBoothComplementDataObjectType boothComplement;
    @XmlElement(name = "Customer", required = true)
    protected ExhibitorNewCustomerDataObjectType customer;
    @XmlElement(name = "Contact_Person", required = true)
    protected ExhibitorNewContactPersonDataObjectType contactPerson;
    @XmlElement(name = "priority_points", required = true)
    protected ExhibitorNewPriorityPointsDataObjectType priorityPoints;
    @XmlElement(name = "Invoice", required = true)
    protected ExhibitorNewInvoiceDataObjectType invoice;
    @XmlElement(name = "Payment", required = true)
    protected ExhibitorNewPaymentDataObjectType payment;
    @XmlElement(name = "Payment_Info", required = true)
    protected ExhibitorNewPaymentInfoDataObjectType paymentInfo;
    @XmlElement(name = "Payment_Method", required = true)
    protected ExhibitorNewPaymentMethodDataObjectType paymentMethod;
    @XmlElement(name = "Billing_Address", required = true)
    protected ExhibitorNewBillingAddressDataObjectType billingAddress;
    @XmlElement(name = "BillToCustomer", required = true)
    protected ExhibitorNewBillToCustomerDataObjectType billToCustomer;
    @XmlElement(name = "Installment_Billing", required = true)
    protected ExhibitorNewInstallmentBillingDataObjectType installmentBilling;
    @XmlElement(name = "Exhibitor_Address", required = true)
    protected ExhibitorNewExhibitorAddressDataObjectType exhibitorAddress;
    @XmlElement(name = "Primary_Contact_Address", required = true)
    protected ExhibitorNewPrimaryContactAddressDataObjectType primaryContactAddress;
    @XmlElement(name = "Exhibitor_X_Contact", required = true)
    protected ExhibitorNewExhibitorXContactDataObjectType exhibitorXContact;
    @XmlElement(name = "Shared_Booth", required = true)
    protected ExhibitorNewSharedBoothDataObjectType sharedBooth;
    @XmlElement(name = "Sponsor", required = true)
    protected ExhibitorNewSponsorDataObjectType sponsor;
    @XmlElement(name = "Primary_Contact_Email", required = true)
    protected ExhibitorNewPrimaryContactEmailDataObjectType primaryContactEmail;
    @XmlElement(name = "Primary_Contact_Website", required = true)
    protected ExhibitorNewPrimaryContactWebsiteDataObjectType primaryContactWebsite;
    @XmlElement(name = "Exhibitor_Email", required = true)
    protected ExhibitorNewExhibitorEmailDataObjectType exhibitorEmail;
    @XmlElement(name = "Exhibitor_Website", required = true)
    protected ExhibitorNewExhibitorWebsiteDataObjectType exhibitorWebsite;
    @XmlElement(name = "Exhibitor_BoothCollection", required = true)
    protected ExhibitorBoothCollectionType exhibitorBoothCollection;
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
     * Gets the value of the exhibitor property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewExhibitorDataObjectType }
     *     
     */
    public ExhibitorNewExhibitorDataObjectType getExhibitor() {
        return exhibitor;
    }

    /**
     * Sets the value of the exhibitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewExhibitorDataObjectType }
     *     
     */
    public void setExhibitor(ExhibitorNewExhibitorDataObjectType value) {
        this.exhibitor = value;
    }

    /**
     * Gets the value of the exhibitShow property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewExhibitShowDataObjectType }
     *     
     */
    public ExhibitorNewExhibitShowDataObjectType getExhibitShow() {
        return exhibitShow;
    }

    /**
     * Sets the value of the exhibitShow property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewExhibitShowDataObjectType }
     *     
     */
    public void setExhibitShow(ExhibitorNewExhibitShowDataObjectType value) {
        this.exhibitShow = value;
    }

    /**
     * Gets the value of the boothPerson property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewBoothPersonDataObjectType }
     *     
     */
    public ExhibitorNewBoothPersonDataObjectType getBoothPerson() {
        return boothPerson;
    }

    /**
     * Sets the value of the boothPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewBoothPersonDataObjectType }
     *     
     */
    public void setBoothPerson(ExhibitorNewBoothPersonDataObjectType value) {
        this.boothPerson = value;
    }

    /**
     * Gets the value of the exhibitorBooth property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewExhibitorBoothDataObjectType }
     *     
     */
    public ExhibitorNewExhibitorBoothDataObjectType getExhibitorBooth() {
        return exhibitorBooth;
    }

    /**
     * Sets the value of the exhibitorBooth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewExhibitorBoothDataObjectType }
     *     
     */
    public void setExhibitorBooth(ExhibitorNewExhibitorBoothDataObjectType value) {
        this.exhibitorBooth = value;
    }

    /**
     * Gets the value of the boothComplement property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewBoothComplementDataObjectType }
     *     
     */
    public ExhibitorNewBoothComplementDataObjectType getBoothComplement() {
        return boothComplement;
    }

    /**
     * Sets the value of the boothComplement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewBoothComplementDataObjectType }
     *     
     */
    public void setBoothComplement(ExhibitorNewBoothComplementDataObjectType value) {
        this.boothComplement = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewCustomerDataObjectType }
     *     
     */
    public ExhibitorNewCustomerDataObjectType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewCustomerDataObjectType }
     *     
     */
    public void setCustomer(ExhibitorNewCustomerDataObjectType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the contactPerson property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewContactPersonDataObjectType }
     *     
     */
    public ExhibitorNewContactPersonDataObjectType getContactPerson() {
        return contactPerson;
    }

    /**
     * Sets the value of the contactPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewContactPersonDataObjectType }
     *     
     */
    public void setContactPerson(ExhibitorNewContactPersonDataObjectType value) {
        this.contactPerson = value;
    }

    /**
     * Gets the value of the priorityPoints property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewPriorityPointsDataObjectType }
     *     
     */
    public ExhibitorNewPriorityPointsDataObjectType getPriorityPoints() {
        return priorityPoints;
    }

    /**
     * Sets the value of the priorityPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewPriorityPointsDataObjectType }
     *     
     */
    public void setPriorityPoints(ExhibitorNewPriorityPointsDataObjectType value) {
        this.priorityPoints = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewInvoiceDataObjectType }
     *     
     */
    public ExhibitorNewInvoiceDataObjectType getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewInvoiceDataObjectType }
     *     
     */
    public void setInvoice(ExhibitorNewInvoiceDataObjectType value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewPaymentDataObjectType }
     *     
     */
    public ExhibitorNewPaymentDataObjectType getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewPaymentDataObjectType }
     *     
     */
    public void setPayment(ExhibitorNewPaymentDataObjectType value) {
        this.payment = value;
    }

    /**
     * Gets the value of the paymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewPaymentInfoDataObjectType }
     *     
     */
    public ExhibitorNewPaymentInfoDataObjectType getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * Sets the value of the paymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewPaymentInfoDataObjectType }
     *     
     */
    public void setPaymentInfo(ExhibitorNewPaymentInfoDataObjectType value) {
        this.paymentInfo = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewPaymentMethodDataObjectType }
     *     
     */
    public ExhibitorNewPaymentMethodDataObjectType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewPaymentMethodDataObjectType }
     *     
     */
    public void setPaymentMethod(ExhibitorNewPaymentMethodDataObjectType value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewBillingAddressDataObjectType }
     *     
     */
    public ExhibitorNewBillingAddressDataObjectType getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewBillingAddressDataObjectType }
     *     
     */
    public void setBillingAddress(ExhibitorNewBillingAddressDataObjectType value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the billToCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewBillToCustomerDataObjectType }
     *     
     */
    public ExhibitorNewBillToCustomerDataObjectType getBillToCustomer() {
        return billToCustomer;
    }

    /**
     * Sets the value of the billToCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewBillToCustomerDataObjectType }
     *     
     */
    public void setBillToCustomer(ExhibitorNewBillToCustomerDataObjectType value) {
        this.billToCustomer = value;
    }

    /**
     * Gets the value of the installmentBilling property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewInstallmentBillingDataObjectType }
     *     
     */
    public ExhibitorNewInstallmentBillingDataObjectType getInstallmentBilling() {
        return installmentBilling;
    }

    /**
     * Sets the value of the installmentBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewInstallmentBillingDataObjectType }
     *     
     */
    public void setInstallmentBilling(ExhibitorNewInstallmentBillingDataObjectType value) {
        this.installmentBilling = value;
    }

    /**
     * Gets the value of the exhibitorAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewExhibitorAddressDataObjectType }
     *     
     */
    public ExhibitorNewExhibitorAddressDataObjectType getExhibitorAddress() {
        return exhibitorAddress;
    }

    /**
     * Sets the value of the exhibitorAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewExhibitorAddressDataObjectType }
     *     
     */
    public void setExhibitorAddress(ExhibitorNewExhibitorAddressDataObjectType value) {
        this.exhibitorAddress = value;
    }

    /**
     * Gets the value of the primaryContactAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewPrimaryContactAddressDataObjectType }
     *     
     */
    public ExhibitorNewPrimaryContactAddressDataObjectType getPrimaryContactAddress() {
        return primaryContactAddress;
    }

    /**
     * Sets the value of the primaryContactAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewPrimaryContactAddressDataObjectType }
     *     
     */
    public void setPrimaryContactAddress(ExhibitorNewPrimaryContactAddressDataObjectType value) {
        this.primaryContactAddress = value;
    }

    /**
     * Gets the value of the exhibitorXContact property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewExhibitorXContactDataObjectType }
     *     
     */
    public ExhibitorNewExhibitorXContactDataObjectType getExhibitorXContact() {
        return exhibitorXContact;
    }

    /**
     * Sets the value of the exhibitorXContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewExhibitorXContactDataObjectType }
     *     
     */
    public void setExhibitorXContact(ExhibitorNewExhibitorXContactDataObjectType value) {
        this.exhibitorXContact = value;
    }

    /**
     * Gets the value of the sharedBooth property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewSharedBoothDataObjectType }
     *     
     */
    public ExhibitorNewSharedBoothDataObjectType getSharedBooth() {
        return sharedBooth;
    }

    /**
     * Sets the value of the sharedBooth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewSharedBoothDataObjectType }
     *     
     */
    public void setSharedBooth(ExhibitorNewSharedBoothDataObjectType value) {
        this.sharedBooth = value;
    }

    /**
     * Gets the value of the sponsor property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewSponsorDataObjectType }
     *     
     */
    public ExhibitorNewSponsorDataObjectType getSponsor() {
        return sponsor;
    }

    /**
     * Sets the value of the sponsor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewSponsorDataObjectType }
     *     
     */
    public void setSponsor(ExhibitorNewSponsorDataObjectType value) {
        this.sponsor = value;
    }

    /**
     * Gets the value of the primaryContactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewPrimaryContactEmailDataObjectType }
     *     
     */
    public ExhibitorNewPrimaryContactEmailDataObjectType getPrimaryContactEmail() {
        return primaryContactEmail;
    }

    /**
     * Sets the value of the primaryContactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewPrimaryContactEmailDataObjectType }
     *     
     */
    public void setPrimaryContactEmail(ExhibitorNewPrimaryContactEmailDataObjectType value) {
        this.primaryContactEmail = value;
    }

    /**
     * Gets the value of the primaryContactWebsite property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewPrimaryContactWebsiteDataObjectType }
     *     
     */
    public ExhibitorNewPrimaryContactWebsiteDataObjectType getPrimaryContactWebsite() {
        return primaryContactWebsite;
    }

    /**
     * Sets the value of the primaryContactWebsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewPrimaryContactWebsiteDataObjectType }
     *     
     */
    public void setPrimaryContactWebsite(ExhibitorNewPrimaryContactWebsiteDataObjectType value) {
        this.primaryContactWebsite = value;
    }

    /**
     * Gets the value of the exhibitorEmail property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewExhibitorEmailDataObjectType }
     *     
     */
    public ExhibitorNewExhibitorEmailDataObjectType getExhibitorEmail() {
        return exhibitorEmail;
    }

    /**
     * Sets the value of the exhibitorEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewExhibitorEmailDataObjectType }
     *     
     */
    public void setExhibitorEmail(ExhibitorNewExhibitorEmailDataObjectType value) {
        this.exhibitorEmail = value;
    }

    /**
     * Gets the value of the exhibitorWebsite property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewExhibitorWebsiteDataObjectType }
     *     
     */
    public ExhibitorNewExhibitorWebsiteDataObjectType getExhibitorWebsite() {
        return exhibitorWebsite;
    }

    /**
     * Sets the value of the exhibitorWebsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewExhibitorWebsiteDataObjectType }
     *     
     */
    public void setExhibitorWebsite(ExhibitorNewExhibitorWebsiteDataObjectType value) {
        this.exhibitorWebsite = value;
    }

    /**
     * Gets the value of the exhibitorBoothCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorBoothCollectionType }
     *     
     */
    public ExhibitorBoothCollectionType getExhibitorBoothCollection() {
        return exhibitorBoothCollection;
    }

    /**
     * Sets the value of the exhibitorBoothCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorBoothCollectionType }
     *     
     */
    public void setExhibitorBoothCollection(ExhibitorBoothCollectionType value) {
        this.exhibitorBoothCollection = value;
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
