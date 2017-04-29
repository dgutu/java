/** Copyright 1997 to present by Proximo Consulting Services, Inc
The copyright to the computer program(s) herein is the property of 
Proximo Consulting Services, Inc.  The program(s) may be used and/or
copied only with the written permission of Proximo Consulting Services, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.common.security;

import java.io.Serializable;

/*
DR 12/21/99: added a DOSecurityPrivs, which defaults to null
When this class represents a token for an app, privs will remain null.
When it is used to represent the instance of a token for a group, it will be
initialized and set.  I have also changed the class so that the mask will
behave the same way.
*/

public class DOToken
    implements Serializable, Cloneable
{
	private static final long serialVersionUID = 102L; // improves speed of serialization

    public static final String TTYPE_FIELD = "FIELD";
    public static final String TTYPE_FUNCTION = "FUNCTION";
    public static final String TTYPE_METHOD = "METHOD";

    public String type, name, description, mask;
    public long uid;
    public DOSecurityPrivs privs;
    // PP 12/30/99
    public boolean dirty;
    //PP 05/10/00
    public String menuText, menuURL;

    public DOToken (long uid, String type, String name, String description)
    {
        this (uid, type, name, description, null, null);
    }

    public DOToken (long uid, String type, String name, String description, String mask)
    {
        this (uid, type, name, description, mask, null);
    }

    public DOToken (long uid, String type, String name, String description,
                    String mask, DOSecurityPrivs privs)
    {
        this (uid, type, name, description, mask, privs, false, "", "");
    }

    public DOToken (long uid, String type, String name, String description,
                    String mask, DOSecurityPrivs privs, boolean dirty,
                    String menuText, String menuURL)
    {
        this.uid = uid;
        this.type = type;
        this.name = name;
        this.description = description;
        this.mask = mask;
        if (privs == null) this.privs = null;
        else this.privs = (DOSecurityPrivs) privs.clone ();
        this.dirty = dirty;
        this.menuText = menuText;
        this.menuURL = menuURL;
    }

    public void validate ()
    throws ValidationError
    {
        validate (this);
    }

    public static void validate (DOToken t)
    throws ValidationError
    {
        if (!t.type.equals (TTYPE_FIELD) && !t.type.equals (TTYPE_FUNCTION))
            throw new ValidationError ("Invalid token type.");

        if (t.name.length () > 30) throw new ValidationError ("Token name must be 20 characters or less.");
        if (t.description.length () > 80) throw new ValidationError ("Token description must be 80 characters or less.");
        if (t.mask.length () > 5) throw new ValidationError ("Token mask must be 5 characters or less.");

        for (int i = 0; i < t.mask.length (); i++)
            if (t.mask.charAt (i) != 'Y' && t.mask.charAt (i) != 'N')
                throw new ValidationError ("Token mask can only contain the characters 'Y' or 'N'.");
    }

    public Object clone ()
    {
        DOToken t = new DOToken (uid, type, name, description, mask, privs, dirty, menuText, menuURL);
        return t;
    }

    public String toString ()
    {
        StringBuffer s = new StringBuffer ("DOToken [" +
            "uid=" + uid + "," +
            "type=" + type + "," +
            "name=" + name + "," +
            "mask=");

        if (mask != null) s.append (mask);
        s.append ("]");

        return s.toString ();
    }
}
