package com.proximo.inci.common.exception;



public class RecordReadOnly
    extends Exception
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    protected String message;

    public RecordReadOnly ()
    {
        this ("You have this record opened as read-only. You cannot make any changes.");
    }

    public RecordReadOnly (String msg)
    {
        super (msg);
        message = new String (msg);
    }

    public String toString () { return message; }
}
