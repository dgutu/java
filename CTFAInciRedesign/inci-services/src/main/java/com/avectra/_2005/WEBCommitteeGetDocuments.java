
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
 *         &lt;element name="CommitteeKey" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "committeeKey"
})
@XmlRootElement(name = "WEBCommitteeGetDocuments")
public class WEBCommitteeGetDocuments {

    @XmlElement(name = "CommitteeKey", required = true)
    protected String committeeKey;

    /**
     * Gets the value of the committeeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitteeKey() {
        return committeeKey;
    }

    /**
     * Sets the value of the committeeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitteeKey(String value) {
        this.committeeKey = value;
    }

}
