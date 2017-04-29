
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExhibitorBoothNew_Priority_Point_Detail_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExhibitorBoothNew_Priority_Point_Detail_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ppd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ppd_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ppd_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ppd_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="ppd_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="ppd_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="ppd_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ppd_ppt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ppd_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ppd_priority_points" type="{http://www.avectra.com/2005/}av_decimal2_Type" minOccurs="0"/>
 *         &lt;element name="ppd_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ppd_exh_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="ppd_hxb_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExhibitorBoothNew_Priority_Point_Detail_DataObjectType", propOrder = {
    "ppdKey",
    "ppdAddUser",
    "ppdAddDate",
    "ppdChangeUser",
    "ppdChangeDate",
    "ppdDeleteFlag",
    "ppdKeyExt",
    "ppdPptKey",
    "ppdCstKey",
    "ppdPriorityPoints",
    "ppdEntityKey",
    "ppdExhKey",
    "ppdHxbKey"
})
public class ExhibitorBoothNewPriorityPointDetailDataObjectType {

    @XmlElementRef(name = "ppd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ppdKey;
    @XmlElementRef(name = "ppd_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ppdAddUser;
    @XmlElementRef(name = "ppd_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ppdAddDate;
    @XmlElementRef(name = "ppd_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ppdChangeUser;
    @XmlElementRef(name = "ppd_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ppdChangeDate;
    @XmlElementRef(name = "ppd_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> ppdDeleteFlag;
    @XmlElementRef(name = "ppd_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ppdKeyExt;
    @XmlElementRef(name = "ppd_ppt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ppdPptKey;
    @XmlElementRef(name = "ppd_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ppdCstKey;
    @XmlElementRef(name = "ppd_priority_points", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> ppdPriorityPoints;
    @XmlElementRef(name = "ppd_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ppdEntityKey;
    @XmlElementRef(name = "ppd_exh_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ppdExhKey;
    @XmlElementRef(name = "ppd_hxb_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> ppdHxbKey;

    /**
     * Gets the value of the ppdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPpdKey() {
        return ppdKey;
    }

    /**
     * Sets the value of the ppdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPpdKey(JAXBElement<String> value) {
        this.ppdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ppdAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPpdAddUser() {
        return ppdAddUser;
    }

    /**
     * Sets the value of the ppdAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPpdAddUser(JAXBElement<String> value) {
        this.ppdAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ppdAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPpdAddDate() {
        return ppdAddDate;
    }

    /**
     * Sets the value of the ppdAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPpdAddDate(JAXBElement<String> value) {
        this.ppdAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ppdChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPpdChangeUser() {
        return ppdChangeUser;
    }

    /**
     * Sets the value of the ppdChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPpdChangeUser(JAXBElement<String> value) {
        this.ppdChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ppdChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPpdChangeDate() {
        return ppdChangeDate;
    }

    /**
     * Sets the value of the ppdChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPpdChangeDate(JAXBElement<String> value) {
        this.ppdChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ppdDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPpdDeleteFlag() {
        return ppdDeleteFlag;
    }

    /**
     * Sets the value of the ppdDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPpdDeleteFlag(JAXBElement<Short> value) {
        this.ppdDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the ppdKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPpdKeyExt() {
        return ppdKeyExt;
    }

    /**
     * Sets the value of the ppdKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPpdKeyExt(JAXBElement<String> value) {
        this.ppdKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ppdPptKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPpdPptKey() {
        return ppdPptKey;
    }

    /**
     * Sets the value of the ppdPptKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPpdPptKey(JAXBElement<String> value) {
        this.ppdPptKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ppdCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPpdCstKey() {
        return ppdCstKey;
    }

    /**
     * Sets the value of the ppdCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPpdCstKey(JAXBElement<String> value) {
        this.ppdCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ppdPriorityPoints property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPpdPriorityPoints() {
        return ppdPriorityPoints;
    }

    /**
     * Sets the value of the ppdPriorityPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPpdPriorityPoints(JAXBElement<BigDecimal> value) {
        this.ppdPriorityPoints = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the ppdEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPpdEntityKey() {
        return ppdEntityKey;
    }

    /**
     * Sets the value of the ppdEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPpdEntityKey(JAXBElement<String> value) {
        this.ppdEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ppdExhKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPpdExhKey() {
        return ppdExhKey;
    }

    /**
     * Sets the value of the ppdExhKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPpdExhKey(JAXBElement<String> value) {
        this.ppdExhKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ppdHxbKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPpdHxbKey() {
        return ppdHxbKey;
    }

    /**
     * Sets the value of the ppdHxbKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPpdHxbKey(JAXBElement<String> value) {
        this.ppdHxbKey = ((JAXBElement<String> ) value);
    }

}
