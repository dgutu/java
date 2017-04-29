package com.proximo.inci;

import java.util.Vector;

import com.proximo.inci.common.DODataRecord;

public class DOCategoryReports
extends DODataRecord
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public Vector openReports;
    public String reportName;
    public String reportClass;

    public DOCategoryReports (String reportName, String reportClass)
    {
        this.reportName = reportName;
        this.reportClass = reportClass;
        openReports = new Vector ();
    }

    public boolean equals (Object obj) {
        if (obj instanceof DOCategoryReports) {
            DOCategoryReports rpts = (DOCategoryReports)obj;
            if (rpts.reportName.equals(this.reportName) &&
                rpts.reportClass.equals(this.reportClass))
            {
                return true;
            }
        }
        return false;
    }
}
