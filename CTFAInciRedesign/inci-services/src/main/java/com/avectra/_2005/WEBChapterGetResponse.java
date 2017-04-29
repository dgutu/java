
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WEBChapterGetResult" type="{http://www.avectra.com/2005/}ChapterType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "webChapterGetResult"
})
@XmlRootElement(name = "WEBChapterGetResponse")
public class WEBChapterGetResponse {

    @XmlElement(name = "WEBChapterGetResult")
    protected ChapterType webChapterGetResult;

    /**
     * Gets the value of the webChapterGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterType }
     *     
     */
    public ChapterType getWEBChapterGetResult() {
        return webChapterGetResult;
    }

    /**
     * Sets the value of the webChapterGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterType }
     *     
     */
    public void setWEBChapterGetResult(ChapterType value) {
        this.webChapterGetResult = value;
    }

}
