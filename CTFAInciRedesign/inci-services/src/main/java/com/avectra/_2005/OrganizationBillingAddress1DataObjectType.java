
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organization_Billing_Address_1_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Billing_Address_1_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ad2__adr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_cst_key_owner" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_line1" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_line2" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_line3" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_city" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_state" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_post_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_city_state_code" type="{http://www.avectra.com/2005/}stringLength104_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_country" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_intl_province" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_county" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_cong_dist" type="{http://www.avectra.com/2005/}stringLength4_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_state_house" type="{http://www.avectra.com/2005/}stringLength4_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_state_senate" type="{http://www.avectra.com/2005/}stringLength4_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_latitude" type="{http://www.avectra.com/2005/}av_float_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_longitude" type="{http://www.avectra.com/2005/}av_float_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_mailing_label" type="{http://www.avectra.com/2005/}stringLength450_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_mailing_label_html" type="{http://www.avectra.com/2005/}stringLength450_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_bad_address_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_adb_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_metro_stat_area" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_carrier_route" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_delivery_point_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_lacs" type="{http://www.avectra.com/2005/}stringLength4_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_time_zone" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_urbanization" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_bar_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_fips" type="{http://www.avectra.com/2005/}stringLength5_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_no_validation_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_attn" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_record_type_code" type="{http://www.avectra.com/2005/}stringLength4_Type" minOccurs="0"/>
 *         &lt;element name="ad2__adr_geography" type="{http://www.avectra.com/2005/}stringLength-1_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Billing_Address_1_DataObjectType", propOrder = {
    "ad2AdrKey",
    "ad2AdrCstKeyOwner",
    "ad2AdrLine1",
    "ad2AdrLine2",
    "ad2AdrLine3",
    "ad2AdrCity",
    "ad2AdrState",
    "ad2AdrPostCode",
    "ad2AdrCityStateCode",
    "ad2AdrCountry",
    "ad2AdrIntlProvince",
    "ad2AdrCounty",
    "ad2AdrCongDist",
    "ad2AdrStateHouse",
    "ad2AdrStateSenate",
    "ad2AdrLatitude",
    "ad2AdrLongitude",
    "ad2AdrMailingLabel",
    "ad2AdrMailingLabelHtml",
    "ad2AdrAddDate",
    "ad2AdrAddUser",
    "ad2AdrChangeDate",
    "ad2AdrChangeUser",
    "ad2AdrDeleteFlag",
    "ad2AdrKeyExt",
    "ad2AdrBadAddressFlag",
    "ad2AdrAdbKey",
    "ad2AdrEntityKey",
    "ad2AdrMetroStatArea",
    "ad2AdrCarrierRoute",
    "ad2AdrDeliveryPointCode",
    "ad2AdrLacs",
    "ad2AdrTimeZone",
    "ad2AdrUrbanization",
    "ad2AdrBarCode",
    "ad2AdrFips",
    "ad2AdrNoValidationFlag",
    "ad2AdrAttn",
    "ad2AdrRecordTypeCode",
    "ad2AdrGeography"
})
public class OrganizationBillingAddress1DataObjectType {

    @XmlElementRef(name = "ad2__adr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrKey;
    @XmlElementRef(name = "ad2__adr_cst_key_owner", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrCstKeyOwner;
    @XmlElementRef(name = "ad2__adr_line1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrLine1;
    @XmlElementRef(name = "ad2__adr_line2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrLine2;
    @XmlElementRef(name = "ad2__adr_line3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrLine3;
    @XmlElementRef(name = "ad2__adr_city", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrCity;
    @XmlElementRef(name = "ad2__adr_state", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrState;
    @XmlElementRef(name = "ad2__adr_post_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrPostCode;
    @XmlElementRef(name = "ad2__adr_city_state_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrCityStateCode;
    @XmlElementRef(name = "ad2__adr_country", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrCountry;
    @XmlElementRef(name = "ad2__adr_intl_province", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrIntlProvince;
    @XmlElementRef(name = "ad2__adr_county", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrCounty;
    @XmlElementRef(name = "ad2__adr_cong_dist", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrCongDist;
    @XmlElementRef(name = "ad2__adr_state_house", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrStateHouse;
    @XmlElementRef(name = "ad2__adr_state_senate", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrStateSenate;
    @XmlElementRef(name = "ad2__adr_latitude", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Double> ad2AdrLatitude;
    @XmlElementRef(name = "ad2__adr_longitude", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Double> ad2AdrLongitude;
    @XmlElementRef(name = "ad2__adr_mailing_label", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrMailingLabel;
    @XmlElementRef(name = "ad2__adr_mailing_label_html", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrMailingLabelHtml;
    @XmlElementRef(name = "ad2__adr_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrAddDate;
    @XmlElementRef(name = "ad2__adr_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrAddUser;
    @XmlElementRef(name = "ad2__adr_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrChangeDate;
    @XmlElementRef(name = "ad2__adr_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrChangeUser;
    @XmlElementRef(name = "ad2__adr_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ad2AdrDeleteFlag;
    @XmlElementRef(name = "ad2__adr_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrKeyExt;
    @XmlElementRef(name = "ad2__adr_bad_address_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ad2AdrBadAddressFlag;
    @XmlElementRef(name = "ad2__adr_adb_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrAdbKey;
    @XmlElementRef(name = "ad2__adr_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrEntityKey;
    @XmlElementRef(name = "ad2__adr_metro_stat_area", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrMetroStatArea;
    @XmlElementRef(name = "ad2__adr_carrier_route", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrCarrierRoute;
    @XmlElementRef(name = "ad2__adr_delivery_point_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrDeliveryPointCode;
    @XmlElementRef(name = "ad2__adr_lacs", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrLacs;
    @XmlElementRef(name = "ad2__adr_time_zone", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrTimeZone;
    @XmlElementRef(name = "ad2__adr_urbanization", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrUrbanization;
    @XmlElementRef(name = "ad2__adr_bar_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrBarCode;
    @XmlElementRef(name = "ad2__adr_fips", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrFips;
    @XmlElementRef(name = "ad2__adr_no_validation_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ad2AdrNoValidationFlag;
    @XmlElementRef(name = "ad2__adr_attn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrAttn;
    @XmlElementRef(name = "ad2__adr_record_type_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrRecordTypeCode;
    @XmlElementRef(name = "ad2__adr_geography", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad2AdrGeography;

    /**
     * Gets the value of the ad2AdrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrKey() {
        return ad2AdrKey;
    }

    /**
     * Sets the value of the ad2AdrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrKey(JAXBElement<String> value) {
        this.ad2AdrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrCstKeyOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrCstKeyOwner() {
        return ad2AdrCstKeyOwner;
    }

    /**
     * Sets the value of the ad2AdrCstKeyOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrCstKeyOwner(JAXBElement<String> value) {
        this.ad2AdrCstKeyOwner = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrLine1() {
        return ad2AdrLine1;
    }

    /**
     * Sets the value of the ad2AdrLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrLine1(JAXBElement<String> value) {
        this.ad2AdrLine1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrLine2() {
        return ad2AdrLine2;
    }

    /**
     * Sets the value of the ad2AdrLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrLine2(JAXBElement<String> value) {
        this.ad2AdrLine2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrLine3() {
        return ad2AdrLine3;
    }

    /**
     * Sets the value of the ad2AdrLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrLine3(JAXBElement<String> value) {
        this.ad2AdrLine3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrCity() {
        return ad2AdrCity;
    }

    /**
     * Sets the value of the ad2AdrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrCity(JAXBElement<String> value) {
        this.ad2AdrCity = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrState() {
        return ad2AdrState;
    }

    /**
     * Sets the value of the ad2AdrState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrState(JAXBElement<String> value) {
        this.ad2AdrState = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrPostCode() {
        return ad2AdrPostCode;
    }

    /**
     * Sets the value of the ad2AdrPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrPostCode(JAXBElement<String> value) {
        this.ad2AdrPostCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrCityStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrCityStateCode() {
        return ad2AdrCityStateCode;
    }

    /**
     * Sets the value of the ad2AdrCityStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrCityStateCode(JAXBElement<String> value) {
        this.ad2AdrCityStateCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrCountry() {
        return ad2AdrCountry;
    }

    /**
     * Sets the value of the ad2AdrCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrCountry(JAXBElement<String> value) {
        this.ad2AdrCountry = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrIntlProvince property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrIntlProvince() {
        return ad2AdrIntlProvince;
    }

    /**
     * Sets the value of the ad2AdrIntlProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrIntlProvince(JAXBElement<String> value) {
        this.ad2AdrIntlProvince = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrCounty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrCounty() {
        return ad2AdrCounty;
    }

    /**
     * Sets the value of the ad2AdrCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrCounty(JAXBElement<String> value) {
        this.ad2AdrCounty = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrCongDist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrCongDist() {
        return ad2AdrCongDist;
    }

    /**
     * Sets the value of the ad2AdrCongDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrCongDist(JAXBElement<String> value) {
        this.ad2AdrCongDist = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrStateHouse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrStateHouse() {
        return ad2AdrStateHouse;
    }

    /**
     * Sets the value of the ad2AdrStateHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrStateHouse(JAXBElement<String> value) {
        this.ad2AdrStateHouse = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrStateSenate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrStateSenate() {
        return ad2AdrStateSenate;
    }

    /**
     * Sets the value of the ad2AdrStateSenate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrStateSenate(JAXBElement<String> value) {
        this.ad2AdrStateSenate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAd2AdrLatitude() {
        return ad2AdrLatitude;
    }

    /**
     * Sets the value of the ad2AdrLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAd2AdrLatitude(JAXBElement<Double> value) {
        this.ad2AdrLatitude = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the ad2AdrLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAd2AdrLongitude() {
        return ad2AdrLongitude;
    }

    /**
     * Sets the value of the ad2AdrLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAd2AdrLongitude(JAXBElement<Double> value) {
        this.ad2AdrLongitude = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the ad2AdrMailingLabel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrMailingLabel() {
        return ad2AdrMailingLabel;
    }

    /**
     * Sets the value of the ad2AdrMailingLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrMailingLabel(JAXBElement<String> value) {
        this.ad2AdrMailingLabel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrMailingLabelHtml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrMailingLabelHtml() {
        return ad2AdrMailingLabelHtml;
    }

    /**
     * Sets the value of the ad2AdrMailingLabelHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrMailingLabelHtml(JAXBElement<String> value) {
        this.ad2AdrMailingLabelHtml = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrAddDate() {
        return ad2AdrAddDate;
    }

    /**
     * Sets the value of the ad2AdrAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrAddDate(JAXBElement<String> value) {
        this.ad2AdrAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrAddUser() {
        return ad2AdrAddUser;
    }

    /**
     * Sets the value of the ad2AdrAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrAddUser(JAXBElement<String> value) {
        this.ad2AdrAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrChangeDate() {
        return ad2AdrChangeDate;
    }

    /**
     * Sets the value of the ad2AdrChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrChangeDate(JAXBElement<String> value) {
        this.ad2AdrChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrChangeUser() {
        return ad2AdrChangeUser;
    }

    /**
     * Sets the value of the ad2AdrChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrChangeUser(JAXBElement<String> value) {
        this.ad2AdrChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getAd2AdrDeleteFlag() {
        return ad2AdrDeleteFlag;
    }

    /**
     * Sets the value of the ad2AdrDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setAd2AdrDeleteFlag(JAXBElement<Short> value) {
        this.ad2AdrDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ad2AdrKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrKeyExt() {
        return ad2AdrKeyExt;
    }

    /**
     * Sets the value of the ad2AdrKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrKeyExt(JAXBElement<String> value) {
        this.ad2AdrKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrBadAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getAd2AdrBadAddressFlag() {
        return ad2AdrBadAddressFlag;
    }

    /**
     * Sets the value of the ad2AdrBadAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setAd2AdrBadAddressFlag(JAXBElement<Short> value) {
        this.ad2AdrBadAddressFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ad2AdrAdbKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrAdbKey() {
        return ad2AdrAdbKey;
    }

    /**
     * Sets the value of the ad2AdrAdbKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrAdbKey(JAXBElement<String> value) {
        this.ad2AdrAdbKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrEntityKey() {
        return ad2AdrEntityKey;
    }

    /**
     * Sets the value of the ad2AdrEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrEntityKey(JAXBElement<String> value) {
        this.ad2AdrEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrMetroStatArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrMetroStatArea() {
        return ad2AdrMetroStatArea;
    }

    /**
     * Sets the value of the ad2AdrMetroStatArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrMetroStatArea(JAXBElement<String> value) {
        this.ad2AdrMetroStatArea = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrCarrierRoute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrCarrierRoute() {
        return ad2AdrCarrierRoute;
    }

    /**
     * Sets the value of the ad2AdrCarrierRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrCarrierRoute(JAXBElement<String> value) {
        this.ad2AdrCarrierRoute = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrDeliveryPointCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrDeliveryPointCode() {
        return ad2AdrDeliveryPointCode;
    }

    /**
     * Sets the value of the ad2AdrDeliveryPointCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrDeliveryPointCode(JAXBElement<String> value) {
        this.ad2AdrDeliveryPointCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrLacs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrLacs() {
        return ad2AdrLacs;
    }

    /**
     * Sets the value of the ad2AdrLacs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrLacs(JAXBElement<String> value) {
        this.ad2AdrLacs = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrTimeZone() {
        return ad2AdrTimeZone;
    }

    /**
     * Sets the value of the ad2AdrTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrTimeZone(JAXBElement<String> value) {
        this.ad2AdrTimeZone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrUrbanization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrUrbanization() {
        return ad2AdrUrbanization;
    }

    /**
     * Sets the value of the ad2AdrUrbanization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrUrbanization(JAXBElement<String> value) {
        this.ad2AdrUrbanization = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrBarCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrBarCode() {
        return ad2AdrBarCode;
    }

    /**
     * Sets the value of the ad2AdrBarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrBarCode(JAXBElement<String> value) {
        this.ad2AdrBarCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrFips property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrFips() {
        return ad2AdrFips;
    }

    /**
     * Sets the value of the ad2AdrFips property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrFips(JAXBElement<String> value) {
        this.ad2AdrFips = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrNoValidationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getAd2AdrNoValidationFlag() {
        return ad2AdrNoValidationFlag;
    }

    /**
     * Sets the value of the ad2AdrNoValidationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setAd2AdrNoValidationFlag(JAXBElement<Short> value) {
        this.ad2AdrNoValidationFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ad2AdrAttn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrAttn() {
        return ad2AdrAttn;
    }

    /**
     * Sets the value of the ad2AdrAttn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrAttn(JAXBElement<String> value) {
        this.ad2AdrAttn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrRecordTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrRecordTypeCode() {
        return ad2AdrRecordTypeCode;
    }

    /**
     * Sets the value of the ad2AdrRecordTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrRecordTypeCode(JAXBElement<String> value) {
        this.ad2AdrRecordTypeCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad2AdrGeography property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd2AdrGeography() {
        return ad2AdrGeography;
    }

    /**
     * Sets the value of the ad2AdrGeography property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd2AdrGeography(JAXBElement<String> value) {
        this.ad2AdrGeography = ((JAXBElement<String> ) value);
    }

}
