/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.main;

import java.util.Properties;
import com.proximo.inci.common.TemplarUtil;

public class URIUtil {

	
	// cosntrcutor
	public URIUtil() {
		
	}
	
	// parse URI url
	public static Properties fillSearchParamByURIString(String fragment) {
		// first occurence of ~
		int start = fragment.indexOf("~");
		
		// string to parse
		String url = null;
		
		// list of parameters
		String params[] = null;
		
		// result
		Properties prop = new Properties();
		
		if (!TemplarUtil.isStringNullOrEmpty(fragment) && start > 0) {
				// get all string starting with ~
				url = fragment.trim().substring(start);
				
				params = url.split("~");
				
				for (int i=0;i<params.length;i++) {
					String arrayElement = params[i];

                    if (!arrayElement.isEmpty() && arrayElement.indexOf("=")>0) {
                    	try {
	                        String element[] = arrayElement.split("=");
	                        String key = element[0];
	                        String value = element[1];
	                        
	                        if (!TemplarUtil.isStringNullOrEmpty(key) && !TemplarUtil.isStringNullOrEmpty(value)) {
	                        	prop.put(key, value);
	                        	//TradeNameService.log("URIUtil.fillSearchParamByURIString, key="+key+", value=" + value);
	                        }
                    	}
                    	catch(Exception ex) {
                    		System.out.println(ex.getMessage());
                    	}
                    } // end if
				} // end for
		} // end if
		
		return prop;
	}	
}
