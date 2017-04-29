
package com.avectra._2005;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MembershipCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MembershipCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mb_membership" type="{http://www.avectra.com/2005/}mb_membershipType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MembershipCollectionType", propOrder = {
    "mbMembership"
})
public class MembershipCollectionType {

    @XmlElement(name = "mb_membership")
    protected List<MbMembershipType> mbMembership;

    /**
     * Gets the value of the mbMembership property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mbMembership property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMbMembership().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MbMembershipType }
     * 
     * 
     */
    public List<MbMembershipType> getMbMembership() {
        if (mbMembership == null) {
            mbMembership = new ArrayList<MbMembershipType>();
        }
        return this.mbMembership;
    }

}
