
package com.avectra._2005;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentKey" type="{http://www.avectra.com/2005/}av_key_Type" minOccurs="0"/>
 *         &lt;element name="Contact_Request" type="{http://www.avectra.com/2005/}ContactRequest_Contact_Request_DataObjectType"/>
 *         &lt;element name="Customer" type="{http://www.avectra.com/2005/}ContactRequest_Customer_DataObjectType"/>
 *         &lt;element name="Individual" type="{http://www.avectra.com/2005/}ContactRequest_Individual_DataObjectType"/>
 *         &lt;element name="Comments" type="{http://www.avectra.com/2005/}ContactRequest_Comments_DataObjectType"/>
 *         &lt;element name="Document" type="{http://www.avectra.com/2005/}ContactRequest_Document_DataObjectType"/>
 *         &lt;element name="Primary_Address_XRef" type="{http://www.avectra.com/2005/}ContactRequest_Primary_Address_XRef_DataObjectType"/>
 *         &lt;element name="Primary_Address" type="{http://www.avectra.com/2005/}ContactRequest_Primary_Address_DataObjectType"/>
 *         &lt;element name="Assignment_Customer" type="{http://www.avectra.com/2005/}ContactRequest_Assignment_Customer_DataObjectType"/>
 *         &lt;element name="Customer_Alias" type="{http://www.avectra.com/2005/}ContactRequest_Customer_Alias_DataObjectType"/>
 *         &lt;element name="Customer_Activity" type="{http://www.avectra.com/2005/}ContactRequest_Customer_Activity_DataObjectType"/>
 *         &lt;element name="Assignment" type="{http://www.avectra.com/2005/}ContactRequest_Assignment_DataObjectType"/>
 *         &lt;element name="Org_Customer" type="{http://www.avectra.com/2005/}ContactRequest_Org_Customer_DataObjectType"/>
 *         &lt;element name="Org_Request" type="{http://www.avectra.com/2005/}ContactRequest_Org_Request_DataObjectType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactRequestType", propOrder = {
    "currentKey",
    "contactRequest",
    "customer",
    "individual",
    "comments",
    "document",
    "primaryAddressXRef",
    "primaryAddress",
    "assignmentCustomer",
    "customerAlias",
    "customerActivity",
    "assignment",
    "orgCustomer",
    "orgRequest"
})
public class ContactRequestType {

    @XmlElementRef(name = "CurrentKey", namespace = "http://www.avectra.com/2005/", type = JAXBElement.class)
    protected JAXBElement<String> currentKey;
    @XmlElement(name = "Contact_Request", required = true)
    protected ContactRequestContactRequestDataObjectType contactRequest;
    @XmlElement(name = "Customer", required = true)
    protected ContactRequestCustomerDataObjectType customer;
    @XmlElement(name = "Individual", required = true)
    protected ContactRequestIndividualDataObjectType individual;
    @XmlElement(name = "Comments", required = true)
    protected ContactRequestCommentsDataObjectType comments;
    @XmlElement(name = "Document", required = true)
    protected ContactRequestDocumentDataObjectType document;
    @XmlElement(name = "Primary_Address_XRef", required = true)
    protected ContactRequestPrimaryAddressXRefDataObjectType primaryAddressXRef;
    @XmlElement(name = "Primary_Address", required = true)
    protected ContactRequestPrimaryAddressDataObjectType primaryAddress;
    @XmlElement(name = "Assignment_Customer", required = true)
    protected ContactRequestAssignmentCustomerDataObjectType assignmentCustomer;
    @XmlElement(name = "Customer_Alias", required = true)
    protected ContactRequestCustomerAliasDataObjectType customerAlias;
    @XmlElement(name = "Customer_Activity", required = true)
    protected ContactRequestCustomerActivityDataObjectType customerActivity;
    @XmlElement(name = "Assignment", required = true)
    protected ContactRequestAssignmentDataObjectType assignment;
    @XmlElement(name = "Org_Customer", required = true)
    protected ContactRequestOrgCustomerDataObjectType orgCustomer;
    @XmlElement(name = "Org_Request", required = true)
    protected ContactRequestOrgRequestDataObjectType orgRequest;

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
     * Gets the value of the contactRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ContactRequestContactRequestDataObjectType }
     *     
     */
    public ContactRequestContactRequestDataObjectType getContactRequest() {
        return contactRequest;
    }

    /**
     * Sets the value of the contactRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactRequestContactRequestDataObjectType }
     *     
     */
    public void setContactRequest(ContactRequestContactRequestDataObjectType value) {
        this.contactRequest = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link ContactRequestCustomerDataObjectType }
     *     
     */
    public ContactRequestCustomerDataObjectType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactRequestCustomerDataObjectType }
     *     
     */
    public void setCustomer(ContactRequestCustomerDataObjectType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link ContactRequestIndividualDataObjectType }
     *     
     */
    public ContactRequestIndividualDataObjectType getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactRequestIndividualDataObjectType }
     *     
     */
    public void setIndividual(ContactRequestIndividualDataObjectType value) {
        this.individual = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link ContactRequestCommentsDataObjectType }
     *     
     */
    public ContactRequestCommentsDataObjectType getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactRequestCommentsDataObjectType }
     *     
     */
    public void setComments(ContactRequestCommentsDataObjectType value) {
        this.comments = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link ContactRequestDocumentDataObjectType }
     *     
     */
    public ContactRequestDocumentDataObjectType getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactRequestDocumentDataObjectType }
     *     
     */
    public void setDocument(ContactRequestDocumentDataObjectType value) {
        this.document = value;
    }

    /**
     * Gets the value of the primaryAddressXRef property.
     * 
     * @return
     *     possible object is
     *     {@link ContactRequestPrimaryAddressXRefDataObjectType }
     *     
     */
    public ContactRequestPrimaryAddressXRefDataObjectType getPrimaryAddressXRef() {
        return primaryAddressXRef;
    }

    /**
     * Sets the value of the primaryAddressXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactRequestPrimaryAddressXRefDataObjectType }
     *     
     */
    public void setPrimaryAddressXRef(ContactRequestPrimaryAddressXRefDataObjectType value) {
        this.primaryAddressXRef = value;
    }

    /**
     * Gets the value of the primaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ContactRequestPrimaryAddressDataObjectType }
     *     
     */
    public ContactRequestPrimaryAddressDataObjectType getPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * Sets the value of the primaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactRequestPrimaryAddressDataObjectType }
     *     
     */
    public void setPrimaryAddress(ContactRequestPrimaryAddressDataObjectType value) {
        this.primaryAddress = value;
    }

    /**
     * Gets the value of the assignmentCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link ContactRequestAssignmentCustomerDataObjectType }
     *     
     */
    public ContactRequestAssignmentCustomerDataObjectType getAssignmentCustomer() {
        return assignmentCustomer;
    }

    /**
     * Sets the value of the assignmentCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactRequestAssignmentCustomerDataObjectType }
     *     
     */
    public void setAssignmentCustomer(ContactRequestAssignmentCustomerDataObjectType value) {
        this.assignmentCustomer = value;
    }

    /**
     * Gets the value of the customerAlias property.
     * 
     * @return
     *     possible object is
     *     {@link ContactRequestCustomerAliasDataObjectType }
     *     
     */
    public ContactRequestCustomerAliasDataObjectType getCustomerAlias() {
        return customerAlias;
    }

    /**
     * Sets the value of the customerAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactRequestCustomerAliasDataObjectType }
     *     
     */
    public void setCustomerAlias(ContactRequestCustomerAliasDataObjectType value) {
        this.customerAlias = value;
    }

    /**
     * Gets the value of the customerActivity property.
     * 
     * @return
     *     possible object is
     *     {@link ContactRequestCustomerActivityDataObjectType }
     *     
     */
    public ContactRequestCustomerActivityDataObjectType getCustomerActivity() {
        return customerActivity;
    }

    /**
     * Sets the value of the customerActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactRequestCustomerActivityDataObjectType }
     *     
     */
    public void setCustomerActivity(ContactRequestCustomerActivityDataObjectType value) {
        this.customerActivity = value;
    }

    /**
     * Gets the value of the assignment property.
     * 
     * @return
     *     possible object is
     *     {@link ContactRequestAssignmentDataObjectType }
     *     
     */
    public ContactRequestAssignmentDataObjectType getAssignment() {
        return assignment;
    }

    /**
     * Sets the value of the assignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactRequestAssignmentDataObjectType }
     *     
     */
    public void setAssignment(ContactRequestAssignmentDataObjectType value) {
        this.assignment = value;
    }

    /**
     * Gets the value of the orgCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link ContactRequestOrgCustomerDataObjectType }
     *     
     */
    public ContactRequestOrgCustomerDataObjectType getOrgCustomer() {
        return orgCustomer;
    }

    /**
     * Sets the value of the orgCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactRequestOrgCustomerDataObjectType }
     *     
     */
    public void setOrgCustomer(ContactRequestOrgCustomerDataObjectType value) {
        this.orgCustomer = value;
    }

    /**
     * Gets the value of the orgRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ContactRequestOrgRequestDataObjectType }
     *     
     */
    public ContactRequestOrgRequestDataObjectType getOrgRequest() {
        return orgRequest;
    }

    /**
     * Sets the value of the orgRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactRequestOrgRequestDataObjectType }
     *     
     */
    public void setOrgRequest(ContactRequestOrgRequestDataObjectType value) {
        this.orgRequest = value;
    }

}
