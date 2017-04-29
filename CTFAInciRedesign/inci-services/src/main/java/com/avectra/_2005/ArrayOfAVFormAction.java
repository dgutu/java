
package com.avectra._2005;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAVFormAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAVFormAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AVFormAction" type="{http://www.avectra.com/2005/}AVFormAction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAVFormAction", propOrder = {
    "avFormAction"
})
public class ArrayOfAVFormAction {

    @XmlElement(name = "AVFormAction", nillable = true)
    protected List<AVFormAction> avFormAction;

    /**
     * Gets the value of the avFormAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avFormAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAVFormAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AVFormAction }
     * 
     * 
     */
    public List<AVFormAction> getAVFormAction() {
        if (avFormAction == null) {
            avFormAction = new ArrayList<AVFormAction>();
        }
        return this.avFormAction;
    }

}
