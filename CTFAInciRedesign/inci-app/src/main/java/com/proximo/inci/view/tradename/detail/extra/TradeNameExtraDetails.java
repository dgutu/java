/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.extra;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.common.TDate;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.HtmlLabelComponent;
import com.proximo.inci.component.common.SpacingComponent;
import com.proximo.inci.component.common.security.company.CompanyFormLayout;
import com.proximo.inci.component.common.security.user.UserFormLayout;
import com.proximo.inci.service.security.SecurityService;
import com.proximo.inci.service.security.user.User;
import com.proximo.inci.service.security.user.UserCompany;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.proximo.inci.view.tradename.detail.button.SendAssignmentEmailButton;
import com.proximo.inci.view.tradename.detail.extra.attachments.TnAttachmentsListLayout;
import com.proximo.inci.view.tradename.detail.mode.TradeNameDetailViewMode;
import com.vaadin.ui.VerticalLayout;


public class TradeNameExtraDetails extends AbstractInciComponentLayout<VerticalLayout> {
	
	private static Logger logger = LoggerFactory.getLogger(TradeNameDetailView.class);
    public static final String FORM_WIDTH = "900px";

    private TradeNameDetailView parentView;

    private ChemStructQuestionOptGrpLayout chemStructQuestionOptGrpLayout;
    private TnAttachmentsListLayout tnAttachmentsListLayout;
    private PublishQuestionOptGrpLayout publishQuestionOptGrpLayout;
    private ExportQuestionLayout exportQuestionOptGrpLayout;
    private OutstdCommentsCheckBoxLayout outstdCommentsCheckBoxLayout;
    private InciNameDateFieldLayout inciNameDateFieldLayout;
    private SendAssignmentEmailButton sendAssignmentEmailButton;
    private UserFormLayout userFormLayout;
    private CompanyFormLayout userCompanyFormLayout;
    private UserCompanySupplierIdFieldLayout userCompanySupplierIdFieldLayout;
    private CompanyFormLayout publicationCompanyFormLayout;
    private PublicationCompanySupplierIdFieldLayout publicationCompanySupplierIdFieldLayout;
    private MonoIdInciNameLayout monoIdInciNameLayout;

    public TradeNameExtraDetails(TradeNameDetailView parentView) {
        this.parentView = parentView;

        build();
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
    	
    	//DOTradeName formTn = parentView.getFormTn();
        
        //String userRecId = parentView.getFormTn().userRecId;
        //User user = SecurityService.findUserByRecId(userRecId);
        
        mainComponent.setWidth(FORM_WIDTH);

        chemStructQuestionOptGrpLayout = new ChemStructQuestionOptGrpLayout(this);
        tnAttachmentsListLayout = new TnAttachmentsListLayout(this);
        publishQuestionOptGrpLayout = new PublishQuestionOptGrpLayout(this);
        exportQuestionOptGrpLayout = new ExportQuestionLayout(this);
        outstdCommentsCheckBoxLayout = new OutstdCommentsCheckBoxLayout(this);
        //inciNameTextAreaLayout = new InciNameTextAreaLayout(this);
        monoIdInciNameLayout = new MonoIdInciNameLayout(this);
        inciNameDateFieldLayout = new InciNameDateFieldLayout(this); // Assignment Date
        //monoIdFieldLayout = new MonoIdFieldLayout(this);
        sendAssignmentEmailButton = new SendAssignmentEmailButton(parentView);
        
        // Contact User Information
        userFormLayout = new UserFormLayout();
        //userFormLayout.setUser(user);
        userFormLayout.setEditable(false);        
        
        // Contact Company Information
        userCompanyFormLayout = new CompanyFormLayout();
        //userCompanyFormLayout.setUserCompany(user.getUserCompany());
        userCompanyFormLayout.setEditable(false);        
        
        userCompanySupplierIdFieldLayout = new UserCompanySupplierIdFieldLayout(this);
        
        // Publication Company
        publicationCompanyFormLayout = new CompanyFormLayout("tradeName.detail.pub_company.title");
        //publicationCompanyFormLayout.setUserCompany(new UserCompany(formTn.pubCompany));
        //publicationCompanyFormLayout.setEditable(parentView.isEditable());
        
        publicationCompanySupplierIdFieldLayout = new PublicationCompanySupplierIdFieldLayout(this);
    }

    @Override
    protected void addContent() {
        addComponent(chemStructQuestionOptGrpLayout);
        addSpace();
        addComponent(tnAttachmentsListLayout);
        addSpace();
        addComponent(publishQuestionOptGrpLayout);
        addSpace();

        HtmlLabelComponent spacingAfterExportQuestionOptGrpLayout = new HtmlLabelComponent("&nbsp;");
        spacingAfterExportQuestionOptGrpLayout.setAdminComponent(true);
        addComponent(exportQuestionOptGrpLayout);
        addComponent(spacingAfterExportQuestionOptGrpLayout);

        addComponent(outstdCommentsCheckBoxLayout);
        addSpace();
        addComponent(monoIdInciNameLayout);
        //addSpacing(3);
        addSpace();
        addComponent(inciNameDateFieldLayout);

        SpacingComponent spacingBeforeSendAssignmentEmailButton = new SpacingComponent(3);
        spacingBeforeSendAssignmentEmailButton.setAdminComponent(true);
        addComponent(spacingBeforeSendAssignmentEmailButton);
        addComponent(sendAssignmentEmailButton);

        addSpace();
        addComponent(userFormLayout);
        addSpace();
        addComponent(userCompanyFormLayout);
        addSpace();
        addComponent(userCompanySupplierIdFieldLayout);
        addSpace();
        addComponent(publicationCompanyFormLayout);
        addSpace();
        addComponent(publicationCompanySupplierIdFieldLayout);
    }

    @Override
    public void generateContent() {
    	logger.debug("TradeNameExtraDetails.generateContent() - START");
    	try
    	{
	    	/*
	    	 * when the flag is 'Y', but the application already has a submit date, the only fields the user can edit 
	    	 * is the user response and/or upload new attachments,
	    	 * all other fields should be read-only
	    	 */
    		
    		DOTradeName formTn = parentView.getFormTn();	        
	        String userRecId = parentView.getFormTn().userRecId;
	        User user = null;	        
	        
	        if (TemplarUtil.isStringNullOrEmpty(userRecId))
	        	userRecId = parentView.getCurrentSecurityInfo().getUser().getUserRecId();
	        
	        // if loged user is different that trade_name user go to netforum
	        // to get user info based on trade_name user cst_key
	        if (!userRecId.toUpperCase().equals(parentView.getCurrentSecurityInfo().getUser().getUserRecId().toUpperCase())) {
	        	user = SecurityService.findUserByRecId(userRecId);
	        }
	        else
	        	user = parentView.getCurrentSecurityInfo().getUser();	        
    		
	        if (user != null) {
	        	userFormLayout.setUser(user);
	        	userCompanyFormLayout.setUserCompany(user.getUserCompany());
	        }	
	        
	        // Publication Company
	        if (parentView.getMode().equals(TradeNameDetailViewMode.CREATE))
	        	publicationCompanyFormLayout.setUserCompany(new UserCompany()); // new application
	        else
	        	publicationCompanyFormLayout.setUserCompany(new UserCompany(formTn.pubCompany)); // existing application
	        
	    	if (parentView.isEditable() && 
	    			!parentView.getCurrentSecurityInfo().getUser().isAdmin() && 
	    			parentView.getFormTn().submitted && parentView.getFormTn().editable)
	    		publicationCompanyFormLayout.setEditable(false);   
	    	else
	    		publicationCompanyFormLayout.setEditable(parentView.isEditable());
	        
    		super.generateContent();
    	}   
        catch(Exception ex)
        {
        	logger.debug("TradeNameExtraDetails.generateContentex() - Exception ERROR: " + ex.getMessage());
        	throw new RuntimeException(ex);
        }
        logger.debug("TradeNameExtraDetails.generateContent() - END");
    }

    /**
     * Based on UI components values sets attribute values in formTn.
     */
    public void prepareFormTn() {
        DOTradeName formTn = parentView.getFormTn();

        formTn.published = (Boolean) publishQuestionOptGrpLayout.getPublishQuestionOptGrp().getValue();

        tnAttachmentsListLayout.prepareFormTn();

        formTn.chemStructOpt = (String) chemStructQuestionOptGrpLayout.getChemStructQuestionOptGrp().getValue();
        formTn.inciName = (String) monoIdInciNameLayout.getInciNameTextAreaLayout().getInciNameTextArea().getValue();

        Date inciNameDtValue = (Date) inciNameDateFieldLayout.getInciNameDateField().getValue(); // Assignment Date
        if (inciNameDtValue != null) {
            formTn.inciNameDt = new TDate(inciNameDtValue);
        } else {
            formTn.inciNameDt.setNull();
        }

        Date exportDtValue = (Date) exportQuestionOptGrpLayout.getExportQuestionDateField().getValue();
        
        if (exportDtValue != null) {
            formTn.exportDt = new TDate(exportDtValue);
        } else {
            formTn.exportDt.setNull();        
        }
        
        formTn.userCompanySupplierId = (String) userCompanySupplierIdFieldLayout.getUserCompanySupplierIdField()
                .getValue();

        if (publicationCompanyFormLayout.isEditable()) {
            publicationCompanyFormLayout.prepareFormTn(formTn);
        }
        
        formTn.publicationCompanySupplierId = (String) publicationCompanySupplierIdFieldLayout
                .getPublicationCompanySupplierIdField().getValue();
        
        formTn.monoId = (String) monoIdInciNameLayout.getMonoIdFieldLayout().getMonoIdField().getValue();
    }
    
    public boolean areFieldsModified() {
        DOTradeName formTn = parentView.getFormTn();
        
        if (publishQuestionOptGrpLayout.getPublishQuestionOptGrp().getMainComponent().getValue() == null)
        	logger.debug("############# getValue=NULL");        
        
        boolean fieldsModified = false;
        
        try {
        	fieldsModified = (formTn.published == (Boolean) publishQuestionOptGrpLayout.getPublishQuestionOptGrp().getMainComponent().getValue());
        }
        catch (Exception ex) {}
       
        if (!fieldsModified) {
        	logger.debug("TradeNameExtraDetails.areFieldsModified()");
        	logger.debug(new Boolean(formTn.published).toString());
        	logger.debug(((Boolean) publishQuestionOptGrpLayout.getPublishQuestionOptGrp().getValue()).toString());
        }        
        
        // chemStructOpt
        fieldsModified = (formTn.chemStructOpt.equals((String) chemStructQuestionOptGrpLayout.getChemStructQuestionOptGrp().getValue()));        
        if (!fieldsModified) {
        	logger.debug("TradeNameExtraDetails.areFieldsModified()");
            logger.debug(formTn.chemStructOpt);
            logger.debug((String) chemStructQuestionOptGrpLayout.getChemStructQuestionOptGrp().getValue());
            return true;
        }

        // inciName
        fieldsModified = (formTn.inciName.equals((String) monoIdInciNameLayout.getInciNameTextAreaLayout().getInciNameTextArea().getValue()));
        if (!fieldsModified) {
        	logger.debug("TradeNameExtraDetails.areFieldsModified()");
            logger.debug(formTn.inciName);
            logger.debug((String) monoIdInciNameLayout.getInciNameTextAreaLayout().getInciNameTextArea().getValue());
            return true;
        }
        
        // inciNameDateFieldLayout
        Date inciNameDtValue = null;
        inciNameDtValue = (Date) inciNameDateFieldLayout.getInciNameDateField().getValue();
        
        if (inciNameDtValue != null) {
            fieldsModified = (formTn.inciNameDt.equals(new TDate(inciNameDtValue)));
        } else {
            fieldsModified = (formTn.inciNameDt.equals(TDate.getNullDateObject()));
        }       
        
        if (!fieldsModified) {
        	try
        	{
        		logger.debug("TradeNameExtraDetails.areFieldsModified()");
	        	logger.debug("Inci Date: ");
	        	logger.debug(formTn.inciNameDt.toString());
	        	logger.debug(new TDate(inciNameDtValue).toString());
        	}
        	catch(Exception ex)
        	{
        		logger.debug(ex.getMessage());
        	}
            
            return true;
        }
        
        // exportQuestionOptGrpLayout
        Date exportDtValue = null;
        exportDtValue = (Date) exportQuestionOptGrpLayout.getExportQuestionDateField().getValue();
        if (exportDtValue != null) {
            fieldsModified = (formTn.exportDt.equals(new TDate(exportDtValue)));
        } else {
            fieldsModified = (formTn.exportDt.equals(TDate.getNullDateObject()));
        }
        
        if (!fieldsModified) {
        	try
        	{
        		logger.debug("TradeNameExtraDetails.areFieldsModified()");
	        	logger.debug("Export Date: ");
	        	logger.debug(formTn.exportDt.toString());
	        	logger.debug(new TDate(exportDtValue).toString());
        	}
        	catch(Exception ex)
        	{
        		logger.debug(ex.getMessage());
        	}
        	
            return true;
        }
        
        // userCompanySupplierId
        fieldsModified = (formTn.userCompanySupplierId.equals((String) userCompanySupplierIdFieldLayout.getUserCompanySupplierIdField().getValue()));
        
        if (!fieldsModified) {
        	logger.debug("TradeNameExtraDetails.areFieldsModified()");
        	logger.debug(formTn.userCompanySupplierId.toString());
        	logger.debug((String) userCompanySupplierIdFieldLayout
                    .getUserCompanySupplierIdField().getValue());
            return true;
        }
        
        // publicationCompanyFormLayout
        if (publicationCompanyFormLayout.isEditable()) {
            fieldsModified = publicationCompanyFormLayout.areFieldsModified(formTn);
        } else {
            fieldsModified = false;
        }

        if (fieldsModified) {
        	logger.debug("TradeNameExtraDetails.areFieldsModified()");
        	logger.debug("publicationCompanyFormLayout");
            return true;
        }
        
        // publicationCompanySupplierId
        fieldsModified = (formTn.publicationCompanySupplierId
                .equals((String) publicationCompanySupplierIdFieldLayout.getPublicationCompanySupplierIdField()
                        .getValue())); 
        
        if (!fieldsModified) {
        	logger.debug("TradeNameExtraDetails.areFieldsModified()");
        	logger.debug(formTn.userCompanySupplierId.toString());
        	logger.debug((String) userCompanySupplierIdFieldLayout
                    .getUserCompanySupplierIdField().getValue());        	
            return true;
        }
        
        // monoId
        fieldsModified = (formTn.monoId.equals((String) monoIdInciNameLayout.getMonoIdFieldLayout().getMonoIdField().getValue()));
        
        if (!fieldsModified) {
        	logger.debug("TradeNameExtraDetails.areFieldsModified()");
        	logger.debug(formTn.monoId.toString());
        	logger.debug((String) monoIdInciNameLayout.getMonoIdFieldLayout().getMonoIdField().getValue());        	
            return true;
        }
        
        return !fieldsModified;
    }    

    public void afterTnFormSaved() {
        tnAttachmentsListLayout.afterTnFormSaved();
    }

    public TradeNameDetailView getParentView() {
        return parentView;
    }
    
    // Assignment Date 
    public InciNameDateFieldLayout getInciNameDateFieldLayout() {
    	return this.inciNameDateFieldLayout;
    }
    
    // Staff Review
    public ExportQuestionLayout getExportQuestionOptGrpLayout() {
    	return this.exportQuestionOptGrpLayout;
    }
    
    public PublicationCompanySupplierIdFieldLayout getPubCompanySupplierIdFieldLayout() {
    	return this.publicationCompanySupplierIdFieldLayout;
    }
    
    public UserCompanySupplierIdFieldLayout getUserCompanySupplierIdFieldLayout() {
    	return this.userCompanySupplierIdFieldLayout;
    }
    
    public UserFormLayout getUserFormLayout() {
    	return userFormLayout;
    }

}
