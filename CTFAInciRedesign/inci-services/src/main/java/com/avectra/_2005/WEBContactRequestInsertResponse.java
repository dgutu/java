
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
 *         &lt;element name="WEBContactRequestInsertResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "webContactRequestInsertResult"
})
@XmlRootElement(name = "WEBContactRequestInsertResponse")
public class WEBContactRequestInsertResponse {

    @XmlElement(name = "WEBContactRequestInsertResult")
    protected boolean webContactRequestInsertResult;

    /**
     * Gets the value of the webContactRequestInsertResult property.
     * 
     */
    public boolean isWEBContactRequestInsertResult() {
        return webContactRequestInsertResult;
    }

    /**
     * Sets the value of the webContactRequestInsertResult property.
     * 
     */
    public void setWEBContactRequestInsertResult(boolean value) {
        this.webContactRequestInsertResult = value;
    }

}
