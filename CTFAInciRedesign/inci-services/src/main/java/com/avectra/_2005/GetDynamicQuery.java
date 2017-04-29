
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
 *         &lt;element name="szObjectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="szQueryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WithDescriptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parameters" type="{http://www.avectra.com/2005/}ArrayOfParameter" minOccurs="0"/>
 *         &lt;element name="currentPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "szObjectName",
    "szQueryName",
    "withDescriptions",
    "parameters",
    "currentPage"
})
@XmlRootElement(name = "GetDynamicQuery")
public class GetDynamicQuery {

    @XmlElement(required = true, nillable = true)
    protected String szObjectName;
    @XmlElement(required = true, nillable = true)
    protected String szQueryName;
    @XmlElement(name = "WithDescriptions")
    protected String withDescriptions;
    @XmlElement(name = "Parameters")
    protected ArrayOfParameter parameters;
    protected int currentPage;

    /**
     * Gets the value of the szObjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSzObjectName() {
        return szObjectName;
    }

    /**
     * Sets the value of the szObjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSzObjectName(String value) {
        this.szObjectName = value;
    }

    /**
     * Gets the value of the szQueryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSzQueryName() {
        return szQueryName;
    }

    /**
     * Sets the value of the szQueryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSzQueryName(String value) {
        this.szQueryName = value;
    }

    /**
     * Gets the value of the withDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithDescriptions() {
        return withDescriptions;
    }

    /**
     * Sets the value of the withDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithDescriptions(String value) {
        this.withDescriptions = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParameter }
     *     
     */
    public ArrayOfParameter getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParameter }
     *     
     */
    public void setParameters(ArrayOfParameter value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the currentPage property.
     * 
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * Sets the value of the currentPage property.
     * 
     */
    public void setCurrentPage(int value) {
        this.currentPage = value;
    }

}
