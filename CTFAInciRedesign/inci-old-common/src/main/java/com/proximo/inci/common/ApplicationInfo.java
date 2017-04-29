package com.proximo.inci.common;

/*
DR 1/5/00
Added access to reportSecurityToken.  This is because different systems
may use a different token type to indicate a report function.
*/

public final class ApplicationInfo
{
	private String AppShortName;
	private String AppName;

    // WL 1/14/01: This field is used specifically for the application display name
    // in the case that the display name is different from the APPL_NAME in
    // PROX_SEC.PROX_APPLICATION table. This happens in Lancome applications.
	private String AppDisplayName;
    
    // Following variable was added as all the application at LPD will now be identified by
    // Application ID instead of Name. Changes made by Mahesh Vipat on 04/11/2006
    private String AppId;

    private String DefaultPassword;
	private String Version, ClientCopyright;
	private String reportSecurityToken;
	public static String DefaultClientDir = "Proximo";
	// DR 3/20/00: cannot be static, must be set by application
	//public static String DefaultServerDir = "Proximo" + System.getProperty ("file.separator") + "EChain";
	private String DefaultServerDir;
	public static String Copyright = "iSuite Version 4.24 (Build 098)\n" +
									"by Proximo Consulting Services, Inc.\n" +
									"Copyright© 1998-2008, All Rights Reserved\n" +
									"This program is protected by United States and International copyright law.";

    private static TemplarAppInfoInterface appInfoInter = null;
    private static TemplarUtilInterface utilInter = null;

    public ApplicationInfo () { };

    public String getAppShortName () { return AppShortName; }
    public String getAppName () { return AppName; }

    // Following method added by Mahesh Vipat on 04/11/2006
    public String getAppId () { return AppId; }

    // WL 1/14/01: get the application display name.
    public String getAppDisplayName () { return AppDisplayName; }

    public String getDefaultPassword () { return DefaultPassword; }
    public String getDefaultServerDir () { return DefaultServerDir; }
    public String getClientCopyright () { return ClientCopyright; }
    public String getVersion () { return Version; }
    public void setVersion (String v) { Version = v + " (Build " + Version + ")"; } // this will append the build number
    public String getReportSecurityToken () { return reportSecurityToken; }

    public boolean appInterfaceInitialized () { return (appInfoInter != null); }
    public void setAppInfoInterface (TemplarAppInfoInterface i)
    {
        appInfoInter = i;
        AppShortName = i.getAppShortName ();
        AppName = i.getAppName ();

        // WL 1/14/01
        AppDisplayName = i.getAppDisplayName ();

        Version = i.getVersion ();
        ClientCopyright = i.getClientCopyright ();
        DefaultPassword = i.getDefaultPassword ();
        reportSecurityToken = i.getReportSecurityToken ();
        utilInter = i.getUtilInter();
        DefaultServerDir = i.getDefaultServerDir ();

        // Following line was added by Mahesh Vipat on 04/11/2006
        AppId = i.getAppId();
    }

    public String getDefaultClientDrive() {
        String clientDrive = "";
        if (appInfoInter == null) clientDrive = System.getProperty ("user.home") + "\\";
        else clientDrive = appInfoInter.getDefaultClientDrive();
        return clientDrive;
    }

    public static TemplarUtilInterface getUtilInter() {
        return utilInter;
    }
}
