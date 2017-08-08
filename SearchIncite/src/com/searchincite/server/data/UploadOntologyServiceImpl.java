package com.searchincite.server.data;

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
import com.searchincite.server.entity.manager.OntologyManager;
import java.util.List; 
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UploadOntologyServiceImpl extends HttpServlet  {

	// logger
	private final static Logger log = Logger.getLogger(UploadOntologyServiceImpl.class.getName());
	
	private static final long serialVersionUID = 1L;

	public void service (HttpServletRequest request, HttpServletResponse response) throws ServletException {
				
	    FileItem uploadItem = getFileItem(request);
	    if (uploadItem == null) {	      
	      return;
	    }
	
	    // file content
	    byte[] fileContents = uploadItem.get();
	    
	    try
	    {
	    	// get current user
		    User u = (User)request.getSession().getAttribute("user");
		    log.log(Level.INFO, "user ID={0}", u.getUserID());
		    
		    // get user sessionID
		    String sessionID = request.getSession().getId();
		    log.log(Level.INFO, "session ID={0}", sessionID);
		    
		    // process the CSV import
	    	int r = OntologyManager.importOntologyCSV(new String(fileContents), u, sessionID);	    	
	    	
	    	response.setContentType("text/html");
	    	
	    	if (r < 0) {
	    		response.getWriter().print("fail");
	    		log.log(Level.INFO, "Fail import the file " + uploadItem.getName() + " !");
	    	}
	    	else {
	    		response.getWriter().print("success");
	    		log.log(Level.INFO, "File " + uploadItem.getName() + " Imported successfully!");
	    	}
	    	
	    } catch (Exception ex) {    	
	    	
	    	log.log(Level.SEVERE, ex.getLocalizedMessage());
	    }
	} 
	
	@SuppressWarnings("rawtypes")
	private FileItem getFileItem(HttpServletRequest request) {
	    FileItemFactory factory = new DiskFileItemFactory();
	    ServletFileUpload upload = new ServletFileUpload(factory);
	
	    try {
	      List items = upload.parseRequest(request);
	      Iterator it = items.iterator();
	      while (it.hasNext()) {
	        FileItem item = (FileItem) it.next();
	        if (!item.isFormField() && "uploadFormElement".equals(item.getFieldName())) {
	          return item;
	        }
	      }
	    } catch (FileUploadException e) {
	      return null;
	    }
	    return null;
	  } 
}
