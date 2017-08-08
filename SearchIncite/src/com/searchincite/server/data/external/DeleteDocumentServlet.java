package com.searchincite.server.data.external;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.searchincite.client.entity.Document;
import com.searchincite.client.entity.DocumentResult;
import com.searchincite.client.entity.WebUser;
import com.searchincite.client.services.DocumentServiceProxy;
import com.searchincite.server.data.DocumentData;
import com.searchincite.server.entity.manager.DocumentResultManager;
import com.searchincite.server.entity.manager.UserManager;

/**
 * 
 * @author ewayman
 *
 */

public class DeleteDocumentServlet extends ServletBase {

	private static final long serialVersionUID = 1L;

	///////////////////////////////////////////////////////////////////

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	super.doGet(request, response);
	processRequest(request, response);

}
  
	///////////////////////////////////////////////////////////////////

public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

	super.doPost(request, response);
	processRequest(request, response);
}
  
	///////////////////////////////////////////////////////////////////

private void processRequest(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

	PrintWriter out = response.getWriter();
	out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
	out.write("<response>");
    
	ArrayList<String> strArrErrors = new ArrayList<String>();
    
	boolean bValidDocumentID = validateParameterLong(request, "documentID", true, false, false, strArrErrors);
    
	if (bValidDocumentID) {
      
		try {
			String strDocumentID = request.getParameter("documentID");
			long lDocumentID     = Long.parseLong(strDocumentID);
      
			WebUser user = getUser(request);
        
			int iOrgIDFromAuthtoken = user.getOrganizationID();

			ResultSet rs = DocumentData.getDocumentByID(lDocumentID, iOrgIDFromAuthtoken, Document.FIELD_ALL_FIELDS);

			Document d = null;

			ResultSet rsDocument = null;

			if (rs.next()) {
			
				rsDocument = (ResultSet)rs.getObject(1);
			
				rsDocument.next();
				
				d = com.searchincite.server.entity.manager.DocumentManager.deserialize(rsDocument, Document.FIELD_ALL_FIELDS);
				
			}

			int iOrgIDFromDoc = d.getOrganizationID();
		
			if (iOrgIDFromAuthtoken == iOrgIDFromDoc) {
				com.searchincite.server.data.DocumentData.deleteDocument(lDocumentID, iOrgIDFromDoc);
			}
			
	        strArrErrors.add(new String("docid document: "+strDocumentID));  //debug
	        strArrErrors.add(new String("iorgid document: "+iOrgIDFromDoc)); //debug

		} catch (SQLException e) {
			strArrErrors.add(new String("An error occured while attempting to delete the document."));
		}
        
		// TODO: Check security?  (i.e. is this user authorized to see this document?)
		// If we are to perform this check, then the DocumentManager.getDocumentByID method cannot 
		// be used because it needs the organization ID.  If the user is an SI admin, the
		// user's organization may not match the organization ID on the document.
      
		//
		// remove passing in the org_id (from here and the servicetest.hmtl)
		//
		// authtoken --> user_id  --> org_id (3)
		//   select guid,user_id,org_id,user_name from ontology.users where guid='authtoken';
		//
		// document_id -> org_id (3)
		//   select document_id,org_id from ontology.document where document_id in (41281) limit 1;
		// 
		// do the delete line below ONLY if the two org_id's match each other 
      
	}
    
	out.write(getErrorXml(strArrErrors));
	out.write("</response>");
	response.flushBuffer();

	}

}
