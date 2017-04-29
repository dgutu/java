
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AVFormControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AVFormControl">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.avectra.com/2005/}DesignedFormControl">
 *       &lt;sequence>
 *         &lt;element name="Caption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataObject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvailableValues" type="{http://www.avectra.com/2005/}ArrayOfAvailableValue" minOccurs="0"/>
 *         &lt;element name="DependantControls" type="{http://www.avectra.com/2005/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsInvisible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InputMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CausesAutoPostBack" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="GroupingTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Left" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Top" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AVFormControl", propOrder = {
    "caption",
    "dataObject",
    "availableValues",
    "dependantControls",
    "name",
    "type",
    "isRequired",
    "isReadOnly",
    "isInvisible",
    "defaultValue",
    "inputMask",
    "causesAutoPostBack",
    "groupingTag",
    "left",
    "top",
    "height",
    "width"
})
public class AVFormControl
    extends DesignedFormControl
{

    @XmlElement(name = "Caption")
    protected String caption;
    @XmlElement(name = "DataObject")
    protected String dataObject;
    @XmlElement(name = "AvailableValues")
    protected ArrayOfAvailableValue availableValues;
    @XmlElement(name = "DependantControls")
    protected ArrayOfString dependantControls;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "IsRequired")
    protected boolean isRequired;
    @XmlElement(name = "IsReadOnly")
    protected boolean isReadOnly;
    @XmlElement(name = "IsInvisible")
    protected boolean isInvisible;
    @XmlElement(name = "DefaultValue")
    protected String defaultValue;
    @XmlElement(name = "InputMask")
    protected String inputMask;
    @XmlElement(name = "CausesAutoPostBack")
    protected boolean causesAutoPostBack;
    @XmlElement(name = "GroupingTag")
    protected String groupingTag;
    @XmlElement(name = "Left")
    protected int left;
    @XmlElement(name = "Top")
    protected int top;
    @XmlElement(name = "Height")
    protected int height;
    @XmlElement(name = "Width")
    protected int width;

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

    /**
     * Gets the value of the dataObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataObject() {
        return dataObject;
    }

    /**
     * Sets the value of the dataObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataObject(String value) {
        this.dataObject = value;
    }

    /**
     * Gets the value of the availableValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAvailableValue }
     *     
     */
    public ArrayOfAvailableValue getAvailableValues() {
        return availableValues;
    }

    /**
     * Sets the value of the availableValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAvailableValue }
     *     
     */
    public void setAvailableValues(ArrayOfAvailableValue value) {
        this.availableValues = value;
    }

    /**
     * Gets the value of the dependantControls property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getDependantControls() {
        return dependantControls;
    }

    /**
     * Sets the value of the dependantControls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setDependantControls(ArrayOfString value) {
        this.dependantControls = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the isRequired property.
     * 
     */
    public boolean isIsRequired() {
        return isRequired;
    }

    /**
     * Sets the value of the isRequired property.
     * 
     */
    public void setIsRequired(boolean value) {
        this.isRequired = value;
    }

    /**
     * Gets the value of the isReadOnly property.
     * 
     */
    public boolean isIsReadOnly() {
        return isReadOnly;
    }

    /**
     * Sets the value of the isReadOnly property.
     * 
     */
    public void setIsReadOnly(boolean value) {
        this.isReadOnly = value;
    }

    /**
     * Gets the value of the isInvisible property.
     * 
     */
    public boolean isIsInvisible() {
        return isInvisible;
    }

    /**
     * Sets the value of the isInvisible property.
     * 
     */
    public void setIsInvisible(boolean value) {
        this.isInvisible = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the inputMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputMask() {
        return inputMask;
    }

    /**
     * Sets the value of the inputMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputMask(String value) {
        this.inputMask = value;
    }

    /**
     * Gets the value of the causesAutoPostBack property.
     * 
     */
    public boolean isCausesAutoPostBack() {
        return causesAutoPostBack;
    }

    /**
     * Sets the value of the causesAutoPostBack property.
     * 
     */
    public void setCausesAutoPostBack(boolean value) {
        this.causesAutoPostBack = value;
    }

    /**
     * Gets the value of the groupingTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupingTag() {
        return groupingTag;
    }

    /**
     * Sets the value of the groupingTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupingTag(String value) {
        this.groupingTag = value;
    }

    /**
     * Gets the value of the left property.
     * 
     */
    public int getLeft() {
        return left;
    }

    /**
     * Sets the value of the left property.
     * 
     */
    public void setLeft(int value) {
        this.left = value;
    }

    /**
     * Gets the value of the top property.
     * 
     */
    public int getTop() {
        return top;
    }

    /**
     * Sets the value of the top property.
     * 
     */
    public void setTop(int value) {
        this.top = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * Gets the value of the width property.
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

}
