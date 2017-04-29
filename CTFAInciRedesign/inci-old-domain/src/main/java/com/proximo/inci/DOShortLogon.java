package com.proximo.inci;

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.TDate;
import com.proximo.inci.common.exception.InvalidData;

public class DOShortLogon
    extends DODataRecord
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public String userID, name;
    public TDate logonDate;


    // constructors
    public DOShortLogon ()
    {
        userID = new String ();
        name = new String ();
        logonDate = new TDate();
    }

    public String toString () { return "DOShortLogon[" + userID + "]"; }

    public void validate ()
    throws InvalidData
    {
        this.validate ((DODataRecord) this);
    }

    public static void validate (DODataRecord d)
    throws InvalidData
    {
    }

    public void clear ()
    {
        userID = null;
        name = null;
        logonDate = null;
        userID = new String ();
        name = new String ();
        logonDate = new TDate ();
    }

    public Object clone ()
    {
        DOShortLogon l = new DOShortLogon ();
        l.userID = this.userID;
        l.name = this.name;
        l.logonDate = this.logonDate;
        return l;
    }

}
