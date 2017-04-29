package com.proximo.inci.common.exception;




public class PasswordsDoNotMatch
    extends Exception
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public PasswordsDoNotMatch ()
    {
        super ();
    }

    public PasswordsDoNotMatch (String msg)
    {
        super (msg);
    }

}
