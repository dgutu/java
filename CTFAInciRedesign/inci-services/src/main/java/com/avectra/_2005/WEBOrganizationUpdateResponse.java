
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
 *         &lt;element name="WEBOrganizationUpdateResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "webOrganizationUpdateResult"
})
@XmlRootElement(name = "WEBOrganizationUpdateResponse")
public class WEBOrganizationUpdateResponse {

    @XmlElement(name = "WEBOrganizationUpdateResult")
    protected boolean webOrganizationUpdateResult;

    /**
     * Gets the value of the webOrganizationUpdateResult property.
     * 
     */
    public boolean isWEBOrganizationUpdateResult() {
        return webOrganizationUpdateResult;
    }

    /**
     * Sets the value of the webOrganizationUpdateResult property.
     * 
     */
    public void setWEBOrganizationUpdateResult(boolean value) {
        this.webOrganizationUpdateResult = value;
    }

}
