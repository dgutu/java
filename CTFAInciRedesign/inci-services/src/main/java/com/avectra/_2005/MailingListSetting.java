
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailingListSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MailingListSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mailing_list_key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mailing_list_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mailing_list_category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.avectra.com/2005/}MailingPerferenceStatus"/>
 *         &lt;element name="email_key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address_key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone_key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax_key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailingListSetting", propOrder = {
    "mailingListKey",
    "mailingListName",
    "mailingListCategory",
    "status",
    "emailKey",
    "addressKey",
    "phoneKey",
    "faxKey"
})
public class MailingListSetting {

    @XmlElement(name = "mailing_list_key")
    protected String mailingListKey;
    @XmlElement(name = "mailing_list_name")
    protected String mailingListName;
    @XmlElement(name = "mailing_list_category")
    protected String mailingListCategory;
    @XmlElement(required = true)
    protected MailingPerferenceStatus status;
    @XmlElement(name = "email_key")
    protected String emailKey;
    @XmlElement(name = "address_key")
    protected String addressKey;
    @XmlElement(name = "phone_key")
    protected String phoneKey;
    @XmlElement(name = "fax_key")
    protected String faxKey;

    /**
     * Gets the value of the mailingListKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingListKey() {
        return mailingListKey;
    }

    /**
     * Sets the value of the mailingListKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingListKey(String value) {
        this.mailingListKey = value;
    }

    /**
     * Gets the value of the mailingListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingListName() {
        return mailingListName;
    }

    /**
     * Sets the value of the mailingListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingListName(String value) {
        this.mailingListName = value;
    }

    /**
     * Gets the value of the mailingListCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingListCategory() {
        return mailingListCategory;
    }

    /**
     * Sets the value of the mailingListCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingListCategory(String value) {
        this.mailingListCategory = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MailingPerferenceStatus }
     *     
     */
    public MailingPerferenceStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailingPerferenceStatus }
     *     
     */
    public void setStatus(MailingPerferenceStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the emailKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailKey() {
        return emailKey;
    }

    /**
     * Sets the value of the emailKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailKey(String value) {
        this.emailKey = value;
    }

    /**
     * Gets the value of the addressKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressKey() {
        return addressKey;
    }

    /**
     * Sets the value of the addressKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressKey(String value) {
        this.addressKey = value;
    }

    /**
     * Gets the value of the phoneKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneKey() {
        return phoneKey;
    }

    /**
     * Sets the value of the phoneKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneKey(String value) {
        this.phoneKey = value;
    }

    /**
     * Gets the value of the faxKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxKey() {
        return faxKey;
    }

    /**
     * Sets the value of the faxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxKey(String value) {
        this.faxKey = value;
    }

}
