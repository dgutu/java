/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.payment_clear.detail;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.view.admin.payment_clear.detail.fields.PaymentClearFieldsLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.VerticalLayout;

public abstract class AbstractPaymentClearInfoLayout extends AbstractInciComponentLayout<VerticalLayout> {

    protected AbstractPaymentClearDetailView parentView;

    private TitleLayout titleLayout;

    private PaymentClearFieldsLayout paymentClearFieldsLayout;

    public AbstractPaymentClearInfoLayout(AbstractPaymentClearDetailView parentView) {
        this.parentView = parentView;

        build();
    }

    public abstract String getTitleKey();
    public abstract String getNumberFieldCaptionKey();

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

        mainComponent.setWidth("600px");

        titleLayout = new TitleLayout(this);

        paymentClearFieldsLayout = new PaymentClearFieldsLayout(this);        
    }

    @Override
    protected void addContent() {
        addComponent(titleLayout, Alignment.TOP_CENTER);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(paymentClearFieldsLayout, Alignment.TOP_CENTER);
    }

    public AbstractPaymentClearDetailView getParentView() {
        return parentView;
    }

    public PaymentClearFieldsLayout getPaymentClearFieldsLayout() {
        return paymentClearFieldsLayout;
    }

}
