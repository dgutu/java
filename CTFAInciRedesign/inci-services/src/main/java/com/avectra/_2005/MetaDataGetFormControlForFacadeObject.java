
package com.avectra._2005;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="FormKey" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="controlName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oNode" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "formKey",
    "controlName",
    "oNode"
})
@XmlRootElement(name = "MetaDataGetFormControlForFacadeObject")
public class MetaDataGetFormControlForFacadeObject {

    @XmlElement(name = "FormKey", required = true)
    protected String formKey;
    protected String controlName;
    protected MetaDataGetFormControlForFacadeObject.ONode oNode;

    /**
     * Gets the value of the formKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormKey() {
        return formKey;
    }

    /**
     * Sets the value of the formKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormKey(String value) {
        this.formKey = value;
    }

    /**
     * Gets the value of the controlName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlName() {
        return controlName;
    }

    /**
     * Sets the value of the controlName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlName(String value) {
        this.controlName = value;
    }

    /**
     * Gets the value of the oNode property.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataGetFormControlForFacadeObject.ONode }
     *     
     */
    public MetaDataGetFormControlForFacadeObject.ONode getONode() {
        return oNode;
    }

    /**
     * Sets the value of the oNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataGetFormControlForFacadeObject.ONode }
     *     
     */
    public void setONode(MetaDataGetFormControlForFacadeObject.ONode value) {
        this.oNode = value;
    }


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
     *         &lt;any/>
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
        "content"
    })
    public static class ONode {

        @XmlMixed
        @XmlAnyElement(lax = true)
        protected List<java.lang.Object> content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * {@link java.lang.Object }
         * 
         * 
         */
        public List<java.lang.Object> getContent() {
            if (content == null) {
                content = new ArrayList<java.lang.Object>();
            }
            return this.content;
        }

    }

}
