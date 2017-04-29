
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGiftType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGiftType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentKey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="Gift" type="{http://www.avectra.com/2005/}FundraisingGift_Gift_DataObjectType"/>
 *         &lt;element name="Constituent" type="{http://www.avectra.com/2005/}FundraisingGift_Constituent_DataObjectType"/>
 *         &lt;element name="Customer" type="{http://www.avectra.com/2005/}FundraisingGift_Customer_DataObjectType"/>
 *         &lt;element name="Indivdiual" type="{http://www.avectra.com/2005/}FundraisingGift_Indivdiual_DataObjectType"/>
 *         &lt;element name="Ind_Business_Address" type="{http://www.avectra.com/2005/}FundraisingGift_Ind_Business_Address_DataObjectType"/>
 *         &lt;element name="Ind_Business_Address_XRef" type="{http://www.avectra.com/2005/}FundraisingGift_Ind_Business_Address_XRef_DataObjectType"/>
 *         &lt;element name="Ind_Business_Address_Country" type="{http://www.avectra.com/2005/}FundraisingGift_Ind_Business_Address_Country_DataObjectType"/>
 *         &lt;element name="Ind_Business_Phone" type="{http://www.avectra.com/2005/}FundraisingGift_Ind_Business_Phone_DataObjectType"/>
 *         &lt;element name="Ind_Business_Phone_XRef" type="{http://www.avectra.com/2005/}FundraisingGift_Ind_Business_Phone_XRef_DataObjectType"/>
 *         &lt;element name="Ind_Business_Phone_country" type="{http://www.avectra.com/2005/}FundraisingGift_Ind_Business_Phone_country_DataObjectType"/>
 *         &lt;element name="Ind_Business_Fax" type="{http://www.avectra.com/2005/}FundraisingGift_Ind_Business_Fax_DataObjectType"/>
 *         &lt;element name="Ind_Business_Fax_XRef" type="{http://www.avectra.com/2005/}FundraisingGift_Ind_Business_Fax_XRef_DataObjectType"/>
 *         &lt;element name="Ind_Business_Fax_Country" type="{http://www.avectra.com/2005/}FundraisingGift_Ind_Business_Fax_Country_DataObjectType"/>
 *         &lt;element name="Ind_eMail" type="{http://www.avectra.com/2005/}FundraisingGift_Ind_eMail_DataObjectType"/>
 *         &lt;element name="Ind_URL" type="{http://www.avectra.com/2005/}FundraisingGift_Ind_URL_DataObjectType"/>
 *         &lt;element name="Ind_Messaging" type="{http://www.avectra.com/2005/}FundraisingGift_Ind_Messaging_DataObjectType"/>
 *         &lt;element name="Organization" type="{http://www.avectra.com/2005/}FundraisingGift_Organization_DataObjectType"/>
 *         &lt;element name="Org_Business_Address" type="{http://www.avectra.com/2005/}FundraisingGift_Org_Business_Address_DataObjectType"/>
 *         &lt;element name="Org_Business_Address_XRef" type="{http://www.avectra.com/2005/}FundraisingGift_Org_Business_Address_XRef_DataObjectType"/>
 *         &lt;element name="Org_Business_Address_Country" type="{http://www.avectra.com/2005/}FundraisingGift_Org_Business_Address_Country_DataObjectType"/>
 *         &lt;element name="Org_Business_Phone" type="{http://www.avectra.com/2005/}FundraisingGift_Org_Business_Phone_DataObjectType"/>
 *         &lt;element name="Org_Business_Phone_XRef" type="{http://www.avectra.com/2005/}FundraisingGift_Org_Business_Phone_XRef_DataObjectType"/>
 *         &lt;element name="Org_Business_Phone_country" type="{http://www.avectra.com/2005/}FundraisingGift_Org_Business_Phone_country_DataObjectType"/>
 *         &lt;element name="Org_Business_Fax" type="{http://www.avectra.com/2005/}FundraisingGift_Org_Business_Fax_DataObjectType"/>
 *         &lt;element name="Org_Business_Fax_XRef" type="{http://www.avectra.com/2005/}FundraisingGift_Org_Business_Fax_XRef_DataObjectType"/>
 *         &lt;element name="Org_Business_Fax_Country" type="{http://www.avectra.com/2005/}FundraisingGift_Org_Business_Fax_Country_DataObjectType"/>
 *         &lt;element name="Org_eMail" type="{http://www.avectra.com/2005/}FundraisingGift_Org_eMail_DataObjectType"/>
 *         &lt;element name="Org_URL" type="{http://www.avectra.com/2005/}FundraisingGift_Org_URL_DataObjectType"/>
 *         &lt;element name="Org_Messaging" type="{http://www.avectra.com/2005/}FundraisingGift_Org_Messaging_DataObjectType"/>
 *         &lt;element name="Pledge" type="{http://www.avectra.com/2005/}FundraisingGift_Pledge_DataObjectType"/>
 *         &lt;element name="Premium" type="{http://www.avectra.com/2005/}FundraisingGift_Premium_DataObjectType"/>
 *         &lt;element name="Product_Code" type="{http://www.avectra.com/2005/}FundraisingGift_Product_Code_DataObjectType"/>
 *         &lt;element name="Product" type="{http://www.avectra.com/2005/}FundraisingGift_Product_DataObjectType"/>
 *         &lt;element name="Campaign_Code" type="{http://www.avectra.com/2005/}FundraisingGift_Campaign_Code_DataObjectType"/>
 *         &lt;element name="Fund_Code" type="{http://www.avectra.com/2005/}FundraisingGift_Fund_Code_DataObjectType"/>
 *         &lt;element name="Appeal_Code" type="{http://www.avectra.com/2005/}FundraisingGift_Appeal_Code_DataObjectType"/>
 *         &lt;element name="Package_Code" type="{http://www.avectra.com/2005/}FundraisingGift_Package_Code_DataObjectType"/>
 *         &lt;element name="Order_Detail_Schedule" type="{http://www.avectra.com/2005/}FundraisingGift_Order_Detail_Schedule_DataObjectType"/>
 *         &lt;element name="Recognition_Customer" type="{http://www.avectra.com/2005/}FundraisingGift_Recognition_Customer_DataObjectType"/>
 *         &lt;element name="Tribute" type="{http://www.avectra.com/2005/}FundraisingGift_Tribute_DataObjectType"/>
 *         &lt;element name="Tribute_Customer" type="{http://www.avectra.com/2005/}FundraisingGift_Tribute_Customer_DataObjectType"/>
 *         &lt;element name="Gift_Type" type="{http://www.avectra.com/2005/}FundraisingGift_Gift_Type_DataObjectType"/>
 *         &lt;element name="Recogntion_Type" type="{http://www.avectra.com/2005/}FundraisingGift_Recogntion_Type_DataObjectType"/>
 *         &lt;element name="Contributor_Gift" type="{http://www.avectra.com/2005/}FundraisingGift_Contributor_Gift_DataObjectType"/>
 *         &lt;element name="Solicitor_Customer" type="{http://www.avectra.com/2005/}FundraisingGift_Solicitor_Customer_DataObjectType"/>
 *         &lt;element name="Source_Code" type="{http://www.avectra.com/2005/}FundraisingGift_Source_Code_DataObjectType"/>
 *         &lt;element name="ComplementaryGifts" type="{http://www.avectra.com/2005/}FundraisingGift_ComplementaryGifts_DataObjectType"/>
 *         &lt;element name="Invoice" type="{http://www.avectra.com/2005/}FundraisingGift_Invoice_DataObjectType"/>
 *         &lt;element name="Payment" type="{http://www.avectra.com/2005/}FundraisingGift_Payment_DataObjectType"/>
 *         &lt;element name="Payment_Info" type="{http://www.avectra.com/2005/}FundraisingGift_Payment_Info_DataObjectType"/>
 *         &lt;element name="Payment_Method" type="{http://www.avectra.com/2005/}FundraisingGift_Payment_Method_DataObjectType"/>
 *         &lt;element name="Installment_Billing" type="{http://www.avectra.com/2005/}FundraisingGift_Installment_Billing_DataObjectType"/>
 *         &lt;element name="Gift_Price" type="{http://www.avectra.com/2005/}FundraisingGift_Gift_Price_DataObjectType"/>
 *         &lt;element name="Event" type="{http://www.avectra.com/2005/}FundraisingGift_Event_DataObjectType"/>
 *         &lt;element name="Registrant" type="{http://www.avectra.com/2005/}FundraisingGift_Registrant_DataObjectType"/>
 *         &lt;element name="Registrant_Customer" type="{http://www.avectra.com/2005/}FundraisingGift_Registrant_Customer_DataObjectType"/>
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
@XmlType(name = "FundraisingGiftType", propOrder = {
    "currentKey",
    "gift",
    "constituent",
    "customer",
    "indivdiual",
    "indBusinessAddress",
    "indBusinessAddressXRef",
    "indBusinessAddressCountry",
    "indBusinessPhone",
    "indBusinessPhoneXRef",
    "indBusinessPhoneCountry",
    "indBusinessFax",
    "indBusinessFaxXRef",
    "indBusinessFaxCountry",
    "indEMail",
    "indURL",
    "indMessaging",
    "organization",
    "orgBusinessAddress",
    "orgBusinessAddressXRef",
    "orgBusinessAddressCountry",
    "orgBusinessPhone",
    "orgBusinessPhoneXRef",
    "orgBusinessPhoneCountry",
    "orgBusinessFax",
    "orgBusinessFaxXRef",
    "orgBusinessFaxCountry",
    "orgEMail",
    "orgURL",
    "orgMessaging",
    "pledge",
    "premium",
    "productCode",
    "product",
    "campaignCode",
    "fundCode",
    "appealCode",
    "packageCode",
    "orderDetailSchedule",
    "recognitionCustomer",
    "tribute",
    "tributeCustomer",
    "giftType",
    "recogntionType",
    "contributorGift",
    "solicitorCustomer",
    "sourceCode",
    "complementaryGifts",
    "invoice",
    "payment",
    "paymentInfo",
    "paymentMethod",
    "installmentBilling",
    "giftPrice",
    "event",
    "registrant",
    "registrantCustomer",
    "invoiceDetailCollection",
    "additionalInvoiceDetailCollection"
})
public class FundraisingGiftType {

    @XmlElementRef(name = "CurrentKey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> currentKey;
    @XmlElement(name = "Gift", required = true)
    protected FundraisingGiftGiftDataObjectType gift;
    @XmlElement(name = "Constituent", required = true)
    protected FundraisingGiftConstituentDataObjectType constituent;
    @XmlElement(name = "Customer", required = true)
    protected FundraisingGiftCustomerDataObjectType customer;
    @XmlElement(name = "Indivdiual", required = true)
    protected FundraisingGiftIndivdiualDataObjectType indivdiual;
    @XmlElement(name = "Ind_Business_Address", required = true)
    protected FundraisingGiftIndBusinessAddressDataObjectType indBusinessAddress;
    @XmlElement(name = "Ind_Business_Address_XRef", required = true)
    protected FundraisingGiftIndBusinessAddressXRefDataObjectType indBusinessAddressXRef;
    @XmlElement(name = "Ind_Business_Address_Country", required = true)
    protected FundraisingGiftIndBusinessAddressCountryDataObjectType indBusinessAddressCountry;
    @XmlElement(name = "Ind_Business_Phone", required = true)
    protected FundraisingGiftIndBusinessPhoneDataObjectType indBusinessPhone;
    @XmlElement(name = "Ind_Business_Phone_XRef", required = true)
    protected FundraisingGiftIndBusinessPhoneXRefDataObjectType indBusinessPhoneXRef;
    @XmlElement(name = "Ind_Business_Phone_country", required = true)
    protected FundraisingGiftIndBusinessPhoneCountryDataObjectType indBusinessPhoneCountry;
    @XmlElement(name = "Ind_Business_Fax", required = true)
    protected FundraisingGiftIndBusinessFaxDataObjectType indBusinessFax;
    @XmlElement(name = "Ind_Business_Fax_XRef", required = true)
    protected FundraisingGiftIndBusinessFaxXRefDataObjectType indBusinessFaxXRef;
    @XmlElement(name = "Ind_Business_Fax_Country", required = true)
    protected FundraisingGiftIndBusinessFaxCountryDataObjectType indBusinessFaxCountry;
    @XmlElement(name = "Ind_eMail", required = true)
    protected FundraisingGiftIndEMailDataObjectType indEMail;
    @XmlElement(name = "Ind_URL", required = true)
    protected FundraisingGiftIndURLDataObjectType indURL;
    @XmlElement(name = "Ind_Messaging", required = true)
    protected FundraisingGiftIndMessagingDataObjectType indMessaging;
    @XmlElement(name = "Organization", required = true)
    protected FundraisingGiftOrganizationDataObjectType organization;
    @XmlElement(name = "Org_Business_Address", required = true)
    protected FundraisingGiftOrgBusinessAddressDataObjectType orgBusinessAddress;
    @XmlElement(name = "Org_Business_Address_XRef", required = true)
    protected FundraisingGiftOrgBusinessAddressXRefDataObjectType orgBusinessAddressXRef;
    @XmlElement(name = "Org_Business_Address_Country", required = true)
    protected FundraisingGiftOrgBusinessAddressCountryDataObjectType orgBusinessAddressCountry;
    @XmlElement(name = "Org_Business_Phone", required = true)
    protected FundraisingGiftOrgBusinessPhoneDataObjectType orgBusinessPhone;
    @XmlElement(name = "Org_Business_Phone_XRef", required = true)
    protected FundraisingGiftOrgBusinessPhoneXRefDataObjectType orgBusinessPhoneXRef;
    @XmlElement(name = "Org_Business_Phone_country", required = true)
    protected FundraisingGiftOrgBusinessPhoneCountryDataObjectType orgBusinessPhoneCountry;
    @XmlElement(name = "Org_Business_Fax", required = true)
    protected FundraisingGiftOrgBusinessFaxDataObjectType orgBusinessFax;
    @XmlElement(name = "Org_Business_Fax_XRef", required = true)
    protected FundraisingGiftOrgBusinessFaxXRefDataObjectType orgBusinessFaxXRef;
    @XmlElement(name = "Org_Business_Fax_Country", required = true)
    protected FundraisingGiftOrgBusinessFaxCountryDataObjectType orgBusinessFaxCountry;
    @XmlElement(name = "Org_eMail", required = true)
    protected FundraisingGiftOrgEMailDataObjectType orgEMail;
    @XmlElement(name = "Org_URL", required = true)
    protected FundraisingGiftOrgURLDataObjectType orgURL;
    @XmlElement(name = "Org_Messaging", required = true)
    protected FundraisingGiftOrgMessagingDataObjectType orgMessaging;
    @XmlElement(name = "Pledge", required = true)
    protected FundraisingGiftPledgeDataObjectType pledge;
    @XmlElement(name = "Premium", required = true)
    protected FundraisingGiftPremiumDataObjectType premium;
    @XmlElement(name = "Product_Code", required = true)
    protected FundraisingGiftProductCodeDataObjectType productCode;
    @XmlElement(name = "Product", required = true)
    protected FundraisingGiftProductDataObjectType product;
    @XmlElement(name = "Campaign_Code", required = true)
    protected FundraisingGiftCampaignCodeDataObjectType campaignCode;
    @XmlElement(name = "Fund_Code", required = true)
    protected FundraisingGiftFundCodeDataObjectType fundCode;
    @XmlElement(name = "Appeal_Code", required = true)
    protected FundraisingGiftAppealCodeDataObjectType appealCode;
    @XmlElement(name = "Package_Code", required = true)
    protected FundraisingGiftPackageCodeDataObjectType packageCode;
    @XmlElement(name = "Order_Detail_Schedule", required = true)
    protected FundraisingGiftOrderDetailScheduleDataObjectType orderDetailSchedule;
    @XmlElement(name = "Recognition_Customer", required = true)
    protected FundraisingGiftRecognitionCustomerDataObjectType recognitionCustomer;
    @XmlElement(name = "Tribute", required = true)
    protected FundraisingGiftTributeDataObjectType tribute;
    @XmlElement(name = "Tribute_Customer", required = true)
    protected FundraisingGiftTributeCustomerDataObjectType tributeCustomer;
    @XmlElement(name = "Gift_Type", required = true)
    protected FundraisingGiftGiftTypeDataObjectType giftType;
    @XmlElement(name = "Recogntion_Type", required = true)
    protected FundraisingGiftRecogntionTypeDataObjectType recogntionType;
    @XmlElement(name = "Contributor_Gift", required = true)
    protected FundraisingGiftContributorGiftDataObjectType contributorGift;
    @XmlElement(name = "Solicitor_Customer", required = true)
    protected FundraisingGiftSolicitorCustomerDataObjectType solicitorCustomer;
    @XmlElement(name = "Source_Code", required = true)
    protected FundraisingGiftSourceCodeDataObjectType sourceCode;
    @XmlElement(name = "ComplementaryGifts", required = true)
    protected FundraisingGiftComplementaryGiftsDataObjectType complementaryGifts;
    @XmlElement(name = "Invoice", required = true)
    protected FundraisingGiftInvoiceDataObjectType invoice;
    @XmlElement(name = "Payment", required = true)
    protected FundraisingGiftPaymentDataObjectType payment;
    @XmlElement(name = "Payment_Info", required = true)
    protected FundraisingGiftPaymentInfoDataObjectType paymentInfo;
    @XmlElement(name = "Payment_Method", required = true)
    protected FundraisingGiftPaymentMethodDataObjectType paymentMethod;
    @XmlElement(name = "Installment_Billing", required = true)
    protected FundraisingGiftInstallmentBillingDataObjectType installmentBilling;
    @XmlElement(name = "Gift_Price", required = true)
    protected FundraisingGiftGiftPriceDataObjectType giftPrice;
    @XmlElement(name = "Event", required = true)
    protected FundraisingGiftEventDataObjectType event;
    @XmlElement(name = "Registrant", required = true)
    protected FundraisingGiftRegistrantDataObjectType registrant;
    @XmlElement(name = "Registrant_Customer", required = true)
    protected FundraisingGiftRegistrantCustomerDataObjectType registrantCustomer;
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
     * Gets the value of the gift property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftGiftDataObjectType }
     *     
     */
    public FundraisingGiftGiftDataObjectType getGift() {
        return gift;
    }

    /**
     * Sets the value of the gift property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftGiftDataObjectType }
     *     
     */
    public void setGift(FundraisingGiftGiftDataObjectType value) {
        this.gift = value;
    }

    /**
     * Gets the value of the constituent property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftConstituentDataObjectType }
     *     
     */
    public FundraisingGiftConstituentDataObjectType getConstituent() {
        return constituent;
    }

    /**
     * Sets the value of the constituent property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftConstituentDataObjectType }
     *     
     */
    public void setConstituent(FundraisingGiftConstituentDataObjectType value) {
        this.constituent = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftCustomerDataObjectType }
     *     
     */
    public FundraisingGiftCustomerDataObjectType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftCustomerDataObjectType }
     *     
     */
    public void setCustomer(FundraisingGiftCustomerDataObjectType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the indivdiual property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftIndivdiualDataObjectType }
     *     
     */
    public FundraisingGiftIndivdiualDataObjectType getIndivdiual() {
        return indivdiual;
    }

    /**
     * Sets the value of the indivdiual property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftIndivdiualDataObjectType }
     *     
     */
    public void setIndivdiual(FundraisingGiftIndivdiualDataObjectType value) {
        this.indivdiual = value;
    }

    /**
     * Gets the value of the indBusinessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftIndBusinessAddressDataObjectType }
     *     
     */
    public FundraisingGiftIndBusinessAddressDataObjectType getIndBusinessAddress() {
        return indBusinessAddress;
    }

    /**
     * Sets the value of the indBusinessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftIndBusinessAddressDataObjectType }
     *     
     */
    public void setIndBusinessAddress(FundraisingGiftIndBusinessAddressDataObjectType value) {
        this.indBusinessAddress = value;
    }

    /**
     * Gets the value of the indBusinessAddressXRef property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftIndBusinessAddressXRefDataObjectType }
     *     
     */
    public FundraisingGiftIndBusinessAddressXRefDataObjectType getIndBusinessAddressXRef() {
        return indBusinessAddressXRef;
    }

    /**
     * Sets the value of the indBusinessAddressXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftIndBusinessAddressXRefDataObjectType }
     *     
     */
    public void setIndBusinessAddressXRef(FundraisingGiftIndBusinessAddressXRefDataObjectType value) {
        this.indBusinessAddressXRef = value;
    }

    /**
     * Gets the value of the indBusinessAddressCountry property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftIndBusinessAddressCountryDataObjectType }
     *     
     */
    public FundraisingGiftIndBusinessAddressCountryDataObjectType getIndBusinessAddressCountry() {
        return indBusinessAddressCountry;
    }

    /**
     * Sets the value of the indBusinessAddressCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftIndBusinessAddressCountryDataObjectType }
     *     
     */
    public void setIndBusinessAddressCountry(FundraisingGiftIndBusinessAddressCountryDataObjectType value) {
        this.indBusinessAddressCountry = value;
    }

    /**
     * Gets the value of the indBusinessPhone property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftIndBusinessPhoneDataObjectType }
     *     
     */
    public FundraisingGiftIndBusinessPhoneDataObjectType getIndBusinessPhone() {
        return indBusinessPhone;
    }

    /**
     * Sets the value of the indBusinessPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftIndBusinessPhoneDataObjectType }
     *     
     */
    public void setIndBusinessPhone(FundraisingGiftIndBusinessPhoneDataObjectType value) {
        this.indBusinessPhone = value;
    }

    /**
     * Gets the value of the indBusinessPhoneXRef property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftIndBusinessPhoneXRefDataObjectType }
     *     
     */
    public FundraisingGiftIndBusinessPhoneXRefDataObjectType getIndBusinessPhoneXRef() {
        return indBusinessPhoneXRef;
    }

    /**
     * Sets the value of the indBusinessPhoneXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftIndBusinessPhoneXRefDataObjectType }
     *     
     */
    public void setIndBusinessPhoneXRef(FundraisingGiftIndBusinessPhoneXRefDataObjectType value) {
        this.indBusinessPhoneXRef = value;
    }

    /**
     * Gets the value of the indBusinessPhoneCountry property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftIndBusinessPhoneCountryDataObjectType }
     *     
     */
    public FundraisingGiftIndBusinessPhoneCountryDataObjectType getIndBusinessPhoneCountry() {
        return indBusinessPhoneCountry;
    }

    /**
     * Sets the value of the indBusinessPhoneCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftIndBusinessPhoneCountryDataObjectType }
     *     
     */
    public void setIndBusinessPhoneCountry(FundraisingGiftIndBusinessPhoneCountryDataObjectType value) {
        this.indBusinessPhoneCountry = value;
    }

    /**
     * Gets the value of the indBusinessFax property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftIndBusinessFaxDataObjectType }
     *     
     */
    public FundraisingGiftIndBusinessFaxDataObjectType getIndBusinessFax() {
        return indBusinessFax;
    }

    /**
     * Sets the value of the indBusinessFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftIndBusinessFaxDataObjectType }
     *     
     */
    public void setIndBusinessFax(FundraisingGiftIndBusinessFaxDataObjectType value) {
        this.indBusinessFax = value;
    }

    /**
     * Gets the value of the indBusinessFaxXRef property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftIndBusinessFaxXRefDataObjectType }
     *     
     */
    public FundraisingGiftIndBusinessFaxXRefDataObjectType getIndBusinessFaxXRef() {
        return indBusinessFaxXRef;
    }

    /**
     * Sets the value of the indBusinessFaxXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftIndBusinessFaxXRefDataObjectType }
     *     
     */
    public void setIndBusinessFaxXRef(FundraisingGiftIndBusinessFaxXRefDataObjectType value) {
        this.indBusinessFaxXRef = value;
    }

    /**
     * Gets the value of the indBusinessFaxCountry property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftIndBusinessFaxCountryDataObjectType }
     *     
     */
    public FundraisingGiftIndBusinessFaxCountryDataObjectType getIndBusinessFaxCountry() {
        return indBusinessFaxCountry;
    }

    /**
     * Sets the value of the indBusinessFaxCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftIndBusinessFaxCountryDataObjectType }
     *     
     */
    public void setIndBusinessFaxCountry(FundraisingGiftIndBusinessFaxCountryDataObjectType value) {
        this.indBusinessFaxCountry = value;
    }

    /**
     * Gets the value of the indEMail property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftIndEMailDataObjectType }
     *     
     */
    public FundraisingGiftIndEMailDataObjectType getIndEMail() {
        return indEMail;
    }

    /**
     * Sets the value of the indEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftIndEMailDataObjectType }
     *     
     */
    public void setIndEMail(FundraisingGiftIndEMailDataObjectType value) {
        this.indEMail = value;
    }

    /**
     * Gets the value of the indURL property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftIndURLDataObjectType }
     *     
     */
    public FundraisingGiftIndURLDataObjectType getIndURL() {
        return indURL;
    }

    /**
     * Sets the value of the indURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftIndURLDataObjectType }
     *     
     */
    public void setIndURL(FundraisingGiftIndURLDataObjectType value) {
        this.indURL = value;
    }

    /**
     * Gets the value of the indMessaging property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftIndMessagingDataObjectType }
     *     
     */
    public FundraisingGiftIndMessagingDataObjectType getIndMessaging() {
        return indMessaging;
    }

    /**
     * Sets the value of the indMessaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftIndMessagingDataObjectType }
     *     
     */
    public void setIndMessaging(FundraisingGiftIndMessagingDataObjectType value) {
        this.indMessaging = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftOrganizationDataObjectType }
     *     
     */
    public FundraisingGiftOrganizationDataObjectType getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftOrganizationDataObjectType }
     *     
     */
    public void setOrganization(FundraisingGiftOrganizationDataObjectType value) {
        this.organization = value;
    }

    /**
     * Gets the value of the orgBusinessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftOrgBusinessAddressDataObjectType }
     *     
     */
    public FundraisingGiftOrgBusinessAddressDataObjectType getOrgBusinessAddress() {
        return orgBusinessAddress;
    }

    /**
     * Sets the value of the orgBusinessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftOrgBusinessAddressDataObjectType }
     *     
     */
    public void setOrgBusinessAddress(FundraisingGiftOrgBusinessAddressDataObjectType value) {
        this.orgBusinessAddress = value;
    }

    /**
     * Gets the value of the orgBusinessAddressXRef property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftOrgBusinessAddressXRefDataObjectType }
     *     
     */
    public FundraisingGiftOrgBusinessAddressXRefDataObjectType getOrgBusinessAddressXRef() {
        return orgBusinessAddressXRef;
    }

    /**
     * Sets the value of the orgBusinessAddressXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftOrgBusinessAddressXRefDataObjectType }
     *     
     */
    public void setOrgBusinessAddressXRef(FundraisingGiftOrgBusinessAddressXRefDataObjectType value) {
        this.orgBusinessAddressXRef = value;
    }

    /**
     * Gets the value of the orgBusinessAddressCountry property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftOrgBusinessAddressCountryDataObjectType }
     *     
     */
    public FundraisingGiftOrgBusinessAddressCountryDataObjectType getOrgBusinessAddressCountry() {
        return orgBusinessAddressCountry;
    }

    /**
     * Sets the value of the orgBusinessAddressCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftOrgBusinessAddressCountryDataObjectType }
     *     
     */
    public void setOrgBusinessAddressCountry(FundraisingGiftOrgBusinessAddressCountryDataObjectType value) {
        this.orgBusinessAddressCountry = value;
    }

    /**
     * Gets the value of the orgBusinessPhone property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftOrgBusinessPhoneDataObjectType }
     *     
     */
    public FundraisingGiftOrgBusinessPhoneDataObjectType getOrgBusinessPhone() {
        return orgBusinessPhone;
    }

    /**
     * Sets the value of the orgBusinessPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftOrgBusinessPhoneDataObjectType }
     *     
     */
    public void setOrgBusinessPhone(FundraisingGiftOrgBusinessPhoneDataObjectType value) {
        this.orgBusinessPhone = value;
    }

    /**
     * Gets the value of the orgBusinessPhoneXRef property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftOrgBusinessPhoneXRefDataObjectType }
     *     
     */
    public FundraisingGiftOrgBusinessPhoneXRefDataObjectType getOrgBusinessPhoneXRef() {
        return orgBusinessPhoneXRef;
    }

    /**
     * Sets the value of the orgBusinessPhoneXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftOrgBusinessPhoneXRefDataObjectType }
     *     
     */
    public void setOrgBusinessPhoneXRef(FundraisingGiftOrgBusinessPhoneXRefDataObjectType value) {
        this.orgBusinessPhoneXRef = value;
    }

    /**
     * Gets the value of the orgBusinessPhoneCountry property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftOrgBusinessPhoneCountryDataObjectType }
     *     
     */
    public FundraisingGiftOrgBusinessPhoneCountryDataObjectType getOrgBusinessPhoneCountry() {
        return orgBusinessPhoneCountry;
    }

    /**
     * Sets the value of the orgBusinessPhoneCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftOrgBusinessPhoneCountryDataObjectType }
     *     
     */
    public void setOrgBusinessPhoneCountry(FundraisingGiftOrgBusinessPhoneCountryDataObjectType value) {
        this.orgBusinessPhoneCountry = value;
    }

    /**
     * Gets the value of the orgBusinessFax property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftOrgBusinessFaxDataObjectType }
     *     
     */
    public FundraisingGiftOrgBusinessFaxDataObjectType getOrgBusinessFax() {
        return orgBusinessFax;
    }

    /**
     * Sets the value of the orgBusinessFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftOrgBusinessFaxDataObjectType }
     *     
     */
    public void setOrgBusinessFax(FundraisingGiftOrgBusinessFaxDataObjectType value) {
        this.orgBusinessFax = value;
    }

    /**
     * Gets the value of the orgBusinessFaxXRef property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftOrgBusinessFaxXRefDataObjectType }
     *     
     */
    public FundraisingGiftOrgBusinessFaxXRefDataObjectType getOrgBusinessFaxXRef() {
        return orgBusinessFaxXRef;
    }

    /**
     * Sets the value of the orgBusinessFaxXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftOrgBusinessFaxXRefDataObjectType }
     *     
     */
    public void setOrgBusinessFaxXRef(FundraisingGiftOrgBusinessFaxXRefDataObjectType value) {
        this.orgBusinessFaxXRef = value;
    }

    /**
     * Gets the value of the orgBusinessFaxCountry property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftOrgBusinessFaxCountryDataObjectType }
     *     
     */
    public FundraisingGiftOrgBusinessFaxCountryDataObjectType getOrgBusinessFaxCountry() {
        return orgBusinessFaxCountry;
    }

    /**
     * Sets the value of the orgBusinessFaxCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftOrgBusinessFaxCountryDataObjectType }
     *     
     */
    public void setOrgBusinessFaxCountry(FundraisingGiftOrgBusinessFaxCountryDataObjectType value) {
        this.orgBusinessFaxCountry = value;
    }

    /**
     * Gets the value of the orgEMail property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftOrgEMailDataObjectType }
     *     
     */
    public FundraisingGiftOrgEMailDataObjectType getOrgEMail() {
        return orgEMail;
    }

    /**
     * Sets the value of the orgEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftOrgEMailDataObjectType }
     *     
     */
    public void setOrgEMail(FundraisingGiftOrgEMailDataObjectType value) {
        this.orgEMail = value;
    }

    /**
     * Gets the value of the orgURL property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftOrgURLDataObjectType }
     *     
     */
    public FundraisingGiftOrgURLDataObjectType getOrgURL() {
        return orgURL;
    }

    /**
     * Sets the value of the orgURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftOrgURLDataObjectType }
     *     
     */
    public void setOrgURL(FundraisingGiftOrgURLDataObjectType value) {
        this.orgURL = value;
    }

    /**
     * Gets the value of the orgMessaging property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftOrgMessagingDataObjectType }
     *     
     */
    public FundraisingGiftOrgMessagingDataObjectType getOrgMessaging() {
        return orgMessaging;
    }

    /**
     * Sets the value of the orgMessaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftOrgMessagingDataObjectType }
     *     
     */
    public void setOrgMessaging(FundraisingGiftOrgMessagingDataObjectType value) {
        this.orgMessaging = value;
    }

    /**
     * Gets the value of the pledge property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftPledgeDataObjectType }
     *     
     */
    public FundraisingGiftPledgeDataObjectType getPledge() {
        return pledge;
    }

    /**
     * Sets the value of the pledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftPledgeDataObjectType }
     *     
     */
    public void setPledge(FundraisingGiftPledgeDataObjectType value) {
        this.pledge = value;
    }

    /**
     * Gets the value of the premium property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftPremiumDataObjectType }
     *     
     */
    public FundraisingGiftPremiumDataObjectType getPremium() {
        return premium;
    }

    /**
     * Sets the value of the premium property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftPremiumDataObjectType }
     *     
     */
    public void setPremium(FundraisingGiftPremiumDataObjectType value) {
        this.premium = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftProductCodeDataObjectType }
     *     
     */
    public FundraisingGiftProductCodeDataObjectType getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftProductCodeDataObjectType }
     *     
     */
    public void setProductCode(FundraisingGiftProductCodeDataObjectType value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftProductDataObjectType }
     *     
     */
    public FundraisingGiftProductDataObjectType getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftProductDataObjectType }
     *     
     */
    public void setProduct(FundraisingGiftProductDataObjectType value) {
        this.product = value;
    }

    /**
     * Gets the value of the campaignCode property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftCampaignCodeDataObjectType }
     *     
     */
    public FundraisingGiftCampaignCodeDataObjectType getCampaignCode() {
        return campaignCode;
    }

    /**
     * Sets the value of the campaignCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftCampaignCodeDataObjectType }
     *     
     */
    public void setCampaignCode(FundraisingGiftCampaignCodeDataObjectType value) {
        this.campaignCode = value;
    }

    /**
     * Gets the value of the fundCode property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftFundCodeDataObjectType }
     *     
     */
    public FundraisingGiftFundCodeDataObjectType getFundCode() {
        return fundCode;
    }

    /**
     * Sets the value of the fundCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftFundCodeDataObjectType }
     *     
     */
    public void setFundCode(FundraisingGiftFundCodeDataObjectType value) {
        this.fundCode = value;
    }

    /**
     * Gets the value of the appealCode property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftAppealCodeDataObjectType }
     *     
     */
    public FundraisingGiftAppealCodeDataObjectType getAppealCode() {
        return appealCode;
    }

    /**
     * Sets the value of the appealCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftAppealCodeDataObjectType }
     *     
     */
    public void setAppealCode(FundraisingGiftAppealCodeDataObjectType value) {
        this.appealCode = value;
    }

    /**
     * Gets the value of the packageCode property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftPackageCodeDataObjectType }
     *     
     */
    public FundraisingGiftPackageCodeDataObjectType getPackageCode() {
        return packageCode;
    }

    /**
     * Sets the value of the packageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftPackageCodeDataObjectType }
     *     
     */
    public void setPackageCode(FundraisingGiftPackageCodeDataObjectType value) {
        this.packageCode = value;
    }

    /**
     * Gets the value of the orderDetailSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftOrderDetailScheduleDataObjectType }
     *     
     */
    public FundraisingGiftOrderDetailScheduleDataObjectType getOrderDetailSchedule() {
        return orderDetailSchedule;
    }

    /**
     * Sets the value of the orderDetailSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftOrderDetailScheduleDataObjectType }
     *     
     */
    public void setOrderDetailSchedule(FundraisingGiftOrderDetailScheduleDataObjectType value) {
        this.orderDetailSchedule = value;
    }

    /**
     * Gets the value of the recognitionCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftRecognitionCustomerDataObjectType }
     *     
     */
    public FundraisingGiftRecognitionCustomerDataObjectType getRecognitionCustomer() {
        return recognitionCustomer;
    }

    /**
     * Sets the value of the recognitionCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftRecognitionCustomerDataObjectType }
     *     
     */
    public void setRecognitionCustomer(FundraisingGiftRecognitionCustomerDataObjectType value) {
        this.recognitionCustomer = value;
    }

    /**
     * Gets the value of the tribute property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftTributeDataObjectType }
     *     
     */
    public FundraisingGiftTributeDataObjectType getTribute() {
        return tribute;
    }

    /**
     * Sets the value of the tribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftTributeDataObjectType }
     *     
     */
    public void setTribute(FundraisingGiftTributeDataObjectType value) {
        this.tribute = value;
    }

    /**
     * Gets the value of the tributeCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftTributeCustomerDataObjectType }
     *     
     */
    public FundraisingGiftTributeCustomerDataObjectType getTributeCustomer() {
        return tributeCustomer;
    }

    /**
     * Sets the value of the tributeCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftTributeCustomerDataObjectType }
     *     
     */
    public void setTributeCustomer(FundraisingGiftTributeCustomerDataObjectType value) {
        this.tributeCustomer = value;
    }

    /**
     * Gets the value of the giftType property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftGiftTypeDataObjectType }
     *     
     */
    public FundraisingGiftGiftTypeDataObjectType getGiftType() {
        return giftType;
    }

    /**
     * Sets the value of the giftType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftGiftTypeDataObjectType }
     *     
     */
    public void setGiftType(FundraisingGiftGiftTypeDataObjectType value) {
        this.giftType = value;
    }

    /**
     * Gets the value of the recogntionType property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftRecogntionTypeDataObjectType }
     *     
     */
    public FundraisingGiftRecogntionTypeDataObjectType getRecogntionType() {
        return recogntionType;
    }

    /**
     * Sets the value of the recogntionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftRecogntionTypeDataObjectType }
     *     
     */
    public void setRecogntionType(FundraisingGiftRecogntionTypeDataObjectType value) {
        this.recogntionType = value;
    }

    /**
     * Gets the value of the contributorGift property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftContributorGiftDataObjectType }
     *     
     */
    public FundraisingGiftContributorGiftDataObjectType getContributorGift() {
        return contributorGift;
    }

    /**
     * Sets the value of the contributorGift property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftContributorGiftDataObjectType }
     *     
     */
    public void setContributorGift(FundraisingGiftContributorGiftDataObjectType value) {
        this.contributorGift = value;
    }

    /**
     * Gets the value of the solicitorCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftSolicitorCustomerDataObjectType }
     *     
     */
    public FundraisingGiftSolicitorCustomerDataObjectType getSolicitorCustomer() {
        return solicitorCustomer;
    }

    /**
     * Sets the value of the solicitorCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftSolicitorCustomerDataObjectType }
     *     
     */
    public void setSolicitorCustomer(FundraisingGiftSolicitorCustomerDataObjectType value) {
        this.solicitorCustomer = value;
    }

    /**
     * Gets the value of the sourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftSourceCodeDataObjectType }
     *     
     */
    public FundraisingGiftSourceCodeDataObjectType getSourceCode() {
        return sourceCode;
    }

    /**
     * Sets the value of the sourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftSourceCodeDataObjectType }
     *     
     */
    public void setSourceCode(FundraisingGiftSourceCodeDataObjectType value) {
        this.sourceCode = value;
    }

    /**
     * Gets the value of the complementaryGifts property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftComplementaryGiftsDataObjectType }
     *     
     */
    public FundraisingGiftComplementaryGiftsDataObjectType getComplementaryGifts() {
        return complementaryGifts;
    }

    /**
     * Sets the value of the complementaryGifts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftComplementaryGiftsDataObjectType }
     *     
     */
    public void setComplementaryGifts(FundraisingGiftComplementaryGiftsDataObjectType value) {
        this.complementaryGifts = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftInvoiceDataObjectType }
     *     
     */
    public FundraisingGiftInvoiceDataObjectType getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftInvoiceDataObjectType }
     *     
     */
    public void setInvoice(FundraisingGiftInvoiceDataObjectType value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftPaymentDataObjectType }
     *     
     */
    public FundraisingGiftPaymentDataObjectType getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftPaymentDataObjectType }
     *     
     */
    public void setPayment(FundraisingGiftPaymentDataObjectType value) {
        this.payment = value;
    }

    /**
     * Gets the value of the paymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftPaymentInfoDataObjectType }
     *     
     */
    public FundraisingGiftPaymentInfoDataObjectType getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * Sets the value of the paymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftPaymentInfoDataObjectType }
     *     
     */
    public void setPaymentInfo(FundraisingGiftPaymentInfoDataObjectType value) {
        this.paymentInfo = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftPaymentMethodDataObjectType }
     *     
     */
    public FundraisingGiftPaymentMethodDataObjectType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftPaymentMethodDataObjectType }
     *     
     */
    public void setPaymentMethod(FundraisingGiftPaymentMethodDataObjectType value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the installmentBilling property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftInstallmentBillingDataObjectType }
     *     
     */
    public FundraisingGiftInstallmentBillingDataObjectType getInstallmentBilling() {
        return installmentBilling;
    }

    /**
     * Sets the value of the installmentBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftInstallmentBillingDataObjectType }
     *     
     */
    public void setInstallmentBilling(FundraisingGiftInstallmentBillingDataObjectType value) {
        this.installmentBilling = value;
    }

    /**
     * Gets the value of the giftPrice property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftGiftPriceDataObjectType }
     *     
     */
    public FundraisingGiftGiftPriceDataObjectType getGiftPrice() {
        return giftPrice;
    }

    /**
     * Sets the value of the giftPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftGiftPriceDataObjectType }
     *     
     */
    public void setGiftPrice(FundraisingGiftGiftPriceDataObjectType value) {
        this.giftPrice = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftEventDataObjectType }
     *     
     */
    public FundraisingGiftEventDataObjectType getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftEventDataObjectType }
     *     
     */
    public void setEvent(FundraisingGiftEventDataObjectType value) {
        this.event = value;
    }

    /**
     * Gets the value of the registrant property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftRegistrantDataObjectType }
     *     
     */
    public FundraisingGiftRegistrantDataObjectType getRegistrant() {
        return registrant;
    }

    /**
     * Sets the value of the registrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftRegistrantDataObjectType }
     *     
     */
    public void setRegistrant(FundraisingGiftRegistrantDataObjectType value) {
        this.registrant = value;
    }

    /**
     * Gets the value of the registrantCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftRegistrantCustomerDataObjectType }
     *     
     */
    public FundraisingGiftRegistrantCustomerDataObjectType getRegistrantCustomer() {
        return registrantCustomer;
    }

    /**
     * Sets the value of the registrantCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftRegistrantCustomerDataObjectType }
     *     
     */
    public void setRegistrantCustomer(FundraisingGiftRegistrantCustomerDataObjectType value) {
        this.registrantCustomer = value;
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
