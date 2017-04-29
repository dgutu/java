
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommitteeNominations_Committee_Position_Codes_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitteeNominations_Committee_Position_Codes_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpo_code" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cpo_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cpo_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cpo_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cpo_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="cpo_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cpo_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cpo_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cpo_chapter_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cpo_description" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="cpo_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitteeNominations_Committee_Position_Codes_DataObjectType", propOrder = {
    "cpoCode",
    "cpoAddUser",
    "cpoAddDate",
    "cpoChangeUser",
    "cpoChangeDate",
    "cpoDeleteFlag",
    "cpoKey",
    "cpoKeyExt",
    "cpoChapterFlag",
    "cpoDescription",
    "cpoEntityKey"
})
public class CommitteeNominationsCommitteePositionCodesDataObjectType {

    @XmlElementRef(name = "cpo_code", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cpoCode;
    @XmlElementRef(name = "cpo_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cpoAddUser;
    @XmlElementRef(name = "cpo_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cpoAddDate;
    @XmlElementRef(name = "cpo_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cpoChangeUser;
    @XmlElementRef(name = "cpo_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cpoChangeDate;
    @XmlElementRef(name = "cpo_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cpoDeleteFlag;
    @XmlElementRef(name = "cpo_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cpoKey;
    @XmlElementRef(name = "cpo_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cpoKeyExt;
    @XmlElementRef(name = "cpo_chapter_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> cpoChapterFlag;
    @XmlElementRef(name = "cpo_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cpoDescription;
    @XmlElementRef(name = "cpo_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cpoEntityKey;

    /**
     * Gets the value of the cpoCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpoCode() {
        return cpoCode;
    }

    /**
     * Sets the value of the cpoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpoCode(JAXBElement<String> value) {
        this.cpoCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cpoAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpoAddUser() {
        return cpoAddUser;
    }

    /**
     * Sets the value of the cpoAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpoAddUser(JAXBElement<String> value) {
        this.cpoAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cpoAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpoAddDate() {
        return cpoAddDate;
    }

    /**
     * Sets the value of the cpoAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpoAddDate(JAXBElement<String> value) {
        this.cpoAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cpoChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpoChangeUser() {
        return cpoChangeUser;
    }

    /**
     * Sets the value of the cpoChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpoChangeUser(JAXBElement<String> value) {
        this.cpoChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cpoChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpoChangeDate() {
        return cpoChangeDate;
    }

    /**
     * Sets the value of the cpoChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpoChangeDate(JAXBElement<String> value) {
        this.cpoChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cpoDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCpoDeleteFlag() {
        return cpoDeleteFlag;
    }

    /**
     * Sets the value of the cpoDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCpoDeleteFlag(JAXBElement<Short> value) {
        this.cpoDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cpoKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpoKey() {
        return cpoKey;
    }

    /**
     * Sets the value of the cpoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpoKey(JAXBElement<String> value) {
        this.cpoKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cpoKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpoKeyExt() {
        return cpoKeyExt;
    }

    /**
     * Sets the value of the cpoKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpoKeyExt(JAXBElement<String> value) {
        this.cpoKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cpoChapterFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCpoChapterFlag() {
        return cpoChapterFlag;
    }

    /**
     * Sets the value of the cpoChapterFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCpoChapterFlag(JAXBElement<Short> value) {
        this.cpoChapterFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the cpoDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpoDescription() {
        return cpoDescription;
    }

    /**
     * Sets the value of the cpoDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpoDescription(JAXBElement<String> value) {
        this.cpoDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cpoEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpoEntityKey() {
        return cpoEntityKey;
    }

    /**
     * Sets the value of the cpoEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpoEntityKey(JAXBElement<String> value) {
        this.cpoEntityKey = ((JAXBElement<String> ) value);
    }

}
