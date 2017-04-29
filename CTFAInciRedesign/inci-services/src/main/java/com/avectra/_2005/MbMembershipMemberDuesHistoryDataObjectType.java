
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mb_membership_Member_Dues_History_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mb_membership_Member_Dues_History_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mdh_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mdh_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="mdh_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="mdh_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="mdh_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="mdh_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="mdh_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mdh_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mdh_mbr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mdh_dues_year" type="{http://www.avectra.com/2005/}stringLength4_Type" minOccurs="0"/>
 *         &lt;element name="mdh_inv_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="mdh_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mb_membership_Member_Dues_History_DataObjectType", propOrder = {
    "mdhKey",
    "mdhAddUser",
    "mdhAddDate",
    "mdhChangeUser",
    "mdhChangeDate",
    "mdhDeleteFlag",
    "mdhKeyExt",
    "mdhCstKey",
    "mdhMbrKey",
    "mdhDuesYear",
    "mdhInvKey",
    "mdhEntityKey"
})
public class MbMembershipMemberDuesHistoryDataObjectType {

    @XmlElementRef(name = "mdh_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mdhKey;
    @XmlElementRef(name = "mdh_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mdhAddUser;
    @XmlElementRef(name = "mdh_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mdhAddDate;
    @XmlElementRef(name = "mdh_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mdhChangeUser;
    @XmlElementRef(name = "mdh_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mdhChangeDate;
    @XmlElementRef(name = "mdh_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> mdhDeleteFlag;
    @XmlElementRef(name = "mdh_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mdhKeyExt;
    @XmlElementRef(name = "mdh_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mdhCstKey;
    @XmlElementRef(name = "mdh_mbr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mdhMbrKey;
    @XmlElementRef(name = "mdh_dues_year", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mdhDuesYear;
    @XmlElementRef(name = "mdh_inv_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mdhInvKey;
    @XmlElementRef(name = "mdh_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> mdhEntityKey;

    /**
     * Gets the value of the mdhKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMdhKey() {
        return mdhKey;
    }

    /**
     * Sets the value of the mdhKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMdhKey(JAXBElement<String> value) {
        this.mdhKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mdhAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMdhAddUser() {
        return mdhAddUser;
    }

    /**
     * Sets the value of the mdhAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMdhAddUser(JAXBElement<String> value) {
        this.mdhAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mdhAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMdhAddDate() {
        return mdhAddDate;
    }

    /**
     * Sets the value of the mdhAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMdhAddDate(JAXBElement<String> value) {
        this.mdhAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mdhChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMdhChangeUser() {
        return mdhChangeUser;
    }

    /**
     * Sets the value of the mdhChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMdhChangeUser(JAXBElement<String> value) {
        this.mdhChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mdhChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMdhChangeDate() {
        return mdhChangeDate;
    }

    /**
     * Sets the value of the mdhChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMdhChangeDate(JAXBElement<String> value) {
        this.mdhChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mdhDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMdhDeleteFlag() {
        return mdhDeleteFlag;
    }

    /**
     * Sets the value of the mdhDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMdhDeleteFlag(JAXBElement<Short> value) {
        this.mdhDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the mdhKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMdhKeyExt() {
        return mdhKeyExt;
    }

    /**
     * Sets the value of the mdhKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMdhKeyExt(JAXBElement<String> value) {
        this.mdhKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mdhCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMdhCstKey() {
        return mdhCstKey;
    }

    /**
     * Sets the value of the mdhCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMdhCstKey(JAXBElement<String> value) {
        this.mdhCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mdhMbrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMdhMbrKey() {
        return mdhMbrKey;
    }

    /**
     * Sets the value of the mdhMbrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMdhMbrKey(JAXBElement<String> value) {
        this.mdhMbrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mdhDuesYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMdhDuesYear() {
        return mdhDuesYear;
    }

    /**
     * Sets the value of the mdhDuesYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMdhDuesYear(JAXBElement<String> value) {
        this.mdhDuesYear = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mdhInvKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMdhInvKey() {
        return mdhInvKey;
    }

    /**
     * Sets the value of the mdhInvKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMdhInvKey(JAXBElement<String> value) {
        this.mdhInvKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mdhEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMdhEntityKey() {
        return mdhEntityKey;
    }

    /**
     * Sets the value of the mdhEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMdhEntityKey(JAXBElement<String> value) {
        this.mdhEntityKey = ((JAXBElement<String> ) value);
    }

}
