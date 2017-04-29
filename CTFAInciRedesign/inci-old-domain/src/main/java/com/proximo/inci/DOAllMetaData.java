package com.proximo.inci;


/*********************************************************************
**
**  Class:  DOAlert
**  Author: DJR
**  Date:   12/19/97
**
**  Description:
**  A data record of alert information.
**
**  Change History (provide name, date, description)
**
**
*********************************************************************/

import com.proximo.inci.common.DODataRecord;

public class DOAllMetaData
    extends DODataRecord
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public long recID;
    public String description;
    public String value;
    public int datatype;

    public final static int TYPE_BOOLEAN = 1;
    public final static int TYPE_DATE = 2;
    public final static int TYPE_DOUBLE = 3;
    public final static int TYPE_FLOAT = 4;
    public final static int TYPE_INTEGER = 5;
    public final static int TYPE_STRING = 6;

    // constructors
    public DOAllMetaData ()
    {
        this (0, null, null, TYPE_STRING);
    }

    public DOAllMetaData (long recID, String description, String value, int datatype)
    {
        this.recID = recID;
        this.description = description;
        this.value = value;
        this.datatype = datatype;
    }

    // toString override
    public String toString ()
    {
        return "Meta Data " +
            "rec = " + recID + " " +
            "value = " + value;
    }

}
