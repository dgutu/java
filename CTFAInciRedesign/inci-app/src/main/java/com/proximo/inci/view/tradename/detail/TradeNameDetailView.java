/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Vector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.caption.ValidationErrorStrUtils;
import com.proximo.inci.common.TDate;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.service.common.EmailService;
import com.proximo.inci.service.security.SecurityInfo;
import com.proximo.inci.service.security.SecurityService;
import com.proximo.inci.service.security.user.User;
import com.proximo.inci.service.tradename.CsvTradeNameExportService;
import com.proximo.inci.service.tradename.PrintTnFormPdfService;
import com.proximo.inci.service.tradename.TradeNameService;
import com.proximo.inci.service.tradename.archive.TradeNameArchiveService;
import com.proximo.inci.view.BaseView;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.tradename.archive.search.TradeNameArchiveSearchView;
import com.proximo.inci.view.tradename.detail.button.ButtonClickListenerFactory;
import com.proximo.inci.view.tradename.detail.category.TradeNameDetails;
import com.proximo.inci.view.tradename.detail.category.bio.BiotechBioengineeringTradeNameDetails;
import com.proximo.inci.view.tradename.detail.category.botanic.BotanicalsTradeNameDetails;
import com.proximo.inci.view.tradename.detail.category.chem.GeneralChemistryOthersTradeNameDetails;
import com.proximo.inci.view.tradename.detail.category.ferments.FermentsTradeNameDetails;
import com.proximo.inci.view.tradename.detail.category.inorganic.InorganicMineralBasedTradeNameDetails;
import com.proximo.inci.view.tradename.detail.category.polymers.PolymersSiliconsTradeNameDetails;
import com.proximo.inci.view.tradename.detail.extra.TradeNameExtraDetails;
import com.proximo.inci.view.tradename.detail.footer.TradeNameDetailViewFooter;
import com.proximo.inci.view.tradename.detail.header.TradeNameDetailViewHeader;
import com.proximo.inci.view.tradename.detail.mode.TradeNameDetailViewMode;
import com.proximo.inci.view.utils.ButtonPressed;
import com.proximo.inci.window.SubWindowKey;
import com.proximo.inci.window.main.MainWindow;
import com.proximo.inci.window.subwindow.DeleteTradeSubWindow;
import com.proximo.inci.window.subwindow.tradename.PrepareForSubmissionWindow;
import com.proximo.inci.window.subwindow.tradename.SaveAsWindow;
import com.proximo.inci.window.subwindow.tradename.admin_comments.AdminCommentsWindow;
import com.vaadin.terminal.StreamResource;
import com.vaadin.terminal.StreamResource.StreamSource;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Component;
import com.proximo.inci.view.tradename.detail.assignmentnotice.AssignmentPDF; 

/**
 * Trade name application detail view. Used to create/read/update trade name
 * application.
 */
public class TradeNameDetailView extends BaseView {

    private static Logger logger = LoggerFactory.getLogger(TradeNameDetailView.class);

    private static final String CAPTION_CREATE = CaptionResolver.getCaption("tradeName.detail.create.caption");

    private static final String CAPTION_READ_OR_UPDATE_PREFIX = CaptionResolver
            .getCaption("tradeName.detail.readOrUpdate.caption.prefix");

    /* Navigation parameters' keys */
    public static final String MODE_NAVIG_PARAM_KEY = "mode";
    public static final String FORM_TN_REC_ID_NAVIG_PARAM_KEY = "formTnRecId";
    public static final String CATEGORY_ID_NAVIG_PARAM_KEY = "categoryId";

    private TradeNameDetailViewMode mode;

    private DOTradeName formTn;

    private TradeNameDetailViewHeader header;

    private Map<Integer, Class<? extends TradeNameDetails>> categoryToDetailsClassMap;
    //private Map<Integer, TradeNameDetails> tradeNameDetailsMap;

    private TradeNameDetails currentTradeNameDetails;

    private TradeNameExtraDetails extraDetails;

    private TradeNameDetailViewFooter footer;

    private ClickListener cancelButtonListener;
    private ClickListener saveButtonListener;
    private ClickListener saveAsButtonListener;
    private ClickListener resetButtonListener;
    private ClickListener submitButtonListener;
    private ClickListener printFormButtonListener;
    private ClickListener exportButtonListener;
    private ClickListener deleteButtonListener;
    private ClickListener commentsButtonListener;
    private ClickListener assignmentNoticeButtonListener;
    private ClickListener sendAssignmentEmailListener;
    private ClickListener unarchiveListener;
    
    // the string will be used to determine which button was pressed
    private ButtonPressed buttonPressed;     	
    
    // used to check if refresh trade result 
    private boolean refreshSearchResult = false;

    public TradeNameDetailView(MainWindow mainWindow) {
        super(mainWindow, true, null);
    }

    @Override
    protected void init() {
        super.init();

        cancelButtonListener = ButtonClickListenerFactory.createCancelButtonListener(this);
        saveButtonListener = ButtonClickListenerFactory.createSaveButtonListener(this);
        saveAsButtonListener = ButtonClickListenerFactory.createSaveAsButtonListener(this);
        resetButtonListener = ButtonClickListenerFactory.createResetButtonListener(this);
        submitButtonListener = ButtonClickListenerFactory.createSubmitButtonListener(this);
        printFormButtonListener = ButtonClickListenerFactory.createPrintFormButtonListener(this);
        exportButtonListener = ButtonClickListenerFactory.createExportButtonListener(this);
        deleteButtonListener = ButtonClickListenerFactory.createDeleteButtonListener(this);
        commentsButtonListener = ButtonClickListenerFactory.createCommentsButtonListener(this);
        assignmentNoticeButtonListener = ButtonClickListenerFactory.createAssignNoticeButtonListener(this);
        sendAssignmentEmailListener = ButtonClickListenerFactory.createSendAssignmentEmailListener(this);
        unarchiveListener = ButtonClickListenerFactory.createUnarchiveButtonListener(this);

        header = new TradeNameDetailViewHeader(this);

        initTradeNameDetailsClassMap();

        extraDetails = new TradeNameExtraDetails(this);

        footer = new TradeNameDetailViewFooter(this);
    }

    private void initTradeNameDetailsClassMap() {
        logger.debug("Initializing trade name details class map");

        //tradeNameDetailsMap = new HashMap<Integer, TradeNameDetails>();

        categoryToDetailsClassMap = new HashMap<Integer, Class<? extends TradeNameDetails>>();

        categoryToDetailsClassMap.put(1, FermentsTradeNameDetails.class);
        categoryToDetailsClassMap.put(2, BotanicalsTradeNameDetails.class);
        categoryToDetailsClassMap.put(3, PolymersSiliconsTradeNameDetails.class);
        categoryToDetailsClassMap.put(4, GeneralChemistryOthersTradeNameDetails.class);
        categoryToDetailsClassMap.put(5, BiotechBioengineeringTradeNameDetails.class);
        categoryToDetailsClassMap.put(6, InorganicMineralBasedTradeNameDetails.class);

        logger.debug("Initializing trade name details class map finished");
    }

    private TradeNameDetails initDetails(Integer categoryId) {
        logger.debug("Initializing details for category id={}", categoryId);

        try {
            TradeNameDetails tradeNameDetails = (TradeNameDetails) categoryToDetailsClassMap.get(categoryId)
                    .getConstructors()[0].newInstance(this);
            //tradeNameDetailsMap.put(categoryId, tradeNameDetails);
            tradeNameDetails.applySecurityInfo(getCurrentSecurityInfo());
            logger.debug("Initializing details for category id={} finished", categoryId);
            return tradeNameDetails;
        } catch (Exception e) {
            String categoryIdStr = "null";
            if (categoryId != null) {
                categoryIdStr = categoryId.toString();
            }
            logger.error("Unable to initialize the trade name details for category id=" + categoryIdStr, e);
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void addContent() {
        super.addContent();

        addComponent(header);
        addSpace();
        addSpace();
        addSpace();
        addComponent(extraDetails);
        addSpace();
        addComponent(footer);
    }

    /**
     * MODE_NAVIG_PARAM_KEY - required.
     */
    @Override
    public void applyNavigationParameters(Map<String, Object> navigationParameterMap) {
    	if (navigationParameterMap != null && navigationParameterMap.size()>0) {
    		mode = (TradeNameDetailViewMode) navigationParameterMap.get(MODE_NAVIG_PARAM_KEY);    	

    		prepareView((Integer) navigationParameterMap.get(CATEGORY_ID_NAVIG_PARAM_KEY),
    					(Long) navigationParameterMap.get(FORM_TN_REC_ID_NAVIG_PARAM_KEY));
    	}	

        regenerateContent();
    }

    private void prepareView(Integer categoryId, Long formTnRecId) {
        if (TradeNameDetailViewMode.CREATE.equals(mode)) {
            prepareViewForCreate(categoryId);
        } else {
            prepareViewForReadOrUpdate(formTnRecId);
        }
    }

    public void reset() {
    	buttonPressed = ButtonPressed.RESET;
    	
        prepareView(formTn.categoryID, formTn.recID);

        regenerateContent();
    }

    private void prepareViewForCreate(int categoryId) {
        formTn = new DOTradeName();
        formTn.categoryID = categoryId;

        User user = getCurrentSecurityInfo().getUser();
        formTn.userRecId = user.getUserRecId();

        setViewCaption(CAPTION_CREATE);
    }

    private void prepareViewForReadOrUpdate(Long formTnRecId) {
        //formTn = TradeNameService.getTradeName(formTnRecId, getCurrentSecurityInfo().getUser().getLoginId());
    	// refresh trade data from db
        refreshTradeData(formTnRecId);

        setViewCaption(CAPTION_READ_OR_UPDATE_PREFIX + " " + formTn.tnNumber + ")");
    }

    private void regenerateContent() {
        header.generateContent();
        generateDetails();
        extraDetails.generateContent();
        footer.generateContent();
    }

    private void generateDetails() {
        logger.debug("Generating details");

        int headerIndex = mainComponent.getComponentIndex(header.getMainComponent());

        Component oldTradeNameDetails = null;
        try {
            oldTradeNameDetails = mainComponent.getComponent(headerIndex + 2);            
        } catch (IndexOutOfBoundsException iobe) {
        }

        if (oldTradeNameDetails != null) {
            mainComponent.removeComponent(oldTradeNameDetails);
        }        
        
        if (currentTradeNameDetails != null) {
        	currentTradeNameDetails.clearChildComponents();
        }
        
        //currentTradeNameDetails = tradeNameDetailsMap.get(formTn.categoryID);
        //if (currentTradeNameDetails == null) {
        currentTradeNameDetails = initDetails(formTn.categoryID);
        //}

        currentTradeNameDetails.generateContent();

        addComponent(currentTradeNameDetails, headerIndex + 2);

        logger.debug("Generating details finished");
    }

    public void goBackToPreviousView() {    	
    	// Exit button pressed
    	buttonPressed = ButtonPressed.EXIT;
    	
        if (!TradeNameDetailViewMode.READ.equals(mode) && areFieldsModified()) {
	        Map<String, Object> parameters = new HashMap<String, Object>();		        
	        parameters.put("parentForm", getCurrentClassInstance()); // pass current class inctance
            showSubWindow(SubWindowKey.TN_CANCEL);
        } else {
        	navigateBackToSearchView();
        }
    }
    
    public void navigateBackToSearchView() {
    	// navigate to search view
    	navigateTo(backURL);    	
    }
    
    private boolean areFieldsModified() {
	        return header.areFieldsModified() || currentTradeNameDetails.areFieldsModified()
	                || extraDetails.areFieldsModified();
    }

    /**
     * Based on UI components values sets attribute values in formTn.
     */
    public void prepareFormTn() {
        header.prepareFormTn();
        currentTradeNameDetails.prepareFormTn();
        extraDetails.prepareFormTn();
    }

    // Save Button
    public void handleSaveFormTn() {
    	buttonPressed = ButtonPressed.SAVE;
    	
    	// save the application
        String validationErrorStr = validateApp();//saveFormTn();
        
        if (validationErrorStr == null) {
        	
         	// the application is submitted already and user press Save Button 
        	if (formTn.submitted) {
        		
        		/*
        		 * If the INCI Application is not yellow (meaning no outstanding comments) and 
        		 * the Administrator clicks on Edit, then please disable the “Submit” button. 
        		 * At the same time, if the user clicks on “Save” display the following message: 
        		 * “All changes have been saved.”
        		 * 
        		 * when an application is a submitted application and it does NOT have an outstanding comment and 
        		 * the ADMIN user clicks on the Edit buttons, then disable the “Submit” button and when they click “Save”, 
        		 * instead of the message from the prior email, just display: “All changes have been saved successfully.” 
        		 * in the popup.
        		 * 
        		 * */
        		
        		if (getCurrentSecurityInfo().getUser().isAdmin() && !getFormTn().hasOutstdComments) {
        			saveFormTn();
        			mainWindow.showInfoMsgWindow(CaptionResolver.getCaption("tradeName.detail.save.success_admin_no_out_emails"));
        		}
        		else {
        			showInfoMsgWindowWithCaptionAndButtonText(CaptionResolver.getCaption("tradeName.detail.save.success"), true, CaptionResolver.getCaption("information_message_window.save.caption"), "save.okButton", getCurrentClassInstance());
        		}
        	}	
        	else	
        		showInfoMsgWindowWithCaptionAndButtonText(CaptionResolver.getCaption("tradeName.detail.save.success.notsubmitted"), true, CaptionResolver.getCaption("information_message_window.save.caption"), "save.okButton", getCurrentClassInstance());
        }
        else {
        	showInfoMsgWindow(validationErrorStr);
        }
    }

    // Submit Button
    public void submitFormTn() {
    	buttonPressed = ButtonPressed.SUBMIT;
    	
    	// save application
        //String validationErrorStr = saveFormTn();
    	String validationErrorStr = validateApp();

        if (validationErrorStr == null) {        	
        	if (formTn.submitted)
        		showInfoMsgWindowWithCaptionAndButtonText(CaptionResolver.getCaption("tradeName.detail.after.first.submit"), true, CaptionResolver.getCaption("information_message_window.submit.caption"), "submit.okButton", getCurrentClassInstance());        	
        	else
        	{
	            Map<String, Object> prepareForSubmitWindowParams = new HashMap<String, Object>();
	            // current application
	            prepareForSubmitWindowParams.put(PrepareForSubmissionWindow.FORM_TN_PARAM_KEY, formTn);
	            
	            // View key to navigate back from Payment View
	            prepareForSubmitWindowParams.put(PrepareForSubmissionWindow.BACK_VIEW, backURL);
	            
	            // class instance
	            prepareForSubmitWindowParams.put(PrepareForSubmissionWindow.PARENT_VIEW, getCurrentClassInstance());	            
	            mainWindow.showSubWindow(SubWindowKey.TN_PREPARE_SUBMIT, prepareForSubmitWindowParams);
        	}
        }
        else {
        	showInfoMsgWindow(validationErrorStr);
        }
    }

    // SaveAs button
    public void saveAsFormTn() {
    	
    	buttonPressed = ButtonPressed.SAVEAS;
    	
        /*String validationErrorStr = null;
        if (!TradeNameDetailViewMode.READ.equals(mode)) {
        	saveButtonPressed = "saveAs"; // saveAs button was pressed 
            validationErrorStr = saveFormTn();
        }

        if (validationErrorStr == null) {*/
	    Map<String, Object> parameters = new HashMap<String, Object>();
	    parameters.put(SaveAsWindow.FORM_TN_PARAM_KEY, formTn);
	    showSubWindow(SubWindowKey.TN_SAVE_AS, parameters);
        //}
    }
    
    /** 
     * @return validate error string 
     */
    public String validateApp() {
    	
    	/*
    	 * 1. validate if application in EDIT mode
    	 * 2. validate if application is not archived 	  
    	 * */
    	
    	if (isEditable() ||
    		(!TemplarUtil.isStringNullOrEmpty(getFormTn().is_archive) && !getFormTn().is_archive.equals("Y"))) {
    		return validate();
    	}
    	
    	return null;
    }    

    /**
     * @return null if save was performed successfully, otherwise validation
     *         error string, if some of the fields were invalid.
     */
    public String saveFormTn() {    	
    	// validate the application
    	String validationErrorStr = validateApp();
    	
    	// get export Dt before save. It'll use to check if staff review date was changed
    	TDate exportDt = formTn.exportDt;
    	
    	// all fields are valid
        if (validationErrorStr == null) {
        	
        	// prepare TradeNameDteail class with data input on application form
            prepareFormTn();

            // user information
            User currentUser = getCurrentSecurityInfo().getUser();
            
            // save trade information into database
            @SuppressWarnings("rawtypes")
			Vector retVec = TradeNameService.saveFormTnServiceCall(formTn, currentUser.getUserRecId(),
                    currentUser.getLoginId(), buttonPressed.toString());
            
            int retCode = ((Integer) retVec.elementAt(2)).intValue();          // result of save_trade_name SP
            
            // check the result of save_trade_name SP
            if (-3 == retCode) {
            	String errorMessage = "Database error, duplicate record found!";
            	if (buttonPressed.equals(ButtonPressed.SAVE))
            		mainWindow.showInfoMsgWindow(CaptionResolver.getCaption("trade.save.duplicate.msg"));
            	else
            		mainWindow.showInfoMsgWindow(CaptionResolver.getCaption("trade.saveAs.duplicate.msg"));
            	
           		return errorMessage;
            }

            // out parameters
            formTn.recID = ((Long) retVec.elementAt(0)).longValue();           			// recID
            formTn.tnNumber = (String) retVec.elementAt(1);                    			// tn_number
            formTn.editable = ((Boolean) retVec.elementAt(3)).booleanValue();  			// is_reguser_editable flag            
            formTn.submitDt = (TDate) retVec.elementAt(4);                      		// submit_date
            formTn.submitted = !formTn.submitDt.isNull();                               // application is submitted
            formTn.hasOutstdComments = ((Boolean) retVec.elementAt(5)).booleanValue();  // application has outstanding comments
            
            // after application was saved
            afterTnFormSaved();

            // refresh after save
            refreshAfterSave();
            
            // send Staff Email if staff date was changed
            if (!formTn.exportDt.isNull() && !exportDt.equals(formTn.exportDt)) {
            	logger.debug("send staff review email: YES");
            	sendStaffEmail();
            }
            
        } else {
            showInfoMsgWindow(validationErrorStr);
        }

        return validationErrorStr;
    }

    private void afterTnFormSaved() {
        extraDetails.afterTnFormSaved();
    }

    // refresh application after save
    private void refreshAfterSave() {
    	// change application mode
        if (TradeNameDetailViewMode.CREATE.equals(mode)) {
            mode = TradeNameDetailViewMode.UPDATE;
        }
        
        // if is not Admin and application is not editable to the user put View/Read mode
        if (!getCurrentSecurityInfo().getUser().isAdmin() && !getFormTn().editable) {
        	mode = TradeNameDetailViewMode.READ;
        }
        
        // set Detail View caption with application tn_number
        setViewCaption(CAPTION_READ_OR_UPDATE_PREFIX + " " + formTn.tnNumber + ")");
        
        // refresh after save 
        refreshTradeData(formTn.recID);
    }

    // comments button
    public void handleComments() {
    	buttonPressed = ButtonPressed.COMMENTS;
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put(AdminCommentsWindow.FORM_TN_PARAM_KEY, formTn);
        parameters.put("parentForm", getCurrentClassInstance()); // pass current class inctance
        showSubWindow(SubWindowKey.TN_ADMIN_COMMENTS, parameters);
    }

    public void handleSenEmailAntcpDt() {
    	buttonPressed = ButtonPressed.COMMITEE_REVIEW_DATE_SEND_EMAIL;
        String validationErrorStr = saveFormTn();
        if (validationErrorStr == null) {
            sendAntcpDtRelatedEmail();
        }
    }

    /** Sends anticipated review date email. **/
    public void sendAntcpDtRelatedEmail() {
        try {
            final String subject = "INCI Application No. " + formTn.tnNumber + " Name Assignment Status.";
            final String htmlMessage = "Your INCI name application will be reviewed at the International Nomenclature Committee " +
            						   "meeting scheduled on " + formTn.reviewDt.formatIt(TDate.MMDDYYYY) + ".<BR><BR>" +

            						   "You will receive further email correspondence about the outcome of the International Nomenclature Committee's " + 
            						   "review of your application <u>approximately</u> four weeks after the meeting date.<BR><BR>" +
            						   
									   "**** This is an AUTOMATED MESSAGE and this email address CANNOT RECEIVE REPLIES. " +
									   "For assistance, please send questions/inquiries to: inci@personalcarecouncil.org. ****";
            
            // get trade user
            User user = null;
            
            try {
            	if (!formTn.userRecId.equals(getCurrentSecurityInfo().getUser().getUserRecId())) {
            		user = SecurityService.findUserByRecId(formTn.userRecId);
            		logger.debug("sendAntcpDtRelatedEmail go to NETFORUM.formTn.userRecId=" + formTn.userRecId);
            		logger.debug("sendAntcpDtRelatedEmail go to NETFORUM.getCurrentSecurityInfo().getUser().getUserRecId()=" + getCurrentSecurityInfo().getUser().getUserRecId());
            	}
            	else
            		user = getCurrentSecurityInfo().getUser();
            }
            catch (Exception ex) {
            	logger.error("sendAntcpDtRelatedEmail.SecurityService.findUserByRecId NETFORUM error: " + ex.getLocalizedMessage());
            }    
            
            String userEmail = user.getEmail();            
            EmailService.sendHtml(userEmail, userEmail, subject, htmlMessage);
            
            showInfoMsgWindow(CaptionResolver.getCaption("sendAntcpDtRelatedEmail.message"));
        } catch (Throwable t) {
            logger.error("sendAntcpDtRelatedEmail.Unable to send email", t);
            throw new RuntimeException(t);
        }
    }
    
    /** Sends staff review email. **/
    public void sendStaffEmail() {
        try {
        	//String url = getApplication().getURL().toString(); 
        	
            final String subject = "INCI Application No. " + formTn.tnNumber + " Name Assignment Status.";            
            
            final String htmlMessage = "Your INCI application has been received and is being reviewed. " +
            						   "The INCI Name assignment notification and official letter will be sent " + 
            		                   "electronically at the completion of the review process. Please note, you will " + 
            						   "be contacted via email if further information is required; and a prompt reply to " +
            		                   "this request will facilitate the assignment process. Please be sure that your email " +
            						   "settings accept mail from inci@personalcarecouncil.org. " +
            						   "For further details, please refer to the Council’s home page: <a href=\"www.personalcarecouncil.org\">www.personalcarecouncil.org</a>";
            		                   //"For further details, please refer to the <a href=\"" + url + "html/ctfa-process.jpg\">INCI process flow chart</a> or the " + 
            						   //"<a href=\"" + url + "html/nameAssignmentTimetable.html\">INCI Application/Name Assignment Timetable</a>.";
            		            
            // get trade user
            User user = null;
            
            try {
            	if (!formTn.userRecId.equals(getCurrentSecurityInfo().getUser().getUserRecId())) {
            		user = SecurityService.findUserByRecId(formTn.userRecId);
            		logger.debug("sendStaffEmail go to NETFORUM.formTn.userRecId=" + formTn.userRecId);
            		logger.debug("sendStaffEmail go to NETFORUM.getCurrentSecurityInfo().getUser().getUserRecId()=" + getCurrentSecurityInfo().getUser().getUserRecId());
            	}
            	else
            		user = getCurrentSecurityInfo().getUser();
            }
            catch (Exception ex) {
            	logger.error("sendStaffEmail.SecurityService.findUserByRecId NETFORUM error: " + ex.getLocalizedMessage());
            }            

            String userEmail = user.getEmail();
            EmailService.sendHtml(userEmail, userEmail, subject, htmlMessage);
            
        } catch (Throwable t) {
            logger.error("sendStaffEmail.Unable to send email", t);
            throw new RuntimeException(t);
        }
    }    

    public void handleSendAssignmentEmail() {
    	buttonPressed = ButtonPressed.SEND_ASSIGN_EMAIL;
        
    	/*
    	 *  THE ASSIGNMENT DATE FIELD is filled out by our Admin staff and does not change when you click on either of those buttons.  
    	 *  The email and letter uses the date from the Assignment Date field.  
    	 *  That field doesn't change until someone from our Admin staff changes it.
    	 */    	
        Date inciNameDtValue = new Date();        
        if (getCurrentSecurityInfo().getUser().isAdmin() && TemplarUtil.isObjNullOrEmpty(extraDetails.getInciNameDateFieldLayout().getInciNameDateField().getValue())) {
        	// Assignment Date 
        	extraDetails.getInciNameDateFieldLayout().getInciNameDateField().setValue(inciNameDtValue);    	
        }
    	
        String validationErrorStr = saveFormTn();
        if (validationErrorStr == null) {
            sendAssignmentEmail();
        }
    }

    public void sendAssignmentEmail() {
        try {
        	
        	String url = getApplication().getURL().toString();
        	
            final String subject = "INCI Application No. " + getFormTn().tnNumber + " Name Assignment";
            
            final String htmlMessage = "Please see the attached letter for the INCI name assignment in reference to:" + "<BR>" +  
            						   "<BR>" +
            						   "Application No. " + getFormTn().tnNumber + "<BR>" +
            						   "Trade Name: " + getFormTn().tradeName + "<BR>" +
            						   "<BR>" +
            						   "Please keep accurate records of your applications and INCI name assignments for future reference. " +
            						   //"For information on how to petition for a revision in an INCI name assignment, consult the <a href=\"" + url + "html/INCI_FAQs.html\">INCI FAQs</a> " +
            						   //"in the Introduction to the application system: <a href=\"http://inci.personalcarecouncil.org/\">http://inci.personalcarecouncil.org/</a>." + "<BR>" +
            						   "For information on how to petition for a revision in an INCI name assignment, consult the Council’s home page: <a href=\"www.personalcarecouncil.org\">www.personalcarecouncil.org</a>" + "<BR>" +
            						   "<BR>" +
            						   "**** This is an AUTOMATED MESSAGE and CANNOT RECEIVE REPLIES.****";
            
            // get trade user
            User user = null;
            try {
            	if (!formTn.userRecId.equals(getCurrentSecurityInfo().getUser().getUserRecId())) {
            		user = SecurityService.findUserByRecId(formTn.userRecId);
            		logger.debug("sendAssignmentEmail go to NETFORUM.formTn.userRecId=" + formTn.userRecId);
            		logger.debug("sendAssignmentEmail go to NETFORUM.getCurrentSecurityInfo().getUser().getUserRecId()=" + getCurrentSecurityInfo().getUser().getUserRecId());
            	}
            	else
            		user = getCurrentSecurityInfo().getUser();
            }
            catch (Exception ex) {
            	logger.error("sendAssignmentEmail.SecurityService.findUserByRecId NETFORUM error: " + ex.getLocalizedMessage());
            }
            
            // generate assignment PDF            
            String basepath = getApplication().getContext().getBaseDirectory().getAbsolutePath() + "/VAADIN/themes/inci-app-theme/images/";            
            byte[] pdf = AssignmentPDF.asssignmentNoticeAttachment(formTn, user, basepath);
            
            // send email with attachment
            String userEmail = user.getEmail();
            EmailService.sendHtmlAttachement(userEmail, userEmail, subject, htmlMessage, pdf);
            
            showInfoMsgWindow(CaptionResolver.getCaption("sendAssignmentEmail.message"));
        } catch (Throwable t) {
            logger.error("sendAssignmentEmail.Unable to send email", t);
            mainWindow.showInfoMsgWindow("sendAssignmentEmail.Unable to send email: \n" + t.getMessage());            
        }
    }

    public void printFormPdf() {
    	buttonPressed = ButtonPressed.PRINT;
    	
        String fileName = formTn.tnNumber + ".pdf";

        final byte[] pdfContent = PrintTnFormPdfService
                .producePdf(formTn, getCurrentSecurityInfo().getUser().isAdmin());

        StreamSource streamSource = new StreamSource() {
            /**
			 * 
			 */
			private static final long serialVersionUID = -8115268242273178525L;

			@Override
            public InputStream getStream() {
                return new ByteArrayInputStream(pdfContent);
            }
        };

        StreamResource streamResource = new StreamResource(streamSource, fileName, getApplication());

        /* Do not display in a browser, but let the file to be downloaded. */        
        streamResource.getStream().setParameter("Content-Disposition", "attachment;filename=\"" + fileName + "\"");
        streamResource.setMIMEType("application/octet-stream");
        streamResource.setCacheTime(5000); // fix for IE

        mainWindow.open(streamResource, "_blank");        
    }
    
    public void handleExportFormTn() {
    	buttonPressed = ButtonPressed.EXPORT;
    	
        if (TradeNameDetailViewMode.READ.equals(mode)) {
            exportFormTn();
        } else {
            String validationErrorStr = validate();
            
            if (TemplarUtil.isStringNullOrEmpty(validationErrorStr)) {
            	validationErrorStr = checkFieldsBeforeExport();
            	
            	if (TemplarUtil.isStringNullOrEmpty(validationErrorStr)) {
            		exportFormTn();
            	}
            	else {
            		showInfoMsgWindow(validationErrorStr);
            	}
           }
        }
    }
    
    private void exportFormTn() {
        //prepareFormTn();

        String fileName = CsvTradeNameExportService.generateSingleTNExportResultFileName(formTn);

        final byte[] fileContent = CsvTradeNameExportService.exportSingleTradeName(formTn);

        CsvTradeNameExportService.uploadExportResultFile(fileContent, fileName);

        StreamSource streamSource = new StreamSource() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 3173588524879073726L;

			@Override
            public InputStream getStream() {
                return new ByteArrayInputStream(fileContent);
            }
        };

        StreamResource streamResource = new StreamResource(streamSource, fileName, getApplication());

        /* Do not display in a browser, but let the file to be downloaded. */
        streamResource.getStream().setParameter("Content-Disposition", "attachment;filename=\"" + fileName + "\"");
        streamResource.setMIMEType("application/octet-stream");
        streamResource.setCacheTime(5000); // fix for IE
        
        //mainWindow.open(streamResource, "_blank"); // open file in new window
        showInfoMsgWindow(fileName + " successfully generated.");
    }
    
    public void handleUnarchiveFormTn() {
    	buttonPressed = ButtonPressed.UNARCHIVE;
        TradeNameArchiveService.removeTnFromArchive(formTn.recID, getCurrentSecurityInfo().getUser().getLoginId());
        
        TradeNameArchiveSearchView archiveSearchView = (TradeNameArchiveSearchView) mainWindow
                .getView(ViewKey.TN_ARCHIVE_SEARCH);
        archiveSearchView.clearSearchFormAndResults();
        
        navigateBack();
    }
    
    public void handleDeleteTn() {
    	buttonPressed = ButtonPressed.DELETE;
    	
		// show Are you sure subwindow
        Map<String, Object> parameters = new HashMap<String, Object>();		        
        parameters.put(DeleteTradeSubWindow.PARENT_VIEW_KEY, getCurrentClassInstance()); // pass current class inctance
		showSubWindow(SubWindowKey.DELETE_TRADE, parameters);    	
    }    
    
    /* delete trade from database */
    public int deleteTn() {
    	
    	int retCode = 0;
    	
    	try {
    		if (getFormTn().recID != 0)
    			retCode = TradeNameService.deleteTradeName(getFormTn().recID);
    	}
    	catch(Exception ex) {
    		throw new RuntimeException(ex);
    	}
    	
    	return retCode;
    }
    
    /*public void handleAssignNotice() {
    	buttonPressed = ButtonPressed.ASSIGN_NOTICE;
    	
    }*/    

    @Override
    public void applySecurityInfo(SecurityInfo securityInfo) {
        header.applySecurityInfo(securityInfo);
        //applySecurityInfoForTradeNameDetailsMap(securityInfo);
        extraDetails.applySecurityInfo(securityInfo);
        footer.applySecurityInfo(securityInfo);
    }

    /*private void applySecurityInfoForTradeNameDetailsMap(SecurityInfo securityInfo) {
        for (Entry<Integer, TradeNameDetails> entry : tradeNameDetailsMap.entrySet()) {
            entry.getValue().applySecurityInfo(securityInfo);
        }
    }*/

    public boolean isEditable() {
        return !TradeNameDetailViewMode.READ.equals(mode);
    }
    
    public ButtonPressed getButtonPressed() {
    	return buttonPressed;
    }

    public TradeNameDetailViewMode getMode() {
        return mode;
    }

    public DOTradeName getFormTn() {
        return formTn;
    }    

    public ClickListener getCancelButtonListener() {
        return cancelButtonListener;
    }

    public ClickListener getSaveButtonListener() {
        return saveButtonListener;
    }

    public ClickListener getSaveAsButtonListener() {
        return saveAsButtonListener;
    }

    public ClickListener getResetButtonListener() {
        return resetButtonListener;
    }

    public ClickListener getSubmitButtonListener() {
        return submitButtonListener;
    }

    public ClickListener getPrintFormButtonListener() {
        return printFormButtonListener;
    }
    
    public ClickListener getExportButtonListener() {
        return exportButtonListener;
    }    

    public ClickListener getDeleteButtonListener() {
        return deleteButtonListener;
    }

    public ClickListener getCommentsButtonListener() {
        return commentsButtonListener;
    }

    public ClickListener getAssignmentNoticeButtonListener() {
        return assignmentNoticeButtonListener;
    }

    public ClickListener getSendAssignmentEmailListener() {
        return sendAssignmentEmailListener;
    }

    public ClickListener getUnarchiveListener() {
        return unarchiveListener;
    }

    public TradeNameDetails getCurrentTradeNameDetails() {
        return currentTradeNameDetails;
    }
    
    protected TradeNameDetailView getCurrentClassInstance() {
    	return this;
    }
    
    public TradeNameExtraDetails getExtraDetails() {
    	return extraDetails;
    }
    
    // check if application is new
    public boolean checkIfRefreshSearchResult() {
    	return refreshSearchResult;
    }
    
    // check fields before Export button pressed
    public String checkFieldsBeforeExport() {
    	if (TemplarUtil.isStringNullOrEmpty(extraDetails.getUserCompanySupplierIdFieldLayout().getUserCompanySupplierIdField().getValue().toString())) {
    		return ValidationErrorStrUtils.getFieldIsRequiredMsg(extraDetails.getUserCompanySupplierIdFieldLayout().getUserCompanySupplierIdField());
    	}
    	
    	if (TemplarUtil.isStringNullOrEmpty(extraDetails.getPubCompanySupplierIdFieldLayout().getPublicationCompanySupplierIdField().getValue().toString())) {
    		return ValidationErrorStrUtils.getFieldIsRequiredMsg(extraDetails.getPubCompanySupplierIdFieldLayout().getPublicationCompanySupplierIdField());
    	}    
    	
    	return null;
    }
    
    // refresh trade data from database 
    public void refreshTradeData(Long formTnRecId) {
    	formTn = TradeNameService.getTradeName(formTnRecId, getCurrentSecurityInfo().getUser().getLoginId());
    	regenerateContent();
    }    
}
