
package com.avectra._2005;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMergeCustomerResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMergeCustomerResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MergeCustomerResult" type="{http://www.avectra.com/2005/}MergeCustomerResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMergeCustomerResult", propOrder = {
    "mergeCustomerResult"
})
public class ArrayOfMergeCustomerResult {

    @XmlElement(name = "MergeCustomerResult", nillable = true)
    protected List<MergeCustomerResult> mergeCustomerResult;

    /**
     * Gets the value of the mergeCustomerResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mergeCustomerResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMergeCustomerResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MergeCustomerResult }
     * 
     * 
     */
    public List<MergeCustomerResult> getMergeCustomerResult() {
        if (mergeCustomerResult == null) {
            mergeCustomerResult = new ArrayList<MergeCustomerResult>();
        }
        return this.mergeCustomerResult;
    }

}
