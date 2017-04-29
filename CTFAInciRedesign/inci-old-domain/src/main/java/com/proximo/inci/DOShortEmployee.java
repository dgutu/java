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

public class DOShortEmployee
    extends DODataRecord
{
	private static final long serialVersionUID = 103L; // improves speed of serialization

	public static final int EMPTYPE_EMPLOYEE = 1;
	public static final int EMPTYPE_CONTRACTOR = 2;
	public static final int EMPTYPE_1099 = 3;
	
    public long recID, companyRecID;
    public String ssn, userID, first, last, passwd, prevUserID, prevPasswd, email, company, middle;
    public boolean isActive;
    public float billRate;

    // constructors
    public DOShortEmployee ()
    {
        this (0, "", "", "", "", "", "", "", "", true, "", 0, "");
    }

    public DOShortEmployee (long recID, String ssn, String userID, String first, String last,
            boolean isActive)
	{
        this (recID, ssn, userID, first, last, "", "", userID, "", isActive);
	}

    public DOShortEmployee (long recID, String ssn, String userID, String first, String last,
            String email, boolean isActive)
	{
        this (recID, ssn, userID, first, last, "", "", userID, email, isActive);
	}

    public DOShortEmployee (long recID, String ssn, String userID, String first,
                            String last, String passwd, String prevPasswd,
                            String prevUserID, boolean isActive)
    {
        this (recID, ssn, userID, first, last, passwd, prevPasswd, prevUserID, "", isActive);
    }

    public DOShortEmployee (long recID, String ssn, String userID, String first,
                            String last, String passwd, String prevPasswd,
                            String prevUserID, String email, boolean isActive)
    {
        this (recID, ssn, userID, first, last, passwd, prevPasswd, prevUserID, email, isActive, "", 0);
    }

    public DOShortEmployee (long recID, String ssn, String userID, String first,
                            String last, String passwd, String prevPasswd,
                            String prevUserID, String email, boolean isActive, String company, long companyRecID)
    {
    	this (recID, ssn, userID, first, last, passwd, prevPasswd, prevUserID, email, isActive, company, companyRecID, "");
    }
    
    public DOShortEmployee (long recID, String ssn, String userID, String first,
                            String last, String passwd, String prevPasswd,
                            String prevUserID, String email, boolean isActive, String company, long companyRecID,
                            String middle)
    {
        this.recID = recID;
        this.userID = userID;
        this.ssn = ssn;
        this.first = first;
        this.last = last;
        this.passwd = passwd;
        this.prevPasswd = prevPasswd;
        this.email = email;
        this.prevUserID = prevUserID;
    	this.isActive = isActive;
    	this.company = company;
    	this.companyRecID = companyRecID;
        this.billRate = 0.f;
        this.middle = middle;
    }

    // toString override
    public String toString () { return "Short Employee " + userID; }

    public void validate ()
    throws InvalidData
    {
        this.validate ((DODataRecord) this);
    }

    public static void validate (DODataRecord d)
    throws InvalidData
    {
        DOShortEmployee i = (DOShortEmployee) d;
    	if (i.userID.length () > 20) throw new InvalidData ("The user ID field must be 20 characters or less.");
    	if (i.email.length () > 254) throw new InvalidData ("The E-Mail field must be 254 characters or less.");
    }

    public Object clone ()
    {
        DOShortEmployee e = new DOShortEmployee (recID, ssn, userID, first, last, passwd,
                                    prevPasswd, prevUserID, email, isActive, company, companyRecID, middle);
        e.billRate = billRate;
        return e;
    }

    public String format () { return format (last, first, middle); }
    public static String format (String last, String first)
    {
    	return format (last, first, "");
    }
    public static String format (String last, String first, String middle)
    {
        String name = last;
        if (!first.equals ("")) name = name + ", " + first;
        if (!middle.equals ("")) name = name + " " + middle;
        return name;
    }

    public String formatFirstLast () { return format (first, last, middle); }
    public static String formatFirstLast (String first, String last)
    {
    	return format (first, last, "");
    }
    public static String formatFirstLast (String first, String last, String middle)
    {
        String name = last;
        if (!middle.equals ("")) first = first + " " + middle;
        if (!first.equals ("")) name = first + " " + last;
        return name;
    }
}
