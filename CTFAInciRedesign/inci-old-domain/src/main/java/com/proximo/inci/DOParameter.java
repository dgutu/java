package com.proximo.inci;



import com.proximo.inci.common.DODataRecord;

public class DOParameter
    extends DODataRecord
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public int parm;
    public String value;

    // constructors
    public DOParameter ()
    {
        this (-1, "");
    }

    public DOParameter (int parm, String value)
    {
        this.parm = parm;
        this.value = value;
    }

    // toString override
    public String toString () { return "Parameter " + parm +
			"[value=" + value + "]"; }

}
