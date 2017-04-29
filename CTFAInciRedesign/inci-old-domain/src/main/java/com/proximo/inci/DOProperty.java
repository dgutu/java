package com.proximo.inci;

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.exception.InvalidData;

public class DOProperty extends DODataRecord
{
	private static final long serialVersionUID = 101L; // improves speed of serialization

    public String name, value;

    public DOProperty ()
    {
        super();
    }

    public DOProperty (String name, String value)
    {
        this.name = name;
        this.value = value;
        this.recID = 0;
    }

    public void validate ()
    throws InvalidData
    {
        this.validate ((DODataRecord) this);
    }

    public static void validate (DODataRecord d)
    throws InvalidData
    {
        DOProperty i = (DOProperty) d;

        if (i.name == null) throw new InvalidData ("The name cannot be null!");
        if (i.value == null) throw new InvalidData ("The value cannot be null!");

        if (i.name.length() == 0) throw new InvalidData ("The name must be at least one character.");
        if (i.value.length() == 0) throw new InvalidData ("The value must be at least one character.");

        if (i.name.length() > 20) throw new InvalidData ("The name must be less than or 20 characters.");
        if (i.value.length() > 120) throw new InvalidData ("The value must be less than or 120 characters.");
    }

    public void clear ()
    {
        recID = 0;
        name = new String();
        value = new String();
    }

    public Object clone ()
    {
        DOProperty p = (DOProperty) super.clone ();
        p.name = new String (name);
        p.value = new String (value);
        return p;
    }
	
	public String toString () 
	{
		return "DOProperty [name=" + name + 
			   ",value=" + value + "]";
	}
	
}
