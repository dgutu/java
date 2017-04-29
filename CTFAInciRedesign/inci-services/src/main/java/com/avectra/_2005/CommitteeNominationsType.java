
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommitteeNominationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitteeNominationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentKey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="Nominations" type="{http://www.avectra.com/2005/}CommitteeNominations_Nominations_DataObjectType"/>
 *         &lt;element name="Nominee" type="{http://www.avectra.com/2005/}CommitteeNominations_Nominee_DataObjectType"/>
 *         &lt;element name="Nominated_By" type="{http://www.avectra.com/2005/}CommitteeNominations_Nominated_By_DataObjectType"/>
 *         &lt;element name="Committee" type="{http://www.avectra.com/2005/}CommitteeNominations_Committee_DataObjectType"/>
 *         &lt;element name="Committee_Nomination_Status" type="{http://www.avectra.com/2005/}CommitteeNominations_Committee_Nomination_Status_DataObjectType"/>
 *         &lt;element name="Committee_Position" type="{http://www.avectra.com/2005/}CommitteeNominations_Committee_Position_DataObjectType"/>
 *         &lt;element name="Committee_Position_Codes" type="{http://www.avectra.com/2005/}CommitteeNominations_Committee_Position_Codes_DataObjectType"/>
 *         &lt;element name="Address" type="{http://www.avectra.com/2005/}CommitteeNominations_Address_DataObjectType"/>
 *         &lt;element name="Individual" type="{http://www.avectra.com/2005/}CommitteeNominations_Individual_DataObjectType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitteeNominationsType", propOrder = {
    "currentKey",
    "nominations",
    "nominee",
    "nominatedBy",
    "committee",
    "committeeNominationStatus",
    "committeePosition",
    "committeePositionCodes",
    "address",
    "individual"
})
public class CommitteeNominationsType {

    @XmlElementRef(name = "CurrentKey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> currentKey;
    @XmlElement(name = "Nominations", required = true)
    protected CommitteeNominationsNominationsDataObjectType nominations;
    @XmlElement(name = "Nominee", required = true)
    protected CommitteeNominationsNomineeDataObjectType nominee;
    @XmlElement(name = "Nominated_By", required = true)
    protected CommitteeNominationsNominatedByDataObjectType nominatedBy;
    @XmlElement(name = "Committee", required = true)
    protected CommitteeNominationsCommitteeDataObjectType committee;
    @XmlElement(name = "Committee_Nomination_Status", required = true)
    protected CommitteeNominationsCommitteeNominationStatusDataObjectType committeeNominationStatus;
    @XmlElement(name = "Committee_Position", required = true)
    protected CommitteeNominationsCommitteePositionDataObjectType committeePosition;
    @XmlElement(name = "Committee_Position_Codes", required = true)
    protected CommitteeNominationsCommitteePositionCodesDataObjectType committeePositionCodes;
    @XmlElement(name = "Address", required = true)
    protected CommitteeNominationsAddressDataObjectType address;
    @XmlElement(name = "Individual", required = true)
    protected CommitteeNominationsIndividualDataObjectType individual;

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
     * Gets the value of the nominations property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeNominationsNominationsDataObjectType }
     *     
     */
    public CommitteeNominationsNominationsDataObjectType getNominations() {
        return nominations;
    }

    /**
     * Sets the value of the nominations property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeNominationsNominationsDataObjectType }
     *     
     */
    public void setNominations(CommitteeNominationsNominationsDataObjectType value) {
        this.nominations = value;
    }

    /**
     * Gets the value of the nominee property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeNominationsNomineeDataObjectType }
     *     
     */
    public CommitteeNominationsNomineeDataObjectType getNominee() {
        return nominee;
    }

    /**
     * Sets the value of the nominee property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeNominationsNomineeDataObjectType }
     *     
     */
    public void setNominee(CommitteeNominationsNomineeDataObjectType value) {
        this.nominee = value;
    }

    /**
     * Gets the value of the nominatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeNominationsNominatedByDataObjectType }
     *     
     */
    public CommitteeNominationsNominatedByDataObjectType getNominatedBy() {
        return nominatedBy;
    }

    /**
     * Sets the value of the nominatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeNominationsNominatedByDataObjectType }
     *     
     */
    public void setNominatedBy(CommitteeNominationsNominatedByDataObjectType value) {
        this.nominatedBy = value;
    }

    /**
     * Gets the value of the committee property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeNominationsCommitteeDataObjectType }
     *     
     */
    public CommitteeNominationsCommitteeDataObjectType getCommittee() {
        return committee;
    }

    /**
     * Sets the value of the committee property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeNominationsCommitteeDataObjectType }
     *     
     */
    public void setCommittee(CommitteeNominationsCommitteeDataObjectType value) {
        this.committee = value;
    }

    /**
     * Gets the value of the committeeNominationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeNominationsCommitteeNominationStatusDataObjectType }
     *     
     */
    public CommitteeNominationsCommitteeNominationStatusDataObjectType getCommitteeNominationStatus() {
        return committeeNominationStatus;
    }

    /**
     * Sets the value of the committeeNominationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeNominationsCommitteeNominationStatusDataObjectType }
     *     
     */
    public void setCommitteeNominationStatus(CommitteeNominationsCommitteeNominationStatusDataObjectType value) {
        this.committeeNominationStatus = value;
    }

    /**
     * Gets the value of the committeePosition property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeNominationsCommitteePositionDataObjectType }
     *     
     */
    public CommitteeNominationsCommitteePositionDataObjectType getCommitteePosition() {
        return committeePosition;
    }

    /**
     * Sets the value of the committeePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeNominationsCommitteePositionDataObjectType }
     *     
     */
    public void setCommitteePosition(CommitteeNominationsCommitteePositionDataObjectType value) {
        this.committeePosition = value;
    }

    /**
     * Gets the value of the committeePositionCodes property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeNominationsCommitteePositionCodesDataObjectType }
     *     
     */
    public CommitteeNominationsCommitteePositionCodesDataObjectType getCommitteePositionCodes() {
        return committeePositionCodes;
    }

    /**
     * Sets the value of the committeePositionCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeNominationsCommitteePositionCodesDataObjectType }
     *     
     */
    public void setCommitteePositionCodes(CommitteeNominationsCommitteePositionCodesDataObjectType value) {
        this.committeePositionCodes = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeNominationsAddressDataObjectType }
     *     
     */
    public CommitteeNominationsAddressDataObjectType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeNominationsAddressDataObjectType }
     *     
     */
    public void setAddress(CommitteeNominationsAddressDataObjectType value) {
        this.address = value;
    }

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeNominationsIndividualDataObjectType }
     *     
     */
    public CommitteeNominationsIndividualDataObjectType getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeNominationsIndividualDataObjectType }
     *     
     */
    public void setIndividual(CommitteeNominationsIndividualDataObjectType value) {
        this.individual = value;
    }

}
