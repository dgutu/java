/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.extra;

import com.vaadin.ui.FormLayout;

public class PublicationCompanySupplierIdFieldLayout extends TradeNameExtraDetailsComponentLayout<FormLayout> {

    private PublicationCompanySupplierIdField publicationCompanySupplierIdField;

    public PublicationCompanySupplierIdFieldLayout(TradeNameExtraDetails parentDetails) {
        super(parentDetails);
    }

    @Override
    protected FormLayout createMainComponentInstance() {
        return new FormLayout();
    }

    @Override
    protected void init() {
        publicationCompanySupplierIdField = new PublicationCompanySupplierIdField(this);
    }

    @Override
    protected void addContent() {
        addComponent(publicationCompanySupplierIdField);
    }

    public PublicationCompanySupplierIdField getPublicationCompanySupplierIdField() {
        return publicationCompanySupplierIdField;
    }

}
