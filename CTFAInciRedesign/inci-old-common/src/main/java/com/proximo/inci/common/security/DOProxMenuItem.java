package com.proximo.inci.common.security;

import java.util.Vector;
import java.io.Serializable;

/*
DR 12/21/99: added a DOSecurityPrivs, which defaults to null
When this class represents a token for an app, privs will remain null.
When it is used to represent the instance of a token for a group, it will be
initialized and set.  I have also changed the class so that the mask will
behave the same way.
*/

public class DOProxMenuItem
    implements Serializable, Cloneable
{
	private static final long serialVersionUID = 102L; // improves speed of serialization

    public long menuID;
    public long tokenID;
    public long parentMenuID;
    public int menuSeq;
    public String tokenType;
    public String tokenName;
    public String menuText;
    public String menuURL;
    public boolean isHeader;
    
    public DOSecurityPrivs privs;
    public Vector subMenus;
    
    public DOProxMenuItem()
    {
        clear();
    }

    public void clear() {
        menuID = 0;
        tokenID = 0;
        parentMenuID = 0;
        menuSeq = 0;
        tokenType = "";
        tokenName = "";
        menuText = "";
        menuURL = "";
        isHeader = false;
    
        privs = new DOSecurityPrivs("", false, false, false, false, false);
        subMenus = new Vector();
    }
    
    public void addSubMenu(DOProxMenuItem mi) {
        subMenus.addElement(mi);
    }

    public Object clone() {
        DOProxMenuItem t = new DOProxMenuItem();
        
        t.menuID = this.menuID;
        t.tokenID = this.tokenID;
        t.parentMenuID = this.parentMenuID;
        t.menuSeq = this.menuSeq;
        t.tokenType = this.tokenType;
        t.tokenName = this.tokenName;
        t.menuText = this.menuText;
        t.menuURL = this.menuURL;
        t.isHeader = this.isHeader;
    
        t.privs = (DOSecurityPrivs)this.privs.clone();
        t.subMenus = (Vector)this.subMenus.clone();

        return t;
    }

    public String toString() {
        return "DOProxMenuItem[menuID = " + menuID + ",\n" +
               "           tokenID =" + tokenID + ",\n" +
               "           parentMenuID =" + parentMenuID + ",\n" +
               "           menuSeq =" + menuSeq + ",\n" +
               "           tokenType =" + tokenType + ",\n" +
               "           tokenName =" + tokenName + ",\n" +
               "           menuText =" + menuText + ",\n" +
               "           menuURL =" + menuURL + ",\n" +
               "           isHeader =" + isHeader + ",\n" +
               "           privs =" + privs + ",\n" + 
               "           subMenus.size() = " + subMenus.size() + "]\n";
    }
}
