
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AVFormAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AVFormAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.avectra.com/2005/}ActionType"/>
 *         &lt;element name="Exit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DestinationWizardFormKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AVFormAction", propOrder = {
    "type",
    "exit",
    "destinationWizardFormKey"
})
public class AVFormAction {

    @XmlElement(name = "Type", required = true)
    protected ActionType type;
    @XmlElement(name = "Exit")
    protected boolean exit;
    @XmlElement(name = "DestinationWizardFormKey")
    protected String destinationWizardFormKey;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType }
     *     
     */
    public ActionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType }
     *     
     */
    public void setType(ActionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the exit property.
     * 
     */
    public boolean isExit() {
        return exit;
    }

    /**
     * Sets the value of the exit property.
     * 
     */
    public void setExit(boolean value) {
        this.exit = value;
    }

    /**
     * Gets the value of the destinationWizardFormKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationWizardFormKey() {
        return destinationWizardFormKey;
    }

    /**
     * Sets the value of the destinationWizardFormKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationWizardFormKey(String value) {
        this.destinationWizardFormKey = value;
    }

}
