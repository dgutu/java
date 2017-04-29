/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.xml;

import javax.xml.bind.JAXBElement;

public class XmlUtil {

    /** Not intended to be instantiated. Exposed only static members. */
    private XmlUtil() {
    }

    /** Extracts nullable value from string element. */
    public static String extractValFromNullableStrElem(JAXBElement<String> strElem) {
        if (strElem != null) {
            return strElem.getValue();
        } else {
            return null;
        }
    }
}
