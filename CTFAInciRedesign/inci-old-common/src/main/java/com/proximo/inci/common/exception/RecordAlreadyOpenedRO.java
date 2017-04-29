package com.proximo.inci.common.exception;




public class RecordAlreadyOpenedRO
    extends Exception
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public RecordAlreadyOpenedRO () {}

    public RecordAlreadyOpenedRO (String msg)
    {
        super (msg);
    }

}
