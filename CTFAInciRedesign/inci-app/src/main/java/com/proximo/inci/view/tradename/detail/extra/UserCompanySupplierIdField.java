/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.extra;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.vaadin.ui.TextField;

public class UserCompanySupplierIdField extends TradeNameExtraDetailsField<TextField> {

    public UserCompanySupplierIdField(UserCompanySupplierIdFieldLayout parentLayout) {
        super(parentLayout);
    }

    @Override
    protected TextField createMainComponentInstance() {
        return new TextField();
    }

    @Override
    protected void init() {
        mainComponent.setCaption(CaptionResolver.getCaption("view.trade_name.detail.user_company_supplier_id"));
    }
    
    @Override
    public void generateContent() {
        TradeNameDetailView parentView = getParentLayout().getParentDetails().getParentView();

        setValue(parentView.getFormTn().userCompanySupplierId);
        
    	/*
    	 * The regular user should not see the Supplier ID fields for Contact and Publisher 
    	 * on the application before or after submitting the application.  
    	 * Only Admin sees those fields.  All versions of the forms.
    	 */
    	
    	if (!parentView.getCurrentSecurityInfo().getUser().isAdmin())
    		setVisible(false);
    	else
    		setEnabled(parentView.isEditable());
    }

    @Override
    public String getFieldDescription() {
        return CaptionResolver.getCaption("view.trade_name.detail.user_company_supplier_id.DESC");
    }

}
