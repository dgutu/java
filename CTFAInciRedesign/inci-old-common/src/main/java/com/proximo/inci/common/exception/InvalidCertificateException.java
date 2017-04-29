package com.proximo.inci.common.exception;


public class InvalidCertificateException
    extends Exception
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public InvalidCertificateException ()
    {
        super ();
    }

    public InvalidCertificateException (String msg)
    {
        super (msg);
    }

}
