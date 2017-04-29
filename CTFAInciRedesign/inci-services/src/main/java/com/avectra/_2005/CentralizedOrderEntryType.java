
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CentralizedOrderEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CentralizedOrderEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentKey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="Invoice" type="{http://www.avectra.com/2005/}CentralizedOrderEntry_Invoice_DataObjectType"/>
 *         &lt;element name="Invoice_Detail" type="{http://www.avectra.com/2005/}CentralizedOrderEntry_Invoice_Detail_DataObjectType"/>
 *         &lt;element name="Claim" type="{http://www.avectra.com/2005/}CentralizedOrderEntry_Claim_DataObjectType"/>
 *         &lt;element name="Default_Shipping_Address" type="{http://www.avectra.com/2005/}CentralizedOrderEntry_Default_Shipping_Address_DataObjectType"/>
 *         &lt;element name="Payment" type="{http://www.avectra.com/2005/}CentralizedOrderEntry_Payment_DataObjectType"/>
 *         &lt;element name="Payment_Info" type="{http://www.avectra.com/2005/}CentralizedOrderEntry_Payment_Info_DataObjectType"/>
 *         &lt;element name="Payment_Method" type="{http://www.avectra.com/2005/}CentralizedOrderEntry_Payment_Method_DataObjectType"/>
 *         &lt;element name="Customer" type="{http://www.avectra.com/2005/}CentralizedOrderEntry_Customer_DataObjectType"/>
 *         &lt;element name="Billing_Address" type="{http://www.avectra.com/2005/}CentralizedOrderEntry_Billing_Address_DataObjectType"/>
 *         &lt;element name="Billing_Adr" type="{http://www.avectra.com/2005/}CentralizedOrderEntry_Billing_Adr_DataObjectType"/>
 *         &lt;element name="Price" type="{http://www.avectra.com/2005/}CentralizedOrderEntry_Price_DataObjectType"/>
 *         &lt;element name="Batch" type="{http://www.avectra.com/2005/}CentralizedOrderEntry_Batch_DataObjectType"/>
 *         &lt;element name="BillToCustomer" type="{http://www.avectra.com/2005/}CentralizedOrderEntry_BillToCustomer_DataObjectType"/>
 *         &lt;element name="BillToIndividual" type="{http://www.avectra.com/2005/}CentralizedOrderEntry_BillToIndividual_DataObjectType"/>
 *         &lt;element name="InstallmentBilling" type="{http://www.avectra.com/2005/}CentralizedOrderEntry_InstallmentBilling_DataObjectType"/>
 *         &lt;element name="Company-Business_Unit" type="{http://www.avectra.com/2005/}CentralizedOrderEntry_Company-Business_Unit_DataObjectType"/>
 *         &lt;element name="Credit_Available" type="{http://www.avectra.com/2005/}CentralizedOrderEntry_Credit_Available_DataObjectType"/>
 *         &lt;element name="source_code" type="{http://www.avectra.com/2005/}CentralizedOrderEntry_source_code_DataObjectType"/>
 *         &lt;element name="Sales_Opportunity" type="{http://www.avectra.com/2005/}CentralizedOrderEntry_Sales_Opportunity_DataObjectType"/>
 *         &lt;element name="Invoice_DetailCollection" type="{http://www.avectra.com/2005/}Invoice_DetailCollectionType"/>
 *         &lt;element name="Additional_Invoice_DetailCollection" type="{http://www.avectra.com/2005/}Additional_Invoice_DetailCollectionType"/>
 *         &lt;element name="MembershipCollection" type="{http://www.avectra.com/2005/}MembershipCollectionType"/>
 *         &lt;element name="RegistrantCollection" type="{http://www.avectra.com/2005/}RegistrantCollectionType"/>
 *         &lt;element name="Group_RegistrantionCollection" type="{http://www.avectra.com/2005/}Group_RegistrantionCollectionType"/>
 *         &lt;element name="GiftCollection" type="{http://www.avectra.com/2005/}GiftCollectionType"/>
 *         &lt;element name="InvoiceToPayCollection" type="{http://www.avectra.com/2005/}InvoiceToPayCollectionType"/>
 *         &lt;element name="ExhibitorCollection" type="{http://www.avectra.com/2005/}ExhibitorCollectionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CentralizedOrderEntryType", propOrder = {
    "currentKey",
    "invoice",
    "invoiceDetail",
    "claim",
    "defaultShippingAddress",
    "payment",
    "paymentInfo",
    "paymentMethod",
    "customer",
    "billingAddress",
    "billingAdr",
    "price",
    "batch",
    "billToCustomer",
    "billToIndividual",
    "installmentBilling",
    "companyBusinessUnit",
    "creditAvailable",
    "sourceCode",
    "salesOpportunity",
    "invoiceDetailCollection",
    "additionalInvoiceDetailCollection",
    "membershipCollection",
    "registrantCollection",
    "groupRegistrantionCollection",
    "giftCollection",
    "invoiceToPayCollection",
    "exhibitorCollection"
})
public class CentralizedOrderEntryType {

    @XmlElementRef(name = "CurrentKey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> currentKey;
    @XmlElement(name = "Invoice", required = true)
    protected CentralizedOrderEntryInvoiceDataObjectType invoice;
    @XmlElement(name = "Invoice_Detail", required = true)
    protected CentralizedOrderEntryInvoiceDetailDataObjectType invoiceDetail;
    @XmlElement(name = "Claim", required = true)
    protected CentralizedOrderEntryClaimDataObjectType claim;
    @XmlElement(name = "Default_Shipping_Address", required = true)
    protected CentralizedOrderEntryDefaultShippingAddressDataObjectType defaultShippingAddress;
    @XmlElement(name = "Payment", required = true)
    protected CentralizedOrderEntryPaymentDataObjectType payment;
    @XmlElement(name = "Payment_Info", required = true)
    protected CentralizedOrderEntryPaymentInfoDataObjectType paymentInfo;
    @XmlElement(name = "Payment_Method", required = true)
    protected CentralizedOrderEntryPaymentMethodDataObjectType paymentMethod;
    @XmlElement(name = "Customer", required = true)
    protected CentralizedOrderEntryCustomerDataObjectType customer;
    @XmlElement(name = "Billing_Address", required = true)
    protected CentralizedOrderEntryBillingAddressDataObjectType billingAddress;
    @XmlElement(name = "Billing_Adr", required = true)
    protected CentralizedOrderEntryBillingAdrDataObjectType billingAdr;
    @XmlElement(name = "Price", required = true)
    protected CentralizedOrderEntryPriceDataObjectType price;
    @XmlElement(name = "Batch", required = true)
    protected CentralizedOrderEntryBatchDataObjectType batch;
    @XmlElement(name = "BillToCustomer", required = true)
    protected CentralizedOrderEntryBillToCustomerDataObjectType billToCustomer;
    @XmlElement(name = "BillToIndividual", required = true)
    protected CentralizedOrderEntryBillToIndividualDataObjectType billToIndividual;
    @XmlElement(name = "InstallmentBilling", required = true)
    protected CentralizedOrderEntryInstallmentBillingDataObjectType installmentBilling;
    @XmlElement(name = "Company-Business_Unit", required = true)
    protected CentralizedOrderEntryCompanyBusinessUnitDataObjectType companyBusinessUnit;
    @XmlElement(name = "Credit_Available", required = true)
    protected CentralizedOrderEntryCreditAvailableDataObjectType creditAvailable;
    @XmlElement(name = "source_code", required = true)
    protected CentralizedOrderEntrySourceCodeDataObjectType sourceCode;
    @XmlElement(name = "Sales_Opportunity", required = true)
    protected CentralizedOrderEntrySalesOpportunityDataObjectType salesOpportunity;
    @XmlElement(name = "Invoice_DetailCollection", required = true)
    protected InvoiceDetailCollectionType invoiceDetailCollection;
    @XmlElement(name = "Additional_Invoice_DetailCollection", required = true)
    protected AdditionalInvoiceDetailCollectionType additionalInvoiceDetailCollection;
    @XmlElement(name = "MembershipCollection", required = true)
    protected MembershipCollectionType membershipCollection;
    @XmlElement(name = "RegistrantCollection", required = true)
    protected RegistrantCollectionType registrantCollection;
    @XmlElement(name = "Group_RegistrantionCollection", required = true)
    protected GroupRegistrantionCollectionType groupRegistrantionCollection;
    @XmlElement(name = "GiftCollection", required = true)
    protected GiftCollectionType giftCollection;
    @XmlElement(name = "InvoiceToPayCollection", required = true)
    protected InvoiceToPayCollectionType invoiceToPayCollection;
    @XmlElement(name = "ExhibitorCollection", required = true)
    protected ExhibitorCollectionType exhibitorCollection;

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
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link CentralizedOrderEntryInvoiceDataObjectType }
     *     
     */
    public CentralizedOrderEntryInvoiceDataObjectType getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralizedOrderEntryInvoiceDataObjectType }
     *     
     */
    public void setInvoice(CentralizedOrderEntryInvoiceDataObjectType value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the invoiceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CentralizedOrderEntryInvoiceDetailDataObjectType }
     *     
     */
    public CentralizedOrderEntryInvoiceDetailDataObjectType getInvoiceDetail() {
        return invoiceDetail;
    }

    /**
     * Sets the value of the invoiceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralizedOrderEntryInvoiceDetailDataObjectType }
     *     
     */
    public void setInvoiceDetail(CentralizedOrderEntryInvoiceDetailDataObjectType value) {
        this.invoiceDetail = value;
    }

    /**
     * Gets the value of the claim property.
     * 
     * @return
     *     possible object is
     *     {@link CentralizedOrderEntryClaimDataObjectType }
     *     
     */
    public CentralizedOrderEntryClaimDataObjectType getClaim() {
        return claim;
    }

    /**
     * Sets the value of the claim property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralizedOrderEntryClaimDataObjectType }
     *     
     */
    public void setClaim(CentralizedOrderEntryClaimDataObjectType value) {
        this.claim = value;
    }

    /**
     * Gets the value of the defaultShippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link CentralizedOrderEntryDefaultShippingAddressDataObjectType }
     *     
     */
    public CentralizedOrderEntryDefaultShippingAddressDataObjectType getDefaultShippingAddress() {
        return defaultShippingAddress;
    }

    /**
     * Sets the value of the defaultShippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralizedOrderEntryDefaultShippingAddressDataObjectType }
     *     
     */
    public void setDefaultShippingAddress(CentralizedOrderEntryDefaultShippingAddressDataObjectType value) {
        this.defaultShippingAddress = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link CentralizedOrderEntryPaymentDataObjectType }
     *     
     */
    public CentralizedOrderEntryPaymentDataObjectType getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralizedOrderEntryPaymentDataObjectType }
     *     
     */
    public void setPayment(CentralizedOrderEntryPaymentDataObjectType value) {
        this.payment = value;
    }

    /**
     * Gets the value of the paymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CentralizedOrderEntryPaymentInfoDataObjectType }
     *     
     */
    public CentralizedOrderEntryPaymentInfoDataObjectType getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * Sets the value of the paymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralizedOrderEntryPaymentInfoDataObjectType }
     *     
     */
    public void setPaymentInfo(CentralizedOrderEntryPaymentInfoDataObjectType value) {
        this.paymentInfo = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CentralizedOrderEntryPaymentMethodDataObjectType }
     *     
     */
    public CentralizedOrderEntryPaymentMethodDataObjectType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralizedOrderEntryPaymentMethodDataObjectType }
     *     
     */
    public void setPaymentMethod(CentralizedOrderEntryPaymentMethodDataObjectType value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CentralizedOrderEntryCustomerDataObjectType }
     *     
     */
    public CentralizedOrderEntryCustomerDataObjectType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralizedOrderEntryCustomerDataObjectType }
     *     
     */
    public void setCustomer(CentralizedOrderEntryCustomerDataObjectType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link CentralizedOrderEntryBillingAddressDataObjectType }
     *     
     */
    public CentralizedOrderEntryBillingAddressDataObjectType getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralizedOrderEntryBillingAddressDataObjectType }
     *     
     */
    public void setBillingAddress(CentralizedOrderEntryBillingAddressDataObjectType value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the billingAdr property.
     * 
     * @return
     *     possible object is
     *     {@link CentralizedOrderEntryBillingAdrDataObjectType }
     *     
     */
    public CentralizedOrderEntryBillingAdrDataObjectType getBillingAdr() {
        return billingAdr;
    }

    /**
     * Sets the value of the billingAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralizedOrderEntryBillingAdrDataObjectType }
     *     
     */
    public void setBillingAdr(CentralizedOrderEntryBillingAdrDataObjectType value) {
        this.billingAdr = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link CentralizedOrderEntryPriceDataObjectType }
     *     
     */
    public CentralizedOrderEntryPriceDataObjectType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralizedOrderEntryPriceDataObjectType }
     *     
     */
    public void setPrice(CentralizedOrderEntryPriceDataObjectType value) {
        this.price = value;
    }

    /**
     * Gets the value of the batch property.
     * 
     * @return
     *     possible object is
     *     {@link CentralizedOrderEntryBatchDataObjectType }
     *     
     */
    public CentralizedOrderEntryBatchDataObjectType getBatch() {
        return batch;
    }

    /**
     * Sets the value of the batch property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralizedOrderEntryBatchDataObjectType }
     *     
     */
    public void setBatch(CentralizedOrderEntryBatchDataObjectType value) {
        this.batch = value;
    }

    /**
     * Gets the value of the billToCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link CentralizedOrderEntryBillToCustomerDataObjectType }
     *     
     */
    public CentralizedOrderEntryBillToCustomerDataObjectType getBillToCustomer() {
        return billToCustomer;
    }

    /**
     * Sets the value of the billToCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralizedOrderEntryBillToCustomerDataObjectType }
     *     
     */
    public void setBillToCustomer(CentralizedOrderEntryBillToCustomerDataObjectType value) {
        this.billToCustomer = value;
    }

    /**
     * Gets the value of the billToIndividual property.
     * 
     * @return
     *     possible object is
     *     {@link CentralizedOrderEntryBillToIndividualDataObjectType }
     *     
     */
    public CentralizedOrderEntryBillToIndividualDataObjectType getBillToIndividual() {
        return billToIndividual;
    }

    /**
     * Sets the value of the billToIndividual property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralizedOrderEntryBillToIndividualDataObjectType }
     *     
     */
    public void setBillToIndividual(CentralizedOrderEntryBillToIndividualDataObjectType value) {
        this.billToIndividual = value;
    }

    /**
     * Gets the value of the installmentBilling property.
     * 
     * @return
     *     possible object is
     *     {@link CentralizedOrderEntryInstallmentBillingDataObjectType }
     *     
     */
    public CentralizedOrderEntryInstallmentBillingDataObjectType getInstallmentBilling() {
        return installmentBilling;
    }

    /**
     * Sets the value of the installmentBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralizedOrderEntryInstallmentBillingDataObjectType }
     *     
     */
    public void setInstallmentBilling(CentralizedOrderEntryInstallmentBillingDataObjectType value) {
        this.installmentBilling = value;
    }

    /**
     * Gets the value of the companyBusinessUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CentralizedOrderEntryCompanyBusinessUnitDataObjectType }
     *     
     */
    public CentralizedOrderEntryCompanyBusinessUnitDataObjectType getCompanyBusinessUnit() {
        return companyBusinessUnit;
    }

    /**
     * Sets the value of the companyBusinessUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralizedOrderEntryCompanyBusinessUnitDataObjectType }
     *     
     */
    public void setCompanyBusinessUnit(CentralizedOrderEntryCompanyBusinessUnitDataObjectType value) {
        this.companyBusinessUnit = value;
    }

    /**
     * Gets the value of the creditAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link CentralizedOrderEntryCreditAvailableDataObjectType }
     *     
     */
    public CentralizedOrderEntryCreditAvailableDataObjectType getCreditAvailable() {
        return creditAvailable;
    }

    /**
     * Sets the value of the creditAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralizedOrderEntryCreditAvailableDataObjectType }
     *     
     */
    public void setCreditAvailable(CentralizedOrderEntryCreditAvailableDataObjectType value) {
        this.creditAvailable = value;
    }

    /**
     * Gets the value of the sourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link CentralizedOrderEntrySourceCodeDataObjectType }
     *     
     */
    public CentralizedOrderEntrySourceCodeDataObjectType getSourceCode() {
        return sourceCode;
    }

    /**
     * Sets the value of the sourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralizedOrderEntrySourceCodeDataObjectType }
     *     
     */
    public void setSourceCode(CentralizedOrderEntrySourceCodeDataObjectType value) {
        this.sourceCode = value;
    }

    /**
     * Gets the value of the salesOpportunity property.
     * 
     * @return
     *     possible object is
     *     {@link CentralizedOrderEntrySalesOpportunityDataObjectType }
     *     
     */
    public CentralizedOrderEntrySalesOpportunityDataObjectType getSalesOpportunity() {
        return salesOpportunity;
    }

    /**
     * Sets the value of the salesOpportunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralizedOrderEntrySalesOpportunityDataObjectType }
     *     
     */
    public void setSalesOpportunity(CentralizedOrderEntrySalesOpportunityDataObjectType value) {
        this.salesOpportunity = value;
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

    /**
     * Gets the value of the membershipCollection property.
     * 
     * @return
     *     possible object is
     *     {@link MembershipCollectionType }
     *     
     */
    public MembershipCollectionType getMembershipCollection() {
        return membershipCollection;
    }

    /**
     * Sets the value of the membershipCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link MembershipCollectionType }
     *     
     */
    public void setMembershipCollection(MembershipCollectionType value) {
        this.membershipCollection = value;
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

    /**
     * Gets the value of the groupRegistrantionCollection property.
     * 
     * @return
     *     possible object is
     *     {@link GroupRegistrantionCollectionType }
     *     
     */
    public GroupRegistrantionCollectionType getGroupRegistrantionCollection() {
        return groupRegistrantionCollection;
    }

    /**
     * Sets the value of the groupRegistrantionCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupRegistrantionCollectionType }
     *     
     */
    public void setGroupRegistrantionCollection(GroupRegistrantionCollectionType value) {
        this.groupRegistrantionCollection = value;
    }

    /**
     * Gets the value of the giftCollection property.
     * 
     * @return
     *     possible object is
     *     {@link GiftCollectionType }
     *     
     */
    public GiftCollectionType getGiftCollection() {
        return giftCollection;
    }

    /**
     * Sets the value of the giftCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCollectionType }
     *     
     */
    public void setGiftCollection(GiftCollectionType value) {
        this.giftCollection = value;
    }

    /**
     * Gets the value of the invoiceToPayCollection property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceToPayCollectionType }
     *     
     */
    public InvoiceToPayCollectionType getInvoiceToPayCollection() {
        return invoiceToPayCollection;
    }

    /**
     * Sets the value of the invoiceToPayCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceToPayCollectionType }
     *     
     */
    public void setInvoiceToPayCollection(InvoiceToPayCollectionType value) {
        this.invoiceToPayCollection = value;
    }

    /**
     * Gets the value of the exhibitorCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorCollectionType }
     *     
     */
    public ExhibitorCollectionType getExhibitorCollection() {
        return exhibitorCollection;
    }

    /**
     * Sets the value of the exhibitorCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorCollectionType }
     *     
     */
    public void setExhibitorCollection(ExhibitorCollectionType value) {
        this.exhibitorCollection = value;
    }

}
