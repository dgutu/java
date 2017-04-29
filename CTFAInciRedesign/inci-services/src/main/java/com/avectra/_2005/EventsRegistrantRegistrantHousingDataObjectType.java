
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrant_Registrant_Housing_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrant_Registrant_Housing_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evh_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="evh_hotel_name" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="evh_hotel_phone" type="{http://www.avectra.com/2005/}av_phone_Type" minOccurs="0"/>
 *         &lt;element name="evh_hotel_fax" type="{http://www.avectra.com/2005/}av_fax_Type" minOccurs="0"/>
 *         &lt;element name="evh_arrival_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="evh_departure_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="evh_rmt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="evh_room_rate" type="{http://www.avectra.com/2005/}av_decimal2_Type" minOccurs="0"/>
 *         &lt;element name="evh_smoking" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="evh_special_request" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="evh_budget_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="evh_budget_type" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="evh_billing_information" type="{http://www.avectra.com/2005/}stringLength500_Type" minOccurs="0"/>
 *         &lt;element name="evh_check_in_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="evh_check_out_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="evh_airport" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="evh_arrival_airline" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="evh_departure_airline" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="evh_arrival_flight" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="evh_departure_flight" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="evh_car_service" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="evh_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="evh_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="evh_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="evh_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="evh_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="evh_loc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="evh_ticket_cost" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="evh_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="evh_car_cost" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="evh_parent_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="evh_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="evh_reg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="evh_hotel_name2" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="evh_hotel_name3" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="evh_cc_number" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="evh_cc_number_display" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrant_Registrant_Housing_DataObjectType", propOrder = {
    "evhKey",
    "evhHotelName",
    "evhHotelPhone",
    "evhHotelFax",
    "evhArrivalDate",
    "evhDepartureDate",
    "evhRmtKey",
    "evhRoomRate",
    "evhSmoking",
    "evhSpecialRequest",
    "evhBudgetCode",
    "evhBudgetType",
    "evhBillingInformation",
    "evhCheckInDate",
    "evhCheckOutDate",
    "evhAirport",
    "evhArrivalAirline",
    "evhDepartureAirline",
    "evhArrivalFlight",
    "evhDepartureFlight",
    "evhCarService",
    "evhAddUser",
    "evhAddDate",
    "evhChangeUser",
    "evhChangeDate",
    "evhDeleteFlag",
    "evhLocKey",
    "evhTicketCost",
    "evhKeyExt",
    "evhCarCost",
    "evhParentKey",
    "evhEntityKey",
    "evhRegKey",
    "evhHotelName2",
    "evhHotelName3",
    "evhCcNumber",
    "evhCcNumberDisplay"
})
public class EventsRegistrantRegistrantHousingDataObjectType {

    @XmlElementRef(name = "evh_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhKey;
    @XmlElementRef(name = "evh_hotel_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhHotelName;
    @XmlElementRef(name = "evh_hotel_phone", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhHotelPhone;
    @XmlElementRef(name = "evh_hotel_fax", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhHotelFax;
    @XmlElementRef(name = "evh_arrival_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhArrivalDate;
    @XmlElementRef(name = "evh_departure_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhDepartureDate;
    @XmlElementRef(name = "evh_rmt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhRmtKey;
    @XmlElementRef(name = "evh_room_rate", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> evhRoomRate;
    @XmlElementRef(name = "evh_smoking", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> evhSmoking;
    @XmlElementRef(name = "evh_special_request", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhSpecialRequest;
    @XmlElementRef(name = "evh_budget_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhBudgetCode;
    @XmlElementRef(name = "evh_budget_type", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhBudgetType;
    @XmlElementRef(name = "evh_billing_information", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhBillingInformation;
    @XmlElementRef(name = "evh_check_in_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhCheckInDate;
    @XmlElementRef(name = "evh_check_out_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhCheckOutDate;
    @XmlElementRef(name = "evh_airport", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhAirport;
    @XmlElementRef(name = "evh_arrival_airline", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhArrivalAirline;
    @XmlElementRef(name = "evh_departure_airline", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhDepartureAirline;
    @XmlElementRef(name = "evh_arrival_flight", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhArrivalFlight;
    @XmlElementRef(name = "evh_departure_flight", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhDepartureFlight;
    @XmlElementRef(name = "evh_car_service", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhCarService;
    @XmlElementRef(name = "evh_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhAddUser;
    @XmlElementRef(name = "evh_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhAddDate;
    @XmlElementRef(name = "evh_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhChangeUser;
    @XmlElementRef(name = "evh_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhChangeDate;
    @XmlElementRef(name = "evh_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> evhDeleteFlag;
    @XmlElementRef(name = "evh_loc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhLocKey;
    @XmlElementRef(name = "evh_ticket_cost", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> evhTicketCost;
    @XmlElementRef(name = "evh_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhKeyExt;
    @XmlElementRef(name = "evh_car_cost", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> evhCarCost;
    @XmlElementRef(name = "evh_parent_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhParentKey;
    @XmlElementRef(name = "evh_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhEntityKey;
    @XmlElementRef(name = "evh_reg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhRegKey;
    @XmlElementRef(name = "evh_hotel_name2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhHotelName2;
    @XmlElementRef(name = "evh_hotel_name3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhHotelName3;
    @XmlElementRef(name = "evh_cc_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhCcNumber;
    @XmlElementRef(name = "evh_cc_number_display", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> evhCcNumberDisplay;

    /**
     * Gets the value of the evhKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhKey() {
        return evhKey;
    }

    /**
     * Sets the value of the evhKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhKey(JAXBElement<String> value) {
        this.evhKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhHotelName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhHotelName() {
        return evhHotelName;
    }

    /**
     * Sets the value of the evhHotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhHotelName(JAXBElement<String> value) {
        this.evhHotelName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhHotelPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhHotelPhone() {
        return evhHotelPhone;
    }

    /**
     * Sets the value of the evhHotelPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhHotelPhone(JAXBElement<String> value) {
        this.evhHotelPhone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhHotelFax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhHotelFax() {
        return evhHotelFax;
    }

    /**
     * Sets the value of the evhHotelFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhHotelFax(JAXBElement<String> value) {
        this.evhHotelFax = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhArrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhArrivalDate() {
        return evhArrivalDate;
    }

    /**
     * Sets the value of the evhArrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhArrivalDate(JAXBElement<String> value) {
        this.evhArrivalDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhDepartureDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhDepartureDate() {
        return evhDepartureDate;
    }

    /**
     * Sets the value of the evhDepartureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhDepartureDate(JAXBElement<String> value) {
        this.evhDepartureDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhRmtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhRmtKey() {
        return evhRmtKey;
    }

    /**
     * Sets the value of the evhRmtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhRmtKey(JAXBElement<String> value) {
        this.evhRmtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhRoomRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEvhRoomRate() {
        return evhRoomRate;
    }

    /**
     * Sets the value of the evhRoomRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEvhRoomRate(JAXBElement<BigDecimal> value) {
        this.evhRoomRate = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the evhSmoking property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEvhSmoking() {
        return evhSmoking;
    }

    /**
     * Sets the value of the evhSmoking property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEvhSmoking(JAXBElement<Short> value) {
        this.evhSmoking = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the evhSpecialRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhSpecialRequest() {
        return evhSpecialRequest;
    }

    /**
     * Sets the value of the evhSpecialRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhSpecialRequest(JAXBElement<String> value) {
        this.evhSpecialRequest = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhBudgetCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhBudgetCode() {
        return evhBudgetCode;
    }

    /**
     * Sets the value of the evhBudgetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhBudgetCode(JAXBElement<String> value) {
        this.evhBudgetCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhBudgetType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhBudgetType() {
        return evhBudgetType;
    }

    /**
     * Sets the value of the evhBudgetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhBudgetType(JAXBElement<String> value) {
        this.evhBudgetType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhBillingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhBillingInformation() {
        return evhBillingInformation;
    }

    /**
     * Sets the value of the evhBillingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhBillingInformation(JAXBElement<String> value) {
        this.evhBillingInformation = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhCheckInDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhCheckInDate() {
        return evhCheckInDate;
    }

    /**
     * Sets the value of the evhCheckInDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhCheckInDate(JAXBElement<String> value) {
        this.evhCheckInDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhCheckOutDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhCheckOutDate() {
        return evhCheckOutDate;
    }

    /**
     * Sets the value of the evhCheckOutDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhCheckOutDate(JAXBElement<String> value) {
        this.evhCheckOutDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhAirport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhAirport() {
        return evhAirport;
    }

    /**
     * Sets the value of the evhAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhAirport(JAXBElement<String> value) {
        this.evhAirport = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhArrivalAirline property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhArrivalAirline() {
        return evhArrivalAirline;
    }

    /**
     * Sets the value of the evhArrivalAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhArrivalAirline(JAXBElement<String> value) {
        this.evhArrivalAirline = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhDepartureAirline property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhDepartureAirline() {
        return evhDepartureAirline;
    }

    /**
     * Sets the value of the evhDepartureAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhDepartureAirline(JAXBElement<String> value) {
        this.evhDepartureAirline = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhArrivalFlight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhArrivalFlight() {
        return evhArrivalFlight;
    }

    /**
     * Sets the value of the evhArrivalFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhArrivalFlight(JAXBElement<String> value) {
        this.evhArrivalFlight = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhDepartureFlight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhDepartureFlight() {
        return evhDepartureFlight;
    }

    /**
     * Sets the value of the evhDepartureFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhDepartureFlight(JAXBElement<String> value) {
        this.evhDepartureFlight = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhCarService property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhCarService() {
        return evhCarService;
    }

    /**
     * Sets the value of the evhCarService property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhCarService(JAXBElement<String> value) {
        this.evhCarService = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhAddUser() {
        return evhAddUser;
    }

    /**
     * Sets the value of the evhAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhAddUser(JAXBElement<String> value) {
        this.evhAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhAddDate() {
        return evhAddDate;
    }

    /**
     * Sets the value of the evhAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhAddDate(JAXBElement<String> value) {
        this.evhAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhChangeUser() {
        return evhChangeUser;
    }

    /**
     * Sets the value of the evhChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhChangeUser(JAXBElement<String> value) {
        this.evhChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhChangeDate() {
        return evhChangeDate;
    }

    /**
     * Sets the value of the evhChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhChangeDate(JAXBElement<String> value) {
        this.evhChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEvhDeleteFlag() {
        return evhDeleteFlag;
    }

    /**
     * Sets the value of the evhDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEvhDeleteFlag(JAXBElement<Short> value) {
        this.evhDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the evhLocKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhLocKey() {
        return evhLocKey;
    }

    /**
     * Sets the value of the evhLocKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhLocKey(JAXBElement<String> value) {
        this.evhLocKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhTicketCost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEvhTicketCost() {
        return evhTicketCost;
    }

    /**
     * Sets the value of the evhTicketCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEvhTicketCost(JAXBElement<BigDecimal> value) {
        this.evhTicketCost = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the evhKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhKeyExt() {
        return evhKeyExt;
    }

    /**
     * Sets the value of the evhKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhKeyExt(JAXBElement<String> value) {
        this.evhKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhCarCost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEvhCarCost() {
        return evhCarCost;
    }

    /**
     * Sets the value of the evhCarCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEvhCarCost(JAXBElement<BigDecimal> value) {
        this.evhCarCost = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the evhParentKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhParentKey() {
        return evhParentKey;
    }

    /**
     * Sets the value of the evhParentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhParentKey(JAXBElement<String> value) {
        this.evhParentKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhEntityKey() {
        return evhEntityKey;
    }

    /**
     * Sets the value of the evhEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhEntityKey(JAXBElement<String> value) {
        this.evhEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhRegKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhRegKey() {
        return evhRegKey;
    }

    /**
     * Sets the value of the evhRegKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhRegKey(JAXBElement<String> value) {
        this.evhRegKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhHotelName2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhHotelName2() {
        return evhHotelName2;
    }

    /**
     * Sets the value of the evhHotelName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhHotelName2(JAXBElement<String> value) {
        this.evhHotelName2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhHotelName3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhHotelName3() {
        return evhHotelName3;
    }

    /**
     * Sets the value of the evhHotelName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhHotelName3(JAXBElement<String> value) {
        this.evhHotelName3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhCcNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhCcNumber() {
        return evhCcNumber;
    }

    /**
     * Sets the value of the evhCcNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhCcNumber(JAXBElement<String> value) {
        this.evhCcNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the evhCcNumberDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvhCcNumberDisplay() {
        return evhCcNumberDisplay;
    }

    /**
     * Sets the value of the evhCcNumberDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvhCcNumberDisplay(JAXBElement<String> value) {
        this.evhCcNumberDisplay = ((JAXBElement<String> ) value);
    }

}
