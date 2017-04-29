
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
 *         &lt;element name="WEBIsUserInRoleResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "webIsUserInRoleResult"
})
@XmlRootElement(name = "WEBIsUserInRoleResponse")
public class WEBIsUserInRoleResponse {

    @XmlElement(name = "WEBIsUserInRoleResult")
    protected boolean webIsUserInRoleResult;

    /**
     * Gets the value of the webIsUserInRoleResult property.
     * 
     */
    public boolean isWEBIsUserInRoleResult() {
        return webIsUserInRoleResult;
    }

    /**
     * Sets the value of the webIsUserInRoleResult property.
     * 
     */
    public void setWEBIsUserInRoleResult(boolean value) {
        this.webIsUserInRoleResult = value;
    }

}
