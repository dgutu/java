package com.proximo.inci;

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.exception.InvalidData;

public class DOEmployeeAddress
    extends DODataRecord
{
	public final static int ADDRESS_HOME = 1;
	public final static int ADDRESS_WORK = 2;
	
	private static final long serialVersionUID = 101L; // improves speed of serialization

    public String addrLine1;
    public String addrLine2;
    public String addrLine3;
    public String addrLine4;
    public String addrLine5;
    public String city;
    public String state;
    public String country;
    public String postalCode;
    public String phone;
    public String fax;
    public String desc;
    public boolean isUpdated;
    public int type;

    // constructors
    public DOEmployeeAddress (int type)
    {
        this();
        this.type = type;
    }
    
    public DOEmployeeAddress ()
    {
        this (0, new String (""),
                    new String (""),
                    new String (""),
                    new String (""),
                    new String (""),
                    new String (""),
                    new String (""),
                    new String (""),
                    new String (""),
                    new String (""),
                    new String (""),
                    new String (""), 
                    ADDRESS_WORK);
    }

    public DOEmployeeAddress (long recID, String addrLine1,
                      String addrLine2, String addrLine3, String addrLine4,
                      String addrLine5, String city, String state,
                      String country, String postalCode, String phone,
                      String fax, String desc, int type)
    {
        this.recID = recID;
        this.addrLine1 = addrLine1;
        this.addrLine2 = addrLine2;
        this.addrLine3 = addrLine3;
        this.addrLine4 = addrLine4;
        this.addrLine5 = addrLine5;
        this.city = city;
        this.state = state;
        this.country = country;
        this.postalCode = postalCode;
        this.phone = phone;
        this.fax = fax;
        this.desc = desc;
        this.type = type;
    }

    public void validate ()
    throws InvalidData
    {
        this.validate ((DODataRecord) this);
    }

    public static void validate (DODataRecord d)
    throws InvalidData
    {
        DOEmployeeAddress i = (DOEmployeeAddress) d;

        if (i.type != ADDRESS_WORK && i.type != ADDRESS_HOME) throw new InvalidData ("Invalid address type");
    }

    // WL 7/15/98
    public Object clone ()
    {
        DOEmployeeAddress c = new DOEmployeeAddress ();

        c.recID = this.recID;
        c.addrLine1 = new String(this.addrLine1);
        c.addrLine2 = new String(this.addrLine2);
        c.addrLine3 = new String(this.addrLine3);
        c.addrLine4 = new String(this.addrLine4);
        c.addrLine5 = new String(this.addrLine5);
        c.city = new String(this.city);
        c.state = new String(this.state);
        c.country = new String(this.country);
        c.postalCode = new String(this.postalCode);
        c.phone = new String(this.phone);
        c.fax = new String(this.fax);
        c.desc = new String(this.desc);
        c.isUpdated = this.isUpdated;
		c.type = this.type;
        return c;
    }

    public String toString ()
    {
        return "DOEmployeeAddress [recID=" + recID +
                        ",addrLine1=" + addrLine1 + "]";
    }

    public boolean isNull ()
    {
        return (addrLine1.equals ("")) &&
            (addrLine2.equals ("")) &&
            (addrLine3.equals ("")) &&
            (addrLine4.equals ("")) &&
            (addrLine5.equals ("")) &&
            (city.equals ("")) &&
            (postalCode.equals ("")) &&
            (phone.equals ("")) &&
            (fax.equals ("")) &&
            (desc.equals (""));
    }

    public boolean equals(DOEmployeeAddress adr)
    {
        if(!addrLine1.equals(adr.addrLine1)) return false;
        else if(!addrLine2.equals(adr.addrLine2)) return false;
        else if(!addrLine3.equals(adr.addrLine3)) return false;
        else if(!addrLine4.equals(adr.addrLine4)) return false;
        else if(!addrLine5.equals(adr.addrLine5)) return false;
        else if(!city.equals(adr.city)) return false;
        else if(!state.equals(adr.state)) return false;
        else if(!country.equals(adr.country)) return false;
        else if(!postalCode.equals(adr.postalCode)) return false;
        else if(!phone.equals(adr.phone)) return false;
        else if(!fax.equals(adr.fax)) return false;
        else if(!desc.equals(adr.desc)) return false;
        else if(type != adr.type) return false;
        else return true;
    }
}
