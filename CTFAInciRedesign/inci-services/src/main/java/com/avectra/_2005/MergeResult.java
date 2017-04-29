
package com.avectra._2005;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MergeResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MergeResult">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Merged"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="UnProcessed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MergeResult")
@XmlEnum
public enum MergeResult {

    @XmlEnumValue("Merged")
    MERGED("Merged"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("UnProcessed")
    UN_PROCESSED("UnProcessed");
    private final String value;

    MergeResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MergeResult fromValue(String v) {
        for (MergeResult c: MergeResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
