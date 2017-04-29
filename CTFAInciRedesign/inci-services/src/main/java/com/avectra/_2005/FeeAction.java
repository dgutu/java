
package com.avectra._2005;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Add"/>
 *     &lt;enumeration value="Remove"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeeAction")
@XmlEnum
public enum FeeAction {

    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Remove")
    REMOVE("Remove");
    private final String value;

    FeeAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeeAction fromValue(String v) {
        for (FeeAction c: FeeAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
