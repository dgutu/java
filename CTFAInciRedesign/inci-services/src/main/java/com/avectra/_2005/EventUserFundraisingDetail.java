
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventUserFundraisingDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventUserFundraisingDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reg_fundraising_goal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reg_fundraising_achieved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventUserFundraisingDetail", propOrder = {
    "regFundraisingGoal",
    "regFundraisingAchieved"
})
public class EventUserFundraisingDetail {

    @XmlElement(name = "reg_fundraising_goal")
    protected String regFundraisingGoal;
    @XmlElement(name = "reg_fundraising_achieved")
    protected String regFundraisingAchieved;

    /**
     * Gets the value of the regFundraisingGoal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegFundraisingGoal() {
        return regFundraisingGoal;
    }

    /**
     * Sets the value of the regFundraisingGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegFundraisingGoal(String value) {
        this.regFundraisingGoal = value;
    }

    /**
     * Gets the value of the regFundraisingAchieved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegFundraisingAchieved() {
        return regFundraisingAchieved;
    }

    /**
     * Sets the value of the regFundraisingAchieved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegFundraisingAchieved(String value) {
        this.regFundraisingAchieved = value;
    }

}
