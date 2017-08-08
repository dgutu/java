package com.searchincite.client.widgets.dialogs;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.searchincite.client.util.ColorUtil;
import com.searchincite.client.widgets.colorpicker.ui.HSVColorPicker;
import com.searchincite.client.widgets.colorpicker.util.RGB;

  public class ColorPickerDialog extends DialogBox {

	FlexTable m_tblMain = new FlexTable();
	HSVColorPicker m_ColorPicker = null;
	RGB m_rgbSelectedColor = null;
	private boolean m_bCanceled = false;
	
	public ColorPickerDialog(RGB InitialColor) 
	{
		  
		super();
		
		m_ColorPicker = new HSVColorPicker(InitialColor);
		
		setText("Pick Color");

		m_tblMain.setWidget(0, 0, m_ColorPicker);
		m_tblMain.getFlexCellFormatter().setColSpan(0, 0, 2);

		Button btnOK = new Button("OK", new ClickListener() 
		{
			public void onClick(Widget sender) {
				onClickOK();
			}
		});

		Button btnCancel = new Button("Cancel", new ClickListener() 
		{
			public void onClick(Widget sender) 
			{
				m_bCanceled = true;
				m_rgbSelectedColor = null;
				hide();
			}
		});

		HorizontalPanel hpButtons = new HorizontalPanel();
		hpButtons.setSpacing(4);
		hpButtons.add(btnOK);
		hpButtons.add(btnCancel);

		m_tblMain.setWidget(1, 1, hpButtons);
		m_tblMain.getFlexCellFormatter().setHorizontalAlignment(1, 1, HorizontalPanel.ALIGN_RIGHT);

		//m_ColorPicker.setSelectedColor(new RGB(127, 127, 127)); // This is not fully implemented

		setWidget(m_tblMain);
	}

	public boolean getCanceled() 
	{
		return m_bCanceled;
	}

	public String getSelectedColor() 
	{
		RGB color = m_ColorPicker.getSelectedColor(); 
		return ColorUtil.RGBtoHTMLHex(color.getRed(), color.getGreen(), color.getBlue());
	}
	
	private void onClickOK() 
	{
		m_rgbSelectedColor = m_ColorPicker.getSelectedColor(); 
		
		//Window.alert(ColorUtil.RGBtoHTMLHex(m_rgbSelectedColor.getRed(), m_rgbSelectedColor.getGreen(), m_rgbSelectedColor.getBlue()));

		if (m_rgbSelectedColor == null) {
			Window.alert("Please pick a new color for the selected subject before clicking OK, or click cancel to close the color picker dialog and keep the current color.");
			return;
		}
		
		m_bCanceled = false;
		hide();
	}
	
	public void show()
	{
		int left = (Window.getClientWidth() - getOffsetWidth()) / 2 + getBodyScrollLeft();
		int top = (Window.getClientHeight() - getOffsetHeight()) / 2 + getBodyScrollTop();
		setPopupPosition(left, top);
		super.show();
	}

	  private native int getBodyScrollLeft() /*-{
	        return $doc.body.scrollLeft;
	      }-*/;

	  private native int getBodyScrollTop() /*-{
	        return $doc.body.scrollTop;
	      }-*/;

  }
