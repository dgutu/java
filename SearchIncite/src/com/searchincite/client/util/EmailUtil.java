package com.searchincite.client.util;

public class EmailUtil {

	public static boolean isValidEmailAddress(String strEmailAddress) {

		return strEmailAddress.toUpperCase().matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$");

	}
}
