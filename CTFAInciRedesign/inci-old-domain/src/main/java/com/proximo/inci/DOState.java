package com.proximo.inci;


/*********************************************************************
**
**  Class:  DOState
**  Author: DJR
**  Date:   2/4/98
**
**  Description:
**  A data record of customer information.
**
**  Change History (provide name, date, description)
**
**
*********************************************************************/

import com.proximo.inci.common.DODataRecord;

public class DOState
    extends DODataRecord
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public String code;
    public String name;

    // constructors
    public DOState ()
    {
        this ("", "");
    }

    public DOState (String code, String name)
    {
        this.code = code;
        this.name = name;
    }

    // toString override
    public String toString () { return "State " + name +
            "[code=" + code + "]"; 
    }

    public int compareTo(Object o) {
        if (o instanceof DOState) {
            DOState state = (DOState)o;
            return this.name.compareTo(state.name);
        }
        else return -1;
    }
}
