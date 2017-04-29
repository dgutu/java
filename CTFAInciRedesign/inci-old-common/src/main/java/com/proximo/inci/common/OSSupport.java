package com.proximo.inci.common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OSSupport
{
    public static boolean HasDriveLetter = true;
    public static String fs = System.getProperty ("file.separator");
    public static String DefaultLocation = System.getProperty ("file.separator") + "Progra~1" + System.getProperty ("file.separator");
    public static String DefaultDrive = "C:";
    public static String BatchComment = "@rem";
    public static String osSupported = "Win32";

    public static String DefaultCmdExe = "winnt" + System.getProperty ("file.separator") +
                                            "system32" + System.getProperty ("file.separator") +
                                            "cmd.exe /c";

    //JV 10/03/06 - The following command does not require the full system32 path.
    //In order for this to work, the system32 path should be in the 'path' enviornment variable.
    //Some servers have a 'windows' directory, others have a 'winnt' directory.
    public static String GenericCmdExe = "cmd.exe /c";

    public static String DefaultCmdExtention = ".bat";
    public static String DefaultShellCmd = "call";
    public static String ShellExitCmd = "exit";
    public static String FileCopyCmd = "copy";
    public static String FileRenameCmd = "ren";

    public static String getOSSupport () { return osSupported; }
    public static void printOSSupport () { System.out.println ("OS Supported is " + osSupported); }

    public static String getCommandLine ()
    {
        return "start /min ";
    }

    //SS 4/6/98 moved from LogManager
    public static String getDefaultLocation ()
    {
        return getDefaultDrive () + OSSupport.DefaultLocation;
    }
    static public void main ()
    {
        OSSupport.printOSSupport ();
    }

    // DR 4/14/98: get the default drive letter
    // DR 6/17/98: this is the drive of installation
    public static String getDefaultDrive ()
    {
        String drive = "";
        if (HasDriveLetter) {
            // look for drive.cfg in the current directory
            try {
                FileReader driveFile = new FileReader("drive.cfg");
                BufferedReader buf = new BufferedReader(driveFile);
                drive = buf.readLine ();
                buf.close ();
            } catch (IOException e) { drive = OSSupport.DefaultDrive; }
        }
        return drive;
    }

    // DR 6/17/98: get the drive on which the OS is installed
    public static String getDefaultOSDrive ()
    {
        String drive = "";
        if (HasDriveLetter) {
            // look for osdrv.cfg in the current directory
            try {
                FileReader driveFile = new FileReader("osdrv.cfg");
                BufferedReader buf = new BufferedReader(driveFile);
                drive = buf.readLine ();
                buf.close ();
            } catch (IOException e) { drive = OSSupport.DefaultDrive; }
        }
        return drive;
    }

    // DR 7/10/98: what command do I need in the batch file to handle our "periodic" batch commands
    // seperate with \n
    public static String getProcFileExecString (String execName, String runName, String semophore)
    {
        return "@if exist " + semophore + ".me goto end\n" +
                "@echo inuse > " + semophore + ".me\n" +
                ":start\n" +
                "@if exist " + semophore + " goto start\n" +
                "@echo inuse > " + semophore + "\n" +
                "@if not exist " + runName + " goto norunfile\n" +
                "@call " + runName + "\n" +
                "@del " + runName + "\n" +
                "@goto delsection\n" +
                ":norunfile\n" +
                "@echo No report file to run\n" +
                ":delsection\n" +
                //"del " + execName + "\n" +
                "@del " + semophore + "\n" +
                "@del " + semophore + ".me\n" +
                ":end";
    }
    // DR 11/21/98: added a version with a new title
    public static String getRptStatusCheckString (long id, String report, int code, String outName)
    {
        return getRptStatusCheckString (id, report, code, outName, "");
    }
    public static String getRptStatusCheckString (long id, String report, int code, String outName, String newTitle)
    {
        return "@if exist ..\\temp\\rptstat" + id + ".ok goto g" + id + "ok\n" +
                "@call RptUpdate.bat " + id + " 4 " + report + " " + code + " " + outName + " \"\"\n" +
                "@goto g" + id + "err\n" +
                ":g" + id + "ok\n" +
                "@call RptUpdate.bat " + id + " 3 " + report + " " + code + " " + outName + " \"" + newTitle + "\"\n" +
                ":g" + id + "err\n" +
                "@del ..\\temp\\rptstat" + id + ".*";
    }

    // WL 8/12/01
    public static String getDocSemCheckingString(String semName) {
        return ":checkdocsem\n" +
               "@if not exist ..\\temp\\" + semName + ".txt goto createdocsem\n" +
               "@call sleep 2\n" +
               "@goto checkdocsem\n" +
               ":createdocsem\n" +
               "@echo document running >> ..\\temp\\" + semName + ".txt\n";
    }

    public static String getCleanupDocSemString(String semName) {
        return "@del ..\\temp\\" + semName + ".txt\n";
    }
}
