
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Premium_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Premium_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prm_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="prm_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="prm_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="prm_taxable_amt" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="prm_prc_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prm_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="prm_prc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prm_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="prm_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Premium_DataObjectType", propOrder = {
    "prmAddUser",
    "prmAddDate",
    "prmChangeUser",
    "prmTaxableAmt",
    "prmPrcKeyExt",
    "prmChangeDate",
    "prmPrcKey",
    "prmDeleteFlag",
    "prmEntityKey"
})
public class FundraisingGiftPremiumDataObjectType {

    @XmlElementRef(name = "prm_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prmAddUser;
    @XmlElementRef(name = "prm_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prmAddDate;
    @XmlElementRef(name = "prm_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prmChangeUser;
    @XmlElementRef(name = "prm_taxable_amt", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> prmTaxableAmt;
    @XmlElementRef(name = "prm_prc_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prmPrcKeyExt;
    @XmlElementRef(name = "prm_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prmChangeDate;
    @XmlElementRef(name = "prm_prc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prmPrcKey;
    @XmlElementRef(name = "prm_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prmDeleteFlag;
    @XmlElementRef(name = "prm_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prmEntityKey;

    /**
     * Gets the value of the prmAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrmAddUser() {
        return prmAddUser;
    }

    /**
     * Sets the value of the prmAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrmAddUser(JAXBElement<String> value) {
        this.prmAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prmAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrmAddDate() {
        return prmAddDate;
    }

    /**
     * Sets the value of the prmAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrmAddDate(JAXBElement<String> value) {
        this.prmAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prmChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrmChangeUser() {
        return prmChangeUser;
    }

    /**
     * Sets the value of the prmChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrmChangeUser(JAXBElement<String> value) {
        this.prmChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prmTaxableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrmTaxableAmt() {
        return prmTaxableAmt;
    }

    /**
     * Sets the value of the prmTaxableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrmTaxableAmt(JAXBElement<BigDecimal> value) {
        this.prmTaxableAmt = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the prmPrcKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrmPrcKeyExt() {
        return prmPrcKeyExt;
    }

    /**
     * Sets the value of the prmPrcKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrmPrcKeyExt(JAXBElement<String> value) {
        this.prmPrcKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prmChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrmChangeDate() {
        return prmChangeDate;
    }

    /**
     * Sets the value of the prmChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrmChangeDate(JAXBElement<String> value) {
        this.prmChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prmPrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrmPrcKey() {
        return prmPrcKey;
    }

    /**
     * Sets the value of the prmPrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrmPrcKey(JAXBElement<String> value) {
        this.prmPrcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prmDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrmDeleteFlag() {
        return prmDeleteFlag;
    }

    /**
     * Sets the value of the prmDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrmDeleteFlag(JAXBElement<Short> value) {
        this.prmDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prmEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrmEntityKey() {
        return prmEntityKey;
    }

    /**
     * Sets the value of the prmEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrmEntityKey(JAXBElement<String> value) {
        this.prmEntityKey = ((JAXBElement<String> ) value);
    }

}
