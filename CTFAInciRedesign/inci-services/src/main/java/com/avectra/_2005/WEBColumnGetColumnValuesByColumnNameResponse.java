
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
 *         &lt;element name="WEBColumnGetColumnValuesByColumnNameResult" type="{http://www.avectra.com/2005/}ArrayOfAvailableValue" minOccurs="0"/>
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
    "webColumnGetColumnValuesByColumnNameResult"
})
@XmlRootElement(name = "WEBColumnGetColumnValuesByColumnNameResponse")
public class WEBColumnGetColumnValuesByColumnNameResponse {

    @XmlElement(name = "WEBColumnGetColumnValuesByColumnNameResult")
    protected ArrayOfAvailableValue webColumnGetColumnValuesByColumnNameResult;

    /**
     * Gets the value of the webColumnGetColumnValuesByColumnNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAvailableValue }
     *     
     */
    public ArrayOfAvailableValue getWEBColumnGetColumnValuesByColumnNameResult() {
        return webColumnGetColumnValuesByColumnNameResult;
    }

    /**
     * Sets the value of the webColumnGetColumnValuesByColumnNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAvailableValue }
     *     
     */
    public void setWEBColumnGetColumnValuesByColumnNameResult(ArrayOfAvailableValue value) {
        this.webColumnGetColumnValuesByColumnNameResult = value;
    }

}
