
package com.avectra._2005;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfQueryColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfQueryColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryColumn" type="{http://www.avectra.com/2005/}QueryColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQueryColumn", propOrder = {
    "queryColumn"
})
public class ArrayOfQueryColumn {

    @XmlElement(name = "QueryColumn", nillable = true)
    protected List<QueryColumn> queryColumn;

    /**
     * Gets the value of the queryColumn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryColumn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryColumn }
     * 
     * 
     */
    public List<QueryColumn> getQueryColumn() {
        if (queryColumn == null) {
            queryColumn = new ArrayList<QueryColumn>();
        }
        return this.queryColumn;
    }

}
