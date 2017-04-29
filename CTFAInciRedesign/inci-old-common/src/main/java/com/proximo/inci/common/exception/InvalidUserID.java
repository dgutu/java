package com.proximo.inci.common.exception;




public class InvalidUserID
    extends Exception
{
	private static final long serialVersionUID = 101L; // improves speed of serialization

    private String msg;

    public InvalidUserID ()
    {
        this (new String ("Invalid Attempt to Login!\n\n" +
                   "Please use the correct user ID and password " +
                   "and try to login again."));
    }

    public InvalidUserID (String msg)
    {
        super (msg);
        this.msg = new String (msg);
    }

	public String toString () 
	{
        if (msg == null) {
			//Debug.write ("msg is null");
        	return super.toString ();
        } else if (msg.equals ("")) {
			//Debug.write ("msg is empty string");
        	return super.toString ();
        } else {
			//Debug.write ("msg = " + msg);
        	return msg;
       	}
	}
	
}


