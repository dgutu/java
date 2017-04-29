package com.proximo.inci;



import java.util.Vector;

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.security.DORole;

public class DORoleData
extends DODataRecord
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public DORole role;
    public Vector token;
    public boolean deleted = false;

    public DORoleData (DORole role)
    {
        this.role = role;
        token = new Vector ();
        deleted = false;
    }
}
