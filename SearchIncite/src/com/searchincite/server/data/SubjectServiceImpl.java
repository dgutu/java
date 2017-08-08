package com.searchincite.server.data;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.searchincite.api.entity.User;
import com.searchincite.client.entity.Subject;
import com.searchincite.client.services.SubjectService;

public class SubjectServiceImpl extends RemoteServiceServlet implements SubjectService {

	private static final long serialVersionUID = 1L;

	public Subject createSubject(Subject subject) throws Exception {

		HttpServletRequest req = getThreadLocalRequest();
        User u = (User)req.getSession().getAttribute("user");
        
        if (u == null) {
        	return null;
        }
        
        subject.setCreatedByUserID(u.getUserID());
        subject.setDateCreated(new Date());
        subject.setLastModifiedByUserID(u.getUserID());
        subject.setLastModifiedDate(new Date());
        
		return com.searchincite.server.entity.manager.SubjectManager.createSubject(subject);
	}

	public void deleteSubject(int iSubjectID) throws Exception {

		HttpServletRequest req = getThreadLocalRequest();
        User u = (User)req.getSession().getAttribute("user");
        
        if (u == null) {
        	return;
        }
        
        //TODO: Check permissions.

		com.searchincite.server.entity.manager.SubjectManager.deleteSubject(iSubjectID, u.getOrganizationID());
	}

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

}
