/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.cc.detail.fields;

import com.proximo.inci.component.AbstractInciComponent;
import com.proximo.inci.view.BaseView;
import com.proximo.inci.window.SubWindowKey;
import com.vaadin.ui.Button;

public class CVNWhatIsLink extends AbstractInciComponent<Button> {

    protected BaseView parentView;

    public CVNWhatIsLink(BaseView parentView) {
        this.parentView = parentView;

        build();
    }

    @Override
    protected Button createMainComponentInstance() {
        return parentView.createShowSubWndwBtn("credit_card.detail.cvn.what_is_this", SubWindowKey.CC_CVN_WHAT_IS);
    }

    @Override
    protected void init() {
        mainComponent.addStyleName("link");
    }

}
