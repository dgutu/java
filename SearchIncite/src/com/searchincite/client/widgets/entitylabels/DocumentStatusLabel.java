package com.searchincite.client.widgets.entitylabels;

import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.Widget;
import com.searchincite.client.entity.DocumentResult;
import com.searchincite.client.entity.DocumentWithResult;
import com.searchincite.client.widgets.dialogs.ViewResultDialog;
import org.gwm.client.event.GFrameEvent;
import org.gwm.client.event.GFrameListener;

public class DocumentStatusLabel
  extends Composite
  implements GFrameListener
{
  DocumentWithResult m_Document;
  MenuBar m_ContextMenuBar = new MenuBar(true);
  ViewResultDialog m_dlgViewResult = null;
  DocumentStatusLabel m_This = this;
  
  public DocumentStatusLabel(DocumentWithResult d)
  {
    this.m_Document = d;
    
    Hyperlink hl = new Hyperlink();
    hl.setText(d.getDocumentResult().getDocumentStatus());
    hl.addClickListener(new ClickListener()
    {
      public void onClick(Widget hl)
      {
        DocumentStatusLabel.this.m_dlgViewResult = new ViewResultDialog(DocumentStatusLabel.this.m_Document.getDocumentID(), DocumentStatusLabel.this.m_Document.getDocumentResult().getOntology());
        DocumentStatusLabel.this.m_dlgViewResult.setDialogFrameListener(DocumentStatusLabel.this.m_This);
        DocumentStatusLabel.this.m_dlgViewResult.show();
      }
    });
    initWidget(hl);
  }
  
  public DocumentStatusLabel(int documentIdParam, String ontologyNameParam)
  {
    final int documentId = documentIdParam;
    final String ontologyName = ontologyNameParam;
    
    Hyperlink hl = new Hyperlink();
    hl.setText("processed");
    hl.addClickListener(new ClickListener()
    {
      public void onClick(Widget hl)
      {
        DocumentStatusLabel.this.m_dlgViewResult = new ViewResultDialog(documentId, ontologyName);
        DocumentStatusLabel.this.m_dlgViewResult.setDialogFrameListener(DocumentStatusLabel.this.m_This);
        DocumentStatusLabel.this.m_dlgViewResult.show();
      }
    });
    initWidget(hl);
  }
  
  public DocumentWithResult getDocument()
  {
    return this.m_Document;
  }
  
  public void setDocument(DocumentWithResult d)
  {
    this.m_Document = d;
  }
  
  public void frameClosed(GFrameEvent evt)
  {
    this.m_dlgViewResult = null;
  }
  
  public void frameGhostMoved(int top, int left, GFrameEvent event) {}
  
  public void frameGhostMoving(int top, int left, GFrameEvent event) {}
  
  public void frameIconified(GFrameEvent evt) {}
  
  public void frameMaximized(GFrameEvent evt) {}
  
  public void frameMinimized(GFrameEvent evt) {}
  
  public void frameMoved(GFrameEvent evt) {}
  
  public void frameMoving(GFrameEvent event) {}
  
  public void frameOpened(GFrameEvent evt) {}
  
  public void frameResized(GFrameEvent evt) {}
  
  public void frameRestored(GFrameEvent evt) {}
  
  public void frameSelected(GFrameEvent event) {}
}
