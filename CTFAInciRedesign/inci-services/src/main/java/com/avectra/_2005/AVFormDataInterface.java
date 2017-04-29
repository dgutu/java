
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AVFormDataInterface complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AVFormDataInterface">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsertMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelectMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefreshMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeleteMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ServiceUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AVFormDataInterface", propOrder = {
    "insertMethod",
    "updateMethod",
    "selectMethod",
    "refreshMethod",
    "deleteMethod"
})
public class AVFormDataInterface {

    @XmlElement(name = "InsertMethod")
    protected String insertMethod;
    @XmlElement(name = "UpdateMethod")
    protected String updateMethod;
    @XmlElement(name = "SelectMethod")
    protected String selectMethod;
    @XmlElement(name = "RefreshMethod")
    protected String refreshMethod;
    @XmlElement(name = "DeleteMethod")
    protected String deleteMethod;
    @XmlAttribute(name = "ServiceUrl")
    protected String serviceUrl;

    /**
     * Gets the value of the insertMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertMethod() {
        return insertMethod;
    }

    /**
     * Sets the value of the insertMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertMethod(String value) {
        this.insertMethod = value;
    }

    /**
     * Gets the value of the updateMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateMethod() {
        return updateMethod;
    }

    /**
     * Sets the value of the updateMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateMethod(String value) {
        this.updateMethod = value;
    }

    /**
     * Gets the value of the selectMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectMethod() {
        return selectMethod;
    }

    /**
     * Sets the value of the selectMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectMethod(String value) {
        this.selectMethod = value;
    }

    /**
     * Gets the value of the refreshMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefreshMethod() {
        return refreshMethod;
    }

    /**
     * Sets the value of the refreshMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefreshMethod(String value) {
        this.refreshMethod = value;
    }

    /**
     * Gets the value of the deleteMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteMethod() {
        return deleteMethod;
    }

    /**
     * Sets the value of the deleteMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteMethod(String value) {
        this.deleteMethod = value;
    }

    /**
     * Gets the value of the serviceUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceUrl() {
        return serviceUrl;
    }

    /**
     * Sets the value of the serviceUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceUrl(String value) {
        this.serviceUrl = value;
    }

}
