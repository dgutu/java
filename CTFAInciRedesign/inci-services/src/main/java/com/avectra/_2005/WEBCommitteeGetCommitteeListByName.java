
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
 *         &lt;element name="CommitteeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "committeeName"
})
@XmlRootElement(name = "WEBCommitteeGetCommitteeListByName")
public class WEBCommitteeGetCommitteeListByName {

    @XmlElement(name = "CommitteeName")
    protected String committeeName;

    /**
     * Gets the value of the committeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitteeName() {
        return committeeName;
    }

    /**
     * Sets the value of the committeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitteeName(String value) {
        this.committeeName = value;
    }

}
