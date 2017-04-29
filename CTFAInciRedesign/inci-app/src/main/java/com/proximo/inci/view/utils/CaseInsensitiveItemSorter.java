/** Copyright 2013 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.utils;

import java.io.Serializable;
import java.util.Comparator;

import com.vaadin.data.util.DefaultItemSorter;

public class CaseInsensitiveItemSorter extends DefaultItemSorter {

	private static final long	serialVersionUID	= 3163628042066395721L;

	public CaseInsensitiveItemSorter() {
		super(new CaseInsensitivePropertyValueComparator());
	}

	public static class CaseInsensitivePropertyValueComparator implements Comparator<Object>, Serializable {

		private static final long	serialVersionUID	= 9215805338252429163L;

		@SuppressWarnings("unchecked")
		public int compare(Object o1, Object o2) {
			int r = 0;
			// Normal non-null comparison
			if (o1 != null && o2 != null) {
				if ((o1 instanceof String) && (o2 instanceof String)) {
					r = ((String) o1).compareToIgnoreCase((String) o2);
				} else {
					// Assume the objects can be cast to Comparable, throw
					// ClassCastException otherwise.
					r = ((Comparable<Object>) o1).compareTo(o2);
				}
			} else
				if (o1 == o2) {
					// Objects are equal if both are null
					r = 0;
				} else {
					if (o1 == null) {
						r = -1; // null is less than non-null
					} else {
						r = 1; // non-null is greater than null
					}
				}
			return r;
		}
	}
}

