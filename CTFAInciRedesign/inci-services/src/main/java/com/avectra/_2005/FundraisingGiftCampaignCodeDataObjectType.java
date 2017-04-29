
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Campaign_Code_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Campaign_Code_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cmp_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmp_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cmp_description" type="{http://www.avectra.com/2005/}stringLength255_Type" minOccurs="0"/>
 *         &lt;element name="cmp_start_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cmp_end_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cmp_goal" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="cmp_notes" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="cmp_active_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cmp_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cmp_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cmp_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cmp_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cmp_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cmp_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmp_raised" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="cmp_pledged" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="cmp_gft_cct_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmp_plg_cct_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmp_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cmp_acc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Campaign_Code_DataObjectType", propOrder = {
    "cmpKey",
    "cmpCode",
    "cmpDescription",
    "cmpStartDate",
    "cmpEndDate",
    "cmpGoal",
    "cmpNotes",
    "cmpActiveFlag",
    "cmpAddUser",
    "cmpAddDate",
    "cmpChangeUser",
    "cmpChangeDate",
    "cmpDeleteFlag",
    "cmpEntityKey",
    "cmpRaised",
    "cmpPledged",
    "cmpGftCctKey",
    "cmpPlgCctKey",
    "cmpKeyExt",
    "cmpAccKey"
})
public class FundraisingGiftCampaignCodeDataObjectType {

    @XmlElementRef(name = "cmp_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpKey;
    @XmlElementRef(name = "cmp_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpCode;
    @XmlElementRef(name = "cmp_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpDescription;
    @XmlElementRef(name = "cmp_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpStartDate;
    @XmlElementRef(name = "cmp_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpEndDate;
    @XmlElementRef(name = "cmp_goal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> cmpGoal;
    @XmlElementRef(name = "cmp_notes", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpNotes;
    @XmlElementRef(name = "cmp_active_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cmpActiveFlag;
    @XmlElementRef(name = "cmp_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpAddUser;
    @XmlElementRef(name = "cmp_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpAddDate;
    @XmlElementRef(name = "cmp_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpChangeUser;
    @XmlElementRef(name = "cmp_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpChangeDate;
    @XmlElementRef(name = "cmp_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cmpDeleteFlag;
    @XmlElementRef(name = "cmp_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpEntityKey;
    @XmlElementRef(name = "cmp_raised", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> cmpRaised;
    @XmlElementRef(name = "cmp_pledged", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> cmpPledged;
    @XmlElementRef(name = "cmp_gft_cct_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpGftCctKey;
    @XmlElementRef(name = "cmp_plg_cct_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpPlgCctKey;
    @XmlElementRef(name = "cmp_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpKeyExt;
    @XmlElementRef(name = "cmp_acc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cmpAccKey;

    /**
     * Gets the value of the cmpKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpKey() {
        return cmpKey;
    }

    /**
     * Sets the value of the cmpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpKey(JAXBElement<String> value) {
        this.cmpKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpCode() {
        return cmpCode;
    }

    /**
     * Sets the value of the cmpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpCode(JAXBElement<String> value) {
        this.cmpCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpDescription() {
        return cmpDescription;
    }

    /**
     * Sets the value of the cmpDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpDescription(JAXBElement<String> value) {
        this.cmpDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpStartDate() {
        return cmpStartDate;
    }

    /**
     * Sets the value of the cmpStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpStartDate(JAXBElement<String> value) {
        this.cmpStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpEndDate() {
        return cmpEndDate;
    }

    /**
     * Sets the value of the cmpEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpEndDate(JAXBElement<String> value) {
        this.cmpEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpGoal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCmpGoal() {
        return cmpGoal;
    }

    /**
     * Sets the value of the cmpGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCmpGoal(JAXBElement<BigDecimal> value) {
        this.cmpGoal = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the cmpNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpNotes() {
        return cmpNotes;
    }

    /**
     * Sets the value of the cmpNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpNotes(JAXBElement<String> value) {
        this.cmpNotes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpActiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCmpActiveFlag() {
        return cmpActiveFlag;
    }

    /**
     * Sets the value of the cmpActiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCmpActiveFlag(JAXBElement<Short> value) {
        this.cmpActiveFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cmpAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpAddUser() {
        return cmpAddUser;
    }

    /**
     * Sets the value of the cmpAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpAddUser(JAXBElement<String> value) {
        this.cmpAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpAddDate() {
        return cmpAddDate;
    }

    /**
     * Sets the value of the cmpAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpAddDate(JAXBElement<String> value) {
        this.cmpAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpChangeUser() {
        return cmpChangeUser;
    }

    /**
     * Sets the value of the cmpChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpChangeUser(JAXBElement<String> value) {
        this.cmpChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpChangeDate() {
        return cmpChangeDate;
    }

    /**
     * Sets the value of the cmpChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpChangeDate(JAXBElement<String> value) {
        this.cmpChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCmpDeleteFlag() {
        return cmpDeleteFlag;
    }

    /**
     * Sets the value of the cmpDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCmpDeleteFlag(JAXBElement<Short> value) {
        this.cmpDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cmpEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpEntityKey() {
        return cmpEntityKey;
    }

    /**
     * Sets the value of the cmpEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpEntityKey(JAXBElement<String> value) {
        this.cmpEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpRaised property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCmpRaised() {
        return cmpRaised;
    }

    /**
     * Sets the value of the cmpRaised property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCmpRaised(JAXBElement<BigDecimal> value) {
        this.cmpRaised = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the cmpPledged property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCmpPledged() {
        return cmpPledged;
    }

    /**
     * Sets the value of the cmpPledged property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCmpPledged(JAXBElement<BigDecimal> value) {
        this.cmpPledged = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the cmpGftCctKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpGftCctKey() {
        return cmpGftCctKey;
    }

    /**
     * Sets the value of the cmpGftCctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpGftCctKey(JAXBElement<String> value) {
        this.cmpGftCctKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpPlgCctKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpPlgCctKey() {
        return cmpPlgCctKey;
    }

    /**
     * Sets the value of the cmpPlgCctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpPlgCctKey(JAXBElement<String> value) {
        this.cmpPlgCctKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpKeyExt() {
        return cmpKeyExt;
    }

    /**
     * Sets the value of the cmpKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpKeyExt(JAXBElement<String> value) {
        this.cmpKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cmpAccKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpAccKey() {
        return cmpAccKey;
    }

    /**
     * Sets the value of the cmpAccKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpAccKey(JAXBElement<String> value) {
        this.cmpAccKey = ((JAXBElement<String> ) value);
    }

}
