/*
 * Copyright 2007 Robert Hanson <iamroberthanson AT gmail.com>
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
package com.searchincite.client.widgets.colorpicker.definitions;

import com.searchincite.client.util.ColorUtil;
import com.searchincite.client.widgets.colorpicker.util.RGB;


public class HSVPaletteDefinition implements ColorPaletteDefinition
{
    private final int KEY_HUE = 1;
    private final int KEY_SAT = 2;
    private final int KEY_VAL = 3;
    private int keyOn = KEY_HUE;
    private double staticHue = 1.0;
    private double staticSaturation;
    private double staticValue;

    
    
    public int getHeight ()
    {
        return 16;
    }

    public int getWidth ()
    {
        return 16;
    }

    public String[] getHexColorValues ()
    {
        return null;
    }

	public double getHue(int iX, int iY)
	{
		if(keyOn == KEY_HUE)
		{
			return staticHue;
		}
		else
		{
			return ((((double)iX) * 17) / 255);
		}
	}
    
    public RGB[] getRGBValues ()
    {
        RGB[] result = new RGB[256];

        int c = 0;
        for (double y = 0; y <= 255; y += 17) {
            for (double x = 0; x <= 255; x += 17) {

                int[] rgb = null;
                switch (keyOn) {
                    case KEY_HUE:
                        rgb = ColorUtil.HSVtoRGB(staticHue, x/255, 1.0 - y/255);
                        break;
                    case KEY_SAT:
                        rgb = ColorUtil.HSVtoRGB(x/255, staticSaturation, 1.0 - y/255);
                        break;
                    case KEY_VAL:
                        rgb = ColorUtil.HSVtoRGB(x/255, 1.0 - y/255, staticValue);
                        break;
                }
                
                result[c] = new RGB(rgb[0], rgb[1], rgb[2]);
                c++;
            }
        }

        return result;
    }
    
    

    public void setStaticHue (double staticHue)
    {
        keyOn = KEY_HUE;
        this.staticHue = staticHue;
    }

    public void setStaticSaturation (double staticSaturation)
    {
        keyOn = KEY_SAT;
        this.staticSaturation = staticSaturation;
    }

    public void setStaticValue (double staticValue)
    {
        keyOn = KEY_VAL;
        this.staticValue = staticValue;
    }

    public int getDefaultSelected ()
    {
        return 15;  // This is the INDEX of the square that is selected by default in the color grid
    	//return 25;
    }

    
}