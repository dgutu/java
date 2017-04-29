package com.proximo.inci;


/*********************************************************************
**
**  Class:  DOException
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

public class DOException
    extends DODataRecord
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public Exception e;

    // constructors
    public DOException ()
    {
        this (null);
    }

    public DOException (Exception e)
    {
    	this.e = e;
    }

    // toString override
    public String toString () { return "DOException " + ((e == null) ? "null" : e.toString ()); }

    public void clear ()
    {
    	e = null;
    }

    public Object clone ()
    {
        return new DOException (e);
    }
}
