package com.proximo.inci;

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.exception.InvalidData;

public class DOEmployeeExtended
    extends DODataRecord
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public String value;
    public long extRecID, empRecID;
	public String name;
    
    // constructors
    public DOEmployeeExtended ()
    {
        this (0, 0, "", "");
    }

    public DOEmployeeExtended (long empRecID, long extRecID, String value)
    {
		this(empRecID, extRecID, value, new String (""));
	}
	
    public DOEmployeeExtended (long empRecID, long extRecID, String value, String name)
    {
        this.extRecID = extRecID;
        this.empRecID = empRecID;
        this.value = value;
		this.name = name;
    }

    // toString override
    public String toString ()
    {
        return "EmployeeExtended[extRecID=" + extRecID + "," +
					"name=" + name + "," +
                    "empRecID=" + empRecID + "," +
                    "value=" + value + "]";
    }

    public void validate ()
    throws InvalidData
    {
        this.validate ((DODataRecord) this);
    }

    public static void validate (DODataRecord d)
    throws InvalidData
    {
        DOEmployeeExtended i = (DOEmployeeExtended) d;
    }

    public Object clone ()
    {
        return new DOEmployeeExtended (empRecID, extRecID, value, name);
    }
}
