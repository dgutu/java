
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebUserType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebUserType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentKey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="Individual" type="{http://www.avectra.com/2005/}WebUser_Individual_DataObjectType"/>
 *         &lt;element name="Customer" type="{http://www.avectra.com/2005/}WebUser_Customer_DataObjectType"/>
 *         &lt;element name="Email" type="{http://www.avectra.com/2005/}WebUser_Email_DataObjectType"/>
 *         &lt;element name="Business_Address" type="{http://www.avectra.com/2005/}WebUser_Business_Address_DataObjectType"/>
 *         &lt;element name="Business_Phone_XRef" type="{http://www.avectra.com/2005/}WebUser_Business_Phone_XRef_DataObjectType"/>
 *         &lt;element name="Business_Phone" type="{http://www.avectra.com/2005/}WebUser_Business_Phone_DataObjectType"/>
 *         &lt;element name="Business_Fax_XRef" type="{http://www.avectra.com/2005/}WebUser_Business_Fax_XRef_DataObjectType"/>
 *         &lt;element name="Business_Fax" type="{http://www.avectra.com/2005/}WebUser_Business_Fax_DataObjectType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebUserType", propOrder = {
    "currentKey",
    "individual",
    "customer",
    "email",
    "businessAddress",
    "businessPhoneXRef",
    "businessPhone",
    "businessFaxXRef",
    "businessFax"
})
public class WebUserType {

    @XmlElementRef(name = "CurrentKey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> currentKey;
    @XmlElement(name = "Individual", required = true)
    protected WebUserIndividualDataObjectType individual;
    @XmlElement(name = "Customer", required = true)
    protected WebUserCustomerDataObjectType customer;
    @XmlElement(name = "Email", required = true)
    protected WebUserEmailDataObjectType email;
    @XmlElement(name = "Business_Address", required = true)
    protected WebUserBusinessAddressDataObjectType businessAddress;
    @XmlElement(name = "Business_Phone_XRef", required = true)
    protected WebUserBusinessPhoneXRefDataObjectType businessPhoneXRef;
    @XmlElement(name = "Business_Phone", required = true)
    protected WebUserBusinessPhoneDataObjectType businessPhone;
    @XmlElement(name = "Business_Fax_XRef", required = true)
    protected WebUserBusinessFaxXRefDataObjectType businessFaxXRef;
    @XmlElement(name = "Business_Fax", required = true)
    protected WebUserBusinessFaxDataObjectType businessFax;

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
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link WebUserIndividualDataObjectType }
     *     
     */
    public WebUserIndividualDataObjectType getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebUserIndividualDataObjectType }
     *     
     */
    public void setIndividual(WebUserIndividualDataObjectType value) {
        this.individual = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link WebUserCustomerDataObjectType }
     *     
     */
    public WebUserCustomerDataObjectType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebUserCustomerDataObjectType }
     *     
     */
    public void setCustomer(WebUserCustomerDataObjectType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link WebUserEmailDataObjectType }
     *     
     */
    public WebUserEmailDataObjectType getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebUserEmailDataObjectType }
     *     
     */
    public void setEmail(WebUserEmailDataObjectType value) {
        this.email = value;
    }

    /**
     * Gets the value of the businessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link WebUserBusinessAddressDataObjectType }
     *     
     */
    public WebUserBusinessAddressDataObjectType getBusinessAddress() {
        return businessAddress;
    }

    /**
     * Sets the value of the businessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebUserBusinessAddressDataObjectType }
     *     
     */
    public void setBusinessAddress(WebUserBusinessAddressDataObjectType value) {
        this.businessAddress = value;
    }

    /**
     * Gets the value of the businessPhoneXRef property.
     * 
     * @return
     *     possible object is
     *     {@link WebUserBusinessPhoneXRefDataObjectType }
     *     
     */
    public WebUserBusinessPhoneXRefDataObjectType getBusinessPhoneXRef() {
        return businessPhoneXRef;
    }

    /**
     * Sets the value of the businessPhoneXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebUserBusinessPhoneXRefDataObjectType }
     *     
     */
    public void setBusinessPhoneXRef(WebUserBusinessPhoneXRefDataObjectType value) {
        this.businessPhoneXRef = value;
    }

    /**
     * Gets the value of the businessPhone property.
     * 
     * @return
     *     possible object is
     *     {@link WebUserBusinessPhoneDataObjectType }
     *     
     */
    public WebUserBusinessPhoneDataObjectType getBusinessPhone() {
        return businessPhone;
    }

    /**
     * Sets the value of the businessPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebUserBusinessPhoneDataObjectType }
     *     
     */
    public void setBusinessPhone(WebUserBusinessPhoneDataObjectType value) {
        this.businessPhone = value;
    }

    /**
     * Gets the value of the businessFaxXRef property.
     * 
     * @return
     *     possible object is
     *     {@link WebUserBusinessFaxXRefDataObjectType }
     *     
     */
    public WebUserBusinessFaxXRefDataObjectType getBusinessFaxXRef() {
        return businessFaxXRef;
    }

    /**
     * Sets the value of the businessFaxXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebUserBusinessFaxXRefDataObjectType }
     *     
     */
    public void setBusinessFaxXRef(WebUserBusinessFaxXRefDataObjectType value) {
        this.businessFaxXRef = value;
    }

    /**
     * Gets the value of the businessFax property.
     * 
     * @return
     *     possible object is
     *     {@link WebUserBusinessFaxDataObjectType }
     *     
     */
    public WebUserBusinessFaxDataObjectType getBusinessFax() {
        return businessFax;
    }

    /**
     * Sets the value of the businessFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebUserBusinessFaxDataObjectType }
     *     
     */
    public void setBusinessFax(WebUserBusinessFaxDataObjectType value) {
        this.businessFax = value;
    }

}
