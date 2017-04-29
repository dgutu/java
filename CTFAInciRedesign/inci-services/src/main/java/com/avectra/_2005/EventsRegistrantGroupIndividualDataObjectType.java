
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrantGroup_Individual_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrantGroup_Individual_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ind_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ind_prf_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="ind_first_name" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="ind_mid_name" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="ind_last_name" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="ind_sfx_code" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="ind_designation" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ind_dob" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ind_gender" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="ind_full_name_cp" type="{http://www.avectra.com/2005/}stringLength187_Type" minOccurs="0"/>
 *         &lt;element name="ind_salutation_cp" type="{http://www.avectra.com/2005/}stringLength51_Type" minOccurs="0"/>
 *         &lt;element name="ind_cst_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ind_ssn" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="ind_spouse_name" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="ind_age_cp" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ind_salary" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ind_ethnicity" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ind_badge_name" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="ind_license_number" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="ind_entered_field_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ind_num_years_in_field_cp" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ind_grad_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ind_political_party" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="ind_deceased_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ind_int_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ind_ixo_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ind_marital_status" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="ind_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ind_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ind_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ind_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ind_cst_passcode_ext" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="ind_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ind_sample_multi" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="ind_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ind_maiden_name" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="ind_volunteer_type_ext" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ind_progress_ext" type="{http://www.avectra.com/2005/}stringLength30_Type" minOccurs="0"/>
 *         &lt;element name="ind_ssn_display" type="{http://www.avectra.com/2005/}stringLength11_Type" minOccurs="0"/>
 *         &lt;element name="ind_can_speak_spanish_ext" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ind_aicpa_id" type="{http://www.avectra.com/2005/}stringLength15_Type" minOccurs="0"/>
 *         &lt;element name="ind_national_cosmetology_asso_member_ext" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ind_hair_styling_ext" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ind_head_coverings_ext" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ind_make_up_ext" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ind_nail_care_ext" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ind_skin_care_ext" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ind_wig_styling_ext" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ind_availability_ext" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ind_last_cert_date_ext" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ind_curr_volunteering_ext" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ind_city_ext" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ind_popup" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="ind_state_ext" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ind_frequency_ext" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ind_other_freq_ext" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ind_ttt_attendee_ext" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ind_cst_main_office_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrantGroup_Individual_DataObjectType", propOrder = {
    "indCstKey",
    "indPrfCode",
    "indFirstName",
    "indMidName",
    "indLastName",
    "indSfxCode",
    "indDesignation",
    "indDob",
    "indGender",
    "indFullNameCp",
    "indSalutationCp",
    "indCstKeyExt",
    "indSsn",
    "indSpouseName",
    "indAgeCp",
    "indSalary",
    "indEthnicity",
    "indBadgeName",
    "indLicenseNumber",
    "indEnteredFieldDate",
    "indNumYearsInFieldCp",
    "indGradDate",
    "indPoliticalParty",
    "indDeceasedFlag",
    "indIntCode",
    "indIxoKey",
    "indMaritalStatus",
    "indAddDate",
    "indAddUser",
    "indEntityKey",
    "indChangeDate",
    "indCstPasscodeExt",
    "indChangeUser",
    "indSampleMulti",
    "indDeleteFlag",
    "indMaidenName",
    "indVolunteerTypeExt",
    "indProgressExt",
    "indSsnDisplay",
    "indCanSpeakSpanishExt",
    "indAicpaId",
    "indNationalCosmetologyAssoMemberExt",
    "indHairStylingExt",
    "indHeadCoveringsExt",
    "indMakeUpExt",
    "indNailCareExt",
    "indSkinCareExt",
    "indWigStylingExt",
    "indAvailabilityExt",
    "indLastCertDateExt",
    "indCurrVolunteeringExt",
    "indCityExt",
    "indPopup",
    "indStateExt",
    "indFrequencyExt",
    "indOtherFreqExt",
    "indTttAttendeeExt",
    "indCstMainOfficeCstKey"
})
public class EventsRegistrantGroupIndividualDataObjectType {

    @XmlElementRef(name = "ind_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indCstKey;
    @XmlElementRef(name = "ind_prf_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indPrfCode;
    @XmlElementRef(name = "ind_first_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indFirstName;
    @XmlElementRef(name = "ind_mid_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indMidName;
    @XmlElementRef(name = "ind_last_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indLastName;
    @XmlElementRef(name = "ind_sfx_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indSfxCode;
    @XmlElementRef(name = "ind_designation", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indDesignation;
    @XmlElementRef(name = "ind_dob", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indDob;
    @XmlElementRef(name = "ind_gender", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indGender;
    @XmlElementRef(name = "ind_full_name_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indFullNameCp;
    @XmlElementRef(name = "ind_salutation_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indSalutationCp;
    @XmlElementRef(name = "ind_cst_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indCstKeyExt;
    @XmlElementRef(name = "ind_ssn", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indSsn;
    @XmlElementRef(name = "ind_spouse_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indSpouseName;
    @XmlElementRef(name = "ind_age_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> indAgeCp;
    @XmlElementRef(name = "ind_salary", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> indSalary;
    @XmlElementRef(name = "ind_ethnicity", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indEthnicity;
    @XmlElementRef(name = "ind_badge_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indBadgeName;
    @XmlElementRef(name = "ind_license_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indLicenseNumber;
    @XmlElementRef(name = "ind_entered_field_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indEnteredFieldDate;
    @XmlElementRef(name = "ind_num_years_in_field_cp", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> indNumYearsInFieldCp;
    @XmlElementRef(name = "ind_grad_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indGradDate;
    @XmlElementRef(name = "ind_political_party", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indPoliticalParty;
    @XmlElementRef(name = "ind_deceased_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> indDeceasedFlag;
    @XmlElementRef(name = "ind_int_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indIntCode;
    @XmlElementRef(name = "ind_ixo_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indIxoKey;
    @XmlElementRef(name = "ind_marital_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indMaritalStatus;
    @XmlElementRef(name = "ind_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indAddDate;
    @XmlElementRef(name = "ind_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indAddUser;
    @XmlElementRef(name = "ind_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indEntityKey;
    @XmlElementRef(name = "ind_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indChangeDate;
    @XmlElementRef(name = "ind_cst_passcode_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indCstPasscodeExt;
    @XmlElementRef(name = "ind_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indChangeUser;
    @XmlElementRef(name = "ind_sample_multi", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indSampleMulti;
    @XmlElementRef(name = "ind_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> indDeleteFlag;
    @XmlElementRef(name = "ind_maiden_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indMaidenName;
    @XmlElementRef(name = "ind_volunteer_type_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indVolunteerTypeExt;
    @XmlElementRef(name = "ind_progress_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indProgressExt;
    @XmlElementRef(name = "ind_ssn_display", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indSsnDisplay;
    @XmlElementRef(name = "ind_can_speak_spanish_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> indCanSpeakSpanishExt;
    @XmlElementRef(name = "ind_aicpa_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indAicpaId;
    @XmlElementRef(name = "ind_national_cosmetology_asso_member_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> indNationalCosmetologyAssoMemberExt;
    @XmlElementRef(name = "ind_hair_styling_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> indHairStylingExt;
    @XmlElementRef(name = "ind_head_coverings_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> indHeadCoveringsExt;
    @XmlElementRef(name = "ind_make_up_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> indMakeUpExt;
    @XmlElementRef(name = "ind_nail_care_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> indNailCareExt;
    @XmlElementRef(name = "ind_skin_care_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> indSkinCareExt;
    @XmlElementRef(name = "ind_wig_styling_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> indWigStylingExt;
    @XmlElementRef(name = "ind_availability_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indAvailabilityExt;
    @XmlElementRef(name = "ind_last_cert_date_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indLastCertDateExt;
    @XmlElementRef(name = "ind_curr_volunteering_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> indCurrVolunteeringExt;
    @XmlElementRef(name = "ind_city_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indCityExt;
    @XmlElementRef(name = "ind_popup", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indPopup;
    @XmlElementRef(name = "ind_state_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indStateExt;
    @XmlElementRef(name = "ind_frequency_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indFrequencyExt;
    @XmlElementRef(name = "ind_other_freq_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indOtherFreqExt;
    @XmlElementRef(name = "ind_ttt_attendee_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> indTttAttendeeExt;
    @XmlElementRef(name = "ind_cst_main_office_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> indCstMainOfficeCstKey;

    /**
     * Gets the value of the indCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndCstKey() {
        return indCstKey;
    }

    /**
     * Sets the value of the indCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndCstKey(JAXBElement<String> value) {
        this.indCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indPrfCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndPrfCode() {
        return indPrfCode;
    }

    /**
     * Sets the value of the indPrfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndPrfCode(JAXBElement<String> value) {
        this.indPrfCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndFirstName() {
        return indFirstName;
    }

    /**
     * Sets the value of the indFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndFirstName(JAXBElement<String> value) {
        this.indFirstName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indMidName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndMidName() {
        return indMidName;
    }

    /**
     * Sets the value of the indMidName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndMidName(JAXBElement<String> value) {
        this.indMidName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndLastName() {
        return indLastName;
    }

    /**
     * Sets the value of the indLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndLastName(JAXBElement<String> value) {
        this.indLastName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indSfxCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndSfxCode() {
        return indSfxCode;
    }

    /**
     * Sets the value of the indSfxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndSfxCode(JAXBElement<String> value) {
        this.indSfxCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndDesignation() {
        return indDesignation;
    }

    /**
     * Sets the value of the indDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndDesignation(JAXBElement<String> value) {
        this.indDesignation = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indDob property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndDob() {
        return indDob;
    }

    /**
     * Sets the value of the indDob property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndDob(JAXBElement<String> value) {
        this.indDob = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indGender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndGender() {
        return indGender;
    }

    /**
     * Sets the value of the indGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndGender(JAXBElement<String> value) {
        this.indGender = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indFullNameCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndFullNameCp() {
        return indFullNameCp;
    }

    /**
     * Sets the value of the indFullNameCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndFullNameCp(JAXBElement<String> value) {
        this.indFullNameCp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indSalutationCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndSalutationCp() {
        return indSalutationCp;
    }

    /**
     * Sets the value of the indSalutationCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndSalutationCp(JAXBElement<String> value) {
        this.indSalutationCp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indCstKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndCstKeyExt() {
        return indCstKeyExt;
    }

    /**
     * Sets the value of the indCstKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndCstKeyExt(JAXBElement<String> value) {
        this.indCstKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indSsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndSsn() {
        return indSsn;
    }

    /**
     * Sets the value of the indSsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndSsn(JAXBElement<String> value) {
        this.indSsn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indSpouseName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndSpouseName() {
        return indSpouseName;
    }

    /**
     * Sets the value of the indSpouseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndSpouseName(JAXBElement<String> value) {
        this.indSpouseName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indAgeCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIndAgeCp() {
        return indAgeCp;
    }

    /**
     * Sets the value of the indAgeCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIndAgeCp(JAXBElement<Integer> value) {
        this.indAgeCp = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the indSalary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIndSalary() {
        return indSalary;
    }

    /**
     * Sets the value of the indSalary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIndSalary(JAXBElement<BigDecimal> value) {
        this.indSalary = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the indEthnicity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndEthnicity() {
        return indEthnicity;
    }

    /**
     * Sets the value of the indEthnicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndEthnicity(JAXBElement<String> value) {
        this.indEthnicity = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indBadgeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndBadgeName() {
        return indBadgeName;
    }

    /**
     * Sets the value of the indBadgeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndBadgeName(JAXBElement<String> value) {
        this.indBadgeName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndLicenseNumber() {
        return indLicenseNumber;
    }

    /**
     * Sets the value of the indLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndLicenseNumber(JAXBElement<String> value) {
        this.indLicenseNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indEnteredFieldDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndEnteredFieldDate() {
        return indEnteredFieldDate;
    }

    /**
     * Sets the value of the indEnteredFieldDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndEnteredFieldDate(JAXBElement<String> value) {
        this.indEnteredFieldDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indNumYearsInFieldCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIndNumYearsInFieldCp() {
        return indNumYearsInFieldCp;
    }

    /**
     * Sets the value of the indNumYearsInFieldCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIndNumYearsInFieldCp(JAXBElement<Integer> value) {
        this.indNumYearsInFieldCp = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the indGradDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndGradDate() {
        return indGradDate;
    }

    /**
     * Sets the value of the indGradDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndGradDate(JAXBElement<String> value) {
        this.indGradDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indPoliticalParty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndPoliticalParty() {
        return indPoliticalParty;
    }

    /**
     * Sets the value of the indPoliticalParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndPoliticalParty(JAXBElement<String> value) {
        this.indPoliticalParty = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indDeceasedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndDeceasedFlag() {
        return indDeceasedFlag;
    }

    /**
     * Sets the value of the indDeceasedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndDeceasedFlag(JAXBElement<Short> value) {
        this.indDeceasedFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the indIntCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndIntCode() {
        return indIntCode;
    }

    /**
     * Sets the value of the indIntCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndIntCode(JAXBElement<String> value) {
        this.indIntCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indIxoKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndIxoKey() {
        return indIxoKey;
    }

    /**
     * Sets the value of the indIxoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndIxoKey(JAXBElement<String> value) {
        this.indIxoKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indMaritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndMaritalStatus() {
        return indMaritalStatus;
    }

    /**
     * Sets the value of the indMaritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndMaritalStatus(JAXBElement<String> value) {
        this.indMaritalStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndAddDate() {
        return indAddDate;
    }

    /**
     * Sets the value of the indAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndAddDate(JAXBElement<String> value) {
        this.indAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndAddUser() {
        return indAddUser;
    }

    /**
     * Sets the value of the indAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndAddUser(JAXBElement<String> value) {
        this.indAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndEntityKey() {
        return indEntityKey;
    }

    /**
     * Sets the value of the indEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndEntityKey(JAXBElement<String> value) {
        this.indEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndChangeDate() {
        return indChangeDate;
    }

    /**
     * Sets the value of the indChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndChangeDate(JAXBElement<String> value) {
        this.indChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indCstPasscodeExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndCstPasscodeExt() {
        return indCstPasscodeExt;
    }

    /**
     * Sets the value of the indCstPasscodeExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndCstPasscodeExt(JAXBElement<String> value) {
        this.indCstPasscodeExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndChangeUser() {
        return indChangeUser;
    }

    /**
     * Sets the value of the indChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndChangeUser(JAXBElement<String> value) {
        this.indChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indSampleMulti property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndSampleMulti() {
        return indSampleMulti;
    }

    /**
     * Sets the value of the indSampleMulti property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndSampleMulti(JAXBElement<String> value) {
        this.indSampleMulti = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndDeleteFlag() {
        return indDeleteFlag;
    }

    /**
     * Sets the value of the indDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndDeleteFlag(JAXBElement<Short> value) {
        this.indDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the indMaidenName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndMaidenName() {
        return indMaidenName;
    }

    /**
     * Sets the value of the indMaidenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndMaidenName(JAXBElement<String> value) {
        this.indMaidenName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indVolunteerTypeExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndVolunteerTypeExt() {
        return indVolunteerTypeExt;
    }

    /**
     * Sets the value of the indVolunteerTypeExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndVolunteerTypeExt(JAXBElement<String> value) {
        this.indVolunteerTypeExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indProgressExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndProgressExt() {
        return indProgressExt;
    }

    /**
     * Sets the value of the indProgressExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndProgressExt(JAXBElement<String> value) {
        this.indProgressExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indSsnDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndSsnDisplay() {
        return indSsnDisplay;
    }

    /**
     * Sets the value of the indSsnDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndSsnDisplay(JAXBElement<String> value) {
        this.indSsnDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indCanSpeakSpanishExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndCanSpeakSpanishExt() {
        return indCanSpeakSpanishExt;
    }

    /**
     * Sets the value of the indCanSpeakSpanishExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndCanSpeakSpanishExt(JAXBElement<Short> value) {
        this.indCanSpeakSpanishExt = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the indAicpaId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndAicpaId() {
        return indAicpaId;
    }

    /**
     * Sets the value of the indAicpaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndAicpaId(JAXBElement<String> value) {
        this.indAicpaId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indNationalCosmetologyAssoMemberExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndNationalCosmetologyAssoMemberExt() {
        return indNationalCosmetologyAssoMemberExt;
    }

    /**
     * Sets the value of the indNationalCosmetologyAssoMemberExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndNationalCosmetologyAssoMemberExt(JAXBElement<Short> value) {
        this.indNationalCosmetologyAssoMemberExt = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the indHairStylingExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndHairStylingExt() {
        return indHairStylingExt;
    }

    /**
     * Sets the value of the indHairStylingExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndHairStylingExt(JAXBElement<Short> value) {
        this.indHairStylingExt = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the indHeadCoveringsExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndHeadCoveringsExt() {
        return indHeadCoveringsExt;
    }

    /**
     * Sets the value of the indHeadCoveringsExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndHeadCoveringsExt(JAXBElement<Short> value) {
        this.indHeadCoveringsExt = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the indMakeUpExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndMakeUpExt() {
        return indMakeUpExt;
    }

    /**
     * Sets the value of the indMakeUpExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndMakeUpExt(JAXBElement<Short> value) {
        this.indMakeUpExt = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the indNailCareExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndNailCareExt() {
        return indNailCareExt;
    }

    /**
     * Sets the value of the indNailCareExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndNailCareExt(JAXBElement<Short> value) {
        this.indNailCareExt = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the indSkinCareExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndSkinCareExt() {
        return indSkinCareExt;
    }

    /**
     * Sets the value of the indSkinCareExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndSkinCareExt(JAXBElement<Short> value) {
        this.indSkinCareExt = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the indWigStylingExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndWigStylingExt() {
        return indWigStylingExt;
    }

    /**
     * Sets the value of the indWigStylingExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndWigStylingExt(JAXBElement<Short> value) {
        this.indWigStylingExt = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the indAvailabilityExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndAvailabilityExt() {
        return indAvailabilityExt;
    }

    /**
     * Sets the value of the indAvailabilityExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndAvailabilityExt(JAXBElement<String> value) {
        this.indAvailabilityExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indLastCertDateExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndLastCertDateExt() {
        return indLastCertDateExt;
    }

    /**
     * Sets the value of the indLastCertDateExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndLastCertDateExt(JAXBElement<String> value) {
        this.indLastCertDateExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indCurrVolunteeringExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndCurrVolunteeringExt() {
        return indCurrVolunteeringExt;
    }

    /**
     * Sets the value of the indCurrVolunteeringExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndCurrVolunteeringExt(JAXBElement<Short> value) {
        this.indCurrVolunteeringExt = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the indCityExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndCityExt() {
        return indCityExt;
    }

    /**
     * Sets the value of the indCityExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndCityExt(JAXBElement<String> value) {
        this.indCityExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indPopup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndPopup() {
        return indPopup;
    }

    /**
     * Sets the value of the indPopup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndPopup(JAXBElement<String> value) {
        this.indPopup = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indStateExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndStateExt() {
        return indStateExt;
    }

    /**
     * Sets the value of the indStateExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndStateExt(JAXBElement<String> value) {
        this.indStateExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indFrequencyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndFrequencyExt() {
        return indFrequencyExt;
    }

    /**
     * Sets the value of the indFrequencyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndFrequencyExt(JAXBElement<String> value) {
        this.indFrequencyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indOtherFreqExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndOtherFreqExt() {
        return indOtherFreqExt;
    }

    /**
     * Sets the value of the indOtherFreqExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndOtherFreqExt(JAXBElement<String> value) {
        this.indOtherFreqExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indTttAttendeeExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndTttAttendeeExt() {
        return indTttAttendeeExt;
    }

    /**
     * Sets the value of the indTttAttendeeExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndTttAttendeeExt(JAXBElement<Short> value) {
        this.indTttAttendeeExt = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the indCstMainOfficeCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndCstMainOfficeCstKey() {
        return indCstMainOfficeCstKey;
    }

    /**
     * Sets the value of the indCstMainOfficeCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndCstMainOfficeCstKey(JAXBElement<String> value) {
        this.indCstMainOfficeCstKey = ((JAXBElement<String> ) value);
    }

}
