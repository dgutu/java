
package com.avectra._2005;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailingPerferenceStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MailingPerferenceStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OptIn"/>
 *     &lt;enumeration value="OptOut"/>
 *     &lt;enumeration value="Undefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MailingPerferenceStatus")
@XmlEnum
public enum MailingPerferenceStatus {

    @XmlEnumValue("OptIn")
    OPT_IN("OptIn"),
    @XmlEnumValue("OptOut")
    OPT_OUT("OptOut"),
    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined");
    private final String value;

    MailingPerferenceStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MailingPerferenceStatus fromValue(String v) {
        for (MailingPerferenceStatus c: MailingPerferenceStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
