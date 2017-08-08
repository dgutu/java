package com.searchincite.server.entity.manager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.searchincite.client.entity.UserWizardRunInfo;

public class UserWizardManager {

	public static UserWizardRunInfo deserialize(ResultSet rs, long lFieldMask) throws SQLException {

		// Serialization will fail and a JavaScript error will be 
		// displayed on the page if you use getDate() -- like this:
		// s.setLastModifiedDate(subjResults.getDate("last_modified_date")); //DON'T DO THIS!
		// (Apparently, GWT can't serialize java.sql.Date even though it IS a java.util.Date.)

		return new UserWizardRunInfo(
				rs.getInt("org_id"),
				rs.getInt("ontology_id"),
				rs.getString("email_text"),
				new java.util.Date(rs.getDate("wizard_run_date").getTime()),
				rs.getInt("last_modified_by")				
		);

	}

	public static UserWizardRunInfo getLastUserWizardRun (int iOrganizationID, long lFieldMask) throws SQLException {
		
		ResultSet rs = com.searchincite.server.data.UserData.getLastWizardRunInfo(iOrganizationID);

		// Move to first row, which is a ResultSet containing run info (ONE row -- hopefully!)
		//if (!rs.next()) {
		//	return null;			
		//}

		// Get reference to first ResultSet (run info)
		//ResultSet rsInfo = (ResultSet)rs.getObject(1);
			
		UserWizardRunInfo ri = null;
		
		if (rs.next()) {
			ri = deserialize(rs, lFieldMask);
		}
		
		return ri;
	}

	public static void completeNewUserWizard(UserWizardRunInfo ri) throws SQLException {

		char[] chArrPassword = com.searchincite.server.security.Util.generateStrongPassword(8);
		String strPassword = new String(chArrPassword);
		
		// Concatenate user name and password to email body
		// Here are your credentials...
		// Username: xxxxxx
		// Password: xxxxxx
		
		String strEmailBody = ri.getEmailText();
		strEmailBody += "\\n\\nHere are your credentials...\\n";
		strEmailBody += "Username: " + ri.getUserName() + "\\n";
		strEmailBody += "Password: " + strPassword + "\\n";
			
		//defalut expire date is 30 days from creation of user
		//(Thanks, Java, for forcing this cheesy code.  Where's Date.addDays()??)
		Date dtDefaultExpire = new Date(new Date().getTime() + 2592000000L ); //2592000000 milliseconds = 30 days 

		com.searchincite.server.data.UserData.completeNewUserWizard(
				ri.getRunByUserID(), 
				ri.getEmailAddress(), 
				ri.getOrganizationName(), 
				ri.getUserName(), 
				strPassword, 
				ri.getSelectedOntologyID(), 
				strEmailBody,
				dtDefaultExpire);
	}
}
