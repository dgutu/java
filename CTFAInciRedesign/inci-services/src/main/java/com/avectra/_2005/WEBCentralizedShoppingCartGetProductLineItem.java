
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
 *         &lt;element name="ProductKey" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="CustomerKey" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Customer_X_Address_Key" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "productKey",
    "customerKey",
    "customerXAddressKey"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartGetProductLineItem")
public class WEBCentralizedShoppingCartGetProductLineItem {

    @XmlElement(name = "ProductKey", required = true)
    protected String productKey;
    @XmlElement(name = "CustomerKey", required = true)
    protected String customerKey;
    @XmlElement(name = "Customer_X_Address_Key", required = true)
    protected String customerXAddressKey;

    /**
     * Gets the value of the productKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductKey() {
        return productKey;
    }

    /**
     * Sets the value of the productKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductKey(String value) {
        this.productKey = value;
    }

    /**
     * Gets the value of the customerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerKey() {
        return customerKey;
    }

    /**
     * Sets the value of the customerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerKey(String value) {
        this.customerKey = value;
    }

    /**
     * Gets the value of the customerXAddressKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerXAddressKey() {
        return customerXAddressKey;
    }

    /**
     * Sets the value of the customerXAddressKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerXAddressKey(String value) {
        this.customerXAddressKey = value;
    }

}
