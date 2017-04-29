
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
 *         &lt;element name="firstnameToMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastnameToMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "usernameToMatch",
    "firstnameToMatch",
    "lastnameToMatch"
})
@XmlRootElement(name = "WEBWebUserFindUsersByUserNameFirstNameLastName")
public class WEBWebUserFindUsersByUserNameFirstNameLastName {

    protected String usernameToMatch;
    protected String firstnameToMatch;
    protected String lastnameToMatch;

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

    /**
     * Gets the value of the firstnameToMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstnameToMatch() {
        return firstnameToMatch;
    }

    /**
     * Sets the value of the firstnameToMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstnameToMatch(String value) {
        this.firstnameToMatch = value;
    }

    /**
     * Gets the value of the lastnameToMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastnameToMatch() {
        return lastnameToMatch;
    }

    /**
     * Sets the value of the lastnameToMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastnameToMatch(String value) {
        this.lastnameToMatch = value;
    }

}
