package com.proximo.inci;


/*********************************************************************
**
**  Class:  DOLookupValue
**  Author: DJR
**  Date:   12/19/97
**
**  Description:
**  A data record of customer information.
**
**  Change History (provide name, date, description)
**
**
*********************************************************************/

import com.proximo.inci.common.DODataRecord;

public class DOLookupValue
    extends DODataRecord
{
	private static final long serialVersionUID = 101L; // improves speed of serialization

    // DR 4/14/98: added editType (is_system from lookup_values table)
    public static final int EDIT_HIDDEN = 0;
    public static final int EDIT_VIEW = 1;
    public static final int EDIT_UPDATE = 2;
    public static final int EDIT_FULL = 3;

    public int keyID, editType, keyType; // DR 5/27/98: added keyType
    public String keyValue;
    public boolean isDefault, isActive;
    public String keyDesc;
    public String category;
    public int catCode;
    
    // DR 5/11/98: added
    public int subKey;

    // constructors
    public DOLookupValue ()
    {
        this (0, EDIT_HIDDEN, new String (""), false, new String (""), 0, 0);
    }

    public DOLookupValue (int keyID, int editType, String keyValue, boolean isDefault, String keyDesc, int subKey)
    {
        this (keyID, editType, keyValue, isDefault, keyDesc, subKey, 0);
    }

    // this is the new full constructor, the other is kept for backward compatibility
    public DOLookupValue (int keyID, int editType, String keyValue, 
    				      boolean isDefault, String keyDesc, int subKey, 
    				      int keyType)
    {
    	this (keyID, editType, keyValue, isDefault, keyDesc, subKey, keyType, 0, "", true);
    }
    
    public DOLookupValue (int keyID, int editType, String keyValue, 
    				      boolean isDefault, String keyDesc, int subKey, 
    				      int keyType, String category)
    {
    	this (keyID, editType, keyValue, isDefault, keyDesc, subKey, keyType, 0, category, true);
    }
    
    public DOLookupValue (int keyID, int editType, String keyValue, 
    					  boolean isDefault, String keyDesc, int subKey, 
    					  int keyType, int catCode, String category, boolean isActive)
    {
        this.editType = editType;
        this.keyID = keyID;
        this.keyValue = keyValue;
        this.isDefault = isDefault;
        this.keyDesc = keyDesc;
        this.subKey = subKey;
        this.keyType = keyType;
        this.catCode = catCode;
        this.category = category;
		this.isActive = isActive;
    }

    // toString override
    public String toString () { return "Key Lookup ID " + keyID +
            "[value=" + keyValue +
            ",desc=" + keyDesc +
            ",default=" + isDefault + 
            ",active=" + isActive + 
            ",catCode=" + catCode +
            ",category=" + category + "]"; }

}
