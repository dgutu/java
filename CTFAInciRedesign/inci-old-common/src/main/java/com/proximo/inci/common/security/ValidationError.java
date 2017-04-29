package com.proximo.inci.common.security;

import java.lang.*;

public class ValidationError
    extends Exception
{
	private static final long serialVersionUID = 102L; // improves speed of serialization

    private String msg;
    private long recID;

    public ValidationError ()
    {
        this ("", -1);
    }

    public ValidationError (String msg)
    {
        super (msg);
        recID = -1;
        this.msg = new String (msg);
    }

    public ValidationError (String msg, long recID)
    {
        super (msg);
        this.msg = new String (msg);
        this.recID = recID;
    }

    public long getRecID () { return recID; }

    public String toString ()
    {
        if (msg == null) return "Data not specified";
        if (msg == "") return "Data not specified";
        return msg;
    }

}
