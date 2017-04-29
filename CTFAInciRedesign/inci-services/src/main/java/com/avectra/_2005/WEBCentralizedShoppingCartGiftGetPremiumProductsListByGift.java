
package com.avectra._2005;

import java.math.BigDecimal;
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
 *         &lt;element name="GiftKey" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="GiftAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "giftKey",
    "giftAmount"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartGiftGetPremiumProductsListByGift")
public class WEBCentralizedShoppingCartGiftGetPremiumProductsListByGift {

    @XmlElement(name = "GiftKey", required = true)
    protected String giftKey;
    @XmlElement(name = "GiftAmount", required = true)
    protected BigDecimal giftAmount;

    /**
     * Gets the value of the giftKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftKey() {
        return giftKey;
    }

    /**
     * Sets the value of the giftKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftKey(String value) {
        this.giftKey = value;
    }

    /**
     * Gets the value of the giftAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGiftAmount() {
        return giftAmount;
    }

    /**
     * Sets the value of the giftAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGiftAmount(BigDecimal value) {
        this.giftAmount = value;
    }

}
