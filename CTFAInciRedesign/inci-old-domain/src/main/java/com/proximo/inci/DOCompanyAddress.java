package com.proximo.inci;

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.exception.InvalidData;


public class DOCompanyAddress
    extends DODataRecord
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

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

    // constructors
    public DOCompanyAddress ()
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
                    new String (""));
    }

    public DOCompanyAddress (long recID, String addrLine1,
                      String addrLine2, String addrLine3, String addrLine4,
                      String addrLine5, String city, String state,
                      String country, String postalCode, String phone,
                      String fax)
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
    }

    public void validate ()
    throws InvalidData
    {
        this.validate ((DODataRecord) this);
    }

    public static void validate (DODataRecord d)
    throws InvalidData
    {
        DOCompanyAddress i = (DOCompanyAddress) d;

        /* need to be implemented lateron...*/
    }

    // WL 7/15/98
    public Object clone ()
    {
        DOCompanyAddress c = new DOCompanyAddress ();

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

        return c;
    }

    public String toString ()
    {
        return "DOCompanyAddress [recID=" + recID +
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
            (fax.equals (""));
    }

    public boolean equals(DOCompanyAddress adr)
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
        else return true;
    }
}
