
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
 *         &lt;element name="PCPCWEBCentralizedShoppingCartGetNewResult" type="{http://www.avectra.com/2005/}CentralizedOrderEntryType" minOccurs="0"/>
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
    "pcpcwebCentralizedShoppingCartGetNewResult"
})
@XmlRootElement(name = "PCPCWEBCentralizedShoppingCartGetNewResponse")
public class PCPCWEBCentralizedShoppingCartGetNewResponse {

    @XmlElement(name = "PCPCWEBCentralizedShoppingCartGetNewResult")
    protected CentralizedOrderEntryType pcpcwebCentralizedShoppingCartGetNewResult;

    /**
     * Gets the value of the pcpcwebCentralizedShoppingCartGetNewResult property.
     * 
     * @return
     *     possible object is
     *     {@link CentralizedOrderEntryType }
     *     
     */
    public CentralizedOrderEntryType getPCPCWEBCentralizedShoppingCartGetNewResult() {
        return pcpcwebCentralizedShoppingCartGetNewResult;
    }

    /**
     * Sets the value of the pcpcwebCentralizedShoppingCartGetNewResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralizedOrderEntryType }
     *     
     */
    public void setPCPCWEBCentralizedShoppingCartGetNewResult(CentralizedOrderEntryType value) {
        this.pcpcwebCentralizedShoppingCartGetNewResult = value;
    }

}
