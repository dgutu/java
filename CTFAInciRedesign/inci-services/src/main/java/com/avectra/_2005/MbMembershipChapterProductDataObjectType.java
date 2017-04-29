
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mb_membership_Chapter_Product_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mb_membership_Chapter_Product_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpr__prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_name" type="{http://www.avectra.com/2005/}stringLength255_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_description" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_allow_partial_ship_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_track_inventory_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_gla_cogs_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_gla_inventory_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_ptp_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_start_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_taxable_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_allow_backorder" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_end_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_atc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_qty_reorder" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_restock_fee" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_restock_percent" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_restock_percent_cp" type="{http://www.avectra.com/2005/}decimal_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_mail" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_email" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_fax" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_sell_online" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_online_abstract" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_short_description" type="{http://www.avectra.com/2005/}stringLength400_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_thumbnail_doc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_web" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_microfiche" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_post_to_web_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_remove_from_web_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_ptc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_format" type="{http://www.avectra.com/2005/}stringLength25_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_download_url" type="{http://www.avectra.com/2005/}av_url_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_show_as_new_until" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_pjt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_gla_damaged_goods_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_order" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_download_available_days" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_weighted_average_cost" type="{http://www.avectra.com/2005/}av_decimal4_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_featured_product_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_download_available_count" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_color_ext" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_cct_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_complexion_ext" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_pts_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_gender_ext" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cpr__prd_age_group_ext" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mb_membership_Chapter_Product_DataObjectType", propOrder = {
    "cprPrdKey",
    "cprPrdName",
    "cprPrdAddUser",
    "cprPrdAddDate",
    "cprPrdChangeUser",
    "cprPrdChangeDate",
    "cprPrdDeleteFlag",
    "cprPrdKeyExt",
    "cprPrdDescription",
    "cprPrdAllowPartialShipFlag",
    "cprPrdTrackInventoryFlag",
    "cprPrdGlaCogsKey",
    "cprPrdGlaInventoryKey",
    "cprPrdPtpKey",
    "cprPrdStartDate",
    "cprPrdTaxableFlag",
    "cprPrdAllowBackorder",
    "cprPrdEndDate",
    "cprPrdAtcKey",
    "cprPrdQtyReorder",
    "cprPrdRestockFee",
    "cprPrdRestockPercent",
    "cprPrdRestockPercentCp",
    "cprPrdMail",
    "cprPrdEmail",
    "cprPrdFax",
    "cprPrdSellOnline",
    "cprPrdOnlineAbstract",
    "cprPrdCode",
    "cprPrdShortDescription",
    "cprPrdThumbnailDocKey",
    "cprPrdEntityKey",
    "cprPrdWeb",
    "cprPrdMicrofiche",
    "cprPrdPostToWebDate",
    "cprPrdRemoveFromWebDate",
    "cprPrdPtcKey",
    "cprPrdFormat",
    "cprPrdDownloadUrl",
    "cprPrdShowAsNewUntil",
    "cprPrdPjtKey",
    "cprPrdGlaDamagedGoodsKey",
    "cprPrdOrder",
    "cprPrdDownloadAvailableDays",
    "cprPrdWeightedAverageCost",
    "cprPrdFeaturedProductFlag",
    "cprPrdDownloadAvailableCount",
    "cprPrdColorExt",
    "cprPrdCctKey",
    "cprPrdComplexionExt",
    "cprPrdPtsKey",
    "cprPrdGenderExt",
    "cprPrdAgeGroupExt"
})
public class MbMembershipChapterProductDataObjectType {

    @XmlElementRef(name = "cpr__prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdKey;
    @XmlElementRef(name = "cpr__prd_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdName;
    @XmlElementRef(name = "cpr__prd_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdAddUser;
    @XmlElementRef(name = "cpr__prd_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdAddDate;
    @XmlElementRef(name = "cpr__prd_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdChangeUser;
    @XmlElementRef(name = "cpr__prd_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdChangeDate;
    @XmlElementRef(name = "cpr__prd_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cprPrdDeleteFlag;
    @XmlElementRef(name = "cpr__prd_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdKeyExt;
    @XmlElementRef(name = "cpr__prd_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdDescription;
    @XmlElementRef(name = "cpr__prd_allow_partial_ship_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cprPrdAllowPartialShipFlag;
    @XmlElementRef(name = "cpr__prd_track_inventory_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cprPrdTrackInventoryFlag;
    @XmlElementRef(name = "cpr__prd_gla_cogs_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdGlaCogsKey;
    @XmlElementRef(name = "cpr__prd_gla_inventory_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdGlaInventoryKey;
    @XmlElementRef(name = "cpr__prd_ptp_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdPtpKey;
    @XmlElementRef(name = "cpr__prd_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdStartDate;
    @XmlElementRef(name = "cpr__prd_taxable_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cprPrdTaxableFlag;
    @XmlElementRef(name = "cpr__prd_allow_backorder", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cprPrdAllowBackorder;
    @XmlElementRef(name = "cpr__prd_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdEndDate;
    @XmlElementRef(name = "cpr__prd_atc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdAtcKey;
    @XmlElementRef(name = "cpr__prd_qty_reorder", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> cprPrdQtyReorder;
    @XmlElementRef(name = "cpr__prd_restock_fee", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> cprPrdRestockFee;
    @XmlElementRef(name = "cpr__prd_restock_percent", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> cprPrdRestockPercent;
    @XmlElementRef(name = "cpr__prd_restock_percent_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> cprPrdRestockPercentCp;
    @XmlElementRef(name = "cpr__prd_mail", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cprPrdMail;
    @XmlElementRef(name = "cpr__prd_email", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cprPrdEmail;
    @XmlElementRef(name = "cpr__prd_fax", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cprPrdFax;
    @XmlElementRef(name = "cpr__prd_sell_online", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cprPrdSellOnline;
    @XmlElementRef(name = "cpr__prd_online_abstract", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdOnlineAbstract;
    @XmlElementRef(name = "cpr__prd_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdCode;
    @XmlElementRef(name = "cpr__prd_short_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdShortDescription;
    @XmlElementRef(name = "cpr__prd_thumbnail_doc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdThumbnailDocKey;
    @XmlElementRef(name = "cpr__prd_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdEntityKey;
    @XmlElementRef(name = "cpr__prd_web", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cprPrdWeb;
    @XmlElementRef(name = "cpr__prd_microfiche", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cprPrdMicrofiche;
    @XmlElementRef(name = "cpr__prd_post_to_web_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdPostToWebDate;
    @XmlElementRef(name = "cpr__prd_remove_from_web_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdRemoveFromWebDate;
    @XmlElementRef(name = "cpr__prd_ptc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdPtcKey;
    @XmlElementRef(name = "cpr__prd_format", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdFormat;
    @XmlElementRef(name = "cpr__prd_download_url", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdDownloadUrl;
    @XmlElementRef(name = "cpr__prd_show_as_new_until", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdShowAsNewUntil;
    @XmlElementRef(name = "cpr__prd_pjt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdPjtKey;
    @XmlElementRef(name = "cpr__prd_gla_damaged_goods_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdGlaDamagedGoodsKey;
    @XmlElementRef(name = "cpr__prd_order", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cprPrdOrder;
    @XmlElementRef(name = "cpr__prd_download_available_days", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cprPrdDownloadAvailableDays;
    @XmlElementRef(name = "cpr__prd_weighted_average_cost", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> cprPrdWeightedAverageCost;
    @XmlElementRef(name = "cpr__prd_featured_product_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cprPrdFeaturedProductFlag;
    @XmlElementRef(name = "cpr__prd_download_available_count", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cprPrdDownloadAvailableCount;
    @XmlElementRef(name = "cpr__prd_color_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdColorExt;
    @XmlElementRef(name = "cpr__prd_cct_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdCctKey;
    @XmlElementRef(name = "cpr__prd_complexion_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdComplexionExt;
    @XmlElementRef(name = "cpr__prd_pts_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdPtsKey;
    @XmlElementRef(name = "cpr__prd_gender_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdGenderExt;
    @XmlElementRef(name = "cpr__prd_age_group_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cprPrdAgeGroupExt;

    /**
     * Gets the value of the cprPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdKey() {
        return cprPrdKey;
    }

    /**
     * Sets the value of the cprPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdKey(JAXBElement<String> value) {
        this.cprPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdName() {
        return cprPrdName;
    }

    /**
     * Sets the value of the cprPrdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdName(JAXBElement<String> value) {
        this.cprPrdName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdAddUser() {
        return cprPrdAddUser;
    }

    /**
     * Sets the value of the cprPrdAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdAddUser(JAXBElement<String> value) {
        this.cprPrdAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdAddDate() {
        return cprPrdAddDate;
    }

    /**
     * Sets the value of the cprPrdAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdAddDate(JAXBElement<String> value) {
        this.cprPrdAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdChangeUser() {
        return cprPrdChangeUser;
    }

    /**
     * Sets the value of the cprPrdChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdChangeUser(JAXBElement<String> value) {
        this.cprPrdChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdChangeDate() {
        return cprPrdChangeDate;
    }

    /**
     * Sets the value of the cprPrdChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdChangeDate(JAXBElement<String> value) {
        this.cprPrdChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCprPrdDeleteFlag() {
        return cprPrdDeleteFlag;
    }

    /**
     * Sets the value of the cprPrdDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCprPrdDeleteFlag(JAXBElement<Short> value) {
        this.cprPrdDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cprPrdKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdKeyExt() {
        return cprPrdKeyExt;
    }

    /**
     * Sets the value of the cprPrdKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdKeyExt(JAXBElement<String> value) {
        this.cprPrdKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdDescription() {
        return cprPrdDescription;
    }

    /**
     * Sets the value of the cprPrdDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdDescription(JAXBElement<String> value) {
        this.cprPrdDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdAllowPartialShipFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCprPrdAllowPartialShipFlag() {
        return cprPrdAllowPartialShipFlag;
    }

    /**
     * Sets the value of the cprPrdAllowPartialShipFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCprPrdAllowPartialShipFlag(JAXBElement<Short> value) {
        this.cprPrdAllowPartialShipFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cprPrdTrackInventoryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCprPrdTrackInventoryFlag() {
        return cprPrdTrackInventoryFlag;
    }

    /**
     * Sets the value of the cprPrdTrackInventoryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCprPrdTrackInventoryFlag(JAXBElement<Short> value) {
        this.cprPrdTrackInventoryFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cprPrdGlaCogsKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdGlaCogsKey() {
        return cprPrdGlaCogsKey;
    }

    /**
     * Sets the value of the cprPrdGlaCogsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdGlaCogsKey(JAXBElement<String> value) {
        this.cprPrdGlaCogsKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdGlaInventoryKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdGlaInventoryKey() {
        return cprPrdGlaInventoryKey;
    }

    /**
     * Sets the value of the cprPrdGlaInventoryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdGlaInventoryKey(JAXBElement<String> value) {
        this.cprPrdGlaInventoryKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdPtpKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdPtpKey() {
        return cprPrdPtpKey;
    }

    /**
     * Sets the value of the cprPrdPtpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdPtpKey(JAXBElement<String> value) {
        this.cprPrdPtpKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdStartDate() {
        return cprPrdStartDate;
    }

    /**
     * Sets the value of the cprPrdStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdStartDate(JAXBElement<String> value) {
        this.cprPrdStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdTaxableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCprPrdTaxableFlag() {
        return cprPrdTaxableFlag;
    }

    /**
     * Sets the value of the cprPrdTaxableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCprPrdTaxableFlag(JAXBElement<Short> value) {
        this.cprPrdTaxableFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cprPrdAllowBackorder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCprPrdAllowBackorder() {
        return cprPrdAllowBackorder;
    }

    /**
     * Sets the value of the cprPrdAllowBackorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCprPrdAllowBackorder(JAXBElement<Short> value) {
        this.cprPrdAllowBackorder = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cprPrdEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdEndDate() {
        return cprPrdEndDate;
    }

    /**
     * Sets the value of the cprPrdEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdEndDate(JAXBElement<String> value) {
        this.cprPrdEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdAtcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdAtcKey() {
        return cprPrdAtcKey;
    }

    /**
     * Sets the value of the cprPrdAtcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdAtcKey(JAXBElement<String> value) {
        this.cprPrdAtcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdQtyReorder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCprPrdQtyReorder() {
        return cprPrdQtyReorder;
    }

    /**
     * Sets the value of the cprPrdQtyReorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCprPrdQtyReorder(JAXBElement<BigDecimal> value) {
        this.cprPrdQtyReorder = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the cprPrdRestockFee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCprPrdRestockFee() {
        return cprPrdRestockFee;
    }

    /**
     * Sets the value of the cprPrdRestockFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCprPrdRestockFee(JAXBElement<BigDecimal> value) {
        this.cprPrdRestockFee = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the cprPrdRestockPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCprPrdRestockPercent() {
        return cprPrdRestockPercent;
    }

    /**
     * Sets the value of the cprPrdRestockPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCprPrdRestockPercent(JAXBElement<BigDecimal> value) {
        this.cprPrdRestockPercent = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the cprPrdRestockPercentCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCprPrdRestockPercentCp() {
        return cprPrdRestockPercentCp;
    }

    /**
     * Sets the value of the cprPrdRestockPercentCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCprPrdRestockPercentCp(JAXBElement<BigDecimal> value) {
        this.cprPrdRestockPercentCp = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the cprPrdMail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCprPrdMail() {
        return cprPrdMail;
    }

    /**
     * Sets the value of the cprPrdMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCprPrdMail(JAXBElement<Short> value) {
        this.cprPrdMail = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cprPrdEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCprPrdEmail() {
        return cprPrdEmail;
    }

    /**
     * Sets the value of the cprPrdEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCprPrdEmail(JAXBElement<Short> value) {
        this.cprPrdEmail = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cprPrdFax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCprPrdFax() {
        return cprPrdFax;
    }

    /**
     * Sets the value of the cprPrdFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCprPrdFax(JAXBElement<Short> value) {
        this.cprPrdFax = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cprPrdSellOnline property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCprPrdSellOnline() {
        return cprPrdSellOnline;
    }

    /**
     * Sets the value of the cprPrdSellOnline property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCprPrdSellOnline(JAXBElement<Short> value) {
        this.cprPrdSellOnline = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cprPrdOnlineAbstract property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdOnlineAbstract() {
        return cprPrdOnlineAbstract;
    }

    /**
     * Sets the value of the cprPrdOnlineAbstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdOnlineAbstract(JAXBElement<String> value) {
        this.cprPrdOnlineAbstract = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdCode() {
        return cprPrdCode;
    }

    /**
     * Sets the value of the cprPrdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdCode(JAXBElement<String> value) {
        this.cprPrdCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdShortDescription() {
        return cprPrdShortDescription;
    }

    /**
     * Sets the value of the cprPrdShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdShortDescription(JAXBElement<String> value) {
        this.cprPrdShortDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdThumbnailDocKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdThumbnailDocKey() {
        return cprPrdThumbnailDocKey;
    }

    /**
     * Sets the value of the cprPrdThumbnailDocKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdThumbnailDocKey(JAXBElement<String> value) {
        this.cprPrdThumbnailDocKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdEntityKey() {
        return cprPrdEntityKey;
    }

    /**
     * Sets the value of the cprPrdEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdEntityKey(JAXBElement<String> value) {
        this.cprPrdEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdWeb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCprPrdWeb() {
        return cprPrdWeb;
    }

    /**
     * Sets the value of the cprPrdWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCprPrdWeb(JAXBElement<Short> value) {
        this.cprPrdWeb = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cprPrdMicrofiche property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCprPrdMicrofiche() {
        return cprPrdMicrofiche;
    }

    /**
     * Sets the value of the cprPrdMicrofiche property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCprPrdMicrofiche(JAXBElement<Short> value) {
        this.cprPrdMicrofiche = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cprPrdPostToWebDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdPostToWebDate() {
        return cprPrdPostToWebDate;
    }

    /**
     * Sets the value of the cprPrdPostToWebDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdPostToWebDate(JAXBElement<String> value) {
        this.cprPrdPostToWebDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdRemoveFromWebDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdRemoveFromWebDate() {
        return cprPrdRemoveFromWebDate;
    }

    /**
     * Sets the value of the cprPrdRemoveFromWebDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdRemoveFromWebDate(JAXBElement<String> value) {
        this.cprPrdRemoveFromWebDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdPtcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdPtcKey() {
        return cprPrdPtcKey;
    }

    /**
     * Sets the value of the cprPrdPtcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdPtcKey(JAXBElement<String> value) {
        this.cprPrdPtcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdFormat() {
        return cprPrdFormat;
    }

    /**
     * Sets the value of the cprPrdFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdFormat(JAXBElement<String> value) {
        this.cprPrdFormat = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdDownloadUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdDownloadUrl() {
        return cprPrdDownloadUrl;
    }

    /**
     * Sets the value of the cprPrdDownloadUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdDownloadUrl(JAXBElement<String> value) {
        this.cprPrdDownloadUrl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdShowAsNewUntil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdShowAsNewUntil() {
        return cprPrdShowAsNewUntil;
    }

    /**
     * Sets the value of the cprPrdShowAsNewUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdShowAsNewUntil(JAXBElement<String> value) {
        this.cprPrdShowAsNewUntil = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdPjtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdPjtKey() {
        return cprPrdPjtKey;
    }

    /**
     * Sets the value of the cprPrdPjtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdPjtKey(JAXBElement<String> value) {
        this.cprPrdPjtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdGlaDamagedGoodsKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdGlaDamagedGoodsKey() {
        return cprPrdGlaDamagedGoodsKey;
    }

    /**
     * Sets the value of the cprPrdGlaDamagedGoodsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdGlaDamagedGoodsKey(JAXBElement<String> value) {
        this.cprPrdGlaDamagedGoodsKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCprPrdOrder() {
        return cprPrdOrder;
    }

    /**
     * Sets the value of the cprPrdOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCprPrdOrder(JAXBElement<Integer> value) {
        this.cprPrdOrder = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cprPrdDownloadAvailableDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCprPrdDownloadAvailableDays() {
        return cprPrdDownloadAvailableDays;
    }

    /**
     * Sets the value of the cprPrdDownloadAvailableDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCprPrdDownloadAvailableDays(JAXBElement<Integer> value) {
        this.cprPrdDownloadAvailableDays = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cprPrdWeightedAverageCost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCprPrdWeightedAverageCost() {
        return cprPrdWeightedAverageCost;
    }

    /**
     * Sets the value of the cprPrdWeightedAverageCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCprPrdWeightedAverageCost(JAXBElement<BigDecimal> value) {
        this.cprPrdWeightedAverageCost = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the cprPrdFeaturedProductFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCprPrdFeaturedProductFlag() {
        return cprPrdFeaturedProductFlag;
    }

    /**
     * Sets the value of the cprPrdFeaturedProductFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCprPrdFeaturedProductFlag(JAXBElement<Short> value) {
        this.cprPrdFeaturedProductFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cprPrdDownloadAvailableCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCprPrdDownloadAvailableCount() {
        return cprPrdDownloadAvailableCount;
    }

    /**
     * Sets the value of the cprPrdDownloadAvailableCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCprPrdDownloadAvailableCount(JAXBElement<Integer> value) {
        this.cprPrdDownloadAvailableCount = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cprPrdColorExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdColorExt() {
        return cprPrdColorExt;
    }

    /**
     * Sets the value of the cprPrdColorExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdColorExt(JAXBElement<String> value) {
        this.cprPrdColorExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdCctKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdCctKey() {
        return cprPrdCctKey;
    }

    /**
     * Sets the value of the cprPrdCctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdCctKey(JAXBElement<String> value) {
        this.cprPrdCctKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdComplexionExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdComplexionExt() {
        return cprPrdComplexionExt;
    }

    /**
     * Sets the value of the cprPrdComplexionExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdComplexionExt(JAXBElement<String> value) {
        this.cprPrdComplexionExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdPtsKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdPtsKey() {
        return cprPrdPtsKey;
    }

    /**
     * Sets the value of the cprPrdPtsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdPtsKey(JAXBElement<String> value) {
        this.cprPrdPtsKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdGenderExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdGenderExt() {
        return cprPrdGenderExt;
    }

    /**
     * Sets the value of the cprPrdGenderExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdGenderExt(JAXBElement<String> value) {
        this.cprPrdGenderExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cprPrdAgeGroupExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCprPrdAgeGroupExt() {
        return cprPrdAgeGroupExt;
    }

    /**
     * Sets the value of the cprPrdAgeGroupExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCprPrdAgeGroupExt(JAXBElement<String> value) {
        this.cprPrdAgeGroupExt = ((JAXBElement<String> ) value);
    }

}
