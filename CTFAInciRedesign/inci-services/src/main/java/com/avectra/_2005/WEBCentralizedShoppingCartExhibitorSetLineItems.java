
package com.avectra._2005;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oExhibitor" type="{http://www.avectra.com/2005/}ExhibitorNewType" minOccurs="0"/>
 *         &lt;element name="oFeeCollection" type="{http://www.avectra.com/2005/}Fee" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "oExhibitor",
    "oFeeCollection"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartExhibitorSetLineItems")
public class WEBCentralizedShoppingCartExhibitorSetLineItems {

    protected ExhibitorNewType oExhibitor;
    protected List<Fee> oFeeCollection;

    /**
     * Gets the value of the oExhibitor property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewType }
     *     
     */
    public ExhibitorNewType getOExhibitor() {
        return oExhibitor;
    }

    /**
     * Sets the value of the oExhibitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewType }
     *     
     */
    public void setOExhibitor(ExhibitorNewType value) {
        this.oExhibitor = value;
    }

    /**
     * Gets the value of the oFeeCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oFeeCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOFeeCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fee }
     * 
     * 
     */
    public List<Fee> getOFeeCollection() {
        if (oFeeCollection == null) {
            oFeeCollection = new ArrayList<Fee>();
        }
        return this.oFeeCollection;
    }

}
