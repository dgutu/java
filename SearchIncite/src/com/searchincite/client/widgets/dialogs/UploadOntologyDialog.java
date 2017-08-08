package com.searchincite.client.widgets.dialogs;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FormPanel.SubmitEvent;
import com.google.gwt.user.client.ui.FormPanel.SubmitHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.FormPanel.SubmitCompleteEvent;
import com.searchincite.client.entity.Ontology;
import com.searchincite.client.widgets.CustomPopupPanel;

public class UploadOntologyDialog extends DialogBox  {  
    
    VerticalPanel m_pnlUpload = new VerticalPanel();
    DockPanel m_pnlOuter = new DockPanel(); 
    final FormPanel m_frmUpload = new FormPanel();
    FlexTable m_tblMain = new FlexTable();
    final FileUpload fileUpload = new FileUpload(); 
    
    Button m_btnOK = null;
    Button m_btnCancel = null;              
    
    CustomPopupPanel popup;
    
    public UploadOntologyDialog() {     
        super();
        try {
                setText("Upload Ontology");

                m_pnlOuter.setSpacing(1);

                HorizontalPanel pnlCaption = new HorizontalPanel();
                HTML text = new HTML("Choose the file to upload below, then click OK to upload the file or Cancel to close this dialog.");
                text.setWordWrap(true);
                pnlCaption.add(text);               
                
                m_pnlOuter.add(pnlCaption, DockPanel.NORTH);

                m_tblMain.setSize("100%", "100%");

                // this line has to be changed depending on the file path
                m_frmUpload.setAction(GWT.getModuleBaseURL() + "uploadOntology");
                m_frmUpload.setEncoding(FormPanel.ENCODING_MULTIPART);
                m_frmUpload.setMethod(FormPanel.METHOD_POST);
                
                m_frmUpload.setWidget(m_pnlUpload);             
                fileUpload.setName("uploadFormElement");
                m_pnlUpload.add(fileUpload);

                m_frmUpload.addSubmitCompleteHandler(new FormPanel.SubmitCompleteHandler() {                
                    @Override
                    public void onSubmitComplete(SubmitCompleteEvent arg0) {                        
                        UploadOntologyDialog.this.hide();
                        if (popup != null)
                            popup.unmask();                     
                        
                        if (arg0.getResults().indexOf("success") != -1)
                            Window.alert("File loaded successfully.");
                        else
                            Window.alert("Fail load the file.");
                    }
                });

                HTML htmlCaption2 = new HTML();
                htmlCaption2.setHTML("<b>Filename:</b>");
                m_tblMain.setWidget(2, 0, htmlCaption2);
                m_tblMain.getFlexCellFormatter().setVerticalAlignment(2, 0, VerticalPanel.ALIGN_TOP);

                m_tblMain.setWidget(2, 1, m_frmUpload);
                m_tblMain.getFlexCellFormatter().setColSpan(2, 1, 2);
                m_tblMain.getFlexCellFormatter().setVerticalAlignment(2, 1, VerticalPanel.ALIGN_TOP);
                //m_tblMain.setBorderWidth(1);

                HorizontalPanel pnlButtons = new HorizontalPanel();
                pnlButtons.setSpacing(4);
                
                // OK button
                m_btnOK = new Button("OK");
                m_btnOK.addClickHandler(new ClickHandler() {

                @Override
                public void onClick(ClickEvent arg0) {
                    String filename = fileUpload.getFilename();
                    if (filename.length() == 0) {
                           Window.alert("No File Specified!");
                    } else {
                        //submit the form                           
                        m_frmUpload.submit();                       
                        popup = new CustomPopupPanel ("Processing ...");                        
                    }                       
                }} );                   

                // Cancel button
                m_btnCancel = new Button("Cancel");
                m_btnCancel.addClickHandler(new ClickHandler () {

                    @Override
                    public void onClick(ClickEvent arg0) {
                        UploadOntologyDialog.this.hide();
                        if (popup != null)
                            popup.unmask();
                    }});

                pnlButtons.add(m_btnOK);
                pnlButtons.add(m_btnCancel);

                m_tblMain.setWidget(4, 2, pnlButtons);
                m_tblMain.getCellFormatter().setHorizontalAlignment(4, 2, HorizontalPanel.ALIGN_RIGHT);
                m_tblMain.getCellFormatter().setVerticalAlignment(4, 2, VerticalPanel.ALIGN_BOTTOM);
                m_tblMain.getCellFormatter().setHeight(4, 2, "55px");

                m_pnlOuter.add(m_tblMain, DockPanel.CENTER);
                m_pnlOuter.setSpacing(8);

                m_pnlOuter.setSize("100%", "100%");
                setWidget(m_pnlOuter);

                setSize("325px", "250px");
        }
        catch(Exception e) {
            e.getLocalizedMessage();            
        }
    }
    
    @Override
    public void show() {
        super.show();
        int left = (Window.getClientWidth() - getOffsetWidth()) / 2 + getBodyScrollLeft();
        int top = (Window.getClientHeight() - getOffsetHeight()) / 2 + getBodyScrollTop();
        setPopupPosition(left, top);
    }   

    private native int getBodyScrollLeft() /*-{
     return $doc.body.scrollLeft;
     }-*/;

    private native int getBodyScrollTop() /*-{
     return $doc.body.scrollTop;
     }-*/;
}
