
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExhibitorBoothNew_Booth_Type_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExhibitorBoothNew_Booth_Type_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bty_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bty_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="bty_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="bty_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="bty_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="bty_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="bty_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bty_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bty_bct_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="bty_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="bty_description" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="bty_square_footage" type="{http://www.avectra.com/2005/}av_decimal2_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExhibitorBoothNew_Booth_Type_DataObjectType", propOrder = {
    "btyKey",
    "btyAddUser",
    "btyAddDate",
    "btyChangeUser",
    "btyChangeDate",
    "btyDeleteFlag",
    "btyEntityKey",
    "btyKeyExt",
    "btyBctKey",
    "btyCode",
    "btyDescription",
    "btySquareFootage"
})
public class ExhibitorBoothNewBoothTypeDataObjectType {

    @XmlElementRef(name = "bty_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> btyKey;
    @XmlElementRef(name = "bty_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> btyAddUser;
    @XmlElementRef(name = "bty_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> btyAddDate;
    @XmlElementRef(name = "bty_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> btyChangeUser;
    @XmlElementRef(name = "bty_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> btyChangeDate;
    @XmlElementRef(name = "bty_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> btyDeleteFlag;
    @XmlElementRef(name = "bty_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> btyEntityKey;
    @XmlElementRef(name = "bty_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> btyKeyExt;
    @XmlElementRef(name = "bty_bct_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> btyBctKey;
    @XmlElementRef(name = "bty_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> btyCode;
    @XmlElementRef(name = "bty_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> btyDescription;
    @XmlElementRef(name = "bty_square_footage", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> btySquareFootage;

    /**
     * Gets the value of the btyKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBtyKey() {
        return btyKey;
    }

    /**
     * Sets the value of the btyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBtyKey(JAXBElement<String> value) {
        this.btyKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the btyAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBtyAddUser() {
        return btyAddUser;
    }

    /**
     * Sets the value of the btyAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBtyAddUser(JAXBElement<String> value) {
        this.btyAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the btyAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBtyAddDate() {
        return btyAddDate;
    }

    /**
     * Sets the value of the btyAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBtyAddDate(JAXBElement<String> value) {
        this.btyAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the btyChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBtyChangeUser() {
        return btyChangeUser;
    }

    /**
     * Sets the value of the btyChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBtyChangeUser(JAXBElement<String> value) {
        this.btyChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the btyChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBtyChangeDate() {
        return btyChangeDate;
    }

    /**
     * Sets the value of the btyChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBtyChangeDate(JAXBElement<String> value) {
        this.btyChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the btyDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBtyDeleteFlag() {
        return btyDeleteFlag;
    }

    /**
     * Sets the value of the btyDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBtyDeleteFlag(JAXBElement<Short> value) {
        this.btyDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the btyEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBtyEntityKey() {
        return btyEntityKey;
    }

    /**
     * Sets the value of the btyEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBtyEntityKey(JAXBElement<String> value) {
        this.btyEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the btyKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBtyKeyExt() {
        return btyKeyExt;
    }

    /**
     * Sets the value of the btyKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBtyKeyExt(JAXBElement<String> value) {
        this.btyKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the btyBctKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBtyBctKey() {
        return btyBctKey;
    }

    /**
     * Sets the value of the btyBctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBtyBctKey(JAXBElement<String> value) {
        this.btyBctKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the btyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBtyCode() {
        return btyCode;
    }

    /**
     * Sets the value of the btyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBtyCode(JAXBElement<String> value) {
        this.btyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the btyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBtyDescription() {
        return btyDescription;
    }

    /**
     * Sets the value of the btyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBtyDescription(JAXBElement<String> value) {
        this.btyDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the btySquareFootage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBtySquareFootage() {
        return btySquareFootage;
    }

    /**
     * Sets the value of the btySquareFootage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBtySquareFootage(JAXBElement<BigDecimal> value) {
        this.btySquareFootage = ((JAXBElement<BigDecimal> ) value);
    }

}
