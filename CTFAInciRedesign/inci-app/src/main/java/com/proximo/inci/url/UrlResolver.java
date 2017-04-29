/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.url;

import java.util.ResourceBundle;

/**
 * Resolves an url by key using properties file.
 */
public class UrlResolver {

    private static final ResourceBundle urls = ResourceBundle.getBundle("com/proximo/inci/urls/urls");

    /** Not intended to be instantiated. Exposed only static members. */
    private UrlResolver() {
    }

    public static String getUrl(String key) {
        if (key != null) {
            return urls.getString(key);
        } else {
            return "";
        }
    }
}
