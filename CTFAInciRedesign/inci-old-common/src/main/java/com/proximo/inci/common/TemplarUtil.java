package com.proximo.inci.common;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Enumeration;
import java.util.StringTokenizer;
import java.util.Vector;


public class TemplarUtil implements TemplarUtilInterface
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public static final int LIC_UNLIMITED           = -1;
    public static final int LIC_ISUITE              = 0;
    public static final int LIC_PROXIMO_RPTS        = 1;
    public static final int LIC_ACCPAC30            = 2;
    public static final int LIC_PROXIMO_MFG         = 3;
    public static final int LIC_CLIENT_SPECIFIC     = 4;
    public static final int LIC_PROXIMO_ACCOUNTING  = 5;
    public static final int LIC_PROXIMO_INTRA       = 6;
    public static final int LIC_PROXIMO_XML         = 7;
    public static final int LIC_PROXIMO_STATS       = 8;
    public static final int LIC_PROXIMO_FM          = 9;
    public static final int LIC_PROXIMO_CM          = 10;
    public static final int LIC_PROXIMO_LIST_MGR    = 11;
	public static final int LIC_PROXIMO_DISCUSSION  = 12;
    public static final int LIC_PROXIMO_FAQ  = 13;
    
    public final static char apostrophe = strToChar ("'");

    public TemplarUtil() {};

	//************************************************************
	/**Reverses a string
	*/
	public static String strReverse (String s)
	{
		if (s == null) return s;
		StringBuffer b = new StringBuffer ();
		int l = s.length () - 1;
		for (int i = l; i >= 0; i--) b.append (s.charAt (i));
		return b.toString ();
	}
	
	//************************************************************
	/**Returns the left most l characters of a string
	*/
	public static String strLeft (String s, int l)
	{
		if (l < 0) return s;
		if (s == null) return s;
		if (s.length () <= l) return s;
		return s.substring (0, l);
	}
	
	//************************************************************
	/**Returns the right most l characters of a string
	*/
	public static String strRight (String s, int l)
	{
		if (l < 0) return s;
		if (s == null) return s;
		String rev = strReverse (s);
		String left = strLeft (rev, l);
		return strReverse (left);
	}
	
    public static String lpad (String s, int l, char c)
    {
        if(s==null){s="";}
        String newString = new String (s);

        while (newString.length () < l) newString = String.valueOf (c) + newString;
        return newString;
    }

    public static String rpad (String s, int l, char c)
    {
        if(s==null){s="";}
        String newString = new String (s);

        while (newString.length () < l) newString = newString + String.valueOf (c);
        return newString;
    }

    // DR 6/5/98: replace a string of many repeating chars into a single specific char
    public static String squeeze (String target) { return squeeze (target, ' ', ' ', 2); }
    public static String squeeze (String target, char c) { return squeeze (target, c, c, 2); }
    public static String squeeze (String target, char c, char n, int num)
    {
		if (target == null) return null;
    	// DR 10/17/01: rewrote for improved memory handling

        // if n = '\0', then repeating chars of c in number num are removed
        StringBuffer newString = new StringBuffer ();
        StringBuffer saved = new StringBuffer ();
        int i;
        char j;
        int count = 0;

        for (i = 0; i < target.length (); i++) {
            j = target.charAt (i);
            if (j != c) {
                if (count >= num) {
                    if (n != '\0') newString.append (String.valueOf (n));
                } else newString.append (saved);
                newString.append (String.valueOf (j));
                count = 0;
                saved = null;
                saved = new StringBuffer ();
            } else {
                count++;
                saved.append (String.valueOf (j));
            }
        }

        // take care of the final sequence of chars, if any
        if (count >= num) {
            if (n != '\0') newString.append (String.valueOf (n));
        } else newString.append (saved);

        return newString.toString ();

    }

    public static String strReplace (String target, char os, char ns)
    {
    	return strReplace (target, String.valueOf (os), String.valueOf (ns));
    }
    
    public static String strReplace (char target[], char os, char ns)
    {
		if (target == null) return null;
    	return strReplace (new String (target), String.valueOf (os), String.valueOf (ns));
    }
    
    // DR 4/30/98: replace all occurences of os with ns in target
    public static String strReplace (String target, String os, String ns)
    {
    	// DR 10/17/01: rewrote for improved memory handling
		if (target == null) return null;
		
        StringBuffer newString = new StringBuffer ("");
        int i, j, k;
        boolean match;

        for (i = 0; i < target.length (); i++) {
            //System.out.println ("i=" + i);
            j = 0;
            k = i;
            match = false;
            //System.out.println ("k=" + k);
            //System.out.println ("j=" + j);
            while (target.charAt (k) == os.charAt (j)) {
                k++;
                j++;
                //System.out.println ("k=" + k);
                //System.out.println ("j=" + j);
                if (j == os.length ()) {
                    match = true;
                    //System.out.println ("j match=true");
                    break;
                }
                if (k == target.length ()) {
                    //System.out.println ("k match=false");
                    match = false;
                    break;
                }
            }
            if (!match) {
                // no match, move on
                newString.append (String.valueOf (target.charAt (i)));
            } else {
                // replace the old chars with the new
                newString.append (ns);
                i = i + os.length () - 1;
            }
        }

        return newString.toString ();
    }

    public static String stripRightChar (String s, char c)
    {
        if(s==null){ return s;}

        String newString = new String ("");
        int i;
        int p = s.length () - 1;
        boolean past = false;

        for (i = p; i >= 0; i--)
           if ((s.charAt (i) != c) || ((s.charAt (i) == c) && past)) {
                past = true;
                newString = s.charAt (i) + newString;
           }
        return newString;
    }

    public static String stripLeftChar (String s, char c)
    {
        if(s==null){ return s;}
        if(s.length() == 0){ return s;}

        String newString = new String ("");
        int i;
        int p = s.length () - 1;
        boolean past = false;

        for (i = 0; i < s.length (); i++)
           if ((s.charAt (i) != c) || ((s.charAt (i) == c) && past)) {
                past = true;
                newString = newString + s.charAt (i);
           }
        return newString;
    }

	/** Counts the number of characters defined by the parameter c that appear at the start of the string.
	 * As soon as a non-"c" character is encountered, the counting stops.  The check is case-sensitive.
	 */
    public static int countCharsAtStart (String s, char c)
    {
        if(s==null){ return 0;}

        int count = 0;
        int i;
        for (i = 0; i < s.length (); i++) {
           if (s.charAt (i) != c) break;
           count++;
        }
        return count;
    }

	/** Counts the number of characters defined by the parameter c in the string.
	 * The check is case-sensitive.
	 */
    public static int countChars (String s, char c)
    {
        if(s==null){ return 0;}

        int count = 0;
        int i;
        for (i = 0; i < s.length (); i++)
           if (s.charAt (i) == c) count++;
        return count;
    }

	/** Counts the number of characters that make up String c found in String s.
	 * The check is case-sensitive.
	 * Example:
	 * countChars ("Proximo Consulting", "Po") returns 4
	 * countChars ("Proximo Consulting", "po") returns 3
	 * countChars ("Proximo Consulting", "x m") returns 3
	 */
    public static int countChars (String s, String c)
    {
        if(s==null || c == null){ return 0;}

        int count = 0;
		for (int i = 0; i < c.length (); i++) count += countChars (s, c.charAt (i));
        return count;
    }

	public static String stripChar (String s, char c)
    {
        if(s==null){ return s;}
        StringBuffer newString = new StringBuffer ("");
        for (int i = 0; i < s.length (); i++)
           if (s.charAt (i) != c) newString.append (s.charAt (i));
        return newString.toString ();
    }

    public static String stripDigits (String s)
    {
        if(s==null){ return s;}

        String newString = new String ("");
        int i;

        for (i = 0; i < s.length (); i++){
           if (!(s.charAt (i) >= '0' && s.charAt (i) <= '9')) 
               newString = newString + s.charAt (i);
        }   
        return newString;
    }
        
    public static String stripNonNumbers (String s)
    {
		return stripNonNumbers (s, true);
    }

    public static String stripNonNumbers (String s, boolean includeSigns)
    {
        if(s==null){ return s;}

        String newString = new String ("");
        int i;

        for (i = 0; i < s.length (); i++)
           if ((s.charAt (i) >= '0' && s.charAt (i) <= '9') || ((s.charAt (i) == '.') || (s.charAt (i) == '-')) && includeSigns) newString = newString + s.charAt (i);
        return newString;
    }
    


	public static String stripNonConsonants (String s)
    {
        if(s==null){ return s;}

        String newString = new String ("");
        int i;

        for (i = 0; i < s.length (); i++)
           if (s.charAt (i) == 'B' ||
			   s.charAt (i) == 'C' ||
			   s.charAt (i) == 'D' ||
			   s.charAt (i) == 'F' ||
			   s.charAt (i) == 'G' ||
			   s.charAt (i) == 'H' ||
			   s.charAt (i) == 'J' ||
			   s.charAt (i) == 'K' ||
			   s.charAt (i) == 'L' ||
			   s.charAt (i) == 'M' ||
			   s.charAt (i) == 'N' ||
			   s.charAt (i) == 'P' ||
			   s.charAt (i) == 'Q' ||
			   s.charAt (i) == 'R' ||
			   s.charAt (i) == 'S' ||
			   s.charAt (i) == 'T' ||
			   s.charAt (i) == 'V' ||
			   s.charAt (i) == 'W' ||
			   s.charAt (i) == 'X' ||
			   s.charAt (i) == 'Y' ||
			   s.charAt (i) == 'Z' ||
			   s.charAt (i) == 'b' ||
			   s.charAt (i) == 'c' ||
			   s.charAt (i) == 'd' ||
			   s.charAt (i) == 'f' ||
			   s.charAt (i) == 'g' ||
			   s.charAt (i) == 'h' ||
			   s.charAt (i) == 'j' ||
			   s.charAt (i) == 'k' ||
			   s.charAt (i) == 'l' ||
			   s.charAt (i) == 'm' ||
			   s.charAt (i) == 'n' ||
			   s.charAt (i) == 'p' ||
			   s.charAt (i) == 'q' ||
			   s.charAt (i) == 'r' ||
			   s.charAt (i) == 's' ||
			   s.charAt (i) == 't' ||
			   s.charAt (i) == 'v' ||
			   s.charAt (i) == 'w' ||
			   s.charAt (i) == 'x' ||
			   s.charAt (i) == 'y' ||
			   s.charAt (i) == 'z')
			   newString = newString + s.charAt (i);
        return newString;
    }

	public static String stripNonVowels (String s)
    {
        if(s==null){ return s;}

        String newString = new String ("");
        int i;

        for (i = 0; i < s.length (); i++)
           if (s.charAt (i) == 'A' ||
			   s.charAt (i) == 'E' ||
			   s.charAt (i) == 'I' ||
			   s.charAt (i) == 'O' ||
			   s.charAt (i) == 'U' ||
			   s.charAt (i) == 'a' ||
			   s.charAt (i) == 'e' ||
			   s.charAt (i) == 'i' ||
			   s.charAt (i) == 'o' ||
			   s.charAt (i) == 'u')
			   newString = newString + s.charAt (i);
        return newString;
    }

	public static String stripNonChars (String s)
    {
        if(s==null){ return s;}

        String newString = new String ("");
        int i;

        for (i = 0; i < s.length (); i++)
           if ((s.charAt (i) >= 'A' && s.charAt (i) <= 'Z') ||
               (s.charAt (i) >= 'a' && s.charAt (i) <= 'z'))
               newString = newString + s.charAt (i);
        return newString;
    }

    public static String stripNonCharsSpace (String s)
    {
        if(s==null){ return s;}

        String newString = new String ("");
        int i;

        for (i = 0; i < s.length (); i++)
           if ((s.charAt (i) >= 'A' && s.charAt (i) <= 'Z') ||
               (s.charAt (i) >= 'a' && s.charAt (i) <= 'z') || s.charAt (i) == ' ')
               newString = newString + s.charAt (i);
        return newString;
    }

    public static String stripChars (String s, String r)
    {
        if(s==null){ return s;}

        int i;
        String newString = new String (s);

        for (i = 0; i < r.length (); i++)
            newString = stripChar (newString, r.charAt (i));

        return newString;
    }

	// DR 5/30/01: strips all characters not in r
    public static String stripCharsNotInString (String s, String r)
    {
        StringBuffer b = new StringBuffer ();

        for (int i = 0; i < s.length (); i++) {
        	char c = s.charAt (i);
        	//System.out.println ("checking c = " + c);
        	boolean found = false;
			for (int j = 0; j < r.length (); j++) {
				if (r.charAt (j) == c) {
					found = true;
		        	//System.out.println ("char found");
					break;
				}
			}
			if (found) b.append (String.valueOf (c));
		}

		return b.toString ();
    }

	/** Returns true if the string is a number.  If wholeNumber is true, then it also checks to see if the 
		number repesented is a whole number */
	public static boolean isStringNumber (String s, boolean wholeNumber)
	{
		String x = stripNonNumbers (s);
		if (!s.equals (x)) return false;
		if (wholeNumber && x.indexOf ('.') != -1) return false;
		return true;
	}
	
	/** Returns true if the string has only upper-case letters.  Punctuation and numbers excluded. */
	public static boolean isStringUpperCase (String r)
	{
		boolean hasLower = false;
        for (int i = 0; i < r.length (); i++) {
        	if (r.charAt (i) >= 'a' && r.charAt (i) >= 'z') {
        		hasLower = true;
        		break;
        	}
       	}
        return !hasLower;
	}
	
    public static String backslashChar (String s, char c)
    {
        String newString = new String ("");
        int i;

        for (i = 0; i < s.length (); i++)
           if (s.charAt (i) != c) newString = newString + s.charAt (i);
           else newString = newString + "\\" + s.charAt (i);
        return newString;
    }

    public static String calcKey (String s)
    {
        long key = 0;
        int i;

        for (i = 0; i < s.length (); i++)
            key = key + (i * s.charAt (i));
        return String.valueOf (key);
    }

    // generic conversions
    public static float strToFloat (String s)
    {
        if (s.equals ("")) return 0;
        else {
            Float f = Float.valueOf (s);
            return f.floatValue ();
        }
    }
    public static double strToDouble (String s)
    {
        if (s.equals ("")) return 0;
        else {
            Double d = Double.valueOf (s);
            return d.doubleValue ();
        }
    }
    public static char strToChar (String s)
    {
        if (s == null) return (char) 0;
        if (s.equals ("")) return (char) 0;
        Character c = new Character (s.charAt (0));
        return c.charValue ();
    }
    public static int strToInt (String s)
    {
        if (s == null) return 0;
        if (s.equals ("")) return 0;
        Integer i = Integer.valueOf (s);
        return i.intValue ();
    }
    public static long strToLong (String s)
    {
        if (s == null) return 0;
        if (s.equals ("")) return 0;
        Long l = Long.valueOf (s);
        return l.longValue ();
    }

    // returns the date/time of the local machine as a date
    public static java.util.Date dateNow ()
    {
        return new java.util.Date ();
    }

    // returns the date/time of the local machine as a Templar date string
    public static String stringNow ()
    {
        //System.out.println ("in TemplarUtil.stringNow ()");
        return utilDateToString (new java.util.Date ());
    }

    // converts between TDate strings and sql dates
    public static String sqlDateToTDateString (java.sql.Date date)
    {
        //System.out.println ("in TemplarUtil.sqlDateToTDateString ()");
        return sqlDateToString (date);
    }
    public static String utilDateToTDateString (java.util.Date date)
    {
        //System.out.println ("in TemplarUtil.utilDateToTDateString (java.util.Date)");
        return utilDateToString (date);
    }
    public static java.sql.Date tDateStringToSqlDate (String theDate)
    {
        java.sql.Date sqlDate = null;

        int year = Integer.parseInt (theDate.substring (0, 4)) - 1900;
        int month = Integer.parseInt (theDate.substring (4, 6)) - 1;
        int day = Integer.parseInt (theDate.substring (6, 8));

        if ((year != 0) || (month != 0) || (day != 1)) sqlDate = new java.sql.Date (year, month, day);
        return sqlDate;
    }
    public static java.util.Date tDateStringToUtilDate (String theDate)
    {
        int year = Integer.parseInt (theDate.substring (0, 4)) - 1900;
        int month = Integer.parseInt (theDate.substring (4, 6)) - 1;
        int day = Integer.parseInt (theDate.substring (6, 8));
        int hour = Integer.parseInt (theDate.substring (8, 10));
        int minute = Integer.parseInt (theDate.substring (10, 12));
        int second = Integer.parseInt (theDate.substring (12));

        return new java.util.Date (year, month, day, hour, minute, second);
    }

    private static String sqlDateToString (java.sql.Date date)
    {
        // java.sql.Date throws an illegal argument exception when
        // accessing hours, minutes, or seconds
        // so don't do them
        //System.out.println ("in TemplarUtil.sqlDateToString (sql date)");
        String theDate = "00000101000000";
        
        /* WL 4/23/02: tried using Calendar to set times properly but got NullPointerException from inside Calendar.setTime() method...
        //Calendar cal = Calendar.getInstance();
        //cal.setTime(date);
        */
        
        if (date != null) {
            String year = lpad (Integer.toString (date.getYear () + 1900), 4, '0');
            //System.out.println ("year = " + year);

            String month = lpad (Integer.toString (date.getMonth () + 1), 2, '0');
            //System.out.println ("month = " + month);

            String day = lpad (Integer.toString (date.getDate ()), 2, '0');
            //System.out.println ("day = " + day);

            /* WL 4/23/02: tried using Calendar to set times properly but got NullPointerException from inside Calendar.setTime() method...
            //String hr = lpad (Integer.toString (cal.get(Calendar.HOUR)), 2, '0');
            //String min = lpad (Integer.toString (cal.get(Calendar.MINUTE)), 2, '0');
            //String sec = lpad (Integer.toString (cal.get(Calendar.SECOND)), 2, '0');
            
            //theDate = year + month + day + hr + min + sec;
            */
            
            theDate = year + month + day + "000000";
        }

        return theDate;
    }

    private static String utilDateToString (java.util.Date date)
    {
        //System.out.println ("in TemplarUtil.utilDateToString (util date)");

        if (date == null) {

            //System.out.println ("date is null!");
            return null;

        }

        String year = lpad (Integer.toString (date.getYear () + 1900), 4, '0');
        //System.out.println ("year = " + year);

        String month = lpad (Integer.toString (date.getMonth () + 1), 2, '0');
        //System.out.println ("month = " + month);

        String day = lpad (Integer.toString (date.getDate ()), 2, '0');
        //System.out.println ("day = " + day);

        String hour = lpad (Integer.toString (date.getHours ()), 2, '0');
        //System.out.println ("hour = " + hour);

        String minute = lpad (Integer.toString (date.getMinutes ()), 2, '0');
        //System.out.println ("minute = " + minute);

        String second = lpad (Integer.toString (date.getSeconds ()), 2, '0');
        //System.out.println ("second = " + second);

        return year + month + day + hour + minute + second;
    }

    public static String booleanToFlag (boolean b) { return (b ? "'Y'" : "'N'"); }

    public static boolean dateHasCentury (java.util.Date d)
    {
        boolean hasIt = false;
        int year = d.getYear ();

        //System.out.println ("TemplarUtil.dateHasCentury (): year = " + year);

        if (d.getYear () > 0) hasIt = true;

        return hasIt;
    }

    public static java.util.Date addCenturyToDate (java.util.Date d)
    {
        return new java.util.Date (d.getYear () + 1900,
                                    d.getMonth (),
                                    d.getDate (),
                                    d.getHours (),
                                    d.getMinutes (),
                                    d.getSeconds ());

    }

    public static boolean strIsValidRange (String s)
    {
        boolean valid = true;
        String n = new String (s);
        //System.out.println ("strIsValidRange: s = " + s);
        n = TemplarUtil.stripChar (n, ' ');
        //System.out.println ("strIsValidRange: n = " + n);
        int i;
        char c;

        // are the character valid?
        for (i = 0; i < n.length (); i++) {
            c = n.charAt (i);
            if ((!Character.isDigit (c)) && (c != '-') && (c != ',')) {
                i = n.length ();
                valid = false;
            }
        }

        // is the range valid?
        if (valid) {
            Vector v = parseStringRange (n);
            if (v == null) valid = false;
        }

        //System.out.println ("strIsValidRange: valid = " + valid);
        return valid;

    }

    public static Vector parseStringRange (String s)
    {
        boolean valid = true;

        // add a comma just so that my logic works for strings at end
        // however, one and only one
        //System.out.println ("parseStringRange: s = " + s);
        String n = new String (s);
        stripRightChar (n, ',');
        n = n + ",";

        int i, j, x, y;
        char c;
        String num = new String ("");
        int low = -1, high = -1;
        Vector v = new Vector ();

        // valid combinations
        // x
        // x-y where y >= x
        for (i = 0; i < n.length (); i++) {
            c = n.charAt (i);
            //System.out.println ("parseStringRange: c = " + c);
            //c = new Character (c);
            if ((!Character.isDigit (c)) && (c != '-') && (c != ',')) {
                //System.out.println ("parseStringRange: invalid char");
                i = n.length ();
                valid = false;
            } else if (c == ',') {
                // what is high?
                //System.out.println ("parseStringRange: num = " + num);
                if (!num.equals ("")) {
                    if (low == -1) low = strToInt (num);
                    else high = strToInt (num);
                }
                //System.out.println ("low = " + low);
                //System.out.println ("high = " + high);
                num = new String ("");

                // is high & low valid?
                if ((low == -1) || ((low > high) && (high != -1))) {
                    //System.out.println ("Invalid low/high");
                    i = n.length ();
                    valid = false;
                } else {
                    // what I have is valid
                    if (high == -1) v.addElement (new Integer (low));
                    else
                        for (j = low; j <= high; j++) v.addElement (new Integer (j));
                }
                low = -1;
                high = -1;

            } else if (c == '-') {
                // what is low?
                //System.out.println ("parseStringRange: num = " + num);
                if (!num.equals ("")) low = strToInt (num);
                else {
                    valid = false;
                    //System.out.println ("Invalid low");
                    i = n.length ();
                }
                num = new String ("");
            } else {
                // collect data for high or low
                num = num + String.valueOf (c);
            }

            /*
            if (((c == '-') || (c == ',')) && (low == -1)) {
                i = n.length ();
                valid = false;
            }
            */
        }

        if (!valid) v = null;
        else if (v.size () == 0) v = null;
        else {
            // I need to remove all duplicate numbers from this vector
            for (i = v.size () - 1; i > 0; i--) {
                x = ((Integer) v.elementAt (i)).intValue ();
                for (j = i - 1; j >= 0; j--) {
                    y = ((Integer) v.elementAt (j)).intValue ();
                    if (x == y) {
                        v.removeElementAt (i);
                        j = -1;
                    }
                }
            }
        }

        return v;
    }

    public static String repeatString (String s, int i)
    {
        int j;
        String r = new String ("");
        for (j = 1; j <= i; j++) r = r + s;
        return r;
    }
    public static String repeatChar (char c, int i) { return repeatString (String.valueOf (c), i); }

	// WL 7/17/01
	public static String strToLower(String inStr) {
		return inStr.toLowerCase();
	}

	// WL 7/17/01
	public static String strToUpper(String inStr) {
		return inStr.toUpperCase();
	}

    // WL 3/30/98
    public static String strToProper(String inStr)
    {
        // DR 7/31/98: if the string is null, return null
        if (inStr == null) return null;

        char newChar = ' ';
        char oldChar = ' ';
        String charStr = "";
        String outStr = "";
        StringBuffer current = new StringBuffer ();
        int lastSpace = inStr.lastIndexOf (' ');
        boolean oneWord = false;
        if (lastSpace == -1) {
        	lastSpace = 1000000; // if not found, assume the space is at the end; 
        						 // used to see if the current word is the last name
        	oneWord = true;
        }
        //System.out.println("TemplarUtil.strToProper(): lastSpace=" + lastSpace);

        if (inStr.length() == 0) return outStr;

        //System.out.println("TemplarUtil.strToProper(): inStr=#" + inStr + "#");

        inStr = inStr.toLowerCase();
        //System.out.println("TemplarUtil.strToProper(): inStr=#" + inStr + "#");

        oldChar = inStr.charAt(0);
        newChar = Character.toUpperCase(oldChar);
        charStr = (new Character(newChar)).toString();
        //System.out.println("TemplarUtil.strToProper(): charStr=#" + charStr + "#");
        outStr = outStr.concat(charStr);
        if (oneWord) current.append (charStr);

        //System.out.println("TemplarUtil.strToProper(): now outStr=#" + outStr + "#");

        for (int i = 1; i < inStr.length(); i++) {
            //System.out.println("TemplarUtil.strToProper(): i=" + i + ", current=#" + current.toString () + "#");
            if ((isToken(inStr.charAt(i - 1)) && !isToken(inStr.charAt(i))) || 
            	((i > lastSpace || oneWord) && (current.toString ().equals ("Mc") || current.toString ().equals ("Mac")))) {
                oldChar = inStr.charAt(i);
                newChar = Character.toUpperCase(oldChar);
                charStr = (new Character(newChar)).toString();

                //System.out.println("TemplarUtil.strToProper(): oldChar=#" + oldChar + "#");
                //System.out.println("TemplarUtil.strToProper(): newChar=#" + newChar + "#");
                //System.out.println("TemplarUtil.strToProper(): charStr=#" + charStr + "#");

                outStr = outStr.concat(charStr);
                //System.out.println("TemplarUtil.strToProper(): here outStr=#" + outStr + "#");
            }
            else {
                charStr = (new Character(inStr.charAt(i))).toString();
                //System.out.println("TemplarUtil.strToProper(): ---inStr.charAt(" + i + ")=#" + charStr + "#");
                //System.out.println("TemplarUtil.strToProper(): ---charStr=#" + charStr + "#");

                outStr = outStr.concat(charStr);
            }
            current.append (charStr);
            //System.out.println("TemplarUtil.strToProper(): ---current=#" + current.toString () + "#");
            if (!current.toString ().equals ("Mc") && !current.toString ().equals ("Mac") &&
            	!current.toString ().equals ("M") && !current.toString ().equals ("Ma")) current.setLength (0);
        }

        //System.out.println("TemplarUtil.strToProper(): finally outStr=#" + outStr + "#");
        return outStr;
    }

    private static boolean isToken(char c) {
        // DR 5/26/98: added new characters
        if (c == ' ' ||
            c == ',' ||
            c == apostrophe ||
            c == '(' ||
            c == ')' ||
            c == '-' ||
            c == '&' ||
            c == '@' ||
            c == ';' ||
            c == '.' ||
            c == '/')
            return true;
        else return false;
    }

    // DR 5/21/98: if r is a interval of i, return true
    public static boolean intIsInterval (int r, int i)
    {
        float f = (new Integer (r)).floatValue ();
        return ((f / i) == Math.floor (f / i));
    }

    // DR 5/21/98
    public static void waitForImage (Component component, Image image)
    {
        MediaTracker tracker = new MediaTracker(component);
        try {
            tracker.addImage(image, 0);
            tracker.waitForID(0);
        }
        catch(InterruptedException e) { e.printStackTrace(); }
    }

	/** Copy a text file to a new name.
		@deprecated This is the same as textFileCopy.  This version has been left for backward compatibility. */
    public static void copyFile (String origFile, String newFile)
    throws IOException
    {
    	textFileCopy (origFile, newFile);
    }

	/** Copy a binary file to a new name */
	public static void binaryFileCopy (String infile, String outfile) 
	throws IOException
	{
        byte buf[] = new byte[8192];
        int count;
        InputStream in = new FileInputStream(infile);
        OutputStream out = new FileOutputStream(outfile);

        while ((count=in.read(buf,0,buf.length)) != -1) 
            out.write(buf, 0, count);
        out.close();
        in.close ();
	}

	/** Copy a text file to a new name */
	public static void textFileCopy (String infile, String outfile) 
	throws IOException
	{
		_textFileCopy$ (infile, outfile, false);
	}

	/** Appends one file onto another */
	public static void textFileAppend (String fromfile, String tofile) 
	throws IOException
	{
		_textFileCopy$ (fromfile, tofile, true);
	}

	/** Internal utility method to handle file copies */
	private static void _textFileCopy$ (String fromfile, String tofile, boolean append) 
	throws IOException
	{
        char buf[] = new char[80];
        int count;
        Reader in = new FileReader(fromfile);
        Writer out = new FileWriter(tofile, append);

        while ((count=in.read(buf,0,buf.length)) != -1)
            out.write(buf, 0, count);
        out.close();
        in.close ();
	}




    // DR 11/21/98: find the last instance of char c in String s
    public static int findLastChar (String s, char c) { return findLastChar (s, c, 0); }
    public static int findLastChar (String s, char c, int fromPos)
    {
        // DR 1/12/99: check for a null or empty string
        // also check to see if the character even exists
        if (s == null) return -1;
        if (s.equals ("")) return -1;
        if (s.indexOf (c, fromPos) == -1) return -1;

        String n = "";
        for (int i = s.length () - 1; i >= 0; i--) n = n + String.valueOf (s.charAt (i));

        int p = s.length () - n.indexOf (c, fromPos) - 1;
        return p;
    }

    public static int exponent (int a, int b)
    {
        if (b < 0) throw new IllegalArgumentException ("You cannot raise a number to a negative number.");
        else if (b == 0) return 1;
        else {
            int c = a;
            for (int i = 1; i < b; i++) c = c * a;
            return c;
        }
    }

    public static long exponent (long a, long b)
    {
        if (b < 0) throw new IllegalArgumentException ("You cannot raise a number to a negative number.");
        else if (b == 0) return 1;
        else {
            long c = a;
            for (int i = 1; i < b; i++) c = c * a;
            return c;
        }
    }

    public static float exponent (float a, float b)
    {
        if (b < 0) throw new IllegalArgumentException ("You cannot raise a number to a negative number.");
        else if (b == 0) return 1;
        else {
            float c = a;
            for (int i = 1; i < b; i++) c = c * a;
            return c;
        }
    }

    public static double exponent (double a, double b)
    {
        if (b < 0) throw new IllegalArgumentException ("You cannot raise a number to a negative number.");
        else if (b == 0) return 1;
        else {
            double c = a;
            for (int i = 1; i < b; i++) c = c * a;
            return c;
        }
    }

    /**int d,the number of digits to the right of the dot must be larger than -1*/
    public static float truncFloat (float f, int d)
    {
        /*old method
        //System.out.println ("in truncFloat...");
        //System.out.println ("f = " + f);
        //System.out.println ("d = " + d);
        double pow = (double) exponent(10, d);
        //System.out.println ("pow = " + pow);
        BigDecimal bd = new BigDecimal ((double) f);
        bd = bd.multiply (new BigDecimal (pow));
        //System.out.println ("bd = " + bd.floatValue ());
        bd = bd.divide (new BigDecimal (pow), BigDecimal.ROUND_FLOOR);
        //System.out.println ("bd = " + bd.floatValue ());
        return bd.floatValue ();
        */
        //new method
        String floatString=String.valueOf(f);
        Float newValue=new Float(truncDecimal(floatString, d));
        return newValue.floatValue();
    }

    public static double truncDouble (double f, int d)
    {
        String doubleString=String.valueOf(f);
        
        Double newValue = new Double(truncDecimal(doubleString, d));
        return newValue.doubleValue();
    }

    public static String truncDecimal (String s, int d)
    {
        int indexOfDot=s.indexOf(".");
        if(indexOfDot==-1){//no dot
            return s;
        }
        else{
            String head=s.substring(0,indexOfDot);

            String rightSide=s.substring(indexOfDot+1);
            int tailLength=(rightSide.length()>d ? d: rightSide.length());
            String tail=rightSide.substring(0,tailLength);
            return head+"."+tail;
        }
    }

    /**the returned round off value will be guranteed to be:
     *bigger or equal to the the input, if input is bigger than 0
     *less or equal to the input, if input is less than 0
     *@param f the input value
     *@param scale the number of digits to the right of the dot
     *if less than 0, this method will throw ArithmeticException( from BigDecimal.scale)
     *if it is bigger than 0, it will do a round off */
    public static float roundFloat (float f, int scale)
    {  /* old method
        //System.out.println ("in roundFloat...");
        double pow = (double) exponent(10, d);
        BigDecimal bd = new BigDecimal ((double) f);
        bd = bd.multiply (new BigDecimal (pow));
        if (bd.compareTo (new BigDecimal (0)) < -1) bd = bd.subtract (new BigDecimal (-0.5));
        else bd = bd.add (new BigDecimal (0.5));
        bd = bd.divide (new BigDecimal (pow), BigDecimal.ROUND_FLOOR);
        //System.out.println ("bd = " + bd.floatValue ());
        return bd.floatValue ();
        */
        //new method
        BigDecimal orig = new BigDecimal (f);
        BigDecimal result=orig.setScale(scale,orig.ROUND_HALF_UP);
        return result.floatValue();

    }

    public static double roundDouble (double f, int scale)
    {
    	//new method
        BigDecimal orig = new BigDecimal (f);
        BigDecimal result=orig.setScale(scale,orig.ROUND_HALF_UP);
        return result.doubleValue();

    }

    public static float calcMoney (int unit, float cost)
    {
        return roundFloat (multiplyFloat ((float) unit, cost), 2);
    }

    //Added PP 08/09/99
    public static float calcMoney (float unit, float cost)
    {
        return roundFloat (multiplyFloat (unit, cost), 2);
    }

    public static float multiplyFloat (float a, float b)
    {
        BigDecimal bd = new BigDecimal ((double) a);
        bd = bd.multiply (new BigDecimal ((double) b));
        return bd.floatValue ();
    }

    public static double multiplyFloat (double a, double b)
    {
        BigDecimal bd = new BigDecimal (a);
        bd = bd.multiply (new BigDecimal (b));
        return bd.doubleValue ();
    }

    // DR 9/10/99: is a float a whole number?
    public static boolean isFloatWhole (float f)
    {
        return (f == truncFloat (f, 0));
    }

    // WL 12/8/99: people out there suggest to perform System.gc() repeatatively
    // to gain back more memory.
    public static void performGC(int n) {
        try {
            while (n-- > 0) {
                Thread.currentThread().sleep(500);
                System.gc();
            }
        }
        catch (Exception e) {
            //System.out.println("TemplarUtil.performGC(): e = " + e);
        }
    }

    // WL 2/4/01: the following three methods make use of java.text.DecimalFormat class
    // to manipulate currency values in specified pattern.
    public static String getCurrencyPattern(int dec) {
    	return getCurrencyPattern (dec, true);
    }
    public static String getCurrencyPattern(int dec, boolean showDecimal) {
        String posPattern = "'$'#,##0" + (showDecimal ? "." : "");
        String negPattern = "'-$'#,##0" + (showDecimal ? "." : "");
        StringBuffer suffix = new StringBuffer();
        for (int i = 1; i < dec; i++) {
            suffix.append("0");
        }

        if (dec > 0) {
            posPattern = posPattern + "0" + suffix.toString();
            negPattern = negPattern + "0" + suffix.toString();
        }

        String pattern = posPattern + ";" + negPattern;
        return pattern;
    }

    public static String formatCurrency(double number, int dec) {
    	return formatCurrency (number, dec, true);
    }
    public static String formatCurrency(double number, int dec, boolean showDecimal) {
        String result = "";
        String pattern = getCurrencyPattern(dec, showDecimal);
        DecimalFormat form = new DecimalFormat(pattern);
        //System.out.println ("TemplarUtil.formatCurrency(): pattern = " + pattern);

        try {
            // Assume form is a DecimalFormat
            result = form.format(number);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        //System.out.println ("TemplarUtil.formatCurrency(): result = " + result);
        return result;
    }

    /** gets the standard pattern for decimal number formatting */
    public static String getDecimalPattern(int dec) {
    	return getDecimalPattern (dec, true);
    }
    
    /** gets the standard pattern for decimal number formatting */
    public static String getDecimalPattern(int dec, boolean showDecimal) {
        String posPattern = "#,##0" + (showDecimal ? "." : "");
        String negPattern = "'-'#,##0" + (showDecimal ? "." : "");
        StringBuffer suffix = new StringBuffer();
        for (int i = 1; i < dec; i++) {
            suffix.append("0");
        }

        if (dec > 0) {
            posPattern = posPattern + "0" + suffix.toString();
            negPattern = negPattern + "0" + suffix.toString();
        }

        String pattern = posPattern + ";" + negPattern;
        return pattern;
    }

    /** Returns a formatted string for a double, with commas and decimal places */
    public static String formatDecimal(double number, int dec) {
    	return formatDecimal (number, dec, true, true);
    }
    /** Returns a formatted string for a double, with commas and decimal places */
    public static String formatDecimal(double number, int dec, boolean showDecimal) {
    	return formatDecimal (number, dec, showDecimal, true);
    }
    /** Returns a formatted string for a double, with commas and decimal places */
    public static String formatDecimal(double number, int dec, boolean showDecimal, boolean showComma) {
        String result = "";
        String pattern = getDecimalPattern(dec, showDecimal);
        DecimalFormat form = new DecimalFormat(pattern);
        //System.out.println ("TemplarUtil.formatDecimal(): pattern = " + pattern);

        try {
            // Assume form is a DecimalFormat
            result = form.format(number);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        if (!showComma) result = stripChar (result, ',');
        //System.out.println ("TemplarUtil.formatCurrency(): result = " + result);
        return result;
    }

    public static String parseCurrency(String strValue, int dec) {
        String retValue = "";
        String pattern = getCurrencyPattern(dec);
        DecimalFormat form = new DecimalFormat(pattern);

        // WL 2/11/01: automatically detect empty string input.
        if (strValue.equals("")) strValue = "$0.";

        int indx = strValue.indexOf("$");
        if (indx < 0) {
            if (strValue.startsWith("-")) {
                if (strValue.length() > 1) {
                    strValue = "-$" + strValue.substring(1);
                }
                else {
                    strValue = "-$0.";
                }
            }
            else {
                strValue = "$" + strValue;
            }
        }

        try {
            retValue = form.parse(strValue).toString();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //System.out.println ("TemplarUtil.parseCurrency(): retValue = " + retValue);
        return retValue;
    }

    // WL 6/10/01: the following two methods make use of java.text.NumberFormat class
    // to manipulate integer values.
    public static String formatInteger(long number) {
        String result = "";
        DecimalFormat form = new DecimalFormat();
        form.setGroupingUsed(true);
        form.setParseIntegerOnly(true);
        //System.out.println ("TemplarUtil.formatInteger(): number = " + number);

        try {
            // Assume form is a DecimalFormat
            result = form.format(number);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        //System.out.println ("TemplarUtil.formatCurrency(): result = " + result);
        return result;
    }

    public static String parseInteger(String strValue) {
        return parseNumber(strValue, true);
    }

    public static String parseDecimal(String strValue) {
        return parseNumber(strValue, false);
    }
    public static String parseNumber(String strValue, boolean isIntOnly) {
        String retValue = "";
        DecimalFormat form = new DecimalFormat();
        form.setGroupingUsed(true);
        form.setParseIntegerOnly(isIntOnly);

        // WL 2/11/01: automatically detect empty string input.
        if (strValue.equals("")) strValue = "0";

        try {
            retValue = form.parse(strValue).toString();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //System.out.println ("TemplarUtil.parseNumber(): retValue = " + retValue);
        return retValue;
    }

    public static String getPercentPattern(int dec) {
        String posPattern = "#,##0.";
        String negPattern = "-#,##0.";
        StringBuffer suffix = new StringBuffer();
        for (int i = 1; i < dec; i++) {
            suffix.append("0");
        }

        if (dec > 0) {
            posPattern = posPattern + "0" + suffix.toString();
            negPattern = negPattern + "0" + suffix.toString();
        }

        String pattern = posPattern + "%;" + negPattern + "%";
        return pattern;
    }

    public static String padFloatDecimal (float f, int dec)
    {
        //System.out.println ("in padFloatDecimal...");
        //System.out.println ("f = " + f);
        f = TemplarUtil.truncFloat (f, dec);
        //System.out.println ("f = " + f);
        String s = String.valueOf (f);
        //System.out.println ("s = " + s);
        
        return padDecimal(s, dec);
    }

    public static String padDoubleDecimal (double f, int dec)
    {
        //System.out.println ("in padFloatDecimal...");
        //System.out.println ("f = " + f);
        f = TemplarUtil.truncDouble (f, dec);
        //System.out.println ("f = " + f);
        String s = String.valueOf (f);
        
        return padDecimal(s, dec);
    }
    
    public static String padDecimal(String s, int dec) {
        int index = s.indexOf ('.');
        //System.out.println ("index = " + index);

        // WL 1/21/00: handling 0 number of digits in decimal part.
        if (dec == 0) s = s.substring(0, (index == -1) ? s.length() : index);
        else if (index == -1) s += "." + TemplarUtil.repeatString ("0", dec);
        else {
            int len = s.length () - index - 1;
            //System.out.println ("len = " + len);
            if (len < dec) s += TemplarUtil.repeatString ("0", (dec - len));
            else s = s.substring (0, index + dec + 1);
        }
        //System.out.println ("s = " + s);
        return s;
    }

	// WL 1/17/00: jdk version checking...
	public static String getJavaVersion() {
		return System.getProperty("java.version");
	}

	public static boolean isJava2() {
	    boolean retFlag = false;
		String javaVersion = getJavaVersion();

        int dotPos = javaVersion.indexOf('.');
		float versionNum = Float.valueOf(javaVersion.substring(0, dotPos + 2)).floatValue();
		if (versionNum < 1.2) retFlag = false;
		else retFlag = true;

	    return retFlag;
	}

	//MT 12/18/01 change to include negative number
	public static String addCommasToNumber(String s) {
	    int pos = s.indexOf('-', 0);
	    if (pos == -1)
	    {
	        //positive numbers
            StringBuffer buf = new StringBuffer(s);
            int decPos = s.indexOf('.', 0);
            if (decPos == -1) decPos = s.length();
            for (int i = decPos; (i -= 3) > 0; ) {
                buf.insert(i, ',');
            }
            s = new String(buf);
        }
	    else if (pos == 0)
	    {
	        //negative number
	        String signStr = s.substring(0, 1);
	        String numStr = s.substring(1);

	        StringBuffer negBuf = new StringBuffer(numStr);
            int decPos2 = numStr.indexOf('.', 0);
            if (decPos2 == -1) decPos2 = numStr.length();
            for (int i = decPos2; (i -= 3) > 0; ) {
                negBuf.insert(i, ',');
            }
            String s2 = new String(negBuf);
            s = new String(signStr + s2);

	    }

        return s;
	}

	// WL 1/27/00: This method is used only on client side. Whenver we need to call
	// System.exit(int) method, either due to Exception or Assertion, we now call
	// this method to delete a temporary file "connect.txt" from client local machine
	// and then exit.
	public void systemExit(int code) {
        prepareExit();
	    System.exit(code);
	}

	// WL 1/27/00: need to override in child class to do something special.
	public void prepareExit() {}

    // WL 2/7/00
    public static boolean isNumberKey(KeyEvent e) {
        //System.out.println("TemplarUtil.isNumberKey(): e.getKeyChar() = " + e.getKeyChar());
        boolean flag = false;
        if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9')
        {
            flag = true;
        }
        return flag;
    }

    public static boolean isTabKey(KeyEvent e) {
        //System.out.println("TemplarUtil.isTabKey(): e.getKeyChar() = #" + e.getKeyChar() + "#");
        //System.out.println("TemplarUtil.isTabKey(): e.getKeyCode() = " + e.getKeyCode());
        //System.out.println("TemplarUtil.isTabKey(): e.getKeyText(e.getKeyCode()) = " + e.getKeyText(e.getKeyCode()));
        boolean flag = false;
        if (e.getKeyChar() == KeyEvent.VK_TAB)
        {
            flag = true;
        }

        //System.out.println("TemplarUtil.isTabKey(): flag = " + flag);
        return flag;
    }

	// DR 9/17/00: does the e-mail end in a valid domain name?
	// If no domains are defined, then it will automatically fail validation
	// This method assumes that the e-mail has already been validated for format
	// DR 7/8/01: if the domain list includes the String value "null", then it is permissable for the
	// email account to NOT contain the @ and a domain name.  This is used for Groupware addresses, like Exchange
	public static boolean validateEMailDomain (String email, String domains)
	{
		boolean noDomainRequired = false;
	    domains = domains.toLowerCase ();
	    email = email.toLowerCase ();
	    int index = email.indexOf ("@");
	    boolean valid = false;
	    if (index == -1) {
	    	// is a null allowed?
		    StringTokenizer st = new StringTokenizer (domains);
		    while (st.hasMoreTokens ()) {
		    	String token = st.nextToken ();
		        if (token.equalsIgnoreCase ("null")) {
		        	noDomainRequired = true;
		        	break;
	        	}
		        token = null;
	        }
	        st = null;
	    } else {
	    	// check the domain list
		    String eDomain = email.substring (index + 1);
		    StringTokenizer st = new StringTokenizer (domains);
		    while (st.hasMoreTokens ()) {
		    	String token = st.nextToken ();
		        if (token.equals (eDomain)) {
		            valid = true;
		            break;
		        }
		        if (token.equalsIgnoreCase ("null")) noDomainRequired = true;
		        token = null;
	        }
	        st = null;
	    }
        return valid || noDomainRequired;
	}

	// DR 9/17/00: does the user ID end in a valid suffix for this installation?
	// If no suffixes are defined, then any are allowed
	public static boolean validateUserID (String userID, String suffixes)
	{
	    userID = userID.toUpperCase ();
		if (userID.equals ("ADMIN")) return true;
	    suffixes = suffixes.toUpperCase ();
	    StringTokenizer st = new StringTokenizer (suffixes);
	    if (st.countTokens () == 0) {
	        st = null;
	        suffixes = null;
	        return true;
	    }
	    //System.out.println ("st.countTokens () = " + st.countTokens ());
	    boolean valid = false;
	    while (st.hasMoreTokens ()) {
	        String s = st.nextToken ();
	        //System.out.println ("s = " + s);
	        if (userID.length () >= s.length ()) {
    	        //System.out.println ("userID.length () = " + userID.length ());
    	        //System.out.println ("s.length () = " + s.length ());
    	        String u = userID.substring (userID.length () - s.length ());
    	        //System.out.println ("u = " + u);
    	        if (u.equals (s)) {
    	            //System.out.println ("match");
    	            valid = true;
    	            u = null;
    	            s = null;
    	            break;
    	        }
    	        u = null;
	        }
	        s = null;
        }
        st = null;
        suffixes = null;
        return valid;
	}

    /**<pre>This method will validate the format of an email
     *address.  A valid email address will:
     *- only contain letters, numbers, "." ,"_",and "@" symbols("_" is added by deng)
     *- must start with a letter
     *- must have at least one character before the "@" symbol
     *- must have exactly one "@" symbol(added by deng)
     *- must have at least one "." after the "@" symbol
     *- must end with one of the following after the
     *last ".": com, edu, org, net,mil, tv, or one of the strings in domtype
     *</pre>
     *@param email the email address to be checked
     *@param domtype the Enumeration of additional allowed suffix(it can be null if
     *no additional suffix)
     *@return true if the email address is valid, false otherwise
     */
    public static boolean validateEMailFormat (String email, Enumeration domtype)
    {
        if(email==null){
            return false;
        }
       //convert email to lower case
        email=new String((email.trim()).toLowerCase());
        if(email.length()<5){//can not possibaly be an eamil address
            return false;
        }
       //set up allowed suffixes
        String knownSuffix[]={".com",".edu",".org",".net",".mil",".tv", ".gov", ".biz", ".info"};

        //check suffix
        boolean suffixIsOk=false;
        for(int i=0;i<knownSuffix.length;i++){
            if(email.endsWith(knownSuffix[i])){
                suffixIsOk=true;
                break;
            }
        }

        if (domtype != null) {
            while (domtype.hasMoreElements ()) {
                if(email.endsWith("." + ((String) domtype.nextElement ()).toLowerCase ())) {
                    suffixIsOk=true;
                    break;
                }
            }
        }

        //when reaches here, suffixIsOk should have the correct value
        if(suffixIsOk==false){
            return false;
        }

        //make sure only contain letters, numbers, ".","_","-","'", and "@" symbols
         int emailLength=email.length();
         for(int i=0;i<emailLength;i++){
             char tempchar=email.charAt(i);
             //email has already been converted into lower case at the
             //beginning of this method
             if(Character.isLetterOrDigit(tempchar) ||
                tempchar=='.'                       ||
                tempchar=='-'                       ||
                tempchar=='_'                       ||
                tempchar=='\''                      ||
                tempchar=='@'){
                 //the charaacter is ok,do nothing
             }
             else{//character is not ok
                 return false;
             }
         }

         //WLIU 8/17/04: we now allow leading numbers in email.
         /*
         //make sure email starts with a letter
         if(Character.isLetter(email.charAt(0))==false){
             return false;
         }
         */

         //make sure
         //1. have at least one character before the "@" symbol
         //2. have and only have one "@" symbol
         //3. make sure "." does not follow "@"
         int atSignIndex1=email.indexOf('@');
         int atSignIndex2=email.lastIndexOf('@');

         if( atSignIndex1==-1               ||//'@' dose not exist
             atSignIndex1 != atSignIndex2   ||//'@' is dupblicated
             atSignIndex1==0               ) {//'@' is at the beginning
             return false;
         }

         //MC 5/31/05: checking that there's no apostrophe after the @ sign.
         for(int i = atSignIndex1; i < emailLength; i++){
             char tempchar = email.charAt(i);
             if(tempchar == '\'')
                 return false;
         }
         
        //end MC
        
         //make sure have at least one "." after the "@" symbol
         int lastDotIndex=email.lastIndexOf('.');
         if(lastDotIndex==-1            ||//'.' dose not exist
            lastDotIndex<=atSignIndex1  ){//there's no '.' follows '@'
             return false;
         }

         if ((lastDotIndex - 1) == atSignIndex1) return false;

         //finally,if it passes all tests, it should be valid
         return true;

    }
    //*******************************************************************
    /**<pre>
     *This method will validate an password format.  A valid password will:
     *- start with a character(means letters?)
     *- only contain characters and numbers
     *- have at least as many characters as length
     *- have at least as many alpha characters as alpha
     *- have at least as many numeric characters as numeric
     *- must start with a letter if startLetter is true
     *</pre>*/
    public static boolean validatePassword (String password, int alpha,
                                            int numeric, int length, boolean startLetter){
        //password can not be null, or ""
        if(password==null || password.equals("")){
            return false;
        }

        //password must begin with an english letter
        if(startLetter && Character.isLetter(password.charAt(0))==false){
            return false;
        }

        //password must have at least as many characters as length
        int totalLength=password.length();
        if(totalLength<length){
            return false;
        }

        //count length
        int letterCount=0;
        int numberCount=0;
        for(int i=0;i<totalLength;i++){
            char tempChar=password.charAt(i);
            //is it a letter?
            if(Character.isLetter(tempChar)){
                letterCount++;
            }
            //is it a number?
            else if(Character.isDigit(tempChar)){
                numberCount++;
            }
            //if gets here, the character is invalid
            else{
                return false;
            }
        }
        //check if have at least as many letters as alpha
        //check if have at least as many numeric characters as numeric
        if(letterCount<alpha || numberCount<numeric){
            return false;
        }

        //after it passes all checks,return true
        return true;
    }

    //**********************************************************************
    /** Decodes a query string according to iSuite rules.  A query string for a specific GET or POST
     *  can be encoded so that all normal delimiting characters of a query string (?, &, and =) are
     *  changed to other acceptable characters.  In this way, a query string can be passed in a request
     *  object as a name/value pair.
     *
     */
    public static String decodeQueryString (String qs)
    {
        qs = TemplarUtil.strReplace (qs, "^", "?");
        qs = TemplarUtil.strReplace (qs, "|", "&");
        qs = TemplarUtil.strReplace (qs, "*", "=");
        return qs;
    }

    //**********************************************************************
    /** Encodes a query string according to iSuite rules.  A query string for a specific GET or POST
     *  can be encoded so that all normal delimiting characters of a query string (?, &, and =) are
     *  changed to other acceptable characters.  In this way, a query string can be passed in a request
     *  object as a name/value pair.
     *
     */
    public static String encodeQueryString (String qs)
    {
        qs = TemplarUtil.strReplace (qs, "?", "^");
        qs = TemplarUtil.strReplace (qs, "&", "|");
        qs = TemplarUtil.strReplace (qs, "=", "*");
        return qs;
    }

    //**********************************************************************
    /** Encodes a URL according to WWW rules.
     *
     */
    public static String urlEncode (String nonUrlStr)
    {
       //System.out.println ("befre %  nonUrlStr = " + nonUrlStr);
       nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "%", "%25");
       //System.out.println ("befre <space>  nonUrlStr = " + nonUrlStr);
       nonUrlStr = TemplarUtil.strReplace(nonUrlStr, " ", "%20");
       //System.out.println ("befre \"  nonUrlStr = " + nonUrlStr);
       nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "\"", "%22");
       //System.out.println ("befre <%  nonUrlStr = " + nonUrlStr);
       nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "<", "%3C");
       //System.out.println ("befre >  nonUrlStr = " + nonUrlStr);
       nonUrlStr = TemplarUtil.strReplace(nonUrlStr, ">", "%3E");
       //System.out.println ("befre #%  nonUrlStr = " + nonUrlStr);
       nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "#", "%23");
       //System.out.println ("befre {  nonUrlStr = " + nonUrlStr);
       nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "{", "%7B");
       //System.out.println ("befre }  nonUrlStr = " + nonUrlStr);
       nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "}", "%7D");
       //System.out.println ("befre |  nonUrlStr = " + nonUrlStr);
       nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "|", "%7C");
       //System.out.println ("befre \\  nonUrlStr = " + nonUrlStr);
       nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "\\", "%5C");
       //System.out.println ("befre ^  nonUrlStr = " + nonUrlStr);
       nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "^", "%5E");
       //System.out.println ("befre ~  nonUrlStr = " + nonUrlStr);
       nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "~", "%7E");
       //System.out.println ("befre [  nonUrlStr = " + nonUrlStr);
       nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "[", "%5B");
       //System.out.println ("befre ]  nonUrlStr = " + nonUrlStr);
       nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "]", "%5D");
       //System.out.println ("befre ;  nonUrlStr = " + nonUrlStr);
       nonUrlStr = TemplarUtil.strReplace(nonUrlStr, ";", "%3B");
       //System.out.println ("befre /  nonUrlStr = " + nonUrlStr);
       nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "/", "%2F");
       //System.out.println ("befre ?  nonUrlStr = " + nonUrlStr);
       nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "?", "%3F");
       //System.out.println ("befre :  nonUrlStr = " + nonUrlStr);
       nonUrlStr = TemplarUtil.strReplace(nonUrlStr, ":", "%3A");
       //System.out.println ("befre @  nonUrlStr = " + nonUrlStr);
       nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "@", "%40");
       //System.out.println ("befre =  nonUrlStr = " + nonUrlStr);
       nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "=", "%3D");
       //System.out.println ("befre &  nonUrlStr = " + nonUrlStr);
       nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "&", "%26");
       return nonUrlStr;
    }



    //**********************************************************************
    /** Decodes a URL according to WWW rules.
     *
     */
    public static String urlDecode (String urlStr)
    {

       //nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "%", "%25");
       urlStr = TemplarUtil.strReplace(urlStr, "%25", "%");
      // nonUrlStr = TemplarUtil.strReplace(nonUrlStr, " ", "%20");
       urlStr = TemplarUtil.strReplace(urlStr, "%20", " ");
       //nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "\"", "%22");
       urlStr = TemplarUtil.strReplace(urlStr, "%22", "\"");
       //nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "<", "%3C");
       urlStr = TemplarUtil.strReplace(urlStr, "%3C", "<");
       //nonUrlStr = TemplarUtil.strReplace(nonUrlStr, ">", "%3E");
       urlStr = TemplarUtil.strReplace(urlStr, "%3E", ">");
       //nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "#", "%23");
       urlStr = TemplarUtil.strReplace(urlStr, "%23", "#");
       //nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "{", "%7B");
       urlStr = TemplarUtil.strReplace(urlStr, "%7B", "{");
       //nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "}", "%7D");
       urlStr = TemplarUtil.strReplace(urlStr, "%7D", "}");
       //nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "|", "%7C");
       urlStr = TemplarUtil.strReplace(urlStr, "%7C", "|");
       //nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "\\", "%5C");
       urlStr = TemplarUtil.strReplace(urlStr, "%5C", "\\");
       //nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "^", "%5E");
       urlStr = TemplarUtil.strReplace(urlStr, "%5E", "^");
       //nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "~", "%7E");
       urlStr = TemplarUtil.strReplace(urlStr, "%7E", "~");
       //nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "[", "%5B");
       urlStr = TemplarUtil.strReplace(urlStr, "%5B", "[");
       //nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "]", "%5D");
       urlStr = TemplarUtil.strReplace(urlStr, "%5D", "]");
       //nonUrlStr = TemplarUtil.strReplace(nonUrlStr, ";", "%3B");
       urlStr = TemplarUtil.strReplace(urlStr, "%3B", ";");
       //nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "/", "%2F");
       urlStr = TemplarUtil.strReplace(urlStr, "%2F", "/");
       //nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "?", "%3F");
       urlStr = TemplarUtil.strReplace(urlStr, "%3F", "?");
       //nonUrlStr = TemplarUtil.strReplace(nonUrlStr, ":", "%3A");
       urlStr = TemplarUtil.strReplace(urlStr, "%3A", ":");
       //nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "@", "%40");
       urlStr = TemplarUtil.strReplace(urlStr, "%40", "@");
       //nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "=", "%3D");
       urlStr = TemplarUtil.strReplace(urlStr, "%3D", "=");
       //nonUrlStr = TemplarUtil.strReplace(nonUrlStr, "&", "%26");
       urlStr = TemplarUtil.strReplace(urlStr, "%26", "&");
       return urlStr;
    }


    public static void multiLinesToVector (Vector v, String execCmds)
    {
        if (v == null) v = new Vector();
        
        StringTokenizer st = new StringTokenizer (execCmds, "\n");
        String line = null;
        int t = st.countTokens ();
        //System.out.println ("total tokens = " + t);
        for (int i = 0; i < t; i++) {
            line = st.nextToken ();
            //System.out.println ("adding " + line);
            v.addElement(line);
        }
    }
    
    //**********************************************************************
    /** Clears an array of characters (sets all values to \0)
     *
     */
	public static void clearCharArray (char[] c)
	{
		for (int i = 0; i < c.length; i++) c[i] = '\0';
	}

    //**********************************************************************
    /** Clears an array of bytes (sets all values to \0)
     *
     */
	public static void clearByteArray (byte[] b)
	{
		for (int i = 0; i < b.length; i++) b[i] = (byte) '\0';
	}

    //**********************************************************************
    /** Returns true if the class passed in is a child of DODataRecord or DOList
     *  Will also return true if the class is one of those two
     *  Traverses the entire class hierarchy, from the class passed in and up
     *
     */
	public static boolean isISuiteDataObject (String className)
	throws ClassNotFoundException
	{
    	if (className.equals ("com.proximo.isuite.inter.data.DODataRecord") || 
    		className.equals ("com.proximo.isuite.inter.data.DOList"))
    		return true; 
    	else if (className.equals ("java.lang.Object")) return false; // no more classes left
    		
    	Class c = Class.forName (className);
    	String parentClassName = c.getSuperclass ().getName ();
    	return isISuiteDataObject (parentClassName);
	}
	
    //**********************************************************************
    /** Calculates a check sum value for any string.
     *
     */
    public static long calcCheckSum (String word)
    {
        if (word == null) return 0;
        int size = word.length ();
        long sum = 0;
        for (int i = 0; i < size; i++) sum += (long) word.charAt (i);
        return sum;
    }
    
    //**********************************************************************
    /** Calculates an approximately download time for a file based on the number of bytes and the bandwidth.
     *	size is in bytes and bandwidth is in bits/second.
     *  Returns the number of second.
     *  Example:
     *	2.5 MB and a 56 Kb modem
     *  2,500,000 bytes x 8 bits = 20,000,000 bits / 56,000 bits/second = 500 seconds
     *
     */
    public static long calcDownloadTime (long size, long bandwidth)
    {
    	if (bandwidth == 0 || size == 0) return 0;
    	return (long) roundFloat ((float) (size * 8 / bandwidth), 1);
    }
    
    //**********************************************************************
    /** Utility method for calculating the download time of a file using a 56 Kb modem.
     *  Note that 56 Kb modems are assumed to run at 40 Kb -- you never really get that much.
     *
     */
    public static long calcDownloadFor56KModem (long size)
    {
    	return calcDownloadTime (size, 40000);
    }
    
    //**********************************************************************
    /** Utility method for calculating the download time of a file using a 28.8 Kb modem.
     *
     */
    public static long calcDownloadFor28KModem (long size)
    {
    	return calcDownloadTime (size, 28800);
    }
    
    //**********************************************************************
    /** Utility method for calculating the download time of a file using a 640 Kb DSL line
     *
     */
    public static long calcDownloadFor640DSL (long size)
    {
    	return calcDownloadTime (size, 640000);
    }
    
    //**********************************************************************
    /** Utility method for calculating the download time of a file using a 1.5 Mb T1 line
     *
     */
    public static long calcDownloadForFullT1 (long size)
    {
    	return calcDownloadTime (size, 1500000);
    }
    
    //**********************************************************************
    /** Takes a number of seconds and returns a string in format "X hours Y minutes Z seconds"
     *
     */
    public static String getExtendedTimeString (long origTime)
    {
    	StringBuffer b = new StringBuffer ();
    	
    	long hours = (long) roundFloat ((float) (origTime / 3600), 1);
    	if (hours < 1) hours = 0;
    	long minutes = (long) roundFloat ((float) ((origTime - (hours * 3600)) / 60), 1);
    	if (minutes < 1) minutes = 0;
    	long seconds = origTime - (hours * 3600) - (minutes * 60);
    	
    	b.append (hours);
    	b.append (" hour");
   		if (hours > 1) b.append ("s");
   		b.append (" ");
    	
    	b.append (minutes);
    	b.append (" minute");
   		if (minutes > 1) b.append ("s");
   		b.append (" ");
    	
    	b.append (seconds);
    	b.append (" second");
   		if (seconds > 1) b.append ("s");
    	
    	return b.toString ();
    }
    
    //**********************************************************************
    /** Converts a character to upper case.
     */
    public static char getUpperCaseChar (char c)
    {
    	char u = c;
    	if (c >= 'a' && c <= 'z') u = (char) ((int) c - 32);
    	return u;
    }
    
    //**********************************************************************
    /** Converts a character to lower case.
     */
    public static char getLowerCaseChar (char c)
    {
    	char l = c;
    	if (c >= 'A' && c <= 'Z') l = (char) ((int) c + 32);
    	return l;
    }

	/** Replaces all commas that appear inside a set of double quotes with a space.
	 * Useful for taking a CSV file and removing commas that appear inside quotes,
	 * which can often break a processor.
	 */
	public static String removeCommansInQuotes (String data)
	{
		System.out.println ("data is [" + data + "]");
		boolean inQuote = false;
		StringBuffer replaced = new StringBuffer ();
		for (int i = 0; i < data.length (); i++) {
			char c = data.charAt (i);
			if (c == ',' && inQuote) {
				replaced.append (" ");
			} else {
				if (c == '"') inQuote = !inQuote;
				replaced.append (c);
			}
		}
		return replaced.toString ();
	}
	
    //**********************************************************************
    /** Returns true if the specified text appears in the specified file.
     *  If ignoreCase is false, the text must match exactly.
     *
     */
	public static boolean isTextInFile (String file, String text, boolean ignoreCase)
	throws IOException
	{
		boolean found = false;
		FileReader fr = new FileReader (file);
		BufferedReader br = new BufferedReader (fr);
		char[] c = new char[1];
		char one = '\0';
		StringBuffer sb = new StringBuffer ();
		if (ignoreCase) text = text.toUpperCase ();
		
		while (!found && (br.read (c, 0, 1)) != -1) {
		
			//System.out.println ("upper case = " + getUpperCaseChar (c[0]));
		
			if (ignoreCase) one = getUpperCaseChar (c[0]);
			else one = c[0];
			sb.append (one);
			
			//System.out.println ("sb = " + sb.toString ());
			if (text.indexOf (sb.toString ()) != 0) {
				sb.setLength (0); // start over
				// is the last character the first of what I am looking for?  If so, keep it
				if (one == text.charAt (0)) sb.append (one);
			} else if (sb.toString ().equals (text)) found = true;
			
		}
		
		br.close ();
		br = null;
		fr = null;
		return found;
	}

	/** counts the number of upper-case characters in a string */
	public static int countUpperCaseChars (String s)
	{
        int count = 0;
        int i;
        for (i = 0; i < s.length (); i++) {
        	if (Character.isUpperCase (s.charAt (i))) count++;
        }
        return count;
	}

	/** private method for use by parseTextToLines */
	private static double _calcWordLength (String word)
	{
		int upper = countUpperCaseChars (word);
		//System.out.println ("word = " + word + ", upper = " + upper + ", word.length = " + word.length ());
		return (word.length () - upper) + upper * 1.75;
	}
		
    //**********************************************************************
    /** Returns an array of strings.  The text is parsed so that no more than the max characters
     *  per line are in each string.  Lines only break on space and "-".
     */
	public static String[] parseTextToLines (String text, int max)
	{
		// DR 6/4/03: All upper-case characters count as 1.5 characters due to the width
		//System.out.println ("max = " + max);
		if (text == null) return new String[0];
		if (text.equals ("")) return new String[0];
		
		Vector lines = new Vector ();
		int count = 0;
		double currentLength = 0; // length of the current StringBuffer, accounting for upper-case letters
		double wordLength = 0; // length of the word StringBuffer, accounting for upper-case letters
		StringBuffer current = new StringBuffer ("");
		String lastWord = new String ("");
		StringTokenizer st = new StringTokenizer (text, " -\n,;:", true);
		while (st.hasMoreTokens ()) {
			String word = st.nextToken ();
			//System.out.println ("length = " + currentLength + ", word = " + word + ", lastWord = " + lastWord);
			
			if (word.equals ("\n")) {
				// since this is a hard-return, automatically break here and continue onto the next token
				//System.out.println ("hard return found");
				lines.addElement (current.toString ());
				current.setLength (0);
				currentLength = 0;
				//lastWord = null;
				//lastWord = new String ("");
				//continue;
			}
			
			//if ((word.equals ("-") || word.equals (";") || word.equals (",")  || word.equals (":") || word.equals ("\n")) && currentLength == 0 && lines.size () > 0) {
			if ((word.equals (" ") || word.equals ("-") || word.equals (";") || word.equals (",")  || word.equals (":"))) {
				// since we don't want to start with a hyphen, comma, colon, return, or semi-colon, 
				// we must take the last word of the last line and
				// put it on this line
				//System.out.println ("length = " + currentLength + ", word = " + word + ", lastWord = " + lastWord);
				wordLength = _calcWordLength (word);
				//System.out.println ("wordLength = " + wordLength);
				if (currentLength == 0 || ((wordLength + currentLength) > max)) {
				
					String lastLine = current.toString ();
					//System.out.println ("lastLine = [" + lastLine + "]");
					//word = lastWord + word;
					int xs = lastLine.lastIndexOf (" ");
					int xh = lastLine.lastIndexOf ("-");
					int xcm = lastLine.lastIndexOf (",");
					int xcl = lastLine.lastIndexOf (":");
					int xsc = lastLine.lastIndexOf (";");
					//int xcr = lastLine.lastIndexOf ("\n");

					int x = -1;
					if (xs > x) x = xs;
					if (xh > x) x = xh;
					if (xcm > x) x = xcm;
					if (xcl > x) x = xcl;
					if (xsc > x) x = xsc;
					//if (xcr > x) x = xcr;
					//System.out.println ("x = " + x);
					if (x != -1) {
						word = lastLine.substring (x + 1) + word;
						lastLine = lastLine.substring (0, x);
					}
					
					// do not copy line if it is empty and this is the first one
					if ((lines.size () > 0 || current.length () > 0) && (lastLine.length () > 0)) {
						//System.out.println ("outputting line");
						lines.addElement (lastLine);
					}
					
					current.setLength (0);
					currentLength = 0;
					lastLine = null;
					
				}
			}

			wordLength = _calcWordLength (word);
			if (word.equals (" ") && currentLength == 0) {
				// ignore it
			} else if (word.endsWith ("\n") && !word.equals ("\n")) {
				//System.out.println ("processing carriage return");
				//current.append (word.substring (0, word.length () - 1));
				lines.addElement (current.toString ());
				current.setLength (0);
				currentLength = 0;
				word = null;
				word = new String ("");
			} else if ((wordLength + currentLength) < max) {	
				// we're still within the limit
				current.append (word);
				currentLength += _calcWordLength (word);
			} else if ((wordLength + currentLength) == max) {	
				// after this we will be at the limit, so add and create a new string
				current.append (word);
				lines.addElement (current.toString ());
				current.setLength (0);
				currentLength = 0;
			} else if (wordLength <= max) {
				// we're over the limit and the new word is less than the max
				lines.addElement (current.toString ());
				current.setLength (0);
				current.append (word);
				currentLength = _calcWordLength (word);
			} else {
				// we're over the limit and the new word is longer than the max.  
				// so we have to break it into smaller broken words under the limit
				int i = 0;
				while (i < wordLength) {
					//System.out.println ("i = " + i + ", wordLength = " + wordLength);
					if ((i + max) > wordLength) lines.addElement (word.substring (i));
					else if ((i + max) > word.length ()) {
						lines.addElement (word);
						break;
					} else lines.addElement (word.substring (i, i + max));
					i += max;
				}
			}
			lastWord = null;
			lastWord = word;
		}
		
		// if anything left over, append it
		if (current.length () > 0) lines.addElement (current.toString ());
		current.setLength (0);
		current = null;
		
		// convert to String[]
		String s[] = new String[lines.size ()];
		for (int i = 0; i < lines.size (); i++) {
			s[i] = stripLeftChar ((String) lines.elementAt (i), ' ');
			s[i] = stripLeftChar (s[i], '\n');
		}
		lines.removeAllElements ();
		lines = null;
		return s;
	}
	
    /** Sets the last modified date of the specified file to the specified TDate. */
    public static void setFileLastModified (File f, TDateInterface d)
    throws IOException
    {
    	if (!f.exists ()) throw new IOException ("File does not exist!");
    	f.setLastModified (d.getTimeInMillis ());
    }
    
    /** Sets the last modified date of the specified file to the specified TDate. */
    public static void setFileLastModified (String f, TDateInterface d)
    throws IOException
    {
    	File file = new File (f);
    	setFileLastModified (file, d);
    	file = null;
    }
    
	/** A utility to fix file names produced by the Report Manager.
		Sometimes the fileName comes with too many digits in it.  All of our report names
		have 10 digits after "rpt" and before the extention, but sometimes I see 11, 
		which gives an error.  The extra always appears to be an extra "1" at the start.
		So I'm just going to check for 11 digits and if I find it, parse out the first one.
	 */
	public static String fixReportName (String s)
	{
		String n = s;
		int si = s.indexOf ("rpt") + 3;
		int ei = s.indexOf (".rpt");
		if (ei == -1) ei = s.indexOf (".prp");
		//System.out.println ("s = " + s);
		//System.out.println ("si = " + si);
		//System.out.println ("ei = " + ei);
		if ((si - 3) != -1 && ei != -1 && (si - 3) < ei && (ei - si) == 11) {
			n = null;
			n = s.substring (0, si) + 
						s.substring (si + 1, ei) +
						s.substring (ei);
		}
		//System.out.println ("n = " + n);
		return n;
	}
    
    public static String fixMSWordSpecialChars(String inStr) {
        if (inStr != null) {
            try {
                byte[] ba = inStr.getBytes("UTF-16BE");
                for (int i = 0; i < ba.length; i++) {
                    //Debug.write("TemplarUtil.fixMSWordSpecialChars(): ba[" + i + "] = " + ba[i]);
                    if (i % 2 != 0 && ba[i - 1] == 0) {
                        if (ba[i] == -105) ba[i] = 45; // long dash "---"
                        else if (ba[i] == -106) ba[i] = 45; // long dash "--"
                        else if (ba[i] == -109) ba[i] = 34; // left double quote
                        else if (ba[i] == -108) ba[i] = 34; // right double quote
                        else if (ba[i] == -111) ba[i] = 39; // left single quote
                        else if (ba[i] == -110) ba[i] = 39; // apostrophe (right single quote)
						else if (ba[i] == -128) ba[i] = 101; // Euro Sign - replaced with e
						else if (ba[i] == -93) ba[i] = 80; // British Pound Sign - replaced with P
						else if (ba[i] == -94) ba[i] = 45; // Bullet point "--"
                    }
                    
                    if (i % 2 != 0 && ba[i - 1] == 32) {
                        if (ba[i] == 28 || // left double quote
                            ba[i] == 29)  // right double quote
                        {
                            ba[i - 1] = 0;
                            ba[i] = 34; 
                        }
                        else if (ba[i] == 25) {
                            ba[i - 1] = 0;
                            ba[i] = 39; // apostrophe (right single quote)
                        }
                    }
					/* SJ 4/09/2009
					 * combination of -30, -128 and -103 is a single quote when data is copied from web
					 * combination of -30, -128 and -109 is a dash when data is copied from web
					 * combination of -30, -128 and -108 is a dash when data is copied from web
					 * combination of -30, -128 and -94 is a bullet point when data is copied from web.  So replacing it with dash
					 */

					if (ba[i] == -30 && (i + 4 <= ba.length - 1)) {
						if (ba[i + 2] == -128 && ba[i + 4] == -103) {
							ba[i] = 39; // replace with single quote
							ba[i + 2] = 0;
							ba[i + 4] = 0;
						}
						if (ba[i + 2] == -128 && (ba[i + 4] == -109 || ba[i + 4] == -108 || ba[i + 4] == -94))
						{
							ba[i] = 45; // replace with a dash
							ba[i + 2] = 0;
							ba[i + 4] = 0;
						}
					}

                }
                inStr = new String(ba, "UTF-16BE");
            }
            catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        
        return inStr;
    }


        /**
	     *  A function looking for no English Chars in a String, if found, replace 
	     *	them with English chars
	     *
	     *	input, the string to convert.
	     */       
        public static String convertNonEnglishCharsToEnglish_old(String str){
        	if (str == null) return str;
        	StringBuffer buf = new StringBuffer();
        	int len = str.length();
        	char ch;
        	
        	for (int i = 0; i < len; i++){
        		ch = str.charAt(i);
				switch (ch) {
    			case 'á': buf.append("a"); break;
    			case 'â': buf.append("a"); break;
    			case 'à': buf.append("a"); break;
    			case 'ã': buf.append("a"); break;
    			case 'ä': buf.append("a"); break;
    			case 'å': buf.append("a"); break;
    			    			
    			case 'Æ': buf.append("AE"); break;
    			case 'Å': buf.append("A"); break;
    			case 'Ã': buf.append("A"); break;
    			case 'Ä': buf.append("A"); break;
    			case 'Â': buf.append("A"); break;
    			case 'À': buf.append("A"); break;
    			case 'Á': buf.append("A"); break;
    			
    			case 'æ': buf.append("ae"); break;
    			
    			case 'Ç': buf.append("C"); break;
    			case 'ç': buf.append("c"); break;

    			case 'é': buf.append("e"); break;
    			case 'ê': buf.append("e"); break;
    			case 'è': buf.append("e"); break;
    			case 'ë': buf.append("e"); break;
    			
    			case 'È': buf.append("E"); break;
    			case 'É': buf.append("E"); break;
    			case 'Ê': buf.append("E"); break;
    			case 'Ë': buf.append("E"); break;
    			
    			case 'í': buf.append("i"); break;
    			case 'î': buf.append("i"); break;
    			case 'ì': buf.append("i"); break;
    			case 'ï': buf.append("i"); break;
    			case 'Ì': buf.append("I"); break;
    			case 'Í': buf.append("I"); break;
    			case 'Î': buf.append("I"); break;
    			case 'Ï': buf.append("I"); break;
    			case 'Ð': buf.append("D"); break;
    			
    			case 'Ñ': buf.append("N"); break;
    			case 'ñ': buf.append("n"); break;
    			
    			case 'Ò': buf.append("O"); break;
    			case 'Ó': buf.append("O"); break;
    			case 'Ô': buf.append("O"); break;
    			case 'Õ': buf.append("O"); break;
    			case 'Ö': buf.append("O"); break;
    			case 'Ø': buf.append("O"); break;

    			case 'Ü': buf.append("U"); break;    			
    			case 'Ù': buf.append("U"); break;    			
    			case 'Ú': buf.append("U"); break;    			
    			case 'Û': buf.append("U"); break;    			
    			
    			case 'ó': buf.append("o"); break;
    			case 'ô': buf.append("o"); break;
    			case 'ò': buf.append("o"); break;
    			case 'õ': buf.append("o"); break;
    			case 'ö': buf.append("o"); break;

    			case 'ß': buf.append("B"); break;
    			case 'ú': buf.append("u"); break;
    			case 'û': buf.append("u"); break;
    			case 'ù': buf.append("u"); break;
    			case 'ü': buf.append("u"); break;
    			case 'ÿ': buf.append("y"); break;
    			case 'ý': buf.append("y"); break;
    			
		        default:
		          if (ch >= ' ' && ch <= 127) {
		            buf.append(ch);
		          }
		      	}
        	}// end for
        	return buf.toString();
        } 
        
        
        public static String convertNonEnglishCharsToEnglish(String str){
        	return str;
        } 
        
        
        /**
	     * 	Function looking for complete instances of company keywords within the string,
	     * 	words like "INC", "LLC", and etc.
	     *	If found match, replace those words with empty string.
	     */
		public static String stripCompanyKeywords(String str){
			if (str == null)		
				return str;
		
			// company suffixes
			str = strReplaceCompWordsExceptStart(str, "INC", "");
			str = strReplaceCompWordsExceptStart(str, "LLC", "");
			str = strReplaceCompWordsExceptStart(str, "LLP", "");
			str = strReplaceCompWordsExceptStart(str, "CO", "");
			str = strReplaceCompWordsExceptStart(str, "LTD", "");
			str = strReplaceCompWordsExceptStart(str, "LIMITED", "");
			str = strReplaceCompWordsExceptStart(str, "PLC", "");
			str = strReplaceCompWordsExceptStart(str, "AG", ""); // German
			str = strReplaceCompWordsExceptStart(str, "AB", ""); // Swedish/Norge
			str = strReplaceCompWordsExceptStart(str, "GMBH", ""); // German LLC
			str = strReplaceCompWordsExceptStart(str, "CORP", "");
			str = strReplaceCompWordsExceptStart(str, "CORPORATION", "");
			str = strReplaceCompWordsExceptStart(str, "SA", ""); // Spanish
			str = strReplaceCompWordsExceptStart(str, "LTDA", "");
			str = strReplaceCompWordsExceptStart(str, "SL", "");
			str = strReplaceCompWordsExceptStart(str, "LP", "");
			str = strReplaceCompWordsExceptStart(str, "CV", ""); // French
			str = strReplaceCompWordsExceptStart(str, "SDN", "");
			str = strReplaceCompWordsExceptStart(str, "BHD", "");
			str = strReplaceCompWordsExceptStart(str, "BV", ""); //Dutch
			
			// non-helpful words
			str = strReplaceCompWords(str, "OF", "");
			str = strReplaceCompWords(str, "DI", ""); // of in Italian
			str = strReplaceCompWords(str, "DE", ""); // of in French/Spanish
			str = strReplaceCompWords(str, "DO", ""); // of in Portugese
			str = strReplaceCompWords(str, "AND", "");
			str = strReplaceCompWords(str, "ET", ""); // and in French
			str = strReplaceCompWords(str, "E", ""); // and in Italian/Spanish
			str = strReplaceCompWords(str, "Y", ""); // and in Spanish
			str = strReplaceCompWords(str, "THE", "");
			str = strReplaceCompWords(str, "EL", ""); // the in Spanish
			str = strReplaceCompWords(str, "LA", ""); // the in Spanish/French/Italian
			str = strReplaceCompWords(str, "IL", ""); // the in Italian
			str = strReplaceCompWords(str, "LE", ""); // the in French
			
			// others
			str = strReplaceCompWordsExceptStart(str, "INTL", "");
			
			return str;
		}        

		/** Returns true if any number of identifying company keywords is found in a given string.
		 */
		public static boolean isNameACompany (String str)
		{
			str = convertNonEnglishCharsToEnglish(str);
			str = str.toUpperCase();
			String converted = stripCompanyKeywords (str);
			if (converted.length () != str.length ()) return true; // some keyword found so must be a company
			converted = strReplaceCompWordsExceptStart(converted, "INCORPORATED", "z");
			if (converted.indexOf ("z") != -1) return true;
			converted = strReplaceCompWordsExceptStart(converted, "MANAGEMENT", "z");
			if (converted.indexOf ("z") != -1) return true;
			converted = strReplaceCompWordsExceptStart(converted, "SYSTEMS", "z");
			if (converted.indexOf ("z") != -1) return true;
			converted = strReplaceCompWordsExceptStart(converted, "CONSULTING", "z");
			if (converted.indexOf ("z") != -1) return true;
			converted = strReplaceCompWordsExceptStart(converted, "EXTENDED", "z");
			if (converted.indexOf ("z") != -1) return true;
			converted = strReplaceCompWordsExceptStart(converted, "COMMERCIAL", "z");
			if (converted.indexOf ("z") != -1) return true;
			converted = strReplaceCompWordsExceptStart(converted, "EQUIPMENT", "z");
			if (converted.indexOf ("z") != -1) return true;
			converted = strReplaceCompWordsExceptStart(converted, "THE", "z");
			if (converted.indexOf ("z") != -1) return true;
			converted = strReplaceCompWordsExceptStart(converted, "INTERNATIONAL", "z");
			if (converted.indexOf ("z") != -1) return true;
			converted = strReplaceCompWordsExceptStart(converted, "NATIONAL", "z");
			if (converted.indexOf ("z") != -1) return true;
			converted = strReplaceCompWordsExceptStart(converted, "BUSINESS", "z");
			if (converted.indexOf ("z") != -1) return true;
			converted = strReplaceCompWordsExceptStart(converted, "SERVICES", "z");
			if (converted.indexOf ("z") != -1) return true;
			converted = strReplaceCompWordsExceptStart(converted, "IMPORTS", "z");
			if (converted.indexOf ("z") != -1) return true;
			converted = strReplaceCompWordsExceptStart(converted, "EXPORTS", "z");
			if (converted.indexOf ("z") != -1) return true;
			converted = strReplaceCompWordsExceptStart(converted, "IMPORT", "z");
			if (converted.indexOf ("z") != -1) return true;
			converted = strReplaceCompWordsExceptStart(converted, "EXPORT", "z");
			if (converted.indexOf ("z") != -1) return true;
			converted = strReplaceCompWordsExceptStart(converted, "CORPORATE", "z");
			if (converted.indexOf ("z") != -1) return true;
			converted = strReplaceCompWordsExceptStart(converted, "FINANCIAL", "z");
			if (converted.indexOf ("z") != -1) return true;
			converted = strReplaceCompWordsExceptStart(converted, "LIMITED", "z");
			if (converted.indexOf ("z") != -1) return true;
			return false; // no company keyword identifiers found
		}
		
		/** Updates a matchkey column in one table based on a defined company name field
		 * and its PK.  Assumes the PK column is alpha.
		 */
		public static void updateCompanyMatchkey (Connection c, String table, String pkCol, 
												  String nameCol, String mkeyCol)
		throws SQLException
		{
			Statement s = c.createStatement ();
			Statement u = c.createStatement ();
			ResultSet rs = null;

			/*
			rs = s.executeQuery ("select table_name from user_tables");
			while (rs.next ()) { System.out.println (rs.getString (1)); }
			rs.close ();
			rs = null;
			*/
								
			String sql = "select " + pkCol + ", " + nameCol + " from " + table;
			//System.out.println (sql);
			rs = s.executeQuery (sql);
			int record = 1;
			while (rs.next ()) {
				//System.out.println ("Processing record #" + record);
				String mkey = convertCompanyName (rs.getString (2));
				u.executeUpdate ("update " + table + " set " + mkeyCol + " = '" + mkey + "' " + 
								 "where " + pkCol + " = '" + rs.getString (1) + "'");
				record++;
			}
			rs.close ();
			s.close ();
			u.close ();
		}
		
		/**
	     *  convert all company name to english, alphanumeric string.
	     *	The function will convert nonEnglish chars to english first, 
	     *	then turn it to uppercase, strip company keywords like "LTD",etc.
	     *	Finally strip all non-alphanumeric chars
	     *
	     *	The output will be a string in Uppercase.
	     */
		public static String convertCompanyName(String str){
			if (str == null)		
				return str;
			
			str = convertNonEnglishCharsToEnglish(str);
			// System.out.println ("After convert Non English == " + str);

			str = str.toUpperCase();
			// System.out.println ("After Upper Case == " + str);

			str = stripCompanyKeywords(str);
			// System.out.println ("After replace Corp Keywork == " + str);
			
			str = stripNonAlphaNumeric(str);
			// System.out.println ("Strip NonAlphaNumericChars == " + str);
			
			return str;
		}        
		
		/**
	     * 	Returns a new string resulting from replacing all occurrences of 
	     *  'text' in this string with 'by'.
	     *	text must be complete words only, meaning the text is preceded by 
	     *	non-alphanumeric and followed by non-alphanumeric OR end the string
	     */
		public static String strReplaceCompWords(String str, String text, String by){
			int strLength = str.length();
			int txtLength = text.length();
    		if ((strLength == 0) || (txtLength == 0)) return str;

    		int i = str.indexOf(text);
    		if (i == -1) return str;
			
			//System.out.println ("Found text at == " + i);
			//System.out.println ("Source String length == " + strLength);
			//System.out.println ("txt length ==" + txtLength);
    		String newstr = null;
    		if ((i == 0 || isNonAlphaNumericChars(str.charAt(i-1))) &&	// if the keywords is in the beginning of the string or previous char is non-aphlanumeric
    			((i + txtLength) == strLength ||  isNonAlphaNumericChars(str.charAt(i+txtLength)))) // if the keywords is end or next char is non-aphlanumeric
    			newstr = str.substring(0,i) + by;	// replace 
    		else
    			newstr = str.substring(0, i + txtLength);	//otherwise ignore

    		if (i+txtLength < strLength)
        		newstr += strReplaceCompWords(str.substring(i+txtLength,strLength),text,by);

    		return newstr;
		}

		/**
	     * 	Returns a new string resulting from replacing all occurrences of 
	     *  'text' in this string with 'by'.(Except the keywords is at the beginning of the string)
	     *	text must be complete words only, meaning the text is preceded by 
	     *	non-alphanumeric and followed by non-alphanumeric OR end the string
	     */
		public static String strReplaceCompWordsExceptStart(String str, String text, String by){
			int strLength = str.length();
			int txtLength = text.length();
    		if ((strLength == 0) || (txtLength == 0)) return str;

    		int i = str.indexOf(text);
    		if (i == -1) return str;
			
			//System.out.println ("Found text at == " + i);
			//System.out.println ("Source String length == " + strLength);
			//System.out.println ("txt length ==" + txtLength);
    		String newstr = null;
    		if ((i != 0 && isNonAlphaNumericChars(str.charAt(i-1))) &&	// if the keywords previous char is non-aphlanumeric and isnot in the beginning of the string
    			((i + txtLength) == strLength ||  isNonAlphaNumericChars(str.charAt(i+txtLength)))) // if the keywords is end or next char is non-aphlanumeric
    			newstr = str.substring(0,i) + by;	// replace 
    		else
    			newstr = str.substring(0, i + txtLength);	//otherwise ignore

    		if (i+txtLength < strLength)
        		newstr += strReplaceCompWords(str.substring(i+txtLength,strLength),text,by);

    		return newstr;
		}
		
		private static boolean isNonAlphaNumericChars(char c){
		
			if ((c >= 'a' && c <='z') || 
				(c >= 'A' && c <='Z') ||
				(c >= '0' && c <='9'))	
				return false;
			
			return true;		
		}

		public static String stripNonAlphaNumeric (String s)
	    {
	        if(s==null){ return s;}
	
	        String newString = new String ("");
	        int i;
	
	        for (i = 0; i < s.length (); i++)
	           if ((s.charAt (i) >= 'A' && s.charAt (i) <= 'Z') ||
	               (s.charAt (i) >= 'a' && s.charAt (i) <= 'z') ||
	               (s.charAt (i) >= '0' && s.charAt (i) <= '9'))
	               newString = newString + s.charAt (i);
	        return newString;
	    }
        
        public static boolean isFloatInScientificFormat(float f){
            //SJ 01/04/2005
            boolean scientificFormat = false;
            String f_str = Float.toString(f);
            //if f_str contains any character besides a number or decimal then it is in scientific format                       
            for (int i = 0; i < f_str.length(); i++){
                char c = f_str.charAt(i);
                if ((c >= '0' && c <='9') || c == '.')
                    continue;
                else {
                    scientificFormat = true;
                    break;
                }
            }
            return scientificFormat;
        }
        
        public static boolean isStringNullOrEmpty(String s) {        	
        	if (s == null)
        		return true;
        	else if (s.equals(""))
        		return true;
        	else if (s.isEmpty())
        		return true;
        	else
        		return false;
        }
        
        public static boolean isObjNullOrEmptyOld(Object s) {        	
        	if (s == null)
        		return true;
        	else if (s.toString().equals(""))
        		return true;
        	else if (s.toString().isEmpty())
        		return true;
        	else
        		return false;
        }
        
        public static boolean isObjNullOrEmpty(Object s) {        	
        	if (s == null)
        		return true;
        	else
        		return isStringNullOrEmpty(s.toString());

        }
        
        
}
