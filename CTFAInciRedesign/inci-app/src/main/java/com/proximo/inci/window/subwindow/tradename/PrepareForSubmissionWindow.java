/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.subwindow.tradename;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.proximo.inci.view.tradename.payment.PaymentView;
import com.proximo.inci.window.main.MainWindow;
import com.proximo.inci.window.subwindow.SubWindow;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class PrepareForSubmissionWindow extends SubWindow {

	@SuppressWarnings("unused")
	private static Logger		logger				= LoggerFactory.getLogger(PrepareForSubmissionWindow.class);

	private static String		CAPTION_KEY			= "prepareForSubmissionWindow.caption";

	private static final String	WIDTH				= "460px";
	private static final String	HEIGHT				= "380px";

	public static String		FORM_TN_PARAM_KEY	= "formTn";
	public static String		BACK_VIEW			= "backView";
	public static String		PARENT_VIEW			= "parentView";

	private DOTradeName			formTn;
	private String				backView;
	private TradeNameDetailView	parentView;

	public PrepareForSubmissionWindow(MainWindow mainWindow) {
		super(mainWindow);
	}

	@Override
	protected void init() {
		super.init();

		setModal(true);
		setResizable(false);
		setClosable(false);

		VerticalLayout layout = (VerticalLayout) getContent();
		layout.setSizeFull();
	}

	@Override
	protected void addContent() {
		VerticalLayout layout = (VerticalLayout) getContent();

		ComponentUtil.addHtml(CaptionResolver.getCaption("prepareForSubmissionWindow.info.part1")
				// +
				// mainWindow.getApplicationProperties().get("tnPaymentAmount")
				+ CaptionResolver.getCaption("prepareForSubmissionWindow.info.part2"), layout);

		HorizontalLayout actionButtonsLayout = new HorizontalLayout();
		actionButtonsLayout.setSpacing(true);
		Button okButton = ComponentUtil.createActionButton("submit.okButton", createButtonListener());
		Button cancelButton = ComponentUtil.createActionButton("submit.cancelButton", cancelButtonListener());
		okButton.addStyleName("actionbtn-xxxxlarge");
		cancelButton.addStyleName("actionbtn-xlarge");
		actionButtonsLayout.addComponent(okButton);
		actionButtonsLayout.addComponent(cancelButton);
		layout.addComponent(actionButtonsLayout);
		layout.setComponentAlignment(actionButtonsLayout, Alignment.BOTTOM_CENTER);
	}

	private ClickListener cancelButtonListener() {
		return new Button.ClickListener() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 5979869671644632295L;

			@Override
			public void buttonClick(ClickEvent event) {
				mainWindow.removeWindow(getWindow());
			}
		};
	}

	@Override
	protected void handleParams(Map<String, Object> parameters) {
		formTn = (DOTradeName) parameters.get(FORM_TN_PARAM_KEY);

		// View string to navigate back
		if (!TemplarUtil.isStringNullOrEmpty(parameters.get(BACK_VIEW).toString())) backView = parameters.get(BACK_VIEW).toString();

		if (parameters.get(PARENT_VIEW) != null && !TemplarUtil.isStringNullOrEmpty(parameters.get(PARENT_VIEW).toString())) {
			parentView = (TradeNameDetailView) parameters.get(PARENT_VIEW);
		}
	}

	private Button.ClickListener createButtonListener() {
		return new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				mainWindow.removeWindow(getWindow());
				Map<String, Object> paymentViewNavigationParamsMap = new HashMap<String, Object>();
				paymentViewNavigationParamsMap.put(PaymentView.FORM_TN_NAVIG_PARAM_KEY, formTn);
				paymentViewNavigationParamsMap.put(PaymentView.BACK_VIEW, backView);

				// save application before go to the payment
				if (parentView != null) {
					String validationErrorStr = parentView.saveFormTn();
					if (validationErrorStr == null) {
						mainWindow.navigateTo(ViewKey.TN_PAYMENT.toString(), paymentViewNavigationParamsMap, backView);
					}
					else {
						mainWindow.showNotification(validationErrorStr);
					}
				}
			}
		};
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
