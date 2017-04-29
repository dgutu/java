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

public class DOCostCenter
    extends DODataRecord
{
	private static final long serialVersionUID = 101L; // improves speed of serialization

    public String code, name;
    public boolean delete;

    // constructors
    public DOCostCenter ()
    {
        this (0, new String (""), new String (""));
    }
    
    public DOCostCenter (long recID, String code, String name)
    {
        this.recID = recID;
        this.code = code;
        this.name = name;
    }
    
    /**
     * Constructor used in CostCenterMaintServlet and  CostCenterMaintPage
     * Sets record id, code, name.  Also sets delete to notify the object
     * should be deleted upon save.
     */
    
    public DOCostCenter(long recID, String code, String name, boolean delete){
        this.recID = recID;
        this.code = code;
        this.name = name;
        this.delete = delete;
    }

    // toString override
    public String toString () { return "Cost Center " + code; }

    public void validate ()
    throws InvalidData
    {
        this.validate ((DODataRecord) this);
    }

    public static void validate (DODataRecord d)
    throws InvalidData
    {
        DOCostCenter i = (DOCostCenter) d;

        if (i.code.length () > 20) throw new InvalidData ("The cost center code field must be 20 characters or less.");
        if (i.name.length () > 40) throw new InvalidData ("The cost center name field must be 40 characters or less.");
        if (i.code.length () == 0) throw new InvalidData ("The cost center code must be entered.");
        if (i.name.length () == 0) throw new InvalidData ("The cost center name must be entered.");
    }

    public void clear ()
    {
        this.recID = 0;
        this.code = "";
        this.name = "";
    }

}
