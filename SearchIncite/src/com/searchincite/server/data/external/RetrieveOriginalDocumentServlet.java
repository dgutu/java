package com.searchincite.server.data.external;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringEscapeUtils;

import com.searchincite.client.entity.Document;
import com.searchincite.client.entity.DocumentResult;
import com.searchincite.client.entity.DocumentSubjectResult;
import com.searchincite.client.entity.Ontology;
import com.searchincite.client.entity.WebUser;
import com.searchincite.server.data.DocumentData;
import com.searchincite.server.entity.manager.DocumentManager;
import com.searchincite.server.entity.manager.DocumentResultManager;
import com.searchincite.server.entity.manager.OntologyManager;

/**
 * 
 * @author ewayman
 *
 */

public class RetrieveOriginalDocumentServlet extends ServletBase {
	
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
		
		response.setContentType("application/octet-stream");
		
		//out.write("Content-disposition: attachment; filename.txt");
		//out.write("Content-type: ");
		
		ArrayList<String> strArrErrors = new ArrayList<String>();
		
		boolean bValidDocumentID = validateParameterLong(request, "documentID", true, false, false, strArrErrors);
		
		if (bValidDocumentID) {
			
			String strDocumentID = request.getParameter("documentID");
			long lDocumentID = Long.parseLong(strDocumentID);
			
			WebUser user = getUser(request);
			// TODO: Check security?  (i.e. is this user authorized to see this document?)
			// If we are to perform this check, then the DocumentManager.getDocumentByID method cannot 
			// be used because it needs the organization ID.  If the user is an SI admin, the
			// user's organization may not match the organization ID on the document.

			Document doc = null;
			
			try {
				doc = DocumentManager.getDocumentByID(lDocumentID, user.getOrganizationID(), Document.FIELD_ALL_FIELDS);
			} catch (SQLException e) {
				strArrErrors.add(new String("Error retrieving document. ") + StringEscapeUtils.escapeXml(e.getMessage()));
			}
				
			if (doc == null) {
				strArrErrors.add(new String("Invalid documentID."));
				bValidDocumentID = false;
			}
			
			else {
			
				try {
					
					ResultSet rs = DocumentData.getDocumentByID(lDocumentID, user.getOrganizationID(), Document.FIELD_ALL_FIELDS);
					
					Document d = null;
				
					ResultSet rsDocument = null;
				
					if (rs.next()) {
					
						rsDocument = (ResultSet)rs.getObject(1);
					
						rsDocument.next();
					
						d = com.searchincite.server.entity.manager.DocumentManager.deserialize(rsDocument, Document.FIELD_ALL_FIELDS);
						
						String file_name = rsDocument.getString("file_name");
						
						String [] file_name_array = file_name.split("\\\\");
						
						int file_name_array_length = file_name_array.length;
						
						String real_file_name = file_name_array[file_name_array_length - 1];
						
						String real_file_name_encoded = URLEncoder.encode(real_file_name, "UTF-8");
						
						// file_name.replace(" ", "_");
						
						// file_name = URLEncoder.encode(file_name, "UTF-8");
						// file_name.replace("+", "_");
						// file_name.replace("%3A", ":");
						// file_name.replace("%5C", "\\");
						
						response.setHeader("Content-disposition", "attachment; filename=" + real_file_name_encoded);
						
						out.write(rsDocument.getString("file_data"));
						
					}
				
					rs.getStatement().getConnection().close();
					rs.getStatement().close();
					rs.close();
				
				}
				
				catch (SQLException e) {
					
					//
				}
				
			}
			
		}

		//out.write(getErrorXml(strArrErrors));
		//out.write("</response>");
		response.flushBuffer();
		
	}
	
}

