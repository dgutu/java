
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
 *         &lt;element name="oFundraisingGift" type="{http://www.avectra.com/2005/}FundraisingGiftType" minOccurs="0"/>
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
    "oFundraisingGift"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartGiftFundraisingRefresh")
public class WEBCentralizedShoppingCartGiftFundraisingRefresh {

    protected FundraisingGiftType oFundraisingGift;

    /**
     * Gets the value of the oFundraisingGift property.
     * 
     * @return
     *     possible object is
     *     {@link FundraisingGiftType }
     *     
     */
    public FundraisingGiftType getOFundraisingGift() {
        return oFundraisingGift;
    }

    /**
     * Sets the value of the oFundraisingGift property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundraisingGiftType }
     *     
     */
    public void setOFundraisingGift(FundraisingGiftType value) {
        this.oFundraisingGift = value;
    }

}
