
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebUser_Customer_DataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebUser_Customer_DataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cst_recno" type="{http://www.avectra.com/2005/}av_recno_Type" minOccurs="0"/>
 *         &lt;element name="cst_web_login" type="{http://www.avectra.com/2005/}stringLength80_Type" minOccurs="0"/>
 *         &lt;element name="cst_new_password" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *         &lt;element name="cst_new_password_confirm" type="{http://www.avectra.com/2005/}stringLength0_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebUser_Customer_DataObjectType", propOrder = {
    "cstRecno",
    "cstWebLogin",
    "cstNewPassword",
    "cstNewPasswordConfirm"
})
public class WebUserCustomerDataObjectType {

    @XmlElementRef(name = "cst_recno", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<Long> cstRecno;
    @XmlElementRef(name = "cst_web_login", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstWebLogin;
    @XmlElementRef(name = "cst_new_password", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstNewPassword;
    @XmlElementRef(name = "cst_new_password_confirm", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> cstNewPasswordConfirm;

    /**
     * Gets the value of the cstRecno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCstRecno() {
        return cstRecno;
    }

    /**
     * Sets the value of the cstRecno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCstRecno(JAXBElement<Long> value) {
        this.cstRecno = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the cstWebLogin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstWebLogin() {
        return cstWebLogin;
    }

    /**
     * Sets the value of the cstWebLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstWebLogin(JAXBElement<String> value) {
        this.cstWebLogin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstNewPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstNewPassword() {
        return cstNewPassword;
    }

    /**
     * Sets the value of the cstNewPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstNewPassword(JAXBElement<String> value) {
        this.cstNewPassword = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cstNewPasswordConfirm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCstNewPasswordConfirm() {
        return cstNewPasswordConfirm;
    }

    /**
     * Sets the value of the cstNewPasswordConfirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCstNewPasswordConfirm(JAXBElement<String> value) {
        this.cstNewPasswordConfirm = ((JAXBElement<String> ) value);
    }

}
