package com.proximo.inci;


import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.exception.InvalidData;

public class DODepartment
    extends DODataRecord
{
	private static final long serialVersionUID = 101L; // improves speed of serialization

    public String name;
    public DOCostCenter center;
    public boolean isSystem, calendar, prevCalendar, delete;

    // DR 10/18/98: standardized department names
    public static final String DEPT_ENGINEERING = "Engineering";
    public static final String DEPT_CONTRACTS = "Contracts";
    public static final String DEPT_PURCHASING = "Purchasing";

    // constructors
    public DODepartment ()
    {
        this (0, "", new DOCostCenter (), false);
        delete = false;
    }

    public DODepartment (long recID, String name, DOCostCenter center)
    {
        this (recID, name, center, false);
        delete = false;
    }

    public DODepartment (long recID, String name, DOCostCenter center, boolean isSystem)
    {
        this (recID, name, center, isSystem, false);
        delete = false;
    }

    public DODepartment (long recID, String name, DOCostCenter center, boolean isSystem, boolean calendar)
    {
        this.recID = recID;
        this.name = name;
        this.center = center;
        this.isSystem = isSystem;
        this.calendar = calendar;
        this.prevCalendar = calendar;
        delete = false;
    }

    private DODepartment (long recID, String name, DOCostCenter center, boolean isSystem, boolean calendar,
                            boolean prevCalendar)
    {
        this.recID = recID;
        this.name = name;
        this.center = center;
        this.isSystem = isSystem;
        this.calendar = calendar;
        this.prevCalendar = prevCalendar;
        delete = false;
    }
    
    public DODepartment (long recID, String name, DOCostCenter center, boolean isSystem, boolean calendar,
                            boolean prevCalendar, boolean delete)
    {
        this.recID = recID;
        this.name = name;
        this.center = center;
        this.isSystem = isSystem;
        this.calendar = calendar;
        this.prevCalendar = prevCalendar;
        this.delete = delete;
    }

    // toString override
    public String toString () { return "Department " + name; }

    public void validate ()
    throws InvalidData
    {
        this.validate ((DODataRecord) this);
    }

    public static void validate (DODataRecord d)
    throws InvalidData
    {
        DODepartment i = (DODepartment) d;

        if (i.name.length () > 60) throw new InvalidData ("The department name field must be 40 characters or less.");
        if (i.name.length () == 0) throw new InvalidData ("The department name must be entered.");
    }

    public void clear ()
    {
        this.recID = 0;
    	this.name = "";
        this.center.recID = 0;
        this.center.code = "";
        this.center.name = "";
        this.isSystem = false;
        this.calendar = false;
        this.prevCalendar = false;
    }

    public Object clone ()
    {
        return new DODepartment (recID, name, center, isSystem, calendar, prevCalendar);
    }
}
