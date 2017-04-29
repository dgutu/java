
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Product_Code_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Product_Code_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fpc_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="fpc_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="fpc_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="fpc_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="fpc_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="fpc_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="fpc_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="fpc_fun_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="fpc_cmp_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="fpc_apl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="fpc_pck_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="fpc_track_recognition_level_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="fpc_event_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="fpc_prd_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="fpc_funds_raised" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="fpc_funds_goal" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="fpc_start_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="fpc_end_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="fpc_notes" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="fpc_active_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Product_Code_DataObjectType", propOrder = {
    "fpcAddUser",
    "fpcAddDate",
    "fpcChangeUser",
    "fpcChangeDate",
    "fpcDeleteFlag",
    "fpcEntityKey",
    "fpcPrdKey",
    "fpcFunKey",
    "fpcCmpKey",
    "fpcAplKey",
    "fpcPckKey",
    "fpcTrackRecognitionLevelFlag",
    "fpcEventFlag",
    "fpcPrdKeyExt",
    "fpcFundsRaised",
    "fpcFundsGoal",
    "fpcStartDate",
    "fpcEndDate",
    "fpcNotes",
    "fpcActiveFlag"
})
public class FundraisingGiftProductCodeDataObjectType {

    @XmlElementRef(name = "fpc_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fpcAddUser;
    @XmlElementRef(name = "fpc_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fpcAddDate;
    @XmlElementRef(name = "fpc_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fpcChangeUser;
    @XmlElementRef(name = "fpc_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fpcChangeDate;
    @XmlElementRef(name = "fpc_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> fpcDeleteFlag;
    @XmlElementRef(name = "fpc_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fpcEntityKey;
    @XmlElementRef(name = "fpc_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fpcPrdKey;
    @XmlElementRef(name = "fpc_fun_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fpcFunKey;
    @XmlElementRef(name = "fpc_cmp_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fpcCmpKey;
    @XmlElementRef(name = "fpc_apl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fpcAplKey;
    @XmlElementRef(name = "fpc_pck_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fpcPckKey;
    @XmlElementRef(name = "fpc_track_recognition_level_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> fpcTrackRecognitionLevelFlag;
    @XmlElementRef(name = "fpc_event_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> fpcEventFlag;
    @XmlElementRef(name = "fpc_prd_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fpcPrdKeyExt;
    @XmlElementRef(name = "fpc_funds_raised", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> fpcFundsRaised;
    @XmlElementRef(name = "fpc_funds_goal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> fpcFundsGoal;
    @XmlElementRef(name = "fpc_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fpcStartDate;
    @XmlElementRef(name = "fpc_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fpcEndDate;
    @XmlElementRef(name = "fpc_notes", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> fpcNotes;
    @XmlElementRef(name = "fpc_active_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> fpcActiveFlag;

    /**
     * Gets the value of the fpcAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFpcAddUser() {
        return fpcAddUser;
    }

    /**
     * Sets the value of the fpcAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFpcAddUser(JAXBElement<String> value) {
        this.fpcAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fpcAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFpcAddDate() {
        return fpcAddDate;
    }

    /**
     * Sets the value of the fpcAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFpcAddDate(JAXBElement<String> value) {
        this.fpcAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fpcChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFpcChangeUser() {
        return fpcChangeUser;
    }

    /**
     * Sets the value of the fpcChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFpcChangeUser(JAXBElement<String> value) {
        this.fpcChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fpcChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFpcChangeDate() {
        return fpcChangeDate;
    }

    /**
     * Sets the value of the fpcChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFpcChangeDate(JAXBElement<String> value) {
        this.fpcChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fpcDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getFpcDeleteFlag() {
        return fpcDeleteFlag;
    }

    /**
     * Sets the value of the fpcDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setFpcDeleteFlag(JAXBElement<Short> value) {
        this.fpcDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the fpcEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFpcEntityKey() {
        return fpcEntityKey;
    }

    /**
     * Sets the value of the fpcEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFpcEntityKey(JAXBElement<String> value) {
        this.fpcEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fpcPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFpcPrdKey() {
        return fpcPrdKey;
    }

    /**
     * Sets the value of the fpcPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFpcPrdKey(JAXBElement<String> value) {
        this.fpcPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fpcFunKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFpcFunKey() {
        return fpcFunKey;
    }

    /**
     * Sets the value of the fpcFunKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFpcFunKey(JAXBElement<String> value) {
        this.fpcFunKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fpcCmpKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFpcCmpKey() {
        return fpcCmpKey;
    }

    /**
     * Sets the value of the fpcCmpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFpcCmpKey(JAXBElement<String> value) {
        this.fpcCmpKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fpcAplKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFpcAplKey() {
        return fpcAplKey;
    }

    /**
     * Sets the value of the fpcAplKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFpcAplKey(JAXBElement<String> value) {
        this.fpcAplKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fpcPckKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFpcPckKey() {
        return fpcPckKey;
    }

    /**
     * Sets the value of the fpcPckKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFpcPckKey(JAXBElement<String> value) {
        this.fpcPckKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fpcTrackRecognitionLevelFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getFpcTrackRecognitionLevelFlag() {
        return fpcTrackRecognitionLevelFlag;
    }

    /**
     * Sets the value of the fpcTrackRecognitionLevelFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setFpcTrackRecognitionLevelFlag(JAXBElement<Short> value) {
        this.fpcTrackRecognitionLevelFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the fpcEventFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getFpcEventFlag() {
        return fpcEventFlag;
    }

    /**
     * Sets the value of the fpcEventFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setFpcEventFlag(JAXBElement<Short> value) {
        this.fpcEventFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the fpcPrdKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFpcPrdKeyExt() {
        return fpcPrdKeyExt;
    }

    /**
     * Sets the value of the fpcPrdKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFpcPrdKeyExt(JAXBElement<String> value) {
        this.fpcPrdKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fpcFundsRaised property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getFpcFundsRaised() {
        return fpcFundsRaised;
    }

    /**
     * Sets the value of the fpcFundsRaised property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setFpcFundsRaised(JAXBElement<BigDecimal> value) {
        this.fpcFundsRaised = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the fpcFundsGoal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getFpcFundsGoal() {
        return fpcFundsGoal;
    }

    /**
     * Sets the value of the fpcFundsGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setFpcFundsGoal(JAXBElement<BigDecimal> value) {
        this.fpcFundsGoal = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the fpcStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFpcStartDate() {
        return fpcStartDate;
    }

    /**
     * Sets the value of the fpcStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFpcStartDate(JAXBElement<String> value) {
        this.fpcStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fpcEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFpcEndDate() {
        return fpcEndDate;
    }

    /**
     * Sets the value of the fpcEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFpcEndDate(JAXBElement<String> value) {
        this.fpcEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fpcNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFpcNotes() {
        return fpcNotes;
    }

    /**
     * Sets the value of the fpcNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFpcNotes(JAXBElement<String> value) {
        this.fpcNotes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fpcActiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getFpcActiveFlag() {
        return fpcActiveFlag;
    }

    /**
     * Sets the value of the fpcActiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setFpcActiveFlag(JAXBElement<Short> value) {
        this.fpcActiveFlag = ((JAXBElement<Short> ) value);
    }

}
