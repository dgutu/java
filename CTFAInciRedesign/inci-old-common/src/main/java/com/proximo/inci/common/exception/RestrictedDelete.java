package com.proximo.inci.common.exception;



public class RestrictedDelete
    extends Exception
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    protected static String defaultMsg =
        new String("Can't delete due to the foreign key constrains.");

    private String msg;

    public RestrictedDelete ()
    {
        this (defaultMsg);
    }

    public RestrictedDelete (String msg)
    {
        super (msg);
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }
}
