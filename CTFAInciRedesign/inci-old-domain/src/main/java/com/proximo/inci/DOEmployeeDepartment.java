package com.proximo.inci;

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.exception.InvalidData;
import java.sql.*;
import java.net.*;
import java.rmi.*;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class DOEmployeeDepartment
    extends DODataRecord
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public String name;
    public long empRecID;
    public boolean isManager;

    // constructors
    public DOEmployeeDepartment ()
    {
        this (0, 0, "", false);
    }

    public DOEmployeeDepartment (long recID, long empRecID, String name)
    {
        this (recID, empRecID, name, false);
    }

    public DOEmployeeDepartment (long recID, long empRecID, boolean isManager)
    {
        this (recID, empRecID, "", isManager);
    }

    public DOEmployeeDepartment (long recID, long empRecID, String name, boolean isManager)
    {
        this.recID = recID;
        this.empRecID = empRecID;
        this.name = name;
        this.isManager = isManager;
    }

    // toString override
    public String toString ()
    {
        return "EmployeeDepartment[deptRecID=" + recID + "," +
                    "empRecID=" + empRecID + "," +
                    "isManager=" + isManager + "]";
    }

    public void validate ()
    throws InvalidData
    {
        this.validate ((DODataRecord) this);
    }

    public static void validate (DODataRecord d)
    throws InvalidData
    {
        DOEmployeeDepartment i = (DOEmployeeDepartment) d;
    }

    public Object clone ()
    {
        return new DOEmployeeDepartment (recID, empRecID, name, isManager);
    }
}
