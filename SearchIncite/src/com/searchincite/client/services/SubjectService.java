package com.searchincite.client.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.searchincite.client.entity.Subject;

public interface SubjectService extends RemoteService {
	
	// SECURITY WARNING: Don't EVER accept or use an org_id passed in from the caller of a Web service!!

	Subject getSubjectByID(int iSubjectID, long lFieldMask) throws Exception;
	Subject createSubject(Subject subject) throws Exception;
	Subject updateSubject(Subject subject) throws Exception;
	void deleteSubject(int iSubjectID) throws Exception;

}
