package com.proximo.inci.common.exception;




public class LicenseExceeded
    extends Exception
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public LicenseExceeded ()
    {
        super ();
    }

    public LicenseExceeded (String msg)
    {
        super (msg);
    }

}
