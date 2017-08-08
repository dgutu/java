/**
 * Coparator for sorting instances of the sample User entity class.
 * 
 * (c) 2007 by Svetlin Nakov - http://www.nakov.com
 * National Academy for Software Development - http://academy.devbg.org 
 * This software is freeware. Use it at your own risk.
 */

package com.searchincite.server.data;

import java.util.Comparator;

import com.searchincite.client.entity.Autofeed;

public class AutofeedComparator implements Comparator<Autofeed> {
	
	private String sortColumn;
	private boolean sortingOrder;
	
	public AutofeedComparator(String sortColumn, boolean sortingOrder) {
		this.sortColumn = sortColumn;
		this.sortingOrder = sortingOrder;
	}
	
	@SuppressWarnings("unchecked")
	public int compare(Autofeed user1, Autofeed user2) {
		Comparable column1 = (Comparable)
			ReflectionUtils.getPropertyValue(
			user1, this.sortColumn);
		Comparable column2 = (Comparable)
			ReflectionUtils.getPropertyValue(
			user2, this.sortColumn);
		int compareResult = -1;
		if (column1 != null) {
			if (column2 != null) {
				compareResult = column1.compareTo(column2);
			} else {
				compareResult = 1;
			}
		}		 
		if (!this.sortingOrder) {
			compareResult = -1 * compareResult;
		}
		return compareResult;
	}
	
}
