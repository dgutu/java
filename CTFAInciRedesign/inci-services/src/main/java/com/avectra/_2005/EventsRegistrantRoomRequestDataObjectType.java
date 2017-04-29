
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrant_Room_Request_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrant_Room_Request_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rrr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rrr_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="rrr_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rrr_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="rrr_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rrr_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="rrr_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rrr_reg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rrr_rmt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rrr_non_smoking_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="rrr_cc_number" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="rrr_cc_number_display" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="rrr_notes" type="{http://www.avectra.com/2005/}stringLength400_Type" minOccurs="0"/>
 *         &lt;element name="rrr_ert_evl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rrr_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rrr_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rrr_erb_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rrr_evh_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrant_Room_Request_DataObjectType", propOrder = {
    "rrrKey",
    "rrrAddUser",
    "rrrAddDate",
    "rrrChangeUser",
    "rrrChangeDate",
    "rrrDeleteFlag",
    "rrrKeyExt",
    "rrrRegKey",
    "rrrRmtKey",
    "rrrNonSmokingFlag",
    "rrrCcNumber",
    "rrrCcNumberDisplay",
    "rrrNotes",
    "rrrErtEvlKey",
    "rrrEntityKey",
    "rrrDate",
    "rrrErbKey",
    "rrrEvhKey"
})
public class EventsRegistrantRoomRequestDataObjectType {

    @XmlElementRef(name = "rrr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rrrKey;
    @XmlElementRef(name = "rrr_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rrrAddUser;
    @XmlElementRef(name = "rrr_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rrrAddDate;
    @XmlElementRef(name = "rrr_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rrrChangeUser;
    @XmlElementRef(name = "rrr_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rrrChangeDate;
    @XmlElementRef(name = "rrr_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rrrDeleteFlag;
    @XmlElementRef(name = "rrr_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rrrKeyExt;
    @XmlElementRef(name = "rrr_reg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rrrRegKey;
    @XmlElementRef(name = "rrr_rmt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rrrRmtKey;
    @XmlElementRef(name = "rrr_non_smoking_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rrrNonSmokingFlag;
    @XmlElementRef(name = "rrr_cc_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rrrCcNumber;
    @XmlElementRef(name = "rrr_cc_number_display", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rrrCcNumberDisplay;
    @XmlElementRef(name = "rrr_notes", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rrrNotes;
    @XmlElementRef(name = "rrr_ert_evl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rrrErtEvlKey;
    @XmlElementRef(name = "rrr_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rrrEntityKey;
    @XmlElementRef(name = "rrr_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rrrDate;
    @XmlElementRef(name = "rrr_erb_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rrrErbKey;
    @XmlElementRef(name = "rrr_evh_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rrrEvhKey;

    /**
     * Gets the value of the rrrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRrrKey() {
        return rrrKey;
    }

    /**
     * Sets the value of the rrrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRrrKey(JAXBElement<String> value) {
        this.rrrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rrrAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRrrAddUser() {
        return rrrAddUser;
    }

    /**
     * Sets the value of the rrrAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRrrAddUser(JAXBElement<String> value) {
        this.rrrAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rrrAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRrrAddDate() {
        return rrrAddDate;
    }

    /**
     * Sets the value of the rrrAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRrrAddDate(JAXBElement<String> value) {
        this.rrrAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rrrChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRrrChangeUser() {
        return rrrChangeUser;
    }

    /**
     * Sets the value of the rrrChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRrrChangeUser(JAXBElement<String> value) {
        this.rrrChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rrrChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRrrChangeDate() {
        return rrrChangeDate;
    }

    /**
     * Sets the value of the rrrChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRrrChangeDate(JAXBElement<String> value) {
        this.rrrChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rrrDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRrrDeleteFlag() {
        return rrrDeleteFlag;
    }

    /**
     * Sets the value of the rrrDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRrrDeleteFlag(JAXBElement<Short> value) {
        this.rrrDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rrrKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRrrKeyExt() {
        return rrrKeyExt;
    }

    /**
     * Sets the value of the rrrKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRrrKeyExt(JAXBElement<String> value) {
        this.rrrKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rrrRegKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRrrRegKey() {
        return rrrRegKey;
    }

    /**
     * Sets the value of the rrrRegKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRrrRegKey(JAXBElement<String> value) {
        this.rrrRegKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rrrRmtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRrrRmtKey() {
        return rrrRmtKey;
    }

    /**
     * Sets the value of the rrrRmtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRrrRmtKey(JAXBElement<String> value) {
        this.rrrRmtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rrrNonSmokingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRrrNonSmokingFlag() {
        return rrrNonSmokingFlag;
    }

    /**
     * Sets the value of the rrrNonSmokingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRrrNonSmokingFlag(JAXBElement<Short> value) {
        this.rrrNonSmokingFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rrrCcNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRrrCcNumber() {
        return rrrCcNumber;
    }

    /**
     * Sets the value of the rrrCcNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRrrCcNumber(JAXBElement<String> value) {
        this.rrrCcNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rrrCcNumberDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRrrCcNumberDisplay() {
        return rrrCcNumberDisplay;
    }

    /**
     * Sets the value of the rrrCcNumberDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRrrCcNumberDisplay(JAXBElement<String> value) {
        this.rrrCcNumberDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rrrNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRrrNotes() {
        return rrrNotes;
    }

    /**
     * Sets the value of the rrrNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRrrNotes(JAXBElement<String> value) {
        this.rrrNotes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rrrErtEvlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRrrErtEvlKey() {
        return rrrErtEvlKey;
    }

    /**
     * Sets the value of the rrrErtEvlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRrrErtEvlKey(JAXBElement<String> value) {
        this.rrrErtEvlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rrrEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRrrEntityKey() {
        return rrrEntityKey;
    }

    /**
     * Sets the value of the rrrEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRrrEntityKey(JAXBElement<String> value) {
        this.rrrEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rrrDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRrrDate() {
        return rrrDate;
    }

    /**
     * Sets the value of the rrrDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRrrDate(JAXBElement<String> value) {
        this.rrrDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rrrErbKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRrrErbKey() {
        return rrrErbKey;
    }

    /**
     * Sets the value of the rrrErbKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRrrErbKey(JAXBElement<String> value) {
        this.rrrErbKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rrrEvhKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRrrEvhKey() {
        return rrrEvhKey;
    }

    /**
     * Sets the value of the rrrEvhKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRrrEvhKey(JAXBElement<String> value) {
        this.rrrEvhKey = ((JAXBElement<String> ) value);
    }

}
