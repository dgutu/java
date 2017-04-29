package com.proximo.inci;

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.TDate;
import com.proximo.inci.common.exception.InvalidData;


public class DOUserACH 
    extends DODataRecord
{
    //paymentID is going to be recID

    
    public String userRecId;
    public String firstName;
    public String lastName;
    public String address1;
    public String address2;
    public String address3;
    public String city;
    public String state;
    public String zip;      
    public String countryCode;
    public String phone;
    
    public String achNumber, notes;
    public TDate  receiveDate, clearDate;

    


    public DOUserACH ()
    {
        super();
        clear();
    }

    public void validate ()
    throws InvalidData
    {
        this.validate ((DODataRecord) this);
    }

    public void clear ()
    {
    
        recID = 0;
        userRecId = "";
        firstName = "";
        lastName = "";        
               
        address1 = "";
        address2 = "";
        address3 = "";
        city = "";
        state = "";
        zip = "";
        countryCode = "US"; 
        
        notes = "";
        receiveDate = new TDate();
        clearDate = new TDate();
        achNumber = "";
        
    }

    public Object clone ()
    {
    	DOUserACH n = (DOUserACH) super.clone ();
        n.recID = this.recID;
        n.userRecId = this.userRecId;
        n.firstName = this.firstName;
        n.lastName = this.lastName;        
               
        n.address1 = this.address1;
        n.address2 = this.address2;
        n.address3 = this.address3;
        n.city = this.city;
        n.state = this.state;
        n.zip = this.zip;
        n.countryCode = this.countryCode; 
        
        n.notes = this.notes;
        n.receiveDate = this.receiveDate;
        n.clearDate = this.clearDate;
        n.achNumber = this.achNumber;
        
        return n;
    }

    public String formatLastFirst () { return new String (lastName + ", " + firstName); }
    public String formatFirstLast () { return new String (firstName + " " + lastName); }
            
    public String getCityStateZipStr (){
        if (city != null && !city.equalsIgnoreCase("") && state != null && !state.equalsIgnoreCase(""))
            return city + ", " + state + " " + zip;
        else
            return city + " " + state + " " + zip;
    }
    
}
