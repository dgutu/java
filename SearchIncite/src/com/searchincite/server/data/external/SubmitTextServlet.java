package com.searchincite.server.data.external;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.searchincite.client.entity.Document;
import com.searchincite.client.entity.DocumentSource;
import com.searchincite.client.entity.WebUser;
import com.searchincite.server.entity.manager.DocumentManager;
import com.searchincite.server.entity.manager.DocumentSourceManager;
import com.searchincite.server.entity.manager.UserManager;

public class SubmitTextServlet extends ServletBase {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		super.doGet(request, response);
		processRequest(request, response);

	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		super.doPost(request, response);
		processRequest(request, response);
	}
	
	private void processRequest(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		out.write("<response>");
		
		ArrayList strArrErrors = new ArrayList();
		
		boolean bValidDocumentSourceID = validateParameterLong(request, "documentSourceID", true, false, false, strArrErrors);
		boolean bValidFilename = validateParameterString(request, "filename", true, strArrErrors);
		boolean bValidText = validateParameterString(request, "text", true, strArrErrors);
		
		if (bValidDocumentSourceID && bValidFilename && bValidText) {

			String strDocumentSourceID = request.getParameter("documentSourceID");

			boolean bAuthorized = false;
			
			// Make sure this user has permission to access the specified document source ID
			WebUser user = getUser(request);
			DocumentSource ds = null;

			try {
				ds = DocumentSourceManager.getDocumentSourceByID(Integer.parseInt(strDocumentSourceID), DocumentSource.FIELD_ORGANIZATION_ID);
				
				if (ds == null) {
					strArrErrors.add(new String("Invalid documentSourceID."));
					bValidDocumentSourceID = false;
				}
			} catch (NumberFormatException e) {
				strArrErrors.add(new String("Error parsing integer value for documentSourceID."));
				bValidDocumentSourceID = false;
			} catch (SQLException e) {
				strArrErrors.add(new String("An error occurred while attempting to retrieve the specified DocumentSource."));
				bValidDocumentSourceID = false;
			}

			if (user == null) {
				bAuthorized = false;
			}
			else if (bValidDocumentSourceID && !UserManager.isSIAdmin(user.getUserID())) {
				// If user is not an SI admin, then their organization ID must match
				// the organization ID of the specified document source.
				if (ds.getOrganizationID() == user.getOrganizationID()) {
					bAuthorized = true;
				}
			}
			else {
				// User is an SI Admin
				bAuthorized = true;
			}

			if (!bAuthorized) {
				strArrErrors.add(new String("Unauthorized access attempt.  The specified documentSourceID does not belong to your organization."));
			}
			else if (bValidDocumentSourceID) {
				
				Document d = new Document();
				d.setContentString(request.getParameter("text"));
				d.setCreatedByUserID(user.getUserID());
				
				String strDescription = request.getParameter("description"); 
				d.setDescription(strDescription == null ? "" : strDescription);
				d.setDocumentSourceID(Integer.parseInt(strDocumentSourceID));
				d.setFilename(request.getParameter("filename"));
				d.setOrganizationID(ds.getOrganizationID());
				
				//Check whether document with this filename already exists
				boolean bFilenameExists = false;
				
				try {
					bFilenameExists = DocumentManager.checkFilenameExists(ds.getOrganizationID(), d.getFilename());
				} catch (SQLException e1) {
					bFilenameExists = false;
				}

				if (!bFilenameExists) {
					// Everything's alright -- do processing here
					
					try {
						DocumentManager.createDocument(d);
						
						out.write("<documentList count=\"1\">");  
						out.write("<document ID=\"" + String.valueOf(d.getDocumentID()) + "\" />");
						out.write("</documentList>");  

					} catch (SQLException e) {
						strArrErrors.add(new String("Failed to create document."));
					}
				}
				else {
					strArrErrors.add(new String("A document with this filename already exists."));
				}
			}
		}

		out.write(getErrorXml(strArrErrors));
		out.write("</response>");
		response.flushBuffer();
	}
	
	
}
