
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommitteeNominations_Committee_Position_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitteeNominations_Committee_Position_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cop_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cop_cmt_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cop_cpo_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cop_order" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="cop_term" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="cop_funded_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cop_renewable_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cop_voting_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cop_admin_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cop_chapter_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="cop_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cop_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cop_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cop_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cop_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cop_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cop_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitteeNominations_Committee_Position_DataObjectType", propOrder = {
    "copKey",
    "copCmtKey",
    "copCpoKey",
    "copOrder",
    "copTerm",
    "copFundedFlag",
    "copRenewableFlag",
    "copVotingFlag",
    "copAdminFlag",
    "copChapterFlag",
    "copAddUser",
    "copAddDate",
    "copChangeUser",
    "copChangeDate",
    "copDeleteFlag",
    "copEntityKey",
    "copKeyExt"
})
public class CommitteeNominationsCommitteePositionDataObjectType {

    @XmlElementRef(name = "cop_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> copKey;
    @XmlElementRef(name = "cop_cmt_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> copCmtKey;
    @XmlElementRef(name = "cop_cpo_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> copCpoKey;
    @XmlElementRef(name = "cop_order", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> copOrder;
    @XmlElementRef(name = "cop_term", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> copTerm;
    @XmlElementRef(name = "cop_funded_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> copFundedFlag;
    @XmlElementRef(name = "cop_renewable_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> copRenewableFlag;
    @XmlElementRef(name = "cop_voting_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> copVotingFlag;
    @XmlElementRef(name = "cop_admin_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> copAdminFlag;
    @XmlElementRef(name = "cop_chapter_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> copChapterFlag;
    @XmlElementRef(name = "cop_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> copAddUser;
    @XmlElementRef(name = "cop_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> copAddDate;
    @XmlElementRef(name = "cop_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> copChangeUser;
    @XmlElementRef(name = "cop_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> copChangeDate;
    @XmlElementRef(name = "cop_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> copDeleteFlag;
    @XmlElementRef(name = "cop_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> copEntityKey;
    @XmlElementRef(name = "cop_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> copKeyExt;

    /**
     * Gets the value of the copKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCopKey() {
        return copKey;
    }

    /**
     * Sets the value of the copKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCopKey(JAXBElement<String> value) {
        this.copKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the copCmtKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCopCmtKey() {
        return copCmtKey;
    }

    /**
     * Sets the value of the copCmtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCopCmtKey(JAXBElement<String> value) {
        this.copCmtKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the copCpoKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCopCpoKey() {
        return copCpoKey;
    }

    /**
     * Sets the value of the copCpoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCopCpoKey(JAXBElement<String> value) {
        this.copCpoKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the copOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCopOrder() {
        return copOrder;
    }

    /**
     * Sets the value of the copOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCopOrder(JAXBElement<Integer> value) {
        this.copOrder = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the copTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCopTerm() {
        return copTerm;
    }

    /**
     * Sets the value of the copTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCopTerm(JAXBElement<String> value) {
        this.copTerm = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the copFundedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCopFundedFlag() {
        return copFundedFlag;
    }

    /**
     * Sets the value of the copFundedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCopFundedFlag(JAXBElement<Short> value) {
        this.copFundedFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the copRenewableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCopRenewableFlag() {
        return copRenewableFlag;
    }

    /**
     * Sets the value of the copRenewableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCopRenewableFlag(JAXBElement<Short> value) {
        this.copRenewableFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the copVotingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCopVotingFlag() {
        return copVotingFlag;
    }

    /**
     * Sets the value of the copVotingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCopVotingFlag(JAXBElement<Short> value) {
        this.copVotingFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the copAdminFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCopAdminFlag() {
        return copAdminFlag;
    }

    /**
     * Sets the value of the copAdminFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCopAdminFlag(JAXBElement<Short> value) {
        this.copAdminFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the copChapterFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCopChapterFlag() {
        return copChapterFlag;
    }

    /**
     * Sets the value of the copChapterFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCopChapterFlag(JAXBElement<Short> value) {
        this.copChapterFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the copAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCopAddUser() {
        return copAddUser;
    }

    /**
     * Sets the value of the copAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCopAddUser(JAXBElement<String> value) {
        this.copAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the copAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCopAddDate() {
        return copAddDate;
    }

    /**
     * Sets the value of the copAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCopAddDate(JAXBElement<String> value) {
        this.copAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the copChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCopChangeUser() {
        return copChangeUser;
    }

    /**
     * Sets the value of the copChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCopChangeUser(JAXBElement<String> value) {
        this.copChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the copChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCopChangeDate() {
        return copChangeDate;
    }

    /**
     * Sets the value of the copChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCopChangeDate(JAXBElement<String> value) {
        this.copChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the copDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCopDeleteFlag() {
        return copDeleteFlag;
    }

    /**
     * Sets the value of the copDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCopDeleteFlag(JAXBElement<Short> value) {
        this.copDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the copEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCopEntityKey() {
        return copEntityKey;
    }

    /**
     * Sets the value of the copEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCopEntityKey(JAXBElement<String> value) {
        this.copEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the copKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCopKeyExt() {
        return copKeyExt;
    }

    /**
     * Sets the value of the copKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCopKeyExt(JAXBElement<String> value) {
        this.copKeyExt = ((JAXBElement<String> ) value);
    }

}
