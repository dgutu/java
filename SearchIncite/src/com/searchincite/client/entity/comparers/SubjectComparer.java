package com.searchincite.client.entity.comparers;

import java.util.Comparator;

import com.searchincite.client.entity.Subject;

public class SubjectComparer implements Comparator<Object> {

	private long m_lSortField = 0;
	
	public void setSortField(long lSortField) {
		m_lSortField = lSortField;
	}
	
	public void addSortField(long lSortField) {
		m_lSortField |= lSortField;
	}

	public void removeSortField(long lSortField) {
		m_lSortField |= ~lSortField;
	}

	public SubjectComparer(long lSortField /* Pass constant from Subject class */ ) {
		setSortField(lSortField);
	}
	
	public int compare(Object o1, Object o2) {

		Subject s1 = (Subject)o1;
		Subject s2 = (Subject)o2;
		
		if (s1 != null && s2 != null) {
		
			if ((m_lSortField & Subject.FIELD_NAME) == Subject.FIELD_NAME) {
				return s1.getName().compareTo(s2.getName()); 
			}
			//else if (...) {
			//	...
			//}
		}
		
		return 0;
	}

}
