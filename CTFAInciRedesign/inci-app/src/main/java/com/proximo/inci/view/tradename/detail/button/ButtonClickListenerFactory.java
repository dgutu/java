/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.button;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

@SuppressWarnings("serial")
public class ButtonClickListenerFactory {

    /** Not intended to be instantiated. Exposed only static members. */
    private ButtonClickListenerFactory() {
    }

    public static ClickListener createCancelButtonListener(final TradeNameDetailView detailView) {
        return new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                detailView.goBackToPreviousView();
            }
        };
    }

    public static ClickListener createSaveButtonListener(final TradeNameDetailView detailView) {
        return new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                detailView.handleSaveFormTn();
            }
        };
    }

    public static ClickListener createSaveAsButtonListener(final TradeNameDetailView detailView) {
        return new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
            	if (detailView.getFormTn().recID == 0) {
            		detailView.showInfoMsgWindow(CaptionResolver.getCaption("first.save"));
            	}
            	else {
            		detailView.saveAsFormTn();
            	}
            }
        };
    }

    public static ClickListener createResetButtonListener(final TradeNameDetailView detailView) {
        return new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
            	detailView.reset();
            }
        };
    }

    public static ClickListener createSubmitButtonListener(final TradeNameDetailView detailView) {
        return new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                detailView.submitFormTn();
            }
        };
    }

    public static ClickListener createPrintFormButtonListener(final TradeNameDetailView detailView) {
        return new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
            	if (detailView.getFormTn().recID == 0)
            		detailView.showInfoMsgWindow(CaptionResolver.getCaption("first.save"));
            	else
            		detailView.printFormPdf();
            }
        };
    }
    
    public static ClickListener createExportButtonListener(final TradeNameDetailView detailView) {
        return new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
            	if (detailView.getFormTn().recID == 0)
            		detailView.showInfoMsgWindow(CaptionResolver.getCaption("first.save"));
            	else
            		detailView.handleExportFormTn();
            }
        };
    }

    public static ClickListener createDeleteButtonListener(final TradeNameDetailView detailView) {
        return new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
            	if (detailView.getFormTn().recID == 0)
            		detailView.reset();
            	else
            		detailView.handleDeleteTn();
            }
        };
    }

    public static ClickListener createCommentsButtonListener(final TradeNameDetailView detailView) {
        return new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
            	if (detailView.getFormTn().recID == 0)
            		detailView.showInfoMsgWindow(CaptionResolver.getCaption("first.save"));
            	else            	
            		detailView.handleComments();
            }
        };
    }
    
    // Assignment Notice button
    public static ClickListener createAssignNoticeButtonListener(final TradeNameDetailView detailView) {
        return new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
            	//detailView.handleAssignNotice();
            	if (detailView.getFormTn().recID == 0)
            		detailView.showInfoMsgWindow(CaptionResolver.getCaption("first.save"));
            	else
            		detailView.handleSendAssignmentEmail();            	
            }
        };
    }

    // Send Assignment Notice button
    public static ClickListener createSendAssignmentEmailListener(final TradeNameDetailView detailView) {
        return new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
            	if (detailView.getFormTn().recID == 0)
            		detailView.showInfoMsgWindow(CaptionResolver.getCaption("first.save"));
            	else
            		detailView.handleSendAssignmentEmail();
            }
        };
    }
    
    public static ClickListener createUnarchiveButtonListener(final TradeNameDetailView detailView) {
        return new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                detailView.handleUnarchiveFormTn();
            }
        };
    }

}
