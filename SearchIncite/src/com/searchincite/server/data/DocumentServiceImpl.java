package com.searchincite.server.data;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.searchincite.api.entity.User;
import com.searchincite.client.entity.Document;
import com.searchincite.client.entity.DocumentResult;
import com.searchincite.client.entity.Ontology;
import com.searchincite.client.services.DocumentService;

public class DocumentServiceImpl extends RemoteServiceServlet implements DocumentService {

	private static final long serialVersionUID = 1L;

	public Document createDocument(Document document) throws Exception {

		HttpServletRequest req = getThreadLocalRequest();
		User u = (User)req.getSession().getAttribute("user");

		if (u == null) {
			return null;
		}

		document.setOrganizationID(u.getOrganizationID());
		document.setCreatedByUserID(u.getUserID());
		document.setDateCreated(new Date());
		document.setLastModifiedByUserID(u.getUserID());
		document.setLastModifiedDate(new Date());

		return com.searchincite.server.entity.manager.DocumentManager.createDocument(document);
	}

	public void deleteDocument(long lDocumentID) throws Exception {
		HttpServletRequest req = getThreadLocalRequest();
		User u = (User)req.getSession().getAttribute("user");

		if (u == null) {
			return;
		}

		//TODO: Check permissions.

		com.searchincite.server.entity.manager.DocumentManager.deleteDocument(lDocumentID, u.getOrganizationID());
	}

	public Document getDocumentByID(long lDocumentID, long lFieldMask) throws Exception {

		Document d = null;

		try {
			HttpServletRequest req = getThreadLocalRequest();
			User u = (User)req.getSession().getAttribute("user");

			d = com.searchincite.server.entity.manager.DocumentManager.getDocumentByID(lDocumentID, u.getOrganizationID(), lFieldMask);

			if (d.getOrganizationID() != u.getOrganizationID()) {
				throw new Exception("Access denied.");
			} 

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return d;
	}

	public Document updateDocument(Document document) throws Exception {

		HttpServletRequest req = getThreadLocalRequest();
		User u = (User)req.getSession().getAttribute("user");

		if (u == null) {
			return null;
		}

		document.setOrganizationID(u.getOrganizationID());
		document.setCreatedByUserID(u.getUserID());
		document.setDateCreated(new Date());
		document.setLastModifiedByUserID(u.getUserID());
		document.setLastModifiedDate(new Date());

		com.searchincite.server.entity.manager.DocumentManager.updateDocument(document);

		return document;
	}
	
	public DocumentResult getDocumentResultByOntologyName(long lDocumentID, String ontologyName) throws Exception {
		DocumentResult dr = null;

		try {
			HttpServletRequest req = getThreadLocalRequest();
			User u = (User)req.getSession().getAttribute("user");

			if (u == null) {
				return null;
			}

			dr = com.searchincite.server.entity.manager.DocumentResultManager.getDocumentResult(ontologyName, lDocumentID, 0 /* TODO: Pass lFieldMask*/);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return dr;
	}
	

	public void updateDocumentStatus(int iOntologyID, long lDocumentID, int iDocumentStatusID) throws Exception {

		HttpServletRequest req = getThreadLocalRequest();
		User u = (User)req.getSession().getAttribute("user");

		if (u == null) {
			return;
		}

		com.searchincite.server.entity.manager.DocumentManager.updateDocumentStatus(iOntologyID, lDocumentID, iDocumentStatusID);
	}

	public void updateStatusOfDocsInSource(int iDocumentSourceID, int iDocumentStatusID, int lNumberOfDocsToUpdate) throws Exception {
		
		HttpServletRequest req = getThreadLocalRequest();
        User u = (User)req.getSession().getAttribute("user");
        
        if (u == null) {
        	return;
        }
        
		com.searchincite.server.entity.manager.DocumentManager.updateStatusOfDocsInSource(iDocumentSourceID, iDocumentStatusID, lNumberOfDocsToUpdate);
	}

	public Ontology getDocumentResultAndOntology(long lDocumentID) throws Exception {

		HttpServletRequest req = getThreadLocalRequest();
        User u = (User)req.getSession().getAttribute("user");
        
        if (u == null) {
        	return null;
        }
        
		return com.searchincite.server.entity.manager.OntologyManager.getDocumentResultAndOntology(lDocumentID);
	}
}
