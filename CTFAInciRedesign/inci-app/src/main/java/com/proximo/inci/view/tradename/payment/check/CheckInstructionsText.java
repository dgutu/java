/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment.check;

import com.proximo.inci.common.TDate;
import com.proximo.inci.service.tradename.TradeNameService;
import com.proximo.inci.view.tradename.payment.option.AbstractPaymentOptionView;
import com.proximo.inci.view.tradename.payment.option.InstructionsText;

public class CheckInstructionsText extends InstructionsText {

    /*private static final String TXT_CHECK_INSTRUCTIONS = "Make check payable to the Personal Care Products Council in U.S. dollars.  "
            + "Must be drawn on a U.S. bank.  To pay by bank/wire transfer, click on the Change Payment button and select Pay By Bank/Wire Transfer.  "
            + "Send a copy of the INCI Application and your check to:  "
            + "<br><br>The Personal Care Products Council INCI Application<br>"
            + "1101 17th Street, "
            + "N.W., Suite 300<br>" + "Washington, D.C.  20036 USA<br><br>";*/

    private String checkText;
    
    public CheckInstructionsText(AbstractPaymentOptionView parentView) {
        super(parentView);
    }

    @Override
    public void generateContent() {
        TDate transactionDate = TDate.rightNow();
        String dateTime = transactionDate.formatIt(TDate.DDMONTHYYYY) + " " + transactionDate.formatIt(TDate.HHMM12)
                + "<br><br>";
        
        setCheckText();
        
        //mainComponent.setValue(dateTime + TXT_CHECK_INSTRUCTIONS);
        mainComponent.setValue(dateTime + checkText);
    }
    
    protected void setCheckText() {
    	checkText = TradeNameService.getCMSText("PaymentByCheck");
    }
    
    protected String getCheckText() {
    	return checkText;
    }
    
    
}
