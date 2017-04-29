
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
 *         &lt;element name="oWebUser" type="{http://www.avectra.com/2005/}WebUserType" minOccurs="0"/>
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
    "oWebUser"
})
@XmlRootElement(name = "WEBWebUserCreate")
public class WEBWebUserCreate {

    protected WebUserType oWebUser;

    /**
     * Gets the value of the oWebUser property.
     * 
     * @return
     *     possible object is
     *     {@link WebUserType }
     *     
     */
    public WebUserType getOWebUser() {
        return oWebUser;
    }

    /**
     * Sets the value of the oWebUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebUserType }
     *     
     */
    public void setOWebUser(WebUserType value) {
        this.oWebUser = value;
    }

}
