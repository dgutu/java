package com.searchincite.server.data.external;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.searchincite.client.entity.DocumentSource;
import com.searchincite.client.entity.WebUser;
import com.searchincite.server.data.DocumentSourceData;
import com.searchincite.server.data.SIDB;
import com.searchincite.server.entity.manager.UserManager;

/**
 * 
 * @author ewayman
 *
 */

public class DeleteDocumentsFromSourceServlet extends ServletBase {

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
		
		ArrayList<String> strArrErrors = new ArrayList<String>();
		
		boolean bValidDocumentSourceID = validateParameterInt(request, "documentSourceID", true, false, false, strArrErrors);
	
		if (bValidDocumentSourceID) {
			
			String strDocumentSourceID = request.getParameter("documentSourceID");
			int iDocumentSourceID = Integer.parseInt(strDocumentSourceID);
			
			String strAuthtoken = request.getParameter("authtoken");
			
			WebUser user = getUser(request);
			// TODO: Check security?  (i.e. is this user authorized to see this document?)
			// If we are to perform this check, then the DocumentManager.getDocumentByID method cannot 
			// be used because it needs the organization ID.  If the user is an SI admin, the
			// user's organization may not match the organization ID on the document.
			
			boolean isAuthtokenValid = false;
			boolean isSourceIDValid = false;
			boolean isAuthtokenAndSourceIDMatchValid = false;
			
			int orgIDFromAuthID = 0;
			int orgIDFromSourceID = 1;
			
			// check auth ID is valid ... if not valid return "no errors"
			try {

				WebUser userTest = UserManager.getUserByGuid(strAuthtoken, WebUser.FIELD_ID);
					
				if (userTest != null) {
					
					isAuthtokenValid = true;
					
					orgIDFromAuthID = userTest.getOrganizationID();
					
				}
				
				else {
					
					isAuthtokenValid = false;
					
				}
				
				// Used for debugging:
				// strArrErrors.add(new String("isAuthtokenValid: " + isAuthtokenValid));
				
			} catch (SQLException e) {
				// try to get organization using Guid
			}
				
//			Below is the old junky code:
			
//				strArrErrors.add(new String("strAuthtoken: " + strAuthtoken));
//				
//				Connection db = SIDB.getConnection();
//				db.setAutoCommit(false);
//				PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.users WHERE guid = '?'");
//				
//				ps.setString(1, strAuthtoken);
//
//				ResultSet rs = ps.executeQuery();
//				
//				if (!rs.next()) {
//					
//					isAuthtokenValid = false; // b/c there is no user returned
//					
//				} else {
//					
//					isAuthtokenValid = true;
//					
//				}
//				
//				strArrErrors.add(new String("isAuthtokenValid " + new Boolean(isAuthtokenValid).toString()));
//				
//				rs.getStatement().getConnection().close();
//				rs.getStatement().close();
//				rs.close();
				
//			catch (SQLException e) {
//				strArrErrors.add(new String("An error occurred while accessing ontology.users the first time: " + e));
//			}
			
			// check source ID is exists  ... if not valid return "non-existent source ID"
			try {
				
				DocumentSource ds = null;
				
				ds = com.searchincite.server.entity.manager.DocumentSourceManager.getDocumentSourceByID(iDocumentSourceID, WebUser.FIELD_ID);
				
				if (ds != null) {
					
					isSourceIDValid = true;
					orgIDFromSourceID = ds.getOrganizationID();
				}
				
				else {
					
					isSourceIDValid = false;
					
				}
				
				// Used for debugging:
				// strArrErrors.add(new String("isSourceIDValid: " + isSourceIDValid));
				
//				Connection db = SIDB.getConnection();
//				db.setAutoCommit(false);
//				PreparedStatement ps = db.prepareStatement("SELECT document_source_id AS source_id FROM ontology.document_source WHERE document_source_id = '?';");
//				
//				ps.setInt(1, iDocumentSourceID);
//				ResultSet rs = ps.executeQuery();
//				
//				if (!rs.next()) {
//					
//					isSourceIDValid = false; // b/c there is no source id returned
//					
//				} else {
//					
//					isSourceIDValid = true;
//					
//				}
//				
//				rs.getStatement().getConnection().close();
//				rs.getStatement().close();
//				rs.close();
				
			}
			catch (SQLException e) {
				strArrErrors.add(new String("An error occurred while running the stored procedure ontology.users: " + e));
			}
			
//			if (isAuthtokenValid == true && isSourceIDValid == true ) {
			
				// check auth ID and sourceID are in the same organization ... if not valid return "permission denied ... auth ID and source ID are not in the same organization"
				
//				try {
//					
//					Connection db = SIDB.getConnection();
//					db.setAutoCommit(false);
//					
//					PreparedStatement ps = db.prepareStatement("SELECT org_id FROM ontology.users WHERE guid = '?'");
//				
//					ps.setString(1, strAuthtoken);
//					
//					ResultSet rs = ps.executeQuery();
//				
//					if (rs.next()) {
//						
//						orgIDFromAuthID = rs.getInt("org_id");
//						
//					} else {
//						
//						strArrErrors.add(new String("Error: Result set seems to be empty"));
//						
//					}
//					
//					rs.getStatement().getConnection().close();
//					rs.getStatement().close();
//					rs.close();
//					
//				} catch (SQLException e) {
//					strArrErrors.add(new String("An error occurred while accessing ontology.users the second time: " + e));
//				}
//				
//				try {
//					
//					Connection db = SIDB.getConnection();
//					db.setAutoCommit(false);
//					
//					PreparedStatement ps2 = db.prepareStatement("SELECT oorg.org_id FROM ontology.organization oorg " +
//							"LEFT JOIN ontology.ontology oont ON oorg.org_id = oont.org_id " +
//							"LEFT JOIN ontology.source_ontology oso ON oont.ontology_id = oso.ontology_id " +
//							"LEFT JOIN ontology.document_source ods ON oso.document_source_id = '?'");
//				
//					ps2.setInt(1, iDocumentSourceID);
//					
//					ResultSet rs2 = ps2.executeQuery();
//					
//					if (rs2.next()) {
//						
//						orgIDFromSourceID = rs2.getInt("org_id");
//						
//					} else {
//						
//						strArrErrors.add(new String("Error: Result set seems to be empty"));
//						
//					}
//				
//					rs2.getStatement().getConnection().close();
//					rs2.getStatement().close();
//					rs2.close();
//					
//				}
//				catch (SQLException e) {
//					strArrErrors.add(new String("An error occurred while accessing ontology.organization and running LEFT JOIN: " + e));
//				}
				
			if (orgIDFromAuthID == orgIDFromSourceID) {
					
				isAuthtokenAndSourceIDMatchValid = true;
					
			}
			
			// Used for debugging:
			// strArrErrors.add(new String("orgIDFromAuthID: " + orgIDFromAuthID));
			// strArrErrors.add(new String("orgIDFromSourceID: " + orgIDFromSourceID));
			// strArrErrors.add(new String("isAuthtokenAndSourceIDMatchValid: " + isAuthtokenAndSourceIDMatchValid));
			
			if (isAuthtokenValid == true && isSourceIDValid == true && isAuthtokenAndSourceIDMatchValid == true) {
					
				ResultSet rs = null;
					
				try {
						
					rs = com.searchincite.server.data.DocumentData.getAllDocumentsBySourceID(iDocumentSourceID);
						
				} catch (SQLException e) {
					strArrErrors.add(new String("An error occured while attempting to get the list of all the document IDs." + e));
				}

				try {
						
					while (rs.next()) {
							
						Long lDocumentID = rs.getLong("document_id");
						Integer iOrgID = rs.getInt("org_id");
						com.searchincite.server.data.DocumentData.deleteDocument(lDocumentID, iOrgID);
							
					}
						
				} catch (SQLException e) {
					strArrErrors.add(new String("An error occured while attempting to delete the documents: " + e));
				}
					
				try {
						
					rs.getStatement().getConnection().close();
					rs.getStatement().close();
					rs.close();
						
				} catch (SQLException e) {
					strArrErrors.add(new String("An error occurred while closing the result set: " + e));
				}
					
			}
				
			else if (isAuthtokenValid == false) {
					
				// This if statement is left intentionally blank.
					
			}
				
			else if (isAuthtokenValid == true && isSourceIDValid == false) {
					
				strArrErrors.add("The source ID you entered is not valid.");
					
			}
				
			else if (isAuthtokenValid == true && isSourceIDValid == true && isAuthtokenAndSourceIDMatchValid == false) {
					
				strArrErrors.add("You do not have access to that source ID.");
					
			}
			
		}
	
		out.write(getErrorXml(strArrErrors));
		out.write("</response>");
		response.flushBuffer();
		
	}	
	
}