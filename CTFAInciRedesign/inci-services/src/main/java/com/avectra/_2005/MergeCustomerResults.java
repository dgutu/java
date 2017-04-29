
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MergeCustomerResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MergeCustomerResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cst_key_keep" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="CustomerResults" type="{http://www.avectra.com/2005/}ArrayOfMergeCustomerResult" minOccurs="0"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MergeCustomerResults", propOrder = {
    "cstKeyKeep",
    "customerResults",
    "errorMessage"
})
public class MergeCustomerResults {

    @XmlElement(name = "cst_key_keep", required = true)
    protected String cstKeyKeep;
    @XmlElement(name = "CustomerResults")
    protected ArrayOfMergeCustomerResult customerResults;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;

    /**
     * Gets the value of the cstKeyKeep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstKeyKeep() {
        return cstKeyKeep;
    }

    /**
     * Sets the value of the cstKeyKeep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstKeyKeep(String value) {
        this.cstKeyKeep = value;
    }

    /**
     * Gets the value of the customerResults property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMergeCustomerResult }
     *     
     */
    public ArrayOfMergeCustomerResult getCustomerResults() {
        return customerResults;
    }

    /**
     * Sets the value of the customerResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMergeCustomerResult }
     *     
     */
    public void setCustomerResults(ArrayOfMergeCustomerResult value) {
        this.customerResults = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

}
