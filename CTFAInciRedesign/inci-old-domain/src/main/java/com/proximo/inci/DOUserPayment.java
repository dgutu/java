package com.proximo.inci;

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.TDate;
import com.proximo.inci.common.exception.InvalidData;

//import OSSupport;
//import DatabaseFunctions;

public class DOUserPayment
    extends DODataRecord
{
    //paymentID is going to be recID
    public long recID;
    public long tn_rec_id;
    public long payment_method_id;
    public long payment_type;
    public double amount;    
    public String CCResult, CCPnref, CCRespMsg, CCAuthCode, CCAvsAddr, CCAvsZip, CCCvv2Match;
    public String trade_name;
    public String trade_number;
    public DOUserCC userCC;
    public DOUserCheck userCheck;
    public DOUserACH userACH;
	public TDate transDate;
	public String comments;

    public DOUserPayment ()
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
        tn_rec_id = 0;
        payment_method_id = 0;
        payment_type = 0;
        amount = 0;
        CCResult = ""; 
        CCPnref = "";
        CCRespMsg = "";
        CCAuthCode = "";
        CCAvsAddr = "";
        CCAvsZip = "";
        CCCvv2Match = "";
        trade_name = "";
        userCC = new DOUserCC();
        userCheck = new DOUserCheck();
        userACH = new DOUserACH();
        trade_number = "";
		transDate = new TDate();
		comments = "";
    }

    public Object clone ()
    {
        DOUserPayment n = (DOUserPayment) super.clone ();
        n.recID = this.recID;
        n.tn_rec_id = this.tn_rec_id;
        n.payment_method_id = this.payment_method_id;
        n.payment_type = this.payment_type;
        n.amount = this.amount;
        n.CCResult = this.CCResult; 
        n.CCPnref = this.CCPnref;
        n.CCRespMsg = this.CCRespMsg;
        n.CCAuthCode = this.CCAuthCode;
        n.CCAvsAddr = this.CCAvsAddr;
        n.CCAvsZip = this.CCAvsZip;
        n.CCCvv2Match = this.CCCvv2Match;
        n.trade_name = this.trade_name;
        n.userCC = this.userCC;
        n.userCheck = this.userCheck;
        n.userACH = this.userACH;
        n.trade_number = this.trade_number;
		n.transDate = this.transDate;
		n.comments = this.comments;
        return n;
    }

    

}
