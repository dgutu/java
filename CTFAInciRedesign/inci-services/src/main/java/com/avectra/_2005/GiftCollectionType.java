
package com.avectra._2005;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GiftCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GiftCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FundraisingGift" type="{http://www.avectra.com/2005/}FundraisingGiftType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiftCollectionType", propOrder = {
    "fundraisingGift"
})
public class GiftCollectionType {

    @XmlElement(name = "FundraisingGift")
    protected List<FundraisingGiftType> fundraisingGift;

    /**
     * Gets the value of the fundraisingGift property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fundraisingGift property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFundraisingGift().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundraisingGiftType }
     * 
     * 
     */
    public List<FundraisingGiftType> getFundraisingGift() {
        if (fundraisingGift == null) {
            fundraisingGift = new ArrayList<FundraisingGiftType>();
        }
        return this.fundraisingGift;
    }

}
