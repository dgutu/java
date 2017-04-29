
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerEmailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerEmailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentKey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.avectra.com/2005/}IndividualEmail_Email_DataObjectType"/>
 *         &lt;element name="Customer" type="{http://www.avectra.com/2005/}IndividualEmail_Customer_DataObjectType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerEmailType", propOrder = {
    "currentKey",
    "email",
    "customer"
})
public class CustomerEmailType {

    @XmlElementRef(name = "CurrentKey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> currentKey;
    @XmlElement(name = "Email", required = true)
    protected IndividualEmailEmailDataObjectType email;
    @XmlElement(name = "Customer", required = true)
    protected IndividualEmailCustomerDataObjectType customer;

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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualEmailEmailDataObjectType }
     *     
     */
    public IndividualEmailEmailDataObjectType getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualEmailEmailDataObjectType }
     *     
     */
    public void setEmail(IndividualEmailEmailDataObjectType value) {
        this.email = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualEmailCustomerDataObjectType }
     *     
     */
    public IndividualEmailCustomerDataObjectType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualEmailCustomerDataObjectType }
     *     
     */
    public void setCustomer(IndividualEmailCustomerDataObjectType value) {
        this.customer = value;
    }

}
