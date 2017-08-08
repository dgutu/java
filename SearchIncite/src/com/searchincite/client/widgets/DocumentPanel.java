package com.searchincite.client.widgets;

import asquare.gwt.tk.client.ui.ColumnPanel;
import asquare.gwt.tk.client.ui.ModalDialog;
import asquare.gwt.tk.client.ui.behavior.FocusModel;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
//import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Composite;
//import com.google.gwt.user.client.ui.DialogBox;
//import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FocusWidget;
//import com.google.gwt.user.client.ui.FormHandler;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FormPanel.SubmitCompleteEvent;
import com.google.gwt.user.client.ui.FormPanel.SubmitCompleteHandler;
import com.google.gwt.user.client.ui.FormPanel.SubmitEvent;
import com.google.gwt.user.client.ui.FormPanel.SubmitHandler;
//import com.google.gwt.user.client.ui.FormSubmitCompleteEvent;
//import com.google.gwt.user.client.ui.FormSubmitEvent;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLTable;
//import com.google.gwt.user.client.ui.HTMLTable.CellFormatter;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.Hidden;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.MouseListener;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
//import com.searchincite.client.entity.ChangeEvent;
//import com.searchincite.client.entity.Document;
import com.searchincite.client.entity.DocumentSource;
//import com.searchincite.client.listeners.DocumentChangeListener;
import com.searchincite.client.listeners.DocumentSourceSelectionListener;
import com.searchincite.client.services.DocumentServiceProxy;
//import com.searchincite.client.widgets.dialogs.UploadDocumentDialog;
import com.searchincite.client.widgets.dialogs.ViewResultDialog;
import com.searchincite.client.widgets.documentsadvancedtable.AdvancedTable;
import com.searchincite.client.widgets.documentsadvancedtable.DataFilter;
import com.searchincite.client.widgets.documentsadvancedtable.DocumentsTableModelServiceAsync;
import com.searchincite.client.widgets.documentsadvancedtable.RowSelectionListener;
import com.searchincite.client.widgets.documentsadvancedtable.ServiceUtils;

import java.util.Set;

@SuppressWarnings({ "unchecked", "rawtypes", "deprecation" })
public class DocumentPanel
  extends Composite
  implements DocumentSourceSelectionListener, MouseListener
{
  private VerticalPanel verticalPanel;
  private Label labelMessages;
  final HorizontalPanel hp = new HorizontalPanel();
  final AdvancedTable table = new AdvancedTable();
  final HorizontalPanel lowerHorizontalPanel = new HorizontalPanel();
  TextBox addTextBoxFileName = null;
  TextBox addTextBoxDescription = null;
  TextArea addTextBoxContent = null;
  TextBox editTextBoxFileName = null;
  TextBox editTextBoxDescription = null;
  TextArea editTextBoxContent = new TextArea();
  TextBox uploadTextBoxDescription = null;
  TextBox uploadTextBoxFileName = null;
  RadioButton m_btnAllDocuments = null;
  RadioButton m_btnSomeDocuments = null;
  String currentRowContent = "";
  private Image m_imgNew = null;
  private Image m_imgEdit = null;
  private Image m_imgDelete = null;
  private Image m_imgUpload = null;
  private Image m_imgRefresh = null;
  private Image m_imgResetDocs = null;
  private HTML m_htmlQuickViewLabel = new HTML("&nbsp;&nbsp;Doc #");
  private TextBox m_txtQuickViewDocID = new TextBox();
  private Button m_btnQuickView = new Button("Go");
  private long m_lQuickViewDocumentID = 0L;
  private ViewResultDialog m_dlgViewResult = null;
  int documentPanelCounter = 0;
  
  //document source ID
  int m_iDocumentSourceID = -5;
  
  //organization ID
  int m_organizationID = 0; 
  
  // ontology name
  String ontologyName = "";
  
  
  public DocumentPanel()
  {
    verticalPanel = new VerticalPanel();
    verticalPanel.setHeight("100%");
    verticalPanel.setWidth("100%");
    
    initWidget(verticalPanel);
  }
  
  public void callForDocuments()
  {
    DocumentsTableModelServiceAsync documentsTableService = ServiceUtils.getDocumentsTableModelServiceAsync();
    
    table.setAllowRowMark(true);
    
    table.setTableModelService(documentsTableService);
    table.addRowSelectionListener(new RowSelectionListener()
    {
      public void onRowSelected(AdvancedTable sender, String rowId)
      {
        labelMessages.setText("Row " + rowId + " selected.");
      }
    });
    table.setSize("100%", "100%");
    table.setPageSize(20);
  }
  
  public void newDocument()
  {
    String fileName = addTextBoxFileName.getText();
    String description = addTextBoxDescription.getText();
    String contentString = addTextBoxContent.getText();
    
    DocumentsTableModelServiceAsync documentsTableService = ServiceUtils.getDocumentsTableModelServiceAsync();
    documentsTableService.newDocument(fileName, description, contentString, new AsyncCallback()
    {
      public void onFailure(Throwable caught)
      {
        Window.alert("Failed to get response from server" + caught.getMessage());
      }
      
      public void onSuccess(Object result)
      {
        table.updateTableData();
      }
    });
  }
  
  public void editDocument()
  {
    String fileName = editTextBoxFileName.getText();
    String description = editTextBoxDescription.getText();
    String contentString = editTextBoxContent.getText();
    
    String rowId = table.getSelectedRowId();

    DocumentsTableModelServiceAsync documentsTableService = ServiceUtils.getDocumentsTableModelServiceAsync();
    documentsTableService.editDocument(fileName, description, contentString, rowId, new AsyncCallback()
    {
      public void onFailure(Throwable caught)
      {
        Window.alert("Failed to get response from server" + caught.getMessage());
      }
      
      public void onSuccess(Object result)
      {
        table.updateTableData();
        table.clearMarkedRows();
      }
    });
  }
  
  public void deleteDocuments()
  {
    Set markedRows = table.getMarkedRows();
    
    String[] markedRowsArray = (String[])markedRows.toArray(new String[markedRows.size()]);
    
    DocumentsTableModelServiceAsync documentsTableService = ServiceUtils.getDocumentsTableModelServiceAsync();
    
    documentsTableService.deleteDocuments(markedRowsArray, new AsyncCallback()
    {
      public void onFailure(Throwable caught)
      {
        Window.alert("Failed to get response from server" + caught.getMessage());
      }
      
      public void onSuccess(Object result)
      {
        table.updateTableData();
      }
    });
  }
  
  public void reprocessCheckedDocuments()
  {
    Set markedRowsAndOntologies = table.getMarkedRowsAndOntologies();
    
    String[] markedRowsAndOntologiesArray = (String[])markedRowsAndOntologies.toArray(new String[markedRowsAndOntologies.size()]);
    

    DocumentsTableModelServiceAsync documentsTableService = ServiceUtils.getDocumentsTableModelServiceAsync();
    
    documentsTableService.reprocessCheckedDocuments(markedRowsAndOntologiesArray, new AsyncCallback()
    {
      public void onFailure(Throwable caught)
      {
        Window.alert("Failed to get response from server" + caught.getMessage());
      }
      
      public void onSuccess(Object result)
      {
        table.updateTableData();
      }
    });
  } 
  
  
  public void exportCheckedDocuments()
  {
    Set markedRowsAndOntologies = table.getMarkedRowsAndOntologies();
    
    
	String[] markedRowsAndOntologiesArray = (String[])markedRowsAndOntologies.toArray(new String[markedRowsAndOntologies.size()]);    

    DocumentsTableModelServiceAsync documentsTableService = ServiceUtils.getDocumentsTableModelServiceAsync();
    
    documentsTableService.exportCheckedDocuments(markedRowsAndOntologiesArray, new AsyncCallback()
    {
      public void onFailure(Throwable caught)
      {
        Window.alert("Failed to get response from server" + caught.getMessage());
      }
      
      public void onSuccess(Object result)
      {
		String fileName = (String)result;
		Window.open(fileName, "name", "enabled");
      }
    });
  }  
  
  public void getCurrentRowContent(String rowId)
  {
    DocumentsTableModelServiceAsync documentsTableService = ServiceUtils.getDocumentsTableModelServiceAsync();
    

    documentsTableService.getCurrentRowContent(rowId, new AsyncCallback()
    {
      public void onFailure(Throwable caught)
      {
        Window.alert("Failed to get response from server" + caught.getMessage());
      }
      
      public void onSuccess(Object result)
      {
        currentRowContent = ((String)result);
        editTextBoxContent.setText(currentRowContent);
      }
    });
  }
  
  public void updateDocumentSourceId(int m_iDocumentSourceID)
  {
    DocumentsTableModelServiceAsync documentsTableService = ServiceUtils.getDocumentsTableModelServiceAsync();
    

    documentsTableService.updateDocumentSourceId(m_iDocumentSourceID, new AsyncCallback()
    {
      public void onFailure(Throwable caught)
      {
        Window.alert("Failed to get response from server" + caught.getMessage());
      }
      
      public void onSuccess(Object result)
      {
        table.updateTableData();
      }
    });
  }
  
  // create upload document button
  private Image createUploadDocumentButton()
  {
    m_imgUpload = new Image("images/upload_doc.gif");
    m_imgUpload.setSize("16px", "16px");
    m_imgUpload.setTitle("Upload Document");
    m_imgUpload.addStyleName("imageButton");
    
    m_imgUpload.addClickHandler(new ClickHandler() {
   	  @Override
      public void onClick(ClickEvent arg0) 
      {
        if (m_iDocumentSourceID == -5)
        {
          Window.alert("Please select a Document Source before choosing this option.");
        }
        else
        {
          final FormPanel form = new FormPanel();
          final ModalDialog dialog = new ModalDialog();
          dialog.setCaption("Upload Document", false);
          
          dialog.add(new Label("Specify the filename and optional description for file to upload below, then click OK to upload the file or Cancel to close this dialog."));        
          form.setAction("upload");
          form.setEncoding("multipart/form-data");
          form.setMethod("post");
          final VerticalPanel panel = new VerticalPanel();
          form.setWidget(panel);
          
          int FIELD_COUNT = 1;
          Grid tableGrid = new Grid(FIELD_COUNT, 2);
          dialog.add(tableGrid);
          Widget[] labels = new Widget[1];
          labels[0] = new Label("Description: ");
          
          Widget[] fields = new Widget[1];
          fields[0] = new TextBox();
          
          uploadTextBoxDescription = ((TextBox)fields[0]);
          
          Label fileNameLabel = new Label("Filename: ");
          panel.add(fileNameLabel);
          

          final FileUpload upload = new FileUpload();
          upload.setName("file");
          panel.add(upload);
          
          HTMLTable.CellFormatter formatter = tableGrid.getCellFormatter();
          for (int i = 0; i < labels.length; i++)
          {
            tableGrid.setWidget(i, 0, labels[i]);
            formatter.setHorizontalAlignment(i, 0, HasHorizontalAlignment.ALIGN_LEFT);
            
            tableGrid.setWidget(i, 1, fields[i]);
          }
          
          // form onSubmitComplete
          form.addSubmitCompleteHandler(new SubmitCompleteHandler() {

			@Override
			public void onSubmitComplete(SubmitCompleteEvent arg0) {
	              updateDocumentSourceId(m_iDocumentSourceID);
	              dialog.hide();
				
			}});
          
          form.addSubmitHandler(new SubmitHandler() {

			@Override
			public void onSubmit(SubmitEvent arg0) {
	              if (upload.getFilename().length() == 0)
	              {
	                Window.alert("Please select a file to upload.");
	                arg0.cancel();
	              }				
			}});
          
          // add form to dialog
          dialog.add(form);
          
          ColumnPanel buttonPanel = new ColumnPanel();
          buttonPanel.setWidth("100%");
          dialog.add(buttonPanel);
          
          Hidden fldDocumentSourceID = new Hidden();
          fldDocumentSourceID.setName("documentSourceID");
          fldDocumentSourceID.setValue(String.valueOf(m_iDocumentSourceID));
          
          panel.add(fldDocumentSourceID);
          
          Button closeButton = new Button("Submit", new ClickHandler()
          {
        	@Override
        	public void onClick(ClickEvent arg0)
            {
              Hidden fldDescription = new Hidden();
              fldDescription.setName("documentDescription");
              fldDescription.setValue(uploadTextBoxDescription.getText());
              panel.add(fldDescription);
              form.submit();
            }
          });
          buttonPanel.add(closeButton);
          
          Button cancelButton = new Button("Cancel");
          cancelButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent arg0) {				
				dialog.hide();
			}});
          
          buttonPanel.addWidget(cancelButton, false);
          buttonPanel.setCellHorizontalAlignment(ColumnPanel.ALIGN_RIGHT);         
          
          dialog.show();
        }
      }
    });
    m_imgUpload.addMouseListener(this);

    hp.add(m_imgUpload);
    return m_imgUpload;
  }
  
  
  // create new document button
  private Image createNewDocumentButton()
  {
    m_imgNew = new Image("images/new.gif");
    m_imgNew.setSize("16px", "16px");
    m_imgNew.setTitle("New Document");
    m_imgNew.addStyleName("imageButton");

    m_imgNew.addClickHandler(new ClickHandler()
    {	
      @Override
      public void onClick(ClickEvent arg0)
      {
        if (m_iDocumentSourceID == -5)
        {
          Window.alert("Please select a Document Source before choosing this option.");
        }
        else
        {
          final ModalDialog dialog = new ModalDialog();
          dialog.setCaption("New Document", false);
          FocusModel fModel = dialog.getFocusModel();
          
          Label instructions = new Label("Enter information for the new Document below, then click OK to save, or Cancel to close this dialog.");
          
          instructions.setWidth("100%");
          dialog.add(instructions);
          
          int FIELD_COUNT = 3;
          Grid table = new Grid(FIELD_COUNT, 2);
          table.setHeight("80%");
          table.setWidth("100%");
          dialog.add(table);
          Widget[] labels = new Widget[3];
          labels[0] = new Label("Filename: ");
          labels[1] = new Label("Description: ");
          labels[2] = new Label("Content: ");
          
          ((Label)labels[0]).setWidth("50px");
          ((Label)labels[1]).setWidth("50px");
          ((Label)labels[2]).setWidth("50px");
          
          FocusWidget[] fields = new FocusWidget[3];
          fields[0] = new TextBox();
          fields[1] = new TextBox();
          fields[2] = new TextArea();
          
          addTextBoxFileName = ((TextBox)fields[0]);
          addTextBoxDescription = ((TextBox)fields[1]);
          addTextBoxContent = ((TextArea)fields[2]);
          
          addTextBoxFileName.setWidth("100%");
          addTextBoxDescription.setWidth("100%");
          addTextBoxContent.setWidth("100%");
          addTextBoxContent.setHeight("200px");
          
          HTMLTable.CellFormatter formatter = table.getCellFormatter();
          for (int i = 0; i < labels.length; i++)
          {
            table.setWidget(i, 0, labels[i]);
            formatter.setHorizontalAlignment(i, 0, HasHorizontalAlignment.ALIGN_LEFT);
            
            table.setWidget(i, 1, fields[i]);
            fModel.add(fields[i]);
          }
          fModel.setFocusWidget(fields[0]);
          
          ColumnPanel buttonPanel = new ColumnPanel();
          buttonPanel.setWidth("100%");
          dialog.add(buttonPanel);
          
          // OK Button
          Button okButton = new Button("OK");
          okButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent arg0) {
				      newDocument();
				      dialog.hide();
				  }				
			});          
          
          fModel.add(okButton);
          buttonPanel.add(okButton);
          
          // cancel Button
          Button cancelButton = new Button("Cancel");
          cancelButton.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent arg0) {
				dialog.hide();				
			}});
          
          fModel.add(cancelButton);
          buttonPanel.addWidget(cancelButton, false);
          
          // 
          buttonPanel.setCellHorizontalAlignment(ColumnPanel.ALIGN_RIGHT);
          

          dialog.setSize("600px", "400px");
          dialog.show();
        }
      }
    });
    m_imgNew.addMouseListener(this);

    hp.add(m_imgNew);
    return m_imgNew;
  }
  
  
  // create edit document button
  private Image createEditDocumentButton()
  {
    m_imgEdit = new Image("images/edit.gif");
    m_imgEdit.setSize("16px", "16px");
    m_imgEdit.setTitle("Edit Selected Document");
    m_imgEdit.addStyleName("imageButton");
    

    m_imgEdit.addClickHandler(new ClickHandler() {

	@Override
	public void onClick(ClickEvent arg0) {
        if (m_iDocumentSourceID == -5)
        {
          Window.alert("Please select a Document Source before choosing this option.");
        }
        else
        {
          editTextBoxContent.setText("");
          getCurrentRowContent(table.getSelectedRowId());
          if (table.selectedRowIndex == -1)
          {
            Window.alert("Please select an document to Edit.");
            return;
          }
          String currentRowFileName = table.grid.getText(table.selectedRowIndex, 2);
          String currentRowDescription = table.grid.getText(table.selectedRowIndex, 3);
          

          final ModalDialog dialog = new ModalDialog();
          dialog.setCaption("Edit Document", false);
          FocusModel fModel = dialog.getFocusModel();
          
          Label instructions = new Label("Enter information for the current Document below, then click OK to save, or Cancel to close this dialog.");
          
          instructions.setWidth("100%");
          dialog.add(instructions);
          
          int FIELD_COUNT = 3;
          Grid table = new Grid(FIELD_COUNT, 2);
          table.setHeight("80%");
          table.setWidth("100%");
          dialog.add(table);
          Widget[] labels = new Widget[3];
          labels[0] = new Label("Filename: ");
          labels[1] = new Label("Description: ");
          labels[2] = new Label("Content: ");
          
          ((Label)labels[0]).setWidth("50px");
          ((Label)labels[1]).setWidth("50px");
          ((Label)labels[2]).setWidth("50px");
          
          FocusWidget[] fields = new FocusWidget[3];
          fields[0] = new TextBox();
          fields[1] = new TextBox();
          fields[2] = editTextBoxContent;
          
          editTextBoxFileName = ((TextBox)fields[0]);
          editTextBoxDescription = ((TextBox)fields[1]);
          

          editTextBoxFileName.setWidth("100%");
          editTextBoxDescription.setWidth("100%");
          editTextBoxContent.setWidth("100%");
          editTextBoxContent.setHeight("200px");
          
          ((TextBox)fields[0]).setText(currentRowFileName);
          ((TextBox)fields[1]).setText(currentRowDescription);
          

          HTMLTable.CellFormatter formatter = table.getCellFormatter();
          for (int i = 0; i < labels.length; i++)
          {
            table.setWidget(i, 0, labels[i]);
            formatter.setHorizontalAlignment(i, 0, HasHorizontalAlignment.ALIGN_LEFT);
            
            table.setWidget(i, 1, fields[i]);
            fModel.add(fields[i]);
          }
          fModel.setFocusWidget(fields[0]);
          
          ColumnPanel buttonPanel = new ColumnPanel();
          buttonPanel.setWidth("100%");
          dialog.add(buttonPanel);
          
          // edit Button
          Button editButton = new Button("OK");
          editButton.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent arg0) {
				editDocument();
				dialog.hide();				
			}});
          
          
          fModel.add(editButton);
          buttonPanel.add(editButton);
          
          Button cancelButton = new Button("Cancel");
          cancelButton.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent arg0) {
				dialog.hide();				
			}});
          
          fModel.add(cancelButton);
          buttonPanel.addWidget(cancelButton, false);
          buttonPanel.setCellHorizontalAlignment(ColumnPanel.ALIGN_RIGHT);          

          dialog.setSize("600px", "400px");
          dialog.show();
        }
      }
    });
    
    m_imgEdit.addMouseListener(this);
    hp.add(m_imgEdit);    
    return m_imgEdit;
  }
  
  
  // create delete document button
  private Image createDeleteDocumentButton()
  {
    m_imgDelete = new Image("images/delete.gif");
    m_imgDelete.setSize("16px", "16px");
    m_imgDelete.setTitle("Delete Checked Documents");
    m_imgDelete.addStyleName("imageButton");
    

    hp.add(m_imgDelete);
    
    m_imgDelete.addClickHandler(new ClickHandler()
    {
      public void onClick(ClickEvent sender)
      {
        if (m_iDocumentSourceID == -5)
        {
          Window.alert("Please select a Document Source before choosing this option.");
        }
        else
        {
          Set markedRows = table.getMarkedRows();
          if (markedRows.size() == 0)
          {
            Window.alert("Please use the checkboxes to select the documents you wish to delete. You may delete one or several documents at once.");
            

            return;
          }
          deleteDocuments();
          table.clearMarkedRows();
        }
      }
    });
    m_imgDelete.addMouseListener(this);
    return m_imgDelete;
  }
  
  // create refresh document button
  private Image createRefreshDocumentButton()
  {
    m_imgRefresh = new Image("images/refresh.gif");
    m_imgRefresh.setSize("16px", "16px");
    m_imgRefresh.setTitle("Refresh List");
    m_imgRefresh.addStyleName("imageButton");
    
    m_imgRefresh.addClickHandler(new ClickHandler()
    {
      public void onClick(ClickEvent sender)
      {
        if (m_iDocumentSourceID == -5) {
          Window.alert("Please select a Document Source before choosing this option.");
        } else {
          updateDocumentSourceId(m_iDocumentSourceID);
        }
      }
    });
    m_imgRefresh.addMouseListener(this);
    
    hp.add(m_imgRefresh);
    return m_imgRefresh;
  }
  
  // create reset document button
  private Image createResetDocumentsButton()
  {
    m_imgResetDocs = new Image("images/yellow_x.gif");
    m_imgResetDocs.setSize("16px", "16px");
    m_imgResetDocs.setTitle("Reset Processed Documents");
    m_imgResetDocs.addStyleName("imageButton");
    

    m_imgResetDocs.addClickHandler(new ClickHandler()
    {
      public void onClick(ClickEvent sender)
      {
        if (m_iDocumentSourceID == -5)
        {
          Window.alert("Please select a Document Source before choosing this option.");
        }
        else
        {
          final ModalDialog dialog = new ModalDialog();
          dialog.setCaption("Reset Documents", false);
          FocusModel fModel = dialog.getFocusModel();
          
          dialog.add(new Label("This function will reset some or all Documents in the selected Document Source to uploaded status."));
          

          int FIELD_COUNT = 2;
          Grid table = new Grid(FIELD_COUNT, 1);
          dialog.add(table);
          FocusWidget[] fields = new FocusWidget[2];
          fields[0] = new RadioButton("group1", "Reset all documents");
          ((RadioButton)fields[0]).setChecked(true);
          fields[1] = new RadioButton("group1", "Reset 100 most recent documents");
          
          m_btnAllDocuments = ((RadioButton)fields[0]);
          m_btnSomeDocuments = ((RadioButton)fields[1]);
          
          HTMLTable.CellFormatter formatter = table.getCellFormatter();
          for (int i = 0; i < fields.length; i++)
          {
            table.setWidget(i, 0, fields[i]);
            formatter.setHorizontalAlignment(i, 0, HasHorizontalAlignment.ALIGN_LEFT);
            
            fModel.add(fields[i]);
          }
          fModel.setFocusWidget(fields[0]);
          
          ColumnPanel buttonPanel = new ColumnPanel();
          buttonPanel.setWidth("100%");
          dialog.add(buttonPanel);
          
          Button resetButton = new Button("OK");
          resetButton.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent arg0) {
			      if ((!m_btnAllDocuments.isChecked()) && (!m_btnSomeDocuments.isChecked()))
			      {
			        Window.alert("Please select the number of documents to reset");
			        return;
			      }
			      executeReset();
			      dialog.hide();
			}});
          
          fModel.add(resetButton);
          buttonPanel.add(resetButton);
          
          Button cancelButton = new Button("Cancel");
          cancelButton.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent arg0) {
				dialog.hide();				
			}});          
          
          fModel.add(cancelButton);
          buttonPanel.addWidget(cancelButton, false);
          buttonPanel.setCellHorizontalAlignment(ColumnPanel.ALIGN_RIGHT);
          

          dialog.show();
        }
      }
    });
    m_imgResetDocs.addMouseListener(this);

    hp.add(m_imgResetDocs);    

    return m_imgResetDocs;
  }
  
  
  // create export checked documents button
  private Button createExportCheckedDocumentsButton()
  {
    Button exportCheckedDocumentsButton = new Button("Export Checked Documents");
    exportCheckedDocumentsButton.addClickHandler(new ClickHandler()
    {
      public void onClick(ClickEvent sender)
      {
        if (m_iDocumentSourceID == -5)
        {
          Window.alert("Please select a Document Source before choosing this option.");
        }
        else
        {
          Set markedRows = table.getMarkedRows();
          if (markedRows.size() == 0)
          {
            Window.alert("Please use the checkboxes to select the documents you wish to export. You may export one or several documents at once.");            

            return;
          }
          exportCheckedDocuments();
          table.clearMarkedRows();
        }
      }
    });
    exportCheckedDocumentsButton.setWidth("170");
    exportCheckedDocumentsButton.setHeight("24");
    
    return exportCheckedDocumentsButton;
  }
  
  // create reprocess checked documents button
  private Button createReprocessCheckedDocumentsButton()
  {
    Button reprocessCheckedDocumentsButton = new Button("Reprocess Checked Documents");
    reprocessCheckedDocumentsButton.addClickHandler(new ClickHandler()
    {
      public void onClick(ClickEvent sender)
      {
        if (m_iDocumentSourceID == -5)
        {
          Window.alert("Please select a Document Source before choosing this option.");
        }
        else
        {
          Set markedRows = table.getMarkedRows();
          if (markedRows.size() == 0)
          {
            Window.alert("Please use the checkboxes to select the documents you wish to reprocess. You may reprocess one or several documents at once.");
            

            return;
          }
          reprocessCheckedDocuments();
          table.clearMarkedRows();
        }
      }
    });
    reprocessCheckedDocumentsButton.setWidth("180");
    reprocessCheckedDocumentsButton.setHeight("24");
    
    return reprocessCheckedDocumentsButton;
  }  
  
  // create filter area
  private void createFilterArea()
  {
    HorizontalPanel horizontalPanel = new HorizontalPanel();
    verticalPanel.add(horizontalPanel);
    horizontalPanel.setSize("402px", "23px");
    
    Label labelFilter = new Label("Filter:");
    horizontalPanel.add(labelFilter);
    horizontalPanel.setCellVerticalAlignment(labelFilter, HasVerticalAlignment.ALIGN_MIDDLE);
    
    labelFilter.setWidth("50");
    
    final TextBox textBoxFilter = new TextBox();
    horizontalPanel.add(textBoxFilter);
    textBoxFilter.setWidth("100%");
    horizontalPanel.setCellWidth(textBoxFilter, "100%");
    
    Button buttonApplyFilter = new Button();
    horizontalPanel.add(buttonApplyFilter);
    buttonApplyFilter.addClickHandler(new ClickHandler()
    {
      public void onClick(ClickEvent sender)
      {
        String filterText = textBoxFilter.getText();
        DataFilter filter = new DataFilter("keyword", filterText);
        DataFilter[] filters = { filter };
        table.applyFilters(filters);
        labelMessages.setText("Filter '" + filterText + "' applied.");
      }
    });
    buttonApplyFilter.setWidth("100");
    horizontalPanel.setCellWidth(buttonApplyFilter, "100");
    horizontalPanel.setCellHorizontalAlignment(buttonApplyFilter, HasHorizontalAlignment.ALIGN_RIGHT);
    
    buttonApplyFilter.setText("Apply Filter");
    
    Button clearFilterButton = new Button();
    horizontalPanel.add(clearFilterButton);
    clearFilterButton.addClickHandler(new ClickHandler()
    {
      public void onClick(ClickEvent sender)
      {
        table.applyFilters(null);
        textBoxFilter.setText("");
        labelMessages.setText("Filter cleaned.");
      }
    });
    clearFilterButton.setWidth("100");
    horizontalPanel.setCellWidth(clearFilterButton, "100");
    clearFilterButton.setText("Clear Filter");
  }
  
  private void createLowerArea()
  {
    labelMessages = new Label("Event messages will appear here.");
    verticalPanel.add(labelMessages);
    labelMessages.setSize("402px", "19px");
    
    Button buttonMarkAll = new Button();
    lowerHorizontalPanel.add(buttonMarkAll);
    buttonMarkAll.addClickHandler(new ClickHandler()
    {
      public void onClick(ClickEvent sender)
      {
        table.markAllRows();
      }
    });
    buttonMarkAll.setSize("128px", "24px");
    buttonMarkAll.setText("Mark All");
    
    Button buttonMarkNothing = new Button();
    lowerHorizontalPanel.add(buttonMarkNothing);
    buttonMarkNothing.addClickHandler(new ClickHandler()
    {
      public void onClick(ClickEvent sender)
      {
        table.clearMarkedRows();
      }
    });
    buttonMarkNothing.setSize("128px", "24px");
    buttonMarkNothing.setText("Mark Nothing");
    
    Button buttonShowMarked = new Button();
    lowerHorizontalPanel.add(buttonShowMarked);
    buttonShowMarked.addClickHandler(new ClickHandler()
    {
      public void onClick(ClickEvent sender)
      {
        Set markedRows = table.getMarkedRows();
        Window.alert("Marked rows:" + markedRows.toString());
      }
    });
    buttonShowMarked.setSize("128px", "24px");
    buttonShowMarked.setText("Show Marked");
  }
  
  /*public class CloseListener
    implements ClickListener
  {
    private final ModalDialog m_dialog;
    
    public CloseListener(ModalDialog dialog)
    {
      m_dialog = dialog;
    }
    
    public void onClick(Widget sender)
    {
      m_dialog.hide();
    }
  }*/
  
  /*public class CloseButton
    extends Button
  {
    public CloseButton(ModalDialog dialog)
    {
      super();
      addClickListener(new CloseListener(dialog));
    }
    
    public CloseButton(ModalDialog dialog, String text)
    {
      super();
      addClickListener(new CloseListener(dialog));
    }
  }*/
  
  /*class AddButton
    extends Button
  {
    public AddButton(ModalDialog dialog, String text)
    {
      super();
      addClickListener(new AddListener(dialog));
    }
  }*/
  
  /*class AddListener
    implements ClickListener
  {
    private final ModalDialog m_dialog;
    
    public AddListener(ModalDialog dialog)
    {
      m_dialog = dialog;
    }
    
    public void onClick(Widget sender)
    {
      newDocument();
      m_dialog.hide();
    }
  }*/
  
  /*class EditButton
    extends Button
  {
    public EditButton(ModalDialog dialog, String text)
    {
      super();
      addClickListener(new EditListener(dialog));
    }
  }*/
  
  /*class EditListener
    implements ClickListener
  {
    private final ModalDialog m_dialog;
    
    public EditListener(ModalDialog dialog)
    {
      m_dialog = dialog;
    }
    
    public void onClick(Widget sender)
    {
      editDocument();
      m_dialog.hide();
    }
  }*/
  
  /*class ResetButton
    extends Button
  {
    public ResetButton(ModalDialog dialog, String text)
    {
      super();
      addClickListener(new EditListener(dialog));
    }
  }*/
  
  /*class ResetListener
    implements ClickListener
  {
    private final ModalDialog m_dialog;
    
    public ResetListener(ModalDialog dialog)
    {
      m_dialog = dialog;
    }
    
    public void onClick(Widget sender)
    {
      if ((!m_btnAllDocuments.isChecked()) && (!m_btnSomeDocuments.isChecked()))
      {
        Window.alert("Please select the number of documents to reset");
        return;
      }
      executeReset();
      m_dialog.hide();
    }
  }*/
  
  public void executeReset()
  {
    DocumentServiceProxy proxy = new DocumentServiceProxy();
    
    int iNumberOfDocumentsToReset = m_btnSomeDocuments.isChecked() ? 100 : 1000000;
    
    proxy.updateStatusOfDocsInSource(m_iDocumentSourceID, 1, iNumberOfDocumentsToReset);
  }
  
  public void onDocumentSourceSelected(DocumentSource ds)
  {
    if (ds != null) {
      m_iDocumentSourceID = ds.getDocumentSourceID();
      m_organizationID = ds.getOrganizationID();
    }
    if (documentPanelCounter == 0)
    {
      Label lbl = new Label();
      lbl.setText("Tools:");
      lbl.setStyleName("documentList-Title");
      hp.add(lbl);
      
      m_txtQuickViewDocID.setWidth("80");
      m_btnQuickView.setWidth("50");
      m_btnQuickView.setHeight("20");      

      m_btnQuickView.addClickHandler(new ClickHandler()
      {
        public void onClick(ClickEvent sender)
        {
          if (m_iDocumentSourceID == -5)
          {
            Window.alert("Please select a Document Source before choosing this option.");
          }
          else
          {
            try
            {
              m_lQuickViewDocumentID = Long.parseLong(m_txtQuickViewDocID.getText());
            }
            catch (NumberFormatException ex)
            {
              m_lQuickViewDocumentID = 0L;
              Window.alert("Invalid Document ID");
              return;
            }
            String currentDocumentOntologyString = table.grid.getText(table.selectedRowIndex + 1, 4);
            
            // ontology name
            ontologyName = currentDocumentOntologyString;
            
            m_dlgViewResult = new ViewResultDialog(m_lQuickViewDocumentID, currentDocumentOntologyString);            

            m_dlgViewResult.show();
          }
        }
      });
      hp.setVerticalAlignment(VerticalPanel.ALIGN_MIDDLE);
      
      hp.add(createUploadDocumentButton());
      hp.add(createNewDocumentButton());
      hp.add(createEditDocumentButton());
      hp.add(createDeleteDocumentButton());
      hp.add(createRefreshDocumentButton());
      hp.add(createResetDocumentsButton());
      hp.add(createReprocessCheckedDocumentsButton());
      hp.add(m_htmlQuickViewLabel);
      hp.add(m_txtQuickViewDocID);
      hp.add(m_btnQuickView);
      
      // add export document excel button
      hp.add(createExportCheckedDocumentsButton());
      
      hp.setSpacing(3);
      verticalPanel.add(hp);
      
      createFilterArea();
      
      callForDocuments();
      verticalPanel.add(table);
      
      createLowerArea();
      verticalPanel.add(lowerHorizontalPanel);
      
      documentPanelCounter += 1;
    }
    updateDocumentSourceId(m_iDocumentSourceID);
  }
  
  public void onMouseDown(Widget sender, int x, int y) {}
  
  public void onMouseMove(Widget sender, int x, int y) {}
  
  public void onMouseUp(Widget sender, int x, int y) {}
  
  public void onMouseEnter(Widget sender) {
		if (sender.equals(m_imgNew) || 
				sender.equals(m_imgDelete) ||
				sender.equals(m_imgEdit) ||
				sender.equals(m_imgUpload) ||
				sender.equals(m_imgRefresh) ||
				sender.equals(m_imgResetDocs) ) {

			sender.addStyleName("imageButton-OnMouseOver");
		}
	}

  public void onMouseLeave(Widget sender) {
		if (sender.equals(m_imgNew) || 
				sender.equals(m_imgDelete) ||
				sender.equals(m_imgEdit) ||
				sender.equals(m_imgUpload) ||
				sender.equals(m_imgRefresh) ||
				sender.equals(m_imgResetDocs)) {
			
			sender.removeStyleName("imageButton-OnMouseOver");
		}
	}

}
