/*
 * @author Eric Wayman
 */

package com.searchincite.client.widgets;

import java.util.Set;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FocusWidget;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.MouseListener;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import com.searchincite.client.entity.DocumentSource;
import com.searchincite.client.entity.DocumentWithResult;
import com.searchincite.client.listeners.DocumentSourceSelectionListener;
import com.searchincite.client.widgets.advancedtable.AdvancedTable;
import com.searchincite.client.widgets.advancedtable.DataFilter;
import com.searchincite.client.widgets.advancedtable.ServiceUtils;
import com.searchincite.client.widgets.advancedtable.TableModelService;
import com.searchincite.client.widgets.advancedtable.TableModelServiceAsync;
import com.searchincite.client.widgets.advancedtable.RowSelectionListener;

import asquare.gwt.tk.client.ui.ColumnPanel;
import asquare.gwt.tk.client.ui.ModalDialog;
import asquare.gwt.tk.client.ui.behavior.FocusModel;

import com.google.gwt.user.client.ui.HTMLTable.CellFormatter;

public class AutofeedPanel extends Composite implements DocumentSourceSelectionListener,
		MouseListener {

	// private DockPanel panel;
	private VerticalPanel panel;

	private Label labelMessages;
	
	final HorizontalPanel upperHorizontalPanel = new HorizontalPanel();
	
	final AdvancedTable table = new AdvancedTable();
	
	final HorizontalPanel lowerHorizontalPanel = new HorizontalPanel();
	
	TextBox addTextBoxUrl = null;
	TextBox addTextBoxDescription = null;
	CheckBox addCheckBoxActive = null;
	CheckBox addCheckBoxRecursive = null;
	
	TextBox editTextBoxUrl = null;
	TextBox editTextBoxDescription = null;
	CheckBox editCheckBoxActive = null;
	CheckBox editCheckBoxRecursive = null;
	
	private Image m_imgNew = null;
	private Image m_imgEdit = null;
	private Image m_imgDelete = null;

	public AutofeedPanel() {

		panel = new VerticalPanel();
		panel.setHeight("100%");
		panel.setWidth("100%");

		// initDockPanel();

		Label lbl = new Label();
		lbl.setText("Tools:");
		lbl.setStyleName("documentList-Title");
		upperHorizontalPanel.add(lbl);
		
		upperHorizontalPanel.add(this.createNewAutofeedButton());
		upperHorizontalPanel.add(this.createEditAutofeedButton());
		upperHorizontalPanel.add(this.createDeleteAutofeedButton());
		upperHorizontalPanel.setSpacing(3);
		upperHorizontalPanel.setVerticalAlignment(VerticalPanel.ALIGN_MIDDLE);
		panel.add(upperHorizontalPanel);
		
		this.createFilterArea();
		
		this.callForAutofeeds();
		panel.add(table);
		
		this.createLowerArea();
		panel.add(lowerHorizontalPanel);
		
		initWidget(panel);
	}

	public void callForAutofeeds() {

		TableModelServiceAsync autofeedsTableService = ServiceUtils
				.getTableModelServiceAsync();
		table.setAllowRowMark(true);
		// table.setFirstColumnVisible(false);
		table.setTableModelService(autofeedsTableService);
		table.addRowSelectionListener(new RowSelectionListener() {
			public void onRowSelected(AdvancedTable sender, String rowId) {
				labelMessages.setText("Row " + rowId + " selected.");
			}
		});

		// table.setSize("402px", "175px");
		table.setSize("100%", "100%");
		table.setPageSize(20);

	}
	
	public void newAutofeed() {
		String url = addTextBoxUrl.getText();
		String description = addTextBoxDescription.getText();
		boolean active = addCheckBoxActive.isChecked();
		boolean recursive = addCheckBoxRecursive.isChecked();
		
		TableModelServiceAsync autofeedsTableService = ServiceUtils
				.getTableModelServiceAsync();
		
		autofeedsTableService.newAutofeed(url, description, active, 
				recursive, new AsyncCallback() {
			// This method will be called if the service call fails   
			public void onFailure(Throwable caught) {
				// Show a message informing the user why the call failed   
				Window.alert("Failed to get response from server" + caught.getMessage());
			}
			// This method will be called if the service call succeeds   
			public void onSuccess(Object result) {
				// Get the service call result and cast it to the desired type and display it
				table.updateTableData();
				// Window.alert("Autofeed added!");
			}
		});
		
	}
	
	public void editAutofeed() {
		String url = editTextBoxUrl.getText();
		String description = editTextBoxDescription.getText();
		boolean active = editCheckBoxActive.isChecked();
		boolean recursive = editCheckBoxRecursive.isChecked();
		
		String rowId = table.getSelectedRowId();
		
		// Window.alert(rowId);
		
		TableModelServiceAsync autofeedsTableService = ServiceUtils
				.getTableModelServiceAsync();

		autofeedsTableService.editAutofeed(url, description, active, 
				recursive, rowId, new AsyncCallback() {
			// This method will be called if the service call fails   
			public void onFailure(Throwable caught) {
				// Show a message informing the user why the call failed   
				Window.alert("Failed to get response from server" + caught.getMessage());
			}
			// This method will be called if the service call succeeds   
			public void onSuccess(Object result) {
				// Get the service call result and cast it to the desired type and display it
				table.updateTableData();
			}
		});
	}
	
	public void deleteAutofeeds() {
		Set markedRows = table.getMarkedRows();
		
		String[] markedRowsArray = (String[])markedRows.toArray(new String[markedRows.size()]);
		
		TableModelServiceAsync autofeedsTableService = ServiceUtils
				.getTableModelServiceAsync();
		autofeedsTableService.deleteAutofeeds(markedRowsArray, new AsyncCallback() {
			// This method will be called if the service call fails   
			public void onFailure(Throwable caught) {
				// Show a message informing the user why the call failed   
				Window.alert("Failed to get response from server" + caught.getMessage());
			}
			// This method will be called if the service call succeeds   
			public void onSuccess(Object result) {
				// Get the service call result and cast it to the desired type and display it
				table.updateTableData();
				// Window.alert("Autofeeds deleted.");
			}
		});
	}
	
	public void updateDocumentSourceId(int m_iDocumentSourceID) {
		TableModelServiceAsync autofeedsTableService = ServiceUtils
				.getTableModelServiceAsync();
		
		autofeedsTableService.updateDocumentSourceId(m_iDocumentSourceID, new AsyncCallback() {
			// This method will be called if the service call fails   
			public void onFailure(Throwable caught) {
				// Show a message informing the user why the call failed   
				Window.alert("Failed to get response from server" + caught.getMessage());
			}
			// This method will be called if the service call succeeds   
			public void onSuccess(Object result) {
				// Get the service call result and cast it to the desired type and display it
				// Window.alert("Update document source Id succeeded!");
				table.updateTableData();
			}
		});
	}
	
	//private Button createNewAutofeedButton() {
	private Image createNewAutofeedButton() {
		
		// final Button newAutofeedButton = new Button("New Autofeed");
		
		m_imgNew = new Image("images/new.gif");
		m_imgNew.setSize("16px", "16px");
		m_imgNew.setTitle("New Autofeed");
		m_imgNew.addStyleName("imageButton");
		// m_imgNew.addMouseListener(this);
		// m_imgNew.addClickListener(this);
		
		// newAutofeedButton.addClickListener(new ClickListener(){
		m_imgNew.addClickListener(new ClickListener(){
			public void onClick(Widget sender) {

				final ModalDialog dialog = new ModalDialog();
				dialog.setCaption("New Autofeed", false);
				FocusModel fModel = dialog.getFocusModel();

				final int FIELD_COUNT = 4;
				Grid table = new Grid(FIELD_COUNT, 2);
				dialog.add(table);
				Widget[] labels = new Widget[FIELD_COUNT];
				labels[0] = new Label("URL: ");
				labels[1] = new Label("Description: ");
				labels[2] = new Label("Active ");
				labels[3] = new Label("Recursive ");

				FocusWidget[] fields = new FocusWidget[FIELD_COUNT];
				fields[0] = new TextBox();
				fields[1] = new TextBox();
				fields[2] = new CheckBox();
				fields[3] = new CheckBox();
				
				addTextBoxUrl = (TextBox) fields[0];
				addTextBoxDescription = (TextBox) fields[1];
				addCheckBoxActive = (CheckBox) fields[2];
				addCheckBoxRecursive = (CheckBox) fields[3];

				CellFormatter formatter = table.getCellFormatter();
				for (int i = 0; i < labels.length; i++) {
					table.setWidget(i, 0, labels[i]);
					formatter.setHorizontalAlignment(i, 0,
							HasHorizontalAlignment.ALIGN_LEFT);
					table.setWidget(i, 1, fields[i]);
					fModel.add(fields[i]);
				}
				fModel.setFocusWidget(fields[0]);

				ColumnPanel buttonPanel = new ColumnPanel();
				buttonPanel.setWidth("100%");
				dialog.add(buttonPanel);

				Button closeButton = new AddButton(dialog, "OK");
				fModel.add(closeButton);
				buttonPanel.add(closeButton);

				Button cancelButton = new CloseButton(dialog, "Cancel");
				fModel.add(cancelButton);
				buttonPanel.addWidget(cancelButton, false);
				buttonPanel.setCellHorizontalAlignment(ColumnPanel.ALIGN_RIGHT);
				
				//dialog.show(newAutofeedButton);
				dialog.show();

				// AddAutofeedDialog addAutofeeDialog = new AddAutofeedDialog();
				// addAutofeeDialog.show();
			}
		});
		
		m_imgNew.addMouseListener(this);
		
		//newAutofeedButton.setSize("128px", "24px");
		//newAutofeedButton.setText("New Autofeed");
		//upperHorizontalPanel.add(newAutofeedButton);
		upperHorizontalPanel.add(m_imgNew);
		return m_imgNew;
		
	}
	
	// private Button createEditAutofeedButton() {
	private Image createEditAutofeedButton() {

		// final Button editAutofeedButton = new Button();
		m_imgEdit = new Image("images/edit.gif");
		m_imgEdit.setSize("16px", "16px");
		m_imgEdit.setTitle("Edit Selected Autofeed");
		m_imgEdit.addStyleName("imageButton");
		
		// editAutofeedButton.addClickListener(new ClickListener() {
		m_imgEdit.addClickListener(new ClickListener() {
			public void onClick(Widget sender) {
				
				// String rowId = table.getSelectedRowId();
				
				// Window.alert("getSelectedRowID: " + rowId + " , selectedRowIndex: " + 
				//		table.selectedRowIndex);
				
				// int rowIdInteger = Integer.parseInt(rowId);
				
				// Window.alert(currentRowUrl);
				// Window.alert(currentRowDescription);
				// Window.alert(currentRowActiveString);
				
				// if (rowId == null) {
				if (table.selectedRowIndex == -1) {
					Window.alert("Please select an autofeed to Edit.");
					return;
				}
				
				String currentRowUrl = table.grid.getText(table.selectedRowIndex, 2);
				String currentRowDescription = table.grid.getText(table.selectedRowIndex, 3);
				String currentRowActiveString = table.grid.getText(table.selectedRowIndex, 5);
				boolean currentRowActive = Boolean.valueOf(Boolean.valueOf(currentRowActiveString));
				String currentRowRecursiveString = table.grid.getText(table.selectedRowIndex, 6);
				boolean currentRowRecursive = Boolean.valueOf(Boolean.valueOf(currentRowRecursiveString));
				
				final ModalDialog dialog = new ModalDialog();
				dialog.setCaption("Edit Autofeed", false);
				FocusModel fModel = dialog.getFocusModel();

				final int FIELD_COUNT = 4;
				Grid table = new Grid(FIELD_COUNT, 2);
				dialog.add(table);
				Widget[] labels = new Widget[FIELD_COUNT];
				labels[0] = new Label("URL: ");
				labels[1] = new Label("Description: ");
				labels[2] = new Label("Active ");
				labels[3] = new Label("Recursive ");

				FocusWidget[] fields = new FocusWidget[FIELD_COUNT];
				fields[0] = new TextBox();
				fields[1] = new TextBox();
				fields[2] = new CheckBox();
				fields[3] = new CheckBox();
				
				editTextBoxUrl = (TextBox) fields[0];
				editTextBoxDescription = (TextBox) fields[1];
				editCheckBoxActive = (CheckBox) fields[2];
				editCheckBoxRecursive = (CheckBox) fields[3];
				
				((TextBox) fields[0]).setText(currentRowUrl);
				((TextBox) fields[1]).setText(currentRowDescription);
				((CheckBox) fields[2]).setChecked(currentRowActive);
				
				CellFormatter formatter = table.getCellFormatter();
				for (int i = 0; i < labels.length; i++) {
					table.setWidget(i, 0, labels[i]);
					formatter.setHorizontalAlignment(i, 0,
							HasHorizontalAlignment.ALIGN_LEFT);
					table.setWidget(i, 1, fields[i]);
					fModel.add(fields[i]);
				}
				fModel.setFocusWidget(fields[0]);

				ColumnPanel buttonPanel = new ColumnPanel();
				buttonPanel.setWidth("100%");
				dialog.add(buttonPanel);

				Button closeButton = new EditButton(dialog, "OK");
				fModel.add(closeButton);
				buttonPanel.add(closeButton);

				Button cancelButton = new CloseButton(dialog, "Cancel");
				fModel.add(cancelButton);
				buttonPanel.addWidget(cancelButton, false);
				buttonPanel.setCellHorizontalAlignment(ColumnPanel.ALIGN_RIGHT);

				// dialog.show(editAutofeedButton);
				dialog.show();

				// AddAutofeedDialog addAutofeeDialog = new AddAutofeedDialog();
				// addAutofeeDialog.show();
				
			}
		});
		
		m_imgEdit.addMouseListener(this);
		
		// editAutofeedButton.setSize("128px", "24px");
		// editAutofeedButton.setText("Edit Selected Autofeed");
		// upperHorizontalPanel.add(editAutofeedButton);
		upperHorizontalPanel.add(m_imgEdit);
		// return editAutofeedButton;
		return m_imgEdit;
		
	}
	
	// private Button createDeleteAutofeedButton() {
	private Image createDeleteAutofeedButton() {
		
		// final Button deleteAutofeedButton = new Button();
		m_imgDelete = new Image("images/delete.gif");
		m_imgDelete.setSize("16px", "16px");
		m_imgDelete.setTitle("Delete Checked Autofeeds");
		m_imgDelete.addStyleName("imageButton");
		
		// upperHorizontalPanel.add(deleteAutofeedButton);
		upperHorizontalPanel.add(m_imgDelete);
		// deleteAutofeedButton.addClickListener(new ClickListener() {
		m_imgDelete.addClickListener(new ClickListener() {
			public void onClick(Widget sender) {
				
				Set markedRows = table.getMarkedRows();
				if (markedRows.size() == 0) {
					Window.alert("Please use the checkboxes to select the autofeeds " +
							"you wish to delete. You may delete one or several autofeeds " +
							"at once.");
					return;
				}
				
				deleteAutofeeds();
				table.clearMarkedRows();
			}
		});
		
		m_imgDelete.addMouseListener(this);
		
		// deleteAutofeedButton.setSize("128px", "24px");
		// deleteAutofeedButton.setText("Delete Selected Autofeeds");
		
		// return deleteAutofeedButton;
		return m_imgDelete;
		
	}
	
	private void createFilterArea() {
	
		final HorizontalPanel horizontalPanel = new HorizontalPanel();
		panel.add(horizontalPanel);
		horizontalPanel.setSize("402px", "23px");

		final Label labelFilter = new Label("Filter:");
		horizontalPanel.add(labelFilter);
		horizontalPanel.setCellVerticalAlignment(labelFilter,
				HasVerticalAlignment.ALIGN_MIDDLE);
		labelFilter.setWidth("50");

		final TextBox textBoxFilter = new TextBox();
		horizontalPanel.add(textBoxFilter);
		textBoxFilter.setWidth("100%");
		horizontalPanel.setCellWidth(textBoxFilter, "100%");

		final Button buttonApplyFilter = new Button();
		horizontalPanel.add(buttonApplyFilter);
		buttonApplyFilter.addClickListener(new ClickListener() {
			public void onClick(Widget sender) {
				String filterText = textBoxFilter.getText();
				DataFilter filter = new DataFilter("keyword", filterText);
				DataFilter[] filters = { filter };
				table.applyFilters(filters);
				labelMessages.setText("Filter '" + filterText + "' applied.");
			}
		});
		buttonApplyFilter.setWidth("100");
		horizontalPanel.setCellWidth(buttonApplyFilter, "100");
		horizontalPanel.setCellHorizontalAlignment(buttonApplyFilter,
				HasHorizontalAlignment.ALIGN_RIGHT);
		buttonApplyFilter.setText("Apply Filter");

		final Button clearFilterButton = new Button();
		horizontalPanel.add(clearFilterButton);
		clearFilterButton.addClickListener(new ClickListener() {
			public void onClick(Widget sender) {
				table.applyFilters(null);
				textBoxFilter.setText("");
				labelMessages.setText("Filter cleaned.");
			}
		});
		clearFilterButton.setWidth("100");
		horizontalPanel.setCellWidth(clearFilterButton, "100");
		clearFilterButton.setText("Clear Filter");

	}
		
	private void createLowerArea() {

		this.labelMessages = new Label("Event messages will appear here.");
		panel.add(this.labelMessages);
		labelMessages.setSize("402px", "19px");

		final Button buttonMarkAll = new Button();
		lowerHorizontalPanel.add(buttonMarkAll);
		buttonMarkAll.addClickListener(new ClickListener() {
			public void onClick(Widget sender) {
				table.markAllRows();
			}
		});
		buttonMarkAll.setSize("128px", "24px");
		buttonMarkAll.setText("Mark All");

		final Button buttonMarkNothing = new Button();
		lowerHorizontalPanel.add(buttonMarkNothing);
		buttonMarkNothing.addClickListener(new ClickListener() {
			public void onClick(Widget sender) {
				table.clearMarkedRows();
			}
		});
		buttonMarkNothing.setSize("128px", "24px");
		buttonMarkNothing.setText("Mark Nothing");

		final Button buttonShowMarked = new Button();
		lowerHorizontalPanel.add(buttonShowMarked);
		buttonShowMarked.addClickListener(new ClickListener() {
			public void onClick(Widget sender) {
				Set markedRows = table.getMarkedRows();
				Window.alert("Marked rows:" + markedRows.toString());
			}
		});
		buttonShowMarked.setSize("128px", "24px");
		buttonShowMarked.setText("Show Marked");

	}

	class CloseListener implements ClickListener {
		private final ModalDialog m_dialog;

		public CloseListener(ModalDialog dialog) {
			m_dialog = dialog;
		}

		public void onClick(Widget sender) {
			m_dialog.hide();
		}
	}

	class CloseButton extends Button {
		public CloseButton(ModalDialog dialog) {
			super("Close");
			addClickListener(new CloseListener(dialog));
		}

		public CloseButton(ModalDialog dialog, String text) {
			super(text);
			addClickListener(new CloseListener(dialog));
		}
	}
	
	class AddButton extends Button {
		public AddButton(ModalDialog dialog, String text) {
			super(text);
			addClickListener(new AddListener(dialog));
		}
	}
	
	class AddListener implements ClickListener {
		private final ModalDialog m_dialog;

		public AddListener(ModalDialog dialog) {
			m_dialog = dialog;
		}

		public void onClick(Widget sender) {
			newAutofeed();
			m_dialog.hide();
		}
	}
	
	class EditButton extends Button {
		public EditButton(ModalDialog dialog, String text) {
			super(text);
			addClickListener(new EditListener(dialog));
		}
	}
	
	class EditListener implements ClickListener {
		private final ModalDialog m_dialog;

		public EditListener(ModalDialog dialog) {
			m_dialog = dialog;
		}

		public void onClick(Widget sender) {
			editAutofeed();
			m_dialog.hide();
		}
	}
	
	public void onDocumentSourceSelected(DocumentSource ds) {
		
		int m_iDocumentSourceID = 0;
		
		// Window.alert("DocumentPanel::onDocumentSourceSelected; DocumentSourceID: " + String.valueOf(ds.getDocumentSourceID()));
		
		// DocumentWithResult[] arrDocuments = null;
		
		if (ds != null) {
			m_iDocumentSourceID = ds.getDocumentSourceID();
			
			// arrDocuments = (DocumentWithResult[])ds.getDocuments();
		}
		// setDocuments(arrDocuments);
		// refreshList();
		// Window.alert("" + m_iDocumentSourceID);
		updateDocumentSourceId(m_iDocumentSourceID);
	}
	
	public void onMouseDown(Widget sender, int x, int y) {
		// TODO Auto-generated method stub
		//Window.alert("onMouseDown");
	}

	public void onMouseMove(Widget sender, int x, int y) {
		// TODO Auto-generated method stub
		
	}

	public void onMouseUp(Widget sender, int x, int y) {
		// TODO Auto-generated method stub
		//Window.alert("onMouseUp");
	}

	public void onMouseEnter(Widget sender) {

		if (sender.equals(m_imgNew) || 
				sender.equals(m_imgDelete) ||
				sender.equals(m_imgEdit)) {

			sender.addStyleName("imageButton-OnMouseOver");
		}
		
		
	}

	public void onMouseLeave(Widget sender) {
		if (sender.equals(m_imgNew) || 
				sender.equals(m_imgDelete) ||
				sender.equals(m_imgEdit)) {
			
			sender.removeStyleName("imageButton-OnMouseOver");
		}
	}
	
}

// private void initDockPanel() {
// panel = new DockPanel();
// panel.setBorderWidth(1);
// panel.setSpacing(5);
// panel.add(buildActionPanel(), DockPanel.NORTH);
// this.callForAutofeeds();
// }

//public HorizontalPanel buildActionPanel() {
//	HorizontalPanel actions = new HorizontalPanel();
//
//	actions.setSpacing(10);
//	Button clear = new Button("Clear");
//	// clear.addClickListener(new ClearClickListener());
//	Button newPizza = new Button("Another Pizza");
//	Button submitOrder = new Button("Submit");
//	actions.add(clear);
//	actions.add(newPizza);
//	actions.add(submitOrder);
//	return actions;
//}

// public void callForAutofeeds() {
// AutofeedServiceAsync autofeedsTableModelService =
// (AutofeedServiceAsync) GWT.create(AutofeedService.class);
// ServiceDefTarget target = (ServiceDefTarget) autofeedsTableModelService;
// String relativeUrl = GWT.getModuleBaseURL() + "autofeeds";
// target.setServiceEntryPoint(relativeUrl);
// autofeedsTableModelService.getAllAutofeeds(new AutofeedCallback());
// }

// public class AutofeedCallback implements AsyncCallback {
//
// public void onFailure(Throwable caught) {
// GWT.log("Error ", caught);
// caught.printStackTrace();
// }
//
// public void onSuccess(Object result) {
//			
// List allAutofeeds = (List) result;
//			
// VerticalPanel autofeeds = new VerticalPanel();
//			
// final AdvancedTable table = new AdvancedTable();
//			
// TableModelServiceAsync autofeedsTableService =
// ServiceUtils.getTableModelServiceAsync();
//			
// table.setAllowRowMark(true);
// table.setTableModelService(autofeedsTableService);
// table.addRowSelectionListener(new RowSelectionListener() {
// public void onRowSelected(AdvancedTable sender, String rowId) {
// labelMessages.setText("Row " + rowId + " selected.");
// }
// });
//			
// autofeeds.add(table);
// table.setSize("402px", "175px");
// table.setPageSize(5);
//			
// // List allAutofeeds = (List) result;
// // VerticalPanel autofeeds = new VerticalPanel();
// // autofeeds.add(new HTML("<h2>Autofeeds</h2>"));
// // Grid topGrid = new Grid(allAutofeeds.size() + 1, 6);
// // topGrid.setText(0, 0, "ID");
// // topGrid.setText(0, 1, "URL");
// // topGrid.setText(0, 2, "Description");
// // topGrid.setText(0, 3, "Ontology");
// // topGrid.setText(0, 4, "Last Updated");
// // topGrid.setText(0, 5, "On");
// // for (int i = 0; i < allAutofeeds.size(); i++) {
// // Autofeed a = (Autofeed) allAutofeeds.get(i);
// // topGrid.setText(i + 1, 0, "" + a.getWebsiteId());
// // topGrid.setText(i + 1, 1, a.getUrl());
// // topGrid.setText(i + 1, 2, a.getDescription());
// // topGrid.setText(i + 1, 3, "" + a.getOntologyId());
// // topGrid.setText(i + 1, 4, "" + a.getLastCheckedDate());
// // topGrid.setText(i + 1, 5, "" + a.isActive());
// // }
// // autofeeds.add(topGrid);
// panel.add(autofeeds, DockPanel.EAST);
// }
//		
// }