
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Org_Business_Address_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Org_Business_Address_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ad6__adr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_cst_key_owner" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_line1" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_line2" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_line3" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_city" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_state" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_post_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_city_state_code" type="{http://www.avectra.com/2005/}stringLength104_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_country" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_intl_province" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_county" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_cong_dist" type="{http://www.avectra.com/2005/}stringLength4_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_state_house" type="{http://www.avectra.com/2005/}stringLength4_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_state_senate" type="{http://www.avectra.com/2005/}stringLength4_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_latitude" type="{http://www.avectra.com/2005/}av_float_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_longitude" type="{http://www.avectra.com/2005/}av_float_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_mailing_label" type="{http://www.avectra.com/2005/}stringLength450_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_mailing_label_html" type="{http://www.avectra.com/2005/}stringLength450_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_bad_address_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_adb_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_metro_stat_area" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_carrier_route" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_delivery_point_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_lacs" type="{http://www.avectra.com/2005/}stringLength4_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_time_zone" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_urbanization" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_bar_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_fips" type="{http://www.avectra.com/2005/}stringLength5_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_no_validation_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_attn" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_record_type_code" type="{http://www.avectra.com/2005/}stringLength4_Type" minOccurs="0"/>
 *         &lt;element name="ad6__adr_geography" type="{http://www.avectra.com/2005/}stringLength-1_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Org_Business_Address_DataObjectType", propOrder = {
    "ad6AdrKey",
    "ad6AdrCstKeyOwner",
    "ad6AdrLine1",
    "ad6AdrLine2",
    "ad6AdrLine3",
    "ad6AdrCity",
    "ad6AdrState",
    "ad6AdrPostCode",
    "ad6AdrCityStateCode",
    "ad6AdrCountry",
    "ad6AdrIntlProvince",
    "ad6AdrCounty",
    "ad6AdrCongDist",
    "ad6AdrStateHouse",
    "ad6AdrStateSenate",
    "ad6AdrLatitude",
    "ad6AdrLongitude",
    "ad6AdrMailingLabel",
    "ad6AdrMailingLabelHtml",
    "ad6AdrAddDate",
    "ad6AdrAddUser",
    "ad6AdrChangeDate",
    "ad6AdrChangeUser",
    "ad6AdrDeleteFlag",
    "ad6AdrKeyExt",
    "ad6AdrBadAddressFlag",
    "ad6AdrAdbKey",
    "ad6AdrEntityKey",
    "ad6AdrMetroStatArea",
    "ad6AdrCarrierRoute",
    "ad6AdrDeliveryPointCode",
    "ad6AdrLacs",
    "ad6AdrTimeZone",
    "ad6AdrUrbanization",
    "ad6AdrBarCode",
    "ad6AdrFips",
    "ad6AdrNoValidationFlag",
    "ad6AdrAttn",
    "ad6AdrRecordTypeCode",
    "ad6AdrGeography"
})
public class FundraisingGiftOrgBusinessAddressDataObjectType {

    @XmlElementRef(name = "ad6__adr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrKey;
    @XmlElementRef(name = "ad6__adr_cst_key_owner", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrCstKeyOwner;
    @XmlElementRef(name = "ad6__adr_line1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrLine1;
    @XmlElementRef(name = "ad6__adr_line2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrLine2;
    @XmlElementRef(name = "ad6__adr_line3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrLine3;
    @XmlElementRef(name = "ad6__adr_city", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrCity;
    @XmlElementRef(name = "ad6__adr_state", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrState;
    @XmlElementRef(name = "ad6__adr_post_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrPostCode;
    @XmlElementRef(name = "ad6__adr_city_state_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrCityStateCode;
    @XmlElementRef(name = "ad6__adr_country", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrCountry;
    @XmlElementRef(name = "ad6__adr_intl_province", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrIntlProvince;
    @XmlElementRef(name = "ad6__adr_county", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrCounty;
    @XmlElementRef(name = "ad6__adr_cong_dist", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrCongDist;
    @XmlElementRef(name = "ad6__adr_state_house", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrStateHouse;
    @XmlElementRef(name = "ad6__adr_state_senate", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrStateSenate;
    @XmlElementRef(name = "ad6__adr_latitude", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Double> ad6AdrLatitude;
    @XmlElementRef(name = "ad6__adr_longitude", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Double> ad6AdrLongitude;
    @XmlElementRef(name = "ad6__adr_mailing_label", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrMailingLabel;
    @XmlElementRef(name = "ad6__adr_mailing_label_html", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrMailingLabelHtml;
    @XmlElementRef(name = "ad6__adr_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrAddDate;
    @XmlElementRef(name = "ad6__adr_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrAddUser;
    @XmlElementRef(name = "ad6__adr_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrChangeDate;
    @XmlElementRef(name = "ad6__adr_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrChangeUser;
    @XmlElementRef(name = "ad6__adr_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ad6AdrDeleteFlag;
    @XmlElementRef(name = "ad6__adr_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrKeyExt;
    @XmlElementRef(name = "ad6__adr_bad_address_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ad6AdrBadAddressFlag;
    @XmlElementRef(name = "ad6__adr_adb_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrAdbKey;
    @XmlElementRef(name = "ad6__adr_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrEntityKey;
    @XmlElementRef(name = "ad6__adr_metro_stat_area", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrMetroStatArea;
    @XmlElementRef(name = "ad6__adr_carrier_route", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrCarrierRoute;
    @XmlElementRef(name = "ad6__adr_delivery_point_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrDeliveryPointCode;
    @XmlElementRef(name = "ad6__adr_lacs", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrLacs;
    @XmlElementRef(name = "ad6__adr_time_zone", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrTimeZone;
    @XmlElementRef(name = "ad6__adr_urbanization", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrUrbanization;
    @XmlElementRef(name = "ad6__adr_bar_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrBarCode;
    @XmlElementRef(name = "ad6__adr_fips", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrFips;
    @XmlElementRef(name = "ad6__adr_no_validation_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ad6AdrNoValidationFlag;
    @XmlElementRef(name = "ad6__adr_attn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrAttn;
    @XmlElementRef(name = "ad6__adr_record_type_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrRecordTypeCode;
    @XmlElementRef(name = "ad6__adr_geography", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ad6AdrGeography;

    /**
     * Gets the value of the ad6AdrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrKey() {
        return ad6AdrKey;
    }

    /**
     * Sets the value of the ad6AdrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrKey(JAXBElement<String> value) {
        this.ad6AdrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrCstKeyOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrCstKeyOwner() {
        return ad6AdrCstKeyOwner;
    }

    /**
     * Sets the value of the ad6AdrCstKeyOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrCstKeyOwner(JAXBElement<String> value) {
        this.ad6AdrCstKeyOwner = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrLine1() {
        return ad6AdrLine1;
    }

    /**
     * Sets the value of the ad6AdrLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrLine1(JAXBElement<String> value) {
        this.ad6AdrLine1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrLine2() {
        return ad6AdrLine2;
    }

    /**
     * Sets the value of the ad6AdrLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrLine2(JAXBElement<String> value) {
        this.ad6AdrLine2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrLine3() {
        return ad6AdrLine3;
    }

    /**
     * Sets the value of the ad6AdrLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrLine3(JAXBElement<String> value) {
        this.ad6AdrLine3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrCity() {
        return ad6AdrCity;
    }

    /**
     * Sets the value of the ad6AdrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrCity(JAXBElement<String> value) {
        this.ad6AdrCity = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrState() {
        return ad6AdrState;
    }

    /**
     * Sets the value of the ad6AdrState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrState(JAXBElement<String> value) {
        this.ad6AdrState = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrPostCode() {
        return ad6AdrPostCode;
    }

    /**
     * Sets the value of the ad6AdrPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrPostCode(JAXBElement<String> value) {
        this.ad6AdrPostCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrCityStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrCityStateCode() {
        return ad6AdrCityStateCode;
    }

    /**
     * Sets the value of the ad6AdrCityStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrCityStateCode(JAXBElement<String> value) {
        this.ad6AdrCityStateCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrCountry() {
        return ad6AdrCountry;
    }

    /**
     * Sets the value of the ad6AdrCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrCountry(JAXBElement<String> value) {
        this.ad6AdrCountry = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrIntlProvince property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrIntlProvince() {
        return ad6AdrIntlProvince;
    }

    /**
     * Sets the value of the ad6AdrIntlProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrIntlProvince(JAXBElement<String> value) {
        this.ad6AdrIntlProvince = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrCounty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrCounty() {
        return ad6AdrCounty;
    }

    /**
     * Sets the value of the ad6AdrCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrCounty(JAXBElement<String> value) {
        this.ad6AdrCounty = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrCongDist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrCongDist() {
        return ad6AdrCongDist;
    }

    /**
     * Sets the value of the ad6AdrCongDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrCongDist(JAXBElement<String> value) {
        this.ad6AdrCongDist = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrStateHouse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrStateHouse() {
        return ad6AdrStateHouse;
    }

    /**
     * Sets the value of the ad6AdrStateHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrStateHouse(JAXBElement<String> value) {
        this.ad6AdrStateHouse = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrStateSenate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrStateSenate() {
        return ad6AdrStateSenate;
    }

    /**
     * Sets the value of the ad6AdrStateSenate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrStateSenate(JAXBElement<String> value) {
        this.ad6AdrStateSenate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAd6AdrLatitude() {
        return ad6AdrLatitude;
    }

    /**
     * Sets the value of the ad6AdrLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAd6AdrLatitude(JAXBElement<Double> value) {
        this.ad6AdrLatitude = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the ad6AdrLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAd6AdrLongitude() {
        return ad6AdrLongitude;
    }

    /**
     * Sets the value of the ad6AdrLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAd6AdrLongitude(JAXBElement<Double> value) {
        this.ad6AdrLongitude = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the ad6AdrMailingLabel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrMailingLabel() {
        return ad6AdrMailingLabel;
    }

    /**
     * Sets the value of the ad6AdrMailingLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrMailingLabel(JAXBElement<String> value) {
        this.ad6AdrMailingLabel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrMailingLabelHtml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrMailingLabelHtml() {
        return ad6AdrMailingLabelHtml;
    }

    /**
     * Sets the value of the ad6AdrMailingLabelHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrMailingLabelHtml(JAXBElement<String> value) {
        this.ad6AdrMailingLabelHtml = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrAddDate() {
        return ad6AdrAddDate;
    }

    /**
     * Sets the value of the ad6AdrAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrAddDate(JAXBElement<String> value) {
        this.ad6AdrAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrAddUser() {
        return ad6AdrAddUser;
    }

    /**
     * Sets the value of the ad6AdrAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrAddUser(JAXBElement<String> value) {
        this.ad6AdrAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrChangeDate() {
        return ad6AdrChangeDate;
    }

    /**
     * Sets the value of the ad6AdrChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrChangeDate(JAXBElement<String> value) {
        this.ad6AdrChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrChangeUser() {
        return ad6AdrChangeUser;
    }

    /**
     * Sets the value of the ad6AdrChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrChangeUser(JAXBElement<String> value) {
        this.ad6AdrChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getAd6AdrDeleteFlag() {
        return ad6AdrDeleteFlag;
    }

    /**
     * Sets the value of the ad6AdrDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setAd6AdrDeleteFlag(JAXBElement<Short> value) {
        this.ad6AdrDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ad6AdrKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrKeyExt() {
        return ad6AdrKeyExt;
    }

    /**
     * Sets the value of the ad6AdrKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrKeyExt(JAXBElement<String> value) {
        this.ad6AdrKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrBadAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getAd6AdrBadAddressFlag() {
        return ad6AdrBadAddressFlag;
    }

    /**
     * Sets the value of the ad6AdrBadAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setAd6AdrBadAddressFlag(JAXBElement<Short> value) {
        this.ad6AdrBadAddressFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ad6AdrAdbKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrAdbKey() {
        return ad6AdrAdbKey;
    }

    /**
     * Sets the value of the ad6AdrAdbKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrAdbKey(JAXBElement<String> value) {
        this.ad6AdrAdbKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrEntityKey() {
        return ad6AdrEntityKey;
    }

    /**
     * Sets the value of the ad6AdrEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrEntityKey(JAXBElement<String> value) {
        this.ad6AdrEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrMetroStatArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrMetroStatArea() {
        return ad6AdrMetroStatArea;
    }

    /**
     * Sets the value of the ad6AdrMetroStatArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrMetroStatArea(JAXBElement<String> value) {
        this.ad6AdrMetroStatArea = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrCarrierRoute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrCarrierRoute() {
        return ad6AdrCarrierRoute;
    }

    /**
     * Sets the value of the ad6AdrCarrierRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrCarrierRoute(JAXBElement<String> value) {
        this.ad6AdrCarrierRoute = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrDeliveryPointCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrDeliveryPointCode() {
        return ad6AdrDeliveryPointCode;
    }

    /**
     * Sets the value of the ad6AdrDeliveryPointCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrDeliveryPointCode(JAXBElement<String> value) {
        this.ad6AdrDeliveryPointCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrLacs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrLacs() {
        return ad6AdrLacs;
    }

    /**
     * Sets the value of the ad6AdrLacs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrLacs(JAXBElement<String> value) {
        this.ad6AdrLacs = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrTimeZone() {
        return ad6AdrTimeZone;
    }

    /**
     * Sets the value of the ad6AdrTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrTimeZone(JAXBElement<String> value) {
        this.ad6AdrTimeZone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrUrbanization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrUrbanization() {
        return ad6AdrUrbanization;
    }

    /**
     * Sets the value of the ad6AdrUrbanization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrUrbanization(JAXBElement<String> value) {
        this.ad6AdrUrbanization = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrBarCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrBarCode() {
        return ad6AdrBarCode;
    }

    /**
     * Sets the value of the ad6AdrBarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrBarCode(JAXBElement<String> value) {
        this.ad6AdrBarCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrFips property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrFips() {
        return ad6AdrFips;
    }

    /**
     * Sets the value of the ad6AdrFips property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrFips(JAXBElement<String> value) {
        this.ad6AdrFips = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrNoValidationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getAd6AdrNoValidationFlag() {
        return ad6AdrNoValidationFlag;
    }

    /**
     * Sets the value of the ad6AdrNoValidationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setAd6AdrNoValidationFlag(JAXBElement<Short> value) {
        this.ad6AdrNoValidationFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ad6AdrAttn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrAttn() {
        return ad6AdrAttn;
    }

    /**
     * Sets the value of the ad6AdrAttn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrAttn(JAXBElement<String> value) {
        this.ad6AdrAttn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrRecordTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrRecordTypeCode() {
        return ad6AdrRecordTypeCode;
    }

    /**
     * Sets the value of the ad6AdrRecordTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrRecordTypeCode(JAXBElement<String> value) {
        this.ad6AdrRecordTypeCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ad6AdrGeography property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd6AdrGeography() {
        return ad6AdrGeography;
    }

    /**
     * Sets the value of the ad6AdrGeography property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd6AdrGeography(JAXBElement<String> value) {
        this.ad6AdrGeography = ((JAXBElement<String> ) value);
    }

}
