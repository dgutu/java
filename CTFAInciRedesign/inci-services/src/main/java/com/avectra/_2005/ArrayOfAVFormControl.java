
package com.avectra._2005;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAVFormControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAVFormControl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AVFormControl" type="{http://www.avectra.com/2005/}AVFormControl" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAVFormControl", propOrder = {
    "avFormControl"
})
public class ArrayOfAVFormControl {

    @XmlElement(name = "AVFormControl", nillable = true)
    protected List<AVFormControl> avFormControl;

    /**
     * Gets the value of the avFormControl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avFormControl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAVFormControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AVFormControl }
     * 
     * 
     */
    public List<AVFormControl> getAVFormControl() {
        if (avFormControl == null) {
            avFormControl = new ArrayList<AVFormControl>();
        }
        return this.avFormControl;
    }

}
