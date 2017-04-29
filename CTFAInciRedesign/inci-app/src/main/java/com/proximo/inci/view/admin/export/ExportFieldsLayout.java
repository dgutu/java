/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.export;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.util.ComponentUtil;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.PopupDateField;

@SuppressWarnings("serial")
public class ExportFieldsLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private static Logger logger = LoggerFactory.getLogger(ExportFieldsLayout.class);

    public static final String FORM_DATE_FIELD_WIDTH = "108px";
    
    private ExportView parentView;

    private PopupDateField fromDate;
    private PopupDateField toDate;
    private Button exportButton;

    public ExportFieldsLayout(ExportView parentView) {
        this.parentView = parentView;
        
        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        mainComponent.addStyleName("grayBackgroundColor");
        mainComponent.addStyleName("roundedCorners");

        fromDate = new PopupDateField();
        fromDate.setCaption(CaptionResolver.getCaption("view.admin.export.from_date"));
        fromDate.setResolution(PopupDateField.RESOLUTION_DAY);
        fromDate.setWidth(FORM_DATE_FIELD_WIDTH);

        toDate = new PopupDateField();
        toDate.setCaption(CaptionResolver.getCaption("view.admin.export.to_date"));
        toDate.setResolution(PopupDateField.RESOLUTION_DAY);
        toDate.setWidth(FORM_DATE_FIELD_WIDTH);

        exportButton = ComponentUtil.createActionButton("export", new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                parentView.export();
            }
        });
    }

    @Override
    protected void addContent() {
        addSearchFields();
    }

    private void addSearchFields() {
        logger.debug("Adding search fields");

        mainComponent.setSizeFull();

        HorizontalLayout h1 = new HorizontalLayout();
        HorizontalLayout h11 = new HorizontalLayout();
        h11.setWidth("100px");
        h1.addComponent(h11);
        FormLayout lastNameFormLayout = new FormLayout();
        lastNameFormLayout.addComponent(fromDate);
        h1.addComponent(lastNameFormLayout);
        HorizontalLayout h12 = new HorizontalLayout();
        h12.setWidth("50px");
        h1.addComponent(h12);
        mainComponent.addComponent(h1);

        HorizontalLayout h2 = new HorizontalLayout();
        HorizontalLayout h21 = new HorizontalLayout();
        h21.setWidth("50px");
        h2.addComponent(h21);
        FormLayout formLayout2 = new FormLayout();
        formLayout2.addComponent(toDate);
        formLayout2.addComponent(exportButton);
        h2.addComponent(formLayout2);
        HorizontalLayout h22 = new HorizontalLayout();
        h22.setWidth("100px");
        h2.addComponent(h22);
        mainComponent.addComponent(h2);
        mainComponent.setComponentAlignment(h2, Alignment.TOP_RIGHT);

        logger.debug("Adding search fields finished");
    }
    
    public void clear() {
        fromDate.setValue(null);
        toDate.setValue(null);
    }

    public PopupDateField getFromDate() {
        return fromDate;
    }

    public PopupDateField getToDate() {
        return toDate;
    }

}
