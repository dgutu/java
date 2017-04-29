package com.proximo.inci.common.exception;



public class DuplicateKeyError
    extends Exception
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    protected static String defaultMsg =
        new String("You tried to save data that already exists.  " +
                   "Please check and try again.");

    public DuplicateKeyError ()
    {
        super (defaultMsg);
    }

    public DuplicateKeyError (String msg)
    {
        super (msg);
    }

}
