
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
 *         &lt;element name="MetaDataGetWizardResult" type="{http://www.avectra.com/2005/}AVWizard" minOccurs="0"/>
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
    "metaDataGetWizardResult"
})
@XmlRootElement(name = "MetaDataGetWizardResponse")
public class MetaDataGetWizardResponse {

    @XmlElement(name = "MetaDataGetWizardResult")
    protected AVWizard metaDataGetWizardResult;

    /**
     * Gets the value of the metaDataGetWizardResult property.
     * 
     * @return
     *     possible object is
     *     {@link AVWizard }
     *     
     */
    public AVWizard getMetaDataGetWizardResult() {
        return metaDataGetWizardResult;
    }

    /**
     * Sets the value of the metaDataGetWizardResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AVWizard }
     *     
     */
    public void setMetaDataGetWizardResult(AVWizard value) {
        this.metaDataGetWizardResult = value;
    }

}
