
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Chapter_Prim._Contact_Address_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Chapter_Prim._Contact_Address_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pad__adr_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_cst_key_owner" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_line1" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_line2" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_line3" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_city" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_state" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_post_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_city_state_code" type="{http://www.avectra.com/2005/}stringLength104_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_country" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_intl_province" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_county" type="{http://www.avectra.com/2005/}stringLength40_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_cong_dist" type="{http://www.avectra.com/2005/}stringLength4_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_state_house" type="{http://www.avectra.com/2005/}stringLength4_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_state_senate" type="{http://www.avectra.com/2005/}stringLength4_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_latitude" type="{http://www.avectra.com/2005/}av_float_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_longitude" type="{http://www.avectra.com/2005/}av_float_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_mailing_label" type="{http://www.avectra.com/2005/}stringLength450_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_mailing_label_html" type="{http://www.avectra.com/2005/}stringLength450_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_bad_address_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_adb_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_metro_stat_area" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_carrier_route" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_delivery_point_code" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_lacs" type="{http://www.avectra.com/2005/}stringLength4_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_time_zone" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_urbanization" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_bar_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_fips" type="{http://www.avectra.com/2005/}stringLength5_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_no_validation_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_attn" type="{http://www.avectra.com/2005/}stringLength75_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_record_type_code" type="{http://www.avectra.com/2005/}stringLength4_Type" minOccurs="0"/>
 *         &lt;element name="pad__adr_geography" type="{http://www.avectra.com/2005/}stringLength-1_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Chapter_Prim._Contact_Address_DataObjectType", propOrder = {
    "padAdrKey",
    "padAdrCstKeyOwner",
    "padAdrLine1",
    "padAdrLine2",
    "padAdrLine3",
    "padAdrCity",
    "padAdrState",
    "padAdrPostCode",
    "padAdrCityStateCode",
    "padAdrCountry",
    "padAdrIntlProvince",
    "padAdrCounty",
    "padAdrCongDist",
    "padAdrStateHouse",
    "padAdrStateSenate",
    "padAdrLatitude",
    "padAdrLongitude",
    "padAdrMailingLabel",
    "padAdrMailingLabelHtml",
    "padAdrAddDate",
    "padAdrAddUser",
    "padAdrChangeDate",
    "padAdrChangeUser",
    "padAdrDeleteFlag",
    "padAdrKeyExt",
    "padAdrBadAddressFlag",
    "padAdrAdbKey",
    "padAdrEntityKey",
    "padAdrMetroStatArea",
    "padAdrCarrierRoute",
    "padAdrDeliveryPointCode",
    "padAdrLacs",
    "padAdrTimeZone",
    "padAdrUrbanization",
    "padAdrBarCode",
    "padAdrFips",
    "padAdrNoValidationFlag",
    "padAdrAttn",
    "padAdrRecordTypeCode",
    "padAdrGeography"
})
public class ChapterPrimContactAddressDataObjectType {

    @XmlElementRef(name = "pad__adr_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrKey;
    @XmlElementRef(name = "pad__adr_cst_key_owner", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrCstKeyOwner;
    @XmlElementRef(name = "pad__adr_line1", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrLine1;
    @XmlElementRef(name = "pad__adr_line2", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrLine2;
    @XmlElementRef(name = "pad__adr_line3", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrLine3;
    @XmlElementRef(name = "pad__adr_city", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrCity;
    @XmlElementRef(name = "pad__adr_state", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrState;
    @XmlElementRef(name = "pad__adr_post_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrPostCode;
    @XmlElementRef(name = "pad__adr_city_state_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrCityStateCode;
    @XmlElementRef(name = "pad__adr_country", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrCountry;
    @XmlElementRef(name = "pad__adr_intl_province", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrIntlProvince;
    @XmlElementRef(name = "pad__adr_county", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrCounty;
    @XmlElementRef(name = "pad__adr_cong_dist", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrCongDist;
    @XmlElementRef(name = "pad__adr_state_house", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrStateHouse;
    @XmlElementRef(name = "pad__adr_state_senate", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrStateSenate;
    @XmlElementRef(name = "pad__adr_latitude", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Double> padAdrLatitude;
    @XmlElementRef(name = "pad__adr_longitude", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Double> padAdrLongitude;
    @XmlElementRef(name = "pad__adr_mailing_label", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrMailingLabel;
    @XmlElementRef(name = "pad__adr_mailing_label_html", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrMailingLabelHtml;
    @XmlElementRef(name = "pad__adr_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrAddDate;
    @XmlElementRef(name = "pad__adr_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrAddUser;
    @XmlElementRef(name = "pad__adr_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrChangeDate;
    @XmlElementRef(name = "pad__adr_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrChangeUser;
    @XmlElementRef(name = "pad__adr_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> padAdrDeleteFlag;
    @XmlElementRef(name = "pad__adr_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrKeyExt;
    @XmlElementRef(name = "pad__adr_bad_address_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> padAdrBadAddressFlag;
    @XmlElementRef(name = "pad__adr_adb_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrAdbKey;
    @XmlElementRef(name = "pad__adr_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrEntityKey;
    @XmlElementRef(name = "pad__adr_metro_stat_area", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrMetroStatArea;
    @XmlElementRef(name = "pad__adr_carrier_route", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrCarrierRoute;
    @XmlElementRef(name = "pad__adr_delivery_point_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrDeliveryPointCode;
    @XmlElementRef(name = "pad__adr_lacs", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrLacs;
    @XmlElementRef(name = "pad__adr_time_zone", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrTimeZone;
    @XmlElementRef(name = "pad__adr_urbanization", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrUrbanization;
    @XmlElementRef(name = "pad__adr_bar_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrBarCode;
    @XmlElementRef(name = "pad__adr_fips", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrFips;
    @XmlElementRef(name = "pad__adr_no_validation_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> padAdrNoValidationFlag;
    @XmlElementRef(name = "pad__adr_attn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrAttn;
    @XmlElementRef(name = "pad__adr_record_type_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrRecordTypeCode;
    @XmlElementRef(name = "pad__adr_geography", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> padAdrGeography;

    /**
     * Gets the value of the padAdrKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrKey() {
        return padAdrKey;
    }

    /**
     * Sets the value of the padAdrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrKey(JAXBElement<String> value) {
        this.padAdrKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrCstKeyOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrCstKeyOwner() {
        return padAdrCstKeyOwner;
    }

    /**
     * Sets the value of the padAdrCstKeyOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrCstKeyOwner(JAXBElement<String> value) {
        this.padAdrCstKeyOwner = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrLine1() {
        return padAdrLine1;
    }

    /**
     * Sets the value of the padAdrLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrLine1(JAXBElement<String> value) {
        this.padAdrLine1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrLine2() {
        return padAdrLine2;
    }

    /**
     * Sets the value of the padAdrLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrLine2(JAXBElement<String> value) {
        this.padAdrLine2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrLine3() {
        return padAdrLine3;
    }

    /**
     * Sets the value of the padAdrLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrLine3(JAXBElement<String> value) {
        this.padAdrLine3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrCity() {
        return padAdrCity;
    }

    /**
     * Sets the value of the padAdrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrCity(JAXBElement<String> value) {
        this.padAdrCity = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrState() {
        return padAdrState;
    }

    /**
     * Sets the value of the padAdrState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrState(JAXBElement<String> value) {
        this.padAdrState = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrPostCode() {
        return padAdrPostCode;
    }

    /**
     * Sets the value of the padAdrPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrPostCode(JAXBElement<String> value) {
        this.padAdrPostCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrCityStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrCityStateCode() {
        return padAdrCityStateCode;
    }

    /**
     * Sets the value of the padAdrCityStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrCityStateCode(JAXBElement<String> value) {
        this.padAdrCityStateCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrCountry() {
        return padAdrCountry;
    }

    /**
     * Sets the value of the padAdrCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrCountry(JAXBElement<String> value) {
        this.padAdrCountry = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrIntlProvince property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrIntlProvince() {
        return padAdrIntlProvince;
    }

    /**
     * Sets the value of the padAdrIntlProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrIntlProvince(JAXBElement<String> value) {
        this.padAdrIntlProvince = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrCounty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrCounty() {
        return padAdrCounty;
    }

    /**
     * Sets the value of the padAdrCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrCounty(JAXBElement<String> value) {
        this.padAdrCounty = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrCongDist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrCongDist() {
        return padAdrCongDist;
    }

    /**
     * Sets the value of the padAdrCongDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrCongDist(JAXBElement<String> value) {
        this.padAdrCongDist = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrStateHouse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrStateHouse() {
        return padAdrStateHouse;
    }

    /**
     * Sets the value of the padAdrStateHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrStateHouse(JAXBElement<String> value) {
        this.padAdrStateHouse = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrStateSenate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrStateSenate() {
        return padAdrStateSenate;
    }

    /**
     * Sets the value of the padAdrStateSenate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrStateSenate(JAXBElement<String> value) {
        this.padAdrStateSenate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPadAdrLatitude() {
        return padAdrLatitude;
    }

    /**
     * Sets the value of the padAdrLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPadAdrLatitude(JAXBElement<Double> value) {
        this.padAdrLatitude = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the padAdrLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPadAdrLongitude() {
        return padAdrLongitude;
    }

    /**
     * Sets the value of the padAdrLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPadAdrLongitude(JAXBElement<Double> value) {
        this.padAdrLongitude = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the padAdrMailingLabel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrMailingLabel() {
        return padAdrMailingLabel;
    }

    /**
     * Sets the value of the padAdrMailingLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrMailingLabel(JAXBElement<String> value) {
        this.padAdrMailingLabel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrMailingLabelHtml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrMailingLabelHtml() {
        return padAdrMailingLabelHtml;
    }

    /**
     * Sets the value of the padAdrMailingLabelHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrMailingLabelHtml(JAXBElement<String> value) {
        this.padAdrMailingLabelHtml = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrAddDate() {
        return padAdrAddDate;
    }

    /**
     * Sets the value of the padAdrAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrAddDate(JAXBElement<String> value) {
        this.padAdrAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrAddUser() {
        return padAdrAddUser;
    }

    /**
     * Sets the value of the padAdrAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrAddUser(JAXBElement<String> value) {
        this.padAdrAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrChangeDate() {
        return padAdrChangeDate;
    }

    /**
     * Sets the value of the padAdrChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrChangeDate(JAXBElement<String> value) {
        this.padAdrChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrChangeUser() {
        return padAdrChangeUser;
    }

    /**
     * Sets the value of the padAdrChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrChangeUser(JAXBElement<String> value) {
        this.padAdrChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPadAdrDeleteFlag() {
        return padAdrDeleteFlag;
    }

    /**
     * Sets the value of the padAdrDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPadAdrDeleteFlag(JAXBElement<Short> value) {
        this.padAdrDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the padAdrKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrKeyExt() {
        return padAdrKeyExt;
    }

    /**
     * Sets the value of the padAdrKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrKeyExt(JAXBElement<String> value) {
        this.padAdrKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrBadAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPadAdrBadAddressFlag() {
        return padAdrBadAddressFlag;
    }

    /**
     * Sets the value of the padAdrBadAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPadAdrBadAddressFlag(JAXBElement<Short> value) {
        this.padAdrBadAddressFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the padAdrAdbKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrAdbKey() {
        return padAdrAdbKey;
    }

    /**
     * Sets the value of the padAdrAdbKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrAdbKey(JAXBElement<String> value) {
        this.padAdrAdbKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrEntityKey() {
        return padAdrEntityKey;
    }

    /**
     * Sets the value of the padAdrEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrEntityKey(JAXBElement<String> value) {
        this.padAdrEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrMetroStatArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrMetroStatArea() {
        return padAdrMetroStatArea;
    }

    /**
     * Sets the value of the padAdrMetroStatArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrMetroStatArea(JAXBElement<String> value) {
        this.padAdrMetroStatArea = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrCarrierRoute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrCarrierRoute() {
        return padAdrCarrierRoute;
    }

    /**
     * Sets the value of the padAdrCarrierRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrCarrierRoute(JAXBElement<String> value) {
        this.padAdrCarrierRoute = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrDeliveryPointCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrDeliveryPointCode() {
        return padAdrDeliveryPointCode;
    }

    /**
     * Sets the value of the padAdrDeliveryPointCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrDeliveryPointCode(JAXBElement<String> value) {
        this.padAdrDeliveryPointCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrLacs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrLacs() {
        return padAdrLacs;
    }

    /**
     * Sets the value of the padAdrLacs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrLacs(JAXBElement<String> value) {
        this.padAdrLacs = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrTimeZone() {
        return padAdrTimeZone;
    }

    /**
     * Sets the value of the padAdrTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrTimeZone(JAXBElement<String> value) {
        this.padAdrTimeZone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrUrbanization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrUrbanization() {
        return padAdrUrbanization;
    }

    /**
     * Sets the value of the padAdrUrbanization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrUrbanization(JAXBElement<String> value) {
        this.padAdrUrbanization = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrBarCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrBarCode() {
        return padAdrBarCode;
    }

    /**
     * Sets the value of the padAdrBarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrBarCode(JAXBElement<String> value) {
        this.padAdrBarCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrFips property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrFips() {
        return padAdrFips;
    }

    /**
     * Sets the value of the padAdrFips property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrFips(JAXBElement<String> value) {
        this.padAdrFips = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrNoValidationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPadAdrNoValidationFlag() {
        return padAdrNoValidationFlag;
    }

    /**
     * Sets the value of the padAdrNoValidationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPadAdrNoValidationFlag(JAXBElement<Short> value) {
        this.padAdrNoValidationFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the padAdrAttn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrAttn() {
        return padAdrAttn;
    }

    /**
     * Sets the value of the padAdrAttn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrAttn(JAXBElement<String> value) {
        this.padAdrAttn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrRecordTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrRecordTypeCode() {
        return padAdrRecordTypeCode;
    }

    /**
     * Sets the value of the padAdrRecordTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrRecordTypeCode(JAXBElement<String> value) {
        this.padAdrRecordTypeCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the padAdrGeography property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadAdrGeography() {
        return padAdrGeography;
    }

    /**
     * Sets the value of the padAdrGeography property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadAdrGeography(JAXBElement<String> value) {
        this.padAdrGeography = ((JAXBElement<String> ) value);
    }

}
