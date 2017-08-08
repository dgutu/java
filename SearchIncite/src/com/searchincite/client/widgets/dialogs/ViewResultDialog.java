package com.searchincite.client.widgets.dialogs;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.HorizontalSplitPanel;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.MouseListener;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.searchincite.client.entity.DocumentResult;
import com.searchincite.client.entity.Ontology;
import com.searchincite.client.services.DocumentService;
import com.searchincite.client.services.DocumentServiceAsync;
import com.searchincite.client.widgets.ResultTree;
import com.searchincite.client.widgets.SubjectResultPanel;
import org.gwm.client.event.GFrameEvent;
import org.gwm.client.event.GFrameListener;
import org.gwm.client.impl.DefaultGDialog;

@SuppressWarnings("deprecation")
public class ViewResultDialog extends DefaultGDialog implements GFrameListener, ClickListener, MouseListener
{
    private long m_lDocumentID = -1L;
    private String m_lOntologyName;
    private DocumentResult m_DocumentResult;
    private Ontology m_Ontology;
    private Hyperlink m_lnkSwitchView;
    private String m_strHtml;
    VerticalPanel m_pnlMain = new VerticalPanel();
    HorizontalPanel m_pnlStatus = new HorizontalPanel();
    Label m_lblStatus = new Label();
    Label m_lblStatusCaption = new Label();
    HorizontalSplitPanel m_tblMain = new HorizontalSplitPanel();
    FlexTable m_pnlLeftPane = new FlexTable();
    FlexTable m_pnlRightPane = new FlexTable();
    HorizontalPanel m_pnlButtons = new HorizontalPanel();
    SubjectResultPanel m_pnlSubjects;
    private ResultTree m_treeResults;
    private Image m_imgRefresh = null;
  
    static enum enumView
    {
        SUBJECT,  INDEX;        
        private enumView() {}
    }
  
    private enumView m_CurrentView = enumView.SUBJECT;
    HTML m_htmlMarkedUpDocument = new HTML();
    ScrollPanel m_pnlDocument = new ScrollPanel();
    Label m_lblResultPaneHeading = new Label("Subject");
    HTML htmlQuickJumpLink = new HTML();
    ScrollPanel m_lstOntologies = new ScrollPanel();
    VerticalPanel m_pnlOntologies = new VerticalPanel();
    private int currentDocumentOntologyId;
  
    public ViewResultDialog(long lDocumentID, Ontology o)
    {
        m_lDocumentID = lDocumentID;
        m_Ontology = o;
        
        currentDocumentOntologyId = o.getOntologyID();
        
        initDialog();
    }
  
    public ViewResultDialog(long lDocumentID, String ontologyName)
    {
        m_lDocumentID = lDocumentID;
        
        //getCurrentDocumentOntology(lDocumentID, ontologyName);
        
        m_lOntologyName = ontologyName;
    
        initDialog();
    }
    
    public ViewResultDialog(long lDocumentID) {
        m_lDocumentID = lDocumentID;        
        initDialog();
    }
  
    /*@SuppressWarnings("rawtypes")
    public void getCurrentDocumentOntology(long lDocumentID, String ontologyName)
    {
        DocumentsTableModelServiceAsync documentsTableService = ServiceUtils.getDocumentsTableModelServiceAsync();    

        documentsTableService.getCurrentDocumentOntology(lDocumentID, ontologyName, new AsyncCallback()
        {
            public void onFailure(Throwable caught)
            {
                Window.alert("Failed to get response from server" + caught.getMessage());
            }
      
            public void onSuccess(Object result)
            {
                currentDocumentOntologyId = ((Integer)result).intValue();
            }
        });
    }*/
  
    private void initDialog()
    {
        setCaption("View Result");
    
        m_lblResultPaneHeading.setStyleName("resultPaneLabel");
        m_tblMain.setHeight("100%");
        m_tblMain.setWidth("100%");
    
        m_pnlButtons.setHorizontalAlignment(HorizontalPanel.ALIGN_RIGHT);
        m_pnlButtons.setSpacing(4);
    
        m_pnlLeftPane.setWidget(0, 0, this.m_lblResultPaneHeading);
    
        m_lnkSwitchView = new Hyperlink();
        m_lnkSwitchView.setText("Go To: Index View");
        m_lnkSwitchView.addClickListener(this);
    
        m_imgRefresh = new Image("images/refresh.gif");
        m_imgRefresh.setSize("16px", "16px");
        m_imgRefresh.setTitle("Refresh Results");
        m_imgRefresh.addStyleName("imageButton");
        m_imgRefresh.addClickListener(this);
    
        m_pnlLeftPane.setWidget(0, 1, this.m_lnkSwitchView);
        m_pnlLeftPane.getFlexCellFormatter().setHorizontalAlignment(0, 1, HorizontalPanel.ALIGN_RIGHT);
    
        HTML htmlCaption2 = new HTML();
        htmlCaption2.setHTML("<b>Annotated Document</b>");
        m_pnlRightPane.setWidget(0, 0, htmlCaption2);
    
        htmlQuickJumpLink.setHTML("<a href=\"#quick_jump_anchor\">Find First Phrase</a>");
        htmlQuickJumpLink.setVisible(false);
        m_pnlLeftPane.setWidget(1, 0, this.htmlQuickJumpLink);
    
        m_pnlSubjects = new SubjectResultPanel(null, null);
        m_treeResults = new ResultTree(null, null, null);
        m_treeResults.setVisible(false);
    
        m_pnlDocument.addStyleName("annotatedDocContainer");
        m_pnlDocument.setSize("100%", "100%");
        m_pnlDocument.add(this.m_htmlMarkedUpDocument);

        m_pnlRightPane.setWidget(1, 0, this.m_pnlDocument);
        m_pnlRightPane.getFlexCellFormatter().setHeight(1, 0, "100%");
    
        setMessageType(5);
        setIcon(null);
    
        setOptions(4, new String[] { "Close" });
        setMaximizable(true);
    
        setDraggable(true);
        setTheme("mac");
        addFrameListener(this);
    
        m_tblMain.setLeftWidget(this.m_pnlLeftPane);
        m_tblMain.setRightWidget(this.m_pnlRightPane);
    
        m_pnlLeftPane.setSize("100%", "100%");
        m_pnlRightPane.setSize("100%", "100%");
    
        m_tblMain.setSize("580px", "350px");
        m_tblMain.setSplitPosition("250px");
    
        setHeight(400);
        setWidth(600);
    
        m_lblStatusCaption.setText("Status: ");
        m_lblStatus.setText("Loading...");
    
        m_pnlStatus.setVerticalAlignment(VerticalPanel.ALIGN_MIDDLE);
        m_pnlStatus.add(m_lblStatusCaption);
        m_pnlStatus.add(new HTML("&nbsp;"));
        m_pnlStatus.add(m_lblStatus);
        m_pnlStatus.add(new HTML("&nbsp;&nbsp;"));
        m_pnlStatus.add(m_imgRefresh);
    
        m_pnlMain.add(m_pnlStatus);
        m_pnlMain.add(new HTML("<hr size=1 style=\"color: silver\" />"));
        m_pnlMain.add(m_tblMain);
        setMessage(m_pnlMain);
    
        loadDocumentResult();
    }
  
    private void center()
    {
        int iTop = Window.getClientHeight() / 2 - getHeight() / 2 + getBodyScrollTop();
        int iLeft = Window.getClientWidth() / 2 - getWidth() / 2 + getBodyScrollLeft();
    
        iLeft = (Window.getClientWidth() - getOffsetWidth()) / 2 + Window.getScrollLeft();
        iTop = (Window.getClientHeight() - getOffsetHeight()) / 2 + Window.getScrollTop();
    
        Window.alert("Window.getClientHeight: " + String.valueOf(Window.getClientHeight()) + "\n" + "getOffsetHeight: " + String.valueOf(getOffsetHeight()) + "\n" + "Window.getClientWidth: " + String.valueOf(Window.getClientWidth()) + "\n" + "getOffsetWidth: " + String.valueOf(getOffsetWidth()) + "\n" + "Window.getScrollLeft: " + String.valueOf(Window.getScrollLeft()) + "\n" + "Window.getScrollTop: " + String.valueOf(Window.getScrollTop()) + "\n" + "top: " + String.valueOf(iTop) + "\n" + "left: " + String.valueOf(iLeft) + "\n" + "top: " + String.valueOf(iTop) + "\n");

        setLeft(iLeft);
        setTop(iTop);
    }
  
    public void setDialogFrameListener(GFrameListener listener)
    {
        addFrameListener(listener);
    }
  
    private void createResultTree(DocumentResult docResult, HTML documentContainer, String html)
    {
        m_treeResults = new ResultTree(docResult, html, this.htmlQuickJumpLink);
        m_treeResults.setDocumentContainer(documentContainer);
    }
  
    private void restoreWindow() {}
  
    @SuppressWarnings("rawtypes")
    public void loadDocumentResult()
    {
        DocumentServiceAsync svc = (DocumentServiceAsync)GWT.create(DocumentService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)svc;
        String moduleRelativeURL = GWT.getModuleBaseURL() + "document";
        endpoint.setServiceEntryPoint(moduleRelativeURL);
    
        AsyncCallback callback = new AsyncCallback()
        {
            public void onSuccess(Object result)
            {
                // get document from getDocumentResult 
                m_DocumentResult = ((DocumentResult)result);        
              
                if (m_DocumentResult != null) {
                    // subjects
                    //DocumentSubjectResult[] arrSubjectResults = m_DocumentResult.getSubjectResults();
            
                    // document marked document
                    String html = m_DocumentResult.getMarkedUpDocument();
            
                    m_htmlMarkedUpDocument.setHTML(html);
                  
                    // add subjects
                    m_pnlSubjects = new SubjectResultPanel(m_DocumentResult, html);
            
                    HorizontalPanel hp = new HorizontalPanel();
                    hp.setSize("100%", "100%");
                    hp.add(m_pnlSubjects);
            
                    m_pnlLeftPane.setWidget(2, 0, hp);
            
                    m_pnlLeftPane.getFlexCellFormatter().setHeight(2, 0, "100%");
                    m_pnlLeftPane.getFlexCellFormatter().setColSpan(2, 0, 3);
            
                    createResultTree(m_DocumentResult, m_htmlMarkedUpDocument, html);
            
                    hp.add(m_treeResults);
            
                    m_treeResults.setVisible(false);
                    m_treeResults.setSize("100%", "100%");
            
                    m_pnlSubjects.setDocumentContainer(m_htmlMarkedUpDocument);
                    m_pnlSubjects.setDocumentResult(m_DocumentResult, html);
            
                    m_lblStatus.setText(m_DocumentResult.getDocumentStatus());
            
                    synchronizeView();
                }
            }
      
            public void onFailure(Throwable caught)
            {
                Window.alert("ViewResultDialog::loadDocumentResult() -- service call failed.");                               
            }
        };
      
        try
        {           
            svc.getDocumentResultByOntologyName(m_lDocumentID, m_lOntologyName, callback);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
  
    private native int getBodyScrollLeft()
    /*-{
        return $doc.body.scrollLeft;
    }-*/;
  
    private native int getBodyScrollTop()
    /*-{
        return $doc.body.scrollTop;
    }-*/;   
   
    public void frameClosed(GFrameEvent evt) {}
   
    public void frameGhostMoved(int top, int left, GFrameEvent event) {}
   
    public void frameGhostMoving(int top, int left, GFrameEvent event) {}
   
    public void frameIconified(GFrameEvent evt) {}
   
    public void frameMinimized(GFrameEvent evt) {}
   
    public void frameMoved(GFrameEvent evt) {}
   
    public void frameMoving(GFrameEvent event) {}
   
    public void frameOpened(GFrameEvent evt) {}
   
    public void frameResized(GFrameEvent evt) {}
   
    public void frameSelected(GFrameEvent event) {}
   
    public void frameRestored(GFrameEvent evt)
    {
        m_tblMain.setSize("580px", "350px");
    }
   
    public void frameMaximized(GFrameEvent evt)
    {
        m_tblMain.setSize(String.valueOf(getOffsetWidth() - 30) + "px", String.valueOf(getOffsetHeight() - 130) + "px");
    }
   
    public void onClick(Widget sender)
    {
        if (sender.equals(m_lnkSwitchView))
        {
            if (m_lnkSwitchView.getText().equals("Go To: Index View"))
            {
                m_CurrentView = enumView.INDEX;
                synchronizeView();
            }
            else
            {
                m_CurrentView = enumView.SUBJECT;
                synchronizeView();
            }
        }
        else if (sender.equals(m_imgRefresh))
        {
            m_lblStatus.setText("Loading...");
       
            m_tblMain.setVisible(false);
            m_imgRefresh.setVisible(false);
            loadDocumentResult();
        }
    }
   
    private void synchronizeView()
    {   
        if (m_CurrentView == enumView.INDEX)
        {
            m_lnkSwitchView.setText("Go To: Subject View");
            m_lblResultPaneHeading.setText("Ontology");
            m_pnlSubjects.setVisible(false);
            m_treeResults.setVisible(true);
            htmlQuickJumpLink.setVisible(true);
        }
        else if (m_CurrentView == enumView.SUBJECT)
        {
            m_lnkSwitchView.setText("Go To: Index View");
            m_lblResultPaneHeading.setText("Subjects");
            m_pnlSubjects.setVisible(true);
            m_treeResults.setVisible(false);
            m_pnlSubjects.refreshDocumentContainer();
            htmlQuickJumpLink.setVisible(false);
        }
        m_tblMain.setVisible(true);
        m_imgRefresh.setVisible(true);
    }
   
    public void onMouseDown(Widget sender, int x, int y) {}
   
    public void onMouseEnter(Widget sender)
    {
        if (sender.equals(this.m_imgRefresh)) {
            sender.addStyleName("imageButton-OnMouseOver");
        }
    }
   
    public void onMouseLeave(Widget sender)
    {
        if (sender.equals(this.m_imgRefresh)) {
            sender.removeStyleName("imageButton-OnMouseOver");
        }
    }
   
    public void onMouseMove(Widget sender, int x, int y) {}
   
    public void onMouseUp(Widget sender, int x, int y) {}
}

