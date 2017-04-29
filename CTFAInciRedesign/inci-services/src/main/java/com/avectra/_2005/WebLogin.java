
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
 *         &lt;element name="userLoginPlain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="passwordPlain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="keyOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "userLoginPlain",
    "passwordPlain",
    "keyOverride"
})
@XmlRootElement(name = "WebLogin")
public class WebLogin {

    @XmlElement(required = true, nillable = true)
    protected String userLoginPlain;
    @XmlElement(required = true, nillable = true)
    protected String passwordPlain;
    protected String keyOverride;

    /**
     * Gets the value of the userLoginPlain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLoginPlain() {
        return userLoginPlain;
    }

    /**
     * Sets the value of the userLoginPlain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLoginPlain(String value) {
        this.userLoginPlain = value;
    }

    /**
     * Gets the value of the passwordPlain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordPlain() {
        return passwordPlain;
    }

    /**
     * Sets the value of the passwordPlain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordPlain(String value) {
        this.passwordPlain = value;
    }

    /**
     * Gets the value of the keyOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyOverride() {
        return keyOverride;
    }

    /**
     * Sets the value of the keyOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyOverride(String value) {
        this.keyOverride = value;
    }

}
