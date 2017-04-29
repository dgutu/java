
package com.avectra._2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xWebVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xWebVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Build" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.avectra.com/2005/}VersionClass" minOccurs="0"/>
 *         &lt;element name="Server" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Database" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xWebVersion", propOrder = {
    "build",
    "version",
    "server",
    "database"
})
public class XWebVersion {

    @XmlElement(name = "Build")
    protected String build;
    @XmlElement(name = "Version")
    protected VersionClass version;
    @XmlElement(name = "Server")
    protected String server;
    @XmlElement(name = "Database")
    protected String database;

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuild() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuild(String value) {
        this.build = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link VersionClass }
     *     
     */
    public VersionClass getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionClass }
     *     
     */
    public void setVersion(VersionClass value) {
        this.version = value;
    }

    /**
     * Gets the value of the server property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServer() {
        return server;
    }

    /**
     * Sets the value of the server property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServer(String value) {
        this.server = value;
    }

    /**
     * Gets the value of the database property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabase() {
        return database;
    }

    /**
     * Sets the value of the database property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabase(String value) {
        this.database = value;
    }

}
