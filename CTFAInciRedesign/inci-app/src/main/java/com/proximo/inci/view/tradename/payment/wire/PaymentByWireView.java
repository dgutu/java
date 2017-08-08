/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment.wire;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOUserACH;
import com.proximo.inci.DOUserCC;
import com.proximo.inci.DOUserCheck;
import com.proximo.inci.common.TDate;
import com.proximo.inci.service.common.EmailService;
import com.proximo.inci.service.payment.TradeNamePaymentService;
import com.proximo.inci.service.tradename.TradeNameService;
import com.proximo.inci.view.ViewKey;
//import com.proximo.inci.view.tradename.payment.PaymentView;
import com.proximo.inci.view.tradename.payment.option.AbstractPaymentOptionView;
import com.proximo.inci.view.tradename.payment.option.InstructionsText;
import com.proximo.inci.window.main.MainWindow;

public class PaymentByWireView extends AbstractPaymentOptionView {

	private static Logger logger = LoggerFactory.getLogger(PaymentByWireView.class);

	public PaymentByWireView(MainWindow mainWindow) {
		super(mainWindow, false, null);
	}

	@Override
	public InstructionsText createInstructionsText() {
		return new AchInstructionsText(this);
	}

	@Override
	public int getPaymentType() {
		return 3;
	}

	@Override
	public ViewKey getThankYouViewKey() {
		return ViewKey.TN_PAYMENT_BY_WIRE_THANK_YOU;
	}

	@Override
	public Long submitSpecificPayment() {
		DOUserACH userACH = new DOUserACH();
		userACH.userRecId = formTn.userRecId;

		Integer paymentAmount = (Integer) getApplicationProperty("tnPaymentAmount")
				+ (Integer) getApplicationProperty("tnAchPaymentAmount");

		return TradeNamePaymentService.savePayment(formTn, getCurrentSecurityInfo().getUser().getUserRecId(),
				new DOUserCheck(), new DOUserCC(), getPaymentType(), paymentAmount, userACH);
	}

	@Override
	protected void sendSpecificEmail(final long referenceId) {
		try {
			final Integer tnPaymentAmount = (Integer) getApplicationProperty("tnPaymentAmount");
			final TDate transactionDate = TDate.rightNow();
			final String dateTime = transactionDate.formatIt(TDate.DDMONTHYYYY) + " "
					+ transactionDate.formatIt(TDate.HHMM12) + "<br><br>";

			final String subject = "INCI Name Application Submission: Payment By Bank Transfer";

			final String txtACHInstructions = TradeNameService.getCMSText("PaymentByBankWire");

			final String htmlMessage = "Your application, " + getFormTn().tradeName + " (" + getFormTn().tnNumber
					+ "), " + "has been saved, but not submitted.  Once we receive a bank transfer for $"
					+ tnPaymentAmount
					+ ".00, your application will be submitted and processed by the Personal Care Products Council.  "
					+ "Please retain this email for your reference. " + "The Reference ID for this transaction is "
					+ referenceId + "." + "<br><br>" + txtACHInstructions + "<br><br><hr>"
					+ "<br><br><b><u>Refund Policy</u></b><br><br><br>"
					+ TradeNameService.getCMSText("PaymentTextRefundPolicy");

			// get Privacy Policy from DB
			String privacyPolicy = TradeNameService.getPrivacyPolicy();
			logger.info("privacyPolicy length: " + privacyPolicy.length());
			logger.info("starting send email");
			EmailService.sendHtml("inci@personalcarecouncil.org", getCurrentSecurityInfo().getUser().getEmail(),
					subject, dateTime + htmlMessage + privacyPolicy);
			logger.info("email sent !!!");
		} catch (Exception ex) {
			logger.error("Unable to send email", ex.getMessage());
		}
	}

}
