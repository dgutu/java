
package com.avectra._2005;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMixed;
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
 *         &lt;element name="WEBCentralizedShoppingCartGetProductByKeyResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "webCentralizedShoppingCartGetProductByKeyResult"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartGetProductByKeyResponse")
public class WEBCentralizedShoppingCartGetProductByKeyResponse {

    @XmlElement(name = "WEBCentralizedShoppingCartGetProductByKeyResult")
    protected WEBCentralizedShoppingCartGetProductByKeyResponse.WEBCentralizedShoppingCartGetProductByKeyResult webCentralizedShoppingCartGetProductByKeyResult;

    /**
     * Gets the value of the webCentralizedShoppingCartGetProductByKeyResult property.
     * 
     * @return
     *     possible object is
     *     {@link WEBCentralizedShoppingCartGetProductByKeyResponse.WEBCentralizedShoppingCartGetProductByKeyResult }
     *     
     */
    public WEBCentralizedShoppingCartGetProductByKeyResponse.WEBCentralizedShoppingCartGetProductByKeyResult getWEBCentralizedShoppingCartGetProductByKeyResult() {
        return webCentralizedShoppingCartGetProductByKeyResult;
    }

    /**
     * Sets the value of the webCentralizedShoppingCartGetProductByKeyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WEBCentralizedShoppingCartGetProductByKeyResponse.WEBCentralizedShoppingCartGetProductByKeyResult }
     *     
     */
    public void setWEBCentralizedShoppingCartGetProductByKeyResult(WEBCentralizedShoppingCartGetProductByKeyResponse.WEBCentralizedShoppingCartGetProductByKeyResult value) {
        this.webCentralizedShoppingCartGetProductByKeyResult = value;
    }


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
     *         &lt;any/>
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
        "content"
    })
    public static class WEBCentralizedShoppingCartGetProductByKeyResult {

        @XmlMixed
        @XmlAnyElement(lax = true)
        protected List<java.lang.Object> content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * {@link java.lang.Object }
         * 
         * 
         */
        public List<java.lang.Object> getContent() {
            if (content == null) {
                content = new ArrayList<java.lang.Object>();
            }
            return this.content;
        }

    }

}
