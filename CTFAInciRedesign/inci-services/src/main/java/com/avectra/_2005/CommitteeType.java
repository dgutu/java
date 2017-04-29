
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommitteeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitteeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentKey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="Committee" type="{http://www.avectra.com/2005/}Committee_Committee_DataObjectType"/>
 *         &lt;element name="Parent_Committee" type="{http://www.avectra.com/2005/}Committee_Parent_Committee_DataObjectType"/>
 *         &lt;element name="Customer" type="{http://www.avectra.com/2005/}Committee_Customer_DataObjectType"/>
 *         &lt;element name="Committee_Participant" type="{http://www.avectra.com/2005/}Committee_Committee_Participant_DataObjectType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitteeType", propOrder = {
    "currentKey",
    "committee",
    "parentCommittee",
    "customer",
    "committeeParticipant"
})
public class CommitteeType {

    @XmlElementRef(name = "CurrentKey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> currentKey;
    @XmlElement(name = "Committee", required = true)
    protected CommitteeCommitteeDataObjectType committee;
    @XmlElement(name = "Parent_Committee", required = true)
    protected CommitteeParentCommitteeDataObjectType parentCommittee;
    @XmlElement(name = "Customer", required = true)
    protected CommitteeCustomerDataObjectType customer;
    @XmlElement(name = "Committee_Participant", required = true)
    protected CommitteeCommitteeParticipantDataObjectType committeeParticipant;

    /**
     * Gets the value of the currentKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentKey() {
        return currentKey;
    }

    /**
     * Sets the value of the currentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentKey(JAXBElement<String> value) {
        this.currentKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the committee property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeCommitteeDataObjectType }
     *     
     */
    public CommitteeCommitteeDataObjectType getCommittee() {
        return committee;
    }

    /**
     * Sets the value of the committee property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeCommitteeDataObjectType }
     *     
     */
    public void setCommittee(CommitteeCommitteeDataObjectType value) {
        this.committee = value;
    }

    /**
     * Gets the value of the parentCommittee property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeParentCommitteeDataObjectType }
     *     
     */
    public CommitteeParentCommitteeDataObjectType getParentCommittee() {
        return parentCommittee;
    }

    /**
     * Sets the value of the parentCommittee property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeParentCommitteeDataObjectType }
     *     
     */
    public void setParentCommittee(CommitteeParentCommitteeDataObjectType value) {
        this.parentCommittee = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeCustomerDataObjectType }
     *     
     */
    public CommitteeCustomerDataObjectType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeCustomerDataObjectType }
     *     
     */
    public void setCustomer(CommitteeCustomerDataObjectType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the committeeParticipant property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeCommitteeParticipantDataObjectType }
     *     
     */
    public CommitteeCommitteeParticipantDataObjectType getCommitteeParticipant() {
        return committeeParticipant;
    }

    /**
     * Sets the value of the committeeParticipant property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeCommitteeParticipantDataObjectType }
     *     
     */
    public void setCommitteeParticipant(CommitteeCommitteeParticipantDataObjectType value) {
        this.committeeParticipant = value;
    }

}
