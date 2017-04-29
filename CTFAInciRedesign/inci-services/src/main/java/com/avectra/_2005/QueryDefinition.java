
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="que_key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="que_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="szObjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parameters" type="{http://www.avectra.com/2005/}ArrayOfQueryParameter" minOccurs="0"/>
 *         &lt;element name="Columns" type="{http://www.avectra.com/2005/}ArrayOfQueryColumn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDefinition", propOrder = {
    "queKey",
    "queDescription",
    "szObjectName",
    "parameters",
    "columns"
})
public class QueryDefinition {

    @XmlElement(name = "que_key")
    protected String queKey;
    @XmlElement(name = "que_description")
    protected String queDescription;
    protected String szObjectName;
    @XmlElement(name = "Parameters")
    protected ArrayOfQueryParameter parameters;
    @XmlElement(name = "Columns")
    protected ArrayOfQueryColumn columns;

    /**
     * Gets the value of the queKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueKey() {
        return queKey;
    }

    /**
     * Sets the value of the queKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueKey(String value) {
        this.queKey = value;
    }

    /**
     * Gets the value of the queDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueDescription() {
        return queDescription;
    }

    /**
     * Sets the value of the queDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueDescription(String value) {
        this.queDescription = value;
    }

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
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQueryParameter }
     *     
     */
    public ArrayOfQueryParameter getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQueryParameter }
     *     
     */
    public void setParameters(ArrayOfQueryParameter value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQueryColumn }
     *     
     */
    public ArrayOfQueryColumn getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQueryColumn }
     *     
     */
    public void setColumns(ArrayOfQueryColumn value) {
        this.columns = value;
    }

}
