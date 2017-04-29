package com.proximo.inci.common.exception;




public class NoServerFound
    extends Exception
{
	private static final long serialVersionUID = 101L; // improves speed of serialization

	public String message;
	
    public NoServerFound ()
    {
        this ("A server could not be found for you to connect to.  " +
                "There may be a problem with the network or the server(s).  " +
                "Please try again in a little while.  If the problem persists, contact support.");
    }

    public NoServerFound (String message)
    {
        super ();
		this.message = message;
    }
	
	public String getMessage () { return message; }
	
	public String toString () { return getMessage (); }

}
