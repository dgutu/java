package com.proximo.inci;

import java.util.Vector;

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.exception.InvalidData;

public class DOUserLog
    extends DODataRecord
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public Vector empIDList;
    public Vector ipAddressList;
    public Vector loginTypeList;
    public Vector loginDtList;
    public Vector statusList;

    // constructors
    public DOUserLog ()
    {
        empIDList = new Vector();
        ipAddressList = new Vector();
        loginTypeList = new Vector();
        loginDtList = new Vector();
        statusList = new Vector();
    }

    public void validate ()
    throws InvalidData
    {}
    public static void validate (DODataRecord d)
    throws InvalidData
    {}
}
