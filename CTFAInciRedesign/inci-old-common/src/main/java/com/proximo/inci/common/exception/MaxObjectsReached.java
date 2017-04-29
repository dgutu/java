package com.proximo.inci.common.exception;


public class MaxObjectsReached
    extends Exception
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public MaxObjectsReached ()
    {
        super ();
    }

    public MaxObjectsReached (String msg)
    {
        super (msg);
    }

}
