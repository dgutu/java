
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lst_mdt_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lst_select_distinct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mdt_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListFromTables" type="{http://www.avectra.com/2005/}ArrayOfListFromTable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListTable", propOrder = {
    "lstMdtName",
    "lstSelectDistinct",
    "mdtDescription",
    "listFromTables"
})
public class ListTable {

    @XmlElement(name = "lst_mdt_name")
    protected String lstMdtName;
    @XmlElement(name = "lst_select_distinct")
    protected String lstSelectDistinct;
    @XmlElement(name = "mdt_description")
    protected String mdtDescription;
    @XmlElement(name = "ListFromTables")
    protected ArrayOfListFromTable listFromTables;

    /**
     * Gets the value of the lstMdtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLstMdtName() {
        return lstMdtName;
    }

    /**
     * Sets the value of the lstMdtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLstMdtName(String value) {
        this.lstMdtName = value;
    }

    /**
     * Gets the value of the lstSelectDistinct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLstSelectDistinct() {
        return lstSelectDistinct;
    }

    /**
     * Sets the value of the lstSelectDistinct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLstSelectDistinct(String value) {
        this.lstSelectDistinct = value;
    }

    /**
     * Gets the value of the mdtDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdtDescription() {
        return mdtDescription;
    }

    /**
     * Sets the value of the mdtDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdtDescription(String value) {
        this.mdtDescription = value;
    }

    /**
     * Gets the value of the listFromTables property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfListFromTable }
     *     
     */
    public ArrayOfListFromTable getListFromTables() {
        return listFromTables;
    }

    /**
     * Sets the value of the listFromTables property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfListFromTable }
     *     
     */
    public void setListFromTables(ArrayOfListFromTable value) {
        this.listFromTables = value;
    }

}
