package com.searchincite.client.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.searchincite.client.entity.Phrase;

public interface PhraseService extends RemoteService {
	
	// SECURITY WARNING: Don't EVER accept or use an org_id passed in from the caller of a Web service!!

	Phrase getPhraseByID(int iPhraseID, long lFieldMask) throws Exception;
	Phrase createPhrase(Phrase phrase) throws Exception;
	Phrase updatePhrase(Phrase phrase) throws Exception;
	void deletePhrase(int iPhraseID) throws Exception;

}
