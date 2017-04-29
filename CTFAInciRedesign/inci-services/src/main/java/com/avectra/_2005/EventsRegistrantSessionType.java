
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrantSessionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrantSessionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentKey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ev_registration_session" type="{http://www.avectra.com/2005/}EventsRegistrantSession_ev_registration_session_DataObjectType"/>
 *         &lt;element name="co_customer" type="{http://www.avectra.com/2005/}EventsRegistrantSession_co_customer_DataObjectType"/>
 *         &lt;element name="ev_registration" type="{http://www.avectra.com/2005/}EventsRegistrantSession_ev_registration_DataObjectType"/>
 *         &lt;element name="ev_event" type="{http://www.avectra.com/2005/}EventsRegistrantSession_ev_event_DataObjectType"/>
 *         &lt;element name="ev_session" type="{http://www.avectra.com/2005/}EventsRegistrantSession_ev_session_DataObjectType"/>
 *         &lt;element name="ev_track" type="{http://www.avectra.com/2005/}EventsRegistrantSession_ev_track_DataObjectType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrantSessionType", propOrder = {
    "currentKey",
    "evRegistrationSession",
    "coCustomer",
    "evRegistration",
    "evEvent",
    "evSession",
    "evTrack"
})
public class EventsRegistrantSessionType {

    @XmlElementRef(name = "CurrentKey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> currentKey;
    @XmlElement(name = "ev_registration_session", required = true)
    protected EventsRegistrantSessionEvRegistrationSessionDataObjectType evRegistrationSession;
    @XmlElement(name = "co_customer", required = true)
    protected EventsRegistrantSessionCoCustomerDataObjectType coCustomer;
    @XmlElement(name = "ev_registration", required = true)
    protected EventsRegistrantSessionEvRegistrationDataObjectType evRegistration;
    @XmlElement(name = "ev_event", required = true)
    protected EventsRegistrantSessionEvEventDataObjectType evEvent;
    @XmlElement(name = "ev_session", required = true)
    protected EventsRegistrantSessionEvSessionDataObjectType evSession;
    @XmlElement(name = "ev_track", required = true)
    protected EventsRegistrantSessionEvTrackDataObjectType evTrack;

    /**
     * Gets the value of the currentKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentKey() {
        return currentKey;
    }

    /**
     * Sets the value of the currentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentKey(JAXBElement<String> value) {
        this.currentKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evRegistrationSession property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantSessionEvRegistrationSessionDataObjectType }
     *     
     */
    public EventsRegistrantSessionEvRegistrationSessionDataObjectType getEvRegistrationSession() {
        return evRegistrationSession;
    }

    /**
     * Sets the value of the evRegistrationSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantSessionEvRegistrationSessionDataObjectType }
     *     
     */
    public void setEvRegistrationSession(EventsRegistrantSessionEvRegistrationSessionDataObjectType value) {
        this.evRegistrationSession = value;
    }

    /**
     * Gets the value of the coCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantSessionCoCustomerDataObjectType }
     *     
     */
    public EventsRegistrantSessionCoCustomerDataObjectType getCoCustomer() {
        return coCustomer;
    }

    /**
     * Sets the value of the coCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantSessionCoCustomerDataObjectType }
     *     
     */
    public void setCoCustomer(EventsRegistrantSessionCoCustomerDataObjectType value) {
        this.coCustomer = value;
    }

    /**
     * Gets the value of the evRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantSessionEvRegistrationDataObjectType }
     *     
     */
    public EventsRegistrantSessionEvRegistrationDataObjectType getEvRegistration() {
        return evRegistration;
    }

    /**
     * Sets the value of the evRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantSessionEvRegistrationDataObjectType }
     *     
     */
    public void setEvRegistration(EventsRegistrantSessionEvRegistrationDataObjectType value) {
        this.evRegistration = value;
    }

    /**
     * Gets the value of the evEvent property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantSessionEvEventDataObjectType }
     *     
     */
    public EventsRegistrantSessionEvEventDataObjectType getEvEvent() {
        return evEvent;
    }

    /**
     * Sets the value of the evEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantSessionEvEventDataObjectType }
     *     
     */
    public void setEvEvent(EventsRegistrantSessionEvEventDataObjectType value) {
        this.evEvent = value;
    }

    /**
     * Gets the value of the evSession property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantSessionEvSessionDataObjectType }
     *     
     */
    public EventsRegistrantSessionEvSessionDataObjectType getEvSession() {
        return evSession;
    }

    /**
     * Sets the value of the evSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantSessionEvSessionDataObjectType }
     *     
     */
    public void setEvSession(EventsRegistrantSessionEvSessionDataObjectType value) {
        this.evSession = value;
    }

    /**
     * Gets the value of the evTrack property.
     * 
     * @return
     *     possible object is
     *     {@link EventsRegistrantSessionEvTrackDataObjectType }
     *     
     */
    public EventsRegistrantSessionEvTrackDataObjectType getEvTrack() {
        return evTrack;
    }

    /**
     * Sets the value of the evTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsRegistrantSessionEvTrackDataObjectType }
     *     
     */
    public void setEvTrack(EventsRegistrantSessionEvTrackDataObjectType value) {
        this.evTrack = value;
    }

}
