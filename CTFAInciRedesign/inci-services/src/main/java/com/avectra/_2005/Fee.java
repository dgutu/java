
package com.avectra._2005;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Fee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prc_key" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="ivd_key" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="qty" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="overrideamount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="action" type="{http://www.avectra.com/2005/}FeeAction"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fee", propOrder = {
    "prcKey",
    "ivdKey",
    "qty",
    "overrideamount",
    "action"
})
public class Fee {

    @XmlElement(name = "prc_key", required = true)
    protected String prcKey;
    @XmlElement(name = "ivd_key", required = true)
    protected String ivdKey;
    protected int qty;
    @XmlElement(required = true)
    protected BigDecimal overrideamount;
    @XmlElement(required = true)
    protected FeeAction action;

    /**
     * Gets the value of the prcKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcKey() {
        return prcKey;
    }

    /**
     * Sets the value of the prcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcKey(String value) {
        this.prcKey = value;
    }

    /**
     * Gets the value of the ivdKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvdKey() {
        return ivdKey;
    }

    /**
     * Sets the value of the ivdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvdKey(String value) {
        this.ivdKey = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     */
    public int getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     */
    public void setQty(int value) {
        this.qty = value;
    }

    /**
     * Gets the value of the overrideamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverrideamount() {
        return overrideamount;
    }

    /**
     * Sets the value of the overrideamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverrideamount(BigDecimal value) {
        this.overrideamount = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link FeeAction }
     *     
     */
    public FeeAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeAction }
     *     
     */
    public void setAction(FeeAction value) {
        this.action = value;
    }

}
