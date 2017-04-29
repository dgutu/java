
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactRequest_Document_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactRequest_Document_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="doc_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="doc_number" type="{http://www.avectra.com/2005/}stringLength20_Type" minOccurs="0"/>
 *         &lt;element name="doc_summary" type="{http://www.avectra.com/2005/}stringLength60_Type" minOccurs="0"/>
 *         &lt;element name="doc_description" type="{http://www.avectra.com/2005/}stringLength500_Type" minOccurs="0"/>
 *         &lt;element name="doc_url" type="{http://www.avectra.com/2005/}av_url_Type" minOccurs="0"/>
 *         &lt;element name="doc_file_name" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="doc_display_name" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="doc_distrib_email_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="doc_distrib_fax_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="doc_distrib_mail_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="doc_distrib_online_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="doc_send_always_flag" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="doc_add_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="doc_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="doc_change_date" type="{http://www.avectra.com/2005/}av_date_small_Type" minOccurs="0"/>
 *         &lt;element name="doc_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="doc_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="doc_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="doc_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="doc_author" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="doc_source" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="doc_category" type="{http://www.avectra.com/2005/}stringLength200_Type" minOccurs="0"/>
 *         &lt;element name="doc_allow_search" type="{http://www.avectra.com/2005/}av_flag_Type" minOccurs="0"/>
 *         &lt;element name="doc_text" type="{http://www.avectra.com/2005/}av_text_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactRequest_Document_DataObjectType", propOrder = {
    "docKey",
    "docNumber",
    "docSummary",
    "docDescription",
    "docUrl",
    "docFileName",
    "docDisplayName",
    "docDistribEmailFlag",
    "docDistribFaxFlag",
    "docDistribMailFlag",
    "docDistribOnlineFlag",
    "docSendAlwaysFlag",
    "docAddDate",
    "docAddUser",
    "docChangeDate",
    "docChangeUser",
    "docDeleteFlag",
    "docKeyExt",
    "docEntityKey",
    "docAuthor",
    "docSource",
    "docCategory",
    "docAllowSearch",
    "docText"
})
public class ContactRequestDocumentDataObjectType {

    @XmlElementRef(name = "doc_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> docKey;
    @XmlElementRef(name = "doc_number", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> docNumber;
    @XmlElementRef(name = "doc_summary", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> docSummary;
    @XmlElementRef(name = "doc_description", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> docDescription;
    @XmlElementRef(name = "doc_url", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> docUrl;
    @XmlElementRef(name = "doc_file_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> docFileName;
    @XmlElementRef(name = "doc_display_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> docDisplayName;
    @XmlElementRef(name = "doc_distrib_email_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> docDistribEmailFlag;
    @XmlElementRef(name = "doc_distrib_fax_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> docDistribFaxFlag;
    @XmlElementRef(name = "doc_distrib_mail_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> docDistribMailFlag;
    @XmlElementRef(name = "doc_distrib_online_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> docDistribOnlineFlag;
    @XmlElementRef(name = "doc_send_always_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> docSendAlwaysFlag;
    @XmlElementRef(name = "doc_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> docAddDate;
    @XmlElementRef(name = "doc_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> docAddUser;
    @XmlElementRef(name = "doc_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> docChangeDate;
    @XmlElementRef(name = "doc_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> docChangeUser;
    @XmlElementRef(name = "doc_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> docDeleteFlag;
    @XmlElementRef(name = "doc_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> docKeyExt;
    @XmlElementRef(name = "doc_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> docEntityKey;
    @XmlElementRef(name = "doc_author", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> docAuthor;
    @XmlElementRef(name = "doc_source", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> docSource;
    @XmlElementRef(name = "doc_category", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> docCategory;
    @XmlElementRef(name = "doc_allow_search", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> docAllowSearch;
    @XmlElementRef(name = "doc_text", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> docText;

    /**
     * Gets the value of the docKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocKey() {
        return docKey;
    }

    /**
     * Sets the value of the docKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocKey(JAXBElement<String> value) {
        this.docKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocNumber(JAXBElement<String> value) {
        this.docNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the docSummary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocSummary() {
        return docSummary;
    }

    /**
     * Sets the value of the docSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocSummary(JAXBElement<String> value) {
        this.docSummary = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the docDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocDescription() {
        return docDescription;
    }

    /**
     * Sets the value of the docDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocDescription(JAXBElement<String> value) {
        this.docDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the docUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocUrl() {
        return docUrl;
    }

    /**
     * Sets the value of the docUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocUrl(JAXBElement<String> value) {
        this.docUrl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the docFileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocFileName() {
        return docFileName;
    }

    /**
     * Sets the value of the docFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocFileName(JAXBElement<String> value) {
        this.docFileName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the docDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocDisplayName() {
        return docDisplayName;
    }

    /**
     * Sets the value of the docDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocDisplayName(JAXBElement<String> value) {
        this.docDisplayName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the docDistribEmailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getDocDistribEmailFlag() {
        return docDistribEmailFlag;
    }

    /**
     * Sets the value of the docDistribEmailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setDocDistribEmailFlag(JAXBElement<Short> value) {
        this.docDistribEmailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the docDistribFaxFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getDocDistribFaxFlag() {
        return docDistribFaxFlag;
    }

    /**
     * Sets the value of the docDistribFaxFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setDocDistribFaxFlag(JAXBElement<Short> value) {
        this.docDistribFaxFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the docDistribMailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getDocDistribMailFlag() {
        return docDistribMailFlag;
    }

    /**
     * Sets the value of the docDistribMailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setDocDistribMailFlag(JAXBElement<Short> value) {
        this.docDistribMailFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the docDistribOnlineFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getDocDistribOnlineFlag() {
        return docDistribOnlineFlag;
    }

    /**
     * Sets the value of the docDistribOnlineFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setDocDistribOnlineFlag(JAXBElement<Short> value) {
        this.docDistribOnlineFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the docSendAlwaysFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getDocSendAlwaysFlag() {
        return docSendAlwaysFlag;
    }

    /**
     * Sets the value of the docSendAlwaysFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setDocSendAlwaysFlag(JAXBElement<Short> value) {
        this.docSendAlwaysFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the docAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocAddDate() {
        return docAddDate;
    }

    /**
     * Sets the value of the docAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocAddDate(JAXBElement<String> value) {
        this.docAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the docAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocAddUser() {
        return docAddUser;
    }

    /**
     * Sets the value of the docAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocAddUser(JAXBElement<String> value) {
        this.docAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the docChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocChangeDate() {
        return docChangeDate;
    }

    /**
     * Sets the value of the docChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocChangeDate(JAXBElement<String> value) {
        this.docChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the docChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocChangeUser() {
        return docChangeUser;
    }

    /**
     * Sets the value of the docChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocChangeUser(JAXBElement<String> value) {
        this.docChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the docDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getDocDeleteFlag() {
        return docDeleteFlag;
    }

    /**
     * Sets the value of the docDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setDocDeleteFlag(JAXBElement<Short> value) {
        this.docDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the docKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocKeyExt() {
        return docKeyExt;
    }

    /**
     * Sets the value of the docKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocKeyExt(JAXBElement<String> value) {
        this.docKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the docEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocEntityKey() {
        return docEntityKey;
    }

    /**
     * Sets the value of the docEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocEntityKey(JAXBElement<String> value) {
        this.docEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the docAuthor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocAuthor() {
        return docAuthor;
    }

    /**
     * Sets the value of the docAuthor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocAuthor(JAXBElement<String> value) {
        this.docAuthor = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the docSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocSource() {
        return docSource;
    }

    /**
     * Sets the value of the docSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocSource(JAXBElement<String> value) {
        this.docSource = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the docCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocCategory() {
        return docCategory;
    }

    /**
     * Sets the value of the docCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocCategory(JAXBElement<String> value) {
        this.docCategory = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the docAllowSearch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getDocAllowSearch() {
        return docAllowSearch;
    }

    /**
     * Sets the value of the docAllowSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setDocAllowSearch(JAXBElement<Short> value) {
        this.docAllowSearch = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the docText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocText() {
        return docText;
    }

    /**
     * Sets the value of the docText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocText(JAXBElement<String> value) {
        this.docText = ((JAXBElement<String> ) value);
    }

}
