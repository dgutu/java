
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Object complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Object">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="obj_key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="obj_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="obj_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListTable" type="{http://www.avectra.com/2005/}ListTable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Object", propOrder = {
    "objKey",
    "objName",
    "objDescription",
    "listTable"
})
public class Object {

    @XmlElement(name = "obj_key")
    protected String objKey;
    @XmlElement(name = "obj_name")
    protected String objName;
    @XmlElement(name = "obj_description")
    protected String objDescription;
    @XmlElement(name = "ListTable")
    protected ListTable listTable;

    /**
     * Gets the value of the objKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjKey() {
        return objKey;
    }

    /**
     * Sets the value of the objKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjKey(String value) {
        this.objKey = value;
    }

    /**
     * Gets the value of the objName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjName() {
        return objName;
    }

    /**
     * Sets the value of the objName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjName(String value) {
        this.objName = value;
    }

    /**
     * Gets the value of the objDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjDescription() {
        return objDescription;
    }

    /**
     * Sets the value of the objDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjDescription(String value) {
        this.objDescription = value;
    }

    /**
     * Gets the value of the listTable property.
     * 
     * @return
     *     possible object is
     *     {@link ListTable }
     *     
     */
    public ListTable getListTable() {
        return listTable;
    }

    /**
     * Sets the value of the listTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListTable }
     *     
     */
    public void setListTable(ListTable value) {
        this.listTable = value;
    }

}
