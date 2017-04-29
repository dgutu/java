package com.proximo.inci.common.exception;




public class ClientAppRunning
    extends Exception
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public ClientAppRunning ()
    {
        super ();
    }

    public ClientAppRunning (String msg)
    {
        super (msg);
    }

}
