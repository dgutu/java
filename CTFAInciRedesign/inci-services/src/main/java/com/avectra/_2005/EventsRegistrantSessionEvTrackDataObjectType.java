
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrantSession_ev_track_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrantSession_ev_track_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trk_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="trk_set_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="trk_name" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="trk_use_track_fees" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="trk_evt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="trk_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="trk_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="trk_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="trk_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="trk_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="trk_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="trk_short_description" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="trk_description" type="{http://www.avectra.com/2005/}stringLength500_Type" minOccurs="0"/>
 *         &lt;element name="trk_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrantSession_ev_track_DataObjectType", propOrder = {
    "trkKey",
    "trkSetKey",
    "trkName",
    "trkUseTrackFees",
    "trkEvtKey",
    "trkAddUser",
    "trkAddDate",
    "trkChangeUser",
    "trkChangeDate",
    "trkDeleteFlag",
    "trkKeyExt",
    "trkShortDescription",
    "trkDescription",
    "trkEntityKey"
})
public class EventsRegistrantSessionEvTrackDataObjectType {

    @XmlElementRef(name = "trk_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trkKey;
    @XmlElementRef(name = "trk_set_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trkSetKey;
    @XmlElementRef(name = "trk_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trkName;
    @XmlElementRef(name = "trk_use_track_fees", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> trkUseTrackFees;
    @XmlElementRef(name = "trk_evt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trkEvtKey;
    @XmlElementRef(name = "trk_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trkAddUser;
    @XmlElementRef(name = "trk_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trkAddDate;
    @XmlElementRef(name = "trk_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trkChangeUser;
    @XmlElementRef(name = "trk_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trkChangeDate;
    @XmlElementRef(name = "trk_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> trkDeleteFlag;
    @XmlElementRef(name = "trk_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trkKeyExt;
    @XmlElementRef(name = "trk_short_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trkShortDescription;
    @XmlElementRef(name = "trk_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trkDescription;
    @XmlElementRef(name = "trk_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> trkEntityKey;

    /**
     * Gets the value of the trkKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrkKey() {
        return trkKey;
    }

    /**
     * Sets the value of the trkKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrkKey(JAXBElement<String> value) {
        this.trkKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trkSetKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrkSetKey() {
        return trkSetKey;
    }

    /**
     * Sets the value of the trkSetKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrkSetKey(JAXBElement<String> value) {
        this.trkSetKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trkName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrkName() {
        return trkName;
    }

    /**
     * Sets the value of the trkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrkName(JAXBElement<String> value) {
        this.trkName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trkUseTrackFees property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTrkUseTrackFees() {
        return trkUseTrackFees;
    }

    /**
     * Sets the value of the trkUseTrackFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTrkUseTrackFees(JAXBElement<Short> value) {
        this.trkUseTrackFees = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the trkEvtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrkEvtKey() {
        return trkEvtKey;
    }

    /**
     * Sets the value of the trkEvtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrkEvtKey(JAXBElement<String> value) {
        this.trkEvtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trkAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrkAddUser() {
        return trkAddUser;
    }

    /**
     * Sets the value of the trkAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrkAddUser(JAXBElement<String> value) {
        this.trkAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trkAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrkAddDate() {
        return trkAddDate;
    }

    /**
     * Sets the value of the trkAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrkAddDate(JAXBElement<String> value) {
        this.trkAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trkChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrkChangeUser() {
        return trkChangeUser;
    }

    /**
     * Sets the value of the trkChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrkChangeUser(JAXBElement<String> value) {
        this.trkChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trkChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrkChangeDate() {
        return trkChangeDate;
    }

    /**
     * Sets the value of the trkChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrkChangeDate(JAXBElement<String> value) {
        this.trkChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trkDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTrkDeleteFlag() {
        return trkDeleteFlag;
    }

    /**
     * Sets the value of the trkDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTrkDeleteFlag(JAXBElement<Short> value) {
        this.trkDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the trkKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrkKeyExt() {
        return trkKeyExt;
    }

    /**
     * Sets the value of the trkKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrkKeyExt(JAXBElement<String> value) {
        this.trkKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trkShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrkShortDescription() {
        return trkShortDescription;
    }

    /**
     * Sets the value of the trkShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrkShortDescription(JAXBElement<String> value) {
        this.trkShortDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trkDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrkDescription() {
        return trkDescription;
    }

    /**
     * Sets the value of the trkDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrkDescription(JAXBElement<String> value) {
        this.trkDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trkEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrkEntityKey() {
        return trkEntityKey;
    }

    /**
     * Sets the value of the trkEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrkEntityKey(JAXBElement<String> value) {
        this.trkEntityKey = ((JAXBElement<String> ) value);
    }

}
