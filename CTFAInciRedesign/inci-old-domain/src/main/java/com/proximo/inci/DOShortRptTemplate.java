package com.proximo.inci;


import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.exception.InvalidData;

public class DOShortRptTemplate
    extends DODataRecord
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public long empRecID;
    public String rptDesc, rptType;

    // constructors
    public DOShortRptTemplate ()
    {
        this (0, 0, new String (""), new String(""));
    }

    public DOShortRptTemplate (DOShortRptTemplate tmp)
    {
        this.recID = tmp.recID;
        this.empRecID = tmp.empRecID;
        this.rptDesc = tmp.rptDesc;
        this.rptType = tmp.rptType;
    }

    public DOShortRptTemplate (long recID, long empRecID, String rptDesc, String rptType)
    {
        this.recID = recID;
        this.empRecID = empRecID;
        this.rptDesc = rptDesc;
        this.rptType = rptType;
    }

    public void validate ()
    throws InvalidData {}
    public static void validate (DODataRecord d)
    throws InvalidData {}
}
