
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExhibitorBoothNew_Booth_Category_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExhibitorBoothNew_Booth_Category_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bct_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bct_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="bct_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="bct_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="bct_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="bct_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="bct_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="bct_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bct_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExhibitorBoothNew_Booth_Category_DataObjectType", propOrder = {
    "bctKey",
    "bctCode",
    "bctAddUser",
    "bctAddDate",
    "bctChangeUser",
    "bctChangeDate",
    "bctDeleteFlag",
    "bctKeyExt",
    "bctEntityKey"
})
public class ExhibitorBoothNewBoothCategoryDataObjectType {

    @XmlElementRef(name = "bct_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bctKey;
    @XmlElementRef(name = "bct_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bctCode;
    @XmlElementRef(name = "bct_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bctAddUser;
    @XmlElementRef(name = "bct_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bctAddDate;
    @XmlElementRef(name = "bct_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bctChangeUser;
    @XmlElementRef(name = "bct_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bctChangeDate;
    @XmlElementRef(name = "bct_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> bctDeleteFlag;
    @XmlElementRef(name = "bct_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bctKeyExt;
    @XmlElementRef(name = "bct_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> bctEntityKey;

    /**
     * Gets the value of the bctKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBctKey() {
        return bctKey;
    }

    /**
     * Sets the value of the bctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBctKey(JAXBElement<String> value) {
        this.bctKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bctCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBctCode() {
        return bctCode;
    }

    /**
     * Sets the value of the bctCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBctCode(JAXBElement<String> value) {
        this.bctCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bctAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBctAddUser() {
        return bctAddUser;
    }

    /**
     * Sets the value of the bctAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBctAddUser(JAXBElement<String> value) {
        this.bctAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bctAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBctAddDate() {
        return bctAddDate;
    }

    /**
     * Sets the value of the bctAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBctAddDate(JAXBElement<String> value) {
        this.bctAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bctChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBctChangeUser() {
        return bctChangeUser;
    }

    /**
     * Sets the value of the bctChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBctChangeUser(JAXBElement<String> value) {
        this.bctChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bctChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBctChangeDate() {
        return bctChangeDate;
    }

    /**
     * Sets the value of the bctChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBctChangeDate(JAXBElement<String> value) {
        this.bctChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bctDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBctDeleteFlag() {
        return bctDeleteFlag;
    }

    /**
     * Sets the value of the bctDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBctDeleteFlag(JAXBElement<Short> value) {
        this.bctDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the bctKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBctKeyExt() {
        return bctKeyExt;
    }

    /**
     * Sets the value of the bctKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBctKeyExt(JAXBElement<String> value) {
        this.bctKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bctEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBctEntityKey() {
        return bctEntityKey;
    }

    /**
     * Sets the value of the bctEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBctEntityKey(JAXBElement<String> value) {
        this.bctEntityKey = ((JAXBElement<String> ) value);
    }

}
