/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.main;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.service.security.SecurityInfo;
import com.proximo.inci.view.AbstractView;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.admin.AdminFunctionsView;
import com.proximo.inci.view.admin.ach_clear.detail.AchClearDetailView;
import com.proximo.inci.view.admin.ach_clear.search.AchClearSearchView;
import com.proximo.inci.view.admin.application_move.APPMoveSearchView;
import com.proximo.inci.view.admin.cc_transactions_report.CCTransactionsReportView;
import com.proximo.inci.view.admin.check_clear.detail.CheckClearDetailView;
import com.proximo.inci.view.admin.check_clear.search.CheckClearSearchView;
import com.proximo.inci.view.admin.export.ExportView;
import com.proximo.inci.view.admin.misc_text_maint.detail.MTMDetailView;
import com.proximo.inci.view.admin.misc_text_maint.search.MTMView;
import com.proximo.inci.view.home.PrivacyPolicyView;
import com.proximo.inci.view.home.ProcessView;
import com.proximo.inci.view.home.intro.ContactView;
import com.proximo.inci.view.home.intro.InstructionsView;
import com.proximo.inci.view.home.intro.IntroductionDetailView;
import com.proximo.inci.view.home.intro.IntroductionView;
import com.proximo.inci.view.security.LogonView;
import com.proximo.inci.view.security.user.detail.UserDetailView;
import com.proximo.inci.view.security.user.search.UserSearchView;
import com.proximo.inci.view.tradename.archive.TradeNameArchiveView;
import com.proximo.inci.view.tradename.archive.move.TradeNameArchiveMoveView;
import com.proximo.inci.view.tradename.archive.search.TradeNameArchiveSearchView;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.proximo.inci.view.tradename.payment.PaymentView;
import com.proximo.inci.view.tradename.payment.cc.PaymentByCCView;
import com.proximo.inci.view.tradename.payment.cc.thankyou.PayByCCThankYouView;
import com.proximo.inci.view.tradename.payment.check.PaymentByCheckView;
import com.proximo.inci.view.tradename.payment.check.thankyou.PayByCheckThankYouView;
import com.proximo.inci.view.tradename.payment.wire.PaymentByWireView;
import com.proximo.inci.view.tradename.payment.wire.thankyou.PayByWireThankYouView;
import com.proximo.inci.view.tradename.search.TradeNameSearchView;
import com.proximo.inci.window.SubWindowKey;
import com.proximo.inci.window.main.layout.MainLayout;
import com.proximo.inci.window.subwindow.CMSSaveSubWindow;
import com.proximo.inci.window.subwindow.CVNWhatIsWindow;
import com.proximo.inci.window.subwindow.ContactWindow;
import com.proximo.inci.window.subwindow.DeleteTradeSubWindow;
import com.proximo.inci.window.subwindow.InformationMessageWindow;
import com.proximo.inci.window.subwindow.InstructionsWindow;
import com.proximo.inci.window.subwindow.IntroductionWindow;
import com.proximo.inci.window.subwindow.LoadingWindow;
import com.proximo.inci.window.subwindow.LoginFailedWindow;
import com.proximo.inci.window.subwindow.PrivacyPolicyWindow;
import com.proximo.inci.window.subwindow.ProcessWindow;
import com.proximo.inci.window.subwindow.SubWindow;
import com.proximo.inci.window.subwindow.tradename.CancelTNDetailWindow;
import com.proximo.inci.window.subwindow.tradename.NewTradeNameWindow;
import com.proximo.inci.window.subwindow.tradename.PrepareForSubmissionWindow;
import com.proximo.inci.window.subwindow.tradename.SaveAsWindow;
import com.proximo.inci.window.subwindow.tradename.admin_comments.AdminCommentsWindow;
import com.vaadin.ui.Panel;

/**
 * The main window of the INCI application. Acts as the controller for all
 * actions coming from UI.
 */
@SuppressWarnings("serial")
public class MainWindow extends AbstractMainWindow {

	private static Logger logger = LoggerFactory.getLogger(MainWindow.class);

	private MainLayout mainLayout;

	public MainWindow(String caption, String themePagesUrl, Map<String, Object> applicationProperties,
			ViewKey currentViewKey, HttpServletResponse response, HttpServletRequest request) {
		super(caption, themePagesUrl, applicationProperties, currentViewKey, response, request);
	}

	/** Main window initialization. */
	@Override
	protected void init() {
		logger.info("Main window initialization started");

		addStyleName("whiteBackgroundColor");

		Panel p = new Panel();

		mainLayout = new MainLayout(this);
		p.setContent(mainLayout);
		p.setSizeFull();
		setContent(p);

		initViews();
		initSubWindows();

		initUriFu();

		logger.info("Main window initialization finished");
	}

	private void initViews() {
		viewsMap = new HashMap<ViewKey, AbstractView>();

		viewKeyToClassMap = new HashMap<ViewKey, Class<? extends AbstractView>>();

		viewKeyToClassMap.put(ViewKey.SCR_LOGON, LogonView.class);
		viewKeyToClassMap.put(ViewKey.SCR_USER_SEARCH, UserSearchView.class);
		viewKeyToClassMap.put(ViewKey.SCR_USER_DETAIL, UserDetailView.class);

		viewKeyToClassMap.put(ViewKey.ADMIN_FUNCTIONS, AdminFunctionsView.class);
		viewKeyToClassMap.put(ViewKey.ADMIN_EXPORT, ExportView.class);
		viewKeyToClassMap.put(ViewKey.ADMIN_CHECK_CLEARING_SEARCH, CheckClearSearchView.class);
		viewKeyToClassMap.put(ViewKey.ADMIN_CHECK_CLEARING_DETAIL, CheckClearDetailView.class);
		viewKeyToClassMap.put(ViewKey.ADMIN_ACH_CLEARING_SEARCH, AchClearSearchView.class);
		viewKeyToClassMap.put(ViewKey.ADMIN_ACH_CLEARING_DETAIL, AchClearDetailView.class);
		viewKeyToClassMap.put(ViewKey.ADMIN_CC_TRANSACTIONS_REPORT, CCTransactionsReportView.class);
		viewKeyToClassMap.put(ViewKey.ADMIN_MISC_TEXT_MAINT_SEARCH, MTMView.class);
		viewKeyToClassMap.put(ViewKey.ADMIN_MISC_TEXT_MAINT_DETAIL, MTMDetailView.class);

		viewKeyToClassMap.put(ViewKey.ADMIN_APP_MOVE_SEARCH, APPMoveSearchView.class);

		viewKeyToClassMap.put(ViewKey.HOME_PROCESS, ProcessView.class);
		viewKeyToClassMap.put(ViewKey.HOME_INTRODUCTION, IntroductionView.class);
		viewKeyToClassMap.put(ViewKey.HOME_INTRODUCTION_DETAIL, IntroductionDetailView.class);
		viewKeyToClassMap.put(ViewKey.HOME_INSTRUCTIONS, InstructionsView.class);
		viewKeyToClassMap.put(ViewKey.HOME_CONTACT, ContactView.class);

		viewKeyToClassMap.put(ViewKey.TN_SEARCH, TradeNameSearchView.class);
		viewKeyToClassMap.put(ViewKey.TN_DETAIL, TradeNameDetailView.class);

		viewKeyToClassMap.put(ViewKey.TN_PAYMENT, PaymentView.class);
		viewKeyToClassMap.put(ViewKey.TN_PAYMENT_BY_CHECK, PaymentByCheckView.class);
		viewKeyToClassMap.put(ViewKey.TN_PAYMENT_BY_CHECK_THANK_YOU, PayByCheckThankYouView.class);
		viewKeyToClassMap.put(ViewKey.TN_PAYMENT_BY_WIRE, PaymentByWireView.class);
		viewKeyToClassMap.put(ViewKey.TN_PAYMENT_BY_WIRE_THANK_YOU, PayByWireThankYouView.class);
		viewKeyToClassMap.put(ViewKey.TN_PAYMENT_BY_CC, PaymentByCCView.class);
		viewKeyToClassMap.put(ViewKey.TN_PAYMENT_BY_CC_THANK_YOU, PayByCCThankYouView.class);

		viewKeyToClassMap.put(ViewKey.TN_ARCHIVE, TradeNameArchiveView.class);
		viewKeyToClassMap.put(ViewKey.TN_ARCHIVE_SEARCH, TradeNameArchiveSearchView.class);
		viewKeyToClassMap.put(ViewKey.TN_ARCHIVE_MOVE, TradeNameArchiveMoveView.class);

		viewKeyToClassMap.put(ViewKey.PRIVACY_POLICY, PrivacyPolicyView.class);
	}

	private void initSubWindows() {
		subWindowsMap = new HashMap<SubWindowKey, SubWindow>();

		windowKeyToClassMap = new HashMap<SubWindowKey, Class<? extends SubWindow>>();

		windowKeyToClassMap.put(SubWindowKey.CMN_LOADING, LoadingWindow.class);
		windowKeyToClassMap.put(SubWindowKey.CMN_INFO_MSG, InformationMessageWindow.class);

		windowKeyToClassMap.put(SubWindowKey.SCR_LOGIN_FAILED, LoginFailedWindow.class);

		windowKeyToClassMap.put(SubWindowKey.HOME_INTRO, IntroductionWindow.class);
		windowKeyToClassMap.put(SubWindowKey.HOME_PROCESS, ProcessWindow.class);

		windowKeyToClassMap.put(SubWindowKey.HOME_INSTRUCTIONS, InstructionsWindow.class);
		windowKeyToClassMap.put(SubWindowKey.HOME_CONTACT, ContactWindow.class);

		windowKeyToClassMap.put(SubWindowKey.TN_NEW, NewTradeNameWindow.class);
		windowKeyToClassMap.put(SubWindowKey.TN_PREPARE_SUBMIT, PrepareForSubmissionWindow.class);
		windowKeyToClassMap.put(SubWindowKey.TN_ADMIN_COMMENTS, AdminCommentsWindow.class);
		windowKeyToClassMap.put(SubWindowKey.TN_CANCEL, CancelTNDetailWindow.class);
		windowKeyToClassMap.put(SubWindowKey.TN_SAVE_AS, SaveAsWindow.class);

		windowKeyToClassMap.put(SubWindowKey.CMS_SAVE, CMSSaveSubWindow.class);

		windowKeyToClassMap.put(SubWindowKey.CC_CVN_WHAT_IS, CVNWhatIsWindow.class);

		windowKeyToClassMap.put(SubWindowKey.DELETE_TRADE, DeleteTradeSubWindow.class);

		windowKeyToClassMap.put(SubWindowKey.PRIVACY_POLICY, PrivacyPolicyWindow.class);
	}

	@Override
	protected void showView(AbstractView view) {
		mainLayout.getContentLayout().removeAllComponents();
		mainLayout.getContentLayout().addComponent(view.getMainComponent());
		scrollIntoView(mainLayout.getTopLayout());
	}

	public void closeLoadingSubWindow() {
		removeWindow(subWindowsMap.get(SubWindowKey.CMN_LOADING));
	}

	public void logon(SecurityInfo securityInfo) {
		try {
			super.logon(securityInfo);

			mainLayout.showUserMenu();

			mainLayout.setLoginInfo(getCurrentSecurityInfo().getUser().getUserFullName());
			mainLayout.setLoginDate(new Date());

			// navigateTo(ViewKey.HOME_PROCESS.toString());
			navigateTo(ViewKey.TN_SEARCH.toString());
		} catch (Exception ex) {
			super.showInfoMsgWindow("MainWindow.logon exception: \n" + ex.getMessage());
		}
	}

	public void logout() {
		// getApplication().setLogoutURL(getURL().toString() + "#SCR_LOGON");
		setFragment(getURL().toString() + "#SCR_LOGON");
		getApplication().close();
	}

	public MainLayout getMainLayout() {
		return mainLayout;
	}

}
