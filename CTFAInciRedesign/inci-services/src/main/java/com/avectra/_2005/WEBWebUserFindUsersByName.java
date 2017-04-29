
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
 *         &lt;element name="usernameToMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "usernameToMatch"
})
@XmlRootElement(name = "WEBWebUserFindUsersByName")
public class WEBWebUserFindUsersByName {

    protected String usernameToMatch;

    /**
     * Gets the value of the usernameToMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsernameToMatch() {
        return usernameToMatch;
    }

    /**
     * Sets the value of the usernameToMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsernameToMatch(String value) {
        this.usernameToMatch = value;
    }

}
