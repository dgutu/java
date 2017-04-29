/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.caption;

import java.util.ResourceBundle;

/**
 * Resolves a label by key using properties file.
 */
public final class CaptionResolver {

	private static final ResourceBundle captions = ResourceBundle.getBundle("com/proximo/inci/captions/captions");

    /** Not intended to be instantiated. Exposed only static members. */
	private CaptionResolver() {
	}

	public static String getCaption(String key) {
		if (key != null) {
			return captions.getString(key);
		} else {
			return "";
		}
	}
}
