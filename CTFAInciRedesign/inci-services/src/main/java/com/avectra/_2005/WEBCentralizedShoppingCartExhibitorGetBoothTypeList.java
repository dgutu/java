
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="ExhibitKey" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "exhibitKey"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartExhibitorGetBoothTypeList")
public class WEBCentralizedShoppingCartExhibitorGetBoothTypeList {

    @XmlElement(name = "ExhibitKey", required = true)
    protected String exhibitKey;

    /**
     * Gets the value of the exhibitKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExhibitKey() {
        return exhibitKey;
    }

    /**
     * Sets the value of the exhibitKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExhibitKey(String value) {
        this.exhibitKey = value;
    }

}
