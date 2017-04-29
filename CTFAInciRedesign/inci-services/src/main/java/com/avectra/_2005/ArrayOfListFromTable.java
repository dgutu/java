
package com.avectra._2005;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfListFromTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfListFromTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListFromTable" type="{http://www.avectra.com/2005/}ListFromTable" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfListFromTable", propOrder = {
    "listFromTable"
})
public class ArrayOfListFromTable {

    @XmlElement(name = "ListFromTable", nillable = true)
    protected List<ListFromTable> listFromTable;

    /**
     * Gets the value of the listFromTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listFromTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListFromTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListFromTable }
     * 
     * 
     */
    public List<ListFromTable> getListFromTable() {
        if (listFromTable == null) {
            listFromTable = new ArrayList<ListFromTable>();
        }
        return this.listFromTable;
    }

}
