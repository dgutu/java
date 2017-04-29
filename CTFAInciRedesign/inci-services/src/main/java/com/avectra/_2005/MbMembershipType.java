
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mb_membershipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mb_membershipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentKey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="Membership" type="{http://www.avectra.com/2005/}mb_membership_Membership_DataObjectType"/>
 *         &lt;element name="Chapter_Membership" type="{http://www.avectra.com/2005/}mb_membership_Chapter_Membership_DataObjectType"/>
 *         &lt;element name="Change_Membership" type="{http://www.avectra.com/2005/}mb_membership_Change_Membership_DataObjectType"/>
 *         &lt;element name="Batch" type="{http://www.avectra.com/2005/}mb_membership_Batch_DataObjectType"/>
 *         &lt;element name="Inovice_Terms" type="{http://www.avectra.com/2005/}mb_membership_Inovice_Terms_DataObjectType"/>
 *         &lt;element name="Individual" type="{http://www.avectra.com/2005/}mb_membership_Individual_DataObjectType"/>
 *         &lt;element name="Customer" type="{http://www.avectra.com/2005/}mb_membership_Customer_DataObjectType"/>
 *         &lt;element name="Customer_Lookup" type="{http://www.avectra.com/2005/}mb_membership_Customer_Lookup_DataObjectType"/>
 *         &lt;element name="Referring_Customer" type="{http://www.avectra.com/2005/}mb_membership_Referring_Customer_DataObjectType"/>
 *         &lt;element name="Organization" type="{http://www.avectra.com/2005/}mb_membership_Organization_DataObjectType"/>
 *         &lt;element name="Membership_Invoices" type="{http://www.avectra.com/2005/}mb_membership_Membership_Invoices_DataObjectType"/>
 *         &lt;element name="Chapter" type="{http://www.avectra.com/2005/}mb_membership_Chapter_DataObjectType"/>
 *         &lt;element name="Member_Type" type="{http://www.avectra.com/2005/}mb_membership_Member_Type_DataObjectType"/>
 *         &lt;element name="Membership_Audit_Trail" type="{http://www.avectra.com/2005/}mb_membership_Membership_Audit_Trail_DataObjectType"/>
 *         &lt;element name="Member_Dues_History" type="{http://www.avectra.com/2005/}mb_membership_Member_Dues_History_DataObjectType"/>
 *         &lt;element name="Dues_Variables" type="{http://www.avectra.com/2005/}mb_membership_Dues_Variables_DataObjectType"/>
 *         &lt;element name="Invoice" type="{http://www.avectra.com/2005/}mb_membership_Invoice_DataObjectType"/>
 *         &lt;element name="Payment" type="{http://www.avectra.com/2005/}mb_membership_Payment_DataObjectType"/>
 *         &lt;element name="Payment_Info" type="{http://www.avectra.com/2005/}mb_membership_Payment_Info_DataObjectType"/>
 *         &lt;element name="Payment_Method" type="{http://www.avectra.com/2005/}mb_membership_Payment_Method_DataObjectType"/>
 *         &lt;element name="Association_Package" type="{http://www.avectra.com/2005/}mb_membership_Association_Package_DataObjectType"/>
 *         &lt;element name="Association" type="{http://www.avectra.com/2005/}mb_membership_Association_DataObjectType"/>
 *         &lt;element name="Bundle" type="{http://www.avectra.com/2005/}mb_membership_Bundle_DataObjectType"/>
 *         &lt;element name="Installment_Billing" type="{http://www.avectra.com/2005/}mb_membership_Installment_Billing_DataObjectType"/>
 *         &lt;element name="Package_Component" type="{http://www.avectra.com/2005/}mb_membership_Package_Component_DataObjectType"/>
 *         &lt;element name="Package" type="{http://www.avectra.com/2005/}mb_membership_Package_DataObjectType"/>
 *         &lt;element name="Product" type="{http://www.avectra.com/2005/}mb_membership_Product_DataObjectType"/>
 *         &lt;element name="Chapter_Product" type="{http://www.avectra.com/2005/}mb_membership_Chapter_Product_DataObjectType"/>
 *         &lt;element name="CustomerAddress" type="{http://www.avectra.com/2005/}mb_membership_CustomerAddress_DataObjectType"/>
 *         &lt;element name="source_code" type="{http://www.avectra.com/2005/}mb_membership_source_code_DataObjectType"/>
 *         &lt;element name="Invoice_DetailCollection" type="{http://www.avectra.com/2005/}Invoice_DetailCollectionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mb_membershipType", propOrder = {
    "currentKey",
    "membership",
    "chapterMembership",
    "changeMembership",
    "batch",
    "inoviceTerms",
    "individual",
    "customer",
    "customerLookup",
    "referringCustomer",
    "organization",
    "membershipInvoices",
    "chapter",
    "memberType",
    "membershipAuditTrail",
    "memberDuesHistory",
    "duesVariables",
    "invoice",
    "payment",
    "paymentInfo",
    "paymentMethod",
    "associationPackage",
    "association",
    "bundle",
    "installmentBilling",
    "packageComponent",
    "_package",
    "product",
    "chapterProduct",
    "customerAddress",
    "sourceCode",
    "invoiceDetailCollection"
})
public class MbMembershipType {

    @XmlElementRef(name = "CurrentKey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> currentKey;
    @XmlElement(name = "Membership", required = true)
    protected MbMembershipMembershipDataObjectType membership;
    @XmlElement(name = "Chapter_Membership", required = true)
    protected MbMembershipChapterMembershipDataObjectType chapterMembership;
    @XmlElement(name = "Change_Membership", required = true)
    protected MbMembershipChangeMembershipDataObjectType changeMembership;
    @XmlElement(name = "Batch", required = true)
    protected MbMembershipBatchDataObjectType batch;
    @XmlElement(name = "Inovice_Terms", required = true)
    protected MbMembershipInoviceTermsDataObjectType inoviceTerms;
    @XmlElement(name = "Individual", required = true)
    protected MbMembershipIndividualDataObjectType individual;
    @XmlElement(name = "Customer", required = true)
    protected MbMembershipCustomerDataObjectType customer;
    @XmlElement(name = "Customer_Lookup", required = true)
    protected MbMembershipCustomerLookupDataObjectType customerLookup;
    @XmlElement(name = "Referring_Customer", required = true)
    protected MbMembershipReferringCustomerDataObjectType referringCustomer;
    @XmlElement(name = "Organization", required = true)
    protected MbMembershipOrganizationDataObjectType organization;
    @XmlElement(name = "Membership_Invoices", required = true)
    protected MbMembershipMembershipInvoicesDataObjectType membershipInvoices;
    @XmlElement(name = "Chapter", required = true)
    protected MbMembershipChapterDataObjectType chapter;
    @XmlElement(name = "Member_Type", required = true)
    protected MbMembershipMemberTypeDataObjectType memberType;
    @XmlElement(name = "Membership_Audit_Trail", required = true)
    protected MbMembershipMembershipAuditTrailDataObjectType membershipAuditTrail;
    @XmlElement(name = "Member_Dues_History", required = true)
    protected MbMembershipMemberDuesHistoryDataObjectType memberDuesHistory;
    @XmlElement(name = "Dues_Variables", required = true)
    protected MbMembershipDuesVariablesDataObjectType duesVariables;
    @XmlElement(name = "Invoice", required = true)
    protected MbMembershipInvoiceDataObjectType invoice;
    @XmlElement(name = "Payment", required = true)
    protected MbMembershipPaymentDataObjectType payment;
    @XmlElement(name = "Payment_Info", required = true)
    protected MbMembershipPaymentInfoDataObjectType paymentInfo;
    @XmlElement(name = "Payment_Method", required = true)
    protected MbMembershipPaymentMethodDataObjectType paymentMethod;
    @XmlElement(name = "Association_Package", required = true)
    protected MbMembershipAssociationPackageDataObjectType associationPackage;
    @XmlElement(name = "Association", required = true)
    protected MbMembershipAssociationDataObjectType association;
    @XmlElement(name = "Bundle", required = true)
    protected MbMembershipBundleDataObjectType bundle;
    @XmlElement(name = "Installment_Billing", required = true)
    protected MbMembershipInstallmentBillingDataObjectType installmentBilling;
    @XmlElement(name = "Package_Component", required = true)
    protected MbMembershipPackageComponentDataObjectType packageComponent;
    @XmlElement(name = "Package", required = true)
    protected MbMembershipPackageDataObjectType _package;
    @XmlElement(name = "Product", required = true)
    protected MbMembershipProductDataObjectType product;
    @XmlElement(name = "Chapter_Product", required = true)
    protected MbMembershipChapterProductDataObjectType chapterProduct;
    @XmlElement(name = "CustomerAddress", required = true)
    protected MbMembershipCustomerAddressDataObjectType customerAddress;
    @XmlElement(name = "source_code", required = true)
    protected MbMembershipSourceCodeDataObjectType sourceCode;
    @XmlElement(name = "Invoice_DetailCollection", required = true)
    protected InvoiceDetailCollectionType invoiceDetailCollection;

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
     * Gets the value of the membership property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipMembershipDataObjectType }
     *     
     */
    public MbMembershipMembershipDataObjectType getMembership() {
        return membership;
    }

    /**
     * Sets the value of the membership property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipMembershipDataObjectType }
     *     
     */
    public void setMembership(MbMembershipMembershipDataObjectType value) {
        this.membership = value;
    }

    /**
     * Gets the value of the chapterMembership property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipChapterMembershipDataObjectType }
     *     
     */
    public MbMembershipChapterMembershipDataObjectType getChapterMembership() {
        return chapterMembership;
    }

    /**
     * Sets the value of the chapterMembership property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipChapterMembershipDataObjectType }
     *     
     */
    public void setChapterMembership(MbMembershipChapterMembershipDataObjectType value) {
        this.chapterMembership = value;
    }

    /**
     * Gets the value of the changeMembership property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipChangeMembershipDataObjectType }
     *     
     */
    public MbMembershipChangeMembershipDataObjectType getChangeMembership() {
        return changeMembership;
    }

    /**
     * Sets the value of the changeMembership property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipChangeMembershipDataObjectType }
     *     
     */
    public void setChangeMembership(MbMembershipChangeMembershipDataObjectType value) {
        this.changeMembership = value;
    }

    /**
     * Gets the value of the batch property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipBatchDataObjectType }
     *     
     */
    public MbMembershipBatchDataObjectType getBatch() {
        return batch;
    }

    /**
     * Sets the value of the batch property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipBatchDataObjectType }
     *     
     */
    public void setBatch(MbMembershipBatchDataObjectType value) {
        this.batch = value;
    }

    /**
     * Gets the value of the inoviceTerms property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipInoviceTermsDataObjectType }
     *     
     */
    public MbMembershipInoviceTermsDataObjectType getInoviceTerms() {
        return inoviceTerms;
    }

    /**
     * Sets the value of the inoviceTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipInoviceTermsDataObjectType }
     *     
     */
    public void setInoviceTerms(MbMembershipInoviceTermsDataObjectType value) {
        this.inoviceTerms = value;
    }

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipIndividualDataObjectType }
     *     
     */
    public MbMembershipIndividualDataObjectType getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipIndividualDataObjectType }
     *     
     */
    public void setIndividual(MbMembershipIndividualDataObjectType value) {
        this.individual = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipCustomerDataObjectType }
     *     
     */
    public MbMembershipCustomerDataObjectType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipCustomerDataObjectType }
     *     
     */
    public void setCustomer(MbMembershipCustomerDataObjectType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the customerLookup property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipCustomerLookupDataObjectType }
     *     
     */
    public MbMembershipCustomerLookupDataObjectType getCustomerLookup() {
        return customerLookup;
    }

    /**
     * Sets the value of the customerLookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipCustomerLookupDataObjectType }
     *     
     */
    public void setCustomerLookup(MbMembershipCustomerLookupDataObjectType value) {
        this.customerLookup = value;
    }

    /**
     * Gets the value of the referringCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipReferringCustomerDataObjectType }
     *     
     */
    public MbMembershipReferringCustomerDataObjectType getReferringCustomer() {
        return referringCustomer;
    }

    /**
     * Sets the value of the referringCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipReferringCustomerDataObjectType }
     *     
     */
    public void setReferringCustomer(MbMembershipReferringCustomerDataObjectType value) {
        this.referringCustomer = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipOrganizationDataObjectType }
     *     
     */
    public MbMembershipOrganizationDataObjectType getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipOrganizationDataObjectType }
     *     
     */
    public void setOrganization(MbMembershipOrganizationDataObjectType value) {
        this.organization = value;
    }

    /**
     * Gets the value of the membershipInvoices property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipMembershipInvoicesDataObjectType }
     *     
     */
    public MbMembershipMembershipInvoicesDataObjectType getMembershipInvoices() {
        return membershipInvoices;
    }

    /**
     * Sets the value of the membershipInvoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipMembershipInvoicesDataObjectType }
     *     
     */
    public void setMembershipInvoices(MbMembershipMembershipInvoicesDataObjectType value) {
        this.membershipInvoices = value;
    }

    /**
     * Gets the value of the chapter property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipChapterDataObjectType }
     *     
     */
    public MbMembershipChapterDataObjectType getChapter() {
        return chapter;
    }

    /**
     * Sets the value of the chapter property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipChapterDataObjectType }
     *     
     */
    public void setChapter(MbMembershipChapterDataObjectType value) {
        this.chapter = value;
    }

    /**
     * Gets the value of the memberType property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipMemberTypeDataObjectType }
     *     
     */
    public MbMembershipMemberTypeDataObjectType getMemberType() {
        return memberType;
    }

    /**
     * Sets the value of the memberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipMemberTypeDataObjectType }
     *     
     */
    public void setMemberType(MbMembershipMemberTypeDataObjectType value) {
        this.memberType = value;
    }

    /**
     * Gets the value of the membershipAuditTrail property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipMembershipAuditTrailDataObjectType }
     *     
     */
    public MbMembershipMembershipAuditTrailDataObjectType getMembershipAuditTrail() {
        return membershipAuditTrail;
    }

    /**
     * Sets the value of the membershipAuditTrail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipMembershipAuditTrailDataObjectType }
     *     
     */
    public void setMembershipAuditTrail(MbMembershipMembershipAuditTrailDataObjectType value) {
        this.membershipAuditTrail = value;
    }

    /**
     * Gets the value of the memberDuesHistory property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipMemberDuesHistoryDataObjectType }
     *     
     */
    public MbMembershipMemberDuesHistoryDataObjectType getMemberDuesHistory() {
        return memberDuesHistory;
    }

    /**
     * Sets the value of the memberDuesHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipMemberDuesHistoryDataObjectType }
     *     
     */
    public void setMemberDuesHistory(MbMembershipMemberDuesHistoryDataObjectType value) {
        this.memberDuesHistory = value;
    }

    /**
     * Gets the value of the duesVariables property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipDuesVariablesDataObjectType }
     *     
     */
    public MbMembershipDuesVariablesDataObjectType getDuesVariables() {
        return duesVariables;
    }

    /**
     * Sets the value of the duesVariables property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipDuesVariablesDataObjectType }
     *     
     */
    public void setDuesVariables(MbMembershipDuesVariablesDataObjectType value) {
        this.duesVariables = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipInvoiceDataObjectType }
     *     
     */
    public MbMembershipInvoiceDataObjectType getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipInvoiceDataObjectType }
     *     
     */
    public void setInvoice(MbMembershipInvoiceDataObjectType value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipPaymentDataObjectType }
     *     
     */
    public MbMembershipPaymentDataObjectType getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipPaymentDataObjectType }
     *     
     */
    public void setPayment(MbMembershipPaymentDataObjectType value) {
        this.payment = value;
    }

    /**
     * Gets the value of the paymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipPaymentInfoDataObjectType }
     *     
     */
    public MbMembershipPaymentInfoDataObjectType getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * Sets the value of the paymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipPaymentInfoDataObjectType }
     *     
     */
    public void setPaymentInfo(MbMembershipPaymentInfoDataObjectType value) {
        this.paymentInfo = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipPaymentMethodDataObjectType }
     *     
     */
    public MbMembershipPaymentMethodDataObjectType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipPaymentMethodDataObjectType }
     *     
     */
    public void setPaymentMethod(MbMembershipPaymentMethodDataObjectType value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the associationPackage property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipAssociationPackageDataObjectType }
     *     
     */
    public MbMembershipAssociationPackageDataObjectType getAssociationPackage() {
        return associationPackage;
    }

    /**
     * Sets the value of the associationPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipAssociationPackageDataObjectType }
     *     
     */
    public void setAssociationPackage(MbMembershipAssociationPackageDataObjectType value) {
        this.associationPackage = value;
    }

    /**
     * Gets the value of the association property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipAssociationDataObjectType }
     *     
     */
    public MbMembershipAssociationDataObjectType getAssociation() {
        return association;
    }

    /**
     * Sets the value of the association property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipAssociationDataObjectType }
     *     
     */
    public void setAssociation(MbMembershipAssociationDataObjectType value) {
        this.association = value;
    }

    /**
     * Gets the value of the bundle property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipBundleDataObjectType }
     *     
     */
    public MbMembershipBundleDataObjectType getBundle() {
        return bundle;
    }

    /**
     * Sets the value of the bundle property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipBundleDataObjectType }
     *     
     */
    public void setBundle(MbMembershipBundleDataObjectType value) {
        this.bundle = value;
    }

    /**
     * Gets the value of the installmentBilling property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipInstallmentBillingDataObjectType }
     *     
     */
    public MbMembershipInstallmentBillingDataObjectType getInstallmentBilling() {
        return installmentBilling;
    }

    /**
     * Sets the value of the installmentBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipInstallmentBillingDataObjectType }
     *     
     */
    public void setInstallmentBilling(MbMembershipInstallmentBillingDataObjectType value) {
        this.installmentBilling = value;
    }

    /**
     * Gets the value of the packageComponent property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipPackageComponentDataObjectType }
     *     
     */
    public MbMembershipPackageComponentDataObjectType getPackageComponent() {
        return packageComponent;
    }

    /**
     * Sets the value of the packageComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipPackageComponentDataObjectType }
     *     
     */
    public void setPackageComponent(MbMembershipPackageComponentDataObjectType value) {
        this.packageComponent = value;
    }

    /**
     * Gets the value of the package property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipPackageDataObjectType }
     *     
     */
    public MbMembershipPackageDataObjectType getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipPackageDataObjectType }
     *     
     */
    public void setPackage(MbMembershipPackageDataObjectType value) {
        this._package = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipProductDataObjectType }
     *     
     */
    public MbMembershipProductDataObjectType getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipProductDataObjectType }
     *     
     */
    public void setProduct(MbMembershipProductDataObjectType value) {
        this.product = value;
    }

    /**
     * Gets the value of the chapterProduct property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipChapterProductDataObjectType }
     *     
     */
    public MbMembershipChapterProductDataObjectType getChapterProduct() {
        return chapterProduct;
    }

    /**
     * Sets the value of the chapterProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipChapterProductDataObjectType }
     *     
     */
    public void setChapterProduct(MbMembershipChapterProductDataObjectType value) {
        this.chapterProduct = value;
    }

    /**
     * Gets the value of the customerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipCustomerAddressDataObjectType }
     *     
     */
    public MbMembershipCustomerAddressDataObjectType getCustomerAddress() {
        return customerAddress;
    }

    /**
     * Sets the value of the customerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipCustomerAddressDataObjectType }
     *     
     */
    public void setCustomerAddress(MbMembershipCustomerAddressDataObjectType value) {
        this.customerAddress = value;
    }

    /**
     * Gets the value of the sourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link MbMembershipSourceCodeDataObjectType }
     *     
     */
    public MbMembershipSourceCodeDataObjectType getSourceCode() {
        return sourceCode;
    }

    /**
     * Sets the value of the sourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MbMembershipSourceCodeDataObjectType }
     *     
     */
    public void setSourceCode(MbMembershipSourceCodeDataObjectType value) {
        this.sourceCode = value;
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

}
