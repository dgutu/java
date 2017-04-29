
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentKey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="Invoice_Detail" type="{http://www.avectra.com/2005/}InvoiceDetail_Invoice_Detail_DataObjectType"/>
 *         &lt;element name="Invoice_Detail_Term" type="{http://www.avectra.com/2005/}InvoiceDetail_Invoice_Detail_Term_DataObjectType"/>
 *         &lt;element name="Invoice" type="{http://www.avectra.com/2005/}InvoiceDetail_Invoice_DataObjectType"/>
 *         &lt;element name="Price" type="{http://www.avectra.com/2005/}InvoiceDetail_Price_DataObjectType"/>
 *         &lt;element name="Product" type="{http://www.avectra.com/2005/}InvoiceDetail_Product_DataObjectType"/>
 *         &lt;element name="ShipToCustomer" type="{http://www.avectra.com/2005/}InvoiceDetail_ShipToCustomer_DataObjectType"/>
 *         &lt;element name="SoldToCustomer" type="{http://www.avectra.com/2005/}InvoiceDetail_SoldToCustomer_DataObjectType"/>
 *         &lt;element name="Shipping_Address" type="{http://www.avectra.com/2005/}InvoiceDetail_Shipping_Address_DataObjectType"/>
 *         &lt;element name="Shipping_Address_Type" type="{http://www.avectra.com/2005/}InvoiceDetail_Shipping_Address_Type_DataObjectType"/>
 *         &lt;element name="Invoice_Detail_Additional" type="{http://www.avectra.com/2005/}InvoiceDetail_Invoice_Detail_Additional_DataObjectType"/>
 *         &lt;element name="Package_Component" type="{http://www.avectra.com/2005/}InvoiceDetail_Package_Component_DataObjectType"/>
 *         &lt;element name="Bundle_Component" type="{http://www.avectra.com/2005/}InvoiceDetail_Bundle_Component_DataObjectType"/>
 *         &lt;element name="Product_Type" type="{http://www.avectra.com/2005/}InvoiceDetail_Product_Type_DataObjectType"/>
 *         &lt;element name="Discount_Product_X_Product" type="{http://www.avectra.com/2005/}InvoiceDetail_Discount_Product_X_Product_DataObjectType"/>
 *         &lt;element name="Billing_Address" type="{http://www.avectra.com/2005/}InvoiceDetail_Billing_Address_DataObjectType"/>
 *         &lt;element name="Currency" type="{http://www.avectra.com/2005/}InvoiceDetail_Currency_DataObjectType"/>
 *         &lt;element name="Order_Detail_Schedule" type="{http://www.avectra.com/2005/}InvoiceDetail_Order_Detail_Schedule_DataObjectType"/>
 *         &lt;element name="Invoice_Detail_IP_Range" type="{http://www.avectra.com/2005/}InvoiceDetail_Invoice_Detail_IP_Range_DataObjectType"/>
 *         &lt;element name="Product_Type_Social_Messages" type="{http://www.avectra.com/2005/}InvoiceDetail_Product_Type_Social_Messages_DataObjectType"/>
 *         &lt;element name="Additional_Invoice_DetailCollection" type="{http://www.avectra.com/2005/}Additional_Invoice_DetailCollectionType"/>
 *         &lt;element name="Invoice_Detail_AdditionalCollection" type="{http://www.avectra.com/2005/}Invoice_Detail_AdditionalCollectionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceDetailType", propOrder = {
    "currentKey",
    "invoiceDetail",
    "invoiceDetailTerm",
    "invoice",
    "price",
    "product",
    "shipToCustomer",
    "soldToCustomer",
    "shippingAddress",
    "shippingAddressType",
    "invoiceDetailAdditional",
    "packageComponent",
    "bundleComponent",
    "productType",
    "discountProductXProduct",
    "billingAddress",
    "currency",
    "orderDetailSchedule",
    "invoiceDetailIPRange",
    "productTypeSocialMessages",
    "additionalInvoiceDetailCollection",
    "invoiceDetailAdditionalCollection"
})
public class InvoiceDetailType {

    @XmlElementRef(name = "CurrentKey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> currentKey;
    @XmlElement(name = "Invoice_Detail", required = true)
    protected InvoiceDetailInvoiceDetailDataObjectType invoiceDetail;
    @XmlElement(name = "Invoice_Detail_Term", required = true)
    protected InvoiceDetailInvoiceDetailTermDataObjectType invoiceDetailTerm;
    @XmlElement(name = "Invoice", required = true)
    protected InvoiceDetailInvoiceDataObjectType invoice;
    @XmlElement(name = "Price", required = true)
    protected InvoiceDetailPriceDataObjectType price;
    @XmlElement(name = "Product", required = true)
    protected InvoiceDetailProductDataObjectType product;
    @XmlElement(name = "ShipToCustomer", required = true)
    protected InvoiceDetailShipToCustomerDataObjectType shipToCustomer;
    @XmlElement(name = "SoldToCustomer", required = true)
    protected InvoiceDetailSoldToCustomerDataObjectType soldToCustomer;
    @XmlElement(name = "Shipping_Address", required = true)
    protected InvoiceDetailShippingAddressDataObjectType shippingAddress;
    @XmlElement(name = "Shipping_Address_Type", required = true)
    protected InvoiceDetailShippingAddressTypeDataObjectType shippingAddressType;
    @XmlElement(name = "Invoice_Detail_Additional", required = true)
    protected InvoiceDetailInvoiceDetailAdditionalDataObjectType invoiceDetailAdditional;
    @XmlElement(name = "Package_Component", required = true)
    protected InvoiceDetailPackageComponentDataObjectType packageComponent;
    @XmlElement(name = "Bundle_Component", required = true)
    protected InvoiceDetailBundleComponentDataObjectType bundleComponent;
    @XmlElement(name = "Product_Type", required = true)
    protected InvoiceDetailProductTypeDataObjectType productType;
    @XmlElement(name = "Discount_Product_X_Product", required = true)
    protected InvoiceDetailDiscountProductXProductDataObjectType discountProductXProduct;
    @XmlElement(name = "Billing_Address", required = true)
    protected InvoiceDetailBillingAddressDataObjectType billingAddress;
    @XmlElement(name = "Currency", required = true)
    protected InvoiceDetailCurrencyDataObjectType currency;
    @XmlElement(name = "Order_Detail_Schedule", required = true)
    protected InvoiceDetailOrderDetailScheduleDataObjectType orderDetailSchedule;
    @XmlElement(name = "Invoice_Detail_IP_Range", required = true)
    protected InvoiceDetailInvoiceDetailIPRangeDataObjectType invoiceDetailIPRange;
    @XmlElement(name = "Product_Type_Social_Messages", required = true)
    protected InvoiceDetailProductTypeSocialMessagesDataObjectType productTypeSocialMessages;
    @XmlElement(name = "Additional_Invoice_DetailCollection", required = true)
    protected AdditionalInvoiceDetailCollectionType additionalInvoiceDetailCollection;
    @XmlElement(name = "Invoice_Detail_AdditionalCollection", required = true)
    protected InvoiceDetailAdditionalCollectionType invoiceDetailAdditionalCollection;

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
     * Gets the value of the invoiceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailInvoiceDetailDataObjectType }
     *     
     */
    public InvoiceDetailInvoiceDetailDataObjectType getInvoiceDetail() {
        return invoiceDetail;
    }

    /**
     * Sets the value of the invoiceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailInvoiceDetailDataObjectType }
     *     
     */
    public void setInvoiceDetail(InvoiceDetailInvoiceDetailDataObjectType value) {
        this.invoiceDetail = value;
    }

    /**
     * Gets the value of the invoiceDetailTerm property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailInvoiceDetailTermDataObjectType }
     *     
     */
    public InvoiceDetailInvoiceDetailTermDataObjectType getInvoiceDetailTerm() {
        return invoiceDetailTerm;
    }

    /**
     * Sets the value of the invoiceDetailTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailInvoiceDetailTermDataObjectType }
     *     
     */
    public void setInvoiceDetailTerm(InvoiceDetailInvoiceDetailTermDataObjectType value) {
        this.invoiceDetailTerm = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailInvoiceDataObjectType }
     *     
     */
    public InvoiceDetailInvoiceDataObjectType getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailInvoiceDataObjectType }
     *     
     */
    public void setInvoice(InvoiceDetailInvoiceDataObjectType value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailPriceDataObjectType }
     *     
     */
    public InvoiceDetailPriceDataObjectType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailPriceDataObjectType }
     *     
     */
    public void setPrice(InvoiceDetailPriceDataObjectType value) {
        this.price = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailProductDataObjectType }
     *     
     */
    public InvoiceDetailProductDataObjectType getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailProductDataObjectType }
     *     
     */
    public void setProduct(InvoiceDetailProductDataObjectType value) {
        this.product = value;
    }

    /**
     * Gets the value of the shipToCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailShipToCustomerDataObjectType }
     *     
     */
    public InvoiceDetailShipToCustomerDataObjectType getShipToCustomer() {
        return shipToCustomer;
    }

    /**
     * Sets the value of the shipToCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailShipToCustomerDataObjectType }
     *     
     */
    public void setShipToCustomer(InvoiceDetailShipToCustomerDataObjectType value) {
        this.shipToCustomer = value;
    }

    /**
     * Gets the value of the soldToCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailSoldToCustomerDataObjectType }
     *     
     */
    public InvoiceDetailSoldToCustomerDataObjectType getSoldToCustomer() {
        return soldToCustomer;
    }

    /**
     * Sets the value of the soldToCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailSoldToCustomerDataObjectType }
     *     
     */
    public void setSoldToCustomer(InvoiceDetailSoldToCustomerDataObjectType value) {
        this.soldToCustomer = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailShippingAddressDataObjectType }
     *     
     */
    public InvoiceDetailShippingAddressDataObjectType getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailShippingAddressDataObjectType }
     *     
     */
    public void setShippingAddress(InvoiceDetailShippingAddressDataObjectType value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the shippingAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailShippingAddressTypeDataObjectType }
     *     
     */
    public InvoiceDetailShippingAddressTypeDataObjectType getShippingAddressType() {
        return shippingAddressType;
    }

    /**
     * Sets the value of the shippingAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailShippingAddressTypeDataObjectType }
     *     
     */
    public void setShippingAddressType(InvoiceDetailShippingAddressTypeDataObjectType value) {
        this.shippingAddressType = value;
    }

    /**
     * Gets the value of the invoiceDetailAdditional property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailInvoiceDetailAdditionalDataObjectType }
     *     
     */
    public InvoiceDetailInvoiceDetailAdditionalDataObjectType getInvoiceDetailAdditional() {
        return invoiceDetailAdditional;
    }

    /**
     * Sets the value of the invoiceDetailAdditional property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailInvoiceDetailAdditionalDataObjectType }
     *     
     */
    public void setInvoiceDetailAdditional(InvoiceDetailInvoiceDetailAdditionalDataObjectType value) {
        this.invoiceDetailAdditional = value;
    }

    /**
     * Gets the value of the packageComponent property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailPackageComponentDataObjectType }
     *     
     */
    public InvoiceDetailPackageComponentDataObjectType getPackageComponent() {
        return packageComponent;
    }

    /**
     * Sets the value of the packageComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailPackageComponentDataObjectType }
     *     
     */
    public void setPackageComponent(InvoiceDetailPackageComponentDataObjectType value) {
        this.packageComponent = value;
    }

    /**
     * Gets the value of the bundleComponent property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailBundleComponentDataObjectType }
     *     
     */
    public InvoiceDetailBundleComponentDataObjectType getBundleComponent() {
        return bundleComponent;
    }

    /**
     * Sets the value of the bundleComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailBundleComponentDataObjectType }
     *     
     */
    public void setBundleComponent(InvoiceDetailBundleComponentDataObjectType value) {
        this.bundleComponent = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailProductTypeDataObjectType }
     *     
     */
    public InvoiceDetailProductTypeDataObjectType getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailProductTypeDataObjectType }
     *     
     */
    public void setProductType(InvoiceDetailProductTypeDataObjectType value) {
        this.productType = value;
    }

    /**
     * Gets the value of the discountProductXProduct property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailDiscountProductXProductDataObjectType }
     *     
     */
    public InvoiceDetailDiscountProductXProductDataObjectType getDiscountProductXProduct() {
        return discountProductXProduct;
    }

    /**
     * Sets the value of the discountProductXProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailDiscountProductXProductDataObjectType }
     *     
     */
    public void setDiscountProductXProduct(InvoiceDetailDiscountProductXProductDataObjectType value) {
        this.discountProductXProduct = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailBillingAddressDataObjectType }
     *     
     */
    public InvoiceDetailBillingAddressDataObjectType getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailBillingAddressDataObjectType }
     *     
     */
    public void setBillingAddress(InvoiceDetailBillingAddressDataObjectType value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailCurrencyDataObjectType }
     *     
     */
    public InvoiceDetailCurrencyDataObjectType getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailCurrencyDataObjectType }
     *     
     */
    public void setCurrency(InvoiceDetailCurrencyDataObjectType value) {
        this.currency = value;
    }

    /**
     * Gets the value of the orderDetailSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailOrderDetailScheduleDataObjectType }
     *     
     */
    public InvoiceDetailOrderDetailScheduleDataObjectType getOrderDetailSchedule() {
        return orderDetailSchedule;
    }

    /**
     * Sets the value of the orderDetailSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailOrderDetailScheduleDataObjectType }
     *     
     */
    public void setOrderDetailSchedule(InvoiceDetailOrderDetailScheduleDataObjectType value) {
        this.orderDetailSchedule = value;
    }

    /**
     * Gets the value of the invoiceDetailIPRange property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailInvoiceDetailIPRangeDataObjectType }
     *     
     */
    public InvoiceDetailInvoiceDetailIPRangeDataObjectType getInvoiceDetailIPRange() {
        return invoiceDetailIPRange;
    }

    /**
     * Sets the value of the invoiceDetailIPRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailInvoiceDetailIPRangeDataObjectType }
     *     
     */
    public void setInvoiceDetailIPRange(InvoiceDetailInvoiceDetailIPRangeDataObjectType value) {
        this.invoiceDetailIPRange = value;
    }

    /**
     * Gets the value of the productTypeSocialMessages property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailProductTypeSocialMessagesDataObjectType }
     *     
     */
    public InvoiceDetailProductTypeSocialMessagesDataObjectType getProductTypeSocialMessages() {
        return productTypeSocialMessages;
    }

    /**
     * Sets the value of the productTypeSocialMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailProductTypeSocialMessagesDataObjectType }
     *     
     */
    public void setProductTypeSocialMessages(InvoiceDetailProductTypeSocialMessagesDataObjectType value) {
        this.productTypeSocialMessages = value;
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
     * Gets the value of the invoiceDetailAdditionalCollection property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailAdditionalCollectionType }
     *     
     */
    public InvoiceDetailAdditionalCollectionType getInvoiceDetailAdditionalCollection() {
        return invoiceDetailAdditionalCollection;
    }

    /**
     * Sets the value of the invoiceDetailAdditionalCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailAdditionalCollectionType }
     *     
     */
    public void setInvoiceDetailAdditionalCollection(InvoiceDetailAdditionalCollectionType value) {
        this.invoiceDetailAdditionalCollection = value;
    }

}
