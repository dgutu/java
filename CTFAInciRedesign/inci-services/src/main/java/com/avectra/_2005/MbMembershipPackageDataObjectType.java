
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mb_membership_Package_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mb_membership_Package_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pak_prd_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pak_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="pak_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="pak_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="pak_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="pak_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="pak_prd_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pak_dues_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="pak_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pak_sell_online_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="pak_post_online_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="pak_remove_online_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="pak_allow_installment" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="pak_has_optional_components" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="pak_optional_item_count" type="{http://www.avectra.com/2005/}av_integer_Type" minOccurs="0"/>
 *         &lt;element name="pak_prd_renewal_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="pak_events_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="pak_hide_components_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mb_membership_Package_DataObjectType", propOrder = {
    "pakPrdKey",
    "pakAddUser",
    "pakAddDate",
    "pakChangeUser",
    "pakChangeDate",
    "pakDeleteFlag",
    "pakPrdKeyExt",
    "pakDuesFlag",
    "pakEntityKey",
    "pakSellOnlineFlag",
    "pakPostOnlineDate",
    "pakRemoveOnlineDate",
    "pakAllowInstallment",
    "pakHasOptionalComponents",
    "pakOptionalItemCount",
    "pakPrdRenewalKey",
    "pakEventsFlag",
    "pakHideComponentsFlag"
})
public class MbMembershipPackageDataObjectType {

    @XmlElementRef(name = "pak_prd_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pakPrdKey;
    @XmlElementRef(name = "pak_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pakAddUser;
    @XmlElementRef(name = "pak_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pakAddDate;
    @XmlElementRef(name = "pak_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pakChangeUser;
    @XmlElementRef(name = "pak_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pakChangeDate;
    @XmlElementRef(name = "pak_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> pakDeleteFlag;
    @XmlElementRef(name = "pak_prd_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pakPrdKeyExt;
    @XmlElementRef(name = "pak_dues_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> pakDuesFlag;
    @XmlElementRef(name = "pak_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pakEntityKey;
    @XmlElementRef(name = "pak_sell_online_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> pakSellOnlineFlag;
    @XmlElementRef(name = "pak_post_online_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pakPostOnlineDate;
    @XmlElementRef(name = "pak_remove_online_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pakRemoveOnlineDate;
    @XmlElementRef(name = "pak_allow_installment", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> pakAllowInstallment;
    @XmlElementRef(name = "pak_has_optional_components", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> pakHasOptionalComponents;
    @XmlElementRef(name = "pak_optional_item_count", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Integer> pakOptionalItemCount;
    @XmlElementRef(name = "pak_prd_renewal_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> pakPrdRenewalKey;
    @XmlElementRef(name = "pak_events_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> pakEventsFlag;
    @XmlElementRef(name = "pak_hide_components_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> pakHideComponentsFlag;

    /**
     * Gets the value of the pakPrdKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPakPrdKey() {
        return pakPrdKey;
    }

    /**
     * Sets the value of the pakPrdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPakPrdKey(JAXBElement<String> value) {
        this.pakPrdKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pakAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPakAddUser() {
        return pakAddUser;
    }

    /**
     * Sets the value of the pakAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPakAddUser(JAXBElement<String> value) {
        this.pakAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pakAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPakAddDate() {
        return pakAddDate;
    }

    /**
     * Sets the value of the pakAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPakAddDate(JAXBElement<String> value) {
        this.pakAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pakChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPakChangeUser() {
        return pakChangeUser;
    }

    /**
     * Sets the value of the pakChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPakChangeUser(JAXBElement<String> value) {
        this.pakChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pakChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPakChangeDate() {
        return pakChangeDate;
    }

    /**
     * Sets the value of the pakChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPakChangeDate(JAXBElement<String> value) {
        this.pakChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pakDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPakDeleteFlag() {
        return pakDeleteFlag;
    }

    /**
     * Sets the value of the pakDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPakDeleteFlag(JAXBElement<Short> value) {
        this.pakDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the pakPrdKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPakPrdKeyExt() {
        return pakPrdKeyExt;
    }

    /**
     * Sets the value of the pakPrdKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPakPrdKeyExt(JAXBElement<String> value) {
        this.pakPrdKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pakDuesFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPakDuesFlag() {
        return pakDuesFlag;
    }

    /**
     * Sets the value of the pakDuesFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPakDuesFlag(JAXBElement<Short> value) {
        this.pakDuesFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the pakEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPakEntityKey() {
        return pakEntityKey;
    }

    /**
     * Sets the value of the pakEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPakEntityKey(JAXBElement<String> value) {
        this.pakEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pakSellOnlineFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPakSellOnlineFlag() {
        return pakSellOnlineFlag;
    }

    /**
     * Sets the value of the pakSellOnlineFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPakSellOnlineFlag(JAXBElement<Short> value) {
        this.pakSellOnlineFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the pakPostOnlineDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPakPostOnlineDate() {
        return pakPostOnlineDate;
    }

    /**
     * Sets the value of the pakPostOnlineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPakPostOnlineDate(JAXBElement<String> value) {
        this.pakPostOnlineDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pakRemoveOnlineDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPakRemoveOnlineDate() {
        return pakRemoveOnlineDate;
    }

    /**
     * Sets the value of the pakRemoveOnlineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPakRemoveOnlineDate(JAXBElement<String> value) {
        this.pakRemoveOnlineDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pakAllowInstallment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPakAllowInstallment() {
        return pakAllowInstallment;
    }

    /**
     * Sets the value of the pakAllowInstallment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPakAllowInstallment(JAXBElement<Short> value) {
        this.pakAllowInstallment = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the pakHasOptionalComponents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPakHasOptionalComponents() {
        return pakHasOptionalComponents;
    }

    /**
     * Sets the value of the pakHasOptionalComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPakHasOptionalComponents(JAXBElement<Short> value) {
        this.pakHasOptionalComponents = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the pakOptionalItemCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPakOptionalItemCount() {
        return pakOptionalItemCount;
    }

    /**
     * Sets the value of the pakOptionalItemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPakOptionalItemCount(JAXBElement<Integer> value) {
        this.pakOptionalItemCount = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the pakPrdRenewalKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPakPrdRenewalKey() {
        return pakPrdRenewalKey;
    }

    /**
     * Sets the value of the pakPrdRenewalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPakPrdRenewalKey(JAXBElement<String> value) {
        this.pakPrdRenewalKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pakEventsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPakEventsFlag() {
        return pakEventsFlag;
    }

    /**
     * Sets the value of the pakEventsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPakEventsFlag(JAXBElement<Short> value) {
        this.pakEventsFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the pakHideComponentsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPakHideComponentsFlag() {
        return pakHideComponentsFlag;
    }

    /**
     * Sets the value of the pakHideComponentsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPakHideComponentsFlag(JAXBElement<Short> value) {
        this.pakHideComponentsFlag = ((JAXBElement<Short> ) value);
    }

}
