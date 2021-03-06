
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
 *         &lt;element name="cst_recno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "cstRecno",
    "password"
})
@XmlRootElement(name = "WEBWebUserLoginByRecno_Custom")
public class WEBWebUserLoginByRecnoCustom {

    @XmlElement(name = "cst_recno")
    protected String cstRecno;
    protected String password;

    /**
     * Gets the value of the cstRecno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstRecno() {
        return cstRecno;
    }

    /**
     * Sets the value of the cstRecno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstRecno(String value) {
        this.cstRecno = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
