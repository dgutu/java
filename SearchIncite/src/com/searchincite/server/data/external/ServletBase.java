package com.searchincite.server.data.external;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.searchincite.client.entity.WebUser;
import com.searchincite.server.entity.manager.UserManager;

public class ServletBase extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	// ** DON'T create instance variables in a Servlet -- they might be visible across requests! **

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		// Check for Guid and initiatlize user
		if (!authenticate(request.getParameter("authtoken"))) {
			response.sendError(401, "Access Denied - Not Authenticated");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		// Check for Guid and initiatlize user
		if (!authenticate(request.getParameter("authtoken"))) {
			response.sendError(401, "Access Denied - Not Authenticated");
		}
	}

	private boolean authenticate(String strGuid) {
		
		try {
			WebUser user = UserManager.getUserByGuid(strGuid, WebUser.FIELD_ID);
			
			if (user != null) {
				return true;
			}
		} catch (SQLException e) {

			// try to get organization using Guid
			return false;			
		}

		return false;
	}

	protected WebUser getUser(HttpServletRequest request) {
		
		try {
			return UserManager.getUserByGuid(request.getParameter("authtoken"), WebUser.FIELD_ALL_FIELDS);
		} catch (SQLException e) {
			// try to get organization using Guid?
			return null;			
		}
	}

	protected String getErrorXml(ArrayList<String> strArrErrors) {
		
		String strErrorXml = "<errorList count=\"" + String.valueOf(strArrErrors.size()) + "\">";

		if (!strArrErrors.isEmpty()) {
			
			for (int i = 0; i < strArrErrors.size(); i++) {
				strErrorXml += "<error message=\"" + (String)strArrErrors.get(i) + "\" />";
			}
		}

		strErrorXml += "</errorList>"; 

		return strErrorXml; 
	} 

	protected boolean validateParameterLong(HttpServletRequest request, String strParameterName, boolean bRequired, boolean bAllowZero, boolean bAllowNegative, ArrayList<String> strArrErrors) {
		
		try {
			// check for numeric
			String strValue = request.getParameter(strParameterName);
			
			if (strValue == null || (strValue.trim().length() == 0 && bRequired)) {
				strArrErrors.add(new String("Required parameter value: " + strParameterName + " - not supplied."));
				return false;
			}
			
			long lValue = Long.parseLong(strValue);

			if (lValue == 0 && !bAllowZero) {
				strArrErrors.add(new String("Invalid parameter value: " + strParameterName + " - cannot be zero."));
				return false;
			}
			else if (lValue < 0 && !bAllowNegative) {
				strArrErrors.add(new String("Invalid parameter value: " + strParameterName + " - cannot be negative."));
				return false;
			}
			
			return true;
		}
		catch (Exception ex) {
			strArrErrors.add(new String("Invalid parameter value: " + strParameterName + " - must be numeric."));
		}

		return false;
	}

	protected boolean validateParameterInt(HttpServletRequest request, String strParameterName, boolean bRequired, boolean bAllowZero, boolean bAllowNegative, ArrayList<String> strArrErrors) {
		
		try {
			// check for numeric
			String strValue = request.getParameter(strParameterName);
			
			if (strValue == null || (strValue.trim().length() == 0 && bRequired)) {
				strArrErrors.add(new String("Required parameter value: " + strParameterName + " - not supplied."));
				return false;
			}
			
			int iValue = Integer.parseInt(strValue);

			if (iValue == 0 && !bAllowZero) {
				strArrErrors.add(new String("Invalid parameter value: " + strParameterName + " - cannot be zero."));
				return false;
			}
			else if (iValue < 0 && !bAllowNegative) {
				strArrErrors.add(new String("Invalid parameter value: " + strParameterName + " - cannot be negative."));
				return false;
			}
			
			return true;
		}
		catch (Exception ex) {
			strArrErrors.add(new String("Invalid parameter value: " + strParameterName + " - must be numeric."));
		}

		return false;
	}

	protected boolean validateParameterString(HttpServletRequest request, String strParameterName, boolean bRequired, ArrayList<String> strArrErrors) {
		
		try {
			String strValue = request.getParameter(strParameterName);
			
			if (strValue == null || (strValue.trim().length() == 0 && bRequired)) {
				strArrErrors.add(new String("Required parameter value: " + strParameterName + " - not supplied."));
				return false;
			}
			
			return true;
		}
		catch (Exception ex) {
			strArrErrors.add(new String("Invalid parameter value: " + strParameterName));
		}

		return false;
	}

	protected boolean validateParameterBoolean(HttpServletRequest request, String strParameterName, boolean bRequired, ArrayList<String> strArrErrors) {
		
		try {
			String strValue = request.getParameter(strParameterName);
			
			if (strValue == null || (strValue.trim().length() == 0 && bRequired)) {
				strArrErrors.add(new String("Required parameter value: " + strParameterName + " - not supplied."));
				return false;
			}

			if (!strValue.toLowerCase().equals("true") && !strValue.toLowerCase().equals("false")) {
				strArrErrors.add(new String("Parameter value: " + strParameterName + " - must be true or false, or omitted.  Default value (if omitted): false"));
			}
			
			return true;
		}
		catch (Exception ex) {
			strArrErrors.add(new String("Invalid parameter value: " + strParameterName));
		}

		return false;
	}

}
