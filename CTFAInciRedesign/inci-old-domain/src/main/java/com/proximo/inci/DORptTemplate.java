package com.proximo.inci;

import java.util.Vector;

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.exception.InvalidData;

public class DORptTemplate
    extends DODataRecord
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public long empRecID;
    public String rptDesc, rptType;
    public Vector lists;
    public Vector others;    /*  order is: combo1,combo2,output,startDate,endDate,sort,checkbox */

    // constructors
    public DORptTemplate ()
    {
        this (0, 0, new String (""), new String(""), new Vector (), new Vector ());
    }

    public DORptTemplate (long recID, long empRecID, String rptDesc, String rptType, Vector lists,  Vector others)
    {
        this.recID = recID;
        this.empRecID = empRecID;
        this.rptDesc = rptDesc;
        this.rptType = rptType;
        this.lists = (Vector) lists.clone ();
        this.others = (Vector) others.clone ();
    }

    public void validate ()
    throws InvalidData
    {
        this.validate ((DODataRecord) this);
    }

    public static void validate (DODataRecord d)
    throws InvalidData
    {
        DORptTemplate i = (DORptTemplate) d;

        int s;
//        for (s = 0; s < i.lists.size (); s++)

    }

    public void vlear ()
    {
        recID = 0;
        empRecID = 0;
        rptDesc = "";
        rptType = "";
        lists = new Vector ();
        others = new Vector ();
    }
}
