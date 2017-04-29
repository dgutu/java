package com.proximo.inci.common;


/*********************************************************************
**
**  Class:  DODataRecord
**  Author: DJR
**  Date:   12/19/97
**
**  Description:
**  This class does nothing.  It allows other classes to inherit
**  from it so that they may be used as part of the DOList
**  collection classes.
**
**  Change History (provide name, date, description)
**
**
*********************************************************************/

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.oreilly.servlet.Base64Encoder;
import com.proximo.inci.common.exception.InvalidData;

public class DODataRecord
    implements Serializable, Cloneable, Comparable, DOListInterface
{
	private static final long serialVersionUID = 102L; // improves speed of serialization

    public long recID;
    public String _displayListField;
	
	public void DODataRecord () 
	{ 
		recID = 0;
		_displayListField = new String ("Undefined Display");
	}
	
    public void validate ()
    throws InvalidData
    {}

	public String toString () 
	{
		return "DODataRecord[recID=" + recID + "]";
	}
	
    public static void validate (DODataRecord d)
    throws InvalidData
    {}

    // WL 10/28/98
    // will be overridden in children classes
    public boolean paste (DODataRecord d) {
        return false;
    }

	//************************************************************
	/**Can be called by a child class to validate a string vs. a length.
	 *
	 */
	protected static void validateString (String s, int length, String text) 
	throws InvalidData
	{
		validateString (s, length, text, true, false);
	}
	//************************************************************
	/**Can be called by a child class to validate a string vs. a length.
	 *
	 */
	protected static void validateString (String s, int length, String text, boolean required) 
	throws InvalidData
	{
		validateString (s, length, text, true, false);
	}
	//************************************************************
	/**Can be called by a child class to validate a string vs. a length.
	 *
	 */
	protected static void validateString (String s, int length, String text, boolean required, boolean nullable) 
	throws InvalidData
	{
        if (s.length () > length) throw new InvalidData ("The column " + text + " must be " + length + " characters or less.");
        if (!nullable) {
	        if (s.length () == 0 && required) throw new InvalidData ("The " + text + " must be entered.");
        }
	}
	
    // DR 3/30/98: must implement to clear fields
    // only DO classes for detail screens need to implement this
    // DR 1/21/02: set recID in this class
    public void clear () { recID = 0; }

    // WL 5/22/98: This method is needed in objects related to contract.
    public Object clone() {
        try {
            // DR 6/13/98: added recID to clone
            DODataRecord d = (DODataRecord) super.clone();
            d.recID = this.recID;
            return d;
        }
        catch (CloneNotSupportedException e) {
            //Debug.write("DODateRecord.clone(): " + e.toString());
            return null;
        }
    }

    public int compareTo(Object o) {
        if (o instanceof DODataRecord) {
            DODataRecord d = (DODataRecord)o;
            return new Long(this.recID).compareTo(new Long(d.recID));
        }
        else return -1;
    }

	/** Returns a string representing the serialized form of this class */    
    public String getSerializedString () 
    throws IOException
    {
	    ByteArrayOutputStream bo = new ByteArrayOutputStream ();
	    ObjectOutputStream oo = new ObjectOutputStream (bo);
	    oo.writeObject (this);
	    oo.flush();
    	String s = bo.toString ();
	    oo.close();
	    oo = null;
	    bo = null;
	    return s;
    }
    
	/** Utility method that can deserialize any serializable object from a serialized String.
	    The resulting object must be cast back into the original object type.
	*/    
    public static Object deserializeObject (String s) 
    throws IOException, ClassNotFoundException
    {
	    ByteArrayInputStream bi = new ByteArrayInputStream (s.getBytes ());
	    ObjectInputStream oi = new ObjectInputStream (bi);
	    Object o = oi.readObject ();
	    oi.close();
	    oi = null;
	    bi.close ();
	    bi = null;
	    return o;
    }
    
    public StringBuffer objectToXMLNode () 
    throws IOException
    {
    	StringBuffer b = new StringBuffer ();

    	String className = getClass ().getName ();
    	b.append ("<class>");
    	b.append (className);
    	b.append ("</class>");
    	className = null;

    	b.append ("<serial>");
	    b.append (Base64Encoder.encode (getSerializedString ()));
    	b.append ("</serial>");

		return b;    	
    }

    public StringBuffer objectToXML () 
    throws IOException
    {
    	StringBuffer b = new StringBuffer ("<?xml version=\"1.0\"?>");
    	b.append ("<DODataRecord>");
    	b.append (objectToXMLNode ());
    	b.append ("</DODataRecord>");
		return b;    	
    }
    
    //**********************************************************************
    /** Can be overridden by a child class if they want to have a different hidden ID
     *	returned via the DOListInterface interface, which is used by iSuite list and combo
     *  boxes to automatically add values.  By default, the recID is used.
     */
    public long getListID () { return recID; }

    //**********************************************************************
    /** Can be overridden by a child class if they want to have a different display value
     *	returned via the DOListInterface interface, which is used by iSuite list and combo
     *  boxes to automatically add values.  By default, a public field with the name "_displayListField"
     *  is used (this is defined in DODataRecord).
     */
    public String getListDisplay () { return _displayListField; }
    
}

