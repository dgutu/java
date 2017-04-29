
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Appeal_Code_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Appeal_Code_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="apl_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="apl_description" type="{http://www.avectra.com/2005/}stringLength255_Type" minOccurs="0"/>
 *         &lt;element name="apl_start_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="apl_end_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="apl_goal" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="apl_notes" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="apl_active_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="apl_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="apl_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="apl_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="apl_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="apl_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="apl_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="apl_raised" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="apl_pledged" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="apl_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="apl_cmp_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="apl_act_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Appeal_Code_DataObjectType", propOrder = {
    "aplKey",
    "aplCode",
    "aplDescription",
    "aplStartDate",
    "aplEndDate",
    "aplGoal",
    "aplNotes",
    "aplActiveFlag",
    "aplAddUser",
    "aplAddDate",
    "aplChangeUser",
    "aplChangeDate",
    "aplDeleteFlag",
    "aplEntityKey",
    "aplRaised",
    "aplPledged",
    "aplKeyExt",
    "aplCmpKey",
    "aplActKey"
})
public class FundraisingGiftAppealCodeDataObjectType {

    @XmlElementRef(name = "apl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aplKey;
    @XmlElementRef(name = "apl_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aplCode;
    @XmlElementRef(name = "apl_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aplDescription;
    @XmlElementRef(name = "apl_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aplStartDate;
    @XmlElementRef(name = "apl_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aplEndDate;
    @XmlElementRef(name = "apl_goal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> aplGoal;
    @XmlElementRef(name = "apl_notes", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aplNotes;
    @XmlElementRef(name = "apl_active_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> aplActiveFlag;
    @XmlElementRef(name = "apl_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aplAddUser;
    @XmlElementRef(name = "apl_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aplAddDate;
    @XmlElementRef(name = "apl_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aplChangeUser;
    @XmlElementRef(name = "apl_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aplChangeDate;
    @XmlElementRef(name = "apl_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> aplDeleteFlag;
    @XmlElementRef(name = "apl_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aplEntityKey;
    @XmlElementRef(name = "apl_raised", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> aplRaised;
    @XmlElementRef(name = "apl_pledged", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> aplPledged;
    @XmlElementRef(name = "apl_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aplKeyExt;
    @XmlElementRef(name = "apl_cmp_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aplCmpKey;
    @XmlElementRef(name = "apl_act_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> aplActKey;

    /**
     * Gets the value of the aplKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAplKey() {
        return aplKey;
    }

    /**
     * Sets the value of the aplKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAplKey(JAXBElement<String> value) {
        this.aplKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aplCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAplCode() {
        return aplCode;
    }

    /**
     * Sets the value of the aplCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAplCode(JAXBElement<String> value) {
        this.aplCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aplDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAplDescription() {
        return aplDescription;
    }

    /**
     * Sets the value of the aplDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAplDescription(JAXBElement<String> value) {
        this.aplDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aplStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAplStartDate() {
        return aplStartDate;
    }

    /**
     * Sets the value of the aplStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAplStartDate(JAXBElement<String> value) {
        this.aplStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aplEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAplEndDate() {
        return aplEndDate;
    }

    /**
     * Sets the value of the aplEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAplEndDate(JAXBElement<String> value) {
        this.aplEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aplGoal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAplGoal() {
        return aplGoal;
    }

    /**
     * Sets the value of the aplGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAplGoal(JAXBElement<BigDecimal> value) {
        this.aplGoal = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the aplNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAplNotes() {
        return aplNotes;
    }

    /**
     * Sets the value of the aplNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAplNotes(JAXBElement<String> value) {
        this.aplNotes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aplActiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getAplActiveFlag() {
        return aplActiveFlag;
    }

    /**
     * Sets the value of the aplActiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setAplActiveFlag(JAXBElement<Short> value) {
        this.aplActiveFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the aplAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAplAddUser() {
        return aplAddUser;
    }

    /**
     * Sets the value of the aplAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAplAddUser(JAXBElement<String> value) {
        this.aplAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aplAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAplAddDate() {
        return aplAddDate;
    }

    /**
     * Sets the value of the aplAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAplAddDate(JAXBElement<String> value) {
        this.aplAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aplChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAplChangeUser() {
        return aplChangeUser;
    }

    /**
     * Sets the value of the aplChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAplChangeUser(JAXBElement<String> value) {
        this.aplChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aplChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAplChangeDate() {
        return aplChangeDate;
    }

    /**
     * Sets the value of the aplChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAplChangeDate(JAXBElement<String> value) {
        this.aplChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aplDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getAplDeleteFlag() {
        return aplDeleteFlag;
    }

    /**
     * Sets the value of the aplDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setAplDeleteFlag(JAXBElement<Short> value) {
        this.aplDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the aplEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAplEntityKey() {
        return aplEntityKey;
    }

    /**
     * Sets the value of the aplEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAplEntityKey(JAXBElement<String> value) {
        this.aplEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aplRaised property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAplRaised() {
        return aplRaised;
    }

    /**
     * Sets the value of the aplRaised property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAplRaised(JAXBElement<BigDecimal> value) {
        this.aplRaised = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the aplPledged property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAplPledged() {
        return aplPledged;
    }

    /**
     * Sets the value of the aplPledged property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAplPledged(JAXBElement<BigDecimal> value) {
        this.aplPledged = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the aplKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAplKeyExt() {
        return aplKeyExt;
    }

    /**
     * Sets the value of the aplKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAplKeyExt(JAXBElement<String> value) {
        this.aplKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aplCmpKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAplCmpKey() {
        return aplCmpKey;
    }

    /**
     * Sets the value of the aplCmpKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAplCmpKey(JAXBElement<String> value) {
        this.aplCmpKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aplActKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAplActKey() {
        return aplActKey;
    }

    /**
     * Sets the value of the aplActKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAplActKey(JAXBElement<String> value) {
        this.aplActKey = ((JAXBElement<String> ) value);
    }

}
