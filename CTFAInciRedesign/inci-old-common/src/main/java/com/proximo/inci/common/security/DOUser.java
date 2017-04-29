package com.proximo.inci.common.security;

import java.util.Date;
import java.io.Serializable;

public class DOUser
    implements Serializable, Cloneable
{
	private static final long serialVersionUID = 103L; // improves speed of serialization

	// DR 1/10/03: note: we have an id3 in the database, but it is strictly used by one client (for now) for 
	// something specific.  The app server ignores this nullable column completely.
    public String last, first, title, id1, id2, password, notes, loginID;
    public long uid;
    public Date active, inactive;

    public DOUser ()
    {
    	this (0, new String (), new String (), new String (), new String (), new String (), 
    			new String (), new String (), new String (), null, null);
    }
    
    public DOUser (long uid, String last, String first, String title, String id1, String id2,
                    String loginID, String password, String notes, Date active, Date inactive)
    {
        this.uid = uid;
        this.last = last;
        this.first = first;
        this.title = title;
        this.id1 = id1;
        this.id2 = id2;
        this.password = password;
        this.loginID = loginID;
        this.notes = notes;
        this.active = active;
        this.inactive = inactive;
    }

    public void validate ()
    throws ValidationError
    {
        validate (this);
    }

    public static void validate (DOUser t)
    throws ValidationError
    {
        if (t.last.length () > 30) throw new ValidationError ("User last name must be 30 characters or less.");
        if (t.first.length () > 30) throw new ValidationError ("User first name must be 30 characters or less.");
        if (t.title.length () > 30) throw new ValidationError ("User title must be 30 characters or less.");
        if (t.id1.length () > 30) throw new ValidationError ("User client ID 1 must be 30 characters or less.");
        if (t.id2.length () > 30) throw new ValidationError ("User client ID 2 must be 30 characters or less.");
        if (t.loginID.length () > 12) throw new ValidationError ("User login ID must be 12 characters or less.");
        if (t.password.length () > 12) throw new ValidationError ("User password must be 12 characters or less.");
        if (t.notes.length () > 255) throw new ValidationError ("User notes must be 255 characters or less.");
    }

    public Object clone()
    {
        DOUser r = new DOUser (uid, last, first, title, id1, id2,
                    loginID, password, notes, active, inactive);
        return r;
    }

    public String toString ()
    {
        return new String ("DOUser [" +
            "uid=" + uid + "," +
            "last=" + last + "," +
            "first=" + first + "," +
            "loginID=" + loginID + "]");
    }

}
