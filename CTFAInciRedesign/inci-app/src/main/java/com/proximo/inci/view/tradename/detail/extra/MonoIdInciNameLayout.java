package com.proximo.inci.view.tradename.detail.extra;

import com.vaadin.ui.HorizontalLayout;

public class MonoIdInciNameLayout extends TradeNameExtraDetailsComponentLayout<HorizontalLayout> {
	
	private MonoIdFieldLayout monoIdField;
	private InciNameTextAreaLayout inciNameTextArea;
	
    public MonoIdInciNameLayout(TradeNameExtraDetails parentDetails) {
		super(parentDetails);
	}

	@Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

	@Override
	protected void init() {
		//setAdminComponent(true);
		
		monoIdField = new MonoIdFieldLayout(getParentDetails());
		inciNameTextArea = new InciNameTextAreaLayout(getParentDetails());		
	}

    @Override
    protected void addContent() {
    	addComponent(inciNameTextArea);        
    	addSpace();
    	addSpace();
    	addComponent(monoIdField);        
    }
    
    public MonoIdFieldLayout getMonoIdFieldLayout() {
    	return monoIdField;
    }
    
    public InciNameTextAreaLayout getInciNameTextAreaLayout() {
    	return inciNameTextArea;
    }
}
