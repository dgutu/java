
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundraisingGift_Order_Detail_Schedule_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundraisingGift_Order_Detail_Schedule_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ods_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ods_ord_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ods_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ods_amount" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *         &lt;element name="ods_process_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ods_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ods_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ods_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ods_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ods_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ods_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ods_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ods_number" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="ods_ims_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ods_void_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="ods_void_user" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="ods_void_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="ods_writeoff_amount" type="{http://www.avectra.com/2005/}av_currency_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundraisingGift_Order_Detail_Schedule_DataObjectType", propOrder = {
    "odsKey",
    "odsOrdKey",
    "odsDate",
    "odsAmount",
    "odsProcessDate",
    "odsAddUser",
    "odsAddDate",
    "odsChangeUser",
    "odsChangeDate",
    "odsDeleteFlag",
    "odsEntityKey",
    "odsKeyExt",
    "odsNumber",
    "odsImsKey",
    "odsVoidDate",
    "odsVoidUser",
    "odsVoidFlag",
    "odsWriteoffAmount"
})
public class FundraisingGiftOrderDetailScheduleDataObjectType {

    @XmlElementRef(name = "ods_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odsKey;
    @XmlElementRef(name = "ods_ord_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odsOrdKey;
    @XmlElementRef(name = "ods_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odsDate;
    @XmlElementRef(name = "ods_amount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> odsAmount;
    @XmlElementRef(name = "ods_process_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odsProcessDate;
    @XmlElementRef(name = "ods_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odsAddUser;
    @XmlElementRef(name = "ods_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odsAddDate;
    @XmlElementRef(name = "ods_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odsChangeUser;
    @XmlElementRef(name = "ods_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odsChangeDate;
    @XmlElementRef(name = "ods_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> odsDeleteFlag;
    @XmlElementRef(name = "ods_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odsEntityKey;
    @XmlElementRef(name = "ods_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odsKeyExt;
    @XmlElementRef(name = "ods_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> odsNumber;
    @XmlElementRef(name = "ods_ims_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odsImsKey;
    @XmlElementRef(name = "ods_void_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odsVoidDate;
    @XmlElementRef(name = "ods_void_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> odsVoidUser;
    @XmlElementRef(name = "ods_void_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> odsVoidFlag;
    @XmlElementRef(name = "ods_writeoff_amount", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> odsWriteoffAmount;

    /**
     * Gets the value of the odsKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdsKey() {
        return odsKey;
    }

    /**
     * Sets the value of the odsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdsKey(JAXBElement<String> value) {
        this.odsKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odsOrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdsOrdKey() {
        return odsOrdKey;
    }

    /**
     * Sets the value of the odsOrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdsOrdKey(JAXBElement<String> value) {
        this.odsOrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odsDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdsDate() {
        return odsDate;
    }

    /**
     * Sets the value of the odsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdsDate(JAXBElement<String> value) {
        this.odsDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOdsAmount() {
        return odsAmount;
    }

    /**
     * Sets the value of the odsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOdsAmount(JAXBElement<BigDecimal> value) {
        this.odsAmount = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the odsProcessDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdsProcessDate() {
        return odsProcessDate;
    }

    /**
     * Sets the value of the odsProcessDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdsProcessDate(JAXBElement<String> value) {
        this.odsProcessDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odsAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdsAddUser() {
        return odsAddUser;
    }

    /**
     * Sets the value of the odsAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdsAddUser(JAXBElement<String> value) {
        this.odsAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odsAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdsAddDate() {
        return odsAddDate;
    }

    /**
     * Sets the value of the odsAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdsAddDate(JAXBElement<String> value) {
        this.odsAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odsChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdsChangeUser() {
        return odsChangeUser;
    }

    /**
     * Sets the value of the odsChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdsChangeUser(JAXBElement<String> value) {
        this.odsChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odsChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdsChangeDate() {
        return odsChangeDate;
    }

    /**
     * Sets the value of the odsChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdsChangeDate(JAXBElement<String> value) {
        this.odsChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odsDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOdsDeleteFlag() {
        return odsDeleteFlag;
    }

    /**
     * Sets the value of the odsDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOdsDeleteFlag(JAXBElement<Short> value) {
        this.odsDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the odsEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdsEntityKey() {
        return odsEntityKey;
    }

    /**
     * Sets the value of the odsEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdsEntityKey(JAXBElement<String> value) {
        this.odsEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odsKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdsKeyExt() {
        return odsKeyExt;
    }

    /**
     * Sets the value of the odsKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdsKeyExt(JAXBElement<String> value) {
        this.odsKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOdsNumber() {
        return odsNumber;
    }

    /**
     * Sets the value of the odsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOdsNumber(JAXBElement<Integer> value) {
        this.odsNumber = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the odsImsKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdsImsKey() {
        return odsImsKey;
    }

    /**
     * Sets the value of the odsImsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdsImsKey(JAXBElement<String> value) {
        this.odsImsKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odsVoidDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdsVoidDate() {
        return odsVoidDate;
    }

    /**
     * Sets the value of the odsVoidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdsVoidDate(JAXBElement<String> value) {
        this.odsVoidDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odsVoidUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdsVoidUser() {
        return odsVoidUser;
    }

    /**
     * Sets the value of the odsVoidUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdsVoidUser(JAXBElement<String> value) {
        this.odsVoidUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the odsVoidFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOdsVoidFlag() {
        return odsVoidFlag;
    }

    /**
     * Sets the value of the odsVoidFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOdsVoidFlag(JAXBElement<Short> value) {
        this.odsVoidFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the odsWriteoffAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOdsWriteoffAmount() {
        return odsWriteoffAmount;
    }

    /**
     * Sets the value of the odsWriteoffAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOdsWriteoffAmount(JAXBElement<BigDecimal> value) {
        this.odsWriteoffAmount = ((JAXBElement<BigDecimal> ) value);
    }

}
