package com.searchincite.client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.searchincite.client.entity.Subject;

public interface SubjectServiceAsync {

	// SECURITY WARNING: Don't EVER accept or use an org_id passed in from the caller of a Web service!!

	void getSubjectByID(int iSubjectID, long lFieldMask, AsyncCallback callback);
	void createSubject(Subject subject, AsyncCallback callback) throws Exception;
	void updateSubject(Subject subject, AsyncCallback callback) throws Exception;
	void deleteSubject(int iSubjectID, AsyncCallback callback) throws Exception;
}
