package com.proximo.inci;


/*********************************************************************
**
**  Class:  DOCompany
**  Author: DJR
**  Date:   2/10/98
**
**  Description:
**  A data record of company information.
**
**  Change History (provide name, date, description)
**
**
*********************************************************************/

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

public class DOCompany
    extends DODataRecord
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public long recID, parentRecID;
    public String name, code;
    public boolean isPrimary, isActive;
    public DOCompanyAddress address;

    // constructors
    public DOCompany ()
    {
        this (0, 0, new String(""), new String(""), false, new DOCompanyAddress ());
    }

    public DOCompany (long recID, long parentRecID, String name, String code, boolean isPrimary, DOCompanyAddress address)
    {
	    this (recID, parentRecID, name, code, isPrimary, address, true);
    }

    public DOCompany (long recID, long parentRecID, String name, String code, boolean isPrimary, DOCompanyAddress address, boolean isActive)
    {
        this.recID = recID;
        this.parentRecID = parentRecID;
        this.name = new String(name);
        this.code = new String (code);
        this.isPrimary = isPrimary;
        this.address = (DOCompanyAddress) address.clone ();
        this.isActive = isActive;
    }

    public DOCompany (long recID, long parentRecID, String name, String code,
                      boolean isPrimary, long addressRecID, String addrLine1,
                      String addrLine2, String addrLine3, String addrLine4,
                      String addrLine5, String city, String state,
                      String country, String postalCode, String phone,
                      String fax)
    {
        this.recID = recID;
        this.parentRecID = parentRecID;
        this.name = new String(name);
        this.code = new String (code);
        this.isPrimary = isPrimary;
        this.isActive = true;
        this.address = new DOCompanyAddress (addressRecID, addrLine1, addrLine2, addrLine3, addrLine4,
                      addrLine5, city, state, country, postalCode, phone, fax);
    }

    public DOCompany (long recID, long parentRecID, String name, String code,
                      boolean isPrimary, long addressRecID, String addrLine1,
                      String addrLine2, String addrLine3, String addrLine4,
                      String addrLine5, String city, String state,
                      String country, String postalCode, String phone,
                      String fax, boolean isActive)
    {
        this.recID = recID;
        this.parentRecID = parentRecID;
        this.name = new String(name);
        this.code = new String (code);
        this.isPrimary = isPrimary;
        this.isActive = isActive;
        this.address = new DOCompanyAddress (addressRecID, addrLine1, addrLine2, addrLine3, addrLine4,
                      addrLine5, city, state, country, postalCode, phone, fax);
    }

    // toString override
    public String toString () { return "DOCompany " + name; }

    public void validate ()
    throws InvalidData
    {
        this.validate ((DODataRecord) this);
    }

    public static void validate (DODataRecord d)
    throws InvalidData
    {
        DOCompany c = (DOCompany) d;

        if (c.name.equals ("")) throw new InvalidData ("Company name is required.");
        if (c.code.equals ("")) throw new InvalidData ("Company code is required.");

        if (c.name.length () > 60) throw new InvalidData ("The company name field must be 60 characters or less.");
        if (c.name.length () == 0) throw new InvalidData ("The company name must be entered.");

        if (c.code.length () > 20) throw new InvalidData ("The company code field must be 20 characters or less.");
        if (c.code.length () == 0) throw new InvalidData ("The company code must be entered.");

        c.address.validate ();
    }

    public void clear ()
    {
        this.recID = 0;
        this.parentRecID = 0;
        this.name = new String("");
        this.code = new String ("");
        this.isPrimary = false;
        this.address = null;
        this.address = new DOCompanyAddress ();
        this.isActive = true;
    }

    public Object clone ()
    {
        return new DOCompany (recID, parentRecID, name, code, isPrimary, address, isActive);
    }
}
