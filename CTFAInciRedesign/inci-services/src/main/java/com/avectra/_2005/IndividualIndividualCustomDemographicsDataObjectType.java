
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Individual_Individual_Custom_Demographics_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Individual_Individual_Custom_Demographics_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idm_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="idm_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="idm_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="idm_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="idm_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="idm_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="idm_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_xml_01" type="{http://www.avectra.com/2005/}stringLength-1_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_flag_01" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_flag_02" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_flag_03" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_flag_04" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_flag_05" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_flag_06" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_flag_07" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_flag_08" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_flag_09" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_flag_10" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_flag_11" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_flag_12" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_flag_13" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_flag_14" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_flag_15" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_date_01" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_date_02" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_date_03" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_date_04" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_date_05" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_date_06" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_date_07" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_date_08" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_date_09" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_date_10" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_date_11" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_date_12" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_date_13" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_date_14" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_date_15" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_currency_01" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_currency_02" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_currency_03" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_currency_04" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_currency_05" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_currency_06" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_currency_07" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_currency_08" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_currency_09" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_currency_10" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_currency_11" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_currency_12" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_currency_13" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_currency_14" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_currency_15" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_integer_01" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_integer_02" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_integer_03" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_integer_04" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_integer_05" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_integer_06" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_integer_07" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_integer_08" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_integer_09" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_integer_10" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_integer_11" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_integer_12" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_integer_13" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_integer_14" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_integer_15" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_string_01" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_string_02" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_string_03" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_string_04" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_string_05" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_string_06" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_string_07" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_string_08" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_string_09" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_string_10" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_string_11" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_string_12" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_string_13" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_string_14" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_string_15" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_text_01" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_text_02" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_text_03" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_text_04" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_text_05" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_text_06" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_text_07" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_text_08" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_text_09" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_text_10" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_text_11" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_text_12" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_text_13" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_text_14" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="idm_custom_text_15" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="idm_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="idm_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Individual_Individual_Custom_Demographics_DataObjectType", propOrder = {
    "idmKey",
    "idmAddUser",
    "idmAddDate",
    "idmChangeUser",
    "idmChangeDate",
    "idmDeleteFlag",
    "idmEntityKey",
    "idmCustomXml01",
    "idmCustomFlag01",
    "idmCustomFlag02",
    "idmCustomFlag03",
    "idmCustomFlag04",
    "idmCustomFlag05",
    "idmCustomFlag06",
    "idmCustomFlag07",
    "idmCustomFlag08",
    "idmCustomFlag09",
    "idmCustomFlag10",
    "idmCustomFlag11",
    "idmCustomFlag12",
    "idmCustomFlag13",
    "idmCustomFlag14",
    "idmCustomFlag15",
    "idmCustomDate01",
    "idmCustomDate02",
    "idmCustomDate03",
    "idmCustomDate04",
    "idmCustomDate05",
    "idmCustomDate06",
    "idmCustomDate07",
    "idmCustomDate08",
    "idmCustomDate09",
    "idmCustomDate10",
    "idmCustomDate11",
    "idmCustomDate12",
    "idmCustomDate13",
    "idmCustomDate14",
    "idmCustomDate15",
    "idmCustomCurrency01",
    "idmCustomCurrency02",
    "idmCustomCurrency03",
    "idmCustomCurrency04",
    "idmCustomCurrency05",
    "idmCustomCurrency06",
    "idmCustomCurrency07",
    "idmCustomCurrency08",
    "idmCustomCurrency09",
    "idmCustomCurrency10",
    "idmCustomCurrency11",
    "idmCustomCurrency12",
    "idmCustomCurrency13",
    "idmCustomCurrency14",
    "idmCustomCurrency15",
    "idmCustomInteger01",
    "idmCustomInteger02",
    "idmCustomInteger03",
    "idmCustomInteger04",
    "idmCustomInteger05",
    "idmCustomInteger06",
    "idmCustomInteger07",
    "idmCustomInteger08",
    "idmCustomInteger09",
    "idmCustomInteger10",
    "idmCustomInteger11",
    "idmCustomInteger12",
    "idmCustomInteger13",
    "idmCustomInteger14",
    "idmCustomInteger15",
    "idmCustomString01",
    "idmCustomString02",
    "idmCustomString03",
    "idmCustomString04",
    "idmCustomString05",
    "idmCustomString06",
    "idmCustomString07",
    "idmCustomString08",
    "idmCustomString09",
    "idmCustomString10",
    "idmCustomString11",
    "idmCustomString12",
    "idmCustomString13",
    "idmCustomString14",
    "idmCustomString15",
    "idmCustomText01",
    "idmCustomText02",
    "idmCustomText03",
    "idmCustomText04",
    "idmCustomText05",
    "idmCustomText06",
    "idmCustomText07",
    "idmCustomText08",
    "idmCustomText09",
    "idmCustomText10",
    "idmCustomText11",
    "idmCustomText12",
    "idmCustomText13",
    "idmCustomText14",
    "idmCustomText15",
    "idmKeyExt",
    "idmCstKey"
})
public class IndividualIndividualCustomDemographicsDataObjectType {

    @XmlElementRef(name = "idm_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmKey;
    @XmlElementRef(name = "idm_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmAddUser;
    @XmlElementRef(name = "idm_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmAddDate;
    @XmlElementRef(name = "idm_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmChangeUser;
    @XmlElementRef(name = "idm_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmChangeDate;
    @XmlElementRef(name = "idm_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> idmDeleteFlag;
    @XmlElementRef(name = "idm_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmEntityKey;
    @XmlElementRef(name = "idm_custom_xml_01", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomXml01;
    @XmlElementRef(name = "idm_custom_flag_01", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> idmCustomFlag01;
    @XmlElementRef(name = "idm_custom_flag_02", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> idmCustomFlag02;
    @XmlElementRef(name = "idm_custom_flag_03", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> idmCustomFlag03;
    @XmlElementRef(name = "idm_custom_flag_04", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> idmCustomFlag04;
    @XmlElementRef(name = "idm_custom_flag_05", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> idmCustomFlag05;
    @XmlElementRef(name = "idm_custom_flag_06", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> idmCustomFlag06;
    @XmlElementRef(name = "idm_custom_flag_07", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> idmCustomFlag07;
    @XmlElementRef(name = "idm_custom_flag_08", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> idmCustomFlag08;
    @XmlElementRef(name = "idm_custom_flag_09", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> idmCustomFlag09;
    @XmlElementRef(name = "idm_custom_flag_10", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> idmCustomFlag10;
    @XmlElementRef(name = "idm_custom_flag_11", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> idmCustomFlag11;
    @XmlElementRef(name = "idm_custom_flag_12", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> idmCustomFlag12;
    @XmlElementRef(name = "idm_custom_flag_13", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> idmCustomFlag13;
    @XmlElementRef(name = "idm_custom_flag_14", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> idmCustomFlag14;
    @XmlElementRef(name = "idm_custom_flag_15", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> idmCustomFlag15;
    @XmlElementRef(name = "idm_custom_date_01", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomDate01;
    @XmlElementRef(name = "idm_custom_date_02", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomDate02;
    @XmlElementRef(name = "idm_custom_date_03", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomDate03;
    @XmlElementRef(name = "idm_custom_date_04", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomDate04;
    @XmlElementRef(name = "idm_custom_date_05", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomDate05;
    @XmlElementRef(name = "idm_custom_date_06", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomDate06;
    @XmlElementRef(name = "idm_custom_date_07", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomDate07;
    @XmlElementRef(name = "idm_custom_date_08", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomDate08;
    @XmlElementRef(name = "idm_custom_date_09", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomDate09;
    @XmlElementRef(name = "idm_custom_date_10", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomDate10;
    @XmlElementRef(name = "idm_custom_date_11", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomDate11;
    @XmlElementRef(name = "idm_custom_date_12", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomDate12;
    @XmlElementRef(name = "idm_custom_date_13", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomDate13;
    @XmlElementRef(name = "idm_custom_date_14", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomDate14;
    @XmlElementRef(name = "idm_custom_date_15", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomDate15;
    @XmlElementRef(name = "idm_custom_currency_01", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> idmCustomCurrency01;
    @XmlElementRef(name = "idm_custom_currency_02", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> idmCustomCurrency02;
    @XmlElementRef(name = "idm_custom_currency_03", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> idmCustomCurrency03;
    @XmlElementRef(name = "idm_custom_currency_04", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> idmCustomCurrency04;
    @XmlElementRef(name = "idm_custom_currency_05", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> idmCustomCurrency05;
    @XmlElementRef(name = "idm_custom_currency_06", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> idmCustomCurrency06;
    @XmlElementRef(name = "idm_custom_currency_07", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> idmCustomCurrency07;
    @XmlElementRef(name = "idm_custom_currency_08", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> idmCustomCurrency08;
    @XmlElementRef(name = "idm_custom_currency_09", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> idmCustomCurrency09;
    @XmlElementRef(name = "idm_custom_currency_10", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> idmCustomCurrency10;
    @XmlElementRef(name = "idm_custom_currency_11", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> idmCustomCurrency11;
    @XmlElementRef(name = "idm_custom_currency_12", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> idmCustomCurrency12;
    @XmlElementRef(name = "idm_custom_currency_13", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> idmCustomCurrency13;
    @XmlElementRef(name = "idm_custom_currency_14", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> idmCustomCurrency14;
    @XmlElementRef(name = "idm_custom_currency_15", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> idmCustomCurrency15;
    @XmlElementRef(name = "idm_custom_integer_01", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> idmCustomInteger01;
    @XmlElementRef(name = "idm_custom_integer_02", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> idmCustomInteger02;
    @XmlElementRef(name = "idm_custom_integer_03", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> idmCustomInteger03;
    @XmlElementRef(name = "idm_custom_integer_04", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> idmCustomInteger04;
    @XmlElementRef(name = "idm_custom_integer_05", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> idmCustomInteger05;
    @XmlElementRef(name = "idm_custom_integer_06", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> idmCustomInteger06;
    @XmlElementRef(name = "idm_custom_integer_07", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> idmCustomInteger07;
    @XmlElementRef(name = "idm_custom_integer_08", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> idmCustomInteger08;
    @XmlElementRef(name = "idm_custom_integer_09", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> idmCustomInteger09;
    @XmlElementRef(name = "idm_custom_integer_10", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> idmCustomInteger10;
    @XmlElementRef(name = "idm_custom_integer_11", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> idmCustomInteger11;
    @XmlElementRef(name = "idm_custom_integer_12", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> idmCustomInteger12;
    @XmlElementRef(name = "idm_custom_integer_13", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> idmCustomInteger13;
    @XmlElementRef(name = "idm_custom_integer_14", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> idmCustomInteger14;
    @XmlElementRef(name = "idm_custom_integer_15", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> idmCustomInteger15;
    @XmlElementRef(name = "idm_custom_string_01", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomString01;
    @XmlElementRef(name = "idm_custom_string_02", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomString02;
    @XmlElementRef(name = "idm_custom_string_03", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomString03;
    @XmlElementRef(name = "idm_custom_string_04", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomString04;
    @XmlElementRef(name = "idm_custom_string_05", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomString05;
    @XmlElementRef(name = "idm_custom_string_06", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomString06;
    @XmlElementRef(name = "idm_custom_string_07", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomString07;
    @XmlElementRef(name = "idm_custom_string_08", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomString08;
    @XmlElementRef(name = "idm_custom_string_09", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomString09;
    @XmlElementRef(name = "idm_custom_string_10", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomString10;
    @XmlElementRef(name = "idm_custom_string_11", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomString11;
    @XmlElementRef(name = "idm_custom_string_12", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomString12;
    @XmlElementRef(name = "idm_custom_string_13", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomString13;
    @XmlElementRef(name = "idm_custom_string_14", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomString14;
    @XmlElementRef(name = "idm_custom_string_15", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomString15;
    @XmlElementRef(name = "idm_custom_text_01", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomText01;
    @XmlElementRef(name = "idm_custom_text_02", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomText02;
    @XmlElementRef(name = "idm_custom_text_03", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomText03;
    @XmlElementRef(name = "idm_custom_text_04", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomText04;
    @XmlElementRef(name = "idm_custom_text_05", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomText05;
    @XmlElementRef(name = "idm_custom_text_06", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomText06;
    @XmlElementRef(name = "idm_custom_text_07", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomText07;
    @XmlElementRef(name = "idm_custom_text_08", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomText08;
    @XmlElementRef(name = "idm_custom_text_09", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomText09;
    @XmlElementRef(name = "idm_custom_text_10", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomText10;
    @XmlElementRef(name = "idm_custom_text_11", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomText11;
    @XmlElementRef(name = "idm_custom_text_12", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomText12;
    @XmlElementRef(name = "idm_custom_text_13", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomText13;
    @XmlElementRef(name = "idm_custom_text_14", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomText14;
    @XmlElementRef(name = "idm_custom_text_15", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCustomText15;
    @XmlElementRef(name = "idm_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmKeyExt;
    @XmlElementRef(name = "idm_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> idmCstKey;

    /**
     * Gets the value of the idmKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmKey() {
        return idmKey;
    }

    /**
     * Sets the value of the idmKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmKey(JAXBElement<String> value) {
        this.idmKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmAddUser() {
        return idmAddUser;
    }

    /**
     * Sets the value of the idmAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmAddUser(JAXBElement<String> value) {
        this.idmAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmAddDate() {
        return idmAddDate;
    }

    /**
     * Sets the value of the idmAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmAddDate(JAXBElement<String> value) {
        this.idmAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmChangeUser() {
        return idmChangeUser;
    }

    /**
     * Sets the value of the idmChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmChangeUser(JAXBElement<String> value) {
        this.idmChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmChangeDate() {
        return idmChangeDate;
    }

    /**
     * Sets the value of the idmChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmChangeDate(JAXBElement<String> value) {
        this.idmChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIdmDeleteFlag() {
        return idmDeleteFlag;
    }

    /**
     * Sets the value of the idmDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIdmDeleteFlag(JAXBElement<Short> value) {
        this.idmDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the idmEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmEntityKey() {
        return idmEntityKey;
    }

    /**
     * Sets the value of the idmEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmEntityKey(JAXBElement<String> value) {
        this.idmEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomXml01 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomXml01() {
        return idmCustomXml01;
    }

    /**
     * Sets the value of the idmCustomXml01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomXml01(JAXBElement<String> value) {
        this.idmCustomXml01 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomFlag01 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIdmCustomFlag01() {
        return idmCustomFlag01;
    }

    /**
     * Sets the value of the idmCustomFlag01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIdmCustomFlag01(JAXBElement<Short> value) {
        this.idmCustomFlag01 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the idmCustomFlag02 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIdmCustomFlag02() {
        return idmCustomFlag02;
    }

    /**
     * Sets the value of the idmCustomFlag02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIdmCustomFlag02(JAXBElement<Short> value) {
        this.idmCustomFlag02 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the idmCustomFlag03 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIdmCustomFlag03() {
        return idmCustomFlag03;
    }

    /**
     * Sets the value of the idmCustomFlag03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIdmCustomFlag03(JAXBElement<Short> value) {
        this.idmCustomFlag03 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the idmCustomFlag04 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIdmCustomFlag04() {
        return idmCustomFlag04;
    }

    /**
     * Sets the value of the idmCustomFlag04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIdmCustomFlag04(JAXBElement<Short> value) {
        this.idmCustomFlag04 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the idmCustomFlag05 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIdmCustomFlag05() {
        return idmCustomFlag05;
    }

    /**
     * Sets the value of the idmCustomFlag05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIdmCustomFlag05(JAXBElement<Short> value) {
        this.idmCustomFlag05 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the idmCustomFlag06 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIdmCustomFlag06() {
        return idmCustomFlag06;
    }

    /**
     * Sets the value of the idmCustomFlag06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIdmCustomFlag06(JAXBElement<Short> value) {
        this.idmCustomFlag06 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the idmCustomFlag07 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIdmCustomFlag07() {
        return idmCustomFlag07;
    }

    /**
     * Sets the value of the idmCustomFlag07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIdmCustomFlag07(JAXBElement<Short> value) {
        this.idmCustomFlag07 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the idmCustomFlag08 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIdmCustomFlag08() {
        return idmCustomFlag08;
    }

    /**
     * Sets the value of the idmCustomFlag08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIdmCustomFlag08(JAXBElement<Short> value) {
        this.idmCustomFlag08 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the idmCustomFlag09 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIdmCustomFlag09() {
        return idmCustomFlag09;
    }

    /**
     * Sets the value of the idmCustomFlag09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIdmCustomFlag09(JAXBElement<Short> value) {
        this.idmCustomFlag09 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the idmCustomFlag10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIdmCustomFlag10() {
        return idmCustomFlag10;
    }

    /**
     * Sets the value of the idmCustomFlag10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIdmCustomFlag10(JAXBElement<Short> value) {
        this.idmCustomFlag10 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the idmCustomFlag11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIdmCustomFlag11() {
        return idmCustomFlag11;
    }

    /**
     * Sets the value of the idmCustomFlag11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIdmCustomFlag11(JAXBElement<Short> value) {
        this.idmCustomFlag11 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the idmCustomFlag12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIdmCustomFlag12() {
        return idmCustomFlag12;
    }

    /**
     * Sets the value of the idmCustomFlag12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIdmCustomFlag12(JAXBElement<Short> value) {
        this.idmCustomFlag12 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the idmCustomFlag13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIdmCustomFlag13() {
        return idmCustomFlag13;
    }

    /**
     * Sets the value of the idmCustomFlag13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIdmCustomFlag13(JAXBElement<Short> value) {
        this.idmCustomFlag13 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the idmCustomFlag14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIdmCustomFlag14() {
        return idmCustomFlag14;
    }

    /**
     * Sets the value of the idmCustomFlag14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIdmCustomFlag14(JAXBElement<Short> value) {
        this.idmCustomFlag14 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the idmCustomFlag15 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIdmCustomFlag15() {
        return idmCustomFlag15;
    }

    /**
     * Sets the value of the idmCustomFlag15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIdmCustomFlag15(JAXBElement<Short> value) {
        this.idmCustomFlag15 = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the idmCustomDate01 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomDate01() {
        return idmCustomDate01;
    }

    /**
     * Sets the value of the idmCustomDate01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomDate01(JAXBElement<String> value) {
        this.idmCustomDate01 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomDate02 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomDate02() {
        return idmCustomDate02;
    }

    /**
     * Sets the value of the idmCustomDate02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomDate02(JAXBElement<String> value) {
        this.idmCustomDate02 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomDate03 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomDate03() {
        return idmCustomDate03;
    }

    /**
     * Sets the value of the idmCustomDate03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomDate03(JAXBElement<String> value) {
        this.idmCustomDate03 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomDate04 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomDate04() {
        return idmCustomDate04;
    }

    /**
     * Sets the value of the idmCustomDate04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomDate04(JAXBElement<String> value) {
        this.idmCustomDate04 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomDate05 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomDate05() {
        return idmCustomDate05;
    }

    /**
     * Sets the value of the idmCustomDate05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomDate05(JAXBElement<String> value) {
        this.idmCustomDate05 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomDate06 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomDate06() {
        return idmCustomDate06;
    }

    /**
     * Sets the value of the idmCustomDate06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomDate06(JAXBElement<String> value) {
        this.idmCustomDate06 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomDate07 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomDate07() {
        return idmCustomDate07;
    }

    /**
     * Sets the value of the idmCustomDate07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomDate07(JAXBElement<String> value) {
        this.idmCustomDate07 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomDate08 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomDate08() {
        return idmCustomDate08;
    }

    /**
     * Sets the value of the idmCustomDate08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomDate08(JAXBElement<String> value) {
        this.idmCustomDate08 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomDate09 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomDate09() {
        return idmCustomDate09;
    }

    /**
     * Sets the value of the idmCustomDate09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomDate09(JAXBElement<String> value) {
        this.idmCustomDate09 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomDate10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomDate10() {
        return idmCustomDate10;
    }

    /**
     * Sets the value of the idmCustomDate10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomDate10(JAXBElement<String> value) {
        this.idmCustomDate10 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomDate11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomDate11() {
        return idmCustomDate11;
    }

    /**
     * Sets the value of the idmCustomDate11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomDate11(JAXBElement<String> value) {
        this.idmCustomDate11 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomDate12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomDate12() {
        return idmCustomDate12;
    }

    /**
     * Sets the value of the idmCustomDate12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomDate12(JAXBElement<String> value) {
        this.idmCustomDate12 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomDate13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomDate13() {
        return idmCustomDate13;
    }

    /**
     * Sets the value of the idmCustomDate13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomDate13(JAXBElement<String> value) {
        this.idmCustomDate13 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomDate14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomDate14() {
        return idmCustomDate14;
    }

    /**
     * Sets the value of the idmCustomDate14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomDate14(JAXBElement<String> value) {
        this.idmCustomDate14 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomDate15 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomDate15() {
        return idmCustomDate15;
    }

    /**
     * Sets the value of the idmCustomDate15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomDate15(JAXBElement<String> value) {
        this.idmCustomDate15 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomCurrency01 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIdmCustomCurrency01() {
        return idmCustomCurrency01;
    }

    /**
     * Sets the value of the idmCustomCurrency01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIdmCustomCurrency01(JAXBElement<BigDecimal> value) {
        this.idmCustomCurrency01 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the idmCustomCurrency02 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIdmCustomCurrency02() {
        return idmCustomCurrency02;
    }

    /**
     * Sets the value of the idmCustomCurrency02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIdmCustomCurrency02(JAXBElement<BigDecimal> value) {
        this.idmCustomCurrency02 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the idmCustomCurrency03 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIdmCustomCurrency03() {
        return idmCustomCurrency03;
    }

    /**
     * Sets the value of the idmCustomCurrency03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIdmCustomCurrency03(JAXBElement<BigDecimal> value) {
        this.idmCustomCurrency03 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the idmCustomCurrency04 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIdmCustomCurrency04() {
        return idmCustomCurrency04;
    }

    /**
     * Sets the value of the idmCustomCurrency04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIdmCustomCurrency04(JAXBElement<BigDecimal> value) {
        this.idmCustomCurrency04 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the idmCustomCurrency05 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIdmCustomCurrency05() {
        return idmCustomCurrency05;
    }

    /**
     * Sets the value of the idmCustomCurrency05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIdmCustomCurrency05(JAXBElement<BigDecimal> value) {
        this.idmCustomCurrency05 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the idmCustomCurrency06 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIdmCustomCurrency06() {
        return idmCustomCurrency06;
    }

    /**
     * Sets the value of the idmCustomCurrency06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIdmCustomCurrency06(JAXBElement<BigDecimal> value) {
        this.idmCustomCurrency06 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the idmCustomCurrency07 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIdmCustomCurrency07() {
        return idmCustomCurrency07;
    }

    /**
     * Sets the value of the idmCustomCurrency07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIdmCustomCurrency07(JAXBElement<BigDecimal> value) {
        this.idmCustomCurrency07 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the idmCustomCurrency08 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIdmCustomCurrency08() {
        return idmCustomCurrency08;
    }

    /**
     * Sets the value of the idmCustomCurrency08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIdmCustomCurrency08(JAXBElement<BigDecimal> value) {
        this.idmCustomCurrency08 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the idmCustomCurrency09 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIdmCustomCurrency09() {
        return idmCustomCurrency09;
    }

    /**
     * Sets the value of the idmCustomCurrency09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIdmCustomCurrency09(JAXBElement<BigDecimal> value) {
        this.idmCustomCurrency09 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the idmCustomCurrency10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIdmCustomCurrency10() {
        return idmCustomCurrency10;
    }

    /**
     * Sets the value of the idmCustomCurrency10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIdmCustomCurrency10(JAXBElement<BigDecimal> value) {
        this.idmCustomCurrency10 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the idmCustomCurrency11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIdmCustomCurrency11() {
        return idmCustomCurrency11;
    }

    /**
     * Sets the value of the idmCustomCurrency11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIdmCustomCurrency11(JAXBElement<BigDecimal> value) {
        this.idmCustomCurrency11 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the idmCustomCurrency12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIdmCustomCurrency12() {
        return idmCustomCurrency12;
    }

    /**
     * Sets the value of the idmCustomCurrency12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIdmCustomCurrency12(JAXBElement<BigDecimal> value) {
        this.idmCustomCurrency12 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the idmCustomCurrency13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIdmCustomCurrency13() {
        return idmCustomCurrency13;
    }

    /**
     * Sets the value of the idmCustomCurrency13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIdmCustomCurrency13(JAXBElement<BigDecimal> value) {
        this.idmCustomCurrency13 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the idmCustomCurrency14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIdmCustomCurrency14() {
        return idmCustomCurrency14;
    }

    /**
     * Sets the value of the idmCustomCurrency14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIdmCustomCurrency14(JAXBElement<BigDecimal> value) {
        this.idmCustomCurrency14 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the idmCustomCurrency15 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIdmCustomCurrency15() {
        return idmCustomCurrency15;
    }

    /**
     * Sets the value of the idmCustomCurrency15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIdmCustomCurrency15(JAXBElement<BigDecimal> value) {
        this.idmCustomCurrency15 = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the idmCustomInteger01 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdmCustomInteger01() {
        return idmCustomInteger01;
    }

    /**
     * Sets the value of the idmCustomInteger01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdmCustomInteger01(JAXBElement<Integer> value) {
        this.idmCustomInteger01 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the idmCustomInteger02 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdmCustomInteger02() {
        return idmCustomInteger02;
    }

    /**
     * Sets the value of the idmCustomInteger02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdmCustomInteger02(JAXBElement<Integer> value) {
        this.idmCustomInteger02 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the idmCustomInteger03 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdmCustomInteger03() {
        return idmCustomInteger03;
    }

    /**
     * Sets the value of the idmCustomInteger03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdmCustomInteger03(JAXBElement<Integer> value) {
        this.idmCustomInteger03 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the idmCustomInteger04 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdmCustomInteger04() {
        return idmCustomInteger04;
    }

    /**
     * Sets the value of the idmCustomInteger04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdmCustomInteger04(JAXBElement<Integer> value) {
        this.idmCustomInteger04 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the idmCustomInteger05 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdmCustomInteger05() {
        return idmCustomInteger05;
    }

    /**
     * Sets the value of the idmCustomInteger05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdmCustomInteger05(JAXBElement<Integer> value) {
        this.idmCustomInteger05 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the idmCustomInteger06 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdmCustomInteger06() {
        return idmCustomInteger06;
    }

    /**
     * Sets the value of the idmCustomInteger06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdmCustomInteger06(JAXBElement<Integer> value) {
        this.idmCustomInteger06 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the idmCustomInteger07 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdmCustomInteger07() {
        return idmCustomInteger07;
    }

    /**
     * Sets the value of the idmCustomInteger07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdmCustomInteger07(JAXBElement<Integer> value) {
        this.idmCustomInteger07 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the idmCustomInteger08 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdmCustomInteger08() {
        return idmCustomInteger08;
    }

    /**
     * Sets the value of the idmCustomInteger08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdmCustomInteger08(JAXBElement<Integer> value) {
        this.idmCustomInteger08 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the idmCustomInteger09 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdmCustomInteger09() {
        return idmCustomInteger09;
    }

    /**
     * Sets the value of the idmCustomInteger09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdmCustomInteger09(JAXBElement<Integer> value) {
        this.idmCustomInteger09 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the idmCustomInteger10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdmCustomInteger10() {
        return idmCustomInteger10;
    }

    /**
     * Sets the value of the idmCustomInteger10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdmCustomInteger10(JAXBElement<Integer> value) {
        this.idmCustomInteger10 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the idmCustomInteger11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdmCustomInteger11() {
        return idmCustomInteger11;
    }

    /**
     * Sets the value of the idmCustomInteger11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdmCustomInteger11(JAXBElement<Integer> value) {
        this.idmCustomInteger11 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the idmCustomInteger12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdmCustomInteger12() {
        return idmCustomInteger12;
    }

    /**
     * Sets the value of the idmCustomInteger12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdmCustomInteger12(JAXBElement<Integer> value) {
        this.idmCustomInteger12 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the idmCustomInteger13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdmCustomInteger13() {
        return idmCustomInteger13;
    }

    /**
     * Sets the value of the idmCustomInteger13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdmCustomInteger13(JAXBElement<Integer> value) {
        this.idmCustomInteger13 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the idmCustomInteger14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdmCustomInteger14() {
        return idmCustomInteger14;
    }

    /**
     * Sets the value of the idmCustomInteger14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdmCustomInteger14(JAXBElement<Integer> value) {
        this.idmCustomInteger14 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the idmCustomInteger15 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdmCustomInteger15() {
        return idmCustomInteger15;
    }

    /**
     * Sets the value of the idmCustomInteger15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdmCustomInteger15(JAXBElement<Integer> value) {
        this.idmCustomInteger15 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the idmCustomString01 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomString01() {
        return idmCustomString01;
    }

    /**
     * Sets the value of the idmCustomString01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomString01(JAXBElement<String> value) {
        this.idmCustomString01 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomString02 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomString02() {
        return idmCustomString02;
    }

    /**
     * Sets the value of the idmCustomString02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomString02(JAXBElement<String> value) {
        this.idmCustomString02 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomString03 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomString03() {
        return idmCustomString03;
    }

    /**
     * Sets the value of the idmCustomString03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomString03(JAXBElement<String> value) {
        this.idmCustomString03 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomString04 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomString04() {
        return idmCustomString04;
    }

    /**
     * Sets the value of the idmCustomString04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomString04(JAXBElement<String> value) {
        this.idmCustomString04 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomString05 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomString05() {
        return idmCustomString05;
    }

    /**
     * Sets the value of the idmCustomString05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomString05(JAXBElement<String> value) {
        this.idmCustomString05 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomString06 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomString06() {
        return idmCustomString06;
    }

    /**
     * Sets the value of the idmCustomString06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomString06(JAXBElement<String> value) {
        this.idmCustomString06 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomString07 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomString07() {
        return idmCustomString07;
    }

    /**
     * Sets the value of the idmCustomString07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomString07(JAXBElement<String> value) {
        this.idmCustomString07 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomString08 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomString08() {
        return idmCustomString08;
    }

    /**
     * Sets the value of the idmCustomString08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomString08(JAXBElement<String> value) {
        this.idmCustomString08 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomString09 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomString09() {
        return idmCustomString09;
    }

    /**
     * Sets the value of the idmCustomString09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomString09(JAXBElement<String> value) {
        this.idmCustomString09 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomString10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomString10() {
        return idmCustomString10;
    }

    /**
     * Sets the value of the idmCustomString10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomString10(JAXBElement<String> value) {
        this.idmCustomString10 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomString11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomString11() {
        return idmCustomString11;
    }

    /**
     * Sets the value of the idmCustomString11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomString11(JAXBElement<String> value) {
        this.idmCustomString11 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomString12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomString12() {
        return idmCustomString12;
    }

    /**
     * Sets the value of the idmCustomString12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomString12(JAXBElement<String> value) {
        this.idmCustomString12 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomString13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomString13() {
        return idmCustomString13;
    }

    /**
     * Sets the value of the idmCustomString13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomString13(JAXBElement<String> value) {
        this.idmCustomString13 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomString14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomString14() {
        return idmCustomString14;
    }

    /**
     * Sets the value of the idmCustomString14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomString14(JAXBElement<String> value) {
        this.idmCustomString14 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomString15 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomString15() {
        return idmCustomString15;
    }

    /**
     * Sets the value of the idmCustomString15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomString15(JAXBElement<String> value) {
        this.idmCustomString15 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomText01 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomText01() {
        return idmCustomText01;
    }

    /**
     * Sets the value of the idmCustomText01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomText01(JAXBElement<String> value) {
        this.idmCustomText01 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomText02 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomText02() {
        return idmCustomText02;
    }

    /**
     * Sets the value of the idmCustomText02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomText02(JAXBElement<String> value) {
        this.idmCustomText02 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomText03 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomText03() {
        return idmCustomText03;
    }

    /**
     * Sets the value of the idmCustomText03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomText03(JAXBElement<String> value) {
        this.idmCustomText03 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomText04 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomText04() {
        return idmCustomText04;
    }

    /**
     * Sets the value of the idmCustomText04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomText04(JAXBElement<String> value) {
        this.idmCustomText04 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomText05 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomText05() {
        return idmCustomText05;
    }

    /**
     * Sets the value of the idmCustomText05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomText05(JAXBElement<String> value) {
        this.idmCustomText05 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomText06 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomText06() {
        return idmCustomText06;
    }

    /**
     * Sets the value of the idmCustomText06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomText06(JAXBElement<String> value) {
        this.idmCustomText06 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomText07 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomText07() {
        return idmCustomText07;
    }

    /**
     * Sets the value of the idmCustomText07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomText07(JAXBElement<String> value) {
        this.idmCustomText07 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomText08 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomText08() {
        return idmCustomText08;
    }

    /**
     * Sets the value of the idmCustomText08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomText08(JAXBElement<String> value) {
        this.idmCustomText08 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomText09 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomText09() {
        return idmCustomText09;
    }

    /**
     * Sets the value of the idmCustomText09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomText09(JAXBElement<String> value) {
        this.idmCustomText09 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomText10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomText10() {
        return idmCustomText10;
    }

    /**
     * Sets the value of the idmCustomText10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomText10(JAXBElement<String> value) {
        this.idmCustomText10 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomText11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomText11() {
        return idmCustomText11;
    }

    /**
     * Sets the value of the idmCustomText11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomText11(JAXBElement<String> value) {
        this.idmCustomText11 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomText12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomText12() {
        return idmCustomText12;
    }

    /**
     * Sets the value of the idmCustomText12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomText12(JAXBElement<String> value) {
        this.idmCustomText12 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomText13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomText13() {
        return idmCustomText13;
    }

    /**
     * Sets the value of the idmCustomText13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomText13(JAXBElement<String> value) {
        this.idmCustomText13 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomText14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomText14() {
        return idmCustomText14;
    }

    /**
     * Sets the value of the idmCustomText14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomText14(JAXBElement<String> value) {
        this.idmCustomText14 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCustomText15 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCustomText15() {
        return idmCustomText15;
    }

    /**
     * Sets the value of the idmCustomText15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCustomText15(JAXBElement<String> value) {
        this.idmCustomText15 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmKeyExt() {
        return idmKeyExt;
    }

    /**
     * Sets the value of the idmKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmKeyExt(JAXBElement<String> value) {
        this.idmKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idmCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmCstKey() {
        return idmCstKey;
    }

    /**
     * Sets the value of the idmCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmCstKey(JAXBElement<String> value) {
        this.idmCstKey = ((JAXBElement<String> ) value);
    }

}
