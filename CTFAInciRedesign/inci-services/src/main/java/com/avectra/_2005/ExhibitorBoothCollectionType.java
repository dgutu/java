
package com.avectra._2005;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Exhibitor_BoothCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Exhibitor_BoothCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExhibitorBoothNew" type="{http://www.avectra.com/2005/}ExhibitorBoothNewType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exhibitor_BoothCollectionType", propOrder = {
    "exhibitorBoothNew"
})
public class ExhibitorBoothCollectionType {

    @XmlElement(name = "ExhibitorBoothNew")
    protected List<ExhibitorBoothNewType> exhibitorBoothNew;

    /**
     * Gets the value of the exhibitorBoothNew property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exhibitorBoothNew property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExhibitorBoothNew().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExhibitorBoothNewType }
     * 
     * 
     */
    public List<ExhibitorBoothNewType> getExhibitorBoothNew() {
        if (exhibitorBoothNew == null) {
            exhibitorBoothNew = new ArrayList<ExhibitorBoothNewType>();
        }
        return this.exhibitorBoothNew;
    }

}
