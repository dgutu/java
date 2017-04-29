
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
 *         &lt;element name="PackageKey" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "packageKey"
})
@XmlRootElement(name = "WEBCentralizedShoppingCartMembershipGetPackageComponentList")
public class WEBCentralizedShoppingCartMembershipGetPackageComponentList {

    @XmlElement(name = "PackageKey", required = true)
    protected String packageKey;

    /**
     * Gets the value of the packageKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageKey() {
        return packageKey;
    }

    /**
     * Sets the value of the packageKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageKey(String value) {
        this.packageKey = value;
    }

}
