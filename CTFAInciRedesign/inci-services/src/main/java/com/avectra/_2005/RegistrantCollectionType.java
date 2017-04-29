
package com.avectra._2005;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrantCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrantCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventsRegistrant" type="{http://www.avectra.com/2005/}EventsRegistrantType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrantCollectionType", propOrder = {
    "eventsRegistrant"
})
public class RegistrantCollectionType {

    @XmlElement(name = "EventsRegistrant")
    protected List<EventsRegistrantType> eventsRegistrant;

    /**
     * Gets the value of the eventsRegistrant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventsRegistrant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventsRegistrant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventsRegistrantType }
     * 
     * 
     */
    public List<EventsRegistrantType> getEventsRegistrant() {
        if (eventsRegistrant == null) {
            eventsRegistrant = new ArrayList<EventsRegistrantType>();
        }
        return this.eventsRegistrant;
    }

}
