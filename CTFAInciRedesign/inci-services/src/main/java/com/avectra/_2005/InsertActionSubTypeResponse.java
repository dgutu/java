
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
 *         &lt;element name="InsertActionSubTypeResult" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "insertActionSubTypeResult"
})
@XmlRootElement(name = "InsertActionSubTypeResponse")
public class InsertActionSubTypeResponse {

    @XmlElement(name = "InsertActionSubTypeResult", required = true)
    protected String insertActionSubTypeResult;

    /**
     * Gets the value of the insertActionSubTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertActionSubTypeResult() {
        return insertActionSubTypeResult;
    }

    /**
     * Sets the value of the insertActionSubTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertActionSubTypeResult(String value) {
        this.insertActionSubTypeResult = value;
    }

}
