
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cst_key_keep" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="customersToMerge" type="{http://www.avectra.com/2005/}ArrayOfMergeCustomer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cstKeyKeep",
    "customersToMerge"
})
@XmlRootElement(name = "MergeCustomers")
public class MergeCustomers {

    @XmlElement(name = "cst_key_keep", required = true)
    protected String cstKeyKeep;
    protected ArrayOfMergeCustomer customersToMerge;

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
     * Gets the value of the customersToMerge property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMergeCustomer }
     *     
     */
    public ArrayOfMergeCustomer getCustomersToMerge() {
        return customersToMerge;
    }

    /**
     * Sets the value of the customersToMerge property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMergeCustomer }
     *     
     */
    public void setCustomersToMerge(ArrayOfMergeCustomer value) {
        this.customersToMerge = value;
    }

}
