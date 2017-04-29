package com.proximo.inci.common.exception;

public class ServiceNotFound
    extends Exception
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public ServiceNotFound ()
    {
        super ();
    }

    public ServiceNotFound (String message)
    {
        super (message);
    }
}
