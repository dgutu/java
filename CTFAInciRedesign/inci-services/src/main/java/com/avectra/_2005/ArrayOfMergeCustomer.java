
package com.avectra._2005;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMergeCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMergeCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MergeCustomer" type="{http://www.avectra.com/2005/}MergeCustomer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMergeCustomer", propOrder = {
    "mergeCustomer"
})
public class ArrayOfMergeCustomer {

    @XmlElement(name = "MergeCustomer", nillable = true)
    protected List<MergeCustomer> mergeCustomer;

    /**
     * Gets the value of the mergeCustomer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mergeCustomer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMergeCustomer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MergeCustomer }
     * 
     * 
     */
    public List<MergeCustomer> getMergeCustomer() {
        if (mergeCustomer == null) {
            mergeCustomer = new ArrayList<MergeCustomer>();
        }
        return this.mergeCustomer;
    }

}
