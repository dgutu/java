/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment.option;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.service.security.SecurityInfo;
import com.proximo.inci.view.BaseView;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.tradename.payment.option.thankyou.AbstractPaymentOptionThankYouView;
import com.proximo.inci.window.main.MainWindow;
import com.vaadin.ui.Alignment;

public abstract class AbstractPaymentOptionView extends BaseView {

	/* Navigation parameters' keys */
	private static Logger logger = LoggerFactory.getLogger(AbstractPaymentOptionView.class);
	public static String FORM_TN_NAVIG_PARAM_KEY = "formTn";
	public static String BACK_VIEW = "backView";

	protected DOTradeName formTn;
	protected String backView;

	private HeaderTextLayout headerTextLayout;
	private PaymentOptionLayout paymentOptionLayout;

	public AbstractPaymentOptionView(MainWindow mainWindow, boolean addCaption, String captionKey) {
		super(mainWindow, false, null);
	}

	protected abstract InstructionsText createInstructionsText();

	public abstract int getPaymentType();

	protected abstract Long submitSpecificPayment();

	protected abstract void sendSpecificEmail(final long referenceId);

	protected abstract ViewKey getThankYouViewKey();

	@Override
	protected void init() {
		super.init();

		headerTextLayout = new HeaderTextLayout(this);
		paymentOptionLayout = new PaymentOptionLayout(this);
	}

	@Override
	protected void addContent() {
		super.addContent();

		addComponent(headerTextLayout, Alignment.MIDDLE_CENTER);
		addSpace();
		addComponent(paymentOptionLayout);
	}

	@Override
	public void applyNavigationParameters(Map<String, Object> navigationParameterMap) {
		try {
			formTn = (DOTradeName) navigationParameterMap.get(FORM_TN_NAVIG_PARAM_KEY);
			backView = (String) navigationParameterMap.get(BACK_VIEW);
		} catch (Exception ex) {
		}

		headerTextLayout.generateContent();
		paymentOptionLayout.generateContent();
	}

	@Override
	public void applySecurityInfo(SecurityInfo securityInfo) {
		/*
		 * AbstractPaymentOptionView has no component for which to apply the
		 * security info.
		 */
	}

	public void submitPayment() {
		if (formTn.paymentInfo.recID == 0) {
			Long referenceId = submitSpecificPayment();

			// -1 - application was submitted already
			if (referenceId == -1) {
				showInfoMsgWindow(CaptionResolver.getCaption("submitted.already"));
			} else {
				logger.info("Application " + getFormTn().tnNumber + "submitted");
				sendSpecificEmail(referenceId);
				navigateToThankYouView(referenceId);
			}
		}
	}

	private void navigateToThankYouView(Long referenceId) {
		Map<String, Object> thankYouViewNavigParamsMap = new HashMap<String, Object>();

		thankYouViewNavigParamsMap.put(AbstractPaymentOptionThankYouView.FORM_TN_NAVIG_PARAM_KEY, formTn);
		thankYouViewNavigParamsMap.put(AbstractPaymentOptionThankYouView.REF_ID_NAVIG_PARAM_KEY, referenceId);
		thankYouViewNavigParamsMap.put(AbstractPaymentOptionThankYouView.BACK_VIEW, backView);

		navigateTo(getThankYouViewKey().toString(), thankYouViewNavigParamsMap);
	}

	public DOTradeName getFormTn() {
		return formTn;
	}

	public PaymentOptionLayout getPaymentOptionLayout() {
		return paymentOptionLayout;
	}

	public String getBackView() {
		return backView;
	}
}
