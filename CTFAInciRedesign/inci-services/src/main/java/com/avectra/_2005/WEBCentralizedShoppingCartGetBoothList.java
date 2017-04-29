
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
 *         &lt;element name="oExhibitor" type="{http://www.avectra.com/2005/}ExhibitorNewType" minOccurs="0"/>
 *         &lt;element name="BoothType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BoothCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "boothType",
    "boothCategory",
    "productName"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartGetBoothList")
public class WEBCentralizedShoppingCartGetBoothList {

    protected ExhibitorNewType oExhibitor;
    @XmlElement(name = "BoothType", required = true, nillable = true)
    protected String boothType;
    @XmlElement(name = "BoothCategory", required = true, nillable = true)
    protected String boothCategory;
    @XmlElement(name = "ProductName", required = true, nillable = true)
    protected String productName;

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
     * Gets the value of the boothType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoothType() {
        return boothType;
    }

    /**
     * Sets the value of the boothType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoothType(String value) {
        this.boothType = value;
    }

    /**
     * Gets the value of the boothCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoothCategory() {
        return boothCategory;
    }

    /**
     * Sets the value of the boothCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoothCategory(String value) {
        this.boothCategory = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

}
