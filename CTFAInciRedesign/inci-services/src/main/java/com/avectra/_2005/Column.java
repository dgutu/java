
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Column complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Column">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mdc_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mdc_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mdc_data_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mdc_ext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mdc_nullable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mdc_table_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mdc_width_max" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Column", propOrder = {
    "mdcName",
    "mdcDescription",
    "mdcDataType",
    "mdcExt",
    "mdcNullable",
    "mdcTableName",
    "mdcWidthMax"
})
public class Column {

    @XmlElement(name = "mdc_name")
    protected String mdcName;
    @XmlElement(name = "mdc_description")
    protected String mdcDescription;
    @XmlElement(name = "mdc_data_type")
    protected String mdcDataType;
    @XmlElement(name = "mdc_ext")
    protected String mdcExt;
    @XmlElement(name = "mdc_nullable")
    protected String mdcNullable;
    @XmlElement(name = "mdc_table_name")
    protected String mdcTableName;
    @XmlElement(name = "mdc_width_max")
    protected String mdcWidthMax;

    /**
     * Gets the value of the mdcName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdcName() {
        return mdcName;
    }

    /**
     * Sets the value of the mdcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdcName(String value) {
        this.mdcName = value;
    }

    /**
     * Gets the value of the mdcDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdcDescription() {
        return mdcDescription;
    }

    /**
     * Sets the value of the mdcDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdcDescription(String value) {
        this.mdcDescription = value;
    }

    /**
     * Gets the value of the mdcDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdcDataType() {
        return mdcDataType;
    }

    /**
     * Sets the value of the mdcDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdcDataType(String value) {
        this.mdcDataType = value;
    }

    /**
     * Gets the value of the mdcExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdcExt() {
        return mdcExt;
    }

    /**
     * Sets the value of the mdcExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdcExt(String value) {
        this.mdcExt = value;
    }

    /**
     * Gets the value of the mdcNullable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdcNullable() {
        return mdcNullable;
    }

    /**
     * Sets the value of the mdcNullable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdcNullable(String value) {
        this.mdcNullable = value;
    }

    /**
     * Gets the value of the mdcTableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdcTableName() {
        return mdcTableName;
    }

    /**
     * Sets the value of the mdcTableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdcTableName(String value) {
        this.mdcTableName = value;
    }

    /**
     * Gets the value of the mdcWidthMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdcWidthMax() {
        return mdcWidthMax;
    }

    /**
     * Sets the value of the mdcWidthMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdcWidthMax(String value) {
        this.mdcWidthMax = value;
    }

}
