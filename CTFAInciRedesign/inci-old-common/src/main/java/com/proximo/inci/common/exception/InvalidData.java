package com.proximo.inci.common.exception;


public class InvalidData
    extends Exception
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    private String msg;
    private long recID;

    public InvalidData ()
    {
        this ("", -1);
    }

    public InvalidData (String msg)
    {
        super (msg);
        recID = -1;
        this.msg = new String (msg);
    }

    public InvalidData (String msg, long recID)
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
