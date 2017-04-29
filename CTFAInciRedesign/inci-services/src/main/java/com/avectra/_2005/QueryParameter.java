
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Operator" type="{http://www.avectra.com/2005/}QueryOperatorType"/>
 *         &lt;element name="ColumnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColumnDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ControlClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsExtended" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsNullable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TableAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TableDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOptions" type="{http://www.avectra.com/2005/}ArrayOfListOption" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryParameter", propOrder = {
    "name",
    "description",
    "operator",
    "columnName",
    "columnDescription",
    "controlClass",
    "dataType",
    "isExtended",
    "isNullable",
    "tableAlias",
    "tableDescription",
    "tableName",
    "listOptions"
})
public class QueryParameter {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Operator", required = true)
    protected QueryOperatorType operator;
    @XmlElement(name = "ColumnName")
    protected String columnName;
    @XmlElement(name = "ColumnDescription")
    protected String columnDescription;
    @XmlElement(name = "ControlClass")
    protected String controlClass;
    @XmlElement(name = "DataType")
    protected String dataType;
    @XmlElement(name = "IsExtended")
    protected boolean isExtended;
    @XmlElement(name = "IsNullable")
    protected boolean isNullable;
    @XmlElement(name = "TableAlias")
    protected String tableAlias;
    @XmlElement(name = "TableDescription")
    protected String tableDescription;
    @XmlElement(name = "TableName")
    protected String tableName;
    @XmlElement(name = "ListOptions")
    protected ArrayOfListOption listOptions;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link QueryOperatorType }
     *     
     */
    public QueryOperatorType getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryOperatorType }
     *     
     */
    public void setOperator(QueryOperatorType value) {
        this.operator = value;
    }

    /**
     * Gets the value of the columnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * Sets the value of the columnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnName(String value) {
        this.columnName = value;
    }

    /**
     * Gets the value of the columnDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnDescription() {
        return columnDescription;
    }

    /**
     * Sets the value of the columnDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnDescription(String value) {
        this.columnDescription = value;
    }

    /**
     * Gets the value of the controlClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlClass() {
        return controlClass;
    }

    /**
     * Sets the value of the controlClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlClass(String value) {
        this.controlClass = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the isExtended property.
     * 
     */
    public boolean isIsExtended() {
        return isExtended;
    }

    /**
     * Sets the value of the isExtended property.
     * 
     */
    public void setIsExtended(boolean value) {
        this.isExtended = value;
    }

    /**
     * Gets the value of the isNullable property.
     * 
     */
    public boolean isIsNullable() {
        return isNullable;
    }

    /**
     * Sets the value of the isNullable property.
     * 
     */
    public void setIsNullable(boolean value) {
        this.isNullable = value;
    }

    /**
     * Gets the value of the tableAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableAlias() {
        return tableAlias;
    }

    /**
     * Sets the value of the tableAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableAlias(String value) {
        this.tableAlias = value;
    }

    /**
     * Gets the value of the tableDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableDescription() {
        return tableDescription;
    }

    /**
     * Sets the value of the tableDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableDescription(String value) {
        this.tableDescription = value;
    }

    /**
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

    /**
     * Gets the value of the listOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfListOption }
     *     
     */
    public ArrayOfListOption getListOptions() {
        return listOptions;
    }

    /**
     * Sets the value of the listOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfListOption }
     *     
     */
    public void setListOptions(ArrayOfListOption value) {
        this.listOptions = value;
    }

}
