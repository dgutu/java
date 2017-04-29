
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organization_Organization_Custom_Demographics_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Organization_Custom_Demographics_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="odm_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="odm_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="odm_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="odm_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="odm_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="odm_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="odm_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_xml_01" type="{http://www.avectra.com/2005/}stringLength-1_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_flag_01" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_flag_02" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_flag_03" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_flag_04" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_flag_05" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_flag_06" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_flag_07" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_flag_08" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_flag_09" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_flag_10" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_flag_11" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_flag_12" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_flag_13" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_flag_14" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_flag_15" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_date_01" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_date_02" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_date_03" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_date_04" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_date_05" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_date_06" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_date_07" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_date_08" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_date_09" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_date_10" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_date_11" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_date_12" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_date_13" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_date_14" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_date_15" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_currency_01" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_currency_02" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_currency_03" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_currency_04" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_currency_05" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_currency_06" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_currency_07" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_currency_08" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_currency_09" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_currency_10" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_currency_11" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_currency_12" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_currency_13" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_currency_14" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_currency_15" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_integer_01" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_integer_02" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_integer_03" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_integer_04" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_integer_05" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_integer_06" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_integer_07" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_integer_08" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_integer_09" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_integer_10" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_integer_11" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_integer_12" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_integer_13" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_integer_14" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_integer_15" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_string_01" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_string_02" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_string_03" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_string_04" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_string_05" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_string_06" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_string_07" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_string_08" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_string_09" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_string_10" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_string_11" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_string_12" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_string_13" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_string_14" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_string_15" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_text_01" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_text_02" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_text_03" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_text_04" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_text_05" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_text_06" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_text_07" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_text_08" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_text_09" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_text_10" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_text_11" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_text_12" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_text_13" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_text_14" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="odm_custom_text_15" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="odm_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="odm_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Organization_Custom_Demographics_DataObjectType", propOrder = {
    "odmKey",
    "odmAddUser",
    "odmAddDate",
    "odmChangeUser",
    "odmChangeDate",
    "odmDeleteFlag",
    "odmEntityKey",
    "odmCustomXml01",
    "odmCustomFlag01",
    "odmCustomFlag02",
    "odmCustomFlag03",
    "odmCustomFlag04",
    "odmCustomFlag05",
    "odmCustomFlag06",
    "odmCustomFlag07",
    "odmCustomFlag08",
    "odmCustomFlag09",
    "odmCustomFlag10",
    "odmCustomFlag11",
    "odmCustomFlag12",
    "odmCustomFlag13",
    "odmCustomFlag14",
    "odmCustomFlag15",
    "odmCustomDate01",
    "odmCustomDate02",
    "odmCustomDate03",
    "odmCustomDate04",
    "odmCustomDate05",
    "odmCustomDate06",
    "odmCustomDate07",
    "odmCustomDate08",
    "odmCustomDate09",
    "odmCustomDate10",
    "odmCustomDate11",
    "odmCustomDate12",
    "odmCustomDate13",
    "odmCustomDate14",
    "odmCustomDate15",
    "odmCustomCurrency01",
    "odmCustomCurrency02",
    "odmCustomCurrency03",
    "odmCustomCurrency04",
    "odmCustomCurrency05",
    "odmCustomCurrency06",
    "odmCustomCurrency07",
    "odmCustomCurrency08",
    "odmCustomCurrency09",
    "odmCustomCurrency10",
    "odmCustomCurrency11",
    "odmCustomCurrency12",
    "odmCustomCurrency13",
    "odmCustomCurrency14",
    "odmCustomCurrency15",
    "odmCustomInteger01",
    "odmCustomInteger02",
    "odmCustomInteger03",
    "odmCustomInteger04",
    "odmCustomInteger05",
    "odmCustomInteger06",
    "odmCustomInteger07",
    "odmCustomInteger08",
    "odmCustomInteger09",
    "odmCustomInteger10",
    "odmCustomInteger11",
    "odmCustomInteger12",
    "odmCustomInteger13",
    "odmCustomInteger14",
    "odmCustomInteger15",
    "odmCustomString01",
    "odmCustomString02",
    "odmCustomString03",
    "odmCustomString04",
    "odmCustomString05",
    "odmCustomString06",
    "odmCustomString07",
    "odmCustomString08",
    "odmCustomString09",
    "odmCustomString10",
    "odmCustomString11",
    "odmCustomString12",
    "odmCustomString13",
    "odmCustomString14",
    "odmCustomString15",
    "odmCustomText01",
    "odmCustomText02",
    "odmCustomText03",
    "odmCustomText04",
    "odmCustomText05",
    "odmCustomText06",
    "odmCustomText07",
    "odmCustomText08",
    "odmCustomText09",
    "odmCustomText10",
    "odmCustomText11",
    "odmCustomText12",
    "odmCustomText13",
    "odmCustomText14",
    "odmCustomText15",
    "odmKeyExt",
    "odmCstKey"
})
public class OrganizationOrganizationCustomDemographicsDataObjectType {

    @XmlElementRef(name = "odm_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmKey;
    @XmlElementRef(name = "odm_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmAddUser;
    @XmlElementRef(name = "odm_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmAddDate;
    @XmlElementRef(name = "odm_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmChangeUser;
    @XmlElementRef(name = "odm_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmChangeDate;
    @XmlElementRef(name = "odm_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> odmDeleteFlag;
    @XmlElementRef(name = "odm_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmEntityKey;
    @XmlElementRef(name = "odm_custom_xml_01", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomXml01;
    @XmlElementRef(name = "odm_custom_flag_01", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> odmCustomFlag01;
    @XmlElementRef(name = "odm_custom_flag_02", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> odmCustomFlag02;
    @XmlElementRef(name = "odm_custom_flag_03", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> odmCustomFlag03;
    @XmlElementRef(name = "odm_custom_flag_04", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> odmCustomFlag04;
    @XmlElementRef(name = "odm_custom_flag_05", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> odmCustomFlag05;
    @XmlElementRef(name = "odm_custom_flag_06", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> odmCustomFlag06;
    @XmlElementRef(name = "odm_custom_flag_07", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> odmCustomFlag07;
    @XmlElementRef(name = "odm_custom_flag_08", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> odmCustomFlag08;
    @XmlElementRef(name = "odm_custom_flag_09", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> odmCustomFlag09;
    @XmlElementRef(name = "odm_custom_flag_10", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> odmCustomFlag10;
    @XmlElementRef(name = "odm_custom_flag_11", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> odmCustomFlag11;
    @XmlElementRef(name = "odm_custom_flag_12", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> odmCustomFlag12;
    @XmlElementRef(name = "odm_custom_flag_13", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> odmCustomFlag13;
    @XmlElementRef(name = "odm_custom_flag_14", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> odmCustomFlag14;
    @XmlElementRef(name = "odm_custom_flag_15", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> odmCustomFlag15;
    @XmlElementRef(name = "odm_custom_date_01", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomDate01;
    @XmlElementRef(name = "odm_custom_date_02", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomDate02;
    @XmlElementRef(name = "odm_custom_date_03", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomDate03;
    @XmlElementRef(name = "odm_custom_date_04", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomDate04;
    @XmlElementRef(name = "odm_custom_date_05", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomDate05;
    @XmlElementRef(name = "odm_custom_date_06", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomDate06;
    @XmlElementRef(name = "odm_custom_date_07", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomDate07;
    @XmlElementRef(name = "odm_custom_date_08", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomDate08;
    @XmlElementRef(name = "odm_custom_date_09", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomDate09;
    @XmlElementRef(name = "odm_custom_date_10", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomDate10;
    @XmlElementRef(name = "odm_custom_date_11", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomDate11;
    @XmlElementRef(name = "odm_custom_date_12", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomDate12;
    @XmlElementRef(name = "odm_custom_date_13", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomDate13;
    @XmlElementRef(name = "odm_custom_date_14", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomDate14;
    @XmlElementRef(name = "odm_custom_date_15", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomDate15;
    @XmlElementRef(name = "odm_custom_currency_01", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> odmCustomCurrency01;
    @XmlElementRef(name = "odm_custom_currency_02", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> odmCustomCurrency02;
    @XmlElementRef(name = "odm_custom_currency_03", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> odmCustomCurrency03;
    @XmlElementRef(name = "odm_custom_currency_04", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> odmCustomCurrency04;
    @XmlElementRef(name = "odm_custom_currency_05", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> odmCustomCurrency05;
    @XmlElementRef(name = "odm_custom_currency_06", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> odmCustomCurrency06;
    @XmlElementRef(name = "odm_custom_currency_07", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> odmCustomCurrency07;
    @XmlElementRef(name = "odm_custom_currency_08", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> odmCustomCurrency08;
    @XmlElementRef(name = "odm_custom_currency_09", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> odmCustomCurrency09;
    @XmlElementRef(name = "odm_custom_currency_10", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> odmCustomCurrency10;
    @XmlElementRef(name = "odm_custom_currency_11", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> odmCustomCurrency11;
    @XmlElementRef(name = "odm_custom_currency_12", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> odmCustomCurrency12;
    @XmlElementRef(name = "odm_custom_currency_13", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> odmCustomCurrency13;
    @XmlElementRef(name = "odm_custom_currency_14", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> odmCustomCurrency14;
    @XmlElementRef(name = "odm_custom_currency_15", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> odmCustomCurrency15;
    @XmlElementRef(name = "odm_custom_integer_01", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> odmCustomInteger01;
    @XmlElementRef(name = "odm_custom_integer_02", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> odmCustomInteger02;
    @XmlElementRef(name = "odm_custom_integer_03", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> odmCustomInteger03;
    @XmlElementRef(name = "odm_custom_integer_04", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> odmCustomInteger04;
    @XmlElementRef(name = "odm_custom_integer_05", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> odmCustomInteger05;
    @XmlElementRef(name = "odm_custom_integer_06", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> odmCustomInteger06;
    @XmlElementRef(name = "odm_custom_integer_07", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> odmCustomInteger07;
    @XmlElementRef(name = "odm_custom_integer_08", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> odmCustomInteger08;
    @XmlElementRef(name = "odm_custom_integer_09", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> odmCustomInteger09;
    @XmlElementRef(name = "odm_custom_integer_10", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> odmCustomInteger10;
    @XmlElementRef(name = "odm_custom_integer_11", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> odmCustomInteger11;
    @XmlElementRef(name = "odm_custom_integer_12", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> odmCustomInteger12;
    @XmlElementRef(name = "odm_custom_integer_13", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> odmCustomInteger13;
    @XmlElementRef(name = "odm_custom_integer_14", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> odmCustomInteger14;
    @XmlElementRef(name = "odm_custom_integer_15", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> odmCustomInteger15;
    @XmlElementRef(name = "odm_custom_string_01", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomString01;
    @XmlElementRef(name = "odm_custom_string_02", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomString02;
    @XmlElementRef(name = "odm_custom_string_03", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomString03;
    @XmlElementRef(name = "odm_custom_string_04", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomString04;
    @XmlElementRef(name = "odm_custom_string_05", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomString05;
    @XmlElementRef(name = "odm_custom_string_06", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomString06;
    @XmlElementRef(name = "odm_custom_string_07", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomString07;
    @XmlElementRef(name = "odm_custom_string_08", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomString08;
    @XmlElementRef(name = "odm_custom_string_09", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomString09;
    @XmlElementRef(name = "odm_custom_string_10", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomString10;
    @XmlElementRef(name = "odm_custom_string_11", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomString11;
    @XmlElementRef(name = "odm_custom_string_12", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomString12;
    @XmlElementRef(name = "odm_custom_string_13", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomString13;
    @XmlElementRef(name = "odm_custom_string_14", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomString14;
    @XmlElementRef(name = "odm_custom_string_15", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomString15;
    @XmlElementRef(name = "odm_custom_text_01", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomText01;
    @XmlElementRef(name = "odm_custom_text_02", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomText02;
    @XmlElementRef(name = "odm_custom_text_03", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomText03;
    @XmlElementRef(name = "odm_custom_text_04", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomText04;
    @XmlElementRef(name = "odm_custom_text_05", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomText05;
    @XmlElementRef(name = "odm_custom_text_06", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomText06;
    @XmlElementRef(name = "odm_custom_text_07", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomText07;
    @XmlElementRef(name = "odm_custom_text_08", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomText08;
    @XmlElementRef(name = "odm_custom_text_09", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomText09;
    @XmlElementRef(name = "odm_custom_text_10", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomText10;
    @XmlElementRef(name = "odm_custom_text_11", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomText11;
    @XmlElementRef(name = "odm_custom_text_12", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomText12;
    @XmlElementRef(name = "odm_custom_text_13", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomText13;
    @XmlElementRef(name = "odm_custom_text_14", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomText14;
    @XmlElementRef(name = "odm_custom_text_15", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCustomText15;
    @XmlElementRef(name = "odm_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmKeyExt;
    @XmlElementRef(name = "odm_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odmCstKey;

    /**
     * Gets the value of the odmKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmKey() {
        return odmKey;
    }

    /**
     * Sets the value of the odmKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmKey(JAXBElement<String> value) {
        this.odmKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmAddUser() {
        return odmAddUser;
    }

    /**
     * Sets the value of the odmAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmAddUser(JAXBElement<String> value) {
        this.odmAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmAddDate() {
        return odmAddDate;
    }

    /**
     * Sets the value of the odmAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmAddDate(JAXBElement<String> value) {
        this.odmAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmChangeUser() {
        return odmChangeUser;
    }

    /**
     * Sets the value of the odmChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmChangeUser(JAXBElement<String> value) {
        this.odmChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmChangeDate() {
        return odmChangeDate;
    }

    /**
     * Sets the value of the odmChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmChangeDate(JAXBElement<String> value) {
        this.odmChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOdmDeleteFlag() {
        return odmDeleteFlag;
    }

    /**
     * Sets the value of the odmDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOdmDeleteFlag(JAXBElement<Short> value) {
        this.odmDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the odmEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmEntityKey() {
        return odmEntityKey;
    }

    /**
     * Sets the value of the odmEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmEntityKey(JAXBElement<String> value) {
        this.odmEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomXml01 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomXml01() {
        return odmCustomXml01;
    }

    /**
     * Sets the value of the odmCustomXml01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomXml01(JAXBElement<String> value) {
        this.odmCustomXml01 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomFlag01 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOdmCustomFlag01() {
        return odmCustomFlag01;
    }

    /**
     * Sets the value of the odmCustomFlag01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOdmCustomFlag01(JAXBElement<Short> value) {
        this.odmCustomFlag01 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the odmCustomFlag02 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOdmCustomFlag02() {
        return odmCustomFlag02;
    }

    /**
     * Sets the value of the odmCustomFlag02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOdmCustomFlag02(JAXBElement<Short> value) {
        this.odmCustomFlag02 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the odmCustomFlag03 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOdmCustomFlag03() {
        return odmCustomFlag03;
    }

    /**
     * Sets the value of the odmCustomFlag03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOdmCustomFlag03(JAXBElement<Short> value) {
        this.odmCustomFlag03 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the odmCustomFlag04 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOdmCustomFlag04() {
        return odmCustomFlag04;
    }

    /**
     * Sets the value of the odmCustomFlag04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOdmCustomFlag04(JAXBElement<Short> value) {
        this.odmCustomFlag04 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the odmCustomFlag05 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOdmCustomFlag05() {
        return odmCustomFlag05;
    }

    /**
     * Sets the value of the odmCustomFlag05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOdmCustomFlag05(JAXBElement<Short> value) {
        this.odmCustomFlag05 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the odmCustomFlag06 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOdmCustomFlag06() {
        return odmCustomFlag06;
    }

    /**
     * Sets the value of the odmCustomFlag06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOdmCustomFlag06(JAXBElement<Short> value) {
        this.odmCustomFlag06 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the odmCustomFlag07 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOdmCustomFlag07() {
        return odmCustomFlag07;
    }

    /**
     * Sets the value of the odmCustomFlag07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOdmCustomFlag07(JAXBElement<Short> value) {
        this.odmCustomFlag07 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the odmCustomFlag08 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOdmCustomFlag08() {
        return odmCustomFlag08;
    }

    /**
     * Sets the value of the odmCustomFlag08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOdmCustomFlag08(JAXBElement<Short> value) {
        this.odmCustomFlag08 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the odmCustomFlag09 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOdmCustomFlag09() {
        return odmCustomFlag09;
    }

    /**
     * Sets the value of the odmCustomFlag09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOdmCustomFlag09(JAXBElement<Short> value) {
        this.odmCustomFlag09 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the odmCustomFlag10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOdmCustomFlag10() {
        return odmCustomFlag10;
    }

    /**
     * Sets the value of the odmCustomFlag10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOdmCustomFlag10(JAXBElement<Short> value) {
        this.odmCustomFlag10 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the odmCustomFlag11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOdmCustomFlag11() {
        return odmCustomFlag11;
    }

    /**
     * Sets the value of the odmCustomFlag11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOdmCustomFlag11(JAXBElement<Short> value) {
        this.odmCustomFlag11 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the odmCustomFlag12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOdmCustomFlag12() {
        return odmCustomFlag12;
    }

    /**
     * Sets the value of the odmCustomFlag12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOdmCustomFlag12(JAXBElement<Short> value) {
        this.odmCustomFlag12 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the odmCustomFlag13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOdmCustomFlag13() {
        return odmCustomFlag13;
    }

    /**
     * Sets the value of the odmCustomFlag13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOdmCustomFlag13(JAXBElement<Short> value) {
        this.odmCustomFlag13 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the odmCustomFlag14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOdmCustomFlag14() {
        return odmCustomFlag14;
    }

    /**
     * Sets the value of the odmCustomFlag14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOdmCustomFlag14(JAXBElement<Short> value) {
        this.odmCustomFlag14 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the odmCustomFlag15 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOdmCustomFlag15() {
        return odmCustomFlag15;
    }

    /**
     * Sets the value of the odmCustomFlag15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOdmCustomFlag15(JAXBElement<Short> value) {
        this.odmCustomFlag15 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the odmCustomDate01 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomDate01() {
        return odmCustomDate01;
    }

    /**
     * Sets the value of the odmCustomDate01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomDate01(JAXBElement<String> value) {
        this.odmCustomDate01 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomDate02 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomDate02() {
        return odmCustomDate02;
    }

    /**
     * Sets the value of the odmCustomDate02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomDate02(JAXBElement<String> value) {
        this.odmCustomDate02 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomDate03 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomDate03() {
        return odmCustomDate03;
    }

    /**
     * Sets the value of the odmCustomDate03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomDate03(JAXBElement<String> value) {
        this.odmCustomDate03 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomDate04 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomDate04() {
        return odmCustomDate04;
    }

    /**
     * Sets the value of the odmCustomDate04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomDate04(JAXBElement<String> value) {
        this.odmCustomDate04 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomDate05 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomDate05() {
        return odmCustomDate05;
    }

    /**
     * Sets the value of the odmCustomDate05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomDate05(JAXBElement<String> value) {
        this.odmCustomDate05 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomDate06 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomDate06() {
        return odmCustomDate06;
    }

    /**
     * Sets the value of the odmCustomDate06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomDate06(JAXBElement<String> value) {
        this.odmCustomDate06 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomDate07 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomDate07() {
        return odmCustomDate07;
    }

    /**
     * Sets the value of the odmCustomDate07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomDate07(JAXBElement<String> value) {
        this.odmCustomDate07 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomDate08 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomDate08() {
        return odmCustomDate08;
    }

    /**
     * Sets the value of the odmCustomDate08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomDate08(JAXBElement<String> value) {
        this.odmCustomDate08 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomDate09 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomDate09() {
        return odmCustomDate09;
    }

    /**
     * Sets the value of the odmCustomDate09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomDate09(JAXBElement<String> value) {
        this.odmCustomDate09 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomDate10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomDate10() {
        return odmCustomDate10;
    }

    /**
     * Sets the value of the odmCustomDate10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomDate10(JAXBElement<String> value) {
        this.odmCustomDate10 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomDate11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomDate11() {
        return odmCustomDate11;
    }

    /**
     * Sets the value of the odmCustomDate11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomDate11(JAXBElement<String> value) {
        this.odmCustomDate11 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomDate12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomDate12() {
        return odmCustomDate12;
    }

    /**
     * Sets the value of the odmCustomDate12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomDate12(JAXBElement<String> value) {
        this.odmCustomDate12 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomDate13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomDate13() {
        return odmCustomDate13;
    }

    /**
     * Sets the value of the odmCustomDate13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomDate13(JAXBElement<String> value) {
        this.odmCustomDate13 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomDate14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomDate14() {
        return odmCustomDate14;
    }

    /**
     * Sets the value of the odmCustomDate14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomDate14(JAXBElement<String> value) {
        this.odmCustomDate14 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomDate15 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomDate15() {
        return odmCustomDate15;
    }

    /**
     * Sets the value of the odmCustomDate15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomDate15(JAXBElement<String> value) {
        this.odmCustomDate15 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomCurrency01 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOdmCustomCurrency01() {
        return odmCustomCurrency01;
    }

    /**
     * Sets the value of the odmCustomCurrency01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOdmCustomCurrency01(JAXBElement<BigDecimal> value) {
        this.odmCustomCurrency01 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the odmCustomCurrency02 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOdmCustomCurrency02() {
        return odmCustomCurrency02;
    }

    /**
     * Sets the value of the odmCustomCurrency02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOdmCustomCurrency02(JAXBElement<BigDecimal> value) {
        this.odmCustomCurrency02 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the odmCustomCurrency03 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOdmCustomCurrency03() {
        return odmCustomCurrency03;
    }

    /**
     * Sets the value of the odmCustomCurrency03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOdmCustomCurrency03(JAXBElement<BigDecimal> value) {
        this.odmCustomCurrency03 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the odmCustomCurrency04 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOdmCustomCurrency04() {
        return odmCustomCurrency04;
    }

    /**
     * Sets the value of the odmCustomCurrency04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOdmCustomCurrency04(JAXBElement<BigDecimal> value) {
        this.odmCustomCurrency04 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the odmCustomCurrency05 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOdmCustomCurrency05() {
        return odmCustomCurrency05;
    }

    /**
     * Sets the value of the odmCustomCurrency05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOdmCustomCurrency05(JAXBElement<BigDecimal> value) {
        this.odmCustomCurrency05 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the odmCustomCurrency06 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOdmCustomCurrency06() {
        return odmCustomCurrency06;
    }

    /**
     * Sets the value of the odmCustomCurrency06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOdmCustomCurrency06(JAXBElement<BigDecimal> value) {
        this.odmCustomCurrency06 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the odmCustomCurrency07 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOdmCustomCurrency07() {
        return odmCustomCurrency07;
    }

    /**
     * Sets the value of the odmCustomCurrency07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOdmCustomCurrency07(JAXBElement<BigDecimal> value) {
        this.odmCustomCurrency07 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the odmCustomCurrency08 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOdmCustomCurrency08() {
        return odmCustomCurrency08;
    }

    /**
     * Sets the value of the odmCustomCurrency08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOdmCustomCurrency08(JAXBElement<BigDecimal> value) {
        this.odmCustomCurrency08 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the odmCustomCurrency09 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOdmCustomCurrency09() {
        return odmCustomCurrency09;
    }

    /**
     * Sets the value of the odmCustomCurrency09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOdmCustomCurrency09(JAXBElement<BigDecimal> value) {
        this.odmCustomCurrency09 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the odmCustomCurrency10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOdmCustomCurrency10() {
        return odmCustomCurrency10;
    }

    /**
     * Sets the value of the odmCustomCurrency10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOdmCustomCurrency10(JAXBElement<BigDecimal> value) {
        this.odmCustomCurrency10 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the odmCustomCurrency11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOdmCustomCurrency11() {
        return odmCustomCurrency11;
    }

    /**
     * Sets the value of the odmCustomCurrency11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOdmCustomCurrency11(JAXBElement<BigDecimal> value) {
        this.odmCustomCurrency11 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the odmCustomCurrency12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOdmCustomCurrency12() {
        return odmCustomCurrency12;
    }

    /**
     * Sets the value of the odmCustomCurrency12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOdmCustomCurrency12(JAXBElement<BigDecimal> value) {
        this.odmCustomCurrency12 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the odmCustomCurrency13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOdmCustomCurrency13() {
        return odmCustomCurrency13;
    }

    /**
     * Sets the value of the odmCustomCurrency13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOdmCustomCurrency13(JAXBElement<BigDecimal> value) {
        this.odmCustomCurrency13 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the odmCustomCurrency14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOdmCustomCurrency14() {
        return odmCustomCurrency14;
    }

    /**
     * Sets the value of the odmCustomCurrency14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOdmCustomCurrency14(JAXBElement<BigDecimal> value) {
        this.odmCustomCurrency14 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the odmCustomCurrency15 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOdmCustomCurrency15() {
        return odmCustomCurrency15;
    }

    /**
     * Sets the value of the odmCustomCurrency15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOdmCustomCurrency15(JAXBElement<BigDecimal> value) {
        this.odmCustomCurrency15 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the odmCustomInteger01 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOdmCustomInteger01() {
        return odmCustomInteger01;
    }

    /**
     * Sets the value of the odmCustomInteger01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOdmCustomInteger01(JAXBElement<Integer> value) {
        this.odmCustomInteger01 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the odmCustomInteger02 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOdmCustomInteger02() {
        return odmCustomInteger02;
    }

    /**
     * Sets the value of the odmCustomInteger02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOdmCustomInteger02(JAXBElement<Integer> value) {
        this.odmCustomInteger02 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the odmCustomInteger03 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOdmCustomInteger03() {
        return odmCustomInteger03;
    }

    /**
     * Sets the value of the odmCustomInteger03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOdmCustomInteger03(JAXBElement<Integer> value) {
        this.odmCustomInteger03 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the odmCustomInteger04 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOdmCustomInteger04() {
        return odmCustomInteger04;
    }

    /**
     * Sets the value of the odmCustomInteger04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOdmCustomInteger04(JAXBElement<Integer> value) {
        this.odmCustomInteger04 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the odmCustomInteger05 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOdmCustomInteger05() {
        return odmCustomInteger05;
    }

    /**
     * Sets the value of the odmCustomInteger05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOdmCustomInteger05(JAXBElement<Integer> value) {
        this.odmCustomInteger05 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the odmCustomInteger06 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOdmCustomInteger06() {
        return odmCustomInteger06;
    }

    /**
     * Sets the value of the odmCustomInteger06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOdmCustomInteger06(JAXBElement<Integer> value) {
        this.odmCustomInteger06 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the odmCustomInteger07 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOdmCustomInteger07() {
        return odmCustomInteger07;
    }

    /**
     * Sets the value of the odmCustomInteger07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOdmCustomInteger07(JAXBElement<Integer> value) {
        this.odmCustomInteger07 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the odmCustomInteger08 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOdmCustomInteger08() {
        return odmCustomInteger08;
    }

    /**
     * Sets the value of the odmCustomInteger08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOdmCustomInteger08(JAXBElement<Integer> value) {
        this.odmCustomInteger08 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the odmCustomInteger09 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOdmCustomInteger09() {
        return odmCustomInteger09;
    }

    /**
     * Sets the value of the odmCustomInteger09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOdmCustomInteger09(JAXBElement<Integer> value) {
        this.odmCustomInteger09 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the odmCustomInteger10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOdmCustomInteger10() {
        return odmCustomInteger10;
    }

    /**
     * Sets the value of the odmCustomInteger10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOdmCustomInteger10(JAXBElement<Integer> value) {
        this.odmCustomInteger10 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the odmCustomInteger11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOdmCustomInteger11() {
        return odmCustomInteger11;
    }

    /**
     * Sets the value of the odmCustomInteger11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOdmCustomInteger11(JAXBElement<Integer> value) {
        this.odmCustomInteger11 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the odmCustomInteger12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOdmCustomInteger12() {
        return odmCustomInteger12;
    }

    /**
     * Sets the value of the odmCustomInteger12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOdmCustomInteger12(JAXBElement<Integer> value) {
        this.odmCustomInteger12 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the odmCustomInteger13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOdmCustomInteger13() {
        return odmCustomInteger13;
    }

    /**
     * Sets the value of the odmCustomInteger13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOdmCustomInteger13(JAXBElement<Integer> value) {
        this.odmCustomInteger13 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the odmCustomInteger14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOdmCustomInteger14() {
        return odmCustomInteger14;
    }

    /**
     * Sets the value of the odmCustomInteger14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOdmCustomInteger14(JAXBElement<Integer> value) {
        this.odmCustomInteger14 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the odmCustomInteger15 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOdmCustomInteger15() {
        return odmCustomInteger15;
    }

    /**
     * Sets the value of the odmCustomInteger15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOdmCustomInteger15(JAXBElement<Integer> value) {
        this.odmCustomInteger15 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the odmCustomString01 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomString01() {
        return odmCustomString01;
    }

    /**
     * Sets the value of the odmCustomString01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomString01(JAXBElement<String> value) {
        this.odmCustomString01 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomString02 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomString02() {
        return odmCustomString02;
    }

    /**
     * Sets the value of the odmCustomString02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomString02(JAXBElement<String> value) {
        this.odmCustomString02 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomString03 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomString03() {
        return odmCustomString03;
    }

    /**
     * Sets the value of the odmCustomString03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomString03(JAXBElement<String> value) {
        this.odmCustomString03 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomString04 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomString04() {
        return odmCustomString04;
    }

    /**
     * Sets the value of the odmCustomString04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomString04(JAXBElement<String> value) {
        this.odmCustomString04 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomString05 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomString05() {
        return odmCustomString05;
    }

    /**
     * Sets the value of the odmCustomString05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomString05(JAXBElement<String> value) {
        this.odmCustomString05 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomString06 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomString06() {
        return odmCustomString06;
    }

    /**
     * Sets the value of the odmCustomString06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomString06(JAXBElement<String> value) {
        this.odmCustomString06 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomString07 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomString07() {
        return odmCustomString07;
    }

    /**
     * Sets the value of the odmCustomString07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomString07(JAXBElement<String> value) {
        this.odmCustomString07 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomString08 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomString08() {
        return odmCustomString08;
    }

    /**
     * Sets the value of the odmCustomString08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomString08(JAXBElement<String> value) {
        this.odmCustomString08 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomString09 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomString09() {
        return odmCustomString09;
    }

    /**
     * Sets the value of the odmCustomString09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomString09(JAXBElement<String> value) {
        this.odmCustomString09 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomString10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomString10() {
        return odmCustomString10;
    }

    /**
     * Sets the value of the odmCustomString10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomString10(JAXBElement<String> value) {
        this.odmCustomString10 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomString11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomString11() {
        return odmCustomString11;
    }

    /**
     * Sets the value of the odmCustomString11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomString11(JAXBElement<String> value) {
        this.odmCustomString11 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomString12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomString12() {
        return odmCustomString12;
    }

    /**
     * Sets the value of the odmCustomString12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomString12(JAXBElement<String> value) {
        this.odmCustomString12 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomString13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomString13() {
        return odmCustomString13;
    }

    /**
     * Sets the value of the odmCustomString13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomString13(JAXBElement<String> value) {
        this.odmCustomString13 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomString14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomString14() {
        return odmCustomString14;
    }

    /**
     * Sets the value of the odmCustomString14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomString14(JAXBElement<String> value) {
        this.odmCustomString14 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomString15 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomString15() {
        return odmCustomString15;
    }

    /**
     * Sets the value of the odmCustomString15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomString15(JAXBElement<String> value) {
        this.odmCustomString15 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomText01 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomText01() {
        return odmCustomText01;
    }

    /**
     * Sets the value of the odmCustomText01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomText01(JAXBElement<String> value) {
        this.odmCustomText01 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomText02 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomText02() {
        return odmCustomText02;
    }

    /**
     * Sets the value of the odmCustomText02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomText02(JAXBElement<String> value) {
        this.odmCustomText02 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomText03 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomText03() {
        return odmCustomText03;
    }

    /**
     * Sets the value of the odmCustomText03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomText03(JAXBElement<String> value) {
        this.odmCustomText03 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomText04 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomText04() {
        return odmCustomText04;
    }

    /**
     * Sets the value of the odmCustomText04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomText04(JAXBElement<String> value) {
        this.odmCustomText04 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomText05 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomText05() {
        return odmCustomText05;
    }

    /**
     * Sets the value of the odmCustomText05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomText05(JAXBElement<String> value) {
        this.odmCustomText05 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomText06 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomText06() {
        return odmCustomText06;
    }

    /**
     * Sets the value of the odmCustomText06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomText06(JAXBElement<String> value) {
        this.odmCustomText06 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomText07 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomText07() {
        return odmCustomText07;
    }

    /**
     * Sets the value of the odmCustomText07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomText07(JAXBElement<String> value) {
        this.odmCustomText07 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomText08 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomText08() {
        return odmCustomText08;
    }

    /**
     * Sets the value of the odmCustomText08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomText08(JAXBElement<String> value) {
        this.odmCustomText08 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomText09 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomText09() {
        return odmCustomText09;
    }

    /**
     * Sets the value of the odmCustomText09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomText09(JAXBElement<String> value) {
        this.odmCustomText09 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomText10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomText10() {
        return odmCustomText10;
    }

    /**
     * Sets the value of the odmCustomText10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomText10(JAXBElement<String> value) {
        this.odmCustomText10 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomText11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomText11() {
        return odmCustomText11;
    }

    /**
     * Sets the value of the odmCustomText11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomText11(JAXBElement<String> value) {
        this.odmCustomText11 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomText12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomText12() {
        return odmCustomText12;
    }

    /**
     * Sets the value of the odmCustomText12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomText12(JAXBElement<String> value) {
        this.odmCustomText12 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomText13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomText13() {
        return odmCustomText13;
    }

    /**
     * Sets the value of the odmCustomText13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomText13(JAXBElement<String> value) {
        this.odmCustomText13 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomText14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomText14() {
        return odmCustomText14;
    }

    /**
     * Sets the value of the odmCustomText14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomText14(JAXBElement<String> value) {
        this.odmCustomText14 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCustomText15 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCustomText15() {
        return odmCustomText15;
    }

    /**
     * Sets the value of the odmCustomText15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCustomText15(JAXBElement<String> value) {
        this.odmCustomText15 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmKeyExt() {
        return odmKeyExt;
    }

    /**
     * Sets the value of the odmKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmKeyExt(JAXBElement<String> value) {
        this.odmKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odmCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdmCstKey() {
        return odmCstKey;
    }

    /**
     * Sets the value of the odmCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdmCstKey(JAXBElement<String> value) {
        this.odmCstKey = ((JAXBElement<String> ) value);
    }

}
