package com.searchincite.server.data.external;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

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
import com.searchincite.server.data.DocumentWrapper;
import com.searchincite.server.entity.manager.DocumentManager;
import com.searchincite.server.entity.manager.DocumentResultManager;
import com.searchincite.server.entity.manager.OntologyManager;

public class RetrieveResultServlet extends ServletBase {

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
			
			int      blah1 = 0;
			
			try {
				blah1 = user.getOrganizationID();
			} catch (Exception e) {
				strArrErrors.add(new String("Error populating organization ID. ") + StringEscapeUtils.escapeXml(e.getMessage()));
			}
			
			try {
				doc = DocumentManager.getDocumentByID(lDocumentID, blah1, Document.FIELD_ALL_FIELDS);
			} catch (SQLException e) {
				strArrErrors.add(new String("Error retrieving document. ") + StringEscapeUtils.escapeXml(e.getMessage()));
			}
				
			if (doc == null) {
				strArrErrors.add(new String("Invalid documentID."));
				bValidDocumentID = false;
			}
			else {

				out.write("<document>");
				out.write("<documentSourceID>" + String.valueOf(doc.getDocumentSourceID()) + "</documentSourceID>");
				out.write("<filename>" + StringEscapeUtils.escapeXml(doc.getFilename()) + "</filename>");
				out.write("<description>" + StringEscapeUtils.escapeXml(doc.getDescription()) + "</description>");

				// Get distinct ontologies that this document was processed against (if any)
				Ontology[] arrOntologies = null;
				try {
					arrOntologies = OntologyManager.getProcessedOntologies(lDocumentID, 0);
				} catch (SQLException e1) {
					strArrErrors.add(new String("An error occured while attempting to retrieve the ontologies against which the specified document was processed. ") + StringEscapeUtils.escapeXml(e1.getMessage()));
				}
				
				if (arrOntologies != null) {
					
					out.write("<processedOntologyList count=\"" + String.valueOf(arrOntologies.length) + "\">");
	
					for (int iOntology = 0; iOntology < arrOntologies.length; iOntology++) {
	
						Ontology o = arrOntologies[iOntology];
						out.write("<ontology>");

						try {
							out.write("<processedStatus>" + DocumentManager.getOntologyDocumentStatus(doc.getDocumentID(), o.getOntologyID()) + "</processedStatus>");
						} catch (SQLException e1) {
							out.write("<processedStatus>Error: " + e1 + "</processedStatus>");
						}
						
						// Get document result
						try {
							out.write("<ontologyID>" + String.valueOf(o.getOntologyID()) + "</ontologyID>");
							out.write("<ontologyName>" + StringEscapeUtils.escapeXml(o.getName()) + "</ontologyName>");

							DocumentResult dr = DocumentResultManager.getDocumentResult(o.getName(), lDocumentID, 0 /* TODO: Use lFieldMask */);
							
							out.write("<subjectList count=\"" + String.valueOf(dr.getSubjectResults().length) + "\" >");

							for (int iSubjects = 0; iSubjects < dr.getSubjectResults().length; iSubjects++) {
								DocumentSubjectResult dsr = dr.getSubjectResults()[iSubjects];
								out.write("<subject>");
								out.write("<subjectID>" + String.valueOf(dsr.getSubject().getSubjectID()) + "</subjectID>");
								out.write("<subjectName>" + StringEscapeUtils.escapeXml(dsr.getSubject().getName()) + "</subjectName>");
								out.write("<pctvalue>" + dsr.getResult() + "</pctvalue>");
								out.write("</subject>");
							}
							out.write("</subjectList>");

							if ((validateParameterBoolean(request, "includeMarkup", false, strArrErrors)) &&
									(Boolean.valueOf(request.getParameter("includeMarkup")) == Boolean.TRUE)) {
								
								// If "markupOnly" is FALSE, then return the markup.
								out.write("<markup>" + StringEscapeUtils.escapeXml(dr.getMarkedUpDocument()) + "</markup>");
							}
							
							if ((validateParameterBoolean(request, "includePlainText", false, strArrErrors)) &&
                                    (Boolean.valueOf(request.getParameter("includePlainText")) == Boolean.TRUE)) {
								
                                // If "markupOnly" is FALSE, then return the markup.
								// byte b[] = (DocumentData.getDocumentByID(dr.getDocumentID(), user.getOrganizationID(), Document.FIELD_ALL_FIELDS)).getBytes("file_plain_text");
							    
								ResultSet rs = DocumentData.getDocumentByID(dr.getDocumentID(), user.getOrganizationID(), Document.FIELD_ALL_FIELDS);
							   
							    Document d = null;
							    
							    ResultSet rsDocument = null;
							    
							    if (rs.next()) {
							    	
							    	rsDocument = (ResultSet)rs.getObject(1);
							    	
							    	if (!rsDocument.next()) {
							    		out.write("<test1>Error in rsDocument.next()</test1>");
							    	}
							    	
							    	d = com.searchincite.server.entity.manager.DocumentManager.deserialize(rsDocument, Document.FIELD_ALL_FIELDS);
							    }
							    
								else {
									// Document wasn't found (invalid document_id?)
									out.write("<test2>Document wasn't found (invalid document_id?)</test2>");
								}
							    
							    // ResultSetMetaData md = rsDocument.getMetaData();
								// out.write("<test3>");
								// out.write("Col count is " + md.getColumnCount());
								// for(int i=1; i < (md.getColumnCount() +1) ; i++) {
								// 	out.write("Column name is " + i +" "+ md.getColumnName(i));
								// }
								// out.write("</test3>");

								// DocumentWrapper dw = new DocumentWrapper(DocumentData.getDocumentByID(dr.getDocumentID(), user.getOrganizationID(), Document.FIELD_ALL_FIELDS));
							    // DocumentWrapper dw = new DocumentWrapper(rs);
							    // out.write("<markup>" + b + "</markup>");
							    // out.write("<markup>" + dw.plainText + "</markup>");
							    
							    out.write("<plaintext>" + StringEscapeUtils.escapeXml(rsDocument.getString("file_plain_text")) + "</plaintext>");
							    
							    rs.getStatement().getConnection().close();
							    rs.getStatement().close();
							    rs.close();
                            }
								
						} catch (SQLException e) {
							strArrErrors.add(new String("An error occured while attempting to format the subjectList XML node. ") + StringEscapeUtils.escapeXml(e.getMessage()));
						}
						out.write("</ontology>");
					}
					out.write("</processedOntologyList>");
				}
				else {
					try {
						out.write("<processedStatus>" + DocumentData.getOntologyDocumentStatusWithoutOntology(doc.getDocumentID()) + "</processedStatus>");
						out.write("<processedOntologyList count=\"0\"/>");
					} catch (SQLException e) {
						strArrErrors.add(new String("An error occured while attempting to get the processed status."));
					}
				}
				
				out.write("</document>");
			}
		}

		out.write(getErrorXml(strArrErrors));
		out.write("</response>");
		response.flushBuffer();
	}
	
}
