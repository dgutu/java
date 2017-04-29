package com.proximo.inci;


/*********************************************************************
**
**  Class:  DOISuiteXMLStatus
**  Author: DJR
**  Date:   6/30/02
**
**  Description:
**  Encapsulates a java exception.
**
**  Change History (provide name, date, description)
**
**
*********************************************************************/

import com.proximo.inci.common.DODataRecord;

public class DOISuiteXMLStatus
    extends DODataRecord
{
	private static final long serialVersionUID = 101L; // improves speed of serialization

    public boolean ok;
    public String message;
    public int code;
    public Exception exception;
    public String sessid;

    // constructors
    public DOISuiteXMLStatus ()
    {
        this (true, new String (), 0, null);
    }

    public DOISuiteXMLStatus (boolean ok, String message, int code, Exception exception)
    {
    	this (ok, message, code, exception, null);
    }

    public DOISuiteXMLStatus (boolean ok, String message, int code, Exception exception, String sessid)
    {
    	this.ok = ok;
    	this.message = new String (message);
    	this.code = code;
    	this.exception = exception;
    	this.sessid = sessid;
    }

    // toString override
    public String toString () 
    { 
    	StringBuffer b = new StringBuffer ("DOISuiteXMLStatus[" 
    				+ "ok=" + ok
    				+ ",message=" + message
    				+ ",code=" + code
    				+ ",exception=");
		if (exception != null) {
			b.append ("[class=" + (exception.getClass ()).getName () 
    				+ ",text=\"" + exception.toString ()
    				+ "\"]");
		} else {
    		b.append ("null");
		}
		b.append (",sessid=" + sessid);
		b.append ("]");
		return b.toString ();
	}

    public void clear ()
    {
    	this.ok = true;
    	this.message = null;
    	this.message = new String ();
    	this.code = 0;
    	this.exception = null;
    	this.sessid = null;
    }

    public Object clone ()
    {
        return new DOISuiteXMLStatus (ok, message, code, exception, sessid);
    }
}
