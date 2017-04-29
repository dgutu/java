package com.proximo.inci.common.security;

import java.io.Serializable;

public class DOApplication
    implements Serializable, Cloneable
{
	private static final long serialVersionUID = 102L; // improves speed of serialization

    public String appName, appDesc;
    public boolean active;
    public long uid;

    public DOApplication (long uid, String appName, String appDesc, boolean active)
    {
        this.uid = uid;
        this.appName = appName;
        this.appDesc = appDesc;
        this.active = active;
    }

    public void validate ()
    throws ValidationError
    {
        validate (this);
    }

    public static void validate (DOApplication t)
    throws ValidationError
    {
        if (t.appName.length () > 30) throw new ValidationError ("Application name must be 20 characters or less.");
        if (t.appDesc.length () > 80) throw new ValidationError ("Application description must be 80 characters or less.");
    }

    public Object clone()
    {
        DOApplication r = new DOApplication (uid, appName, appDesc, active);
        return r;
    }

    public String toString ()
    {
        return new String ("DOApplication [" +
            "uid=" + uid + "," +
            "appName=" + appName + "," +
            "appDesc=" + appDesc + "," +
            "active=" + active + "]");
    }

}
