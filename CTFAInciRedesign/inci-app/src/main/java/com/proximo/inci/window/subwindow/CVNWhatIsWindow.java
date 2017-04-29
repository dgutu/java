/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.subwindow;

import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.window.main.MainWindow;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class CVNWhatIsWindow extends InformationWindow {

    private static String CAPTION_KEY = "credit_card_cvn_what_is_window.caption";

    private static String TXT_INFO = "The CVV (Card Verification Value) is a 3 or 4 digit number "
            + "printed on your credit card. It provides extra security when you use your card on "
            + "the Internet or over the phone. The number appears only on the card itself, "
            + "not on any receipts or statements. The Personal Care Products Council does not store "
            + "this number, and immediately erases it from our systems as soon as the transaction has "
            + "been approved.<br><br><u><b>MasterCard / Visa</b></u>: A 3 digit code is is printed "
            + "on the back of MasterCard and Visa credit cards.<br><br><u><b>American Express</b></u>: "
            + "A 4 digit code is printed on the front of American Express credit cards.";    
    
    private static final String WIDTH = "365px";
    private static final String HEIGHT = "620px";

    public CVNWhatIsWindow(MainWindow mainWindow) {
        super(mainWindow);
    }

    @Override
    protected void addInformation() {
        VerticalLayout layout = (VerticalLayout) getContent();

        ComponentUtil.addHtml(TXT_INFO, layout);

        Embedded cvvCreditCardsPic1 = new Embedded(null, new ThemeResource("images/CvvCreditCards1.jpg"));
        layout.addComponent(cvvCreditCardsPic1);
        Embedded cvvCreditCardsPic2 = new Embedded(null, new ThemeResource("images/CvvCreditCards2.jpg"));
        layout.addComponent(cvvCreditCardsPic2);
    }

    @Override
    protected String getCaptionKey() {
        return CAPTION_KEY;
    }

    @Override
    protected String getWindowWidth() {
        return WIDTH;
    }

    @Override
    protected String getWindowHeight() {
        return HEIGHT;
    }

}
