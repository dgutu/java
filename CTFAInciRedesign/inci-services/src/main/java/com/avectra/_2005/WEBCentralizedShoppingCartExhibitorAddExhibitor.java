
package com.avectra._2005;

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
 *         &lt;element name="oCentralizedOrderEntry" type="{http://www.avectra.com/2005/}CentralizedOrderEntryType" minOccurs="0"/>
 *         &lt;element name="oExhibitor" type="{http://www.avectra.com/2005/}ExhibitorNewType" minOccurs="0"/>
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
    "oCentralizedOrderEntry",
    "oExhibitor"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartExhibitorAddExhibitor")
public class WEBCentralizedShoppingCartExhibitorAddExhibitor {

    protected CentralizedOrderEntryType oCentralizedOrderEntry;
    protected ExhibitorNewType oExhibitor;

    /**
     * Gets the value of the oCentralizedOrderEntry property.
     * 
     * @return
     *     possible object is
     *     {@link CentralizedOrderEntryType }
     *     
     */
    public CentralizedOrderEntryType getOCentralizedOrderEntry() {
        return oCentralizedOrderEntry;
    }

    /**
     * Sets the value of the oCentralizedOrderEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralizedOrderEntryType }
     *     
     */
    public void setOCentralizedOrderEntry(CentralizedOrderEntryType value) {
        this.oCentralizedOrderEntry = value;
    }

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

}
