
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebUser_Individual_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebUser_Individual_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ind_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ind_first_name" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="ind_mid_name" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="ind_last_name" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="ind_full_name_cp" type="{http://www.avectra.com/2005/}stringLength187_Type" minOccurs="0"/>
 *         &lt;element name="ind_token" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebUser_Individual_DataObjectType", propOrder = {
    "indCstKey",
    "indFirstName",
    "indMidName",
    "indLastName",
    "indFullNameCp",
    "indToken"
})
public class WebUserIndividualDataObjectType {

    @XmlElementRef(name = "ind_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indCstKey;
    @XmlElementRef(name = "ind_first_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indFirstName;
    @XmlElementRef(name = "ind_mid_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indMidName;
    @XmlElementRef(name = "ind_last_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indLastName;
    @XmlElementRef(name = "ind_full_name_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indFullNameCp;
    @XmlElementRef(name = "ind_token", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indToken;

    /**
     * Gets the value of the indCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndCstKey() {
        return indCstKey;
    }

    /**
     * Sets the value of the indCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndCstKey(JAXBElement<String> value) {
        this.indCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndFirstName() {
        return indFirstName;
    }

    /**
     * Sets the value of the indFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndFirstName(JAXBElement<String> value) {
        this.indFirstName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indMidName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndMidName() {
        return indMidName;
    }

    /**
     * Sets the value of the indMidName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndMidName(JAXBElement<String> value) {
        this.indMidName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndLastName() {
        return indLastName;
    }

    /**
     * Sets the value of the indLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndLastName(JAXBElement<String> value) {
        this.indLastName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indFullNameCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndFullNameCp() {
        return indFullNameCp;
    }

    /**
     * Sets the value of the indFullNameCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndFullNameCp(JAXBElement<String> value) {
        this.indFullNameCp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndToken() {
        return indToken;
    }

    /**
     * Sets the value of the indToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndToken(JAXBElement<String> value) {
        this.indToken = ((JAXBElement<String> ) value);
    }

}
