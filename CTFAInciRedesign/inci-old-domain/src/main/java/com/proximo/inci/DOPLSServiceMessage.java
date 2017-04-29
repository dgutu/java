package com.proximo.inci;

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.TDate;
import com.proximo.inci.common.exception.InvalidData;

public class DOPLSServiceMessage extends DODataRecord
{
	private static final long serialVersionUID = 101L; // improves speed of serialization

    public String serviceID, name, message, alert;
	public TDate endDate;

    public DOPLSServiceMessage ()
    {
        this ("", "", "", TDate.getNullDateObject (), "");
    }

    public DOPLSServiceMessage (String serviceID, String message, TDate endDate, String alert)
    {
		this (serviceID, "", message, endDate, alert);
	}
	
    public DOPLSServiceMessage (String serviceID, String name, String message, TDate endDate, String alert)
    {
        this.serviceID = serviceID;
        this.name = name;
        this.message = message;
        this.endDate = endDate;
		this.alert = alert;
    }

    public void validate ()
    throws InvalidData
    {
        this.validate ((DODataRecord) this);
    }

    public static void validate (DODataRecord d)
    throws InvalidData
    {
        DOPLSServiceMessage i = (DOPLSServiceMessage) d;

        if (i.serviceID == null) throw new InvalidData ("The service ID cannot be null!");
        if (i.serviceID.length() == 0) throw new InvalidData ("The service ID must be at least one character.");
        if (i.serviceID.length() > 254) throw new InvalidData ("The service ID must be less than or 254 characters.");

        if (i.message == null) throw new InvalidData ("The message cannot be null!");
        if (i.message.length() > 4000) throw new InvalidData ("The message must be less than or 4000 characters.");

		if (i.alert == null) throw new InvalidData ("The alert cannot be null!");
        if (i.alert.length() > 4000) throw new InvalidData ("The alert must be less than or 4000 characters.");
	}

    public void clear ()
    {
        this.serviceID = "";
        this.name = "";
        this.message = "";
		this.endDate = null;
        this.endDate = TDate.getNullDateObject ();
		this.alert = "";
    }

    public Object clone ()
    {
		return new DOPLSServiceMessage (serviceID, name, message, endDate, alert);
    }

	public String toString () 
	{
		return "DOPLSServiceMessage [serviceID=" + serviceID + 
			   ",name=" + name +
			   ",message=" + message +
			   ",endDate=" + endDate +
			   ",alert=" + alert + "]";
	}
}
