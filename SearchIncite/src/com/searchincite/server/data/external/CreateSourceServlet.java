package com.searchincite.server.data.external;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringEscapeUtils;

import com.searchincite.client.data.constants.SecurityConstants;
import com.searchincite.client.entity.DocumentSource;
import com.searchincite.client.entity.Ontology;
import com.searchincite.client.entity.WebUser;
import com.searchincite.server.entity.manager.OntologyManager;
import com.searchincite.server.entity.manager.UserManager;

public class CreateSourceServlet extends ServletBase {

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
		
		boolean bValidOntologyID = validateParameterInt(request, "ontologyID", true, false, false, strArrErrors);
		boolean bValidSourceName = validateParameterString(request, "sourceName", true, strArrErrors);
		
		if (bValidOntologyID && bValidSourceName) {

			String strOntologyID = request.getParameter("ontologyID");
			String strSourceName = request.getParameter("sourceName");
			int iOntologyID = Integer.parseInt(strOntologyID);
			
			WebUser user = getUser(request);
			
			Ontology ontology = null;
			
			try {
				ontology = OntologyManager.getOntologyByID(iOntologyID, Ontology.FIELD_ID);
			} catch (SQLException e) {
				strArrErrors.add(new String("Error retrieving ontology. ") + StringEscapeUtils.escapeXml(e.getMessage()));
			}
				
			if (ontology == null) {
				strArrErrors.add(new String("Invalid ontologyID."));
				bValidOntologyID = false;
			}
			else {
				
				boolean bSuccess = false;
				
				DocumentSource dsNew = new DocumentSource();
        		dsNew.setCreatedByUserID(user.getUserID());
        		dsNew.setDocumentSource(strSourceName);
        		dsNew.setLastModifiedByUserID(user.getUserID());
        		
				boolean bIsSIAdmin = UserManager.isSIAdmin(user.getUserID());
				boolean bIsOrgAdmin = UserManager.isOrganizationAdmin(user.getUserID());
				boolean bIsOntologyBuilder = UserManager.isUserInSecurityRole(user.getUserID(), SecurityConstants.ROLE_ONTOLOGY_BUILDER);
				
		        if (!bIsSIAdmin && !bIsOrgAdmin && !bIsOntologyBuilder) {
					strArrErrors.add(new String("Access denied."));
				}

		    	if (!bIsSIAdmin) {
		            // User is not an SI Admin; the ontology they are specifying must belong to THEIR organization
		        	if (ontology.getOrganizationID() != user.getOrganizationID()) {
						strArrErrors.add(new String("Access denied."));
		        	}
		        	else {
		        		dsNew.setOrganizationID(user.getOrganizationID());
		        		dsNew.setOntologies(new Ontology[] { ontology });
		        		try {
							com.searchincite.server.entity.manager.DocumentSourceManager.createDocumentSource(dsNew);
							bSuccess = dsNew.getDocumentSourceID() != 0;
						} catch (SQLException e) {
							strArrErrors.add(new String("Failed to create DocumentSource. ") + StringEscapeUtils.escapeXml(e.getMessage()));
						}
		        	}
		        }
		        else {
		        	// User is an SI Admin -- create the document source no matter what organization the ontology belongs to.
	        		dsNew.setOrganizationID(ontology.getOrganizationID()); // set organization of document source to match ontology
	        		dsNew.setOntologies(new Ontology[] { ontology });
	        		try {
						com.searchincite.server.entity.manager.DocumentSourceManager.createDocumentSource(dsNew);
						bSuccess = dsNew.getDocumentSourceID() != 0;
					} catch (SQLException e) {
						strArrErrors.add(new String("Failed to create DocumentSource. ") + StringEscapeUtils.escapeXml(e.getMessage()));
					}
		        }

		    	if (bSuccess) {
					out.write("<documentSource>");
					out.write("<documentSourceID>" + String.valueOf(dsNew.getDocumentSourceID()) + "</documentSourceID>");
					out.write("</documentSource>");
		    	}
			}
		}

		out.write(getErrorXml(strArrErrors));
		out.write("</response>");
		response.flushBuffer();
	}
	
}
