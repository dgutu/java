package com.proximo.inci;

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.TDate;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.common.exception.InvalidData;

public class DOUserCC
    extends DODataRecord
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -7581040575881615691L;
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
    public String cst_key;
    
    
    
    public int ccType;
    public String ccNumber;
    public String ccCVV2;
    public int ccExpMonth;
    public int ccExpYear;
    public String ccSecurityCode;
    public boolean isDefault;
    
    public String CCResult, CCPnref, CCRespMsg, CCAuthCode, CCAvsAddr, CCAvsZip, CCCvv2Match;
    
    public static final int MASTERCARD = 1;
    public static final int VISA = 2;
    public static final int AMEX = 3;

    public DOUserCC ()
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
        countryCode = ""; 
        
        ccType = 0;
        ccNumber = "";
        ccExpMonth = 0;
        ccExpYear = 0;
        ccSecurityCode = "";
        phone = "";
        isDefault = false;
        CCResult = ""; 
        CCPnref = "";
        CCRespMsg = "";
        CCAuthCode = "";
        CCAvsAddr = "";
        CCAvsZip = "";
        CCCvv2Match = "";
        cst_key = "";
        ccCVV2 = "";
        
    }

    public Object clone ()
    {
        DOUserCC n = (DOUserCC) super.clone ();
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
        
        n.ccType = this.ccType;
        n.ccNumber = this.ccNumber;
        n.ccExpMonth = this.ccExpMonth;
        n.ccExpYear = this.ccExpYear;
        n.ccSecurityCode = this.ccSecurityCode;
        
        n.isDefault = this.isDefault; 
        n.phone = this.phone;
        n.CCResult = this.CCResult; 
        n.CCPnref = this.CCPnref;
        n.CCRespMsg = this.CCRespMsg;
        n.CCAuthCode = this.CCAuthCode;
        n.CCAvsAddr = this.CCAvsAddr;
        n.CCAvsZip = this.CCAvsZip;
        n.CCCvv2Match = this.CCCvv2Match;
        
        n.cst_key = this.cst_key;
        
        n.ccCVV2 = this.ccCVV2;

        return n;
    }

    public String formatLastFirst () { return new String (lastName + ", " + firstName); }
    public String formatFirstLast () { return new String (firstName + " " + lastName); }
    
    public String maskCC () { 
        
        String ccNumberMasked = new String();
        if (ccNumber != null && ccNumber.toCharArray().length > 4){
            for (int i = 0; i < ccNumber.toCharArray().length - 4; i++){
                ccNumberMasked = ccNumberMasked + "X";
            }
            ccNumberMasked = ccNumberMasked + TemplarUtil.strRight(ccNumber, 4);
        }
        return ccNumberMasked;
    }
    

    
    public String getExpDateStr(){
        String expDateStr = new String();
        if (ccExpMonth != 0 && ccExpYear != 0)
            expDateStr = ccExpMonth + "/" + ccExpYear;
        return expDateStr;
    }
    
    public String getExpDateMMDDFormat(){
        String expDateStr = new String();
        String month = "";
        String year = "";
        
        if (ccExpMonth != 0 && ccExpYear != 0){
            if (ccExpMonth < 10)
                month = "0" + ccExpMonth;
            else
                month = Integer.toString(ccExpMonth);
            
            year = Integer.toString(ccExpYear);
            char[] yearArray = year.toCharArray();
            year = yearArray[yearArray.length - 2] + "" + yearArray[yearArray.length - 1];
            
            expDateStr = month + year;
        }
        
        return expDateStr;
    }
    
    public String getCityStateZipStr (){
        if (city != null && !city.equalsIgnoreCase("") && state != null && !state.equalsIgnoreCase(""))
            return city + ", " + state + " " + zip;
        else
            return city + " " + state + " " + zip;
    }
    public String getCCname(){
        String ccName = new String();
        switch (ccType){
        case MASTERCARD: ccName = "Mastercard"; 
             break;
        case VISA: ccName = "Visa";
             break;
        case AMEX: ccName = "Amex";
             break;
        default : ccName = "";
             break;
        }
        return ccName;
    }
    

    public boolean isCCExpired(){
        int month = ccExpMonth;
        int year = ccExpYear;
        TDate rightNow = TDate.rightNow();
        
        if (rightNow.getYear() > year)
            return true;
        if (rightNow.getYear() == year && rightNow.getMonth() > month)
            return true;
        else
            return false;
    }
    
    public boolean validateCSV(String csv){
        return ccSecurityCode.equalsIgnoreCase(csv);
    }
    
    public String getCCExpMonth() {
    	String month = String.valueOf(this.ccExpMonth);
    	
    	if (!TemplarUtil.isStringNullOrEmpty(month) && month.length() == 1)
    		month = "0" + month;
    		
    	return month;
    }    
    
    public String formatCCYearAndMonth () 
    {
    	
    	return new String (String.valueOf(this.ccExpYear)) + "/" + getCCExpMonth(); 
    }
    
    public String formatCCFirstLastName () 
    { 
    	return new String (this.firstName + " " + this.lastName); 
    }

}
