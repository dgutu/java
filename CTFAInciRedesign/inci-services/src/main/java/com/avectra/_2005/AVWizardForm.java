
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AVWizardForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AVWizardForm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Header" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectKey" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="ObjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProgressBarTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StepTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AVWizardForm", propOrder = {
    "key",
    "title",
    "header",
    "objectKey",
    "objectName",
    "objectPrefix",
    "objectType",
    "progressBarTitle",
    "stepTitle",
    "order"
})
public class AVWizardForm {

    @XmlElement(name = "Key")
    protected String key;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Header")
    protected String header;
    @XmlElement(name = "ObjectKey", required = true)
    protected String objectKey;
    @XmlElement(name = "ObjectName")
    protected String objectName;
    @XmlElement(name = "ObjectPrefix")
    protected String objectPrefix;
    @XmlElement(name = "ObjectType")
    protected String objectType;
    @XmlElement(name = "ProgressBarTitle")
    protected String progressBarTitle;
    @XmlElement(name = "StepTitle")
    protected String stepTitle;
    @XmlElement(name = "Order")
    protected int order;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader(String value) {
        this.header = value;
    }

    /**
     * Gets the value of the objectKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectKey() {
        return objectKey;
    }

    /**
     * Sets the value of the objectKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectKey(String value) {
        this.objectKey = value;
    }

    /**
     * Gets the value of the objectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * Sets the value of the objectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectName(String value) {
        this.objectName = value;
    }

    /**
     * Gets the value of the objectPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectPrefix() {
        return objectPrefix;
    }

    /**
     * Sets the value of the objectPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectPrefix(String value) {
        this.objectPrefix = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the progressBarTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgressBarTitle() {
        return progressBarTitle;
    }

    /**
     * Sets the value of the progressBarTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgressBarTitle(String value) {
        this.progressBarTitle = value;
    }

    /**
     * Gets the value of the stepTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStepTitle() {
        return stepTitle;
    }

    /**
     * Sets the value of the stepTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStepTitle(String value) {
        this.stepTitle = value;
    }

    /**
     * Gets the value of the order property.
     * 
     */
    public int getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     */
    public void setOrder(int value) {
        this.order = value;
    }

}
