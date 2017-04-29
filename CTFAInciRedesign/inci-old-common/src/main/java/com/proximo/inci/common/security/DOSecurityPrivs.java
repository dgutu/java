package com.proximo.inci.common.security;

import java.io.Serializable;

// DR 8/17/00: added token
public class DOSecurityPrivs
    implements Serializable, Cloneable
{
	private static final long serialVersionUID = 102L; // improves speed of serialization

    public String token;
    public boolean access, view, update, delete, add;

    public DOSecurityPrivs (boolean access, boolean view, boolean add, boolean update, boolean delete)
    {
        this (null, access, view, add, update, delete);
    }

    public DOSecurityPrivs (String token, boolean access, boolean view, boolean add, boolean update, boolean delete)
    {
        this.token = token;
        this.access = access;
        this.view = view;
        this.update = update;
        this.delete = delete;
        this.add = add;
    }

    public void validate ()
    throws ValidationError
    {
        validate (this);
    }

    public static void validate (DOSecurityPrivs p)
    throws ValidationError
    {
    }

    public Object clone ()
    {
        DOSecurityPrivs p = new DOSecurityPrivs (token, access, view, add, update, delete);
        return p;
    }

    public String toString ()
    {
        return new String ("DOSecurityPrivs [" +
            (token == null ? "" : "token=" + token + ",") +
            "access=" + access + "," +
            "view=" + view + "," +
            "add=" + add + "," +
            "update=" + update + "," +
            "delete=" + delete + "]");
    }

}
