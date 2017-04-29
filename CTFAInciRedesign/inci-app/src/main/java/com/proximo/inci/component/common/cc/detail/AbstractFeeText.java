/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.cc.detail;

import com.proximo.inci.component.AbstractInciComponent;
import com.proximo.inci.view.BaseView;
import com.vaadin.ui.Label;

public abstract class AbstractFeeText extends AbstractInciComponent<Label> {

    protected BaseView parentView;

    public AbstractFeeText(BaseView parentView) {
        this.parentView = parentView;

        build();
    }

    @Override
    protected Label createMainComponentInstance() {
        return new Label();
    }

}
