
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrant_Registrant_Custom_Demographics_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrant_Registrant_Custom_Demographics_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rdm_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rdm_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="rdm_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rdm_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="rdm_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rdm_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="rdm_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_xml_01" type="{http://www.avectra.com/2005/}stringLength-1_Type" minOccurs="0"/>
 *         &lt;element name="rdm_reg_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_flag_01" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_flag_02" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_flag_03" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_flag_04" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_flag_05" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_flag_06" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_flag_07" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_flag_08" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_flag_09" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_flag_10" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_flag_11" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_flag_12" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_flag_13" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_flag_14" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_flag_15" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_date_01" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_date_02" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_date_03" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_date_04" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_date_05" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_date_06" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_date_07" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_date_08" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_date_09" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_date_10" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_date_11" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_date_12" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_date_13" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_date_14" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_date_15" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_currency_01" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_currency_02" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_currency_03" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_currency_04" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_currency_05" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_currency_06" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_currency_07" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_currency_08" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_currency_09" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_currency_10" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_currency_11" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_currency_12" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_currency_13" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_currency_14" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_currency_15" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_integer_01" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_integer_02" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_integer_03" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_integer_04" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_integer_05" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_integer_06" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_integer_07" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_integer_08" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_integer_09" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_integer_10" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_integer_11" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_integer_12" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_integer_13" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_integer_14" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_integer_15" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_string_01" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_string_02" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_string_03" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_string_04" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_string_05" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_string_06" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_string_07" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_string_08" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_string_09" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_string_10" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_string_11" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_string_12" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_string_13" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_string_14" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_string_15" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_text_01" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_text_02" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_text_03" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_text_04" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_text_05" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_text_06" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_text_07" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_text_08" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_text_09" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_text_10" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_text_11" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_text_12" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_text_13" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_text_14" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="rdm_custom_text_15" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="rdm_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrant_Registrant_Custom_Demographics_DataObjectType", propOrder = {
    "rdmKey",
    "rdmAddUser",
    "rdmAddDate",
    "rdmChangeUser",
    "rdmChangeDate",
    "rdmDeleteFlag",
    "rdmEntityKey",
    "rdmCustomXml01",
    "rdmRegKey",
    "rdmCustomFlag01",
    "rdmCustomFlag02",
    "rdmCustomFlag03",
    "rdmCustomFlag04",
    "rdmCustomFlag05",
    "rdmCustomFlag06",
    "rdmCustomFlag07",
    "rdmCustomFlag08",
    "rdmCustomFlag09",
    "rdmCustomFlag10",
    "rdmCustomFlag11",
    "rdmCustomFlag12",
    "rdmCustomFlag13",
    "rdmCustomFlag14",
    "rdmCustomFlag15",
    "rdmCustomDate01",
    "rdmCustomDate02",
    "rdmCustomDate03",
    "rdmCustomDate04",
    "rdmCustomDate05",
    "rdmCustomDate06",
    "rdmCustomDate07",
    "rdmCustomDate08",
    "rdmCustomDate09",
    "rdmCustomDate10",
    "rdmCustomDate11",
    "rdmCustomDate12",
    "rdmCustomDate13",
    "rdmCustomDate14",
    "rdmCustomDate15",
    "rdmCustomCurrency01",
    "rdmCustomCurrency02",
    "rdmCustomCurrency03",
    "rdmCustomCurrency04",
    "rdmCustomCurrency05",
    "rdmCustomCurrency06",
    "rdmCustomCurrency07",
    "rdmCustomCurrency08",
    "rdmCustomCurrency09",
    "rdmCustomCurrency10",
    "rdmCustomCurrency11",
    "rdmCustomCurrency12",
    "rdmCustomCurrency13",
    "rdmCustomCurrency14",
    "rdmCustomCurrency15",
    "rdmCustomInteger01",
    "rdmCustomInteger02",
    "rdmCustomInteger03",
    "rdmCustomInteger04",
    "rdmCustomInteger05",
    "rdmCustomInteger06",
    "rdmCustomInteger07",
    "rdmCustomInteger08",
    "rdmCustomInteger09",
    "rdmCustomInteger10",
    "rdmCustomInteger11",
    "rdmCustomInteger12",
    "rdmCustomInteger13",
    "rdmCustomInteger14",
    "rdmCustomInteger15",
    "rdmCustomString01",
    "rdmCustomString02",
    "rdmCustomString03",
    "rdmCustomString04",
    "rdmCustomString05",
    "rdmCustomString06",
    "rdmCustomString07",
    "rdmCustomString08",
    "rdmCustomString09",
    "rdmCustomString10",
    "rdmCustomString11",
    "rdmCustomString12",
    "rdmCustomString13",
    "rdmCustomString14",
    "rdmCustomString15",
    "rdmCustomText01",
    "rdmCustomText02",
    "rdmCustomText03",
    "rdmCustomText04",
    "rdmCustomText05",
    "rdmCustomText06",
    "rdmCustomText07",
    "rdmCustomText08",
    "rdmCustomText09",
    "rdmCustomText10",
    "rdmCustomText11",
    "rdmCustomText12",
    "rdmCustomText13",
    "rdmCustomText14",
    "rdmCustomText15",
    "rdmKeyExt"
})
public class EventsRegistrantRegistrantCustomDemographicsDataObjectType {

    @XmlElementRef(name = "rdm_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmKey;
    @XmlElementRef(name = "rdm_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmAddUser;
    @XmlElementRef(name = "rdm_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmAddDate;
    @XmlElementRef(name = "rdm_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmChangeUser;
    @XmlElementRef(name = "rdm_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmChangeDate;
    @XmlElementRef(name = "rdm_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rdmDeleteFlag;
    @XmlElementRef(name = "rdm_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmEntityKey;
    @XmlElementRef(name = "rdm_custom_xml_01", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomXml01;
    @XmlElementRef(name = "rdm_reg_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmRegKey;
    @XmlElementRef(name = "rdm_custom_flag_01", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rdmCustomFlag01;
    @XmlElementRef(name = "rdm_custom_flag_02", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rdmCustomFlag02;
    @XmlElementRef(name = "rdm_custom_flag_03", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rdmCustomFlag03;
    @XmlElementRef(name = "rdm_custom_flag_04", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rdmCustomFlag04;
    @XmlElementRef(name = "rdm_custom_flag_05", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rdmCustomFlag05;
    @XmlElementRef(name = "rdm_custom_flag_06", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rdmCustomFlag06;
    @XmlElementRef(name = "rdm_custom_flag_07", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rdmCustomFlag07;
    @XmlElementRef(name = "rdm_custom_flag_08", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rdmCustomFlag08;
    @XmlElementRef(name = "rdm_custom_flag_09", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rdmCustomFlag09;
    @XmlElementRef(name = "rdm_custom_flag_10", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rdmCustomFlag10;
    @XmlElementRef(name = "rdm_custom_flag_11", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rdmCustomFlag11;
    @XmlElementRef(name = "rdm_custom_flag_12", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rdmCustomFlag12;
    @XmlElementRef(name = "rdm_custom_flag_13", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rdmCustomFlag13;
    @XmlElementRef(name = "rdm_custom_flag_14", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rdmCustomFlag14;
    @XmlElementRef(name = "rdm_custom_flag_15", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> rdmCustomFlag15;
    @XmlElementRef(name = "rdm_custom_date_01", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomDate01;
    @XmlElementRef(name = "rdm_custom_date_02", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomDate02;
    @XmlElementRef(name = "rdm_custom_date_03", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomDate03;
    @XmlElementRef(name = "rdm_custom_date_04", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomDate04;
    @XmlElementRef(name = "rdm_custom_date_05", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomDate05;
    @XmlElementRef(name = "rdm_custom_date_06", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomDate06;
    @XmlElementRef(name = "rdm_custom_date_07", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomDate07;
    @XmlElementRef(name = "rdm_custom_date_08", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomDate08;
    @XmlElementRef(name = "rdm_custom_date_09", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomDate09;
    @XmlElementRef(name = "rdm_custom_date_10", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomDate10;
    @XmlElementRef(name = "rdm_custom_date_11", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomDate11;
    @XmlElementRef(name = "rdm_custom_date_12", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomDate12;
    @XmlElementRef(name = "rdm_custom_date_13", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomDate13;
    @XmlElementRef(name = "rdm_custom_date_14", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomDate14;
    @XmlElementRef(name = "rdm_custom_date_15", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomDate15;
    @XmlElementRef(name = "rdm_custom_currency_01", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> rdmCustomCurrency01;
    @XmlElementRef(name = "rdm_custom_currency_02", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> rdmCustomCurrency02;
    @XmlElementRef(name = "rdm_custom_currency_03", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> rdmCustomCurrency03;
    @XmlElementRef(name = "rdm_custom_currency_04", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> rdmCustomCurrency04;
    @XmlElementRef(name = "rdm_custom_currency_05", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> rdmCustomCurrency05;
    @XmlElementRef(name = "rdm_custom_currency_06", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> rdmCustomCurrency06;
    @XmlElementRef(name = "rdm_custom_currency_07", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> rdmCustomCurrency07;
    @XmlElementRef(name = "rdm_custom_currency_08", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> rdmCustomCurrency08;
    @XmlElementRef(name = "rdm_custom_currency_09", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> rdmCustomCurrency09;
    @XmlElementRef(name = "rdm_custom_currency_10", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> rdmCustomCurrency10;
    @XmlElementRef(name = "rdm_custom_currency_11", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> rdmCustomCurrency11;
    @XmlElementRef(name = "rdm_custom_currency_12", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> rdmCustomCurrency12;
    @XmlElementRef(name = "rdm_custom_currency_13", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> rdmCustomCurrency13;
    @XmlElementRef(name = "rdm_custom_currency_14", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> rdmCustomCurrency14;
    @XmlElementRef(name = "rdm_custom_currency_15", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> rdmCustomCurrency15;
    @XmlElementRef(name = "rdm_custom_integer_01", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> rdmCustomInteger01;
    @XmlElementRef(name = "rdm_custom_integer_02", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> rdmCustomInteger02;
    @XmlElementRef(name = "rdm_custom_integer_03", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> rdmCustomInteger03;
    @XmlElementRef(name = "rdm_custom_integer_04", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> rdmCustomInteger04;
    @XmlElementRef(name = "rdm_custom_integer_05", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> rdmCustomInteger05;
    @XmlElementRef(name = "rdm_custom_integer_06", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> rdmCustomInteger06;
    @XmlElementRef(name = "rdm_custom_integer_07", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> rdmCustomInteger07;
    @XmlElementRef(name = "rdm_custom_integer_08", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> rdmCustomInteger08;
    @XmlElementRef(name = "rdm_custom_integer_09", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> rdmCustomInteger09;
    @XmlElementRef(name = "rdm_custom_integer_10", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> rdmCustomInteger10;
    @XmlElementRef(name = "rdm_custom_integer_11", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> rdmCustomInteger11;
    @XmlElementRef(name = "rdm_custom_integer_12", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> rdmCustomInteger12;
    @XmlElementRef(name = "rdm_custom_integer_13", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> rdmCustomInteger13;
    @XmlElementRef(name = "rdm_custom_integer_14", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> rdmCustomInteger14;
    @XmlElementRef(name = "rdm_custom_integer_15", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> rdmCustomInteger15;
    @XmlElementRef(name = "rdm_custom_string_01", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomString01;
    @XmlElementRef(name = "rdm_custom_string_02", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomString02;
    @XmlElementRef(name = "rdm_custom_string_03", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomString03;
    @XmlElementRef(name = "rdm_custom_string_04", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomString04;
    @XmlElementRef(name = "rdm_custom_string_05", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomString05;
    @XmlElementRef(name = "rdm_custom_string_06", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomString06;
    @XmlElementRef(name = "rdm_custom_string_07", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomString07;
    @XmlElementRef(name = "rdm_custom_string_08", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomString08;
    @XmlElementRef(name = "rdm_custom_string_09", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomString09;
    @XmlElementRef(name = "rdm_custom_string_10", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomString10;
    @XmlElementRef(name = "rdm_custom_string_11", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomString11;
    @XmlElementRef(name = "rdm_custom_string_12", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomString12;
    @XmlElementRef(name = "rdm_custom_string_13", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomString13;
    @XmlElementRef(name = "rdm_custom_string_14", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomString14;
    @XmlElementRef(name = "rdm_custom_string_15", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomString15;
    @XmlElementRef(name = "rdm_custom_text_01", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomText01;
    @XmlElementRef(name = "rdm_custom_text_02", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomText02;
    @XmlElementRef(name = "rdm_custom_text_03", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomText03;
    @XmlElementRef(name = "rdm_custom_text_04", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomText04;
    @XmlElementRef(name = "rdm_custom_text_05", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomText05;
    @XmlElementRef(name = "rdm_custom_text_06", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomText06;
    @XmlElementRef(name = "rdm_custom_text_07", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomText07;
    @XmlElementRef(name = "rdm_custom_text_08", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomText08;
    @XmlElementRef(name = "rdm_custom_text_09", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomText09;
    @XmlElementRef(name = "rdm_custom_text_10", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomText10;
    @XmlElementRef(name = "rdm_custom_text_11", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomText11;
    @XmlElementRef(name = "rdm_custom_text_12", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomText12;
    @XmlElementRef(name = "rdm_custom_text_13", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomText13;
    @XmlElementRef(name = "rdm_custom_text_14", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomText14;
    @XmlElementRef(name = "rdm_custom_text_15", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmCustomText15;
    @XmlElementRef(name = "rdm_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> rdmKeyExt;

    /**
     * Gets the value of the rdmKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmKey() {
        return rdmKey;
    }

    /**
     * Sets the value of the rdmKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmKey(JAXBElement<String> value) {
        this.rdmKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmAddUser() {
        return rdmAddUser;
    }

    /**
     * Sets the value of the rdmAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmAddUser(JAXBElement<String> value) {
        this.rdmAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmAddDate() {
        return rdmAddDate;
    }

    /**
     * Sets the value of the rdmAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmAddDate(JAXBElement<String> value) {
        this.rdmAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmChangeUser() {
        return rdmChangeUser;
    }

    /**
     * Sets the value of the rdmChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmChangeUser(JAXBElement<String> value) {
        this.rdmChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmChangeDate() {
        return rdmChangeDate;
    }

    /**
     * Sets the value of the rdmChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmChangeDate(JAXBElement<String> value) {
        this.rdmChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRdmDeleteFlag() {
        return rdmDeleteFlag;
    }

    /**
     * Sets the value of the rdmDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRdmDeleteFlag(JAXBElement<Short> value) {
        this.rdmDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rdmEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmEntityKey() {
        return rdmEntityKey;
    }

    /**
     * Sets the value of the rdmEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmEntityKey(JAXBElement<String> value) {
        this.rdmEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomXml01 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomXml01() {
        return rdmCustomXml01;
    }

    /**
     * Sets the value of the rdmCustomXml01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomXml01(JAXBElement<String> value) {
        this.rdmCustomXml01 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmRegKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmRegKey() {
        return rdmRegKey;
    }

    /**
     * Sets the value of the rdmRegKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmRegKey(JAXBElement<String> value) {
        this.rdmRegKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomFlag01 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRdmCustomFlag01() {
        return rdmCustomFlag01;
    }

    /**
     * Sets the value of the rdmCustomFlag01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRdmCustomFlag01(JAXBElement<Short> value) {
        this.rdmCustomFlag01 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rdmCustomFlag02 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRdmCustomFlag02() {
        return rdmCustomFlag02;
    }

    /**
     * Sets the value of the rdmCustomFlag02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRdmCustomFlag02(JAXBElement<Short> value) {
        this.rdmCustomFlag02 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rdmCustomFlag03 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRdmCustomFlag03() {
        return rdmCustomFlag03;
    }

    /**
     * Sets the value of the rdmCustomFlag03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRdmCustomFlag03(JAXBElement<Short> value) {
        this.rdmCustomFlag03 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rdmCustomFlag04 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRdmCustomFlag04() {
        return rdmCustomFlag04;
    }

    /**
     * Sets the value of the rdmCustomFlag04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRdmCustomFlag04(JAXBElement<Short> value) {
        this.rdmCustomFlag04 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rdmCustomFlag05 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRdmCustomFlag05() {
        return rdmCustomFlag05;
    }

    /**
     * Sets the value of the rdmCustomFlag05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRdmCustomFlag05(JAXBElement<Short> value) {
        this.rdmCustomFlag05 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rdmCustomFlag06 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRdmCustomFlag06() {
        return rdmCustomFlag06;
    }

    /**
     * Sets the value of the rdmCustomFlag06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRdmCustomFlag06(JAXBElement<Short> value) {
        this.rdmCustomFlag06 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rdmCustomFlag07 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRdmCustomFlag07() {
        return rdmCustomFlag07;
    }

    /**
     * Sets the value of the rdmCustomFlag07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRdmCustomFlag07(JAXBElement<Short> value) {
        this.rdmCustomFlag07 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rdmCustomFlag08 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRdmCustomFlag08() {
        return rdmCustomFlag08;
    }

    /**
     * Sets the value of the rdmCustomFlag08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRdmCustomFlag08(JAXBElement<Short> value) {
        this.rdmCustomFlag08 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rdmCustomFlag09 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRdmCustomFlag09() {
        return rdmCustomFlag09;
    }

    /**
     * Sets the value of the rdmCustomFlag09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRdmCustomFlag09(JAXBElement<Short> value) {
        this.rdmCustomFlag09 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rdmCustomFlag10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRdmCustomFlag10() {
        return rdmCustomFlag10;
    }

    /**
     * Sets the value of the rdmCustomFlag10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRdmCustomFlag10(JAXBElement<Short> value) {
        this.rdmCustomFlag10 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rdmCustomFlag11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRdmCustomFlag11() {
        return rdmCustomFlag11;
    }

    /**
     * Sets the value of the rdmCustomFlag11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRdmCustomFlag11(JAXBElement<Short> value) {
        this.rdmCustomFlag11 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rdmCustomFlag12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRdmCustomFlag12() {
        return rdmCustomFlag12;
    }

    /**
     * Sets the value of the rdmCustomFlag12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRdmCustomFlag12(JAXBElement<Short> value) {
        this.rdmCustomFlag12 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rdmCustomFlag13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRdmCustomFlag13() {
        return rdmCustomFlag13;
    }

    /**
     * Sets the value of the rdmCustomFlag13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRdmCustomFlag13(JAXBElement<Short> value) {
        this.rdmCustomFlag13 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rdmCustomFlag14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRdmCustomFlag14() {
        return rdmCustomFlag14;
    }

    /**
     * Sets the value of the rdmCustomFlag14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRdmCustomFlag14(JAXBElement<Short> value) {
        this.rdmCustomFlag14 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rdmCustomFlag15 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRdmCustomFlag15() {
        return rdmCustomFlag15;
    }

    /**
     * Sets the value of the rdmCustomFlag15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRdmCustomFlag15(JAXBElement<Short> value) {
        this.rdmCustomFlag15 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the rdmCustomDate01 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomDate01() {
        return rdmCustomDate01;
    }

    /**
     * Sets the value of the rdmCustomDate01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomDate01(JAXBElement<String> value) {
        this.rdmCustomDate01 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomDate02 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomDate02() {
        return rdmCustomDate02;
    }

    /**
     * Sets the value of the rdmCustomDate02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomDate02(JAXBElement<String> value) {
        this.rdmCustomDate02 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomDate03 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomDate03() {
        return rdmCustomDate03;
    }

    /**
     * Sets the value of the rdmCustomDate03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomDate03(JAXBElement<String> value) {
        this.rdmCustomDate03 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomDate04 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomDate04() {
        return rdmCustomDate04;
    }

    /**
     * Sets the value of the rdmCustomDate04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomDate04(JAXBElement<String> value) {
        this.rdmCustomDate04 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomDate05 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomDate05() {
        return rdmCustomDate05;
    }

    /**
     * Sets the value of the rdmCustomDate05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomDate05(JAXBElement<String> value) {
        this.rdmCustomDate05 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomDate06 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomDate06() {
        return rdmCustomDate06;
    }

    /**
     * Sets the value of the rdmCustomDate06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomDate06(JAXBElement<String> value) {
        this.rdmCustomDate06 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomDate07 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomDate07() {
        return rdmCustomDate07;
    }

    /**
     * Sets the value of the rdmCustomDate07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomDate07(JAXBElement<String> value) {
        this.rdmCustomDate07 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomDate08 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomDate08() {
        return rdmCustomDate08;
    }

    /**
     * Sets the value of the rdmCustomDate08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomDate08(JAXBElement<String> value) {
        this.rdmCustomDate08 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomDate09 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomDate09() {
        return rdmCustomDate09;
    }

    /**
     * Sets the value of the rdmCustomDate09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomDate09(JAXBElement<String> value) {
        this.rdmCustomDate09 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomDate10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomDate10() {
        return rdmCustomDate10;
    }

    /**
     * Sets the value of the rdmCustomDate10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomDate10(JAXBElement<String> value) {
        this.rdmCustomDate10 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomDate11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomDate11() {
        return rdmCustomDate11;
    }

    /**
     * Sets the value of the rdmCustomDate11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomDate11(JAXBElement<String> value) {
        this.rdmCustomDate11 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomDate12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomDate12() {
        return rdmCustomDate12;
    }

    /**
     * Sets the value of the rdmCustomDate12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomDate12(JAXBElement<String> value) {
        this.rdmCustomDate12 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomDate13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomDate13() {
        return rdmCustomDate13;
    }

    /**
     * Sets the value of the rdmCustomDate13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomDate13(JAXBElement<String> value) {
        this.rdmCustomDate13 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomDate14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomDate14() {
        return rdmCustomDate14;
    }

    /**
     * Sets the value of the rdmCustomDate14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomDate14(JAXBElement<String> value) {
        this.rdmCustomDate14 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomDate15 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomDate15() {
        return rdmCustomDate15;
    }

    /**
     * Sets the value of the rdmCustomDate15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomDate15(JAXBElement<String> value) {
        this.rdmCustomDate15 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomCurrency01 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRdmCustomCurrency01() {
        return rdmCustomCurrency01;
    }

    /**
     * Sets the value of the rdmCustomCurrency01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRdmCustomCurrency01(JAXBElement<BigDecimal> value) {
        this.rdmCustomCurrency01 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the rdmCustomCurrency02 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRdmCustomCurrency02() {
        return rdmCustomCurrency02;
    }

    /**
     * Sets the value of the rdmCustomCurrency02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRdmCustomCurrency02(JAXBElement<BigDecimal> value) {
        this.rdmCustomCurrency02 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the rdmCustomCurrency03 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRdmCustomCurrency03() {
        return rdmCustomCurrency03;
    }

    /**
     * Sets the value of the rdmCustomCurrency03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRdmCustomCurrency03(JAXBElement<BigDecimal> value) {
        this.rdmCustomCurrency03 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the rdmCustomCurrency04 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRdmCustomCurrency04() {
        return rdmCustomCurrency04;
    }

    /**
     * Sets the value of the rdmCustomCurrency04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRdmCustomCurrency04(JAXBElement<BigDecimal> value) {
        this.rdmCustomCurrency04 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the rdmCustomCurrency05 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRdmCustomCurrency05() {
        return rdmCustomCurrency05;
    }

    /**
     * Sets the value of the rdmCustomCurrency05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRdmCustomCurrency05(JAXBElement<BigDecimal> value) {
        this.rdmCustomCurrency05 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the rdmCustomCurrency06 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRdmCustomCurrency06() {
        return rdmCustomCurrency06;
    }

    /**
     * Sets the value of the rdmCustomCurrency06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRdmCustomCurrency06(JAXBElement<BigDecimal> value) {
        this.rdmCustomCurrency06 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the rdmCustomCurrency07 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRdmCustomCurrency07() {
        return rdmCustomCurrency07;
    }

    /**
     * Sets the value of the rdmCustomCurrency07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRdmCustomCurrency07(JAXBElement<BigDecimal> value) {
        this.rdmCustomCurrency07 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the rdmCustomCurrency08 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRdmCustomCurrency08() {
        return rdmCustomCurrency08;
    }

    /**
     * Sets the value of the rdmCustomCurrency08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRdmCustomCurrency08(JAXBElement<BigDecimal> value) {
        this.rdmCustomCurrency08 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the rdmCustomCurrency09 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRdmCustomCurrency09() {
        return rdmCustomCurrency09;
    }

    /**
     * Sets the value of the rdmCustomCurrency09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRdmCustomCurrency09(JAXBElement<BigDecimal> value) {
        this.rdmCustomCurrency09 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the rdmCustomCurrency10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRdmCustomCurrency10() {
        return rdmCustomCurrency10;
    }

    /**
     * Sets the value of the rdmCustomCurrency10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRdmCustomCurrency10(JAXBElement<BigDecimal> value) {
        this.rdmCustomCurrency10 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the rdmCustomCurrency11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRdmCustomCurrency11() {
        return rdmCustomCurrency11;
    }

    /**
     * Sets the value of the rdmCustomCurrency11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRdmCustomCurrency11(JAXBElement<BigDecimal> value) {
        this.rdmCustomCurrency11 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the rdmCustomCurrency12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRdmCustomCurrency12() {
        return rdmCustomCurrency12;
    }

    /**
     * Sets the value of the rdmCustomCurrency12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRdmCustomCurrency12(JAXBElement<BigDecimal> value) {
        this.rdmCustomCurrency12 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the rdmCustomCurrency13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRdmCustomCurrency13() {
        return rdmCustomCurrency13;
    }

    /**
     * Sets the value of the rdmCustomCurrency13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRdmCustomCurrency13(JAXBElement<BigDecimal> value) {
        this.rdmCustomCurrency13 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the rdmCustomCurrency14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRdmCustomCurrency14() {
        return rdmCustomCurrency14;
    }

    /**
     * Sets the value of the rdmCustomCurrency14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRdmCustomCurrency14(JAXBElement<BigDecimal> value) {
        this.rdmCustomCurrency14 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the rdmCustomCurrency15 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRdmCustomCurrency15() {
        return rdmCustomCurrency15;
    }

    /**
     * Sets the value of the rdmCustomCurrency15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRdmCustomCurrency15(JAXBElement<BigDecimal> value) {
        this.rdmCustomCurrency15 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the rdmCustomInteger01 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRdmCustomInteger01() {
        return rdmCustomInteger01;
    }

    /**
     * Sets the value of the rdmCustomInteger01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRdmCustomInteger01(JAXBElement<Integer> value) {
        this.rdmCustomInteger01 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rdmCustomInteger02 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRdmCustomInteger02() {
        return rdmCustomInteger02;
    }

    /**
     * Sets the value of the rdmCustomInteger02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRdmCustomInteger02(JAXBElement<Integer> value) {
        this.rdmCustomInteger02 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rdmCustomInteger03 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRdmCustomInteger03() {
        return rdmCustomInteger03;
    }

    /**
     * Sets the value of the rdmCustomInteger03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRdmCustomInteger03(JAXBElement<Integer> value) {
        this.rdmCustomInteger03 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rdmCustomInteger04 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRdmCustomInteger04() {
        return rdmCustomInteger04;
    }

    /**
     * Sets the value of the rdmCustomInteger04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRdmCustomInteger04(JAXBElement<Integer> value) {
        this.rdmCustomInteger04 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rdmCustomInteger05 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRdmCustomInteger05() {
        return rdmCustomInteger05;
    }

    /**
     * Sets the value of the rdmCustomInteger05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRdmCustomInteger05(JAXBElement<Integer> value) {
        this.rdmCustomInteger05 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rdmCustomInteger06 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRdmCustomInteger06() {
        return rdmCustomInteger06;
    }

    /**
     * Sets the value of the rdmCustomInteger06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRdmCustomInteger06(JAXBElement<Integer> value) {
        this.rdmCustomInteger06 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rdmCustomInteger07 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRdmCustomInteger07() {
        return rdmCustomInteger07;
    }

    /**
     * Sets the value of the rdmCustomInteger07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRdmCustomInteger07(JAXBElement<Integer> value) {
        this.rdmCustomInteger07 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rdmCustomInteger08 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRdmCustomInteger08() {
        return rdmCustomInteger08;
    }

    /**
     * Sets the value of the rdmCustomInteger08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRdmCustomInteger08(JAXBElement<Integer> value) {
        this.rdmCustomInteger08 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rdmCustomInteger09 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRdmCustomInteger09() {
        return rdmCustomInteger09;
    }

    /**
     * Sets the value of the rdmCustomInteger09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRdmCustomInteger09(JAXBElement<Integer> value) {
        this.rdmCustomInteger09 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rdmCustomInteger10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRdmCustomInteger10() {
        return rdmCustomInteger10;
    }

    /**
     * Sets the value of the rdmCustomInteger10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRdmCustomInteger10(JAXBElement<Integer> value) {
        this.rdmCustomInteger10 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rdmCustomInteger11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRdmCustomInteger11() {
        return rdmCustomInteger11;
    }

    /**
     * Sets the value of the rdmCustomInteger11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRdmCustomInteger11(JAXBElement<Integer> value) {
        this.rdmCustomInteger11 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rdmCustomInteger12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRdmCustomInteger12() {
        return rdmCustomInteger12;
    }

    /**
     * Sets the value of the rdmCustomInteger12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRdmCustomInteger12(JAXBElement<Integer> value) {
        this.rdmCustomInteger12 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rdmCustomInteger13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRdmCustomInteger13() {
        return rdmCustomInteger13;
    }

    /**
     * Sets the value of the rdmCustomInteger13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRdmCustomInteger13(JAXBElement<Integer> value) {
        this.rdmCustomInteger13 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rdmCustomInteger14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRdmCustomInteger14() {
        return rdmCustomInteger14;
    }

    /**
     * Sets the value of the rdmCustomInteger14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRdmCustomInteger14(JAXBElement<Integer> value) {
        this.rdmCustomInteger14 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rdmCustomInteger15 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRdmCustomInteger15() {
        return rdmCustomInteger15;
    }

    /**
     * Sets the value of the rdmCustomInteger15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRdmCustomInteger15(JAXBElement<Integer> value) {
        this.rdmCustomInteger15 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rdmCustomString01 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomString01() {
        return rdmCustomString01;
    }

    /**
     * Sets the value of the rdmCustomString01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomString01(JAXBElement<String> value) {
        this.rdmCustomString01 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomString02 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomString02() {
        return rdmCustomString02;
    }

    /**
     * Sets the value of the rdmCustomString02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomString02(JAXBElement<String> value) {
        this.rdmCustomString02 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomString03 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomString03() {
        return rdmCustomString03;
    }

    /**
     * Sets the value of the rdmCustomString03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomString03(JAXBElement<String> value) {
        this.rdmCustomString03 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomString04 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomString04() {
        return rdmCustomString04;
    }

    /**
     * Sets the value of the rdmCustomString04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomString04(JAXBElement<String> value) {
        this.rdmCustomString04 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomString05 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomString05() {
        return rdmCustomString05;
    }

    /**
     * Sets the value of the rdmCustomString05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomString05(JAXBElement<String> value) {
        this.rdmCustomString05 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomString06 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomString06() {
        return rdmCustomString06;
    }

    /**
     * Sets the value of the rdmCustomString06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomString06(JAXBElement<String> value) {
        this.rdmCustomString06 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomString07 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomString07() {
        return rdmCustomString07;
    }

    /**
     * Sets the value of the rdmCustomString07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomString07(JAXBElement<String> value) {
        this.rdmCustomString07 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomString08 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomString08() {
        return rdmCustomString08;
    }

    /**
     * Sets the value of the rdmCustomString08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomString08(JAXBElement<String> value) {
        this.rdmCustomString08 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomString09 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomString09() {
        return rdmCustomString09;
    }

    /**
     * Sets the value of the rdmCustomString09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomString09(JAXBElement<String> value) {
        this.rdmCustomString09 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomString10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomString10() {
        return rdmCustomString10;
    }

    /**
     * Sets the value of the rdmCustomString10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomString10(JAXBElement<String> value) {
        this.rdmCustomString10 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomString11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomString11() {
        return rdmCustomString11;
    }

    /**
     * Sets the value of the rdmCustomString11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomString11(JAXBElement<String> value) {
        this.rdmCustomString11 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomString12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomString12() {
        return rdmCustomString12;
    }

    /**
     * Sets the value of the rdmCustomString12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomString12(JAXBElement<String> value) {
        this.rdmCustomString12 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomString13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomString13() {
        return rdmCustomString13;
    }

    /**
     * Sets the value of the rdmCustomString13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomString13(JAXBElement<String> value) {
        this.rdmCustomString13 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomString14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomString14() {
        return rdmCustomString14;
    }

    /**
     * Sets the value of the rdmCustomString14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomString14(JAXBElement<String> value) {
        this.rdmCustomString14 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomString15 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomString15() {
        return rdmCustomString15;
    }

    /**
     * Sets the value of the rdmCustomString15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomString15(JAXBElement<String> value) {
        this.rdmCustomString15 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomText01 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomText01() {
        return rdmCustomText01;
    }

    /**
     * Sets the value of the rdmCustomText01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomText01(JAXBElement<String> value) {
        this.rdmCustomText01 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomText02 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomText02() {
        return rdmCustomText02;
    }

    /**
     * Sets the value of the rdmCustomText02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomText02(JAXBElement<String> value) {
        this.rdmCustomText02 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomText03 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomText03() {
        return rdmCustomText03;
    }

    /**
     * Sets the value of the rdmCustomText03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomText03(JAXBElement<String> value) {
        this.rdmCustomText03 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomText04 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomText04() {
        return rdmCustomText04;
    }

    /**
     * Sets the value of the rdmCustomText04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomText04(JAXBElement<String> value) {
        this.rdmCustomText04 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomText05 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomText05() {
        return rdmCustomText05;
    }

    /**
     * Sets the value of the rdmCustomText05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomText05(JAXBElement<String> value) {
        this.rdmCustomText05 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomText06 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomText06() {
        return rdmCustomText06;
    }

    /**
     * Sets the value of the rdmCustomText06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomText06(JAXBElement<String> value) {
        this.rdmCustomText06 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomText07 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomText07() {
        return rdmCustomText07;
    }

    /**
     * Sets the value of the rdmCustomText07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomText07(JAXBElement<String> value) {
        this.rdmCustomText07 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomText08 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomText08() {
        return rdmCustomText08;
    }

    /**
     * Sets the value of the rdmCustomText08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomText08(JAXBElement<String> value) {
        this.rdmCustomText08 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomText09 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomText09() {
        return rdmCustomText09;
    }

    /**
     * Sets the value of the rdmCustomText09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomText09(JAXBElement<String> value) {
        this.rdmCustomText09 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomText10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomText10() {
        return rdmCustomText10;
    }

    /**
     * Sets the value of the rdmCustomText10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomText10(JAXBElement<String> value) {
        this.rdmCustomText10 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomText11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomText11() {
        return rdmCustomText11;
    }

    /**
     * Sets the value of the rdmCustomText11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomText11(JAXBElement<String> value) {
        this.rdmCustomText11 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomText12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomText12() {
        return rdmCustomText12;
    }

    /**
     * Sets the value of the rdmCustomText12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomText12(JAXBElement<String> value) {
        this.rdmCustomText12 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomText13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomText13() {
        return rdmCustomText13;
    }

    /**
     * Sets the value of the rdmCustomText13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomText13(JAXBElement<String> value) {
        this.rdmCustomText13 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomText14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomText14() {
        return rdmCustomText14;
    }

    /**
     * Sets the value of the rdmCustomText14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomText14(JAXBElement<String> value) {
        this.rdmCustomText14 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmCustomText15 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmCustomText15() {
        return rdmCustomText15;
    }

    /**
     * Sets the value of the rdmCustomText15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmCustomText15(JAXBElement<String> value) {
        this.rdmCustomText15 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rdmKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdmKeyExt() {
        return rdmKeyExt;
    }

    /**
     * Sets the value of the rdmKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdmKeyExt(JAXBElement<String> value) {
        this.rdmKeyExt = ((JAXBElement<String> ) value);
    }

}
