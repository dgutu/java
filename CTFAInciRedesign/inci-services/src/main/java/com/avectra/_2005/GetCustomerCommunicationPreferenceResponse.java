
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="mailing_list_setting" type="{http://www.avectra.com/2005/}MailingListSetting"/>
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
    "mailingListSetting"
})
@XmlRootElement(name = "GetCustomerCommunicationPreferenceResponse")
public class GetCustomerCommunicationPreferenceResponse {

    @XmlElement(name = "mailing_list_setting", required = true, nillable = true)
    protected MailingListSetting mailingListSetting;

    /**
     * Gets the value of the mailingListSetting property.
     * 
     * @return
     *     possible object is
     *     {@link MailingListSetting }
     *     
     */
    public MailingListSetting getMailingListSetting() {
        return mailingListSetting;
    }

    /**
     * Sets the value of the mailingListSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailingListSetting }
     *     
     */
    public void setMailingListSetting(MailingListSetting value) {
        this.mailingListSetting = value;
    }

}
