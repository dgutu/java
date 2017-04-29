package com.proximo.inci;




public class DOListForFunc
    extends DOList
{
	private static final long serialVersionUID = 100L; // improves speed of serialization


	public boolean readOnly;

	public DOListForFunc ()
	{
		this (false);
	}
	public DOListForFunc (boolean readOnly)
	{
		super ();
		this.readOnly = readOnly;
	}

	// DR 6/13/98
	public Object clone ()
	{
	    DOListForFunc f = (DOListForFunc) super.clone ();
	    f.readOnly = this.readOnly;
	    return f;
	}
}
