/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/


package com.proximo.inci.view.admin.misc_text_maint.search;

import com.proximo.inci.caption.CaptionResolver;
//import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.SpacingComponent;
import com.proximo.inci.component.util.ComponentUtil;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class MTMForm extends AbstractInciComponentLayout<VerticalLayout> {
	
	// constant
	public static final String FORM_TEXT_FIELD_WIDTH = "200px";
	
	// local variable
	private MTMView parentView;
	private MTMActionButtonsLayout actionButtonsLayout;
	
	private TextField text;	
	
    public MTMForm(MTMView parentView) {
        this.parentView = parentView;

        build();
    }

	@Override
	protected VerticalLayout createMainComponentInstance() {
		return new VerticalLayout();
	}

	@Override
	protected void init() {
        mainComponent.setSpacing(false);
        mainComponent.setMargin(true);
        
        mainComponent.addStyleName("grayBackgroundColor");
        mainComponent.addStyleName("roundedCorners");
        
        //mainComponent.setWidth("600px");
        
        text = new TextField(CaptionResolver.getCaption("view.admin.misc_text_maint_report.text_field"));
        text.setWidth(FORM_TEXT_FIELD_WIDTH);        

        actionButtonsLayout = new MTMActionButtonsLayout(this);		
	}
	
    @Override
    protected void addContent() {    	
    	HorizontalLayout h = new HorizontalLayout();
    	FormLayout form = new FormLayout();    	
    	
    	form.addComponent(new SpacingComponent(ComponentUtil.NORMAL_FORM_SPACING_PX).getMainComponent());
    	form.addComponent(text);
    	
    	// add form to HorizontalLayout
    	h.addComponent(form);    	
    	
    	// add component text 
        mainComponent.addComponent(h);
        
        // add buttons clear and search 
        addComponent(actionButtonsLayout);        
    }
	
    public MTMView getParentView() {
        return parentView;
    }
    
    public MTMActionButtonsLayout getActionButtonsLayout() {
    	return this.actionButtonsLayout;
    }
    
    public String getTextValue() {
    	if (this.text.getValue() != null)
    		return this.text.getValue().toString();
    	else return "";
    }
    
    public void setTextValue(String value) {
    	this.text.setValue(value);
    }
    
    public void clearForm() {
    	this.text.setValue("");
    }
}
