package com.proximo.inci;


/*********************************************************************
**
**  Class:  DOList
**  Author: DJR
**  Date:   12/19/97
**
**  Description:
**  The base Templar data collection class.  Allows DO* data objects
**  to be collected in a vector and passed between (remote) objects.
**  Specialized collection classes inherit from DOList.
**
**  Change History (provide name, date, description)
**
**
*********************************************************************/

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;

import com.oreilly.servlet.Base64Encoder;
import com.proximo.inci.common.DODataRecord;

public class DOList
    implements Serializable, Cloneable
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    private Vector v;
    private int lastElement;
    private boolean containsAll;

    public DOList ()
    {
        v = new Vector ();
        lastElement = -1;
        containsAll = true;
    }

    // DR 3/11/00: copy a vector
    public DOList (Vector vtc)
    throws Exception
    {
        v = null;
        copyVectorInto (vtc);
        containsAll = true;
    }

    // DR 3/11//00: copy the contents of a vector into the DOList
    public void copyVectorInto (Vector vtc)
    throws Exception
    {
        if (v != null) v.removeAllElements ();
        v = null;
        v = new Vector ();

        for (int i = 0; i < vtc.size (); i++) {
            Object o = vtc.elementAt (i);
            //Debug.write ("i = " + i + ", o = " + o);
            if (!(o instanceof DODataRecord)) throw new Exception ("Vector can only contain DODataRecord elements.");
            v.addElement (o);
        }

        lastElement = -1;
    }

    // DR 3/11/00: copy DOList to a Vector
    public Vector toVector ()
    {
        return (Vector) v.clone ();
    }

    public synchronized void addElement (DODataRecord r)
    {
        v.addElement ((Object) r);
        lastElement = v.size () - 1;
    }

    public DODataRecord elementAt (int i)
    {
        lastElement = i;
        return (DODataRecord) v.elementAt (i);
    }

    public int size () { return v.size (); }

    public void removeElementAt (int i)
    {
        if (lastElement == i) lastElement = -1;
        v.removeElementAt (i);
    }

    public void removeAllElements ()
    {
        lastElement = -1;
        v.removeAllElements ();
    }

    public boolean isEmpty () { return v.isEmpty (); }

    public String toString () { return "DOList: " + v; }

    public void insertElementAt (DODataRecord r, int index)
    {
        lastElement = index;
        v.insertElementAt ((Object) r, index);
    }

    // WL 3/6/98
    public void setElementAt (DODataRecord r, int index)
    {
        lastElement = index;
        v.setElementAt ((Object) r, index);
    }

    // WL 6/3/98
    public DODataRecord getElementOnID (long recID)
    {
        DODataRecord d = null;

        // DR 6/13/98: make this quick check of the current element
        if (lastElement != -1) {
            d = (DODataRecord) this.elementAt(lastElement);
            if (d.recID != recID) d = null;
        }

        if (d == null) {
            for (int i = 0; i < this.size(); i++) {
                d = (DODataRecord) this.elementAt(i);
                if (d.recID == recID) {
                    lastElement = i;
                    break;
                }
            }
        }

        return d;
    }

    // WL 6/9/98
    public int indexOf (long recID)
    {
        DODataRecord d = null;
        int idx = -1; // DR 6/13/98: return -1 if not found!

        // DR 6/13/98: make this quick check of the current element
        if (lastElement != -1) {
            d = (DODataRecord) this.elementAt(lastElement);
            if (d.recID == recID) idx = lastElement;
        }

        if (idx == -1) {
            for (int i = 0; i < this.size(); i++) {
                d = (DODataRecord) this.elementAt(i);
                if (d.recID == recID) {
                    idx = i;
                    break;
                }
            }
        }

        return idx;
    }

    // WL 11/17/98
    // append a list to this list...
    public DOList appendList(DOList list) {
        for (int i = 0; i < list.size(); i++) {
            this.addElement(list.elementAt(i));
        }
        return this;
    }

    // WL 5/22/98: override from child class
    public Object clone()
    {
        DOList l = new DOList();
        l.setAllRecords (hasAllRecords ());

        for (int i = 0; i < this.size(); i++) {
            l.addElement((DODataRecord)(this.elementAt(i).clone()));
        }
        return l;
    }

    public void setAllRecords (boolean b) { containsAll = b; }
    public boolean hasAllRecords () { return containsAll; }

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
    	b.append ("<DOList>");
    	b.append (objectToXMLNode ());
    	b.append ("</DOList>");
		return b;    	
    }

}
