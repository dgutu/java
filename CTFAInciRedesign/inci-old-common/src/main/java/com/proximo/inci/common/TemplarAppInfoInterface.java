package com.proximo.inci.common;

import com.proximo.inci.common.security.DOToken;




public class TemplarAppInfoInterface
{
	protected String AppShortName = "iSuite";
	protected String AppName = "Proximo iSuite Application Server";

    // Following variable was added as all the application at LPD will now be identified by
    // Application ID instead of Name. Changes made by Mahesh Vipat on 04/11/2006
    
    protected String AppId = "";
	protected String ClientCopyright; 	// DR 7/17/02
										// leave this as null, because I want the null ptr exception that would
										// result if the subclass doesn't initialize it to be a cue to the developer

    // WL 1/14/01: This field is used specifically for the application display name
    // in the case that the display name is different from the APPL_NAME in
    // PROX_SEC.PROX_APPLICATION table. This happens in Lancome applications.
	protected String AppDisplayName = "Proximo iSuite Application Server";

	protected String DefaultPassword = Encrypt.encrypt ("start");
	protected String Version = "(Build 001)"; // this is now just a build number
	protected String reportSecurityToken = DOToken.TTYPE_FUNCTION;
	protected TemplarUtilInterface utilInter = new TemplarUtil();
	// DR 3/20/00: default directory
	protected String DefaultServerDir = "Proximo" + System.getProperty ("file.separator") + "iSuite";

    public TemplarAppInfoInterface () {}

    public String getAppShortName () { return AppShortName; }
    public String getAppName () { return AppName; }

    // Following method added by Mahesh Vipat on 04/11/2006
    public String getAppId () { return AppId; }

    // WL 1/14/01: by default the AppName and AppDisplayName are the same.
    // In case that the AppDisplayName is different from the AppName (Lancome),
    // We need to override this method to return the desired display name.
    public String getAppDisplayName () { return getAppName(); }

    public String getDefaultPassword () { return DefaultPassword; }
    public String getDefaultServerDir () { return DefaultServerDir; }
    public String getVersion () { return Version; }
    public String getClientCopyright () { return ClientCopyright; }

    // WL 7/26/99 override this method for Lancome to set client home drive to C:
    public String getDefaultClientDrive() {
        return System.getProperty ("user.home");
    }

    public String getReportSecurityToken () { return reportSecurityToken; }

    // WL 1/27/00
    public TemplarUtilInterface getUtilInter() {
        if (utilInter == null) return new TemplarUtil();
        return utilInter;
    }
}
