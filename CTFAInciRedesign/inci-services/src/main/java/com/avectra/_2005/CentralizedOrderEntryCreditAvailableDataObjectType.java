
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CentralizedOrderEntry_Credit_Available_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CentralizedOrderEntry_Credit_Available_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caa_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="caa_cst_credit_available" type="{http://www.avectra.com/2005/}decimal_Type" minOccurs="0"/>
 *         &lt;element name="caa_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CentralizedOrderEntry_Credit_Available_DataObjectType", propOrder = {
    "caaCstKey",
    "caaCstCreditAvailable",
    "caaEntityKey"
})
public class CentralizedOrderEntryCreditAvailableDataObjectType {

    @XmlElementRef(name = "caa_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> caaCstKey;
    @XmlElementRef(name = "caa_cst_credit_available", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> caaCstCreditAvailable;
    @XmlElementRef(name = "caa_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> caaEntityKey;

    /**
     * Gets the value of the caaCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCaaCstKey() {
        return caaCstKey;
    }

    /**
     * Sets the value of the caaCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCaaCstKey(JAXBElement<String> value) {
        this.caaCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the caaCstCreditAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCaaCstCreditAvailable() {
        return caaCstCreditAvailable;
    }

    /**
     * Sets the value of the caaCstCreditAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCaaCstCreditAvailable(JAXBElement<BigDecimal> value) {
        this.caaCstCreditAvailable = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the caaEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCaaEntityKey() {
        return caaEntityKey;
    }

    /**
     * Sets the value of the caaEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCaaEntityKey(JAXBElement<String> value) {
        this.caaEntityKey = ((JAXBElement<String> ) value);
    }

}
