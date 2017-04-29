
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Committee_Committee_Participant_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_Committee_Participant_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cmc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmc_start_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cmc_end_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cmc_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmc_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cmc_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cmc_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cmc_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cmc_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cmc_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmc_status" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="cmc_cmt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmc_voting_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cmc_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmc_cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmc_eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmc_cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmc_url_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmc_pref_comm_meth" type="{http://www.avectra.com/2005/}stringLength10_Type" minOccurs="0"/>
 *         &lt;element name="cmc_rank" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cmc_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmc_funded_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cmc_status_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cmc_cop_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmc_nom_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmc_renewable_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cmc_csu_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Committee_Committee_Participant_DataObjectType", propOrder = {
    "cmcKey",
    "cmcStartDate",
    "cmcEndDate",
    "cmcCstKey",
    "cmcAddDate",
    "cmcAddUser",
    "cmcChangeDate",
    "cmcChangeUser",
    "cmcDeleteFlag",
    "cmcKeyExt",
    "cmcStatus",
    "cmcCmtKey",
    "cmcVotingFlag",
    "cmcCxaKey",
    "cmcCphKey",
    "cmcEmlKey",
    "cmcCfxKey",
    "cmcUrlKey",
    "cmcPrefCommMeth",
    "cmcRank",
    "cmcEntityKey",
    "cmcFundedFlag",
    "cmcStatusDate",
    "cmcCopKey",
    "cmcNomKey",
    "cmcRenewableFlag",
    "cmcCsuKey"
})
public class CommitteeCommitteeParticipantDataObjectType {

    @XmlElementRef(name = "cmc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmcKey;
    @XmlElementRef(name = "cmc_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmcStartDate;
    @XmlElementRef(name = "cmc_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmcEndDate;
    @XmlElementRef(name = "cmc_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmcCstKey;
    @XmlElementRef(name = "cmc_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmcAddDate;
    @XmlElementRef(name = "cmc_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmcAddUser;
    @XmlElementRef(name = "cmc_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmcChangeDate;
    @XmlElementRef(name = "cmc_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmcChangeUser;
    @XmlElementRef(name = "cmc_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cmcDeleteFlag;
    @XmlElementRef(name = "cmc_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmcKeyExt;
    @XmlElementRef(name = "cmc_status", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmcStatus;
    @XmlElementRef(name = "cmc_cmt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmcCmtKey;
    @XmlElementRef(name = "cmc_voting_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cmcVotingFlag;
    @XmlElementRef(name = "cmc_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmcCxaKey;
    @XmlElementRef(name = "cmc_cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmcCphKey;
    @XmlElementRef(name = "cmc_eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmcEmlKey;
    @XmlElementRef(name = "cmc_cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmcCfxKey;
    @XmlElementRef(name = "cmc_url_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmcUrlKey;
    @XmlElementRef(name = "cmc_pref_comm_meth", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmcPrefCommMeth;
    @XmlElementRef(name = "cmc_rank", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> cmcRank;
    @XmlElementRef(name = "cmc_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmcEntityKey;
    @XmlElementRef(name = "cmc_funded_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cmcFundedFlag;
    @XmlElementRef(name = "cmc_status_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmcStatusDate;
    @XmlElementRef(name = "cmc_cop_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmcCopKey;
    @XmlElementRef(name = "cmc_nom_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmcNomKey;
    @XmlElementRef(name = "cmc_renewable_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cmcRenewableFlag;
    @XmlElementRef(name = "cmc_csu_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmcCsuKey;

    /**
     * Gets the value of the cmcKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmcKey() {
        return cmcKey;
    }

    /**
     * Sets the value of the cmcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmcKey(JAXBElement<String> value) {
        this.cmcKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmcStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmcStartDate() {
        return cmcStartDate;
    }

    /**
     * Sets the value of the cmcStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmcStartDate(JAXBElement<String> value) {
        this.cmcStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmcEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmcEndDate() {
        return cmcEndDate;
    }

    /**
     * Sets the value of the cmcEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmcEndDate(JAXBElement<String> value) {
        this.cmcEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmcCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmcCstKey() {
        return cmcCstKey;
    }

    /**
     * Sets the value of the cmcCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmcCstKey(JAXBElement<String> value) {
        this.cmcCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmcAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmcAddDate() {
        return cmcAddDate;
    }

    /**
     * Sets the value of the cmcAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmcAddDate(JAXBElement<String> value) {
        this.cmcAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmcAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmcAddUser() {
        return cmcAddUser;
    }

    /**
     * Sets the value of the cmcAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmcAddUser(JAXBElement<String> value) {
        this.cmcAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmcChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmcChangeDate() {
        return cmcChangeDate;
    }

    /**
     * Sets the value of the cmcChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmcChangeDate(JAXBElement<String> value) {
        this.cmcChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmcChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmcChangeUser() {
        return cmcChangeUser;
    }

    /**
     * Sets the value of the cmcChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmcChangeUser(JAXBElement<String> value) {
        this.cmcChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmcDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCmcDeleteFlag() {
        return cmcDeleteFlag;
    }

    /**
     * Sets the value of the cmcDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCmcDeleteFlag(JAXBElement<Short> value) {
        this.cmcDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cmcKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmcKeyExt() {
        return cmcKeyExt;
    }

    /**
     * Sets the value of the cmcKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmcKeyExt(JAXBElement<String> value) {
        this.cmcKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmcStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmcStatus() {
        return cmcStatus;
    }

    /**
     * Sets the value of the cmcStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmcStatus(JAXBElement<String> value) {
        this.cmcStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmcCmtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmcCmtKey() {
        return cmcCmtKey;
    }

    /**
     * Sets the value of the cmcCmtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmcCmtKey(JAXBElement<String> value) {
        this.cmcCmtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmcVotingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCmcVotingFlag() {
        return cmcVotingFlag;
    }

    /**
     * Sets the value of the cmcVotingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCmcVotingFlag(JAXBElement<Short> value) {
        this.cmcVotingFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cmcCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmcCxaKey() {
        return cmcCxaKey;
    }

    /**
     * Sets the value of the cmcCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmcCxaKey(JAXBElement<String> value) {
        this.cmcCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmcCphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmcCphKey() {
        return cmcCphKey;
    }

    /**
     * Sets the value of the cmcCphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmcCphKey(JAXBElement<String> value) {
        this.cmcCphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmcEmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmcEmlKey() {
        return cmcEmlKey;
    }

    /**
     * Sets the value of the cmcEmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmcEmlKey(JAXBElement<String> value) {
        this.cmcEmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmcCfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmcCfxKey() {
        return cmcCfxKey;
    }

    /**
     * Sets the value of the cmcCfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmcCfxKey(JAXBElement<String> value) {
        this.cmcCfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmcUrlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmcUrlKey() {
        return cmcUrlKey;
    }

    /**
     * Sets the value of the cmcUrlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmcUrlKey(JAXBElement<String> value) {
        this.cmcUrlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmcPrefCommMeth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmcPrefCommMeth() {
        return cmcPrefCommMeth;
    }

    /**
     * Sets the value of the cmcPrefCommMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmcPrefCommMeth(JAXBElement<String> value) {
        this.cmcPrefCommMeth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmcRank property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCmcRank() {
        return cmcRank;
    }

    /**
     * Sets the value of the cmcRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCmcRank(JAXBElement<Integer> value) {
        this.cmcRank = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cmcEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmcEntityKey() {
        return cmcEntityKey;
    }

    /**
     * Sets the value of the cmcEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmcEntityKey(JAXBElement<String> value) {
        this.cmcEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmcFundedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCmcFundedFlag() {
        return cmcFundedFlag;
    }

    /**
     * Sets the value of the cmcFundedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCmcFundedFlag(JAXBElement<Short> value) {
        this.cmcFundedFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cmcStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmcStatusDate() {
        return cmcStatusDate;
    }

    /**
     * Sets the value of the cmcStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmcStatusDate(JAXBElement<String> value) {
        this.cmcStatusDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmcCopKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmcCopKey() {
        return cmcCopKey;
    }

    /**
     * Sets the value of the cmcCopKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmcCopKey(JAXBElement<String> value) {
        this.cmcCopKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmcNomKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmcNomKey() {
        return cmcNomKey;
    }

    /**
     * Sets the value of the cmcNomKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmcNomKey(JAXBElement<String> value) {
        this.cmcNomKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmcRenewableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCmcRenewableFlag() {
        return cmcRenewableFlag;
    }

    /**
     * Sets the value of the cmcRenewableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCmcRenewableFlag(JAXBElement<Short> value) {
        this.cmcRenewableFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cmcCsuKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmcCsuKey() {
        return cmcCsuKey;
    }

    /**
     * Sets the value of the cmcCsuKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmcCsuKey(JAXBElement<String> value) {
        this.cmcCsuKey = ((JAXBElement<String> ) value);
    }

}
