
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
 *         &lt;element name="WEBCentralizedShoppingCartExhibitorGetResult" type="{http://www.avectra.com/2005/}ExhibitorNewType" minOccurs="0"/>
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
    "webCentralizedShoppingCartExhibitorGetResult"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartExhibitorGetResponse")
public class WEBCentralizedShoppingCartExhibitorGetResponse {

    @XmlElement(name = "WEBCentralizedShoppingCartExhibitorGetResult")
    protected ExhibitorNewType webCentralizedShoppingCartExhibitorGetResult;

    /**
     * Gets the value of the webCentralizedShoppingCartExhibitorGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitorNewType }
     *     
     */
    public ExhibitorNewType getWEBCentralizedShoppingCartExhibitorGetResult() {
        return webCentralizedShoppingCartExhibitorGetResult;
    }

    /**
     * Sets the value of the webCentralizedShoppingCartExhibitorGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitorNewType }
     *     
     */
    public void setWEBCentralizedShoppingCartExhibitorGetResult(ExhibitorNewType value) {
        this.webCentralizedShoppingCartExhibitorGetResult = value;
    }

}
