
package com.avectra._2005;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfModuleResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfModuleResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ModuleResult" type="{http://www.avectra.com/2005/}ModuleResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfModuleResult", propOrder = {
    "moduleResult"
})
public class ArrayOfModuleResult {

    @XmlElement(name = "ModuleResult", nillable = true)
    protected List<ModuleResult> moduleResult;

    /**
     * Gets the value of the moduleResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moduleResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModuleResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModuleResult }
     * 
     * 
     */
    public List<ModuleResult> getModuleResult() {
        if (moduleResult == null) {
            moduleResult = new ArrayList<ModuleResult>();
        }
        return this.moduleResult;
    }

}
