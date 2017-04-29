package com.proximo.inci;



import com.proximo.inci.common.DODataRecord;

public class DOLookup
    extends DODataRecord
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public int keyType;
    public String name;

    // constructors
    public DOLookup ()
    {
        this (0, new String (""));
    }

    public DOLookup (int keyType, String name)
    {
        this.keyType = keyType;
        this.name = name;
    }

    // toString override
    public String toString () { return "Key Type " + keyType +
            "[name=" + name + "]"; }

}
