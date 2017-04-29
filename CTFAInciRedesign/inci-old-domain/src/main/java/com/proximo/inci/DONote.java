package com.proximo.inci;


/*********************************************************************
**
**  Class:  DONote
**  Author: DJR
**  Date:   1/13/98
**
**  Description:
**  A specific note saved by a user.
**
**  Change History (provide name, date, description)
**
**
*********************************************************************/

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.TDate;

public class DONote
    extends DODataRecord
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public String comments;
    public TDate entryDate;
    public String empName;

    // constructors
    public DONote ()
    {
        this ("", new TDate (), "");
    }

    public DONote (String comments)
    {
        this (comments, TDate.rightNow (), "");
    }

    public DONote (String comments, TDate entryDate, String empName)
    {
        this.comments = new String (comments);
        this.entryDate = new TDate (entryDate);
        this.empName = new String (empName);
    }

    // toString override
    public String toString ()
    {
        if (empName == null)
            return "Note: " + comments.substring (0, 20);
        else
            return "Note: " +
                "date = " + entryDate + " " +
                "empName = " + empName;
    }

    public Object clone() {
        DONote n = (DONote) super.clone();

        n.comments = new String(this.comments);
        n.entryDate = (TDate)(this.entryDate).clone();
        n.empName = new String(empName);

        return n;
    }
}
