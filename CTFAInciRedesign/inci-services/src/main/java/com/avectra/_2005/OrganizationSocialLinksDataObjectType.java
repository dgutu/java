
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organization_Social_Links_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Social_Links_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cel_cst_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cel_facebook_name" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cel_linkedin_name" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cel_twitter_name" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cel_foursquare_name" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cel_facebook_key" type="{http://www.avectra.com/2005/}stringLength250_Type" minOccurs="0"/>
 *         &lt;element name="cel_facebook_secret" type="{http://www.avectra.com/2005/}stringLength250_Type" minOccurs="0"/>
 *         &lt;element name="cel_facebook_id" type="{http://www.avectra.com/2005/}stringLength50_Type" minOccurs="0"/>
 *         &lt;element name="cel_twitter_key" type="{http://www.avectra.com/2005/}stringLength250_Type" minOccurs="0"/>
 *         &lt;element name="cel_twitter_secret" type="{http://www.avectra.com/2005/}stringLength250_Type" minOccurs="0"/>
 *         &lt;element name="cel_linkedin_key" type="{http://www.avectra.com/2005/}stringLength250_Type" minOccurs="0"/>
 *         &lt;element name="cel_linkedin_secret" type="{http://www.avectra.com/2005/}stringLength250_Type" minOccurs="0"/>
 *         &lt;element name="cel_add_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cel_add_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cel_change_user" type="{http://www.avectra.com/2005/}av_user_Type" minOccurs="0"/>
 *         &lt;element name="cel_change_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cel_delete_flag" type="{http://www.avectra.com/2005/}av_delete_flag_Type" minOccurs="0"/>
 *         &lt;element name="cel_entity_key" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cel_profiling_date" type="{http://www.avectra.com/2005/}av_date_Type" minOccurs="0"/>
 *         &lt;element name="cel_flickr_name" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cel_cst_key_ext" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="cel_youtube_name" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *         &lt;element name="cel_slideshare_name" type="{http://www.avectra.com/2005/}stringLength100_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Social_Links_DataObjectType", propOrder = {
    "celCstKey",
    "celFacebookName",
    "celLinkedinName",
    "celTwitterName",
    "celFoursquareName",
    "celFacebookKey",
    "celFacebookSecret",
    "celFacebookId",
    "celTwitterKey",
    "celTwitterSecret",
    "celLinkedinKey",
    "celLinkedinSecret",
    "celAddUser",
    "celAddDate",
    "celChangeUser",
    "celChangeDate",
    "celDeleteFlag",
    "celEntityKey",
    "celProfilingDate",
    "celFlickrName",
    "celCstKeyExt",
    "celYoutubeName",
    "celSlideshareName"
})
public class OrganizationSocialLinksDataObjectType {

    @XmlElementRef(name = "cel_cst_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> celCstKey;
    @XmlElementRef(name = "cel_facebook_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> celFacebookName;
    @XmlElementRef(name = "cel_linkedin_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> celLinkedinName;
    @XmlElementRef(name = "cel_twitter_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> celTwitterName;
    @XmlElementRef(name = "cel_foursquare_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> celFoursquareName;
    @XmlElementRef(name = "cel_facebook_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> celFacebookKey;
    @XmlElementRef(name = "cel_facebook_secret", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> celFacebookSecret;
    @XmlElementRef(name = "cel_facebook_id", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> celFacebookId;
    @XmlElementRef(name = "cel_twitter_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> celTwitterKey;
    @XmlElementRef(name = "cel_twitter_secret", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> celTwitterSecret;
    @XmlElementRef(name = "cel_linkedin_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> celLinkedinKey;
    @XmlElementRef(name = "cel_linkedin_secret", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> celLinkedinSecret;
    @XmlElementRef(name = "cel_add_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> celAddUser;
    @XmlElementRef(name = "cel_add_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> celAddDate;
    @XmlElementRef(name = "cel_change_user", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> celChangeUser;
    @XmlElementRef(name = "cel_change_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> celChangeDate;
    @XmlElementRef(name = "cel_delete_flag", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Short> celDeleteFlag;
    @XmlElementRef(name = "cel_entity_key", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> celEntityKey;
    @XmlElementRef(name = "cel_profiling_date", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> celProfilingDate;
    @XmlElementRef(name = "cel_flickr_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> celFlickrName;
    @XmlElementRef(name = "cel_cst_key_ext", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> celCstKeyExt;
    @XmlElementRef(name = "cel_youtube_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> celYoutubeName;
    @XmlElementRef(name = "cel_slideshare_name", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> celSlideshareName;

    /**
     * Gets the value of the celCstKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelCstKey() {
        return celCstKey;
    }

    /**
     * Sets the value of the celCstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelCstKey(JAXBElement<String> value) {
        this.celCstKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the celFacebookName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelFacebookName() {
        return celFacebookName;
    }

    /**
     * Sets the value of the celFacebookName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelFacebookName(JAXBElement<String> value) {
        this.celFacebookName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the celLinkedinName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelLinkedinName() {
        return celLinkedinName;
    }

    /**
     * Sets the value of the celLinkedinName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelLinkedinName(JAXBElement<String> value) {
        this.celLinkedinName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the celTwitterName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelTwitterName() {
        return celTwitterName;
    }

    /**
     * Sets the value of the celTwitterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelTwitterName(JAXBElement<String> value) {
        this.celTwitterName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the celFoursquareName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelFoursquareName() {
        return celFoursquareName;
    }

    /**
     * Sets the value of the celFoursquareName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelFoursquareName(JAXBElement<String> value) {
        this.celFoursquareName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the celFacebookKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelFacebookKey() {
        return celFacebookKey;
    }

    /**
     * Sets the value of the celFacebookKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelFacebookKey(JAXBElement<String> value) {
        this.celFacebookKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the celFacebookSecret property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelFacebookSecret() {
        return celFacebookSecret;
    }

    /**
     * Sets the value of the celFacebookSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelFacebookSecret(JAXBElement<String> value) {
        this.celFacebookSecret = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the celFacebookId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelFacebookId() {
        return celFacebookId;
    }

    /**
     * Sets the value of the celFacebookId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelFacebookId(JAXBElement<String> value) {
        this.celFacebookId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the celTwitterKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelTwitterKey() {
        return celTwitterKey;
    }

    /**
     * Sets the value of the celTwitterKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelTwitterKey(JAXBElement<String> value) {
        this.celTwitterKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the celTwitterSecret property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelTwitterSecret() {
        return celTwitterSecret;
    }

    /**
     * Sets the value of the celTwitterSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelTwitterSecret(JAXBElement<String> value) {
        this.celTwitterSecret = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the celLinkedinKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelLinkedinKey() {
        return celLinkedinKey;
    }

    /**
     * Sets the value of the celLinkedinKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelLinkedinKey(JAXBElement<String> value) {
        this.celLinkedinKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the celLinkedinSecret property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelLinkedinSecret() {
        return celLinkedinSecret;
    }

    /**
     * Sets the value of the celLinkedinSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelLinkedinSecret(JAXBElement<String> value) {
        this.celLinkedinSecret = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the celAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelAddUser() {
        return celAddUser;
    }

    /**
     * Sets the value of the celAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelAddUser(JAXBElement<String> value) {
        this.celAddUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the celAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelAddDate() {
        return celAddDate;
    }

    /**
     * Sets the value of the celAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelAddDate(JAXBElement<String> value) {
        this.celAddDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the celChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelChangeUser() {
        return celChangeUser;
    }

    /**
     * Sets the value of the celChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelChangeUser(JAXBElement<String> value) {
        this.celChangeUser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the celChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelChangeDate() {
        return celChangeDate;
    }

    /**
     * Sets the value of the celChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelChangeDate(JAXBElement<String> value) {
        this.celChangeDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the celDeleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCelDeleteFlag() {
        return celDeleteFlag;
    }

    /**
     * Sets the value of the celDeleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCelDeleteFlag(JAXBElement<Short> value) {
        this.celDeleteFlag = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the celEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelEntityKey() {
        return celEntityKey;
    }

    /**
     * Sets the value of the celEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelEntityKey(JAXBElement<String> value) {
        this.celEntityKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the celProfilingDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelProfilingDate() {
        return celProfilingDate;
    }

    /**
     * Sets the value of the celProfilingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelProfilingDate(JAXBElement<String> value) {
        this.celProfilingDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the celFlickrName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelFlickrName() {
        return celFlickrName;
    }

    /**
     * Sets the value of the celFlickrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelFlickrName(JAXBElement<String> value) {
        this.celFlickrName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the celCstKeyExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelCstKeyExt() {
        return celCstKeyExt;
    }

    /**
     * Sets the value of the celCstKeyExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelCstKeyExt(JAXBElement<String> value) {
        this.celCstKeyExt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the celYoutubeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelYoutubeName() {
        return celYoutubeName;
    }

    /**
     * Sets the value of the celYoutubeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelYoutubeName(JAXBElement<String> value) {
        this.celYoutubeName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the celSlideshareName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelSlideshareName() {
        return celSlideshareName;
    }

    /**
     * Sets the value of the celSlideshareName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelSlideshareName(JAXBElement<String> value) {
        this.celSlideshareName = ((JAXBElement<String> ) value);
    }

}
