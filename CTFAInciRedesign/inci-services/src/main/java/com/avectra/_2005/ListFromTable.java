
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListFromTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListFromTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lsf_from_table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lsf_from_alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lsf_from_join_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lsf_from_join" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Columns" type="{http://www.avectra.com/2005/}ArrayOfColumn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListFromTable", propOrder = {
    "lsfFromTable",
    "lsfFromAlias",
    "lsfFromJoinType",
    "lsfFromJoin",
    "columns"
})
public class ListFromTable {

    @XmlElement(name = "lsf_from_table")
    protected String lsfFromTable;
    @XmlElement(name = "lsf_from_alias")
    protected String lsfFromAlias;
    @XmlElement(name = "lsf_from_join_type")
    protected String lsfFromJoinType;
    @XmlElement(name = "lsf_from_join")
    protected String lsfFromJoin;
    @XmlElement(name = "Columns")
    protected ArrayOfColumn columns;

    /**
     * Gets the value of the lsfFromTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsfFromTable() {
        return lsfFromTable;
    }

    /**
     * Sets the value of the lsfFromTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsfFromTable(String value) {
        this.lsfFromTable = value;
    }

    /**
     * Gets the value of the lsfFromAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsfFromAlias() {
        return lsfFromAlias;
    }

    /**
     * Sets the value of the lsfFromAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsfFromAlias(String value) {
        this.lsfFromAlias = value;
    }

    /**
     * Gets the value of the lsfFromJoinType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsfFromJoinType() {
        return lsfFromJoinType;
    }

    /**
     * Sets the value of the lsfFromJoinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsfFromJoinType(String value) {
        this.lsfFromJoinType = value;
    }

    /**
     * Gets the value of the lsfFromJoin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsfFromJoin() {
        return lsfFromJoin;
    }

    /**
     * Sets the value of the lsfFromJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsfFromJoin(String value) {
        this.lsfFromJoin = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfColumn }
     *     
     */
    public ArrayOfColumn getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfColumn }
     *     
     */
    public void setColumns(ArrayOfColumn value) {
        this.columns = value;
    }

}
