
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Donation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Donation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gft_key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dnr_cst_key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ind_first_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ind_last_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cst_eml_address_dn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gft_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gft_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adr_line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adr_line2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adr_city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adr_state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adr_post_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Donation", propOrder = {
    "gftKey",
    "dnrCstKey",
    "indFirstName",
    "indLastName",
    "cstEmlAddressDn",
    "gftAmount",
    "gftDate",
    "adrLine1",
    "adrLine2",
    "adrCity",
    "adrState",
    "adrPostCode"
})
public class Donation {

    @XmlElement(name = "gft_key")
    protected String gftKey;
    @XmlElement(name = "dnr_cst_key")
    protected String dnrCstKey;
    @XmlElement(name = "ind_first_name")
    protected String indFirstName;
    @XmlElement(name = "ind_last_name")
    protected String indLastName;
    @XmlElement(name = "cst_eml_address_dn")
    protected String cstEmlAddressDn;
    @XmlElement(name = "gft_amount")
    protected String gftAmount;
    @XmlElement(name = "gft_date")
    protected String gftDate;
    @XmlElement(name = "adr_line1")
    protected String adrLine1;
    @XmlElement(name = "adr_line2")
    protected String adrLine2;
    @XmlElement(name = "adr_city")
    protected String adrCity;
    @XmlElement(name = "adr_state")
    protected String adrState;
    @XmlElement(name = "adr_post_code")
    protected String adrPostCode;

    /**
     * Gets the value of the gftKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGftKey() {
        return gftKey;
    }

    /**
     * Sets the value of the gftKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGftKey(String value) {
        this.gftKey = value;
    }

    /**
     * Gets the value of the dnrCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnrCstKey() {
        return dnrCstKey;
    }

    /**
     * Sets the value of the dnrCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnrCstKey(String value) {
        this.dnrCstKey = value;
    }

    /**
     * Gets the value of the indFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndFirstName() {
        return indFirstName;
    }

    /**
     * Sets the value of the indFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndFirstName(String value) {
        this.indFirstName = value;
    }

    /**
     * Gets the value of the indLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndLastName() {
        return indLastName;
    }

    /**
     * Sets the value of the indLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndLastName(String value) {
        this.indLastName = value;
    }

    /**
     * Gets the value of the cstEmlAddressDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstEmlAddressDn() {
        return cstEmlAddressDn;
    }

    /**
     * Sets the value of the cstEmlAddressDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstEmlAddressDn(String value) {
        this.cstEmlAddressDn = value;
    }

    /**
     * Gets the value of the gftAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGftAmount() {
        return gftAmount;
    }

    /**
     * Sets the value of the gftAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGftAmount(String value) {
        this.gftAmount = value;
    }

    /**
     * Gets the value of the gftDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGftDate() {
        return gftDate;
    }

    /**
     * Sets the value of the gftDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGftDate(String value) {
        this.gftDate = value;
    }

    /**
     * Gets the value of the adrLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrLine1() {
        return adrLine1;
    }

    /**
     * Sets the value of the adrLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrLine1(String value) {
        this.adrLine1 = value;
    }

    /**
     * Gets the value of the adrLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrLine2() {
        return adrLine2;
    }

    /**
     * Sets the value of the adrLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrLine2(String value) {
        this.adrLine2 = value;
    }

    /**
     * Gets the value of the adrCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrCity() {
        return adrCity;
    }

    /**
     * Sets the value of the adrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrCity(String value) {
        this.adrCity = value;
    }

    /**
     * Gets the value of the adrState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrState() {
        return adrState;
    }

    /**
     * Sets the value of the adrState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrState(String value) {
        this.adrState = value;
    }

    /**
     * Gets the value of the adrPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrPostCode() {
        return adrPostCode;
    }

    /**
     * Sets the value of the adrPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrPostCode(String value) {
        this.adrPostCode = value;
    }

}
