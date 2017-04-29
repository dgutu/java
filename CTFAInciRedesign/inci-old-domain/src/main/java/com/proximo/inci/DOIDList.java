package com.proximo.inci;


/*********************************************************************
**
**  Class:  DOIDList
**  Author: DJR
**  Date:   12/19/97
**
**  Description:
**  A specialized collection class of record ID's.
**  Allows long and Long elements to be added and allows
**  a record ID to be returned without getting a refernece
**  to a DODataRecord object.  Can be used for passing
**  lists of database records attached to a parent record
**  (i.e. one customer has many jobs....)
**
**  Change History (provide name, date, description)
**
**
*********************************************************************/

import java.io.Serializable;
import java.util.Vector;

public class DOIDList
    implements Serializable, Cloneable
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    private Vector v;
    private int lastElement;

    public DOIDList ()
    {
        v = new Vector ();
        lastElement = -1;
    }

    public synchronized void addElement (long id)
    {
        addElement (new Long (id));
        lastElement = v.size () - 1;
    }

    public synchronized void addElement (Long id)
    {
        v.addElement (id);
        lastElement = v.size () - 1;
    }

    public long idAt (int i)
    {
        lastElement = i;
        return ((Long) v.elementAt (i)).longValue ();
    }

    public void insertElementAt (long id, int index)
    {
        lastElement = index;
        v.insertElementAt (new Long (id), index);
    }

    public void insertElementAt (Long id, int index)
    {
        lastElement = index;
        v.insertElementAt (id, index);
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

    public String toString () { return "DOIDList: " + v; }

    public void setElementAt (long i, int index)
    {
        lastElement = index;
        v.setElementAt (new Long (i), index);
    }

    public Object clone()
    {
        DOIDList l = new DOIDList();

        for (int i = 0; i < this.size(); i++) {
            l.addElement(new Long (this.idAt(i)));
        }
        return l;
    }

    public int indexOf (long id)
    {
        Long l = new Long (id);
        return v.indexOf (l);
    }

}
