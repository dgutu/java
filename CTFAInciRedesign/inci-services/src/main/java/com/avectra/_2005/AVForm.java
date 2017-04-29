
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AVForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AVForm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectKey" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="ObjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Controls" type="{http://www.avectra.com/2005/}ArrayOfAVFormControl" minOccurs="0"/>
 *         &lt;element name="Actions" type="{http://www.avectra.com/2005/}ArrayOfAVFormAction" minOccurs="0"/>
 *         &lt;element name="Interface" type="{http://www.avectra.com/2005/}AVFormDataInterface" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AVForm", propOrder = {
    "description",
    "title",
    "objectKey",
    "objectName",
    "objectPrefix",
    "objectType",
    "displayOnly",
    "controls",
    "actions",
    "_interface"
})
public class AVForm {

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
    @XmlElement(name = "DisplayOnly")
    protected boolean displayOnly;
    @XmlElement(name = "Controls")
    protected ArrayOfAVFormControl controls;
    @XmlElement(name = "Actions")
    protected ArrayOfAVFormAction actions;
    @XmlElement(name = "Interface")
    protected AVFormDataInterface _interface;

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
     * Gets the value of the displayOnly property.
     * 
     */
    public boolean isDisplayOnly() {
        return displayOnly;
    }

    /**
     * Sets the value of the displayOnly property.
     * 
     */
    public void setDisplayOnly(boolean value) {
        this.displayOnly = value;
    }

    /**
     * Gets the value of the controls property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAVFormControl }
     *     
     */
    public ArrayOfAVFormControl getControls() {
        return controls;
    }

    /**
     * Sets the value of the controls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAVFormControl }
     *     
     */
    public void setControls(ArrayOfAVFormControl value) {
        this.controls = value;
    }

    /**
     * Gets the value of the actions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAVFormAction }
     *     
     */
    public ArrayOfAVFormAction getActions() {
        return actions;
    }

    /**
     * Sets the value of the actions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAVFormAction }
     *     
     */
    public void setActions(ArrayOfAVFormAction value) {
        this.actions = value;
    }

    /**
     * Gets the value of the interface property.
     * 
     * @return
     *     possible object is
     *     {@link AVFormDataInterface }
     *     
     */
    public AVFormDataInterface getInterface() {
        return _interface;
    }

    /**
     * Sets the value of the interface property.
     * 
     * @param value
     *     allowed object is
     *     {@link AVFormDataInterface }
     *     
     */
    public void setInterface(AVFormDataInterface value) {
        this._interface = value;
    }

}
