
package com.avectra._2005;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SAVE"/>
 *     &lt;enumeration value="DELETE"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionType")
@XmlEnum
public enum ActionType {

    SAVE,
    DELETE,
    NONE;

    public String value() {
        return name();
    }

    public static ActionType fromValue(String v) {
        return valueOf(v);
    }

}
