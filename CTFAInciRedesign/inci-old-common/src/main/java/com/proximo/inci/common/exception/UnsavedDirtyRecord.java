package com.proximo.inci.common.exception;




public class UnsavedDirtyRecord
    extends Exception
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public UnsavedDirtyRecord ()
    {
        this ("");
    }

    public UnsavedDirtyRecord (String msg)
    {
        super (msg);
    }

}
