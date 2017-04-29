
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AVWizard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AVWizard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectKey" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="ObjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Forms" type="{http://www.avectra.com/2005/}ArrayOfAVWizardForm" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AVWizard", propOrder = {
    "description",
    "title",
    "objectKey",
    "objectName",
    "objectPrefix",
    "objectType",
    "forms"
})
public class AVWizard {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "ObjectKey", required = true)
    protected String objectKey;
    @XmlElement(name = "ObjectName")
    protected String objectName;
    @XmlElement(name = "ObjectPrefix")
    protected String objectPrefix;
    @XmlElement(name = "ObjectType")
    protected String objectType;
    @XmlElement(name = "Forms")
    protected ArrayOfAVWizardForm forms;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the forms property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAVWizardForm }
     *     
     */
    public ArrayOfAVWizardForm getForms() {
        return forms;
    }

    /**
     * Sets the value of the forms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAVWizardForm }
     *     
     */
    public void setForms(ArrayOfAVWizardForm value) {
        this.forms = value;
    }

}
