
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="actionCustomerKey" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionTypeKey" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="actionSubtypeList" type="{http://www.avectra.com/2005/}ArrayOfGuid" minOccurs="0"/>
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
    "actionCustomerKey",
    "action",
    "actionTypeKey",
    "source",
    "actionDate",
    "actionSubtypeList"
})
@XmlRootElement(name = "InsertCustomerAction")
public class InsertCustomerAction {

    @XmlElement(required = true)
    protected String actionCustomerKey;
    protected String action;
    @XmlElement(required = true)
    protected String actionTypeKey;
    protected String source;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actionDate;
    protected ArrayOfGuid actionSubtypeList;

    /**
     * Gets the value of the actionCustomerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCustomerKey() {
        return actionCustomerKey;
    }

    /**
     * Sets the value of the actionCustomerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCustomerKey(String value) {
        this.actionCustomerKey = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the actionTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionTypeKey() {
        return actionTypeKey;
    }

    /**
     * Sets the value of the actionTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionTypeKey(String value) {
        this.actionTypeKey = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the actionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActionDate() {
        return actionDate;
    }

    /**
     * Sets the value of the actionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActionDate(XMLGregorianCalendar value) {
        this.actionDate = value;
    }

    /**
     * Gets the value of the actionSubtypeList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getActionSubtypeList() {
        return actionSubtypeList;
    }

    /**
     * Sets the value of the actionSubtypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setActionSubtypeList(ArrayOfGuid value) {
        this.actionSubtypeList = value;
    }

}
