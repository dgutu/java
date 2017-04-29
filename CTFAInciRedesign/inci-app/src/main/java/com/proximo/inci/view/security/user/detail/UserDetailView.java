/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.security.user.detail;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.common.cc.detail.CreditCardDetailLayout;
import com.proximo.inci.component.common.security.company.CompanyFormLayout;
import com.proximo.inci.component.common.security.user.UserFormLayout;
import com.proximo.inci.component.util.ButtonWidth;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.security.SecurityService;
import com.proximo.inci.service.security.user.User;
import com.proximo.inci.service.user_info.UserInfoService;
import com.proximo.inci.url.UrlResolver;
import com.proximo.inci.view.BaseView;
import com.proximo.inci.window.main.MainWindow;
import com.vaadin.terminal.ExternalResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class UserDetailView extends BaseView {
	
	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(UserDetailView.class);

    public static final String FORM_WIDTH = "900px";

    public static final String USER_REC_ID_NAVIG_PARAM_KEY = "userRecId";
    public static final String PARENT_VIEW_NAVIG = "view";

    private User user;

    private Button.ClickListener resetButtonListener;
    private Button.ClickListener cancelButtonListener;   
    private Button.ClickListener saveButtonListener;

    private ActionButtonLayout headerActionButtonLayout;
    private UserFormLayout userFormLayout;
    private CompanyFormLayout companyFormLayout;
    private CreditCardDetailLayout creditCardDetailLayout;
    private ActionButtonLayout footerActionButtonLayout;
    
    // variable to identify the source/parent view that open the user information
    // this is used for Exit button to know where to redirect the view
    private String parentViewNavig;

    public UserDetailView(MainWindow mainWindow) {
        super(mainWindow, true, "view.security.user.detail");
    }

    @Override
    protected void init() {
        super.init();

        mainComponent.setWidth(FORM_WIDTH);

        resetButtonListener = createResetButtonListener();
        cancelButtonListener = createCancelButtonListener();
        saveButtonListener = createSaveButtonListener();
        
        headerActionButtonLayout = new ActionButtonLayout(this);
        
        userFormLayout = new UserFormLayout();
        userFormLayout.setEditable(false);

        companyFormLayout = new CompanyFormLayout();
        companyFormLayout.setEditable(false);

        creditCardDetailLayout = new CreditCardDetailLayout(this);
        //creditCardDetailLayout.setEditable(false);

        footerActionButtonLayout = new ActionButtonLayout(this);
    }

    @Override
    protected void addContent() {
        super.addContent();

        addComponent(headerActionButtonLayout);        
        //
        addSpace();
        mainComponent.addComponent(ComponentUtil.createButtonWithInfoWidthSet("createChangeContactInformaion", createChangeContactInformationBtnListener(), "createChangeContactInformaion.DESCR", ButtonWidth.XXLARGE));
        //
        addSpace();
        addComponent(userFormLayout);
        addSpace();
        addComponent(companyFormLayout);
        addSpace();
        addComponent(creditCardDetailLayout, Alignment.MIDDLE_CENTER);
        addSpace();
        addComponent(footerActionButtonLayout);
    }

    private Button.ClickListener createResetButtonListener() {
        return new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                reset();
            }
        };
    }
    
    private Button.ClickListener createCancelButtonListener() {
        return new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
            	cancel();
            }
        };
    }   
    
    private Button.ClickListener createChangeContactInformationBtnListener() {
        return new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
            	changeContactInformation();
            }
        };
    } 
    
    private Button.ClickListener createSaveButtonListener() {
        return new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
            	// check mandory fields before cc save
            	String validation = creditCardDetailLayout.getCreditCardFieldsLayout().getCreditCardFields().checkMandatoryFields();
            	
            	if (TemplarUtil.isStringNullOrEmpty(validation))
            		saveCCUserInformation();
            	else
            		showInfoMsgWindow(validation);
            }
        };
    }     

    @Override
    public void applyNavigationParameters(Map<String, Object> navigationParameterMap) {
    	String userRecID = "";
    	String navigView = "";
    	
    	try {
	    	if (navigationParameterMap.get(USER_REC_ID_NAVIG_PARAM_KEY) != null)
	    		userRecID = navigationParameterMap.get(USER_REC_ID_NAVIG_PARAM_KEY).toString();
	    	
	    	if (navigationParameterMap.get(PARENT_VIEW_NAVIG) != null)
	    		navigView = navigationParameterMap.get(PARENT_VIEW_NAVIG).toString();
	    	
	    	//logger.debug("userRecID=" + userRecID);
	    	//logger.debug("navigView=" + navigView);
	    	
	        //if (!userRecID.isEmpty() && !navigView.isEmpty())
	        regenerateContent(userRecID, navigView);
    	}
    	catch(Exception ex) {    		
    	}
    }

    public void regenerateContent(String userRecId, String parentViewNavigation) {
    	parentViewNavig = parentViewNavigation;
    	
        //if (mainWindow.getCurrentSecurityInfo().getUser().getUserRecId().equals(userRecId))
        user = SecurityService.findUserByRecId(userRecId);
    	//user = getCurrentSecurityInfo().getUser();
        
        // set main user
        if (mainWindow.getCurrentSecurityInfo().getUser().getUserRecId().equals(userRecId))
        	mainWindow.getCurrentSecurityInfo().setUser(user);        
        
        userFormLayout.setUser(user);
        userFormLayout.generateContent();

        companyFormLayout.setUserCompany(user.getUserCompany());
        companyFormLayout.generateContent();

        creditCardDetailLayout.setUserCC(UserInfoService.getUserDefaultCreditCard(userRecId));
        creditCardDetailLayout.generateContent();
    }

    public void reset() {
        regenerateContent(user.getUserRecId(), parentViewNavig);
    }
    
    public void cancel() {
    	if (!TemplarUtil.isStringNullOrEmpty(backURL))
    		navigateTo(backURL);
    }
    
    public void changeContactInformation() {    	
    	mainWindow.open(new ExternalResource(UrlResolver.getUrl("user.contact.information")), "_blank");
    }
    
    public void saveCCUserInformation() {
    	// save user CC information
		UserInfoService.saveUserCreditCard(creditCardDetailLayout.prepareUserCC());
    	
		// show popup message
		showInfoMsgWindow(CaptionResolver.getCaption("myprofile.save.message"));
		
		// refresh the page content
		reset();
    }

    public Button.ClickListener getResetButtonListener() {
        return resetButtonListener;
    }
    
    public Button.ClickListener getCancelButtonListener() {
    	return cancelButtonListener;
    }
    
    public Button.ClickListener getSaveButtonListener() {
    	return saveButtonListener;
    }
    
    public User getUser() {
        return user;
    }
    
    public String getParentViewNavig() {
    	return parentViewNavig;
    }

}
