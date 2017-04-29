
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
 *         &lt;element name="WEBCommitteeNominationInsertResult" type="{http://www.avectra.com/2005/}CommitteeNominationsType" minOccurs="0"/>
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
    "webCommitteeNominationInsertResult"
})
@XmlRootElement(name = "WEBCommitteeNominationInsertResponse")
public class WEBCommitteeNominationInsertResponse {

    @XmlElement(name = "WEBCommitteeNominationInsertResult")
    protected CommitteeNominationsType webCommitteeNominationInsertResult;

    /**
     * Gets the value of the webCommitteeNominationInsertResult property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeNominationsType }
     *     
     */
    public CommitteeNominationsType getWEBCommitteeNominationInsertResult() {
        return webCommitteeNominationInsertResult;
    }

    /**
     * Sets the value of the webCommitteeNominationInsertResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeNominationsType }
     *     
     */
    public void setWEBCommitteeNominationInsertResult(CommitteeNominationsType value) {
        this.webCommitteeNominationInsertResult = value;
    }

}
