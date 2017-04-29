
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentKey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="Invoice" type="{http://www.avectra.com/2005/}Invoice_Invoice_DataObjectType"/>
 *         &lt;element name="Invoice_Detail" type="{http://www.avectra.com/2005/}Invoice_Invoice_Detail_DataObjectType"/>
 *         &lt;element name="Claim" type="{http://www.avectra.com/2005/}Invoice_Claim_DataObjectType"/>
 *         &lt;element name="Default_Shipping_Address" type="{http://www.avectra.com/2005/}Invoice_Default_Shipping_Address_DataObjectType"/>
 *         &lt;element name="Payment" type="{http://www.avectra.com/2005/}Invoice_Payment_DataObjectType"/>
 *         &lt;element name="Payment_Info" type="{http://www.avectra.com/2005/}Invoice_Payment_Info_DataObjectType"/>
 *         &lt;element name="Payment_Method" type="{http://www.avectra.com/2005/}Invoice_Payment_Method_DataObjectType"/>
 *         &lt;element name="Customer" type="{http://www.avectra.com/2005/}Invoice_Customer_DataObjectType"/>
 *         &lt;element name="Billing_Address" type="{http://www.avectra.com/2005/}Invoice_Billing_Address_DataObjectType"/>
 *         &lt;element name="Billing_Adr" type="{http://www.avectra.com/2005/}Invoice_Billing_Adr_DataObjectType"/>
 *         &lt;element name="Price" type="{http://www.avectra.com/2005/}Invoice_Price_DataObjectType"/>
 *         &lt;element name="Batch" type="{http://www.avectra.com/2005/}Invoice_Batch_DataObjectType"/>
 *         &lt;element name="BillToCustomer" type="{http://www.avectra.com/2005/}Invoice_BillToCustomer_DataObjectType"/>
 *         &lt;element name="BillToIndividual" type="{http://www.avectra.com/2005/}Invoice_BillToIndividual_DataObjectType"/>
 *         &lt;element name="InstallmentBilling" type="{http://www.avectra.com/2005/}Invoice_InstallmentBilling_DataObjectType"/>
 *         &lt;element name="Company-Business_Unit" type="{http://www.avectra.com/2005/}Invoice_Company-Business_Unit_DataObjectType"/>
 *         &lt;element name="Credit_Available" type="{http://www.avectra.com/2005/}Invoice_Credit_Available_DataObjectType"/>
 *         &lt;element name="source_code" type="{http://www.avectra.com/2005/}Invoice_source_code_DataObjectType"/>
 *         &lt;element name="Sales_Opportunity" type="{http://www.avectra.com/2005/}Invoice_Sales_Opportunity_DataObjectType"/>
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
@XmlType(name = "InvoiceType", propOrder = {
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
    "additionalInvoiceDetailCollection"
})
public class InvoiceType {

    @XmlElementRef(name = "CurrentKey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> currentKey;
    @XmlElement(name = "Invoice", required = true)
    protected InvoiceInvoiceDataObjectType invoice;
    @XmlElement(name = "Invoice_Detail", required = true)
    protected InvoiceInvoiceDetailDataObjectType invoiceDetail;
    @XmlElement(name = "Claim", required = true)
    protected InvoiceClaimDataObjectType claim;
    @XmlElement(name = "Default_Shipping_Address", required = true)
    protected InvoiceDefaultShippingAddressDataObjectType defaultShippingAddress;
    @XmlElement(name = "Payment", required = true)
    protected InvoicePaymentDataObjectType payment;
    @XmlElement(name = "Payment_Info", required = true)
    protected InvoicePaymentInfoDataObjectType paymentInfo;
    @XmlElement(name = "Payment_Method", required = true)
    protected InvoicePaymentMethodDataObjectType paymentMethod;
    @XmlElement(name = "Customer", required = true)
    protected InvoiceCustomerDataObjectType customer;
    @XmlElement(name = "Billing_Address", required = true)
    protected InvoiceBillingAddressDataObjectType billingAddress;
    @XmlElement(name = "Billing_Adr", required = true)
    protected InvoiceBillingAdrDataObjectType billingAdr;
    @XmlElement(name = "Price", required = true)
    protected InvoicePriceDataObjectType price;
    @XmlElement(name = "Batch", required = true)
    protected InvoiceBatchDataObjectType batch;
    @XmlElement(name = "BillToCustomer", required = true)
    protected InvoiceBillToCustomerDataObjectType billToCustomer;
    @XmlElement(name = "BillToIndividual", required = true)
    protected InvoiceBillToIndividualDataObjectType billToIndividual;
    @XmlElement(name = "InstallmentBilling", required = true)
    protected InvoiceInstallmentBillingDataObjectType installmentBilling;
    @XmlElement(name = "Company-Business_Unit", required = true)
    protected InvoiceCompanyBusinessUnitDataObjectType companyBusinessUnit;
    @XmlElement(name = "Credit_Available", required = true)
    protected InvoiceCreditAvailableDataObjectType creditAvailable;
    @XmlElement(name = "source_code", required = true)
    protected InvoiceSourceCodeDataObjectType sourceCode;
    @XmlElement(name = "Sales_Opportunity", required = true)
    protected InvoiceSalesOpportunityDataObjectType salesOpportunity;
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
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceInvoiceDataObjectType }
     *     
     */
    public InvoiceInvoiceDataObjectType getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceInvoiceDataObjectType }
     *     
     */
    public void setInvoice(InvoiceInvoiceDataObjectType value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the invoiceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceInvoiceDetailDataObjectType }
     *     
     */
    public InvoiceInvoiceDetailDataObjectType getInvoiceDetail() {
        return invoiceDetail;
    }

    /**
     * Sets the value of the invoiceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceInvoiceDetailDataObjectType }
     *     
     */
    public void setInvoiceDetail(InvoiceInvoiceDetailDataObjectType value) {
        this.invoiceDetail = value;
    }

    /**
     * Gets the value of the claim property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceClaimDataObjectType }
     *     
     */
    public InvoiceClaimDataObjectType getClaim() {
        return claim;
    }

    /**
     * Sets the value of the claim property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceClaimDataObjectType }
     *     
     */
    public void setClaim(InvoiceClaimDataObjectType value) {
        this.claim = value;
    }

    /**
     * Gets the value of the defaultShippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDefaultShippingAddressDataObjectType }
     *     
     */
    public InvoiceDefaultShippingAddressDataObjectType getDefaultShippingAddress() {
        return defaultShippingAddress;
    }

    /**
     * Sets the value of the defaultShippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDefaultShippingAddressDataObjectType }
     *     
     */
    public void setDefaultShippingAddress(InvoiceDefaultShippingAddressDataObjectType value) {
        this.defaultShippingAddress = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link InvoicePaymentDataObjectType }
     *     
     */
    public InvoicePaymentDataObjectType getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicePaymentDataObjectType }
     *     
     */
    public void setPayment(InvoicePaymentDataObjectType value) {
        this.payment = value;
    }

    /**
     * Gets the value of the paymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InvoicePaymentInfoDataObjectType }
     *     
     */
    public InvoicePaymentInfoDataObjectType getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * Sets the value of the paymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicePaymentInfoDataObjectType }
     *     
     */
    public void setPaymentInfo(InvoicePaymentInfoDataObjectType value) {
        this.paymentInfo = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link InvoicePaymentMethodDataObjectType }
     *     
     */
    public InvoicePaymentMethodDataObjectType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicePaymentMethodDataObjectType }
     *     
     */
    public void setPaymentMethod(InvoicePaymentMethodDataObjectType value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceCustomerDataObjectType }
     *     
     */
    public InvoiceCustomerDataObjectType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceCustomerDataObjectType }
     *     
     */
    public void setCustomer(InvoiceCustomerDataObjectType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceBillingAddressDataObjectType }
     *     
     */
    public InvoiceBillingAddressDataObjectType getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceBillingAddressDataObjectType }
     *     
     */
    public void setBillingAddress(InvoiceBillingAddressDataObjectType value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the billingAdr property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceBillingAdrDataObjectType }
     *     
     */
    public InvoiceBillingAdrDataObjectType getBillingAdr() {
        return billingAdr;
    }

    /**
     * Sets the value of the billingAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceBillingAdrDataObjectType }
     *     
     */
    public void setBillingAdr(InvoiceBillingAdrDataObjectType value) {
        this.billingAdr = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link InvoicePriceDataObjectType }
     *     
     */
    public InvoicePriceDataObjectType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicePriceDataObjectType }
     *     
     */
    public void setPrice(InvoicePriceDataObjectType value) {
        this.price = value;
    }

    /**
     * Gets the value of the batch property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceBatchDataObjectType }
     *     
     */
    public InvoiceBatchDataObjectType getBatch() {
        return batch;
    }

    /**
     * Sets the value of the batch property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceBatchDataObjectType }
     *     
     */
    public void setBatch(InvoiceBatchDataObjectType value) {
        this.batch = value;
    }

    /**
     * Gets the value of the billToCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceBillToCustomerDataObjectType }
     *     
     */
    public InvoiceBillToCustomerDataObjectType getBillToCustomer() {
        return billToCustomer;
    }

    /**
     * Sets the value of the billToCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceBillToCustomerDataObjectType }
     *     
     */
    public void setBillToCustomer(InvoiceBillToCustomerDataObjectType value) {
        this.billToCustomer = value;
    }

    /**
     * Gets the value of the billToIndividual property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceBillToIndividualDataObjectType }
     *     
     */
    public InvoiceBillToIndividualDataObjectType getBillToIndividual() {
        return billToIndividual;
    }

    /**
     * Sets the value of the billToIndividual property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceBillToIndividualDataObjectType }
     *     
     */
    public void setBillToIndividual(InvoiceBillToIndividualDataObjectType value) {
        this.billToIndividual = value;
    }

    /**
     * Gets the value of the installmentBilling property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceInstallmentBillingDataObjectType }
     *     
     */
    public InvoiceInstallmentBillingDataObjectType getInstallmentBilling() {
        return installmentBilling;
    }

    /**
     * Sets the value of the installmentBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceInstallmentBillingDataObjectType }
     *     
     */
    public void setInstallmentBilling(InvoiceInstallmentBillingDataObjectType value) {
        this.installmentBilling = value;
    }

    /**
     * Gets the value of the companyBusinessUnit property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceCompanyBusinessUnitDataObjectType }
     *     
     */
    public InvoiceCompanyBusinessUnitDataObjectType getCompanyBusinessUnit() {
        return companyBusinessUnit;
    }

    /**
     * Sets the value of the companyBusinessUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceCompanyBusinessUnitDataObjectType }
     *     
     */
    public void setCompanyBusinessUnit(InvoiceCompanyBusinessUnitDataObjectType value) {
        this.companyBusinessUnit = value;
    }

    /**
     * Gets the value of the creditAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceCreditAvailableDataObjectType }
     *     
     */
    public InvoiceCreditAvailableDataObjectType getCreditAvailable() {
        return creditAvailable;
    }

    /**
     * Sets the value of the creditAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceCreditAvailableDataObjectType }
     *     
     */
    public void setCreditAvailable(InvoiceCreditAvailableDataObjectType value) {
        this.creditAvailable = value;
    }

    /**
     * Gets the value of the sourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceSourceCodeDataObjectType }
     *     
     */
    public InvoiceSourceCodeDataObjectType getSourceCode() {
        return sourceCode;
    }

    /**
     * Sets the value of the sourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceSourceCodeDataObjectType }
     *     
     */
    public void setSourceCode(InvoiceSourceCodeDataObjectType value) {
        this.sourceCode = value;
    }

    /**
     * Gets the value of the salesOpportunity property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceSalesOpportunityDataObjectType }
     *     
     */
    public InvoiceSalesOpportunityDataObjectType getSalesOpportunity() {
        return salesOpportunity;
    }

    /**
     * Sets the value of the salesOpportunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceSalesOpportunityDataObjectType }
     *     
     */
    public void setSalesOpportunity(InvoiceSalesOpportunityDataObjectType value) {
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

}
