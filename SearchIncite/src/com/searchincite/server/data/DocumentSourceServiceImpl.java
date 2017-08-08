package com.searchincite.server.data;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.searchincite.api.entity.User;
import com.searchincite.client.entity.DocumentSource;
import com.searchincite.client.services.DocumentSourceService;

public class DocumentSourceServiceImpl extends RemoteServiceServlet implements DocumentSourceService {

	private static final long serialVersionUID = 1L;

	public DocumentSource createDocumentSource(DocumentSource documentSource) throws Exception {

		HttpServletRequest req = getThreadLocalRequest();
        User u = (User)req.getSession().getAttribute("user");
        
        if (u == null) {
        	return null;
        }
        
        documentSource.setOrganizationID(u.getOrganizationID());
        documentSource.setCreatedByUserID(u.getUserID());
        documentSource.setDateCreated(new Date());
        documentSource.setLastModifiedByUserID(u.getUserID());
        documentSource.setLastModifiedDate(new Date());
        
		return com.searchincite.server.entity.manager.DocumentSourceManager.createDocumentSource(documentSource);
	}

	public void deleteDocumentSource(int iDocumentSourceID) throws Exception {
		HttpServletRequest req = getThreadLocalRequest();
        User u = (User)req.getSession().getAttribute("user");
        
        if (u == null) {
        	return;
        }
        
        //TODO: Check permissions.

		com.searchincite.server.entity.manager.DocumentSourceManager.deleteDocumentSource(iDocumentSourceID, u.getOrganizationID());
	}

	public DocumentSource getDocumentSourceByID(int iDocumentSourceID, long lFieldMask) throws Exception {

		DocumentSource ds = null;
		
		try {
			ds = com.searchincite.server.entity.manager.DocumentSourceManager.getDocumentSourceByID(iDocumentSourceID, lFieldMask);

			//TODO: Protect from user retrieving/seeing document sources owned by an organization other than their own.
			//		(ALSO - need to determine what to do for administrative users/when this may be permissible.)
			
			//TODO: Implement a better solution here...
			HttpServletRequest req = getThreadLocalRequest();
			User u = (User)req.getSession().getAttribute("user");
			
			if (ds.getOrganizationID() != u.getOrganizationID()) {
				throw new Exception("Access denied.");
			} 

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ds;
	}

	public DocumentSource updateDocumentSource(DocumentSource documentSource) throws Exception {

		HttpServletRequest req = getThreadLocalRequest();
        User u = (User)req.getSession().getAttribute("user");
        
        if (u == null) {
        	return null;
        }
        
        documentSource.setOrganizationID(u.getOrganizationID());
        documentSource.setCreatedByUserID(u.getUserID());
        documentSource.setDateCreated(new Date());
        documentSource.setLastModifiedByUserID(u.getUserID());
        documentSource.setLastModifiedDate(new Date());
        
		com.searchincite.server.entity.manager.DocumentSourceManager.updateDocumentSource(documentSource);
		
		return documentSource;
	}

	public DocumentSource[] getDocumentSourcesForOrganization(long lFieldMask) throws Exception {

		HttpServletRequest req = getThreadLocalRequest();
        User u = (User)req.getSession().getAttribute("user");
        
        if (u == null) {
        	return null;
        }
		
		return com.searchincite.server.entity.manager.DocumentSourceManager.getDocumentSourcesForOrganiztaion(u.getOrganizationID(), lFieldMask);
		
	}

	/*
	public Subject updateSubject(Subject subject) throws Exception {
		
		HttpServletRequest req = getThreadLocalRequest();
        User u = (User)req.getSession().getAttribute("user");
        
        if (u == null) {
        	return null;
        }
        
        subject.setLastModifiedByUserID(u.getUserID());
        subject.setLastModifiedDate(new Date());

		com.searchincite.server.entity.manager.SubjectManager.updateSubject(subject);
		return subject;
	}

	public Subject getSubjectByID(int iSubjectID, long lFieldMask) throws Exception {
		
		Subject s = null;
		
		try {
			s = com.searchincite.server.entity.manager.SubjectManager.getSubjectByID(iSubjectID, lFieldMask);

			//TODO: Implement a better solution here...
			HttpServletRequest req = getThreadLocalRequest();
			User u = (User)req.getSession().getAttribute("user");
			
			if (u.getOrganizationID() != u.getOrganizationID()) {
				throw new Exception("Access denied.");
			} 

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return s;
	}
	*/
}
