/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.archive.search.form.fields.left;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

//import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.common.CategoryField;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.view.tradename.archive.search.form.TradeNameArchiveSearchForm;
import com.proximo.inci.view.tradename.archive.search.form.fields.TradeNameArchiveSearchFields;

public class TradeNameArchiveSearchFieldsLeft extends TradeNameArchiveSearchFields {

	//private static Logger logger = LoggerFactory.getLogger(TradeNameArchiveSearchFieldsLeft.class);	
	
    private TradeNameField tradeNameField;
    private CategoryField categoryField;
    private CompanyField companyField;

    public TradeNameArchiveSearchFieldsLeft(TradeNameArchiveSearchForm parentForm) {
        super(parentForm);
    }

    @Override
    protected void init() {
        super.init();

        tradeNameField = new TradeNameField();
        categoryField = new CategoryField(TradeNameArchiveSearchForm.FORM_TEXT_FIELD_WIDTH,
                "view.trade_name.archive.search.category");
        companyField = new CompanyField();
    }

    @Override
    protected void addContent() {
        addComponent(tradeNameField);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(categoryField);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(companyField);
    }

    public void clear() {
        tradeNameField.setValue("");
        categoryField.setValue(null);
        companyField.setValue("");
    }

    public TradeNameField getTradeNameField() {
        return tradeNameField;
    }

    public CategoryField getCategoryField() {
        return categoryField;
    }

    public CompanyField getCompanyField() {
        return companyField;
    }
    
    /*@Override
    public String validate() {    	
    	String validationErrorStr = null;
    	
    	
    	logger.debug("tradeNameField="+tradeNameField.getValue());
    	logger.debug("categoryField="+categoryField.getValue());
    	logger.debug("companyField="+companyField.getValue());
    	
    	
    	if (tradeNameField.getValue() == null && categoryField.getValue() == null && companyField.getValue() == null) {    		
    		validationErrorStr = CaptionResolver.getCaption("view.trade_name.archive.search.validation.error.msg");
    	}
    	
    	if ((tradeNameField.getValue()!= null && tradeNameField.getValue().toString().isEmpty()) &&
    		(categoryField.getValue() != null && categoryField.getValue().toString().isEmpty())  &&
    		(companyField.getValue()  != null && companyField.getValue().toString().isEmpty())) {    		
    		validationErrorStr = CaptionResolver.getCaption("view.trade_name.archive.search.validation.error.msg");
    	}    		    	
    	
		return validationErrorStr;    	
    }*/

}
