
package com.avectra._2005;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AfterMergeAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AfterMergeAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Hide"/>
 *     &lt;enumeration value="Delete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AfterMergeAction")
@XmlEnum
public enum AfterMergeAction {

    @XmlEnumValue("Hide")
    HIDE("Hide"),
    @XmlEnumValue("Delete")
    DELETE("Delete");
    private final String value;

    AfterMergeAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AfterMergeAction fromValue(String v) {
        for (AfterMergeAction c: AfterMergeAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
