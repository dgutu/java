package com.searchincite.server.data.external;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.sql.SQLException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.io.Reader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringEscapeUtils;

import com.searchincite.client.entity.Document;
import com.searchincite.client.entity.DocumentSource;
import com.searchincite.client.entity.WebUser;
import com.searchincite.server.entity.manager.DocumentManager;
import com.searchincite.server.entity.manager.DocumentSourceManager;
import com.searchincite.server.entity.manager.UserManager;

public class SubmitBinaryDocumentByURLServlet extends ServletBase {

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
		
		boolean bValidDocumentSourceID = validateParameterLong(request, "documentSourceID", true, false, false, strArrErrors);
		boolean bValidFilename = validateParameterString(request, "filename", true, strArrErrors);
		
		if (bValidDocumentSourceID && bValidFilename) {

			String strDocumentSourceID = request.getParameter("documentSourceID");

			boolean bAuthorized = false;
			
			// Make sure this user has permission to access the specified document source ID
			WebUser user = getUser(request);
			DocumentSource ds = null;
			
			String address = request.getParameter("filename");

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

			if (bValidDocumentSourceID && !UserManager.isSIAdmin(user.getUserID())) {
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
				
				byte[] urlcontent = null;;
				URL theURL = null;
				ByteArrayOutputStream byteout;
				int len;
				int numRead;
				URLConnection con = null;
				InputStream in = null;
				
				try {
					theURL = new URL(address);
					con = theURL.openConnection();
					len = con.getContentLength();
					in = con.getInputStream();
				    byteout = new ByteArrayOutputStream();

					
					if(len == -1){
		    			
                        numRead = 0;
		    			urlcontent = new byte[1024];
					    while ((numRead = in.read(urlcontent)) != -1) {
					        byteout.write(urlcontent);
					        numRead += 0;
            			}
					} else {
					    urlcontent = new byte[len];
					    in.read(urlcontent, 0, len);
                        byteout.write(urlcontent);
					}
					
					// Note: The next line of code limits the file size to 10 MB.
					// in.read(urlcontent, 0, 10485760);
					urlcontent = new byte[byteout.size()];
					byteout.write(urlcontent);
					
					
				} catch (MalformedURLException me) {
					strArrErrors.add(new String("MalformedURLException: " + me));
				} catch (IOException e) {
					strArrErrors.add(new String("Error in reading URL: " + e));
				} finally {
					try {
						if (in != null) {
							in .close();
						}
					} catch (IOException e) {
						strArrErrors.add(new String("Error in closing input stream."));
					}
				}
				
				d.setContent(urlcontent);
				
				d.setCreatedByUserID(user.getUserID());
				
				String strDescription = request.getParameter("description"); 
				d.setDescription(strDescription == null ? "" : strDescription);
				d.setDocumentSourceID(Integer.parseInt(strDocumentSourceID));
				d.setFilename(address); // put GET at the front of the filename
				//"GET "+request.getParameter("filename")+" HTTP/0.9"
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
						strArrErrors.add(new String("Failed to create document: " + e));
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
