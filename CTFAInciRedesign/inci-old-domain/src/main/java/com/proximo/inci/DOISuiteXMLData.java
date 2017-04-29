package com.proximo.inci;

/*********************************************************************
**
**  Class:  DOISuiteXMLData
**  Author: DJR
**  Date:   6/30/02
**
**  Description:
**  Encapsulates a java exception.
**
**  Change History (provide name, date, description)
**
**
*********************************************************************/

import java.util.Vector;

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.exception.InvalidData;

public class DOISuiteXMLData
    extends DODataRecord
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    protected Vector data;
    private int current;

    // constructors
    public DOISuiteXMLData ()
    {
    	data = new Vector ();
    	current = -1;
    }

    // toString override
    public String toString () 
    { 
    	return "DOISuiteXMLData[" 
    				+ "size=" + data.size ()
    				+ "]";
	}

    public void removeAllData ()
    {
    	int size = data.size ();
    	for (int i = 0; i < size; i++) {
    		if (data.elementAt (i) instanceof DODataRecord) ((DODataRecord) data.elementAt (i)).clear ();
    		else ((DOList) data.elementAt (i)).removeAllElements ();
    	}
    	data.removeAllElements ();
    	data = null;
    	data = new Vector ();
    	current = -1;
    }

	public int getNumberElements () { return data.size (); }
	public int getCurrentElementIndex () { return current; }
	
	public boolean isCurrentData ()
	throws ArrayIndexOutOfBoundsException
	{
		return isCurrentDataAt (current);
	}
	
	public boolean isCurrentDataAt (int index)
	throws ArrayIndexOutOfBoundsException
	{
		validateIndex (current);
		if (data.elementAt (current) instanceof DODataRecord) return true;
		else return false;
	}

	public boolean isCurrentList ()
	throws ArrayIndexOutOfBoundsException
	{
		return isCurrentListAt (current);
	}
	
	public boolean isCurrentListAt (int index)
	throws ArrayIndexOutOfBoundsException
	{
		return !(isCurrentDataAt (index));
	}

	public void setStart () 
	{ 
		if (data.size () > 0) current = 0;
		else current = -1;
	}
	
	public void setEnd () 
	{ 
		if (data.size () > 0) current = data.size () - 1;
		else current = -1;
	}
	
	public Object getNextObject ()
	throws ArrayIndexOutOfBoundsException
	{
		current++;
		return getCurrentObject ();
	}
	
	public Object getCurrentObject () 
	throws ArrayIndexOutOfBoundsException
	{ 
		return getObjectAt (current);
	}

	public Object getObjectAt (int index) 
	throws ArrayIndexOutOfBoundsException
	{ 
		validateIndex (index);
		return data.elementAt (index);
	}

	public DODataRecord getCurrentData () 
	throws ArrayIndexOutOfBoundsException, InvalidData
	{ 
		return getDataAt (current);
	}

	public DODataRecord getDataAt (int index) 
	throws ArrayIndexOutOfBoundsException, InvalidData
	{ 
		validateIndex (index);
		if (!isCurrentDataAt (index)) throw new InvalidData ("Element at index " + index + " is a DOList");
		return (DODataRecord) data.elementAt (index);
	}

	public DOList getCurrentList () 
	throws ArrayIndexOutOfBoundsException, InvalidData
	{ 
		return getListAt (current);
	}

	public DOList getListAt (int index) 
	throws ArrayIndexOutOfBoundsException, InvalidData
	{ 
		validateIndex (index);
		if (!isCurrentListAt (index)) throw new InvalidData ("Element at index " + index + " is a DODataRecord");
		return (DOList) data.elementAt (index);
	}

	public void addObject (Object o)
	throws InvalidData
	{
		if (!(o instanceof DODataRecord || o instanceof DOList)) 
			throw new InvalidData ("Object added must be of type DODataRecord or DOList");
		data.addElement (o);
	}
	
	private void validateIndex (int i)
	throws ArrayIndexOutOfBoundsException
	{
		if (i >= data.size ()) throw new ArrayIndexOutOfBoundsException (i + " >= " + data.size ());
	}
	
    public Object clone ()
    {
        DOISuiteXMLData d = new DOISuiteXMLData ();
    	int size = data.size ();
    	for (int i = 0; i < size; i++) {
    		try {
	    		if (data.elementAt (i) instanceof DODataRecord) d.addObject (((DODataRecord) data.elementAt (i)).clone ());
    			else d.addObject (((DODataRecord) data.elementAt (i)).clone ());
    		} catch (InvalidData e) { } // can't happen
		}
		return d;        
    }
}
