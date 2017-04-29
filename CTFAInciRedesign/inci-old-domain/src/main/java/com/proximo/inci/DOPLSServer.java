package com.proximo.inci;

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.exception.InvalidData;

public class DOPLSServer extends DODataRecord
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public String name, server;
    public int port;

    public DOPLSServer ()
    {
        this (null, null, 0);
    }

    public DOPLSServer (String name, String server, int port)
    {
        super ();
        this.name = name;
        this.server = server;
        this.port = port;
    }

    public void validate ()
    throws InvalidData
    {
        this.validate ((DODataRecord) this);
    }

    public static void validate (DODataRecord d)
    throws InvalidData
    {
    }

    public void clear ()
    {
        this.name = new String ();
        this.server = new String ();
        this.port = 0;
    }

    public Object clone ()
    {
        DOPLSServer p = (DOPLSServer) super.clone ();
        p.name = new String (name);
        p.server = new String (server);
        p.port = port;
        return p;
    }
}
