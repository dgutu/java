
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Fund_Code_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Fund_Code_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fun_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="fun_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="fun_description" type="{http://www.avectra.com/2005/}stringLength255_Type" minOccurs="0"/>
 *         &lt;element name="fun_start_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="fun_end_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="fun_goal" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="fun_notes" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *         &lt;element name="fun_active_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="fun_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="fun_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="fun_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="fun_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="fun_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="fun_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="fun_raised" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="fun_pledged" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="fun_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Fund_Code_DataObjectType", propOrder = {
    "funKey",
    "funCode",
    "funDescription",
    "funStartDate",
    "funEndDate",
    "funGoal",
    "funNotes",
    "funActiveFlag",
    "funAddUser",
    "funAddDate",
    "funChangeUser",
    "funChangeDate",
    "funDeleteFlag",
    "funEntityKey",
    "funRaised",
    "funPledged",
    "funKeyExt"
})
public class FundraisingGiftFundCodeDataObjectType {

    @XmlElementRef(name = "fun_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> funKey;
    @XmlElementRef(name = "fun_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> funCode;
    @XmlElementRef(name = "fun_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> funDescription;
    @XmlElementRef(name = "fun_start_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> funStartDate;
    @XmlElementRef(name = "fun_end_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> funEndDate;
    @XmlElementRef(name = "fun_goal", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> funGoal;
    @XmlElementRef(name = "fun_notes", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> funNotes;
    @XmlElementRef(name = "fun_active_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> funActiveFlag;
    @XmlElementRef(name = "fun_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> funAddUser;
    @XmlElementRef(name = "fun_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> funAddDate;
    @XmlElementRef(name = "fun_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> funChangeUser;
    @XmlElementRef(name = "fun_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> funChangeDate;
    @XmlElementRef(name = "fun_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> funDeleteFlag;
    @XmlElementRef(name = "fun_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> funEntityKey;
    @XmlElementRef(name = "fun_raised", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> funRaised;
    @XmlElementRef(name = "fun_pledged", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> funPledged;
    @XmlElementRef(name = "fun_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> funKeyExt;

    /**
     * Gets the value of the funKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFunKey() {
        return funKey;
    }

    /**
     * Sets the value of the funKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFunKey(JAXBElement<String> value) {
        this.funKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the funCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFunCode() {
        return funCode;
    }

    /**
     * Sets the value of the funCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFunCode(JAXBElement<String> value) {
        this.funCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the funDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFunDescription() {
        return funDescription;
    }

    /**
     * Sets the value of the funDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFunDescription(JAXBElement<String> value) {
        this.funDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the funStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFunStartDate() {
        return funStartDate;
    }

    /**
     * Sets the value of the funStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFunStartDate(JAXBElement<String> value) {
        this.funStartDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the funEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFunEndDate() {
        return funEndDate;
    }

    /**
     * Sets the value of the funEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFunEndDate(JAXBElement<String> value) {
        this.funEndDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the funGoal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getFunGoal() {
        return funGoal;
    }

    /**
     * Sets the value of the funGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setFunGoal(JAXBElement<BigDecimal> value) {
        this.funGoal = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the funNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFunNotes() {
        return funNotes;
    }

    /**
     * Sets the value of the funNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFunNotes(JAXBElement<String> value) {
        this.funNotes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the funActiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getFunActiveFlag() {
        return funActiveFlag;
    }

    /**
     * Sets the value of the funActiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setFunActiveFlag(JAXBElement<Short> value) {
        this.funActiveFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the funAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFunAddUser() {
        return funAddUser;
    }

    /**
     * Sets the value of the funAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFunAddUser(JAXBElement<String> value) {
        this.funAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the funAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFunAddDate() {
        return funAddDate;
    }

    /**
     * Sets the value of the funAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFunAddDate(JAXBElement<String> value) {
        this.funAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the funChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFunChangeUser() {
        return funChangeUser;
    }

    /**
     * Sets the value of the funChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFunChangeUser(JAXBElement<String> value) {
        this.funChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the funChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFunChangeDate() {
        return funChangeDate;
    }

    /**
     * Sets the value of the funChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFunChangeDate(JAXBElement<String> value) {
        this.funChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the funDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getFunDeleteFlag() {
        return funDeleteFlag;
    }

    /**
     * Sets the value of the funDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setFunDeleteFlag(JAXBElement<Short> value) {
        this.funDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the funEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFunEntityKey() {
        return funEntityKey;
    }

    /**
     * Sets the value of the funEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFunEntityKey(JAXBElement<String> value) {
        this.funEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the funRaised property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getFunRaised() {
        return funRaised;
    }

    /**
     * Sets the value of the funRaised property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setFunRaised(JAXBElement<BigDecimal> value) {
        this.funRaised = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the funPledged property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getFunPledged() {
        return funPledged;
    }

    /**
     * Sets the value of the funPledged property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setFunPledged(JAXBElement<BigDecimal> value) {
        this.funPledged = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the funKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFunKeyExt() {
        return funKeyExt;
    }

    /**
     * Sets the value of the funKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFunKeyExt(JAXBElement<String> value) {
        this.funKeyExt = ((JAXBElement<String> ) value);
    }

}
