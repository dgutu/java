
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
 *         &lt;element name="szObjectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="szColumnList" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="szWhereClause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="szOrderBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "szObjectName",
    "szColumnList",
    "szWhereClause",
    "szOrderBy"
})
@XmlRootElement(name = "GetQuery")
public class GetQuery {

    @XmlElement(required = true, nillable = true)
    protected String szObjectName;
    @XmlElement(required = true, nillable = true)
    protected String szColumnList;
    protected String szWhereClause;
    protected String szOrderBy;

    /**
     * Gets the value of the szObjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSzObjectName() {
        return szObjectName;
    }

    /**
     * Sets the value of the szObjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSzObjectName(String value) {
        this.szObjectName = value;
    }

    /**
     * Gets the value of the szColumnList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSzColumnList() {
        return szColumnList;
    }

    /**
     * Sets the value of the szColumnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSzColumnList(String value) {
        this.szColumnList = value;
    }

    /**
     * Gets the value of the szWhereClause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSzWhereClause() {
        return szWhereClause;
    }

    /**
     * Sets the value of the szWhereClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSzWhereClause(String value) {
        this.szWhereClause = value;
    }

    /**
     * Gets the value of the szOrderBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSzOrderBy() {
        return szOrderBy;
    }

    /**
     * Sets the value of the szOrderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSzOrderBy(String value) {
        this.szOrderBy = value;
    }

}
