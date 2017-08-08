/**
 * @author Eric Wayman
 */

package com.searchincite.server.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.searchincite.api.entity.User;
import com.searchincite.client.entity.Document;
import com.searchincite.server.docconverter.WebPageFetcher;
import com.searchincite.server.entity.manager.DocumentManager;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

public class AutofeedFetcherJob implements Job {
	
	public AutofeedFetcherJob() {
	}
	
	public void execute(JobExecutionContext context) throws JobExecutionException {
//		System.out.println("In SimpleQuartzJob - executing its JOB at " 
//				+ new Date() + " by " + context.getTrigger().getName());
		
		// String currentHash = new String("");
		// String url = new String("");
		
		int websiteId = 0;
		int orgId = 0;
		int documentSourceId;
		String url = "";
		String description = "";
		int createdBy = 0;
		String currentHash = "";
		String pageContent = "";
		
		// Get the system date and time.
		java.util.Date utilDate = new java.util.Date();
		// Convert it to java.sql.Date
		java.sql.Date creationDate = new java.sql.Date(utilDate.getTime());
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dateForFileName = dateFormat.format(utilDate);
		
		Connection db = null;
		PreparedStatement ps = null;
		PreparedStatement ps2 = null;
		try {
			db = SIDB.getConnection();
			
			if (db != null) {
				db.setAutoCommit(false);
				
				ps = db.prepareStatement("SELECT website_id, org_id, document_source_id, url, description, created_by, hash FROM ontology.website");
				
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					websiteId = rs.getInt("website_id");
					orgId = rs.getInt("org_id");
					documentSourceId = rs.getInt("document_source_id");
					url = rs.getString("url");
					description = rs.getString("description");
					createdBy = rs.getInt("created_by");
					currentHash = rs.getString("hash");
					WebPageFetcher autofeedFetcher = new WebPageFetcher(url);
					pageContent = autofeedFetcher.getPageContent();
					if (currentHash == pageContent) {
						continue;
					}
					else {
						try {
							ps2 = db.prepareStatement("INSERT INTO ontology.website (hash, last_checked_date) VALUES (?, ?)");
							ps2.setString(1, pageContent);
							ps2.setDate(2, creationDate);
							ps.executeUpdate();
						} catch (Exception e) {
							e.printStackTrace();
						}
						
						Document d = new Document();
						d.setContentString(pageContent);
						d.setDocumentSourceID(documentSourceId);
						d.setFilename(url + dateForFileName);
						d.setOrganizationID(orgId);
						d.setDescription(description);
						d.setCreatedByUserID(createdBy);
						
						DocumentManager.createDocument(d);
					}
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				db.commit();
				ps.close();
				db.close();
			} catch (SQLException ignore) {
			}
		}
	}

}
