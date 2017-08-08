package com.searchincite.server.data.external;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringEscapeUtils;

import com.searchincite.api.util.UUID;
import com.searchincite.client.entity.Category;
import com.searchincite.client.entity.Ontology;
import com.searchincite.client.entity.Organization;
import com.searchincite.client.entity.WebUser;
import com.searchincite.server.entity.manager.CateogryManager;
import com.searchincite.server.entity.manager.OntologyManager;
import com.searchincite.server.entity.manager.OrganizationManager;
import com.searchincite.server.entity.manager.UserManager;

public class CreateOrganizationServlet extends ServletBase {

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

		boolean bSuccess = false;
		boolean bValidOrganizationName = validateParameterString(request, "orgName", true, strArrErrors);
		boolean bValidOntologyID = validateParameterInt(request, "ontologyID", true, false, false, strArrErrors);
		
		Ontology ontologyToCopy = null;
		Category categoryToCopy = null;
		
		if (bValidOntologyID) {
    		// Get ontology that we are going to copy
			try {
				ontologyToCopy = OntologyManager.getOntologyByID(Integer.valueOf(request.getParameter("ontologyID")).intValue(), Ontology.FIELD_NAME | Ontology.FIELD_CATEGORY_ID);
				//strArrErrors.add(new String("DEBUG - ontologyToCopy.cateogryID: " + String.valueOf(ontologyToCopy.getCategoryID())));
			} catch (NumberFormatException e) {
				strArrErrors.add(new String("NumberFormatException: Failed to load ontology to copy.  (Ensure specified ontologyID is valid.)  ") + StringEscapeUtils.escapeXml(e.getMessage()));
			} catch (SQLException e) {
				strArrErrors.add(new String("SQLException: Failed to load ontology to copy.  (Ensure specified ontologyID is valid.)  ") + StringEscapeUtils.escapeXml(e.getMessage()));
			}
			
			// Get category assigned to the ontology that we are going to copy.
			// (We also need to create a cateogry with the same name in the new organization.)
			if (ontologyToCopy != null) {
				try {
					categoryToCopy = CateogryManager.getCategoryByID(ontologyToCopy.getCategoryID(), Category.FIELD_ID | Category.FIELD_NAME);
					//strArrErrors.add(new String("DEBUG - categoryToCopy.cateogryID: " + String.valueOf(categoryToCopy.getCategoryID())));
				} catch (SQLException e) {
					strArrErrors.add(new String("SQLException: Failed to load category to copy.  (Ensure specified ontologyID is valid.)  ") + StringEscapeUtils.escapeXml(e.getMessage()));
				}
			}
		}
		
		if (bValidOrganizationName && bValidOntologyID && ontologyToCopy != null && categoryToCopy != null) {

			String strOrganizationName = request.getParameter("orgName");
			
			WebUser user = getUser(request);

	        if (!UserManager.isSIAdmin(user.getUserID())) {
				strArrErrors.add(new String("Access denied."));
			}
	        else {

				Organization org = new Organization();
	    		org.setAddressLine1(new String());
	    		org.setAddressLine2(new String());
	    		org.setCity(new String());
	    		org.setCreatedByUserID(user.getUserID());
	    		org.setGuid(UUID.generateUUID());
	    		org.setLastModifiedByUserID(user.getUserID());
				org.setOrganizationName(strOrganizationName);
				org.setPostalCode(new String());
				org.setState(new String());
	    		
	    		try {

	    			// Create organization

	    			OrganizationManager.createOrganizationWithGuid(org);
					
			        bSuccess = org.getOrganizationID() != 0;
			    	
			    	if (bSuccess) {
			    		
						// Create Organization Admin user

			    		WebUser newOrgUser = new WebUser();
			    		newOrgUser.setActive(true);
			    		newOrgUser.setChangePasswordOnLogin(false);
			    		newOrgUser.setCreatedByUserID(user.getUserID());
			    		newOrgUser.setEMailAddress(new String());
			    		newOrgUser.setFirstName(org.getOrganizationName().trim());
			    		// Create authtoken (guid) for user
			    		newOrgUser.setGuid(UUID.generateUUID()); 
			    		newOrgUser.setLastModifiedByUserID(user.getUserID());
			    		newOrgUser.setLastName("User");
			    		newOrgUser.setMiddleName(new String());
			    		newOrgUser.setOrganizationID(org.getOrganizationID());
			    		newOrgUser.setSecurityRoleIDs(new int[] { com.searchincite.client.data.constants.SecurityConstants.ROLE_ORGANIZATION_ADMIN });
			    		newOrgUser.setTelephone(new String());
			    		// Username convention: si-orgname(without spaces)
			    		newOrgUser.setUsername("si-" + org.getOrganizationName().replaceAll(" ", ""));
			    		// Password convention: * + username (i.e. *si-myorg)
			    		newOrgUser.setPassword("*" + newOrgUser.getUsername());
						
			    		UserManager.createUserWithGuid(newOrgUser);
			    		
			    		if (newOrgUser.getUserID() == 0) {
							strArrErrors.add(new String("Failed to create Organization Admin user (newID == 0)."));
			    		}
			    		
			    		// Create new Category to match the category assigned to the ontology that we are copying

			    		Category category = new Category();
			    		category.setCreatedByUserID(user.getUserID());
			    		category.setLastModifiedByUserID(user.getUserID());
			    		category.setName(categoryToCopy.getName());
						//strArrErrors.add(new String("DEBUG - Creating category name: " + category.getName()));
			    		category.setOrganizationID(org.getOrganizationID());
			    		
			    		CateogryManager.createCategory(category);

			    		if (category.getCategoryID() == 0) {
							strArrErrors.add(new String("Failed to create category for ontology being copied (newID == 0)."));
			    		}

			    		// Copy ontology
			    		
			    		Ontology newOntology = OntologyManager.copyOntology(ontologyToCopy.getOntologyID(), category.getCategoryID(), ontologyToCopy.getName(), org.getOrganizationID(), user.getCreatedByUserID());

			    		if (newOntology.getOntologyID() == 0) {
							strArrErrors.add(new String("Failed to copy ontology (newID == 0)."));
			    		}
			    		
						out.write("<organization>");
						out.write("<user>");
						out.write("<username>" + newOrgUser.getUsername() + "</username>");
						out.write("<authtoken>" + newOrgUser.getGuid() + "</authtoken>");
						out.write("</user>");
						out.write("<ontology>");
						out.write("<ontologyID>" + String.valueOf(newOntology.getOntologyID()) + "</ontologyID>");
						out.write("</ontology>");
						out.write("</organization>");
			    	}
			    	else {
						strArrErrors.add(new String("Failed to create Organization (newID == 0)."));
			    	}

					
				} catch (SQLException e) {
					strArrErrors.add(new String("Failed to create Organization. ") + StringEscapeUtils.escapeXml(e.getMessage()));
				}
	        }    		
		}
		else {
			if (ontologyToCopy == null) {
				strArrErrors.add(new String("Failed to load ontology to copy.  Ensure that the specified ontologyID is valid."));
			}
			if (categoryToCopy == null) {
				strArrErrors.add(new String("Failed to load category of the ontology to be copied.  Ensure that the specified ontologyID is valid."));
			}
		}

		out.write(getErrorXml(strArrErrors));
		out.write("</response>");
		response.flushBuffer();
	}
}
