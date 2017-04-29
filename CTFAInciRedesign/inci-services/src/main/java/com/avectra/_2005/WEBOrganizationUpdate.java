
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
 *         &lt;element name="oFacadeObject" type="{http://www.avectra.com/2005/}OrganizationType" minOccurs="0"/>
 *         &lt;element name="bRefresh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "oFacadeObject",
    "bRefresh"
})
@XmlRootElement(name = "WEBOrganizationUpdate")
public class WEBOrganizationUpdate {

    protected OrganizationType oFacadeObject;
    protected String bRefresh;

    /**
     * Gets the value of the oFacadeObject property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationType }
     *     
     */
    public OrganizationType getOFacadeObject() {
        return oFacadeObject;
    }

    /**
     * Sets the value of the oFacadeObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationType }
     *     
     */
    public void setOFacadeObject(OrganizationType value) {
        this.oFacadeObject = value;
    }

    /**
     * Gets the value of the bRefresh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRefresh() {
        return bRefresh;
    }

    /**
     * Sets the value of the bRefresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRefresh(String value) {
        this.bRefresh = value;
    }

}
