package com.searchincite.client.util;

import com.searchincite.client.widgets.colorpicker.util.RGB;
public class ColorUtil {

	public static String getFontColor(String strBackgroundColor) {
		
		strBackgroundColor = strBackgroundColor.trim().toLowerCase();
		
		//TODO: Return appropriate font color (black or white) based on RGB value of background color.
		
		// Two colors provide good color visibility if the brightness difference and the 
		// color difference between the two colors are greater than a set range.

		// Color brightness is determined by the following formula:
		// ((Red value X 299) + (Green value X 587) + (Blue value X 114)) / 1000
		// Note: This algorithm is taken from a formula for converting RGB values to YIQ values. 
		//This brightness value gives a perceived brightness for a color.

		// Color difference is determined by the following formula:
		// (maximum (Red value 1, Red value 2) - minimum (Red value 1, Red value 2)) + (maximum (Green value 1, Green value 2) - minimum (Green value 1, Green value 2)) + (maximum (Blue value 1, Blue value 2) - minimum (Blue value 1, Blue value 2))

		// The minimum value for optimum color brightness difference is 125. 
		// The minimum value for optimum color difference is 500.

		String strColor = "#000000"; //default: #ffffff (white)

		// If input color is not in hex format, return default (black font)
		
		// Strip any leading pound sign
		if (strBackgroundColor.startsWith("#")) {
			strBackgroundColor = strBackgroundColor.substring(1);
		}

		if (strBackgroundColor.length() != 6) {
			// Not hex format
			return strColor;
		}
		
		// !!NOTE!! RETURN ONLY RGB VALUES -- 7 CHARACTERS IN LENGTH (INCLDING THE POUND SIGN PREFIX)
		
		String strRedHex = strBackgroundColor.substring(0, 1);
		String strGreenHex = strBackgroundColor.substring(2, 3);
		String strBlueHex = strBackgroundColor.substring(4, 5);

		int iRed = Integer.parseInt(strRedHex, 16);
		int iGreen = Integer.parseInt(strGreenHex, 16);
		int iBlue = Integer.parseInt(strBlueHex, 16);
		
		int iColorBrightness = (((iRed * 299) + (iBlue * 587) + (iGreen * 114)) / 1000);
		
		int iWhiteBrightness = 255;
		int iBlackBrightness = 0;

		int iWhiteDifference = Math.abs(iWhiteBrightness - iColorBrightness);
		int iBlackDifference = Math.abs(iBlackBrightness - iColorBrightness);

		if (iWhiteDifference > iBlackDifference) {
			strColor = "#ffffff"; //white
		}
		else { 
			strColor = "#000000"; //black
		}
		
		return strColor.toLowerCase(); // Return only lowercase strings that are SEVEN characters in length
	}
	
    public static int[] HSVtoRGB (double hue, double saturation, double value)
    {
        int R, G, B;
        //String sR="ff",sG="ff",sB="ff";
        if (saturation == 0) //HSV values = 0 ÷ 1
        {
            R = new Double(value * 255).intValue();
            G = new Double(value * 255).intValue();
            B = new Double(value * 255).intValue();
        }
        else {
            double var_h = hue * 6;
            if (var_h == 6) var_h = 0; //H must be < 1
            int var_i = new Double(Math.floor(var_h)).intValue(); //Or ... var_i = floor( var_h )
            double var_1 = value * (1 - saturation);
            double var_2 = value * (1 - saturation * (var_h - var_i));
            double var_3 = value * (1 - saturation * (1 - (var_h - var_i)));
            double var_r;
            double var_g;
            double var_b;
            if (var_i == 0) {
                var_r = value;
                var_g = var_3;
                var_b = var_1;
            }
            else if (var_i == 1) {
                var_r = var_2;
                var_g = value;
                var_b = var_1;
            }
            else if (var_i == 2) {
                var_r = var_1;
                var_g = value;
                var_b = var_3;
            }
            else if (var_i == 3) {
                var_r = var_1;
                var_g = var_2;
                var_b = value;
            }
            else if (var_i == 4) {
                var_r = var_3;
                var_g = var_1;
                var_b = value;
            }
            else {
                var_r = value;
                var_g = var_1;
                var_b = var_2;
            }
            R = new Double(var_r * 255).intValue(); //RGB results = 0 ÷ 255
            G = new Double(var_g * 255).intValue();
            B = new Double(var_b * 255).intValue();
        }
        int[] returnArray = new int[3];
        returnArray[0] = R;
        returnArray[1] = G;
        returnArray[2] = B;
        return returnArray;
    }

    /**
     * Method returns three doubles representing the HSV values of a RGB input
     * Values in input must be between 0 and 255
     * Values in output are between 0 and 1.
     * 
     * See http://www.easyrgb.com/math.php?MATH=M21#text21 for details of algorithm used.
     * 
     * @param red
     * @param green
     * @param blue
     * @return
     */
    public static double[] RGBtoHSV (int red, int green, int blue)
    {
        double H = 0, S = 0, V = 0;

        double R = red / 255.0;
        double G = green / 255.0;
        double B = blue / 255.0;

        double var_Min = Math.min(Math.min(R, G), B); //Min. value of RGB
        double var_Max = Math.max(Math.max(R, G), B); //Max. value of RGB
        double del_Max = var_Max - var_Min; //Delta RGB value

        V = var_Max;
        
        if (del_Max == 0) {
            // This is a gray, no chroma...
            H = 0; // HSV results = 0 ÷ 1
            S = 0;
        }
        else {
            // Chromatic data...
            S = del_Max / var_Max;

            double del_R = (((var_Max - R) / 6) + (del_Max / 2)) / del_Max;
            double del_G = (((var_Max - G) / 6) + (del_Max / 2)) / del_Max;
            double del_B = (((var_Max - B) / 6) + (del_Max / 2)) / del_Max;
            
            if (R == var_Max) {
                H = del_B - del_G;
            }
            else if (G == var_Max) {
                H = (1 / 3) + del_R - del_B;
            }
            else if (B == var_Max) {
                H = (2 / 3) + del_G - del_R;
            }
            if (H < 0) {
                H += 1;
            }
            if (H > 1) {
                H -= 1;
            }
        }
        
        return new double[] { H, S, V };
    }
    
	public static String RGBtoHTMLHex(int iRed, int iGreen, int iBlue)
	{
		String strRed = Integer.toHexString(iRed);
		while (strRed.length() < 2) strRed = "0" + strRed;

		String strGreen = Integer.toHexString(iGreen);
		while (strGreen.length() < 2) strGreen = "0" + strGreen;

		String strBlue = Integer.toHexString(iBlue);
		while (strBlue.length() < 2) strBlue = "0" + strBlue;

		return "#" + strRed + strGreen + strBlue;
	}
	
	
	private static String GetStringToComma(String strImportantSection)
	{
		String strReturnValue = "";
		for(int n = 0;n < 10;n++)
		{
			String strSubsection = strImportantSection.substring(n, n + 1);
			//~ Window.alert("Char: \n" + strSubsection);
			if(strSubsection == "," || strSubsection == ")")
			{
				break;
			}
			else
			{
				strReturnValue = strReturnValue + strSubsection;
			}
		}
		return strReturnValue;
	}
	//~ This deals with both #FFFFFF or rgb( 255,255,255);
	//~ Helper Function above retrieves a chunk of the rgb() style for firefox
	public static RGB HTMLHexToRGB(String HTMLHex)
	{
		//~ Window.alert("Start: \n" + HTMLHex);
		RGB color = null;
		if(HTMLHex.length() > 7)
		{
			
			String red= "";
			String green = "";
			String blue = "";
			
			String important_section = HTMLHex.substring(4);
			//~ Window.alert("Important Section #1: \n" + important_section);
			red = GetStringToComma(important_section);
			
			important_section = important_section.substring(important_section.indexOf(",") + 2);
			//~ Window.alert("Important Section #2: \n" + important_section);
			green = GetStringToComma(important_section);
			
			important_section = important_section.substring(important_section.indexOf(",") + 2);
			//~ Window.alert("Important Section #3: \n" + important_section);
			blue = GetStringToComma(important_section);
			
			//~ Window.alert("Red: " + red + "\nGreen: " + green + "\nBlue:  " + blue);
			color = new RGB(Integer.parseInt(red), Integer.parseInt(green), Integer.parseInt(blue));
		}
		else
		{
			String red = HTMLHex.substring(1,3);
			String green = HTMLHex.substring(3,5);
			String blue = HTMLHex.substring(5,7);
			color = new RGB(Integer.parseInt(red, 16), Integer.parseInt(green, 16), Integer.parseInt(blue, 16));
		}
		return color;
	}
}
