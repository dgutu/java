/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.extra;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOList;
import com.proximo.inci.DOLookupValue;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.common.LookupService;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.proximo.inci.view.tradename.detail.mode.TradeNameDetailViewMode;
import com.vaadin.ui.OptionGroup;

public class ChemStructQuestionOptGrp extends TradeNameExtraDetailsField<OptionGroup> {
	private static Logger logger = LoggerFactory.getLogger(ChemStructQuestionOptGrp.class);
	
    public ChemStructQuestionOptGrp(ChemStructQuestionOptGrpLayout parentLayout) {
        super(parentLayout);
    }

    @Override
    protected OptionGroup createMainComponentInstance() {
        return new OptionGroup();
    }

    @Override
    protected void init() {
        mainComponent.addStyleName("horizontal");
        fillOptions();
        setRequired(true);
    }

    private void fillOptions() {
        DOList chemStructQAnswers = LookupService.getFormTnChemStructQAnswers();
        for (int i = 0; i < chemStructQAnswers.size(); i++) {
            DOLookupValue lv = (DOLookupValue) chemStructQAnswers.elementAt(i);
            ComponentUtil.addItemWithCaption(mainComponent, lv.keyValue, lv.keyDesc);
        }
    }

    @Override
    public void generateContent() {
    	logger.debug("ChemStructQuestionOptGrp.generateContent() - END");
        TradeNameDetailView parentView = getParentLayout().getParentDetails().getParentView();
        TradeNameDetailViewMode mode = parentView.getMode();

        if (TradeNameDetailViewMode.CREATE.equals(mode)) {
            setValue(null);
        } else {
            setValue(parentView.getFormTn().chemStructOpt);
        }

    	/*
    	 * when the flag is 'Y', but the application already has a submit date, the only fields the user can edit 
    	 * is the user response and/or upload new attachments,
    	 * all other fields should be read-only
    	 */
    	
    	if (parentView.isEditable() && 
    			!parentView.getCurrentSecurityInfo().getUser().isAdmin() && 
    			parentView.getFormTn().submitted && parentView.getFormTn().editable)
    		setEnabled(false);           
    	else
    		setEnabled(parentView.isEditable());
    	
        logger.debug("ChemStructQuestionOptGrp.generateContent() - END");
    }

    @Override
    public String getFieldDescription() {
        return CaptionResolver.getCaption("tradeName.detail.chemStructQuestionOptGrp.DESC");
    }

}
