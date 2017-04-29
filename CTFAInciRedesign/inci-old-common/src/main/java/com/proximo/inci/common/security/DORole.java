package com.proximo.inci.common.security;

import java.io.Serializable;

public class DORole
    implements Serializable, Cloneable
{
	private static final long serialVersionUID = 102L; // improves speed of serialization

    public String roleName, roleDesc;
    public long appUID; // WL 4/11/02: Now we need appUID to distinguish roles in different applications.
    public long uid;

    public DORole (long uid, String roleName, String roleDesc, long appUID)
    {
        this(uid, roleName, roleDesc);
        this.appUID = appUID;
    }
    
    public DORole (long uid, String roleName, String roleDesc)
    {
        this.uid = uid;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
    }

    public void validate ()
    throws ValidationError
    {
        validate (this);
    }

    public static void validate (DORole t)
    throws ValidationError
    {
        if (t.roleName.length () > 30) throw new ValidationError ("Role name must be 20 characters or less.");
        if (t.roleDesc.length () > 80) throw new ValidationError ("Role description must be 80 characters or less.");
    }

    public Object clone()
    {
        DORole r = new DORole (uid, roleName, roleDesc);
        r.appUID = this.appUID;
        return r;
    }

    public String toString ()
    {
        return new String ("DORole [" +
            "uid=" + uid + "," +
            "appUID=" + appUID + "," +
            "roleName=" + roleName + "," +
            "roleDesc=" + roleDesc + "]");
    }

}
