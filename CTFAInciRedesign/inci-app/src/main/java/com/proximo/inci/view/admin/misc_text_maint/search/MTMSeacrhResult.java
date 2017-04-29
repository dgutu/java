/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.misc_text_maint.search;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOCMSText;
import com.proximo.inci.DOList;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.AbstractInciComponent;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.admin.misc_text_maint.detail.MTMDetailView;
import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Table;

public class MTMSeacrhResult extends AbstractInciComponent<Table> {

	private static Logger logger = LoggerFactory.getLogger(MTMSeacrhResult.class);
	
    private MTMSearchResultLayout parentLayout;
		
	public MTMSeacrhResult(MTMSearchResultLayout parentLayout) {
		this.parentLayout = parentLayout;
        build();        
    }

    
	@Override
	protected Table createMainComponentInstance() {
		return new Table();
	}

	@Override
	protected void init() {
	}
	
    /**
     * Not called in init(). Called whenever search is performed.
     */
    private void initializeTable(DOList searchResult) {
        mainComponent.setSizeFull();
        mainComponent.addStyleName("mtm-search-table");

        initializeTableColumns();
        useSearchResult(searchResult);
    }
    
    public void reInitialize(DOList searchResult) {
        build();
        initializeTable(searchResult);
    }    
    
    private void initializeTableColumns() {
        mainComponent.addContainerProperty(
                CaptionResolver.getCaption("view.admin.misc_text_maint_report.table.column.id"),
                String.class, null);
        mainComponent.addContainerProperty(
                CaptionResolver.getCaption("view.admin.misc_text_maint_report.table.column.title"), 
                String.class, null);
        mainComponent.addContainerProperty(
                CaptionResolver.getCaption("view.admin.misc_text_maint_report.search.table.column.action"),
                AbstractOrderedLayout.class, null);        
    }
    
    private void useSearchResult(DOList searchResult) {
        mainComponent.setPageLength(searchResult.size());

        for (int i = 0; i < searchResult.size(); i++) {
        	DOCMSText doCMSTExt = (DOCMSText) searchResult.elementAt(i);            

            mainComponent.addItem(
                    new Object[] { doCMSTExt.getCMSUid(),
                    			   doCMSTExt.getCMSTitle(),
                    			   createActionsLayout(doCMSTExt) }, i);
        }
    }
    
    private HorizontalLayout createActionsLayout(final DOCMSText cmsText) {
        HorizontalLayout actionsLayout = new HorizontalLayout();

        Embedded editPic = new Embedded(null, new ThemeResource("images/edit.gif"));
        editPic.addListener(new ClickListener() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            public void click(ClickEvent event) {
                Map<String, Object> parameters = new HashMap<String, Object>();                
                parameters.put(MTMDetailView.MTM_CMS_UID,  cmsText.getCMSUid());
                parameters.put(MTMDetailView.MTM_CMS_TITLE, cmsText.getCMSTitle());
                parameters.put(MTMDetailView.MTM_CMS_TEXT, cmsText.getCMSText());
                try {
                	parentLayout.getParentView().navigateTo(ViewKey.ADMIN_MISC_TEXT_MAINT_DETAIL.toString(), parameters, parentLayout.getParentView().getCurrentView());
                }
                catch(Exception ex) {
                	logger.debug(ex.getMessage());
                }
            }
        });
        editPic.addStyleName("cursor-pointer");
        actionsLayout.addComponent(editPic);

        return actionsLayout;
    }

    
}
