/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.search.form.fields.left;

//import java.util.Date;

import com.proximo.inci.component.common.CategoryField;
//import com.proximo.inci.common.TDate;
import com.proximo.inci.component.common.SpacingComponent;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.view.tradename.search.form.TradeNameSearchForm;
import com.proximo.inci.view.tradename.search.form.fields.TradeNameSearchFields;

public class TradeNameSearchFieldsLeft extends TradeNameSearchFields {

    private ApplicationNumberField appNoField;
    private TradeNameField tradeNameField;
    private ExportStatusField exportStatusField;
    private CompanyField companyField;
    //private EntryDatesLayout entryDatesLayout;
    private CategoryField categoryField;

    public TradeNameSearchFieldsLeft(TradeNameSearchForm parentForm) {
        super(parentForm);
    }
    
    @Override
    protected void init() {
        super.init();
        
        appNoField = new ApplicationNumberField();
        tradeNameField = new TradeNameField();
        
        exportStatusField = new ExportStatusField(parentForm);
        exportStatusField.setAdminComponent(true);
        
        companyField = new CompanyField();
        companyField.setAdminComponent(true);
        
        //entryDatesLayout = new EntryDatesLayout();
        categoryField = new CategoryField(TradeNameSearchForm.FORM_TEXT_FIELD_WIDTH, "tradeName.search.categoryField");
    }

    @Override
    protected void addContent() {
        addComponent(appNoField);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(tradeNameField);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addExportStatusField();
        addCompanyField();
        //addEntryDatesLayout();
        addComponent(categoryField);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
    }
    
    /*private void addEntryDatesLayout() {
        addComponent(entryDatesLayout);
        SpacingComponent spacingComponent = ComponentUtil.createNormalSpacingComponent();
        addComponent(spacingComponent);
    }*/   

    private void addExportStatusField() {
        addComponent(exportStatusField);
        SpacingComponent spacingComponent = ComponentUtil.createNormalSpacingComponent();
        addComponent(spacingComponent);
        spacingComponent.setAdminComponent(true);
    }

    private void addCompanyField() {
        addComponent(companyField);
        SpacingComponent spacingComponent = ComponentUtil.createNormalSpacingComponent();
        addComponent(spacingComponent);
        spacingComponent.setAdminComponent(true);
    }

    public void clear() {
        appNoField.setValue("");
        tradeNameField.setValue("");
        exportStatusField.setValue("A");
        companyField.setValue("");
        //entryDatesLayout.clear();
        categoryField.setValue(null);
    }

    public String getAppNoFieldValue() {
        return (String) appNoField.getValue();
    }
    
    public void setAppNoFieldValue(String value) {
    	appNoField.setValue(value);
    }

    public String getTradeNameFieldValue() {
        return (String) tradeNameField.getValue();
    }
    
    public void setTradeNameFieldValue(String value) {
    	tradeNameField.setValue(value);
    }

    public String getExportStatusFieldValue() {
        return (String) exportStatusField.getValue();
    }
    
    public void setExportStatusFieldValue(String value) {
    	exportStatusField.setValue(value);
    }    

    public String getCompanyFieldValue() {
        return (String) companyField.getValue();
    }
    
    public void setCompanyFieldValue(String value) {
    	companyField.setValue(value);
    }       

    /*public Date getEntryDateFromFieldValue() {
        return entryDatesLayout.getEntryDateFromFieldValue();
    }

    public Date getEntryDateToFieldValue() {
        return entryDatesLayout.getEntryDateToFieldValue();
    }   
    
    public EntryDateFromField getEntryDateFromField() {
        return entryDatesLayout.getEntryDateFromField();
    }
    
    public EntryDateToField getEntryDateToField() {
        return entryDatesLayout.getEntryDateToField();
    }*/
    
    public String getCategoryFieldValue() {
        return (String) categoryField.getValue();
    }

    public CategoryField getCategoryField() {
    	return categoryField;
    }

}
