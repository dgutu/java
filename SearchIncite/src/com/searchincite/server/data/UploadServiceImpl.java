package com.searchincite.server.data;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.searchincite.api.entity.User;
import com.searchincite.client.entity.Document;
import com.searchincite.server.entity.manager.DocumentManager;

public class UploadServiceImpl extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

        User u = (User)request.getSession().getAttribute("user");
        
        if (u == null) {
        	return;
        }

		if (!ServletFileUpload.isMultipartContent(request)) {
			return;
		}

		//Enumeration e1 = request.getParameterNames();
		//Object o1 = e1.nextElement();
		//while (e1.hasMoreElements()) {
		//	Object o = e1.nextElement();
		//}

		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);

		List items = null;
		try {
			items = upload.parseRequest(request);
		} catch (FileUploadException e) {
			e.printStackTrace();
			return;
		}

		String charset = request.getCharacterEncoding();
		Document d = new Document();
		d.setCreatedByUserID(u.getUserID());
		d.setOrganizationID(u.getOrganizationID());
		
		for (Iterator i = items.iterator(); i.hasNext();) {
			FileItem item = (FileItem) i.next();

			if (item.isFormField()) {

				String strFieldName = item.getFieldName();
				
				String value = null;
				if (charset == null) {
					value = item.getString();
				} else {
					try {
						value = new String(item.get(), charset);
					} catch (UnsupportedEncodingException e) {
						value = item.getString();
					}
				}
				if (strFieldName.equals("documentSourceID")) {
					d.setDocumentSourceID(Integer.parseInt(value));
				}
				else if (strFieldName.equals("documentDescription")) {
					d.setDescription(value);
				}

			}
			else {
				//String strContent = item.getString();
				d.setFilename(item.getName());
				d.setContent(item.get());
			}

		} // end for
		
		try {
			DocumentManager.createDocument(d);
		}
		catch (Exception ex) {
			//TODO: Handle exception
		}

	} // end service()

}
