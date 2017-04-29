
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
 *         &lt;element name="OrganizationKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="oUpdateNode" minOccurs="0">
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
    "organizationKey",
    "oUpdateNode"
})
@XmlRootElement(name = "SetOrganizationInformation")
public class SetOrganizationInformation {

    @XmlElement(name = "OrganizationKey", required = true, nillable = true)
    protected String organizationKey;
    protected SetOrganizationInformation.OUpdateNode oUpdateNode;

    /**
     * Gets the value of the organizationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationKey() {
        return organizationKey;
    }

    /**
     * Sets the value of the organizationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationKey(String value) {
        this.organizationKey = value;
    }

    /**
     * Gets the value of the oUpdateNode property.
     * 
     * @return
     *     possible object is
     *     {@link SetOrganizationInformation.OUpdateNode }
     *     
     */
    public SetOrganizationInformation.OUpdateNode getOUpdateNode() {
        return oUpdateNode;
    }

    /**
     * Sets the value of the oUpdateNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetOrganizationInformation.OUpdateNode }
     *     
     */
    public void setOUpdateNode(SetOrganizationInformation.OUpdateNode value) {
        this.oUpdateNode = value;
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
    public static class OUpdateNode {

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
