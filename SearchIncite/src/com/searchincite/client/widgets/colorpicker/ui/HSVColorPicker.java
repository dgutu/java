/*
 * Copyright 2007 Robert Hanson <iamroberthanson AT gmail.com>
 *
 * Modified by Thomas Benjamin Thompson, working for iQ Guys in 2008.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.searchincite.client.widgets.colorpicker.ui;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.searchincite.client.util.ColorUtil;
import com.searchincite.client.widgets.colorpicker.definitions.HSVBarPaletteDefinition;
import com.searchincite.client.widgets.colorpicker.definitions.HSVPaletteDefinition;
import com.searchincite.client.widgets.colorpicker.util.ButtonStyleCommand;
import com.searchincite.client.widgets.colorpicker.util.RGB;

public class HSVColorPicker extends Composite implements ColorSelectedHandler
{
    private HorizontalPanel container;
    private ColorPanel colorPallete;
    private ColorPanel colorBar;
    private HSVPaletteDefinition colorPalleteGen = new HSVPaletteDefinition();
    private HSVBarPaletteDefinition colorBarGen = new HSVBarPaletteDefinition();
    private TextBox txtHue;
    private TextBox txtSaturation;
    private TextBox txtValue;
    private TextBox txtRed;
    private TextBox txtGreen;
    private TextBox txtBlue;
    private FlowPanel colorSwatch = new FlowPanel();
    
    public HSVColorPicker (RGB InitialColor)
    {
        container = new HorizontalPanel();
        container.setSpacing(5);
        initWidget(container);

        ButtonStyleCommand barButtonStyle = new ButtonStyleCommand();
        barButtonStyle.setBorder("none");
        barButtonStyle.setHeight("4px");
        barButtonStyle.setMargin("0");
        barButtonStyle.setPadding("0");
        barButtonStyle.setWidth("20px");

        txtHue = new DataBox();
        txtSaturation = new DataBox();
        txtValue = new DataBox();
        txtRed = new DataBox();
        txtGreen = new DataBox();
        txtBlue = new DataBox();
	
	double[] HSV = ColorUtil.RGBtoHSV(InitialColor.getRed(), InitialColor.getGreen(), InitialColor.getBlue());

	txtRed.setText(Integer.toString(InitialColor.getRed()));
	txtGreen.setText(Integer.toString(InitialColor.getGreen()));
	txtBlue.setText(Integer.toString(InitialColor.getBlue()));
    
	txtHue.setText(Integer.toString((int)(HSV[0] * 255)));
	txtSaturation.setText(Integer.toString((int)(HSV[1] * 255)));
	txtValue.setText(Integer.toString((int)(HSV[2] * 255)));

        txtHue.setEnabled(false);
        txtSaturation.setEnabled(false);
        txtValue.setEnabled(false);
        
        txtRed.setEnabled(false);
        txtGreen.setEnabled(false);
        txtBlue.setEnabled(false);
	
	colorPalleteGen.setStaticHue(HSV[0]);
	colorPallete = new ColorPanel(colorPalleteGen, InitialColor);
        colorPallete.addColorSelectedHandler(this);
        container.add(colorPallete);
	
        colorBar = new ColorPanel(colorBarGen, barButtonStyle, InitialColor, true);
        colorBar.addColorSelectedHandler(this);
        container.add(colorBar);
        
        VerticalPanel dataPanel = new VerticalPanel();

        colorSwatch.setWidth("58px");
        colorSwatch.setHeight("40px");
        DOM.setStyleAttribute(colorSwatch.getElement(), "border", "1px solid black");
        DOM.setStyleAttribute(colorSwatch.getElement(), "marginBottom", "4px");
        dataPanel.add(colorSwatch);
        
        {
            HorizontalPanel f = new HorizontalPanel();
            f.add(new HTML("<span style='font-family:courier'>H&nbsp;</span>"));
            f.add(txtHue);
            dataPanel.add(f);
        }
        
        {
            HorizontalPanel f = new HorizontalPanel();
            f.add(new HTML("<span style='font-family:courier'>S&nbsp;</span>"));
            f.add(txtSaturation);
            dataPanel.add(f);
        }

        {
            HorizontalPanel f = new HorizontalPanel();
            f.add(new HTML("<span style='font-family:courier'>V&nbsp;</span>"));
            f.add(txtValue);
            dataPanel.add(f);
        }

        dataPanel.add(new HTML("<hr />"));

        {
            HorizontalPanel f = new HorizontalPanel();
            f.add(new HTML("<span style='font-family:courier'>R&nbsp;</span>"));
            f.add(txtRed);
            dataPanel.add(f);
        }

        {
            HorizontalPanel f = new HorizontalPanel();
            f.add(new HTML("<span style='font-family:courier'>G&nbsp;</span>"));
            f.add(txtGreen);
            dataPanel.add(f);
        }

        {
            HorizontalPanel f = new HorizontalPanel();
            f.add(new HTML("<span style='font-family:courier'>B&nbsp;</span>"));
            f.add(txtBlue);
            dataPanel.add(f);
        }


        
        container.add(dataPanel);
    }

    public RGB getSelectedColor() {
    	
    	try {
	    	RGB rgbColor = new RGB();
	    	rgbColor.setRed(Integer.parseInt(txtRed.getText()));
	    	rgbColor.setGreen(Integer.parseInt(txtGreen.getText()));
	    	rgbColor.setBlue(Integer.parseInt(txtBlue.getText()));
			return rgbColor;
    	}
    	catch (NumberFormatException ex) {
    		return null;
    	}
    }
    
    /*
    public void setSelectedColor(RGB rgbColor) {
    	
    	txtRed.setText(String.valueOf(rgbColor.getRed()));
    	txtGreen.setText(String.valueOf(rgbColor.getGreen()));
    	txtBlue.setText(String.valueOf(rgbColor.getBlue()));
    	
        double[] HSV = ColorUtil.RGBtoHSV(rgbColor.getRed(), rgbColor.getGreen(), rgbColor.getBlue());
        
        txtHue.setText(Integer.toString((int)(HSV[0] * 255)));
        txtSaturation.setText(Integer.toString((int)(HSV[1] * 255)));
        txtValue.setText(Integer.toString((int)(HSV[2] * 255)));
        
        DOM.setStyleAttribute(colorSwatch.getElement(), "backgroundColor", ColorUtil.RGBtoHTMLHex(rgbColor.getRed(), rgbColor.getGreen(), rgbColor.getBlue()));
        colorPallete.redrawPalette();
    }
    */
    
    public void onColorSelected (ColorSelectedEvent e)
    {
        if (e.getSource() == colorPallete) {
            txtRed.setText(Integer.toString(e.getRed()));
            txtGreen.setText(Integer.toString(e.getGreen()));
            txtBlue.setText(Integer.toString(e.getBlue()));
            
            double[] HSV = ColorUtil.RGBtoHSV(e.getRed(), e.getGreen(), e.getBlue());
            
            txtHue.setText(Integer.toString((int)(HSV[0] * 255)));
            txtSaturation.setText(Integer.toString((int)(HSV[1] * 255)));
            txtValue.setText(Integer.toString((int)(HSV[2] * 255)));
            
            DOM.setStyleAttribute(colorSwatch.getElement(), "backgroundColor", e.getHexValue());
        }
        else if (e.getSource() == colorBar) {
            double newHue = 1.0 - (e.getPosition() / (double)e.getMaxPositionY());
            colorPalleteGen.setStaticHue(newHue);
            colorPallete.redrawPalette();
        }
    }
    
}