package com.proximo.inci;



import com.proximo.inci.common.DODataRecord;
import java.sql.*;
import java.net.*;
import java.rmi.*;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class DOUserData
extends DODataRecord
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public DOShortEmployee emp;
    public String origUserID;
    public Vector role;
    public boolean dirty = false;

    public DOUserData (DOShortEmployee emp)
    {
        this.emp = emp;
        this.origUserID = emp.userID;
        this.role = new Vector ();
        this.dirty = false;
    }
}
