package com.proximo.inci;

import java.util.Date;

import com.proximo.inci.common.DODataRecord;

public class DOOpenReport
extends DODataRecord
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public static final int PENDING = 1;
    public static final int PROCESSING = 2;
    public static final int COMPLETED = 3;
    public static final int ERROR = 4;

    public final static int OUTPUT_CSV = 1;
    public final static int OUTPUT_HTML = 2;
    public final static int OUTPUT_EXCEL = 3;
    public final static int OUTPUT_WORD = 4;
    public final static int OUTPUT_RTF = 5;
    public final static int OUTPUT_ECHAIN = 6;
    public final static int OUTPUT_PDF = 7;

    public Date runDate, schedDate;
    public String userID, status, url, outDesc;
    public int rptType, statusCode, outType;
    public long rptID;
    public boolean hasGroup; // DR 6/10/00: show the group tree for a Proximo Report?
    public String rptDesc;
    
    public DOOpenReport (String userID, String status, String url,
                        Date runDate, Date schedDate, int rptType, int statusCode,
                        int outType, String outDesc, long rptID, boolean hasGroup)
    {
        this.userID = userID;
        this.status = status;
        this.url = url;
        this.rptType = rptType;
        this.runDate = runDate;
        this.schedDate = schedDate;
        this.statusCode = statusCode;
        this.outType = outType;
        this.outDesc = outDesc;
        this.rptID = rptID;
        this.hasGroup = hasGroup;
        this.rptDesc = "";
    }

    /**
    *   Second constructor for backward compatability.
    */
    public DOOpenReport (String userID, String status, String url,
                        Date runDate, Date schedDate, int rptType, int statusCode,
                        int outType, String outDesc, long rptID)
    {
        this(userID, status, url, runDate, schedDate, rptType, statusCode,
             outType, outDesc, rptID, false);
    }

    public boolean equals (Object obj) {
        if (obj instanceof DOOpenReport) {
            DOOpenReport rpt = (DOOpenReport)obj;
            if (rpt.rptID == this.rptID)
            {
                return true;
            }
        }
        return false;
    }
}
