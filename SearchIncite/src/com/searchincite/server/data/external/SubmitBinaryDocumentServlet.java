package com.searchincite.server.data.external;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.searchincite.client.entity.DocumentSource;
import com.searchincite.client.entity.WebUser;

/**
 *
 * @author ewayman
 * 
 */

public class SubmitBinaryDocumentServlet extends ServletBase {

	private static final long serialVersionUID = 1L;

	private static final int BYTE_READ_SIZE = 200000;
	private static final String STORAGE_LOCATION = "/var/www/virtual-searchincite/";
	private static final String TEMP_REPOSITORY = "/tmp";

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, FileUploadException {

		PrintWriter out = response.getWriter();
		out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		out.write("<response>");
		
		ArrayList strArrErrors = new ArrayList();
		
		boolean bValidDocumentSourceID = validateParameterLong(request, "documentSourceID", true, false, false, strArrErrors);

		if (bValidDocumentSourceID) {
			
			String strDocumentSourceID = request.getParameter("documentSourceID");
			
			out.write("<test1>" + strDocumentSourceID + "</test1>");
			
			boolean bAuthorized = false;
			
			// Make sure this user has permission to access the specified document source ID
			WebUser user = getUser(request);
			DocumentSource ds = null;

			String filename = null;
			String filenamewithpath = null;
			
			try {

				DiskFileItemFactory factory = new DiskFileItemFactory();
				
				//Any file that is more than 5KB is stored in temporary repository. Feel free to change this value.
				factory.setSizeThreshold(5000);
				factory.setRepository(new File(TEMP_REPOSITORY));

				ServletFileUpload upload = new ServletFileUpload(factory);

				List<FileItem> items = upload.parseRequest(request);

				for (FileItem item : items) {

					if (!item.isFormField()) {
						InputStream is = item.getInputStream();
						FileOutputStream os = new FileOutputStream(new File(STORAGE_LOCATION + item.getName() ));
						filename = item.getName();
						filenamewithpath = STORAGE_LOCATION + item.getName();
						byte[] b = new byte[BYTE_READ_SIZE];
						int bytesRead = 0;
						while ((bytesRead = is.read(b)) != -1) {
							os.write(b, 0, bytesRead);
						}

						os.flush();
						os.close();
						is.close();
					}
				}
			} finally {
				out.write("File Uploaded");
				out.write("</response>");
			}
			
//			try {
//				ds = DocumentSourceManager.getDocumentSourceByID(Integer.parseInt(strDocumentSourceID), DocumentSource.FIELD_ORGANIZATION_ID);
//				
//				if (ds == null) {
//					strArrErrors.add(new String("Invalid documentSourceID."));
//					bValidDocumentSourceID = false;
//				}
//			} catch (NumberFormatException e) {
//				strArrErrors.add(new String("Error parsing integer value for documentSourceID."));
//				bValidDocumentSourceID = false;
//			} catch (SQLException e) {
//				strArrErrors.add(new String("An error occurred while attempting to retrieve the specified DocumentSource."));
//				bValidDocumentSourceID = false;
//			}
//			
//			if (bValidDocumentSourceID && !UserManager.isSIAdmin(user.getUserID())) {
//				// If user is not an SI admin, then their organization ID must match
//				// the organization ID of the specified document source.
//				if (ds.getOrganizationID() == user.getOrganizationID()) {
//					bAuthorized = true;
//				}
//			}
//			else {
//				// User is an SI Admin
//				bAuthorized = true;
//			}
//			
//			if (!bAuthorized) {
//				strArrErrors.add(new String("Unauthorized access attempt.  The specified documentSourceID does not belong to your organization."));
//			}
//			else if (bValidDocumentSourceID) {
//				
//				Document d = new Document();
//				
//				
//				// Puts the contents of the file into a byte array.
//
//				File inputFile = new File(filenamewithpath);
//				FileInputStream in = new FileInputStream(inputFile);
//				
//				// Get the size of the file
//				long filelength = inputFile.length();
//
//				// Create the byte array to hold the data
//				byte[] filecontentbytes = new byte[(int)filelength];
//				
//				// Read in the bytes
//				int offset = 0;
//				int numRead = 0;
//				while (offset < filecontentbytes.length
//						&& (numRead=in.read(filecontentbytes, offset, filecontentbytes.length-offset)) >= 0) {
//					offset += numRead;
//				}
//
//				// Ensure all the bytes have been read in
//				if (offset < filecontentbytes.length) {
//					throw new IOException("Could not completely read file "+inputFile.getName());
//				}
//				
//				// Close the input stream
//				in.close();
//
//				
//				d.setContent(filecontentbytes);
//				
//				d.setCreatedByUserID(user.getUserID());
//				
//				String strDescription = request.getParameter("description"); 
//				d.setDescription(strDescription == null ? "" : strDescription);
//				d.setDocumentSourceID(Integer.parseInt(strDocumentSourceID));
//				d.setFilename(filename);
//				d.setOrganizationID(ds.getOrganizationID());
//				
//				//Check whether document with this filename already exists
//				boolean bFilenameExists = false;
//				
//				try {
//					bFilenameExists = DocumentManager.checkFilenameExists(ds.getOrganizationID(), d.getFilename());
//				} catch (SQLException e1) {
//					bFilenameExists = false;
//				}
//				
//				if (!bFilenameExists) {
//					// Everything's alright -- do processing here
//					
//					try {
//						DocumentManager.createDocument(d);
//						
//						out.write("<documentList count=\"1\">");  
//						out.write("<document ID=\"" + String.valueOf(d.getDocumentID()) + "\" />");
//						out.write("</documentList>");  
//
//					} catch (SQLException e) {
//						strArrErrors.add(new String("Failed to create document."));
//					}
//				}
//				else {
//					strArrErrors.add(new String("A document with this filename already exists."));
//				}
//			}
		}
		
			out.write(getErrorXml(strArrErrors));
			out.write("</response>");
            out.close();
            response.flushBuffer();
		}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		super.doGet(request, response);
		try {
			processRequest(request, response);
		} catch (FileUploadException ex) {
			//Logger.getLogger(SubmitBinaryDocumentServlet.class.getName()).log(Level.SEVERE, null, ex);
			ex.getLocalizedMessage();
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		super.doPost(request, response);
		try {
			processRequest(request, response);
		} catch (FileUploadException ex) {
			//Logger.getLogger(SubmitBinaryDocumentServlet.class.getName()).log(Level.SEVERE, null, ex);
			ex.getLocalizedMessage();
		}
		
	}

}
