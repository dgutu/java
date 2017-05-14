/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.resource;

import com.proximo.inci.component.common.*;

public class CaptionResolverTest {

	public static void main(String[] args) {
		// System.out.println(CaptionResolver.getCaption("app.caption"));

		try {
			// UserSearchParams searchParams = new UserSearchParams("Nagy","","");
			// UserSearchResult searchResult = SecurityService.findUsers(searchParams);
			// System.out.println(searchResult.getUserList());
			CategoryField c = new CategoryField("100px", null);
			c.setReadOnly(true);
			c.setValue("asdasd");
			System.out.println(c.getValue());

		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
