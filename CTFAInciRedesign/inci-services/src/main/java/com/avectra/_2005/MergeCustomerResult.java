
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MergeCustomerResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MergeCustomerResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cst_key" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="AfterMergeAction" type="{http://www.avectra.com/2005/}AfterMergeAction"/>
 *         &lt;element name="Status" type="{http://www.avectra.com/2005/}MergeResult"/>
 *         &lt;element name="ModuleResults" type="{http://www.avectra.com/2005/}ArrayOfModuleResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MergeCustomerResult", propOrder = {
    "cstKey",
    "afterMergeAction",
    "status",
    "moduleResults"
})
public class MergeCustomerResult {

    @XmlElement(name = "cst_key", required = true)
    protected String cstKey;
    @XmlElement(name = "AfterMergeAction", required = true)
    protected AfterMergeAction afterMergeAction;
    @XmlElement(name = "Status", required = true)
    protected MergeResult status;
    @XmlElement(name = "ModuleResults")
    protected ArrayOfModuleResult moduleResults;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MergeResult }
     *     
     */
    public MergeResult getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MergeResult }
     *     
     */
    public void setStatus(MergeResult value) {
        this.status = value;
    }

    /**
     * Gets the value of the moduleResults property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModuleResult }
     *     
     */
    public ArrayOfModuleResult getModuleResults() {
        return moduleResults;
    }

    /**
     * Sets the value of the moduleResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModuleResult }
     *     
     */
    public void setModuleResults(ArrayOfModuleResult value) {
        this.moduleResults = value;
    }

}
