package com.searchincite.server.security;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.searchincite.api.entity.User;
import com.searchincite.api.security.Authentication;
import com.searchincite.client.entity.WebUser;
import com.searchincite.client.security.LoginService;

public class LoginServiceImpl extends RemoteServiceServlet implements LoginService {

	private static final long serialVersionUID = 1L;

	public Boolean isAuthenticated() {

		HttpServletRequest req = getThreadLocalRequest();
        
		HttpSession session = req.getSession();
		
		if (session == null) {
			return Boolean.FALSE;			
		}
		
		Object objLoggedIn = session.getAttribute("logged-in");
		
		if (objLoggedIn == null) {
			return Boolean.FALSE;			
		}
		else {
			try {
				return ((Boolean)objLoggedIn);
			}
			catch (Exception ex) {
				return Boolean.FALSE;			
			}
		}
	}

	public Boolean login(String strUsername, String strPassword) {

		HttpServletRequest req = getThreadLocalRequest();
        req.getSession().setAttribute("logged-in", Boolean.FALSE);
        req.getSession().removeAttribute("user");

        User u = null;
        
		try {
			u = Authentication.authenticateUser(strUsername, strPassword);
		} catch (SQLException e) {
			return Boolean.FALSE;
		} 
        if (u != null) {
        	req.getSession().setAttribute("logged-in", Boolean.TRUE);
            req.getSession().setAttribute("user", u);
            return Boolean.TRUE;
        }
        
        
       	return Boolean.FALSE;
	}

	public WebUser getWebUser() {

		HttpServletRequest req = getThreadLocalRequest();
        
		HttpSession session = req.getSession();
		
		if (session == null) {
			return null;			
		}
		
		Object objLoggedIn = session.getAttribute("logged-in");
		
		if (objLoggedIn == null || ((Boolean)objLoggedIn).equals(Boolean.FALSE)) {
			return null;			
		}
		else {
			try {
				User u = (User)req.getSession().getAttribute("user");
				
				if (u == null) {
					return null;
				}
				
				WebUser wu = new WebUser(u.getFirstName(), u.getLastName());
				return wu;
			}
			catch (Exception ex) {
				return null;			
			}
		}
	}
	

}
