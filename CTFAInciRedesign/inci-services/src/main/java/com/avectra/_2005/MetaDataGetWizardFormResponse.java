
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
 *         &lt;element name="MetaDataGetWizardFormResult" type="{http://www.avectra.com/2005/}AVForm" minOccurs="0"/>
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
    "metaDataGetWizardFormResult"
})
@XmlRootElement(name = "MetaDataGetWizardFormResponse")
public class MetaDataGetWizardFormResponse {

    @XmlElement(name = "MetaDataGetWizardFormResult")
    protected AVForm metaDataGetWizardFormResult;

    /**
     * Gets the value of the metaDataGetWizardFormResult property.
     * 
     * @return
     *     possible object is
     *     {@link AVForm }
     *     
     */
    public AVForm getMetaDataGetWizardFormResult() {
        return metaDataGetWizardFormResult;
    }

    /**
     * Sets the value of the metaDataGetWizardFormResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AVForm }
     *     
     */
    public void setMetaDataGetWizardFormResult(AVForm value) {
        this.metaDataGetWizardFormResult = value;
    }

}
