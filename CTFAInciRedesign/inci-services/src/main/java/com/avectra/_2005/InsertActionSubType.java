
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
 *         &lt;element name="actionTypeKey" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "actionTypeKey",
    "actionCode"
})
@XmlRootElement(name = "InsertActionSubType")
public class InsertActionSubType {

    @XmlElement(required = true)
    protected String actionTypeKey;
    @XmlElement(required = true, nillable = true)
    protected String actionCode;

    /**
     * Gets the value of the actionTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionTypeKey() {
        return actionTypeKey;
    }

    /**
     * Sets the value of the actionTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionTypeKey(String value) {
        this.actionTypeKey = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

}
