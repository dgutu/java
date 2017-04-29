
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MergeCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MergeCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cst_key" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="AfterMergeAction" type="{http://www.avectra.com/2005/}AfterMergeAction"/>
 *         &lt;element name="Modules" type="{http://www.avectra.com/2005/}ArrayOfString1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MergeCustomer", propOrder = {
    "cstKey",
    "afterMergeAction",
    "modules"
})
public class MergeCustomer {

    @XmlElement(name = "cst_key", required = true)
    protected String cstKey;
    @XmlElement(name = "AfterMergeAction", required = true)
    protected AfterMergeAction afterMergeAction;
    @XmlElement(name = "Modules")
    protected ArrayOfString1 modules;

    /**
     * Gets the value of the cstKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstKey() {
        return cstKey;
    }

    /**
     * Sets the value of the cstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstKey(String value) {
        this.cstKey = value;
    }

    /**
     * Gets the value of the afterMergeAction property.
     * 
     * @return
     *     possible object is
     *     {@link AfterMergeAction }
     *     
     */
    public AfterMergeAction getAfterMergeAction() {
        return afterMergeAction;
    }

    /**
     * Sets the value of the afterMergeAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AfterMergeAction }
     *     
     */
    public void setAfterMergeAction(AfterMergeAction value) {
        this.afterMergeAction = value;
    }

    /**
     * Gets the value of the modules property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString1 }
     *     
     */
    public ArrayOfString1 getModules() {
        return modules;
    }

    /**
     * Sets the value of the modules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString1 }
     *     
     */
    public void setModules(ArrayOfString1 value) {
        this.modules = value;
    }

}
