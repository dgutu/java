package com.proximo.inci;

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.TDate;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.common.exception.InvalidData;

public class DOCreditCardReport
    extends DODataRecord
{
	
	public long tnRecId;
	public String tradeName;
	public String tnNumber;	
    public TDate transactionDate;
    public double transactionAmount;
    public String cstKey;
    public int ccTypeID;
    public String ccTypeValue;
    public int ccExpYear;
    public int ccExpMonth;
    public String ccNumber;
    public String ccFirstName;
    public String ccLastName;
    public boolean ccISDefault; 
    public String CCPNRef;    
    public String publicationCompany;
    public String publicationCompanyAddr;
    
    public String ccUserFullName;
    public String ccUserAddress;
    public String ccUserEmail;
    
    public boolean cc_exported;
    
    public DOCreditCardReport ()
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
        
    	tnRecId = 0;
    	tradeName = new String("");
    	tnNumber = new String("");	
        transactionDate = new TDate();
        transactionAmount = 0;
        cstKey = new String("");
        ccTypeID = 0;
        ccTypeValue = new String("");
        ccExpYear = 0;
        ccExpMonth = 0;
        ccNumber = new String("");
        ccFirstName = new String("");
        ccLastName = new String("");
        ccISDefault = false;
        CCPNRef = new String("");
        publicationCompany = new String("");
        ccUserFullName = new String("");
        ccUserAddress = new String("");
        ccUserEmail = new String("");
        cc_exported = false;
        publicationCompanyAddr = new String("");
    }

    public Object clone ()
    {
        DOCreditCardReport n = (DOCreditCardReport) super.clone ();
    	
        n.tnRecId = this.tnRecId;
        n.tradeName = this.tradeName;
        n.tnNumber = this.tnNumber;	
        n.transactionDate = this.transactionDate;
        n.transactionAmount = this.transactionAmount;
        n.cstKey = this.cstKey;
        n.ccTypeID = this.ccTypeID;
        n.ccTypeValue = this.ccTypeValue;
        n.ccExpYear = this.ccExpYear;
        n.ccExpMonth = this.ccExpMonth;
        n.ccNumber = this.ccNumber;
        n.ccFirstName = this.ccFirstName;
        n.ccLastName = this.ccLastName;
        n.ccISDefault = this.ccISDefault;
        n.CCPNRef = this.CCPNRef;
        n.publicationCompany = this.publicationCompany;
        n.ccUserFullName = this.ccUserFullName;
        n.ccUserAddress = this.ccUserAddress;
        n.ccUserEmail = this.ccUserEmail;
        n.cc_exported = this.cc_exported;
        n.publicationCompanyAddr = this.publicationCompanyAddr;

        return n;
    }
    
    public String formatCCLastFirstName () 
    { 
    	return new String (this.ccLastName + ", " + this.ccFirstName); 
    }
    
    public String formatCCFirstLastName () 
    { 
    	return new String (this.ccFirstName + " " + this.ccLastName); 
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
}
