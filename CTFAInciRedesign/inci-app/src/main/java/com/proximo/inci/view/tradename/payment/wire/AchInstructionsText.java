/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment.wire;

import com.proximo.inci.common.TDate;
import com.proximo.inci.service.tradename.TradeNameService;
import com.proximo.inci.view.tradename.payment.option.AbstractPaymentOptionView;
import com.proximo.inci.view.tradename.payment.option.InstructionsText;

public class AchInstructionsText extends InstructionsText {

    /*private static final String TXT_ACH_INSTRUCTIONS_PART1 = "Bank/Wire Transfers must be payable to Personal Care Products Council in U.S. Dollars. "
            + " Must be drawn on a U.S. Bank. Must add an additional $";*/

    /*private static final String TXT_ACH_INSTRUCTIONS_PART2 = ".00 service fee per Bank/Wire"
            + " transfer. Must provide application number in Reference area of Bank record. "
            + " Must use the following Bank information :<br> Bank : PNC<br> ABA # : 031000053<br> Account # : 5501317666<br>";*/
	
	private String checkText;
	
    public AchInstructionsText(AbstractPaymentOptionView parentView) {
        super(parentView);
    }

    @Override
    public void generateContent() {
        TDate transactionDate = TDate.rightNow();
        String dateTime = transactionDate.formatIt(TDate.DDMONTHYYYY) + " " + transactionDate.formatIt(TDate.HHMM12)
                + "<br><br>";

        /*mainComponent.setValue(dateTime + TXT_ACH_INSTRUCTIONS_PART1
                + parentView.getApplicationProperty("tnAchPaymentAmount") + TXT_ACH_INSTRUCTIONS_PART2);*/
        
        setCheckText();
        
        mainComponent.setValue(dateTime + checkText);
    }
    
    protected void setCheckText() {
    	checkText = TradeNameService.getCMSText("PaymentByBankWire");
    }
    
    protected String getCheckText() {
    	return checkText;
    }  

}
