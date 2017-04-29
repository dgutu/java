
package com.avectra._2005;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryOperatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryOperatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Like"/>
 *     &lt;enumeration value="NotLike"/>
 *     &lt;enumeration value="Equals"/>
 *     &lt;enumeration value="NotEquals"/>
 *     &lt;enumeration value="GreaterThan"/>
 *     &lt;enumeration value="LessThan"/>
 *     &lt;enumeration value="GreaterThanOrEqualTo"/>
 *     &lt;enumeration value="LessThanOrEqualTo"/>
 *     &lt;enumeration value="IsIn"/>
 *     &lt;enumeration value="IsNotIn"/>
 *     &lt;enumeration value="IsNull"/>
 *     &lt;enumeration value="IsNotNull"/>
 *     &lt;enumeration value="SoundsLike"/>
 *     &lt;enumeration value="BeginsWith"/>
 *     &lt;enumeration value="DoesNotBeginWith"/>
 *     &lt;enumeration value="Contains"/>
 *     &lt;enumeration value="DoesNotContain"/>
 *     &lt;enumeration value="EndsWith"/>
 *     &lt;enumeration value="DoesNotEndWith"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryOperatorType")
@XmlEnum
public enum QueryOperatorType {

    @XmlEnumValue("Like")
    LIKE("Like"),
    @XmlEnumValue("NotLike")
    NOT_LIKE("NotLike"),
    @XmlEnumValue("Equals")
    EQUALS("Equals"),
    @XmlEnumValue("NotEquals")
    NOT_EQUALS("NotEquals"),
    @XmlEnumValue("GreaterThan")
    GREATER_THAN("GreaterThan"),
    @XmlEnumValue("LessThan")
    LESS_THAN("LessThan"),
    @XmlEnumValue("GreaterThanOrEqualTo")
    GREATER_THAN_OR_EQUAL_TO("GreaterThanOrEqualTo"),
    @XmlEnumValue("LessThanOrEqualTo")
    LESS_THAN_OR_EQUAL_TO("LessThanOrEqualTo"),
    @XmlEnumValue("IsIn")
    IS_IN("IsIn"),
    @XmlEnumValue("IsNotIn")
    IS_NOT_IN("IsNotIn"),
    @XmlEnumValue("IsNull")
    IS_NULL("IsNull"),
    @XmlEnumValue("IsNotNull")
    IS_NOT_NULL("IsNotNull"),
    @XmlEnumValue("SoundsLike")
    SOUNDS_LIKE("SoundsLike"),
    @XmlEnumValue("BeginsWith")
    BEGINS_WITH("BeginsWith"),
    @XmlEnumValue("DoesNotBeginWith")
    DOES_NOT_BEGIN_WITH("DoesNotBeginWith"),
    @XmlEnumValue("Contains")
    CONTAINS("Contains"),
    @XmlEnumValue("DoesNotContain")
    DOES_NOT_CONTAIN("DoesNotContain"),
    @XmlEnumValue("EndsWith")
    ENDS_WITH("EndsWith"),
    @XmlEnumValue("DoesNotEndWith")
    DOES_NOT_END_WITH("DoesNotEndWith");
    private final String value;

    QueryOperatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QueryOperatorType fromValue(String v) {
        for (QueryOperatorType c: QueryOperatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
