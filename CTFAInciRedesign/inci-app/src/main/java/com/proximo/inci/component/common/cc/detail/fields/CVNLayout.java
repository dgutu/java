/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.cc.detail.fields;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.cc.detail.AbstractCreditCardDetailLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;

public class CVNLayout extends AbstractInciComponentLayout<HorizontalLayout> {

	private AbstractCreditCardDetailLayout	creditCardDetailLayout;

	private CVNField						cvnField;
	private CVNWhatIsLink					cvnWhatIsLink;

	public CVNLayout(AbstractCreditCardDetailLayout creditCardDetailLayout) {
		this.creditCardDetailLayout = creditCardDetailLayout;

		build();
	}

	@Override
	protected HorizontalLayout createMainComponentInstance() {
		return new HorizontalLayout();
	}

	@Override
	protected void init() {
		mainComponent.setCaption(CaptionResolver.getCaption("credit_card.detail.cvn"));
		mainComponent.addStyleName("required-field");

		cvnField = new CVNField(creditCardDetailLayout);
		cvnWhatIsLink = new CVNWhatIsLink(creditCardDetailLayout.getParentView());
	}

	@Override
	protected void addContent() {
		addComponent(cvnField);
		addSpace();
		addComponent(cvnWhatIsLink, Alignment.MIDDLE_CENTER);
	}

	public CVNField getCvnField() {
		return cvnField;
	}
}
