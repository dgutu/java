
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExhibitorNew_Exhibitor_X_Contact_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExhibitorNew_Exhibitor_X_Contact_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exc_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="exc_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="exc_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="exc_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="exc_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="exc_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exc_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exc_exh_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exc_cxa_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exc_cph_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exc_cfx_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exc_ind_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exc_url_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exc_eml_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="exc_rlt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExhibitorNew_Exhibitor_X_Contact_DataObjectType", propOrder = {
    "excKey",
    "excAddUser",
    "excAddDate",
    "excChangeUser",
    "excChangeDate",
    "excDeleteFlag",
    "excEntityKey",
    "excKeyExt",
    "excExhKey",
    "excCxaKey",
    "excCphKey",
    "excCfxKey",
    "excIndCstKey",
    "excUrlKey",
    "excEmlKey",
    "excRltKey"
})
public class ExhibitorNewExhibitorXContactDataObjectType {

    @XmlElementRef(name = "exc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> excKey;
    @XmlElementRef(name = "exc_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> excAddUser;
    @XmlElementRef(name = "exc_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> excAddDate;
    @XmlElementRef(name = "exc_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> excChangeUser;
    @XmlElementRef(name = "exc_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> excChangeDate;
    @XmlElementRef(name = "exc_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> excDeleteFlag;
    @XmlElementRef(name = "exc_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> excEntityKey;
    @XmlElementRef(name = "exc_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> excKeyExt;
    @XmlElementRef(name = "exc_exh_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> excExhKey;
    @XmlElementRef(name = "exc_cxa_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> excCxaKey;
    @XmlElementRef(name = "exc_cph_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> excCphKey;
    @XmlElementRef(name = "exc_cfx_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> excCfxKey;
    @XmlElementRef(name = "exc_ind_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> excIndCstKey;
    @XmlElementRef(name = "exc_url_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> excUrlKey;
    @XmlElementRef(name = "exc_eml_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> excEmlKey;
    @XmlElementRef(name = "exc_rlt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> excRltKey;

    /**
     * Gets the value of the excKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExcKey() {
        return excKey;
    }

    /**
     * Sets the value of the excKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExcKey(JAXBElement<String> value) {
        this.excKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the excAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExcAddUser() {
        return excAddUser;
    }

    /**
     * Sets the value of the excAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExcAddUser(JAXBElement<String> value) {
        this.excAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the excAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExcAddDate() {
        return excAddDate;
    }

    /**
     * Sets the value of the excAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExcAddDate(JAXBElement<String> value) {
        this.excAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the excChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExcChangeUser() {
        return excChangeUser;
    }

    /**
     * Sets the value of the excChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExcChangeUser(JAXBElement<String> value) {
        this.excChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the excChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExcChangeDate() {
        return excChangeDate;
    }

    /**
     * Sets the value of the excChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExcChangeDate(JAXBElement<String> value) {
        this.excChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the excDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getExcDeleteFlag() {
        return excDeleteFlag;
    }

    /**
     * Sets the value of the excDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setExcDeleteFlag(JAXBElement<Short> value) {
        this.excDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the excEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExcEntityKey() {
        return excEntityKey;
    }

    /**
     * Sets the value of the excEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExcEntityKey(JAXBElement<String> value) {
        this.excEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the excKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExcKeyExt() {
        return excKeyExt;
    }

    /**
     * Sets the value of the excKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExcKeyExt(JAXBElement<String> value) {
        this.excKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the excExhKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExcExhKey() {
        return excExhKey;
    }

    /**
     * Sets the value of the excExhKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExcExhKey(JAXBElement<String> value) {
        this.excExhKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the excCxaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExcCxaKey() {
        return excCxaKey;
    }

    /**
     * Sets the value of the excCxaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExcCxaKey(JAXBElement<String> value) {
        this.excCxaKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the excCphKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExcCphKey() {
        return excCphKey;
    }

    /**
     * Sets the value of the excCphKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExcCphKey(JAXBElement<String> value) {
        this.excCphKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the excCfxKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExcCfxKey() {
        return excCfxKey;
    }

    /**
     * Sets the value of the excCfxKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExcCfxKey(JAXBElement<String> value) {
        this.excCfxKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the excIndCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExcIndCstKey() {
        return excIndCstKey;
    }

    /**
     * Sets the value of the excIndCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExcIndCstKey(JAXBElement<String> value) {
        this.excIndCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the excUrlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExcUrlKey() {
        return excUrlKey;
    }

    /**
     * Sets the value of the excUrlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExcUrlKey(JAXBElement<String> value) {
        this.excUrlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the excEmlKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExcEmlKey() {
        return excEmlKey;
    }

    /**
     * Sets the value of the excEmlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExcEmlKey(JAXBElement<String> value) {
        this.excEmlKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the excRltKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExcRltKey() {
        return excRltKey;
    }

    /**
     * Sets the value of the excRltKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExcRltKey(JAXBElement<String> value) {
        this.excRltKey = ((JAXBElement<String> ) value);
    }

}
