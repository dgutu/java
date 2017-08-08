package com.searchincite.server.data;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.searchincite.api.entity.User;
import com.searchincite.client.entity.Phrase;
import com.searchincite.client.services.PhraseService;

public class PhraseServiceImpl extends RemoteServiceServlet implements PhraseService {

	private static final long serialVersionUID = 1L;

	//public String processCall(String payload) throws SerializationException {
	//	  try {
	//	    RPCRequest rpcRequest = RPC.decodeRequest(payload, this.getClass());
	//	    return RPC.invokeAndEncodeResponse(this, rpcRequest.getMethod(),
	//	        rpcRequest.getParameters());
	//	  } catch (IncompatibleRemoteServiceException ex) {
	//	    return RPC.encodeResponseForFailure(null, ex);
	//	  }
	//	}

	public Phrase createPhrase(Phrase phrase) throws Exception {

		HttpServletRequest req = getThreadLocalRequest();
        User u = (User)req.getSession().getAttribute("user");
        
        if (u == null) {
        	return null;
        }
        
        phrase.setCreatedByUserID(u.getUserID());
        phrase.setDateCreated(new Date());
        phrase.setLastModifiedByUserID(u.getUserID());
        phrase.setLastModifiedDate(new Date());
        
		//try {
			return com.searchincite.server.entity.manager.PhraseManager.createPhrase(phrase);
		//}
		//catch (SQLException ex) {
		//	throw new IncompatibleRemoteServiceException(ex.getMessage());
		//}
	}

	public void deletePhrase(int iPhraseID) throws Exception {

		HttpServletRequest req = getThreadLocalRequest();
        User u = (User)req.getSession().getAttribute("user");
        
        if (u == null) {
        	return;
        }
        
        //TODO: Check permissions.

		com.searchincite.server.entity.manager.PhraseManager.deletePhrase(iPhraseID, u.getOrganizationID());
	}

	public Phrase updatePhrase(Phrase phrase) throws Exception {
		
		HttpServletRequest req = getThreadLocalRequest();
        User u = (User)req.getSession().getAttribute("user");
        
        if (u == null) {
        	return null;
        }
        
        phrase.setLastModifiedByUserID(u.getUserID());
        phrase.setLastModifiedDate(new Date());

		com.searchincite.server.entity.manager.PhraseManager.updatePhrase(phrase);
		return phrase;
	}

	public Phrase getPhraseByID(int iPhraseID, long lFieldMask) throws Exception {
		// TODO Implement
		return null;
	}

}
