package com.proximo.inci; 

/*********************************************************************
**
**  Class:  DOLicense
**  Author: DJR
**  Date:   1/11/98
**
**  Description:
**  A data record of license information.  
**
**  Change History (provide name, date, description)
**
**
*********************************************************************/

import java.sql.*;
import java.net.*;
import java.rmi.*;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

import com.proximo.inci.common.DODataRecord;

public class DOLicense
    extends DODataRecord
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public int numUsers;
    public String key;
    public int application;
    
    // constructors
    public DOLicense (int numUsers, int application, String key)
    {
        this.numUsers = numUsers;
        this.application = application;
        this.key = key;
    }
    
    // toString override
    public String toString () 
    { 
        return "License " + 
            "application = " + application + " " + 
            "key = " + key + " " + 
            "num users = " + numUsers;
    } 

}
