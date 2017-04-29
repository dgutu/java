
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
 *         &lt;element name="emailToMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "emailToMatch"
})
@XmlRootElement(name = "WEBWebUserFindUsersByEmail")
public class WEBWebUserFindUsersByEmail {

    protected String emailToMatch;

    /**
     * Gets the value of the emailToMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailToMatch() {
        return emailToMatch;
    }

    /**
     * Sets the value of the emailToMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailToMatch(String value) {
        this.emailToMatch = value;
    }

}
