
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExhibitorBoothNewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExhibitorBoothNewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentKey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="Exhibitor_Booth" type="{http://www.avectra.com/2005/}ExhibitorBoothNew_Exhibitor_Booth_DataObjectType"/>
 *         &lt;element name="Exhibitor" type="{http://www.avectra.com/2005/}ExhibitorBoothNew_Exhibitor_DataObjectType"/>
 *         &lt;element name="Priority_Point_Detail" type="{http://www.avectra.com/2005/}ExhibitorBoothNew_Priority_Point_Detail_DataObjectType"/>
 *         &lt;element name="Booth_Complement" type="{http://www.avectra.com/2005/}ExhibitorBoothNew_Booth_Complement_DataObjectType"/>
 *         &lt;element name="Exhibit_Show" type="{http://www.avectra.com/2005/}ExhibitorBoothNew_Exhibit_Show_DataObjectType"/>
 *         &lt;element name="ExhibitorCustomer" type="{http://www.avectra.com/2005/}ExhibitorBoothNew_ExhibitorCustomer_DataObjectType"/>
 *         &lt;element name="Booth_Fee" type="{http://www.avectra.com/2005/}ExhibitorBoothNew_Booth_Fee_DataObjectType"/>
 *         &lt;element name="Exhibit_Booth" type="{http://www.avectra.com/2005/}ExhibitorBoothNew_Exhibit_Booth_DataObjectType"/>
 *         &lt;element name="Invoice" type="{http://www.avectra.com/2005/}ExhibitorBoothNew_Invoice_DataObjectType"/>
 *         &lt;element name="Payment" type="{http://www.avectra.com/2005/}ExhibitorBoothNew_Payment_DataObjectType"/>
 *         &lt;element name="Payment_Info" type="{http://www.avectra.com/2005/}ExhibitorBoothNew_Payment_Info_DataObjectType"/>
 *         &lt;element name="Payment_Method" type="{http://www.avectra.com/2005/}ExhibitorBoothNew_Payment_Method_DataObjectType"/>
 *         &lt;element name="Product" type="{http://www.avectra.com/2005/}ExhibitorBoothNew_Product_DataObjectType"/>
 *         &lt;element name="Booth_Number" type="{http://www.avectra.com/2005/}ExhibitorBoothNew_Booth_Number_DataObjectType"/>
 *         &lt;element name="Booth_Type" type="{http://www.avectra.com/2005/}ExhibitorBoothNew_Booth_Type_DataObjectType"/>
 *         &lt;element name="Booth_Category" type="{http://www.avectra.com/2005/}ExhibitorBoothNew_Booth_Category_DataObjectType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExhibitorBoothNewType", propOrder = {
    "currentKey",
    "exhibitorBooth",
    "exhibitor",
    "priorityPointDetail",
    "boothComplement",
    "exhibitShow",
    "exhibitorCustomer",
    "boothFee",
    "exhibitBooth",
    "invoice",
    "payment",
    "paymentInfo",
    "paymentMethod",
    "product",
    "boothNumber",
    "boothType",
    "boothCategory"
})
public class ExhibitorBoothNewType {

    @XmlElementRef(name = "CurrentKey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> currentKey;
    @XmlElement(name = "Exhibitor_Booth", required = true)
    protected ExhibitorBoothNewExhibitorBoothDataObjectType exhibitorBooth;
    @XmlElement(name = "Exhibitor", required = true)
    protected ExhibitorBoothNewExhibitorDataObjectType exhibitor;
    @XmlElement(name = "Priority_Point_Detail", required = true)
    protected ExhibitorBoothNewPriorityPointDetailDataObjectType priorityPointDetail;
    @XmlElement(name = "Booth_Complement", required = true)
    protected ExhibitorBoothNewBoothComplementDataObjectType boothComplement;
    @XmlElement(name = "Exhibit_Show", required = true)
    protected ExhibitorBoothNewExhibitShowDataObjectType exhibitShow;
    @XmlElement(name = "ExhibitorCustomer", required = true)
    protected ExhibitorBoothNewExhibitorCustomerDataObjectType exhibitorCustomer;
    @XmlElement(name = "Booth_Fee", required = true)
    protected ExhibitorBoothNewBoothFeeDataObjectType boothFee;
    @XmlElement(name = "Exhibit_Booth", required = true)
    protected ExhibitorBoothNewExhibitBoothDataObjectType exhibitBooth;
    @XmlElement(name = "Invoice", required = true)
    protected ExhibitorBoothNewInvoiceDataObjectType invoice;
    @XmlElement(name = "Payment", required = true)
    protected ExhibitorBoothNewPaymentDataObjectType payment;
    @XmlElement(name = "Payment_Info", required = true)
    protected ExhibitorBoothNewPaymentInfoDataObjectType paymentInfo;
    @XmlElement(name = "Payment_Method", required = true)
    protected ExhibitorBoothNewPaymentMethodDataObjectType paymentMethod;
    @XmlElement(name = "Product", required = true)
    protected ExhibitorBoothNewProductDataObjectType product;
    @XmlElement(name = "Booth_Number", required = true)
    protected ExhibitorBoothNewBoothNumberDataObjectType boothNumber;
    @XmlElement(name = "Booth_Type", required = true)
    protected ExhibitorBoothNewBoothTypeDataObjectType boothType;
    @XmlElement(name = "Booth_Category", required = true)
    protected ExhibitorBoothNewBoothCategoryDataObjectType boothCategory;

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
     * Gets the value of the exhibitorBooth property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorBoothNewExhibitorBoothDataObjectType }
     *     
     */
    public ExhibitorBoothNewExhibitorBoothDataObjectType getExhibitorBooth() {
        return exhibitorBooth;
    }

    /**
     * Sets the value of the exhibitorBooth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorBoothNewExhibitorBoothDataObjectType }
     *     
     */
    public void setExhibitorBooth(ExhibitorBoothNewExhibitorBoothDataObjectType value) {
        this.exhibitorBooth = value;
    }

    /**
     * Gets the value of the exhibitor property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorBoothNewExhibitorDataObjectType }
     *     
     */
    public ExhibitorBoothNewExhibitorDataObjectType getExhibitor() {
        return exhibitor;
    }

    /**
     * Sets the value of the exhibitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorBoothNewExhibitorDataObjectType }
     *     
     */
    public void setExhibitor(ExhibitorBoothNewExhibitorDataObjectType value) {
        this.exhibitor = value;
    }

    /**
     * Gets the value of the priorityPointDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorBoothNewPriorityPointDetailDataObjectType }
     *     
     */
    public ExhibitorBoothNewPriorityPointDetailDataObjectType getPriorityPointDetail() {
        return priorityPointDetail;
    }

    /**
     * Sets the value of the priorityPointDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorBoothNewPriorityPointDetailDataObjectType }
     *     
     */
    public void setPriorityPointDetail(ExhibitorBoothNewPriorityPointDetailDataObjectType value) {
        this.priorityPointDetail = value;
    }

    /**
     * Gets the value of the boothComplement property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorBoothNewBoothComplementDataObjectType }
     *     
     */
    public ExhibitorBoothNewBoothComplementDataObjectType getBoothComplement() {
        return boothComplement;
    }

    /**
     * Sets the value of the boothComplement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorBoothNewBoothComplementDataObjectType }
     *     
     */
    public void setBoothComplement(ExhibitorBoothNewBoothComplementDataObjectType value) {
        this.boothComplement = value;
    }

    /**
     * Gets the value of the exhibitShow property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorBoothNewExhibitShowDataObjectType }
     *     
     */
    public ExhibitorBoothNewExhibitShowDataObjectType getExhibitShow() {
        return exhibitShow;
    }

    /**
     * Sets the value of the exhibitShow property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorBoothNewExhibitShowDataObjectType }
     *     
     */
    public void setExhibitShow(ExhibitorBoothNewExhibitShowDataObjectType value) {
        this.exhibitShow = value;
    }

    /**
     * Gets the value of the exhibitorCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorBoothNewExhibitorCustomerDataObjectType }
     *     
     */
    public ExhibitorBoothNewExhibitorCustomerDataObjectType getExhibitorCustomer() {
        return exhibitorCustomer;
    }

    /**
     * Sets the value of the exhibitorCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorBoothNewExhibitorCustomerDataObjectType }
     *     
     */
    public void setExhibitorCustomer(ExhibitorBoothNewExhibitorCustomerDataObjectType value) {
        this.exhibitorCustomer = value;
    }

    /**
     * Gets the value of the boothFee property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorBoothNewBoothFeeDataObjectType }
     *     
     */
    public ExhibitorBoothNewBoothFeeDataObjectType getBoothFee() {
        return boothFee;
    }

    /**
     * Sets the value of the boothFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorBoothNewBoothFeeDataObjectType }
     *     
     */
    public void setBoothFee(ExhibitorBoothNewBoothFeeDataObjectType value) {
        this.boothFee = value;
    }

    /**
     * Gets the value of the exhibitBooth property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorBoothNewExhibitBoothDataObjectType }
     *     
     */
    public ExhibitorBoothNewExhibitBoothDataObjectType getExhibitBooth() {
        return exhibitBooth;
    }

    /**
     * Sets the value of the exhibitBooth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorBoothNewExhibitBoothDataObjectType }
     *     
     */
    public void setExhibitBooth(ExhibitorBoothNewExhibitBoothDataObjectType value) {
        this.exhibitBooth = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorBoothNewInvoiceDataObjectType }
     *     
     */
    public ExhibitorBoothNewInvoiceDataObjectType getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorBoothNewInvoiceDataObjectType }
     *     
     */
    public void setInvoice(ExhibitorBoothNewInvoiceDataObjectType value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorBoothNewPaymentDataObjectType }
     *     
     */
    public ExhibitorBoothNewPaymentDataObjectType getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorBoothNewPaymentDataObjectType }
     *     
     */
    public void setPayment(ExhibitorBoothNewPaymentDataObjectType value) {
        this.payment = value;
    }

    /**
     * Gets the value of the paymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorBoothNewPaymentInfoDataObjectType }
     *     
     */
    public ExhibitorBoothNewPaymentInfoDataObjectType getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * Sets the value of the paymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorBoothNewPaymentInfoDataObjectType }
     *     
     */
    public void setPaymentInfo(ExhibitorBoothNewPaymentInfoDataObjectType value) {
        this.paymentInfo = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorBoothNewPaymentMethodDataObjectType }
     *     
     */
    public ExhibitorBoothNewPaymentMethodDataObjectType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorBoothNewPaymentMethodDataObjectType }
     *     
     */
    public void setPaymentMethod(ExhibitorBoothNewPaymentMethodDataObjectType value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorBoothNewProductDataObjectType }
     *     
     */
    public ExhibitorBoothNewProductDataObjectType getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorBoothNewProductDataObjectType }
     *     
     */
    public void setProduct(ExhibitorBoothNewProductDataObjectType value) {
        this.product = value;
    }

    /**
     * Gets the value of the boothNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorBoothNewBoothNumberDataObjectType }
     *     
     */
    public ExhibitorBoothNewBoothNumberDataObjectType getBoothNumber() {
        return boothNumber;
    }

    /**
     * Sets the value of the boothNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorBoothNewBoothNumberDataObjectType }
     *     
     */
    public void setBoothNumber(ExhibitorBoothNewBoothNumberDataObjectType value) {
        this.boothNumber = value;
    }

    /**
     * Gets the value of the boothType property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorBoothNewBoothTypeDataObjectType }
     *     
     */
    public ExhibitorBoothNewBoothTypeDataObjectType getBoothType() {
        return boothType;
    }

    /**
     * Sets the value of the boothType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorBoothNewBoothTypeDataObjectType }
     *     
     */
    public void setBoothType(ExhibitorBoothNewBoothTypeDataObjectType value) {
        this.boothType = value;
    }

    /**
     * Gets the value of the boothCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorBoothNewBoothCategoryDataObjectType }
     *     
     */
    public ExhibitorBoothNewBoothCategoryDataObjectType getBoothCategory() {
        return boothCategory;
    }

    /**
     * Sets the value of the boothCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorBoothNewBoothCategoryDataObjectType }
     *     
     */
    public void setBoothCategory(ExhibitorBoothNewBoothCategoryDataObjectType value) {
        this.boothCategory = value;
    }

}
