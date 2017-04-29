package com.proximo.inci;


/*********************************************************************
**
**  Class:  DOShortCompany
**  Author: DJR
**  Date:   2/10/98
**
**  Description:
**  A data record of company information.
**
**  Change History (provide name, date, description)
**
**
*********************************************************************/

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.exception.InvalidData;

public class DOShortCompany
    extends DODataRecord
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public long recID;
    public String name;
    public boolean isPrimary;

    // constructors
    public DOShortCompany ()
    {
        this (0, new String(""), false);
    }

    public DOShortCompany (long recID, String name, boolean isPrimary)
    {
        this.recID = recID;
        this.name = new String(name);
        this.isPrimary = isPrimary;
    }

    // toString override
    public String toString () { return "DOShortCompany " + name; }

    public void validate ()
    throws InvalidData
    {
        this.validate ((DODataRecord) this);
    }

    public static void validate (DODataRecord d)
    throws InvalidData
    {
    }

}
