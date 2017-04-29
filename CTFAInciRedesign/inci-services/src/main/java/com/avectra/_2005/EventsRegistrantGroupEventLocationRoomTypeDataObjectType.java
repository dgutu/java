
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsRegistrantGroup_Event_Location_Room_Type_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsRegistrantGroup_Event_Location_Room_Type_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ert_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ert_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ert_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ert_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ert_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ert_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ert_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ert_evl_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ert_rate" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ert_deposit" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ert_rmt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ert_qty" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ert_non_smoking_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ert_from_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ert_through_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ert_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsRegistrantGroup_Event_Location_Room_Type_DataObjectType", propOrder = {
    "ertKey",
    "ertAddUser",
    "ertAddDate",
    "ertChangeUser",
    "ertChangeDate",
    "ertDeleteFlag",
    "ertKeyExt",
    "ertEvlKey",
    "ertRate",
    "ertDeposit",
    "ertRmtKey",
    "ertQty",
    "ertNonSmokingFlag",
    "ertFromDate",
    "ertThroughDate",
    "ertEntityKey"
})
public class EventsRegistrantGroupEventLocationRoomTypeDataObjectType {

    @XmlElementRef(name = "ert_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ertKey;
    @XmlElementRef(name = "ert_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ertAddUser;
    @XmlElementRef(name = "ert_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ertAddDate;
    @XmlElementRef(name = "ert_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ertChangeUser;
    @XmlElementRef(name = "ert_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ertChangeDate;
    @XmlElementRef(name = "ert_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ertDeleteFlag;
    @XmlElementRef(name = "ert_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ertKeyExt;
    @XmlElementRef(name = "ert_evl_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ertEvlKey;
    @XmlElementRef(name = "ert_rate", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ertRate;
    @XmlElementRef(name = "ert_deposit", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ertDeposit;
    @XmlElementRef(name = "ert_rmt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ertRmtKey;
    @XmlElementRef(name = "ert_qty", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> ertQty;
    @XmlElementRef(name = "ert_non_smoking_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ertNonSmokingFlag;
    @XmlElementRef(name = "ert_from_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ertFromDate;
    @XmlElementRef(name = "ert_through_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ertThroughDate;
    @XmlElementRef(name = "ert_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ertEntityKey;

    /**
     * Gets the value of the ertKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErtKey() {
        return ertKey;
    }

    /**
     * Sets the value of the ertKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErtKey(JAXBElement<String> value) {
        this.ertKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ertAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErtAddUser() {
        return ertAddUser;
    }

    /**
     * Sets the value of the ertAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErtAddUser(JAXBElement<String> value) {
        this.ertAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ertAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErtAddDate() {
        return ertAddDate;
    }

    /**
     * Sets the value of the ertAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErtAddDate(JAXBElement<String> value) {
        this.ertAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ertChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErtChangeUser() {
        return ertChangeUser;
    }

    /**
     * Sets the value of the ertChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErtChangeUser(JAXBElement<String> value) {
        this.ertChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ertChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErtChangeDate() {
        return ertChangeDate;
    }

    /**
     * Sets the value of the ertChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErtChangeDate(JAXBElement<String> value) {
        this.ertChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ertDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getErtDeleteFlag() {
        return ertDeleteFlag;
    }

    /**
     * Sets the value of the ertDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setErtDeleteFlag(JAXBElement<Short> value) {
        this.ertDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ertKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErtKeyExt() {
        return ertKeyExt;
    }

    /**
     * Sets the value of the ertKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErtKeyExt(JAXBElement<String> value) {
        this.ertKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ertEvlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErtEvlKey() {
        return ertEvlKey;
    }

    /**
     * Sets the value of the ertEvlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErtEvlKey(JAXBElement<String> value) {
        this.ertEvlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ertRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getErtRate() {
        return ertRate;
    }

    /**
     * Sets the value of the ertRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setErtRate(JAXBElement<BigDecimal> value) {
        this.ertRate = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ertDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getErtDeposit() {
        return ertDeposit;
    }

    /**
     * Sets the value of the ertDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setErtDeposit(JAXBElement<BigDecimal> value) {
        this.ertDeposit = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ertRmtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErtRmtKey() {
        return ertRmtKey;
    }

    /**
     * Sets the value of the ertRmtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErtRmtKey(JAXBElement<String> value) {
        this.ertRmtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ertQty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getErtQty() {
        return ertQty;
    }

    /**
     * Sets the value of the ertQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setErtQty(JAXBElement<Integer> value) {
        this.ertQty = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the ertNonSmokingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getErtNonSmokingFlag() {
        return ertNonSmokingFlag;
    }

    /**
     * Sets the value of the ertNonSmokingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setErtNonSmokingFlag(JAXBElement<Short> value) {
        this.ertNonSmokingFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ertFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErtFromDate() {
        return ertFromDate;
    }

    /**
     * Sets the value of the ertFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErtFromDate(JAXBElement<String> value) {
        this.ertFromDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ertThroughDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErtThroughDate() {
        return ertThroughDate;
    }

    /**
     * Sets the value of the ertThroughDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErtThroughDate(JAXBElement<String> value) {
        this.ertThroughDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ertEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErtEntityKey() {
        return ertEntityKey;
    }

    /**
     * Sets the value of the ertEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErtEntityKey(JAXBElement<String> value) {
        this.ertEntityKey = ((JAXBElement<String> ) value);
    }

}
