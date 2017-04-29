
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerFaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerFaxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentKey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="Fax_XRef" type="{http://www.avectra.com/2005/}IndividualFax_Fax_XRef_DataObjectType"/>
 *         &lt;element name="Customer" type="{http://www.avectra.com/2005/}IndividualFax_Customer_DataObjectType"/>
 *         &lt;element name="Fax" type="{http://www.avectra.com/2005/}IndividualFax_Fax_DataObjectType"/>
 *         &lt;element name="Country" type="{http://www.avectra.com/2005/}IndividualFax_Country_DataObjectType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerFaxType", propOrder = {
    "currentKey",
    "faxXRef",
    "customer",
    "fax",
    "country"
})
public class CustomerFaxType {

    @XmlElementRef(name = "CurrentKey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> currentKey;
    @XmlElement(name = "Fax_XRef", required = true)
    protected IndividualFaxFaxXRefDataObjectType faxXRef;
    @XmlElement(name = "Customer", required = true)
    protected IndividualFaxCustomerDataObjectType customer;
    @XmlElement(name = "Fax", required = true)
    protected IndividualFaxFaxDataObjectType fax;
    @XmlElement(name = "Country", required = true)
    protected IndividualFaxCountryDataObjectType country;

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
     * Gets the value of the faxXRef property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualFaxFaxXRefDataObjectType }
     *     
     */
    public IndividualFaxFaxXRefDataObjectType getFaxXRef() {
        return faxXRef;
    }

    /**
     * Sets the value of the faxXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualFaxFaxXRefDataObjectType }
     *     
     */
    public void setFaxXRef(IndividualFaxFaxXRefDataObjectType value) {
        this.faxXRef = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualFaxCustomerDataObjectType }
     *     
     */
    public IndividualFaxCustomerDataObjectType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualFaxCustomerDataObjectType }
     *     
     */
    public void setCustomer(IndividualFaxCustomerDataObjectType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualFaxFaxDataObjectType }
     *     
     */
    public IndividualFaxFaxDataObjectType getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualFaxFaxDataObjectType }
     *     
     */
    public void setFax(IndividualFaxFaxDataObjectType value) {
        this.fax = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualFaxCountryDataObjectType }
     *     
     */
    public IndividualFaxCountryDataObjectType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualFaxCountryDataObjectType }
     *     
     */
    public void setCountry(IndividualFaxCountryDataObjectType value) {
        this.country = value;
    }

}
