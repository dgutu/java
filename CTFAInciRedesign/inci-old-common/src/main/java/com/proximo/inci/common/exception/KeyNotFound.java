package com.proximo.inci.common.exception;

public class KeyNotFound
    extends Exception
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

	private String key;

    public KeyNotFound ()
    {
    	this (null);
    }

    public KeyNotFound (String key)
    {
        super ("Could not find key " + ((key == null) ? "[undefined]" : key));
    	this.key = key;
    }

	public String getKey () { return key; }
	
}
