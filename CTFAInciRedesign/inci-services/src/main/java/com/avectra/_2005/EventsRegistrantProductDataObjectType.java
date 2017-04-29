
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrant_Product_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrant_Product_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prd_name" type="{http://www.avectra.com/2005/}stringLength255_Type" minOccurs="0"/>
 *         &lt;element name="prd_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="prd_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="prd_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="prd_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="prd_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="prd_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prd_description" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="prd_allow_partial_ship_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prd_track_inventory_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prd_gla_cogs_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prd_gla_inventory_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prd_ptp_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prd_start_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="prd_taxable_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prd_allow_backorder" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prd_end_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="prd_atc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prd_qty_reorder" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="prd_restock_fee" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="prd_restock_percent" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="prd_restock_percent_cp" type="{http://www.avectra.com/2005/}decimal_Type" minOccurs="0"/>
 *         &lt;element name="prd_mail" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prd_email" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prd_fax" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prd_sell_online" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prd_online_abstract" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="prd_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="prd_short_description" type="{http://www.avectra.com/2005/}stringLength400_Type" minOccurs="0"/>
 *         &lt;element name="prd_thumbnail_doc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prd_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prd_web" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prd_microfiche" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prd_post_to_web_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="prd_remove_from_web_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="prd_ptc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prd_format" type="{http://www.avectra.com/2005/}stringLength25_Type" minOccurs="0"/>
 *         &lt;element name="prd_download_url" type="{http://www.avectra.com/2005/}av_url_Type" minOccurs="0"/>
 *         &lt;element name="prd_show_as_new_until" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="prd_pjt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prd_gla_damaged_goods_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prd_order" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="prd_download_available_days" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="prd_weighted_average_cost" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="prd_featured_product_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="prd_download_available_count" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="prd_color_ext" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="prd_cct_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prd_complexion_ext" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="prd_pts_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="prd_gender_ext" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="prd_age_group_ext" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrant_Product_DataObjectType", propOrder = {
    "prdKey",
    "prdName",
    "prdAddUser",
    "prdAddDate",
    "prdChangeUser",
    "prdChangeDate",
    "prdDeleteFlag",
    "prdKeyExt",
    "prdDescription",
    "prdAllowPartialShipFlag",
    "prdTrackInventoryFlag",
    "prdGlaCogsKey",
    "prdGlaInventoryKey",
    "prdPtpKey",
    "prdStartDate",
    "prdTaxableFlag",
    "prdAllowBackorder",
    "prdEndDate",
    "prdAtcKey",
    "prdQtyReorder",
    "prdRestockFee",
    "prdRestockPercent",
    "prdRestockPercentCp",
    "prdMail",
    "prdEmail",
    "prdFax",
    "prdSellOnline",
    "prdOnlineAbstract",
    "prdCode",
    "prdShortDescription",
    "prdThumbnailDocKey",
    "prdEntityKey",
    "prdWeb",
    "prdMicrofiche",
    "prdPostToWebDate",
    "prdRemoveFromWebDate",
    "prdPtcKey",
    "prdFormat",
    "prdDownloadUrl",
    "prdShowAsNewUntil",
    "prdPjtKey",
    "prdGlaDamagedGoodsKey",
    "prdOrder",
    "prdDownloadAvailableDays",
    "prdWeightedAverageCost",
    "prdFeaturedProductFlag",
    "prdDownloadAvailableCount",
    "prdColorExt",
    "prdCctKey",
    "prdComplexionExt",
    "prdPtsKey",
    "prdGenderExt",
    "prdAgeGroupExt"
})
public class EventsRegistrantProductDataObjectType {

    @XmlElementRef(name = "prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdKey;
    @XmlElementRef(name = "prd_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdName;
    @XmlElementRef(name = "prd_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdAddUser;
    @XmlElementRef(name = "prd_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdAddDate;
    @XmlElementRef(name = "prd_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdChangeUser;
    @XmlElementRef(name = "prd_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdChangeDate;
    @XmlElementRef(name = "prd_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prdDeleteFlag;
    @XmlElementRef(name = "prd_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdKeyExt;
    @XmlElementRef(name = "prd_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdDescription;
    @XmlElementRef(name = "prd_allow_partial_ship_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prdAllowPartialShipFlag;
    @XmlElementRef(name = "prd_track_inventory_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prdTrackInventoryFlag;
    @XmlElementRef(name = "prd_gla_cogs_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdGlaCogsKey;
    @XmlElementRef(name = "prd_gla_inventory_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdGlaInventoryKey;
    @XmlElementRef(name = "prd_ptp_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdPtpKey;
    @XmlElementRef(name = "prd_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdStartDate;
    @XmlElementRef(name = "prd_taxable_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prdTaxableFlag;
    @XmlElementRef(name = "prd_allow_backorder", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prdAllowBackorder;
    @XmlElementRef(name = "prd_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdEndDate;
    @XmlElementRef(name = "prd_atc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdAtcKey;
    @XmlElementRef(name = "prd_qty_reorder", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> prdQtyReorder;
    @XmlElementRef(name = "prd_restock_fee", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> prdRestockFee;
    @XmlElementRef(name = "prd_restock_percent", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> prdRestockPercent;
    @XmlElementRef(name = "prd_restock_percent_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> prdRestockPercentCp;
    @XmlElementRef(name = "prd_mail", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prdMail;
    @XmlElementRef(name = "prd_email", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prdEmail;
    @XmlElementRef(name = "prd_fax", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prdFax;
    @XmlElementRef(name = "prd_sell_online", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prdSellOnline;
    @XmlElementRef(name = "prd_online_abstract", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdOnlineAbstract;
    @XmlElementRef(name = "prd_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdCode;
    @XmlElementRef(name = "prd_short_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdShortDescription;
    @XmlElementRef(name = "prd_thumbnail_doc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdThumbnailDocKey;
    @XmlElementRef(name = "prd_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdEntityKey;
    @XmlElementRef(name = "prd_web", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prdWeb;
    @XmlElementRef(name = "prd_microfiche", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prdMicrofiche;
    @XmlElementRef(name = "prd_post_to_web_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdPostToWebDate;
    @XmlElementRef(name = "prd_remove_from_web_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdRemoveFromWebDate;
    @XmlElementRef(name = "prd_ptc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdPtcKey;
    @XmlElementRef(name = "prd_format", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdFormat;
    @XmlElementRef(name = "prd_download_url", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdDownloadUrl;
    @XmlElementRef(name = "prd_show_as_new_until", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdShowAsNewUntil;
    @XmlElementRef(name = "prd_pjt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdPjtKey;
    @XmlElementRef(name = "prd_gla_damaged_goods_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdGlaDamagedGoodsKey;
    @XmlElementRef(name = "prd_order", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> prdOrder;
    @XmlElementRef(name = "prd_download_available_days", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> prdDownloadAvailableDays;
    @XmlElementRef(name = "prd_weighted_average_cost", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> prdWeightedAverageCost;
    @XmlElementRef(name = "prd_featured_product_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> prdFeaturedProductFlag;
    @XmlElementRef(name = "prd_download_available_count", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> prdDownloadAvailableCount;
    @XmlElementRef(name = "prd_color_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdColorExt;
    @XmlElementRef(name = "prd_cct_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdCctKey;
    @XmlElementRef(name = "prd_complexion_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdComplexionExt;
    @XmlElementRef(name = "prd_pts_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdPtsKey;
    @XmlElementRef(name = "prd_gender_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdGenderExt;
    @XmlElementRef(name = "prd_age_group_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> prdAgeGroupExt;

    /**
     * Gets the value of the prdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdKey() {
        return prdKey;
    }

    /**
     * Sets the value of the prdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdKey(JAXBElement<String> value) {
        this.prdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdName() {
        return prdName;
    }

    /**
     * Sets the value of the prdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdName(JAXBElement<String> value) {
        this.prdName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdAddUser() {
        return prdAddUser;
    }

    /**
     * Sets the value of the prdAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdAddUser(JAXBElement<String> value) {
        this.prdAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdAddDate() {
        return prdAddDate;
    }

    /**
     * Sets the value of the prdAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdAddDate(JAXBElement<String> value) {
        this.prdAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdChangeUser() {
        return prdChangeUser;
    }

    /**
     * Sets the value of the prdChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdChangeUser(JAXBElement<String> value) {
        this.prdChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdChangeDate() {
        return prdChangeDate;
    }

    /**
     * Sets the value of the prdChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdChangeDate(JAXBElement<String> value) {
        this.prdChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrdDeleteFlag() {
        return prdDeleteFlag;
    }

    /**
     * Sets the value of the prdDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrdDeleteFlag(JAXBElement<Short> value) {
        this.prdDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prdKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdKeyExt() {
        return prdKeyExt;
    }

    /**
     * Sets the value of the prdKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdKeyExt(JAXBElement<String> value) {
        this.prdKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdDescription() {
        return prdDescription;
    }

    /**
     * Sets the value of the prdDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdDescription(JAXBElement<String> value) {
        this.prdDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdAllowPartialShipFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrdAllowPartialShipFlag() {
        return prdAllowPartialShipFlag;
    }

    /**
     * Sets the value of the prdAllowPartialShipFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrdAllowPartialShipFlag(JAXBElement<Short> value) {
        this.prdAllowPartialShipFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prdTrackInventoryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrdTrackInventoryFlag() {
        return prdTrackInventoryFlag;
    }

    /**
     * Sets the value of the prdTrackInventoryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrdTrackInventoryFlag(JAXBElement<Short> value) {
        this.prdTrackInventoryFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prdGlaCogsKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdGlaCogsKey() {
        return prdGlaCogsKey;
    }

    /**
     * Sets the value of the prdGlaCogsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdGlaCogsKey(JAXBElement<String> value) {
        this.prdGlaCogsKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdGlaInventoryKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdGlaInventoryKey() {
        return prdGlaInventoryKey;
    }

    /**
     * Sets the value of the prdGlaInventoryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdGlaInventoryKey(JAXBElement<String> value) {
        this.prdGlaInventoryKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdPtpKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdPtpKey() {
        return prdPtpKey;
    }

    /**
     * Sets the value of the prdPtpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdPtpKey(JAXBElement<String> value) {
        this.prdPtpKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdStartDate() {
        return prdStartDate;
    }

    /**
     * Sets the value of the prdStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdStartDate(JAXBElement<String> value) {
        this.prdStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdTaxableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrdTaxableFlag() {
        return prdTaxableFlag;
    }

    /**
     * Sets the value of the prdTaxableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrdTaxableFlag(JAXBElement<Short> value) {
        this.prdTaxableFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prdAllowBackorder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrdAllowBackorder() {
        return prdAllowBackorder;
    }

    /**
     * Sets the value of the prdAllowBackorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrdAllowBackorder(JAXBElement<Short> value) {
        this.prdAllowBackorder = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prdEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdEndDate() {
        return prdEndDate;
    }

    /**
     * Sets the value of the prdEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdEndDate(JAXBElement<String> value) {
        this.prdEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdAtcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdAtcKey() {
        return prdAtcKey;
    }

    /**
     * Sets the value of the prdAtcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdAtcKey(JAXBElement<String> value) {
        this.prdAtcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdQtyReorder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrdQtyReorder() {
        return prdQtyReorder;
    }

    /**
     * Sets the value of the prdQtyReorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrdQtyReorder(JAXBElement<BigDecimal> value) {
        this.prdQtyReorder = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the prdRestockFee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrdRestockFee() {
        return prdRestockFee;
    }

    /**
     * Sets the value of the prdRestockFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrdRestockFee(JAXBElement<BigDecimal> value) {
        this.prdRestockFee = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the prdRestockPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrdRestockPercent() {
        return prdRestockPercent;
    }

    /**
     * Sets the value of the prdRestockPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrdRestockPercent(JAXBElement<BigDecimal> value) {
        this.prdRestockPercent = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the prdRestockPercentCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrdRestockPercentCp() {
        return prdRestockPercentCp;
    }

    /**
     * Sets the value of the prdRestockPercentCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrdRestockPercentCp(JAXBElement<BigDecimal> value) {
        this.prdRestockPercentCp = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the prdMail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrdMail() {
        return prdMail;
    }

    /**
     * Sets the value of the prdMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrdMail(JAXBElement<Short> value) {
        this.prdMail = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prdEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrdEmail() {
        return prdEmail;
    }

    /**
     * Sets the value of the prdEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrdEmail(JAXBElement<Short> value) {
        this.prdEmail = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prdFax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrdFax() {
        return prdFax;
    }

    /**
     * Sets the value of the prdFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrdFax(JAXBElement<Short> value) {
        this.prdFax = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prdSellOnline property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrdSellOnline() {
        return prdSellOnline;
    }

    /**
     * Sets the value of the prdSellOnline property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrdSellOnline(JAXBElement<Short> value) {
        this.prdSellOnline = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prdOnlineAbstract property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdOnlineAbstract() {
        return prdOnlineAbstract;
    }

    /**
     * Sets the value of the prdOnlineAbstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdOnlineAbstract(JAXBElement<String> value) {
        this.prdOnlineAbstract = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdCode() {
        return prdCode;
    }

    /**
     * Sets the value of the prdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdCode(JAXBElement<String> value) {
        this.prdCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdShortDescription() {
        return prdShortDescription;
    }

    /**
     * Sets the value of the prdShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdShortDescription(JAXBElement<String> value) {
        this.prdShortDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdThumbnailDocKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdThumbnailDocKey() {
        return prdThumbnailDocKey;
    }

    /**
     * Sets the value of the prdThumbnailDocKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdThumbnailDocKey(JAXBElement<String> value) {
        this.prdThumbnailDocKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdEntityKey() {
        return prdEntityKey;
    }

    /**
     * Sets the value of the prdEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdEntityKey(JAXBElement<String> value) {
        this.prdEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdWeb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrdWeb() {
        return prdWeb;
    }

    /**
     * Sets the value of the prdWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrdWeb(JAXBElement<Short> value) {
        this.prdWeb = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prdMicrofiche property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrdMicrofiche() {
        return prdMicrofiche;
    }

    /**
     * Sets the value of the prdMicrofiche property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrdMicrofiche(JAXBElement<Short> value) {
        this.prdMicrofiche = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prdPostToWebDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdPostToWebDate() {
        return prdPostToWebDate;
    }

    /**
     * Sets the value of the prdPostToWebDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdPostToWebDate(JAXBElement<String> value) {
        this.prdPostToWebDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdRemoveFromWebDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdRemoveFromWebDate() {
        return prdRemoveFromWebDate;
    }

    /**
     * Sets the value of the prdRemoveFromWebDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdRemoveFromWebDate(JAXBElement<String> value) {
        this.prdRemoveFromWebDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdPtcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdPtcKey() {
        return prdPtcKey;
    }

    /**
     * Sets the value of the prdPtcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdPtcKey(JAXBElement<String> value) {
        this.prdPtcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdFormat() {
        return prdFormat;
    }

    /**
     * Sets the value of the prdFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdFormat(JAXBElement<String> value) {
        this.prdFormat = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdDownloadUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdDownloadUrl() {
        return prdDownloadUrl;
    }

    /**
     * Sets the value of the prdDownloadUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdDownloadUrl(JAXBElement<String> value) {
        this.prdDownloadUrl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdShowAsNewUntil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdShowAsNewUntil() {
        return prdShowAsNewUntil;
    }

    /**
     * Sets the value of the prdShowAsNewUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdShowAsNewUntil(JAXBElement<String> value) {
        this.prdShowAsNewUntil = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdPjtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdPjtKey() {
        return prdPjtKey;
    }

    /**
     * Sets the value of the prdPjtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdPjtKey(JAXBElement<String> value) {
        this.prdPjtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdGlaDamagedGoodsKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdGlaDamagedGoodsKey() {
        return prdGlaDamagedGoodsKey;
    }

    /**
     * Sets the value of the prdGlaDamagedGoodsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdGlaDamagedGoodsKey(JAXBElement<String> value) {
        this.prdGlaDamagedGoodsKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrdOrder() {
        return prdOrder;
    }

    /**
     * Sets the value of the prdOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrdOrder(JAXBElement<Integer> value) {
        this.prdOrder = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the prdDownloadAvailableDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrdDownloadAvailableDays() {
        return prdDownloadAvailableDays;
    }

    /**
     * Sets the value of the prdDownloadAvailableDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrdDownloadAvailableDays(JAXBElement<Integer> value) {
        this.prdDownloadAvailableDays = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the prdWeightedAverageCost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrdWeightedAverageCost() {
        return prdWeightedAverageCost;
    }

    /**
     * Sets the value of the prdWeightedAverageCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrdWeightedAverageCost(JAXBElement<BigDecimal> value) {
        this.prdWeightedAverageCost = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the prdFeaturedProductFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPrdFeaturedProductFlag() {
        return prdFeaturedProductFlag;
    }

    /**
     * Sets the value of the prdFeaturedProductFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPrdFeaturedProductFlag(JAXBElement<Short> value) {
        this.prdFeaturedProductFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the prdDownloadAvailableCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrdDownloadAvailableCount() {
        return prdDownloadAvailableCount;
    }

    /**
     * Sets the value of the prdDownloadAvailableCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrdDownloadAvailableCount(JAXBElement<Integer> value) {
        this.prdDownloadAvailableCount = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the prdColorExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdColorExt() {
        return prdColorExt;
    }

    /**
     * Sets the value of the prdColorExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdColorExt(JAXBElement<String> value) {
        this.prdColorExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdCctKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdCctKey() {
        return prdCctKey;
    }

    /**
     * Sets the value of the prdCctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdCctKey(JAXBElement<String> value) {
        this.prdCctKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdComplexionExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdComplexionExt() {
        return prdComplexionExt;
    }

    /**
     * Sets the value of the prdComplexionExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdComplexionExt(JAXBElement<String> value) {
        this.prdComplexionExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdPtsKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdPtsKey() {
        return prdPtsKey;
    }

    /**
     * Sets the value of the prdPtsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdPtsKey(JAXBElement<String> value) {
        this.prdPtsKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdGenderExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdGenderExt() {
        return prdGenderExt;
    }

    /**
     * Sets the value of the prdGenderExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdGenderExt(JAXBElement<String> value) {
        this.prdGenderExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prdAgeGroupExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrdAgeGroupExt() {
        return prdAgeGroupExt;
    }

    /**
     * Sets the value of the prdAgeGroupExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrdAgeGroupExt(JAXBElement<String> value) {
        this.prdAgeGroupExt = ((JAXBElement<String> ) value);
    }

}
