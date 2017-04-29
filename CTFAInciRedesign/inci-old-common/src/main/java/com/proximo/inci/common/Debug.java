package com.proximo.inci.common;


/*********************************************************************
**
**  Class:  Debug
**  Author: DJR
**  Date:   12/23/97
**
**  Description:
**  Handles debugging functions.  Can write to a log file.
**  Contains assertion routins.
**
**  Change History (provide name, date, description)
**  Replaced RandomAccessFile with FileWriter/FileReader.
**
**
*********************************************************************/

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.Date;

public class Debug
    implements ServerUtilityInterface, DebugInterface
{
    private static boolean debug;
    private static boolean debugSQL;
    private static boolean fileOpen;
    private static boolean screenPrint;

    // modified on 12/23/97 (TUE) by Wei Liu
    private static FileWriter logFile;
    private static BufferedWriter bufw;

    public Debug (boolean debug)
    {
        this (debug, "debug.log");
    }
    public Debug (boolean debug, String fileName)
    {
        this (debug, fileName, true);
    }
    public Debug (boolean debug, String fileName, boolean screenPrint)
    {
    	this (debug, fileName, screenPrint, false);
    }
    public Debug (boolean debug, String fileName, boolean screenPrint, boolean append)
    {
        this.screenPrint = screenPrint;
        if (debug && fileName != null) { // if file name is null we will just print to the screen
            Date d = new Date ();
            String text = d.toString ();
            try {
                // modified on 12/23/97 (TUE) by Wei Liu
                logFile = new FileWriter(fileName, append);
                bufw = new BufferedWriter(logFile);
                bufw.newLine();
                bufw.write("---------- New run on " + text + " ----------");
                bufw.newLine();
                bufw.flush();

                fileOpen = true;
            } catch (IOException e) {
                System.out.println("    >>" + fileName + " file error in openning...\n" + e.toString());
                e.printStackTrace();
                fileOpen = false;
            }
        } else {
            fileOpen = false;
		}
		
        this.debug = debug;
        debugSQL = false;
    }

    public static boolean isDebugging () { return debug; }
    public static boolean isDebuggingSQL () { return debugSQL; }
    public static void setSQLDebug (boolean d) { debugSQL = d; }

    public static void alwaysWrite (String line) { write (line); }
    public static void writeWithNoTime (String line) { write (line, false); }
    public synchronized static void write (String line) { write (line, true); }
    public synchronized static void write (String line, boolean withTime)
    {
        if (debug) {
            try {
            	StringBuffer time = new StringBuffer ();
            	if (withTime) {
            		time.append (stringNow ());
            		time.append (new String (" "));
            	}
                if (screenPrint) System.out.println (time + line);
                
                if (fileOpen) {
	                bufw.write(time + line);
	                bufw.newLine ();
	                bufw.flush();
                }
            }
            catch (IOException e) {
                debug = false;
                System.out.println("    >>error in writing into debug.log\n" + e.toString());
            }
        }
        line = null;
    }

    public static void closeDebugFile () {
        if (fileOpen) {
            try {
                bufw.close();
                fileOpen = false;
            }
            catch (IOException e) {}
        }
        return;
    }

    public void shutdown () {
        closeDebugFile();
        return;
    }

    private static String lpad (String s, int l, char c)
    {
        String newString = new String (s);

        while (newString.length () < l) newString = String.valueOf (c) + newString;
        return newString;
    }
    private static String stringNow ()
    {
    	java.util.Date date = new java.util.Date ();
        String year = lpad (Integer.toString (date.getYear () + 1900), 4, '0');
        String month = lpad (Integer.toString (date.getMonth () + 1), 2, '0');
        String day = lpad (Integer.toString (date.getDate ()), 2, '0');
        String hour = lpad (Integer.toString (date.getHours ()), 2, '0');
        String minute = lpad (Integer.toString (date.getMinutes ()), 2, '0');
        String second = lpad (Integer.toString (date.getSeconds ()), 2, '0');
        return year + month + day + hour + minute + second;
    }

    public static void showClassInfo (String className)
    {
    	showClassInfo (className, null);
    }
    
    public static void showClassInfo (String className, DebugPrinter printer)
    {
    	try {
	    	showClassInfo (Class.forName (className), printer);
    	} catch (ClassNotFoundException e) {
    		if (printer == null) Debug.write ("Invalid class name: " + className);
    		else printer.writeDebug ("Invalid class name: " + className);
    	}
    }
    
    public static void showClassInfoForObject (Object o)
    {
    	showClassInfoForObject (o, null);
    }
    
    public static void showClassInfoForObject (Object o, DebugPrinter printer)
    {
        Debug.write ("object is " + o);
        showClassInfo (o.getClass (), printer);
    }

    public static void showClassInfo (Class c)
    {
    	showClassInfo (c, null);
    }
    
    public static void showClassInfo (Class c, DebugPrinter printer)
    {
        if (printer == null) Debug.write ("class is " + c.getName ());
        else printer.writeDebug ("class is " + c.getName ());
        
        Method m[] = c.getMethods();
        int x, y;
        for (x = 0; x < m.length; x++) {
            if (printer == null) Debug.write ("method " + x + " is " + m[x].getName ());
            else printer.writeDebug ("method " + x + " is " + m[x].getName ());
            if (printer == null) Debug.write ("   return type is " + m[x].getReturnType ());
            else printer.writeDebug ("   return type is " + m[x].getReturnType ());
            Class p[] = m[x].getParameterTypes();
            for (y = 0; y < p.length; y++)
                if (printer == null) Debug.write ("   parm " + y + " is " + p[y]);
                else printer.writeDebug ("   parm " + y + " is " + p[y]);
        }
    }

// Added on 12/25/97 (THU) by Wei Liu
// following Dr. Dobb's Journal, (January 1998)

    private static String getStackTrace() {  // gets a stack trace
        Throwable t = new Throwable();		 // for getting stack trace
        ByteArrayOutputStream os = new ByteArrayOutputStream();  // for storing stack trace
        PrintStream ps = new PrintStream(os);  // printing destination
        t.printStackTrace(ps);
        return os.toString();
    }

    /*
    public static void PreCondition(boolean condition, String message) {  // code to check PreConditions
        if (!condition) {  // was PreCondition violated?
            if (debug) {
                write("Precondition [" + message + "] fired at:");  // print user msg
		        write(getStackTrace());  // print stack
            }
            else {
                System.out.println("Precondition [" + message + "] fired at:");  // print user msg
		        System.out.println(getStackTrace());  // print stack
            }
            ApplicationInfo.getUtilInter().systemExit(1);
        }
    }*/

    /*
    public static void Assert(boolean condition, String message) {  // code for data state assertions
        if (!condition) {  // was assertion violated?
            if (debug) {
                write("Assert [" + message + "] fired at:");
                write(getStackTrace());
            }
            else {
                System.out.println("Assert [" + message + "] fired at:");
                System.out.println(getStackTrace());
            }
            ApplicationInfo.getUtilInter().systemExit(1);
        }
    }*/

    /*
    public static void PostCondition(boolean condition, String message) {  // code for PostCondition check
        if (!condition) {  // was PostCondition violated?
            if (debug) {
                write("Postcondition [" + message + "] fired at:");
                write(getStackTrace());
            }
            else {
                System.out.println("Postcondition [" + message + "] fired at:");
                System.out.println(getStackTrace());
            }
            ApplicationInfo.getUtilInter().systemExit(1);
        }
    }*/

	// for DebugInterface
    public void writeDebug (String line) { write (line); }
    public void alwaysWriteDebug (String line) { write (line); }
}
