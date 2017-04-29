package com.proximo.inci.common.security;

import java.util.*;
import java.io.Serializable;

public class MenuItemComparator 
    implements Comparator, Serializable
{
    public MenuItemComparator() {}

    public int compare(Object o1, Object o2) {
		int result = 0;
        if (!(o1 instanceof DOProxMenuItem) || !(o2 instanceof DOProxMenuItem)) 
            return -1;
        
        DOProxMenuItem obj1 = (DOProxMenuItem)o1;
        DOProxMenuItem obj2 = (DOProxMenuItem)o2;
        
        //System.out.println("MenuItemCommparator.compare(): obj1.menuID = " + obj1.menuID);
        //System.out.println("MenuItemCommparator.compare(): obj2.menuID = " + obj2.menuID);
        //System.out.println("MenuItemCommparator.compare(): obj1.parentMenuID = " + obj1.parentMenuID);
        //System.out.println("MenuItemCommparator.compare(): obj2.parentMenuID = " + obj2.parentMenuID);
        //System.out.println("MenuItemCommparator.compare(): obj1.menuSeq = " + obj1.menuSeq);
        //System.out.println("MenuItemCommparator.compare(): obj2.menuSeq = " + obj2.menuSeq);
        
        if (obj1.parentMenuID == obj2.parentMenuID) {
            if (obj1.menuSeq < obj2.menuSeq) return -1;
            else if (obj1.menuSeq > obj2.menuSeq) return 1;
            else return 0;
        }
        else {
            if (obj1.parentMenuID < obj2.parentMenuID) {
                return -1;
            }
            else return 1;
        }
    }
    
    public boolean equals(Object obj) {
        //System.out.println("MenuItemCommparator.equals(): obj = " + obj);
        if (!(obj instanceof DOProxMenuItem)) 
            return false;
        
        return compare(this, obj) == 0;
    }
}