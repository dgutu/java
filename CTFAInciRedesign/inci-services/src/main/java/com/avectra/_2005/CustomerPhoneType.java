
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerPhoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerPhoneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentKey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="Phone_XRef" type="{http://www.avectra.com/2005/}IndividualPhone_Phone_XRef_DataObjectType"/>
 *         &lt;element name="Customer" type="{http://www.avectra.com/2005/}IndividualPhone_Customer_DataObjectType"/>
 *         &lt;element name="Phone" type="{http://www.avectra.com/2005/}IndividualPhone_Phone_DataObjectType"/>
 *         &lt;element name="Country" type="{http://www.avectra.com/2005/}IndividualPhone_Country_DataObjectType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerPhoneType", propOrder = {
    "currentKey",
    "phoneXRef",
    "customer",
    "phone",
    "country"
})
public class CustomerPhoneType {

    @XmlElementRef(name = "CurrentKey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> currentKey;
    @XmlElement(name = "Phone_XRef", required = true)
    protected IndividualPhonePhoneXRefDataObjectType phoneXRef;
    @XmlElement(name = "Customer", required = true)
    protected IndividualPhoneCustomerDataObjectType customer;
    @XmlElement(name = "Phone", required = true)
    protected IndividualPhonePhoneDataObjectType phone;
    @XmlElement(name = "Country", required = true)
    protected IndividualPhoneCountryDataObjectType country;

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
     * Gets the value of the phoneXRef property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPhonePhoneXRefDataObjectType }
     *     
     */
    public IndividualPhonePhoneXRefDataObjectType getPhoneXRef() {
        return phoneXRef;
    }

    /**
     * Sets the value of the phoneXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPhonePhoneXRefDataObjectType }
     *     
     */
    public void setPhoneXRef(IndividualPhonePhoneXRefDataObjectType value) {
        this.phoneXRef = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPhoneCustomerDataObjectType }
     *     
     */
    public IndividualPhoneCustomerDataObjectType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPhoneCustomerDataObjectType }
     *     
     */
    public void setCustomer(IndividualPhoneCustomerDataObjectType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPhonePhoneDataObjectType }
     *     
     */
    public IndividualPhonePhoneDataObjectType getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPhonePhoneDataObjectType }
     *     
     */
    public void setPhone(IndividualPhonePhoneDataObjectType value) {
        this.phone = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPhoneCountryDataObjectType }
     *     
     */
    public IndividualPhoneCountryDataObjectType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPhoneCountryDataObjectType }
     *     
     */
    public void setCountry(IndividualPhoneCountryDataObjectType value) {
        this.country = value;
    }

}
