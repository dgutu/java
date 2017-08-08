package com.searchincite.client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.searchincite.client.entity.Phrase;

public interface PhraseServiceAsync {

	// SECURITY WARNING: Don't EVER accept or use an org_id passed in from the caller of a Web service!!

	void getPhraseByID(int iPhraseID, long lFieldMask, AsyncCallback callback);
	void createPhrase(Phrase phrase, AsyncCallback callback) throws Exception;
	void updatePhrase(Phrase phrase, AsyncCallback callback) throws Exception;
	void deletePhrase(int iPhraseID, AsyncCallback callback) throws Exception;
}
