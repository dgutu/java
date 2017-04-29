
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Invoice_Billing_Adr_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Invoice_Billing_Adr_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="adr_cst_key_owner" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="adr_line1" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="adr_line2" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="adr_line3" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="adr_city" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="adr_state" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="adr_post_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="adr_city_state_code" type="{http://www.avectra.com/2005/}stringLength104_Type" minOccurs="0"/>
 *         &lt;element name="adr_country" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="adr_intl_province" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="adr_county" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="adr_cong_dist" type="{http://www.avectra.com/2005/}stringLength4_Type" minOccurs="0"/>
 *         &lt;element name="adr_state_house" type="{http://www.avectra.com/2005/}stringLength4_Type" minOccurs="0"/>
 *         &lt;element name="adr_state_senate" type="{http://www.avectra.com/2005/}stringLength4_Type" minOccurs="0"/>
 *         &lt;element name="adr_latitude" type="{http://www.avectra.com/2005/}av_float_Type" minOccurs="0"/>
 *         &lt;element name="adr_longitude" type="{http://www.avectra.com/2005/}av_float_Type" minOccurs="0"/>
 *         &lt;element name="adr_mailing_label" type="{http://www.avectra.com/2005/}stringLength450_Type" minOccurs="0"/>
 *         &lt;element name="adr_mailing_label_html" type="{http://www.avectra.com/2005/}stringLength450_Type" minOccurs="0"/>
 *         &lt;element name="adr_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="adr_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="adr_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="adr_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="adr_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="adr_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="adr_bad_address_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="adr_adb_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="adr_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="adr_metro_stat_area" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="adr_carrier_route" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="adr_delivery_point_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="adr_lacs" type="{http://www.avectra.com/2005/}stringLength4_Type" minOccurs="0"/>
 *         &lt;element name="adr_time_zone" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="adr_urbanization" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="adr_bar_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="adr_fips" type="{http://www.avectra.com/2005/}stringLength5_Type" minOccurs="0"/>
 *         &lt;element name="adr_no_validation_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="adr_attn" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="adr_record_type_code" type="{http://www.avectra.com/2005/}stringLength4_Type" minOccurs="0"/>
 *         &lt;element name="adr_geography" type="{http://www.avectra.com/2005/}stringLength-1_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Invoice_Billing_Adr_DataObjectType", propOrder = {
    "adrKey",
    "adrCstKeyOwner",
    "adrLine1",
    "adrLine2",
    "adrLine3",
    "adrCity",
    "adrState",
    "adrPostCode",
    "adrCityStateCode",
    "adrCountry",
    "adrIntlProvince",
    "adrCounty",
    "adrCongDist",
    "adrStateHouse",
    "adrStateSenate",
    "adrLatitude",
    "adrLongitude",
    "adrMailingLabel",
    "adrMailingLabelHtml",
    "adrAddDate",
    "adrAddUser",
    "adrChangeDate",
    "adrChangeUser",
    "adrDeleteFlag",
    "adrKeyExt",
    "adrBadAddressFlag",
    "adrAdbKey",
    "adrEntityKey",
    "adrMetroStatArea",
    "adrCarrierRoute",
    "adrDeliveryPointCode",
    "adrLacs",
    "adrTimeZone",
    "adrUrbanization",
    "adrBarCode",
    "adrFips",
    "adrNoValidationFlag",
    "adrAttn",
    "adrRecordTypeCode",
    "adrGeography"
})
public class InvoiceBillingAdrDataObjectType {

    @XmlElementRef(name = "adr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrKey;
    @XmlElementRef(name = "adr_cst_key_owner", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrCstKeyOwner;
    @XmlElementRef(name = "adr_line1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrLine1;
    @XmlElementRef(name = "adr_line2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrLine2;
    @XmlElementRef(name = "adr_line3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrLine3;
    @XmlElementRef(name = "adr_city", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrCity;
    @XmlElementRef(name = "adr_state", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrState;
    @XmlElementRef(name = "adr_post_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrPostCode;
    @XmlElementRef(name = "adr_city_state_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrCityStateCode;
    @XmlElementRef(name = "adr_country", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrCountry;
    @XmlElementRef(name = "adr_intl_province", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrIntlProvince;
    @XmlElementRef(name = "adr_county", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrCounty;
    @XmlElementRef(name = "adr_cong_dist", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrCongDist;
    @XmlElementRef(name = "adr_state_house", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrStateHouse;
    @XmlElementRef(name = "adr_state_senate", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrStateSenate;
    @XmlElementRef(name = "adr_latitude", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Double> adrLatitude;
    @XmlElementRef(name = "adr_longitude", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Double> adrLongitude;
    @XmlElementRef(name = "adr_mailing_label", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrMailingLabel;
    @XmlElementRef(name = "adr_mailing_label_html", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrMailingLabelHtml;
    @XmlElementRef(name = "adr_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrAddDate;
    @XmlElementRef(name = "adr_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrAddUser;
    @XmlElementRef(name = "adr_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrChangeDate;
    @XmlElementRef(name = "adr_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrChangeUser;
    @XmlElementRef(name = "adr_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> adrDeleteFlag;
    @XmlElementRef(name = "adr_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrKeyExt;
    @XmlElementRef(name = "adr_bad_address_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> adrBadAddressFlag;
    @XmlElementRef(name = "adr_adb_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrAdbKey;
    @XmlElementRef(name = "adr_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrEntityKey;
    @XmlElementRef(name = "adr_metro_stat_area", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrMetroStatArea;
    @XmlElementRef(name = "adr_carrier_route", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrCarrierRoute;
    @XmlElementRef(name = "adr_delivery_point_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrDeliveryPointCode;
    @XmlElementRef(name = "adr_lacs", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrLacs;
    @XmlElementRef(name = "adr_time_zone", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrTimeZone;
    @XmlElementRef(name = "adr_urbanization", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrUrbanization;
    @XmlElementRef(name = "adr_bar_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrBarCode;
    @XmlElementRef(name = "adr_fips", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrFips;
    @XmlElementRef(name = "adr_no_validation_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> adrNoValidationFlag;
    @XmlElementRef(name = "adr_attn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrAttn;
    @XmlElementRef(name = "adr_record_type_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrRecordTypeCode;
    @XmlElementRef(name = "adr_geography", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> adrGeography;

    /**
     * Gets the value of the adrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrKey() {
        return adrKey;
    }

    /**
     * Sets the value of the adrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrKey(JAXBElement<String> value) {
        this.adrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrCstKeyOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrCstKeyOwner() {
        return adrCstKeyOwner;
    }

    /**
     * Sets the value of the adrCstKeyOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrCstKeyOwner(JAXBElement<String> value) {
        this.adrCstKeyOwner = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrLine1() {
        return adrLine1;
    }

    /**
     * Sets the value of the adrLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrLine1(JAXBElement<String> value) {
        this.adrLine1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrLine2() {
        return adrLine2;
    }

    /**
     * Sets the value of the adrLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrLine2(JAXBElement<String> value) {
        this.adrLine2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrLine3() {
        return adrLine3;
    }

    /**
     * Sets the value of the adrLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrLine3(JAXBElement<String> value) {
        this.adrLine3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrCity() {
        return adrCity;
    }

    /**
     * Sets the value of the adrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrCity(JAXBElement<String> value) {
        this.adrCity = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrState() {
        return adrState;
    }

    /**
     * Sets the value of the adrState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrState(JAXBElement<String> value) {
        this.adrState = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrPostCode() {
        return adrPostCode;
    }

    /**
     * Sets the value of the adrPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrPostCode(JAXBElement<String> value) {
        this.adrPostCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrCityStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrCityStateCode() {
        return adrCityStateCode;
    }

    /**
     * Sets the value of the adrCityStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrCityStateCode(JAXBElement<String> value) {
        this.adrCityStateCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrCountry() {
        return adrCountry;
    }

    /**
     * Sets the value of the adrCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrCountry(JAXBElement<String> value) {
        this.adrCountry = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrIntlProvince property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrIntlProvince() {
        return adrIntlProvince;
    }

    /**
     * Sets the value of the adrIntlProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrIntlProvince(JAXBElement<String> value) {
        this.adrIntlProvince = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrCounty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrCounty() {
        return adrCounty;
    }

    /**
     * Sets the value of the adrCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrCounty(JAXBElement<String> value) {
        this.adrCounty = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrCongDist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrCongDist() {
        return adrCongDist;
    }

    /**
     * Sets the value of the adrCongDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrCongDist(JAXBElement<String> value) {
        this.adrCongDist = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrStateHouse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrStateHouse() {
        return adrStateHouse;
    }

    /**
     * Sets the value of the adrStateHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrStateHouse(JAXBElement<String> value) {
        this.adrStateHouse = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrStateSenate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrStateSenate() {
        return adrStateSenate;
    }

    /**
     * Sets the value of the adrStateSenate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrStateSenate(JAXBElement<String> value) {
        this.adrStateSenate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAdrLatitude() {
        return adrLatitude;
    }

    /**
     * Sets the value of the adrLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAdrLatitude(JAXBElement<Double> value) {
        this.adrLatitude = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the adrLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAdrLongitude() {
        return adrLongitude;
    }

    /**
     * Sets the value of the adrLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAdrLongitude(JAXBElement<Double> value) {
        this.adrLongitude = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the adrMailingLabel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrMailingLabel() {
        return adrMailingLabel;
    }

    /**
     * Sets the value of the adrMailingLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrMailingLabel(JAXBElement<String> value) {
        this.adrMailingLabel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrMailingLabelHtml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrMailingLabelHtml() {
        return adrMailingLabelHtml;
    }

    /**
     * Sets the value of the adrMailingLabelHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrMailingLabelHtml(JAXBElement<String> value) {
        this.adrMailingLabelHtml = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrAddDate() {
        return adrAddDate;
    }

    /**
     * Sets the value of the adrAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrAddDate(JAXBElement<String> value) {
        this.adrAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrAddUser() {
        return adrAddUser;
    }

    /**
     * Sets the value of the adrAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrAddUser(JAXBElement<String> value) {
        this.adrAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrChangeDate() {
        return adrChangeDate;
    }

    /**
     * Sets the value of the adrChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrChangeDate(JAXBElement<String> value) {
        this.adrChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrChangeUser() {
        return adrChangeUser;
    }

    /**
     * Sets the value of the adrChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrChangeUser(JAXBElement<String> value) {
        this.adrChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getAdrDeleteFlag() {
        return adrDeleteFlag;
    }

    /**
     * Sets the value of the adrDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setAdrDeleteFlag(JAXBElement<Short> value) {
        this.adrDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the adrKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrKeyExt() {
        return adrKeyExt;
    }

    /**
     * Sets the value of the adrKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrKeyExt(JAXBElement<String> value) {
        this.adrKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrBadAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getAdrBadAddressFlag() {
        return adrBadAddressFlag;
    }

    /**
     * Sets the value of the adrBadAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setAdrBadAddressFlag(JAXBElement<Short> value) {
        this.adrBadAddressFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the adrAdbKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrAdbKey() {
        return adrAdbKey;
    }

    /**
     * Sets the value of the adrAdbKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrAdbKey(JAXBElement<String> value) {
        this.adrAdbKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrEntityKey() {
        return adrEntityKey;
    }

    /**
     * Sets the value of the adrEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrEntityKey(JAXBElement<String> value) {
        this.adrEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrMetroStatArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrMetroStatArea() {
        return adrMetroStatArea;
    }

    /**
     * Sets the value of the adrMetroStatArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrMetroStatArea(JAXBElement<String> value) {
        this.adrMetroStatArea = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrCarrierRoute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrCarrierRoute() {
        return adrCarrierRoute;
    }

    /**
     * Sets the value of the adrCarrierRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrCarrierRoute(JAXBElement<String> value) {
        this.adrCarrierRoute = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrDeliveryPointCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrDeliveryPointCode() {
        return adrDeliveryPointCode;
    }

    /**
     * Sets the value of the adrDeliveryPointCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrDeliveryPointCode(JAXBElement<String> value) {
        this.adrDeliveryPointCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrLacs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrLacs() {
        return adrLacs;
    }

    /**
     * Sets the value of the adrLacs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrLacs(JAXBElement<String> value) {
        this.adrLacs = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrTimeZone() {
        return adrTimeZone;
    }

    /**
     * Sets the value of the adrTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrTimeZone(JAXBElement<String> value) {
        this.adrTimeZone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrUrbanization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrUrbanization() {
        return adrUrbanization;
    }

    /**
     * Sets the value of the adrUrbanization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrUrbanization(JAXBElement<String> value) {
        this.adrUrbanization = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrBarCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrBarCode() {
        return adrBarCode;
    }

    /**
     * Sets the value of the adrBarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrBarCode(JAXBElement<String> value) {
        this.adrBarCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrFips property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrFips() {
        return adrFips;
    }

    /**
     * Sets the value of the adrFips property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrFips(JAXBElement<String> value) {
        this.adrFips = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrNoValidationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getAdrNoValidationFlag() {
        return adrNoValidationFlag;
    }

    /**
     * Sets the value of the adrNoValidationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setAdrNoValidationFlag(JAXBElement<Short> value) {
        this.adrNoValidationFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the adrAttn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrAttn() {
        return adrAttn;
    }

    /**
     * Sets the value of the adrAttn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrAttn(JAXBElement<String> value) {
        this.adrAttn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrRecordTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrRecordTypeCode() {
        return adrRecordTypeCode;
    }

    /**
     * Sets the value of the adrRecordTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrRecordTypeCode(JAXBElement<String> value) {
        this.adrRecordTypeCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adrGeography property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdrGeography() {
        return adrGeography;
    }

    /**
     * Sets the value of the adrGeography property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdrGeography(JAXBElement<String> value) {
        this.adrGeography = ((JAXBElement<String> ) value);
    }

}
